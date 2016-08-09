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

package ios.webkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebsiteDataStore extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected WKWebsiteDataStore(Pointer peer) {
		super(peer);
	}

	/**
	 * allWebsiteDataTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebsiteDataStore_Class_Ref/index.html#//apple_ref/occ/clm/WKWebsiteDataStore/allWebsiteDataTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allWebsiteDataTypes")
	public static native NSSet<String> allWebsiteDataTypes();

	@Generated
	@Owned
	@Selector("alloc")
	public static native WKWebsiteDataStore alloc();

	/**
	 * defaultDataStore</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebsiteDataStore_Class_Ref/index.html#//apple_ref/occ/clm/WKWebsiteDataStore/defaultDataStore">iOS Dev Center</a>
	 */
	@Generated
	@Selector("defaultDataStore")
	public static native WKWebsiteDataStore defaultDataStore();

	/**
	 * fetchDataRecordsOfTypes:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebsiteDataStore_Class_Ref/index.html#//apple_ref/occ/instm/WKWebsiteDataStore/fetchDataRecordsOfTypes:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchDataRecordsOfTypes:completionHandler:")
	public native void fetchDataRecordsOfTypesCompletionHandler(NSSet<String> dataTypes,
			@ObjCBlock(name = "call_fetchDataRecordsOfTypesCompletionHandler") Block_fetchDataRecordsOfTypesCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_fetchDataRecordsOfTypesCompletionHandler {
		@Generated
		void call_fetchDataRecordsOfTypesCompletionHandler(NSArray<? extends WKWebsiteDataRecord> arg0);
	}

	@Generated
	@Selector("init")
	public native WKWebsiteDataStore init();

	/**
	 * persistent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebsiteDataStore_Class_Ref/index.html#//apple_ref/occ/instp/WKWebsiteDataStore/persistent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPersistent")
	public native boolean isPersistent();

	/**
	 * nonPersistentDataStore</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebsiteDataStore_Class_Ref/index.html#//apple_ref/occ/clm/WKWebsiteDataStore/nonPersistentDataStore">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nonPersistentDataStore")
	public static native WKWebsiteDataStore nonPersistentDataStore();

	/**
	 * removeDataOfTypes:forDataRecords:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebsiteDataStore_Class_Ref/index.html#//apple_ref/occ/instm/WKWebsiteDataStore/removeDataOfTypes:forDataRecords:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeDataOfTypes:forDataRecords:completionHandler:")
	public native void removeDataOfTypesForDataRecordsCompletionHandler(NSSet<String> dataTypes, NSArray<? extends WKWebsiteDataRecord> dataRecords,
			@ObjCBlock(name = "call_removeDataOfTypesForDataRecordsCompletionHandler") Block_removeDataOfTypesForDataRecordsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_removeDataOfTypesForDataRecordsCompletionHandler {
		@Generated
		void call_removeDataOfTypesForDataRecordsCompletionHandler();
	}

	/**
	 * removeDataOfTypes:modifiedSince:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/WebKit/Reference/WKWebsiteDataStore_Class_Ref/index.html#//apple_ref/occ/instm/WKWebsiteDataStore/removeDataOfTypes:modifiedSince:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeDataOfTypes:modifiedSince:completionHandler:")
	public native void removeDataOfTypesModifiedSinceCompletionHandler(NSSet<String> websiteDataTypes, NSDate date,
			@ObjCBlock(name = "call_removeDataOfTypesModifiedSinceCompletionHandler") Block_removeDataOfTypesModifiedSinceCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_removeDataOfTypesModifiedSinceCompletionHandler {
		@Generated
		void call_removeDataOfTypesModifiedSinceCompletionHandler();
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
