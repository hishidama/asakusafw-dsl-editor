/*
* generated by Xtext
*/
package jp.hishidama.xtext.afw.flow_dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FlowDslStandaloneSetup extends FlowDslStandaloneSetupGenerated{

	public static void doSetup() {
		new FlowDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

