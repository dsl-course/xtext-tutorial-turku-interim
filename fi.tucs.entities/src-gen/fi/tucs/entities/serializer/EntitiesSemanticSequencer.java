/*
 * generated by Xtext 2.12.0
 */
package fi.tucs.entities.serializer;

import com.google.inject.Inject;
import fi.tucs.entities.entities.AssignmentStatement;
import fi.tucs.entities.entities.BasicType;
import fi.tucs.entities.entities.BoolConstant;
import fi.tucs.entities.entities.EntitiesPackage;
import fi.tucs.entities.entities.Entity;
import fi.tucs.entities.entities.EntityType;
import fi.tucs.entities.entities.Field;
import fi.tucs.entities.entities.FieldRef;
import fi.tucs.entities.entities.IntConstant;
import fi.tucs.entities.entities.Model;
import fi.tucs.entities.entities.PrintStatement;
import fi.tucs.entities.entities.StringConstant;
import fi.tucs.entities.services.EntitiesGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EntitiesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EntitiesGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EntitiesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EntitiesPackage.ASSIGNMENT_STATEMENT:
				sequence_AssignmentStatement(context, (AssignmentStatement) semanticObject); 
				return; 
			case EntitiesPackage.BASIC_TYPE:
				sequence_BasicType(context, (BasicType) semanticObject); 
				return; 
			case EntitiesPackage.BOOL_CONSTANT:
				sequence_Expression(context, (BoolConstant) semanticObject); 
				return; 
			case EntitiesPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case EntitiesPackage.ENTITY_TYPE:
				sequence_EntityType(context, (EntityType) semanticObject); 
				return; 
			case EntitiesPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case EntitiesPackage.FIELD_REF:
				sequence_Expression(context, (FieldRef) semanticObject); 
				return; 
			case EntitiesPackage.INT_CONSTANT:
				sequence_Expression(context, (IntConstant) semanticObject); 
				return; 
			case EntitiesPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case EntitiesPackage.PRINT_STATEMENT:
				sequence_PrintStatement(context, (PrintStatement) semanticObject); 
				return; 
			case EntitiesPackage.STRING_CONSTANT:
				sequence_Expression(context, (StringConstant) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns AssignmentStatement
	 *     AssignmentStatement returns AssignmentStatement
	 *
	 * Constraint:
	 *     (assignee=[Field|ID] expr=Expression)
	 */
	protected void sequence_AssignmentStatement(ISerializationContext context, AssignmentStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.ASSIGNMENT_STATEMENT__ASSIGNEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.ASSIGNMENT_STATEMENT__ASSIGNEE));
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentStatementAccess().getAssigneeFieldIDTerminalRuleCall_0_0_1(), semanticObject.eGet(EntitiesPackage.Literals.ASSIGNMENT_STATEMENT__ASSIGNEE, false));
		feeder.accept(grammarAccess.getAssignmentStatementAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FieldType returns BasicType
	 *     BasicType returns BasicType
	 *
	 * Constraint:
	 *     (typeName='text' | typeName='number' | typeName='toggle')
	 */
	protected void sequence_BasicType(ISerializationContext context, BasicType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FieldType returns EntityType
	 *     EntityType returns EntityType
	 *
	 * Constraint:
	 *     entity=[Entity|ID]
	 */
	protected void sequence_EntityType(ISerializationContext context, EntityType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.ENTITY_TYPE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.ENTITY_TYPE__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1(), semanticObject.eGet(EntitiesPackage.Literals.ENTITY_TYPE__ENTITY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID superType=[Entity|ID]? fields+=Field* statements+=Statement*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BoolConstant
	 *
	 * Constraint:
	 *     (value='on' | value='off')
	 */
	protected void sequence_Expression(ISerializationContext context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FieldRef
	 *
	 * Constraint:
	 *     field=[Field|ID]
	 */
	protected void sequence_Expression(ISerializationContext context, FieldRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.FIELD_REF__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.FIELD_REF__FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getFieldFieldIDTerminalRuleCall_3_1_0_1(), semanticObject.eGet(EntitiesPackage.Literals.FIELD_REF__FIELD, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IntConstant
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Expression(ISerializationContext context, IntConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.INT_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringConstant
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Expression(ISerializationContext context, StringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.STRING_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (type=FieldType name=ID)
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.FIELD__TYPE));
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.FIELD__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     entities+=Entity+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns PrintStatement
	 *     PrintStatement returns PrintStatement
	 *
	 * Constraint:
	 *     expr=Expression
	 */
	protected void sequence_PrintStatement(ISerializationContext context, PrintStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.STATEMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrintStatementAccess().getExprExpressionParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
}