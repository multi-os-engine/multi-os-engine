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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUbiquitousKeyValueStore extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUbiquitousKeyValueStore(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUbiquitousKeyValueStore alloc();

	/**
	 * arrayForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/arrayForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("arrayForKey:")
	public native NSArray<?> arrayForKey(String aKey);

	/**
	 * boolForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/boolForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("boolForKey:")
	public native boolean boolForKey(String aKey);

	/**
	 * dataForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/dataForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataForKey:")
	public native NSData dataForKey(String aKey);

	/**
	 * defaultStore</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/clm/NSUbiquitousKeyValueStore/defaultStore">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultStore")
	public static native NSUbiquitousKeyValueStore defaultStore();

	/**
	 * dictionaryForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/dictionaryForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dictionaryForKey:")
	public native NSDictionary<String, ?> dictionaryForKey(String aKey);

	/**
	 * dictionaryRepresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instp/NSUbiquitousKeyValueStore/dictionaryRepresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dictionaryRepresentation")
	public native NSDictionary<String, ?> dictionaryRepresentation();

	/**
	 * doubleForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/doubleForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("doubleForKey:")
	public native double doubleForKey(String aKey);

	@Generated
	@Selector("init")
	public native NSUbiquitousKeyValueStore init();

	/**
	 * longLongForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/longLongForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("longLongForKey:")
	public native long longLongForKey(String aKey);

	/**
	 * objectForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/objectForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(String aKey);

	/**
	 * removeObjectForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/removeObjectForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeObjectForKey:")
	public native void removeObjectForKey(String aKey);

	/**
	 * setArray:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/setArray:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setArray:forKey:")
	public native void setArrayForKey(NSArray<?> anArray, String aKey);

	/**
	 * setBool:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/setBool:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBool:forKey:")
	public native void setBoolForKey(boolean value, String aKey);

	/**
	 * setData:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/setData:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setData:forKey:")
	public native void setDataForKey(NSData aData, String aKey);

	/**
	 * setDictionary:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/setDictionary:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDictionary:forKey:")
	public native void setDictionaryForKey(NSDictionary<String, ?> aDictionary, String aKey);

	/**
	 * setDouble:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/setDouble:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDouble:forKey:")
	public native void setDoubleForKey(double value, String aKey);

	/**
	 * setLongLong:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/setLongLong:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLongLong:forKey:")
	public native void setLongLongForKey(long value, String aKey);

	/**
	 * setObject:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/setObject:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setObject:forKey:")
	public native void setObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object anObject, String aKey);

	/**
	 * setString:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/setString:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setString:forKey:")
	public native void setStringForKey(String aString, String aKey);

	/**
	 * stringForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/stringForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringForKey:")
	public native String stringForKey(String aKey);

	/**
	 * synchronize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSUbiquitousKeyValueStore_class/index.html#//apple_ref/occ/instm/NSUbiquitousKeyValueStore/synchronize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("synchronize")
	public native boolean synchronize();

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
