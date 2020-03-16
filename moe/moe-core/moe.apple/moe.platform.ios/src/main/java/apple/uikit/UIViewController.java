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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSExtensionContext;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSExtensionRequestHandling;
import apple.mediaplayer.MPMoviePlayerViewController;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIContentContainer;
import apple.uikit.protocol.UIFocusEnvironment;
import apple.uikit.protocol.UILayoutSupport;
import apple.uikit.protocol.UIStateRestoring;
import apple.uikit.protocol.UITraitEnvironment;
import apple.uikit.protocol.UIViewControllerPreviewing;
import apple.uikit.protocol.UIViewControllerPreviewingDelegate;
import apple.uikit.protocol.UIViewControllerRestoration;
import apple.uikit.protocol.UIViewControllerTransitionCoordinator;
import apple.uikit.protocol.UIViewControllerTransitioningDelegate;
import apple.uikit.struct.NSDirectionalEdgeInsets;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIViewController extends UIResponder
        implements NSCoding, UIAppearanceContainer, UITraitEnvironment, UIContentContainer, UIFocusEnvironment,
        UIStateRestoring, NSExtensionRequestHandling {
    static {
        NatJ.register();
    }

    @Generated
    protected UIViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIViewController alloc();

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

    @Generated
    @Selector("addChildViewController:")
    public native void addChildViewController(UIViewController childController);

    @Generated
    @Selector("addKeyCommand:")
    public native void addKeyCommand(UIKeyCommand keyCommand);

    @Generated
    @Selector("allowedChildViewControllersForUnwindingFromSource:")
    public native NSArray<? extends UIViewController> allowedChildViewControllersForUnwindingFromSource(
            UIStoryboardUnwindSegueSource source);

    @Generated
    @Selector("applicationFinishedRestoringState")
    public native void applicationFinishedRestoringState();

    @Generated
    @Selector("automaticallyAdjustsScrollViewInsets")
    public native boolean automaticallyAdjustsScrollViewInsets();

    @Generated
    @Deprecated
    @Selector("automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers")
    public native boolean automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers();

    @Generated
    @Selector("beginAppearanceTransition:animated:")
    public native void beginAppearanceTransitionAnimated(boolean isAppearing, boolean animated);

    @Generated
    @Selector("beginRequestWithExtensionContext:")
    public native void beginRequestWithExtensionContext(NSExtensionContext context);

    @Generated
    @Selector("bottomLayoutGuide")
    @MappedReturn(ObjCObjectMapper.class)
    public native UILayoutSupport bottomLayoutGuide();

    @Generated
    @Selector("canDisplayBannerAds")
    public native boolean canDisplayBannerAds();

    @Generated
    @Selector("canPerformUnwindSegueAction:fromViewController:withSender:")
    public native boolean canPerformUnwindSegueActionFromViewControllerWithSender(SEL action,
            UIViewController fromViewController, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("childViewControllerContainingSegueSource:")
    public native UIViewController childViewControllerContainingSegueSource(UIStoryboardUnwindSegueSource source);

    @Generated
    @Selector("childViewControllerForStatusBarHidden")
    public native UIViewController childViewControllerForStatusBarHidden();

    @Generated
    @Selector("childViewControllerForStatusBarStyle")
    public native UIViewController childViewControllerForStatusBarStyle();

    @Generated
    @Selector("childViewControllers")
    public native NSArray<? extends UIViewController> childViewControllers();

    @Generated
    @Selector("collapseSecondaryViewController:forSplitViewController:")
    public native void collapseSecondaryViewControllerForSplitViewController(UIViewController secondaryViewController,
            UISplitViewController splitViewController);

    @Generated
    @Deprecated
    @Selector("contentSizeForViewInPopover")
    @ByValue
    public native CGSize contentSizeForViewInPopover();

    @Generated
    @Selector("decodeRestorableStateWithCoder:")
    public native void decodeRestorableStateWithCoder(NSCoder coder);

    @Generated
    @Selector("definesPresentationContext")
    public native boolean definesPresentationContext();

    @Generated
    @Deprecated
    @Selector("didAnimateFirstHalfOfRotationToInterfaceOrientation:")
    public native void didAnimateFirstHalfOfRotationToInterfaceOrientation(@NInt long toInterfaceOrientation);

    @Generated
    @Selector("didMoveToParentViewController:")
    public native void didMoveToParentViewController(UIViewController parent);

    @Generated
    @Selector("didReceiveMemoryWarning")
    public native void didReceiveMemoryWarning();

    @Generated
    @Deprecated
    @Selector("didRotateFromInterfaceOrientation:")
    public native void didRotateFromInterfaceOrientation(@NInt long fromInterfaceOrientation);

    @Generated
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    @Generated
    @Selector("disablesAutomaticKeyboardDismissal")
    public native boolean disablesAutomaticKeyboardDismissal();

    @Generated
    @Deprecated
    @Selector("dismissModalViewControllerAnimated:")
    public native void dismissModalViewControllerAnimated(boolean animated);

    @Generated
    @Deprecated
    @Selector("dismissMoviePlayerViewControllerAnimated")
    public native void dismissMoviePlayerViewControllerAnimated();

    @Generated
    @Selector("dismissViewControllerAnimated:completion:")
    public native void dismissViewControllerAnimatedCompletion(boolean flag,
            @ObjCBlock(name = "call_dismissViewControllerAnimatedCompletion") Block_dismissViewControllerAnimatedCompletion completion);

    @Generated
    @Selector("edgesForExtendedLayout")
    @NUInt
    public native long edgesForExtendedLayout();

    @Generated
    @Selector("editButtonItem")
    public native UIBarButtonItem editButtonItem();

    @Generated
    @Selector("encodeRestorableStateWithCoder:")
    public native void encodeRestorableStateWithCoder(NSCoder coder);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("endAppearanceTransition")
    public native void endAppearanceTransition();

    @Generated
    @Selector("extendedLayoutIncludesOpaqueBars")
    public native boolean extendedLayoutIncludesOpaqueBars();

    @Generated
    @Selector("extensionContext")
    public native NSExtensionContext extensionContext();

    @Generated
    @Selector("hidesBottomBarWhenPushed")
    public native boolean hidesBottomBarWhenPushed();

    @Generated
    @Selector("init")
    public native UIViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UIViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Deprecated
    @Selector("interfaceOrientation")
    @NInt
    public native long interfaceOrientation();

    @Generated
    @Selector("interstitialPresentationPolicy")
    @NInt
    public native long interstitialPresentationPolicy();

    @Generated
    @Selector("isBeingDismissed")
    public native boolean isBeingDismissed();

    @Generated
    @Selector("isBeingPresented")
    public native boolean isBeingPresented();

    @Generated
    @Selector("isDisplayingBannerAd")
    public native boolean isDisplayingBannerAd();

    @Generated
    @Selector("isEditing")
    public native boolean isEditing();

    @Generated
    @Selector("setEditing:")
    public native void setEditing(boolean value);

    @Generated
    @Selector("isModalInPopover")
    public native boolean isModalInPopover();

    @Generated
    @Selector("setModalInPopover:")
    public native void setModalInPopover(boolean value);

    @Generated
    @Selector("isMovingFromParentViewController")
    public native boolean isMovingFromParentViewController();

    @Generated
    @Selector("isMovingToParentViewController")
    public native boolean isMovingToParentViewController();

    @Generated
    @Selector("isPresentingFullScreenAd")
    public native boolean isPresentingFullScreenAd();

    @Generated
    @Selector("isViewLoaded")
    public native boolean isViewLoaded();

    @Generated
    @Selector("loadView")
    public native void loadView();

    @Generated
    @Selector("loadViewIfNeeded")
    public native void loadViewIfNeeded();

    @Generated
    @Selector("modalPresentationCapturesStatusBarAppearance")
    public native boolean modalPresentationCapturesStatusBarAppearance();

    @Generated
    @Selector("modalPresentationStyle")
    @NInt
    public native long modalPresentationStyle();

    @Generated
    @Selector("modalTransitionStyle")
    @NInt
    public native long modalTransitionStyle();

    @Generated
    @Deprecated
    @Selector("modalViewController")
    public native UIViewController modalViewController();

    @Generated
    @Selector("navigationController")
    public native UINavigationController navigationController();

    @Generated
    @Selector("navigationItem")
    public native UINavigationItem navigationItem();

    @Generated
    @Selector("nibBundle")
    public native NSBundle nibBundle();

    @Generated
    @Selector("nibName")
    public native String nibName();

    @Generated
    @IsOptional
    @Selector("objectRestorationClass")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object objectRestorationClass();

    @Generated
    @Selector("originalContentView")
    public native UIView originalContentView();

    @Generated
    @Selector("overrideTraitCollectionForChildViewController:")
    public native UITraitCollection overrideTraitCollectionForChildViewController(UIViewController childViewController);

    @Generated
    @Selector("parentViewController")
    public native UIViewController parentViewController();

    @Generated
    @Selector("performSegueWithIdentifier:sender:")
    public native void performSegueWithIdentifierSender(String identifier,
            @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("popoverPresentationController")
    public native UIPopoverPresentationController popoverPresentationController();

    @Generated
    @Selector("preferredContentSize")
    @ByValue
    public native CGSize preferredContentSize();

    @Generated
    @Selector("preferredContentSizeDidChangeForChildContentContainer:")
    public native void preferredContentSizeDidChangeForChildContentContainer(
            @Mapped(ObjCObjectMapper.class) Object container);

    @Generated
    @Selector("preferredFocusEnvironments")
    public native NSArray<?> preferredFocusEnvironments();

    @Generated
    @IsOptional
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    @Generated
    @Selector("preferredInterfaceOrientationForPresentation")
    @NInt
    public native long preferredInterfaceOrientationForPresentation();

    @Generated
    @Selector("preferredStatusBarStyle")
    @NInt
    public native long preferredStatusBarStyle();

    @Generated
    @Selector("preferredStatusBarUpdateAnimation")
    @NInt
    public native long preferredStatusBarUpdateAnimation();

    @Generated
    @Selector("prefersStatusBarHidden")
    public native boolean prefersStatusBarHidden();

    @Generated
    @Selector("prepareForSegue:sender:")
    public native void prepareForSegueSender(UIStoryboardSegue segue, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Deprecated
    @Selector("presentModalViewController:animated:")
    public native void presentModalViewControllerAnimated(UIViewController modalViewController, boolean animated);

    @Generated
    @Deprecated
    @Selector("presentMoviePlayerViewControllerAnimated:")
    public native void presentMoviePlayerViewControllerAnimated(MPMoviePlayerViewController moviePlayerViewController);

    @Generated
    @Selector("presentViewController:animated:completion:")
    public native void presentViewControllerAnimatedCompletion(UIViewController viewControllerToPresent, boolean flag,
            @ObjCBlock(name = "call_presentViewControllerAnimatedCompletion") Block_presentViewControllerAnimatedCompletion completion);

    @Generated
    @Selector("presentationController")
    public native UIPresentationController presentationController();

    @Generated
    @Selector("presentedViewController")
    public native UIViewController presentedViewController();

    @Generated
    @Selector("presentingViewController")
    public native UIViewController presentingViewController();

    @Generated
    @Selector("previewActionItems")
    public native NSArray<?> previewActionItems();

    @Generated
    @Selector("providesPresentationContextTransitionStyle")
    public native boolean providesPresentationContextTransitionStyle();

    @Generated
    @Selector("registerForPreviewingWithDelegate:sourceView:")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerPreviewing registerForPreviewingWithDelegateSourceView(
            @Mapped(ObjCObjectMapper.class) UIViewControllerPreviewingDelegate delegate, UIView sourceView);

    @Generated
    @Selector("removeFromParentViewController")
    public native void removeFromParentViewController();

    @Generated
    @Selector("removeKeyCommand:")
    public native void removeKeyCommand(UIKeyCommand keyCommand);

    @Generated
    @Selector("requestInterstitialAdPresentation")
    public native boolean requestInterstitialAdPresentation();

    @Generated
    @Selector("restorationClass")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerRestoration restorationClass();

    @Generated
    @Selector("restorationIdentifier")
    public native String restorationIdentifier();

    @Generated
    @IsOptional
    @Selector("restorationParent")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object restorationParent();

    @Generated
    @Selector("restoresFocusAfterTransition")
    public native boolean restoresFocusAfterTransition();

    @Generated
    @Deprecated
    @Selector("rotatingFooterView")
    public native UIView rotatingFooterView();

    @Generated
    @Deprecated
    @Selector("rotatingHeaderView")
    public native UIView rotatingHeaderView();

    @Generated
    @Deprecated
    @Selector("searchDisplayController")
    public native UISearchDisplayController searchDisplayController();

    @Generated
    @Deprecated
    @Selector("segueForUnwindingToViewController:fromViewController:identifier:")
    public native UIStoryboardSegue segueForUnwindingToViewControllerFromViewControllerIdentifier(
            UIViewController toViewController, UIViewController fromViewController, String identifier);

    @Generated
    @Selector("separateSecondaryViewControllerForSplitViewController:")
    public native UIViewController separateSecondaryViewControllerForSplitViewController(
            UISplitViewController splitViewController);

    @Generated
    @Selector("setAutomaticallyAdjustsScrollViewInsets:")
    public native void setAutomaticallyAdjustsScrollViewInsets(boolean value);

    @Generated
    @Selector("setCanDisplayBannerAds:")
    public native void setCanDisplayBannerAds(boolean value);

    @Generated
    @Deprecated
    @Selector("setContentSizeForViewInPopover:")
    public native void setContentSizeForViewInPopover(@ByValue CGSize value);

    @Generated
    @Selector("setDefinesPresentationContext:")
    public native void setDefinesPresentationContext(boolean value);

    @Generated
    @Selector("setEdgesForExtendedLayout:")
    public native void setEdgesForExtendedLayout(@NUInt long value);

    @Generated
    @Selector("setEditing:animated:")
    public native void setEditingAnimated(boolean editing, boolean animated);

    @Generated
    @Selector("setExtendedLayoutIncludesOpaqueBars:")
    public native void setExtendedLayoutIncludesOpaqueBars(boolean value);

    @Generated
    @Selector("setHidesBottomBarWhenPushed:")
    public native void setHidesBottomBarWhenPushed(boolean value);

    @Generated
    @Selector("setInterstitialPresentationPolicy:")
    public native void setInterstitialPresentationPolicy(@NInt long value);

    @Generated
    @Selector("setModalPresentationCapturesStatusBarAppearance:")
    public native void setModalPresentationCapturesStatusBarAppearance(boolean value);

    @Generated
    @Selector("setModalPresentationStyle:")
    public native void setModalPresentationStyle(@NInt long value);

    @Generated
    @Selector("setModalTransitionStyle:")
    public native void setModalTransitionStyle(@NInt long value);

    @Generated
    @Selector("setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();

    @Generated
    @Selector("setNeedsStatusBarAppearanceUpdate")
    public native void setNeedsStatusBarAppearanceUpdate();

    @Generated
    @Selector("setOverrideTraitCollection:forChildViewController:")
    public native void setOverrideTraitCollectionForChildViewController(UITraitCollection collection,
            UIViewController childViewController);

    @Generated
    @Selector("setPreferredContentSize:")
    public native void setPreferredContentSize(@ByValue CGSize value);

    @Generated
    @Selector("setProvidesPresentationContextTransitionStyle:")
    public native void setProvidesPresentationContextTransitionStyle(boolean value);

    @Generated
    @Selector("setRestorationClass:")
    public native void setRestorationClass_unsafe(@Mapped(ObjCObjectMapper.class) UIViewControllerRestoration value);

    @Generated
    public void setRestorationClass(@Mapped(ObjCObjectMapper.class) UIViewControllerRestoration value) {
        Object __old = restorationClass();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setRestorationClass_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setRestorationIdentifier:")
    public native void setRestorationIdentifier(String value);

    @Generated
    @Selector("setRestoresFocusAfterTransition:")
    public native void setRestoresFocusAfterTransition(boolean value);

    @Generated
    @Selector("setTabBarItem:")
    public native void setTabBarItem(UITabBarItem value);

    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setToolbarItems:")
    public native void setToolbarItems(NSArray<? extends UIBarButtonItem> value);

    @Generated
    @Selector("setToolbarItems:animated:")
    public native void setToolbarItemsAnimated(NSArray<? extends UIBarButtonItem> toolbarItems, boolean animated);

    @Generated
    @Selector("setTransitioningDelegate:")
    public native void setTransitioningDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitioningDelegate value);

    @Generated
    public void setTransitioningDelegate(@Mapped(ObjCObjectMapper.class) UIViewControllerTransitioningDelegate value) {
        Object __old = transitioningDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTransitioningDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setView:")
    public native void setView(UIView value);

    @Generated
    @Deprecated
    @Selector("setWantsFullScreenLayout:")
    public native void setWantsFullScreenLayout(boolean value);

    @Generated
    @Selector("shouldAutomaticallyForwardAppearanceMethods")
    public native boolean shouldAutomaticallyForwardAppearanceMethods();

    @Generated
    @Deprecated
    @Selector("shouldAutomaticallyForwardRotationMethods")
    public native boolean shouldAutomaticallyForwardRotationMethods();

    @Generated
    @Selector("shouldAutorotate")
    public native boolean shouldAutorotate();

    @Generated
    @Deprecated
    @Selector("shouldAutorotateToInterfaceOrientation:")
    public native boolean shouldAutorotateToInterfaceOrientation(@NInt long toInterfaceOrientation);

    @Generated
    @Selector("shouldPerformSegueWithIdentifier:sender:")
    public native boolean shouldPerformSegueWithIdentifierSender(String identifier,
            @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("shouldPresentInterstitialAd")
    public native boolean shouldPresentInterstitialAd();

    @Generated
    @Selector("shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    @Generated
    @Selector("showDetailViewController:sender:")
    public native void showDetailViewControllerSender(UIViewController vc,
            @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("showViewController:sender:")
    public native void showViewControllerSender(UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("sizeForChildContentContainer:withParentContainerSize:")
    @ByValue
    public native CGSize sizeForChildContentContainerWithParentContainerSize(
            @Mapped(ObjCObjectMapper.class) Object container, @ByValue CGSize parentSize);

    @Generated
    @Selector("splitViewController")
    public native UISplitViewController splitViewController();

    @Generated
    @Selector("storyboard")
    public native UIStoryboard storyboard();

    @Generated
    @Selector("supportedInterfaceOrientations")
    @NUInt
    public native long supportedInterfaceOrientations();

    @Generated
    @Selector("systemLayoutFittingSizeDidChangeForChildContentContainer:")
    public native void systemLayoutFittingSizeDidChangeForChildContentContainer(
            @Mapped(ObjCObjectMapper.class) Object container);

    @Generated
    @Selector("tabBarController")
    public native UITabBarController tabBarController();

    @Generated
    @Selector("tabBarItem")
    public native UITabBarItem tabBarItem();

    @Generated
    @Selector("targetViewControllerForAction:sender:")
    public native UIViewController targetViewControllerForActionSender(SEL action,
            @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("toolbarItems")
    public native NSArray<? extends UIBarButtonItem> toolbarItems();

    @Generated
    @Selector("topLayoutGuide")
    @MappedReturn(ObjCObjectMapper.class)
    public native UILayoutSupport topLayoutGuide();

    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();

    @Generated
    @Selector("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);

    @Generated
    @Selector("transitionCoordinator")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerTransitionCoordinator transitionCoordinator();

    @Generated
    @Selector("transitionFromViewController:toViewController:duration:options:animations:completion:")
    public native void transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion(
            UIViewController fromViewController, UIViewController toViewController, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_4") Block_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_4 animations,
            @ObjCBlock(name = "call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5") Block_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5 completion);

    @Generated
    @Selector("transitioningDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerTransitioningDelegate transitioningDelegate();

    @Generated
    @Selector("unregisterForPreviewingWithContext:")
    public native void unregisterForPreviewingWithContext(
            @Mapped(ObjCObjectMapper.class) UIViewControllerPreviewing previewing);

    @Generated
    @Selector("unwindForSegue:towardsViewController:")
    public native void unwindForSegueTowardsViewController(UIStoryboardSegue unwindSegue,
            UIViewController subsequentVC);

    @Generated
    @Selector("updateFocusIfNeeded")
    public native void updateFocusIfNeeded();

    @Generated
    @Selector("updateViewConstraints")
    public native void updateViewConstraints();

    @Generated
    @Selector("view")
    public native UIView view();

    @Generated
    @Deprecated
    @Selector("viewControllerForUnwindSegueAction:fromViewController:withSender:")
    public native UIViewController viewControllerForUnwindSegueActionFromViewControllerWithSender(SEL action,
            UIViewController fromViewController, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("viewDidAppear:")
    public native void viewDidAppear(boolean animated);

    @Generated
    @Selector("viewDidDisappear:")
    public native void viewDidDisappear(boolean animated);

    @Generated
    @Selector("viewDidLayoutSubviews")
    public native void viewDidLayoutSubviews();

    @Generated
    @Selector("viewDidLoad")
    public native void viewDidLoad();

    @Generated
    @Deprecated
    @Selector("viewDidUnload")
    public native void viewDidUnload();

    @Generated
    @Selector("viewIfLoaded")
    public native UIView viewIfLoaded();

    @Generated
    @Selector("viewWillAppear:")
    public native void viewWillAppear(boolean animated);

    @Generated
    @Selector("viewWillDisappear:")
    public native void viewWillDisappear(boolean animated);

    @Generated
    @Selector("viewWillLayoutSubviews")
    public native void viewWillLayoutSubviews();

    @Generated
    @Selector("viewWillTransitionToSize:withTransitionCoordinator:")
    public native void viewWillTransitionToSizeWithTransitionCoordinator(@ByValue CGSize size,
            @Mapped(ObjCObjectMapper.class) Object coordinator);

    @Generated
    @Deprecated
    @Selector("viewWillUnload")
    public native void viewWillUnload();

    @Generated
    @Deprecated
    @Selector("wantsFullScreenLayout")
    public native boolean wantsFullScreenLayout();

    @Generated
    @Deprecated
    @Selector("willAnimateFirstHalfOfRotationToInterfaceOrientation:duration:")
    public native void willAnimateFirstHalfOfRotationToInterfaceOrientationDuration(@NInt long toInterfaceOrientation,
            double duration);

    @Generated
    @Deprecated
    @Selector("willAnimateRotationToInterfaceOrientation:duration:")
    public native void willAnimateRotationToInterfaceOrientationDuration(@NInt long toInterfaceOrientation,
            double duration);

    @Generated
    @Deprecated
    @Selector("willAnimateSecondHalfOfRotationFromInterfaceOrientation:duration:")
    public native void willAnimateSecondHalfOfRotationFromInterfaceOrientationDuration(
            @NInt long fromInterfaceOrientation, double duration);

    @Generated
    @Selector("willMoveToParentViewController:")
    public native void willMoveToParentViewController(UIViewController parent);

    @Generated
    @Deprecated
    @Selector("willRotateToInterfaceOrientation:duration:")
    public native void willRotateToInterfaceOrientationDuration(@NInt long toInterfaceOrientation, double duration);

    @Generated
    @Selector("willTransitionToTraitCollection:withTransitionCoordinator:")
    public native void willTransitionToTraitCollectionWithTransitionCoordinator(UITraitCollection newCollection,
            @Mapped(ObjCObjectMapper.class) Object coordinator);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dismissViewControllerAnimatedCompletion {
        @Generated
        void call_dismissViewControllerAnimatedCompletion();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentViewControllerAnimatedCompletion {
        @Generated
        void call_presentViewControllerAnimatedCompletion();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_4 {
        @Generated
        void call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_4();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5 {
        @Generated
        void call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5(boolean arg0);
    }

    @Generated
    @Selector("additionalSafeAreaInsets")
    @ByValue
    public native UIEdgeInsets additionalSafeAreaInsets();

    @Generated
    @Selector("childViewControllerForHomeIndicatorAutoHidden")
    public native UIViewController childViewControllerForHomeIndicatorAutoHidden();

    @Generated
    @Selector("childViewControllerForScreenEdgesDeferringSystemGestures")
    public native UIViewController childViewControllerForScreenEdgesDeferringSystemGestures();

    @Generated
    @Selector("preferredScreenEdgesDeferringSystemGestures")
    @NUInt
    public native long preferredScreenEdgesDeferringSystemGestures();

    @Generated
    @Selector("prefersHomeIndicatorAutoHidden")
    public native boolean prefersHomeIndicatorAutoHidden();

    @Generated
    @Selector("setAdditionalSafeAreaInsets:")
    public native void setAdditionalSafeAreaInsets(@ByValue UIEdgeInsets value);

    @Generated
    @Selector("setNeedsUpdateOfHomeIndicatorAutoHidden")
    public native void setNeedsUpdateOfHomeIndicatorAutoHidden();

    @Generated
    @Selector("setNeedsUpdateOfScreenEdgesDeferringSystemGestures")
    public native void setNeedsUpdateOfScreenEdgesDeferringSystemGestures();

    @Generated
    @Selector("setViewRespectsSystemMinimumLayoutMargins:")
    public native void setViewRespectsSystemMinimumLayoutMargins(boolean value);

    @Generated
    @Selector("systemMinimumLayoutMargins")
    @ByValue
    public native NSDirectionalEdgeInsets systemMinimumLayoutMargins();

    @Generated
    @Selector("viewLayoutMarginsDidChange")
    public native void viewLayoutMarginsDidChange();

    @Generated
    @Selector("viewRespectsSystemMinimumLayoutMargins")
    public native boolean viewRespectsSystemMinimumLayoutMargins();

    @Generated
    @Selector("viewSafeAreaInsetsDidChange")
    public native void viewSafeAreaInsetsDidChange();

    @Generated
    @Selector("canPerformUnwindSegueAction:fromViewController:sender:")
    public native boolean canPerformUnwindSegueActionFromViewControllerSender(SEL action,
            UIViewController fromViewController, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("focusItemContainer")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object focusItemContainer();

    @Generated
    @Selector("isModalInPresentation")
    public native boolean isModalInPresentation();

    @Generated
    @Selector("overrideUserInterfaceStyle")
    @NInt
    public native long overrideUserInterfaceStyle();

    @Generated
    @Selector("parentFocusEnvironment")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object parentFocusEnvironment();

    @Generated
    @Selector("performsActionsWhilePresentingModally")
    public native boolean performsActionsWhilePresentingModally();

    @Generated
    @Selector("setModalInPresentation:")
    public native void setModalInPresentation(boolean value);

    @Generated
    @Selector("setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(@NInt long value);
}
