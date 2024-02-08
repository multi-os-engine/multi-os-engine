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
public final class CKApplicationPermissions {
    /**
     * Allows the user's record in CloudKit to be discoverable via the user's email address
     * 
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: No longer supported. Please see Sharing CloudKit Data with Other iCloud Users.
     */
    @Deprecated @Generated @NUInt public static final long CKApplicationPermissionUserDiscoverability = 0x0000000000000001L;

    @Generated
    private CKApplicationPermissions() {
    }
}
