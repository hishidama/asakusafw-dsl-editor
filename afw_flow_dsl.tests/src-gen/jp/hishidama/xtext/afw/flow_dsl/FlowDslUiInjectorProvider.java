/*
* generated by Xtext
*/
package jp.hishidama.xtext.afw.flow_dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class FlowDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return jp.hishidama.xtext.afw.flow_dsl.ui.internal.FlowDslActivator.getInstance().getInjector("jp.hishidama.xtext.afw.flow_dsl.FlowDsl");
	}
	
}