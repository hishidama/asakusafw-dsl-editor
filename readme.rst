Asakusa Framework Xtext DSL
===========================
Xtextがなかなか面白いので、Asakusa FrameworkのBatch DSL・Flow DSLを記述する言語（外部DSL）を作ってみました。

Batch DSLの例
-------------

::

  package com.example.batch
  
  import com.example.jobflow.CategorySummaryJob
  
  "売上の集計を計算する"
  @param("業務日付" date pattern = "\\d{4}-\\d{2}-\\d{2}")
  batch SummarizeBatch {
  	run CategorySummaryJob soon
  }

Flow DSLの例
------------

::

  package com.example.jobflow
  
  import com.example.operator.CategorySummaryOperator
  
  operator CategorySummaryOperator as operators
  operator CoreOperator as core

  "カテゴリ別に売上の集計を計算する"
  jobflow CategorySummaryJob (
  	in sales_detail as salesDetail importer SalesDetailFromCsv
  	in store_info as storeInfo importer StoreInfoFromCsv
  	in item_info as itemInfo importer ItemInfoFromCsv
  	out category_summary as categorySummary exporter CategorySummaryToCsv
  	out error_record as errorRecord exporter ErrorRecordToCsv
  ) {
  	checkStore = operators.checkStore(storeInfo, salesDetail)
  	joinItemInfo = operators.joinItemInfo(itemInfo, checkStore.found)
  	summarize = operators.summarizeByCategory(joinItemInfo.joined)
  	categorySummary +=(summarize.out)
  	// r1 = core.restructure(checkStore.missed, ErrorRecord.class)
  	// unknownStore = operators.setErrorMessage(r1, "店舗不明")
  	// r2 = core.restructure(joinItemInfo.missed, ErrorRecord.class)
  	// unknownItem = operators.setErrorMessage(r2, "商品不明")
  	// errorRecord +=(unknownStore, unknownItem)
  }

自由な引数を与えるところはちょっと面倒そうなので作っていません。

所感
----
Xtextが優秀なのでDSLを定義するのは簡単ですが、補完が使えないとエディターとしては全く便利ではないです。
が、クラスまで含めて補完する機能を作るのは骨が折れそうです…。

