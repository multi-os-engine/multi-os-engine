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
 * Possible kinds of set mutation for use with -willChangeValueForKey:withSetMutation:usingObjects: and
 * -didChangeValueForKey:withSetMutation:usingObjects:. Their semantics correspond exactly to NSMutableSet's -unionSet:,
 * -minusSet:, -intersectSet:, and -setSet: method, respectively.
 */
@Generated
public final class NSKeyValueSetMutationKind {
    @Generated @NUInt public static final long UnionSetMutation = 0x0000000000000001L;
    @Generated @NUInt public static final long MinusSetMutation = 0x0000000000000002L;
    @Generated @NUInt public static final long IntersectSetMutation = 0x0000000000000003L;
    @Generated @NUInt public static final long SetSetMutation = 0x0000000000000004L;

    @Generated
    private NSKeyValueSetMutationKind() {
    }
}
