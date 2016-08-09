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

package ios.coredata;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSPredicate;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPropertyDescription extends NSObject implements NSCoding,
		NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPropertyDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPropertyDescription alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * entity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/entity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("entity")
	public native NSEntityDescription entity();

	@Generated
	@Selector("init")
	public native NSPropertyDescription init();

	@Generated
	@Selector("initWithCoder:")
	public native NSPropertyDescription initWithCoder(NSCoder aDecoder);

	/**
	 * indexed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/indexed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isIndexed")
	public native boolean isIndexed();

	/**
	 * indexedBySpotlight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/indexedBySpotlight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isIndexedBySpotlight")
	public native boolean isIndexedBySpotlight();

	/**
	 * optional</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/optional">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isOptional")
	public native boolean isOptional();

	/**
	 * storedInExternalRecord</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/storedInExternalRecord">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isStoredInExternalRecord")
	public native boolean isStoredInExternalRecord();

	/**
	 * transient</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/transient">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isTransient")
	public native boolean isTransient();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * renamingIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/renamingIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renamingIdentifier")
	public native String renamingIdentifier();

	/**
	 * indexed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/indexed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIndexed:")
	public native void setIndexed(boolean value);

	/**
	 * indexedBySpotlight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/indexedBySpotlight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setIndexedBySpotlight:")
	public native void setIndexedBySpotlight(boolean value);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * optional</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/optional">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOptional:")
	public native void setOptional(boolean value);

	/**
	 * renamingIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/renamingIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRenamingIdentifier:")
	public native void setRenamingIdentifier(String value);

	/**
	 * storedInExternalRecord</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/storedInExternalRecord">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStoredInExternalRecord:")
	public native void setStoredInExternalRecord(boolean value);

	/**
	 * transient</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/transient">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTransient:")
	public native void setTransient(boolean value);

	/**
	 * userInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/userInfo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUserInfo:")
	public native void setUserInfo(NSDictionary<?, ?> value);

	/**
	 * setValidationPredicates:withValidationWarnings:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instm/NSPropertyDescription/setValidationPredicates:withValidationWarnings:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValidationPredicates:withValidationWarnings:")
	public native void setValidationPredicatesWithValidationWarnings(
			NSArray<? extends NSPredicate> validationPredicates, NSArray<String> validationWarnings);

	/**
	 * versionHashModifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/versionHashModifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVersionHashModifier:")
	public native void setVersionHashModifier(String value);

	/**
	 * userInfo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/userInfo">iOS Dev Center</a>
	 */
	@Generated
	@Selector("userInfo")
	public native NSDictionary<?, ?> userInfo();

	/**
	 * validationPredicates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/validationPredicates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("validationPredicates")
	public native NSArray<? extends NSPredicate> validationPredicates();

	/**
	 * validationWarnings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/validationWarnings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("validationWarnings")
	public native NSArray<?> validationWarnings();

	/**
	 * versionHash</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/versionHash">iOS Dev Center</a>
	 */
	@Generated
	@Selector("versionHash")
	public native NSData versionHash();

	/**
	 * versionHashModifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSPropertyDescription_Class/index.html#//apple_ref/occ/instp/NSPropertyDescription/versionHashModifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("versionHashModifier")
	public native String versionHashModifier();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
