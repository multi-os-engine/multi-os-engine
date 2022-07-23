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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class CFStringBuiltInEncodings {
    @Generated public static final int MacRoman = 0x00000000;
    /**
     * ANSI codepage 1252
     */
    @Generated public static final int WindowsLatin1 = 0x00000500;
    /**
     * ISO 8859-1
     */
    @Generated public static final int ISOLatin1 = 0x00000201;
    /**
     * NextStep encoding
     */
    @Generated public static final int NextStepLatin = 0x00000B01;
    /**
     * 0..127 (in creating CFString, values greater than 0x7F are treated as corresponding Unicode value)
     */
    @Generated public static final int ASCII = 0x00000600;
    /**
     * kTextEncodingUnicodeDefault + kTextEncodingDefaultFormat (aka kUnicode16BitFormat)
     */
    @Generated public static final int Unicode = 0x00000100;
    /**
     * kTextEncodingUnicodeDefault + kUnicodeUTF8Format
     */
    @Generated public static final int UTF8 = 0x08000100;
    /**
     * 7bit Unicode variants used by Cocoa & Java
     */
    @Generated public static final int NonLossyASCII = 0x00000BFF;
    /**
     * kTextEncodingUnicodeDefault + kUnicodeUTF16Format (alias of kCFStringEncodingUnicode)
     */
    @Generated public static final int UTF16 = 0x00000100;
    /**
     * kTextEncodingUnicodeDefault + kUnicodeUTF16BEFormat
     */
    @Generated public static final int UTF16BE = 0x10000100;
    /**
     * kTextEncodingUnicodeDefault + kUnicodeUTF16LEFormat
     */
    @Generated public static final int UTF16LE = 0x14000100;
    /**
     * kTextEncodingUnicodeDefault + kUnicodeUTF32Format
     */
    @Generated public static final int UTF32 = 0x0C000100;
    /**
     * kTextEncodingUnicodeDefault + kUnicodeUTF32BEFormat
     */
    @Generated public static final int UTF32BE = 0x18000100;
    /**
     * kTextEncodingUnicodeDefault + kUnicodeUTF32LEFormat
     */
    @Generated public static final int UTF32LE = 0x1C000100;

    @Generated
    private CFStringBuiltInEncodings() {
    }
}
