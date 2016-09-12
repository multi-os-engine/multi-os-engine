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

package ios.spritekit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.spritekit.SKPhysicsContact;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SKPhysicsContactDelegate")
public interface SKPhysicsContactDelegate {
	/**
	 * didBeginContact:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsContactDelegate_Ref/index.html#//apple_ref/occ/intfm/SKPhysicsContactDelegate/didBeginContact:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("didBeginContact:")
	default void didBeginContact(SKPhysicsContact contact) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * didEndContact:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsContactDelegate_Ref/index.html#//apple_ref/occ/intfm/SKPhysicsContactDelegate/didEndContact:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("didEndContact:")
	default void didEndContact(SKPhysicsContact contact) {
		throw new java.lang.UnsupportedOperationException();
	}
}
