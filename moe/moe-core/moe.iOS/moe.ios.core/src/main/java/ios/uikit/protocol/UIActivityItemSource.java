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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGSize;
import ios.uikit.UIActivityViewController;
import ios.uikit.UIImage;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIActivityItemSource")
public interface UIActivityItemSource {
	/**
	 * activityViewController:dataTypeIdentifierForActivityType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityItemSource_protocol/index.html#//apple_ref/occ/intfm/UIActivityItemSource/activityViewController:dataTypeIdentifierForActivityType:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("activityViewController:dataTypeIdentifierForActivityType:")
	default String activityViewControllerDataTypeIdentifierForActivityType(
			UIActivityViewController activityViewController, String activityType) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * activityViewController:itemForActivityType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityItemSource_protocol/index.html#//apple_ref/occ/intfm/UIActivityItemSource/activityViewController:itemForActivityType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activityViewController:itemForActivityType:")
	@MappedReturn(ObjCObjectMapper.class)
	Object activityViewControllerItemForActivityType(
			UIActivityViewController activityViewController, String activityType);

	/**
	 * activityViewController:subjectForActivityType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityItemSource_protocol/index.html#//apple_ref/occ/intfm/UIActivityItemSource/activityViewController:subjectForActivityType:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("activityViewController:subjectForActivityType:")
	default String activityViewControllerSubjectForActivityType(
			UIActivityViewController activityViewController, String activityType) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * activityViewController:thumbnailImageForActivityType:suggestedSize:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityItemSource_protocol/index.html#//apple_ref/occ/intfm/UIActivityItemSource/activityViewController:thumbnailImageForActivityType:suggestedSize:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("activityViewController:thumbnailImageForActivityType:suggestedSize:")
	default UIImage activityViewControllerThumbnailImageForActivityTypeSuggestedSize(
			UIActivityViewController activityViewController,
			String activityType, @ByValue CGSize size) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * activityViewControllerPlaceholderItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityItemSource_protocol/index.html#//apple_ref/occ/intfm/UIActivityItemSource/activityViewControllerPlaceholderItem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activityViewControllerPlaceholderItem:")
	@MappedReturn(ObjCObjectMapper.class)
	Object activityViewControllerPlaceholderItem(
			UIActivityViewController activityViewController);
}
