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
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.protocol.UIViewControllerAnimatedTransitioning;
import ios.uikit.protocol.UIViewControllerTransitioningDelegate;
import ios.uikit.protocol.UISearchControllerDelegate;
import ios.uikit.protocol.UISearchResultsUpdating;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISearchController extends UIViewController implements
		UIViewControllerTransitioningDelegate,
		UIViewControllerAnimatedTransitioning {
	static {
		NatJ.register();
	}

	@Generated
	protected UISearchController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UISearchController alloc();

	@Generated
	@Selector("animateTransition:")
	public native void animateTransition(
			@Mapped(ObjCObjectMapper.class) Object transitionContext);

	@Generated
	@IsOptional
	@Selector("animationControllerForDismissedController:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animationControllerForDismissedController(
			UIViewController dismissed);

	@Generated
	@IsOptional
	@Selector("animationControllerForPresentedController:presentingController:sourceController:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object animationControllerForPresentedControllerPresentingControllerSourceController(
			UIViewController presented, UIViewController presenting,
			UIViewController source);

	@Generated
	@IsOptional
	@Selector("animationEnded:")
	public native void animationEnded(boolean transitionCompleted);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UISearchControllerDelegate delegate();

	/**
	 * dimsBackgroundDuringPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/dimsBackgroundDuringPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dimsBackgroundDuringPresentation")
	public native boolean dimsBackgroundDuringPresentation();

	/**
	 * hidesNavigationBarDuringPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/hidesNavigationBarDuringPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hidesNavigationBarDuringPresentation")
	public native boolean hidesNavigationBarDuringPresentation();

	@Generated
	@Selector("init")
	public native UISearchController init();

	@Generated
	@Selector("initWithNibName:bundle:")
	public native UISearchController initWithNibNameBundle(String nibNameOrNil,
			NSBundle nibBundleOrNil);

	/**
	 * initWithSearchResultsController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instm/UISearchController/initWithSearchResultsController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithSearchResultsController:")
	public native UISearchController initWithSearchResultsController(
			UIViewController searchResultsController);

	@Generated
	@IsOptional
	@Selector("interactionControllerForDismissal:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object interactionControllerForDismissal(
			@Mapped(ObjCObjectMapper.class) Object animator);

	@Generated
	@IsOptional
	@Selector("interactionControllerForPresentation:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object interactionControllerForPresentation(
			@Mapped(ObjCObjectMapper.class) Object animator);

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isActive")
	public native boolean isActive();

	@Generated
	@IsOptional
	@Selector("presentationControllerForPresentedViewController:presentingViewController:sourceViewController:")
	public native UIPresentationController presentationControllerForPresentedViewControllerPresentingViewControllerSourceViewController(
			UIViewController presented, UIViewController presenting,
			UIViewController source);

	/**
	 * searchBar</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/searchBar">iOS Dev Center</a>
	 */
	@Generated
	@Selector("searchBar")
	public native UISearchBar searchBar();

	/**
	 * searchResultsController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/searchResultsController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("searchResultsController")
	public native UIViewController searchResultsController();

	/**
	 * searchResultsUpdater</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/searchResultsUpdater">iOS Dev Center</a>
	 */
	@Generated
	@Selector("searchResultsUpdater")
	@MappedReturn(ObjCObjectMapper.class)
	public native UISearchResultsUpdating searchResultsUpdater();

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActive:")
	public native void setActive(boolean value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UISearchControllerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) UISearchControllerDelegate value) {
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
	 * dimsBackgroundDuringPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/dimsBackgroundDuringPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDimsBackgroundDuringPresentation:")
	public native void setDimsBackgroundDuringPresentation(boolean value);

	/**
	 * hidesNavigationBarDuringPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/hidesNavigationBarDuringPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHidesNavigationBarDuringPresentation:")
	public native void setHidesNavigationBarDuringPresentation(boolean value);

	/**
	 * searchResultsUpdater</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/searchResultsUpdater">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSearchResultsUpdater:")
	public native void setSearchResultsUpdater_unsafe(
			@Mapped(ObjCObjectMapper.class) UISearchResultsUpdating value);

	/**
	 * searchResultsUpdater</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/searchResultsUpdater">iOS Dev Center</a>
	 */
	@Generated
	public void setSearchResultsUpdater(
			@Mapped(ObjCObjectMapper.class) UISearchResultsUpdating value) {
		Object __old = searchResultsUpdater();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setSearchResultsUpdater_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("transitionDuration:")
	public native double transitionDuration(
			@Mapped(ObjCObjectMapper.class) Object transitionContext);

	@Generated
	@Selector("initWithCoder:")
	public native UISearchController initWithCoder(NSCoder aDecoder);

	/**
	 * obscuresBackgroundDuringPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/obscuresBackgroundDuringPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("obscuresBackgroundDuringPresentation")
	public native boolean obscuresBackgroundDuringPresentation();

	/**
	 * obscuresBackgroundDuringPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UISearchController/index.html#//apple_ref/occ/instp/UISearchController/obscuresBackgroundDuringPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setObscuresBackgroundDuringPresentation:")
	public native void setObscuresBackgroundDuringPresentation(boolean value);

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
