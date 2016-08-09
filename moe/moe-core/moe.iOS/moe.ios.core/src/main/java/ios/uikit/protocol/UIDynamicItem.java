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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.uikit.UIBezierPath;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDynamicItem")
public interface UIDynamicItem {
	/**
	 * bounds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItem_Protocol/index.html#//apple_ref/occ/intfp/UIDynamicItem/bounds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bounds")
	@ByValue
	CGRect bounds();

	/**
	 * center</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItem_Protocol/index.html#//apple_ref/occ/intfp/UIDynamicItem/center">iOS Dev Center</a>
	 */
	@Generated
	@Selector("center")
	@ByValue
	CGPoint center();

	/**
	 * center</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItem_Protocol/index.html#//apple_ref/occ/intfp/UIDynamicItem/center">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCenter:")
	void setCenter(@ByValue CGPoint value);

	/**
	 * transform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItem_Protocol/index.html#//apple_ref/occ/intfp/UIDynamicItem/transform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTransform:")
	void setTransform(@ByValue CGAffineTransform value);

	/**
	 * transform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItem_Protocol/index.html#//apple_ref/occ/intfp/UIDynamicItem/transform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transform")
	@ByValue
	CGAffineTransform transform();

	/**
	 * collisionBoundingPath</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItem_Protocol/index.html#//apple_ref/occ/intfp/UIDynamicItem/collisionBoundingPath">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("collisionBoundingPath")
	default UIBezierPath collisionBoundingPath() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * collisionBoundsType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIDynamicItem_Protocol/index.html#//apple_ref/occ/intfp/UIDynamicItem/collisionBoundsType">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("collisionBoundsType")
	@NUInt
	default long collisionBoundsType() {
		throw new java.lang.UnsupportedOperationException();
	}
}
