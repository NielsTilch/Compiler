// $ANTLR 3.5.1 /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g 2020-12-24 13:34:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class bloodClassLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int ATTRIB=4;
	public static final int BLOC=5;
	public static final int CAST=6;
	public static final int CLASS=7;
	public static final int CLASSE=8;
	public static final int CLASSNAME=9;
	public static final int COMMENT=10;
	public static final int COND_EXP=11;
	public static final int CONSTR=12;
	public static final int DECL_VAR=13;
	public static final int DEF_BLOC=14;
	public static final int DEF_METH_CONS=15;
	public static final int ENVOI_MESS=16;
	public static final int ENVOI_MESS_CONS=17;
	public static final int EXP_CONST=18;
	public static final int EXTENDS=19;
	public static final int IF=20;
	public static final int INSTAN=21;
	public static final int METHODE_DEF=22;
	public static final int NAME=23;
	public static final int NB=24;
	public static final int NEW=25;
	public static final int PARAM=26;
	public static final int RESULT=27;
	public static final int ROOT=28;
	public static final int STRING=29;
	public static final int SUPER_CONS=30;
	public static final int WHILE=31;
	public static final int WS=32;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public bloodClassLexer() {} 
	public bloodClassLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public bloodClassLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g"; }

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:7:7: ( ' is' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:7:9: ' is'
			{
			match(" is"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:8:7: ( '&' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:8:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:9:7: ( '(' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:9:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:10:7: ( ')' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:10:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:11:7: ( '*' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:11:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:12:7: ( '+' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:12:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:13:7: ( ',' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:13:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:14:7: ( '-' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:14:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:15:7: ( '.' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:15:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:16:7: ( '/' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:16:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:17:7: ( ':' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:17:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:18:7: ( ':=' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:18:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:19:7: ( ';' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:19:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:20:7: ( '<' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:20:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:21:7: ( '<>' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:21:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:22:7: ( '=' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:22:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:23:7: ( '>' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:23:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:24:7: ( 'Integer' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:24:9: 'Integer'
			{
			match("Integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:25:7: ( 'String' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:25:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:26:7: ( 'as' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:26:9: 'as'
			{
			match("as"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:27:7: ( 'class' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:27:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:28:7: ( 'def' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:28:9: 'def'
			{
			match("def"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:29:7: ( 'do' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:29:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:30:7: ( 'else' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:30:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:31:7: ( 'extends' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:31:9: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:32:7: ( 'if' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:32:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:33:7: ( 'is' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:33:9: 'is'
			{
			match("is"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:34:7: ( 'new' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:34:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:35:7: ( 'override' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:35:9: 'override'
			{
			match("override"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:36:7: ( 'result' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:36:9: 'result'
			{
			match("result"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:37:7: ( 'return' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:37:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:38:7: ( 'static' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:38:9: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:39:7: ( 'super' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:39:9: 'super'
			{
			match("super"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:40:7: ( 'then' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:40:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:41:7: ( 'this' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:41:9: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:42:7: ( 'var' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:42:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:7: ( 'while' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:44:7: ( '{' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:44:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:45:7: ( '}' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:45:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:230:7: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:230:9: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:230:20: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "CLASSNAME"
	public final void mCLASSNAME() throws RecognitionException {
		try {
			int _type = CLASSNAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:234:2: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:234:4: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:234:15: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASSNAME"

	// $ANTLR start "NB"
	public final void mNB() throws RecognitionException {
		try {
			int _type = NB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:237:5: ( ( '-' | '+' )? ( '0' .. '9' )+ )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:237:7: ( '-' | '+' )? ( '0' .. '9' )+
			{
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:237:7: ( '-' | '+' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='+'||LA3_0=='-') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:237:17: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NB"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:242:9: ( '\"' (~ '\"' )* '\"' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:242:11: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:242:15: (~ '\"' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:246:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:246:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:246:17: ( options {greedy=false; } : . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						alt6=2;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:246:45: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:249:4: ( ( '\\n' | '\\r' | ' ' | '\\t' )+ )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:249:6: ( '\\n' | '\\r' | ' ' | '\\t' )+
			{
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:249:6: ( '\\n' | '\\r' | ' ' | '\\t' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | NAME | CLASSNAME | NB | STRING | COMMENT | WS )
		int alt8=45;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:10: T__33
				{
				mT__33(); 

				}
				break;
			case 2 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:16: T__34
				{
				mT__34(); 

				}
				break;
			case 3 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:22: T__35
				{
				mT__35(); 

				}
				break;
			case 4 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:28: T__36
				{
				mT__36(); 

				}
				break;
			case 5 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:34: T__37
				{
				mT__37(); 

				}
				break;
			case 6 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:40: T__38
				{
				mT__38(); 

				}
				break;
			case 7 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:46: T__39
				{
				mT__39(); 

				}
				break;
			case 8 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:52: T__40
				{
				mT__40(); 

				}
				break;
			case 9 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:58: T__41
				{
				mT__41(); 

				}
				break;
			case 10 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:64: T__42
				{
				mT__42(); 

				}
				break;
			case 11 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:70: T__43
				{
				mT__43(); 

				}
				break;
			case 12 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:76: T__44
				{
				mT__44(); 

				}
				break;
			case 13 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:82: T__45
				{
				mT__45(); 

				}
				break;
			case 14 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:88: T__46
				{
				mT__46(); 

				}
				break;
			case 15 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:94: T__47
				{
				mT__47(); 

				}
				break;
			case 16 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:100: T__48
				{
				mT__48(); 

				}
				break;
			case 17 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:106: T__49
				{
				mT__49(); 

				}
				break;
			case 18 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:112: T__50
				{
				mT__50(); 

				}
				break;
			case 19 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:118: T__51
				{
				mT__51(); 

				}
				break;
			case 20 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:124: T__52
				{
				mT__52(); 

				}
				break;
			case 21 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:130: T__53
				{
				mT__53(); 

				}
				break;
			case 22 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:136: T__54
				{
				mT__54(); 

				}
				break;
			case 23 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:142: T__55
				{
				mT__55(); 

				}
				break;
			case 24 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:148: T__56
				{
				mT__56(); 

				}
				break;
			case 25 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:154: T__57
				{
				mT__57(); 

				}
				break;
			case 26 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:160: T__58
				{
				mT__58(); 

				}
				break;
			case 27 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:166: T__59
				{
				mT__59(); 

				}
				break;
			case 28 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:172: T__60
				{
				mT__60(); 

				}
				break;
			case 29 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:178: T__61
				{
				mT__61(); 

				}
				break;
			case 30 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:184: T__62
				{
				mT__62(); 

				}
				break;
			case 31 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:190: T__63
				{
				mT__63(); 

				}
				break;
			case 32 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:196: T__64
				{
				mT__64(); 

				}
				break;
			case 33 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:202: T__65
				{
				mT__65(); 

				}
				break;
			case 34 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:208: T__66
				{
				mT__66(); 

				}
				break;
			case 35 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:214: T__67
				{
				mT__67(); 

				}
				break;
			case 36 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:220: T__68
				{
				mT__68(); 

				}
				break;
			case 37 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:226: T__69
				{
				mT__69(); 

				}
				break;
			case 38 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:232: T__70
				{
				mT__70(); 

				}
				break;
			case 39 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:238: T__71
				{
				mT__71(); 

				}
				break;
			case 40 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:244: NAME
				{
				mNAME(); 

				}
				break;
			case 41 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:249: CLASSNAME
				{
				mCLASSNAME(); 

				}
				break;
			case 42 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:259: NB
				{
				mNB(); 

				}
				break;
			case 43 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:262: STRING
				{
				mSTRING(); 

				}
				break;
			case 44 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:269: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 45 :
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:1:277: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\1\uffff\1\44\4\uffff\1\46\1\uffff\1\47\1\uffff\1\51\1\53\1\uffff\1\55"+
		"\2\uffff\2\41\14\40\20\uffff\2\41\1\102\2\40\1\105\2\40\1\110\1\111\10"+
		"\40\2\41\1\uffff\1\40\1\127\1\uffff\2\40\2\uffff\1\132\7\40\1\142\1\40"+
		"\2\41\1\40\1\uffff\1\147\1\40\1\uffff\5\40\1\156\1\157\1\uffff\1\40\2"+
		"\41\1\163\1\uffff\5\40\1\171\2\uffff\1\172\1\41\1\174\1\uffff\2\40\1\177"+
		"\1\u0080\1\u0081\2\uffff\1\u0082\1\uffff\1\u0083\1\40\5\uffff\1\u0085"+
		"\1\uffff";
	static final String DFA8_eofS =
		"\u0086\uffff";
	static final String DFA8_minS =
		"\1\11\1\151\4\uffff\1\60\1\uffff\1\60\1\uffff\1\52\1\75\1\uffff\1\76\2"+
		"\uffff\1\156\1\164\1\163\1\154\1\145\1\154\1\146\1\145\1\166\1\145\1\164"+
		"\1\150\1\141\1\150\20\uffff\1\164\1\162\1\60\1\141\1\146\1\60\1\163\1"+
		"\164\2\60\1\167\1\145\1\163\1\141\1\160\1\145\1\162\1\151\1\145\1\151"+
		"\1\uffff\1\163\1\60\1\uffff\2\145\2\uffff\1\60\1\162\2\165\1\164\1\145"+
		"\1\156\1\163\1\60\1\154\1\147\1\156\1\163\1\uffff\1\60\1\156\1\uffff\1"+
		"\162\1\154\1\162\1\151\1\162\2\60\1\uffff\2\145\1\147\1\60\1\uffff\1\144"+
		"\1\151\1\164\1\156\1\143\1\60\2\uffff\1\60\1\162\1\60\1\uffff\1\163\1"+
		"\144\3\60\2\uffff\1\60\1\uffff\1\60\1\145\5\uffff\1\60\1\uffff";
	static final String DFA8_maxS =
		"\1\175\1\151\4\uffff\1\71\1\uffff\1\71\1\uffff\1\52\1\75\1\uffff\1\76"+
		"\2\uffff\1\156\1\164\1\163\1\154\1\157\1\170\1\163\1\145\1\166\1\145\1"+
		"\165\1\150\1\141\1\150\20\uffff\1\164\1\162\1\172\1\141\1\146\1\172\1"+
		"\163\1\164\2\172\1\167\1\145\1\164\1\141\1\160\1\151\1\162\1\151\1\145"+
		"\1\151\1\uffff\1\163\1\172\1\uffff\2\145\2\uffff\1\172\1\162\2\165\1\164"+
		"\1\145\1\156\1\163\1\172\1\154\1\147\1\156\1\163\1\uffff\1\172\1\156\1"+
		"\uffff\1\162\1\154\1\162\1\151\1\162\2\172\1\uffff\2\145\1\147\1\172\1"+
		"\uffff\1\144\1\151\1\164\1\156\1\143\1\172\2\uffff\1\172\1\162\1\172\1"+
		"\uffff\1\163\1\144\3\172\2\uffff\1\172\1\uffff\1\172\1\145\5\uffff\1\172"+
		"\1\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\uffff\1\11\2\uffff\1\15\1\uffff"+
		"\1\20\1\21\16\uffff\1\46\1\47\1\50\1\51\1\52\1\53\1\55\1\1\1\6\1\10\1"+
		"\54\1\12\1\14\1\13\1\17\1\16\24\uffff\1\24\2\uffff\1\27\2\uffff\1\32\1"+
		"\33\15\uffff\1\26\2\uffff\1\34\7\uffff\1\44\4\uffff\1\30\6\uffff\1\42"+
		"\1\43\3\uffff\1\25\5\uffff\1\41\1\45\1\uffff\1\23\2\uffff\1\36\1\37\1"+
		"\40\1\22\1\31\1\uffff\1\35";
	static final String DFA8_specialS =
		"\u0086\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\1\1\uffff\1\43\3\uffff\1\2\1\uffff\1\3"+
			"\1\4\1\5\1\6\1\7\1\10\1\11\1\12\12\42\1\13\1\14\1\15\1\16\1\17\2\uffff"+
			"\10\41\1\20\11\41\1\21\7\41\6\uffff\1\22\1\40\1\23\1\24\1\25\3\40\1\26"+
			"\4\40\1\27\1\30\2\40\1\31\1\32\1\33\1\40\1\34\1\35\3\40\1\36\1\uffff"+
			"\1\37",
			"\1\45",
			"",
			"",
			"",
			"",
			"\12\42",
			"",
			"\12\42",
			"",
			"\1\50",
			"\1\52",
			"",
			"\1\54",
			"",
			"",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62\11\uffff\1\63",
			"\1\64\13\uffff\1\65",
			"\1\66\14\uffff\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\100",
			"\1\101",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\103",
			"\1\104",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\106",
			"\1\107",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\112",
			"\1\113",
			"\1\114\1\115",
			"\1\116",
			"\1\117",
			"\1\120\3\uffff\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"",
			"\1\126",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\130",
			"\1\131",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\150",
			"",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\160",
			"\1\161",
			"\1\162",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\173",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\1\175",
			"\1\176",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"\12\41\7\uffff\32\41\6\uffff\32\41",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\u0084",
			"",
			"",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | NAME | CLASSNAME | NB | STRING | COMMENT | WS );";
		}
	}

}
