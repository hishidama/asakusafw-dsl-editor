package jp.hishidama.xtext.afw.batch_dsl.ui.highlighting;

import java.util.Iterator;
import java.util.List;

import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchDslPackage;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchParameter;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.BatchStatement;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.Import;
import jp.hishidama.xtext.afw.batch_dsl.batchDsl.util.BatchDslSwitch;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class BatchDslSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource == null) {
			return;
		}

		SemanticSwitch switcher = new SemanticSwitch(acceptor);
		for (Iterator<EObject> i = EcoreUtil.getAllContents(resource, true); i.hasNext();) {
			EObject current = i.next();
			switcher.doSwitch(current);
		}
	}

	private static class SemanticSwitch extends BatchDslSwitch<Void> {
		private final IHighlightedPositionAcceptor acceptor;

		public SemanticSwitch(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Void caseImport(Import object) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object, BatchDslPackage.Literals.IMPORT__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}

		@Override
		public Void caseBatchParameter(BatchParameter object) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object,
					BatchDslPackage.Literals.BATCH_PARAMETER__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}

		@Override
		public Void caseBatchStatement(BatchStatement object) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object,
					BatchDslPackage.Literals.BATCH_STATEMENT__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			list = NodeModelUtils.findNodesForFeature(object, BatchDslPackage.Literals.BATCH_STATEMENT__AFTER);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}
	}
}
