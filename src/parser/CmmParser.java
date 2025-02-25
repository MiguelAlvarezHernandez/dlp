// Generated from C:/Users/uo295368/IdeaProjects/dlp/src/parser/Cmm.g4 by ANTLR 4.13.2
package parser;

    import ast.*;
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
		RULE_function_definition = 12, RULE_parameter_list = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main_function", "expression", "function_invocation", "type", 
			"struct_type", "record_field", "primitive_type", "statement", "block", 
			"definition", "var_definition", "function_definition", "parameter_list"
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
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					definition();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			main_function();
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
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<Function_definitionContext> function_definition() {
			return getRuleContexts(Function_definitionContext.class);
		}
		public Function_definitionContext function_definition(int i) {
			return getRuleContext(Function_definitionContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(T__1);
			setState(38);
			match(T__2);
			setState(39);
			match(T__3);
			setState(40);
			match(T__4);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					var_definition();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524098L) != 0)) {
				{
				{
				setState(47);
				function_definition();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__5);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(56);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new VariableExpression(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1);
				}
				break;
			case 2:
				{
				setState(58);
				((ExpressionContext)_localctx).ic = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteralExpression(((ExpressionContext)_localctx).ic.getLine(),
				                                    ((ExpressionContext)_localctx).ic.getCharPositionInLine()+1 , LexerHelper.lexemeToInt(((ExpressionContext)_localctx).ic.getText()));
				}
				break;
			case 3:
				{
				setState(60);
				((ExpressionContext)_localctx).rc = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteralExpression(LexerHelper.lexemeToReal(((ExpressionContext)_localctx).rc.getText()),((ExpressionContext)_localctx).rc.getLine(), ((ExpressionContext)_localctx).rc.getCharPositionInLine()+1);
				}
				break;
			case 4:
				{
				setState(62);
				((ExpressionContext)_localctx).cc = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteralExpression(LexerHelper.lexemeToChar(((ExpressionContext)_localctx).cc.getText()),((ExpressionContext)_localctx).cc.getLine(), ((ExpressionContext)_localctx).cc.getCharPositionInLine()+1);
				}
				break;
			case 5:
				{
				setState(64);
				((ExpressionContext)_localctx).fi = function_invocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).fi.ast;
				}
				break;
			case 6:
				{
				setState(67);
				match(T__2);
				setState(68);
				expression(0);
				setState(69);
				match(T__3);
				}
				break;
			case 7:
				{
				setState(71);
				((ExpressionContext)_localctx).p1 = match(T__2);
				setState(72);
				((ExpressionContext)_localctx).t1 = primitive_type();
				setState(73);
				((ExpressionContext)_localctx).p2 = match(T__3);
				setState(74);
				((ExpressionContext)_localctx).e1 = expression(7);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t1.ast, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).p1.getLine(), ((ExpressionContext)_localctx).p1.getCharPositionInLine()+1);
				}
				break;
			case 8:
				{
				setState(77);
				((ExpressionContext)_localctx).op = match(T__9);
				setState(78);
				((ExpressionContext)_localctx).e1 = expression(6);
				((ExpressionContext)_localctx).ast =  new UnaryMinusExpression(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1);
				}
				break;
			case 9:
				{
				setState(81);
				((ExpressionContext)_localctx).op = match(T__10);
				setState(82);
				((ExpressionContext)_localctx).e1 = expression(5);
				((ExpressionContext)_localctx).ast =  new NegationExpression(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(88);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						expression(5);
						((ExpressionContext)_localctx).ast =  new ArithmeticExpression(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(93);
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
						setState(94);
						((ExpressionContext)_localctx).e2 = expression(4);
						((ExpressionContext)_localctx).ast =  new ArithmeticExpression(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(98);
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
						setState(99);
						((ExpressionContext)_localctx).e2 = expression(3);
						((ExpressionContext)_localctx).ast =  new RelationalExpression(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast, ((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn());
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(103);
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
						setState(104);
						((ExpressionContext)_localctx).e2 = expression(2);
						((ExpressionContext)_localctx).ast =  new LogicalExpression(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast, ((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn());
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(108);
						match(T__6);
						setState(109);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(110);
						match(T__7);
						((ExpressionContext)_localctx).ast =  new IndexExpression(((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast, ((ExpressionContext)_localctx).p1.getLine(), ((ExpressionContext)_localctx).p1.getCharPositionInLine()+1);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(114);
						match(T__8);
						setState(115);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccessExpression(((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn());
						}
						break;
					}
					} 
				}
				setState(121);
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
			setState(122);
			((Function_invocationContext)_localctx).ID = match(ID);
			setState(123);
			match(T__2);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3161095932936L) != 0)) {
				{
				setState(124);
				((Function_invocationContext)_localctx).e2 = expression(0);
				_localctx.expressions.add(((Function_invocationContext)_localctx).e2.ast);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(126);
					match(T__23);
					setState(127);
					((Function_invocationContext)_localctx).e3 = expression(0);
					_localctx.expressions.add(((Function_invocationContext)_localctx).e3.ast);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(137);
			match(T__3);
			((Function_invocationContext)_localctx).ast =  new FunctionInvocation((((Function_invocationContext)_localctx).ID!=null?((Function_invocationContext)_localctx).ID.getText():null), _localctx.expressions, ((Function_invocationContext)_localctx).ID.getLine(), ((Function_invocationContext)_localctx).ID.getCharPositionInLine()+1);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				{
				setState(141);
				((TypeContext)_localctx).t1 = primitive_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).t1.ast;
				}
				break;
			case T__24:
				{
				setState(144);
				((TypeContext)_localctx).st = struct_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).st.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
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
					setState(149);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(150);
					match(T__6);
					setState(151);
					((TypeContext)_localctx).ic = match(INT_CONSTANT);
					setState(152);
					match(T__7);
					((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).t2.ast,LexerHelper.lexemeToInt(((TypeContext)_localctx).ic.getText()));
					}
					} 
				}
				setState(158);
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
			setState(159);
			match(T__24);
			setState(160);
			match(T__4);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				((Struct_typeContext)_localctx).rf = record_field();
				_localctx.fields.add(((Struct_typeContext)_localctx).rf.ast);
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 973078528L) != 0) );
			setState(168);
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
		public RecordField ast;
		public TypeContext t;
		public Token ID;
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Record_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_field; }
	}

	public final Record_fieldContext record_field() throws RecognitionException {
		Record_fieldContext _localctx = new Record_fieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_record_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((Record_fieldContext)_localctx).t = type(0);
			setState(172);
			((Record_fieldContext)_localctx).ID = match(ID);
			setState(173);
			match(T__25);
			_localctx.ast = new RecordField(((Record_fieldContext)_localctx).t.ast, (((Record_fieldContext)_localctx).ID!=null?((Record_fieldContext)_localctx).ID.getText():null))
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
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__26);
				((Primitive_typeContext)_localctx).ast =  new IntType();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__27);
				((Primitive_typeContext)_localctx).ast =  new CharType();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__29);
				setState(185);
				expression(0);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(186);
					match(T__23);
					setState(187);
					expression(0);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__30);
				setState(196);
				expression(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(197);
					match(T__23);
					setState(198);
					expression(0);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__31);
				setState(207);
				expression(0);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(208);
					match(T__23);
					setState(209);
					expression(0);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(T__25);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				expression(0);
				setState(218);
				match(T__32);
				setState(219);
				expression(0);
				setState(220);
				match(T__25);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(T__33);
				setState(223);
				match(T__2);
				setState(224);
				expression(0);
				setState(225);
				match(T__3);
				setState(226);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(228);
				match(T__34);
				setState(229);
				match(T__2);
				setState(230);
				expression(0);
				setState(231);
				match(T__3);
				setState(232);
				block();
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(233);
					match(T__35);
					setState(234);
					block();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(237);
				function_invocation();
				setState(238);
				match(T__25);
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
			setState(251);
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
				setState(242);
				statement();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__4);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3220151733256L) != 0)) {
					{
					{
					setState(244);
					statement();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
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
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				var_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				function_definition();
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
			setState(257);
			type(0);
			setState(258);
			match(ID);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(259);
				match(T__23);
				setState(260);
				match(ID);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
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
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
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
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__28:
				{
				setState(268);
				primitive_type();
				}
				break;
			case T__0:
				{
				setState(269);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(272);
			match(ID);
			setState(273);
			match(T__2);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				setState(274);
				parameter_list();
				}
			}

			setState(277);
			match(T__3);
			setState(278);
			match(T__4);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 973078528L) != 0)) {
				{
				{
				setState(279);
				var_definition();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3220151733256L) != 0)) {
				{
				{
				setState(285);
				statement();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(T__5);
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
		enterRule(_localctx, 26, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			primitive_type();
			setState(294);
			match(ID);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(295);
				match(T__23);
				setState(296);
				primitive_type();
				setState(297);
				match(ID);
				}
				}
				setState(303);
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
		"\u0004\u0001+\u0131\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001+\b\u0001\n\u0001"+
		"\f\u0001.\t\u0001\u0001\u0001\u0005\u00011\b\u0001\n\u0001\f\u00014\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002V\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002v\b"+
		"\u0002\n\u0002\f\u0002y\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0083"+
		"\b\u0003\n\u0003\f\u0003\u0086\t\u0003\u0003\u0003\u0088\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0094\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009b"+
		"\b\u0004\n\u0004\f\u0004\u009e\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0004\u0005\u00a5\b\u0005\u000b\u0005\f\u0005"+
		"\u00a6\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b7\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00bd\b\b\n\b\f\b\u00c0\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00c8\b\b\n\b\f\b\u00cb\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d3\b\b\n\b\f\b\u00d6"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00ec\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f1"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00f6\b\t\n\t\f\t\u00f9\t\t\u0001"+
		"\t\u0003\t\u00fc\b\t\u0001\n\u0001\n\u0003\n\u0100\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0106\b\u000b\n\u000b\f\u000b"+
		"\u0109\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u010f\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0114\b\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0119\b\f\n\f\f\f\u011c\t\f\u0001\f\u0005\f\u011f\b\f\n\f\f\f\u0122"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u012c\b\r\n\r\f\r\u012f\t\r\u0001\r\u0000\u0002\u0004\b\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0004\u0001\u0000\f\u000e\u0002\u0000\n\n\u000f\u000f\u0001\u0000\u0010"+
		"\u0015\u0001\u0000\u0016\u0017\u014d\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0002$\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000\u0006z"+
		"\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000\u0000\u0000\n\u009f\u0001"+
		"\u0000\u0000\u0000\f\u00ab\u0001\u0000\u0000\u0000\u000e\u00b6\u0001\u0000"+
		"\u0000\u0000\u0010\u00f0\u0001\u0000\u0000\u0000\u0012\u00fb\u0001\u0000"+
		"\u0000\u0000\u0014\u00ff\u0001\u0000\u0000\u0000\u0016\u0101\u0001\u0000"+
		"\u0000\u0000\u0018\u010e\u0001\u0000\u0000\u0000\u001a\u0125\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0003\u0014\n\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#\u0001\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u0002\u0000\u0000&\'\u0005\u0003"+
		"\u0000\u0000\'(\u0005\u0004\u0000\u0000(,\u0005\u0005\u0000\u0000)+\u0003"+
		"\u0016\u000b\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-2\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000/1\u0003\u0018\f\u00000/\u0001\u0000\u0000"+
		"\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005"+
		"\u0006\u0000\u00006\u0003\u0001\u0000\u0000\u000078\u0006\u0002\uffff"+
		"\uffff\u000089\u0005&\u0000\u00009V\u0006\u0002\uffff\uffff\u0000:;\u0005"+
		"%\u0000\u0000;V\u0006\u0002\uffff\uffff\u0000<=\u0005)\u0000\u0000=V\u0006"+
		"\u0002\uffff\uffff\u0000>?\u0005\'\u0000\u0000?V\u0006\u0002\uffff\uffff"+
		"\u0000@A\u0003\u0006\u0003\u0000AB\u0006\u0002\uffff\uffff\u0000BV\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0003\u0000\u0000DE\u0003\u0004\u0002\u0000"+
		"EF\u0005\u0004\u0000\u0000FV\u0001\u0000\u0000\u0000GH\u0005\u0003\u0000"+
		"\u0000HI\u0003\u000e\u0007\u0000IJ\u0005\u0004\u0000\u0000JK\u0003\u0004"+
		"\u0002\u0007KL\u0006\u0002\uffff\uffff\u0000LV\u0001\u0000\u0000\u0000"+
		"MN\u0005\n\u0000\u0000NO\u0003\u0004\u0002\u0006OP\u0006\u0002\uffff\uffff"+
		"\u0000PV\u0001\u0000\u0000\u0000QR\u0005\u000b\u0000\u0000RS\u0003\u0004"+
		"\u0002\u0005ST\u0006\u0002\uffff\uffff\u0000TV\u0001\u0000\u0000\u0000"+
		"U7\u0001\u0000\u0000\u0000U:\u0001\u0000\u0000\u0000U<\u0001\u0000\u0000"+
		"\u0000U>\u0001\u0000\u0000\u0000U@\u0001\u0000\u0000\u0000UC\u0001\u0000"+
		"\u0000\u0000UG\u0001\u0000\u0000\u0000UM\u0001\u0000\u0000\u0000UQ\u0001"+
		"\u0000\u0000\u0000Vw\u0001\u0000\u0000\u0000WX\n\u0004\u0000\u0000XY\u0007"+
		"\u0000\u0000\u0000YZ\u0003\u0004\u0002\u0005Z[\u0006\u0002\uffff\uffff"+
		"\u0000[v\u0001\u0000\u0000\u0000\\]\n\u0003\u0000\u0000]^\u0007\u0001"+
		"\u0000\u0000^_\u0003\u0004\u0002\u0004_`\u0006\u0002\uffff\uffff\u0000"+
		"`v\u0001\u0000\u0000\u0000ab\n\u0002\u0000\u0000bc\u0007\u0002\u0000\u0000"+
		"cd\u0003\u0004\u0002\u0003de\u0006\u0002\uffff\uffff\u0000ev\u0001\u0000"+
		"\u0000\u0000fg\n\u0001\u0000\u0000gh\u0007\u0003\u0000\u0000hi\u0003\u0004"+
		"\u0002\u0002ij\u0006\u0002\uffff\uffff\u0000jv\u0001\u0000\u0000\u0000"+
		"kl\n\t\u0000\u0000lm\u0005\u0007\u0000\u0000mn\u0003\u0004\u0002\u0000"+
		"no\u0005\b\u0000\u0000op\u0006\u0002\uffff\uffff\u0000pv\u0001\u0000\u0000"+
		"\u0000qr\n\b\u0000\u0000rs\u0005\t\u0000\u0000st\u0005&\u0000\u0000tv"+
		"\u0006\u0002\uffff\uffff\u0000uW\u0001\u0000\u0000\u0000u\\\u0001\u0000"+
		"\u0000\u0000ua\u0001\u0000\u0000\u0000uf\u0001\u0000\u0000\u0000uk\u0001"+
		"\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0005\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005&\u0000\u0000{\u0087\u0005"+
		"\u0003\u0000\u0000|}\u0003\u0004\u0002\u0000}\u0084\u0006\u0003\uffff"+
		"\uffff\u0000~\u007f\u0005\u0018\u0000\u0000\u007f\u0080\u0003\u0004\u0002"+
		"\u0000\u0080\u0081\u0006\u0003\uffff\uffff\u0000\u0081\u0083\u0001\u0000"+
		"\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0087|\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0004\u0000\u0000"+
		"\u008a\u008b\u0006\u0003\uffff\uffff\u0000\u008b\u0007\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0006\u0004\uffff\uffff\u0000\u008d\u008e\u0003\u000e"+
		"\u0007\u0000\u008e\u008f\u0006\u0004\uffff\uffff\u0000\u008f\u0094\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0003\n\u0005\u0000\u0091\u0092\u0006\u0004"+
		"\uffff\uffff\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u008c\u0001"+
		"\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0094\u009c\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\n\u0002\u0000\u0000\u0096\u0097\u0005\u0007"+
		"\u0000\u0000\u0097\u0098\u0005%\u0000\u0000\u0098\u0099\u0005\b\u0000"+
		"\u0000\u0099\u009b\u0006\u0004\uffff\uffff\u0000\u009a\u0095\u0001\u0000"+
		"\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\t\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0019\u0000"+
		"\u0000\u00a0\u00a4\u0005\u0005\u0000\u0000\u00a1\u00a2\u0003\f\u0006\u0000"+
		"\u00a2\u00a3\u0006\u0005\uffff\uffff\u0000\u00a3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0006\u0000"+
		"\u0000\u00a9\u00aa\u0006\u0005\uffff\uffff\u0000\u00aa\u000b\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0003\b\u0004\u0000\u00ac\u00ad\u0005&\u0000"+
		"\u0000\u00ad\u00ae\u0005\u001a\u0000\u0000\u00ae\u00af\u0006\u0006\uffff"+
		"\uffff\u0000\u00af\r\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001b\u0000"+
		"\u0000\u00b1\u00b7\u0006\u0007\uffff\uffff\u0000\u00b2\u00b3\u0005\u001c"+
		"\u0000\u0000\u00b3\u00b7\u0006\u0007\uffff\uffff\u0000\u00b4\u00b5\u0005"+
		"\u001d\u0000\u0000\u00b5\u00b7\u0006\u0007\uffff\uffff\u0000\u00b6\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b7\u000f\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u001e\u0000\u0000\u00b9\u00be\u0003\u0004\u0002\u0000\u00ba\u00bb"+
		"\u0005\u0018\u0000\u0000\u00bb\u00bd\u0003\u0004\u0002\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\u001a\u0000\u0000\u00c2\u00f1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005\u001f\u0000\u0000\u00c4\u00c9\u0003\u0004\u0002\u0000\u00c5\u00c6"+
		"\u0005\u0018\u0000\u0000\u00c6\u00c8\u0003\u0004\u0002\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005\u001a\u0000\u0000\u00cd\u00f1\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005 \u0000\u0000\u00cf\u00d4\u0003\u0004\u0002\u0000\u00d0\u00d1\u0005"+
		"\u0018\u0000\u0000\u00d1\u00d3\u0003\u0004\u0002\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\u001a\u0000\u0000\u00d8\u00f1\u0001\u0000\u0000\u0000\u00d9\u00da\u0003"+
		"\u0004\u0002\u0000\u00da\u00db\u0005!\u0000\u0000\u00db\u00dc\u0003\u0004"+
		"\u0002\u0000\u00dc\u00dd\u0005\u001a\u0000\u0000\u00dd\u00f1\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005\"\u0000\u0000\u00df\u00e0\u0005\u0003\u0000"+
		"\u0000\u00e0\u00e1\u0003\u0004\u0002\u0000\u00e1\u00e2\u0005\u0004\u0000"+
		"\u0000\u00e2\u00e3\u0003\u0012\t\u0000\u00e3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005#\u0000\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000\u00e6"+
		"\u00e7\u0003\u0004\u0002\u0000\u00e7\u00e8\u0005\u0004\u0000\u0000\u00e8"+
		"\u00eb\u0003\u0012\t\u0000\u00e9\u00ea\u0005$\u0000\u0000\u00ea\u00ec"+
		"\u0003\u0012\t\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00f1\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003"+
		"\u0006\u0003\u0000\u00ee\u00ef\u0005\u001a\u0000\u0000\u00ef\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f0\u00b8\u0001\u0000\u0000\u0000\u00f0\u00c3\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ce\u0001\u0000\u0000\u0000\u00f0\u00d9\u0001"+
		"\u0000\u0000\u0000\u00f0\u00de\u0001\u0000\u0000\u0000\u00f0\u00e4\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f1\u0011\u0001"+
		"\u0000\u0000\u0000\u00f2\u00fc\u0003\u0010\b\u0000\u00f3\u00f7\u0005\u0005"+
		"\u0000\u0000\u00f4\u00f6\u0003\u0010\b\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005\u0006\u0000"+
		"\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f3\u0001\u0000\u0000"+
		"\u0000\u00fc\u0013\u0001\u0000\u0000\u0000\u00fd\u0100\u0003\u0016\u000b"+
		"\u0000\u00fe\u0100\u0003\u0018\f\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0015\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0003\b\u0004\u0000\u0102\u0107\u0005&\u0000\u0000\u0103"+
		"\u0104\u0005\u0018\u0000\u0000\u0104\u0106\u0005&\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0005\u001a\u0000\u0000\u010b\u0017\u0001\u0000\u0000\u0000\u010c\u010f"+
		"\u0003\u000e\u0007\u0000\u010d\u010f\u0005\u0001\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0005&\u0000\u0000\u0111\u0113\u0005"+
		"\u0003\u0000\u0000\u0112\u0114\u0003\u001a\r\u0000\u0113\u0112\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005\u0004\u0000\u0000\u0116\u011a\u0005\u0005"+
		"\u0000\u0000\u0117\u0119\u0003\u0016\u000b\u0000\u0118\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0120\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011f\u0003\u0010"+
		"\b\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u0006\u0000\u0000\u0124\u0019\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0003\u000e\u0007\u0000\u0126\u012d\u0005&\u0000\u0000"+
		"\u0127\u0128\u0005\u0018\u0000\u0000\u0128\u0129\u0003\u000e\u0007\u0000"+
		"\u0129\u012a\u0005&\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"+
		"\u0127\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d"+
		"\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u001b\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u001a"+
		"\u001f,2Uuw\u0084\u0087\u0093\u009c\u00a6\u00b6\u00be\u00c9\u00d4\u00eb"+
		"\u00f0\u00f7\u00fb\u00ff\u0107\u010e\u0113\u011a\u0120\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}