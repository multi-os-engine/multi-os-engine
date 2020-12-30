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
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSByteCountFormatterCountStyle {
    /**
     * Specifies display of file or storage byte counts. The actual behavior for this is platform-specific; on OS X 10.8, this uses the decimal style, but that may change over time.
     */
    @Generated @NInt public static final long File = 0x0000000000000000L;
    /**
     * Specifies display of memory byte counts. The actual behavior for this is platform-specific; on OS X 10.8, this uses the binary style, but that may change over time.
     */
    @Generated @NInt public static final long Memory = 0x0000000000000001L;
    /**
     * 1000 bytes are shown as 1 KB
     */
    @Generated @NInt public static final long Decimal = 0x0000000000000002L;
    /**
     * 1024 bytes are shown as 1 KB
     */
    @Generated @NInt public static final long Binary = 0x0000000000000003L;

    @Generated
    private NSByteCountFormatterCountStyle() {
    }
}
