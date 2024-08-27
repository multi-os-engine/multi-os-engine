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

@Generated
public final class NSSearchPathDomainMask {
    /**
     * user's home directory --- place to install user's personal items (~)
     */
    @Generated @NUInt public static final long UserDomainMask = 0x0000000000000001L;
    /**
     * local to the current machine --- place to install items available to everyone on this machine (/Library)
     */
    @Generated @NUInt public static final long LocalDomainMask = 0x0000000000000002L;
    /**
     * publicly available location in the local area network --- place to install items available on the network
     * (/Network)
     */
    @Generated @NUInt public static final long NetworkDomainMask = 0x0000000000000004L;
    /**
     * provided by Apple, unmodifiable (/System)
     */
    @Generated @NUInt public static final long SystemDomainMask = 0x0000000000000008L;
    /**
     * all domains: all of the above and future items
     */
    @Generated @NUInt public static final long AllDomainsMask = 0x000000000000FFFFL;

    @Generated
    private NSSearchPathDomainMask() {
    }
}
