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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSDictionary;
import ios.uikit.UIImage;
import ios.uikit.UIImagePickerController;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIImagePickerControllerDelegate")
public interface UIImagePickerControllerDelegate {
	/**
	 * imagePickerController:didFinishPickingImage:editingInfo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImagePickerControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIImagePickerControllerDelegate/imagePickerController:didFinishPickingImage:editingInfo:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("imagePickerController:didFinishPickingImage:editingInfo:")
	default void imagePickerControllerDidFinishPickingImageEditingInfo(
			UIImagePickerController picker, UIImage image,
			NSDictionary<String, ?> editingInfo) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * imagePickerController:didFinishPickingMediaWithInfo:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImagePickerControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIImagePickerControllerDelegate/imagePickerController:didFinishPickingMediaWithInfo:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("imagePickerController:didFinishPickingMediaWithInfo:")
	default void imagePickerControllerDidFinishPickingMediaWithInfo(
			UIImagePickerController picker, NSDictionary<String, ?> info) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * imagePickerControllerDidCancel:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImagePickerControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIImagePickerControllerDelegate/imagePickerControllerDidCancel:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("imagePickerControllerDidCancel:")
	default void imagePickerControllerDidCancel(
			UIImagePickerController picker) {
		throw new java.lang.UnsupportedOperationException();
	}
}
