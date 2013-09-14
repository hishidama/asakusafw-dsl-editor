package jp.hishidama.xtext.afw.batch_dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script;
import jp.hishidama.xtext.afw.batch_dsl.services.BatchDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

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
			case BatchDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case BatchDslPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package) semanticObject); 
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
	 *     ((name=FQN | (jobName=FQN name=Name)) (after+=[BatchStatement|ID] after+=[BatchStatement|ID]*)?)
	 */
	protected void sequence_BatchStatement(EObject context, BatchStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=FQN wildcard?='*'?)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Name name+=Name*)
	 */
	protected void sequence_Package(EObject context, jp.hishidama.xtext.afw.batch_dsl.batchDsl.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package=Package imports+=Import* list+=BatchDsl*)
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
