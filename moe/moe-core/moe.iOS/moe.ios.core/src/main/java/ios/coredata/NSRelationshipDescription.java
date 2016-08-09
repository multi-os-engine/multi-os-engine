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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSCoder;
import ios.foundation.NSData;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreData")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRelationshipDescription extends NSPropertyDescription {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRelationshipDescription(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRelationshipDescription alloc();

	/**
	 * deleteRule</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/deleteRule">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deleteRule")
	@NUInt
	public native long deleteRule();

	/**
	 * destinationEntity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/destinationEntity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("destinationEntity")
	public native NSEntityDescription destinationEntity();

	@Generated
	@Selector("init")
	public native NSRelationshipDescription init();

	/**
	 * inverseRelationship</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/inverseRelationship">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inverseRelationship")
	public native NSRelationshipDescription inverseRelationship();

	/**
	 * ordered</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/ordered">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isOrdered")
	public native boolean isOrdered();

	/**
	 * toMany</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/toMany">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isToMany")
	public native boolean isToMany();

	/**
	 * maxCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/maxCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maxCount")
	@NUInt
	public native long maxCount();

	/**
	 * minCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/minCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minCount")
	@NUInt
	public native long minCount();

	/**
	 * deleteRule</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/deleteRule">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDeleteRule:")
	public native void setDeleteRule(@NUInt long value);

	/**
	 * destinationEntity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/destinationEntity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDestinationEntity:")
	public native void setDestinationEntity_unsafe(NSEntityDescription value);

	/**
	 * destinationEntity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/destinationEntity">iOS Dev Center</a>
	 */
	@Generated
	public void setDestinationEntity(NSEntityDescription value) {
		Object __old = destinationEntity();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDestinationEntity_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * inverseRelationship</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/inverseRelationship">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInverseRelationship:")
	public native void setInverseRelationship_unsafe(
			NSRelationshipDescription value);

	/**
	 * inverseRelationship</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/inverseRelationship">iOS Dev Center</a>
	 */
	@Generated
	public void setInverseRelationship(NSRelationshipDescription value) {
		Object __old = inverseRelationship();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setInverseRelationship_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * maxCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/maxCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaxCount:")
	public native void setMaxCount(@NUInt long value);

	/**
	 * minCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/minCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinCount:")
	public native void setMinCount(@NUInt long value);

	/**
	 * ordered</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/ordered">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOrdered:")
	public native void setOrdered(boolean value);

	/**
	 * versionHash</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/CoreDataFramework/Classes/NSRelationshipDescription_Class/index.html#//apple_ref/occ/instp/NSRelationshipDescription/versionHash">iOS Dev Center</a>
	 */
	@Generated
	@Selector("versionHash")
	public native NSData versionHash();

	@Generated
	@Selector("initWithCoder:")
	public native NSRelationshipDescription initWithCoder(NSCoder aDecoder);

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
