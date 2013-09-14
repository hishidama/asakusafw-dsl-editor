/*
* generated by Xtext
*/
package jp.hishidama.xtext.afw.batch_dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import jp.hishidama.xtext.afw.batch_dsl.services.BatchDslGrammarAccess;

public class BatchDslParser extends AbstractContentAssistParser {
	
	@Inject
	private BatchDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected jp.hishidama.xtext.afw.batch_dsl.ui.contentassist.antlr.internal.InternalBatchDslParser createParser() {
		jp.hishidama.xtext.afw.batch_dsl.ui.contentassist.antlr.internal.InternalBatchDslParser result = new jp.hishidama.xtext.afw.batch_dsl.ui.contentassist.antlr.internal.InternalBatchDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBatchStatementAccess().getAlternatives_1(), "rule__BatchStatement__Alternatives_1");
					put(grammarAccess.getBatchStatementAccess().getAlternatives_2(), "rule__BatchStatement__Alternatives_2");
					put(grammarAccess.getBatchStatementAccess().getAlternatives_3(), "rule__BatchStatement__Alternatives_3");
					put(grammarAccess.getNameAccess().getAlternatives(), "rule__Name__Alternatives");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getPackageDeclareAccess().getGroup(), "rule__PackageDeclare__Group__0");
					put(grammarAccess.getImportDeclareAccess().getGroup(), "rule__ImportDeclare__Group__0");
					put(grammarAccess.getImportDeclareAccess().getGroup_2(), "rule__ImportDeclare__Group_2__0");
					put(grammarAccess.getBatchDslAccess().getGroup(), "rule__BatchDsl__Group__0");
					put(grammarAccess.getBatchParameterAccess().getGroup(), "rule__BatchParameter__Group__0");
					put(grammarAccess.getBatchParameterAccess().getGroup_3(), "rule__BatchParameter__Group_3__0");
					put(grammarAccess.getBatchParameterAccess().getGroup_5(), "rule__BatchParameter__Group_5__0");
					put(grammarAccess.getBatchParameterAccess().getGroup_6(), "rule__BatchParameter__Group_6__0");
					put(grammarAccess.getBatchStatementAccess().getGroup(), "rule__BatchStatement__Group__0");
					put(grammarAccess.getBatchStatementAccess().getGroup_1_1(), "rule__BatchStatement__Group_1_1__0");
					put(grammarAccess.getBatchStatementAccess().getGroup_2_1(), "rule__BatchStatement__Group_2_1__0");
					put(grammarAccess.getBatchStatementAccess().getGroup_2_1_2(), "rule__BatchStatement__Group_2_1_2__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getScriptAccess().getPackageAssignment_0(), "rule__Script__PackageAssignment_0");
					put(grammarAccess.getScriptAccess().getImportsAssignment_1(), "rule__Script__ImportsAssignment_1");
					put(grammarAccess.getScriptAccess().getListAssignment_2(), "rule__Script__ListAssignment_2");
					put(grammarAccess.getPackageDeclareAccess().getNameAssignment_1(), "rule__PackageDeclare__NameAssignment_1");
					put(grammarAccess.getImportDeclareAccess().getNameAssignment_1(), "rule__ImportDeclare__NameAssignment_1");
					put(grammarAccess.getImportDeclareAccess().getWildcardAssignment_2_1(), "rule__ImportDeclare__WildcardAssignment_2_1");
					put(grammarAccess.getBatchDslAccess().getCommentAssignment_0(), "rule__BatchDsl__CommentAssignment_0");
					put(grammarAccess.getBatchDslAccess().getParamsAssignment_1(), "rule__BatchDsl__ParamsAssignment_1");
					put(grammarAccess.getBatchDslAccess().getNameAssignment_3(), "rule__BatchDsl__NameAssignment_3");
					put(grammarAccess.getBatchDslAccess().getStatementsAssignment_5(), "rule__BatchDsl__StatementsAssignment_5");
					put(grammarAccess.getBatchParameterAccess().getCommentAssignment_2(), "rule__BatchParameter__CommentAssignment_2");
					put(grammarAccess.getBatchParameterAccess().getNameAssignment_4(), "rule__BatchParameter__NameAssignment_4");
					put(grammarAccess.getBatchParameterAccess().getPatternAssignment_5_3(), "rule__BatchParameter__PatternAssignment_5_3");
					put(grammarAccess.getBatchParameterAccess().getRequiredAssignment_6_1(), "rule__BatchParameter__RequiredAssignment_6_1");
					put(grammarAccess.getBatchStatementAccess().getNameAssignment_1_0(), "rule__BatchStatement__NameAssignment_1_0");
					put(grammarAccess.getBatchStatementAccess().getJobNameAssignment_1_1_0(), "rule__BatchStatement__JobNameAssignment_1_1_0");
					put(grammarAccess.getBatchStatementAccess().getNameAssignment_1_1_2(), "rule__BatchStatement__NameAssignment_1_1_2");
					put(grammarAccess.getBatchStatementAccess().getSoonAssignment_2_0(), "rule__BatchStatement__SoonAssignment_2_0");
					put(grammarAccess.getBatchStatementAccess().getAfterAssignment_2_1_1(), "rule__BatchStatement__AfterAssignment_2_1_1");
					put(grammarAccess.getBatchStatementAccess().getAfterAssignment_2_1_2_1(), "rule__BatchStatement__AfterAssignment_2_1_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			jp.hishidama.xtext.afw.batch_dsl.ui.contentassist.antlr.internal.InternalBatchDslParser typedParser = (jp.hishidama.xtext.afw.batch_dsl.ui.contentassist.antlr.internal.InternalBatchDslParser) parser;
			typedParser.entryRuleScript();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public BatchDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BatchDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
