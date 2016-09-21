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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("barHideOnSwipeGestureRecognizer")
    public native UIPanGestureRecognizer barHideOnSwipeGestureRecognizer();

    @Generated
    @Selector("barHideOnTapGestureRecognizer")
    public native UITapGestureRecognizer barHideOnTapGestureRecognizer();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("hidesBarsOnSwipe")
    public native boolean hidesBarsOnSwipe();

    @Generated
    @Selector("hidesBarsOnTap")
    public native boolean hidesBarsOnTap();

    @Generated
    @Selector("hidesBarsWhenKeyboardAppears")
    public native boolean hidesBarsWhenKeyboardAppears();

    @Generated
    @Selector("hidesBarsWhenVerticallyCompact")
    public native boolean hidesBarsWhenVerticallyCompact();

    @Generated
    @Selector("init")
    public native UINavigationController init();

    @Generated
    @Selector("initWithCoder:")
    public native UINavigationController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native UINavigationController initWithNavigationBarClassToolbarClass(Class navigationBarClass,
            Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UINavigationController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

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

    @Generated
    @Selector("isToolbarHidden")
    public native boolean isToolbarHidden();

    @Generated
    @Selector("setToolbarHidden:")
    public native void setToolbarHidden(boolean value);

    @Generated
    @Selector("navigationBar")
    public native UINavigationBar navigationBar();

    @Generated
    @Selector("popToRootViewControllerAnimated:")
    public native NSArray<? extends UIViewController> popToRootViewControllerAnimated(boolean animated);

    @Generated
    @Selector("popToViewController:animated:")
    public native NSArray<? extends UIViewController> popToViewControllerAnimated(UIViewController viewController,
            boolean animated);

    @Generated
    @Selector("popViewControllerAnimated:")
    public native UIViewController popViewControllerAnimated(boolean animated);

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

    @Generated
    @Selector("setHidesBarsOnSwipe:")
    public native void setHidesBarsOnSwipe(boolean value);

    @Generated
    @Selector("setHidesBarsOnTap:")
    public native void setHidesBarsOnTap(boolean value);

    @Generated
    @Selector("setHidesBarsWhenKeyboardAppears:")
    public native void setHidesBarsWhenKeyboardAppears(boolean value);

    @Generated
    @Selector("setHidesBarsWhenVerticallyCompact:")
    public native void setHidesBarsWhenVerticallyCompact(boolean value);

    @Generated
    @Selector("setNavigationBarHidden:animated:")
    public native void setNavigationBarHiddenAnimated(boolean hidden, boolean animated);

    @Generated
    @Selector("setToolbarHidden:animated:")
    public native void setToolbarHiddenAnimated(boolean hidden, boolean animated);

    @Generated
    @Selector("setViewControllers:")
    public native void setViewControllers(NSArray<? extends UIViewController> value);

    @Generated
    @Selector("setViewControllers:animated:")
    public native void setViewControllersAnimated(NSArray<? extends UIViewController> viewControllers,
            boolean animated);

    @Generated
    @Selector("showViewController:sender:")
    public native void showViewControllerSender(UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("toolbar")
    public native UIToolbar toolbar();

    @Generated
    @Selector("topViewController")
    public native UIViewController topViewController();

    @Generated
    @Selector("viewControllers")
    public native NSArray<? extends UIViewController> viewControllers();

    @Generated
    @Selector("visibleViewController")
    public native UIViewController visibleViewController();
}
