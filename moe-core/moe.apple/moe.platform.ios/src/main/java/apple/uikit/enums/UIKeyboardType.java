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
import org.moe.natj.general.ann.NInt;

/**
 * UIKeyboardType
 * 
 * Requests that a particular keyboard type be displayed when a text widget
 * becomes first responder.
 * Note: Some keyboard/input methods types may not support every variant.
 * In such cases, the input method will make a best effort to find a close
 * match to the requested type (e.g. displaying UIKeyboardTypeNumbersAndPunctuation
 * type if UIKeyboardTypeNumberPad is not supported).
 */
@Generated
public final class UIKeyboardType {
    /**
     * Default type for the current input method.
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Displays a keyboard which can enter ASCII characters
     */
    @Generated @NInt public static final long ASCIICapable = 0x0000000000000001L;
    /**
     * Numbers and assorted punctuation.
     */
    @Generated @NInt public static final long NumbersAndPunctuation = 0x0000000000000002L;
    /**
     * A type optimized for URL entry (shows . / .com prominently).
     */
    @Generated @NInt public static final long URL = 0x0000000000000003L;
    /**
     * A number pad with locale-appropriate digits (0-9, ۰-۹, ०-९, etc.). Suitable for PIN entry.
     */
    @Generated @NInt public static final long NumberPad = 0x0000000000000004L;
    /**
     * A phone pad (1-9, *, 0, #, with letters under the numbers).
     */
    @Generated @NInt public static final long PhonePad = 0x0000000000000005L;
    /**
     * A type optimized for entering a person's name or phone number.
     */
    @Generated @NInt public static final long NamePhonePad = 0x0000000000000006L;
    /**
     * A type optimized for multiple email address entry (shows space @ . prominently).
     */
    @Generated @NInt public static final long EmailAddress = 0x0000000000000007L;
    /**
     * A number pad with a decimal point.
     * 
     * API-Since: 4.1
     */
    @Generated @NInt public static final long DecimalPad = 0x0000000000000008L;
    /**
     * A type optimized for twitter text entry (easy access to @ #)
     * 
     * API-Since: 5.0
     */
    @Generated @NInt public static final long Twitter = 0x0000000000000009L;
    /**
     * A default keyboard type with URL-oriented addition (shows space . prominently).
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long WebSearch = 0x000000000000000AL;
    /**
     * A number pad (0-9) that will always be ASCII digits.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ASCIICapableNumberPad = 0x000000000000000BL;
    /**
     * Deprecated
     */
    @Generated @NInt public static final long Alphabet = 0x0000000000000001L;

    @Generated
    private UIKeyboardType() {
    }
}
