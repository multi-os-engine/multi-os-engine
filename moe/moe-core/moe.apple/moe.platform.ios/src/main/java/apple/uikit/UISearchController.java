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

/**
 * API-Since: 8.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISearchController extends UIViewController implements UIViewControllerTransitioningDelegate,
        UIViewControllerAnimatedTransitioning {
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISearchController allocWithZone(VoidPtr zone);

    @Deprecated
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
    public static native UISearchController new_objc();

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
     * 
     * API-Since: 8.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
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
     * Pass nil if you wish to display search results in the same view that you are searching. This is not supported on
     * tvOS; please provide a results controller on tvOS.
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
     * Setting this property to YES is a convenience method that performs a default presentation of the search
     * controller appropriate for how the controller is configured. Implement -presentSearchController: if the default
     * presentation is not adequate.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * Setting this property to YES is a convenience method that performs a default presentation of the search
     * controller appropriate for how the controller is configured. Implement -presentSearchController: if the default
     * presentation is not adequate.
     */
    @Generated
    @Selector("setActive:")
    public native void setActive(boolean value);

    /**
     * On iOS, default is NO for apps linked on iOS 15.0 and later, YES otherwise.
     * On tvOS, default is NO when contained in UISearchContainerViewController, YES otherwise.
     * 
     * API-Since: 9.1
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
     * 
     * API-Since: 8.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
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
     * 
     * API-Since: 9.1
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
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("automaticallyShowsCancelButton")
    public native boolean automaticallyShowsCancelButton();

    /**
     * By default, UISearchController will show the search bar's scope bar
     * (when there are at least two scope button titles for the search bar)
     * when search becomes active and hide it when search is dismissed.
     * 
     * Clients can take over showing and hiding the scope bar by setting automaticallyShowsScopeBar
     * to NO and using UISearchBar's showsScopeBar property to manage scope bar visibility.
     * 
     * Additionally, setting the showsScopeBar property on the searchController's searchBar
     * will change the UISearchController's automaticallyShowsScopeBar property to NO.
     * 
     * On iOS, this will be fully deprecated in a future release in favor of `scopeBarActivation`
     * 
     * API-Since: 13.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use scopeBarActivation instead
     */
    @Deprecated
    @Generated
    @Selector("automaticallyShowsScopeBar")
    public native boolean automaticallyShowsScopeBar();

    /**
     * When true, UISearchController will automatically show its results controller based on the contents of its text
     * property. Defaults to true. Setting the showsSearchResultsController property will change this property to false.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("automaticallyShowsSearchResultsController")
    public native boolean automaticallyShowsSearchResultsController();

    /**
     * Default YES
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAutomaticallyShowsCancelButton:")
    public native void setAutomaticallyShowsCancelButton(boolean value);

    /**
     * By default, UISearchController will show the search bar's scope bar
     * (when there are at least two scope button titles for the search bar)
     * when search becomes active and hide it when search is dismissed.
     * 
     * Clients can take over showing and hiding the scope bar by setting automaticallyShowsScopeBar
     * to NO and using UISearchBar's showsScopeBar property to manage scope bar visibility.
     * 
     * Additionally, setting the showsScopeBar property on the searchController's searchBar
     * will change the UISearchController's automaticallyShowsScopeBar property to NO.
     * 
     * On iOS, this will be fully deprecated in a future release in favor of `scopeBarActivation`
     * 
     * API-Since: 13.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use scopeBarActivation instead
     */
    @Deprecated
    @Generated
    @Selector("setAutomaticallyShowsScopeBar:")
    public native void setAutomaticallyShowsScopeBar(boolean value);

    /**
     * When true, UISearchController will automatically show its results controller based on the contents of its text
     * property. Defaults to true. Setting the showsSearchResultsController property will change this property to false.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAutomaticallyShowsSearchResultsController:")
    public native void setAutomaticallyShowsSearchResultsController(boolean value);

    /**
     * Set this property to directly control the visibility of the search results controller. Setting this property
     * changes the automaticallyShowsSearchResultsController property to false.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setShowsSearchResultsController:")
    public native void setShowsSearchResultsController(boolean value);

    /**
     * Set this property to directly control the visibility of the search results controller. Setting this property
     * changes the automaticallyShowsSearchResultsController property to false.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("showsSearchResultsController")
    public native boolean showsSearchResultsController();

    /**
     * Default NO. When YES, the UISearchController will not create its internal child view controller
     * for presenting the list of search suggestions when the searchBarPlacement is stacked.
     * This property is intended to be set at the time that the search controller is initialized.
     * If set after that point, the internal view controller will not be destroyed, but its view will be hidden and
     * remain so.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("ignoresSearchSuggestionsForSearchBarPlacementStacked")
    public native boolean ignoresSearchSuggestionsForSearchBarPlacementStacked();

    /**
     * Controls if and when the UISearchController shows and hides the scope bar
     * However, UISearchBar will not show the scope bar if `scopeButtonTitles` contains fewer than two titles
     * Defaults to `UISearchControllerScopeBarActivationAutomatic`
     * `UISearchControllerScopeBarActivationAutomatic` is equivalent to earlier `automaticallyShowsScopeBar == YES`
     * `UISearchControllerScopeBarActivationManual` is equivalent to earlier `automaticallyShowsScopeBar == NO`
     * Similar to the behavior of `automaticallyShowsScopeBar`, setting the `showsScopeBar` property on the
     * `searchController`'s `searchBar`
     * will change `scopeBarActivation` to `UISearchControllerScopeBarActivationManual`
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("scopeBarActivation")
    @NInt
    public native long scopeBarActivation();

    /**
     * For inspecting the current placement of the search bar when the search controller has been assigned to a
     * UINavigationItem
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("searchBarPlacement")
    @NInt
    public native long searchBarPlacement();

    /**
     * List of search hint objects to be displayed under keyboard on tvOS,
     * as a menu under the search field when the search bar is placed inline on iOS 16,
     * or as a list in front of the searchResultsController when the search bar is stacked.
     * Assigning with new array immediately updates the list on screen.
     * searchSuggestions is set to nil when user interaction selects a suggestion,
     * or when the user otherwise interacts with search (e.g., typing in the search field, choosing a different search
     * scope, canceling search)
     * after dismissing the menu by tapping outside
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("searchSuggestions")
    public native NSArray<?> searchSuggestions();

    /**
     * Default NO. When YES, the UISearchController will not create its internal child view controller
     * for presenting the list of search suggestions when the searchBarPlacement is stacked.
     * This property is intended to be set at the time that the search controller is initialized.
     * If set after that point, the internal view controller will not be destroyed, but its view will be hidden and
     * remain so.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setIgnoresSearchSuggestionsForSearchBarPlacementStacked:")
    public native void setIgnoresSearchSuggestionsForSearchBarPlacementStacked(boolean value);

    /**
     * Controls if and when the UISearchController shows and hides the scope bar
     * However, UISearchBar will not show the scope bar if `scopeButtonTitles` contains fewer than two titles
     * Defaults to `UISearchControllerScopeBarActivationAutomatic`
     * `UISearchControllerScopeBarActivationAutomatic` is equivalent to earlier `automaticallyShowsScopeBar == YES`
     * `UISearchControllerScopeBarActivationManual` is equivalent to earlier `automaticallyShowsScopeBar == NO`
     * Similar to the behavior of `automaticallyShowsScopeBar`, setting the `showsScopeBar` property on the
     * `searchController`'s `searchBar`
     * will change `scopeBarActivation` to `UISearchControllerScopeBarActivationManual`
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setScopeBarActivation:")
    public native void setScopeBarActivation(@NInt long value);

    /**
     * List of search hint objects to be displayed under keyboard on tvOS,
     * as a menu under the search field when the search bar is placed inline on iOS 16,
     * or as a list in front of the searchResultsController when the search bar is stacked.
     * Assigning with new array immediately updates the list on screen.
     * searchSuggestions is set to nil when user interaction selects a suggestion,
     * or when the user otherwise interacts with search (e.g., typing in the search field, choosing a different search
     * scope, canceling search)
     * after dismissing the menu by tapping outside
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSearchSuggestions:")
    public native void setSearchSuggestions(NSArray<?> value);
}
