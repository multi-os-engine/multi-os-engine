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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class UICloudSharingPermissionOptions {
    /**
     * Allow the user to configure the share with the standard set of options
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Standard = 0x0000000000000000L;
    /**
     * The user is allowed to share publicly
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long AllowPublic = 0x0000000000000001L;
    /**
     * The user is allowed to share privately
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long AllowPrivate = 0x0000000000000002L;
    /**
     * The user is allowed to grant participants read-only permissions
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long AllowReadOnly = 0x0000000000000004L;
    /**
     * The user is allowed to grant participants read/write permissions
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long AllowReadWrite = 0x0000000000000008L;

    @Generated
    private UICloudSharingPermissionOptions() {
    }
}
