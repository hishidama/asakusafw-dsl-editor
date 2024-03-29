/*
* generated by Xtext
*/
package jp.hishidama.xtext.afw.batch_dsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class BatchDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ScriptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Script");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPackageAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPackagePackageDeclareParserRuleCall_0_0 = (RuleCall)cPackageAssignment_0.eContents().get(0);
		private final Assignment cImportsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportsImportDeclareParserRuleCall_1_0 = (RuleCall)cImportsAssignment_1.eContents().get(0);
		private final Assignment cListAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cListBatchDslParserRuleCall_2_0 = (RuleCall)cListAssignment_2.eContents().get(0);
		
		//Script:
		//
		//	package=PackageDeclare imports+=ImportDeclare* list+=BatchDsl*;
		public ParserRule getRule() { return rule; }

		//package=PackageDeclare imports+=ImportDeclare* list+=BatchDsl*
		public Group getGroup() { return cGroup; }

		//package=PackageDeclare
		public Assignment getPackageAssignment_0() { return cPackageAssignment_0; }

		//PackageDeclare
		public RuleCall getPackagePackageDeclareParserRuleCall_0_0() { return cPackagePackageDeclareParserRuleCall_0_0; }

		//imports+=ImportDeclare*
		public Assignment getImportsAssignment_1() { return cImportsAssignment_1; }

		//ImportDeclare
		public RuleCall getImportsImportDeclareParserRuleCall_1_0() { return cImportsImportDeclareParserRuleCall_1_0; }

		//list+=BatchDsl*
		public Assignment getListAssignment_2() { return cListAssignment_2; }

		//BatchDsl
		public RuleCall getListBatchDslParserRuleCall_2_0() { return cListBatchDslParserRuleCall_2_0; }
	}

	public class PackageDeclareElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackageDeclare");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//PackageDeclare:
		//
		//	"package" name=FQN ";"?;
		public ParserRule getRule() { return rule; }

		//"package" name=FQN ";"?
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=FQN
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_1_0() { return cNameFQNParserRuleCall_1_0; }

		//";"?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class ImportDeclareElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ImportDeclare");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cWildcardAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Keyword cWildcardAsteriskKeyword_2_1_0 = (Keyword)cWildcardAssignment_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ImportDeclare:
		//
		//	"import" name=FQN ("." wildcard?="*")? ";"?;
		public ParserRule getRule() { return rule; }

		//"import" name=FQN ("." wildcard?="*")? ";"?
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//name=FQN
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_1_0() { return cNameFQNParserRuleCall_1_0; }

		//("." wildcard?="*")?
		public Group getGroup_2() { return cGroup_2; }

		//"."
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }

		//wildcard?="*"
		public Assignment getWildcardAssignment_2_1() { return cWildcardAssignment_2_1; }

		//"*"
		public Keyword getWildcardAsteriskKeyword_2_1_0() { return cWildcardAsteriskKeyword_2_1_0; }

		//";"?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class BatchDslElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BatchDsl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommentAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommentSTRINGTerminalRuleCall_0_0 = (RuleCall)cCommentAssignment_0.eContents().get(0);
		private final Assignment cParamsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParamsBatchParameterParserRuleCall_1_0 = (RuleCall)cParamsAssignment_1.eContents().get(0);
		private final Keyword cBatchKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameNameParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cStatementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cStatementsBatchStatementParserRuleCall_5_0 = (RuleCall)cStatementsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//BatchDsl:
		//
		//	comment=STRING? params+=BatchParameter* "batch" name=Name "{" statements+=BatchStatement* "}" ";"?;
		public ParserRule getRule() { return rule; }

		//comment=STRING? params+=BatchParameter* "batch" name=Name "{" statements+=BatchStatement* "}" ";"?
		public Group getGroup() { return cGroup; }

		//comment=STRING?
		public Assignment getCommentAssignment_0() { return cCommentAssignment_0; }

		//STRING
		public RuleCall getCommentSTRINGTerminalRuleCall_0_0() { return cCommentSTRINGTerminalRuleCall_0_0; }

		//params+=BatchParameter*
		public Assignment getParamsAssignment_1() { return cParamsAssignment_1; }

		//BatchParameter
		public RuleCall getParamsBatchParameterParserRuleCall_1_0() { return cParamsBatchParameterParserRuleCall_1_0; }

		//"batch"
		public Keyword getBatchKeyword_2() { return cBatchKeyword_2; }

		//name=Name
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//Name
		public RuleCall getNameNameParserRuleCall_3_0() { return cNameNameParserRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//statements+=BatchStatement*
		public Assignment getStatementsAssignment_5() { return cStatementsAssignment_5; }

		//BatchStatement
		public RuleCall getStatementsBatchStatementParserRuleCall_5_0() { return cStatementsBatchStatementParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }

		//";"?
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class BatchParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BatchParameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParamKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCommentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCommentSTRINGTerminalRuleCall_2_0 = (RuleCall)cCommentAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cKeyKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cEqualsSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameNameParserRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cCommaKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cPatternKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Keyword cEqualsSignKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		private final Assignment cPatternAssignment_5_3 = (Assignment)cGroup_5.eContents().get(3);
		private final RuleCall cPatternSTRINGTerminalRuleCall_5_3_0 = (RuleCall)cPatternAssignment_5_3.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cRequiredAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final Keyword cRequiredRequiredKeyword_6_1_0 = (Keyword)cRequiredAssignment_6_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//BatchParameter:
		//
		//	"@param" "(" comment=STRING? ("key" "=")? name=Name (","? "pattern" "=" pattern=STRING)? (","? required?="required")?
		//
		//	")";
		public ParserRule getRule() { return rule; }

		//"@param" "(" comment=STRING? ("key" "=")? name=Name (","? "pattern" "=" pattern=STRING)? (","? required?="required")?
		//
		//")"
		public Group getGroup() { return cGroup; }

		//"@param"
		public Keyword getParamKeyword_0() { return cParamKeyword_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//comment=STRING?
		public Assignment getCommentAssignment_2() { return cCommentAssignment_2; }

		//STRING
		public RuleCall getCommentSTRINGTerminalRuleCall_2_0() { return cCommentSTRINGTerminalRuleCall_2_0; }

		//("key" "=")?
		public Group getGroup_3() { return cGroup_3; }

		//"key"
		public Keyword getKeyKeyword_3_0() { return cKeyKeyword_3_0; }

		//"="
		public Keyword getEqualsSignKeyword_3_1() { return cEqualsSignKeyword_3_1; }

		//name=Name
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//Name
		public RuleCall getNameNameParserRuleCall_4_0() { return cNameNameParserRuleCall_4_0; }

		//(","? "pattern" "=" pattern=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//","?
		public Keyword getCommaKeyword_5_0() { return cCommaKeyword_5_0; }

		//"pattern"
		public Keyword getPatternKeyword_5_1() { return cPatternKeyword_5_1; }

		//"="
		public Keyword getEqualsSignKeyword_5_2() { return cEqualsSignKeyword_5_2; }

		//pattern=STRING
		public Assignment getPatternAssignment_5_3() { return cPatternAssignment_5_3; }

		//STRING
		public RuleCall getPatternSTRINGTerminalRuleCall_5_3_0() { return cPatternSTRINGTerminalRuleCall_5_3_0; }

		//(","? required?="required")?
		public Group getGroup_6() { return cGroup_6; }

		//","?
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }

		//required?="required"
		public Assignment getRequiredAssignment_6_1() { return cRequiredAssignment_6_1; }

		//"required"
		public Keyword getRequiredRequiredKeyword_6_1_0() { return cRequiredRequiredKeyword_6_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}

	public class BatchStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BatchStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRunKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cNameFQNParserRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cJobNameAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cJobNameFQNParserRuleCall_1_1_0_0 = (RuleCall)cJobNameAssignment_1_1_0.eContents().get(0);
		private final Keyword cAsKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cNameAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cNameNameParserRuleCall_1_1_2_0 = (RuleCall)cNameAssignment_1_1_2.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cSoonAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final Keyword cSoonSoonKeyword_2_0_0 = (Keyword)cSoonAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cAfterKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cAfterAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cAfterBatchStatementCrossReference_2_1_1_0 = (CrossReference)cAfterAssignment_2_1_1.eContents().get(0);
		private final RuleCall cAfterBatchStatementIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cAfterBatchStatementCrossReference_2_1_1_0.eContents().get(1);
		private final Group cGroup_2_1_2 = (Group)cGroup_2_1.eContents().get(2);
		private final Keyword cCommaKeyword_2_1_2_0 = (Keyword)cGroup_2_1_2.eContents().get(0);
		private final Assignment cAfterAssignment_2_1_2_1 = (Assignment)cGroup_2_1_2.eContents().get(1);
		private final CrossReference cAfterBatchStatementCrossReference_2_1_2_1_0 = (CrossReference)cAfterAssignment_2_1_2_1.eContents().get(0);
		private final RuleCall cAfterBatchStatementIDTerminalRuleCall_2_1_2_1_0_1 = (RuleCall)cAfterBatchStatementCrossReference_2_1_2_1_0.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cSemicolonKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Keyword cFullStopKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//BatchStatement:
		//
		//	"run" (name=FQN | jobName=FQN "as" name=Name) (soon?="soon" | "after" after+=[BatchStatement] (","
		//
		//	after+=[BatchStatement])*) (";" | ".")?;
		public ParserRule getRule() { return rule; }

		//"run" (name=FQN | jobName=FQN "as" name=Name) (soon?="soon" | "after" after+=[BatchStatement] (","
		//
		//after+=[BatchStatement])*) (";" | ".")?
		public Group getGroup() { return cGroup; }

		//"run"
		public Keyword getRunKeyword_0() { return cRunKeyword_0; }

		//name=FQN | jobName=FQN "as" name=Name
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//name=FQN
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_1_0_0() { return cNameFQNParserRuleCall_1_0_0; }

		//jobName=FQN "as" name=Name
		public Group getGroup_1_1() { return cGroup_1_1; }

		//jobName=FQN
		public Assignment getJobNameAssignment_1_1_0() { return cJobNameAssignment_1_1_0; }

		//FQN
		public RuleCall getJobNameFQNParserRuleCall_1_1_0_0() { return cJobNameFQNParserRuleCall_1_1_0_0; }

		//"as"
		public Keyword getAsKeyword_1_1_1() { return cAsKeyword_1_1_1; }

		//name=Name
		public Assignment getNameAssignment_1_1_2() { return cNameAssignment_1_1_2; }

		//Name
		public RuleCall getNameNameParserRuleCall_1_1_2_0() { return cNameNameParserRuleCall_1_1_2_0; }

		//soon?="soon" | "after" after+=[BatchStatement] ("," after+=[BatchStatement])*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }

		//soon?="soon"
		public Assignment getSoonAssignment_2_0() { return cSoonAssignment_2_0; }

		//"soon"
		public Keyword getSoonSoonKeyword_2_0_0() { return cSoonSoonKeyword_2_0_0; }

		//"after" after+=[BatchStatement] ("," after+=[BatchStatement])*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//"after"
		public Keyword getAfterKeyword_2_1_0() { return cAfterKeyword_2_1_0; }

		//after+=[BatchStatement]
		public Assignment getAfterAssignment_2_1_1() { return cAfterAssignment_2_1_1; }

		//[BatchStatement]
		public CrossReference getAfterBatchStatementCrossReference_2_1_1_0() { return cAfterBatchStatementCrossReference_2_1_1_0; }

		//ID
		public RuleCall getAfterBatchStatementIDTerminalRuleCall_2_1_1_0_1() { return cAfterBatchStatementIDTerminalRuleCall_2_1_1_0_1; }

		//("," after+=[BatchStatement])*
		public Group getGroup_2_1_2() { return cGroup_2_1_2; }

		//","
		public Keyword getCommaKeyword_2_1_2_0() { return cCommaKeyword_2_1_2_0; }

		//after+=[BatchStatement]
		public Assignment getAfterAssignment_2_1_2_1() { return cAfterAssignment_2_1_2_1; }

		//[BatchStatement]
		public CrossReference getAfterBatchStatementCrossReference_2_1_2_1_0() { return cAfterBatchStatementCrossReference_2_1_2_1_0; }

		//ID
		public RuleCall getAfterBatchStatementIDTerminalRuleCall_2_1_2_1_0_1() { return cAfterBatchStatementIDTerminalRuleCall_2_1_2_1_0_1; }

		//(";" | ".")?
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//";"
		public Keyword getSemicolonKeyword_3_0() { return cSemicolonKeyword_3_0; }

		//"."
		public Keyword getFullStopKeyword_3_1() { return cFullStopKeyword_3_1; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cNameParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN returns ecore::EString:
		//
		//	Name ("." Name)*;
		public ParserRule getRule() { return rule; }

		//Name ("." Name)*
		public Group getGroup() { return cGroup; }

		//Name
		public RuleCall getNameParserRuleCall_0() { return cNameParserRuleCall_0; }

		//("." Name)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//Name
		public RuleCall getNameParserRuleCall_1_1() { return cNameParserRuleCall_1_1; }
	}

	public class NameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Name");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Keyword cBatchKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cKeyKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cPatternKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cRequiredKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cRunKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cAsKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cSoonKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cAfterKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		
		//Name:
		//
		//	ID | "batch" | "key" | "pattern" | "required" | "run" | "as" | "soon" | "after";
		public ParserRule getRule() { return rule; }

		//ID | "batch" | "key" | "pattern" | "required" | "run" | "as" | "soon" | "after"
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//"batch"
		public Keyword getBatchKeyword_1() { return cBatchKeyword_1; }

		//"key"
		public Keyword getKeyKeyword_2() { return cKeyKeyword_2; }

		//"pattern"
		public Keyword getPatternKeyword_3() { return cPatternKeyword_3; }

		//"required"
		public Keyword getRequiredKeyword_4() { return cRequiredKeyword_4; }

		//"run"
		public Keyword getRunKeyword_5() { return cRunKeyword_5; }

		//"as"
		public Keyword getAsKeyword_6() { return cAsKeyword_6; }

		//"soon"
		public Keyword getSoonKeyword_7() { return cSoonKeyword_7; }

		//"after"
		public Keyword getAfterKeyword_8() { return cAfterKeyword_8; }
	}
	
	
	private ScriptElements pScript;
	private PackageDeclareElements pPackageDeclare;
	private ImportDeclareElements pImportDeclare;
	private BatchDslElements pBatchDsl;
	private BatchParameterElements pBatchParameter;
	private BatchStatementElements pBatchStatement;
	private FQNElements pFQN;
	private NameElements pName;
	private TerminalRule tID;
	private TerminalRule tSTRING;
	private TerminalRule tML_COMMENT;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public BatchDslGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("jp.hishidama.xtext.afw.batch_dsl.BatchDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Script:
	//
	//	package=PackageDeclare imports+=ImportDeclare* list+=BatchDsl*;
	public ScriptElements getScriptAccess() {
		return (pScript != null) ? pScript : (pScript = new ScriptElements());
	}
	
	public ParserRule getScriptRule() {
		return getScriptAccess().getRule();
	}

	//PackageDeclare:
	//
	//	"package" name=FQN ";"?;
	public PackageDeclareElements getPackageDeclareAccess() {
		return (pPackageDeclare != null) ? pPackageDeclare : (pPackageDeclare = new PackageDeclareElements());
	}
	
	public ParserRule getPackageDeclareRule() {
		return getPackageDeclareAccess().getRule();
	}

	//ImportDeclare:
	//
	//	"import" name=FQN ("." wildcard?="*")? ";"?;
	public ImportDeclareElements getImportDeclareAccess() {
		return (pImportDeclare != null) ? pImportDeclare : (pImportDeclare = new ImportDeclareElements());
	}
	
	public ParserRule getImportDeclareRule() {
		return getImportDeclareAccess().getRule();
	}

	//BatchDsl:
	//
	//	comment=STRING? params+=BatchParameter* "batch" name=Name "{" statements+=BatchStatement* "}" ";"?;
	public BatchDslElements getBatchDslAccess() {
		return (pBatchDsl != null) ? pBatchDsl : (pBatchDsl = new BatchDslElements());
	}
	
	public ParserRule getBatchDslRule() {
		return getBatchDslAccess().getRule();
	}

	//BatchParameter:
	//
	//	"@param" "(" comment=STRING? ("key" "=")? name=Name (","? "pattern" "=" pattern=STRING)? (","? required?="required")?
	//
	//	")";
	public BatchParameterElements getBatchParameterAccess() {
		return (pBatchParameter != null) ? pBatchParameter : (pBatchParameter = new BatchParameterElements());
	}
	
	public ParserRule getBatchParameterRule() {
		return getBatchParameterAccess().getRule();
	}

	//BatchStatement:
	//
	//	"run" (name=FQN | jobName=FQN "as" name=Name) (soon?="soon" | "after" after+=[BatchStatement] (","
	//
	//	after+=[BatchStatement])*) (";" | ".")?;
	public BatchStatementElements getBatchStatementAccess() {
		return (pBatchStatement != null) ? pBatchStatement : (pBatchStatement = new BatchStatementElements());
	}
	
	public ParserRule getBatchStatementRule() {
		return getBatchStatementAccess().getRule();
	}

	//FQN returns ecore::EString:
	//
	//	Name ("." Name)*;
	public FQNElements getFQNAccess() {
		return (pFQN != null) ? pFQN : (pFQN = new FQNElements());
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//Name:
	//
	//	ID | "batch" | "key" | "pattern" | "required" | "run" | "as" | "soon" | "after";
	public NameElements getNameAccess() {
		return (pName != null) ? pName : (pName = new NameElements());
	}
	
	public ParserRule getNameRule() {
		return getNameAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	} 

	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	} 

	//terminal SL_COMMENT:
	//
	//	("//" | "--") !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 
}
