/*
* generated by Xtext
*/
package jp.hishidama.xtext.afw.batch_dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class BatchDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.tokens");
	}
}
