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

package ios.replaykit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSSet;
import ios.replaykit.RPPreviewViewController;

@Generated
@Library("ReplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("RPPreviewViewControllerDelegate")
public interface RPPreviewViewControllerDelegate {
	/**
	 * previewController:didFinishWithActivityTypes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ReplayKit/Reference/RPPreviewViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/RPPreviewViewControllerDelegate/previewController:didFinishWithActivityTypes:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("previewController:didFinishWithActivityTypes:")
	default void previewControllerDidFinishWithActivityTypes(RPPreviewViewController previewController,
			NSSet<String> activityTypes) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * previewControllerDidFinish:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ReplayKit/Reference/RPPreviewViewControllerDelegate_Ref/index.html#//apple_ref/occ/intfm/RPPreviewViewControllerDelegate/previewControllerDidFinish:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("previewControllerDidFinish:")
	default void previewControllerDidFinish(RPPreviewViewController previewController) {
		throw new java.lang.UnsupportedOperationException();
	}
}
