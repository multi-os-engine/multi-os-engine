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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSFastEnumeration;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSHashTable<_ObjectType> extends NSObject implements NSCopying, NSCoding,
		NSFastEnumeration {
	static {
		NatJ.register();
	}

	@Generated
	protected NSHashTable(Pointer peer) {
		super(peer);
	}

	/**
	 * addObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/addObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addObject:")
	public native void addObject(@Mapped(ObjCObjectMapper.class) _ObjectType object);

	/**
	 * allObjects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instp/NSHashTable/allObjects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allObjects")
	public native NSArray<_ObjectType> allObjects();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSHashTable<?> alloc();

	/**
	 * anyObject</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instp/NSHashTable/anyObject">iOS Dev Center</a>
	 */
	@MappedReturn(ObjCObjectMapper.class)
	@Generated
	@Selector("anyObject")
	public native _ObjectType anyObject();

	/**
	 * containsObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/containsObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containsObject:")
	public native boolean containsObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType anObject);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * count</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instp/NSHashTable/count">iOS Dev Center</a>
	 */
	@Generated
	@Selector("count")
	@NUInt
	public native long count();

	@Generated
	@Selector("countByEnumeratingWithState:objects:count:")
	@NUInt
	public native long countByEnumeratingWithStateObjectsCount(VoidPtr state,
			Ptr<ObjCObject> buffer, @NUInt long len);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * hashTableWithOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/clm/NSHashTable/hashTableWithOptions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hashTableWithOptions:")
	public static native <_ObjectType> NSHashTable<_ObjectType> hashTableWithOptions(@NUInt long options);

	@Generated
	@Selector("init")
	public native NSHashTable<?> init();

	@Generated
	@Selector("initWithCoder:")
	public native NSHashTable<?> initWithCoder(NSCoder aDecoder);

	/**
	 * initWithOptions:capacity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/initWithOptions:capacity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithOptions:capacity:")
	public native NSHashTable<?> initWithOptionsCapacity(@NUInt long options,
			@NUInt long initialCapacity);

	/**
	 * initWithPointerFunctions:capacity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/initWithPointerFunctions:capacity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPointerFunctions:capacity:")
	public native NSHashTable<?> initWithPointerFunctionsCapacity(
			NSPointerFunctions functions, @NUInt long initialCapacity);

	/**
	 * intersectHashTable:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/intersectHashTable:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("intersectHashTable:")
	public native void intersectHashTable(NSHashTable<_ObjectType> other);

	/**
	 * intersectsHashTable:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/intersectsHashTable:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("intersectsHashTable:")
	public native boolean intersectsHashTable(NSHashTable<_ObjectType> other);

	/**
	 * isEqualToHashTable:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/isEqualToHashTable:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEqualToHashTable:")
	public native boolean isEqualToHashTable(NSHashTable<_ObjectType> other);

	/**
	 * isSubsetOfHashTable:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/isSubsetOfHashTable:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSubsetOfHashTable:")
	public native boolean isSubsetOfHashTable(NSHashTable<_ObjectType> other);

	/**
	 * member:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/member:">iOS Dev Center</a>
	 */
	@MappedReturn(ObjCObjectMapper.class)
	@Generated
	@Selector("member:")
	public native _ObjectType member(@Mapped(ObjCObjectMapper.class) _ObjectType object);

	/**
	 * minusHashTable:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/minusHashTable:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minusHashTable:")
	public native void minusHashTable(NSHashTable<_ObjectType> other);

	/**
	 * objectEnumerator</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/objectEnumerator">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectEnumerator")
	public native NSEnumerator<_ObjectType> objectEnumerator();

	/**
	 * pointerFunctions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instp/NSHashTable/pointerFunctions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pointerFunctions")
	public native NSPointerFunctions pointerFunctions();

	/**
	 * removeAllObjects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/removeAllObjects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllObjects")
	public native void removeAllObjects();

	/**
	 * removeObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/removeObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObject:")
	public native void removeObject(
			@Mapped(ObjCObjectMapper.class) _ObjectType object);

	/**
	 * setRepresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instp/NSHashTable/setRepresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRepresentation")
	public native NSSet<_ObjectType> setRepresentation();

	/**
	 * unionHashTable:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/instm/NSHashTable/unionHashTable:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unionHashTable:")
	public native void unionHashTable(NSHashTable<_ObjectType> other);

	/**
	 * weakObjectsHashTable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSHashTable_class/index.html#//apple_ref/occ/clm/NSHashTable/weakObjectsHashTable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("weakObjectsHashTable")
	public static native <_ObjectType> NSHashTable<_ObjectType> weakObjectsHashTable();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
