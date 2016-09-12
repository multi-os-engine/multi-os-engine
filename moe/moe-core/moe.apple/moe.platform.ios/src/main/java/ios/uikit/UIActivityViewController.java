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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSError;
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
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIActivityViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected UIActivityViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIActivityViewController alloc();

	/**
	 * excludedActivityTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityViewController_Class/index.html#//apple_ref/occ/instp/UIActivityViewController/excludedActivityTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("excludedActivityTypes")
	public native NSArray<String> excludedActivityTypes();

	@Generated
	@Selector("init")
	public native UIActivityViewController init();

	/**
	 * initWithActivityItems:applicationActivities:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityViewController_Class/index.html#//apple_ref/occ/instm/UIActivityViewController/initWithActivityItems:applicationActivities:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithActivityItems:applicationActivities:")
	public native UIActivityViewController initWithActivityItemsApplicationActivities(
			NSArray<?> activityItems, NSArray<? extends UIActivity> applicationActivities);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native UIActivityViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	/**
	 * completionHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityViewController_Class/index.html#//apple_ref/occ/instp/UIActivityViewController/completionHandler">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setCompletionHandler:")
	public native void setCompletionHandler(
			@ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setCompletionHandler {
		@Generated
		void call_setCompletionHandler(String arg0, boolean arg1);
	}

	/**
	 * completionWithItemsHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityViewController_Class/index.html#//apple_ref/occ/instp/UIActivityViewController/completionWithItemsHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCompletionWithItemsHandler:")
	public native void setCompletionWithItemsHandler(
			@ObjCBlock(name = "call_setCompletionWithItemsHandler") Block_setCompletionWithItemsHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setCompletionWithItemsHandler {
		@Generated
		void call_setCompletionWithItemsHandler(String arg0,
				boolean arg1, NSArray<?> arg2, NSError arg3);
	}

	/**
	 * excludedActivityTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityViewController_Class/index.html#//apple_ref/occ/instp/UIActivityViewController/excludedActivityTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setExcludedActivityTypes:")
	public native void setExcludedActivityTypes(NSArray<String> value);

	/**
	 * completionHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityViewController_Class/index.html#//apple_ref/occ/instp/UIActivityViewController/completionHandler">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("completionHandler")
	@ObjCBlock(name = "call_completionHandler_ret")
	public native Block_completionHandler_ret completionHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_completionHandler_ret {
		@Generated
		void call_completionHandler_ret(String arg0, boolean arg1);
	}

	/**
	 * completionWithItemsHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIActivityViewController_Class/index.html#//apple_ref/occ/instp/UIActivityViewController/completionWithItemsHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("completionWithItemsHandler")
	@ObjCBlock(name = "call_completionWithItemsHandler_ret")
	public native Block_completionWithItemsHandler_ret completionWithItemsHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_completionWithItemsHandler_ret {
		@Generated
		void call_completionWithItemsHandler_ret(String arg0, boolean arg1, NSArray<?> arg2, NSError arg3);
	}

	@Generated
	@Selector("initWithCoder:")
	public native UIActivityViewController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("attemptRotationToDeviceOrientation")
	public static native void attemptRotationToDeviceOrientation();

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
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

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
	@Selector("prepareInterstitialAds")
	public static native void prepareInterstitialAds();

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
