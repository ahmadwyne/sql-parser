// Generated from CreateTableSQL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CreateTableSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CREATE=6, TABLE=7, IF=8, NOT=9, 
		EXISTS=10, NULL=11, UNIQUE=12, PRIMARY=13, KEY=14, FOREIGN=15, REFERENCES=16, 
		DEFAULT=17, INT=18, VARCHAR=19, CHAR=20, DATE=21, TIMESTAMP=22, DECIMAL=23, 
		BOOLEAN=24, FLOAT=25, DOUBLE=26, BIGINT=27, SMALLINT=28, TEXT=29, BLOB=30, 
		IDENTIFIER=31, INT_LITERAL=32, STRING_LITERAL=33, BOOLEAN_LITERAL=34, 
		WS=35, LINE_COMMENT=36, BLOCK_COMMENT=37;
	public static final int
		RULE_parse = 0, RULE_createTable = 1, RULE_columnDefList = 2, RULE_columnDef = 3, 
		RULE_columnName = 4, RULE_dataType = 5, RULE_columnConstraint = 6, RULE_tableConstraint = 7, 
		RULE_columnNameList = 8, RULE_tableName = 9, RULE_defaultValue = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "createTable", "columnDefList", "columnDef", "columnName", "dataType", 
			"columnConstraint", "tableConstraint", "columnNameList", "tableName", 
			"defaultValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "CREATE", "TABLE", "IF", "NOT", "EXISTS", 
			"NULL", "UNIQUE", "PRIMARY", "KEY", "FOREIGN", "REFERENCES", "DEFAULT", 
			"INT", "VARCHAR", "CHAR", "DATE", "TIMESTAMP", "DECIMAL", "BOOLEAN", 
			"FLOAT", "DOUBLE", "BIGINT", "SMALLINT", "TEXT", "BLOB", "IDENTIFIER", 
			"INT_LITERAL", "STRING_LITERAL", "BOOLEAN_LITERAL", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "CreateTableSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CreateTableSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParseContext extends ParserRuleContext {
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CreateTableSQLParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			createTable();
			setState(23);
			match(EOF);
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
	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CreateTableSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(CreateTableSQLParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnDefListContext columnDefList() {
			return getRuleContext(ColumnDefListContext.class,0);
		}
		public TerminalNode IF() { return getToken(CreateTableSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(CreateTableSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(CreateTableSQLParser.EXISTS, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(CREATE);
			setState(26);
			match(TABLE);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(27);
				match(IF);
				setState(28);
				match(NOT);
				setState(29);
				match(EXISTS);
				}
			}

			setState(32);
			tableName();
			setState(33);
			match(T__0);
			setState(34);
			columnDefList();
			setState(35);
			match(T__1);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(36);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefListContext extends ParserRuleContext {
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public ColumnDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterColumnDefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitColumnDefList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitColumnDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefListContext columnDefList() throws RecognitionException {
		ColumnDefListContext _localctx = new ColumnDefListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_columnDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			columnDef();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(40);
				match(T__3);
				setState(41);
				columnDef();
				}
				}
				setState(46);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnDef);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				columnName();
				setState(48);
				dataType();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 143872L) != 0)) {
					{
					{
					setState(49);
					columnConstraint();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case UNIQUE:
			case PRIMARY:
			case FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				tableConstraint();
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
	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CreateTableSQLParser.IDENTIFIER, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CreateTableSQLParser.INT, 0); }
		public TerminalNode VARCHAR() { return getToken(CreateTableSQLParser.VARCHAR, 0); }
		public List<TerminalNode> INT_LITERAL() { return getTokens(CreateTableSQLParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(CreateTableSQLParser.INT_LITERAL, i);
		}
		public TerminalNode CHAR() { return getToken(CreateTableSQLParser.CHAR, 0); }
		public TerminalNode DATE() { return getToken(CreateTableSQLParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(CreateTableSQLParser.TIMESTAMP, 0); }
		public TerminalNode DECIMAL() { return getToken(CreateTableSQLParser.DECIMAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(CreateTableSQLParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(CreateTableSQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CreateTableSQLParser.DOUBLE, 0); }
		public TerminalNode BIGINT() { return getToken(CreateTableSQLParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(CreateTableSQLParser.SMALLINT, 0); }
		public TerminalNode TEXT() { return getToken(CreateTableSQLParser.TEXT, 0); }
		public TerminalNode BLOB() { return getToken(CreateTableSQLParser.BLOB, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataType);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(INT);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(VARCHAR);
				setState(62);
				match(T__0);
				setState(63);
				match(INT_LITERAL);
				setState(64);
				match(T__1);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(CHAR);
				setState(66);
				match(T__0);
				setState(67);
				match(INT_LITERAL);
				setState(68);
				match(T__1);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(TIMESTAMP);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				match(DECIMAL);
				setState(72);
				match(T__0);
				setState(73);
				match(INT_LITERAL);
				setState(74);
				match(T__3);
				setState(75);
				match(INT_LITERAL);
				setState(76);
				match(T__1);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				match(DOUBLE);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 10);
				{
				setState(80);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 11);
				{
				setState(81);
				match(SMALLINT);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 12);
				{
				setState(82);
				match(TEXT);
				}
				break;
			case BLOB:
				enterOuterAlt(_localctx, 13);
				{
				setState(83);
				match(BLOB);
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
	public static class ColumnConstraintContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(CreateTableSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(CreateTableSQLParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(CreateTableSQLParser.UNIQUE, 0); }
		public TerminalNode PRIMARY() { return getToken(CreateTableSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(CreateTableSQLParser.KEY, 0); }
		public TerminalNode DEFAULT() { return getToken(CreateTableSQLParser.DEFAULT, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterColumnConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitColumnConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitColumnConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnConstraint);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(NOT);
				setState(87);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(UNIQUE);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(PRIMARY);
				setState(90);
				match(KEY);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(DEFAULT);
				setState(92);
				defaultValue();
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
	public static class TableConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(CreateTableSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(CreateTableSQLParser.KEY, 0); }
		public List<ColumnNameListContext> columnNameList() {
			return getRuleContexts(ColumnNameListContext.class);
		}
		public ColumnNameListContext columnNameList(int i) {
			return getRuleContext(ColumnNameListContext.class,i);
		}
		public TerminalNode UNIQUE() { return getToken(CreateTableSQLParser.UNIQUE, 0); }
		public TerminalNode FOREIGN() { return getToken(CreateTableSQLParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(CreateTableSQLParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitTableConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitTableConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableConstraint);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(PRIMARY);
				setState(96);
				match(KEY);
				setState(97);
				match(T__0);
				setState(98);
				columnNameList();
				setState(99);
				match(T__1);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(UNIQUE);
				setState(102);
				match(T__0);
				setState(103);
				columnNameList();
				setState(104);
				match(T__1);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(FOREIGN);
				setState(107);
				match(KEY);
				setState(108);
				match(T__0);
				setState(109);
				columnNameList();
				setState(110);
				match(T__1);
				setState(111);
				match(REFERENCES);
				setState(112);
				tableName();
				setState(113);
				match(T__0);
				setState(114);
				columnNameList();
				setState(115);
				match(T__1);
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
	public static class ColumnNameListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CreateTableSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CreateTableSQLParser.IDENTIFIER, i);
		}
		public ColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterColumnNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitColumnNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitColumnNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameListContext columnNameList() throws RecognitionException {
		ColumnNameListContext _localctx = new ColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENTIFIER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(120);
				match(T__3);
				setState(121);
				match(IDENTIFIER);
				}
				}
				setState(126);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CreateTableSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CreateTableSQLParser.IDENTIFIER, i);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				match(IDENTIFIER);
				setState(128);
				match(T__4);
				}
				break;
			}
			setState(131);
			match(IDENTIFIER);
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
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(CreateTableSQLParser.INT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CreateTableSQLParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(CreateTableSQLParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(CreateTableSQLParser.NULL, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreateTableSQLListener ) ((CreateTableSQLListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CreateTableSQLVisitor ) return ((CreateTableSQLVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defaultValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064773120L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001%\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u00033\b\u0003\n\u0003\f\u00036\t\u0003\u0001\u0003\u0003"+
		"\u00039\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005U\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006^\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007v\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b{\b\b\n\b\f"+
		"\b~\t\b\u0001\t\u0001\t\u0003\t\u0082\b\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0001\u0002\u0000\u000b\u000b \"\u0094\u0000\u0016"+
		"\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004\'\u0001"+
		"\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000"+
		"\u0000\nT\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000eu\u0001"+
		"\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000"+
		"\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002"+
		"\u0001\u0000\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005\u0006\u0000\u0000\u001a\u001e\u0005\u0007"+
		"\u0000\u0000\u001b\u001c\u0005\b\u0000\u0000\u001c\u001d\u0005\t\u0000"+
		"\u0000\u001d\u001f\u0005\n\u0000\u0000\u001e\u001b\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !"+
		"\u0003\u0012\t\u0000!\"\u0005\u0001\u0000\u0000\"#\u0003\u0004\u0002\u0000"+
		"#%\u0005\u0002\u0000\u0000$&\u0005\u0003\u0000\u0000%$\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\',\u0003"+
		"\u0006\u0003\u0000()\u0005\u0004\u0000\u0000)+\u0003\u0006\u0003\u0000"+
		"*(\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000/0\u0003\b\u0004\u000004\u0003\n\u0005\u000013\u0003"+
		"\f\u0006\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000059\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000079\u0003\u000e\u0007\u00008/\u0001\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005"+
		"\u001f\u0000\u0000;\t\u0001\u0000\u0000\u0000<U\u0005\u0012\u0000\u0000"+
		"=>\u0005\u0013\u0000\u0000>?\u0005\u0001\u0000\u0000?@\u0005 \u0000\u0000"+
		"@U\u0005\u0002\u0000\u0000AB\u0005\u0014\u0000\u0000BC\u0005\u0001\u0000"+
		"\u0000CD\u0005 \u0000\u0000DU\u0005\u0002\u0000\u0000EU\u0005\u0015\u0000"+
		"\u0000FU\u0005\u0016\u0000\u0000GH\u0005\u0017\u0000\u0000HI\u0005\u0001"+
		"\u0000\u0000IJ\u0005 \u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0005 \u0000"+
		"\u0000LU\u0005\u0002\u0000\u0000MU\u0005\u0018\u0000\u0000NU\u0005\u0019"+
		"\u0000\u0000OU\u0005\u001a\u0000\u0000PU\u0005\u001b\u0000\u0000QU\u0005"+
		"\u001c\u0000\u0000RU\u0005\u001d\u0000\u0000SU\u0005\u001e\u0000\u0000"+
		"T<\u0001\u0000\u0000\u0000T=\u0001\u0000\u0000\u0000TA\u0001\u0000\u0000"+
		"\u0000TE\u0001\u0000\u0000\u0000TF\u0001\u0000\u0000\u0000TG\u0001\u0000"+
		"\u0000\u0000TM\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000\u0000TO\u0001"+
		"\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u000b\u0001\u0000"+
		"\u0000\u0000VW\u0005\t\u0000\u0000W^\u0005\u000b\u0000\u0000X^\u0005\f"+
		"\u0000\u0000YZ\u0005\r\u0000\u0000Z^\u0005\u000e\u0000\u0000[\\\u0005"+
		"\u0011\u0000\u0000\\^\u0003\u0014\n\u0000]V\u0001\u0000\u0000\u0000]X"+
		"\u0001\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000^\r\u0001\u0000\u0000\u0000_`\u0005\r\u0000\u0000`a\u0005\u000e"+
		"\u0000\u0000ab\u0005\u0001\u0000\u0000bc\u0003\u0010\b\u0000cd\u0005\u0002"+
		"\u0000\u0000dv\u0001\u0000\u0000\u0000ef\u0005\f\u0000\u0000fg\u0005\u0001"+
		"\u0000\u0000gh\u0003\u0010\b\u0000hi\u0005\u0002\u0000\u0000iv\u0001\u0000"+
		"\u0000\u0000jk\u0005\u000f\u0000\u0000kl\u0005\u000e\u0000\u0000lm\u0005"+
		"\u0001\u0000\u0000mn\u0003\u0010\b\u0000no\u0005\u0002\u0000\u0000op\u0005"+
		"\u0010\u0000\u0000pq\u0003\u0012\t\u0000qr\u0005\u0001\u0000\u0000rs\u0003"+
		"\u0010\b\u0000st\u0005\u0002\u0000\u0000tv\u0001\u0000\u0000\u0000u_\u0001"+
		"\u0000\u0000\u0000ue\u0001\u0000\u0000\u0000uj\u0001\u0000\u0000\u0000"+
		"v\u000f\u0001\u0000\u0000\u0000w|\u0005\u001f\u0000\u0000xy\u0005\u0004"+
		"\u0000\u0000y{\u0005\u001f\u0000\u0000zx\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0011\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u001f\u0000\u0000\u0080\u0082\u0005\u0005\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u001f\u0000\u0000\u0084\u0013"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0000\u0000\u0000\u0086\u0015"+
		"\u0001\u0000\u0000\u0000\n\u001e%,48T]u|\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}