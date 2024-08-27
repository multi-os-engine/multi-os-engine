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
 * Locally edited keys are sent to the server, updating the record if the server record has not been modified. This is
 * the default and recommended save policy for regular use.
 * This policy compares the record change tag with the server record, and may return @c CKErrorServerRecordChanged if
 * the server record has been modified, for example by another device.
 * Note: A @c CKShare record is always treated as @c CKRecordSaveIfServerRecordUnchanged, regardless of the @c
 * savePolicy of the operation that modifies the share.
 * 
 * [@constant] CKRecordSaveChangedKeys
 * 
 * Locally edited keys are written to the server, updating the record even if the server record has been modified.
 * Note: This policy should be used with care, as it can overwrite changes made by other devices.
 * Any previously committed change to the server, for example by other devices, will always be overwritten by the
 * locally changed value.
 * Note: A @c CKShare record is always treated as @c CKRecordSaveIfServerRecordUnchanged, regardless of the @c
 * savePolicy of the operation that modifies the share.
 * For non-CKShare records, this policy does not compare the record change tag and therefore will not return @c
 * CKErrorServerRecordChanged
 * 
 * [@constant] CKRecordSaveAllKeys
 * 
 * All local keys are written to the server, updating the record even if the server record has been modified.
 * Note: This policy should be used with care. Any previously committed change to the server, for example by other
 * devices, will be overwritten by the local value.
 * Keys present only on the server remain unchanged.
 * There are two common ways in which a server record will contain keys not present locally:
 * 1 - Another client may have added a new key to the record since it was fetched.
 * 2 - If @c desiredKeys was used with the fetch / query that returned this record, only a portion of the record's keys
 * may have been downloaded.
 * Note: A @c CKShare record is always treated as @c CKRecordSaveIfServerRecordUnchanged, regardless of the @c
 * savePolicy of the operation that modifies the share.
 * For non-CKShare records, this policy does not compare the record change tag and therefore will not return @c
 * CKErrorServerRecordChanged
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
