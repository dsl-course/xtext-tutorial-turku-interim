package fi.tucs.entities.typing;

import fi.tucs.entities.entities.BasicType;
import fi.tucs.entities.entities.BoolConstant;
import fi.tucs.entities.entities.EntityType;
import fi.tucs.entities.entities.Expression;
import fi.tucs.entities.entities.Field;
import fi.tucs.entities.entities.FieldRef;
import fi.tucs.entities.entities.FieldType;
import fi.tucs.entities.entities.IntConstant;
import fi.tucs.entities.entities.StringConstant;
import fi.tucs.entities.typing.Boolean_Type;
import fi.tucs.entities.typing.Entity_Type;
import fi.tucs.entities.typing.Expression_Type;
import fi.tucs.entities.typing.Integer_Type;
import fi.tucs.entities.typing.String_Type;

@SuppressWarnings("all")
public class ExpressionTypeComputer {
  public final static Integer_Type INTEGER_TYPE = new Integer_Type();
  
  public final static String_Type STRING_TYPE = new String_Type();
  
  public final static Boolean_Type BOOLEAN_TYPE = new Boolean_Type();
  
  public Expression_Type typeFor(final Expression expr) {
    Expression_Type _switchResult = null;
    boolean _matched = false;
    if (expr instanceof IntConstant) {
      _matched=true;
      _switchResult = ExpressionTypeComputer.INTEGER_TYPE;
    }
    if (!_matched) {
      if (expr instanceof StringConstant) {
        _matched=true;
        _switchResult = ExpressionTypeComputer.STRING_TYPE;
      }
    }
    if (!_matched) {
      if (expr instanceof BoolConstant) {
        _matched=true;
        _switchResult = ExpressionTypeComputer.BOOLEAN_TYPE;
      }
    }
    if (!_matched) {
      if (expr instanceof FieldRef) {
        _matched=true;
        _switchResult = this.typeFor(((FieldRef)expr).getField());
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  public Expression_Type typeFor(final Field f) {
    Entity_Type _xblockexpression = null;
    {
      FieldType _type = f.getType();
      if ((_type instanceof BasicType)) {
        FieldType _type_1 = f.getType();
        String _typeName = ((BasicType) _type_1).getTypeName();
        if (_typeName != null) {
          switch (_typeName) {
            case "text":
              return ExpressionTypeComputer.STRING_TYPE;
            case "number":
              return ExpressionTypeComputer.INTEGER_TYPE;
            case "toggle":
              return ExpressionTypeComputer.BOOLEAN_TYPE;
          }
        }
      }
      Entity_Type _xifexpression = null;
      FieldType _type_2 = f.getType();
      if ((_type_2 instanceof EntityType)) {
        FieldType _type_3 = f.getType();
        String _name = ((EntityType) _type_3).getEntity().getName();
        _xifexpression = new Entity_Type(_name);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
