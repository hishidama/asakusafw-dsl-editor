package jp.hishidama.xtext.afw.flow_dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFlowDslLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
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

    public InternalFlowDslLexer() {;} 
    public InternalFlowDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFlowDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:11:6: ( ';' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:11:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:12:7: ( '.' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:13:7: ( 'operator' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:13:9: 'operator'
            {
            match("operator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:14:7: ( 'jobflow' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:14:9: 'jobflow'
            {
            match("jobflow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:15:7: ( 'in' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:15:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:16:7: ( 'out' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:16:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:17:7: ( 'as' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:17:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:18:7: ( 'importer' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:18:9: 'importer'
            {
            match("importer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:19:7: ( 'exporter' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:19:9: 'exporter'
            {
            match("exporter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:20:7: ( 'package' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:20:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:21:7: ( 'import' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:21:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:22:7: ( '(' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:23:7: ( ')' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:24:7: ( '{' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:25:7: ( '}' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:26:7: ( ',' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:27:7: ( '=' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:28:7: ( '+=' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:28:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:29:7: ( '*' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:29:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3902:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3902:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3902:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3902:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3902:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3904:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3904:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3904:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3904:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3904:65: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3906:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3906:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3906:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3906:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:17: ( ( '//' | '--' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:19: ( '//' | '--' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:19: ( '//' | '--' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='/') ) {
                alt5=1;
            }
            else if ( (LA5_0=='-') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:20: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:25: '--'
                    {
                    match("--"); 


                    }
                    break;

            }

            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:31: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:47: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:48: ( '\\r' )? '\\n'
                    {
                    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:48: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3908:48: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3910:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3910:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:3910:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt10=24;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:123: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:131: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:143: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../afw_flow_dsl.ui/src-gen/jp/hishidama/xtext/afw/flow_dsl/ui/contentassist/antlr/internal/InternalFlowDsl.g:1:175: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\3\uffff\6\21\15\uffff\3\21\1\42\1\21\1\44\2\21\1\uffff\1\21\1"+
        "\50\1\21\1\uffff\1\21\1\uffff\3\21\1\uffff\13\21\1\72\3\21\1\76"+
        "\1\21\1\uffff\1\21\1\101\1\102\1\uffff\1\103\1\104\4\uffff";
    static final String DFA10_eofS =
        "\105\uffff";
    static final String DFA10_minS =
        "\1\11\2\uffff\1\160\1\157\1\155\1\163\1\170\1\141\12\uffff\1\52"+
        "\2\uffff\1\145\1\164\1\142\1\60\1\160\1\60\1\160\1\143\1\uffff\1"+
        "\162\1\60\1\146\1\uffff\1\157\1\uffff\1\157\1\153\1\141\1\uffff"+
        "\1\154\2\162\1\141\1\164\1\157\2\164\1\147\1\157\1\167\1\60\2\145"+
        "\1\162\1\60\1\162\1\uffff\1\162\2\60\1\uffff\2\60\4\uffff";
    static final String DFA10_maxS =
        "\1\175\2\uffff\1\165\1\157\1\156\1\163\1\170\1\141\12\uffff\1\57"+
        "\2\uffff\1\145\1\164\1\142\1\172\1\160\1\172\1\160\1\143\1\uffff"+
        "\1\162\1\172\1\146\1\uffff\1\157\1\uffff\1\157\1\153\1\141\1\uffff"+
        "\1\154\2\162\1\141\1\164\1\157\2\164\1\147\1\157\1\167\1\172\2\145"+
        "\1\162\1\172\1\162\1\uffff\1\162\2\172\1\uffff\2\172\4\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\6\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
        "\1\24\1\25\1\uffff\1\27\1\30\10\uffff\1\26\3\uffff\1\5\1\uffff\1"+
        "\7\3\uffff\1\6\21\uffff\1\13\3\uffff\1\4\2\uffff\1\12\1\3\1\10\1"+
        "\11";
    static final String DFA10_specialS =
        "\105\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\1\uffff\1\22\5\uffff\1\11"+
            "\1\12\1\20\1\17\1\15\1\24\1\2\1\23\13\uffff\1\1\1\uffff\1\16"+
            "\3\uffff\32\21\3\uffff\2\21\1\uffff\1\6\3\21\1\7\3\21\1\5\1"+
            "\4\4\21\1\3\1\10\12\21\1\13\1\uffff\1\14",
            "",
            "",
            "\1\26\4\uffff\1\27",
            "\1\30",
            "\1\32\1\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\4\uffff\1\24",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\43",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\45",
            "\1\46",
            "",
            "\1\47",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\51",
            "",
            "\1\52",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\4\21\1\71\25\21",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\77",
            "",
            "\1\100",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}