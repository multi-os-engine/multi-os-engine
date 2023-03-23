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
import apple.uikit.protocol.UIContentContainer;
import apple.uikit.protocol.UIFocusEnvironment;
import apple.uikit.protocol.UIFocusItemContainer;
import apple.uikit.protocol.UITraitEnvironment;
import apple.uikit.protocol.UIViewControllerTransitionCoordinator;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 8.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPresentationController extends NSObject implements UIAppearanceContainer, UITraitEnvironment,
        UIContentContainer, UIFocusEnvironment {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPresentationController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPresentationController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPresentationController allocWithZone(VoidPtr zone);

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
    public static native UIPresentationController new_objc();

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
     * By default this implementation defers to the delegate, if one exists, or returns the current presentation style.
     * UIFormSheetPresentationController, and
     * UIPopoverPresentationController override this implementation to return UIModalPresentationStyleFullscreen if the
     * delegate does not provide an
     * implementation for adaptivePresentationStyleForPresentationController:
     */
    @Generated
    @Selector("adaptivePresentationStyle")
    @NInt
    public native long adaptivePresentationStyle();

    /**
     * API-Since: 8.3
     */
    @Generated
    @Selector("adaptivePresentationStyleForTraitCollection:")
    @NInt
    public native long adaptivePresentationStyleForTraitCollection(UITraitCollection traitCollection);

    /**
     * The view in which a presentation occurs. It is an ancestor of both the presenting and presented view controller's
     * views.
     * This view is being passed to the animation controller.
     */
    @Generated
    @Selector("containerView")
    public native UIView containerView();

    @Generated
    @Selector("containerViewDidLayoutSubviews")
    public native void containerViewDidLayoutSubviews();

    @Generated
    @Selector("containerViewWillLayoutSubviews")
    public native void containerViewWillLayoutSubviews();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    @Generated
    @Selector("dismissalTransitionDidEnd:")
    public native void dismissalTransitionDidEnd(boolean completed);

    @Generated
    @Selector("dismissalTransitionWillBegin")
    public native void dismissalTransitionWillBegin();

    /**
     * Position of the presented view in the container view by the end of the presentation transition.
     * (Default: container view bounds)
     */
    @Generated
    @Selector("frameOfPresentedViewInContainerView")
    @ByValue
    public native CGRect frameOfPresentedViewInContainerView();

    @Generated
    @Selector("init")
    public native UIPresentationController init();

    @Generated
    @Selector("initWithPresentedViewController:presentingViewController:")
    public native UIPresentationController initWithPresentedViewControllerPresentingViewController(
            UIViewController presentedViewController, UIViewController presentingViewController);

    /**
     * Modifies the trait collection for the presentation controller.
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
            @Mapped(ObjCObjectMapper.class) UIContentContainer container);

    @Generated
    @Selector("preferredFocusEnvironments")
    public native NSArray<?> preferredFocusEnvironments();

    @Deprecated
    @Generated
    @IsOptional
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    @Generated
    @Selector("presentationStyle")
    @NInt
    public native long presentationStyle();

    @Generated
    @Selector("presentationTransitionDidEnd:")
    public native void presentationTransitionDidEnd(boolean completed);

    @Generated
    @Selector("presentationTransitionWillBegin")
    public native void presentationTransitionWillBegin();

    /**
     * A view that's going to be animated during the presentation. Must be an ancestor of a presented view controller's
     * view
     * or a presented view controller's view itself.
     * (Default: presented view controller's view)
     */
    @Generated
    @Selector("presentedView")
    public native UIView presentedView();

    @Generated
    @Selector("presentedViewController")
    public native UIViewController presentedViewController();

    @Generated
    @Selector("presentingViewController")
    public native UIViewController presentingViewController();

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
    @Selector("setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();

    /**
     * Modifies the trait collection for the presentation controller.
     */
    @Generated
    @Selector("setOverrideTraitCollection:")
    public native void setOverrideTraitCollection(UITraitCollection value);

    /**
     * By default each new presentation is full screen.
     * This behavior can be overridden with the following method to force a current context presentation.
     * (Default: YES)
     */
    @Generated
    @Selector("shouldPresentInFullscreen")
    public native boolean shouldPresentInFullscreen();

    /**
     * Indicate whether the view controller's view we are transitioning from will be removed from the window in the end
     * of the
     * presentation transition
     * (Default: NO)
     */
    @Generated
    @Selector("shouldRemovePresentersView")
    public native boolean shouldRemovePresentersView();

    @Generated
    @Selector("shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    @Generated
    @Selector("sizeForChildContentContainer:withParentContainerSize:")
    @ByValue
    public native CGSize sizeForChildContentContainerWithParentContainerSize(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container, @ByValue CGSize parentSize);

    @Generated
    @Selector("systemLayoutFittingSizeDidChangeForChildContentContainer:")
    public native void systemLayoutFittingSizeDidChangeForChildContentContainer(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container);

    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();

    @Generated
    @Selector("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);

    @Generated
    @Selector("updateFocusIfNeeded")
    public native void updateFocusIfNeeded();

    @Generated
    @Selector("viewWillTransitionToSize:withTransitionCoordinator:")
    public native void viewWillTransitionToSizeWithTransitionCoordinator(@ByValue CGSize size,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator);

    @Generated
    @Selector("willTransitionToTraitCollection:withTransitionCoordinator:")
    public native void willTransitionToTraitCollectionWithTransitionCoordinator(UITraitCollection newCollection,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator);

    @Generated
    @Selector("focusItemContainer")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusItemContainer focusItemContainer();

    @Generated
    @Selector("parentFocusEnvironment")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusEnvironment parentFocusEnvironment();

    @Generated
    @IsOptional
    @Selector("focusGroupIdentifier")
    public native String focusGroupIdentifier();
}
