package fi.tucs.entities.typing

import fi.tucs.entities.entities.Expression
import fi.tucs.entities.entities.IntConstant
import fi.tucs.entities.entities.StringConstant
import fi.tucs.entities.entities.BoolConstant
import fi.tucs.entities.entities.FieldRef
import fi.tucs.entities.entities.Field
import fi.tucs.entities.entities.BasicType
import fi.tucs.entities.entities.EntityType

class ExpressionTypeComputer {
	
	public static val INTEGER_TYPE = new Integer_Type
	public static val STRING_TYPE = new String_Type
	public static val BOOLEAN_TYPE = new Boolean_Type

	def Expression_Type typeFor(Expression expr)	 {
		switch expr {
			IntConstant: INTEGER_TYPE
			StringConstant: STRING_TYPE
			BoolConstant: BOOLEAN_TYPE
			FieldRef: expr.field.typeFor
			default: null
		}
	}
	
	def Expression_Type typeFor(Field f) {
		if (f.type instanceof BasicType) {
			switch (f.type as BasicType).typeName {
				case 'text': return STRING_TYPE
				case 'number': return INTEGER_TYPE
				case 'toggle': return BOOLEAN_TYPE
			}
		}
		if (f.type instanceof EntityType) {
			new Entity_Type((f.type as EntityType).entity.name)
		}
	}
	
}
