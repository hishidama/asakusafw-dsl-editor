package jp.hishidama.xtext.afw.batch_dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import jp.hishidama.xtext.afw.batch_dsl.services.BatchDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBatchDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'.'", "'batch'", "'key'", "'pattern'", "'required'", "'run'", "'as'", "'soon'", "'after'", "'package'", "'import'", "'{'", "'}'", "'@param'", "'('", "')'", "'='", "','", "'*'"
    };
    public static final int RULE_ID=4;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=7;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_WS=8;

    // delegates
    // delegators


        public InternalBatchDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBatchDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBatchDslParser.tokenNames; }
    public String getGrammarFileName() { return "../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g"; }


     
     	private BatchDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BatchDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleScript"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:60:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:61:1: ( ruleScript EOF )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:62:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript61);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:69:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:73:2: ( ( ( rule__Script__Group__0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:74:1: ( ( rule__Script__Group__0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:74:1: ( ( rule__Script__Group__0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:75:1: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:76:1: ( rule__Script__Group__0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:76:2: rule__Script__Group__0
            {
            pushFollow(FOLLOW_rule__Script__Group__0_in_ruleScript94);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRulePackageDeclare"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:88:1: entryRulePackageDeclare : rulePackageDeclare EOF ;
    public final void entryRulePackageDeclare() throws RecognitionException {
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:89:1: ( rulePackageDeclare EOF )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:90:1: rulePackageDeclare EOF
            {
             before(grammarAccess.getPackageDeclareRule()); 
            pushFollow(FOLLOW_rulePackageDeclare_in_entryRulePackageDeclare121);
            rulePackageDeclare();

            state._fsp--;

             after(grammarAccess.getPackageDeclareRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclare128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclare"


    // $ANTLR start "rulePackageDeclare"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:97:1: rulePackageDeclare : ( ( rule__PackageDeclare__Group__0 ) ) ;
    public final void rulePackageDeclare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:101:2: ( ( ( rule__PackageDeclare__Group__0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:102:1: ( ( rule__PackageDeclare__Group__0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:102:1: ( ( rule__PackageDeclare__Group__0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:103:1: ( rule__PackageDeclare__Group__0 )
            {
             before(grammarAccess.getPackageDeclareAccess().getGroup()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:104:1: ( rule__PackageDeclare__Group__0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:104:2: rule__PackageDeclare__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclare__Group__0_in_rulePackageDeclare154);
            rule__PackageDeclare__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclare"


    // $ANTLR start "entryRuleImportDeclare"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:116:1: entryRuleImportDeclare : ruleImportDeclare EOF ;
    public final void entryRuleImportDeclare() throws RecognitionException {
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:117:1: ( ruleImportDeclare EOF )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:118:1: ruleImportDeclare EOF
            {
             before(grammarAccess.getImportDeclareRule()); 
            pushFollow(FOLLOW_ruleImportDeclare_in_entryRuleImportDeclare181);
            ruleImportDeclare();

            state._fsp--;

             after(grammarAccess.getImportDeclareRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclare188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportDeclare"


    // $ANTLR start "ruleImportDeclare"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:125:1: ruleImportDeclare : ( ( rule__ImportDeclare__Group__0 ) ) ;
    public final void ruleImportDeclare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:129:2: ( ( ( rule__ImportDeclare__Group__0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:130:1: ( ( rule__ImportDeclare__Group__0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:130:1: ( ( rule__ImportDeclare__Group__0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:131:1: ( rule__ImportDeclare__Group__0 )
            {
             before(grammarAccess.getImportDeclareAccess().getGroup()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:132:1: ( rule__ImportDeclare__Group__0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:132:2: rule__ImportDeclare__Group__0
            {
            pushFollow(FOLLOW_rule__ImportDeclare__Group__0_in_ruleImportDeclare214);
            rule__ImportDeclare__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportDeclare"


    // $ANTLR start "entryRuleBatchDsl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:144:1: entryRuleBatchDsl : ruleBatchDsl EOF ;
    public final void entryRuleBatchDsl() throws RecognitionException {
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:145:1: ( ruleBatchDsl EOF )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:146:1: ruleBatchDsl EOF
            {
             before(grammarAccess.getBatchDslRule()); 
            pushFollow(FOLLOW_ruleBatchDsl_in_entryRuleBatchDsl241);
            ruleBatchDsl();

            state._fsp--;

             after(grammarAccess.getBatchDslRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchDsl248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBatchDsl"


    // $ANTLR start "ruleBatchDsl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:153:1: ruleBatchDsl : ( ( rule__BatchDsl__Group__0 ) ) ;
    public final void ruleBatchDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:157:2: ( ( ( rule__BatchDsl__Group__0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:158:1: ( ( rule__BatchDsl__Group__0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:158:1: ( ( rule__BatchDsl__Group__0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:159:1: ( rule__BatchDsl__Group__0 )
            {
             before(grammarAccess.getBatchDslAccess().getGroup()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:160:1: ( rule__BatchDsl__Group__0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:160:2: rule__BatchDsl__Group__0
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__0_in_ruleBatchDsl274);
            rule__BatchDsl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatchDslAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBatchDsl"


    // $ANTLR start "entryRuleBatchParameter"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:172:1: entryRuleBatchParameter : ruleBatchParameter EOF ;
    public final void entryRuleBatchParameter() throws RecognitionException {
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:173:1: ( ruleBatchParameter EOF )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:174:1: ruleBatchParameter EOF
            {
             before(grammarAccess.getBatchParameterRule()); 
            pushFollow(FOLLOW_ruleBatchParameter_in_entryRuleBatchParameter301);
            ruleBatchParameter();

            state._fsp--;

             after(grammarAccess.getBatchParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchParameter308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBatchParameter"


    // $ANTLR start "ruleBatchParameter"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:181:1: ruleBatchParameter : ( ( rule__BatchParameter__Group__0 ) ) ;
    public final void ruleBatchParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:185:2: ( ( ( rule__BatchParameter__Group__0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:186:1: ( ( rule__BatchParameter__Group__0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:186:1: ( ( rule__BatchParameter__Group__0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:187:1: ( rule__BatchParameter__Group__0 )
            {
             before(grammarAccess.getBatchParameterAccess().getGroup()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:188:1: ( rule__BatchParameter__Group__0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:188:2: rule__BatchParameter__Group__0
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__0_in_ruleBatchParameter334);
            rule__BatchParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatchParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBatchParameter"


    // $ANTLR start "entryRuleBatchStatement"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:200:1: entryRuleBatchStatement : ruleBatchStatement EOF ;
    public final void entryRuleBatchStatement() throws RecognitionException {
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:201:1: ( ruleBatchStatement EOF )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:202:1: ruleBatchStatement EOF
            {
             before(grammarAccess.getBatchStatementRule()); 
            pushFollow(FOLLOW_ruleBatchStatement_in_entryRuleBatchStatement361);
            ruleBatchStatement();

            state._fsp--;

             after(grammarAccess.getBatchStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchStatement368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBatchStatement"


    // $ANTLR start "ruleBatchStatement"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:209:1: ruleBatchStatement : ( ( rule__BatchStatement__Group__0 ) ) ;
    public final void ruleBatchStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:213:2: ( ( ( rule__BatchStatement__Group__0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:214:1: ( ( rule__BatchStatement__Group__0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:214:1: ( ( rule__BatchStatement__Group__0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:215:1: ( rule__BatchStatement__Group__0 )
            {
             before(grammarAccess.getBatchStatementAccess().getGroup()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:216:1: ( rule__BatchStatement__Group__0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:216:2: rule__BatchStatement__Group__0
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group__0_in_ruleBatchStatement394);
            rule__BatchStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatchStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBatchStatement"


    // $ANTLR start "entryRuleFQN"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:228:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:229:1: ( ruleFQN EOF )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:230:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN421);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:237:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:241:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:242:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:242:1: ( ( rule__FQN__Group__0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:243:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:244:1: ( rule__FQN__Group__0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:244:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN454);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleName"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:256:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:257:1: ( ruleName EOF )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:258:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName481);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:265:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:269:2: ( ( ( rule__Name__Alternatives ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:270:1: ( ( rule__Name__Alternatives ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:270:1: ( ( rule__Name__Alternatives ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:271:1: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:272:1: ( rule__Name__Alternatives )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:272:2: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Name__Alternatives_in_ruleName514);
            rule__Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "rule__BatchStatement__Alternatives_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:284:1: rule__BatchStatement__Alternatives_1 : ( ( ( rule__BatchStatement__NameAssignment_1_0 ) ) | ( ( rule__BatchStatement__Group_1_1__0 ) ) );
    public final void rule__BatchStatement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:288:1: ( ( ( rule__BatchStatement__NameAssignment_1_0 ) ) | ( ( rule__BatchStatement__Group_1_1__0 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:289:1: ( ( rule__BatchStatement__NameAssignment_1_0 ) )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:289:1: ( ( rule__BatchStatement__NameAssignment_1_0 ) )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:290:1: ( rule__BatchStatement__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getBatchStatementAccess().getNameAssignment_1_0()); 
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:291:1: ( rule__BatchStatement__NameAssignment_1_0 )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:291:2: rule__BatchStatement__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BatchStatement__NameAssignment_1_0_in_rule__BatchStatement__Alternatives_1550);
                    rule__BatchStatement__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBatchStatementAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:295:6: ( ( rule__BatchStatement__Group_1_1__0 ) )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:295:6: ( ( rule__BatchStatement__Group_1_1__0 ) )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:296:1: ( rule__BatchStatement__Group_1_1__0 )
                    {
                     before(grammarAccess.getBatchStatementAccess().getGroup_1_1()); 
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:297:1: ( rule__BatchStatement__Group_1_1__0 )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:297:2: rule__BatchStatement__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__BatchStatement__Group_1_1__0_in_rule__BatchStatement__Alternatives_1568);
                    rule__BatchStatement__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBatchStatementAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Alternatives_1"


    // $ANTLR start "rule__BatchStatement__Alternatives_2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:306:1: rule__BatchStatement__Alternatives_2 : ( ( ( rule__BatchStatement__SoonAssignment_2_0 ) ) | ( ( rule__BatchStatement__Group_2_1__0 ) ) );
    public final void rule__BatchStatement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:310:1: ( ( ( rule__BatchStatement__SoonAssignment_2_0 ) ) | ( ( rule__BatchStatement__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:311:1: ( ( rule__BatchStatement__SoonAssignment_2_0 ) )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:311:1: ( ( rule__BatchStatement__SoonAssignment_2_0 ) )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:312:1: ( rule__BatchStatement__SoonAssignment_2_0 )
                    {
                     before(grammarAccess.getBatchStatementAccess().getSoonAssignment_2_0()); 
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:313:1: ( rule__BatchStatement__SoonAssignment_2_0 )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:313:2: rule__BatchStatement__SoonAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BatchStatement__SoonAssignment_2_0_in_rule__BatchStatement__Alternatives_2601);
                    rule__BatchStatement__SoonAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBatchStatementAccess().getSoonAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:317:6: ( ( rule__BatchStatement__Group_2_1__0 ) )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:317:6: ( ( rule__BatchStatement__Group_2_1__0 ) )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:318:1: ( rule__BatchStatement__Group_2_1__0 )
                    {
                     before(grammarAccess.getBatchStatementAccess().getGroup_2_1()); 
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:319:1: ( rule__BatchStatement__Group_2_1__0 )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:319:2: rule__BatchStatement__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__BatchStatement__Group_2_1__0_in_rule__BatchStatement__Alternatives_2619);
                    rule__BatchStatement__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBatchStatementAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Alternatives_2"


    // $ANTLR start "rule__BatchStatement__Alternatives_3"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:328:1: rule__BatchStatement__Alternatives_3 : ( ( ';' ) | ( '.' ) );
    public final void rule__BatchStatement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:332:1: ( ( ';' ) | ( '.' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==9) ) {
                alt3=1;
            }
            else if ( (LA3_0==10) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:333:1: ( ';' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:333:1: ( ';' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:334:1: ';'
                    {
                     before(grammarAccess.getBatchStatementAccess().getSemicolonKeyword_3_0()); 
                    match(input,9,FOLLOW_9_in_rule__BatchStatement__Alternatives_3653); 
                     after(grammarAccess.getBatchStatementAccess().getSemicolonKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:341:6: ( '.' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:341:6: ( '.' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:342:1: '.'
                    {
                     before(grammarAccess.getBatchStatementAccess().getFullStopKeyword_3_1()); 
                    match(input,10,FOLLOW_10_in_rule__BatchStatement__Alternatives_3673); 
                     after(grammarAccess.getBatchStatementAccess().getFullStopKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Alternatives_3"


    // $ANTLR start "rule__Name__Alternatives"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:354:1: rule__Name__Alternatives : ( ( RULE_ID ) | ( 'batch' ) | ( 'key' ) | ( 'pattern' ) | ( 'required' ) | ( 'run' ) | ( 'as' ) | ( 'soon' ) | ( 'after' ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:358:1: ( ( RULE_ID ) | ( 'batch' ) | ( 'key' ) | ( 'pattern' ) | ( 'required' ) | ( 'run' ) | ( 'as' ) | ( 'soon' ) | ( 'after' ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 12:
                {
                alt4=3;
                }
                break;
            case 13:
                {
                alt4=4;
                }
                break;
            case 14:
                {
                alt4=5;
                }
                break;
            case 15:
                {
                alt4=6;
                }
                break;
            case 16:
                {
                alt4=7;
                }
                break;
            case 17:
                {
                alt4=8;
                }
                break;
            case 18:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:359:1: ( RULE_ID )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:359:1: ( RULE_ID )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:360:1: RULE_ID
                    {
                     before(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__Alternatives707); 
                     after(grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:365:6: ( 'batch' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:365:6: ( 'batch' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:366:1: 'batch'
                    {
                     before(grammarAccess.getNameAccess().getBatchKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__Name__Alternatives725); 
                     after(grammarAccess.getNameAccess().getBatchKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:373:6: ( 'key' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:373:6: ( 'key' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:374:1: 'key'
                    {
                     before(grammarAccess.getNameAccess().getKeyKeyword_2()); 
                    match(input,12,FOLLOW_12_in_rule__Name__Alternatives745); 
                     after(grammarAccess.getNameAccess().getKeyKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:381:6: ( 'pattern' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:381:6: ( 'pattern' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:382:1: 'pattern'
                    {
                     before(grammarAccess.getNameAccess().getPatternKeyword_3()); 
                    match(input,13,FOLLOW_13_in_rule__Name__Alternatives765); 
                     after(grammarAccess.getNameAccess().getPatternKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:389:6: ( 'required' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:389:6: ( 'required' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:390:1: 'required'
                    {
                     before(grammarAccess.getNameAccess().getRequiredKeyword_4()); 
                    match(input,14,FOLLOW_14_in_rule__Name__Alternatives785); 
                     after(grammarAccess.getNameAccess().getRequiredKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:397:6: ( 'run' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:397:6: ( 'run' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:398:1: 'run'
                    {
                     before(grammarAccess.getNameAccess().getRunKeyword_5()); 
                    match(input,15,FOLLOW_15_in_rule__Name__Alternatives805); 
                     after(grammarAccess.getNameAccess().getRunKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:405:6: ( 'as' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:405:6: ( 'as' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:406:1: 'as'
                    {
                     before(grammarAccess.getNameAccess().getAsKeyword_6()); 
                    match(input,16,FOLLOW_16_in_rule__Name__Alternatives825); 
                     after(grammarAccess.getNameAccess().getAsKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:413:6: ( 'soon' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:413:6: ( 'soon' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:414:1: 'soon'
                    {
                     before(grammarAccess.getNameAccess().getSoonKeyword_7()); 
                    match(input,17,FOLLOW_17_in_rule__Name__Alternatives845); 
                     after(grammarAccess.getNameAccess().getSoonKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:421:6: ( 'after' )
                    {
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:421:6: ( 'after' )
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:422:1: 'after'
                    {
                     before(grammarAccess.getNameAccess().getAfterKeyword_8()); 
                    match(input,18,FOLLOW_18_in_rule__Name__Alternatives865); 
                     after(grammarAccess.getNameAccess().getAfterKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Name__Alternatives"


    // $ANTLR start "rule__Script__Group__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:436:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:440:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:441:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__0897);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__1_in_rule__Script__Group__0900);
            rule__Script__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:448:1: rule__Script__Group__0__Impl : ( ( rule__Script__PackageAssignment_0 ) ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:452:1: ( ( ( rule__Script__PackageAssignment_0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:453:1: ( ( rule__Script__PackageAssignment_0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:453:1: ( ( rule__Script__PackageAssignment_0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:454:1: ( rule__Script__PackageAssignment_0 )
            {
             before(grammarAccess.getScriptAccess().getPackageAssignment_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:455:1: ( rule__Script__PackageAssignment_0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:455:2: rule__Script__PackageAssignment_0
            {
            pushFollow(FOLLOW_rule__Script__PackageAssignment_0_in_rule__Script__Group__0__Impl927);
            rule__Script__PackageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getPackageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:465:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:469:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:470:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__1957);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Script__Group__2_in_rule__Script__Group__1960);
            rule__Script__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:477:1: rule__Script__Group__1__Impl : ( ( rule__Script__ImportsAssignment_1 )* ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:481:1: ( ( ( rule__Script__ImportsAssignment_1 )* ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:482:1: ( ( rule__Script__ImportsAssignment_1 )* )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:482:1: ( ( rule__Script__ImportsAssignment_1 )* )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:483:1: ( rule__Script__ImportsAssignment_1 )*
            {
             before(grammarAccess.getScriptAccess().getImportsAssignment_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:484:1: ( rule__Script__ImportsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:484:2: rule__Script__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Script__ImportsAssignment_1_in_rule__Script__Group__1__Impl987);
            	    rule__Script__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:494:1: rule__Script__Group__2 : rule__Script__Group__2__Impl ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:498:1: ( rule__Script__Group__2__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:499:2: rule__Script__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__21018);
            rule__Script__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:505:1: rule__Script__Group__2__Impl : ( ( rule__Script__ListAssignment_2 )* ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:509:1: ( ( ( rule__Script__ListAssignment_2 )* ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:510:1: ( ( rule__Script__ListAssignment_2 )* )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:510:1: ( ( rule__Script__ListAssignment_2 )* )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:511:1: ( rule__Script__ListAssignment_2 )*
            {
             before(grammarAccess.getScriptAccess().getListAssignment_2()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:512:1: ( rule__Script__ListAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==11||LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:512:2: rule__Script__ListAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Script__ListAssignment_2_in_rule__Script__Group__2__Impl1045);
            	    rule__Script__ListAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclare__Group__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:528:1: rule__PackageDeclare__Group__0 : rule__PackageDeclare__Group__0__Impl rule__PackageDeclare__Group__1 ;
    public final void rule__PackageDeclare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:532:1: ( rule__PackageDeclare__Group__0__Impl rule__PackageDeclare__Group__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:533:2: rule__PackageDeclare__Group__0__Impl rule__PackageDeclare__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclare__Group__0__Impl_in_rule__PackageDeclare__Group__01082);
            rule__PackageDeclare__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclare__Group__1_in_rule__PackageDeclare__Group__01085);
            rule__PackageDeclare__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclare__Group__0"


    // $ANTLR start "rule__PackageDeclare__Group__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:540:1: rule__PackageDeclare__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:544:1: ( ( 'package' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:545:1: ( 'package' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:545:1: ( 'package' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:546:1: 'package'
            {
             before(grammarAccess.getPackageDeclareAccess().getPackageKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__PackageDeclare__Group__0__Impl1113); 
             after(grammarAccess.getPackageDeclareAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclare__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclare__Group__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:559:1: rule__PackageDeclare__Group__1 : rule__PackageDeclare__Group__1__Impl rule__PackageDeclare__Group__2 ;
    public final void rule__PackageDeclare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:563:1: ( rule__PackageDeclare__Group__1__Impl rule__PackageDeclare__Group__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:564:2: rule__PackageDeclare__Group__1__Impl rule__PackageDeclare__Group__2
            {
            pushFollow(FOLLOW_rule__PackageDeclare__Group__1__Impl_in_rule__PackageDeclare__Group__11144);
            rule__PackageDeclare__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclare__Group__2_in_rule__PackageDeclare__Group__11147);
            rule__PackageDeclare__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclare__Group__1"


    // $ANTLR start "rule__PackageDeclare__Group__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:571:1: rule__PackageDeclare__Group__1__Impl : ( ( rule__PackageDeclare__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:575:1: ( ( ( rule__PackageDeclare__NameAssignment_1 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:576:1: ( ( rule__PackageDeclare__NameAssignment_1 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:576:1: ( ( rule__PackageDeclare__NameAssignment_1 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:577:1: ( rule__PackageDeclare__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclareAccess().getNameAssignment_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:578:1: ( rule__PackageDeclare__NameAssignment_1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:578:2: rule__PackageDeclare__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclare__NameAssignment_1_in_rule__PackageDeclare__Group__1__Impl1174);
            rule__PackageDeclare__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclareAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclare__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclare__Group__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:588:1: rule__PackageDeclare__Group__2 : rule__PackageDeclare__Group__2__Impl ;
    public final void rule__PackageDeclare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:592:1: ( rule__PackageDeclare__Group__2__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:593:2: rule__PackageDeclare__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclare__Group__2__Impl_in_rule__PackageDeclare__Group__21204);
            rule__PackageDeclare__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclare__Group__2"


    // $ANTLR start "rule__PackageDeclare__Group__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:599:1: rule__PackageDeclare__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__PackageDeclare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:603:1: ( ( ( ';' )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:604:1: ( ( ';' )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:604:1: ( ( ';' )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:605:1: ( ';' )?
            {
             before(grammarAccess.getPackageDeclareAccess().getSemicolonKeyword_2()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:606:1: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==9) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:607:2: ';'
                    {
                    match(input,9,FOLLOW_9_in_rule__PackageDeclare__Group__2__Impl1233); 

                    }
                    break;

            }

             after(grammarAccess.getPackageDeclareAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclare__Group__2__Impl"


    // $ANTLR start "rule__ImportDeclare__Group__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:624:1: rule__ImportDeclare__Group__0 : rule__ImportDeclare__Group__0__Impl rule__ImportDeclare__Group__1 ;
    public final void rule__ImportDeclare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:628:1: ( rule__ImportDeclare__Group__0__Impl rule__ImportDeclare__Group__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:629:2: rule__ImportDeclare__Group__0__Impl rule__ImportDeclare__Group__1
            {
            pushFollow(FOLLOW_rule__ImportDeclare__Group__0__Impl_in_rule__ImportDeclare__Group__01272);
            rule__ImportDeclare__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclare__Group__1_in_rule__ImportDeclare__Group__01275);
            rule__ImportDeclare__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group__0"


    // $ANTLR start "rule__ImportDeclare__Group__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:636:1: rule__ImportDeclare__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportDeclare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:640:1: ( ( 'import' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:641:1: ( 'import' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:641:1: ( 'import' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:642:1: 'import'
            {
             before(grammarAccess.getImportDeclareAccess().getImportKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__ImportDeclare__Group__0__Impl1303); 
             after(grammarAccess.getImportDeclareAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group__0__Impl"


    // $ANTLR start "rule__ImportDeclare__Group__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:655:1: rule__ImportDeclare__Group__1 : rule__ImportDeclare__Group__1__Impl rule__ImportDeclare__Group__2 ;
    public final void rule__ImportDeclare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:659:1: ( rule__ImportDeclare__Group__1__Impl rule__ImportDeclare__Group__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:660:2: rule__ImportDeclare__Group__1__Impl rule__ImportDeclare__Group__2
            {
            pushFollow(FOLLOW_rule__ImportDeclare__Group__1__Impl_in_rule__ImportDeclare__Group__11334);
            rule__ImportDeclare__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclare__Group__2_in_rule__ImportDeclare__Group__11337);
            rule__ImportDeclare__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group__1"


    // $ANTLR start "rule__ImportDeclare__Group__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:667:1: rule__ImportDeclare__Group__1__Impl : ( ( rule__ImportDeclare__NameAssignment_1 ) ) ;
    public final void rule__ImportDeclare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:671:1: ( ( ( rule__ImportDeclare__NameAssignment_1 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:672:1: ( ( rule__ImportDeclare__NameAssignment_1 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:672:1: ( ( rule__ImportDeclare__NameAssignment_1 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:673:1: ( rule__ImportDeclare__NameAssignment_1 )
            {
             before(grammarAccess.getImportDeclareAccess().getNameAssignment_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:674:1: ( rule__ImportDeclare__NameAssignment_1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:674:2: rule__ImportDeclare__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportDeclare__NameAssignment_1_in_rule__ImportDeclare__Group__1__Impl1364);
            rule__ImportDeclare__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclareAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group__1__Impl"


    // $ANTLR start "rule__ImportDeclare__Group__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:684:1: rule__ImportDeclare__Group__2 : rule__ImportDeclare__Group__2__Impl rule__ImportDeclare__Group__3 ;
    public final void rule__ImportDeclare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:688:1: ( rule__ImportDeclare__Group__2__Impl rule__ImportDeclare__Group__3 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:689:2: rule__ImportDeclare__Group__2__Impl rule__ImportDeclare__Group__3
            {
            pushFollow(FOLLOW_rule__ImportDeclare__Group__2__Impl_in_rule__ImportDeclare__Group__21394);
            rule__ImportDeclare__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclare__Group__3_in_rule__ImportDeclare__Group__21397);
            rule__ImportDeclare__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group__2"


    // $ANTLR start "rule__ImportDeclare__Group__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:696:1: rule__ImportDeclare__Group__2__Impl : ( ( rule__ImportDeclare__Group_2__0 )? ) ;
    public final void rule__ImportDeclare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:700:1: ( ( ( rule__ImportDeclare__Group_2__0 )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:701:1: ( ( rule__ImportDeclare__Group_2__0 )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:701:1: ( ( rule__ImportDeclare__Group_2__0 )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:702:1: ( rule__ImportDeclare__Group_2__0 )?
            {
             before(grammarAccess.getImportDeclareAccess().getGroup_2()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:703:1: ( rule__ImportDeclare__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==10) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:703:2: rule__ImportDeclare__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ImportDeclare__Group_2__0_in_rule__ImportDeclare__Group__2__Impl1424);
                    rule__ImportDeclare__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportDeclareAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group__2__Impl"


    // $ANTLR start "rule__ImportDeclare__Group__3"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:713:1: rule__ImportDeclare__Group__3 : rule__ImportDeclare__Group__3__Impl ;
    public final void rule__ImportDeclare__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:717:1: ( rule__ImportDeclare__Group__3__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:718:2: rule__ImportDeclare__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ImportDeclare__Group__3__Impl_in_rule__ImportDeclare__Group__31455);
            rule__ImportDeclare__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group__3"


    // $ANTLR start "rule__ImportDeclare__Group__3__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:724:1: rule__ImportDeclare__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__ImportDeclare__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:728:1: ( ( ( ';' )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:729:1: ( ( ';' )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:729:1: ( ( ';' )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:730:1: ( ';' )?
            {
             before(grammarAccess.getImportDeclareAccess().getSemicolonKeyword_3()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:731:1: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==9) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:732:2: ';'
                    {
                    match(input,9,FOLLOW_9_in_rule__ImportDeclare__Group__3__Impl1484); 

                    }
                    break;

            }

             after(grammarAccess.getImportDeclareAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group__3__Impl"


    // $ANTLR start "rule__ImportDeclare__Group_2__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:751:1: rule__ImportDeclare__Group_2__0 : rule__ImportDeclare__Group_2__0__Impl rule__ImportDeclare__Group_2__1 ;
    public final void rule__ImportDeclare__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:755:1: ( rule__ImportDeclare__Group_2__0__Impl rule__ImportDeclare__Group_2__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:756:2: rule__ImportDeclare__Group_2__0__Impl rule__ImportDeclare__Group_2__1
            {
            pushFollow(FOLLOW_rule__ImportDeclare__Group_2__0__Impl_in_rule__ImportDeclare__Group_2__01525);
            rule__ImportDeclare__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportDeclare__Group_2__1_in_rule__ImportDeclare__Group_2__01528);
            rule__ImportDeclare__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group_2__0"


    // $ANTLR start "rule__ImportDeclare__Group_2__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:763:1: rule__ImportDeclare__Group_2__0__Impl : ( '.' ) ;
    public final void rule__ImportDeclare__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:767:1: ( ( '.' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:768:1: ( '.' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:768:1: ( '.' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:769:1: '.'
            {
             before(grammarAccess.getImportDeclareAccess().getFullStopKeyword_2_0()); 
            match(input,10,FOLLOW_10_in_rule__ImportDeclare__Group_2__0__Impl1556); 
             after(grammarAccess.getImportDeclareAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group_2__0__Impl"


    // $ANTLR start "rule__ImportDeclare__Group_2__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:782:1: rule__ImportDeclare__Group_2__1 : rule__ImportDeclare__Group_2__1__Impl ;
    public final void rule__ImportDeclare__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:786:1: ( rule__ImportDeclare__Group_2__1__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:787:2: rule__ImportDeclare__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportDeclare__Group_2__1__Impl_in_rule__ImportDeclare__Group_2__11587);
            rule__ImportDeclare__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group_2__1"


    // $ANTLR start "rule__ImportDeclare__Group_2__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:793:1: rule__ImportDeclare__Group_2__1__Impl : ( ( rule__ImportDeclare__WildcardAssignment_2_1 ) ) ;
    public final void rule__ImportDeclare__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:797:1: ( ( ( rule__ImportDeclare__WildcardAssignment_2_1 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:798:1: ( ( rule__ImportDeclare__WildcardAssignment_2_1 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:798:1: ( ( rule__ImportDeclare__WildcardAssignment_2_1 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:799:1: ( rule__ImportDeclare__WildcardAssignment_2_1 )
            {
             before(grammarAccess.getImportDeclareAccess().getWildcardAssignment_2_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:800:1: ( rule__ImportDeclare__WildcardAssignment_2_1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:800:2: rule__ImportDeclare__WildcardAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ImportDeclare__WildcardAssignment_2_1_in_rule__ImportDeclare__Group_2__1__Impl1614);
            rule__ImportDeclare__WildcardAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclareAccess().getWildcardAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__Group_2__1__Impl"


    // $ANTLR start "rule__BatchDsl__Group__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:814:1: rule__BatchDsl__Group__0 : rule__BatchDsl__Group__0__Impl rule__BatchDsl__Group__1 ;
    public final void rule__BatchDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:818:1: ( rule__BatchDsl__Group__0__Impl rule__BatchDsl__Group__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:819:2: rule__BatchDsl__Group__0__Impl rule__BatchDsl__Group__1
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__0__Impl_in_rule__BatchDsl__Group__01648);
            rule__BatchDsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchDsl__Group__1_in_rule__BatchDsl__Group__01651);
            rule__BatchDsl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__0"


    // $ANTLR start "rule__BatchDsl__Group__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:826:1: rule__BatchDsl__Group__0__Impl : ( ( rule__BatchDsl__CommentAssignment_0 )? ) ;
    public final void rule__BatchDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:830:1: ( ( ( rule__BatchDsl__CommentAssignment_0 )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:831:1: ( ( rule__BatchDsl__CommentAssignment_0 )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:831:1: ( ( rule__BatchDsl__CommentAssignment_0 )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:832:1: ( rule__BatchDsl__CommentAssignment_0 )?
            {
             before(grammarAccess.getBatchDslAccess().getCommentAssignment_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:833:1: ( rule__BatchDsl__CommentAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:833:2: rule__BatchDsl__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BatchDsl__CommentAssignment_0_in_rule__BatchDsl__Group__0__Impl1678);
                    rule__BatchDsl__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBatchDslAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__0__Impl"


    // $ANTLR start "rule__BatchDsl__Group__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:843:1: rule__BatchDsl__Group__1 : rule__BatchDsl__Group__1__Impl rule__BatchDsl__Group__2 ;
    public final void rule__BatchDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:847:1: ( rule__BatchDsl__Group__1__Impl rule__BatchDsl__Group__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:848:2: rule__BatchDsl__Group__1__Impl rule__BatchDsl__Group__2
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__1__Impl_in_rule__BatchDsl__Group__11709);
            rule__BatchDsl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchDsl__Group__2_in_rule__BatchDsl__Group__11712);
            rule__BatchDsl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__1"


    // $ANTLR start "rule__BatchDsl__Group__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:855:1: rule__BatchDsl__Group__1__Impl : ( ( rule__BatchDsl__ParamsAssignment_1 )* ) ;
    public final void rule__BatchDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:859:1: ( ( ( rule__BatchDsl__ParamsAssignment_1 )* ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:860:1: ( ( rule__BatchDsl__ParamsAssignment_1 )* )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:860:1: ( ( rule__BatchDsl__ParamsAssignment_1 )* )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:861:1: ( rule__BatchDsl__ParamsAssignment_1 )*
            {
             before(grammarAccess.getBatchDslAccess().getParamsAssignment_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:862:1: ( rule__BatchDsl__ParamsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:862:2: rule__BatchDsl__ParamsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__BatchDsl__ParamsAssignment_1_in_rule__BatchDsl__Group__1__Impl1739);
            	    rule__BatchDsl__ParamsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBatchDslAccess().getParamsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__1__Impl"


    // $ANTLR start "rule__BatchDsl__Group__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:872:1: rule__BatchDsl__Group__2 : rule__BatchDsl__Group__2__Impl rule__BatchDsl__Group__3 ;
    public final void rule__BatchDsl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:876:1: ( rule__BatchDsl__Group__2__Impl rule__BatchDsl__Group__3 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:877:2: rule__BatchDsl__Group__2__Impl rule__BatchDsl__Group__3
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__2__Impl_in_rule__BatchDsl__Group__21770);
            rule__BatchDsl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchDsl__Group__3_in_rule__BatchDsl__Group__21773);
            rule__BatchDsl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__2"


    // $ANTLR start "rule__BatchDsl__Group__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:884:1: rule__BatchDsl__Group__2__Impl : ( 'batch' ) ;
    public final void rule__BatchDsl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:888:1: ( ( 'batch' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:889:1: ( 'batch' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:889:1: ( 'batch' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:890:1: 'batch'
            {
             before(grammarAccess.getBatchDslAccess().getBatchKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__BatchDsl__Group__2__Impl1801); 
             after(grammarAccess.getBatchDslAccess().getBatchKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__2__Impl"


    // $ANTLR start "rule__BatchDsl__Group__3"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:903:1: rule__BatchDsl__Group__3 : rule__BatchDsl__Group__3__Impl rule__BatchDsl__Group__4 ;
    public final void rule__BatchDsl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:907:1: ( rule__BatchDsl__Group__3__Impl rule__BatchDsl__Group__4 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:908:2: rule__BatchDsl__Group__3__Impl rule__BatchDsl__Group__4
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__3__Impl_in_rule__BatchDsl__Group__31832);
            rule__BatchDsl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchDsl__Group__4_in_rule__BatchDsl__Group__31835);
            rule__BatchDsl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__3"


    // $ANTLR start "rule__BatchDsl__Group__3__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:915:1: rule__BatchDsl__Group__3__Impl : ( ( rule__BatchDsl__NameAssignment_3 ) ) ;
    public final void rule__BatchDsl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:919:1: ( ( ( rule__BatchDsl__NameAssignment_3 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:920:1: ( ( rule__BatchDsl__NameAssignment_3 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:920:1: ( ( rule__BatchDsl__NameAssignment_3 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:921:1: ( rule__BatchDsl__NameAssignment_3 )
            {
             before(grammarAccess.getBatchDslAccess().getNameAssignment_3()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:922:1: ( rule__BatchDsl__NameAssignment_3 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:922:2: rule__BatchDsl__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__BatchDsl__NameAssignment_3_in_rule__BatchDsl__Group__3__Impl1862);
            rule__BatchDsl__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBatchDslAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__3__Impl"


    // $ANTLR start "rule__BatchDsl__Group__4"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:932:1: rule__BatchDsl__Group__4 : rule__BatchDsl__Group__4__Impl rule__BatchDsl__Group__5 ;
    public final void rule__BatchDsl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:936:1: ( rule__BatchDsl__Group__4__Impl rule__BatchDsl__Group__5 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:937:2: rule__BatchDsl__Group__4__Impl rule__BatchDsl__Group__5
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__4__Impl_in_rule__BatchDsl__Group__41892);
            rule__BatchDsl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchDsl__Group__5_in_rule__BatchDsl__Group__41895);
            rule__BatchDsl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__4"


    // $ANTLR start "rule__BatchDsl__Group__4__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:944:1: rule__BatchDsl__Group__4__Impl : ( '{' ) ;
    public final void rule__BatchDsl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:948:1: ( ( '{' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:949:1: ( '{' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:949:1: ( '{' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:950:1: '{'
            {
             before(grammarAccess.getBatchDslAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__BatchDsl__Group__4__Impl1923); 
             after(grammarAccess.getBatchDslAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__4__Impl"


    // $ANTLR start "rule__BatchDsl__Group__5"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:963:1: rule__BatchDsl__Group__5 : rule__BatchDsl__Group__5__Impl rule__BatchDsl__Group__6 ;
    public final void rule__BatchDsl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:967:1: ( rule__BatchDsl__Group__5__Impl rule__BatchDsl__Group__6 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:968:2: rule__BatchDsl__Group__5__Impl rule__BatchDsl__Group__6
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__5__Impl_in_rule__BatchDsl__Group__51954);
            rule__BatchDsl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchDsl__Group__6_in_rule__BatchDsl__Group__51957);
            rule__BatchDsl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__5"


    // $ANTLR start "rule__BatchDsl__Group__5__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:975:1: rule__BatchDsl__Group__5__Impl : ( ( rule__BatchDsl__StatementsAssignment_5 )* ) ;
    public final void rule__BatchDsl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:979:1: ( ( ( rule__BatchDsl__StatementsAssignment_5 )* ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:980:1: ( ( rule__BatchDsl__StatementsAssignment_5 )* )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:980:1: ( ( rule__BatchDsl__StatementsAssignment_5 )* )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:981:1: ( rule__BatchDsl__StatementsAssignment_5 )*
            {
             before(grammarAccess.getBatchDslAccess().getStatementsAssignment_5()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:982:1: ( rule__BatchDsl__StatementsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:982:2: rule__BatchDsl__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__BatchDsl__StatementsAssignment_5_in_rule__BatchDsl__Group__5__Impl1984);
            	    rule__BatchDsl__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBatchDslAccess().getStatementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__5__Impl"


    // $ANTLR start "rule__BatchDsl__Group__6"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:992:1: rule__BatchDsl__Group__6 : rule__BatchDsl__Group__6__Impl rule__BatchDsl__Group__7 ;
    public final void rule__BatchDsl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:996:1: ( rule__BatchDsl__Group__6__Impl rule__BatchDsl__Group__7 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:997:2: rule__BatchDsl__Group__6__Impl rule__BatchDsl__Group__7
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__6__Impl_in_rule__BatchDsl__Group__62015);
            rule__BatchDsl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchDsl__Group__7_in_rule__BatchDsl__Group__62018);
            rule__BatchDsl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__6"


    // $ANTLR start "rule__BatchDsl__Group__6__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1004:1: rule__BatchDsl__Group__6__Impl : ( '}' ) ;
    public final void rule__BatchDsl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1008:1: ( ( '}' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1009:1: ( '}' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1009:1: ( '}' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1010:1: '}'
            {
             before(grammarAccess.getBatchDslAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__BatchDsl__Group__6__Impl2046); 
             after(grammarAccess.getBatchDslAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__6__Impl"


    // $ANTLR start "rule__BatchDsl__Group__7"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1023:1: rule__BatchDsl__Group__7 : rule__BatchDsl__Group__7__Impl ;
    public final void rule__BatchDsl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1027:1: ( rule__BatchDsl__Group__7__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1028:2: rule__BatchDsl__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__BatchDsl__Group__7__Impl_in_rule__BatchDsl__Group__72077);
            rule__BatchDsl__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__7"


    // $ANTLR start "rule__BatchDsl__Group__7__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1034:1: rule__BatchDsl__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__BatchDsl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1038:1: ( ( ( ';' )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1039:1: ( ( ';' )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1039:1: ( ( ';' )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1040:1: ( ';' )?
            {
             before(grammarAccess.getBatchDslAccess().getSemicolonKeyword_7()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1041:1: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==9) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1042:2: ';'
                    {
                    match(input,9,FOLLOW_9_in_rule__BatchDsl__Group__7__Impl2106); 

                    }
                    break;

            }

             after(grammarAccess.getBatchDslAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__Group__7__Impl"


    // $ANTLR start "rule__BatchParameter__Group__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1069:1: rule__BatchParameter__Group__0 : rule__BatchParameter__Group__0__Impl rule__BatchParameter__Group__1 ;
    public final void rule__BatchParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1073:1: ( rule__BatchParameter__Group__0__Impl rule__BatchParameter__Group__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1074:2: rule__BatchParameter__Group__0__Impl rule__BatchParameter__Group__1
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__0__Impl_in_rule__BatchParameter__Group__02155);
            rule__BatchParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group__1_in_rule__BatchParameter__Group__02158);
            rule__BatchParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__0"


    // $ANTLR start "rule__BatchParameter__Group__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1081:1: rule__BatchParameter__Group__0__Impl : ( '@param' ) ;
    public final void rule__BatchParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1085:1: ( ( '@param' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1086:1: ( '@param' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1086:1: ( '@param' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1087:1: '@param'
            {
             before(grammarAccess.getBatchParameterAccess().getParamKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__BatchParameter__Group__0__Impl2186); 
             after(grammarAccess.getBatchParameterAccess().getParamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__0__Impl"


    // $ANTLR start "rule__BatchParameter__Group__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1100:1: rule__BatchParameter__Group__1 : rule__BatchParameter__Group__1__Impl rule__BatchParameter__Group__2 ;
    public final void rule__BatchParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1104:1: ( rule__BatchParameter__Group__1__Impl rule__BatchParameter__Group__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1105:2: rule__BatchParameter__Group__1__Impl rule__BatchParameter__Group__2
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__1__Impl_in_rule__BatchParameter__Group__12217);
            rule__BatchParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group__2_in_rule__BatchParameter__Group__12220);
            rule__BatchParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__1"


    // $ANTLR start "rule__BatchParameter__Group__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1112:1: rule__BatchParameter__Group__1__Impl : ( '(' ) ;
    public final void rule__BatchParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1116:1: ( ( '(' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1117:1: ( '(' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1117:1: ( '(' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1118:1: '('
            {
             before(grammarAccess.getBatchParameterAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__BatchParameter__Group__1__Impl2248); 
             after(grammarAccess.getBatchParameterAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__1__Impl"


    // $ANTLR start "rule__BatchParameter__Group__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1131:1: rule__BatchParameter__Group__2 : rule__BatchParameter__Group__2__Impl rule__BatchParameter__Group__3 ;
    public final void rule__BatchParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1135:1: ( rule__BatchParameter__Group__2__Impl rule__BatchParameter__Group__3 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1136:2: rule__BatchParameter__Group__2__Impl rule__BatchParameter__Group__3
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__2__Impl_in_rule__BatchParameter__Group__22279);
            rule__BatchParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group__3_in_rule__BatchParameter__Group__22282);
            rule__BatchParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__2"


    // $ANTLR start "rule__BatchParameter__Group__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1143:1: rule__BatchParameter__Group__2__Impl : ( ( rule__BatchParameter__CommentAssignment_2 )? ) ;
    public final void rule__BatchParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1147:1: ( ( ( rule__BatchParameter__CommentAssignment_2 )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1148:1: ( ( rule__BatchParameter__CommentAssignment_2 )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1148:1: ( ( rule__BatchParameter__CommentAssignment_2 )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1149:1: ( rule__BatchParameter__CommentAssignment_2 )?
            {
             before(grammarAccess.getBatchParameterAccess().getCommentAssignment_2()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1150:1: ( rule__BatchParameter__CommentAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1150:2: rule__BatchParameter__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BatchParameter__CommentAssignment_2_in_rule__BatchParameter__Group__2__Impl2309);
                    rule__BatchParameter__CommentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBatchParameterAccess().getCommentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__2__Impl"


    // $ANTLR start "rule__BatchParameter__Group__3"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1160:1: rule__BatchParameter__Group__3 : rule__BatchParameter__Group__3__Impl rule__BatchParameter__Group__4 ;
    public final void rule__BatchParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1164:1: ( rule__BatchParameter__Group__3__Impl rule__BatchParameter__Group__4 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1165:2: rule__BatchParameter__Group__3__Impl rule__BatchParameter__Group__4
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__3__Impl_in_rule__BatchParameter__Group__32340);
            rule__BatchParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group__4_in_rule__BatchParameter__Group__32343);
            rule__BatchParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__3"


    // $ANTLR start "rule__BatchParameter__Group__3__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1172:1: rule__BatchParameter__Group__3__Impl : ( ( rule__BatchParameter__Group_3__0 )? ) ;
    public final void rule__BatchParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1176:1: ( ( ( rule__BatchParameter__Group_3__0 )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1177:1: ( ( rule__BatchParameter__Group_3__0 )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1177:1: ( ( rule__BatchParameter__Group_3__0 )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1178:1: ( rule__BatchParameter__Group_3__0 )?
            {
             before(grammarAccess.getBatchParameterAccess().getGroup_3()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1179:1: ( rule__BatchParameter__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==26) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1179:2: rule__BatchParameter__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__BatchParameter__Group_3__0_in_rule__BatchParameter__Group__3__Impl2370);
                    rule__BatchParameter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBatchParameterAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__3__Impl"


    // $ANTLR start "rule__BatchParameter__Group__4"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1189:1: rule__BatchParameter__Group__4 : rule__BatchParameter__Group__4__Impl rule__BatchParameter__Group__5 ;
    public final void rule__BatchParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1193:1: ( rule__BatchParameter__Group__4__Impl rule__BatchParameter__Group__5 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1194:2: rule__BatchParameter__Group__4__Impl rule__BatchParameter__Group__5
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__4__Impl_in_rule__BatchParameter__Group__42401);
            rule__BatchParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group__5_in_rule__BatchParameter__Group__42404);
            rule__BatchParameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__4"


    // $ANTLR start "rule__BatchParameter__Group__4__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1201:1: rule__BatchParameter__Group__4__Impl : ( ( rule__BatchParameter__NameAssignment_4 ) ) ;
    public final void rule__BatchParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1205:1: ( ( ( rule__BatchParameter__NameAssignment_4 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1206:1: ( ( rule__BatchParameter__NameAssignment_4 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1206:1: ( ( rule__BatchParameter__NameAssignment_4 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1207:1: ( rule__BatchParameter__NameAssignment_4 )
            {
             before(grammarAccess.getBatchParameterAccess().getNameAssignment_4()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1208:1: ( rule__BatchParameter__NameAssignment_4 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1208:2: rule__BatchParameter__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__BatchParameter__NameAssignment_4_in_rule__BatchParameter__Group__4__Impl2431);
            rule__BatchParameter__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBatchParameterAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__4__Impl"


    // $ANTLR start "rule__BatchParameter__Group__5"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1218:1: rule__BatchParameter__Group__5 : rule__BatchParameter__Group__5__Impl rule__BatchParameter__Group__6 ;
    public final void rule__BatchParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1222:1: ( rule__BatchParameter__Group__5__Impl rule__BatchParameter__Group__6 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1223:2: rule__BatchParameter__Group__5__Impl rule__BatchParameter__Group__6
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__5__Impl_in_rule__BatchParameter__Group__52461);
            rule__BatchParameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group__6_in_rule__BatchParameter__Group__52464);
            rule__BatchParameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__5"


    // $ANTLR start "rule__BatchParameter__Group__5__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1230:1: rule__BatchParameter__Group__5__Impl : ( ( rule__BatchParameter__Group_5__0 )? ) ;
    public final void rule__BatchParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1234:1: ( ( ( rule__BatchParameter__Group_5__0 )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1235:1: ( ( rule__BatchParameter__Group_5__0 )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1235:1: ( ( rule__BatchParameter__Group_5__0 )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1236:1: ( rule__BatchParameter__Group_5__0 )?
            {
             before(grammarAccess.getBatchParameterAccess().getGroup_5()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1237:1: ( rule__BatchParameter__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==13) ) {
                    alt16=1;
                }
            }
            else if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1237:2: rule__BatchParameter__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__BatchParameter__Group_5__0_in_rule__BatchParameter__Group__5__Impl2491);
                    rule__BatchParameter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBatchParameterAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__5__Impl"


    // $ANTLR start "rule__BatchParameter__Group__6"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1247:1: rule__BatchParameter__Group__6 : rule__BatchParameter__Group__6__Impl rule__BatchParameter__Group__7 ;
    public final void rule__BatchParameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1251:1: ( rule__BatchParameter__Group__6__Impl rule__BatchParameter__Group__7 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1252:2: rule__BatchParameter__Group__6__Impl rule__BatchParameter__Group__7
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__6__Impl_in_rule__BatchParameter__Group__62522);
            rule__BatchParameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group__7_in_rule__BatchParameter__Group__62525);
            rule__BatchParameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__6"


    // $ANTLR start "rule__BatchParameter__Group__6__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1259:1: rule__BatchParameter__Group__6__Impl : ( ( rule__BatchParameter__Group_6__0 )? ) ;
    public final void rule__BatchParameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1263:1: ( ( ( rule__BatchParameter__Group_6__0 )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1264:1: ( ( rule__BatchParameter__Group_6__0 )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1264:1: ( ( rule__BatchParameter__Group_6__0 )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1265:1: ( rule__BatchParameter__Group_6__0 )?
            {
             before(grammarAccess.getBatchParameterAccess().getGroup_6()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1266:1: ( rule__BatchParameter__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==14||LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1266:2: rule__BatchParameter__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__BatchParameter__Group_6__0_in_rule__BatchParameter__Group__6__Impl2552);
                    rule__BatchParameter__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBatchParameterAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__6__Impl"


    // $ANTLR start "rule__BatchParameter__Group__7"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1276:1: rule__BatchParameter__Group__7 : rule__BatchParameter__Group__7__Impl ;
    public final void rule__BatchParameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1280:1: ( rule__BatchParameter__Group__7__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1281:2: rule__BatchParameter__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group__7__Impl_in_rule__BatchParameter__Group__72583);
            rule__BatchParameter__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__7"


    // $ANTLR start "rule__BatchParameter__Group__7__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1287:1: rule__BatchParameter__Group__7__Impl : ( ')' ) ;
    public final void rule__BatchParameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1291:1: ( ( ')' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1292:1: ( ')' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1292:1: ( ')' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1293:1: ')'
            {
             before(grammarAccess.getBatchParameterAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__BatchParameter__Group__7__Impl2611); 
             after(grammarAccess.getBatchParameterAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group__7__Impl"


    // $ANTLR start "rule__BatchParameter__Group_3__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1322:1: rule__BatchParameter__Group_3__0 : rule__BatchParameter__Group_3__0__Impl rule__BatchParameter__Group_3__1 ;
    public final void rule__BatchParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1326:1: ( rule__BatchParameter__Group_3__0__Impl rule__BatchParameter__Group_3__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1327:2: rule__BatchParameter__Group_3__0__Impl rule__BatchParameter__Group_3__1
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group_3__0__Impl_in_rule__BatchParameter__Group_3__02658);
            rule__BatchParameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group_3__1_in_rule__BatchParameter__Group_3__02661);
            rule__BatchParameter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_3__0"


    // $ANTLR start "rule__BatchParameter__Group_3__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1334:1: rule__BatchParameter__Group_3__0__Impl : ( 'key' ) ;
    public final void rule__BatchParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1338:1: ( ( 'key' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1339:1: ( 'key' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1339:1: ( 'key' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1340:1: 'key'
            {
             before(grammarAccess.getBatchParameterAccess().getKeyKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__BatchParameter__Group_3__0__Impl2689); 
             after(grammarAccess.getBatchParameterAccess().getKeyKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_3__0__Impl"


    // $ANTLR start "rule__BatchParameter__Group_3__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1353:1: rule__BatchParameter__Group_3__1 : rule__BatchParameter__Group_3__1__Impl ;
    public final void rule__BatchParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1357:1: ( rule__BatchParameter__Group_3__1__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1358:2: rule__BatchParameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group_3__1__Impl_in_rule__BatchParameter__Group_3__12720);
            rule__BatchParameter__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_3__1"


    // $ANTLR start "rule__BatchParameter__Group_3__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1364:1: rule__BatchParameter__Group_3__1__Impl : ( '=' ) ;
    public final void rule__BatchParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1368:1: ( ( '=' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1369:1: ( '=' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1369:1: ( '=' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1370:1: '='
            {
             before(grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_3_1()); 
            match(input,26,FOLLOW_26_in_rule__BatchParameter__Group_3__1__Impl2748); 
             after(grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_3__1__Impl"


    // $ANTLR start "rule__BatchParameter__Group_5__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1387:1: rule__BatchParameter__Group_5__0 : rule__BatchParameter__Group_5__0__Impl rule__BatchParameter__Group_5__1 ;
    public final void rule__BatchParameter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1391:1: ( rule__BatchParameter__Group_5__0__Impl rule__BatchParameter__Group_5__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1392:2: rule__BatchParameter__Group_5__0__Impl rule__BatchParameter__Group_5__1
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group_5__0__Impl_in_rule__BatchParameter__Group_5__02783);
            rule__BatchParameter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group_5__1_in_rule__BatchParameter__Group_5__02786);
            rule__BatchParameter__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_5__0"


    // $ANTLR start "rule__BatchParameter__Group_5__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1399:1: rule__BatchParameter__Group_5__0__Impl : ( ( ',' )? ) ;
    public final void rule__BatchParameter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1403:1: ( ( ( ',' )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1404:1: ( ( ',' )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1404:1: ( ( ',' )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1405:1: ( ',' )?
            {
             before(grammarAccess.getBatchParameterAccess().getCommaKeyword_5_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1406:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1407:2: ','
                    {
                    match(input,27,FOLLOW_27_in_rule__BatchParameter__Group_5__0__Impl2815); 

                    }
                    break;

            }

             after(grammarAccess.getBatchParameterAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_5__0__Impl"


    // $ANTLR start "rule__BatchParameter__Group_5__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1418:1: rule__BatchParameter__Group_5__1 : rule__BatchParameter__Group_5__1__Impl rule__BatchParameter__Group_5__2 ;
    public final void rule__BatchParameter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1422:1: ( rule__BatchParameter__Group_5__1__Impl rule__BatchParameter__Group_5__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1423:2: rule__BatchParameter__Group_5__1__Impl rule__BatchParameter__Group_5__2
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group_5__1__Impl_in_rule__BatchParameter__Group_5__12848);
            rule__BatchParameter__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group_5__2_in_rule__BatchParameter__Group_5__12851);
            rule__BatchParameter__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_5__1"


    // $ANTLR start "rule__BatchParameter__Group_5__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1430:1: rule__BatchParameter__Group_5__1__Impl : ( 'pattern' ) ;
    public final void rule__BatchParameter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1434:1: ( ( 'pattern' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1435:1: ( 'pattern' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1435:1: ( 'pattern' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1436:1: 'pattern'
            {
             before(grammarAccess.getBatchParameterAccess().getPatternKeyword_5_1()); 
            match(input,13,FOLLOW_13_in_rule__BatchParameter__Group_5__1__Impl2879); 
             after(grammarAccess.getBatchParameterAccess().getPatternKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_5__1__Impl"


    // $ANTLR start "rule__BatchParameter__Group_5__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1449:1: rule__BatchParameter__Group_5__2 : rule__BatchParameter__Group_5__2__Impl rule__BatchParameter__Group_5__3 ;
    public final void rule__BatchParameter__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1453:1: ( rule__BatchParameter__Group_5__2__Impl rule__BatchParameter__Group_5__3 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1454:2: rule__BatchParameter__Group_5__2__Impl rule__BatchParameter__Group_5__3
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group_5__2__Impl_in_rule__BatchParameter__Group_5__22910);
            rule__BatchParameter__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group_5__3_in_rule__BatchParameter__Group_5__22913);
            rule__BatchParameter__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_5__2"


    // $ANTLR start "rule__BatchParameter__Group_5__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1461:1: rule__BatchParameter__Group_5__2__Impl : ( '=' ) ;
    public final void rule__BatchParameter__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1465:1: ( ( '=' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1466:1: ( '=' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1466:1: ( '=' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1467:1: '='
            {
             before(grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_5_2()); 
            match(input,26,FOLLOW_26_in_rule__BatchParameter__Group_5__2__Impl2941); 
             after(grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_5__2__Impl"


    // $ANTLR start "rule__BatchParameter__Group_5__3"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1480:1: rule__BatchParameter__Group_5__3 : rule__BatchParameter__Group_5__3__Impl ;
    public final void rule__BatchParameter__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1484:1: ( rule__BatchParameter__Group_5__3__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1485:2: rule__BatchParameter__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group_5__3__Impl_in_rule__BatchParameter__Group_5__32972);
            rule__BatchParameter__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_5__3"


    // $ANTLR start "rule__BatchParameter__Group_5__3__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1491:1: rule__BatchParameter__Group_5__3__Impl : ( ( rule__BatchParameter__PatternAssignment_5_3 ) ) ;
    public final void rule__BatchParameter__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1495:1: ( ( ( rule__BatchParameter__PatternAssignment_5_3 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1496:1: ( ( rule__BatchParameter__PatternAssignment_5_3 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1496:1: ( ( rule__BatchParameter__PatternAssignment_5_3 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1497:1: ( rule__BatchParameter__PatternAssignment_5_3 )
            {
             before(grammarAccess.getBatchParameterAccess().getPatternAssignment_5_3()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1498:1: ( rule__BatchParameter__PatternAssignment_5_3 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1498:2: rule__BatchParameter__PatternAssignment_5_3
            {
            pushFollow(FOLLOW_rule__BatchParameter__PatternAssignment_5_3_in_rule__BatchParameter__Group_5__3__Impl2999);
            rule__BatchParameter__PatternAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getBatchParameterAccess().getPatternAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_5__3__Impl"


    // $ANTLR start "rule__BatchParameter__Group_6__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1516:1: rule__BatchParameter__Group_6__0 : rule__BatchParameter__Group_6__0__Impl rule__BatchParameter__Group_6__1 ;
    public final void rule__BatchParameter__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1520:1: ( rule__BatchParameter__Group_6__0__Impl rule__BatchParameter__Group_6__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1521:2: rule__BatchParameter__Group_6__0__Impl rule__BatchParameter__Group_6__1
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group_6__0__Impl_in_rule__BatchParameter__Group_6__03037);
            rule__BatchParameter__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchParameter__Group_6__1_in_rule__BatchParameter__Group_6__03040);
            rule__BatchParameter__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_6__0"


    // $ANTLR start "rule__BatchParameter__Group_6__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1528:1: rule__BatchParameter__Group_6__0__Impl : ( ( ',' )? ) ;
    public final void rule__BatchParameter__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1532:1: ( ( ( ',' )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1533:1: ( ( ',' )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1533:1: ( ( ',' )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1534:1: ( ',' )?
            {
             before(grammarAccess.getBatchParameterAccess().getCommaKeyword_6_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1535:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1536:2: ','
                    {
                    match(input,27,FOLLOW_27_in_rule__BatchParameter__Group_6__0__Impl3069); 

                    }
                    break;

            }

             after(grammarAccess.getBatchParameterAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_6__0__Impl"


    // $ANTLR start "rule__BatchParameter__Group_6__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1547:1: rule__BatchParameter__Group_6__1 : rule__BatchParameter__Group_6__1__Impl ;
    public final void rule__BatchParameter__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1551:1: ( rule__BatchParameter__Group_6__1__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1552:2: rule__BatchParameter__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__BatchParameter__Group_6__1__Impl_in_rule__BatchParameter__Group_6__13102);
            rule__BatchParameter__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_6__1"


    // $ANTLR start "rule__BatchParameter__Group_6__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1558:1: rule__BatchParameter__Group_6__1__Impl : ( ( rule__BatchParameter__RequiredAssignment_6_1 ) ) ;
    public final void rule__BatchParameter__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1562:1: ( ( ( rule__BatchParameter__RequiredAssignment_6_1 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1563:1: ( ( rule__BatchParameter__RequiredAssignment_6_1 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1563:1: ( ( rule__BatchParameter__RequiredAssignment_6_1 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1564:1: ( rule__BatchParameter__RequiredAssignment_6_1 )
            {
             before(grammarAccess.getBatchParameterAccess().getRequiredAssignment_6_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1565:1: ( rule__BatchParameter__RequiredAssignment_6_1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1565:2: rule__BatchParameter__RequiredAssignment_6_1
            {
            pushFollow(FOLLOW_rule__BatchParameter__RequiredAssignment_6_1_in_rule__BatchParameter__Group_6__1__Impl3129);
            rule__BatchParameter__RequiredAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBatchParameterAccess().getRequiredAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__Group_6__1__Impl"


    // $ANTLR start "rule__BatchStatement__Group__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1579:1: rule__BatchStatement__Group__0 : rule__BatchStatement__Group__0__Impl rule__BatchStatement__Group__1 ;
    public final void rule__BatchStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1583:1: ( rule__BatchStatement__Group__0__Impl rule__BatchStatement__Group__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1584:2: rule__BatchStatement__Group__0__Impl rule__BatchStatement__Group__1
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group__0__Impl_in_rule__BatchStatement__Group__03163);
            rule__BatchStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchStatement__Group__1_in_rule__BatchStatement__Group__03166);
            rule__BatchStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group__0"


    // $ANTLR start "rule__BatchStatement__Group__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1591:1: rule__BatchStatement__Group__0__Impl : ( 'run' ) ;
    public final void rule__BatchStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1595:1: ( ( 'run' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1596:1: ( 'run' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1596:1: ( 'run' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1597:1: 'run'
            {
             before(grammarAccess.getBatchStatementAccess().getRunKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__BatchStatement__Group__0__Impl3194); 
             after(grammarAccess.getBatchStatementAccess().getRunKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group__0__Impl"


    // $ANTLR start "rule__BatchStatement__Group__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1610:1: rule__BatchStatement__Group__1 : rule__BatchStatement__Group__1__Impl rule__BatchStatement__Group__2 ;
    public final void rule__BatchStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1614:1: ( rule__BatchStatement__Group__1__Impl rule__BatchStatement__Group__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1615:2: rule__BatchStatement__Group__1__Impl rule__BatchStatement__Group__2
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group__1__Impl_in_rule__BatchStatement__Group__13225);
            rule__BatchStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchStatement__Group__2_in_rule__BatchStatement__Group__13228);
            rule__BatchStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group__1"


    // $ANTLR start "rule__BatchStatement__Group__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1622:1: rule__BatchStatement__Group__1__Impl : ( ( rule__BatchStatement__Alternatives_1 ) ) ;
    public final void rule__BatchStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1626:1: ( ( ( rule__BatchStatement__Alternatives_1 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1627:1: ( ( rule__BatchStatement__Alternatives_1 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1627:1: ( ( rule__BatchStatement__Alternatives_1 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1628:1: ( rule__BatchStatement__Alternatives_1 )
            {
             before(grammarAccess.getBatchStatementAccess().getAlternatives_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1629:1: ( rule__BatchStatement__Alternatives_1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1629:2: rule__BatchStatement__Alternatives_1
            {
            pushFollow(FOLLOW_rule__BatchStatement__Alternatives_1_in_rule__BatchStatement__Group__1__Impl3255);
            rule__BatchStatement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBatchStatementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group__1__Impl"


    // $ANTLR start "rule__BatchStatement__Group__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1639:1: rule__BatchStatement__Group__2 : rule__BatchStatement__Group__2__Impl rule__BatchStatement__Group__3 ;
    public final void rule__BatchStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1643:1: ( rule__BatchStatement__Group__2__Impl rule__BatchStatement__Group__3 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1644:2: rule__BatchStatement__Group__2__Impl rule__BatchStatement__Group__3
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group__2__Impl_in_rule__BatchStatement__Group__23285);
            rule__BatchStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchStatement__Group__3_in_rule__BatchStatement__Group__23288);
            rule__BatchStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group__2"


    // $ANTLR start "rule__BatchStatement__Group__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1651:1: rule__BatchStatement__Group__2__Impl : ( ( rule__BatchStatement__Alternatives_2 ) ) ;
    public final void rule__BatchStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1655:1: ( ( ( rule__BatchStatement__Alternatives_2 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1656:1: ( ( rule__BatchStatement__Alternatives_2 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1656:1: ( ( rule__BatchStatement__Alternatives_2 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1657:1: ( rule__BatchStatement__Alternatives_2 )
            {
             before(grammarAccess.getBatchStatementAccess().getAlternatives_2()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1658:1: ( rule__BatchStatement__Alternatives_2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1658:2: rule__BatchStatement__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BatchStatement__Alternatives_2_in_rule__BatchStatement__Group__2__Impl3315);
            rule__BatchStatement__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getBatchStatementAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group__2__Impl"


    // $ANTLR start "rule__BatchStatement__Group__3"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1668:1: rule__BatchStatement__Group__3 : rule__BatchStatement__Group__3__Impl ;
    public final void rule__BatchStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1672:1: ( rule__BatchStatement__Group__3__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1673:2: rule__BatchStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group__3__Impl_in_rule__BatchStatement__Group__33345);
            rule__BatchStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group__3"


    // $ANTLR start "rule__BatchStatement__Group__3__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1679:1: rule__BatchStatement__Group__3__Impl : ( ( rule__BatchStatement__Alternatives_3 )? ) ;
    public final void rule__BatchStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1683:1: ( ( ( rule__BatchStatement__Alternatives_3 )? ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1684:1: ( ( rule__BatchStatement__Alternatives_3 )? )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1684:1: ( ( rule__BatchStatement__Alternatives_3 )? )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1685:1: ( rule__BatchStatement__Alternatives_3 )?
            {
             before(grammarAccess.getBatchStatementAccess().getAlternatives_3()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1686:1: ( rule__BatchStatement__Alternatives_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=9 && LA20_0<=10)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1686:2: rule__BatchStatement__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__BatchStatement__Alternatives_3_in_rule__BatchStatement__Group__3__Impl3372);
                    rule__BatchStatement__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBatchStatementAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group__3__Impl"


    // $ANTLR start "rule__BatchStatement__Group_1_1__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1704:1: rule__BatchStatement__Group_1_1__0 : rule__BatchStatement__Group_1_1__0__Impl rule__BatchStatement__Group_1_1__1 ;
    public final void rule__BatchStatement__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1708:1: ( rule__BatchStatement__Group_1_1__0__Impl rule__BatchStatement__Group_1_1__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1709:2: rule__BatchStatement__Group_1_1__0__Impl rule__BatchStatement__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group_1_1__0__Impl_in_rule__BatchStatement__Group_1_1__03411);
            rule__BatchStatement__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchStatement__Group_1_1__1_in_rule__BatchStatement__Group_1_1__03414);
            rule__BatchStatement__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_1_1__0"


    // $ANTLR start "rule__BatchStatement__Group_1_1__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1716:1: rule__BatchStatement__Group_1_1__0__Impl : ( ( rule__BatchStatement__JobNameAssignment_1_1_0 ) ) ;
    public final void rule__BatchStatement__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1720:1: ( ( ( rule__BatchStatement__JobNameAssignment_1_1_0 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1721:1: ( ( rule__BatchStatement__JobNameAssignment_1_1_0 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1721:1: ( ( rule__BatchStatement__JobNameAssignment_1_1_0 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1722:1: ( rule__BatchStatement__JobNameAssignment_1_1_0 )
            {
             before(grammarAccess.getBatchStatementAccess().getJobNameAssignment_1_1_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1723:1: ( rule__BatchStatement__JobNameAssignment_1_1_0 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1723:2: rule__BatchStatement__JobNameAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__BatchStatement__JobNameAssignment_1_1_0_in_rule__BatchStatement__Group_1_1__0__Impl3441);
            rule__BatchStatement__JobNameAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBatchStatementAccess().getJobNameAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_1_1__0__Impl"


    // $ANTLR start "rule__BatchStatement__Group_1_1__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1733:1: rule__BatchStatement__Group_1_1__1 : rule__BatchStatement__Group_1_1__1__Impl rule__BatchStatement__Group_1_1__2 ;
    public final void rule__BatchStatement__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1737:1: ( rule__BatchStatement__Group_1_1__1__Impl rule__BatchStatement__Group_1_1__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1738:2: rule__BatchStatement__Group_1_1__1__Impl rule__BatchStatement__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group_1_1__1__Impl_in_rule__BatchStatement__Group_1_1__13471);
            rule__BatchStatement__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchStatement__Group_1_1__2_in_rule__BatchStatement__Group_1_1__13474);
            rule__BatchStatement__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_1_1__1"


    // $ANTLR start "rule__BatchStatement__Group_1_1__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1745:1: rule__BatchStatement__Group_1_1__1__Impl : ( 'as' ) ;
    public final void rule__BatchStatement__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1749:1: ( ( 'as' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1750:1: ( 'as' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1750:1: ( 'as' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1751:1: 'as'
            {
             before(grammarAccess.getBatchStatementAccess().getAsKeyword_1_1_1()); 
            match(input,16,FOLLOW_16_in_rule__BatchStatement__Group_1_1__1__Impl3502); 
             after(grammarAccess.getBatchStatementAccess().getAsKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_1_1__1__Impl"


    // $ANTLR start "rule__BatchStatement__Group_1_1__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1764:1: rule__BatchStatement__Group_1_1__2 : rule__BatchStatement__Group_1_1__2__Impl ;
    public final void rule__BatchStatement__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1768:1: ( rule__BatchStatement__Group_1_1__2__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1769:2: rule__BatchStatement__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group_1_1__2__Impl_in_rule__BatchStatement__Group_1_1__23533);
            rule__BatchStatement__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_1_1__2"


    // $ANTLR start "rule__BatchStatement__Group_1_1__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1775:1: rule__BatchStatement__Group_1_1__2__Impl : ( ( rule__BatchStatement__NameAssignment_1_1_2 ) ) ;
    public final void rule__BatchStatement__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1779:1: ( ( ( rule__BatchStatement__NameAssignment_1_1_2 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1780:1: ( ( rule__BatchStatement__NameAssignment_1_1_2 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1780:1: ( ( rule__BatchStatement__NameAssignment_1_1_2 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1781:1: ( rule__BatchStatement__NameAssignment_1_1_2 )
            {
             before(grammarAccess.getBatchStatementAccess().getNameAssignment_1_1_2()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1782:1: ( rule__BatchStatement__NameAssignment_1_1_2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1782:2: rule__BatchStatement__NameAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__BatchStatement__NameAssignment_1_1_2_in_rule__BatchStatement__Group_1_1__2__Impl3560);
            rule__BatchStatement__NameAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBatchStatementAccess().getNameAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_1_1__2__Impl"


    // $ANTLR start "rule__BatchStatement__Group_2_1__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1798:1: rule__BatchStatement__Group_2_1__0 : rule__BatchStatement__Group_2_1__0__Impl rule__BatchStatement__Group_2_1__1 ;
    public final void rule__BatchStatement__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1802:1: ( rule__BatchStatement__Group_2_1__0__Impl rule__BatchStatement__Group_2_1__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1803:2: rule__BatchStatement__Group_2_1__0__Impl rule__BatchStatement__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group_2_1__0__Impl_in_rule__BatchStatement__Group_2_1__03596);
            rule__BatchStatement__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchStatement__Group_2_1__1_in_rule__BatchStatement__Group_2_1__03599);
            rule__BatchStatement__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1__0"


    // $ANTLR start "rule__BatchStatement__Group_2_1__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1810:1: rule__BatchStatement__Group_2_1__0__Impl : ( 'after' ) ;
    public final void rule__BatchStatement__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1814:1: ( ( 'after' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1815:1: ( 'after' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1815:1: ( 'after' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1816:1: 'after'
            {
             before(grammarAccess.getBatchStatementAccess().getAfterKeyword_2_1_0()); 
            match(input,18,FOLLOW_18_in_rule__BatchStatement__Group_2_1__0__Impl3627); 
             after(grammarAccess.getBatchStatementAccess().getAfterKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1__0__Impl"


    // $ANTLR start "rule__BatchStatement__Group_2_1__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1829:1: rule__BatchStatement__Group_2_1__1 : rule__BatchStatement__Group_2_1__1__Impl rule__BatchStatement__Group_2_1__2 ;
    public final void rule__BatchStatement__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1833:1: ( rule__BatchStatement__Group_2_1__1__Impl rule__BatchStatement__Group_2_1__2 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1834:2: rule__BatchStatement__Group_2_1__1__Impl rule__BatchStatement__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group_2_1__1__Impl_in_rule__BatchStatement__Group_2_1__13658);
            rule__BatchStatement__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchStatement__Group_2_1__2_in_rule__BatchStatement__Group_2_1__13661);
            rule__BatchStatement__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1__1"


    // $ANTLR start "rule__BatchStatement__Group_2_1__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1841:1: rule__BatchStatement__Group_2_1__1__Impl : ( ( rule__BatchStatement__AfterAssignment_2_1_1 ) ) ;
    public final void rule__BatchStatement__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1845:1: ( ( ( rule__BatchStatement__AfterAssignment_2_1_1 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1846:1: ( ( rule__BatchStatement__AfterAssignment_2_1_1 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1846:1: ( ( rule__BatchStatement__AfterAssignment_2_1_1 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1847:1: ( rule__BatchStatement__AfterAssignment_2_1_1 )
            {
             before(grammarAccess.getBatchStatementAccess().getAfterAssignment_2_1_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1848:1: ( rule__BatchStatement__AfterAssignment_2_1_1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1848:2: rule__BatchStatement__AfterAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__BatchStatement__AfterAssignment_2_1_1_in_rule__BatchStatement__Group_2_1__1__Impl3688);
            rule__BatchStatement__AfterAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBatchStatementAccess().getAfterAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1__1__Impl"


    // $ANTLR start "rule__BatchStatement__Group_2_1__2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1858:1: rule__BatchStatement__Group_2_1__2 : rule__BatchStatement__Group_2_1__2__Impl ;
    public final void rule__BatchStatement__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1862:1: ( rule__BatchStatement__Group_2_1__2__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1863:2: rule__BatchStatement__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group_2_1__2__Impl_in_rule__BatchStatement__Group_2_1__23718);
            rule__BatchStatement__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1__2"


    // $ANTLR start "rule__BatchStatement__Group_2_1__2__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1869:1: rule__BatchStatement__Group_2_1__2__Impl : ( ( rule__BatchStatement__Group_2_1_2__0 )* ) ;
    public final void rule__BatchStatement__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1873:1: ( ( ( rule__BatchStatement__Group_2_1_2__0 )* ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1874:1: ( ( rule__BatchStatement__Group_2_1_2__0 )* )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1874:1: ( ( rule__BatchStatement__Group_2_1_2__0 )* )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1875:1: ( rule__BatchStatement__Group_2_1_2__0 )*
            {
             before(grammarAccess.getBatchStatementAccess().getGroup_2_1_2()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1876:1: ( rule__BatchStatement__Group_2_1_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1876:2: rule__BatchStatement__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BatchStatement__Group_2_1_2__0_in_rule__BatchStatement__Group_2_1__2__Impl3745);
            	    rule__BatchStatement__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBatchStatementAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1__2__Impl"


    // $ANTLR start "rule__BatchStatement__Group_2_1_2__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1892:1: rule__BatchStatement__Group_2_1_2__0 : rule__BatchStatement__Group_2_1_2__0__Impl rule__BatchStatement__Group_2_1_2__1 ;
    public final void rule__BatchStatement__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1896:1: ( rule__BatchStatement__Group_2_1_2__0__Impl rule__BatchStatement__Group_2_1_2__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1897:2: rule__BatchStatement__Group_2_1_2__0__Impl rule__BatchStatement__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group_2_1_2__0__Impl_in_rule__BatchStatement__Group_2_1_2__03782);
            rule__BatchStatement__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BatchStatement__Group_2_1_2__1_in_rule__BatchStatement__Group_2_1_2__03785);
            rule__BatchStatement__Group_2_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1_2__0"


    // $ANTLR start "rule__BatchStatement__Group_2_1_2__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1904:1: rule__BatchStatement__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__BatchStatement__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1908:1: ( ( ',' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1909:1: ( ',' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1909:1: ( ',' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1910:1: ','
            {
             before(grammarAccess.getBatchStatementAccess().getCommaKeyword_2_1_2_0()); 
            match(input,27,FOLLOW_27_in_rule__BatchStatement__Group_2_1_2__0__Impl3813); 
             after(grammarAccess.getBatchStatementAccess().getCommaKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__BatchStatement__Group_2_1_2__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1923:1: rule__BatchStatement__Group_2_1_2__1 : rule__BatchStatement__Group_2_1_2__1__Impl ;
    public final void rule__BatchStatement__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1927:1: ( rule__BatchStatement__Group_2_1_2__1__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1928:2: rule__BatchStatement__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BatchStatement__Group_2_1_2__1__Impl_in_rule__BatchStatement__Group_2_1_2__13844);
            rule__BatchStatement__Group_2_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1_2__1"


    // $ANTLR start "rule__BatchStatement__Group_2_1_2__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1934:1: rule__BatchStatement__Group_2_1_2__1__Impl : ( ( rule__BatchStatement__AfterAssignment_2_1_2_1 ) ) ;
    public final void rule__BatchStatement__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1938:1: ( ( ( rule__BatchStatement__AfterAssignment_2_1_2_1 ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1939:1: ( ( rule__BatchStatement__AfterAssignment_2_1_2_1 ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1939:1: ( ( rule__BatchStatement__AfterAssignment_2_1_2_1 ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1940:1: ( rule__BatchStatement__AfterAssignment_2_1_2_1 )
            {
             before(grammarAccess.getBatchStatementAccess().getAfterAssignment_2_1_2_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1941:1: ( rule__BatchStatement__AfterAssignment_2_1_2_1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1941:2: rule__BatchStatement__AfterAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__BatchStatement__AfterAssignment_2_1_2_1_in_rule__BatchStatement__Group_2_1_2__1__Impl3871);
            rule__BatchStatement__AfterAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBatchStatementAccess().getAfterAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1955:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1959:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1960:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__03905);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__03908);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1967:1: rule__FQN__Group__0__Impl : ( ruleName ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1971:1: ( ( ruleName ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1972:1: ( ruleName )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1972:1: ( ruleName )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1973:1: ruleName
            {
             before(grammarAccess.getFQNAccess().getNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__FQN__Group__0__Impl3935);
            ruleName();

            state._fsp--;

             after(grammarAccess.getFQNAccess().getNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1984:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1988:1: ( rule__FQN__Group__1__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1989:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__13964);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1995:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:1999:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2000:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2000:1: ( ( rule__FQN__Group_1__0 )* )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2001:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2002:1: ( rule__FQN__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==10) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==RULE_ID||(LA22_2>=11 && LA22_2<=18)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2002:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl3991);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2016:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2020:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2021:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04026);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04029);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2028:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2032:1: ( ( '.' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2033:1: ( '.' )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2033:1: ( '.' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2034:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,10,FOLLOW_10_in_rule__FQN__Group_1__0__Impl4057); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2047:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2051:1: ( rule__FQN__Group_1__1__Impl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2052:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14088);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2058:1: rule__FQN__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2062:1: ( ( ruleName ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2063:1: ( ruleName )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2063:1: ( ruleName )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2064:1: ruleName
            {
             before(grammarAccess.getFQNAccess().getNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__FQN__Group_1__1__Impl4115);
            ruleName();

            state._fsp--;

             after(grammarAccess.getFQNAccess().getNameParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Script__PackageAssignment_0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2080:1: rule__Script__PackageAssignment_0 : ( rulePackageDeclare ) ;
    public final void rule__Script__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2084:1: ( ( rulePackageDeclare ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2085:1: ( rulePackageDeclare )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2085:1: ( rulePackageDeclare )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2086:1: rulePackageDeclare
            {
             before(grammarAccess.getScriptAccess().getPackagePackageDeclareParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackageDeclare_in_rule__Script__PackageAssignment_04153);
            rulePackageDeclare();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getPackagePackageDeclareParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__PackageAssignment_0"


    // $ANTLR start "rule__Script__ImportsAssignment_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2095:1: rule__Script__ImportsAssignment_1 : ( ruleImportDeclare ) ;
    public final void rule__Script__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2099:1: ( ( ruleImportDeclare ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2100:1: ( ruleImportDeclare )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2100:1: ( ruleImportDeclare )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2101:1: ruleImportDeclare
            {
             before(grammarAccess.getScriptAccess().getImportsImportDeclareParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportDeclare_in_rule__Script__ImportsAssignment_14184);
            ruleImportDeclare();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getImportsImportDeclareParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ImportsAssignment_1"


    // $ANTLR start "rule__Script__ListAssignment_2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2110:1: rule__Script__ListAssignment_2 : ( ruleBatchDsl ) ;
    public final void rule__Script__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2114:1: ( ( ruleBatchDsl ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2115:1: ( ruleBatchDsl )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2115:1: ( ruleBatchDsl )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2116:1: ruleBatchDsl
            {
             before(grammarAccess.getScriptAccess().getListBatchDslParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBatchDsl_in_rule__Script__ListAssignment_24215);
            ruleBatchDsl();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getListBatchDslParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ListAssignment_2"


    // $ANTLR start "rule__PackageDeclare__NameAssignment_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2125:1: rule__PackageDeclare__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__PackageDeclare__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2129:1: ( ( ruleFQN ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2130:1: ( ruleFQN )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2130:1: ( ruleFQN )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2131:1: ruleFQN
            {
             before(grammarAccess.getPackageDeclareAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__PackageDeclare__NameAssignment_14246);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageDeclareAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclare__NameAssignment_1"


    // $ANTLR start "rule__ImportDeclare__NameAssignment_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2140:1: rule__ImportDeclare__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__ImportDeclare__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2144:1: ( ( ruleFQN ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2145:1: ( ruleFQN )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2145:1: ( ruleFQN )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2146:1: ruleFQN
            {
             before(grammarAccess.getImportDeclareAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__ImportDeclare__NameAssignment_14277);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getImportDeclareAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__NameAssignment_1"


    // $ANTLR start "rule__ImportDeclare__WildcardAssignment_2_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2155:1: rule__ImportDeclare__WildcardAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__ImportDeclare__WildcardAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2159:1: ( ( ( '*' ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2160:1: ( ( '*' ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2160:1: ( ( '*' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2161:1: ( '*' )
            {
             before(grammarAccess.getImportDeclareAccess().getWildcardAsteriskKeyword_2_1_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2162:1: ( '*' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2163:1: '*'
            {
             before(grammarAccess.getImportDeclareAccess().getWildcardAsteriskKeyword_2_1_0()); 
            match(input,28,FOLLOW_28_in_rule__ImportDeclare__WildcardAssignment_2_14313); 
             after(grammarAccess.getImportDeclareAccess().getWildcardAsteriskKeyword_2_1_0()); 

            }

             after(grammarAccess.getImportDeclareAccess().getWildcardAsteriskKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDeclare__WildcardAssignment_2_1"


    // $ANTLR start "rule__BatchDsl__CommentAssignment_0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2178:1: rule__BatchDsl__CommentAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BatchDsl__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2182:1: ( ( RULE_STRING ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2183:1: ( RULE_STRING )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2183:1: ( RULE_STRING )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2184:1: RULE_STRING
            {
             before(grammarAccess.getBatchDslAccess().getCommentSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BatchDsl__CommentAssignment_04352); 
             after(grammarAccess.getBatchDslAccess().getCommentSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__CommentAssignment_0"


    // $ANTLR start "rule__BatchDsl__ParamsAssignment_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2193:1: rule__BatchDsl__ParamsAssignment_1 : ( ruleBatchParameter ) ;
    public final void rule__BatchDsl__ParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2197:1: ( ( ruleBatchParameter ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2198:1: ( ruleBatchParameter )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2198:1: ( ruleBatchParameter )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2199:1: ruleBatchParameter
            {
             before(grammarAccess.getBatchDslAccess().getParamsBatchParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBatchParameter_in_rule__BatchDsl__ParamsAssignment_14383);
            ruleBatchParameter();

            state._fsp--;

             after(grammarAccess.getBatchDslAccess().getParamsBatchParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__ParamsAssignment_1"


    // $ANTLR start "rule__BatchDsl__NameAssignment_3"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2208:1: rule__BatchDsl__NameAssignment_3 : ( ruleName ) ;
    public final void rule__BatchDsl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2212:1: ( ( ruleName ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2213:1: ( ruleName )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2213:1: ( ruleName )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2214:1: ruleName
            {
             before(grammarAccess.getBatchDslAccess().getNameNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__BatchDsl__NameAssignment_34414);
            ruleName();

            state._fsp--;

             after(grammarAccess.getBatchDslAccess().getNameNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__NameAssignment_3"


    // $ANTLR start "rule__BatchDsl__StatementsAssignment_5"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2223:1: rule__BatchDsl__StatementsAssignment_5 : ( ruleBatchStatement ) ;
    public final void rule__BatchDsl__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2227:1: ( ( ruleBatchStatement ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2228:1: ( ruleBatchStatement )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2228:1: ( ruleBatchStatement )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2229:1: ruleBatchStatement
            {
             before(grammarAccess.getBatchDslAccess().getStatementsBatchStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBatchStatement_in_rule__BatchDsl__StatementsAssignment_54445);
            ruleBatchStatement();

            state._fsp--;

             after(grammarAccess.getBatchDslAccess().getStatementsBatchStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchDsl__StatementsAssignment_5"


    // $ANTLR start "rule__BatchParameter__CommentAssignment_2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2238:1: rule__BatchParameter__CommentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__BatchParameter__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2242:1: ( ( RULE_STRING ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2243:1: ( RULE_STRING )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2243:1: ( RULE_STRING )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2244:1: RULE_STRING
            {
             before(grammarAccess.getBatchParameterAccess().getCommentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BatchParameter__CommentAssignment_24476); 
             after(grammarAccess.getBatchParameterAccess().getCommentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__CommentAssignment_2"


    // $ANTLR start "rule__BatchParameter__NameAssignment_4"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2253:1: rule__BatchParameter__NameAssignment_4 : ( ruleName ) ;
    public final void rule__BatchParameter__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2257:1: ( ( ruleName ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2258:1: ( ruleName )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2258:1: ( ruleName )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2259:1: ruleName
            {
             before(grammarAccess.getBatchParameterAccess().getNameNameParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__BatchParameter__NameAssignment_44507);
            ruleName();

            state._fsp--;

             after(grammarAccess.getBatchParameterAccess().getNameNameParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__NameAssignment_4"


    // $ANTLR start "rule__BatchParameter__PatternAssignment_5_3"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2268:1: rule__BatchParameter__PatternAssignment_5_3 : ( RULE_STRING ) ;
    public final void rule__BatchParameter__PatternAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2272:1: ( ( RULE_STRING ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2273:1: ( RULE_STRING )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2273:1: ( RULE_STRING )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2274:1: RULE_STRING
            {
             before(grammarAccess.getBatchParameterAccess().getPatternSTRINGTerminalRuleCall_5_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BatchParameter__PatternAssignment_5_34538); 
             after(grammarAccess.getBatchParameterAccess().getPatternSTRINGTerminalRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__PatternAssignment_5_3"


    // $ANTLR start "rule__BatchParameter__RequiredAssignment_6_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2283:1: rule__BatchParameter__RequiredAssignment_6_1 : ( ( 'required' ) ) ;
    public final void rule__BatchParameter__RequiredAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2287:1: ( ( ( 'required' ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2288:1: ( ( 'required' ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2288:1: ( ( 'required' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2289:1: ( 'required' )
            {
             before(grammarAccess.getBatchParameterAccess().getRequiredRequiredKeyword_6_1_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2290:1: ( 'required' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2291:1: 'required'
            {
             before(grammarAccess.getBatchParameterAccess().getRequiredRequiredKeyword_6_1_0()); 
            match(input,14,FOLLOW_14_in_rule__BatchParameter__RequiredAssignment_6_14574); 
             after(grammarAccess.getBatchParameterAccess().getRequiredRequiredKeyword_6_1_0()); 

            }

             after(grammarAccess.getBatchParameterAccess().getRequiredRequiredKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchParameter__RequiredAssignment_6_1"


    // $ANTLR start "rule__BatchStatement__NameAssignment_1_0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2306:1: rule__BatchStatement__NameAssignment_1_0 : ( ruleFQN ) ;
    public final void rule__BatchStatement__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2310:1: ( ( ruleFQN ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2311:1: ( ruleFQN )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2311:1: ( ruleFQN )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2312:1: ruleFQN
            {
             before(grammarAccess.getBatchStatementAccess().getNameFQNParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__BatchStatement__NameAssignment_1_04613);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBatchStatementAccess().getNameFQNParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__NameAssignment_1_0"


    // $ANTLR start "rule__BatchStatement__JobNameAssignment_1_1_0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2321:1: rule__BatchStatement__JobNameAssignment_1_1_0 : ( ruleFQN ) ;
    public final void rule__BatchStatement__JobNameAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2325:1: ( ( ruleFQN ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2326:1: ( ruleFQN )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2326:1: ( ruleFQN )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2327:1: ruleFQN
            {
             before(grammarAccess.getBatchStatementAccess().getJobNameFQNParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__BatchStatement__JobNameAssignment_1_1_04644);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBatchStatementAccess().getJobNameFQNParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__JobNameAssignment_1_1_0"


    // $ANTLR start "rule__BatchStatement__NameAssignment_1_1_2"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2336:1: rule__BatchStatement__NameAssignment_1_1_2 : ( ruleName ) ;
    public final void rule__BatchStatement__NameAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2340:1: ( ( ruleName ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2341:1: ( ruleName )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2341:1: ( ruleName )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2342:1: ruleName
            {
             before(grammarAccess.getBatchStatementAccess().getNameNameParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__BatchStatement__NameAssignment_1_1_24675);
            ruleName();

            state._fsp--;

             after(grammarAccess.getBatchStatementAccess().getNameNameParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__NameAssignment_1_1_2"


    // $ANTLR start "rule__BatchStatement__SoonAssignment_2_0"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2351:1: rule__BatchStatement__SoonAssignment_2_0 : ( ( 'soon' ) ) ;
    public final void rule__BatchStatement__SoonAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2355:1: ( ( ( 'soon' ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2356:1: ( ( 'soon' ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2356:1: ( ( 'soon' ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2357:1: ( 'soon' )
            {
             before(grammarAccess.getBatchStatementAccess().getSoonSoonKeyword_2_0_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2358:1: ( 'soon' )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2359:1: 'soon'
            {
             before(grammarAccess.getBatchStatementAccess().getSoonSoonKeyword_2_0_0()); 
            match(input,17,FOLLOW_17_in_rule__BatchStatement__SoonAssignment_2_04711); 
             after(grammarAccess.getBatchStatementAccess().getSoonSoonKeyword_2_0_0()); 

            }

             after(grammarAccess.getBatchStatementAccess().getSoonSoonKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__SoonAssignment_2_0"


    // $ANTLR start "rule__BatchStatement__AfterAssignment_2_1_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2374:1: rule__BatchStatement__AfterAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__BatchStatement__AfterAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2378:1: ( ( ( RULE_ID ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2379:1: ( ( RULE_ID ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2379:1: ( ( RULE_ID ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2380:1: ( RULE_ID )
            {
             before(grammarAccess.getBatchStatementAccess().getAfterBatchStatementCrossReference_2_1_1_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2381:1: ( RULE_ID )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2382:1: RULE_ID
            {
             before(grammarAccess.getBatchStatementAccess().getAfterBatchStatementIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BatchStatement__AfterAssignment_2_1_14754); 
             after(grammarAccess.getBatchStatementAccess().getAfterBatchStatementIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getBatchStatementAccess().getAfterBatchStatementCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__AfterAssignment_2_1_1"


    // $ANTLR start "rule__BatchStatement__AfterAssignment_2_1_2_1"
    // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2393:1: rule__BatchStatement__AfterAssignment_2_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__BatchStatement__AfterAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2397:1: ( ( ( RULE_ID ) ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2398:1: ( ( RULE_ID ) )
            {
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2398:1: ( ( RULE_ID ) )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2399:1: ( RULE_ID )
            {
             before(grammarAccess.getBatchStatementAccess().getAfterBatchStatementCrossReference_2_1_2_1_0()); 
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2400:1: ( RULE_ID )
            // ../afw_batch_dsl.ui/src-gen/jp/hishidama/xtext/afw/batch_dsl/ui/contentassist/antlr/internal/InternalBatchDsl.g:2401:1: RULE_ID
            {
             before(grammarAccess.getBatchStatementAccess().getAfterBatchStatementIDTerminalRuleCall_2_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BatchStatement__AfterAssignment_2_1_2_14793); 
             after(grammarAccess.getBatchStatementAccess().getAfterBatchStatementIDTerminalRuleCall_2_1_2_1_0_1()); 

            }

             after(grammarAccess.getBatchStatementAccess().getAfterBatchStatementCrossReference_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchStatement__AfterAssignment_2_1_2_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\26\uffff";
    static final String DFA1_eofS =
        "\26\uffff";
    static final String DFA1_minS =
        "\1\4\11\12\1\4\2\uffff\11\12";
    static final String DFA1_maxS =
        "\13\22\2\uffff\11\22";
    static final String DFA1_acceptS =
        "\13\uffff\1\2\1\1\11\uffff";
    static final String DFA1_specialS =
        "\26\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\6\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\15\6\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25",
            "",
            "",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14",
            "\1\12\5\uffff\1\13\2\14"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "284:1: rule__BatchStatement__Alternatives_1 : ( ( ( rule__BatchStatement__NameAssignment_1_0 ) ) | ( ( rule__BatchStatement__Group_1_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0_in_ruleScript94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclare_in_entryRulePackageDeclare121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclare128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclare__Group__0_in_rulePackageDeclare154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclare_in_entryRuleImportDeclare181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclare188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group__0_in_ruleImportDeclare214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchDsl_in_entryRuleBatchDsl241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchDsl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__0_in_ruleBatchDsl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchParameter_in_entryRuleBatchParameter301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchParameter308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__0_in_ruleBatchParameter334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchStatement_in_entryRuleBatchStatement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchStatement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group__0_in_ruleBatchStatement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Alternatives_in_ruleName514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__NameAssignment_1_0_in_rule__BatchStatement__Alternatives_1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_1_1__0_in_rule__BatchStatement__Alternatives_1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__SoonAssignment_2_0_in_rule__BatchStatement__Alternatives_2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1__0_in_rule__BatchStatement__Alternatives_2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__BatchStatement__Alternatives_3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__BatchStatement__Alternatives_3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__Alternatives707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Name__Alternatives725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Name__Alternatives745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Name__Alternatives765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Name__Alternatives785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Name__Alternatives805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Name__Alternatives825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Name__Alternatives845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Name__Alternatives865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__0__Impl_in_rule__Script__Group__0897 = new BitSet(new long[]{0x0000000000900820L});
    public static final BitSet FOLLOW_rule__Script__Group__1_in_rule__Script__Group__0900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__PackageAssignment_0_in_rule__Script__Group__0__Impl927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__Group__1__Impl_in_rule__Script__Group__1957 = new BitSet(new long[]{0x0000000000900820L});
    public static final BitSet FOLLOW_rule__Script__Group__2_in_rule__Script__Group__1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__ImportsAssignment_1_in_rule__Script__Group__1__Impl987 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Script__Group__2__Impl_in_rule__Script__Group__21018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__ListAssignment_2_in_rule__Script__Group__2__Impl1045 = new BitSet(new long[]{0x0000000000800822L});
    public static final BitSet FOLLOW_rule__PackageDeclare__Group__0__Impl_in_rule__PackageDeclare__Group__01082 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_rule__PackageDeclare__Group__1_in_rule__PackageDeclare__Group__01085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PackageDeclare__Group__0__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclare__Group__1__Impl_in_rule__PackageDeclare__Group__11144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PackageDeclare__Group__2_in_rule__PackageDeclare__Group__11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclare__NameAssignment_1_in_rule__PackageDeclare__Group__1__Impl1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclare__Group__2__Impl_in_rule__PackageDeclare__Group__21204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__PackageDeclare__Group__2__Impl1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group__0__Impl_in_rule__ImportDeclare__Group__01272 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group__1_in_rule__ImportDeclare__Group__01275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ImportDeclare__Group__0__Impl1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group__1__Impl_in_rule__ImportDeclare__Group__11334 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group__2_in_rule__ImportDeclare__Group__11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__NameAssignment_1_in_rule__ImportDeclare__Group__1__Impl1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group__2__Impl_in_rule__ImportDeclare__Group__21394 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group__3_in_rule__ImportDeclare__Group__21397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group_2__0_in_rule__ImportDeclare__Group__2__Impl1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group__3__Impl_in_rule__ImportDeclare__Group__31455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__ImportDeclare__Group__3__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group_2__0__Impl_in_rule__ImportDeclare__Group_2__01525 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group_2__1_in_rule__ImportDeclare__Group_2__01528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__ImportDeclare__Group_2__0__Impl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__Group_2__1__Impl_in_rule__ImportDeclare__Group_2__11587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportDeclare__WildcardAssignment_2_1_in_rule__ImportDeclare__Group_2__1__Impl1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__0__Impl_in_rule__BatchDsl__Group__01648 = new BitSet(new long[]{0x0000000000800820L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__1_in_rule__BatchDsl__Group__01651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__CommentAssignment_0_in_rule__BatchDsl__Group__0__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__1__Impl_in_rule__BatchDsl__Group__11709 = new BitSet(new long[]{0x0000000000800820L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__2_in_rule__BatchDsl__Group__11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__ParamsAssignment_1_in_rule__BatchDsl__Group__1__Impl1739 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__2__Impl_in_rule__BatchDsl__Group__21770 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__3_in_rule__BatchDsl__Group__21773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BatchDsl__Group__2__Impl1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__3__Impl_in_rule__BatchDsl__Group__31832 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__4_in_rule__BatchDsl__Group__31835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__NameAssignment_3_in_rule__BatchDsl__Group__3__Impl1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__4__Impl_in_rule__BatchDsl__Group__41892 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__5_in_rule__BatchDsl__Group__41895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BatchDsl__Group__4__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__5__Impl_in_rule__BatchDsl__Group__51954 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__6_in_rule__BatchDsl__Group__51957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__StatementsAssignment_5_in_rule__BatchDsl__Group__5__Impl1984 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__6__Impl_in_rule__BatchDsl__Group__62015 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__7_in_rule__BatchDsl__Group__62018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BatchDsl__Group__6__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchDsl__Group__7__Impl_in_rule__BatchDsl__Group__72077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__BatchDsl__Group__7__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__0__Impl_in_rule__BatchParameter__Group__02155 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__1_in_rule__BatchParameter__Group__02158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BatchParameter__Group__0__Impl2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__1__Impl_in_rule__BatchParameter__Group__12217 = new BitSet(new long[]{0x000000000007F830L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__2_in_rule__BatchParameter__Group__12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BatchParameter__Group__1__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__2__Impl_in_rule__BatchParameter__Group__22279 = new BitSet(new long[]{0x000000000007F830L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__3_in_rule__BatchParameter__Group__22282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__CommentAssignment_2_in_rule__BatchParameter__Group__2__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__3__Impl_in_rule__BatchParameter__Group__32340 = new BitSet(new long[]{0x000000000007F830L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__4_in_rule__BatchParameter__Group__32343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_3__0_in_rule__BatchParameter__Group__3__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__4__Impl_in_rule__BatchParameter__Group__42401 = new BitSet(new long[]{0x000000000A006000L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__5_in_rule__BatchParameter__Group__42404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__NameAssignment_4_in_rule__BatchParameter__Group__4__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__5__Impl_in_rule__BatchParameter__Group__52461 = new BitSet(new long[]{0x000000000A006000L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__6_in_rule__BatchParameter__Group__52464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_5__0_in_rule__BatchParameter__Group__5__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__6__Impl_in_rule__BatchParameter__Group__62522 = new BitSet(new long[]{0x000000000A006000L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__7_in_rule__BatchParameter__Group__62525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_6__0_in_rule__BatchParameter__Group__6__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group__7__Impl_in_rule__BatchParameter__Group__72583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BatchParameter__Group__7__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_3__0__Impl_in_rule__BatchParameter__Group_3__02658 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_3__1_in_rule__BatchParameter__Group_3__02661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BatchParameter__Group_3__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_3__1__Impl_in_rule__BatchParameter__Group_3__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BatchParameter__Group_3__1__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_5__0__Impl_in_rule__BatchParameter__Group_5__02783 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_5__1_in_rule__BatchParameter__Group_5__02786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BatchParameter__Group_5__0__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_5__1__Impl_in_rule__BatchParameter__Group_5__12848 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_5__2_in_rule__BatchParameter__Group_5__12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BatchParameter__Group_5__1__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_5__2__Impl_in_rule__BatchParameter__Group_5__22910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_5__3_in_rule__BatchParameter__Group_5__22913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BatchParameter__Group_5__2__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_5__3__Impl_in_rule__BatchParameter__Group_5__32972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__PatternAssignment_5_3_in_rule__BatchParameter__Group_5__3__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_6__0__Impl_in_rule__BatchParameter__Group_6__03037 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_6__1_in_rule__BatchParameter__Group_6__03040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BatchParameter__Group_6__0__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__Group_6__1__Impl_in_rule__BatchParameter__Group_6__13102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchParameter__RequiredAssignment_6_1_in_rule__BatchParameter__Group_6__1__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group__0__Impl_in_rule__BatchStatement__Group__03163 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group__1_in_rule__BatchStatement__Group__03166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BatchStatement__Group__0__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group__1__Impl_in_rule__BatchStatement__Group__13225 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group__2_in_rule__BatchStatement__Group__13228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Alternatives_1_in_rule__BatchStatement__Group__1__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group__2__Impl_in_rule__BatchStatement__Group__23285 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group__3_in_rule__BatchStatement__Group__23288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Alternatives_2_in_rule__BatchStatement__Group__2__Impl3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group__3__Impl_in_rule__BatchStatement__Group__33345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Alternatives_3_in_rule__BatchStatement__Group__3__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_1_1__0__Impl_in_rule__BatchStatement__Group_1_1__03411 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_1_1__1_in_rule__BatchStatement__Group_1_1__03414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__JobNameAssignment_1_1_0_in_rule__BatchStatement__Group_1_1__0__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_1_1__1__Impl_in_rule__BatchStatement__Group_1_1__13471 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_1_1__2_in_rule__BatchStatement__Group_1_1__13474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BatchStatement__Group_1_1__1__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_1_1__2__Impl_in_rule__BatchStatement__Group_1_1__23533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__NameAssignment_1_1_2_in_rule__BatchStatement__Group_1_1__2__Impl3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1__0__Impl_in_rule__BatchStatement__Group_2_1__03596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1__1_in_rule__BatchStatement__Group_2_1__03599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BatchStatement__Group_2_1__0__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1__1__Impl_in_rule__BatchStatement__Group_2_1__13658 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1__2_in_rule__BatchStatement__Group_2_1__13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__AfterAssignment_2_1_1_in_rule__BatchStatement__Group_2_1__1__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1__2__Impl_in_rule__BatchStatement__Group_2_1__23718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1_2__0_in_rule__BatchStatement__Group_2_1__2__Impl3745 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1_2__0__Impl_in_rule__BatchStatement__Group_2_1_2__03782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1_2__1_in_rule__BatchStatement__Group_2_1_2__03785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BatchStatement__Group_2_1_2__0__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__Group_2_1_2__1__Impl_in_rule__BatchStatement__Group_2_1_2__13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BatchStatement__AfterAssignment_2_1_2_1_in_rule__BatchStatement__Group_2_1_2__1__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__03905 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__03908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__FQN__Group__0__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__13964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl3991 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__04026 = new BitSet(new long[]{0x000000000007F810L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__04029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__FQN__Group_1__0__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__14088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__FQN__Group_1__1__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclare_in_rule__Script__PackageAssignment_04153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclare_in_rule__Script__ImportsAssignment_14184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchDsl_in_rule__Script__ListAssignment_24215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__PackageDeclare__NameAssignment_14246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__ImportDeclare__NameAssignment_14277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ImportDeclare__WildcardAssignment_2_14313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BatchDsl__CommentAssignment_04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchParameter_in_rule__BatchDsl__ParamsAssignment_14383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__BatchDsl__NameAssignment_34414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchStatement_in_rule__BatchDsl__StatementsAssignment_54445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BatchParameter__CommentAssignment_24476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__BatchParameter__NameAssignment_44507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BatchParameter__PatternAssignment_5_34538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BatchParameter__RequiredAssignment_6_14574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BatchStatement__NameAssignment_1_04613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BatchStatement__JobNameAssignment_1_1_04644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__BatchStatement__NameAssignment_1_1_24675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BatchStatement__SoonAssignment_2_04711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BatchStatement__AfterAssignment_2_1_14754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BatchStatement__AfterAssignment_2_1_2_14793 = new BitSet(new long[]{0x0000000000000002L});

}