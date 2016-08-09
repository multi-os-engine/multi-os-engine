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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGPoint;
import ios.uikit.UICollisionBehavior;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollisionBehaviorDelegate")
public interface UICollisionBehaviorDelegate {
	/**
	 * collisionBehavior:beganContactForItem:withBoundaryIdentifier:atPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehaviorDelegate_Protocol/index.html#//apple_ref/occ/intfm/UICollisionBehaviorDelegate/collisionBehavior:beganContactForItem:withBoundaryIdentifier:atPoint:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("collisionBehavior:beganContactForItem:withBoundaryIdentifier:atPoint:")
	default void collisionBehaviorBeganContactForItemWithBoundaryIdentifierAtPoint(
			UICollisionBehavior behavior,
			@Mapped(ObjCObjectMapper.class) Object item,
			@Mapped(ObjCObjectMapper.class) Object identifier,
			@ByValue CGPoint p) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * collisionBehavior:beganContactForItem:withItem:atPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehaviorDelegate_Protocol/index.html#//apple_ref/occ/intfm/UICollisionBehaviorDelegate/collisionBehavior:beganContactForItem:withItem:atPoint:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("collisionBehavior:beganContactForItem:withItem:atPoint:")
	default void collisionBehaviorBeganContactForItemWithItemAtPoint(
			UICollisionBehavior behavior,
			@Mapped(ObjCObjectMapper.class) Object item1,
			@Mapped(ObjCObjectMapper.class) Object item2, @ByValue CGPoint p) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * collisionBehavior:endedContactForItem:withBoundaryIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehaviorDelegate_Protocol/index.html#//apple_ref/occ/intfm/UICollisionBehaviorDelegate/collisionBehavior:endedContactForItem:withBoundaryIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("collisionBehavior:endedContactForItem:withBoundaryIdentifier:")
	default void collisionBehaviorEndedContactForItemWithBoundaryIdentifier(
			UICollisionBehavior behavior,
			@Mapped(ObjCObjectMapper.class) Object item,
			@Mapped(ObjCObjectMapper.class) Object identifier) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * collisionBehavior:endedContactForItem:withItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICollisionBehaviorDelegate_Protocol/index.html#//apple_ref/occ/intfm/UICollisionBehaviorDelegate/collisionBehavior:endedContactForItem:withItem:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("collisionBehavior:endedContactForItem:withItem:")
	default void collisionBehaviorEndedContactForItemWithItem(
			UICollisionBehavior behavior,
			@Mapped(ObjCObjectMapper.class) Object item1,
			@Mapped(ObjCObjectMapper.class) Object item2) {
		throw new java.lang.UnsupportedOperationException();
	}
}
