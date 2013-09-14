package jp.hishidama.xtext.afw.flow_dsl.ui.highlighting;

import java.util.Iterator;
import java.util.List;

import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowDslPackage;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowIn;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowOut;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement1;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.FlowStatement2;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.ImportDeclare;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.OperatorArgument;
import jp.hishidama.xtext.afw.flow_dsl.flowDsl.util.FlowDslSwitch;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class FlowDslSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

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

	private static class SemanticSwitch extends FlowDslSwitch<Void> {
		private final IHighlightedPositionAcceptor acceptor;

		public SemanticSwitch(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public Void caseImportDeclare(ImportDeclare object) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object, FlowDslPackage.Literals.IMPORT_DECLARE__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}

		@Override
		public Void caseFlowIn(FlowIn object) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object, FlowDslPackage.Literals.FLOW_IN__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}
			list = NodeModelUtils.findNodesForFeature(object, FlowDslPackage.Literals.FLOW_IN__MODEL);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}

		@Override
		public Void caseFlowOut(FlowOut object) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object, FlowDslPackage.Literals.FLOW_OUT__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}
			list = NodeModelUtils.findNodesForFeature(object, FlowDslPackage.Literals.FLOW_OUT__MODEL);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}

		@Override
		public Void caseFlowStatement1(FlowStatement1 object) {
			List<INode> list = NodeModelUtils
					.findNodesForFeature(object, FlowDslPackage.Literals.FLOW_STATEMENT1__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			list = NodeModelUtils.findNodesForFeature(object, FlowDslPackage.Literals.FLOW_STATEMENT1__METHOD);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}

		@Override
		public Void caseFlowStatement2(FlowStatement2 object) {
			List<INode> list = NodeModelUtils
					.findNodesForFeature(object, FlowDslPackage.Literals.FLOW_STATEMENT2__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}

		@Override
		public Void caseOperatorArgument(OperatorArgument object) {
			List<INode> list = NodeModelUtils.findNodesForFeature(object,
					FlowDslPackage.Literals.OPERATOR_ARGUMENT__NAME);
			for (INode n : list) {
				acceptor.addPosition(n.getOffset(), n.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
			}

			return null;
		}
	}
}
