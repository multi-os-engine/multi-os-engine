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
    @Owned
    @Selector("alloc")
    public static native UINavigationController alloc();

    /**
     * barHideOnSwipeGestureRecognizer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/barHideOnSwipeGestureRecognizer">iOS Dev Center</a>
     */
    @Generated
    @Selector("barHideOnSwipeGestureRecognizer")
    public native UIPanGestureRecognizer barHideOnSwipeGestureRecognizer();

    /**
     * barHideOnTapGestureRecognizer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/barHideOnTapGestureRecognizer">iOS Dev Center</a>
     */
    @Generated
    @Selector("barHideOnTapGestureRecognizer")
    public native UITapGestureRecognizer barHideOnTapGestureRecognizer();

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    /**
     * hidesBarsOnSwipe</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/hidesBarsOnSwipe">iOS Dev Center</a>
     */
    @Generated
    @Selector("hidesBarsOnSwipe")
    public native boolean hidesBarsOnSwipe();

    /**
     * hidesBarsOnTap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/hidesBarsOnTap">iOS Dev Center</a>
     */
    @Generated
    @Selector("hidesBarsOnTap")
    public native boolean hidesBarsOnTap();

    /**
     * hidesBarsWhenKeyboardAppears</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/hidesBarsWhenKeyboardAppears">iOS Dev Center</a>
     */
    @Generated
    @Selector("hidesBarsWhenKeyboardAppears")
    public native boolean hidesBarsWhenKeyboardAppears();

    /**
     * hidesBarsWhenVerticallyCompact</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/hidesBarsWhenVerticallyCompact">iOS Dev Center</a>
     */
    @Generated
    @Selector("hidesBarsWhenVerticallyCompact")
    public native boolean hidesBarsWhenVerticallyCompact();

    @Generated
    @Selector("init")
    public native UINavigationController init();

    /**
     * initWithNavigationBarClass:toolbarClass:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/initWithNavigationBarClass:toolbarClass:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native UINavigationController initWithNavigationBarClassToolbarClass(Class navigationBarClass,
            Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UINavigationController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * initWithRootViewController:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/initWithRootViewController:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithRootViewController:")
    public native UINavigationController initWithRootViewController(UIViewController rootViewController);

    /**
     * interactivePopGestureRecognizer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/interactivePopGestureRecognizer">iOS Dev Center</a>
     */
    @Generated
    @Selector("interactivePopGestureRecognizer")
    public native UIGestureRecognizer interactivePopGestureRecognizer();

    /**
     * navigationBarHidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/navigationBarHidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("isNavigationBarHidden")
    public native boolean isNavigationBarHidden();

    /**
     * toolbarHidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/toolbarHidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("isToolbarHidden")
    public native boolean isToolbarHidden();

    /**
     * navigationBar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/navigationBar">iOS Dev Center</a>
     */
    @Generated
    @Selector("navigationBar")
    public native UINavigationBar navigationBar();

    /**
     * popToRootViewControllerAnimated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/popToRootViewControllerAnimated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("popToRootViewControllerAnimated:")
    public native NSArray<? extends UIViewController> popToRootViewControllerAnimated(boolean animated);

    /**
     * popToViewController:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/popToViewController:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("popToViewController:animated:")
    public native NSArray<? extends UIViewController> popToViewControllerAnimated(UIViewController viewController,
            boolean animated);

    /**
     * popViewControllerAnimated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/popViewControllerAnimated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("popViewControllerAnimated:")
    public native UIViewController popViewControllerAnimated(boolean animated);

    /**
     * pushViewController:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/pushViewController:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pushViewController:animated:")
    public native void pushViewControllerAnimated(UIViewController viewController, boolean animated);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/delegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * delegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/delegate">iOS Dev Center</a>
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
     * hidesBarsOnSwipe</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/hidesBarsOnSwipe">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHidesBarsOnSwipe:")
    public native void setHidesBarsOnSwipe(boolean value);

    /**
     * hidesBarsOnTap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/hidesBarsOnTap">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHidesBarsOnTap:")
    public native void setHidesBarsOnTap(boolean value);

    /**
     * hidesBarsWhenKeyboardAppears</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/hidesBarsWhenKeyboardAppears">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHidesBarsWhenKeyboardAppears:")
    public native void setHidesBarsWhenKeyboardAppears(boolean value);

    /**
     * hidesBarsWhenVerticallyCompact</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/hidesBarsWhenVerticallyCompact">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHidesBarsWhenVerticallyCompact:")
    public native void setHidesBarsWhenVerticallyCompact(boolean value);

    /**
     * navigationBarHidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/navigationBarHidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNavigationBarHidden:")
    public native void setNavigationBarHidden(boolean value);

    /**
     * setNavigationBarHidden:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/setNavigationBarHidden:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNavigationBarHidden:animated:")
    public native void setNavigationBarHiddenAnimated(boolean hidden, boolean animated);

    /**
     * toolbarHidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/toolbarHidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("setToolbarHidden:")
    public native void setToolbarHidden(boolean value);

    /**
     * setToolbarHidden:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/setToolbarHidden:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setToolbarHidden:animated:")
    public native void setToolbarHiddenAnimated(boolean hidden, boolean animated);

    /**
     * viewControllers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/viewControllers">iOS Dev Center</a>
     */
    @Generated
    @Selector("setViewControllers:")
    public native void setViewControllers(NSArray<? extends UIViewController> value);

    /**
     * setViewControllers:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/setViewControllers:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setViewControllers:animated:")
    public native void setViewControllersAnimated(NSArray<? extends UIViewController> viewControllers,
            boolean animated);

    /**
     * showViewController:sender:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instm/UINavigationController/showViewController:sender:">iOS Dev Center</a>
     */
    @Generated
    @Selector("showViewController:sender:")
    public native void showViewControllerSender(UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * toolbar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/toolbar">iOS Dev Center</a>
     */
    @Generated
    @Selector("toolbar")
    public native UIToolbar toolbar();

    /**
     * topViewController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/topViewController">iOS Dev Center</a>
     */
    @Generated
    @Selector("topViewController")
    public native UIViewController topViewController();

    /**
     * viewControllers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/viewControllers">iOS Dev Center</a>
     */
    @Generated
    @Selector("viewControllers")
    public native NSArray<? extends UIViewController> viewControllers();

    /**
     * visibleViewController</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UINavigationController_Class/index.html#//apple_ref/occ/instp/UINavigationController/visibleViewController">iOS Dev Center</a>
     */
    @Generated
    @Selector("visibleViewController")
    public native UIViewController visibleViewController();

    @Generated
    @Selector("initWithCoder:")
    public native UINavigationController initWithCoder(NSCoder aDecoder);

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
    @Selector("initialize")
    public static native void initialize();

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
    public static native long version();
}
