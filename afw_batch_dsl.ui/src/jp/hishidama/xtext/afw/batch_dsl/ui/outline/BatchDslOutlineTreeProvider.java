/*
 * first generated by Xtext
 */
package jp.hishidama.xtext.afw.batch_dsl.ui.outline;

import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDsl;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Script;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
public class BatchDslOutlineTreeProvider extends DefaultOutlineTreeProvider {

	@Override
	protected void _createChildren(DocumentRootNode parentNode, EObject modelElement) {
		Script script = (Script) modelElement;
		for (EObject childElement : script.getList()) {
			createNode(parentNode, childElement);
		}
	}

	protected void _createChildren(IOutlineNode parentNode, BatchDsl object) {
		for (EObject childElement : object.getStatements()) {
			createNode(parentNode, childElement);
		}
	}
}
