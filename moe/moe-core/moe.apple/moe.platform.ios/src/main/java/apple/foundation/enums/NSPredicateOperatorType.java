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
 * Type basic set of operators defined. Most are obvious; NSCustomSelectorPredicateOperatorType allows a developer to create an operator which uses the custom selector specified in the constructor to do the evaluation.
 */
@Generated
public final class NSPredicateOperatorType {
    /**
     * compare: returns NSOrderedAscending
     */
    @Generated @NUInt public static final long LessThanPredicateOperatorType = 0x0000000000000000L;
    /**
     * compare: returns NSOrderedAscending || NSOrderedSame
     */
    @Generated @NUInt public static final long LessThanOrEqualToPredicateOperatorType = 0x0000000000000001L;
    /**
     * compare: returns NSOrderedDescending
     */
    @Generated @NUInt public static final long GreaterThanPredicateOperatorType = 0x0000000000000002L;
    /**
     * compare: returns NSOrderedDescending || NSOrderedSame
     */
    @Generated @NUInt public static final long GreaterThanOrEqualToPredicateOperatorType = 0x0000000000000003L;
    /**
     * isEqual: returns true
     */
    @Generated @NUInt public static final long EqualToPredicateOperatorType = 0x0000000000000004L;
    /**
     * isEqual: returns false
     */
    @Generated @NUInt public static final long NotEqualToPredicateOperatorType = 0x0000000000000005L;
    @Generated @NUInt public static final long MatchesPredicateOperatorType = 0x0000000000000006L;
    @Generated @NUInt public static final long LikePredicateOperatorType = 0x0000000000000007L;
    @Generated @NUInt public static final long BeginsWithPredicateOperatorType = 0x0000000000000008L;
    @Generated @NUInt public static final long EndsWithPredicateOperatorType = 0x0000000000000009L;
    /**
     * rhs contains lhs returns true
     */
    @Generated @NUInt public static final long InPredicateOperatorType = 0x000000000000000AL;
    @Generated @NUInt public static final long CustomSelectorPredicateOperatorType = 0x000000000000000BL;
    /**
     * lhs contains rhs returns true
     */
    @Generated @NUInt public static final long ContainsPredicateOperatorType = 0x0000000000000063L;
    @Generated @NUInt public static final long BetweenPredicateOperatorType = 0x0000000000000064L;

    @Generated
    private NSPredicateOperatorType() {
    }
}
