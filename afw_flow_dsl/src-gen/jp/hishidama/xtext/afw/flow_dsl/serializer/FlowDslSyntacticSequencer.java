package jp.hishidama.xtext.afw.flow_dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import jp.hishidama.xtext.afw.flow_dsl.services.FlowDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class FlowDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FlowDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_FlowDsl_SemicolonKeyword_9_q;
	protected AbstractElementAlias match_FlowIn_CommaKeyword_4_0_q;
	protected AbstractElementAlias match_FlowIn___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q;
	protected AbstractElementAlias match_FlowOut_CommaKeyword_4_0_q;
	protected AbstractElementAlias match_FlowOut___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q;
	protected AbstractElementAlias match_FlowStatement1___FullStopKeyword_7_1_or_SemicolonKeyword_7_0__q;
	protected AbstractElementAlias match_FlowStatement2___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q;
	protected AbstractElementAlias match_ImportDeclare_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_OperatorDeclare_SemicolonKeyword_4_q;
	protected AbstractElementAlias match_PackageDeclare_SemicolonKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FlowDslGrammarAccess) access;
		match_FlowDsl_SemicolonKeyword_9_q = new TokenAlias(false, true, grammarAccess.getFlowDslAccess().getSemicolonKeyword_9());
		match_FlowIn_CommaKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getFlowInAccess().getCommaKeyword_4_0());
		match_FlowIn___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFlowInAccess().getFullStopKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getFlowInAccess().getSemicolonKeyword_5_0()));
		match_FlowOut_CommaKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getFlowOutAccess().getCommaKeyword_4_0());
		match_FlowOut___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFlowOutAccess().getFullStopKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getFlowOutAccess().getSemicolonKeyword_5_0()));
		match_FlowStatement1___FullStopKeyword_7_1_or_SemicolonKeyword_7_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFlowStatement1Access().getFullStopKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getFlowStatement1Access().getSemicolonKeyword_7_0()));
		match_FlowStatement2___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFlowStatement2Access().getFullStopKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getFlowStatement2Access().getSemicolonKeyword_5_0()));
		match_ImportDeclare_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getImportDeclareAccess().getSemicolonKeyword_3());
		match_OperatorDeclare_SemicolonKeyword_4_q = new TokenAlias(false, true, grammarAccess.getOperatorDeclareAccess().getSemicolonKeyword_4());
		match_PackageDeclare_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getPackageDeclareAccess().getSemicolonKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_FlowDsl_SemicolonKeyword_9_q.equals(syntax))
				emit_FlowDsl_SemicolonKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FlowIn_CommaKeyword_4_0_q.equals(syntax))
				emit_FlowIn_CommaKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FlowIn___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q.equals(syntax))
				emit_FlowIn___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FlowOut_CommaKeyword_4_0_q.equals(syntax))
				emit_FlowOut_CommaKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FlowOut___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q.equals(syntax))
				emit_FlowOut___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FlowStatement1___FullStopKeyword_7_1_or_SemicolonKeyword_7_0__q.equals(syntax))
				emit_FlowStatement1___FullStopKeyword_7_1_or_SemicolonKeyword_7_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FlowStatement2___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q.equals(syntax))
				emit_FlowStatement2___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImportDeclare_SemicolonKeyword_3_q.equals(syntax))
				emit_ImportDeclare_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OperatorDeclare_SemicolonKeyword_4_q.equals(syntax))
				emit_OperatorDeclare_SemicolonKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PackageDeclare_SemicolonKeyword_2_q.equals(syntax))
				emit_PackageDeclare_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_FlowDsl_SemicolonKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_FlowIn_CommaKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (';' | '.')?
	 */
	protected void emit_FlowIn___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_FlowOut_CommaKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('.' | ';')?
	 */
	protected void emit_FlowOut___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('.' | ';')?
	 */
	protected void emit_FlowStatement1___FullStopKeyword_7_1_or_SemicolonKeyword_7_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('.' | ';')?
	 */
	protected void emit_FlowStatement2___FullStopKeyword_5_1_or_SemicolonKeyword_5_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_ImportDeclare_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_OperatorDeclare_SemicolonKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_PackageDeclare_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
