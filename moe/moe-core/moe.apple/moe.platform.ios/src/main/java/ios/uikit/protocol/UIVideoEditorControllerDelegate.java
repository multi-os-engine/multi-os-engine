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

import ios.foundation.NSError;
import ios.uikit.UIVideoEditorController;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIVideoEditorControllerDelegate")
public interface UIVideoEditorControllerDelegate {
	/**
	 * videoEditorController:didFailWithError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIVideoEditorControllerDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/UIVideoEditorControllerDelegate/videoEditorController:didFailWithError:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("videoEditorController:didFailWithError:")
	default void videoEditorControllerDidFailWithError(
			UIVideoEditorController editor, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * videoEditorController:didSaveEditedVideoToPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIVideoEditorControllerDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/UIVideoEditorControllerDelegate/videoEditorController:didSaveEditedVideoToPath:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("videoEditorController:didSaveEditedVideoToPath:")
	default void videoEditorControllerDidSaveEditedVideoToPath(
			UIVideoEditorController editor, String editedVideoPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * videoEditorControllerDidCancel:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIVideoEditorControllerDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/UIVideoEditorControllerDelegate/videoEditorControllerDidCancel:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("videoEditorControllerDidCancel:")
	default void videoEditorControllerDidCancel(
			UIVideoEditorController editor) {
		throw new java.lang.UnsupportedOperationException();
	}
}
