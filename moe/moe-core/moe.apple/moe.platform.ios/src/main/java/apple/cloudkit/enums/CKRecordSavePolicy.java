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
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CKRecordSavePolicy
 * 
 * [@constant] CKRecordSaveIfServerRecordUnchanged
 * 
 * Locally-edited keys are sent to the server.
 * If the record on the server has been modified, fail the write and return an error. A CKShare's participants array is
 * always treated as @c CKRecordSaveIfServerRecordUnchanged, regardless of the @c savePolicy of the operation that
 * modifies the share.
 * 
 * [@constant] CKRecordSaveChangedKeys
 * 
 * Locally-edited keys are written to the server.
 * Any previously committed change to the server, for example by other devices, will be overwritten by the locally
 * changed value.
 * This policy does not compare the record change tag and therefore will never return @c CKErrorServerRecordChanged
 * 
 * [@constant] CKRecordSaveAllKeys
 * 
 * All local keys are written to the server.
 * Any previously committed change to the server, for example by other devices, will be overwritten by the local value.
 * Keys present only on the server remain unchanged.
 * There are two common ways in which a server record will contain keys not present locally:
 * 1 - Since you've fetched this record, another client has added a new key to the record.
 * 2 - The presence of @c desiredKeys on the fetch / query that returned this record meant that only a portion of the
 * record's keys were downloaded.
 * This policy does not compare the record change tag and therefore will never return @c CKErrorServerRecordChanged.
 * 
 * API-Since: 8.0
 */
@Generated
public final class CKRecordSavePolicy {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long IfServerRecordUnchanged = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ChangedKeys = 0x0000000000000001L;
    /**
     * Does not compare record change tags
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AllKeys = 0x0000000000000002L;

    @Generated
    private CKRecordSavePolicy() {
    }
}
