/*
 * first generated by Xtext
 */
package jp.hishidama.xtext.afw.batch_dsl.formatting;

import jp.hishidama.xtext.afw.batch_dsl.services.BatchDslGrammarAccess;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;

import com.google.inject.Inject;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class BatchDslFormatter extends AbstractDeclarativeFormatter {

	@Inject
	@Extension
	private BatchDslGrammarAccess grammarAccess;

	@Override
	protected void configureFormatting(FormattingConfig c) {
		BatchDslGrammarAccess f = grammarAccess;

		c.setAutoLinewrap(120);

		for (Keyword period : f.findKeywords(".")) {
			c.setNoSpace().before(period);
		}
		for (Keyword period : f.getFQNAccess().findKeywords(".")) {
			c.setNoSpace().after(period);
		}
		for (Keyword period : f.getImportDeclareAccess().findKeywords(".")) {
			c.setNoSpace().after(period);
		}

		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma); // 直前は詰める
		}
		for (Keyword semicolon : f.findKeywords(";")) {
			c.setNoSpace().before(semicolon); // 直前は詰める
		}

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setNoSpace().after(pair.getFirst()); // 開き括弧の直後は詰める
			c.setNoSpace().before(pair.getSecond()); // 閉じ括弧の直前は詰める
		}
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());

			c.setLinewrap().after(pair.getFirst()); // 開き括弧の後は改行する
		}

		// package
		c.setLinewrap(2).after(f.getPackageDeclareRule());

		// import
		c.setLinewrap().after(f.getImportDeclareRule());
		c.setLinewrap(2).between(f.getImportDeclareRule(), f.getBatchDslRule());

		// Batch DSL
		c.setLinewrap().after(f.getBatchDslAccess().getCommentAssignment_0());
		c.setNoSpace().after(f.getBatchParameterAccess().getParamKeyword_0());
		c.setLinewrap().after(f.getBatchParameterRule());
		c.setLinewrap().after(f.getBatchStatementRule());
		c.setLinewrap(2, 2, 2).after(f.getBatchDslRule());

		// Comment
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}
