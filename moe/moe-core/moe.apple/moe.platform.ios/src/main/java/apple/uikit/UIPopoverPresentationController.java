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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIPopoverBackgroundViewMethods;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPopoverPresentationController extends UIPresentationController {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPopoverPresentationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPopoverPresentationController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPopoverPresentationController allocWithZone(VoidPtr zone);

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
    public static native UIPopoverPresentationController new_objc();

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
     * Returns the direction the arrow is pointing on a presented popover. Before presentation, this returns
     * UIPopoverArrowDirectionUnknown.
     */
    @Generated
    @Selector("arrowDirection")
    @NUInt
    public native long arrowDirection();

    /**
     * Set popover background color. Set to nil to use default background color. Default is nil.
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    @Generated
    @Selector("barButtonItem")
    public native UIBarButtonItem barButtonItem();

    /**
     * By default, a popover is not allowed to overlap its source view rect.
     * When this is set to YES, popovers with more content than available space are allowed to overlap the source view
     * rect in order to accommodate the content.
     */
    @Generated
    @Selector("canOverlapSourceViewRect")
    public native boolean canOverlapSourceViewRect();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("init")
    public native UIPopoverPresentationController init();

    @Generated
    @Selector("initWithPresentedViewController:presentingViewController:")
    public native UIPopoverPresentationController initWithPresentedViewControllerPresentingViewController(
            UIViewController presentedViewController, UIViewController presentingViewController);

    /**
     * By default, a popover disallows interaction with any view outside of the popover while the popover is presented.
     * This property allows the specification of an array of UIView instances which the user is allowed to interact with
     * while the popover is up.
     */
    @Generated
    @Selector("passthroughViews")
    public native NSArray<? extends UIView> passthroughViews();

    @Generated
    @Selector("permittedArrowDirections")
    @NUInt
    public native long permittedArrowDirections();

    /**
     * Clients may customize the popover background chrome by providing a class which subclasses
     * `UIPopoverBackgroundView`
     * and which implements the required instance and class methods on that class.
     */
    @Generated
    @Selector("popoverBackgroundViewClass")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIPopoverBackgroundViewMethods popoverBackgroundViewClass();

    /**
     * Clients may wish to change the available area for popover display. The default implementation of this method
     * always
     * returns a system defined inset from the edges of the display, and presentation of popovers always accounts
     * for the status bar. The rectangle being inset is always expressed in terms of the current device orientation; (0,
     * 0)
     * is always in the upper-left of the device. This may require insets to change on device rotation.
     */
    @Generated
    @Selector("popoverLayoutMargins")
    @ByValue
    public native UIEdgeInsets popoverLayoutMargins();

    /**
     * Set popover background color. Set to nil to use default background color. Default is nil.
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    @Generated
    @Selector("setBarButtonItem:")
    public native void setBarButtonItem(UIBarButtonItem value);

    /**
     * By default, a popover is not allowed to overlap its source view rect.
     * When this is set to YES, popovers with more content than available space are allowed to overlap the source view
     * rect in order to accommodate the content.
     */
    @Generated
    @Selector("setCanOverlapSourceViewRect:")
    public native void setCanOverlapSourceViewRect(boolean value);

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
     * By default, a popover disallows interaction with any view outside of the popover while the popover is presented.
     * This property allows the specification of an array of UIView instances which the user is allowed to interact with
     * while the popover is up.
     */
    @Generated
    @Selector("setPassthroughViews:")
    public native void setPassthroughViews(NSArray<? extends UIView> value);

    @Generated
    @Selector("setPermittedArrowDirections:")
    public native void setPermittedArrowDirections(@NUInt long value);

    /**
     * Clients may customize the popover background chrome by providing a class which subclasses
     * `UIPopoverBackgroundView`
     * and which implements the required instance and class methods on that class.
     */
    @Generated
    @Selector("setPopoverBackgroundViewClass:")
    public native void setPopoverBackgroundViewClass(
            @Mapped(ObjCObjectMapper.class) UIPopoverBackgroundViewMethods value);

    /**
     * Clients may wish to change the available area for popover display. The default implementation of this method
     * always
     * returns a system defined inset from the edges of the display, and presentation of popovers always accounts
     * for the status bar. The rectangle being inset is always expressed in terms of the current device orientation; (0,
     * 0)
     * is always in the upper-left of the device. This may require insets to change on device rotation.
     */
    @Generated
    @Selector("setPopoverLayoutMargins:")
    public native void setPopoverLayoutMargins(@ByValue UIEdgeInsets value);

    /**
     * The rectangle in the coordinate space of sourceView that the popover should point at. This property is ignored if
     * a barButtonItem is set.
     * Starting in iOS 13.2, a value of CGRectNull will cause the popover to point at the current frame of sourceView
     * and automatically update when the size of sourceView changes. Prior to iOS 13.2, a null rectangle was not
     * supported.
     * The default value in iOS 13.2 is CGRectNull. Prior to iOS 13.2, the default value was CGRectZero.
     */
    @Generated
    @Selector("setSourceRect:")
    public native void setSourceRect(@ByValue CGRect value);

    @Generated
    @Selector("setSourceView:")
    public native void setSourceView(UIView value);

    /**
     * The rectangle in the coordinate space of sourceView that the popover should point at. This property is ignored if
     * a barButtonItem is set.
     * Starting in iOS 13.2, a value of CGRectNull will cause the popover to point at the current frame of sourceView
     * and automatically update when the size of sourceView changes. Prior to iOS 13.2, a null rectangle was not
     * supported.
     * The default value in iOS 13.2 is CGRectNull. Prior to iOS 13.2, the default value was CGRectZero.
     */
    @Generated
    @Selector("sourceRect")
    @ByValue
    public native CGRect sourceRect();

    @Generated
    @Selector("sourceView")
    public native UIView sourceView();

    /**
     * The UISheetPresentationController instance this popover will adapt to in compact size classes. Access this
     * instance to customize or adjust the adaptive sheet.
     */
    @Generated
    @Selector("adaptiveSheetPresentationController")
    public native UISheetPresentationController adaptiveSheetPresentationController();
}
