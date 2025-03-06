package apple.javascriptcore.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] JSRelationCondition
 * 
 * A constant identifying the type of JavaScript relation condition.
 * [@constant] kJSRelationConditionUndefined Fail to compare two operands.
 * [@constant] kJSRelationConditionEqual Two operands have equivalent values.
 * [@constant] kJSRelationConditionGreaterThan The left operand is greater than the right operand.
 * [@constant] kJSRelationConditionLessThan The left operand is less than the right operand.
 * 
 * API-Since: 18.0
 */
@Generated
public final class JSRelationCondition {
    @Generated
    private JSRelationCondition() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated public static final int Undefined = 0x00000000;
    /**
     * API-Since: 18.0
     */
    @Generated public static final int Equal = 0x00000001;
    /**
     * API-Since: 18.0
     */
    @Generated public static final int GreaterThan = 0x00000002;
    /**
     * API-Since: 18.0
     */
    @Generated public static final int LessThan = 0x00000003;
}