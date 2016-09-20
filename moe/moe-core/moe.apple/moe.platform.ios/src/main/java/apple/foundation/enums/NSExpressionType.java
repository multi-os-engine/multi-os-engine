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

@Generated
public final class NSExpressionType {
    @Generated @NUInt public static final long ConstantValueExpressionType = 0x0000000000000000L;
    @Generated @NUInt public static final long EvaluatedObjectExpressionType = 0x0000000000000001L;
    @Generated @NUInt public static final long VariableExpressionType = 0x0000000000000002L;
    @Generated @NUInt public static final long KeyPathExpressionType = 0x0000000000000003L;
    @Generated @NUInt public static final long FunctionExpressionType = 0x0000000000000004L;
    @Generated @NUInt public static final long UnionSetExpressionType = 0x0000000000000005L;
    @Generated @NUInt public static final long IntersectSetExpressionType = 0x0000000000000006L;
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
