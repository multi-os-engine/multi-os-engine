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

package ios.scenekit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.scenekit.struct.SCNVector3;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNBoundingVolume")
public interface SCNBoundingVolume {
	/**
	 * getBoundingBoxMin:max:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBoundingVolume_Protocol/index.html#//apple_ref/occ/intfm/SCNBoundingVolume/getBoundingBoxMin:max:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getBoundingBoxMin:max:")
	boolean getBoundingBoxMinMax(
			SCNVector3 min,
			SCNVector3 max);

	/**
	 * getBoundingSphereCenter:radius:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBoundingVolume_Protocol/index.html#//apple_ref/occ/intfm/SCNBoundingVolume/getBoundingSphereCenter:radius:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getBoundingSphereCenter:radius:")
	boolean getBoundingSphereCenterRadius(
			SCNVector3 center,
			NFloatPtr radius);

	/**
	 * setBoundingBoxMin:max:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNBoundingVolume_Protocol/index.html#//apple_ref/occ/intfm/SCNBoundingVolume/setBoundingBoxMin:max:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBoundingBoxMin:max:")
	void setBoundingBoxMinMax(
			SCNVector3 min,
			SCNVector3 max);
}
