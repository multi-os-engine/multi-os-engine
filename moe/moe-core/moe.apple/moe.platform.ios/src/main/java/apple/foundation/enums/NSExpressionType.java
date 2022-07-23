/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Expressions are the core of the predicate implementation. When expressionValueWithObject: is called, the expression
 * is evaluated, and a value returned which can then be handled by an operator. Expressions can be anything from
 * constants to method invocations. Scalars should be wrapped in appropriate NSValue classes.
 */
@Generated
public final class NSExpressionType {
    /**
     * Expression that always returns the same value
     */
    @Generated @NUInt public static final long ConstantValueExpressionType = 0x0000000000000000L;
    /**
     * Expression that always returns the parameter object itself
     */
    @Generated @NUInt public static final long EvaluatedObjectExpressionType = 0x0000000000000001L;
    /**
     * Expression that always returns whatever is stored at 'variable' in the bindings dictionary
     */
    @Generated @NUInt public static final long VariableExpressionType = 0x0000000000000002L;
    /**
     * Expression that returns something that can be used as a key path
     */
    @Generated @NUInt public static final long KeyPathExpressionType = 0x0000000000000003L;
    /**
     * Expression that returns the result of evaluating a symbol
     */
    @Generated @NUInt public static final long FunctionExpressionType = 0x0000000000000004L;
    /**
     * Expression that returns the result of doing a unionSet: on two expressions that evaluate to flat collections
     * (arrays or sets)
     */
    @Generated @NUInt public static final long UnionSetExpressionType = 0x0000000000000005L;
    /**
     * Expression that returns the result of doing an intersectSet: on two expressions that evaluate to flat collections
     * (arrays or sets)
     */
    @Generated @NUInt public static final long IntersectSetExpressionType = 0x0000000000000006L;
    /**
     * Expression that returns the result of doing a minusSet: on two expressions that evaluate to flat collections
     * (arrays or sets)
     */
    @Generated @NUInt public static final long MinusSetExpressionType = 0x0000000000000007L;
    @Generated @NUInt public static final long SubqueryExpressionType = 0x000000000000000DL;
    @Generated @NUInt public static final long AggregateExpressionType = 0x000000000000000EL;
    @Generated @NUInt public static final long AnyKeyExpressionType = 0x000000000000000FL;
    @Generated @NUInt public static final long BlockExpressionType = 0x0000000000000013L;
    @Generated @NUInt public static final long ConditionalExpressionType = 0x0000000000000014L;

    @Generated
    private NSExpressionType() {
    }
}
