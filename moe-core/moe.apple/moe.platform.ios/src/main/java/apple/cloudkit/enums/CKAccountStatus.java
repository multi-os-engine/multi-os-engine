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
 * [@enum] CKAccountStatus
 * [@constant] CKAccountStatusCouldNotDetermine An error occurred when getting the account status, consult the
 * corresponding NSError.
 * [@constant] CKAccountStatusAvailable The iCloud account credentials are available for this application
 * [@constant] CKAccountStatusRestricted Parental Controls / Device Management has denied access to iCloud account
 * credentials
 * [@constant] CKAccountStatusNoAccount No iCloud account is logged in on this device
 * [@constant] CKAccountStatusTemporarilyUnavailable An iCloud account is logged in but not ready. The user can be asked
 * to verify their
 * credentials in Settings app.
 * 
 * API-Since: 8.0
 */
@Generated
public final class CKAccountStatus {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long CouldNotDetermine = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Available = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NoAccount = 0x0000000000000003L;

    @Generated
    private CKAccountStatus() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long TemporarilyUnavailable = 0x0000000000000004L;
}
