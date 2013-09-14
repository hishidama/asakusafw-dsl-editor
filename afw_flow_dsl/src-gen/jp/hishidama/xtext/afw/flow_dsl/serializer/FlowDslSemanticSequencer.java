package jp.hishidama.xtext.afw.flow_dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDsl;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowParameter;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.PackageDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.Script;
import jp.hishidama.xtext.afw.flow_dsl.services.FlowDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FlowDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FlowDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FlowDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FlowDslPackage.FLOW_DSL:
				if(context == grammarAccess.getFlowDslRule()) {
					sequence_FlowDsl(context, (FlowDsl) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.FLOW_IN:
				if(context == grammarAccess.getFlowInRule()) {
					sequence_FlowIn(context, (FlowIn) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.FLOW_OUT:
				if(context == grammarAccess.getFlowOutRule()) {
					sequence_FlowOut(context, (FlowOut) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.FLOW_PARAMETER:
				if(context == grammarAccess.getFlowParameterRule()) {
					sequence_FlowParameter(context, (FlowParameter) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.FLOW_STATEMENT1:
				if(context == grammarAccess.getFlowStatementRule() ||
				   context == grammarAccess.getFlowStatement1Rule()) {
					sequence_FlowStatement1(context, (FlowStatement1) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.FLOW_STATEMENT2:
				if(context == grammarAccess.getFlowStatementRule() ||
				   context == grammarAccess.getFlowStatement2Rule()) {
					sequence_FlowStatement2(context, (FlowStatement2) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.IMPORT_DECLARE:
				if(context == grammarAccess.getImportDeclareRule()) {
					sequence_ImportDeclare(context, (ImportDeclare) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.OPERATOR_ARGUMENT:
				if(context == grammarAccess.getOperatorArgumentRule()) {
					sequence_OperatorArgument(context, (OperatorArgument) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.OPERATOR_DECLARE:
				if(context == grammarAccess.getOperatorDeclareRule()) {
					sequence_OperatorDeclare(context, (OperatorDeclare) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.PACKAGE_DECLARE:
				if(context == grammarAccess.getPackageDeclareRule()) {
					sequence_PackageDeclare(context, (PackageDeclare) semanticObject); 
					return; 
				}
				else break;
			case FlowDslPackage.SCRIPT:
				if(context == grammarAccess.getScriptRule()) {
					sequence_Script(context, (Script) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (comment=STRING? name=Name params+=FlowParameter+ statements+=FlowStatement*)
	 */
	protected void sequence_FlowDsl(EObject context, FlowDsl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inout='in' model=Name name=Name (importerDescription=FQN importerName=Name?)?)
	 */
	protected void sequence_FlowIn(EObject context, FlowIn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inout='out' model=Name name=Name (exporterDescription=FQN exporterName=Name?)?)
	 */
	protected void sequence_FlowOut(EObject context, FlowOut semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (in=FlowIn | out=FlowOut)
	 */
	protected void sequence_FlowParameter(EObject context, FlowParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name? operator=[OperatorDeclare|ID] method=Name (arguments+=OperatorArgument arguments+=OperatorArgument*)?)
	 */
	protected void sequence_FlowStatement1(EObject context, FlowStatement1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=[FlowOut|ID] (arguments+=OperatorArgument arguments+=OperatorArgument*)?)
	 */
	protected void sequence_FlowStatement2(EObject context, FlowStatement2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN wildcard?='*'?)
	 */
	protected void sequence_ImportDeclare(EObject context, ImportDeclare semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((in=[FlowIn|ID] name=Name) | in=[FlowStatement|ID])
	 */
	protected void sequence_OperatorArgument(EObject context, OperatorArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=FQN name=Name)
	 */
	protected void sequence_OperatorDeclare(EObject context, OperatorDeclare semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowDslPackage.Literals.OPERATOR_DECLARE__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowDslPackage.Literals.OPERATOR_DECLARE__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, FlowDslPackage.Literals.OPERATOR_DECLARE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowDslPackage.Literals.OPERATOR_DECLARE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperatorDeclareAccess().getOperatorFQNParserRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getOperatorDeclareAccess().getNameNameParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=FQN
	 */
	protected void sequence_PackageDeclare(EObject context, PackageDeclare semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FlowDslPackage.Literals.PACKAGE_DECLARE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FlowDslPackage.Literals.PACKAGE_DECLARE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageDeclareAccess().getNameFQNParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (package=PackageDeclare imports+=ImportDeclare* operators+=OperatorDeclare* list+=FlowDsl*)
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
