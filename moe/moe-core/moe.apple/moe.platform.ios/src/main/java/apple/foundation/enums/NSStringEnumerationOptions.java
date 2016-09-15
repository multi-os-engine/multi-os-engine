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
public final class NSStringEnumerationOptions {
    @Generated
    private NSStringEnumerationOptions() {
    }

    @Generated @NUInt public static final long ByLines = 0x0000000000000000L;
    @Generated @NUInt public static final long ByParagraphs = 0x0000000000000001L;
    @Generated @NUInt public static final long ByComposedCharacterSequences = 0x0000000000000002L;
    @Generated @NUInt public static final long ByWords = 0x0000000000000003L;
    @Generated @NUInt public static final long BySentences = 0x0000000000000004L;
    @Generated @NUInt public static final long Reverse = 0x0000000000000100L;
    @Generated @NUInt public static final long SubstringNotRequired = 0x0000000000000200L;
    @Generated @NUInt public static final long Localized = 0x0000000000000400L;
}
