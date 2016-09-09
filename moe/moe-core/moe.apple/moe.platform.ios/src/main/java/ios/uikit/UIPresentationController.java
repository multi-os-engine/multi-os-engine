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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.uikit.protocol.UIAppearanceContainer;
import ios.uikit.protocol.UIContentContainer;
import ios.uikit.protocol.UITraitEnvironment;
import ios.uikit.protocol.UIFocusEnvironment;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPresentationController extends NSObject implements
		UIAppearanceContainer, UITraitEnvironment, UIContentContainer, UIFocusEnvironment {
	static {
		NatJ.register();
	}

	@Generated
	protected UIPresentationController(Pointer peer) {
		super(peer);
	}

	/**
	 * adaptivePresentationStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/adaptivePresentationStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("adaptivePresentationStyle")
	@NInt
	public native long adaptivePresentationStyle();

	/**
	 * adaptivePresentationStyleForTraitCollection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/adaptivePresentationStyleForTraitCollection:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("adaptivePresentationStyleForTraitCollection:")
	@NInt
	public native long adaptivePresentationStyleForTraitCollection(
			UITraitCollection traitCollection);

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIPresentationController alloc();

	/**
	 * containerView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/containerView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerView")
	public native UIView containerView();

	/**
	 * containerViewDidLayoutSubviews</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/containerViewDidLayoutSubviews">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerViewDidLayoutSubviews")
	public native void containerViewDidLayoutSubviews();

	/**
	 * containerViewWillLayoutSubviews</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/containerViewWillLayoutSubviews">iOS Dev Center</a>
	 */
	@Generated
	@Selector("containerViewWillLayoutSubviews")
	public native void containerViewWillLayoutSubviews();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	/**
	 * dismissalTransitionDidEnd:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/dismissalTransitionDidEnd:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dismissalTransitionDidEnd:")
	public native void dismissalTransitionDidEnd(boolean completed);

	/**
	 * dismissalTransitionWillBegin</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/dismissalTransitionWillBegin">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dismissalTransitionWillBegin")
	public native void dismissalTransitionWillBegin();

	/**
	 * frameOfPresentedViewInContainerView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/frameOfPresentedViewInContainerView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("frameOfPresentedViewInContainerView")
	@ByValue
	public native CGRect frameOfPresentedViewInContainerView();

	@Generated
	@Selector("init")
	public native UIPresentationController init();

	/**
	 * initWithPresentedViewController:presentingViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/initWithPresentedViewController:presentingViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPresentedViewController:presentingViewController:")
	public native UIPresentationController initWithPresentedViewControllerPresentingViewController(
			UIViewController presentedViewController,
			UIViewController presentingViewController);

	/**
	 * overrideTraitCollection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/overrideTraitCollection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("overrideTraitCollection")
	public native UITraitCollection overrideTraitCollection();

	@Generated
	@Selector("preferredContentSize")
	@ByValue
	public native CGSize preferredContentSize();

	@Generated
	@Selector("preferredContentSizeDidChangeForChildContentContainer:")
	public native void preferredContentSizeDidChangeForChildContentContainer(
			@Mapped(ObjCObjectMapper.class) Object container);

	/**
	 * presentationStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/presentationStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentationStyle")
	@NInt
	public native long presentationStyle();

	/**
	 * presentationTransitionDidEnd:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/presentationTransitionDidEnd:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentationTransitionDidEnd:")
	public native void presentationTransitionDidEnd(boolean completed);

	/**
	 * presentationTransitionWillBegin</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/presentationTransitionWillBegin">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentationTransitionWillBegin")
	public native void presentationTransitionWillBegin();

	/**
	 * presentedView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/presentedView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentedView")
	public native UIView presentedView();

	/**
	 * presentedViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/presentedViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentedViewController")
	public native UIViewController presentedViewController();

	/**
	 * presentingViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/presentingViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentingViewController")
	public native UIViewController presentingViewController();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
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
	 * overrideTraitCollection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instp/UIPresentationController/overrideTraitCollection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOverrideTraitCollection:")
	public native void setOverrideTraitCollection(UITraitCollection value);

	/**
	 * shouldPresentInFullscreen</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/shouldPresentInFullscreen">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldPresentInFullscreen")
	public native boolean shouldPresentInFullscreen();

	/**
	 * shouldRemovePresentersView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPresentationController_class/index.html#//apple_ref/occ/instm/UIPresentationController/shouldRemovePresentersView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldRemovePresentersView")
	public native boolean shouldRemovePresentersView();

	@Generated
	@Selector("sizeForChildContentContainer:withParentContainerSize:")
	@ByValue
	public native CGSize sizeForChildContentContainerWithParentContainerSize(
			@Mapped(ObjCObjectMapper.class) Object container,
			@ByValue CGSize parentSize);

	@Generated
	@Selector("systemLayoutFittingSizeDidChangeForChildContentContainer:")
	public native void systemLayoutFittingSizeDidChangeForChildContentContainer(
			@Mapped(ObjCObjectMapper.class) Object container);

	@Generated
	@Selector("traitCollection")
	public native UITraitCollection traitCollection();

	@Generated
	@Selector("traitCollectionDidChange:")
	public native void traitCollectionDidChange(
			UITraitCollection previousTraitCollection);

	@Generated
	@Selector("viewWillTransitionToSize:withTransitionCoordinator:")
	public native void viewWillTransitionToSizeWithTransitionCoordinator(
			@ByValue CGSize size,
			@Mapped(ObjCObjectMapper.class) Object coordinator);

	@Generated
	@Selector("willTransitionToTraitCollection:withTransitionCoordinator:")
	public native void willTransitionToTraitCollectionWithTransitionCoordinator(
			UITraitCollection newCollection,
			@Mapped(ObjCObjectMapper.class) Object coordinator);

	@Generated
	@Selector("didUpdateFocusInContext:withAnimationCoordinator:")
	public native void didUpdateFocusInContextWithAnimationCoordinator(
			UIFocusUpdateContext context,
			UIFocusAnimationCoordinator coordinator);

	@Generated
	@Selector("preferredFocusedView")
	public native UIView preferredFocusedView();

	@Generated
	@Selector("setNeedsFocusUpdate")
	public native void setNeedsFocusUpdate();

	@Generated
	@Selector("shouldUpdateFocusInContext:")
	public native boolean shouldUpdateFocusInContext(
			UIFocusUpdateContext context);

	@Generated
	@Selector("updateFocusIfNeeded")
	public native void updateFocusIfNeeded();

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
