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

package mac.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSObject")
public interface NSObject {
	/**
	 * class</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/class">iOS Dev Center</a>
	 */
	@Generated
	@Selector("class")
	public Class class_objc();

	@Generated
	@Selector("debugDescription")
	public String debugDescription();

	@Generated
	@Selector("description")
	public String description();

	@Generated
	@Selector("hash")
	@NUInt
	public long hash();

	/**
	 * isEqual:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/isEqual:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEqual:")
	public boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

	/**
	 * isKindOfClass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/isKindOfClass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isKindOfClass:")
	public boolean isKindOfClass(Class aClass);

	/**
	 * isMemberOfClass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/isMemberOfClass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isMemberOfClass:")
	public boolean isMemberOfClass(Class aClass);

	/**
	 * isProxy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/isProxy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isProxy")
	public boolean isProxy();

	/**
	 * performSelector:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/performSelector:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("performSelector:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object performSelector(SEL aSelector);

	/**
	 * performSelector:withObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/performSelector:withObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("performSelector:withObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object performSelectorWithObject(SEL aSelector,
											@Mapped(ObjCObjectMapper.class) Object object);

	/**
	 * performSelector:withObject:withObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/performSelector:withObject:withObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("performSelector:withObject:withObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object performSelectorWithObjectWithObject(SEL aSelector,
													  @Mapped(ObjCObjectMapper.class) Object object1,
													  @Mapped(ObjCObjectMapper.class) Object object2);

	/**
	 * respondsToSelector:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/respondsToSelector:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("respondsToSelector:")
	public boolean respondsToSelector(SEL aSelector);

	/**
	 * retainCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/retainCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("retainCount")
	@NUInt
	public long retainCount();

	/**
	 * self</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/self">iOS Dev Center</a>
	 */
	@Generated
	@Selector("self")
	@MappedReturn(ObjCObjectMapper.class)
	public Object self();

	@Generated
	@Selector("superclass")
	public Class superclass();

	/**
	 * zone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Protocols/NSObject_Protocol/index.html#//apple_ref/occ/intfm/NSObject/zone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("zone")
	public VoidPtr zone();
}
