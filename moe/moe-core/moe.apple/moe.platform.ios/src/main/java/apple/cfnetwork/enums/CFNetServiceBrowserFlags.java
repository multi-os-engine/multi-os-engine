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

package apple.cfnetwork.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * CFNetServiceBrowser flags
 * <p>
 * Discussion:
 * Result bit flags passed to CFNetServiceBrowserClientCallBack.
 */
@Generated
public final class CFNetServiceBrowserFlags {
    /**
     * Client will get another callback briefly and shouldn't do costly screen updates (or such).
     */
    @Generated @NUInt public static final long MoreComing = 0x0000000000000001L;
    /**
     * If off, the result is a service.
     */
    @Generated @NUInt public static final long IsDomain = 0x0000000000000002L;
    /**
     * The result domain is the default domain for the given domain browse type (registration or browse).
     */
    @Generated @NUInt public static final long IsDefault = 0x0000000000000004L;
    /**
     * Same as the previous but incorrectly named. Kept for compatibility.
     */
    @Deprecated @Generated @NUInt public static final long IsRegistrationDomain = 0x0000000000000004L;
    /**
     * The result item should be removed and not added.
     */
    @Generated @NUInt public static final long Remove = 0x0000000000000008L;

    @Generated
    private CFNetServiceBrowserFlags() {
    }
}
