/*
 * generated by Xtext 2.12.0
 */
package fi.tucs.entities.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EntitiesGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.Model");
		private final Assignment cEntitiesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_0 = (RuleCall)cEntitiesAssignment.eContents().get(0);
		
		//Model:
		//	entities+=Entity*;
		@Override public ParserRule getRule() { return rule; }
		
		//entities+=Entity*
		public Assignment getEntitiesAssignment() { return cEntitiesAssignment; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_0() { return cEntitiesEntityParserRuleCall_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFieldsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFieldsFieldParserRuleCall_4_0 = (RuleCall)cFieldsAssignment_4.eContents().get(0);
		private final Assignment cStatementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cStatementsStatementParserRuleCall_5_0 = (RuleCall)cStatementsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Entity:
		//	'entity' name=ID ('extends' superType=[Entity])? '{'
		//	fields+=Field*
		//	statements+=Statement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' superType=[Entity])? '{' fields+=Field* statements+=Statement* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Entity])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Entity]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Entity]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSuperTypeEntityIDTerminalRuleCall_2_1_0_1() { return cSuperTypeEntityIDTerminalRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//fields+=Field*
		public Assignment getFieldsAssignment_4() { return cFieldsAssignment_4; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_4_0() { return cFieldsFieldParserRuleCall_4_0; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_5() { return cStatementsAssignment_5; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_5_0() { return cStatementsStatementParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrintStatementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAssignmentStatementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Statement:
		//	PrintStatement | AssignmentStatement;
		@Override public ParserRule getRule() { return rule; }
		
		//PrintStatement | AssignmentStatement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PrintStatement
		public RuleCall getPrintStatementParserRuleCall_0() { return cPrintStatementParserRuleCall_0; }
		
		//AssignmentStatement
		public RuleCall getAssignmentStatementParserRuleCall_1() { return cAssignmentStatementParserRuleCall_1; }
	}
	public class AssignmentStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.AssignmentStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAssigneeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cAssigneeFieldCrossReference_0_0 = (CrossReference)cAssigneeAssignment_0.eContents().get(0);
		private final RuleCall cAssigneeFieldIDTerminalRuleCall_0_0_1 = (RuleCall)cAssigneeFieldCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprExpressionParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		
		//AssignmentStatement:
		//	assignee=[Field] '=' expr=Expression;
		@Override public ParserRule getRule() { return rule; }
		
		//assignee=[Field] '=' expr=Expression
		public Group getGroup() { return cGroup; }
		
		//assignee=[Field]
		public Assignment getAssigneeAssignment_0() { return cAssigneeAssignment_0; }
		
		//[Field]
		public CrossReference getAssigneeFieldCrossReference_0_0() { return cAssigneeFieldCrossReference_0_0; }
		
		//ID
		public RuleCall getAssigneeFieldIDTerminalRuleCall_0_0_1() { return cAssigneeFieldIDTerminalRuleCall_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//expr=Expression
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_2_0() { return cExprExpressionParserRuleCall_2_0; }
	}
	public class PrintStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.PrintStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPrintKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprExpressionParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		
		//PrintStatement:
		//	'print' expr=Expression;
		@Override public ParserRule getRule() { return rule; }
		
		//'print' expr=Expression
		public Group getGroup() { return cGroup; }
		
		//'print'
		public Keyword getPrintKeyword_0() { return cPrintKeyword_0; }
		
		//expr=Expression
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }
		
		//Expression
		public RuleCall getExprExpressionParserRuleCall_1_0() { return cExprExpressionParserRuleCall_1_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cIntConstantAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cStringConstantAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cBoolConstantAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Alternatives cValueAlternatives_2_1_0 = (Alternatives)cValueAssignment_2_1.eContents().get(0);
		private final Keyword cValueOnKeyword_2_1_0_0 = (Keyword)cValueAlternatives_2_1_0.eContents().get(0);
		private final Keyword cValueOffKeyword_2_1_0_1 = (Keyword)cValueAlternatives_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cFieldRefAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cFieldAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cFieldFieldCrossReference_3_1_0 = (CrossReference)cFieldAssignment_3_1.eContents().get(0);
		private final RuleCall cFieldFieldIDTerminalRuleCall_3_1_0_1 = (RuleCall)cFieldFieldCrossReference_3_1_0.eContents().get(1);
		
		//Expression:
		//	{IntConstant} value=INT | {StringConstant} value=STRING | {BoolConstant} value=('on' | 'off') | {FieldRef}
		//	field=[Field];
		@Override public ParserRule getRule() { return rule; }
		
		//{IntConstant} value=INT | {StringConstant} value=STRING | {BoolConstant} value=('on' | 'off') | {FieldRef} field=[Field]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{IntConstant} value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{IntConstant}
		public Action getIntConstantAction_0_0() { return cIntConstantAction_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_1_0() { return cValueINTTerminalRuleCall_0_1_0; }
		
		//{StringConstant} value=STRING
		public Group getGroup_1() { return cGroup_1; }
		
		//{StringConstant}
		public Action getStringConstantAction_1_0() { return cStringConstantAction_1_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0() { return cValueSTRINGTerminalRuleCall_1_1_0; }
		
		//{BoolConstant} value=('on' | 'off')
		public Group getGroup_2() { return cGroup_2; }
		
		//{BoolConstant}
		public Action getBoolConstantAction_2_0() { return cBoolConstantAction_2_0; }
		
		//value=('on' | 'off')
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//('on' | 'off')
		public Alternatives getValueAlternatives_2_1_0() { return cValueAlternatives_2_1_0; }
		
		//'on'
		public Keyword getValueOnKeyword_2_1_0_0() { return cValueOnKeyword_2_1_0_0; }
		
		//'off'
		public Keyword getValueOffKeyword_2_1_0_1() { return cValueOffKeyword_2_1_0_1; }
		
		//{FieldRef} field=[Field]
		public Group getGroup_3() { return cGroup_3; }
		
		//{FieldRef}
		public Action getFieldRefAction_3_0() { return cFieldRefAction_3_0; }
		
		//field=[Field]
		public Assignment getFieldAssignment_3_1() { return cFieldAssignment_3_1; }
		
		//[Field]
		public CrossReference getFieldFieldCrossReference_3_1_0() { return cFieldFieldCrossReference_3_1_0; }
		
		//ID
		public RuleCall getFieldFieldIDTerminalRuleCall_3_1_0_1() { return cFieldFieldIDTerminalRuleCall_3_1_0_1; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeFieldTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Field:
		//	type=FieldType name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//type=FieldType name=ID
		public Group getGroup() { return cGroup; }
		
		//type=FieldType
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//FieldType
		public RuleCall getTypeFieldTypeParserRuleCall_0_0() { return cTypeFieldTypeParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class FieldTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.FieldType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBasicTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//FieldType:
		//	BasicType | EntityType;
		@Override public ParserRule getRule() { return rule; }
		
		//BasicType | EntityType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BasicType
		public RuleCall getBasicTypeParserRuleCall_0() { return cBasicTypeParserRuleCall_0; }
		
		//EntityType
		public RuleCall getEntityTypeParserRuleCall_1() { return cEntityTypeParserRuleCall_1; }
	}
	public class BasicTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.BasicType");
		private final Assignment cTypeNameAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeNameAlternatives_0 = (Alternatives)cTypeNameAssignment.eContents().get(0);
		private final Keyword cTypeNameTextKeyword_0_0 = (Keyword)cTypeNameAlternatives_0.eContents().get(0);
		private final Keyword cTypeNameNumberKeyword_0_1 = (Keyword)cTypeNameAlternatives_0.eContents().get(1);
		private final Keyword cTypeNameToggleKeyword_0_2 = (Keyword)cTypeNameAlternatives_0.eContents().get(2);
		
		//BasicType:
		//	typeName=('text' | 'number' | 'toggle');
		@Override public ParserRule getRule() { return rule; }
		
		//typeName=('text' | 'number' | 'toggle')
		public Assignment getTypeNameAssignment() { return cTypeNameAssignment; }
		
		//('text' | 'number' | 'toggle')
		public Alternatives getTypeNameAlternatives_0() { return cTypeNameAlternatives_0; }
		
		//'text'
		public Keyword getTypeNameTextKeyword_0_0() { return cTypeNameTextKeyword_0_0; }
		
		//'number'
		public Keyword getTypeNameNumberKeyword_0_1() { return cTypeNameNumberKeyword_0_1; }
		
		//'toggle'
		public Keyword getTypeNameToggleKeyword_0_2() { return cTypeNameToggleKeyword_0_2; }
	}
	public class EntityTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fi.tucs.entities.Entities.EntityType");
		private final Assignment cEntityAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cEntityEntityCrossReference_0 = (CrossReference)cEntityAssignment.eContents().get(0);
		private final RuleCall cEntityEntityIDTerminalRuleCall_0_1 = (RuleCall)cEntityEntityCrossReference_0.eContents().get(1);
		
		//EntityType:
		//	entity=[Entity];
		@Override public ParserRule getRule() { return rule; }
		
		//entity=[Entity]
		public Assignment getEntityAssignment() { return cEntityAssignment; }
		
		//[Entity]
		public CrossReference getEntityEntityCrossReference_0() { return cEntityEntityCrossReference_0; }
		
		//ID
		public RuleCall getEntityEntityIDTerminalRuleCall_0_1() { return cEntityEntityIDTerminalRuleCall_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final EntityElements pEntity;
	private final StatementElements pStatement;
	private final AssignmentStatementElements pAssignmentStatement;
	private final PrintStatementElements pPrintStatement;
	private final ExpressionElements pExpression;
	private final FieldElements pField;
	private final FieldTypeElements pFieldType;
	private final BasicTypeElements pBasicType;
	private final EntityTypeElements pEntityType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EntitiesGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pEntity = new EntityElements();
		this.pStatement = new StatementElements();
		this.pAssignmentStatement = new AssignmentStatementElements();
		this.pPrintStatement = new PrintStatementElements();
		this.pExpression = new ExpressionElements();
		this.pField = new FieldElements();
		this.pFieldType = new FieldTypeElements();
		this.pBasicType = new BasicTypeElements();
		this.pEntityType = new EntityTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fi.tucs.entities.Entities".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	entities+=Entity*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' superType=[Entity])? '{'
	//	fields+=Field*
	//	statements+=Statement*
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Statement:
	//	PrintStatement | AssignmentStatement;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//AssignmentStatement:
	//	assignee=[Field] '=' expr=Expression;
	public AssignmentStatementElements getAssignmentStatementAccess() {
		return pAssignmentStatement;
	}
	
	public ParserRule getAssignmentStatementRule() {
		return getAssignmentStatementAccess().getRule();
	}
	
	//PrintStatement:
	//	'print' expr=Expression;
	public PrintStatementElements getPrintStatementAccess() {
		return pPrintStatement;
	}
	
	public ParserRule getPrintStatementRule() {
		return getPrintStatementAccess().getRule();
	}
	
	//Expression:
	//	{IntConstant} value=INT | {StringConstant} value=STRING | {BoolConstant} value=('on' | 'off') | {FieldRef}
	//	field=[Field];
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Field:
	//	type=FieldType name=ID;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//FieldType:
	//	BasicType | EntityType;
	public FieldTypeElements getFieldTypeAccess() {
		return pFieldType;
	}
	
	public ParserRule getFieldTypeRule() {
		return getFieldTypeAccess().getRule();
	}
	
	//BasicType:
	//	typeName=('text' | 'number' | 'toggle');
	public BasicTypeElements getBasicTypeAccess() {
		return pBasicType;
	}
	
	public ParserRule getBasicTypeRule() {
		return getBasicTypeAccess().getRule();
	}
	
	//EntityType:
	//	entity=[Entity];
	public EntityTypeElements getEntityTypeAccess() {
		return pEntityType;
	}
	
	public ParserRule getEntityTypeRule() {
		return getEntityTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
