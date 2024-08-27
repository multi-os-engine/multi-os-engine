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

package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] CKReferenceAction
 * [@constant] CKReferenceActionNone When the referred record is deleted, this record is unchanged, and has a dangling
 * pointer
 * [@constant] CKReferenceActionDeleteSelf When the referred record is deleted then this record is also deleted
 * 
 * API-Since: 8.0
 */
@Generated
public final class CKReferenceAction {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long DeleteSelf = 0x0000000000000001L;

    @Generated
    private CKReferenceAction() {
    }
}
