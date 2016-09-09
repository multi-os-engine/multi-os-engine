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

package ios.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAutoreleasePool extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSAutoreleasePool(Pointer peer) {
		super(peer);
	}

	/**
	 * addObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAutoreleasePool_Class/index.html#//apple_ref/occ/clm/NSAutoreleasePool/addObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObject:")
	public static native void addObject_static(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	/**
	 * addObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAutoreleasePool_Class/index.html#//apple_ref/occ/instm/NSAutoreleasePool/addObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSAutoreleasePool alloc();

	/**
	 * drain</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSAutoreleasePool_Class/index.html#//apple_ref/occ/instm/NSAutoreleasePool/drain">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drain")
	public native void drain();

	@Generated
	@Selector("init")
	public native NSAutoreleasePool init();
}
