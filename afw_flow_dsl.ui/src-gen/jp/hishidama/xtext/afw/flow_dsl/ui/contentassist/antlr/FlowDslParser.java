/*
* generated by Xtext
*/
package jp.hishidama.xtext.afw.flow_dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import jp.hishidama.xtext.afw.flow_dsl.services.FlowDslGrammarAccess;

public class FlowDslParser extends AbstractContentAssistParser {
	
	@Inject
	private FlowDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected jp.hishidama.xtext.afw.flow_dsl.ui.contentassist.antlr.internal.InternalFlowDslParser createParser() {
		jp.hishidama.xtext.afw.flow_dsl.ui.contentassist.antlr.internal.InternalFlowDslParser result = new jp.hishidama.xtext.afw.flow_dsl.ui.contentassist.antlr.internal.InternalFlowDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFlowParameterAccess().getAlternatives(), "rule__FlowParameter__Alternatives");
					put(grammarAccess.getFlowInAccess().getAlternatives_5(), "rule__FlowIn__Alternatives_5");
					put(grammarAccess.getFlowOutAccess().getAlternatives_5(), "rule__FlowOut__Alternatives_5");
					put(grammarAccess.getFlowStatementAccess().getAlternatives(), "rule__FlowStatement__Alternatives");
					put(grammarAccess.getFlowStatement1Access().getAlternatives_7(), "rule__FlowStatement1__Alternatives_7");
					put(grammarAccess.getFlowStatement2Access().getAlternatives_5(), "rule__FlowStatement2__Alternatives_5");
					put(grammarAccess.getOperatorArgumentAccess().getAlternatives(), "rule__OperatorArgument__Alternatives");
					put(grammarAccess.getNameAccess().getAlternatives(), "rule__Name__Alternatives");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getPackageDeclareAccess().getGroup(), "rule__PackageDeclare__Group__0");
					put(grammarAccess.getImportDeclareAccess().getGroup(), "rule__ImportDeclare__Group__0");
					put(grammarAccess.getImportDeclareAccess().getGroup_2(), "rule__ImportDeclare__Group_2__0");
					put(grammarAccess.getOperatorDeclareAccess().getGroup(), "rule__OperatorDeclare__Group__0");
					put(grammarAccess.getFlowDslAccess().getGroup(), "rule__FlowDsl__Group__0");
					put(grammarAccess.getFlowInAccess().getGroup(), "rule__FlowIn__Group__0");
					put(grammarAccess.getFlowInAccess().getGroup_4(), "rule__FlowIn__Group_4__0");
					put(grammarAccess.getFlowInAccess().getGroup_4_3(), "rule__FlowIn__Group_4_3__0");
					put(grammarAccess.getFlowOutAccess().getGroup(), "rule__FlowOut__Group__0");
					put(grammarAccess.getFlowOutAccess().getGroup_4(), "rule__FlowOut__Group_4__0");
					put(grammarAccess.getFlowOutAccess().getGroup_4_3(), "rule__FlowOut__Group_4_3__0");
					put(grammarAccess.getFlowStatement1Access().getGroup(), "rule__FlowStatement1__Group__0");
					put(grammarAccess.getFlowStatement1Access().getGroup_0(), "rule__FlowStatement1__Group_0__0");
					put(grammarAccess.getFlowStatement1Access().getGroup_5(), "rule__FlowStatement1__Group_5__0");
					put(grammarAccess.getFlowStatement1Access().getGroup_5_1(), "rule__FlowStatement1__Group_5_1__0");
					put(grammarAccess.getFlowStatement2Access().getGroup(), "rule__FlowStatement2__Group__0");
					put(grammarAccess.getFlowStatement2Access().getGroup_3(), "rule__FlowStatement2__Group_3__0");
					put(grammarAccess.getFlowStatement2Access().getGroup_3_1(), "rule__FlowStatement2__Group_3_1__0");
					put(grammarAccess.getOperatorArgumentAccess().getGroup_0(), "rule__OperatorArgument__Group_0__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getScriptAccess().getPackageAssignment_0(), "rule__Script__PackageAssignment_0");
					put(grammarAccess.getScriptAccess().getImportsAssignment_1(), "rule__Script__ImportsAssignment_1");
					put(grammarAccess.getScriptAccess().getOperatorsAssignment_2(), "rule__Script__OperatorsAssignment_2");
					put(grammarAccess.getScriptAccess().getListAssignment_3(), "rule__Script__ListAssignment_3");
					put(grammarAccess.getPackageDeclareAccess().getNameAssignment_1(), "rule__PackageDeclare__NameAssignment_1");
					put(grammarAccess.getImportDeclareAccess().getNameAssignment_1(), "rule__ImportDeclare__NameAssignment_1");
					put(grammarAccess.getImportDeclareAccess().getWildcardAssignment_2_1(), "rule__ImportDeclare__WildcardAssignment_2_1");
					put(grammarAccess.getOperatorDeclareAccess().getOperatorAssignment_1(), "rule__OperatorDeclare__OperatorAssignment_1");
					put(grammarAccess.getOperatorDeclareAccess().getNameAssignment_3(), "rule__OperatorDeclare__NameAssignment_3");
					put(grammarAccess.getFlowDslAccess().getCommentAssignment_0(), "rule__FlowDsl__CommentAssignment_0");
					put(grammarAccess.getFlowDslAccess().getNameAssignment_2(), "rule__FlowDsl__NameAssignment_2");
					put(grammarAccess.getFlowDslAccess().getParamsAssignment_4(), "rule__FlowDsl__ParamsAssignment_4");
					put(grammarAccess.getFlowDslAccess().getStatementsAssignment_7(), "rule__FlowDsl__StatementsAssignment_7");
					put(grammarAccess.getFlowParameterAccess().getInAssignment_0(), "rule__FlowParameter__InAssignment_0");
					put(grammarAccess.getFlowParameterAccess().getOutAssignment_1(), "rule__FlowParameter__OutAssignment_1");
					put(grammarAccess.getFlowInAccess().getInoutAssignment_0(), "rule__FlowIn__InoutAssignment_0");
					put(grammarAccess.getFlowInAccess().getModelAssignment_1(), "rule__FlowIn__ModelAssignment_1");
					put(grammarAccess.getFlowInAccess().getNameAssignment_3(), "rule__FlowIn__NameAssignment_3");
					put(grammarAccess.getFlowInAccess().getImporterDescriptionAssignment_4_2(), "rule__FlowIn__ImporterDescriptionAssignment_4_2");
					put(grammarAccess.getFlowInAccess().getImporterNameAssignment_4_3_1(), "rule__FlowIn__ImporterNameAssignment_4_3_1");
					put(grammarAccess.getFlowOutAccess().getInoutAssignment_0(), "rule__FlowOut__InoutAssignment_0");
					put(grammarAccess.getFlowOutAccess().getModelAssignment_1(), "rule__FlowOut__ModelAssignment_1");
					put(grammarAccess.getFlowOutAccess().getNameAssignment_3(), "rule__FlowOut__NameAssignment_3");
					put(grammarAccess.getFlowOutAccess().getExporterDescriptionAssignment_4_2(), "rule__FlowOut__ExporterDescriptionAssignment_4_2");
					put(grammarAccess.getFlowOutAccess().getExporterNameAssignment_4_3_1(), "rule__FlowOut__ExporterNameAssignment_4_3_1");
					put(grammarAccess.getFlowStatement1Access().getNameAssignment_0_0(), "rule__FlowStatement1__NameAssignment_0_0");
					put(grammarAccess.getFlowStatement1Access().getOperatorAssignment_1(), "rule__FlowStatement1__OperatorAssignment_1");
					put(grammarAccess.getFlowStatement1Access().getMethodAssignment_3(), "rule__FlowStatement1__MethodAssignment_3");
					put(grammarAccess.getFlowStatement1Access().getArgumentsAssignment_5_0(), "rule__FlowStatement1__ArgumentsAssignment_5_0");
					put(grammarAccess.getFlowStatement1Access().getArgumentsAssignment_5_1_1(), "rule__FlowStatement1__ArgumentsAssignment_5_1_1");
					put(grammarAccess.getFlowStatement2Access().getNameAssignment_0(), "rule__FlowStatement2__NameAssignment_0");
					put(grammarAccess.getFlowStatement2Access().getArgumentsAssignment_3_0(), "rule__FlowStatement2__ArgumentsAssignment_3_0");
					put(grammarAccess.getFlowStatement2Access().getArgumentsAssignment_3_1_1(), "rule__FlowStatement2__ArgumentsAssignment_3_1_1");
					put(grammarAccess.getOperatorArgumentAccess().getInAssignment_0_0(), "rule__OperatorArgument__InAssignment_0_0");
					put(grammarAccess.getOperatorArgumentAccess().getNameAssignment_0_2(), "rule__OperatorArgument__NameAssignment_0_2");
					put(grammarAccess.getOperatorArgumentAccess().getInAssignment_1(), "rule__OperatorArgument__InAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			jp.hishidama.xtext.afw.flow_dsl.ui.contentassist.antlr.internal.InternalFlowDslParser typedParser = (jp.hishidama.xtext.afw.flow_dsl.ui.contentassist.antlr.internal.InternalFlowDslParser) parser;
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
	
	public FlowDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FlowDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
