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

package ios.modelio.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.protocol.NSFastEnumeration;
import ios.modelio.MDLObject;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MDLObjectContainerComponent")
public interface MDLObjectContainerComponent extends MDLComponent, NSFastEnumeration {
	/**
	 * addObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObjectContainerComponent_Protocol/index.html#//apple_ref/occ/intfm/MDLObjectContainerComponent/addObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObject:")
	void addObject(MDLObject object);

	/**
	 * objects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObjectContainerComponent_Protocol/index.html#//apple_ref/occ/intfp/MDLObjectContainerComponent/objects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objects")
	NSArray<? extends MDLObject> objects();

	/**
	 * removeObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLObjectContainerComponent_Protocol/index.html#//apple_ref/occ/intfm/MDLObjectContainerComponent/removeObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObject:")
	void removeObject(MDLObject object);
}
