// Generated from C:/Users/Jan/Desktop/startcode/src/main/antlr4/nl/han/ica/icss/parser\ICSS.g4 by ANTLR 4.7
package nl.han.ica.icss.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, HEXCODE=16, 
		INT=17, BOOLEAN=18, HEXDIGIT=19, VARIABLE=20, WORD=21, ADD=22, SUB=23, 
		GREATER=24, LESS=25, EQUAL=26, OR=27, WS=28, SPACE=29;
	public static final int
		RULE_stylesheet = 0, RULE_selector = 1, RULE_idselector = 2, RULE_classselector = 3, 
		RULE_htmltag = 4, RULE_assignment = 5, RULE_styleblock = 6, RULE_stylerule = 7, 
		RULE_statementid = 8, RULE_statementvalue = 9, RULE_hex = 10, RULE_size = 11, 
		RULE_variable = 12, RULE_operator = 13, RULE_logicoperator = 14, RULE_optional = 15, 
		RULE_bool = 16, RULE_operation = 17;
	public static final String[] ruleNames = {
		"stylesheet", "selector", "idselector", "classselector", "htmltag", "assignment", 
		"styleblock", "stylerule", "statementid", "statementvalue", "hex", "size", 
		"variable", "operator", "logicoperator", "optional", "bool", "operation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'.'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "':='", 
		"';'", "'{'", "'}'", "':'", "'-'", "'px'", null, null, null, null, null, 
		null, null, null, null, null, null, "'||'", null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "HEXCODE", "INT", "BOOLEAN", "HEXDIGIT", "VARIABLE", 
		"WORD", "ADD", "SUB", "GREATER", "LESS", "EQUAL", "OR", "WS", "SPACE"
	};
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
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ICSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StylesheetContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<StyleblockContext> styleblock() {
			return getRuleContexts(StyleblockContext.class);
		}
		public StyleblockContext styleblock(int i) {
			return getRuleContext(StyleblockContext.class,i);
		}
		public List<OptionalContext> optional() {
			return getRuleContexts(OptionalContext.class);
		}
		public OptionalContext optional(int i) {
			return getRuleContext(OptionalContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylesheet(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(36);
				assignment();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << WORD))) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					{
					setState(42);
					selector();
					setState(43);
					styleblock();
					}
					}
					break;
				case 2:
					{
					{
					setState(45);
					selector();
					setState(46);
					optional();
					setState(47);
					styleblock();
					}
					}
					break;
				}
				}
				setState(53);
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

	public static class SelectorContext extends ParserRuleContext {
		public IdselectorContext idselector() {
			return getRuleContext(IdselectorContext.class,0);
		}
		public HtmltagContext htmltag() {
			return getRuleContext(HtmltagContext.class,0);
		}
		public ClassselectorContext classselector() {
			return getRuleContext(ClassselectorContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selector);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				idselector();
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				htmltag();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				classselector();
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

	public static class IdselectorContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ICSSParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ICSSParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(ICSSParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ICSSParser.INT, i);
		}
		public IdselectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idselector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterIdselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitIdselector(this);
		}
	}

	public final IdselectorContext idselector() throws RecognitionException {
		IdselectorContext _localctx = new IdselectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idselector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(59);
			match(T__0);
			setState(60);
			match(WORD);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==WORD) {
				{
				{
				setState(61);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ClassselectorContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ICSSParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ICSSParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(ICSSParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ICSSParser.INT, i);
		}
		public ClassselectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classselector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterClassselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitClassselector(this);
		}
	}

	public final ClassselectorContext classselector() throws RecognitionException {
		ClassselectorContext _localctx = new ClassselectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classselector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			match(T__1);
			setState(68);
			match(WORD);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==WORD) {
				{
				{
				setState(69);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==WORD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class HtmltagContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ICSSParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ICSSParser.WORD, i);
		}
		public List<TerminalNode> INT() { return getTokens(ICSSParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ICSSParser.INT, i);
		}
		public HtmltagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmltag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterHtmltag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitHtmltag(this);
		}
	}

	public final HtmltagContext htmltag() throws RecognitionException {
		HtmltagContext _localctx = new HtmltagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmltag);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(WORD);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT || _la==WORD) {
					{
					{
					setState(76);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==WORD) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				match(T__7);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementvalueContext> statementvalue() {
			return getRuleContexts(StatementvalueContext.class);
		}
		public StatementvalueContext statementvalue(int i) {
			return getRuleContext(StatementvalueContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				variable();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE );
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				match(T__8);
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				statementvalue();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXCODE) | (1L << INT) | (1L << VARIABLE))) != 0) );
			setState(105);
			match(T__9);
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

	public static class StyleblockContext extends ParserRuleContext {
		public List<StyleruleContext> stylerule() {
			return getRuleContexts(StyleruleContext.class);
		}
		public StyleruleContext stylerule(int i) {
			return getRuleContext(StyleruleContext.class,i);
		}
		public StyleblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStyleblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStyleblock(this);
		}
	}

	public final StyleblockContext styleblock() throws RecognitionException {
		StyleblockContext _localctx = new StyleblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_styleblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__10);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WORD) {
				{
				{
				setState(108);
				stylerule();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__11);
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

	public static class StyleruleContext extends ParserRuleContext {
		public StatementidContext statementid() {
			return getRuleContext(StatementidContext.class,0);
		}
		public List<StatementvalueContext> statementvalue() {
			return getRuleContexts(StatementvalueContext.class);
		}
		public StatementvalueContext statementvalue(int i) {
			return getRuleContext(StatementvalueContext.class,i);
		}
		public StyleruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylerule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylerule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylerule(this);
		}
	}

	public final StyleruleContext stylerule() throws RecognitionException {
		StyleruleContext _localctx = new StyleruleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stylerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			statementid();
			setState(117);
			match(T__12);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				statementvalue();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXCODE) | (1L << INT) | (1L << VARIABLE))) != 0) );
			setState(123);
			match(T__9);
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

	public static class StatementidContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ICSSParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ICSSParser.WORD, i);
		}
		public StatementidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStatementid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStatementid(this);
		}
	}

	public final StatementidContext statementid() throws RecognitionException {
		StatementidContext _localctx = new StatementidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WORD);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(126);
				match(T__13);
				setState(127);
				match(WORD);
				}
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

	public static class StatementvalueContext extends ParserRuleContext {
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public StatementvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStatementvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStatementvalue(this);
		}
	}

	public final StatementvalueContext statementvalue() throws RecognitionException {
		StatementvalueContext _localctx = new StatementvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementvalue);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				hex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				size();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				operation();
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

	public static class HexContext extends ParserRuleContext {
		public TerminalNode HEXCODE() { return getToken(ICSSParser.HEXCODE, 0); }
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitHex(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(HEXCODE);
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

	public static class SizeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ICSSParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ICSSParser.INT, i);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				match(INT);
				}
				}
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(143);
			match(T__14);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ICSSParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(VARIABLE);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ICSSParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ICSSParser.SUB, 0); }
		public TerminalNode GREATER() { return getToken(ICSSParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(ICSSParser.LESS, 0); }
		public TerminalNode EQUAL() { return getToken(ICSSParser.EQUAL, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << GREATER) | (1L << LESS) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LogicoperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(ICSSParser.OR, 0); }
		public LogicoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterLogicoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitLogicoperator(this);
		}
	}

	public final LogicoperatorContext logicoperator() throws RecognitionException {
		LogicoperatorContext _localctx = new LogicoperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(OR);
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

	public static class OptionalContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<LogicoperatorContext> logicoperator() {
			return getRuleContexts(LogicoperatorContext.class);
		}
		public LogicoperatorContext logicoperator(int i) {
			return getRuleContext(LogicoperatorContext.class,i);
		}
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitOptional(this);
		}
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optional);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(151);
				bool();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					bool();
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOLEAN || _la==VARIABLE );
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					logicoperator();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OR );
				setState(162);
				operation();
				}
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ICSSParser.BOOLEAN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				{
				setState(166);
				match(BOOLEAN);
				}
				break;
			case VARIABLE:
				{
				setState(167);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperationContext extends ParserRuleContext {
		public List<HexContext> hex() {
			return getRuleContexts(HexContext.class);
		}
		public HexContext hex(int i) {
			return getRuleContext(HexContext.class,i);
		}
		public List<SizeContext> size() {
			return getRuleContexts(SizeContext.class);
		}
		public SizeContext size(int i) {
			return getRuleContext(SizeContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HEXCODE:
					{
					setState(170);
					hex();
					}
					break;
				case INT:
					{
					setState(171);
					size();
					}
					break;
				case VARIABLE:
					{
					setState(172);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEXCODE) | (1L << INT) | (1L << VARIABLE))) != 0) );
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				operator();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << GREATER) | (1L << LESS) | (1L << EQUAL))) != 0) );
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEXCODE:
				{
				setState(182);
				hex();
				}
				break;
			case INT:
				{
				setState(183);
				size();
				}
				break;
			case VARIABLE:
				{
				setState(184);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\64\n\2\f\2\16\2\67\13\2\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\7\4A\n\4\f\4"+
		"\16\4D\13\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\7\6P\n\6\f\6\16"+
		"\6S\13\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\6\7^\n\7\r\7\16\7_\3\7\6"+
		"\7c\n\7\r\7\16\7d\3\7\6\7h\n\7\r\7\16\7i\3\7\3\7\3\b\3\b\7\bp\n\b\f\b"+
		"\16\bs\13\b\3\b\3\b\3\t\3\t\3\t\6\tz\n\t\r\t\16\t{\3\t\3\t\3\n\3\n\3\n"+
		"\5\n\u0083\n\n\3\13\3\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\r\6\r\u008e"+
		"\n\r\r\r\16\r\u008f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\6"+
		"\21\u009c\n\21\r\21\16\21\u009d\3\21\6\21\u00a1\n\21\r\21\16\21\u00a2"+
		"\3\21\3\21\5\21\u00a7\n\21\3\22\3\22\5\22\u00ab\n\22\3\23\3\23\3\23\6"+
		"\23\u00b0\n\23\r\23\16\23\u00b1\3\23\6\23\u00b5\n\23\r\23\16\23\u00b6"+
		"\3\23\3\23\3\23\5\23\u00bc\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\4\4\2\23\23\27\27\3\2\30\34\2\u00cd\2)\3\2\2\2\4;\3"+
		"\2\2\2\6=\3\2\2\2\bE\3\2\2\2\nZ\3\2\2\2\f]\3\2\2\2\16m\3\2\2\2\20v\3\2"+
		"\2\2\22\177\3\2\2\2\24\u0088\3\2\2\2\26\u008a\3\2\2\2\30\u008d\3\2\2\2"+
		"\32\u0093\3\2\2\2\34\u0095\3\2\2\2\36\u0097\3\2\2\2 \u00a6\3\2\2\2\"\u00aa"+
		"\3\2\2\2$\u00af\3\2\2\2&(\5\f\7\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*\65\3\2\2\2+)\3\2\2\2,-\5\4\3\2-.\5\16\b\2.\64\3\2\2\2/\60\5\4"+
		"\3\2\60\61\5 \21\2\61\62\5\16\b\2\62\64\3\2\2\2\63,\3\2\2\2\63/\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67\65\3\2\2"+
		"\28<\5\6\4\29<\5\n\6\2:<\5\b\5\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\5\3\2"+
		"\2\2=>\7\3\2\2>B\7\27\2\2?A\t\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3"+
		"\2\2\2C\7\3\2\2\2DB\3\2\2\2EF\7\4\2\2FJ\7\27\2\2GI\t\2\2\2HG\3\2\2\2I"+
		"L\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2\2MQ\7\27\2\2NP\t\2\2"+
		"\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R[\3\2\2\2SQ\3\2\2\2T[\7\5\2"+
		"\2U[\7\6\2\2V[\7\7\2\2W[\7\b\2\2X[\7\t\2\2Y[\7\n\2\2ZM\3\2\2\2ZT\3\2\2"+
		"\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\13\3\2\2\2\\^\5"+
		"\32\16\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\7\13\2\2"+
		"ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5\24\13\2gf\3\2\2"+
		"\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\f\2\2l\r\3\2\2\2mq\7\r"+
		"\2\2np\5\20\t\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3"+
		"\2\2\2tu\7\16\2\2u\17\3\2\2\2vw\5\22\n\2wy\7\17\2\2xz\5\24\13\2yx\3\2"+
		"\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\f\2\2~\21\3\2\2\2\177"+
		"\u0082\7\27\2\2\u0080\u0081\7\20\2\2\u0081\u0083\7\27\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084\u0089\5\26\f\2\u0085"+
		"\u0089\5\30\r\2\u0086\u0089\5\32\16\2\u0087\u0089\5$\23\2\u0088\u0084"+
		"\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\25\3\2\2\2\u008a\u008b\7\22\2\2\u008b\27\3\2\2\2\u008c\u008e\7\23\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\21\2\2\u0092\31\3\2\2\2\u0093"+
		"\u0094\7\26\2\2\u0094\33\3\2\2\2\u0095\u0096\t\3\2\2\u0096\35\3\2\2\2"+
		"\u0097\u0098\7\35\2\2\u0098\37\3\2\2\2\u0099\u00a7\5\"\22\2\u009a\u009c"+
		"\5\"\22\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\5\36\20\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a7\3\2\2\2\u00a6\u0099\3\2"+
		"\2\2\u00a6\u009b\3\2\2\2\u00a7!\3\2\2\2\u00a8\u00ab\7\24\2\2\u00a9\u00ab"+
		"\5\32\16\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab#\3\2\2\2\u00ac"+
		"\u00b0\5\26\f\2\u00ad\u00b0\5\30\r\2\u00ae\u00b0\5\32\16\2\u00af\u00ac"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5\34"+
		"\17\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00bc\5\26\f\2\u00b9\u00bc\5"+
		"\30\r\2\u00ba\u00bc\5\32\16\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc%\3\2\2\2\32)\63\65;BJQZ_diq{\u0082\u0088\u008f"+
		"\u009d\u00a2\u00a6\u00aa\u00af\u00b1\u00b6\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}