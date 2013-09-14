package jp.hishidama.xtext.afw.batch_dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jp.hishidama.xtext.afw.batch_dsl.services.BatchDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBatchDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "';'", "'import'", "'.'", "'*'", "'batch'", "'{'", "'}'", "'@param'", "'('", "'key'", "'='", "','", "'pattern'", "'required'", "')'", "'run'", "'as'", "'soon'", "'after'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g"; }



     	private BatchDslGrammarAccess grammarAccess;
     	
        public InternalBatchDslParser(TokenStream input, BatchDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Script";	
       	}
       	
       	@Override
       	protected BatchDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScript"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:67:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:68:2: (iv_ruleScript= ruleScript EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:69:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript75);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:76:1: ruleScript returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclare ) ) ( (lv_imports_1_0= ruleImportDeclare ) )* ( (lv_list_2_0= ruleBatchDsl ) )* ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:79:28: ( ( ( (lv_package_0_0= rulePackageDeclare ) ) ( (lv_imports_1_0= ruleImportDeclare ) )* ( (lv_list_2_0= ruleBatchDsl ) )* ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:80:1: ( ( (lv_package_0_0= rulePackageDeclare ) ) ( (lv_imports_1_0= ruleImportDeclare ) )* ( (lv_list_2_0= ruleBatchDsl ) )* )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:80:1: ( ( (lv_package_0_0= rulePackageDeclare ) ) ( (lv_imports_1_0= ruleImportDeclare ) )* ( (lv_list_2_0= ruleBatchDsl ) )* )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:80:2: ( (lv_package_0_0= rulePackageDeclare ) ) ( (lv_imports_1_0= ruleImportDeclare ) )* ( (lv_list_2_0= ruleBatchDsl ) )*
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:80:2: ( (lv_package_0_0= rulePackageDeclare ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:81:1: (lv_package_0_0= rulePackageDeclare )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:81:1: (lv_package_0_0= rulePackageDeclare )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:82:3: lv_package_0_0= rulePackageDeclare
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getPackagePackageDeclareParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePackageDeclare_in_ruleScript131);
            lv_package_0_0=rulePackageDeclare();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		set(
                   			current, 
                   			"package",
                    		lv_package_0_0, 
                    		"PackageDeclare");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:98:2: ( (lv_imports_1_0= ruleImportDeclare ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:99:1: (lv_imports_1_0= ruleImportDeclare )
            	    {
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:99:1: (lv_imports_1_0= ruleImportDeclare )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:100:3: lv_imports_1_0= ruleImportDeclare
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getImportsImportDeclareParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportDeclare_in_ruleScript152);
            	    lv_imports_1_0=ruleImportDeclare();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"ImportDeclare");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:116:3: ( (lv_list_2_0= ruleBatchDsl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING||LA2_0==14||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:117:1: (lv_list_2_0= ruleBatchDsl )
            	    {
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:117:1: (lv_list_2_0= ruleBatchDsl )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:118:3: lv_list_2_0= ruleBatchDsl
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getListBatchDslParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBatchDsl_in_ruleScript174);
            	    lv_list_2_0=ruleBatchDsl();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"list",
            	            		lv_list_2_0, 
            	            		"BatchDsl");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRulePackageDeclare"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:142:1: entryRulePackageDeclare returns [EObject current=null] : iv_rulePackageDeclare= rulePackageDeclare EOF ;
    public final EObject entryRulePackageDeclare() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclare = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:143:2: (iv_rulePackageDeclare= rulePackageDeclare EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:144:2: iv_rulePackageDeclare= rulePackageDeclare EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclareRule()); 
            pushFollow(FOLLOW_rulePackageDeclare_in_entryRulePackageDeclare211);
            iv_rulePackageDeclare=rulePackageDeclare();

            state._fsp--;

             current =iv_rulePackageDeclare; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclare221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclare"


    // $ANTLR start "rulePackageDeclare"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:151:1: rulePackageDeclare returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject rulePackageDeclare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:154:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= ';' )? ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:155:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:155:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= ';' )? )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:155:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_rulePackageDeclare258); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclareAccess().getPackageKeyword_0());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:159:1: ( (lv_name_1_0= ruleFQN ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:160:1: (lv_name_1_0= ruleFQN )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:160:1: (lv_name_1_0= ruleFQN )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:161:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclareAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePackageDeclare279);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclareRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:177:2: (otherlv_2= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:177:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,10,FOLLOW_10_in_rulePackageDeclare292); 

                        	newLeafNode(otherlv_2, grammarAccess.getPackageDeclareAccess().getSemicolonKeyword_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclare"


    // $ANTLR start "entryRuleImportDeclare"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:189:1: entryRuleImportDeclare returns [EObject current=null] : iv_ruleImportDeclare= ruleImportDeclare EOF ;
    public final EObject entryRuleImportDeclare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDeclare = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:190:2: (iv_ruleImportDeclare= ruleImportDeclare EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:191:2: iv_ruleImportDeclare= ruleImportDeclare EOF
            {
             newCompositeNode(grammarAccess.getImportDeclareRule()); 
            pushFollow(FOLLOW_ruleImportDeclare_in_entryRuleImportDeclare330);
            iv_ruleImportDeclare=ruleImportDeclare();

            state._fsp--;

             current =iv_ruleImportDeclare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDeclare340); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDeclare"


    // $ANTLR start "ruleImportDeclare"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:198:1: ruleImportDeclare returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleImportDeclare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_wildcard_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:201:28: ( (otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )? ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:202:1: (otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )? )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:202:1: (otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )? )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:202:3: otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImportDeclare377); 

                	newLeafNode(otherlv_0, grammarAccess.getImportDeclareAccess().getImportKeyword_0());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:206:1: ( (lv_name_1_0= ruleFQN ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:207:1: (lv_name_1_0= ruleFQN )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:207:1: (lv_name_1_0= ruleFQN )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:208:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getImportDeclareAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleImportDeclare398);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportDeclareRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:224:2: (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:224:4: otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImportDeclare411); 

                        	newLeafNode(otherlv_2, grammarAccess.getImportDeclareAccess().getFullStopKeyword_2_0());
                        
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:228:1: ( (lv_wildcard_3_0= '*' ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:229:1: (lv_wildcard_3_0= '*' )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:229:1: (lv_wildcard_3_0= '*' )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:230:3: lv_wildcard_3_0= '*'
                    {
                    lv_wildcard_3_0=(Token)match(input,13,FOLLOW_13_in_ruleImportDeclare429); 

                            newLeafNode(lv_wildcard_3_0, grammarAccess.getImportDeclareAccess().getWildcardAsteriskKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportDeclareRule());
                    	        }
                           		setWithLastConsumed(current, "wildcard", true, "*");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:243:4: (otherlv_4= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==10) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:243:6: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,10,FOLLOW_10_in_ruleImportDeclare457); 

                        	newLeafNode(otherlv_4, grammarAccess.getImportDeclareAccess().getSemicolonKeyword_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDeclare"


    // $ANTLR start "entryRuleBatchDsl"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:255:1: entryRuleBatchDsl returns [EObject current=null] : iv_ruleBatchDsl= ruleBatchDsl EOF ;
    public final EObject entryRuleBatchDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchDsl = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:256:2: (iv_ruleBatchDsl= ruleBatchDsl EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:257:2: iv_ruleBatchDsl= ruleBatchDsl EOF
            {
             newCompositeNode(grammarAccess.getBatchDslRule()); 
            pushFollow(FOLLOW_ruleBatchDsl_in_entryRuleBatchDsl495);
            iv_ruleBatchDsl=ruleBatchDsl();

            state._fsp--;

             current =iv_ruleBatchDsl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchDsl505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBatchDsl"


    // $ANTLR start "ruleBatchDsl"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:264:1: ruleBatchDsl returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )? ) ;
    public final EObject ruleBatchDsl() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_params_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_statements_5_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:267:28: ( ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )? ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:268:1: ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )? )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:268:1: ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )? )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:268:2: ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )?
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:268:2: ( (lv_comment_0_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:269:1: (lv_comment_0_0= RULE_STRING )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:269:1: (lv_comment_0_0= RULE_STRING )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:270:3: lv_comment_0_0= RULE_STRING
                    {
                    lv_comment_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBatchDsl547); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getBatchDslAccess().getCommentSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBatchDslRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:286:3: ( (lv_params_1_0= ruleBatchParameter ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:287:1: (lv_params_1_0= ruleBatchParameter )
            	    {
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:287:1: (lv_params_1_0= ruleBatchParameter )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:288:3: lv_params_1_0= ruleBatchParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBatchDslAccess().getParamsBatchParameterParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBatchParameter_in_ruleBatchDsl574);
            	    lv_params_1_0=ruleBatchParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBatchDslRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_1_0, 
            	            		"BatchParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBatchDsl587); 

                	newLeafNode(otherlv_2, grammarAccess.getBatchDslAccess().getBatchKeyword_2());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:308:1: ( (lv_name_3_0= ruleName ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:309:1: (lv_name_3_0= ruleName )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:309:1: (lv_name_3_0= ruleName )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:310:3: lv_name_3_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getBatchDslAccess().getNameNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleBatchDsl608);
            lv_name_3_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBatchDslRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBatchDsl620); 

                	newLeafNode(otherlv_4, grammarAccess.getBatchDslAccess().getLeftCurlyBracketKeyword_4());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:330:1: ( (lv_statements_5_0= ruleBatchStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:331:1: (lv_statements_5_0= ruleBatchStatement )
            	    {
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:331:1: (lv_statements_5_0= ruleBatchStatement )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:332:3: lv_statements_5_0= ruleBatchStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBatchDslAccess().getStatementsBatchStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBatchStatement_in_ruleBatchDsl641);
            	    lv_statements_5_0=ruleBatchStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBatchDslRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_5_0, 
            	            		"BatchStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleBatchDsl654); 

                	newLeafNode(otherlv_6, grammarAccess.getBatchDslAccess().getRightCurlyBracketKeyword_6());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:352:1: (otherlv_7= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==10) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:352:3: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,10,FOLLOW_10_in_ruleBatchDsl667); 

                        	newLeafNode(otherlv_7, grammarAccess.getBatchDslAccess().getSemicolonKeyword_7());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBatchDsl"


    // $ANTLR start "entryRuleBatchParameter"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:364:1: entryRuleBatchParameter returns [EObject current=null] : iv_ruleBatchParameter= ruleBatchParameter EOF ;
    public final EObject entryRuleBatchParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchParameter = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:365:2: (iv_ruleBatchParameter= ruleBatchParameter EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:366:2: iv_ruleBatchParameter= ruleBatchParameter EOF
            {
             newCompositeNode(grammarAccess.getBatchParameterRule()); 
            pushFollow(FOLLOW_ruleBatchParameter_in_entryRuleBatchParameter705);
            iv_ruleBatchParameter=ruleBatchParameter();

            state._fsp--;

             current =iv_ruleBatchParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchParameter715); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBatchParameter"


    // $ANTLR start "ruleBatchParameter"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:373:1: ruleBatchParameter returns [EObject current=null] : (otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')' ) ;
    public final EObject ruleBatchParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_pattern_9_0=null;
        Token otherlv_10=null;
        Token lv_required_11_0=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:376:28: ( (otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')' ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:377:1: (otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')' )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:377:1: (otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')' )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:377:3: otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBatchParameter752); 

                	newLeafNode(otherlv_0, grammarAccess.getBatchParameterAccess().getParamKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBatchParameter764); 

                	newLeafNode(otherlv_1, grammarAccess.getBatchParameterAccess().getLeftParenthesisKeyword_1());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:385:1: ( (lv_comment_2_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:386:1: (lv_comment_2_0= RULE_STRING )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:386:1: (lv_comment_2_0= RULE_STRING )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:387:3: lv_comment_2_0= RULE_STRING
                    {
                    lv_comment_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBatchParameter781); 

                    			newLeafNode(lv_comment_2_0, grammarAccess.getBatchParameterAccess().getCommentSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBatchParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:403:3: (otherlv_3= 'key' otherlv_4= '=' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==20) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:403:5: otherlv_3= 'key' otherlv_4= '='
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBatchParameter800); 

                        	newLeafNode(otherlv_3, grammarAccess.getBatchParameterAccess().getKeyKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleBatchParameter812); 

                        	newLeafNode(otherlv_4, grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_3_1());
                        

                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:411:3: ( (lv_name_5_0= ruleName ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:412:1: (lv_name_5_0= ruleName )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:412:1: (lv_name_5_0= ruleName )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:413:3: lv_name_5_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getBatchParameterAccess().getNameNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleBatchParameter835);
            lv_name_5_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBatchParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:429:2: ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==22) ) {
                    alt13=1;
                }
            }
            else if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:429:3: (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:429:3: (otherlv_6= ',' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==21) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:429:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleBatchParameter849); 

                                	newLeafNode(otherlv_6, grammarAccess.getBatchParameterAccess().getCommaKeyword_5_0());
                                

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleBatchParameter863); 

                        	newLeafNode(otherlv_7, grammarAccess.getBatchParameterAccess().getPatternKeyword_5_1());
                        
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBatchParameter875); 

                        	newLeafNode(otherlv_8, grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_5_2());
                        
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:441:1: ( (lv_pattern_9_0= RULE_STRING ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:442:1: (lv_pattern_9_0= RULE_STRING )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:442:1: (lv_pattern_9_0= RULE_STRING )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:443:3: lv_pattern_9_0= RULE_STRING
                    {
                    lv_pattern_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBatchParameter892); 

                    			newLeafNode(lv_pattern_9_0, grammarAccess.getBatchParameterAccess().getPatternSTRINGTerminalRuleCall_5_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBatchParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pattern",
                            		lv_pattern_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:459:4: ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21||LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:459:5: (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:459:5: (otherlv_10= ',' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==21) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:459:7: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleBatchParameter913); 

                                	newLeafNode(otherlv_10, grammarAccess.getBatchParameterAccess().getCommaKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:463:3: ( (lv_required_11_0= 'required' ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:464:1: (lv_required_11_0= 'required' )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:464:1: (lv_required_11_0= 'required' )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:465:3: lv_required_11_0= 'required'
                    {
                    lv_required_11_0=(Token)match(input,23,FOLLOW_23_in_ruleBatchParameter933); 

                            newLeafNode(lv_required_11_0, grammarAccess.getBatchParameterAccess().getRequiredRequiredKeyword_6_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBatchParameterRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "required");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleBatchParameter960); 

                	newLeafNode(otherlv_12, grammarAccess.getBatchParameterAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBatchParameter"


    // $ANTLR start "entryRuleBatchStatement"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:490:1: entryRuleBatchStatement returns [EObject current=null] : iv_ruleBatchStatement= ruleBatchStatement EOF ;
    public final EObject entryRuleBatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchStatement = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:491:2: (iv_ruleBatchStatement= ruleBatchStatement EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:492:2: iv_ruleBatchStatement= ruleBatchStatement EOF
            {
             newCompositeNode(grammarAccess.getBatchStatementRule()); 
            pushFollow(FOLLOW_ruleBatchStatement_in_entryRuleBatchStatement996);
            iv_ruleBatchStatement=ruleBatchStatement();

            state._fsp--;

             current =iv_ruleBatchStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchStatement1006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBatchStatement"


    // $ANTLR start "ruleBatchStatement"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:499:1: ruleBatchStatement returns [EObject current=null] : (otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) ( ( (lv_soon_5_0= 'soon' ) ) | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )? ) ;
    public final EObject ruleBatchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_soon_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_jobName_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:502:28: ( (otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) ( ( (lv_soon_5_0= 'soon' ) ) | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )? ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:503:1: (otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) ( ( (lv_soon_5_0= 'soon' ) ) | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )? )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:503:1: (otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) ( ( (lv_soon_5_0= 'soon' ) ) | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )? )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:503:3: otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) ( ( (lv_soon_5_0= 'soon' ) ) | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleBatchStatement1043); 

                	newLeafNode(otherlv_0, grammarAccess.getBatchStatementAccess().getRunKeyword_0());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:507:1: ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:507:2: ( (lv_name_1_0= ruleFQN ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:507:2: ( (lv_name_1_0= ruleFQN ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:508:1: (lv_name_1_0= ruleFQN )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:508:1: (lv_name_1_0= ruleFQN )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:509:3: lv_name_1_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getBatchStatementAccess().getNameFQNParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleBatchStatement1065);
                    lv_name_1_0=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBatchStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"FQN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:526:6: ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:526:6: ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:526:7: ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:526:7: ( (lv_jobName_2_0= ruleFQN ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:527:1: (lv_jobName_2_0= ruleFQN )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:527:1: (lv_jobName_2_0= ruleFQN )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:528:3: lv_jobName_2_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getBatchStatementAccess().getJobNameFQNParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleBatchStatement1093);
                    lv_jobName_2_0=ruleFQN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBatchStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"jobName",
                            		lv_jobName_2_0, 
                            		"FQN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleBatchStatement1105); 

                        	newLeafNode(otherlv_3, grammarAccess.getBatchStatementAccess().getAsKeyword_1_1_1());
                        
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:548:1: ( (lv_name_4_0= ruleName ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:549:1: (lv_name_4_0= ruleName )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:549:1: (lv_name_4_0= ruleName )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:550:3: lv_name_4_0= ruleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getBatchStatementAccess().getNameNameParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_ruleBatchStatement1126);
                    lv_name_4_0=ruleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBatchStatementRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_4_0, 
                            		"Name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:566:4: ( ( (lv_soon_5_0= 'soon' ) ) | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==28) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:566:5: ( (lv_soon_5_0= 'soon' ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:566:5: ( (lv_soon_5_0= 'soon' ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:567:1: (lv_soon_5_0= 'soon' )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:567:1: (lv_soon_5_0= 'soon' )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:568:3: lv_soon_5_0= 'soon'
                    {
                    lv_soon_5_0=(Token)match(input,27,FOLLOW_27_in_ruleBatchStatement1147); 

                            newLeafNode(lv_soon_5_0, grammarAccess.getBatchStatementAccess().getSoonSoonKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBatchStatementRule());
                    	        }
                           		setWithLastConsumed(current, "soon", true, "soon");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:582:6: (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:582:6: (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:582:8: otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleBatchStatement1179); 

                        	newLeafNode(otherlv_6, grammarAccess.getBatchStatementAccess().getAfterKeyword_2_1_0());
                        
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:586:1: ( (otherlv_7= RULE_ID ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:587:1: (otherlv_7= RULE_ID )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:587:1: (otherlv_7= RULE_ID )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:588:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBatchStatementRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBatchStatement1199); 

                    		newLeafNode(otherlv_7, grammarAccess.getBatchStatementAccess().getAfterBatchStatementCrossReference_2_1_1_0()); 
                    	

                    }


                    }

                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:599:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:599:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleBatchStatement1212); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getBatchStatementAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:603:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:604:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:604:1: (otherlv_9= RULE_ID )
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:605:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBatchStatementRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBatchStatement1232); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getBatchStatementAccess().getAfterBatchStatementCrossReference_2_1_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:616:6: (otherlv_10= ';' | otherlv_11= '.' )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==10) ) {
                alt19=1;
            }
            else if ( (LA19_0==12) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:616:8: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,10,FOLLOW_10_in_ruleBatchStatement1249); 

                        	newLeafNode(otherlv_10, grammarAccess.getBatchStatementAccess().getSemicolonKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:621:7: otherlv_11= '.'
                    {
                    otherlv_11=(Token)match(input,12,FOLLOW_12_in_ruleBatchStatement1267); 

                        	newLeafNode(otherlv_11, grammarAccess.getBatchStatementAccess().getFullStopKeyword_3_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBatchStatement"


    // $ANTLR start "entryRuleFQN"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:633:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:634:2: (iv_ruleFQN= ruleFQN EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:635:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1306);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:642:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:645:28: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:646:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:646:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:647:5: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {
             
                    newCompositeNode(grammarAccess.getFQNAccess().getNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleName_in_ruleFQN1364);
            this_Name_0=ruleName();

            state._fsp--;


            		current.merge(this_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:657:1: (kw= '.' this_Name_2= ruleName )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==12) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==RULE_ID||LA20_2==14||LA20_2==19||(LA20_2>=22 && LA20_2<=23)||(LA20_2>=25 && LA20_2<=28)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:658:2: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleFQN1383); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFQNAccess().getNameParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleName_in_ruleFQN1405);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    		current.merge(this_Name_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleName"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:682:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:683:2: (iv_ruleName= ruleName EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:684:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1453);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1464); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:691:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'batch' | kw= 'key' | kw= 'pattern' | kw= 'required' | kw= 'run' | kw= 'as' | kw= 'soon' | kw= 'after' ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:694:28: ( (this_ID_0= RULE_ID | kw= 'batch' | kw= 'key' | kw= 'pattern' | kw= 'required' | kw= 'run' | kw= 'as' | kw= 'soon' | kw= 'after' ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:695:1: (this_ID_0= RULE_ID | kw= 'batch' | kw= 'key' | kw= 'pattern' | kw= 'required' | kw= 'run' | kw= 'as' | kw= 'soon' | kw= 'after' )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:695:1: (this_ID_0= RULE_ID | kw= 'batch' | kw= 'key' | kw= 'pattern' | kw= 'required' | kw= 'run' | kw= 'as' | kw= 'soon' | kw= 'after' )
            int alt21=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case 14:
                {
                alt21=2;
                }
                break;
            case 19:
                {
                alt21=3;
                }
                break;
            case 22:
                {
                alt21=4;
                }
                break;
            case 23:
                {
                alt21=5;
                }
                break;
            case 25:
                {
                alt21=6;
                }
                break;
            case 26:
                {
                alt21=7;
                }
                break;
            case 27:
                {
                alt21=8;
                }
                break;
            case 28:
                {
                alt21=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:695:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName1504); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:704:2: kw= 'batch'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleName1528); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getBatchKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:711:2: kw= 'key'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleName1547); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getKeyKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:718:2: kw= 'pattern'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleName1566); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getPatternKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:725:2: kw= 'required'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleName1585); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getRequiredKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:732:2: kw= 'run'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleName1604); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getRunKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:739:2: kw= 'as'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleName1623); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getAsKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:746:2: kw= 'soon'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleName1642); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getSoonKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:753:2: kw= 'after'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleName1661); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getAfterKeyword_8()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\26\uffff";
    static final String DFA16_eofS =
        "\26\uffff";
    static final String DFA16_minS =
        "\1\5\11\14\1\5\2\uffff\11\14";
    static final String DFA16_maxS =
        "\13\34\2\uffff\11\34";
    static final String DFA16_acceptS =
        "\13\uffff\1\2\1\1\11\uffff";
    static final String DFA16_specialS =
        "\26\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\10\uffff\1\2\4\uffff\1\3\2\uffff\1\4\1\5\1\uffff\1\6\1"+
            "\7\1\10\1\11",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\15\10\uffff\1\16\4\uffff\1\17\2\uffff\1\20\1\21\1\uffff"+
            "\1\22\1\23\1\24\1\25",
            "",
            "",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14",
            "\1\12\15\uffff\1\13\2\14"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "507:1: ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclare_in_ruleScript131 = new BitSet(new long[]{0x0000000000024812L});
    public static final BitSet FOLLOW_ruleImportDeclare_in_ruleScript152 = new BitSet(new long[]{0x0000000000024812L});
    public static final BitSet FOLLOW_ruleBatchDsl_in_ruleScript174 = new BitSet(new long[]{0x0000000000024012L});
    public static final BitSet FOLLOW_rulePackageDeclare_in_entryRulePackageDeclare211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclare221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rulePackageDeclare258 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePackageDeclare279 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_rulePackageDeclare292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDeclare_in_entryRuleImportDeclare330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDeclare340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImportDeclare377 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImportDeclare398 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_12_in_ruleImportDeclare411 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImportDeclare429 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_ruleImportDeclare457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchDsl_in_entryRuleBatchDsl495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchDsl505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBatchDsl547 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleBatchParameter_in_ruleBatchDsl574 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleBatchDsl587 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_ruleBatchDsl608 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBatchDsl620 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_ruleBatchStatement_in_ruleBatchDsl641 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_16_in_ruleBatchDsl654 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_ruleBatchDsl667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchParameter_in_entryRuleBatchParameter705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchParameter715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBatchParameter752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBatchParameter764 = new BitSet(new long[]{0x000000001EC84030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBatchParameter781 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_19_in_ruleBatchParameter800 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBatchParameter812 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_ruleBatchParameter835 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_21_in_ruleBatchParameter849 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBatchParameter863 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBatchParameter875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBatchParameter892 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_21_in_ruleBatchParameter913 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBatchParameter933 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBatchParameter960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchStatement_in_entryRuleBatchStatement996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchStatement1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBatchStatement1043 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBatchStatement1065 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBatchStatement1093 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBatchStatement1105 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_ruleBatchStatement1126 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleBatchStatement1147 = new BitSet(new long[]{0x0000000000001402L});
    public static final BitSet FOLLOW_28_in_ruleBatchStatement1179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBatchStatement1199 = new BitSet(new long[]{0x0000000000201402L});
    public static final BitSet FOLLOW_21_in_ruleBatchStatement1212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBatchStatement1232 = new BitSet(new long[]{0x0000000000201402L});
    public static final BitSet FOLLOW_10_in_ruleBatchStatement1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBatchStatement1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleFQN1364 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleFQN1383 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_ruleFQN1405 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleName1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleName1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleName1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleName1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleName1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleName1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleName1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleName1661 = new BitSet(new long[]{0x0000000000000002L});

}