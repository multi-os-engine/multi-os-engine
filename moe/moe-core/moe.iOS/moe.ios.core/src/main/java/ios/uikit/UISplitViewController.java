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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.protocol.UISplitViewControllerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISplitViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected UISplitViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UISplitViewController alloc();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UISplitViewControllerDelegate delegate();

	/**
	 * displayMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/displayMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("displayMode")
	@NInt
	public native long displayMode();

	/**
	 * displayModeButtonItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instm/UISplitViewController/displayModeButtonItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("displayModeButtonItem")
	public native UIBarButtonItem displayModeButtonItem();

	@Generated
	@Selector("init")
	public native UISplitViewController init();

	@Generated
	@Selector("initWithNibName:bundle:")
	public native UISplitViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	/**
	 * collapsed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/collapsed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isCollapsed")
	public native boolean isCollapsed();

	/**
	 * maximumPrimaryColumnWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/maximumPrimaryColumnWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumPrimaryColumnWidth")
	@NFloat
	public native double maximumPrimaryColumnWidth();

	/**
	 * minimumPrimaryColumnWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/minimumPrimaryColumnWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minimumPrimaryColumnWidth")
	@NFloat
	public native double minimumPrimaryColumnWidth();

	/**
	 * preferredDisplayMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/preferredDisplayMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredDisplayMode")
	@NInt
	public native long preferredDisplayMode();

	/**
	 * preferredPrimaryColumnWidthFraction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/preferredPrimaryColumnWidthFraction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredPrimaryColumnWidthFraction")
	@NFloat
	public native double preferredPrimaryColumnWidthFraction();

	/**
	 * presentsWithGesture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/presentsWithGesture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentsWithGesture")
	public native boolean presentsWithGesture();

	/**
	 * primaryColumnWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/primaryColumnWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("primaryColumnWidth")
	@NFloat
	public native double primaryColumnWidth();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UISplitViewControllerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) UISplitViewControllerDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * maximumPrimaryColumnWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/maximumPrimaryColumnWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumPrimaryColumnWidth:")
	public native void setMaximumPrimaryColumnWidth(@NFloat double value);

	/**
	 * minimumPrimaryColumnWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/minimumPrimaryColumnWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinimumPrimaryColumnWidth:")
	public native void setMinimumPrimaryColumnWidth(@NFloat double value);

	/**
	 * preferredDisplayMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/preferredDisplayMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredDisplayMode:")
	public native void setPreferredDisplayMode(@NInt long value);

	/**
	 * preferredPrimaryColumnWidthFraction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/preferredPrimaryColumnWidthFraction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredPrimaryColumnWidthFraction:")
	public native void setPreferredPrimaryColumnWidthFraction(
			@NFloat double value);

	/**
	 * presentsWithGesture</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/presentsWithGesture">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPresentsWithGesture:")
	public native void setPresentsWithGesture(boolean value);

	/**
	 * viewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/viewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setViewControllers:")
	public native void setViewControllers(NSArray<? extends UIViewController> value);

	/**
	 * showDetailViewController:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instm/UISplitViewController/showDetailViewController:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showDetailViewController:sender:")
	public native void showDetailViewControllerSender(UIViewController vc,
			@Mapped(ObjCObjectMapper.class) Object sender);

	/**
	 * showViewController:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instm/UISplitViewController/showViewController:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showViewController:sender:")
	public native void showViewControllerSender(UIViewController vc,
			@Mapped(ObjCObjectMapper.class) Object sender);

	/**
	 * viewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISplitViewController_class/index.html#//apple_ref/occ/instp/UISplitViewController/viewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewControllers")
	public native NSArray<? extends UIViewController> viewControllers();

	@Generated
	@Selector("initWithCoder:")
	public native UISplitViewController initWithCoder(NSCoder aDecoder);

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
