// $ANTLR 3.5.1 /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g 2021-02-15 11:05:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class bloodResetParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATOM", "ATTRIBDEF", "BLOC", "BLOCCLASSE", 
		"BLOCPRINCIPAL", "CAST", "CLASSDEF", "CLASSNAME", "COMMENT", "CONSDEF", 
		"DECLVARIABLE", "ELSE", "EXTENDS", "FORMALPARAM", "IF", "INST", "LISTDECLVARIABLE", 
		"LISTFORMALPARAM", "LISTINSTRUCT", "LISTOPERATEURS", "LISTPARAM", "LISTPARAMAPPELCONSTR", 
		"MESSAGE", "MESSOUSELECT", "METHODEDEF", "NAME", "NB", "PARAM", "ROOT", 
		"SELECT", "STR", "STRING", "THEN", "TYPERETOUR", "WHILE", "WS", "' is'", 
		"'&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", 
		"':='", "';'", "'<'", "'<>'", "'='", "'>'", "'Integer'", "'String'", "'as'", 
		"'class'", "'def'", "'do'", "'else'", "'extends'", "'if'", "'is'", "'new'", 
		"'override'", "'result'", "'return'", "'static'", "'super'", "'then'", 
		"'this'", "'var'", "'while'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int ATOM=4;
	public static final int ATTRIBDEF=5;
	public static final int BLOC=6;
	public static final int BLOCCLASSE=7;
	public static final int BLOCPRINCIPAL=8;
	public static final int CAST=9;
	public static final int CLASSDEF=10;
	public static final int CLASSNAME=11;
	public static final int COMMENT=12;
	public static final int CONSDEF=13;
	public static final int DECLVARIABLE=14;
	public static final int ELSE=15;
	public static final int EXTENDS=16;
	public static final int FORMALPARAM=17;
	public static final int IF=18;
	public static final int INST=19;
	public static final int LISTDECLVARIABLE=20;
	public static final int LISTFORMALPARAM=21;
	public static final int LISTINSTRUCT=22;
	public static final int LISTOPERATEURS=23;
	public static final int LISTPARAM=24;
	public static final int LISTPARAMAPPELCONSTR=25;
	public static final int MESSAGE=26;
	public static final int MESSOUSELECT=27;
	public static final int METHODEDEF=28;
	public static final int NAME=29;
	public static final int NB=30;
	public static final int PARAM=31;
	public static final int ROOT=32;
	public static final int SELECT=33;
	public static final int STR=34;
	public static final int STRING=35;
	public static final int THEN=36;
	public static final int TYPERETOUR=37;
	public static final int WHILE=38;
	public static final int WS=39;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public bloodResetParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public bloodResetParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return bloodResetParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:43:1: prog : ( classDef )* progPrincipal -> ^( ROOT ( classDef )* progPrincipal ) ;
	public final prog_return prog() throws RecognitionException {
		prog_return retval = new prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope classDef1 =null;
		ParserRuleReturnScope progPrincipal2 =null;

		RewriteRuleSubtreeStream stream_progPrincipal=new RewriteRuleSubtreeStream(adaptor,"rule progPrincipal");
		RewriteRuleSubtreeStream stream_classDef=new RewriteRuleSubtreeStream(adaptor,"rule classDef");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:43:6: ( ( classDef )* progPrincipal -> ^( ROOT ( classDef )* progPrincipal ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:43:8: ( classDef )* progPrincipal
			{
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:43:8: ( classDef )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==60) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:43:8: classDef
					{
					pushFollow(FOLLOW_classDef_in_prog136);
					classDef1=classDef();
					state._fsp--;

					stream_classDef.add(classDef1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_progPrincipal_in_prog139);
			progPrincipal2=progPrincipal();
			state._fsp--;

			stream_progPrincipal.add(progPrincipal2.getTree());
			// AST REWRITE
			// elements: progPrincipal, classDef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 43:32: -> ^( ROOT ( classDef )* progPrincipal )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:43:35: ^( ROOT ( classDef )* progPrincipal )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:43:42: ( classDef )*
				while ( stream_classDef.hasNext() ) {
					adaptor.addChild(root_1, stream_classDef.nextTree());
				}
				stream_classDef.reset();

				adaptor.addChild(root_1, stream_progPrincipal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class progPrincipal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "progPrincipal"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:47:1: progPrincipal : '{' ( instruction )* '}' -> ^( BLOCPRINCIPAL ( instruction )* ) ;
	public final progPrincipal_return progPrincipal() throws RecognitionException {
		progPrincipal_return retval = new progPrincipal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal3=null;
		Token char_literal5=null;
		ParserRuleReturnScope instruction4 =null;

		Object char_literal3_tree=null;
		Object char_literal5_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:48:2: ( '{' ( instruction )* '}' -> ^( BLOCPRINCIPAL ( instruction )* ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:48:3: '{' ( instruction )* '}'
			{
			char_literal3=(Token)match(input,77,FOLLOW_77_in_progPrincipal161);  
			stream_77.add(char_literal3);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:48:7: ( instruction )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CLASSNAME||(LA2_0 >= NAME && LA2_0 <= NB)||LA2_0==STRING||LA2_0==42||LA2_0==45||LA2_0==47||(LA2_0 >= 57 && LA2_0 <= 58)||(LA2_0 >= 65 && LA2_0 <= 67)||(LA2_0 >= 69 && LA2_0 <= 70)||LA2_0==72||LA2_0==74||(LA2_0 >= 76 && LA2_0 <= 77)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:48:7: instruction
					{
					pushFollow(FOLLOW_instruction_in_progPrincipal163);
					instruction4=instruction();
					state._fsp--;

					stream_instruction.add(instruction4.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			char_literal5=(Token)match(input,78,FOLLOW_78_in_progPrincipal166);  
			stream_78.add(char_literal5);

			// AST REWRITE
			// elements: instruction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 48:24: -> ^( BLOCPRINCIPAL ( instruction )* )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:48:27: ^( BLOCPRINCIPAL ( instruction )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCPRINCIPAL, "BLOCPRINCIPAL"), root_1);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:48:43: ( instruction )*
				while ( stream_instruction.hasNext() ) {
					adaptor.addChild(root_1, stream_instruction.nextTree());
				}
				stream_instruction.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "progPrincipal"


	public static class classDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "classDef"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:52:1: classDef : 'class' CLASSNAME '(' ( formalOuPas ( ',' formalOuPas )* )? ')' choixHeritage -> ^( CLASSDEF CLASSNAME ^( LISTFORMALPARAM ( formalOuPas )* ) choixHeritage ) ;
	public final classDef_return classDef() throws RecognitionException {
		classDef_return retval = new classDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal6=null;
		Token CLASSNAME7=null;
		Token char_literal8=null;
		Token char_literal10=null;
		Token char_literal12=null;
		ParserRuleReturnScope formalOuPas9 =null;
		ParserRuleReturnScope formalOuPas11 =null;
		ParserRuleReturnScope choixHeritage13 =null;

		Object string_literal6_tree=null;
		Object CLASSNAME7_tree=null;
		Object char_literal8_tree=null;
		Object char_literal10_tree=null;
		Object char_literal12_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_CLASSNAME=new RewriteRuleTokenStream(adaptor,"token CLASSNAME");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_formalOuPas=new RewriteRuleSubtreeStream(adaptor,"rule formalOuPas");
		RewriteRuleSubtreeStream stream_choixHeritage=new RewriteRuleSubtreeStream(adaptor,"rule choixHeritage");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:2: ( 'class' CLASSNAME '(' ( formalOuPas ( ',' formalOuPas )* )? ')' choixHeritage -> ^( CLASSDEF CLASSNAME ^( LISTFORMALPARAM ( formalOuPas )* ) choixHeritage ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:3: 'class' CLASSNAME '(' ( formalOuPas ( ',' formalOuPas )* )? ')' choixHeritage
			{
			string_literal6=(Token)match(input,60,FOLLOW_60_in_classDef186);  
			stream_60.add(string_literal6);

			CLASSNAME7=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_classDef188);  
			stream_CLASSNAME.add(CLASSNAME7);

			char_literal8=(Token)match(input,42,FOLLOW_42_in_classDef190);  
			stream_42.add(char_literal8);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:25: ( formalOuPas ( ',' formalOuPas )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==NAME||LA4_0==75) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:26: formalOuPas ( ',' formalOuPas )*
					{
					pushFollow(FOLLOW_formalOuPas_in_classDef193);
					formalOuPas9=formalOuPas();
					state._fsp--;

					stream_formalOuPas.add(formalOuPas9.getTree());
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:38: ( ',' formalOuPas )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==46) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:39: ',' formalOuPas
							{
							char_literal10=(Token)match(input,46,FOLLOW_46_in_classDef196);  
							stream_46.add(char_literal10);

							pushFollow(FOLLOW_formalOuPas_in_classDef198);
							formalOuPas11=formalOuPas();
							state._fsp--;

							stream_formalOuPas.add(formalOuPas11.getTree());
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			char_literal12=(Token)match(input,43,FOLLOW_43_in_classDef204);  
			stream_43.add(char_literal12);

			pushFollow(FOLLOW_choixHeritage_in_classDef206);
			choixHeritage13=choixHeritage();
			state._fsp--;

			stream_choixHeritage.add(choixHeritage13.getTree());
			// AST REWRITE
			// elements: formalOuPas, CLASSNAME, choixHeritage
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:77: -> ^( CLASSDEF CLASSNAME ^( LISTFORMALPARAM ( formalOuPas )* ) choixHeritage )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:80: ^( CLASSDEF CLASSNAME ^( LISTFORMALPARAM ( formalOuPas )* ) choixHeritage )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASSDEF, "CLASSDEF"), root_1);
				adaptor.addChild(root_1, stream_CLASSNAME.nextNode());
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:101: ^( LISTFORMALPARAM ( formalOuPas )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTFORMALPARAM, "LISTFORMALPARAM"), root_2);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:53:119: ( formalOuPas )*
				while ( stream_formalOuPas.hasNext() ) {
					adaptor.addChild(root_2, stream_formalOuPas.nextTree());
				}
				stream_formalOuPas.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_choixHeritage.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classDef"


	public static class choixHeritage_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "choixHeritage"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:56:1: choixHeritage : ( 'extends' CLASSNAME ' is' '{' blocDeClasse '}' -> ^( EXTENDS CLASSNAME ) ^( BLOCCLASSE blocDeClasse ) | ' is' '{' blocDeClasse '}' -> ^( BLOCCLASSE blocDeClasse ) );
	public final choixHeritage_return choixHeritage() throws RecognitionException {
		choixHeritage_return retval = new choixHeritage_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal14=null;
		Token CLASSNAME15=null;
		Token string_literal16=null;
		Token char_literal17=null;
		Token char_literal19=null;
		Token string_literal20=null;
		Token char_literal21=null;
		Token char_literal23=null;
		ParserRuleReturnScope blocDeClasse18 =null;
		ParserRuleReturnScope blocDeClasse22 =null;

		Object string_literal14_tree=null;
		Object CLASSNAME15_tree=null;
		Object string_literal16_tree=null;
		Object char_literal17_tree=null;
		Object char_literal19_tree=null;
		Object string_literal20_tree=null;
		Object char_literal21_tree=null;
		Object char_literal23_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_CLASSNAME=new RewriteRuleTokenStream(adaptor,"token CLASSNAME");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_blocDeClasse=new RewriteRuleSubtreeStream(adaptor,"rule blocDeClasse");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:57:2: ( 'extends' CLASSNAME ' is' '{' blocDeClasse '}' -> ^( EXTENDS CLASSNAME ) ^( BLOCCLASSE blocDeClasse ) | ' is' '{' blocDeClasse '}' -> ^( BLOCCLASSE blocDeClasse ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==64) ) {
				alt5=1;
			}
			else if ( (LA5_0==40) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:57:3: 'extends' CLASSNAME ' is' '{' blocDeClasse '}'
					{
					string_literal14=(Token)match(input,64,FOLLOW_64_in_choixHeritage233);  
					stream_64.add(string_literal14);

					CLASSNAME15=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_choixHeritage235);  
					stream_CLASSNAME.add(CLASSNAME15);

					string_literal16=(Token)match(input,40,FOLLOW_40_in_choixHeritage237);  
					stream_40.add(string_literal16);

					char_literal17=(Token)match(input,77,FOLLOW_77_in_choixHeritage239);  
					stream_77.add(char_literal17);

					pushFollow(FOLLOW_blocDeClasse_in_choixHeritage240);
					blocDeClasse18=blocDeClasse();
					state._fsp--;

					stream_blocDeClasse.add(blocDeClasse18.getTree());
					char_literal19=(Token)match(input,78,FOLLOW_78_in_choixHeritage241);  
					stream_78.add(char_literal19);

					// AST REWRITE
					// elements: blocDeClasse, CLASSNAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 57:48: -> ^( EXTENDS CLASSNAME ) ^( BLOCCLASSE blocDeClasse )
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:57:51: ^( EXTENDS CLASSNAME )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXTENDS, "EXTENDS"), root_1);
						adaptor.addChild(root_1, stream_CLASSNAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:57:72: ^( BLOCCLASSE blocDeClasse )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCCLASSE, "BLOCCLASSE"), root_1);
						adaptor.addChild(root_1, stream_blocDeClasse.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:58:3: ' is' '{' blocDeClasse '}'
					{
					string_literal20=(Token)match(input,40,FOLLOW_40_in_choixHeritage259);  
					stream_40.add(string_literal20);

					char_literal21=(Token)match(input,77,FOLLOW_77_in_choixHeritage261);  
					stream_77.add(char_literal21);

					pushFollow(FOLLOW_blocDeClasse_in_choixHeritage262);
					blocDeClasse22=blocDeClasse();
					state._fsp--;

					stream_blocDeClasse.add(blocDeClasse22.getTree());
					char_literal23=(Token)match(input,78,FOLLOW_78_in_choixHeritage263);  
					stream_78.add(char_literal23);

					// AST REWRITE
					// elements: blocDeClasse
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 58:28: -> ^( BLOCCLASSE blocDeClasse )
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:58:31: ^( BLOCCLASSE blocDeClasse )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCCLASSE, "BLOCCLASSE"), root_1);
						adaptor.addChild(root_1, stream_blocDeClasse.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "choixHeritage"


	public static class blocDeClasse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "blocDeClasse"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:63:1: blocDeClasse : ( attribDef blocDeClasse | 'def' methodeOuCons -> methodeOuCons );
	public final blocDeClasse_return blocDeClasse() throws RecognitionException {
		blocDeClasse_return retval = new blocDeClasse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal26=null;
		ParserRuleReturnScope attribDef24 =null;
		ParserRuleReturnScope blocDeClasse25 =null;
		ParserRuleReturnScope methodeOuCons27 =null;

		Object string_literal26_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleSubtreeStream stream_methodeOuCons=new RewriteRuleSubtreeStream(adaptor,"rule methodeOuCons");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:64:2: ( attribDef blocDeClasse | 'def' methodeOuCons -> methodeOuCons )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==75) ) {
				alt6=1;
			}
			else if ( (LA6_0==61) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:64:3: attribDef blocDeClasse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attribDef_in_blocDeClasse283);
					attribDef24=attribDef();
					state._fsp--;

					adaptor.addChild(root_0, attribDef24.getTree());

					pushFollow(FOLLOW_blocDeClasse_in_blocDeClasse285);
					blocDeClasse25=blocDeClasse();
					state._fsp--;

					adaptor.addChild(root_0, blocDeClasse25.getTree());

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:66:3: 'def' methodeOuCons
					{
					string_literal26=(Token)match(input,61,FOLLOW_61_in_blocDeClasse291);  
					stream_61.add(string_literal26);

					pushFollow(FOLLOW_methodeOuCons_in_blocDeClasse293);
					methodeOuCons27=methodeOuCons();
					state._fsp--;

					stream_methodeOuCons.add(methodeOuCons27.getTree());
					// AST REWRITE
					// elements: methodeOuCons
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 66:23: -> methodeOuCons
					{
						adaptor.addChild(root_0, stream_methodeOuCons.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blocDeClasse"


	public static class methodeOuCons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodeOuCons"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:70:1: methodeOuCons : ( consDef ( blocSansCons )* | methodeDef blocDeClasse );
	public final methodeOuCons_return methodeOuCons() throws RecognitionException {
		methodeOuCons_return retval = new methodeOuCons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope consDef28 =null;
		ParserRuleReturnScope blocSansCons29 =null;
		ParserRuleReturnScope methodeDef30 =null;
		ParserRuleReturnScope blocDeClasse31 =null;


		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:71:2: ( consDef ( blocSansCons )* | methodeDef blocDeClasse )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==CLASSNAME) ) {
				alt8=1;
			}
			else if ( (LA8_0==NAME||LA8_0==68||LA8_0==71) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:71:3: consDef ( blocSansCons )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_consDef_in_methodeOuCons309);
					consDef28=consDef();
					state._fsp--;

					adaptor.addChild(root_0, consDef28.getTree());

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:71:11: ( blocSansCons )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==61||LA7_0==75) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:71:11: blocSansCons
							{
							pushFollow(FOLLOW_blocSansCons_in_methodeOuCons311);
							blocSansCons29=blocSansCons();
							state._fsp--;

							adaptor.addChild(root_0, blocSansCons29.getTree());

							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:73:3: methodeDef blocDeClasse
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_methodeDef_in_methodeOuCons318);
					methodeDef30=methodeDef();
					state._fsp--;

					adaptor.addChild(root_0, methodeDef30.getTree());

					pushFollow(FOLLOW_blocDeClasse_in_methodeOuCons320);
					blocDeClasse31=blocDeClasse();
					state._fsp--;

					adaptor.addChild(root_0, blocDeClasse31.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodeOuCons"


	public static class consDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "consDef"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:78:1: consDef : CLASSNAME '(' ( formalOuPas ( ',' formalOuPas )* )? ')' consSuper -> ^( CONSDEF CLASSNAME ^( LISTFORMALPARAM ( formalOuPas )* ) consSuper ) ;
	public final consDef_return consDef() throws RecognitionException {
		consDef_return retval = new consDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CLASSNAME32=null;
		Token char_literal33=null;
		Token char_literal35=null;
		Token char_literal37=null;
		ParserRuleReturnScope formalOuPas34 =null;
		ParserRuleReturnScope formalOuPas36 =null;
		ParserRuleReturnScope consSuper38 =null;

		Object CLASSNAME32_tree=null;
		Object char_literal33_tree=null;
		Object char_literal35_tree=null;
		Object char_literal37_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_CLASSNAME=new RewriteRuleTokenStream(adaptor,"token CLASSNAME");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_formalOuPas=new RewriteRuleSubtreeStream(adaptor,"rule formalOuPas");
		RewriteRuleSubtreeStream stream_consSuper=new RewriteRuleSubtreeStream(adaptor,"rule consSuper");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:2: ( CLASSNAME '(' ( formalOuPas ( ',' formalOuPas )* )? ')' consSuper -> ^( CONSDEF CLASSNAME ^( LISTFORMALPARAM ( formalOuPas )* ) consSuper ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:3: CLASSNAME '(' ( formalOuPas ( ',' formalOuPas )* )? ')' consSuper
			{
			CLASSNAME32=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_consDef333);  
			stream_CLASSNAME.add(CLASSNAME32);

			char_literal33=(Token)match(input,42,FOLLOW_42_in_consDef335);  
			stream_42.add(char_literal33);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:17: ( formalOuPas ( ',' formalOuPas )* )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==NAME||LA10_0==75) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:18: formalOuPas ( ',' formalOuPas )*
					{
					pushFollow(FOLLOW_formalOuPas_in_consDef338);
					formalOuPas34=formalOuPas();
					state._fsp--;

					stream_formalOuPas.add(formalOuPas34.getTree());
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:30: ( ',' formalOuPas )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==46) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:31: ',' formalOuPas
							{
							char_literal35=(Token)match(input,46,FOLLOW_46_in_consDef341);  
							stream_46.add(char_literal35);

							pushFollow(FOLLOW_formalOuPas_in_consDef343);
							formalOuPas36=formalOuPas();
							state._fsp--;

							stream_formalOuPas.add(formalOuPas36.getTree());
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;

			}

			char_literal37=(Token)match(input,43,FOLLOW_43_in_consDef349);  
			stream_43.add(char_literal37);

			pushFollow(FOLLOW_consSuper_in_consDef351);
			consSuper38=consSuper();
			state._fsp--;

			stream_consSuper.add(consSuper38.getTree());
			// AST REWRITE
			// elements: CLASSNAME, consSuper, formalOuPas
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:65: -> ^( CONSDEF CLASSNAME ^( LISTFORMALPARAM ( formalOuPas )* ) consSuper )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:68: ^( CONSDEF CLASSNAME ^( LISTFORMALPARAM ( formalOuPas )* ) consSuper )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSDEF, "CONSDEF"), root_1);
				adaptor.addChild(root_1, stream_CLASSNAME.nextNode());
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:88: ^( LISTFORMALPARAM ( formalOuPas )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTFORMALPARAM, "LISTFORMALPARAM"), root_2);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:79:106: ( formalOuPas )*
				while ( stream_formalOuPas.hasNext() ) {
					adaptor.addChild(root_2, stream_formalOuPas.nextTree());
				}
				stream_formalOuPas.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_consSuper.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "consDef"


	public static class consSuper_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "consSuper"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:82:1: consSuper : ( ' is' bloc -> bloc | ':' CLASSNAME '(' ( expression ( ',' expression )* )? ')' ' is' bloc -> ^( EXTENDS CLASSNAME ^( LISTFORMALPARAM ( expression )* ) ) bloc );
	public final consSuper_return consSuper() throws RecognitionException {
		consSuper_return retval = new consSuper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal39=null;
		Token char_literal41=null;
		Token CLASSNAME42=null;
		Token char_literal43=null;
		Token char_literal45=null;
		Token char_literal47=null;
		Token string_literal48=null;
		ParserRuleReturnScope bloc40 =null;
		ParserRuleReturnScope expression44 =null;
		ParserRuleReturnScope expression46 =null;
		ParserRuleReturnScope bloc49 =null;

		Object string_literal39_tree=null;
		Object char_literal41_tree=null;
		Object CLASSNAME42_tree=null;
		Object char_literal43_tree=null;
		Object char_literal45_tree=null;
		Object char_literal47_tree=null;
		Object string_literal48_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_CLASSNAME=new RewriteRuleTokenStream(adaptor,"token CLASSNAME");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:83:2: ( ' is' bloc -> bloc | ':' CLASSNAME '(' ( expression ( ',' expression )* )? ')' ' is' bloc -> ^( EXTENDS CLASSNAME ^( LISTFORMALPARAM ( expression )* ) ) bloc )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==40) ) {
				alt13=1;
			}
			else if ( (LA13_0==50) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:83:3: ' is' bloc
					{
					string_literal39=(Token)match(input,40,FOLLOW_40_in_consSuper378);  
					stream_40.add(string_literal39);

					pushFollow(FOLLOW_bloc_in_consSuper380);
					bloc40=bloc();
					state._fsp--;

					stream_bloc.add(bloc40.getTree());
					// AST REWRITE
					// elements: bloc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:14: -> bloc
					{
						adaptor.addChild(root_0, stream_bloc.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:84:3: ':' CLASSNAME '(' ( expression ( ',' expression )* )? ')' ' is' bloc
					{
					char_literal41=(Token)match(input,50,FOLLOW_50_in_consSuper388);  
					stream_50.add(char_literal41);

					CLASSNAME42=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_consSuper390);  
					stream_CLASSNAME.add(CLASSNAME42);

					char_literal43=(Token)match(input,42,FOLLOW_42_in_consSuper392);  
					stream_42.add(char_literal43);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:84:21: ( expression ( ',' expression )* )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==CLASSNAME||(LA12_0 >= NAME && LA12_0 <= NB)||LA12_0==STRING||LA12_0==42||LA12_0==45||LA12_0==47||(LA12_0 >= 57 && LA12_0 <= 58)||LA12_0==67||LA12_0==69||LA12_0==72||LA12_0==74) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:84:22: expression ( ',' expression )*
							{
							pushFollow(FOLLOW_expression_in_consSuper395);
							expression44=expression();
							state._fsp--;

							stream_expression.add(expression44.getTree());
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:84:33: ( ',' expression )*
							loop11:
							while (true) {
								int alt11=2;
								int LA11_0 = input.LA(1);
								if ( (LA11_0==46) ) {
									alt11=1;
								}

								switch (alt11) {
								case 1 :
									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:84:34: ',' expression
									{
									char_literal45=(Token)match(input,46,FOLLOW_46_in_consSuper398);  
									stream_46.add(char_literal45);

									pushFollow(FOLLOW_expression_in_consSuper400);
									expression46=expression();
									state._fsp--;

									stream_expression.add(expression46.getTree());
									}
									break;

								default :
									break loop11;
								}
							}

							}
							break;

					}

					char_literal47=(Token)match(input,43,FOLLOW_43_in_consSuper406);  
					stream_43.add(char_literal47);

					string_literal48=(Token)match(input,40,FOLLOW_40_in_consSuper408);  
					stream_40.add(string_literal48);

					pushFollow(FOLLOW_bloc_in_consSuper410);
					bloc49=bloc();
					state._fsp--;

					stream_bloc.add(bloc49.getTree());
					// AST REWRITE
					// elements: bloc, expression, CLASSNAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 84:68: -> ^( EXTENDS CLASSNAME ^( LISTFORMALPARAM ( expression )* ) ) bloc
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:84:71: ^( EXTENDS CLASSNAME ^( LISTFORMALPARAM ( expression )* ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXTENDS, "EXTENDS"), root_1);
						adaptor.addChild(root_1, stream_CLASSNAME.nextNode());
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:84:91: ^( LISTFORMALPARAM ( expression )* )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTFORMALPARAM, "LISTFORMALPARAM"), root_2);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:84:109: ( expression )*
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_2, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

						adaptor.addChild(root_0, stream_bloc.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "consSuper"


	public static class blocSansCons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "blocSansCons"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:87:1: blocSansCons : ( attribDef | 'def' methodeDef -> methodeDef );
	public final blocSansCons_return blocSansCons() throws RecognitionException {
		blocSansCons_return retval = new blocSansCons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal51=null;
		ParserRuleReturnScope attribDef50 =null;
		ParserRuleReturnScope methodeDef52 =null;

		Object string_literal51_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleSubtreeStream stream_methodeDef=new RewriteRuleSubtreeStream(adaptor,"rule methodeDef");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:88:2: ( attribDef | 'def' methodeDef -> methodeDef )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==75) ) {
				alt14=1;
			}
			else if ( (LA14_0==61) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:88:3: attribDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attribDef_in_blocSansCons437);
					attribDef50=attribDef();
					state._fsp--;

					adaptor.addChild(root_0, attribDef50.getTree());

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:89:3: 'def' methodeDef
					{
					string_literal51=(Token)match(input,61,FOLLOW_61_in_blocSansCons441);  
					stream_61.add(string_literal51);

					pushFollow(FOLLOW_methodeDef_in_blocSansCons443);
					methodeDef52=methodeDef();
					state._fsp--;

					stream_methodeDef.add(methodeDef52.getTree());
					// AST REWRITE
					// elements: methodeDef
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:20: -> methodeDef
					{
						adaptor.addChild(root_0, stream_methodeDef.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blocSansCons"


	public static class attribDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attribDef"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:93:1: attribDef : 'var' ( 'static' )? NAME ':' choixNameClass ( ':=' expression )? ';' -> ^( ATTRIBDEF NAME ( 'static' )? choixNameClass ( expression )? ) ;
	public final attribDef_return attribDef() throws RecognitionException {
		attribDef_return retval = new attribDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal53=null;
		Token string_literal54=null;
		Token NAME55=null;
		Token char_literal56=null;
		Token string_literal58=null;
		Token char_literal60=null;
		ParserRuleReturnScope choixNameClass57 =null;
		ParserRuleReturnScope expression59 =null;

		Object string_literal53_tree=null;
		Object string_literal54_tree=null;
		Object NAME55_tree=null;
		Object char_literal56_tree=null;
		Object string_literal58_tree=null;
		Object char_literal60_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:2: ( 'var' ( 'static' )? NAME ':' choixNameClass ( ':=' expression )? ';' -> ^( ATTRIBDEF NAME ( 'static' )? choixNameClass ( expression )? ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:3: 'var' ( 'static' )? NAME ':' choixNameClass ( ':=' expression )? ';'
			{
			string_literal53=(Token)match(input,75,FOLLOW_75_in_attribDef458);  
			stream_75.add(string_literal53);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:9: ( 'static' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==71) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:10: 'static'
					{
					string_literal54=(Token)match(input,71,FOLLOW_71_in_attribDef461);  
					stream_71.add(string_literal54);

					}
					break;

			}

			NAME55=(Token)match(input,NAME,FOLLOW_NAME_in_attribDef465);  
			stream_NAME.add(NAME55);

			char_literal56=(Token)match(input,50,FOLLOW_50_in_attribDef467);  
			stream_50.add(char_literal56);

			pushFollow(FOLLOW_choixNameClass_in_attribDef469);
			choixNameClass57=choixNameClass();
			state._fsp--;

			stream_choixNameClass.add(choixNameClass57.getTree());
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:45: ( ':=' expression )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==51) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:46: ':=' expression
					{
					string_literal58=(Token)match(input,51,FOLLOW_51_in_attribDef472);  
					stream_51.add(string_literal58);

					pushFollow(FOLLOW_expression_in_attribDef473);
					expression59=expression();
					state._fsp--;

					stream_expression.add(expression59.getTree());
					}
					break;

			}

			char_literal60=(Token)match(input,52,FOLLOW_52_in_attribDef477);  
			stream_52.add(char_literal60);

			// AST REWRITE
			// elements: expression, NAME, 71, choixNameClass
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 94:67: -> ^( ATTRIBDEF NAME ( 'static' )? choixNameClass ( expression )? )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:70: ^( ATTRIBDEF NAME ( 'static' )? choixNameClass ( expression )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBDEF, "ATTRIBDEF"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:87: ( 'static' )?
				if ( stream_71.hasNext() ) {
					adaptor.addChild(root_1, stream_71.nextNode());
				}
				stream_71.reset();

				adaptor.addChild(root_1, stream_choixNameClass.nextTree());
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:94:114: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attribDef"


	public static class methodeDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "methodeDef"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:98:1: methodeDef : ( 'static' )? ( 'override' )? NAME '(' ( param ( ',' param )* )? ')' permClassNameAvecExpr -> ^( METHODEDEF NAME ( 'static' )? ( 'override' )? ^( LISTPARAM ( param )* ) permClassNameAvecExpr ) ;
	public final methodeDef_return methodeDef() throws RecognitionException {
		methodeDef_return retval = new methodeDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal61=null;
		Token string_literal62=null;
		Token NAME63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		Token char_literal68=null;
		ParserRuleReturnScope param65 =null;
		ParserRuleReturnScope param67 =null;
		ParserRuleReturnScope permClassNameAvecExpr69 =null;

		Object string_literal61_tree=null;
		Object string_literal62_tree=null;
		Object NAME63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		Object char_literal68_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
		RewriteRuleSubtreeStream stream_permClassNameAvecExpr=new RewriteRuleSubtreeStream(adaptor,"rule permClassNameAvecExpr");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:2: ( ( 'static' )? ( 'override' )? NAME '(' ( param ( ',' param )* )? ')' permClassNameAvecExpr -> ^( METHODEDEF NAME ( 'static' )? ( 'override' )? ^( LISTPARAM ( param )* ) permClassNameAvecExpr ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:3: ( 'static' )? ( 'override' )? NAME '(' ( param ( ',' param )* )? ')' permClassNameAvecExpr
			{
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:3: ( 'static' )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==71) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:4: 'static'
					{
					string_literal61=(Token)match(input,71,FOLLOW_71_in_methodeDef509);  
					stream_71.add(string_literal61);

					}
					break;

			}

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:15: ( 'override' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==68) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:16: 'override'
					{
					string_literal62=(Token)match(input,68,FOLLOW_68_in_methodeDef514);  
					stream_68.add(string_literal62);

					}
					break;

			}

			NAME63=(Token)match(input,NAME,FOLLOW_NAME_in_methodeDef518);  
			stream_NAME.add(NAME63);

			char_literal64=(Token)match(input,42,FOLLOW_42_in_methodeDef520);  
			stream_42.add(char_literal64);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:38: ( param ( ',' param )* )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==NAME) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:39: param ( ',' param )*
					{
					pushFollow(FOLLOW_param_in_methodeDef523);
					param65=param();
					state._fsp--;

					stream_param.add(param65.getTree());
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:45: ( ',' param )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==46) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:46: ',' param
							{
							char_literal66=(Token)match(input,46,FOLLOW_46_in_methodeDef526);  
							stream_46.add(char_literal66);

							pushFollow(FOLLOW_param_in_methodeDef528);
							param67=param();
							state._fsp--;

							stream_param.add(param67.getTree());
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

			}

			char_literal68=(Token)match(input,43,FOLLOW_43_in_methodeDef534);  
			stream_43.add(char_literal68);

			pushFollow(FOLLOW_permClassNameAvecExpr_in_methodeDef537);
			permClassNameAvecExpr69=permClassNameAvecExpr();
			state._fsp--;

			stream_permClassNameAvecExpr.add(permClassNameAvecExpr69.getTree());
			// AST REWRITE
			// elements: param, permClassNameAvecExpr, NAME, 71, 68
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:87: -> ^( METHODEDEF NAME ( 'static' )? ( 'override' )? ^( LISTPARAM ( param )* ) permClassNameAvecExpr )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:90: ^( METHODEDEF NAME ( 'static' )? ( 'override' )? ^( LISTPARAM ( param )* ) permClassNameAvecExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODEDEF, "METHODEDEF"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:108: ( 'static' )?
				if ( stream_71.hasNext() ) {
					adaptor.addChild(root_1, stream_71.nextNode());
				}
				stream_71.reset();

				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:120: ( 'override' )?
				if ( stream_68.hasNext() ) {
					adaptor.addChild(root_1, stream_68.nextNode());
				}
				stream_68.reset();

				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:134: ^( LISTPARAM ( param )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTPARAM, "LISTPARAM"), root_2);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:99:146: ( param )*
				while ( stream_param.hasNext() ) {
					adaptor.addChild(root_2, stream_param.nextTree());
				}
				stream_param.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_permClassNameAvecExpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodeDef"


	public static class formalOuPas_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalOuPas"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:102:1: formalOuPas : ( param | formalParam );
	public final formalOuPas_return formalOuPas() throws RecognitionException {
		formalOuPas_return retval = new formalOuPas_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope param70 =null;
		ParserRuleReturnScope formalParam71 =null;


		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:103:2: ( param | formalParam )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==NAME) ) {
				alt21=1;
			}
			else if ( (LA21_0==75) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:103:3: param
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_param_in_formalOuPas574);
					param70=param();
					state._fsp--;

					adaptor.addChild(root_0, param70.getTree());

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:104:3: formalParam
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_formalParam_in_formalOuPas578);
					formalParam71=formalParam();
					state._fsp--;

					adaptor.addChild(root_0, formalParam71.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalOuPas"


	public static class formalParam_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParam"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:107:1: formalParam : 'var' NAME ':' choixNameClass -> ^( FORMALPARAM NAME choixNameClass ) ;
	public final formalParam_return formalParam() throws RecognitionException {
		formalParam_return retval = new formalParam_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal72=null;
		Token NAME73=null;
		Token char_literal74=null;
		ParserRuleReturnScope choixNameClass75 =null;

		Object string_literal72_tree=null;
		Object NAME73_tree=null;
		Object char_literal74_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:108:2: ( 'var' NAME ':' choixNameClass -> ^( FORMALPARAM NAME choixNameClass ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:108:3: 'var' NAME ':' choixNameClass
			{
			string_literal72=(Token)match(input,75,FOLLOW_75_in_formalParam589);  
			stream_75.add(string_literal72);

			NAME73=(Token)match(input,NAME,FOLLOW_NAME_in_formalParam591);  
			stream_NAME.add(NAME73);

			char_literal74=(Token)match(input,50,FOLLOW_50_in_formalParam593);  
			stream_50.add(char_literal74);

			pushFollow(FOLLOW_choixNameClass_in_formalParam595);
			choixNameClass75=choixNameClass();
			state._fsp--;

			stream_choixNameClass.add(choixNameClass75.getTree());
			// AST REWRITE
			// elements: NAME, choixNameClass
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 108:33: -> ^( FORMALPARAM NAME choixNameClass )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:108:36: ^( FORMALPARAM NAME choixNameClass )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMALPARAM, "FORMALPARAM"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_1, stream_choixNameClass.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalParam"


	public static class param_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:111:1: param : NAME ':' choixNameClass -> ^( PARAM NAME choixNameClass ) ;
	public final param_return param() throws RecognitionException {
		param_return retval = new param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME76=null;
		Token char_literal77=null;
		ParserRuleReturnScope choixNameClass78 =null;

		Object NAME76_tree=null;
		Object char_literal77_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:111:8: ( NAME ':' choixNameClass -> ^( PARAM NAME choixNameClass ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:111:9: NAME ':' choixNameClass
			{
			NAME76=(Token)match(input,NAME,FOLLOW_NAME_in_param615);  
			stream_NAME.add(NAME76);

			char_literal77=(Token)match(input,50,FOLLOW_50_in_param617);  
			stream_50.add(char_literal77);

			pushFollow(FOLLOW_choixNameClass_in_param619);
			choixNameClass78=choixNameClass();
			state._fsp--;

			stream_choixNameClass.add(choixNameClass78.getTree());
			// AST REWRITE
			// elements: choixNameClass, NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 111:33: -> ^( PARAM NAME choixNameClass )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:111:36: ^( PARAM NAME choixNameClass )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_1, stream_choixNameClass.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"


	public static class permClassNameAvecExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "permClassNameAvecExpr"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:114:1: permClassNameAvecExpr : ( ':' choixNameClass devPerm -> ^( TYPERETOUR choixNameClass ) devPerm | ' is' bloc -> bloc );
	public final permClassNameAvecExpr_return permClassNameAvecExpr() throws RecognitionException {
		permClassNameAvecExpr_return retval = new permClassNameAvecExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal79=null;
		Token string_literal82=null;
		ParserRuleReturnScope choixNameClass80 =null;
		ParserRuleReturnScope devPerm81 =null;
		ParserRuleReturnScope bloc83 =null;

		Object char_literal79_tree=null;
		Object string_literal82_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
		RewriteRuleSubtreeStream stream_devPerm=new RewriteRuleSubtreeStream(adaptor,"rule devPerm");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:115:2: ( ':' choixNameClass devPerm -> ^( TYPERETOUR choixNameClass ) devPerm | ' is' bloc -> bloc )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==50) ) {
				alt22=1;
			}
			else if ( (LA22_0==40) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:115:3: ':' choixNameClass devPerm
					{
					char_literal79=(Token)match(input,50,FOLLOW_50_in_permClassNameAvecExpr638);  
					stream_50.add(char_literal79);

					pushFollow(FOLLOW_choixNameClass_in_permClassNameAvecExpr640);
					choixNameClass80=choixNameClass();
					state._fsp--;

					stream_choixNameClass.add(choixNameClass80.getTree());
					pushFollow(FOLLOW_devPerm_in_permClassNameAvecExpr642);
					devPerm81=devPerm();
					state._fsp--;

					stream_devPerm.add(devPerm81.getTree());
					// AST REWRITE
					// elements: devPerm, choixNameClass
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 115:30: -> ^( TYPERETOUR choixNameClass ) devPerm
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:115:33: ^( TYPERETOUR choixNameClass )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPERETOUR, "TYPERETOUR"), root_1);
						adaptor.addChild(root_1, stream_choixNameClass.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						adaptor.addChild(root_0, stream_devPerm.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:116:3: ' is' bloc
					{
					string_literal82=(Token)match(input,40,FOLLOW_40_in_permClassNameAvecExpr656);  
					stream_40.add(string_literal82);

					pushFollow(FOLLOW_bloc_in_permClassNameAvecExpr658);
					bloc83=bloc();
					state._fsp--;

					stream_bloc.add(bloc83.getTree());
					// AST REWRITE
					// elements: bloc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:14: -> bloc
					{
						adaptor.addChild(root_0, stream_bloc.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "permClassNameAvecExpr"


	public static class devPerm_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "devPerm"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:119:1: devPerm : ( ':=' expression -> expression | ' is' bloc -> bloc );
	public final devPerm_return devPerm() throws RecognitionException {
		devPerm_return retval = new devPerm_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal84=null;
		Token string_literal86=null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope bloc87 =null;

		Object string_literal84_tree=null;
		Object string_literal86_tree=null;
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:120:2: ( ':=' expression -> expression | ' is' bloc -> bloc )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==51) ) {
				alt23=1;
			}
			else if ( (LA23_0==40) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:120:3: ':=' expression
					{
					string_literal84=(Token)match(input,51,FOLLOW_51_in_devPerm672);  
					stream_51.add(string_literal84);

					pushFollow(FOLLOW_expression_in_devPerm674);
					expression85=expression();
					state._fsp--;

					stream_expression.add(expression85.getTree());
					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:19: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:121:3: ' is' bloc
					{
					string_literal86=(Token)match(input,40,FOLLOW_40_in_devPerm682);  
					stream_40.add(string_literal86);

					pushFollow(FOLLOW_bloc_in_devPerm684);
					bloc87=bloc();
					state._fsp--;

					stream_bloc.add(bloc87.getTree());
					// AST REWRITE
					// elements: bloc
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 121:14: -> bloc
					{
						adaptor.addChild(root_0, stream_bloc.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "devPerm"


	public static class bloc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bloc"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:125:1: bloc : '{' ( instruction )* '}' -> ^( BLOC ( instruction )* ) ;
	public final bloc_return bloc() throws RecognitionException {
		bloc_return retval = new bloc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope instruction89 =null;

		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:126:2: ( '{' ( instruction )* '}' -> ^( BLOC ( instruction )* ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:126:3: '{' ( instruction )* '}'
			{
			char_literal88=(Token)match(input,77,FOLLOW_77_in_bloc699);  
			stream_77.add(char_literal88);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:126:7: ( instruction )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CLASSNAME||(LA24_0 >= NAME && LA24_0 <= NB)||LA24_0==STRING||LA24_0==42||LA24_0==45||LA24_0==47||(LA24_0 >= 57 && LA24_0 <= 58)||(LA24_0 >= 65 && LA24_0 <= 67)||(LA24_0 >= 69 && LA24_0 <= 70)||LA24_0==72||LA24_0==74||(LA24_0 >= 76 && LA24_0 <= 77)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:126:8: instruction
					{
					pushFollow(FOLLOW_instruction_in_bloc702);
					instruction89=instruction();
					state._fsp--;

					stream_instruction.add(instruction89.getTree());
					}
					break;

				default :
					break loop24;
				}
			}

			char_literal90=(Token)match(input,78,FOLLOW_78_in_bloc706);  
			stream_78.add(char_literal90);

			// AST REWRITE
			// elements: instruction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 126:26: -> ^( BLOC ( instruction )* )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:126:29: ^( BLOC ( instruction )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:126:36: ( instruction )*
				while ( stream_instruction.hasNext() ) {
					adaptor.addChild(root_1, stream_instruction.nextTree());
				}
				stream_instruction.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bloc"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:136:1: instruction : ( expression ( ':=' ^ expression )? ';' !| bloc | 'return' ';' -> 'return' | condition | whileBoucle | 'is' );
	public final instruction_return instruction() throws RecognitionException {
		instruction_return retval = new instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal92=null;
		Token char_literal94=null;
		Token string_literal96=null;
		Token char_literal97=null;
		Token string_literal100=null;
		ParserRuleReturnScope expression91 =null;
		ParserRuleReturnScope expression93 =null;
		ParserRuleReturnScope bloc95 =null;
		ParserRuleReturnScope condition98 =null;
		ParserRuleReturnScope whileBoucle99 =null;

		Object string_literal92_tree=null;
		Object char_literal94_tree=null;
		Object string_literal96_tree=null;
		Object char_literal97_tree=null;
		Object string_literal100_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:137:2: ( expression ( ':=' ^ expression )? ';' !| bloc | 'return' ';' -> 'return' | condition | whileBoucle | 'is' )
			int alt26=6;
			switch ( input.LA(1) ) {
			case CLASSNAME:
			case NAME:
			case NB:
			case STRING:
			case 42:
			case 45:
			case 47:
			case 57:
			case 58:
			case 67:
			case 69:
			case 72:
			case 74:
				{
				alt26=1;
				}
				break;
			case 77:
				{
				alt26=2;
				}
				break;
			case 70:
				{
				alt26=3;
				}
				break;
			case 65:
				{
				alt26=4;
				}
				break;
			case 76:
				{
				alt26=5;
				}
				break;
			case 66:
				{
				alt26=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:137:3: expression ( ':=' ^ expression )? ';' !
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_instruction733);
					expression91=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression91.getTree());

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:137:14: ( ':=' ^ expression )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==51) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:137:15: ':=' ^ expression
							{
							string_literal92=(Token)match(input,51,FOLLOW_51_in_instruction736); 
							string_literal92_tree = (Object)adaptor.create(string_literal92);
							root_0 = (Object)adaptor.becomeRoot(string_literal92_tree, root_0);

							pushFollow(FOLLOW_expression_in_instruction739);
							expression93=expression();
							state._fsp--;

							adaptor.addChild(root_0, expression93.getTree());

							}
							break;

					}

					char_literal94=(Token)match(input,52,FOLLOW_52_in_instruction743); 
					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:138:3: bloc
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bloc_in_instruction750);
					bloc95=bloc();
					state._fsp--;

					adaptor.addChild(root_0, bloc95.getTree());

					}
					break;
				case 3 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:139:3: 'return' ';'
					{
					string_literal96=(Token)match(input,70,FOLLOW_70_in_instruction754);  
					stream_70.add(string_literal96);

					char_literal97=(Token)match(input,52,FOLLOW_52_in_instruction756);  
					stream_52.add(char_literal97);

					// AST REWRITE
					// elements: 70
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 139:16: -> 'return'
					{
						adaptor.addChild(root_0, stream_70.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:140:3: condition
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condition_in_instruction764);
					condition98=condition();
					state._fsp--;

					adaptor.addChild(root_0, condition98.getTree());

					}
					break;
				case 5 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:141:3: whileBoucle
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileBoucle_in_instruction768);
					whileBoucle99=whileBoucle();
					state._fsp--;

					adaptor.addChild(root_0, whileBoucle99.getTree());

					}
					break;
				case 6 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:142:3: 'is'
					{
					root_0 = (Object)adaptor.nil();


					string_literal100=(Token)match(input,66,FOLLOW_66_in_instruction772); 
					string_literal100_tree = (Object)adaptor.create(string_literal100);
					adaptor.addChild(root_0, string_literal100_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:150:1: expression : ( instanciation ( '.' NAME )? -> instanciation ( NAME )? | condExpr );
	public final expression_return expression() throws RecognitionException {
		expression_return retval = new expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal102=null;
		Token NAME103=null;
		ParserRuleReturnScope instanciation101 =null;
		ParserRuleReturnScope condExpr104 =null;

		Object char_literal102_tree=null;
		Object NAME103_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_instanciation=new RewriteRuleSubtreeStream(adaptor,"rule instanciation");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:151:2: ( instanciation ( '.' NAME )? -> instanciation ( NAME )? | condExpr )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==67) ) {
				alt28=1;
			}
			else if ( (LA28_0==CLASSNAME||(LA28_0 >= NAME && LA28_0 <= NB)||LA28_0==STRING||LA28_0==42||LA28_0==45||LA28_0==47||(LA28_0 >= 57 && LA28_0 <= 58)||LA28_0==69||LA28_0==72||LA28_0==74) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:152:2: instanciation ( '.' NAME )?
					{
					pushFollow(FOLLOW_instanciation_in_expression789);
					instanciation101=instanciation();
					state._fsp--;

					stream_instanciation.add(instanciation101.getTree());
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:152:16: ( '.' NAME )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==48) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:152:17: '.' NAME
							{
							char_literal102=(Token)match(input,48,FOLLOW_48_in_expression792);  
							stream_48.add(char_literal102);

							NAME103=(Token)match(input,NAME,FOLLOW_NAME_in_expression794);  
							stream_NAME.add(NAME103);

							}
							break;

					}

					// AST REWRITE
					// elements: NAME, instanciation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 152:28: -> instanciation ( NAME )?
					{
						adaptor.addChild(root_0, stream_instanciation.nextTree());
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:152:45: ( NAME )?
						if ( stream_NAME.hasNext() ) {
							adaptor.addChild(root_0, stream_NAME.nextNode());
						}
						stream_NAME.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:154:3: condExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condExpr_in_expression809);
					condExpr104=condExpr();
					state._fsp--;

					adaptor.addChild(root_0, condExpr104.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class factoParenthese_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factoParenthese"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:157:1: factoParenthese : ( expression | 'as' choixNameClass ':' expression -> ^( CAST choixNameClass expression ) );
	public final factoParenthese_return factoParenthese() throws RecognitionException {
		factoParenthese_return retval = new factoParenthese_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal106=null;
		Token char_literal108=null;
		ParserRuleReturnScope expression105 =null;
		ParserRuleReturnScope choixNameClass107 =null;
		ParserRuleReturnScope expression109 =null;

		Object string_literal106_tree=null;
		Object char_literal108_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:158:2: ( expression | 'as' choixNameClass ':' expression -> ^( CAST choixNameClass expression ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==CLASSNAME||(LA29_0 >= NAME && LA29_0 <= NB)||LA29_0==STRING||LA29_0==42||LA29_0==45||LA29_0==47||(LA29_0 >= 57 && LA29_0 <= 58)||LA29_0==67||LA29_0==69||LA29_0==72||LA29_0==74) ) {
				alt29=1;
			}
			else if ( (LA29_0==59) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:158:3: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_factoParenthese819);
					expression105=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression105.getTree());

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:159:3: 'as' choixNameClass ':' expression
					{
					string_literal106=(Token)match(input,59,FOLLOW_59_in_factoParenthese823);  
					stream_59.add(string_literal106);

					pushFollow(FOLLOW_choixNameClass_in_factoParenthese825);
					choixNameClass107=choixNameClass();
					state._fsp--;

					stream_choixNameClass.add(choixNameClass107.getTree());
					char_literal108=(Token)match(input,50,FOLLOW_50_in_factoParenthese827);  
					stream_50.add(char_literal108);

					pushFollow(FOLLOW_expression_in_factoParenthese829);
					expression109=expression();
					state._fsp--;

					stream_expression.add(expression109.getTree());
					// AST REWRITE
					// elements: expression, choixNameClass
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 159:38: -> ^( CAST choixNameClass expression )
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:159:41: ^( CAST choixNameClass expression )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, "CAST"), root_1);
						adaptor.addChild(root_1, stream_choixNameClass.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factoParenthese"


	public static class identificateur_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identificateur"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:163:1: identificateur : ( 'this' | 'super' | 'result' );
	public final identificateur_return identificateur() throws RecognitionException {
		identificateur_return retval = new identificateur_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set110=null;

		Object set110_tree=null;

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:164:2: ( 'this' | 'super' | 'result' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:
			{
			root_0 = (Object)adaptor.nil();


			set110=input.LT(1);
			if ( input.LA(1)==69||input.LA(1)==72||input.LA(1)==74 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set110));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identificateur"


	public static class constante_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constante"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:169:1: constante : ( 'Integer' | 'String' );
	public final constante_return constante() throws RecognitionException {
		constante_return retval = new constante_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set111=null;

		Object set111_tree=null;

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:170:2: ( 'Integer' | 'String' )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:
			{
			root_0 = (Object)adaptor.nil();


			set111=input.LT(1);
			if ( (input.LA(1) >= 57 && input.LA(1) <= 58) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set111));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constante"


	public static class instanciation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instanciation"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:174:1: instanciation : 'new' choixNameClass '(' ( expression ( ',' expression )* )? ')' -> ^( INST choixNameClass ^( LISTPARAMAPPELCONSTR ( expression )* ) ) ;
	public final instanciation_return instanciation() throws RecognitionException {
		instanciation_return retval = new instanciation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal112=null;
		Token char_literal114=null;
		Token char_literal116=null;
		Token char_literal118=null;
		ParserRuleReturnScope choixNameClass113 =null;
		ParserRuleReturnScope expression115 =null;
		ParserRuleReturnScope expression117 =null;

		Object string_literal112_tree=null;
		Object char_literal114_tree=null;
		Object char_literal116_tree=null;
		Object char_literal118_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:2: ( 'new' choixNameClass '(' ( expression ( ',' expression )* )? ')' -> ^( INST choixNameClass ^( LISTPARAMAPPELCONSTR ( expression )* ) ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:3: 'new' choixNameClass '(' ( expression ( ',' expression )* )? ')'
			{
			string_literal112=(Token)match(input,67,FOLLOW_67_in_instanciation882);  
			stream_67.add(string_literal112);

			pushFollow(FOLLOW_choixNameClass_in_instanciation884);
			choixNameClass113=choixNameClass();
			state._fsp--;

			stream_choixNameClass.add(choixNameClass113.getTree());
			char_literal114=(Token)match(input,42,FOLLOW_42_in_instanciation886);  
			stream_42.add(char_literal114);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:28: ( expression ( ',' expression )* )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==CLASSNAME||(LA31_0 >= NAME && LA31_0 <= NB)||LA31_0==STRING||LA31_0==42||LA31_0==45||LA31_0==47||(LA31_0 >= 57 && LA31_0 <= 58)||LA31_0==67||LA31_0==69||LA31_0==72||LA31_0==74) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:29: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_instanciation889);
					expression115=expression();
					state._fsp--;

					stream_expression.add(expression115.getTree());
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:39: ( ',' expression )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==46) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:40: ',' expression
							{
							char_literal116=(Token)match(input,46,FOLLOW_46_in_instanciation891);  
							stream_46.add(char_literal116);

							pushFollow(FOLLOW_expression_in_instanciation893);
							expression117=expression();
							state._fsp--;

							stream_expression.add(expression117.getTree());
							}
							break;

						default :
							break loop30;
						}
					}

					}
					break;

			}

			char_literal118=(Token)match(input,43,FOLLOW_43_in_instanciation899);  
			stream_43.add(char_literal118);

			// AST REWRITE
			// elements: expression, choixNameClass
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 175:63: -> ^( INST choixNameClass ^( LISTPARAMAPPELCONSTR ( expression )* ) )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:66: ^( INST choixNameClass ^( LISTPARAMAPPELCONSTR ( expression )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INST, "INST"), root_1);
				adaptor.addChild(root_1, stream_choixNameClass.nextTree());
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:88: ^( LISTPARAMAPPELCONSTR ( expression )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTPARAMAPPELCONSTR, "LISTPARAMAPPELCONSTR"), root_2);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:175:111: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_2, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instanciation"


	public static class envoie_message_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "envoie_message"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:178:1: envoie_message : '(' ( expression ( ',' expression )* )? ')' -> ^( LISTOPERATEURS ( expression )* ) ;
	public final envoie_message_return envoie_message() throws RecognitionException {
		envoie_message_return retval = new envoie_message_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal119=null;
		Token char_literal121=null;
		Token char_literal123=null;
		ParserRuleReturnScope expression120 =null;
		ParserRuleReturnScope expression122 =null;

		Object char_literal119_tree=null;
		Object char_literal121_tree=null;
		Object char_literal123_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:179:2: ( '(' ( expression ( ',' expression )* )? ')' -> ^( LISTOPERATEURS ( expression )* ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:179:4: '(' ( expression ( ',' expression )* )? ')'
			{
			char_literal119=(Token)match(input,42,FOLLOW_42_in_envoie_message925);  
			stream_42.add(char_literal119);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:179:8: ( expression ( ',' expression )* )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==CLASSNAME||(LA33_0 >= NAME && LA33_0 <= NB)||LA33_0==STRING||LA33_0==42||LA33_0==45||LA33_0==47||(LA33_0 >= 57 && LA33_0 <= 58)||LA33_0==67||LA33_0==69||LA33_0==72||LA33_0==74) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:179:9: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_envoie_message928);
					expression120=expression();
					state._fsp--;

					stream_expression.add(expression120.getTree());
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:179:20: ( ',' expression )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==46) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:179:21: ',' expression
							{
							char_literal121=(Token)match(input,46,FOLLOW_46_in_envoie_message931);  
							stream_46.add(char_literal121);

							pushFollow(FOLLOW_expression_in_envoie_message934);
							expression122=expression();
							state._fsp--;

							stream_expression.add(expression122.getTree());
							}
							break;

						default :
							break loop32;
						}
					}

					}
					break;

			}

			char_literal123=(Token)match(input,43,FOLLOW_43_in_envoie_message941);  
			stream_43.add(char_literal123);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 179:46: -> ^( LISTOPERATEURS ( expression )* )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:179:49: ^( LISTOPERATEURS ( expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LISTOPERATEURS, "LISTOPERATEURS"), root_1);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:179:66: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "envoie_message"


	public static class condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:183:1: condition : 'if' condExpr 'then' instruction 'else' instruction -> ^( IF condExpr ^( THEN instruction ) ^( ELSE instruction ) ) ;
	public final condition_return condition() throws RecognitionException {
		condition_return retval = new condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal124=null;
		Token string_literal126=null;
		Token string_literal128=null;
		ParserRuleReturnScope condExpr125 =null;
		ParserRuleReturnScope instruction127 =null;
		ParserRuleReturnScope instruction129 =null;

		Object string_literal124_tree=null;
		Object string_literal126_tree=null;
		Object string_literal128_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:184:2: ( 'if' condExpr 'then' instruction 'else' instruction -> ^( IF condExpr ^( THEN instruction ) ^( ELSE instruction ) ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:184:3: 'if' condExpr 'then' instruction 'else' instruction
			{
			string_literal124=(Token)match(input,65,FOLLOW_65_in_condition962);  
			stream_65.add(string_literal124);

			pushFollow(FOLLOW_condExpr_in_condition964);
			condExpr125=condExpr();
			state._fsp--;

			stream_condExpr.add(condExpr125.getTree());
			string_literal126=(Token)match(input,73,FOLLOW_73_in_condition966);  
			stream_73.add(string_literal126);

			pushFollow(FOLLOW_instruction_in_condition968);
			instruction127=instruction();
			state._fsp--;

			stream_instruction.add(instruction127.getTree());
			string_literal128=(Token)match(input,63,FOLLOW_63_in_condition970);  
			stream_63.add(string_literal128);

			pushFollow(FOLLOW_instruction_in_condition972);
			instruction129=instruction();
			state._fsp--;

			stream_instruction.add(instruction129.getTree());
			// AST REWRITE
			// elements: instruction, instruction, condExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 184:55: -> ^( IF condExpr ^( THEN instruction ) ^( ELSE instruction ) )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:184:58: ^( IF condExpr ^( THEN instruction ) ^( ELSE instruction ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_condExpr.nextTree());
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:184:72: ^( THEN instruction )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
				adaptor.addChild(root_2, stream_instruction.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:184:92: ^( ELSE instruction )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
				adaptor.addChild(root_2, stream_instruction.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class whileBoucle_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileBoucle"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:188:1: whileBoucle : 'while' '(' condExpr ')' 'do' bloc -> ^( WHILE condExpr bloc ) ;
	public final whileBoucle_return whileBoucle() throws RecognitionException {
		whileBoucle_return retval = new whileBoucle_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal130=null;
		Token char_literal131=null;
		Token char_literal133=null;
		Token string_literal134=null;
		ParserRuleReturnScope condExpr132 =null;
		ParserRuleReturnScope bloc135 =null;

		Object string_literal130_tree=null;
		Object char_literal131_tree=null;
		Object char_literal133_tree=null;
		Object string_literal134_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:189:2: ( 'while' '(' condExpr ')' 'do' bloc -> ^( WHILE condExpr bloc ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:189:3: 'while' '(' condExpr ')' 'do' bloc
			{
			string_literal130=(Token)match(input,76,FOLLOW_76_in_whileBoucle1003);  
			stream_76.add(string_literal130);

			char_literal131=(Token)match(input,42,FOLLOW_42_in_whileBoucle1005);  
			stream_42.add(char_literal131);

			pushFollow(FOLLOW_condExpr_in_whileBoucle1007);
			condExpr132=condExpr();
			state._fsp--;

			stream_condExpr.add(condExpr132.getTree());
			char_literal133=(Token)match(input,43,FOLLOW_43_in_whileBoucle1009);  
			stream_43.add(char_literal133);

			string_literal134=(Token)match(input,62,FOLLOW_62_in_whileBoucle1011);  
			stream_62.add(string_literal134);

			pushFollow(FOLLOW_bloc_in_whileBoucle1013);
			bloc135=bloc();
			state._fsp--;

			stream_bloc.add(bloc135.getTree());
			// AST REWRITE
			// elements: bloc, condExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 189:38: -> ^( WHILE condExpr bloc )
			{
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:189:41: ^( WHILE condExpr bloc )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_condExpr.nextTree());
				adaptor.addChild(root_1, stream_bloc.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileBoucle"


	public static class condExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condExpr"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:192:1: condExpr : exprOperateur ( ( '=' ^| '<>' ^| '<' ^| '>' ^) exprOperateur )? ;
	public final condExpr_return condExpr() throws RecognitionException {
		condExpr_return retval = new condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal137=null;
		Token string_literal138=null;
		Token char_literal139=null;
		Token char_literal140=null;
		ParserRuleReturnScope exprOperateur136 =null;
		ParserRuleReturnScope exprOperateur141 =null;

		Object char_literal137_tree=null;
		Object string_literal138_tree=null;
		Object char_literal139_tree=null;
		Object char_literal140_tree=null;

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:2: ( exprOperateur ( ( '=' ^| '<>' ^| '<' ^| '>' ^) exprOperateur )? )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:3: exprOperateur ( ( '=' ^| '<>' ^| '<' ^| '>' ^) exprOperateur )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprOperateur_in_condExpr1033);
			exprOperateur136=exprOperateur();
			state._fsp--;

			adaptor.addChild(root_0, exprOperateur136.getTree());

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:17: ( ( '=' ^| '<>' ^| '<' ^| '>' ^) exprOperateur )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( ((LA35_0 >= 53 && LA35_0 <= 56)) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:18: ( '=' ^| '<>' ^| '<' ^| '>' ^) exprOperateur
					{
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:18: ( '=' ^| '<>' ^| '<' ^| '>' ^)
					int alt34=4;
					switch ( input.LA(1) ) {
					case 55:
						{
						alt34=1;
						}
						break;
					case 54:
						{
						alt34=2;
						}
						break;
					case 53:
						{
						alt34=3;
						}
						break;
					case 56:
						{
						alt34=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 34, 0, input);
						throw nvae;
					}
					switch (alt34) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:19: '=' ^
							{
							char_literal137=(Token)match(input,55,FOLLOW_55_in_condExpr1037); 
							char_literal137_tree = (Object)adaptor.create(char_literal137);
							root_0 = (Object)adaptor.becomeRoot(char_literal137_tree, root_0);

							}
							break;
						case 2 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:25: '<>' ^
							{
							string_literal138=(Token)match(input,54,FOLLOW_54_in_condExpr1041); 
							string_literal138_tree = (Object)adaptor.create(string_literal138);
							root_0 = (Object)adaptor.becomeRoot(string_literal138_tree, root_0);

							}
							break;
						case 3 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:32: '<' ^
							{
							char_literal139=(Token)match(input,53,FOLLOW_53_in_condExpr1045); 
							char_literal139_tree = (Object)adaptor.create(char_literal139);
							root_0 = (Object)adaptor.becomeRoot(char_literal139_tree, root_0);

							}
							break;
						case 4 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:193:38: '>' ^
							{
							char_literal140=(Token)match(input,56,FOLLOW_56_in_condExpr1049); 
							char_literal140_tree = (Object)adaptor.create(char_literal140);
							root_0 = (Object)adaptor.becomeRoot(char_literal140_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_exprOperateur_in_condExpr1053);
					exprOperateur141=exprOperateur();
					state._fsp--;

					adaptor.addChild(root_0, exprOperateur141.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condExpr"


	public static class exprOperateur_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprOperateur"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:197:1: exprOperateur : ( '+' | '-' )? expr2 ( ( '+' ^| '-' ^) expr2 )* ;
	public final exprOperateur_return exprOperateur() throws RecognitionException {
		exprOperateur_return retval = new exprOperateur_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set142=null;
		Token char_literal144=null;
		Token char_literal145=null;
		ParserRuleReturnScope expr2143 =null;
		ParserRuleReturnScope expr2146 =null;

		Object set142_tree=null;
		Object char_literal144_tree=null;
		Object char_literal145_tree=null;

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:198:2: ( ( '+' | '-' )? expr2 ( ( '+' ^| '-' ^) expr2 )* )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:198:4: ( '+' | '-' )? expr2 ( ( '+' ^| '-' ^) expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:198:4: ( '+' | '-' )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==45||LA36_0==47) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:
					{
					set142=input.LT(1);
					if ( input.LA(1)==45||input.LA(1)==47 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set142));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			pushFollow(FOLLOW_expr2_in_exprOperateur1074);
			expr2143=expr2();
			state._fsp--;

			adaptor.addChild(root_0, expr2143.getTree());

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:198:21: ( ( '+' ^| '-' ^) expr2 )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==45||LA38_0==47) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:198:22: ( '+' ^| '-' ^) expr2
					{
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:198:22: ( '+' ^| '-' ^)
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==45) ) {
						alt37=1;
					}
					else if ( (LA37_0==47) ) {
						alt37=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:198:23: '+' ^
							{
							char_literal144=(Token)match(input,45,FOLLOW_45_in_exprOperateur1078); 
							char_literal144_tree = (Object)adaptor.create(char_literal144);
							root_0 = (Object)adaptor.becomeRoot(char_literal144_tree, root_0);

							}
							break;
						case 2 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:198:28: '-' ^
							{
							char_literal145=(Token)match(input,47,FOLLOW_47_in_exprOperateur1081); 
							char_literal145_tree = (Object)adaptor.create(char_literal145);
							root_0 = (Object)adaptor.becomeRoot(char_literal145_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr2_in_exprOperateur1085);
					expr2146=expr2();
					state._fsp--;

					adaptor.addChild(root_0, expr2146.getTree());

					}
					break;

				default :
					break loop38;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprOperateur"


	public static class expr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:202:1: expr2 : exprFinale ( ( '*' ^| '/' ^| '&' ^) exprFinale )* ;
	public final expr2_return expr2() throws RecognitionException {
		expr2_return retval = new expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal148=null;
		Token char_literal149=null;
		Token char_literal150=null;
		ParserRuleReturnScope exprFinale147 =null;
		ParserRuleReturnScope exprFinale151 =null;

		Object char_literal148_tree=null;
		Object char_literal149_tree=null;
		Object char_literal150_tree=null;

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:203:2: ( exprFinale ( ( '*' ^| '/' ^| '&' ^) exprFinale )* )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:203:4: exprFinale ( ( '*' ^| '/' ^| '&' ^) exprFinale )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprFinale_in_expr21100);
			exprFinale147=exprFinale();
			state._fsp--;

			adaptor.addChild(root_0, exprFinale147.getTree());

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:203:15: ( ( '*' ^| '/' ^| '&' ^) exprFinale )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==41||LA40_0==44||LA40_0==49) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:203:16: ( '*' ^| '/' ^| '&' ^) exprFinale
					{
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:203:16: ( '*' ^| '/' ^| '&' ^)
					int alt39=3;
					switch ( input.LA(1) ) {
					case 44:
						{
						alt39=1;
						}
						break;
					case 49:
						{
						alt39=2;
						}
						break;
					case 41:
						{
						alt39=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}
					switch (alt39) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:203:17: '*' ^
							{
							char_literal148=(Token)match(input,44,FOLLOW_44_in_expr21104); 
							char_literal148_tree = (Object)adaptor.create(char_literal148);
							root_0 = (Object)adaptor.becomeRoot(char_literal148_tree, root_0);

							}
							break;
						case 2 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:203:22: '/' ^
							{
							char_literal149=(Token)match(input,49,FOLLOW_49_in_expr21107); 
							char_literal149_tree = (Object)adaptor.create(char_literal149);
							root_0 = (Object)adaptor.becomeRoot(char_literal149_tree, root_0);

							}
							break;
						case 3 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:203:27: '&' ^
							{
							char_literal150=(Token)match(input,41,FOLLOW_41_in_expr21110); 
							char_literal150_tree = (Object)adaptor.create(char_literal150);
							root_0 = (Object)adaptor.becomeRoot(char_literal150_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_exprFinale_in_expr21114);
					exprFinale151=exprFinale();
					state._fsp--;

					adaptor.addChild(root_0, exprFinale151.getTree());

					}
					break;

				default :
					break loop40;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr2"


	public static class exprFinale_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprFinale"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:207:1: exprFinale : atom ( messOuSelect -> ^( MESSOUSELECT atom messOuSelect ) | -> atom ) ;
	public final exprFinale_return exprFinale() throws RecognitionException {
		exprFinale_return retval = new exprFinale_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atom152 =null;
		ParserRuleReturnScope messOuSelect153 =null;

		RewriteRuleSubtreeStream stream_messOuSelect=new RewriteRuleSubtreeStream(adaptor,"rule messOuSelect");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:208:2: ( atom ( messOuSelect -> ^( MESSOUSELECT atom messOuSelect ) | -> atom ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:208:3: atom ( messOuSelect -> ^( MESSOUSELECT atom messOuSelect ) | -> atom )
			{
			pushFollow(FOLLOW_atom_in_exprFinale1128);
			atom152=atom();
			state._fsp--;

			stream_atom.add(atom152.getTree());
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:208:8: ( messOuSelect -> ^( MESSOUSELECT atom messOuSelect ) | -> atom )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==48) ) {
				alt41=1;
			}
			else if ( (LA41_0==41||(LA41_0 >= 43 && LA41_0 <= 47)||LA41_0==49||(LA41_0 >= 51 && LA41_0 <= 56)||LA41_0==61||LA41_0==73||LA41_0==75||LA41_0==78) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:208:9: messOuSelect
					{
					pushFollow(FOLLOW_messOuSelect_in_exprFinale1131);
					messOuSelect153=messOuSelect();
					state._fsp--;

					stream_messOuSelect.add(messOuSelect153.getTree());
					// AST REWRITE
					// elements: atom, messOuSelect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 208:22: -> ^( MESSOUSELECT atom messOuSelect )
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:208:25: ^( MESSOUSELECT atom messOuSelect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MESSOUSELECT, "MESSOUSELECT"), root_1);
						adaptor.addChild(root_1, stream_atom.nextTree());
						adaptor.addChild(root_1, stream_messOuSelect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:209:4: 
					{
					// AST REWRITE
					// elements: atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 209:4: -> atom
					{
						adaptor.addChild(root_0, stream_atom.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprFinale"


	public static class messOuSelect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "messOuSelect"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:212:1: messOuSelect : '.' NAME ( envoie_message ( messOuSelect )? -> ^( MESSAGE NAME envoie_message ) ( messOuSelect )? | ( messOuSelect )? -> ^( SELECT NAME ) ( messOuSelect )? ) ;
	public final messOuSelect_return messOuSelect() throws RecognitionException {
		messOuSelect_return retval = new messOuSelect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal154=null;
		Token NAME155=null;
		ParserRuleReturnScope envoie_message156 =null;
		ParserRuleReturnScope messOuSelect157 =null;
		ParserRuleReturnScope messOuSelect158 =null;

		Object char_literal154_tree=null;
		Object NAME155_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_envoie_message=new RewriteRuleSubtreeStream(adaptor,"rule envoie_message");
		RewriteRuleSubtreeStream stream_messOuSelect=new RewriteRuleSubtreeStream(adaptor,"rule messOuSelect");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:213:2: ( '.' NAME ( envoie_message ( messOuSelect )? -> ^( MESSAGE NAME envoie_message ) ( messOuSelect )? | ( messOuSelect )? -> ^( SELECT NAME ) ( messOuSelect )? ) )
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:213:3: '.' NAME ( envoie_message ( messOuSelect )? -> ^( MESSAGE NAME envoie_message ) ( messOuSelect )? | ( messOuSelect )? -> ^( SELECT NAME ) ( messOuSelect )? )
			{
			char_literal154=(Token)match(input,48,FOLLOW_48_in_messOuSelect1162);  
			stream_48.add(char_literal154);

			NAME155=(Token)match(input,NAME,FOLLOW_NAME_in_messOuSelect1164);  
			stream_NAME.add(NAME155);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:213:12: ( envoie_message ( messOuSelect )? -> ^( MESSAGE NAME envoie_message ) ( messOuSelect )? | ( messOuSelect )? -> ^( SELECT NAME ) ( messOuSelect )? )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==42) ) {
				alt44=1;
			}
			else if ( (LA44_0==41||(LA44_0 >= 43 && LA44_0 <= 49)||(LA44_0 >= 51 && LA44_0 <= 56)||LA44_0==61||LA44_0==73||LA44_0==75||LA44_0==78) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:213:13: envoie_message ( messOuSelect )?
					{
					pushFollow(FOLLOW_envoie_message_in_messOuSelect1167);
					envoie_message156=envoie_message();
					state._fsp--;

					stream_envoie_message.add(envoie_message156.getTree());
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:213:28: ( messOuSelect )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==48) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:213:28: messOuSelect
							{
							pushFollow(FOLLOW_messOuSelect_in_messOuSelect1169);
							messOuSelect157=messOuSelect();
							state._fsp--;

							stream_messOuSelect.add(messOuSelect157.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: envoie_message, NAME, messOuSelect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 213:42: -> ^( MESSAGE NAME envoie_message ) ( messOuSelect )?
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:213:45: ^( MESSAGE NAME envoie_message )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MESSAGE, "MESSAGE"), root_1);
						adaptor.addChild(root_1, stream_NAME.nextNode());
						adaptor.addChild(root_1, stream_envoie_message.nextTree());
						adaptor.addChild(root_0, root_1);
						}

						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:213:76: ( messOuSelect )?
						if ( stream_messOuSelect.hasNext() ) {
							adaptor.addChild(root_0, stream_messOuSelect.nextTree());
						}
						stream_messOuSelect.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:214:4: ( messOuSelect )?
					{
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:214:4: ( messOuSelect )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==48) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:214:4: messOuSelect
							{
							pushFollow(FOLLOW_messOuSelect_in_messOuSelect1188);
							messOuSelect158=messOuSelect();
							state._fsp--;

							stream_messOuSelect.add(messOuSelect158.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: NAME, messOuSelect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 214:18: -> ^( SELECT NAME ) ( messOuSelect )?
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:214:21: ^( SELECT NAME )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SELECT, "SELECT"), root_1);
						adaptor.addChild(root_1, stream_NAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:214:36: ( messOuSelect )?
						if ( stream_messOuSelect.hasNext() ) {
							adaptor.addChild(root_0, stream_messOuSelect.nextTree());
						}
						stream_messOuSelect.reset();

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "messOuSelect"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:217:1: atom : ( NB | STRING -> ^( STR STRING ) | NAME ( ':' choixNameClass -> ^( DECLVARIABLE NAME choixNameClass ) | -> NAME ) | identificateur | constante | '(' ! factoParenthese ')' !| CLASSNAME );
	public final atom_return atom() throws RecognitionException {
		atom_return retval = new atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NB159=null;
		Token STRING160=null;
		Token NAME161=null;
		Token char_literal162=null;
		Token char_literal166=null;
		Token char_literal168=null;
		Token CLASSNAME169=null;
		ParserRuleReturnScope choixNameClass163 =null;
		ParserRuleReturnScope identificateur164 =null;
		ParserRuleReturnScope constante165 =null;
		ParserRuleReturnScope factoParenthese167 =null;

		Object NB159_tree=null;
		Object STRING160_tree=null;
		Object NAME161_tree=null;
		Object char_literal162_tree=null;
		Object char_literal166_tree=null;
		Object char_literal168_tree=null;
		Object CLASSNAME169_tree=null;
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:218:2: ( NB | STRING -> ^( STR STRING ) | NAME ( ':' choixNameClass -> ^( DECLVARIABLE NAME choixNameClass ) | -> NAME ) | identificateur | constante | '(' ! factoParenthese ')' !| CLASSNAME )
			int alt46=7;
			switch ( input.LA(1) ) {
			case NB:
				{
				alt46=1;
				}
				break;
			case STRING:
				{
				alt46=2;
				}
				break;
			case NAME:
				{
				alt46=3;
				}
				break;
			case 69:
			case 72:
			case 74:
				{
				alt46=4;
				}
				break;
			case 57:
			case 58:
				{
				alt46=5;
				}
				break;
			case 42:
				{
				alt46=6;
				}
				break;
			case CLASSNAME:
				{
				alt46=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:218:3: NB
					{
					root_0 = (Object)adaptor.nil();


					NB159=(Token)match(input,NB,FOLLOW_NB_in_atom1213); 
					NB159_tree = (Object)adaptor.create(NB159);
					adaptor.addChild(root_0, NB159_tree);

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:219:3: STRING
					{
					STRING160=(Token)match(input,STRING,FOLLOW_STRING_in_atom1217);  
					stream_STRING.add(STRING160);

					// AST REWRITE
					// elements: STRING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 219:10: -> ^( STR STRING )
					{
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:219:13: ^( STR STRING )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STR, "STR"), root_1);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:220:3: NAME ( ':' choixNameClass -> ^( DECLVARIABLE NAME choixNameClass ) | -> NAME )
					{
					NAME161=(Token)match(input,NAME,FOLLOW_NAME_in_atom1229);  
					stream_NAME.add(NAME161);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:220:8: ( ':' choixNameClass -> ^( DECLVARIABLE NAME choixNameClass ) | -> NAME )
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==50) ) {
						alt45=1;
					}
					else if ( (LA45_0==41||(LA45_0 >= 43 && LA45_0 <= 49)||(LA45_0 >= 51 && LA45_0 <= 56)||LA45_0==61||LA45_0==73||LA45_0==75||LA45_0==78) ) {
						alt45=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}

					switch (alt45) {
						case 1 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:220:9: ':' choixNameClass
							{
							char_literal162=(Token)match(input,50,FOLLOW_50_in_atom1232);  
							stream_50.add(char_literal162);

							pushFollow(FOLLOW_choixNameClass_in_atom1234);
							choixNameClass163=choixNameClass();
							state._fsp--;

							stream_choixNameClass.add(choixNameClass163.getTree());
							// AST REWRITE
							// elements: choixNameClass, NAME
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 220:28: -> ^( DECLVARIABLE NAME choixNameClass )
							{
								// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:220:31: ^( DECLVARIABLE NAME choixNameClass )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLVARIABLE, "DECLVARIABLE"), root_1);
								adaptor.addChild(root_1, stream_NAME.nextNode());
								adaptor.addChild(root_1, stream_choixNameClass.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:221:5: 
							{
							// AST REWRITE
							// elements: NAME
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 221:5: -> NAME
							{
								adaptor.addChild(root_0, stream_NAME.nextNode());
							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 4 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:222:3: identificateur
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_identificateur_in_atom1257);
					identificateur164=identificateur();
					state._fsp--;

					adaptor.addChild(root_0, identificateur164.getTree());

					}
					break;
				case 5 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:223:3: constante
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constante_in_atom1261);
					constante165=constante();
					state._fsp--;

					adaptor.addChild(root_0, constante165.getTree());

					}
					break;
				case 6 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:224:3: '(' ! factoParenthese ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal166=(Token)match(input,42,FOLLOW_42_in_atom1265); 
					pushFollow(FOLLOW_factoParenthese_in_atom1268);
					factoParenthese167=factoParenthese();
					state._fsp--;

					adaptor.addChild(root_0, factoParenthese167.getTree());

					char_literal168=(Token)match(input,43,FOLLOW_43_in_atom1270); 
					}
					break;
				case 7 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:225:3: CLASSNAME
					{
					root_0 = (Object)adaptor.nil();


					CLASSNAME169=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_atom1275); 
					CLASSNAME169_tree = (Object)adaptor.create(CLASSNAME169);
					adaptor.addChild(root_0, CLASSNAME169_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class choixNameClass_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "choixNameClass"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:228:1: choixNameClass : ( CLASSNAME | constante );
	public final choixNameClass_return choixNameClass() throws RecognitionException {
		choixNameClass_return retval = new choixNameClass_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CLASSNAME170=null;
		ParserRuleReturnScope constante171 =null;

		Object CLASSNAME170_tree=null;

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:229:2: ( CLASSNAME | constante )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==CLASSNAME) ) {
				alt47=1;
			}
			else if ( ((LA47_0 >= 57 && LA47_0 <= 58)) ) {
				alt47=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:229:3: CLASSNAME
					{
					root_0 = (Object)adaptor.nil();


					CLASSNAME170=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_choixNameClass1286); 
					CLASSNAME170_tree = (Object)adaptor.create(CLASSNAME170);
					adaptor.addChild(root_0, CLASSNAME170_tree);

					}
					break;
				case 2 :
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodReset.g:230:3: constante
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constante_in_choixNameClass1290);
					constante171=constante();
					state._fsp--;

					adaptor.addChild(root_0, constante171.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "choixNameClass"

	// Delegated rules



	public static final BitSet FOLLOW_classDef_in_prog136 = new BitSet(new long[]{0x1000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_progPrincipal_in_prog139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_progPrincipal161 = new BitSet(new long[]{0x0600A40860000800L,0x000000000000756EL});
	public static final BitSet FOLLOW_instruction_in_progPrincipal163 = new BitSet(new long[]{0x0600A40860000800L,0x000000000000756EL});
	public static final BitSet FOLLOW_78_in_progPrincipal166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_classDef186 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CLASSNAME_in_classDef188 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_classDef190 = new BitSet(new long[]{0x0000080020000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_formalOuPas_in_classDef193 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_46_in_classDef196 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_formalOuPas_in_classDef198 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_43_in_classDef204 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_choixHeritage_in_classDef206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_choixHeritage233 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CLASSNAME_in_choixHeritage235 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_choixHeritage237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_choixHeritage239 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_blocDeClasse_in_choixHeritage240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_choixHeritage241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_choixHeritage259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_choixHeritage261 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_blocDeClasse_in_choixHeritage262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_choixHeritage263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribDef_in_blocDeClasse283 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_blocDeClasse_in_blocDeClasse285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_blocDeClasse291 = new BitSet(new long[]{0x0000000020000800L,0x0000000000000090L});
	public static final BitSet FOLLOW_methodeOuCons_in_blocDeClasse293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_consDef_in_methodeOuCons309 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_blocSansCons_in_methodeOuCons311 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_methodeDef_in_methodeOuCons318 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_blocDeClasse_in_methodeOuCons320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASSNAME_in_consDef333 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_consDef335 = new BitSet(new long[]{0x0000080020000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_formalOuPas_in_consDef338 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_46_in_consDef341 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_formalOuPas_in_consDef343 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_43_in_consDef349 = new BitSet(new long[]{0x0004010000000000L});
	public static final BitSet FOLLOW_consSuper_in_consDef351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_consSuper378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_bloc_in_consSuper380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_consSuper388 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CLASSNAME_in_consSuper390 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_consSuper392 = new BitSet(new long[]{0x0600AC0860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_consSuper395 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_46_in_consSuper398 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_consSuper400 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_43_in_consSuper406 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_consSuper408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_bloc_in_consSuper410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribDef_in_blocSansCons437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_blocSansCons441 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000090L});
	public static final BitSet FOLLOW_methodeDef_in_blocSansCons443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_attribDef458 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_attribDef461 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NAME_in_attribDef465 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_attribDef467 = new BitSet(new long[]{0x0600000000000800L});
	public static final BitSet FOLLOW_choixNameClass_in_attribDef469 = new BitSet(new long[]{0x0018000000000000L});
	public static final BitSet FOLLOW_51_in_attribDef472 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_attribDef473 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_attribDef477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_methodeDef509 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_methodeDef514 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NAME_in_methodeDef518 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_methodeDef520 = new BitSet(new long[]{0x0000080020000000L});
	public static final BitSet FOLLOW_param_in_methodeDef523 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_46_in_methodeDef526 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_param_in_methodeDef528 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_43_in_methodeDef534 = new BitSet(new long[]{0x0004010000000000L});
	public static final BitSet FOLLOW_permClassNameAvecExpr_in_methodeDef537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_formalOuPas574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalParam_in_formalOuPas578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_formalParam589 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NAME_in_formalParam591 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_formalParam593 = new BitSet(new long[]{0x0600000000000800L});
	public static final BitSet FOLLOW_choixNameClass_in_formalParam595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_param615 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_param617 = new BitSet(new long[]{0x0600000000000800L});
	public static final BitSet FOLLOW_choixNameClass_in_param619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_permClassNameAvecExpr638 = new BitSet(new long[]{0x0600000000000800L});
	public static final BitSet FOLLOW_choixNameClass_in_permClassNameAvecExpr640 = new BitSet(new long[]{0x0008010000000000L});
	public static final BitSet FOLLOW_devPerm_in_permClassNameAvecExpr642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_permClassNameAvecExpr656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_bloc_in_permClassNameAvecExpr658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_devPerm672 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_devPerm674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_devPerm682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_bloc_in_devPerm684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_bloc699 = new BitSet(new long[]{0x0600A40860000800L,0x000000000000756EL});
	public static final BitSet FOLLOW_instruction_in_bloc702 = new BitSet(new long[]{0x0600A40860000800L,0x000000000000756EL});
	public static final BitSet FOLLOW_78_in_bloc706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_instruction733 = new BitSet(new long[]{0x0018000000000000L});
	public static final BitSet FOLLOW_51_in_instruction736 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_instruction739 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_instruction743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bloc_in_instruction750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_instruction754 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_instruction756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_instruction764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileBoucle_in_instruction768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_instruction772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanciation_in_expression789 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_expression792 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NAME_in_expression794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExpr_in_expression809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_factoParenthese819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_factoParenthese823 = new BitSet(new long[]{0x0600000000000800L});
	public static final BitSet FOLLOW_choixNameClass_in_factoParenthese825 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_factoParenthese827 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_factoParenthese829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_instanciation882 = new BitSet(new long[]{0x0600000000000800L});
	public static final BitSet FOLLOW_choixNameClass_in_instanciation884 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_instanciation886 = new BitSet(new long[]{0x0600AC0860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_instanciation889 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_46_in_instanciation891 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_instanciation893 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_43_in_instanciation899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_envoie_message925 = new BitSet(new long[]{0x0600AC0860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_envoie_message928 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_46_in_envoie_message931 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_expression_in_envoie_message934 = new BitSet(new long[]{0x0000480000000000L});
	public static final BitSet FOLLOW_43_in_envoie_message941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_condition962 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_condExpr_in_condition964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_condition966 = new BitSet(new long[]{0x0600A40860000800L,0x000000000000356EL});
	public static final BitSet FOLLOW_instruction_in_condition968 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_condition970 = new BitSet(new long[]{0x0600A40860000800L,0x000000000000356EL});
	public static final BitSet FOLLOW_instruction_in_condition972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_whileBoucle1003 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_whileBoucle1005 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_condExpr_in_whileBoucle1007 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_whileBoucle1009 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_whileBoucle1011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_bloc_in_whileBoucle1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprOperateur_in_condExpr1033 = new BitSet(new long[]{0x01E0000000000002L});
	public static final BitSet FOLLOW_55_in_condExpr1037 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_54_in_condExpr1041 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_53_in_condExpr1045 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_56_in_condExpr1049 = new BitSet(new long[]{0x0600A40860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_exprOperateur_in_condExpr1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2_in_exprOperateur1074 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_45_in_exprOperateur1078 = new BitSet(new long[]{0x0600040860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_47_in_exprOperateur1081 = new BitSet(new long[]{0x0600040860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_expr2_in_exprOperateur1085 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_exprFinale_in_expr21100 = new BitSet(new long[]{0x0002120000000002L});
	public static final BitSet FOLLOW_44_in_expr21104 = new BitSet(new long[]{0x0600040860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_49_in_expr21107 = new BitSet(new long[]{0x0600040860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_41_in_expr21110 = new BitSet(new long[]{0x0600040860000800L,0x0000000000000520L});
	public static final BitSet FOLLOW_exprFinale_in_expr21114 = new BitSet(new long[]{0x0002120000000002L});
	public static final BitSet FOLLOW_atom_in_exprFinale1128 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_messOuSelect_in_exprFinale1131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_messOuSelect1162 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_NAME_in_messOuSelect1164 = new BitSet(new long[]{0x0001040000000002L});
	public static final BitSet FOLLOW_envoie_message_in_messOuSelect1167 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_messOuSelect_in_messOuSelect1169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_messOuSelect_in_messOuSelect1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NB_in_atom1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atom1229 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_50_in_atom1232 = new BitSet(new long[]{0x0600000000000800L});
	public static final BitSet FOLLOW_choixNameClass_in_atom1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identificateur_in_atom1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constante_in_atom1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_atom1265 = new BitSet(new long[]{0x0E00A40860000800L,0x0000000000000528L});
	public static final BitSet FOLLOW_factoParenthese_in_atom1268 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_atom1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASSNAME_in_atom1275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASSNAME_in_choixNameClass1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constante_in_choixNameClass1290 = new BitSet(new long[]{0x0000000000000002L});
}
