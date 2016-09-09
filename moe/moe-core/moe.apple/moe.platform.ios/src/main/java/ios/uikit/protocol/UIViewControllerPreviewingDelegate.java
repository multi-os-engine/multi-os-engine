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


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.coregraphics.struct.CGPoint;
import ios.uikit.UIViewController;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerPreviewingDelegate")
public interface UIViewControllerPreviewingDelegate {
	/**
	 * previewingContext:commitViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerPreviewingDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerPreviewingDelegate/previewingContext:commitViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("previewingContext:commitViewController:")
	void previewingContextCommitViewController(@Mapped(ObjCObjectMapper.class) Object previewingContext,
			UIViewController viewControllerToCommit);

	/**
	 * previewingContext:viewControllerForLocation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewControllerPreviewingDelegate_Protocol/index.html#//apple_ref/occ/intfm/UIViewControllerPreviewingDelegate/previewingContext:viewControllerForLocation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("previewingContext:viewControllerForLocation:")
	UIViewController previewingContextViewControllerForLocation(
			@Mapped(ObjCObjectMapper.class) Object previewingContext, @ByValue CGPoint location);
}
