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
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIPageViewControllerDataSource;
import apple.uikit.protocol.UIPageViewControllerDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPageViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPageViewController allocWithZone(VoidPtr zone);

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
    public static native UIPageViewController new_objc();

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
     * If nil, user gesture-driven navigation will be disabled.
     */
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIPageViewControllerDataSource dataSource();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIPageViewControllerDelegate delegate();

    /**
     * An array of UIGestureRecognizers pre-configured to handle user interaction. Initially attached to a view in the UIPageViewController's hierarchy, they can be placed on an arbitrary view to change the region in which the page view controller will respond to user gestures.
     * Only populated if transition style is 'UIPageViewControllerTransitionStylePageCurl'.
     */
    @Generated
    @Selector("gestureRecognizers")
    public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

    @Generated
    @Selector("init")
    public native UIPageViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UIPageViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIPageViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithTransitionStyle:navigationOrientation:options:")
    public native UIPageViewController initWithTransitionStyleNavigationOrientationOptions(@NInt long style,
            @NInt long navigationOrientation, NSDictionary<String, ?> options);

    /**
     * Default is 'NO'.
     */
    @Generated
    @Selector("isDoubleSided")
    public native boolean isDoubleSided();

    /**
     * Default is 'NO'.
     */
    @Generated
    @Selector("setDoubleSided:")
    public native void setDoubleSided(boolean value);

    @Generated
    @Selector("navigationOrientation")
    @NInt
    public native long navigationOrientation();

    /**
     * If nil, user gesture-driven navigation will be disabled.
     */
    @Generated
    @Selector("setDataSource:")
    public native void setDataSource_unsafe(@Mapped(ObjCObjectMapper.class) UIPageViewControllerDataSource value);

    /**
     * If nil, user gesture-driven navigation will be disabled.
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

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UIPageViewControllerDelegate value);

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
     * Set visible view controllers, optionally with animation. Array should only include view controllers that will be visible after the animation has completed.
     * For transition style 'UIPageViewControllerTransitionStylePageCurl', if 'doubleSided' is 'YES' and the spine location is not 'UIPageViewControllerSpineLocationMid', two view controllers must be included, as the latter view controller is used as the back.
     */
    @Generated
    @Selector("setViewControllers:direction:animated:completion:")
    public native void setViewControllersDirectionAnimatedCompletion(
            NSArray<? extends UIViewController> viewControllers, @NInt long direction, boolean animated,
            @ObjCBlock(name = "call_setViewControllersDirectionAnimatedCompletion") Block_setViewControllersDirectionAnimatedCompletion completion);

    /**
     * If transition style is 'UIPageViewControllerTransitionStylePageCurl', default is 'UIPageViewControllerSpineLocationMin', otherwise 'UIPageViewControllerSpineLocationNone'.
     */
    @Generated
    @Selector("spineLocation")
    @NInt
    public native long spineLocation();

    @Generated
    @Selector("transitionStyle")
    @NInt
    public native long transitionStyle();

    @Generated
    @Selector("viewControllers")
    public native NSArray<? extends UIViewController> viewControllers();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setViewControllersDirectionAnimatedCompletion {
        @Generated
        void call_setViewControllersDirectionAnimatedCompletion(boolean finished);
    }
}
