// $ANTLR 3.5.1 /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g 2020-12-24 13:34:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class bloodClassParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIB", "BLOC", "CAST", "CLASS", 
		"CLASSE", "CLASSNAME", "COMMENT", "COND_EXP", "CONSTR", "DECL_VAR", "DEF_BLOC", 
		"DEF_METH_CONS", "ENVOI_MESS", "ENVOI_MESS_CONS", "EXP_CONST", "EXTENDS", 
		"IF", "INSTAN", "METHODE_DEF", "NAME", "NB", "NEW", "PARAM", "RESULT", 
		"ROOT", "STRING", "SUPER_CONS", "WHILE", "WS", "' is'", "'&'", "'('", 
		"')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "':='", "';'", 
		"'<'", "'<>'", "'='", "'>'", "'Integer'", "'String'", "'as'", "'class'", 
		"'def'", "'do'", "'else'", "'extends'", "'if'", "'is'", "'new'", "'override'", 
		"'result'", "'return'", "'static'", "'super'", "'then'", "'this'", "'var'", 
		"'while'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "bloc", "methodeDef", "choixNameClass", "prog", "blocDeClasse", 
		"atom", "instruction", "identificateur", "consSuper", "condExpr", "permClassNameAvecExpr", 
		"devPerm", "expr2", "constante", "declaration_variable", "classDef", "formalParam", 
		"expression", "expr1", "blocSansCons", "whileBoucle", "methodeOuCons", 
		"attribDef", "instanciation", "choixHeritage", "name", "condition", "progPrincipal", 
		"consDef", "className"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public bloodClassParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public bloodClassParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public bloodClassParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return bloodClassParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:1: prog : ( classDef )* progPrincipal -> ^( ROOT ( classDef )* progPrincipal ) ;
	public final bloodClassParser.prog_return prog() throws RecognitionException {
		bloodClassParser.prog_return retval = new bloodClassParser.prog_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope classDef1 =null;
		ParserRuleReturnScope progPrincipal2 =null;

		RewriteRuleSubtreeStream stream_progPrincipal=new RewriteRuleSubtreeStream(adaptor,"rule progPrincipal");
		RewriteRuleSubtreeStream stream_classDef=new RewriteRuleSubtreeStream(adaptor,"rule classDef");

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:6: ( ( classDef )* progPrincipal -> ^( ROOT ( classDef )* progPrincipal ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:8: ( classDef )* progPrincipal
			{
			dbg.location(43,8);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:8: ( classDef )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==53) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:8: classDef
					{
					dbg.location(43,8);
					pushFollow(FOLLOW_classDef_in_prog123);
					classDef1=classDef();
					state._fsp--;

					stream_classDef.add(classDef1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(43,18);
			pushFollow(FOLLOW_progPrincipal_in_prog126);
			progPrincipal2=progPrincipal();
			state._fsp--;

			stream_progPrincipal.add(progPrincipal2.getTree());
			// AST REWRITE
			// elements: classDef, progPrincipal
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
				dbg.location(43,35);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:35: ^( ROOT ( classDef )* progPrincipal )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(43,37);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);
				dbg.location(43,42);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:43:42: ( classDef )*
				while ( stream_classDef.hasNext() ) {
					dbg.location(43,42);
					adaptor.addChild(root_1, stream_classDef.nextTree());
				}
				stream_classDef.reset();
				dbg.location(43,52);
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
		dbg.location(44, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:47:1: progPrincipal : bloc ;
	public final bloodClassParser.progPrincipal_return progPrincipal() throws RecognitionException {
		bloodClassParser.progPrincipal_return retval = new bloodClassParser.progPrincipal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope bloc3 =null;


		try { dbg.enterRule(getGrammarFileName(), "progPrincipal");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:48:2: ( bloc )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:48:3: bloc
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(48,3);
			pushFollow(FOLLOW_bloc_in_progPrincipal150);
			bloc3=bloc();
			state._fsp--;

			adaptor.addChild(root_0, bloc3.getTree());

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
		dbg.location(49, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "progPrincipal");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:52:1: classDef : 'class' className '(' ( formalParam ( ',' formalParam )* )? ')' choixHeritage -> ^( CLASSE className ( formalParam )* choixHeritage ) ;
	public final bloodClassParser.classDef_return classDef() throws RecognitionException {
		bloodClassParser.classDef_return retval = new bloodClassParser.classDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal4=null;
		Token char_literal6=null;
		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope className5 =null;
		ParserRuleReturnScope formalParam7 =null;
		ParserRuleReturnScope formalParam9 =null;
		ParserRuleReturnScope choixHeritage11 =null;

		Object string_literal4_tree=null;
		Object char_literal6_tree=null;
		Object char_literal8_tree=null;
		Object char_literal10_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_formalParam=new RewriteRuleSubtreeStream(adaptor,"rule formalParam");
		RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
		RewriteRuleSubtreeStream stream_choixHeritage=new RewriteRuleSubtreeStream(adaptor,"rule choixHeritage");

		try { dbg.enterRule(getGrammarFileName(), "classDef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:53:2: ( 'class' className '(' ( formalParam ( ',' formalParam )* )? ')' choixHeritage -> ^( CLASSE className ( formalParam )* choixHeritage ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:53:3: 'class' className '(' ( formalParam ( ',' formalParam )* )? ')' choixHeritage
			{
			dbg.location(53,3);
			string_literal4=(Token)match(input,53,FOLLOW_53_in_classDef161);  
			stream_53.add(string_literal4);
			dbg.location(53,11);
			pushFollow(FOLLOW_className_in_classDef163);
			className5=className();
			state._fsp--;

			stream_className.add(className5.getTree());dbg.location(53,21);
			char_literal6=(Token)match(input,35,FOLLOW_35_in_classDef165);  
			stream_35.add(char_literal6);
			dbg.location(53,25);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:53:25: ( formalParam ( ',' formalParam )* )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==NAME||LA3_0==68) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:53:26: formalParam ( ',' formalParam )*
					{
					dbg.location(53,26);
					pushFollow(FOLLOW_formalParam_in_classDef168);
					formalParam7=formalParam();
					state._fsp--;

					stream_formalParam.add(formalParam7.getTree());dbg.location(53,38);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:53:38: ( ',' formalParam )*
					try { dbg.enterSubRule(2);

					loop2:
					while (true) {
						int alt2=2;
						try { dbg.enterDecision(2, decisionCanBacktrack[2]);

						int LA2_0 = input.LA(1);
						if ( (LA2_0==39) ) {
							alt2=1;
						}

						} finally {dbg.exitDecision(2);}

						switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:53:39: ',' formalParam
							{
							dbg.location(53,39);
							char_literal8=(Token)match(input,39,FOLLOW_39_in_classDef171);  
							stream_39.add(char_literal8);
							dbg.location(53,43);
							pushFollow(FOLLOW_formalParam_in_classDef173);
							formalParam9=formalParam();
							state._fsp--;

							stream_formalParam.add(formalParam9.getTree());
							}
							break;

						default :
							break loop2;
						}
					}
					} finally {dbg.exitSubRule(2);}

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(53,59);
			char_literal10=(Token)match(input,36,FOLLOW_36_in_classDef179);  
			stream_36.add(char_literal10);
			dbg.location(53,63);
			pushFollow(FOLLOW_choixHeritage_in_classDef181);
			choixHeritage11=choixHeritage();
			state._fsp--;

			stream_choixHeritage.add(choixHeritage11.getTree());
			// AST REWRITE
			// elements: choixHeritage, formalParam, className
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:77: -> ^( CLASSE className ( formalParam )* choixHeritage )
			{
				dbg.location(53,80);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:53:80: ^( CLASSE className ( formalParam )* choixHeritage )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(53,82);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CLASSE, "CLASSE"), root_1);
				dbg.location(53,89);
				adaptor.addChild(root_1, stream_className.nextTree());dbg.location(53,99);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:53:99: ( formalParam )*
				while ( stream_formalParam.hasNext() ) {
					dbg.location(53,99);
					adaptor.addChild(root_1, stream_formalParam.nextTree());
				}
				stream_formalParam.reset();
				dbg.location(53,112);
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
		dbg.location(54, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "classDef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:57:1: choixHeritage : ( 'extends' className ' is' '{' blocDeClasse '}' -> ^( EXTENDS className blocDeClasse ) | ' is' '{' blocDeClasse '}' -> blocDeClasse );
	public final bloodClassParser.choixHeritage_return choixHeritage() throws RecognitionException {
		bloodClassParser.choixHeritage_return retval = new bloodClassParser.choixHeritage_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal12=null;
		Token string_literal14=null;
		Token char_literal15=null;
		Token char_literal17=null;
		Token string_literal18=null;
		Token char_literal19=null;
		Token char_literal21=null;
		ParserRuleReturnScope className13 =null;
		ParserRuleReturnScope blocDeClasse16 =null;
		ParserRuleReturnScope blocDeClasse20 =null;

		Object string_literal12_tree=null;
		Object string_literal14_tree=null;
		Object char_literal15_tree=null;
		Object char_literal17_tree=null;
		Object string_literal18_tree=null;
		Object char_literal19_tree=null;
		Object char_literal21_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_blocDeClasse=new RewriteRuleSubtreeStream(adaptor,"rule blocDeClasse");
		RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");

		try { dbg.enterRule(getGrammarFileName(), "choixHeritage");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:58:2: ( 'extends' className ' is' '{' blocDeClasse '}' -> ^( EXTENDS className blocDeClasse ) | ' is' '{' blocDeClasse '}' -> blocDeClasse )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==57) ) {
				alt4=1;
			}
			else if ( (LA4_0==33) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:58:3: 'extends' className ' is' '{' blocDeClasse '}'
					{
					dbg.location(58,3);
					string_literal12=(Token)match(input,57,FOLLOW_57_in_choixHeritage206);  
					stream_57.add(string_literal12);
					dbg.location(58,13);
					pushFollow(FOLLOW_className_in_choixHeritage208);
					className13=className();
					state._fsp--;

					stream_className.add(className13.getTree());dbg.location(58,23);
					string_literal14=(Token)match(input,33,FOLLOW_33_in_choixHeritage210);  
					stream_33.add(string_literal14);
					dbg.location(58,29);
					char_literal15=(Token)match(input,70,FOLLOW_70_in_choixHeritage212);  
					stream_70.add(char_literal15);
					dbg.location(58,32);
					pushFollow(FOLLOW_blocDeClasse_in_choixHeritage213);
					blocDeClasse16=blocDeClasse();
					state._fsp--;

					stream_blocDeClasse.add(blocDeClasse16.getTree());dbg.location(58,44);
					char_literal17=(Token)match(input,71,FOLLOW_71_in_choixHeritage214);  
					stream_71.add(char_literal17);

					// AST REWRITE
					// elements: className, blocDeClasse
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 58:48: -> ^( EXTENDS className blocDeClasse )
					{
						dbg.location(58,51);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:58:51: ^( EXTENDS className blocDeClasse )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(58,53);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXTENDS, "EXTENDS"), root_1);
						dbg.location(58,61);
						adaptor.addChild(root_1, stream_className.nextTree());dbg.location(58,71);
						adaptor.addChild(root_1, stream_blocDeClasse.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:59:3: ' is' '{' blocDeClasse '}'
					{
					dbg.location(59,3);
					string_literal18=(Token)match(input,33,FOLLOW_33_in_choixHeritage228);  
					stream_33.add(string_literal18);
					dbg.location(59,9);
					char_literal19=(Token)match(input,70,FOLLOW_70_in_choixHeritage230);  
					stream_70.add(char_literal19);
					dbg.location(59,12);
					pushFollow(FOLLOW_blocDeClasse_in_choixHeritage231);
					blocDeClasse20=blocDeClasse();
					state._fsp--;

					stream_blocDeClasse.add(blocDeClasse20.getTree());dbg.location(59,24);
					char_literal21=(Token)match(input,71,FOLLOW_71_in_choixHeritage232);  
					stream_71.add(char_literal21);

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
					// 59:28: -> blocDeClasse
					{
						dbg.location(59,31);
						adaptor.addChild(root_0, stream_blocDeClasse.nextTree());
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
		dbg.location(60, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "choixHeritage");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "choixHeritage"


	public static class formalParam_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "formalParam"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:62:1: formalParam : ( 'var' )? name ':' choixNameClass -> ^( PARAM name choixNameClass ) ;
	public final bloodClassParser.formalParam_return formalParam() throws RecognitionException {
		bloodClassParser.formalParam_return retval = new bloodClassParser.formalParam_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal22=null;
		Token char_literal24=null;
		ParserRuleReturnScope name23 =null;
		ParserRuleReturnScope choixNameClass25 =null;

		Object string_literal22_tree=null;
		Object char_literal24_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try { dbg.enterRule(getGrammarFileName(), "formalParam");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:63:2: ( ( 'var' )? name ':' choixNameClass -> ^( PARAM name choixNameClass ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:63:3: ( 'var' )? name ':' choixNameClass
			{
			dbg.location(63,3);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:63:3: ( 'var' )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==68) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:63:4: 'var'
					{
					dbg.location(63,4);
					string_literal22=(Token)match(input,68,FOLLOW_68_in_formalParam248);  
					stream_68.add(string_literal22);

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(63,12);
			pushFollow(FOLLOW_name_in_formalParam252);
			name23=name();
			state._fsp--;

			stream_name.add(name23.getTree());dbg.location(63,17);
			char_literal24=(Token)match(input,43,FOLLOW_43_in_formalParam254);  
			stream_43.add(char_literal24);
			dbg.location(63,21);
			pushFollow(FOLLOW_choixNameClass_in_formalParam256);
			choixNameClass25=choixNameClass();
			state._fsp--;

			stream_choixNameClass.add(choixNameClass25.getTree());
			// AST REWRITE
			// elements: choixNameClass, name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:36: -> ^( PARAM name choixNameClass )
			{
				dbg.location(63,40);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:63:40: ^( PARAM name choixNameClass )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(63,42);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
				dbg.location(63,48);
				adaptor.addChild(root_1, stream_name.nextTree());dbg.location(63,53);
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
		dbg.location(64, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "formalParam");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "formalParam"


	public static class blocDeClasse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "blocDeClasse"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:68:1: blocDeClasse : ( attribDef blocDeClasse | 'def' methodeOuCons -> ^( DEF_METH_CONS methodeOuCons ) );
	public final bloodClassParser.blocDeClasse_return blocDeClasse() throws RecognitionException {
		bloodClassParser.blocDeClasse_return retval = new bloodClassParser.blocDeClasse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal28=null;
		ParserRuleReturnScope attribDef26 =null;
		ParserRuleReturnScope blocDeClasse27 =null;
		ParserRuleReturnScope methodeOuCons29 =null;

		Object string_literal28_tree=null;
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_methodeOuCons=new RewriteRuleSubtreeStream(adaptor,"rule methodeOuCons");

		try { dbg.enterRule(getGrammarFileName(), "blocDeClasse");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:69:2: ( attribDef blocDeClasse | 'def' methodeOuCons -> ^( DEF_METH_CONS methodeOuCons ) )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==68) ) {
				alt6=1;
			}
			else if ( (LA6_0==54) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:69:3: attribDef blocDeClasse
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(69,3);
					pushFollow(FOLLOW_attribDef_in_blocDeClasse281);
					attribDef26=attribDef();
					state._fsp--;

					adaptor.addChild(root_0, attribDef26.getTree());
					dbg.location(69,13);
					pushFollow(FOLLOW_blocDeClasse_in_blocDeClasse283);
					blocDeClasse27=blocDeClasse();
					state._fsp--;

					adaptor.addChild(root_0, blocDeClasse27.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:71:3: 'def' methodeOuCons
					{
					dbg.location(71,3);
					string_literal28=(Token)match(input,54,FOLLOW_54_in_blocDeClasse290);  
					stream_54.add(string_literal28);
					dbg.location(71,9);
					pushFollow(FOLLOW_methodeOuCons_in_blocDeClasse292);
					methodeOuCons29=methodeOuCons();
					state._fsp--;

					stream_methodeOuCons.add(methodeOuCons29.getTree());
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
					// 71:23: -> ^( DEF_METH_CONS methodeOuCons )
					{
						dbg.location(71,26);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:71:26: ^( DEF_METH_CONS methodeOuCons )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(71,28);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEF_METH_CONS, "DEF_METH_CONS"), root_1);
						dbg.location(71,42);
						adaptor.addChild(root_1, stream_methodeOuCons.nextTree());
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
		dbg.location(73, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "blocDeClasse");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:75:1: methodeOuCons : ( consDef ( blocSansCons )* | methodeDef blocDeClasse );
	public final bloodClassParser.methodeOuCons_return methodeOuCons() throws RecognitionException {
		bloodClassParser.methodeOuCons_return retval = new bloodClassParser.methodeOuCons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope consDef30 =null;
		ParserRuleReturnScope blocSansCons31 =null;
		ParserRuleReturnScope methodeDef32 =null;
		ParserRuleReturnScope blocDeClasse33 =null;


		try { dbg.enterRule(getGrammarFileName(), "methodeOuCons");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:76:2: ( consDef ( blocSansCons )* | methodeDef blocDeClasse )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==CLASSNAME) ) {
				alt8=1;
			}
			else if ( (LA8_0==NAME||LA8_0==61||LA8_0==64) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:76:3: consDef ( blocSansCons )*
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(76,3);
					pushFollow(FOLLOW_consDef_in_methodeOuCons313);
					consDef30=consDef();
					state._fsp--;

					adaptor.addChild(root_0, consDef30.getTree());
					dbg.location(76,11);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:76:11: ( blocSansCons )*
					try { dbg.enterSubRule(7);

					loop7:
					while (true) {
						int alt7=2;
						try { dbg.enterDecision(7, decisionCanBacktrack[7]);

						int LA7_0 = input.LA(1);
						if ( (LA7_0==54||LA7_0==68) ) {
							alt7=1;
						}

						} finally {dbg.exitDecision(7);}

						switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:76:11: blocSansCons
							{
							dbg.location(76,11);
							pushFollow(FOLLOW_blocSansCons_in_methodeOuCons315);
							blocSansCons31=blocSansCons();
							state._fsp--;

							adaptor.addChild(root_0, blocSansCons31.getTree());

							}
							break;

						default :
							break loop7;
						}
					}
					} finally {dbg.exitSubRule(7);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:78:3: methodeDef blocDeClasse
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(78,3);
					pushFollow(FOLLOW_methodeDef_in_methodeOuCons323);
					methodeDef32=methodeDef();
					state._fsp--;

					adaptor.addChild(root_0, methodeDef32.getTree());
					dbg.location(78,14);
					pushFollow(FOLLOW_blocDeClasse_in_methodeOuCons325);
					blocDeClasse33=blocDeClasse();
					state._fsp--;

					adaptor.addChild(root_0, blocDeClasse33.getTree());

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
		dbg.location(80, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "methodeOuCons");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:83:1: consDef : className '(' ( formalParam ( ',' formalParam )* )? ')' consSuper -> ^( CONSTR className ( formalParam )* consSuper ) ;
	public final bloodClassParser.consDef_return consDef() throws RecognitionException {
		bloodClassParser.consDef_return retval = new bloodClassParser.consDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal35=null;
		Token char_literal37=null;
		Token char_literal39=null;
		ParserRuleReturnScope className34 =null;
		ParserRuleReturnScope formalParam36 =null;
		ParserRuleReturnScope formalParam38 =null;
		ParserRuleReturnScope consSuper40 =null;

		Object char_literal35_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_formalParam=new RewriteRuleSubtreeStream(adaptor,"rule formalParam");
		RewriteRuleSubtreeStream stream_consSuper=new RewriteRuleSubtreeStream(adaptor,"rule consSuper");
		RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");

		try { dbg.enterRule(getGrammarFileName(), "consDef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:84:2: ( className '(' ( formalParam ( ',' formalParam )* )? ')' consSuper -> ^( CONSTR className ( formalParam )* consSuper ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:84:3: className '(' ( formalParam ( ',' formalParam )* )? ')' consSuper
			{
			dbg.location(84,3);
			pushFollow(FOLLOW_className_in_consDef338);
			className34=className();
			state._fsp--;

			stream_className.add(className34.getTree());dbg.location(84,13);
			char_literal35=(Token)match(input,35,FOLLOW_35_in_consDef340);  
			stream_35.add(char_literal35);
			dbg.location(84,17);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:84:17: ( formalParam ( ',' formalParam )* )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==NAME||LA10_0==68) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:84:18: formalParam ( ',' formalParam )*
					{
					dbg.location(84,18);
					pushFollow(FOLLOW_formalParam_in_consDef343);
					formalParam36=formalParam();
					state._fsp--;

					stream_formalParam.add(formalParam36.getTree());dbg.location(84,30);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:84:30: ( ',' formalParam )*
					try { dbg.enterSubRule(9);

					loop9:
					while (true) {
						int alt9=2;
						try { dbg.enterDecision(9, decisionCanBacktrack[9]);

						int LA9_0 = input.LA(1);
						if ( (LA9_0==39) ) {
							alt9=1;
						}

						} finally {dbg.exitDecision(9);}

						switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:84:31: ',' formalParam
							{
							dbg.location(84,31);
							char_literal37=(Token)match(input,39,FOLLOW_39_in_consDef346);  
							stream_39.add(char_literal37);
							dbg.location(84,35);
							pushFollow(FOLLOW_formalParam_in_consDef348);
							formalParam38=formalParam();
							state._fsp--;

							stream_formalParam.add(formalParam38.getTree());
							}
							break;

						default :
							break loop9;
						}
					}
					} finally {dbg.exitSubRule(9);}

					}
					break;

			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(84,51);
			char_literal39=(Token)match(input,36,FOLLOW_36_in_consDef354);  
			stream_36.add(char_literal39);
			dbg.location(84,55);
			pushFollow(FOLLOW_consSuper_in_consDef356);
			consSuper40=consSuper();
			state._fsp--;

			stream_consSuper.add(consSuper40.getTree());
			// AST REWRITE
			// elements: formalParam, consSuper, className
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 84:65: -> ^( CONSTR className ( formalParam )* consSuper )
			{
				dbg.location(84,68);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:84:68: ^( CONSTR className ( formalParam )* consSuper )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(84,70);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTR, "CONSTR"), root_1);
				dbg.location(84,77);
				adaptor.addChild(root_1, stream_className.nextTree());dbg.location(84,87);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:84:87: ( formalParam )*
				while ( stream_formalParam.hasNext() ) {
					dbg.location(84,87);
					adaptor.addChild(root_1, stream_formalParam.nextTree());
				}
				stream_formalParam.reset();
				dbg.location(84,100);
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
		dbg.location(85, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "consDef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:87:1: consSuper : ( ' is' bloc -> bloc | ':' className '(' ( expr1 ( ',' expr1 )* )? ')' ' is' bloc -> ^( SUPER_CONS className ( expr1 )* bloc ) );
	public final bloodClassParser.consSuper_return consSuper() throws RecognitionException {
		bloodClassParser.consSuper_return retval = new bloodClassParser.consSuper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal41=null;
		Token char_literal43=null;
		Token char_literal45=null;
		Token char_literal47=null;
		Token char_literal49=null;
		Token string_literal50=null;
		ParserRuleReturnScope bloc42 =null;
		ParserRuleReturnScope className44 =null;
		ParserRuleReturnScope expr146 =null;
		ParserRuleReturnScope expr148 =null;
		ParserRuleReturnScope bloc51 =null;

		Object string_literal41_tree=null;
		Object char_literal43_tree=null;
		Object char_literal45_tree=null;
		Object char_literal47_tree=null;
		Object char_literal49_tree=null;
		Object string_literal50_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
		RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
		RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1");

		try { dbg.enterRule(getGrammarFileName(), "consSuper");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:88:2: ( ' is' bloc -> bloc | ':' className '(' ( expr1 ( ',' expr1 )* )? ')' ' is' bloc -> ^( SUPER_CONS className ( expr1 )* bloc ) )
			int alt13=2;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==33) ) {
				alt13=1;
			}
			else if ( (LA13_0==43) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:88:3: ' is' bloc
					{
					dbg.location(88,3);
					string_literal41=(Token)match(input,33,FOLLOW_33_in_consSuper379);  
					stream_33.add(string_literal41);
					dbg.location(88,9);
					pushFollow(FOLLOW_bloc_in_consSuper381);
					bloc42=bloc();
					state._fsp--;

					stream_bloc.add(bloc42.getTree());
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
					// 88:14: -> bloc
					{
						dbg.location(88,17);
						adaptor.addChild(root_0, stream_bloc.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:89:3: ':' className '(' ( expr1 ( ',' expr1 )* )? ')' ' is' bloc
					{
					dbg.location(89,3);
					char_literal43=(Token)match(input,43,FOLLOW_43_in_consSuper391);  
					stream_43.add(char_literal43);
					dbg.location(89,7);
					pushFollow(FOLLOW_className_in_consSuper393);
					className44=className();
					state._fsp--;

					stream_className.add(className44.getTree());dbg.location(89,17);
					char_literal45=(Token)match(input,35,FOLLOW_35_in_consSuper395);  
					stream_35.add(char_literal45);
					dbg.location(89,21);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:89:21: ( expr1 ( ',' expr1 )* )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==CLASSNAME||(LA12_0 >= NAME && LA12_0 <= NB)||LA12_0==STRING||LA12_0==65||LA12_0==67) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:89:22: expr1 ( ',' expr1 )*
							{
							dbg.location(89,22);
							pushFollow(FOLLOW_expr1_in_consSuper398);
							expr146=expr1();
							state._fsp--;

							stream_expr1.add(expr146.getTree());dbg.location(89,28);
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:89:28: ( ',' expr1 )*
							try { dbg.enterSubRule(11);

							loop11:
							while (true) {
								int alt11=2;
								try { dbg.enterDecision(11, decisionCanBacktrack[11]);

								int LA11_0 = input.LA(1);
								if ( (LA11_0==39) ) {
									alt11=1;
								}

								} finally {dbg.exitDecision(11);}

								switch (alt11) {
								case 1 :
									dbg.enterAlt(1);

									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:89:29: ',' expr1
									{
									dbg.location(89,29);
									char_literal47=(Token)match(input,39,FOLLOW_39_in_consSuper401);  
									stream_39.add(char_literal47);
									dbg.location(89,33);
									pushFollow(FOLLOW_expr1_in_consSuper403);
									expr148=expr1();
									state._fsp--;

									stream_expr1.add(expr148.getTree());
									}
									break;

								default :
									break loop11;
								}
							}
							} finally {dbg.exitSubRule(11);}

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(89,43);
					char_literal49=(Token)match(input,36,FOLLOW_36_in_consSuper409);  
					stream_36.add(char_literal49);
					dbg.location(89,47);
					string_literal50=(Token)match(input,33,FOLLOW_33_in_consSuper411);  
					stream_33.add(string_literal50);
					dbg.location(89,53);
					pushFollow(FOLLOW_bloc_in_consSuper413);
					bloc51=bloc();
					state._fsp--;

					stream_bloc.add(bloc51.getTree());
					// AST REWRITE
					// elements: className, bloc, expr1
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 89:58: -> ^( SUPER_CONS className ( expr1 )* bloc )
					{
						dbg.location(89,61);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:89:61: ^( SUPER_CONS className ( expr1 )* bloc )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(89,63);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUPER_CONS, "SUPER_CONS"), root_1);
						dbg.location(89,74);
						adaptor.addChild(root_1, stream_className.nextTree());dbg.location(89,84);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:89:84: ( expr1 )*
						while ( stream_expr1.hasNext() ) {
							dbg.location(89,84);
							adaptor.addChild(root_1, stream_expr1.nextTree());
						}
						stream_expr1.reset();
						dbg.location(89,91);
						adaptor.addChild(root_1, stream_bloc.nextTree());
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
		dbg.location(90, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "consSuper");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:92:1: blocSansCons : ( attribDef | 'def' methodeDef -> methodeDef );
	public final bloodClassParser.blocSansCons_return blocSansCons() throws RecognitionException {
		bloodClassParser.blocSansCons_return retval = new bloodClassParser.blocSansCons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal53=null;
		ParserRuleReturnScope attribDef52 =null;
		ParserRuleReturnScope methodeDef54 =null;

		Object string_literal53_tree=null;
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_methodeDef=new RewriteRuleSubtreeStream(adaptor,"rule methodeDef");

		try { dbg.enterRule(getGrammarFileName(), "blocSansCons");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:93:2: ( attribDef | 'def' methodeDef -> methodeDef )
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==68) ) {
				alt14=1;
			}
			else if ( (LA14_0==54) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:93:3: attribDef
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(93,3);
					pushFollow(FOLLOW_attribDef_in_blocSansCons437);
					attribDef52=attribDef();
					state._fsp--;

					adaptor.addChild(root_0, attribDef52.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:95:3: 'def' methodeDef
					{
					dbg.location(95,3);
					string_literal53=(Token)match(input,54,FOLLOW_54_in_blocSansCons443);  
					stream_54.add(string_literal53);
					dbg.location(95,9);
					pushFollow(FOLLOW_methodeDef_in_blocSansCons445);
					methodeDef54=methodeDef();
					state._fsp--;

					stream_methodeDef.add(methodeDef54.getTree());
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
					// 95:20: -> methodeDef
					{
						dbg.location(95,24);
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
		dbg.location(97, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "blocSansCons");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:100:1: attribDef : 'var' ( 'static' )? name ':' choixNameClass ( ':=' expression )? ';' -> ^( ATTRIB ( 'static' )? name choixNameClass ( expression )? ) ;
	public final bloodClassParser.attribDef_return attribDef() throws RecognitionException {
		bloodClassParser.attribDef_return retval = new bloodClassParser.attribDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal55=null;
		Token string_literal56=null;
		Token char_literal58=null;
		Token string_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope name57 =null;
		ParserRuleReturnScope choixNameClass59 =null;
		ParserRuleReturnScope expression61 =null;

		Object string_literal55_tree=null;
		Object string_literal56_tree=null;
		Object char_literal58_tree=null;
		Object string_literal60_tree=null;
		Object char_literal62_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try { dbg.enterRule(getGrammarFileName(), "attribDef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:2: ( 'var' ( 'static' )? name ':' choixNameClass ( ':=' expression )? ';' -> ^( ATTRIB ( 'static' )? name choixNameClass ( expression )? ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:3: 'var' ( 'static' )? name ':' choixNameClass ( ':=' expression )? ';'
			{
			dbg.location(101,3);
			string_literal55=(Token)match(input,68,FOLLOW_68_in_attribDef463);  
			stream_68.add(string_literal55);
			dbg.location(101,9);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:9: ( 'static' )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==64) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:10: 'static'
					{
					dbg.location(101,10);
					string_literal56=(Token)match(input,64,FOLLOW_64_in_attribDef466);  
					stream_64.add(string_literal56);

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(101,21);
			pushFollow(FOLLOW_name_in_attribDef470);
			name57=name();
			state._fsp--;

			stream_name.add(name57.getTree());dbg.location(101,26);
			char_literal58=(Token)match(input,43,FOLLOW_43_in_attribDef472);  
			stream_43.add(char_literal58);
			dbg.location(101,30);
			pushFollow(FOLLOW_choixNameClass_in_attribDef474);
			choixNameClass59=choixNameClass();
			state._fsp--;

			stream_choixNameClass.add(choixNameClass59.getTree());dbg.location(101,45);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:45: ( ':=' expression )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==44) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:46: ':=' expression
					{
					dbg.location(101,46);
					string_literal60=(Token)match(input,44,FOLLOW_44_in_attribDef477);  
					stream_44.add(string_literal60);
					dbg.location(101,50);
					pushFollow(FOLLOW_expression_in_attribDef478);
					expression61=expression();
					state._fsp--;

					stream_expression.add(expression61.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(101,63);
			char_literal62=(Token)match(input,45,FOLLOW_45_in_attribDef482);  
			stream_45.add(char_literal62);

			// AST REWRITE
			// elements: 64, choixNameClass, expression, name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 101:67: -> ^( ATTRIB ( 'static' )? name choixNameClass ( expression )? )
			{
				dbg.location(101,70);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:70: ^( ATTRIB ( 'static' )? name choixNameClass ( expression )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(101,72);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIB, "ATTRIB"), root_1);
				dbg.location(101,79);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:79: ( 'static' )?
				if ( stream_64.hasNext() ) {
					dbg.location(101,80);
					adaptor.addChild(root_1, stream_64.nextNode());
				}
				stream_64.reset();
				dbg.location(101,91);
				adaptor.addChild(root_1, stream_name.nextTree());dbg.location(101,96);
				adaptor.addChild(root_1, stream_choixNameClass.nextTree());dbg.location(101,111);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:101:111: ( expression )?
				if ( stream_expression.hasNext() ) {
					dbg.location(101,112);
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
		dbg.location(102, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "attribDef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:105:1: methodeDef : ( 'static' )? ( 'override' )? name '(' ( formalParam ( ',' formalParam )* )? ')' permClassNameAvecExpr -> ^( METHODE_DEF ( 'static' )? ( 'override' )? name ( formalParam )* permClassNameAvecExpr ) ;
	public final bloodClassParser.methodeDef_return methodeDef() throws RecognitionException {
		bloodClassParser.methodeDef_return retval = new bloodClassParser.methodeDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal63=null;
		Token string_literal64=null;
		Token char_literal66=null;
		Token char_literal68=null;
		Token char_literal70=null;
		ParserRuleReturnScope name65 =null;
		ParserRuleReturnScope formalParam67 =null;
		ParserRuleReturnScope formalParam69 =null;
		ParserRuleReturnScope permClassNameAvecExpr71 =null;

		Object string_literal63_tree=null;
		Object string_literal64_tree=null;
		Object char_literal66_tree=null;
		Object char_literal68_tree=null;
		Object char_literal70_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_formalParam=new RewriteRuleSubtreeStream(adaptor,"rule formalParam");
		RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
		RewriteRuleSubtreeStream stream_permClassNameAvecExpr=new RewriteRuleSubtreeStream(adaptor,"rule permClassNameAvecExpr");

		try { dbg.enterRule(getGrammarFileName(), "methodeDef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:2: ( ( 'static' )? ( 'override' )? name '(' ( formalParam ( ',' formalParam )* )? ')' permClassNameAvecExpr -> ^( METHODE_DEF ( 'static' )? ( 'override' )? name ( formalParam )* permClassNameAvecExpr ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:3: ( 'static' )? ( 'override' )? name '(' ( formalParam ( ',' formalParam )* )? ')' permClassNameAvecExpr
			{
			dbg.location(106,3);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:3: ( 'static' )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==64) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:4: 'static'
					{
					dbg.location(106,4);
					string_literal63=(Token)match(input,64,FOLLOW_64_in_methodeDef514);  
					stream_64.add(string_literal63);

					}
					break;

			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(106,15);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:15: ( 'override' )?
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==61) ) {
				alt18=1;
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:16: 'override'
					{
					dbg.location(106,16);
					string_literal64=(Token)match(input,61,FOLLOW_61_in_methodeDef519);  
					stream_61.add(string_literal64);

					}
					break;

			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(106,29);
			pushFollow(FOLLOW_name_in_methodeDef523);
			name65=name();
			state._fsp--;

			stream_name.add(name65.getTree());dbg.location(106,34);
			char_literal66=(Token)match(input,35,FOLLOW_35_in_methodeDef525);  
			stream_35.add(char_literal66);
			dbg.location(106,38);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:38: ( formalParam ( ',' formalParam )* )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==NAME||LA20_0==68) ) {
				alt20=1;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:39: formalParam ( ',' formalParam )*
					{
					dbg.location(106,39);
					pushFollow(FOLLOW_formalParam_in_methodeDef528);
					formalParam67=formalParam();
					state._fsp--;

					stream_formalParam.add(formalParam67.getTree());dbg.location(106,51);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:51: ( ',' formalParam )*
					try { dbg.enterSubRule(19);

					loop19:
					while (true) {
						int alt19=2;
						try { dbg.enterDecision(19, decisionCanBacktrack[19]);

						int LA19_0 = input.LA(1);
						if ( (LA19_0==39) ) {
							alt19=1;
						}

						} finally {dbg.exitDecision(19);}

						switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:52: ',' formalParam
							{
							dbg.location(106,52);
							char_literal68=(Token)match(input,39,FOLLOW_39_in_methodeDef531);  
							stream_39.add(char_literal68);
							dbg.location(106,56);
							pushFollow(FOLLOW_formalParam_in_methodeDef533);
							formalParam69=formalParam();
							state._fsp--;

							stream_formalParam.add(formalParam69.getTree());
							}
							break;

						default :
							break loop19;
						}
					}
					} finally {dbg.exitSubRule(19);}

					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(106,72);
			char_literal70=(Token)match(input,36,FOLLOW_36_in_methodeDef539);  
			stream_36.add(char_literal70);
			dbg.location(106,77);
			pushFollow(FOLLOW_permClassNameAvecExpr_in_methodeDef542);
			permClassNameAvecExpr71=permClassNameAvecExpr();
			state._fsp--;

			stream_permClassNameAvecExpr.add(permClassNameAvecExpr71.getTree());
			// AST REWRITE
			// elements: 61, permClassNameAvecExpr, 64, name, formalParam
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 106:99: -> ^( METHODE_DEF ( 'static' )? ( 'override' )? name ( formalParam )* permClassNameAvecExpr )
			{
				dbg.location(106,102);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:102: ^( METHODE_DEF ( 'static' )? ( 'override' )? name ( formalParam )* permClassNameAvecExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(106,104);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHODE_DEF, "METHODE_DEF"), root_1);
				dbg.location(106,116);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:116: ( 'static' )?
				if ( stream_64.hasNext() ) {
					dbg.location(106,117);
					adaptor.addChild(root_1, stream_64.nextNode());
				}
				stream_64.reset();
				dbg.location(106,128);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:128: ( 'override' )?
				if ( stream_61.hasNext() ) {
					dbg.location(106,129);
					adaptor.addChild(root_1, stream_61.nextNode());
				}
				stream_61.reset();
				dbg.location(106,142);
				adaptor.addChild(root_1, stream_name.nextTree());dbg.location(106,147);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:106:147: ( formalParam )*
				while ( stream_formalParam.hasNext() ) {
					dbg.location(106,147);
					adaptor.addChild(root_1, stream_formalParam.nextTree());
				}
				stream_formalParam.reset();
				dbg.location(106,160);
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
		dbg.location(107, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "methodeDef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "methodeDef"


	public static class permClassNameAvecExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "permClassNameAvecExpr"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:110:1: permClassNameAvecExpr : ( ':' choixNameClass devPerm -> choixNameClass devPerm | ' is' bloc -> bloc );
	public final bloodClassParser.permClassNameAvecExpr_return permClassNameAvecExpr() throws RecognitionException {
		bloodClassParser.permClassNameAvecExpr_return retval = new bloodClassParser.permClassNameAvecExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal72=null;
		Token string_literal75=null;
		ParserRuleReturnScope choixNameClass73 =null;
		ParserRuleReturnScope devPerm74 =null;
		ParserRuleReturnScope bloc76 =null;

		Object char_literal72_tree=null;
		Object string_literal75_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
		RewriteRuleSubtreeStream stream_devPerm=new RewriteRuleSubtreeStream(adaptor,"rule devPerm");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try { dbg.enterRule(getGrammarFileName(), "permClassNameAvecExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(110, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:111:2: ( ':' choixNameClass devPerm -> choixNameClass devPerm | ' is' bloc -> bloc )
			int alt21=2;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==43) ) {
				alt21=1;
			}
			else if ( (LA21_0==33) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:111:3: ':' choixNameClass devPerm
					{
					dbg.location(111,3);
					char_literal72=(Token)match(input,43,FOLLOW_43_in_permClassNameAvecExpr577);  
					stream_43.add(char_literal72);
					dbg.location(111,7);
					pushFollow(FOLLOW_choixNameClass_in_permClassNameAvecExpr579);
					choixNameClass73=choixNameClass();
					state._fsp--;

					stream_choixNameClass.add(choixNameClass73.getTree());dbg.location(111,22);
					pushFollow(FOLLOW_devPerm_in_permClassNameAvecExpr581);
					devPerm74=devPerm();
					state._fsp--;

					stream_devPerm.add(devPerm74.getTree());
					// AST REWRITE
					// elements: choixNameClass, devPerm
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 111:30: -> choixNameClass devPerm
					{
						dbg.location(111,33);
						adaptor.addChild(root_0, stream_choixNameClass.nextTree());dbg.location(111,48);
						adaptor.addChild(root_0, stream_devPerm.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:112:3: ' is' bloc
					{
					dbg.location(112,3);
					string_literal75=(Token)match(input,33,FOLLOW_33_in_permClassNameAvecExpr591);  
					stream_33.add(string_literal75);
					dbg.location(112,9);
					pushFollow(FOLLOW_bloc_in_permClassNameAvecExpr593);
					bloc76=bloc();
					state._fsp--;

					stream_bloc.add(bloc76.getTree());
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
					// 112:14: -> bloc
					{
						dbg.location(112,17);
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
		dbg.location(113, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "permClassNameAvecExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:115:1: devPerm : ( ':=' expression -> expression | ' is' bloc -> bloc );
	public final bloodClassParser.devPerm_return devPerm() throws RecognitionException {
		bloodClassParser.devPerm_return retval = new bloodClassParser.devPerm_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal77=null;
		Token string_literal79=null;
		ParserRuleReturnScope expression78 =null;
		ParserRuleReturnScope bloc80 =null;

		Object string_literal77_tree=null;
		Object string_literal79_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "devPerm");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:116:2: ( ':=' expression -> expression | ' is' bloc -> bloc )
			int alt22=2;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==44) ) {
				alt22=1;
			}
			else if ( (LA22_0==33) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:116:3: ':=' expression
					{
					dbg.location(116,3);
					string_literal77=(Token)match(input,44,FOLLOW_44_in_devPerm607);  
					stream_44.add(string_literal77);
					dbg.location(116,8);
					pushFollow(FOLLOW_expression_in_devPerm609);
					expression78=expression();
					state._fsp--;

					stream_expression.add(expression78.getTree());
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
					// 116:19: -> expression
					{
						dbg.location(116,22);
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:117:3: ' is' bloc
					{
					dbg.location(117,3);
					string_literal79=(Token)match(input,33,FOLLOW_33_in_devPerm617);  
					stream_33.add(string_literal79);
					dbg.location(117,9);
					pushFollow(FOLLOW_bloc_in_devPerm619);
					bloc80=bloc();
					state._fsp--;

					stream_bloc.add(bloc80.getTree());
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
					// 117:14: -> bloc
					{
						dbg.location(117,17);
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
		dbg.location(118, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "devPerm");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:121:1: bloc : '{' ( instruction )* '}' -> ^( BLOC ( instruction )* ) ;
	public final bloodClassParser.bloc_return bloc() throws RecognitionException {
		bloodClassParser.bloc_return retval = new bloodClassParser.bloc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal81=null;
		Token char_literal83=null;
		ParserRuleReturnScope instruction82 =null;

		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");

		try { dbg.enterRule(getGrammarFileName(), "bloc");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:122:2: ( '{' ( instruction )* '}' -> ^( BLOC ( instruction )* ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:122:3: '{' ( instruction )* '}'
			{
			dbg.location(122,3);
			char_literal81=(Token)match(input,70,FOLLOW_70_in_bloc634);  
			stream_70.add(char_literal81);
			dbg.location(122,6);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:122:6: ( instruction )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==CLASSNAME||(LA23_0 >= NAME && LA23_0 <= NB)||LA23_0==STRING||LA23_0==35||(LA23_0 >= 50 && LA23_0 <= 51)||(LA23_0 >= 58 && LA23_0 <= 60)||(LA23_0 >= 62 && LA23_0 <= 63)||LA23_0==65||LA23_0==67||(LA23_0 >= 69 && LA23_0 <= 70)) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:122:7: instruction
					{
					dbg.location(122,7);
					pushFollow(FOLLOW_instruction_in_bloc636);
					instruction82=instruction();
					state._fsp--;

					stream_instruction.add(instruction82.getTree());
					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(122,21);
			char_literal83=(Token)match(input,71,FOLLOW_71_in_bloc640);  
			stream_71.add(char_literal83);

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
			// 122:25: -> ^( BLOC ( instruction )* )
			{
				dbg.location(122,28);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:122:28: ^( BLOC ( instruction )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(122,30);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOC, "BLOC"), root_1);
				dbg.location(122,35);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:122:35: ( instruction )*
				while ( stream_instruction.hasNext() ) {
					dbg.location(122,35);
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
		dbg.location(123, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bloc");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "bloc"


	public static class declaration_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration_variable"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:127:1: declaration_variable : ':' choixNameClass ( ':=' expression )? -> ^( DECL_VAR choixNameClass ( expression )? ) ;
	public final bloodClassParser.declaration_variable_return declaration_variable() throws RecognitionException {
		bloodClassParser.declaration_variable_return retval = new bloodClassParser.declaration_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal84=null;
		Token string_literal86=null;
		ParserRuleReturnScope choixNameClass85 =null;
		ParserRuleReturnScope expression87 =null;

		Object char_literal84_tree=null;
		Object string_literal86_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_choixNameClass=new RewriteRuleSubtreeStream(adaptor,"rule choixNameClass");

		try { dbg.enterRule(getGrammarFileName(), "declaration_variable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(127, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:128:2: ( ':' choixNameClass ( ':=' expression )? -> ^( DECL_VAR choixNameClass ( expression )? ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:128:3: ':' choixNameClass ( ':=' expression )?
			{
			dbg.location(128,3);
			char_literal84=(Token)match(input,43,FOLLOW_43_in_declaration_variable662);  
			stream_43.add(char_literal84);
			dbg.location(128,7);
			pushFollow(FOLLOW_choixNameClass_in_declaration_variable664);
			choixNameClass85=choixNameClass();
			state._fsp--;

			stream_choixNameClass.add(choixNameClass85.getTree());dbg.location(128,22);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:128:22: ( ':=' expression )?
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==44) ) {
				alt24=1;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:128:23: ':=' expression
					{
					dbg.location(128,23);
					string_literal86=(Token)match(input,44,FOLLOW_44_in_declaration_variable667);  
					stream_44.add(string_literal86);
					dbg.location(128,29);
					pushFollow(FOLLOW_expression_in_declaration_variable670);
					expression87=expression();
					state._fsp--;

					stream_expression.add(expression87.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(24);}

			// AST REWRITE
			// elements: choixNameClass, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 128:42: -> ^( DECL_VAR choixNameClass ( expression )? )
			{
				dbg.location(128,45);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:128:45: ^( DECL_VAR choixNameClass ( expression )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(128,47);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL_VAR, "DECL_VAR"), root_1);
				dbg.location(128,56);
				adaptor.addChild(root_1, stream_choixNameClass.nextTree());dbg.location(128,71);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:128:71: ( expression )?
				if ( stream_expression.hasNext() ) {
					dbg.location(128,71);
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
		dbg.location(129, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration_variable");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "declaration_variable"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:132:1: instruction : ( expression ( declaration_variable )? ';' -> expression ( declaration_variable )? | bloc | 'is' | 'return' ';' -> 'return' | condition | whileBoucle );
	public final bloodClassParser.instruction_return instruction() throws RecognitionException {
		bloodClassParser.instruction_return retval = new bloodClassParser.instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal90=null;
		Token string_literal92=null;
		Token string_literal93=null;
		Token char_literal94=null;
		ParserRuleReturnScope expression88 =null;
		ParserRuleReturnScope declaration_variable89 =null;
		ParserRuleReturnScope bloc91 =null;
		ParserRuleReturnScope condition95 =null;
		ParserRuleReturnScope whileBoucle96 =null;

		Object char_literal90_tree=null;
		Object string_literal92_tree=null;
		Object string_literal93_tree=null;
		Object char_literal94_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_declaration_variable=new RewriteRuleSubtreeStream(adaptor,"rule declaration_variable");

		try { dbg.enterRule(getGrammarFileName(), "instruction");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(132, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:133:2: ( expression ( declaration_variable )? ';' -> expression ( declaration_variable )? | bloc | 'is' | 'return' ';' -> 'return' | condition | whileBoucle )
			int alt26=6;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			switch ( input.LA(1) ) {
			case CLASSNAME:
			case NAME:
			case NB:
			case STRING:
			case 35:
			case 50:
			case 51:
			case 60:
			case 62:
			case 65:
			case 67:
				{
				alt26=1;
				}
				break;
			case 70:
				{
				alt26=2;
				}
				break;
			case 59:
				{
				alt26=3;
				}
				break;
			case 63:
				{
				alt26=4;
				}
				break;
			case 58:
				{
				alt26=5;
				}
				break;
			case 69:
				{
				alt26=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:133:3: expression ( declaration_variable )? ';'
					{
					dbg.location(133,3);
					pushFollow(FOLLOW_expression_in_instruction695);
					expression88=expression();
					state._fsp--;

					stream_expression.add(expression88.getTree());dbg.location(133,14);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:133:14: ( declaration_variable )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==43) ) {
						alt25=1;
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:133:15: declaration_variable
							{
							dbg.location(133,15);
							pushFollow(FOLLOW_declaration_variable_in_instruction698);
							declaration_variable89=declaration_variable();
							state._fsp--;

							stream_declaration_variable.add(declaration_variable89.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(25);}
					dbg.location(133,38);
					char_literal90=(Token)match(input,45,FOLLOW_45_in_instruction702);  
					stream_45.add(char_literal90);

					// AST REWRITE
					// elements: expression, declaration_variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 133:42: -> expression ( declaration_variable )?
					{
						dbg.location(133,45);
						adaptor.addChild(root_0, stream_expression.nextTree());dbg.location(133,56);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:133:56: ( declaration_variable )?
						if ( stream_declaration_variable.hasNext() ) {
							dbg.location(133,56);
							adaptor.addChild(root_0, stream_declaration_variable.nextTree());
						}
						stream_declaration_variable.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:134:3: bloc
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(134,3);
					pushFollow(FOLLOW_bloc_in_instruction713);
					bloc91=bloc();
					state._fsp--;

					adaptor.addChild(root_0, bloc91.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:135:3: 'is'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(135,3);
					string_literal92=(Token)match(input,59,FOLLOW_59_in_instruction717); 
					string_literal92_tree = (Object)adaptor.create(string_literal92);
					adaptor.addChild(root_0, string_literal92_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:136:3: 'return' ';'
					{
					dbg.location(136,3);
					string_literal93=(Token)match(input,63,FOLLOW_63_in_instruction721);  
					stream_63.add(string_literal93);
					dbg.location(136,12);
					char_literal94=(Token)match(input,45,FOLLOW_45_in_instruction723);  
					stream_45.add(char_literal94);

					// AST REWRITE
					// elements: 63
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 136:16: -> 'return'
					{
						dbg.location(136,19);
						adaptor.addChild(root_0, stream_63.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:137:3: condition
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(137,3);
					pushFollow(FOLLOW_condition_in_instruction732);
					condition95=condition();
					state._fsp--;

					adaptor.addChild(root_0, condition95.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:138:3: whileBoucle
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(138,3);
					pushFollow(FOLLOW_whileBoucle_in_instruction737);
					whileBoucle96=whileBoucle();
					state._fsp--;

					adaptor.addChild(root_0, whileBoucle96.getTree());

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
		dbg.location(139, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "instruction");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:143:1: expression : ( '(' ( 'as' className ':' )? expression ')' ( ( '.' )? condExpr )? ( ':=' expression )? -> ^( CAST ( className )? expression ( condExpr )? ( expression )? ) | instanciation ( ( '.' )? condExpr )? ( ':=' expression )? -> instanciation ( condExpr )? ( expression )? | constante ( ( '.' )? condExpr )? ( ':=' expression )? -> ^( EXP_CONST constante ( condExpr )? ( expression )? ) | condExpr ( ':=' expression )? -> ^( COND_EXP condExpr ( expression )? ) | 'result' ( ( '.' )? condExpr )? ( ':=' expression )? -> ^( RESULT ( condExpr )? ( expression )? ) );
	public final bloodClassParser.expression_return expression() throws RecognitionException {
		bloodClassParser.expression_return retval = new bloodClassParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal97=null;
		Token string_literal98=null;
		Token char_literal100=null;
		Token char_literal102=null;
		Token char_literal103=null;
		Token string_literal105=null;
		Token char_literal108=null;
		Token string_literal110=null;
		Token char_literal113=null;
		Token string_literal115=null;
		Token string_literal118=null;
		Token string_literal120=null;
		Token char_literal121=null;
		Token string_literal123=null;
		ParserRuleReturnScope className99 =null;
		ParserRuleReturnScope expression101 =null;
		ParserRuleReturnScope condExpr104 =null;
		ParserRuleReturnScope expression106 =null;
		ParserRuleReturnScope instanciation107 =null;
		ParserRuleReturnScope condExpr109 =null;
		ParserRuleReturnScope expression111 =null;
		ParserRuleReturnScope constante112 =null;
		ParserRuleReturnScope condExpr114 =null;
		ParserRuleReturnScope expression116 =null;
		ParserRuleReturnScope condExpr117 =null;
		ParserRuleReturnScope expression119 =null;
		ParserRuleReturnScope condExpr122 =null;
		ParserRuleReturnScope expression124 =null;

		Object char_literal97_tree=null;
		Object string_literal98_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		Object char_literal103_tree=null;
		Object string_literal105_tree=null;
		Object char_literal108_tree=null;
		Object string_literal110_tree=null;
		Object char_literal113_tree=null;
		Object string_literal115_tree=null;
		Object string_literal118_tree=null;
		Object string_literal120_tree=null;
		Object char_literal121_tree=null;
		Object string_literal123_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instanciation=new RewriteRuleSubtreeStream(adaptor,"rule instanciation");
		RewriteRuleSubtreeStream stream_constante=new RewriteRuleSubtreeStream(adaptor,"rule constante");
		RewriteRuleSubtreeStream stream_condExpr=new RewriteRuleSubtreeStream(adaptor,"rule condExpr");
		RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(143, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:2: ( '(' ( 'as' className ':' )? expression ')' ( ( '.' )? condExpr )? ( ':=' expression )? -> ^( CAST ( className )? expression ( condExpr )? ( expression )? ) | instanciation ( ( '.' )? condExpr )? ( ':=' expression )? -> instanciation ( condExpr )? ( expression )? | constante ( ( '.' )? condExpr )? ( ':=' expression )? -> ^( EXP_CONST constante ( condExpr )? ( expression )? ) | condExpr ( ':=' expression )? -> ^( COND_EXP condExpr ( expression )? ) | 'result' ( ( '.' )? condExpr )? ( ':=' expression )? -> ^( RESULT ( condExpr )? ( expression )? ) )
			int alt41=5;
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			switch ( input.LA(1) ) {
			case 35:
				{
				alt41=1;
				}
				break;
			case 60:
				{
				alt41=2;
				}
				break;
			case 50:
			case 51:
				{
				alt41=3;
				}
				break;
			case CLASSNAME:
			case NAME:
			case NB:
			case STRING:
			case 65:
			case 67:
				{
				alt41=4;
				}
				break;
			case 62:
				{
				alt41=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(41);}

			switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:3: '(' ( 'as' className ':' )? expression ')' ( ( '.' )? condExpr )? ( ':=' expression )?
					{
					dbg.location(144,3);
					char_literal97=(Token)match(input,35,FOLLOW_35_in_expression750);  
					stream_35.add(char_literal97);
					dbg.location(144,7);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:7: ( 'as' className ':' )?
					int alt27=2;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					int LA27_0 = input.LA(1);
					if ( (LA27_0==52) ) {
						alt27=1;
					}
					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:8: 'as' className ':'
							{
							dbg.location(144,8);
							string_literal98=(Token)match(input,52,FOLLOW_52_in_expression753);  
							stream_52.add(string_literal98);
							dbg.location(144,14);
							pushFollow(FOLLOW_className_in_expression756);
							className99=className();
							state._fsp--;

							stream_className.add(className99.getTree());dbg.location(144,24);
							char_literal100=(Token)match(input,43,FOLLOW_43_in_expression758);  
							stream_43.add(char_literal100);

							}
							break;

					}
					} finally {dbg.exitSubRule(27);}
					dbg.location(144,30);
					pushFollow(FOLLOW_expression_in_expression762);
					expression101=expression();
					state._fsp--;

					stream_expression.add(expression101.getTree());dbg.location(144,41);
					char_literal102=(Token)match(input,36,FOLLOW_36_in_expression764);  
					stream_36.add(char_literal102);
					dbg.location(144,45);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:45: ( ( '.' )? condExpr )?
					int alt29=2;
					try { dbg.enterSubRule(29);
					try { dbg.enterDecision(29, decisionCanBacktrack[29]);

					int LA29_0 = input.LA(1);
					if ( (LA29_0==CLASSNAME||(LA29_0 >= NAME && LA29_0 <= NB)||LA29_0==STRING||LA29_0==41||LA29_0==65||LA29_0==67) ) {
						alt29=1;
					}
					} finally {dbg.exitDecision(29);}

					switch (alt29) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:46: ( '.' )? condExpr
							{
							dbg.location(144,46);
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:46: ( '.' )?
							int alt28=2;
							try { dbg.enterSubRule(28);
							try { dbg.enterDecision(28, decisionCanBacktrack[28]);

							int LA28_0 = input.LA(1);
							if ( (LA28_0==41) ) {
								alt28=1;
							}
							} finally {dbg.exitDecision(28);}

							switch (alt28) {
								case 1 :
									dbg.enterAlt(1);

									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:46: '.'
									{
									dbg.location(144,46);
									char_literal103=(Token)match(input,41,FOLLOW_41_in_expression767);  
									stream_41.add(char_literal103);

									}
									break;

							}
							} finally {dbg.exitSubRule(28);}
							dbg.location(144,50);
							pushFollow(FOLLOW_condExpr_in_expression769);
							condExpr104=condExpr();
							state._fsp--;

							stream_condExpr.add(condExpr104.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(29);}
					dbg.location(144,61);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:61: ( ':=' expression )?
					int alt30=2;
					try { dbg.enterSubRule(30);
					try { dbg.enterDecision(30, decisionCanBacktrack[30]);

					int LA30_0 = input.LA(1);
					if ( (LA30_0==44) ) {
						alt30=1;
					}
					} finally {dbg.exitDecision(30);}

					switch (alt30) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:62: ':=' expression
							{
							dbg.location(144,62);
							string_literal105=(Token)match(input,44,FOLLOW_44_in_expression774);  
							stream_44.add(string_literal105);
							dbg.location(144,67);
							pushFollow(FOLLOW_expression_in_expression776);
							expression106=expression();
							state._fsp--;

							stream_expression.add(expression106.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(30);}

					// AST REWRITE
					// elements: expression, className, expression, condExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 144:80: -> ^( CAST ( className )? expression ( condExpr )? ( expression )? )
					{
						dbg.location(144,83);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:83: ^( CAST ( className )? expression ( condExpr )? ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(144,85);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAST, "CAST"), root_1);
						dbg.location(144,90);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:90: ( className )?
						if ( stream_className.hasNext() ) {
							dbg.location(144,90);
							adaptor.addChild(root_1, stream_className.nextTree());
						}
						stream_className.reset();
						dbg.location(144,101);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(144,112);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:112: ( condExpr )?
						if ( stream_condExpr.hasNext() ) {
							dbg.location(144,112);
							adaptor.addChild(root_1, stream_condExpr.nextTree());
						}
						stream_condExpr.reset();
						dbg.location(144,122);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:144:122: ( expression )?
						if ( stream_expression.hasNext() ) {
							dbg.location(144,122);
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:3: instanciation ( ( '.' )? condExpr )? ( ':=' expression )?
					{
					dbg.location(145,3);
					pushFollow(FOLLOW_instanciation_in_expression799);
					instanciation107=instanciation();
					state._fsp--;

					stream_instanciation.add(instanciation107.getTree());dbg.location(145,17);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:17: ( ( '.' )? condExpr )?
					int alt32=2;
					try { dbg.enterSubRule(32);
					try { dbg.enterDecision(32, decisionCanBacktrack[32]);

					int LA32_0 = input.LA(1);
					if ( (LA32_0==CLASSNAME||(LA32_0 >= NAME && LA32_0 <= NB)||LA32_0==STRING||LA32_0==41||LA32_0==65||LA32_0==67) ) {
						alt32=1;
					}
					} finally {dbg.exitDecision(32);}

					switch (alt32) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:18: ( '.' )? condExpr
							{
							dbg.location(145,18);
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:18: ( '.' )?
							int alt31=2;
							try { dbg.enterSubRule(31);
							try { dbg.enterDecision(31, decisionCanBacktrack[31]);

							int LA31_0 = input.LA(1);
							if ( (LA31_0==41) ) {
								alt31=1;
							}
							} finally {dbg.exitDecision(31);}

							switch (alt31) {
								case 1 :
									dbg.enterAlt(1);

									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:18: '.'
									{
									dbg.location(145,18);
									char_literal108=(Token)match(input,41,FOLLOW_41_in_expression802);  
									stream_41.add(char_literal108);

									}
									break;

							}
							} finally {dbg.exitSubRule(31);}
							dbg.location(145,22);
							pushFollow(FOLLOW_condExpr_in_expression804);
							condExpr109=condExpr();
							state._fsp--;

							stream_condExpr.add(condExpr109.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(32);}
					dbg.location(145,33);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:33: ( ':=' expression )?
					int alt33=2;
					try { dbg.enterSubRule(33);
					try { dbg.enterDecision(33, decisionCanBacktrack[33]);

					int LA33_0 = input.LA(1);
					if ( (LA33_0==44) ) {
						alt33=1;
					}
					} finally {dbg.exitDecision(33);}

					switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:34: ':=' expression
							{
							dbg.location(145,34);
							string_literal110=(Token)match(input,44,FOLLOW_44_in_expression809);  
							stream_44.add(string_literal110);
							dbg.location(145,39);
							pushFollow(FOLLOW_expression_in_expression811);
							expression111=expression();
							state._fsp--;

							stream_expression.add(expression111.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(33);}

					// AST REWRITE
					// elements: condExpr, expression, instanciation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 145:52: -> instanciation ( condExpr )? ( expression )?
					{
						dbg.location(145,55);
						adaptor.addChild(root_0, stream_instanciation.nextTree());dbg.location(145,69);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:69: ( condExpr )?
						if ( stream_condExpr.hasNext() ) {
							dbg.location(145,69);
							adaptor.addChild(root_0, stream_condExpr.nextTree());
						}
						stream_condExpr.reset();
						dbg.location(145,79);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:145:79: ( expression )?
						if ( stream_expression.hasNext() ) {
							dbg.location(145,79);
							adaptor.addChild(root_0, stream_expression.nextTree());
						}
						stream_expression.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:3: constante ( ( '.' )? condExpr )? ( ':=' expression )?
					{
					dbg.location(146,3);
					pushFollow(FOLLOW_constante_in_expression827);
					constante112=constante();
					state._fsp--;

					stream_constante.add(constante112.getTree());dbg.location(146,13);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:13: ( ( '.' )? condExpr )?
					int alt35=2;
					try { dbg.enterSubRule(35);
					try { dbg.enterDecision(35, decisionCanBacktrack[35]);

					int LA35_0 = input.LA(1);
					if ( (LA35_0==CLASSNAME||(LA35_0 >= NAME && LA35_0 <= NB)||LA35_0==STRING||LA35_0==41||LA35_0==65||LA35_0==67) ) {
						alt35=1;
					}
					} finally {dbg.exitDecision(35);}

					switch (alt35) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:14: ( '.' )? condExpr
							{
							dbg.location(146,14);
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:14: ( '.' )?
							int alt34=2;
							try { dbg.enterSubRule(34);
							try { dbg.enterDecision(34, decisionCanBacktrack[34]);

							int LA34_0 = input.LA(1);
							if ( (LA34_0==41) ) {
								alt34=1;
							}
							} finally {dbg.exitDecision(34);}

							switch (alt34) {
								case 1 :
									dbg.enterAlt(1);

									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:14: '.'
									{
									dbg.location(146,14);
									char_literal113=(Token)match(input,41,FOLLOW_41_in_expression830);  
									stream_41.add(char_literal113);

									}
									break;

							}
							} finally {dbg.exitSubRule(34);}
							dbg.location(146,18);
							pushFollow(FOLLOW_condExpr_in_expression832);
							condExpr114=condExpr();
							state._fsp--;

							stream_condExpr.add(condExpr114.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(35);}
					dbg.location(146,29);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:29: ( ':=' expression )?
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( (LA36_0==44) ) {
						alt36=1;
					}
					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:30: ':=' expression
							{
							dbg.location(146,30);
							string_literal115=(Token)match(input,44,FOLLOW_44_in_expression837);  
							stream_44.add(string_literal115);
							dbg.location(146,35);
							pushFollow(FOLLOW_expression_in_expression839);
							expression116=expression();
							state._fsp--;

							stream_expression.add(expression116.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(36);}

					// AST REWRITE
					// elements: condExpr, constante, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 146:48: -> ^( EXP_CONST constante ( condExpr )? ( expression )? )
					{
						dbg.location(146,51);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:51: ^( EXP_CONST constante ( condExpr )? ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(146,53);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_CONST, "EXP_CONST"), root_1);
						dbg.location(146,63);
						adaptor.addChild(root_1, stream_constante.nextTree());dbg.location(146,73);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:73: ( condExpr )?
						if ( stream_condExpr.hasNext() ) {
							dbg.location(146,73);
							adaptor.addChild(root_1, stream_condExpr.nextTree());
						}
						stream_condExpr.reset();
						dbg.location(146,83);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:146:83: ( expression )?
						if ( stream_expression.hasNext() ) {
							dbg.location(146,83);
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:147:3: condExpr ( ':=' expression )?
					{
					dbg.location(147,3);
					pushFollow(FOLLOW_condExpr_in_expression859);
					condExpr117=condExpr();
					state._fsp--;

					stream_condExpr.add(condExpr117.getTree());dbg.location(147,38);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:147:38: ( ':=' expression )?
					int alt37=2;
					try { dbg.enterSubRule(37);
					try { dbg.enterDecision(37, decisionCanBacktrack[37]);

					int LA37_0 = input.LA(1);
					if ( (LA37_0==44) ) {
						alt37=1;
					}
					} finally {dbg.exitDecision(37);}

					switch (alt37) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:147:39: ':=' expression
							{
							dbg.location(147,39);
							string_literal118=(Token)match(input,44,FOLLOW_44_in_expression864);  
							stream_44.add(string_literal118);
							dbg.location(147,44);
							pushFollow(FOLLOW_expression_in_expression866);
							expression119=expression();
							state._fsp--;

							stream_expression.add(expression119.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(37);}

					// AST REWRITE
					// elements: condExpr, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 147:57: -> ^( COND_EXP condExpr ( expression )? )
					{
						dbg.location(147,60);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:147:60: ^( COND_EXP condExpr ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(147,62);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND_EXP, "COND_EXP"), root_1);
						dbg.location(147,71);
						adaptor.addChild(root_1, stream_condExpr.nextTree());dbg.location(147,100);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:147:100: ( expression )?
						if ( stream_expression.hasNext() ) {
							dbg.location(147,100);
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:3: 'result' ( ( '.' )? condExpr )? ( ':=' expression )?
					{
					dbg.location(148,3);
					string_literal120=(Token)match(input,62,FOLLOW_62_in_expression885);  
					stream_62.add(string_literal120);
					dbg.location(148,12);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:12: ( ( '.' )? condExpr )?
					int alt39=2;
					try { dbg.enterSubRule(39);
					try { dbg.enterDecision(39, decisionCanBacktrack[39]);

					int LA39_0 = input.LA(1);
					if ( (LA39_0==CLASSNAME||(LA39_0 >= NAME && LA39_0 <= NB)||LA39_0==STRING||LA39_0==41||LA39_0==65||LA39_0==67) ) {
						alt39=1;
					}
					} finally {dbg.exitDecision(39);}

					switch (alt39) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:13: ( '.' )? condExpr
							{
							dbg.location(148,13);
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:13: ( '.' )?
							int alt38=2;
							try { dbg.enterSubRule(38);
							try { dbg.enterDecision(38, decisionCanBacktrack[38]);

							int LA38_0 = input.LA(1);
							if ( (LA38_0==41) ) {
								alt38=1;
							}
							} finally {dbg.exitDecision(38);}

							switch (alt38) {
								case 1 :
									dbg.enterAlt(1);

									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:13: '.'
									{
									dbg.location(148,13);
									char_literal121=(Token)match(input,41,FOLLOW_41_in_expression888);  
									stream_41.add(char_literal121);

									}
									break;

							}
							} finally {dbg.exitSubRule(38);}
							dbg.location(148,17);
							pushFollow(FOLLOW_condExpr_in_expression890);
							condExpr122=condExpr();
							state._fsp--;

							stream_condExpr.add(condExpr122.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(39);}
					dbg.location(148,28);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:28: ( ':=' expression )?
					int alt40=2;
					try { dbg.enterSubRule(40);
					try { dbg.enterDecision(40, decisionCanBacktrack[40]);

					int LA40_0 = input.LA(1);
					if ( (LA40_0==44) ) {
						alt40=1;
					}
					} finally {dbg.exitDecision(40);}

					switch (alt40) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:29: ':=' expression
							{
							dbg.location(148,29);
							string_literal123=(Token)match(input,44,FOLLOW_44_in_expression895);  
							stream_44.add(string_literal123);
							dbg.location(148,34);
							pushFollow(FOLLOW_expression_in_expression897);
							expression124=expression();
							state._fsp--;

							stream_expression.add(expression124.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(40);}

					// AST REWRITE
					// elements: condExpr, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 148:47: -> ^( RESULT ( condExpr )? ( expression )? )
					{
						dbg.location(148,50);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:50: ^( RESULT ( condExpr )? ( expression )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(148,52);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RESULT, "RESULT"), root_1);
						dbg.location(148,59);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:59: ( condExpr )?
						if ( stream_condExpr.hasNext() ) {
							dbg.location(148,59);
							adaptor.addChild(root_1, stream_condExpr.nextTree());
						}
						stream_condExpr.reset();
						dbg.location(148,69);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:148:69: ( expression )?
						if ( stream_expression.hasNext() ) {
							dbg.location(148,69);
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

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
		dbg.location(149, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class identificateur_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identificateur"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:154:1: identificateur : ( 'this' | 'super' );
	public final bloodClassParser.identificateur_return identificateur() throws RecognitionException {
		bloodClassParser.identificateur_return retval = new bloodClassParser.identificateur_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set125=null;

		Object set125_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "identificateur");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(154, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:155:2: ( 'this' | 'super' )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(155,2);
			set125=input.LT(1);
			if ( input.LA(1)==65||input.LA(1)==67 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set125));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
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
		dbg.location(158, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identificateur");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:170:1: constante : ( 'Integer' | 'String' );
	public final bloodClassParser.constante_return constante() throws RecognitionException {
		bloodClassParser.constante_return retval = new bloodClassParser.constante_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set126=null;

		Object set126_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "constante");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(170, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:171:2: ( 'Integer' | 'String' )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(171,2);
			set126=input.LT(1);
			if ( (input.LA(1) >= 50 && input.LA(1) <= 51) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set126));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
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
		dbg.location(173, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constante");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:175:1: instanciation : 'new' className '(' ( expr1 ( ',' expr1 )* )? ')' -> ^( NEW className ( expr1 )* ) ;
	public final bloodClassParser.instanciation_return instanciation() throws RecognitionException {
		bloodClassParser.instanciation_return retval = new bloodClassParser.instanciation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal127=null;
		Token char_literal129=null;
		Token char_literal131=null;
		Token char_literal133=null;
		ParserRuleReturnScope className128 =null;
		ParserRuleReturnScope expr1130 =null;
		ParserRuleReturnScope expr1132 =null;

		Object string_literal127_tree=null;
		Object char_literal129_tree=null;
		Object char_literal131_tree=null;
		Object char_literal133_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
		RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1");

		try { dbg.enterRule(getGrammarFileName(), "instanciation");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(175, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:176:2: ( 'new' className '(' ( expr1 ( ',' expr1 )* )? ')' -> ^( NEW className ( expr1 )* ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:176:3: 'new' className '(' ( expr1 ( ',' expr1 )* )? ')'
			{
			dbg.location(176,3);
			string_literal127=(Token)match(input,60,FOLLOW_60_in_instanciation959);  
			stream_60.add(string_literal127);
			dbg.location(176,9);
			pushFollow(FOLLOW_className_in_instanciation961);
			className128=className();
			state._fsp--;

			stream_className.add(className128.getTree());dbg.location(176,19);
			char_literal129=(Token)match(input,35,FOLLOW_35_in_instanciation963);  
			stream_35.add(char_literal129);
			dbg.location(176,23);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:176:23: ( expr1 ( ',' expr1 )* )?
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			int LA43_0 = input.LA(1);
			if ( (LA43_0==CLASSNAME||(LA43_0 >= NAME && LA43_0 <= NB)||LA43_0==STRING||LA43_0==65||LA43_0==67) ) {
				alt43=1;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:176:24: expr1 ( ',' expr1 )*
					{
					dbg.location(176,24);
					pushFollow(FOLLOW_expr1_in_instanciation966);
					expr1130=expr1();
					state._fsp--;

					stream_expr1.add(expr1130.getTree());dbg.location(176,29);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:176:29: ( ',' expr1 )*
					try { dbg.enterSubRule(42);

					loop42:
					while (true) {
						int alt42=2;
						try { dbg.enterDecision(42, decisionCanBacktrack[42]);

						int LA42_0 = input.LA(1);
						if ( (LA42_0==39) ) {
							alt42=1;
						}

						} finally {dbg.exitDecision(42);}

						switch (alt42) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:176:30: ',' expr1
							{
							dbg.location(176,30);
							char_literal131=(Token)match(input,39,FOLLOW_39_in_instanciation968);  
							stream_39.add(char_literal131);
							dbg.location(176,34);
							pushFollow(FOLLOW_expr1_in_instanciation970);
							expr1132=expr1();
							state._fsp--;

							stream_expr1.add(expr1132.getTree());
							}
							break;

						default :
							break loop42;
						}
					}
					} finally {dbg.exitSubRule(42);}

					}
					break;

			}
			} finally {dbg.exitSubRule(43);}
			dbg.location(176,44);
			char_literal133=(Token)match(input,36,FOLLOW_36_in_instanciation976);  
			stream_36.add(char_literal133);

			// AST REWRITE
			// elements: className, expr1
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 176:48: -> ^( NEW className ( expr1 )* )
			{
				dbg.location(176,51);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:176:51: ^( NEW className ( expr1 )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(176,53);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEW, "NEW"), root_1);
				dbg.location(176,57);
				adaptor.addChild(root_1, stream_className.nextTree());dbg.location(176,67);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:176:67: ( expr1 )*
				while ( stream_expr1.hasNext() ) {
					dbg.location(176,67);
					adaptor.addChild(root_1, stream_expr1.nextTree());
				}
				stream_expr1.reset();

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
		dbg.location(177, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "instanciation");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "instanciation"


	public static class condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:180:1: condition : 'if' expression 'then' instruction 'else' instruction -> ^( IF expression instruction instruction ) ;
	public final bloodClassParser.condition_return condition() throws RecognitionException {
		bloodClassParser.condition_return retval = new bloodClassParser.condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal134=null;
		Token string_literal136=null;
		Token string_literal138=null;
		ParserRuleReturnScope expression135 =null;
		ParserRuleReturnScope instruction137 =null;
		ParserRuleReturnScope instruction139 =null;

		Object string_literal134_tree=null;
		Object string_literal136_tree=null;
		Object string_literal138_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");

		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(180, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:181:2: ( 'if' expression 'then' instruction 'else' instruction -> ^( IF expression instruction instruction ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:181:3: 'if' expression 'then' instruction 'else' instruction
			{
			dbg.location(181,3);
			string_literal134=(Token)match(input,58,FOLLOW_58_in_condition998);  
			stream_58.add(string_literal134);
			dbg.location(181,8);
			pushFollow(FOLLOW_expression_in_condition1000);
			expression135=expression();
			state._fsp--;

			stream_expression.add(expression135.getTree());dbg.location(181,19);
			string_literal136=(Token)match(input,66,FOLLOW_66_in_condition1002);  
			stream_66.add(string_literal136);
			dbg.location(181,26);
			pushFollow(FOLLOW_instruction_in_condition1004);
			instruction137=instruction();
			state._fsp--;

			stream_instruction.add(instruction137.getTree());dbg.location(181,38);
			string_literal138=(Token)match(input,56,FOLLOW_56_in_condition1006);  
			stream_56.add(string_literal138);
			dbg.location(181,45);
			pushFollow(FOLLOW_instruction_in_condition1008);
			instruction139=instruction();
			state._fsp--;

			stream_instruction.add(instruction139.getTree());
			// AST REWRITE
			// elements: instruction, instruction, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 181:57: -> ^( IF expression instruction instruction )
			{
				dbg.location(181,60);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:181:60: ^( IF expression instruction instruction )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(181,62);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				dbg.location(181,65);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(181,76);
				adaptor.addChild(root_1, stream_instruction.nextTree());dbg.location(181,88);
				adaptor.addChild(root_1, stream_instruction.nextTree());
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
		dbg.location(182, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:185:1: whileBoucle : 'while' '(' expression ')' 'do' bloc -> ^( WHILE expression bloc ) ;
	public final bloodClassParser.whileBoucle_return whileBoucle() throws RecognitionException {
		bloodClassParser.whileBoucle_return retval = new bloodClassParser.whileBoucle_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token string_literal144=null;
		ParserRuleReturnScope expression142 =null;
		ParserRuleReturnScope bloc145 =null;

		Object string_literal140_tree=null;
		Object char_literal141_tree=null;
		Object char_literal143_tree=null;
		Object string_literal144_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try { dbg.enterRule(getGrammarFileName(), "whileBoucle");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(185, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:186:2: ( 'while' '(' expression ')' 'do' bloc -> ^( WHILE expression bloc ) )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:186:3: 'while' '(' expression ')' 'do' bloc
			{
			dbg.location(186,3);
			string_literal140=(Token)match(input,69,FOLLOW_69_in_whileBoucle1033);  
			stream_69.add(string_literal140);
			dbg.location(186,11);
			char_literal141=(Token)match(input,35,FOLLOW_35_in_whileBoucle1035);  
			stream_35.add(char_literal141);
			dbg.location(186,15);
			pushFollow(FOLLOW_expression_in_whileBoucle1037);
			expression142=expression();
			state._fsp--;

			stream_expression.add(expression142.getTree());dbg.location(186,26);
			char_literal143=(Token)match(input,36,FOLLOW_36_in_whileBoucle1039);  
			stream_36.add(char_literal143);
			dbg.location(186,30);
			string_literal144=(Token)match(input,55,FOLLOW_55_in_whileBoucle1041);  
			stream_55.add(string_literal144);
			dbg.location(186,35);
			pushFollow(FOLLOW_bloc_in_whileBoucle1043);
			bloc145=bloc();
			state._fsp--;

			stream_bloc.add(bloc145.getTree());
			// AST REWRITE
			// elements: bloc, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 186:40: -> ^( WHILE expression bloc )
			{
				dbg.location(186,43);
				// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:186:43: ^( WHILE expression bloc )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(186,45);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				dbg.location(186,51);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(186,62);
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
		dbg.location(187, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whileBoucle");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:189:1: condExpr : expr1 ( ( '=' ^| '<>' ^| '<' ^| '>' ^) expr1 )? ;
	public final bloodClassParser.condExpr_return condExpr() throws RecognitionException {
		bloodClassParser.condExpr_return retval = new bloodClassParser.condExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal147=null;
		Token string_literal148=null;
		Token char_literal149=null;
		Token char_literal150=null;
		ParserRuleReturnScope expr1146 =null;
		ParserRuleReturnScope expr1151 =null;

		Object char_literal147_tree=null;
		Object string_literal148_tree=null;
		Object char_literal149_tree=null;
		Object char_literal150_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "condExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(189, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:2: ( expr1 ( ( '=' ^| '<>' ^| '<' ^| '>' ^) expr1 )? )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:3: expr1 ( ( '=' ^| '<>' ^| '<' ^| '>' ^) expr1 )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(190,3);
			pushFollow(FOLLOW_expr1_in_condExpr1063);
			expr1146=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr1146.getTree());
			dbg.location(190,9);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:9: ( ( '=' ^| '<>' ^| '<' ^| '>' ^) expr1 )?
			int alt45=2;
			try { dbg.enterSubRule(45);
			try { dbg.enterDecision(45, decisionCanBacktrack[45]);

			int LA45_0 = input.LA(1);
			if ( ((LA45_0 >= 46 && LA45_0 <= 49)) ) {
				alt45=1;
			}
			} finally {dbg.exitDecision(45);}

			switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:11: ( '=' ^| '<>' ^| '<' ^| '>' ^) expr1
					{
					dbg.location(190,11);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:11: ( '=' ^| '<>' ^| '<' ^| '>' ^)
					int alt44=4;
					try { dbg.enterSubRule(44);
					try { dbg.enterDecision(44, decisionCanBacktrack[44]);

					switch ( input.LA(1) ) {
					case 48:
						{
						alt44=1;
						}
						break;
					case 47:
						{
						alt44=2;
						}
						break;
					case 46:
						{
						alt44=3;
						}
						break;
					case 49:
						{
						alt44=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(44);}

					switch (alt44) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:12: '=' ^
							{
							dbg.location(190,16);
							char_literal147=(Token)match(input,48,FOLLOW_48_in_condExpr1068); 
							char_literal147_tree = (Object)adaptor.create(char_literal147);
							root_0 = (Object)adaptor.becomeRoot(char_literal147_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:19: '<>' ^
							{
							dbg.location(190,24);
							string_literal148=(Token)match(input,47,FOLLOW_47_in_condExpr1073); 
							string_literal148_tree = (Object)adaptor.create(string_literal148);
							root_0 = (Object)adaptor.becomeRoot(string_literal148_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:27: '<' ^
							{
							dbg.location(190,31);
							char_literal149=(Token)match(input,46,FOLLOW_46_in_condExpr1078); 
							char_literal149_tree = (Object)adaptor.create(char_literal149);
							root_0 = (Object)adaptor.becomeRoot(char_literal149_tree, root_0);

							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:190:34: '>' ^
							{
							dbg.location(190,37);
							char_literal150=(Token)match(input,49,FOLLOW_49_in_condExpr1083); 
							char_literal150_tree = (Object)adaptor.create(char_literal150);
							root_0 = (Object)adaptor.becomeRoot(char_literal150_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(44);}
					dbg.location(190,40);
					pushFollow(FOLLOW_expr1_in_condExpr1087);
					expr1151=expr1();
					state._fsp--;

					adaptor.addChild(root_0, expr1151.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(45);}

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
		dbg.location(191, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "condExpr"


	public static class expr1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr1"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:194:1: expr1 : expr2 ( ( '+' ^| '-' ^)? expr2 )* ;
	public final bloodClassParser.expr1_return expr1() throws RecognitionException {
		bloodClassParser.expr1_return retval = new bloodClassParser.expr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal153=null;
		Token char_literal154=null;
		ParserRuleReturnScope expr2152 =null;
		ParserRuleReturnScope expr2155 =null;

		Object char_literal153_tree=null;
		Object char_literal154_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expr1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(194, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:195:2: ( expr2 ( ( '+' ^| '-' ^)? expr2 )* )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:195:4: expr2 ( ( '+' ^| '-' ^)? expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(195,4);
			pushFollow(FOLLOW_expr2_in_expr11102);
			expr2152=expr2();
			state._fsp--;

			adaptor.addChild(root_0, expr2152.getTree());
			dbg.location(195,10);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:195:10: ( ( '+' ^| '-' ^)? expr2 )*
			try { dbg.enterSubRule(47);

			loop47:
			while (true) {
				int alt47=2;
				try { dbg.enterDecision(47, decisionCanBacktrack[47]);

				int LA47_0 = input.LA(1);
				if ( (LA47_0==CLASSNAME||(LA47_0 >= NAME && LA47_0 <= NB)||LA47_0==STRING||LA47_0==38||LA47_0==40||LA47_0==65||LA47_0==67) ) {
					alt47=1;
				}

				} finally {dbg.exitDecision(47);}

				switch (alt47) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:195:11: ( '+' ^| '-' ^)? expr2
					{
					dbg.location(195,11);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:195:11: ( '+' ^| '-' ^)?
					int alt46=3;
					try { dbg.enterSubRule(46);
					try { dbg.enterDecision(46, decisionCanBacktrack[46]);

					int LA46_0 = input.LA(1);
					if ( (LA46_0==38) ) {
						alt46=1;
					}
					else if ( (LA46_0==40) ) {
						alt46=2;
					}
					} finally {dbg.exitDecision(46);}

					switch (alt46) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:195:12: '+' ^
							{
							dbg.location(195,15);
							char_literal153=(Token)match(input,38,FOLLOW_38_in_expr11106); 
							char_literal153_tree = (Object)adaptor.create(char_literal153);
							root_0 = (Object)adaptor.becomeRoot(char_literal153_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:195:17: '-' ^
							{
							dbg.location(195,20);
							char_literal154=(Token)match(input,40,FOLLOW_40_in_expr11109); 
							char_literal154_tree = (Object)adaptor.create(char_literal154);
							root_0 = (Object)adaptor.becomeRoot(char_literal154_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(46);}
					dbg.location(195,24);
					pushFollow(FOLLOW_expr2_in_expr11114);
					expr2155=expr2();
					state._fsp--;

					adaptor.addChild(root_0, expr2155.getTree());

					}
					break;

				default :
					break loop47;
				}
			}
			} finally {dbg.exitSubRule(47);}

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
		dbg.location(197, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr1"


	public static class expr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:200:1: expr2 : atom ( ( '*' ^| '/' ^| '&' ^| '.' ^) atom )* ;
	public final bloodClassParser.expr2_return expr2() throws RecognitionException {
		bloodClassParser.expr2_return retval = new bloodClassParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal157=null;
		Token char_literal158=null;
		Token char_literal159=null;
		Token char_literal160=null;
		ParserRuleReturnScope atom156 =null;
		ParserRuleReturnScope atom161 =null;

		Object char_literal157_tree=null;
		Object char_literal158_tree=null;
		Object char_literal159_tree=null;
		Object char_literal160_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expr2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(200, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:2: ( atom ( ( '*' ^| '/' ^| '&' ^| '.' ^) atom )* )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:4: atom ( ( '*' ^| '/' ^| '&' ^| '.' ^) atom )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(201,4);
			pushFollow(FOLLOW_atom_in_expr21131);
			atom156=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom156.getTree());
			dbg.location(201,9);
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:9: ( ( '*' ^| '/' ^| '&' ^| '.' ^) atom )*
			try { dbg.enterSubRule(49);

			loop49:
			while (true) {
				int alt49=2;
				try { dbg.enterDecision(49, decisionCanBacktrack[49]);

				int LA49_0 = input.LA(1);
				if ( (LA49_0==34||LA49_0==37||(LA49_0 >= 41 && LA49_0 <= 42)) ) {
					alt49=1;
				}

				} finally {dbg.exitDecision(49);}

				switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:10: ( '*' ^| '/' ^| '&' ^| '.' ^) atom
					{
					dbg.location(201,10);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:10: ( '*' ^| '/' ^| '&' ^| '.' ^)
					int alt48=4;
					try { dbg.enterSubRule(48);
					try { dbg.enterDecision(48, decisionCanBacktrack[48]);

					switch ( input.LA(1) ) {
					case 37:
						{
						alt48=1;
						}
						break;
					case 42:
						{
						alt48=2;
						}
						break;
					case 34:
						{
						alt48=3;
						}
						break;
					case 41:
						{
						alt48=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(48);}

					switch (alt48) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:11: '*' ^
							{
							dbg.location(201,14);
							char_literal157=(Token)match(input,37,FOLLOW_37_in_expr21135); 
							char_literal157_tree = (Object)adaptor.create(char_literal157);
							root_0 = (Object)adaptor.becomeRoot(char_literal157_tree, root_0);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:16: '/' ^
							{
							dbg.location(201,19);
							char_literal158=(Token)match(input,42,FOLLOW_42_in_expr21138); 
							char_literal158_tree = (Object)adaptor.create(char_literal158);
							root_0 = (Object)adaptor.becomeRoot(char_literal158_tree, root_0);

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:21: '&' ^
							{
							dbg.location(201,24);
							char_literal159=(Token)match(input,34,FOLLOW_34_in_expr21141); 
							char_literal159_tree = (Object)adaptor.create(char_literal159);
							root_0 = (Object)adaptor.becomeRoot(char_literal159_tree, root_0);

							}
							break;
						case 4 :
							dbg.enterAlt(4);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:201:26: '.' ^
							{
							dbg.location(201,29);
							char_literal160=(Token)match(input,41,FOLLOW_41_in_expr21144); 
							char_literal160_tree = (Object)adaptor.create(char_literal160);
							root_0 = (Object)adaptor.becomeRoot(char_literal160_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(48);}
					dbg.location(201,32);
					pushFollow(FOLLOW_atom_in_expr21148);
					atom161=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom161.getTree());

					}
					break;

				default :
					break loop49;
				}
			}
			} finally {dbg.exitSubRule(49);}

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
		dbg.location(204, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr2"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:207:1: atom : ( NB | name ( '(' ( expr1 ( ',' expr1 )* )? ')' )? -> ENVOI_MESS name ( expr1 )* | className ( '(' ( expr1 ( ',' expr1 )* )? ')' )? -> ENVOI_MESS_CONS className ( expr1 )* | identificateur | STRING );
	public final bloodClassParser.atom_return atom() throws RecognitionException {
		bloodClassParser.atom_return retval = new bloodClassParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NB162=null;
		Token char_literal164=null;
		Token char_literal166=null;
		Token char_literal168=null;
		Token char_literal170=null;
		Token char_literal172=null;
		Token char_literal174=null;
		Token STRING176=null;
		ParserRuleReturnScope name163 =null;
		ParserRuleReturnScope expr1165 =null;
		ParserRuleReturnScope expr1167 =null;
		ParserRuleReturnScope className169 =null;
		ParserRuleReturnScope expr1171 =null;
		ParserRuleReturnScope expr1173 =null;
		ParserRuleReturnScope identificateur175 =null;

		Object NB162_tree=null;
		Object char_literal164_tree=null;
		Object char_literal166_tree=null;
		Object char_literal168_tree=null;
		Object char_literal170_tree=null;
		Object char_literal172_tree=null;
		Object char_literal174_tree=null;
		Object STRING176_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
		RewriteRuleSubtreeStream stream_className=new RewriteRuleSubtreeStream(adaptor,"rule className");
		RewriteRuleSubtreeStream stream_expr1=new RewriteRuleSubtreeStream(adaptor,"rule expr1");

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(207, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:208:2: ( NB | name ( '(' ( expr1 ( ',' expr1 )* )? ')' )? -> ENVOI_MESS name ( expr1 )* | className ( '(' ( expr1 ( ',' expr1 )* )? ')' )? -> ENVOI_MESS_CONS className ( expr1 )* | identificateur | STRING )
			int alt56=5;
			try { dbg.enterDecision(56, decisionCanBacktrack[56]);

			switch ( input.LA(1) ) {
			case NB:
				{
				alt56=1;
				}
				break;
			case NAME:
				{
				alt56=2;
				}
				break;
			case CLASSNAME:
				{
				alt56=3;
				}
				break;
			case 65:
			case 67:
				{
				alt56=4;
				}
				break;
			case STRING:
				{
				alt56=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(56);}

			switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:208:3: NB
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(208,3);
					NB162=(Token)match(input,NB,FOLLOW_NB_in_atom1167); 
					NB162_tree = (Object)adaptor.create(NB162);
					adaptor.addChild(root_0, NB162_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:209:3: name ( '(' ( expr1 ( ',' expr1 )* )? ')' )?
					{
					dbg.location(209,3);
					pushFollow(FOLLOW_name_in_atom1171);
					name163=name();
					state._fsp--;

					stream_name.add(name163.getTree());dbg.location(209,8);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:209:8: ( '(' ( expr1 ( ',' expr1 )* )? ')' )?
					int alt52=2;
					try { dbg.enterSubRule(52);
					try { dbg.enterDecision(52, decisionCanBacktrack[52]);

					int LA52_0 = input.LA(1);
					if ( (LA52_0==35) ) {
						alt52=1;
					}
					} finally {dbg.exitDecision(52);}

					switch (alt52) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:209:9: '(' ( expr1 ( ',' expr1 )* )? ')'
							{
							dbg.location(209,9);
							char_literal164=(Token)match(input,35,FOLLOW_35_in_atom1174);  
							stream_35.add(char_literal164);
							dbg.location(209,13);
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:209:13: ( expr1 ( ',' expr1 )* )?
							int alt51=2;
							try { dbg.enterSubRule(51);
							try { dbg.enterDecision(51, decisionCanBacktrack[51]);

							int LA51_0 = input.LA(1);
							if ( (LA51_0==CLASSNAME||(LA51_0 >= NAME && LA51_0 <= NB)||LA51_0==STRING||LA51_0==65||LA51_0==67) ) {
								alt51=1;
							}
							} finally {dbg.exitDecision(51);}

							switch (alt51) {
								case 1 :
									dbg.enterAlt(1);

									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:209:14: expr1 ( ',' expr1 )*
									{
									dbg.location(209,14);
									pushFollow(FOLLOW_expr1_in_atom1177);
									expr1165=expr1();
									state._fsp--;

									stream_expr1.add(expr1165.getTree());dbg.location(209,20);
									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:209:20: ( ',' expr1 )*
									try { dbg.enterSubRule(50);

									loop50:
									while (true) {
										int alt50=2;
										try { dbg.enterDecision(50, decisionCanBacktrack[50]);

										int LA50_0 = input.LA(1);
										if ( (LA50_0==39) ) {
											alt50=1;
										}

										} finally {dbg.exitDecision(50);}

										switch (alt50) {
										case 1 :
											dbg.enterAlt(1);

											// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:209:21: ',' expr1
											{
											dbg.location(209,21);
											char_literal166=(Token)match(input,39,FOLLOW_39_in_atom1180);  
											stream_39.add(char_literal166);
											dbg.location(209,26);
											pushFollow(FOLLOW_expr1_in_atom1183);
											expr1167=expr1();
											state._fsp--;

											stream_expr1.add(expr1167.getTree());
											}
											break;

										default :
											break loop50;
										}
									}
									} finally {dbg.exitSubRule(50);}

									}
									break;

							}
							} finally {dbg.exitSubRule(51);}
							dbg.location(209,37);
							char_literal168=(Token)match(input,36,FOLLOW_36_in_atom1190);  
							stream_36.add(char_literal168);

							}
							break;

					}
					} finally {dbg.exitSubRule(52);}

					// AST REWRITE
					// elements: name, expr1
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 209:43: -> ENVOI_MESS name ( expr1 )*
					{
						dbg.location(209,46);
						adaptor.addChild(root_0, (Object)adaptor.create(ENVOI_MESS, "ENVOI_MESS"));dbg.location(209,57);
						adaptor.addChild(root_0, stream_name.nextTree());dbg.location(209,62);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:209:62: ( expr1 )*
						while ( stream_expr1.hasNext() ) {
							dbg.location(209,62);
							adaptor.addChild(root_0, stream_expr1.nextTree());
						}
						stream_expr1.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:210:3: className ( '(' ( expr1 ( ',' expr1 )* )? ')' )?
					{
					dbg.location(210,3);
					pushFollow(FOLLOW_className_in_atom1206);
					className169=className();
					state._fsp--;

					stream_className.add(className169.getTree());dbg.location(210,13);
					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:210:13: ( '(' ( expr1 ( ',' expr1 )* )? ')' )?
					int alt55=2;
					try { dbg.enterSubRule(55);
					try { dbg.enterDecision(55, decisionCanBacktrack[55]);

					int LA55_0 = input.LA(1);
					if ( (LA55_0==35) ) {
						alt55=1;
					}
					} finally {dbg.exitDecision(55);}

					switch (alt55) {
						case 1 :
							dbg.enterAlt(1);

							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:210:14: '(' ( expr1 ( ',' expr1 )* )? ')'
							{
							dbg.location(210,14);
							char_literal170=(Token)match(input,35,FOLLOW_35_in_atom1209);  
							stream_35.add(char_literal170);
							dbg.location(210,18);
							// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:210:18: ( expr1 ( ',' expr1 )* )?
							int alt54=2;
							try { dbg.enterSubRule(54);
							try { dbg.enterDecision(54, decisionCanBacktrack[54]);

							int LA54_0 = input.LA(1);
							if ( (LA54_0==CLASSNAME||(LA54_0 >= NAME && LA54_0 <= NB)||LA54_0==STRING||LA54_0==65||LA54_0==67) ) {
								alt54=1;
							}
							} finally {dbg.exitDecision(54);}

							switch (alt54) {
								case 1 :
									dbg.enterAlt(1);

									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:210:19: expr1 ( ',' expr1 )*
									{
									dbg.location(210,19);
									pushFollow(FOLLOW_expr1_in_atom1212);
									expr1171=expr1();
									state._fsp--;

									stream_expr1.add(expr1171.getTree());dbg.location(210,25);
									// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:210:25: ( ',' expr1 )*
									try { dbg.enterSubRule(53);

									loop53:
									while (true) {
										int alt53=2;
										try { dbg.enterDecision(53, decisionCanBacktrack[53]);

										int LA53_0 = input.LA(1);
										if ( (LA53_0==39) ) {
											alt53=1;
										}

										} finally {dbg.exitDecision(53);}

										switch (alt53) {
										case 1 :
											dbg.enterAlt(1);

											// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:210:26: ',' expr1
											{
											dbg.location(210,26);
											char_literal172=(Token)match(input,39,FOLLOW_39_in_atom1215);  
											stream_39.add(char_literal172);
											dbg.location(210,31);
											pushFollow(FOLLOW_expr1_in_atom1218);
											expr1173=expr1();
											state._fsp--;

											stream_expr1.add(expr1173.getTree());
											}
											break;

										default :
											break loop53;
										}
									}
									} finally {dbg.exitSubRule(53);}

									}
									break;

							}
							} finally {dbg.exitSubRule(54);}
							dbg.location(210,42);
							char_literal174=(Token)match(input,36,FOLLOW_36_in_atom1225);  
							stream_36.add(char_literal174);

							}
							break;

					}
					} finally {dbg.exitSubRule(55);}

					// AST REWRITE
					// elements: className, expr1
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 210:48: -> ENVOI_MESS_CONS className ( expr1 )*
					{
						dbg.location(210,51);
						adaptor.addChild(root_0, (Object)adaptor.create(ENVOI_MESS_CONS, "ENVOI_MESS_CONS"));dbg.location(210,67);
						adaptor.addChild(root_0, stream_className.nextTree());dbg.location(210,77);
						// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:210:77: ( expr1 )*
						while ( stream_expr1.hasNext() ) {
							dbg.location(210,77);
							adaptor.addChild(root_0, stream_expr1.nextTree());
						}
						stream_expr1.reset();

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:211:3: identificateur
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(211,3);
					pushFollow(FOLLOW_identificateur_in_atom1240);
					identificateur175=identificateur();
					state._fsp--;

					adaptor.addChild(root_0, identificateur175.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:212:3: STRING
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(212,3);
					STRING176=(Token)match(input,STRING,FOLLOW_STRING_in_atom1244); 
					STRING176_tree = (Object)adaptor.create(STRING176);
					adaptor.addChild(root_0, STRING176_tree);

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
		dbg.location(213, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:216:1: choixNameClass : ( className | constante );
	public final bloodClassParser.choixNameClass_return choixNameClass() throws RecognitionException {
		bloodClassParser.choixNameClass_return retval = new bloodClassParser.choixNameClass_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope className177 =null;
		ParserRuleReturnScope constante178 =null;


		try { dbg.enterRule(getGrammarFileName(), "choixNameClass");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(216, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:217:2: ( className | constante )
			int alt57=2;
			try { dbg.enterDecision(57, decisionCanBacktrack[57]);

			int LA57_0 = input.LA(1);
			if ( (LA57_0==CLASSNAME) ) {
				alt57=1;
			}
			else if ( ((LA57_0 >= 50 && LA57_0 <= 51)) ) {
				alt57=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(57);}

			switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:217:4: className
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(217,4);
					pushFollow(FOLLOW_className_in_choixNameClass1259);
					className177=className();
					state._fsp--;

					adaptor.addChild(root_0, className177.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:218:3: constante
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(218,3);
					pushFollow(FOLLOW_constante_in_choixNameClass1263);
					constante178=constante();
					state._fsp--;

					adaptor.addChild(root_0, constante178.getTree());

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
		dbg.location(219, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "choixNameClass");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "choixNameClass"


	public static class className_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "className"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:221:1: className : CLASSNAME ;
	public final bloodClassParser.className_return className() throws RecognitionException {
		bloodClassParser.className_return retval = new bloodClassParser.className_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CLASSNAME179=null;

		Object CLASSNAME179_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "className");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(221, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:222:2: ( CLASSNAME )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:222:3: CLASSNAME
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(222,3);
			CLASSNAME179=(Token)match(input,CLASSNAME,FOLLOW_CLASSNAME_in_className1274); 
			CLASSNAME179_tree = (Object)adaptor.create(CLASSNAME179);
			adaptor.addChild(root_0, CLASSNAME179_tree);

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
		dbg.location(223, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "className");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "className"


	public static class name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "name"
	// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:225:1: name : NAME ;
	public final bloodClassParser.name_return name() throws RecognitionException {
		bloodClassParser.name_return retval = new bloodClassParser.name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME180=null;

		Object NAME180_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "name");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(225, 0);

		try {
			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:226:2: ( NAME )
			dbg.enterAlt(1);

			// /home/delaporte/Documents/Compil/pcl-2020_2021/bloodClass.g:226:3: NAME
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(226,3);
			NAME180=(Token)match(input,NAME,FOLLOW_NAME_in_name1284); 
			NAME180_tree = (Object)adaptor.create(NAME180);
			adaptor.addChild(root_0, NAME180_tree);

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
		dbg.location(227, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "name");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "name"

	// Delegated rules



	public static final BitSet FOLLOW_classDef_in_prog123 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_progPrincipal_in_prog126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bloc_in_progPrincipal150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_classDef161 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_className_in_classDef163 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_classDef165 = new BitSet(new long[]{0x0000001000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_formalParam_in_classDef168 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_classDef171 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_formalParam_in_classDef173 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_36_in_classDef179 = new BitSet(new long[]{0x0200000200000000L});
	public static final BitSet FOLLOW_choixHeritage_in_classDef181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_choixHeritage206 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_className_in_choixHeritage208 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_choixHeritage210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_choixHeritage212 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_blocDeClasse_in_choixHeritage213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_choixHeritage214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_choixHeritage228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_choixHeritage230 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_blocDeClasse_in_choixHeritage231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_choixHeritage232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_formalParam248 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_name_in_formalParam252 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_formalParam254 = new BitSet(new long[]{0x000C000000000200L});
	public static final BitSet FOLLOW_choixNameClass_in_formalParam256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribDef_in_blocDeClasse281 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_blocDeClasse_in_blocDeClasse283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_blocDeClasse290 = new BitSet(new long[]{0x2000000000800200L,0x0000000000000001L});
	public static final BitSet FOLLOW_methodeOuCons_in_blocDeClasse292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_consDef_in_methodeOuCons313 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_blocSansCons_in_methodeOuCons315 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_methodeDef_in_methodeOuCons323 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_blocDeClasse_in_methodeOuCons325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_className_in_consDef338 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_consDef340 = new BitSet(new long[]{0x0000001000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_formalParam_in_consDef343 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_consDef346 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_formalParam_in_consDef348 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_36_in_consDef354 = new BitSet(new long[]{0x0000080200000000L});
	public static final BitSet FOLLOW_consSuper_in_consDef356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_consSuper379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bloc_in_consSuper381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_consSuper391 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_className_in_consSuper393 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_consSuper395 = new BitSet(new long[]{0x0000001021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_consSuper398 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_consSuper401 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_consSuper403 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_36_in_consSuper409 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_consSuper411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bloc_in_consSuper413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attribDef_in_blocSansCons437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_blocSansCons443 = new BitSet(new long[]{0x2000000000800000L,0x0000000000000001L});
	public static final BitSet FOLLOW_methodeDef_in_blocSansCons445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_attribDef463 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_attribDef466 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_name_in_attribDef470 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_attribDef472 = new BitSet(new long[]{0x000C000000000200L});
	public static final BitSet FOLLOW_choixNameClass_in_attribDef474 = new BitSet(new long[]{0x0000300000000000L});
	public static final BitSet FOLLOW_44_in_attribDef477 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_attribDef478 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_attribDef482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_methodeDef514 = new BitSet(new long[]{0x2000000000800000L});
	public static final BitSet FOLLOW_61_in_methodeDef519 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_name_in_methodeDef523 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_methodeDef525 = new BitSet(new long[]{0x0000001000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_formalParam_in_methodeDef528 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_methodeDef531 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000010L});
	public static final BitSet FOLLOW_formalParam_in_methodeDef533 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_36_in_methodeDef539 = new BitSet(new long[]{0x0000080200000000L});
	public static final BitSet FOLLOW_permClassNameAvecExpr_in_methodeDef542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_permClassNameAvecExpr577 = new BitSet(new long[]{0x000C000000000200L});
	public static final BitSet FOLLOW_choixNameClass_in_permClassNameAvecExpr579 = new BitSet(new long[]{0x0000100200000000L});
	public static final BitSet FOLLOW_devPerm_in_permClassNameAvecExpr581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_permClassNameAvecExpr591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bloc_in_permClassNameAvecExpr593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_devPerm607 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_devPerm609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_devPerm617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bloc_in_devPerm619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_bloc634 = new BitSet(new long[]{0xDC0C000821800200L,0x00000000000000EAL});
	public static final BitSet FOLLOW_instruction_in_bloc636 = new BitSet(new long[]{0xDC0C000821800200L,0x00000000000000EAL});
	public static final BitSet FOLLOW_71_in_bloc640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_declaration_variable662 = new BitSet(new long[]{0x000C000000000200L});
	public static final BitSet FOLLOW_choixNameClass_in_declaration_variable664 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_declaration_variable667 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_declaration_variable670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_instruction695 = new BitSet(new long[]{0x0000280000000000L});
	public static final BitSet FOLLOW_declaration_variable_in_instruction698 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_instruction702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bloc_in_instruction713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_instruction717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_instruction721 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_instruction723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_instruction732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileBoucle_in_instruction737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_expression750 = new BitSet(new long[]{0x501C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_52_in_expression753 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_className_in_expression756 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_expression758 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_expression762 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_expression764 = new BitSet(new long[]{0x0000120021800202L,0x000000000000000AL});
	public static final BitSet FOLLOW_41_in_expression767 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_condExpr_in_expression769 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expression774 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_expression776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanciation_in_expression799 = new BitSet(new long[]{0x0000120021800202L,0x000000000000000AL});
	public static final BitSet FOLLOW_41_in_expression802 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_condExpr_in_expression804 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expression809 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_expression811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constante_in_expression827 = new BitSet(new long[]{0x0000120021800202L,0x000000000000000AL});
	public static final BitSet FOLLOW_41_in_expression830 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_condExpr_in_expression832 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expression837 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_expression839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condExpr_in_expression859 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expression864 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_expression866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_expression885 = new BitSet(new long[]{0x0000120021800202L,0x000000000000000AL});
	public static final BitSet FOLLOW_41_in_expression888 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_condExpr_in_expression890 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_expression895 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_expression897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_instanciation959 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_className_in_instanciation961 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_instanciation963 = new BitSet(new long[]{0x0000001021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_instanciation966 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_instanciation968 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_instanciation970 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_36_in_instanciation976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_condition998 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_condition1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_condition1002 = new BitSet(new long[]{0xDC0C000821800200L,0x000000000000006AL});
	public static final BitSet FOLLOW_instruction_in_condition1004 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_condition1006 = new BitSet(new long[]{0xDC0C000821800200L,0x000000000000006AL});
	public static final BitSet FOLLOW_instruction_in_condition1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_whileBoucle1033 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_whileBoucle1035 = new BitSet(new long[]{0x500C000821800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expression_in_whileBoucle1037 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_whileBoucle1039 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_whileBoucle1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_bloc_in_whileBoucle1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1_in_condExpr1063 = new BitSet(new long[]{0x0003C00000000002L});
	public static final BitSet FOLLOW_48_in_condExpr1068 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_47_in_condExpr1073 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_46_in_condExpr1078 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_49_in_condExpr1083 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_condExpr1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2_in_expr11102 = new BitSet(new long[]{0x0000014021800202L,0x000000000000000AL});
	public static final BitSet FOLLOW_38_in_expr11106 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_40_in_expr11109 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr2_in_expr11114 = new BitSet(new long[]{0x0000014021800202L,0x000000000000000AL});
	public static final BitSet FOLLOW_atom_in_expr21131 = new BitSet(new long[]{0x0000062400000002L});
	public static final BitSet FOLLOW_37_in_expr21135 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_42_in_expr21138 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_34_in_expr21141 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_41_in_expr21144 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_atom_in_expr21148 = new BitSet(new long[]{0x0000062400000002L});
	public static final BitSet FOLLOW_NB_in_atom1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_atom1171 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_atom1174 = new BitSet(new long[]{0x0000001021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_atom1177 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_atom1180 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_atom1183 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_36_in_atom1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_className_in_atom1206 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_atom1209 = new BitSet(new long[]{0x0000001021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_atom1212 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_atom1215 = new BitSet(new long[]{0x0000000021800200L,0x000000000000000AL});
	public static final BitSet FOLLOW_expr1_in_atom1218 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_36_in_atom1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identificateur_in_atom1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_className_in_choixNameClass1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constante_in_choixNameClass1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASSNAME_in_className1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_name1284 = new BitSet(new long[]{0x0000000000000002L});
}
