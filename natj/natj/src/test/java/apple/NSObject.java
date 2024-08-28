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

package apple;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSObject extends ObjCObject implements apple.protocol.NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSObject(Pointer peer) {
		super(peer);
	}

	/**
	 * alloc</br>
	 Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/alloc">iOS Dev Center</a>
	 */
	@Generated
	@Owned
	@Selector("alloc")
	public static native NSObject alloc();

	/**
	 * init</br>
	 Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/init">iOS Dev Center</a>
	 */
	@Generated
	@Selector("init")
	public native NSObject init();

	/**
	 * initialize</br>
	 Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/initialize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@IsOptional
	@Selector("debugDescription")
	public native String debugDescription();

	@Generated
	@Selector("description")
	public native String description();

	/**
	 * dealloc</br>
	 Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/instm/NSObject/dealloc">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dealloc")
	public native void dealloc();

	/**
	 * superclass</br>
	 Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSObject_Class/index.html#//apple_ref/occ/clm/NSObject/superclass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("superclass")
	public native Class superclass();

	@Generated
	@Selector("class")
	public native Class class_objc();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("hash")
	@NUInt
	public native long hash();

	@Generated
	@Selector("isEqual:")
	public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("isKindOfClass:")
	public native boolean isKindOfClass(Class aClass);

	@Generated
	@Selector("isMemberOfClass:")
	public native boolean isMemberOfClass(Class aClass);

	@Generated
	@Selector("isProxy")
	public native boolean isProxy();

	@Generated
	@Selector("performSelector:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object performSelector(SEL aSelector);

	@Generated
	@Selector("performSelector:withObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object performSelectorWithObject(SEL aSelector,
												   @Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("performSelector:withObject:withObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object performSelectorWithObjectWithObject(SEL aSelector,
															 @Mapped(ObjCObjectMapper.class) Object object1,
															 @Mapped(ObjCObjectMapper.class) Object object2);

	@Generated
	@Selector("respondsToSelector:")
	public native boolean respondsToSelector(SEL aSelector);

	@Generated
	@Selector("retainCount")
	@NUInt
	public native long retainCount();

	@Generated
	@Selector("self")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object self();

	@Generated
	@Selector("zone")
	public native VoidPtr zone();

}
