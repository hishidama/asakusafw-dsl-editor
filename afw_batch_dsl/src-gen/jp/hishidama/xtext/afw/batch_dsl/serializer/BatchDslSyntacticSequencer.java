package jp.hishidama.xtext.afw.batch_dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import jp.hishidama.xtext.afw.batch_dsl.services.BatchDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BatchDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BatchDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BatchDsl_SemicolonKeyword_7_q;
	protected AbstractElementAlias match_BatchParameter_CommaKeyword_5_0_q;
	protected AbstractElementAlias match_BatchParameter_CommaKeyword_6_0_q;
	protected AbstractElementAlias match_BatchParameter___KeyKeyword_3_0_EqualsSignKeyword_3_1__q;
	protected AbstractElementAlias match_BatchStatement___FullStopKeyword_3_1_or_SemicolonKeyword_3_0__q;
	protected AbstractElementAlias match_ImportDeclare_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_PackageDeclare_SemicolonKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BatchDslGrammarAccess) access;
		match_BatchDsl_SemicolonKeyword_7_q = new TokenAlias(false, true, grammarAccess.getBatchDslAccess().getSemicolonKeyword_7());
		match_BatchParameter_CommaKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getBatchParameterAccess().getCommaKeyword_5_0());
		match_BatchParameter_CommaKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getBatchParameterAccess().getCommaKeyword_6_0());
		match_BatchParameter___KeyKeyword_3_0_EqualsSignKeyword_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBatchParameterAccess().getKeyKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_3_1()));
		match_BatchStatement___FullStopKeyword_3_1_or_SemicolonKeyword_3_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getBatchStatementAccess().getFullStopKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getBatchStatementAccess().getSemicolonKeyword_3_0()));
		match_ImportDeclare_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getImportDeclareAccess().getSemicolonKeyword_3());
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
			if(match_BatchDsl_SemicolonKeyword_7_q.equals(syntax))
				emit_BatchDsl_SemicolonKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BatchParameter_CommaKeyword_5_0_q.equals(syntax))
				emit_BatchParameter_CommaKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BatchParameter_CommaKeyword_6_0_q.equals(syntax))
				emit_BatchParameter_CommaKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BatchParameter___KeyKeyword_3_0_EqualsSignKeyword_3_1__q.equals(syntax))
				emit_BatchParameter___KeyKeyword_3_0_EqualsSignKeyword_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BatchStatement___FullStopKeyword_3_1_or_SemicolonKeyword_3_0__q.equals(syntax))
				emit_BatchStatement___FullStopKeyword_3_1_or_SemicolonKeyword_3_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImportDeclare_SemicolonKeyword_3_q.equals(syntax))
				emit_ImportDeclare_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PackageDeclare_SemicolonKeyword_2_q.equals(syntax))
				emit_PackageDeclare_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_BatchDsl_SemicolonKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_BatchParameter_CommaKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_BatchParameter_CommaKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('key' '=')?
	 */
	protected void emit_BatchParameter___KeyKeyword_3_0_EqualsSignKeyword_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('.' | ';')?
	 */
	protected void emit_BatchStatement___FullStopKeyword_3_1_or_SemicolonKeyword_3_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_PackageDeclare_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
