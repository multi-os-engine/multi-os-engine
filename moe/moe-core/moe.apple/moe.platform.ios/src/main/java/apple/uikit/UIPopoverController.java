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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIPopoverControllerDelegate;
import apple.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.2
 * Deprecated-Since: 9.0
 * Deprecated-Message: UIPopoverController is deprecated. Popovers are now implemented as UIViewController
 * presentations. Use a modal presentation style of UIModalPresentationPopover and UIPopoverPresentationController.
 */
@Deprecated
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPopoverController extends NSObject implements UIAppearanceContainer {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPopoverController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPopoverController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPopoverController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIPopoverController new_objc();

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
     * Set popover background color. Set to nil to use default background color. Default is nil.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * The content view controller is the `UIViewController` instance in charge of the content view of the displayed
     * popover. This property can be changed while the popover is displayed to allow different view controllers in the
     * same popover session.
     */
    @NotNull
    @Generated
    @Selector("contentViewController")
    public native UIViewController contentViewController();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIPopoverControllerDelegate delegate();

    /**
     * Called to dismiss the popover programmatically. The delegate methods for "should" and "did" dismiss are not
     * called when the popover is dismissed in this way.
     */
    @Generated
    @Selector("dismissPopoverAnimated:")
    public native void dismissPopoverAnimated(boolean animated);

    @Generated
    @Selector("init")
    public native UIPopoverController init();

    /**
     * The view controller provided becomes the content view controller for the UIPopoverController. This is the
     * designated initializer for UIPopoverController.
     */
    @Generated
    @Selector("initWithContentViewController:")
    public native UIPopoverController initWithContentViewController(@NotNull UIViewController viewController);

    /**
     * Returns whether the popover is visible (presented) or not.
     */
    @Generated
    @Selector("isPopoverVisible")
    public native boolean isPopoverVisible();

    /**
     * By default, a popover disallows interaction with any view outside of the popover while the popover is presented.
     * This property allows the specification of an array of UIView instances which the user is allowed to interact with
     * while the popover is up.
     */
    @Nullable
    @Generated
    @Selector("passthroughViews")
    public native NSArray<? extends UIView> passthroughViews();

    /**
     * Returns the direction the arrow is pointing on a presented popover. Before presentation, this returns
     * UIPopoverArrowDirectionUnknown.
     */
    @Generated
    @Selector("popoverArrowDirection")
    @NUInt
    public native long popoverArrowDirection();

    /**
     * Clients may customize the popover background chrome by providing a class which subclasses
     * `UIPopoverBackgroundView` and which implements the required instance and class methods on that class.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("popoverBackgroundViewClass")
    public native Class popoverBackgroundViewClass();

    /**
     * This property allows direction manipulation of the content size of the popover. Changing the property directly is
     * equivalent to animated=YES. The content size is limited to a minimum width of 320 and a maximum width of 600.
     */
    @Generated
    @Selector("popoverContentSize")
    @ByValue
    public native CGSize popoverContentSize();

    /**
     * Clients may wish to change the available area for popover display. The default implementation of this method
     * always returns insets which define 10 points from the edges of the display, and presentation of popovers always
     * accounts for the status bar. The rectangle being inset is always expressed in terms of the current device
     * orientation; (0, 0) is always in the upper-left of the device. This may require insets to change on device
     * rotation.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("popoverLayoutMargins")
    @ByValue
    public native UIEdgeInsets popoverLayoutMargins();

    /**
     * Like the above, but is a convenience for presentation from a `UIBarButtonItem` instance. arrowDirection limited
     * to UIPopoverArrowDirectionUp/Down
     */
    @Generated
    @Selector("presentPopoverFromBarButtonItem:permittedArrowDirections:animated:")
    public native void presentPopoverFromBarButtonItemPermittedArrowDirectionsAnimated(@NotNull UIBarButtonItem item,
            @NUInt long arrowDirections, boolean animated);

    /**
     * -presentPopoverFromRect:inView:permittedArrowDirections:animated: allows you to present a popover from a rect in
     * a particular view. `arrowDirections` is a bitfield which specifies what arrow directions are allowed when laying
     * out the popover; for most uses, `UIPopoverArrowDirectionAny` is sufficient.
     */
    @Generated
    @Selector("presentPopoverFromRect:inView:permittedArrowDirections:animated:")
    public native void presentPopoverFromRectInViewPermittedArrowDirectionsAnimated(@ByValue CGRect rect,
            @NotNull UIView view, @NUInt long arrowDirections, boolean animated);

    /**
     * Set popover background color. Set to nil to use default background color. Default is nil.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(@Nullable UIColor value);

    /**
     * The content view controller is the `UIViewController` instance in charge of the content view of the displayed
     * popover. This property can be changed while the popover is displayed to allow different view controllers in the
     * same popover session.
     */
    @Generated
    @Selector("setContentViewController:")
    public native void setContentViewController(@NotNull UIViewController value);

    @Generated
    @Selector("setContentViewController:animated:")
    public native void setContentViewControllerAnimated(@NotNull UIViewController viewController, boolean animated);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UIPopoverControllerDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UIPopoverControllerDelegate value) {
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
     * By default, a popover disallows interaction with any view outside of the popover while the popover is presented.
     * This property allows the specification of an array of UIView instances which the user is allowed to interact with
     * while the popover is up.
     */
    @Generated
    @Selector("setPassthroughViews:")
    public native void setPassthroughViews(@Nullable NSArray<? extends UIView> value);

    /**
     * Clients may customize the popover background chrome by providing a class which subclasses
     * `UIPopoverBackgroundView` and which implements the required instance and class methods on that class.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setPopoverBackgroundViewClass:")
    public native void setPopoverBackgroundViewClass(@Nullable Class value);

    /**
     * This property allows direction manipulation of the content size of the popover. Changing the property directly is
     * equivalent to animated=YES. The content size is limited to a minimum width of 320 and a maximum width of 600.
     */
    @Generated
    @Selector("setPopoverContentSize:")
    public native void setPopoverContentSize(@ByValue CGSize value);

    @Generated
    @Selector("setPopoverContentSize:animated:")
    public native void setPopoverContentSizeAnimated(@ByValue CGSize size, boolean animated);

    /**
     * Clients may wish to change the available area for popover display. The default implementation of this method
     * always returns insets which define 10 points from the edges of the display, and presentation of popovers always
     * accounts for the status bar. The rectangle being inset is always expressed in terms of the current device
     * orientation; (0, 0) is always in the upper-left of the device. This may require insets to change on device
     * rotation.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setPopoverLayoutMargins:")
    public native void setPopoverLayoutMargins(@ByValue UIEdgeInsets value);
}
