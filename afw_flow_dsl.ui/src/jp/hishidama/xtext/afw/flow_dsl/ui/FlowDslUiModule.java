/*
 * generated by Xtext
 */
package jp.hishidama.xtext.afw.flow_dsl.ui;

import jp.hishidama.xtext.afw.flow_dsl.ui.highlighting.FlowDslSemanticHighlightingCalculator;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class FlowDslUiModule extends jp.hishidama.xtext.afw.flow_dsl.ui.AbstractFlowDslUiModule {
	public FlowDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
		return FlowDslSemanticHighlightingCalculator.class;
	}
}
