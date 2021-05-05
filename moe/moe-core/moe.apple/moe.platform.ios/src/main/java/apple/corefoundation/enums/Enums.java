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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class Enums {
    @Generated @NUInt public static final long kCFFileDescriptorReadCallBack = 0x0000000000000001L;
    @Generated @NUInt public static final long kCFFileDescriptorWriteCallBack = 0x0000000000000002L;
    /**
     * Tokenization Unit
     * Use one of tokenization unit options with CFStringTokenizerCreate to
     * specify how the string should be tokenized. 
     * kCFStringTokenizerUnitWord doesn't return space between words as a token.
     */
    @Generated @NUInt public static final long kCFStringTokenizerUnitWord = 0x0000000000000000L;
    /**
     * Tokenization Unit
     * Use one of tokenization unit options with CFStringTokenizerCreate to
     * specify how the string should be tokenized. 
     * kCFStringTokenizerUnitWord doesn't return space between words as a token.
     */
    @Generated @NUInt public static final long kCFStringTokenizerUnitSentence = 0x0000000000000001L;
    /**
     * Tokenization Unit
     * Use one of tokenization unit options with CFStringTokenizerCreate to
     * specify how the string should be tokenized. 
     * kCFStringTokenizerUnitWord doesn't return space between words as a token.
     */
    @Generated @NUInt public static final long kCFStringTokenizerUnitParagraph = 0x0000000000000002L;
    /**
     * Tokenization Unit
     * Use one of tokenization unit options with CFStringTokenizerCreate to
     * specify how the string should be tokenized. 
     * kCFStringTokenizerUnitWord doesn't return space between words as a token.
     */
    @Generated @NUInt public static final long kCFStringTokenizerUnitLineBreak = 0x0000000000000003L;
    /**
     * kCFStringTokenizerUnitWordBoundary can be used in double click detection
     * and whole word search. It is locale sensitive. If the locale parameter of
     * CFStringTokenizerCreate is NULL, default locale is used.
     * kCFStringTokenizerUnitWordBoundary returns space between words as a token. 
     */
    @Generated @NUInt public static final long kCFStringTokenizerUnitWordBoundary = 0x0000000000000004L;
    /**
     * Attribute Specifier
     * Use attribute specifier to tell tokenizer to prepare the specified attribute
     * when it tokenizes the given string. The attribute value can be retrieved by
     * calling CFStringTokenizerCopyCurrentTokenAttribute with one of the attribute
     * option. 
     * Latin Transcription. Used with kCFStringTokenizerUnitWord or
     * kCFStringTokenizerUnitWordBoundary 
     */
    @Generated @NUInt public static final long kCFStringTokenizerAttributeLatinTranscription = 0x0000000000010000L;
    /**
     * Language in BCP 47 string. Used with kCFStringTokenizerUnitSentence
     * or kCFStringTokenizerUnitParagraph. 
     */
    @Generated @NUInt public static final long kCFStringTokenizerAttributeLanguage = 0x0000000000020000L;
    /**
     * Error parsing a property list
     */
    @Generated @NInt public static final long kCFPropertyListReadCorruptError = 0x0000000000000F00L;
    /**
     * The version number in the property list is unknown
     */
    @Generated @NInt public static final long kCFPropertyListReadUnknownVersionError = 0x0000000000000F01L;
    /**
     * Stream error reading a property list
     */
    @Generated @NInt public static final long kCFPropertyListReadStreamError = 0x0000000000000F02L;
    /**
     * Stream error writing a property list
     */
    @Generated @NInt public static final long kCFPropertyListWriteStreamError = 0x0000000000000F0BL;
    @Generated @NUInt public static final long kCFNotificationDeliverImmediately = 0x0000000000000001L;
    @Generated @NUInt public static final long kCFNotificationPostToAllSessions = 0x0000000000000002L;
    @Generated @NUInt public static final long kCFSocketAutomaticallyReenableReadCallBack = 0x0000000000000001L;
    @Generated @NUInt public static final long kCFSocketAutomaticallyReenableAcceptCallBack = 0x0000000000000002L;
    @Generated @NUInt public static final long kCFSocketAutomaticallyReenableDataCallBack = 0x0000000000000003L;
    @Generated @NUInt public static final long kCFSocketAutomaticallyReenableWriteCallBack = 0x0000000000000008L;
    @Generated @NUInt public static final long kCFSocketLeaveErrors = 0x0000000000000040L;
    @Generated @NUInt public static final long kCFSocketCloseOnInvalidate = 0x0000000000000080L;
    /**
     * option for adding
     */
    @Generated @NUInt public static final long kCFCalendarComponentsWrap = 0x0000000000000001L;
    @Generated public static final int kCFBundleExecutableArchitectureI386 = 0x00000007;
    @Generated public static final int kCFBundleExecutableArchitecturePPC = 0x00000012;
    @Generated public static final int kCFBundleExecutableArchitectureX86_64 = 0x01000007;
    @Generated public static final int kCFBundleExecutableArchitecturePPC64 = 0x01000012;
    @Generated public static final int kCFMessagePortSuccess = 0x00000000;
    @Generated public static final int kCFMessagePortSendTimeout = 0xFFFFFFFF;
    @Generated public static final int kCFMessagePortReceiveTimeout = 0xFFFFFFFE;
    @Generated public static final int kCFMessagePortIsInvalid = 0xFFFFFFFD;
    @Generated public static final int kCFMessagePortTransportError = 0xFFFFFFFC;
    @Generated public static final int kCFMessagePortBecameInvalidError = 0xFFFFFFFB;

    @Generated
    private Enums() {
    }

    @Generated public static final int kCFBundleExecutableArchitectureARM64 = 0x0100000C;
}
