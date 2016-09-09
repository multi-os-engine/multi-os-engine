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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileProviderExtension extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFileProviderExtension(Pointer peer) {
		super(peer);
	}

	/**
	 * URLForItemWithPersistentIdentifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/instm/NSFileProviderExtension/URLForItemWithPersistentIdentifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URLForItemWithPersistentIdentifier:")
	public native NSURL URLForItemWithPersistentIdentifier(String identifier);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFileProviderExtension alloc();

	/**
	 * documentStorageURL</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/instm/NSFileProviderExtension/documentStorageURL">iOS Dev Center</a>
	 */
	@Generated
	@Selector("documentStorageURL")
	public native NSURL documentStorageURL();

	@Generated
	@Selector("init")
	public native NSFileProviderExtension init();

	/**
	 * itemChangedAtURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/instm/NSFileProviderExtension/itemChangedAtURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("itemChangedAtURL:")
	public native void itemChangedAtURL(NSURL url);

	/**
	 * persistentIdentifierForItemAtURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/instm/NSFileProviderExtension/persistentIdentifierForItemAtURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("persistentIdentifierForItemAtURL:")
	public native String persistentIdentifierForItemAtURL(NSURL url);

	/**
	 * placeholderURLForURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/clm/NSFileProviderExtension/placeholderURLForURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("placeholderURLForURL:")
	public static native NSURL placeholderURLForURL(NSURL url);

	/**
	 * providePlaceholderAtURL:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/instm/NSFileProviderExtension/providePlaceholderAtURL:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("providePlaceholderAtURL:completionHandler:")
	public native void providePlaceholderAtURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_providePlaceholderAtURLCompletionHandler") Block_providePlaceholderAtURLCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_providePlaceholderAtURLCompletionHandler {
		@Generated
		void call_providePlaceholderAtURLCompletionHandler(NSError arg0);
	}

	/**
	 * providerIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/instm/NSFileProviderExtension/providerIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("providerIdentifier")
	public native String providerIdentifier();

	/**
	 * startProvidingItemAtURL:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/instm/NSFileProviderExtension/startProvidingItemAtURL:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startProvidingItemAtURL:completionHandler:")
	public native void startProvidingItemAtURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_startProvidingItemAtURLCompletionHandler") Block_startProvidingItemAtURLCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_startProvidingItemAtURLCompletionHandler {
		@Generated
		void call_startProvidingItemAtURLCompletionHandler(NSError arg0);
	}

	/**
	 * stopProvidingItemAtURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/instm/NSFileProviderExtension/stopProvidingItemAtURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopProvidingItemAtURL:")
	public native void stopProvidingItemAtURL(NSURL url);

	/**
	 * writePlaceholderAtURL:withMetadata:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/NSFileProviderExtension_Class/index.html#//apple_ref/occ/clm/NSFileProviderExtension/writePlaceholderAtURL:withMetadata:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("writePlaceholderAtURL:withMetadata:error:")
	public static native boolean writePlaceholderAtURLWithMetadataError(
			NSURL placeholderURL, NSDictionary<?, ?> metadata, Ptr<NSError> error);

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
