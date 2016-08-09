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

package ios.uikit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextInputTraits")
public interface UITextInputTraits {
	/**
	 * autocapitalizationType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/autocapitalizationType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("autocapitalizationType")
	@NInt
	default long autocapitalizationType() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * autocorrectionType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/autocorrectionType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("autocorrectionType")
	@NInt
	default long autocorrectionType() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * enablesReturnKeyAutomatically</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/enablesReturnKeyAutomatically">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("enablesReturnKeyAutomatically")
	default boolean enablesReturnKeyAutomatically() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * secureTextEntry</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/secureTextEntry">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("isSecureTextEntry")
	default boolean isSecureTextEntry() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * keyboardAppearance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/keyboardAppearance">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("keyboardAppearance")
	@NInt
	default long keyboardAppearance() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * keyboardType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/keyboardType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("keyboardType")
	@NInt
	default long keyboardType() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * returnKeyType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/returnKeyType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("returnKeyType")
	@NInt
	default long returnKeyType() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * autocapitalizationType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/autocapitalizationType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("setAutocapitalizationType:")
	default void setAutocapitalizationType(@NInt long value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * autocorrectionType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/autocorrectionType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("setAutocorrectionType:")
	default void setAutocorrectionType(@NInt long value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * enablesReturnKeyAutomatically</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/enablesReturnKeyAutomatically">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("setEnablesReturnKeyAutomatically:")
	default void setEnablesReturnKeyAutomatically(boolean value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * keyboardAppearance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/keyboardAppearance">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("setKeyboardAppearance:")
	default void setKeyboardAppearance(@NInt long value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * keyboardType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/keyboardType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("setKeyboardType:")
	default void setKeyboardType(@NInt long value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * returnKeyType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/returnKeyType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("setReturnKeyType:")
	default void setReturnKeyType(@NInt long value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * secureTextEntry</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/secureTextEntry">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("setSecureTextEntry:")
	default void setSecureTextEntry(boolean value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * spellCheckingType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/spellCheckingType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("setSpellCheckingType:")
	default void setSpellCheckingType(@NInt long value) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * spellCheckingType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UITextInputTraits_Protocol/index.html#//apple_ref/occ/intfp/UITextInputTraits/spellCheckingType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("spellCheckingType")
	@NInt
	default long spellCheckingType() {
		throw new java.lang.UnsupportedOperationException();
	}
}
