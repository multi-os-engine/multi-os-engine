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

/**
 * Options arguments of type NSLinguisticTaggerOptions may include the following flags, which allow clients interested only in certain general types of tokens to specify that tokens of other types should be omitted from the returned results.
 */
@Generated
public final class NSLinguisticTaggerOptions {
    /**
     * Omit tokens of type NSLinguisticTagWord.
     */
    @Generated @NUInt public static final long OmitWords = 0x0000000000000001L;
    /**
     * Omit tokens of type NSLinguisticTagPunctuation.
     */
    @Generated @NUInt public static final long OmitPunctuation = 0x0000000000000002L;
    /**
     * Omit tokens of type NSLinguisticTagWhitespace.
     */
    @Generated @NUInt public static final long OmitWhitespace = 0x0000000000000004L;
    /**
     * Omit tokens of type NSLinguisticTagOther.
     */
    @Generated @NUInt public static final long OmitOther = 0x0000000000000008L;
    /**
     * Join tokens of tag scheme NSLinguisticTagSchemeNameType.
     */
    @Generated @NUInt public static final long JoinNames = 0x0000000000000010L;

    @Generated
    private NSLinguisticTaggerOptions() {
    }
}
