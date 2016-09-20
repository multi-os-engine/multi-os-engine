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
public final class NSDataWritingOptions {
    @Generated @NUInt public static final long DataWritingAtomic = 0x0000000000000001L;
    @Generated @NUInt public static final long DataWritingWithoutOverwriting = 0x0000000000000002L;
    @Generated @NUInt public static final long DataWritingFileProtectionNone = 0x0000000010000000L;
    @Generated @NUInt public static final long DataWritingFileProtectionComplete = 0x0000000020000000L;
    @Generated @NUInt public static final long DataWritingFileProtectionCompleteUnlessOpen = 0x0000000030000000L;
    @Generated @NUInt public static final long DataWritingFileProtectionCompleteUntilFirstUserAuthentication = 0x0000000040000000L;
    @Generated @NUInt public static final long DataWritingFileProtectionMask = 0x00000000F0000000L;
    @Generated @NUInt public static final long AtomicWrite = 0x0000000000000001L;

    @Generated
    private NSDataWritingOptions() {
    }
}
