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

package ios.quicklook.protocol;


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGRect;
import ios.foundation.NSURL;
import ios.quicklook.QLPreviewController;
import ios.uikit.UIImage;
import ios.uikit.UIView;

@Generated
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("QLPreviewControllerDelegate")
public interface QLPreviewControllerDelegate {
	/**
	 * previewController:frameForPreviewItem:inSourceView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/QLPreviewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/QLPreviewControllerDelegate/previewController:frameForPreviewItem:inSourceView:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("previewController:frameForPreviewItem:inSourceView:")
	@ByValue
	default CGRect previewControllerFrameForPreviewItemInSourceView(
			QLPreviewController controller,
			@Mapped(ObjCObjectMapper.class) Object item, Ptr<UIView> view) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * previewController:shouldOpenURL:forPreviewItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/QLPreviewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/QLPreviewControllerDelegate/previewController:shouldOpenURL:forPreviewItem:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("previewController:shouldOpenURL:forPreviewItem:")
	default boolean previewControllerShouldOpenURLForPreviewItem(
			QLPreviewController controller, NSURL url,
			@Mapped(ObjCObjectMapper.class) Object item) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * previewController:transitionImageForPreviewItem:contentRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/QLPreviewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/QLPreviewControllerDelegate/previewController:transitionImageForPreviewItem:contentRect:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("previewController:transitionImageForPreviewItem:contentRect:")
	default UIImage previewControllerTransitionImageForPreviewItemContentRect(
			QLPreviewController controller,
			@Mapped(ObjCObjectMapper.class) Object item,
			CGRect contentRect) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * previewControllerDidDismiss:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/QLPreviewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/QLPreviewControllerDelegate/previewControllerDidDismiss:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("previewControllerDidDismiss:")
	default void previewControllerDidDismiss(
			QLPreviewController controller) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * previewControllerWillDismiss:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/NetworkingInternet/Reference/QLPreviewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/QLPreviewControllerDelegate/previewControllerWillDismiss:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("previewControllerWillDismiss:")
	default void previewControllerWillDismiss(
			QLPreviewController controller) {
		throw new java.lang.UnsupportedOperationException();
	}
}
