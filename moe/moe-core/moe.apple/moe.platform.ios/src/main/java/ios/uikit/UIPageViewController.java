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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.uikit.protocol.UIPageViewControllerDataSource;
import ios.uikit.protocol.UIPageViewControllerDelegate;
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
public class UIPageViewController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected UIPageViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIPageViewController alloc();

	/**
	 * dataSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/dataSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataSource")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIPageViewControllerDataSource dataSource();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIPageViewControllerDelegate delegate();

	/**
	 * gestureRecognizers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/gestureRecognizers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("gestureRecognizers")
	public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

	@Generated
	@Selector("init")
	public native UIPageViewController init();

	@Generated
	@Selector("initWithNibName:bundle:")
	public native UIPageViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	/**
	 * initWithTransitionStyle:navigationOrientation:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instm/UIPageViewController/initWithTransitionStyle:navigationOrientation:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithTransitionStyle:navigationOrientation:options:")
	public native UIPageViewController initWithTransitionStyleNavigationOrientationOptions(
			@NInt long style, @NInt long navigationOrientation,
			NSDictionary<String, ?> options);

	/**
	 * doubleSided</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/doubleSided">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isDoubleSided")
	public native boolean isDoubleSided();

	/**
	 * navigationOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/navigationOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("navigationOrientation")
	@NInt
	public native long navigationOrientation();

	/**
	 * dataSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/dataSource">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDataSource:")
	public native void setDataSource_unsafe(
			@Mapped(ObjCObjectMapper.class) UIPageViewControllerDataSource value);

	/**
	 * dataSource</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/dataSource">iOS Dev Center</a>
	 */
	@Generated
	public void setDataSource(@Mapped(ObjCObjectMapper.class) UIPageViewControllerDataSource value) {
		Object __old = dataSource();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDataSource_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UIPageViewControllerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) UIPageViewControllerDelegate value) {
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
	 * doubleSided</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/doubleSided">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDoubleSided:")
	public native void setDoubleSided(boolean value);

	/**
	 * setViewControllers:direction:animated:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instm/UIPageViewController/setViewControllers:direction:animated:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setViewControllers:direction:animated:completion:")
	public native void setViewControllersDirectionAnimatedCompletion(
			NSArray<? extends UIViewController> viewControllers,
			@NInt long direction,
			boolean animated,
			@ObjCBlock(name = "call_setViewControllersDirectionAnimatedCompletion") Block_setViewControllersDirectionAnimatedCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setViewControllersDirectionAnimatedCompletion {
		@Generated
		void call_setViewControllersDirectionAnimatedCompletion(
				boolean arg0);
	}

	/**
	 * spineLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/spineLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("spineLocation")
	@NInt
	public native long spineLocation();

	/**
	 * transitionStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/transitionStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transitionStyle")
	@NInt
	public native long transitionStyle();

	/**
	 * viewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPageViewControllerClassReferenceClassRef/index.html#//apple_ref/occ/instp/UIPageViewController/viewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewControllers")
	public native NSArray<? extends UIViewController> viewControllers();

	@Generated
	@Selector("initWithCoder:")
	public native UIPageViewController initWithCoder(NSCoder coder);

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
