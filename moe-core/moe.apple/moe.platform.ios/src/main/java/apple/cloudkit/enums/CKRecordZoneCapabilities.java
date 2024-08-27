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
 * API-Since: 8.0
 */
@Generated
public final class CKRecordZoneCapabilities {
    /**
     * This zone supports CKFetchRecordChangesOperation
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long FetchChanges = 0x0000000000000001L;
    /**
     * Batched changes to this zone happen atomically
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Atomic = 0x0000000000000002L;
    /**
     * Records in this zone can be shared
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Sharing = 0x0000000000000004L;

    @Generated
    private CKRecordZoneCapabilities() {
    }

    /**
     * This zone supports a single CKShare record that shares all records in the zone
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long ZoneWideSharing = 0x0000000000000008L;
}
