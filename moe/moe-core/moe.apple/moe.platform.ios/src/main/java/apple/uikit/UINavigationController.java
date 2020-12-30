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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UINavigationController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected UINavigationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UINavigationController alloc();

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
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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

    /**
     * The gesture recognizer that triggers if the bars will hide or show due to a swipe. Do not change the delegate or attempt to replace this gesture by overriding this method.
     */
    @Generated
    @Selector("barHideOnSwipeGestureRecognizer")
    public native UIPanGestureRecognizer barHideOnSwipeGestureRecognizer();

    /**
     * The gesture recognizer used to recognize if the bars will hide or show due to a tap in content. Do not change the delegate or attempt to replace this gesture by overriding this method.
     */
    @Generated
    @Selector("barHideOnTapGestureRecognizer")
    public native UITapGestureRecognizer barHideOnTapGestureRecognizer();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    /**
     * When the user swipes, the navigation controller's navigationBar & toolbar will be hidden (on a swipe up) or shown (on a swipe down). The toolbar only participates if it has items.
     */
    @Generated
    @Selector("hidesBarsOnSwipe")
    public native boolean hidesBarsOnSwipe();

    /**
     * When the user taps, the navigation controller's navigationBar & toolbar will be hidden or shown, depending on the hidden state of the navigationBar. The toolbar will only be shown if it has items to display.
     */
    @Generated
    @Selector("hidesBarsOnTap")
    public native boolean hidesBarsOnTap();

    /**
     * When the keyboard appears, the navigation controller's navigationBar toolbar will be hidden. The bars will remain hidden when the keyboard dismisses, but a tap in the content area will show them.
     */
    @Generated
    @Selector("hidesBarsWhenKeyboardAppears")
    public native boolean hidesBarsWhenKeyboardAppears();

    /**
     * When the UINavigationController's vertical size class is compact, hide the UINavigationBar and UIToolbar. Unhandled taps in the regions that would normally be occupied by these bars will reveal the bars.
     */
    @Generated
    @Selector("hidesBarsWhenVerticallyCompact")
    public native boolean hidesBarsWhenVerticallyCompact();

    @Generated
    @Selector("init")
    public native UINavigationController init();

    @Generated
    @Selector("initWithCoder:")
    public native UINavigationController initWithCoder(NSCoder aDecoder);

    /**
     * Use this initializer to make the navigation controller use your custom bar class.
     * Passing nil for navigationBarClass will get you UINavigationBar, nil for toolbarClass gets UIToolbar.
     * The arguments must otherwise be subclasses of the respective UIKit classes.
     */
    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native UINavigationController initWithNavigationBarClassToolbarClass(Class navigationBarClass,
            Class toolbarClass);

    /**
     * Initializes the navigation controller with an empty stack
     */
    @Generated
    @Selector("initWithNibName:bundle:")
    public native UINavigationController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Initializer that also pushes the root view controller without animation.
     */
    @Generated
    @Selector("initWithRootViewController:")
    public native UINavigationController initWithRootViewController(UIViewController rootViewController);

    @Generated
    @Selector("interactivePopGestureRecognizer")
    public native UIGestureRecognizer interactivePopGestureRecognizer();

    @Generated
    @Selector("isNavigationBarHidden")
    public native boolean isNavigationBarHidden();

    @Generated
    @Selector("setNavigationBarHidden:")
    public native void setNavigationBarHidden(boolean value);

    /**
     * Defaults to YES, i.e. hidden.
     */
    @Generated
    @Selector("isToolbarHidden")
    public native boolean isToolbarHidden();

    /**
     * Defaults to YES, i.e. hidden.
     */
    @Generated
    @Selector("setToolbarHidden:")
    public native void setToolbarHidden(boolean value);

    /**
     * The navigation bar managed by the controller. Pushing, popping or setting navigation items on a managed navigation bar is not supported.
     */
    @Generated
    @Selector("navigationBar")
    public native UINavigationBar navigationBar();

    /**
     * Pops until there's only a single view controller left on the stack. Returns the popped controllers.
     */
    @Generated
    @Selector("popToRootViewControllerAnimated:")
    public native NSArray<? extends UIViewController> popToRootViewControllerAnimated(boolean animated);

    /**
     * Pops view controllers until the one specified is on top. Returns the popped controllers.
     */
    @Generated
    @Selector("popToViewController:animated:")
    public native NSArray<? extends UIViewController> popToViewControllerAnimated(UIViewController viewController,
            boolean animated);

    /**
     * Returns the popped controller.
     */
    @Generated
    @Selector("popViewControllerAnimated:")
    public native UIViewController popViewControllerAnimated(boolean animated);

    /**
     * Uses a horizontal slide transition. Has no effect if the view controller is already in the stack.
     */
    @Generated
    @Selector("pushViewController:animated:")
    public native void pushViewControllerAnimated(UIViewController viewController, boolean animated);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

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
     * When the user swipes, the navigation controller's navigationBar & toolbar will be hidden (on a swipe up) or shown (on a swipe down). The toolbar only participates if it has items.
     */
    @Generated
    @Selector("setHidesBarsOnSwipe:")
    public native void setHidesBarsOnSwipe(boolean value);

    /**
     * When the user taps, the navigation controller's navigationBar & toolbar will be hidden or shown, depending on the hidden state of the navigationBar. The toolbar will only be shown if it has items to display.
     */
    @Generated
    @Selector("setHidesBarsOnTap:")
    public native void setHidesBarsOnTap(boolean value);

    /**
     * When the keyboard appears, the navigation controller's navigationBar toolbar will be hidden. The bars will remain hidden when the keyboard dismisses, but a tap in the content area will show them.
     */
    @Generated
    @Selector("setHidesBarsWhenKeyboardAppears:")
    public native void setHidesBarsWhenKeyboardAppears(boolean value);

    /**
     * When the UINavigationController's vertical size class is compact, hide the UINavigationBar and UIToolbar. Unhandled taps in the regions that would normally be occupied by these bars will reveal the bars.
     */
    @Generated
    @Selector("setHidesBarsWhenVerticallyCompact:")
    public native void setHidesBarsWhenVerticallyCompact(boolean value);

    /**
     * Hide or show the navigation bar. If animated, it will transition vertically using UINavigationControllerHideShowBarDuration.
     */
    @Generated
    @Selector("setNavigationBarHidden:animated:")
    public native void setNavigationBarHiddenAnimated(boolean hidden, boolean animated);

    /**
     * Hide or show the toolbar at the bottom of the screen. If animated, it will transition vertically using UINavigationControllerHideShowBarDuration.
     */
    @Generated
    @Selector("setToolbarHidden:animated:")
    public native void setToolbarHiddenAnimated(boolean hidden, boolean animated);

    /**
     * The current view controller stack.
     */
    @Generated
    @Selector("setViewControllers:")
    public native void setViewControllers(NSArray<? extends UIViewController> value);

    /**
     * If animated is YES, then simulate a push or pop depending on whether the new top view controller was previously in the stack.
     */
    @Generated
    @Selector("setViewControllers:animated:")
    public native void setViewControllersAnimated(NSArray<? extends UIViewController> viewControllers,
            boolean animated);

    /**
     * Interpreted as pushViewController:animated:
     */
    @Generated
    @Selector("showViewController:sender:")
    public native void showViewControllerSender(UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * For use when presenting an action sheet.
     */
    @Generated
    @Selector("toolbar")
    public native UIToolbar toolbar();

    /**
     * The top view controller on the stack.
     */
    @Generated
    @Selector("topViewController")
    public native UIViewController topViewController();

    /**
     * The current view controller stack.
     */
    @Generated
    @Selector("viewControllers")
    public native NSArray<? extends UIViewController> viewControllers();

    /**
     * Return modal view controller if it exists. Otherwise the top view controller.
     */
    @Generated
    @Selector("visibleViewController")
    public native UIViewController visibleViewController();
}
