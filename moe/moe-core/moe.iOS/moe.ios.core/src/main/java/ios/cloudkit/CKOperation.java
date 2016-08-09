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

package ios.cloudkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSOperation;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKOperation extends NSOperation {
	static {
		NatJ.register();
	}

	@Generated
	protected CKOperation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CKOperation alloc();

	/**
	 * allowsCellularAccess</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/allowsCellularAccess">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsCellularAccess")
	public native boolean allowsCellularAccess();

	/**
	 * container</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/container">iOS Dev Center</a>
	 */
	@Generated
	@Selector("container")
	public native CKContainer container();

	@Generated
	@Selector("init")
	public native CKOperation init();

	/**
	 * allowsCellularAccess</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/allowsCellularAccess">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsCellularAccess:")
	public native void setAllowsCellularAccess(boolean value);

	/**
	 * container</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/container">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContainer:")
	public native void setContainer(CKContainer value);

	/**
	 * usesBackgroundSession</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/usesBackgroundSession">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("setUsesBackgroundSession:")
	public native void setUsesBackgroundSession(boolean value);

	/**
	 * usesBackgroundSession</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/usesBackgroundSession">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("usesBackgroundSession")
	public native boolean usesBackgroundSession();

	/**
	 * longLived</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/longLived">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isLongLived")
	public native boolean isLongLived();

	/**
	 * longLivedOperationWasPersistedBlock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/longLivedOperationWasPersistedBlock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("longLivedOperationWasPersistedBlock")
	@ObjCBlock(name = "call_longLivedOperationWasPersistedBlock_ret")
	public native Block_longLivedOperationWasPersistedBlock_ret longLivedOperationWasPersistedBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_longLivedOperationWasPersistedBlock_ret {
		@Generated
		void call_longLivedOperationWasPersistedBlock_ret();
	}

	/**
	 * operationID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/operationID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("operationID")
	public native String operationID();

	/**
	 * longLived</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/longLived">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLongLived:")
	public native void setLongLived(boolean value);

	/**
	 * longLivedOperationWasPersistedBlock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CloudKit/Reference/CKOperation_class/index.html#//apple_ref/occ/instp/CKOperation/longLivedOperationWasPersistedBlock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLongLivedOperationWasPersistedBlock:")
	public native void setLongLivedOperationWasPersistedBlock(
			@ObjCBlock(name = "call_setLongLivedOperationWasPersistedBlock") Block_setLongLivedOperationWasPersistedBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setLongLivedOperationWasPersistedBlock {
		@Generated
		void call_setLongLivedOperationWasPersistedBlock();
	}

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
	public static native void load_objc();

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
	public static native long version();
}
