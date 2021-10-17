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
import apple.uikit.protocol.UISearchControllerDelegate;
import apple.uikit.protocol.UISearchResultsUpdating;
import apple.uikit.protocol.UIViewControllerAnimatedTransitioning;
import apple.uikit.protocol.UIViewControllerContextTransitioning;
import apple.uikit.protocol.UIViewControllerInteractiveTransitioning;
import apple.uikit.protocol.UIViewControllerTransitioningDelegate;
import apple.uikit.protocol.UIViewImplicitlyAnimating;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISearchController extends UIViewController
        implements UIViewControllerTransitioningDelegate, UIViewControllerAnimatedTransitioning {
    static {
        NatJ.register();
    }

    @Generated
    protected UISearchController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISearchController alloc();

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
    @Selector("animateTransition:")
    public native void animateTransition(
            @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    @Generated
    @IsOptional
    @Selector("animationControllerForDismissedController:")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerAnimatedTransitioning animationControllerForDismissedController(
            UIViewController dismissed);

    @Generated
    @IsOptional
    @Selector("animationControllerForPresentedController:presentingController:sourceController:")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerAnimatedTransitioning animationControllerForPresentedControllerPresentingControllerSourceController(
            UIViewController presented, UIViewController presenting, UIViewController source);

    @Generated
    @IsOptional
    @Selector("animationEnded:")
    public native void animationEnded(boolean transitionCompleted);

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISearchControllerDelegate delegate();

    /**
     * default is YES, and has the same behavior as obscuresBackgroundDuringPresentation.
     */
    @Generated
    @Selector("dimsBackgroundDuringPresentation")
    public native boolean dimsBackgroundDuringPresentation();

    /**
     * default is YES
     */
    @Generated
    @Selector("hidesNavigationBarDuringPresentation")
    public native boolean hidesNavigationBarDuringPresentation();

    @Generated
    @Selector("init")
    public native UISearchController init();

    @Generated
    @Selector("initWithCoder:")
    public native UISearchController initWithCoder(NSCoder coder);

    /**
     * Creates a search controller without a results controller
     */
    @Generated
    @Selector("initWithNibName:bundle:")
    public native UISearchController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Pass nil if you wish to display search results in the same view that you are searching. This is not supported on tvOS; please provide a results controller on tvOS.
     */
    @Generated
    @Selector("initWithSearchResultsController:")
    public native UISearchController initWithSearchResultsController(UIViewController searchResultsController);

    @Generated
    @IsOptional
    @Selector("interactionControllerForDismissal:")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerInteractiveTransitioning interactionControllerForDismissal(
            @Mapped(ObjCObjectMapper.class) UIViewControllerAnimatedTransitioning animator);

    @Generated
    @IsOptional
    @Selector("interactionControllerForPresentation:")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerInteractiveTransitioning interactionControllerForPresentation(
            @Mapped(ObjCObjectMapper.class) UIViewControllerAnimatedTransitioning animator);

    @Generated
    @IsOptional
    @Selector("interruptibleAnimatorForTransition:")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewImplicitlyAnimating interruptibleAnimatorForTransition(
            @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    /**
     * Setting this property to YES is a convenience method that performs a default presentation of the search controller appropriate for how the controller is configured. Implement -presentSearchController: if the default presentation is not adequate.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * Setting this property to YES is a convenience method that performs a default presentation of the search controller appropriate for how the controller is configured. Implement -presentSearchController: if the default presentation is not adequate.
     */
    @Generated
    @Selector("setActive:")
    public native void setActive(boolean value);

    /**
     * On iOS, default is NO for apps linked on iOS 15.0 and later, YES otherwise.
     * On tvOS, default is NO when contained in UISearchContainerViewController, YES otherwise.
     */
    @Generated
    @Selector("obscuresBackgroundDuringPresentation")
    public native boolean obscuresBackgroundDuringPresentation();

    @Generated
    @IsOptional
    @Selector("presentationControllerForPresentedViewController:presentingViewController:sourceViewController:")
    public native UIPresentationController presentationControllerForPresentedViewControllerPresentingViewControllerSourceViewController(
            UIViewController presented, UIViewController presenting, UIViewController source);

    /**
     * You are free to become the search bar's delegate to monitor for text changes and button presses.
     */
    @Generated
    @Selector("searchBar")
    public native UISearchBar searchBar();

    @Generated
    @Selector("searchResultsController")
    public native UIViewController searchResultsController();

    /**
     * The object responsible for updating the content of the searchResultsController.
     */
    @Generated
    @Selector("searchResultsUpdater")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISearchResultsUpdating searchResultsUpdater();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UISearchControllerDelegate value);

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
     * default is YES, and has the same behavior as obscuresBackgroundDuringPresentation.
     */
    @Generated
    @Selector("setDimsBackgroundDuringPresentation:")
    public native void setDimsBackgroundDuringPresentation(boolean value);

    /**
     * default is YES
     */
    @Generated
    @Selector("setHidesNavigationBarDuringPresentation:")
    public native void setHidesNavigationBarDuringPresentation(boolean value);

    /**
     * On iOS, default is NO for apps linked on iOS 15.0 and later, YES otherwise.
     * On tvOS, default is NO when contained in UISearchContainerViewController, YES otherwise.
     */
    @Generated
    @Selector("setObscuresBackgroundDuringPresentation:")
    public native void setObscuresBackgroundDuringPresentation(boolean value);

    /**
     * The object responsible for updating the content of the searchResultsController.
     */
    @Generated
    @Selector("setSearchResultsUpdater:")
    public native void setSearchResultsUpdater_unsafe(@Mapped(ObjCObjectMapper.class) UISearchResultsUpdating value);

    /**
     * The object responsible for updating the content of the searchResultsController.
     */
    @Generated
    public void setSearchResultsUpdater(@Mapped(ObjCObjectMapper.class) UISearchResultsUpdating value) {
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
            @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    /**
     * Default YES
     */
    @Generated
    @Selector("automaticallyShowsCancelButton")
    public native boolean automaticallyShowsCancelButton();

    /**
     * Defaults to YES
     */
    @Generated
    @Selector("automaticallyShowsScopeBar")
    public native boolean automaticallyShowsScopeBar();

    /**
     * When true, UISearchController will automatically show its results controller based on the contents of its text property. Defaults to true. Setting the showsSearchResultsController property will change this property to false.
     */
    @Generated
    @Selector("automaticallyShowsSearchResultsController")
    public native boolean automaticallyShowsSearchResultsController();

    /**
     * Default YES
     */
    @Generated
    @Selector("setAutomaticallyShowsCancelButton:")
    public native void setAutomaticallyShowsCancelButton(boolean value);

    /**
     * Defaults to YES
     */
    @Generated
    @Selector("setAutomaticallyShowsScopeBar:")
    public native void setAutomaticallyShowsScopeBar(boolean value);

    /**
     * When true, UISearchController will automatically show its results controller based on the contents of its text property. Defaults to true. Setting the showsSearchResultsController property will change this property to false.
     */
    @Generated
    @Selector("setAutomaticallyShowsSearchResultsController:")
    public native void setAutomaticallyShowsSearchResultsController(boolean value);

    /**
     * Set this property to directly control the visibility of the search results controller. Setting this property changes the automaticallyShowsSearchResultsController property to false.
     */
    @Generated
    @Selector("setShowsSearchResultsController:")
    public native void setShowsSearchResultsController(boolean value);

    /**
     * Set this property to directly control the visibility of the search results controller. Setting this property changes the automaticallyShowsSearchResultsController property to false.
     */
    @Generated
    @Selector("showsSearchResultsController")
    public native boolean showsSearchResultsController();
}
