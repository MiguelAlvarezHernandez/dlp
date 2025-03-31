// Generated from C:/Users/Miguel/IdeaProjects/dlp/src/parser/Cmm.g4 by ANTLR 4.13.2
package parser;

    import ast.*;
    import ast.program.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.type.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, ID=38, 
		CHAR_CONSTANT=39, ONE_LINE_COMMENT=40, REAL_CONSTANT=41, ML_COMMENT=42, 
		WS=43;
	public static final int
		RULE_program = 0, RULE_main_function = 1, RULE_expression = 2, RULE_function_invocation = 3, 
		RULE_type = 4, RULE_struct_type = 5, RULE_record_field = 6, RULE_primitive_type = 7, 
		RULE_statement = 8, RULE_block = 9, RULE_definition = 10, RULE_var_definition = 11, 
		RULE_function_definition = 12, RULE_function_type = 13, RULE_parameter_list = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main_function", "expression", "function_invocation", "type", 
			"struct_type", "record_field", "primitive_type", "statement", "block", 
			"definition", "var_definition", "function_definition", "function_type", 
			"parameter_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", 
			"'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'=='", "'&&'", "'||'", "','", "'struct'", "';'", "'int'", "'char'", 
			"'double'", "'write'", "'read'", "'return'", "'='", "'while'", "'if'", 
			"'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT_CONSTANT", "ID", "CHAR_CONSTANT", "ONE_LINE_COMMENT", "REAL_CONSTANT", 
			"ML_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> definitions = new ArrayList<>();
		public DefinitionContext df1;
		public Main_functionContext df2;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).df1 = definition();
					_localctx.definitions.addAll(((ProgramContext)_localctx).df1.ast);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).df2 = main_function();
			_localctx.definitions.add(((ProgramContext)_localctx).df2.ast);
			setState(40);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(_localctx.definitions);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Main_functionContext extends ParserRuleContext {
		public Definition ast;
		public List<VariableDefinition> parameters = new ArrayList<>();
		public FunctionType fType;
		public List<VariableDefinition> varDefinitions = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public Token id1;
		public Var_definitionContext vd;
		public StatementContext st;
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			((Main_functionContext)_localctx).id1 = match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			match(T__3);
			((Main_functionContext)_localctx).fType =  new FunctionType(new VoidType(),_localctx.parameters);
			setState(48);
			match(T__4);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 973078528L) != 0)) {
				{
				{
				setState(49);
				((Main_functionContext)_localctx).vd = var_definition();
				_localctx.varDefinitions.addAll(((Main_functionContext)_localctx).vd.ast);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3220151733256L) != 0)) {
				{
				{
				setState(57);
				((Main_functionContext)_localctx).st = statement();
				_localctx.statements.addAll(((Main_functionContext)_localctx).st.ast);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__5);
			((Main_functionContext)_localctx).ast =  new FunctionDefinition((((Main_functionContext)_localctx).id1!=null?((Main_functionContext)_localctx).id1.getText():null),_localctx.fType,_localctx.varDefinitions,_localctx.statements, ((Main_functionContext)_localctx).id1.getLine(),((Main_functionContext)_localctx).id1.getCharPositionInLine()+1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Token ID;
		public Token ic;
		public Token rc;
		public Token cc;
		public Function_invocationContext fi;
		public Token p1;
		public Primitive_typeContext t1;
		public Token p2;
		public Token op;
		public ExpressionContext e2;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(69);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new VariableExpression(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1);
				}
				break;
			case 2:
				{
				setState(71);
				((ExpressionContext)_localctx).ic = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteralExpression(((ExpressionContext)_localctx).ic.getLine(),
				                                    ((ExpressionContext)_localctx).ic.getCharPositionInLine()+1 , LexerHelper.lexemeToInt(((ExpressionContext)_localctx).ic.getText()));
				}
				break;
			case 3:
				{
				setState(73);
				((ExpressionContext)_localctx).rc = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteralExpression(LexerHelper.lexemeToReal(((ExpressionContext)_localctx).rc.getText()),((ExpressionContext)_localctx).rc.getLine(), ((ExpressionContext)_localctx).rc.getCharPositionInLine()+1);
				}
				break;
			case 4:
				{
				setState(75);
				((ExpressionContext)_localctx).cc = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteralExpression(LexerHelper.lexemeToChar(((ExpressionContext)_localctx).cc.getText()),((ExpressionContext)_localctx).cc.getLine(), ((ExpressionContext)_localctx).cc.getCharPositionInLine()+1);
				}
				break;
			case 5:
				{
				setState(77);
				((ExpressionContext)_localctx).fi = function_invocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).fi.ast;
				}
				break;
			case 6:
				{
				setState(80);
				match(T__2);
				setState(81);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(82);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast;
				}
				break;
			case 7:
				{
				setState(85);
				((ExpressionContext)_localctx).p1 = match(T__2);
				setState(86);
				((ExpressionContext)_localctx).t1 = primitive_type();
				setState(87);
				((ExpressionContext)_localctx).p2 = match(T__3);
				setState(88);
				((ExpressionContext)_localctx).e1 = expression(7);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t1.ast, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).p1.getLine(), ((ExpressionContext)_localctx).p1.getCharPositionInLine()+1);
				}
				break;
			case 8:
				{
				setState(91);
				((ExpressionContext)_localctx).op = match(T__9);
				setState(92);
				((ExpressionContext)_localctx).e1 = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinusExpression(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1);
				}
				break;
			case 9:
				{
				setState(95);
				((ExpressionContext)_localctx).op = match(T__10);
				setState(96);
				((ExpressionContext)_localctx).e1 = expression(5);
				((ExpressionContext)_localctx).ast =  new NegationExpression(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						((ExpressionContext)_localctx).e2 = expression(5);
						((ExpressionContext)_localctx).ast =  ArithmeticExpression.create(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__14) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						((ExpressionContext)_localctx).e2 = expression(4);
						((ExpressionContext)_localctx).ast =  new ArithmeticExpression(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(112);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4128768L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						((ExpressionContext)_localctx).e2 = expression(3);
						((ExpressionContext)_localctx).ast =  new RelationalExpression(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast, ((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn());
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(117);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						((ExpressionContext)_localctx).e2 = expression(2);
						((ExpressionContext)_localctx).ast =  new LogicalExpression(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast, ((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn());
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(122);
						match(T__6);
						setState(123);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(124);
						match(T__7);
						((ExpressionContext)_localctx).ast =  new IndexExpression(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, ((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn());
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(128);
						match(T__8);
						setState(129);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccessExpression(((ExpressionContext)_localctx).e1.ast, new VariableExpression(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1), ((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn());
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_invocationContext extends ParserRuleContext {
		public FunctionInvocation ast;
		public List<Expression> expressions = new ArrayList<>();
		public Token ID;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((Function_invocationContext)_localctx).ID = match(ID);
			setState(137);
			match(T__2);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3161095932936L) != 0)) {
				{
				setState(138);
				((Function_invocationContext)_localctx).e2 = expression(0);
				_localctx.expressions.add(((Function_invocationContext)_localctx).e2.ast);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(140);
					match(T__23);
					setState(141);
					((Function_invocationContext)_localctx).e3 = expression(0);
					_localctx.expressions.add(((Function_invocationContext)_localctx).e3.ast);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(151);
			match(T__3);
			((Function_invocationContext)_localctx).ast =  new FunctionInvocation(new VariableExpression(((Function_invocationContext)_localctx).ID.getText(), ((Function_invocationContext)_localctx).ID.getLine(), ((Function_invocationContext)_localctx).ID.getCharPositionInLine()+1),
			                        _localctx.expressions, ((Function_invocationContext)_localctx).ID.getLine(), ((Function_invocationContext)_localctx).ID.getCharPositionInLine()+1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext t2;
		public Primitive_typeContext t1;
		public Struct_typeContext st;
		public Token ic;
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				{
				setState(155);
				((TypeContext)_localctx).t1 = primitive_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).t1.ast;
				}
				break;
			case T__24:
				{
				setState(158);
				((TypeContext)_localctx).st = struct_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).st.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.t2 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(163);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(164);
					match(T__6);
					setState(165);
					((TypeContext)_localctx).ic = match(INT_CONSTANT);
					setState(166);
					match(T__7);
					((TypeContext)_localctx).ast =  ArrayType.create(((TypeContext)_localctx).t2.ast,LexerHelper.lexemeToInt(((TypeContext)_localctx).ic.getText()));
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_typeContext extends ParserRuleContext {
		public StructType ast;
		public List<RecordField> fields = new ArrayList<>();
		public Record_fieldContext rf;
		public List<Record_fieldContext> record_field() {
			return getRuleContexts(Record_fieldContext.class);
		}
		public Record_fieldContext record_field(int i) {
			return getRuleContext(Record_fieldContext.class,i);
		}
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_struct_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__24);
			setState(174);
			match(T__4);
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				((Struct_typeContext)_localctx).rf = record_field();
				_localctx.fields.addAll(((Struct_typeContext)_localctx).rf.ast);
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 973078528L) != 0) );
			setState(182);
			match(T__5);
			((Struct_typeContext)_localctx).ast =  new StructType(_localctx.fields);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Record_fieldContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<>();
		public TypeContext t;
		public Token id1;
		public Token id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public Record_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_field; }
	}

	public final Record_fieldContext record_field() throws RecognitionException {
		Record_fieldContext _localctx = new Record_fieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_record_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((Record_fieldContext)_localctx).t = type(0);
			setState(186);
			((Record_fieldContext)_localctx).id1 = match(ID);
			_localctx.ast.add(new RecordField(((Record_fieldContext)_localctx).t.ast, (((Record_fieldContext)_localctx).id1!=null?((Record_fieldContext)_localctx).id1.getText():null),((Record_fieldContext)_localctx).id1.getLine(),((Record_fieldContext)_localctx).id1.getCharPositionInLine()+1));
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(188);
				match(T__23);
				setState(189);
				((Record_fieldContext)_localctx).id2 = match(ID);
				_localctx.ast.add(new RecordField(((Record_fieldContext)_localctx).t.ast, (((Record_fieldContext)_localctx).id2!=null?((Record_fieldContext)_localctx).id2.getText():null),((Record_fieldContext)_localctx).id2.getLine(),((Record_fieldContext)_localctx).id2.getCharPositionInLine()+1));
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primitive_typeContext extends ParserRuleContext {
		public Type ast;
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitive_type);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__26);
				((Primitive_typeContext)_localctx).ast =  new IntType();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__27);
				((Primitive_typeContext)_localctx).ast =  new CharType();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(T__28);
				((Primitive_typeContext)_localctx).ast =  new DoubleType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public List<Expression> expressions = new ArrayList<>();
		public List<Statement> elseBody = new ArrayList<>();
		public Token wo;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public BlockContext b1;
		public BlockContext b2;
		public Function_invocationContext fi;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				((StatementContext)_localctx).wo = match(T__29);
				setState(207);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new WriteStatement(((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).wo.getLine(),((StatementContext)_localctx).wo.getCharPositionInLine()+1));
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(209);
					match(T__23);
					setState(210);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new WriteStatement(((StatementContext)_localctx).e2.ast,((StatementContext)_localctx).wo.getLine(),((StatementContext)_localctx).wo.getCharPositionInLine()+1));
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((StatementContext)_localctx).wo = match(T__30);
				setState(221);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new ReadStatement(((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).wo.getLine(),((StatementContext)_localctx).wo.getCharPositionInLine()+1));
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(223);
					match(T__23);
					setState(224);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new ReadStatement(((StatementContext)_localctx).e2.ast,((StatementContext)_localctx).wo.getLine(),((StatementContext)_localctx).wo.getCharPositionInLine()+1));
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(T__31);
				setState(235);
				((StatementContext)_localctx).e1 = expression(0);
				setState(236);
				match(T__25);
				_localctx.ast.add(new ReturnStatement(((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn()));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				((StatementContext)_localctx).e1 = expression(0);
				setState(240);
				match(T__32);
				setState(241);
				((StatementContext)_localctx).e2 = expression(0);
				setState(242);
				match(T__25);
				 _localctx.ast.add(new AssignmentStatement(((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast, ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn())); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				((StatementContext)_localctx).wo = match(T__33);
				setState(246);
				match(T__2);
				setState(247);
				((StatementContext)_localctx).e1 = expression(0);
				setState(248);
				match(T__3);
				setState(249);
				((StatementContext)_localctx).b1 = block();
				 _localctx.ast.add(new WhileStatement(((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).wo.getLine(), ((StatementContext)_localctx).wo.getCharPositionInLine()+1));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				((StatementContext)_localctx).wo = match(T__34);
				setState(253);
				match(T__2);
				setState(254);
				((StatementContext)_localctx).e1 = expression(0);
				setState(255);
				match(T__3);
				setState(256);
				((StatementContext)_localctx).b1 = block();
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(257);
					match(T__35);
					setState(258);
					((StatementContext)_localctx).b2 = block();
					_localctx.elseBody.addAll(((StatementContext)_localctx).b2.ast);
					}
					break;
				}
				_localctx.ast.add(new IfElseStatement(((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).b1.ast, _localctx.elseBody ,((StatementContext)_localctx).wo.getLine(), ((StatementContext)_localctx).wo.getCharPositionInLine() + 1));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				((StatementContext)_localctx).fi = function_invocation();
				setState(266);
				match(T__25);
				_localctx.ast.add(((StatementContext)_localctx).fi.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext st;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__10:
			case T__29:
			case T__30:
			case T__31:
			case T__33:
			case T__34:
			case INT_CONSTANT:
			case ID:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((BlockContext)_localctx).st = statement();
				_localctx.ast.addAll(((BlockContext)_localctx).st.ast);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__4);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3220151733256L) != 0)) {
					{
					{
					setState(275);
					((BlockContext)_localctx).st = statement();
					_localctx.ast.addAll(((BlockContext)_localctx).st.ast);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public Var_definitionContext vd;
		public Function_definitionContext fd;
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_definition);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((DefinitionContext)_localctx).vd = var_definition();
				_localctx.ast.addAll(((DefinitionContext)_localctx).vd.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				((DefinitionContext)_localctx).fd = function_definition();
				_localctx.ast.add(((DefinitionContext)_localctx).fd.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_definitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<>();
		public TypeContext t2;
		public Token id1;
		public Token id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((Var_definitionContext)_localctx).t2 = type(0);
			setState(295);
			((Var_definitionContext)_localctx).id1 = match(ID);
			_localctx.ast.add(new VariableDefinition(((Var_definitionContext)_localctx).t2.ast, ((Var_definitionContext)_localctx).id1.getText(), ((Var_definitionContext)_localctx).id1.getLine(), ((Var_definitionContext)_localctx).id1.getCharPositionInLine()+1));
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(297);
				match(T__23);
				setState(298);
				((Var_definitionContext)_localctx).id2 = match(ID);
				_localctx.ast.add(new VariableDefinition(((Var_definitionContext)_localctx).t2.ast, ((Var_definitionContext)_localctx).id2.getText(), ((Var_definitionContext)_localctx).id2.getLine(), ((Var_definitionContext)_localctx).id2.getCharPositionInLine()+1));
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Type returnType;
		public List<VariableDefinition> parameters = new ArrayList<>();
		public FunctionType fType;
		public List<VariableDefinition> varDefinitions = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public Function_typeContext ft;
		public Token id1;
		public Parameter_listContext pa;
		public Var_definitionContext vd;
		public StatementContext st;
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			((Function_definitionContext)_localctx).ft = function_type();
			((Function_definitionContext)_localctx).returnType =  ((Function_definitionContext)_localctx).ft.ast;
			setState(309);
			((Function_definitionContext)_localctx).id1 = match(ID);
			setState(310);
			match(T__2);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				setState(311);
				((Function_definitionContext)_localctx).pa = parameter_list();
				((Function_definitionContext)_localctx).parameters =  ((Function_definitionContext)_localctx).pa.ast;
				}
			}

			setState(316);
			match(T__3);
			((Function_definitionContext)_localctx).fType =  new FunctionType(_localctx.returnType, _localctx.parameters);
			setState(318);
			match(T__4);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 973078528L) != 0)) {
				{
				{
				setState(319);
				((Function_definitionContext)_localctx).vd = var_definition();
				_localctx.varDefinitions.addAll(((Function_definitionContext)_localctx).vd.ast);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3220151733256L) != 0)) {
				{
				{
				setState(327);
				((Function_definitionContext)_localctx).st = statement();
				_localctx.statements.addAll(((Function_definitionContext)_localctx).st.ast);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(T__5);
			((Function_definitionContext)_localctx).ast =  new FunctionDefinition((((Function_definitionContext)_localctx).id1!=null?((Function_definitionContext)_localctx).id1.getText():null),_localctx.fType ,_localctx.varDefinitions,_localctx.statements, ((Function_definitionContext)_localctx).id1.getLine(),((Function_definitionContext)_localctx).id1.getCharPositionInLine()+1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public Type ast;
		public Primitive_typeContext pt;
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_type);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				((Function_typeContext)_localctx).pt = primitive_type();
				((Function_typeContext)_localctx).ast =  ((Function_typeContext)_localctx).pt.ast;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(T__0);
				((Function_typeContext)_localctx).ast =  new VoidType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<>();
		public Primitive_typeContext p1;
		public Token id1;
		public Primitive_typeContext p2;
		public Token id2;
		public List<Primitive_typeContext> primitive_type() {
			return getRuleContexts(Primitive_typeContext.class);
		}
		public Primitive_typeContext primitive_type(int i) {
			return getRuleContext(Primitive_typeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			((Parameter_listContext)_localctx).p1 = primitive_type();
			setState(346);
			((Parameter_listContext)_localctx).id1 = match(ID);
			_localctx.ast.add(new VariableDefinition(((Parameter_listContext)_localctx).p1.ast, ((Parameter_listContext)_localctx).id1.getText(), ((Parameter_listContext)_localctx).id1.getLine(), ((Parameter_listContext)_localctx).id1.getCharPositionInLine()+1));
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(348);
				match(T__23);
				setState(349);
				((Parameter_listContext)_localctx).p2 = primitive_type();
				setState(350);
				((Parameter_listContext)_localctx).id2 = match(ID);
				_localctx.ast.add(new VariableDefinition(((Parameter_listContext)_localctx).p2.ast, ((Parameter_listContext)_localctx).id2.getText(), ((Parameter_listContext)_localctx).id2.getLine(), ((Parameter_listContext)_localctx).id2.getCharPositionInLine()+1));
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0167\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001@\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002d\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u0084\b\u0002\n\u0002\f\u0002\u0087\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0091\b\u0003\n\u0003\f\u0003\u0094\t\u0003\u0003\u0003"+
		"\u0096\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00a2\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00a9\b\u0004\n\u0004\f\u0004\u00ac\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00b3\b\u0005\u000b"+
		"\u0005\f\u0005\u00b4\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c0"+
		"\b\u0006\n\u0006\f\u0006\u00c3\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00cd\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00d6\b\b\n\b\f\b\u00d9\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00e4\b\b\n\b\f\b\u00e7\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0106\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u010e\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0117\b\t\n\t\f\t\u011a\t\t\u0001\t\u0003\t\u011d\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0125\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u012d\b\u000b\n\u000b\f\u000b\u0130\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u013b"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0143\b\f"+
		"\n\f\f\f\u0146\t\f\u0001\f\u0001\f\u0001\f\u0005\f\u014b\b\f\n\f\f\f\u014e"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0158\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0162\b\u000e\n\u000e"+
		"\f\u000e\u0165\t\u000e\u0001\u000e\u0000\u0002\u0004\b\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0004\u0001\u0000\f\u000e\u0002\u0000\n\n\u000f\u000f\u0001\u0000\u0010"+
		"\u0015\u0001\u0000\u0016\u0017\u0182\u0000#\u0001\u0000\u0000\u0000\u0002"+
		"+\u0001\u0000\u0000\u0000\u0004c\u0001\u0000\u0000\u0000\u0006\u0088\u0001"+
		"\u0000\u0000\u0000\b\u00a1\u0001\u0000\u0000\u0000\n\u00ad\u0001\u0000"+
		"\u0000\u0000\f\u00b9\u0001\u0000\u0000\u0000\u000e\u00cc\u0001\u0000\u0000"+
		"\u0000\u0010\u010d\u0001\u0000\u0000\u0000\u0012\u011c\u0001\u0000\u0000"+
		"\u0000\u0014\u0124\u0001\u0000\u0000\u0000\u0016\u0126\u0001\u0000\u0000"+
		"\u0000\u0018\u0133\u0001\u0000\u0000\u0000\u001a\u0157\u0001\u0000\u0000"+
		"\u0000\u001c\u0159\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0014\n\u0000"+
		"\u001f \u0006\u0000\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u001e"+
		"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&\'\u0003\u0002\u0001\u0000\'(\u0006\u0000\uffff\uffff\u0000"+
		"()\u0005\u0000\u0000\u0001)*\u0006\u0000\uffff\uffff\u0000*\u0001\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005\u0002\u0000\u0000"+
		"-.\u0005\u0003\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0006\u0001\uffff"+
		"\uffff\u000006\u0005\u0005\u0000\u000012\u0003\u0016\u000b\u000023\u0006"+
		"\u0001\uffff\uffff\u000035\u0001\u0000\u0000\u000041\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007>\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0003"+
		"\u0010\b\u0000:;\u0006\u0001\uffff\uffff\u0000;=\u0001\u0000\u0000\u0000"+
		"<9\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000AB\u0005\u0006\u0000\u0000BC\u0006\u0001\uffff\uffff\u0000"+
		"C\u0003\u0001\u0000\u0000\u0000DE\u0006\u0002\uffff\uffff\u0000EF\u0005"+
		"&\u0000\u0000Fd\u0006\u0002\uffff\uffff\u0000GH\u0005%\u0000\u0000Hd\u0006"+
		"\u0002\uffff\uffff\u0000IJ\u0005)\u0000\u0000Jd\u0006\u0002\uffff\uffff"+
		"\u0000KL\u0005\'\u0000\u0000Ld\u0006\u0002\uffff\uffff\u0000MN\u0003\u0006"+
		"\u0003\u0000NO\u0006\u0002\uffff\uffff\u0000Od\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u0003\u0000\u0000QR\u0003\u0004\u0002\u0000RS\u0005\u0004\u0000"+
		"\u0000ST\u0006\u0002\uffff\uffff\u0000Td\u0001\u0000\u0000\u0000UV\u0005"+
		"\u0003\u0000\u0000VW\u0003\u000e\u0007\u0000WX\u0005\u0004\u0000\u0000"+
		"XY\u0003\u0004\u0002\u0007YZ\u0006\u0002\uffff\uffff\u0000Zd\u0001\u0000"+
		"\u0000\u0000[\\\u0005\n\u0000\u0000\\]\u0003\u0004\u0002\u0006]^\u0006"+
		"\u0002\uffff\uffff\u0000^d\u0001\u0000\u0000\u0000_`\u0005\u000b\u0000"+
		"\u0000`a\u0003\u0004\u0002\u0005ab\u0006\u0002\uffff\uffff\u0000bd\u0001"+
		"\u0000\u0000\u0000cD\u0001\u0000\u0000\u0000cG\u0001\u0000\u0000\u0000"+
		"cI\u0001\u0000\u0000\u0000cK\u0001\u0000\u0000\u0000cM\u0001\u0000\u0000"+
		"\u0000cP\u0001\u0000\u0000\u0000cU\u0001\u0000\u0000\u0000c[\u0001\u0000"+
		"\u0000\u0000c_\u0001\u0000\u0000\u0000d\u0085\u0001\u0000\u0000\u0000"+
		"ef\n\u0004\u0000\u0000fg\u0007\u0000\u0000\u0000gh\u0003\u0004\u0002\u0005"+
		"hi\u0006\u0002\uffff\uffff\u0000i\u0084\u0001\u0000\u0000\u0000jk\n\u0003"+
		"\u0000\u0000kl\u0007\u0001\u0000\u0000lm\u0003\u0004\u0002\u0004mn\u0006"+
		"\u0002\uffff\uffff\u0000n\u0084\u0001\u0000\u0000\u0000op\n\u0002\u0000"+
		"\u0000pq\u0007\u0002\u0000\u0000qr\u0003\u0004\u0002\u0003rs\u0006\u0002"+
		"\uffff\uffff\u0000s\u0084\u0001\u0000\u0000\u0000tu\n\u0001\u0000\u0000"+
		"uv\u0007\u0003\u0000\u0000vw\u0003\u0004\u0002\u0002wx\u0006\u0002\uffff"+
		"\uffff\u0000x\u0084\u0001\u0000\u0000\u0000yz\n\t\u0000\u0000z{\u0005"+
		"\u0007\u0000\u0000{|\u0003\u0004\u0002\u0000|}\u0005\b\u0000\u0000}~\u0006"+
		"\u0002\uffff\uffff\u0000~\u0084\u0001\u0000\u0000\u0000\u007f\u0080\n"+
		"\b\u0000\u0000\u0080\u0081\u0005\t\u0000\u0000\u0081\u0082\u0005&\u0000"+
		"\u0000\u0082\u0084\u0006\u0002\uffff\uffff\u0000\u0083e\u0001\u0000\u0000"+
		"\u0000\u0083j\u0001\u0000\u0000\u0000\u0083o\u0001\u0000\u0000\u0000\u0083"+
		"t\u0001\u0000\u0000\u0000\u0083y\u0001\u0000\u0000\u0000\u0083\u007f\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0005\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"&\u0000\u0000\u0089\u0095\u0005\u0003\u0000\u0000\u008a\u008b\u0003\u0004"+
		"\u0002\u0000\u008b\u0092\u0006\u0003\uffff\uffff\u0000\u008c\u008d\u0005"+
		"\u0018\u0000\u0000\u008d\u008e\u0003\u0004\u0002\u0000\u008e\u008f\u0006"+
		"\u0003\uffff\uffff\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008c"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u008a"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0004\u0000\u0000\u0098\u0099"+
		"\u0006\u0003\uffff\uffff\u0000\u0099\u0007\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0006\u0004\uffff\uffff\u0000\u009b\u009c\u0003\u000e\u0007\u0000"+
		"\u009c\u009d\u0006\u0004\uffff\uffff\u0000\u009d\u00a2\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0003\n\u0005\u0000\u009f\u00a0\u0006\u0004\uffff\uffff"+
		"\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009a\u0001\u0000\u0000"+
		"\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a2\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\n\u0002\u0000\u0000\u00a4\u00a5\u0005\u0007\u0000\u0000"+
		"\u00a5\u00a6\u0005%\u0000\u0000\u00a6\u00a7\u0005\b\u0000\u0000\u00a7"+
		"\u00a9\u0006\u0004\uffff\uffff\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\t\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0019\u0000\u0000\u00ae"+
		"\u00b2\u0005\u0005\u0000\u0000\u00af\u00b0\u0003\f\u0006\u0000\u00b0\u00b1"+
		"\u0006\u0005\uffff\uffff\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2"+
		"\u00af\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0006\u0000\u0000\u00b7"+
		"\u00b8\u0006\u0005\uffff\uffff\u0000\u00b8\u000b\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0003\b\u0004\u0000\u00ba\u00bb\u0005&\u0000\u0000\u00bb"+
		"\u00c1\u0006\u0006\uffff\uffff\u0000\u00bc\u00bd\u0005\u0018\u0000\u0000"+
		"\u00bd\u00be\u0005&\u0000\u0000\u00be\u00c0\u0006\u0006\uffff\uffff\u0000"+
		"\u00bf\u00bc\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005\u001a\u0000\u0000\u00c5\r\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\u001b\u0000\u0000\u00c7\u00cd\u0006\u0007\uffff\uffff\u0000"+
		"\u00c8\u00c9\u0005\u001c\u0000\u0000\u00c9\u00cd\u0006\u0007\uffff\uffff"+
		"\u0000\u00ca\u00cb\u0005\u001d\u0000\u0000\u00cb\u00cd\u0006\u0007\uffff"+
		"\uffff\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u000f\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005\u001e\u0000\u0000\u00cf\u00d0\u0003\u0004"+
		"\u0002\u0000\u00d0\u00d7\u0006\b\uffff\uffff\u0000\u00d1\u00d2\u0005\u0018"+
		"\u0000\u0000\u00d2\u00d3\u0003\u0004\u0002\u0000\u00d3\u00d4\u0006\b\uffff"+
		"\uffff\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u001a"+
		"\u0000\u0000\u00db\u010e\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u001f"+
		"\u0000\u0000\u00dd\u00de\u0003\u0004\u0002\u0000\u00de\u00e5\u0006\b\uffff"+
		"\uffff\u0000\u00df\u00e0\u0005\u0018\u0000\u0000\u00e0\u00e1\u0003\u0004"+
		"\u0002\u0000\u00e1\u00e2\u0006\b\uffff\uffff\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00df\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u001a\u0000\u0000\u00e9\u010e\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005 \u0000\u0000\u00eb\u00ec\u0003\u0004\u0002"+
		"\u0000\u00ec\u00ed\u0005\u001a\u0000\u0000\u00ed\u00ee\u0006\b\uffff\uffff"+
		"\u0000\u00ee\u010e\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003\u0004\u0002"+
		"\u0000\u00f0\u00f1\u0005!\u0000\u0000\u00f1\u00f2\u0003\u0004\u0002\u0000"+
		"\u00f2\u00f3\u0005\u001a\u0000\u0000\u00f3\u00f4\u0006\b\uffff\uffff\u0000"+
		"\u00f4\u010e\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\"\u0000\u0000\u00f6"+
		"\u00f7\u0005\u0003\u0000\u0000\u00f7\u00f8\u0003\u0004\u0002\u0000\u00f8"+
		"\u00f9\u0005\u0004\u0000\u0000\u00f9\u00fa\u0003\u0012\t\u0000\u00fa\u00fb"+
		"\u0006\b\uffff\uffff\u0000\u00fb\u010e\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005#\u0000\u0000\u00fd\u00fe\u0005\u0003\u0000\u0000\u00fe\u00ff\u0003"+
		"\u0004\u0002\u0000\u00ff\u0100\u0005\u0004\u0000\u0000\u0100\u0105\u0003"+
		"\u0012\t\u0000\u0101\u0102\u0005$\u0000\u0000\u0102\u0103\u0003\u0012"+
		"\t\u0000\u0103\u0104\u0006\b\uffff\uffff\u0000\u0104\u0106\u0001\u0000"+
		"\u0000\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0006\b\uffff"+
		"\uffff\u0000\u0108\u010e\u0001\u0000\u0000\u0000\u0109\u010a\u0003\u0006"+
		"\u0003\u0000\u010a\u010b\u0005\u001a\u0000\u0000\u010b\u010c\u0006\b\uffff"+
		"\uffff\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u00ce\u0001\u0000"+
		"\u0000\u0000\u010d\u00dc\u0001\u0000\u0000\u0000\u010d\u00ea\u0001\u0000"+
		"\u0000\u0000\u010d\u00ef\u0001\u0000\u0000\u0000\u010d\u00f5\u0001\u0000"+
		"\u0000\u0000\u010d\u00fc\u0001\u0000\u0000\u0000\u010d\u0109\u0001\u0000"+
		"\u0000\u0000\u010e\u0011\u0001\u0000\u0000\u0000\u010f\u0110\u0003\u0010"+
		"\b\u0000\u0110\u0111\u0006\t\uffff\uffff\u0000\u0111\u011d\u0001\u0000"+
		"\u0000\u0000\u0112\u0118\u0005\u0005\u0000\u0000\u0113\u0114\u0003\u0010"+
		"\b\u0000\u0114\u0115\u0006\t\uffff\uffff\u0000\u0115\u0117\u0001\u0000"+
		"\u0000\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011d\u0005\u0006\u0000\u0000\u011c\u010f\u0001\u0000"+
		"\u0000\u0000\u011c\u0112\u0001\u0000\u0000\u0000\u011d\u0013\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0003\u0016\u000b\u0000\u011f\u0120\u0006\n\uffff"+
		"\uffff\u0000\u0120\u0125\u0001\u0000\u0000\u0000\u0121\u0122\u0003\u0018"+
		"\f\u0000\u0122\u0123\u0006\n\uffff\uffff\u0000\u0123\u0125\u0001\u0000"+
		"\u0000\u0000\u0124\u011e\u0001\u0000\u0000\u0000\u0124\u0121\u0001\u0000"+
		"\u0000\u0000\u0125\u0015\u0001\u0000\u0000\u0000\u0126\u0127\u0003\b\u0004"+
		"\u0000\u0127\u0128\u0005&\u0000\u0000\u0128\u012e\u0006\u000b\uffff\uffff"+
		"\u0000\u0129\u012a\u0005\u0018\u0000\u0000\u012a\u012b\u0005&\u0000\u0000"+
		"\u012b\u012d\u0006\u000b\uffff\uffff\u0000\u012c\u0129\u0001\u0000\u0000"+
		"\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000"+
		"\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u001a\u0000"+
		"\u0000\u0132\u0017\u0001\u0000\u0000\u0000\u0133\u0134\u0003\u001a\r\u0000"+
		"\u0134\u0135\u0006\f\uffff\uffff\u0000\u0135\u0136\u0005&\u0000\u0000"+
		"\u0136\u013a\u0005\u0003\u0000\u0000\u0137\u0138\u0003\u001c\u000e\u0000"+
		"\u0138\u0139\u0006\f\uffff\uffff\u0000\u0139\u013b\u0001\u0000\u0000\u0000"+
		"\u013a\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0004\u0000\u0000"+
		"\u013d\u013e\u0006\f\uffff\uffff\u0000\u013e\u0144\u0005\u0005\u0000\u0000"+
		"\u013f\u0140\u0003\u0016\u000b\u0000\u0140\u0141\u0006\f\uffff\uffff\u0000"+
		"\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u013f\u0001\u0000\u0000\u0000"+
		"\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u014c\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0148\u0003\u0010\b\u0000\u0148"+
		"\u0149\u0006\f\uffff\uffff\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u0147\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005\u0006\u0000\u0000\u0150\u0151\u0006\f\uffff\uffff\u0000\u0151"+
		"\u0019\u0001\u0000\u0000\u0000\u0152\u0153\u0003\u000e\u0007\u0000\u0153"+
		"\u0154\u0006\r\uffff\uffff\u0000\u0154\u0158\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0005\u0001\u0000\u0000\u0156\u0158\u0006\r\uffff\uffff\u0000\u0157"+
		"\u0152\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158"+
		"\u001b\u0001\u0000\u0000\u0000\u0159\u015a\u0003\u000e\u0007\u0000\u015a"+
		"\u015b\u0005&\u0000\u0000\u015b\u0163\u0006\u000e\uffff\uffff\u0000\u015c"+
		"\u015d\u0005\u0018\u0000\u0000\u015d\u015e\u0003\u000e\u0007\u0000\u015e"+
		"\u015f\u0005&\u0000\u0000\u015f\u0160\u0006\u000e\uffff\uffff\u0000\u0160"+
		"\u0162\u0001\u0000\u0000\u0000\u0161\u015c\u0001\u0000\u0000\u0000\u0162"+
		"\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u001d\u0001\u0000\u0000\u0000\u0165"+
		"\u0163\u0001\u0000\u0000\u0000\u001a#6>c\u0083\u0085\u0092\u0095\u00a1"+
		"\u00aa\u00b4\u00c1\u00cc\u00d7\u00e5\u0105\u010d\u0118\u011c\u0124\u012e"+
		"\u013a\u0144\u014c\u0157\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}