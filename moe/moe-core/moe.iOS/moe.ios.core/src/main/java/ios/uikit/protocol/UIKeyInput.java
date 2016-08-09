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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIKeyInput")
public interface UIKeyInput extends UITextInputTraits {
	/**
	 * deleteBackward</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKeyInput_Protocol/index.html#//apple_ref/occ/intfm/UIKeyInput/deleteBackward">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deleteBackward")
	void deleteBackward();

	/**
	 * hasText</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKeyInput_Protocol/index.html#//apple_ref/occ/intfm/UIKeyInput/hasText">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasText")
	boolean hasText();

	/**
	 * insertText:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIKeyInput_Protocol/index.html#//apple_ref/occ/intfm/UIKeyInput/insertText:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertText:")
	void insertText(String text);
}
