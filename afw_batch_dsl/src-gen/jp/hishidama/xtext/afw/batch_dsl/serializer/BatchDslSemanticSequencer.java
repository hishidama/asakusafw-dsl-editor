package jp.hishidama.xtext.afw.batch_dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.ImportDeclare;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.PackageDeclare;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script;
import jp.hishidama.xtext.afw.batch_dsl.services.BatchDslGrammarAccess;
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
public class BatchDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BatchDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BatchDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BatchDslPackage.BATCH_DSL:
				if(context == grammarAccess.getBatchDslRule()) {
					sequence_BatchDsl(context, (BatchDsl) semanticObject); 
					return; 
				}
				else break;
			case BatchDslPackage.BATCH_PARAMETER:
				if(context == grammarAccess.getBatchParameterRule()) {
					sequence_BatchParameter(context, (BatchParameter) semanticObject); 
					return; 
				}
				else break;
			case BatchDslPackage.BATCH_STATEMENT:
				if(context == grammarAccess.getBatchStatementRule()) {
					sequence_BatchStatement(context, (BatchStatement) semanticObject); 
					return; 
				}
				else break;
			case BatchDslPackage.IMPORT_DECLARE:
				if(context == grammarAccess.getImportDeclareRule()) {
					sequence_ImportDeclare(context, (ImportDeclare) semanticObject); 
					return; 
				}
				else break;
			case BatchDslPackage.PACKAGE_DECLARE:
				if(context == grammarAccess.getPackageDeclareRule()) {
					sequence_PackageDeclare(context, (PackageDeclare) semanticObject); 
					return; 
				}
				else break;
			case BatchDslPackage.SCRIPT:
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
	 *     (comment=STRING? params+=BatchParameter* name=Name statements+=BatchStatement*)
	 */
	protected void sequence_BatchDsl(EObject context, BatchDsl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=STRING? name=Name pattern=STRING? required?='required'?)
	 */
	protected void sequence_BatchParameter(EObject context, BatchParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=FQN | (jobName=FQN name=Name)) (soon?='soon' | (after+=[BatchStatement|ID] after+=[BatchStatement|ID]*)))
	 */
	protected void sequence_BatchStatement(EObject context, BatchStatement semanticObject) {
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
	 *     name=FQN
	 */
	protected void sequence_PackageDeclare(EObject context, PackageDeclare semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BatchDslPackage.Literals.PACKAGE_DECLARE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BatchDslPackage.Literals.PACKAGE_DECLARE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageDeclareAccess().getNameFQNParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (package=PackageDeclare imports+=ImportDeclare* list+=BatchDsl*)
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
