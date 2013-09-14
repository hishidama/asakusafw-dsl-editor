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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "'.'", "';'", "'import'", "'*'", "'batch'", "'{'", "'}'", "'@param'", "'('", "'key'", "'='", "','", "'pattern'", "'required'", "')'", "'run'", "'as'", "'soon'", "'after'"
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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:76:1: ruleScript returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_list_2_0= ruleBatchDsl ) )* ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:79:28: ( ( ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_list_2_0= ruleBatchDsl ) )* ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:80:1: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_list_2_0= ruleBatchDsl ) )* )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:80:1: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_list_2_0= ruleBatchDsl ) )* )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:80:2: ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImport ) )* ( (lv_list_2_0= ruleBatchDsl ) )*
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:80:2: ( (lv_package_0_0= rulePackage ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:81:1: (lv_package_0_0= rulePackage )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:81:1: (lv_package_0_0= rulePackage )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:82:3: lv_package_0_0= rulePackage
            {
             
            	        newCompositeNode(grammarAccess.getScriptAccess().getPackagePackageParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePackage_in_ruleScript131);
            lv_package_0_0=rulePackage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	        }
                   		set(
                   			current, 
                   			"package",
                    		lv_package_0_0, 
                    		"Package");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:98:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:99:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:99:1: (lv_imports_1_0= ruleImport )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:100:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getImportsImportParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleScript152);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"Import");
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


    // $ANTLR start "entryRulePackage"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:142:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:143:2: (iv_rulePackage= rulePackage EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:144:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage211);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage221); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:151:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '.' ( (lv_name_3_0= ruleName ) ) )* (otherlv_4= ';' )? ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:154:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '.' ( (lv_name_3_0= ruleName ) ) )* (otherlv_4= ';' )? ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:155:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '.' ( (lv_name_3_0= ruleName ) ) )* (otherlv_4= ';' )? )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:155:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '.' ( (lv_name_3_0= ruleName ) ) )* (otherlv_4= ';' )? )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:155:3: otherlv_0= 'package' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '.' ( (lv_name_3_0= ruleName ) ) )* (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_rulePackage258); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:159:1: ( (lv_name_1_0= ruleName ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:160:1: (lv_name_1_0= ruleName )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:160:1: (lv_name_1_0= ruleName )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:161:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePackage279);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		add(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:177:2: (otherlv_2= '.' ( (lv_name_3_0= ruleName ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==10) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:177:4: otherlv_2= '.' ( (lv_name_3_0= ruleName ) )
            	    {
            	    otherlv_2=(Token)match(input,10,FOLLOW_10_in_rulePackage292); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getFullStopKeyword_2_0());
            	        
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:181:1: ( (lv_name_3_0= ruleName ) )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:182:1: (lv_name_3_0= ruleName )
            	    {
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:182:1: (lv_name_3_0= ruleName )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:183:3: lv_name_3_0= ruleName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getNameNameParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleName_in_rulePackage313);
            	    lv_name_3_0=ruleName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"Name");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:199:4: (otherlv_4= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:199:6: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,11,FOLLOW_11_in_rulePackage328); 

                        	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImport"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:211:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:212:2: (iv_ruleImport= ruleImport EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:213:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport366);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport376); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:220:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_wildcard_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:223:28: ( (otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )? ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:224:1: (otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )? )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:224:1: (otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )? )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:224:3: otherlv_0= 'import' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )? (otherlv_4= ';' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport413); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:228:1: ( (lv_name_1_0= ruleFQN ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:229:1: (lv_name_1_0= ruleFQN )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:229:1: (lv_name_1_0= ruleFQN )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:230:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleImport434);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:246:2: (otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==10) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:246:4: otherlv_2= '.' ( (lv_wildcard_3_0= '*' ) )
                    {
                    otherlv_2=(Token)match(input,10,FOLLOW_10_in_ruleImport447); 

                        	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getFullStopKeyword_2_0());
                        
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:250:1: ( (lv_wildcard_3_0= '*' ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:251:1: (lv_wildcard_3_0= '*' )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:251:1: (lv_wildcard_3_0= '*' )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:252:3: lv_wildcard_3_0= '*'
                    {
                    lv_wildcard_3_0=(Token)match(input,13,FOLLOW_13_in_ruleImport465); 

                            newLeafNode(lv_wildcard_3_0, grammarAccess.getImportAccess().getWildcardAsteriskKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getImportRule());
                    	        }
                           		setWithLastConsumed(current, "wildcard", true, "*");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:265:4: (otherlv_4= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:265:6: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleImport493); 

                        	newLeafNode(otherlv_4, grammarAccess.getImportAccess().getSemicolonKeyword_3());
                        

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleBatchDsl"
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:277:1: entryRuleBatchDsl returns [EObject current=null] : iv_ruleBatchDsl= ruleBatchDsl EOF ;
    public final EObject entryRuleBatchDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchDsl = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:278:2: (iv_ruleBatchDsl= ruleBatchDsl EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:279:2: iv_ruleBatchDsl= ruleBatchDsl EOF
            {
             newCompositeNode(grammarAccess.getBatchDslRule()); 
            pushFollow(FOLLOW_ruleBatchDsl_in_entryRuleBatchDsl531);
            iv_ruleBatchDsl=ruleBatchDsl();

            state._fsp--;

             current =iv_ruleBatchDsl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchDsl541); 

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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:286:1: ruleBatchDsl returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )? ) ;
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
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:289:28: ( ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )? ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:290:1: ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )? )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:290:1: ( ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )? )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:290:2: ( (lv_comment_0_0= RULE_STRING ) )? ( (lv_params_1_0= ruleBatchParameter ) )* otherlv_2= 'batch' ( (lv_name_3_0= ruleName ) ) otherlv_4= '{' ( (lv_statements_5_0= ruleBatchStatement ) )* otherlv_6= '}' (otherlv_7= ';' )?
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:290:2: ( (lv_comment_0_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:291:1: (lv_comment_0_0= RULE_STRING )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:291:1: (lv_comment_0_0= RULE_STRING )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:292:3: lv_comment_0_0= RULE_STRING
                    {
                    lv_comment_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBatchDsl583); 

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

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:308:3: ( (lv_params_1_0= ruleBatchParameter ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:309:1: (lv_params_1_0= ruleBatchParameter )
            	    {
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:309:1: (lv_params_1_0= ruleBatchParameter )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:310:3: lv_params_1_0= ruleBatchParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBatchDslAccess().getParamsBatchParameterParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBatchParameter_in_ruleBatchDsl610);
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
            	    break loop8;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBatchDsl623); 

                	newLeafNode(otherlv_2, grammarAccess.getBatchDslAccess().getBatchKeyword_2());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:330:1: ( (lv_name_3_0= ruleName ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:331:1: (lv_name_3_0= ruleName )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:331:1: (lv_name_3_0= ruleName )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:332:3: lv_name_3_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getBatchDslAccess().getNameNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleBatchDsl644);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBatchDsl656); 

                	newLeafNode(otherlv_4, grammarAccess.getBatchDslAccess().getLeftCurlyBracketKeyword_4());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:352:1: ( (lv_statements_5_0= ruleBatchStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:353:1: (lv_statements_5_0= ruleBatchStatement )
            	    {
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:353:1: (lv_statements_5_0= ruleBatchStatement )
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:354:3: lv_statements_5_0= ruleBatchStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBatchDslAccess().getStatementsBatchStatementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBatchStatement_in_ruleBatchDsl677);
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
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleBatchDsl690); 

                	newLeafNode(otherlv_6, grammarAccess.getBatchDslAccess().getRightCurlyBracketKeyword_6());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:374:1: (otherlv_7= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:374:3: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,11,FOLLOW_11_in_ruleBatchDsl703); 

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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:386:1: entryRuleBatchParameter returns [EObject current=null] : iv_ruleBatchParameter= ruleBatchParameter EOF ;
    public final EObject entryRuleBatchParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchParameter = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:387:2: (iv_ruleBatchParameter= ruleBatchParameter EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:388:2: iv_ruleBatchParameter= ruleBatchParameter EOF
            {
             newCompositeNode(grammarAccess.getBatchParameterRule()); 
            pushFollow(FOLLOW_ruleBatchParameter_in_entryRuleBatchParameter741);
            iv_ruleBatchParameter=ruleBatchParameter();

            state._fsp--;

             current =iv_ruleBatchParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchParameter751); 

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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:395:1: ruleBatchParameter returns [EObject current=null] : (otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')' ) ;
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
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:398:28: ( (otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')' ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:399:1: (otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')' )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:399:1: (otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')' )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:399:3: otherlv_0= '@param' otherlv_1= '(' ( (lv_comment_2_0= RULE_STRING ) )? (otherlv_3= 'key' otherlv_4= '=' )? ( (lv_name_5_0= ruleName ) ) ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )? ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )? otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBatchParameter788); 

                	newLeafNode(otherlv_0, grammarAccess.getBatchParameterAccess().getParamKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBatchParameter800); 

                	newLeafNode(otherlv_1, grammarAccess.getBatchParameterAccess().getLeftParenthesisKeyword_1());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:407:1: ( (lv_comment_2_0= RULE_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:408:1: (lv_comment_2_0= RULE_STRING )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:408:1: (lv_comment_2_0= RULE_STRING )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:409:3: lv_comment_2_0= RULE_STRING
                    {
                    lv_comment_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBatchParameter817); 

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

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:425:3: (otherlv_3= 'key' otherlv_4= '=' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==20) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:425:5: otherlv_3= 'key' otherlv_4= '='
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleBatchParameter836); 

                        	newLeafNode(otherlv_3, grammarAccess.getBatchParameterAccess().getKeyKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleBatchParameter848); 

                        	newLeafNode(otherlv_4, grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_3_1());
                        

                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:433:3: ( (lv_name_5_0= ruleName ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:434:1: (lv_name_5_0= ruleName )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:434:1: (lv_name_5_0= ruleName )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:435:3: lv_name_5_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getBatchParameterAccess().getNameNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleBatchParameter871);
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

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:451:2: ( (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==22) ) {
                    alt14=1;
                }
            }
            else if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:451:3: (otherlv_6= ',' )? otherlv_7= 'pattern' otherlv_8= '=' ( (lv_pattern_9_0= RULE_STRING ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:451:3: (otherlv_6= ',' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==21) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:451:5: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleBatchParameter885); 

                                	newLeafNode(otherlv_6, grammarAccess.getBatchParameterAccess().getCommaKeyword_5_0());
                                

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleBatchParameter899); 

                        	newLeafNode(otherlv_7, grammarAccess.getBatchParameterAccess().getPatternKeyword_5_1());
                        
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBatchParameter911); 

                        	newLeafNode(otherlv_8, grammarAccess.getBatchParameterAccess().getEqualsSignKeyword_5_2());
                        
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:463:1: ( (lv_pattern_9_0= RULE_STRING ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:464:1: (lv_pattern_9_0= RULE_STRING )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:464:1: (lv_pattern_9_0= RULE_STRING )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:465:3: lv_pattern_9_0= RULE_STRING
                    {
                    lv_pattern_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBatchParameter928); 

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

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:481:4: ( (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21||LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:481:5: (otherlv_10= ',' )? ( (lv_required_11_0= 'required' ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:481:5: (otherlv_10= ',' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==21) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:481:7: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleBatchParameter949); 

                                	newLeafNode(otherlv_10, grammarAccess.getBatchParameterAccess().getCommaKeyword_6_0());
                                

                            }
                            break;

                    }

                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:485:3: ( (lv_required_11_0= 'required' ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:486:1: (lv_required_11_0= 'required' )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:486:1: (lv_required_11_0= 'required' )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:487:3: lv_required_11_0= 'required'
                    {
                    lv_required_11_0=(Token)match(input,23,FOLLOW_23_in_ruleBatchParameter969); 

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

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleBatchParameter996); 

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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:512:1: entryRuleBatchStatement returns [EObject current=null] : iv_ruleBatchStatement= ruleBatchStatement EOF ;
    public final EObject entryRuleBatchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchStatement = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:513:2: (iv_ruleBatchStatement= ruleBatchStatement EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:514:2: iv_ruleBatchStatement= ruleBatchStatement EOF
            {
             newCompositeNode(grammarAccess.getBatchStatementRule()); 
            pushFollow(FOLLOW_ruleBatchStatement_in_entryRuleBatchStatement1032);
            iv_ruleBatchStatement=ruleBatchStatement();

            state._fsp--;

             current =iv_ruleBatchStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBatchStatement1042); 

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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:521:1: ruleBatchStatement returns [EObject current=null] : (otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) (otherlv_5= 'soon' | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )? ) ;
    public final EObject ruleBatchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
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
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:524:28: ( (otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) (otherlv_5= 'soon' | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )? ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:525:1: (otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) (otherlv_5= 'soon' | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )? )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:525:1: (otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) (otherlv_5= 'soon' | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )? )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:525:3: otherlv_0= 'run' ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) ) (otherlv_5= 'soon' | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) ) (otherlv_10= ';' | otherlv_11= '.' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleBatchStatement1079); 

                	newLeafNode(otherlv_0, grammarAccess.getBatchStatementAccess().getRunKeyword_0());
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:529:1: ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:529:2: ( (lv_name_1_0= ruleFQN ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:529:2: ( (lv_name_1_0= ruleFQN ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:530:1: (lv_name_1_0= ruleFQN )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:530:1: (lv_name_1_0= ruleFQN )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:531:3: lv_name_1_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getBatchStatementAccess().getNameFQNParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleBatchStatement1101);
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
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:548:6: ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:548:6: ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:548:7: ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:548:7: ( (lv_jobName_2_0= ruleFQN ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:549:1: (lv_jobName_2_0= ruleFQN )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:549:1: (lv_jobName_2_0= ruleFQN )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:550:3: lv_jobName_2_0= ruleFQN
                    {
                     
                    	        newCompositeNode(grammarAccess.getBatchStatementAccess().getJobNameFQNParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleBatchStatement1129);
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

                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleBatchStatement1141); 

                        	newLeafNode(otherlv_3, grammarAccess.getBatchStatementAccess().getAsKeyword_1_1_1());
                        
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:570:1: ( (lv_name_4_0= ruleName ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:571:1: (lv_name_4_0= ruleName )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:571:1: (lv_name_4_0= ruleName )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:572:3: lv_name_4_0= ruleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getBatchStatementAccess().getNameNameParserRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_ruleBatchStatement1162);
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

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:588:4: (otherlv_5= 'soon' | (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            else if ( (LA19_0==28) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:588:6: otherlv_5= 'soon'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleBatchStatement1177); 

                        	newLeafNode(otherlv_5, grammarAccess.getBatchStatementAccess().getSoonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:593:6: (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:593:6: (otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:593:8: otherlv_6= 'after' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleBatchStatement1196); 

                        	newLeafNode(otherlv_6, grammarAccess.getBatchStatementAccess().getAfterKeyword_2_1_0());
                        
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:597:1: ( (otherlv_7= RULE_ID ) )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:598:1: (otherlv_7= RULE_ID )
                    {
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:598:1: (otherlv_7= RULE_ID )
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:599:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBatchStatementRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBatchStatement1216); 

                    		newLeafNode(otherlv_7, grammarAccess.getBatchStatementAccess().getAfterBatchStatementCrossReference_2_1_1_0()); 
                    	

                    }


                    }

                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:610:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==21) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:610:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleBatchStatement1229); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getBatchStatementAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:614:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:615:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:615:1: (otherlv_9= RULE_ID )
                    	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:616:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBatchStatementRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBatchStatement1249); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getBatchStatementAccess().getAfterBatchStatementCrossReference_2_1_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:627:6: (otherlv_10= ';' | otherlv_11= '.' )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==11) ) {
                alt20=1;
            }
            else if ( (LA20_0==10) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:627:8: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,11,FOLLOW_11_in_ruleBatchStatement1266); 

                        	newLeafNode(otherlv_10, grammarAccess.getBatchStatementAccess().getSemicolonKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:632:7: otherlv_11= '.'
                    {
                    otherlv_11=(Token)match(input,10,FOLLOW_10_in_ruleBatchStatement1284); 

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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:644:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:645:2: (iv_ruleFQN= ruleFQN EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:646:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1323);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1334); 

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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:653:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;


         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:656:28: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:657:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:657:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:658:5: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {
             
                    newCompositeNode(grammarAccess.getFQNAccess().getNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleName_in_ruleFQN1381);
            this_Name_0=ruleName();

            state._fsp--;


            		current.merge(this_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:668:1: (kw= '.' this_Name_2= ruleName )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==10) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_ID||LA21_1==14||LA21_1==19||(LA21_1>=22 && LA21_1<=23)||(LA21_1>=25 && LA21_1<=28)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:669:2: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,10,FOLLOW_10_in_ruleFQN1400); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFQNAccess().getNameParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleName_in_ruleFQN1422);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    		current.merge(this_Name_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:693:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:694:2: (iv_ruleName= ruleName EOF )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:695:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1470);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1481); 

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
    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:702:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'batch' | kw= 'key' | kw= 'pattern' | kw= 'required' | kw= 'run' | kw= 'as' | kw= 'soon' | kw= 'after' ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:705:28: ( (this_ID_0= RULE_ID | kw= 'batch' | kw= 'key' | kw= 'pattern' | kw= 'required' | kw= 'run' | kw= 'as' | kw= 'soon' | kw= 'after' ) )
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:706:1: (this_ID_0= RULE_ID | kw= 'batch' | kw= 'key' | kw= 'pattern' | kw= 'required' | kw= 'run' | kw= 'as' | kw= 'soon' | kw= 'after' )
            {
            // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:706:1: (this_ID_0= RULE_ID | kw= 'batch' | kw= 'key' | kw= 'pattern' | kw= 'required' | kw= 'run' | kw= 'as' | kw= 'soon' | kw= 'after' )
            int alt22=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case 14:
                {
                alt22=2;
                }
                break;
            case 19:
                {
                alt22=3;
                }
                break;
            case 22:
                {
                alt22=4;
                }
                break;
            case 23:
                {
                alt22=5;
                }
                break;
            case 25:
                {
                alt22=6;
                }
                break;
            case 26:
                {
                alt22=7;
                }
                break;
            case 27:
                {
                alt22=8;
                }
                break;
            case 28:
                {
                alt22=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:706:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName1521); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:715:2: kw= 'batch'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleName1545); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getBatchKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:722:2: kw= 'key'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleName1564); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getKeyKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:729:2: kw= 'pattern'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleName1583); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getPatternKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:736:2: kw= 'required'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleName1602); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getRequiredKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:743:2: kw= 'run'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleName1621); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getRunKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:750:2: kw= 'as'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleName1640); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getAsKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:757:2: kw= 'soon'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleName1659); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getSoonKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../afw_batch_dsl/src-gen/jp/hishidama/xtext/afw/batch_dsl/parser/antlr/internal/InternalBatchDsl.g:764:2: kw= 'after'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleName1678); 

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


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\26\uffff";
    static final String DFA17_eofS =
        "\26\uffff";
    static final String DFA17_minS =
        "\1\5\11\12\1\5\2\uffff\11\12";
    static final String DFA17_maxS =
        "\13\34\2\uffff\11\34";
    static final String DFA17_acceptS =
        "\13\uffff\1\2\1\1\11\uffff";
    static final String DFA17_specialS =
        "\26\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\10\uffff\1\2\4\uffff\1\3\2\uffff\1\4\1\5\1\uffff\1\6\1"+
            "\7\1\10\1\11",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\15\10\uffff\1\16\4\uffff\1\17\2\uffff\1\20\1\21\1\uffff"+
            "\1\22\1\23\1\24\1\25",
            "",
            "",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14",
            "\1\12\17\uffff\1\13\2\14"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "529:1: ( ( (lv_name_1_0= ruleFQN ) ) | ( ( (lv_jobName_2_0= ruleFQN ) ) otherlv_3= 'as' ( (lv_name_4_0= ruleName ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleScript131 = new BitSet(new long[]{0x0000000000025012L});
    public static final BitSet FOLLOW_ruleImport_in_ruleScript152 = new BitSet(new long[]{0x0000000000025012L});
    public static final BitSet FOLLOW_ruleBatchDsl_in_ruleScript174 = new BitSet(new long[]{0x0000000000024012L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rulePackage258 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_rulePackage279 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_10_in_rulePackage292 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_rulePackage313 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_11_in_rulePackage328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport413 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleImport434 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_10_in_ruleImport447 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImport465 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleImport493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchDsl_in_entryRuleBatchDsl531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchDsl541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBatchDsl583 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleBatchParameter_in_ruleBatchDsl610 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleBatchDsl623 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_ruleBatchDsl644 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBatchDsl656 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_ruleBatchStatement_in_ruleBatchDsl677 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_16_in_ruleBatchDsl690 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleBatchDsl703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchParameter_in_entryRuleBatchParameter741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchParameter751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBatchParameter788 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBatchParameter800 = new BitSet(new long[]{0x000000001EC84030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBatchParameter817 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_19_in_ruleBatchParameter836 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBatchParameter848 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_ruleBatchParameter871 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_21_in_ruleBatchParameter885 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBatchParameter899 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBatchParameter911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBatchParameter928 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_21_in_ruleBatchParameter949 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBatchParameter969 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBatchParameter996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBatchStatement_in_entryRuleBatchStatement1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBatchStatement1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBatchStatement1079 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBatchStatement1101 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBatchStatement1129 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBatchStatement1141 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_ruleBatchStatement1162 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleBatchStatement1177 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_28_in_ruleBatchStatement1196 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBatchStatement1216 = new BitSet(new long[]{0x0000000000200C02L});
    public static final BitSet FOLLOW_21_in_ruleBatchStatement1229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBatchStatement1249 = new BitSet(new long[]{0x0000000000200C02L});
    public static final BitSet FOLLOW_11_in_ruleBatchStatement1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleBatchStatement1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleFQN1381 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_ruleFQN1400 = new BitSet(new long[]{0x000000001EC84020L});
    public static final BitSet FOLLOW_ruleName_in_ruleFQN1422 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleName1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleName1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleName1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleName1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleName1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleName1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleName1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleName1678 = new BitSet(new long[]{0x0000000000000002L});

}