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
import apple.foundation.NSExtensionContext;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSExtensionRequestHandling;
import apple.mediaplayer.MPMoviePlayerViewController;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIContentContainer;
import apple.uikit.protocol.UIFocusEnvironment;
import apple.uikit.protocol.UIFocusItemContainer;
import apple.uikit.protocol.UILayoutSupport;
import apple.uikit.protocol.UIObjectRestoration;
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
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIViewController extends UIResponder implements NSCoding, UIAppearanceContainer, UITraitEnvironment,
        UIContentContainer, UIFocusEnvironment, UIStateRestoring, NSExtensionRequestHandling {
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIViewController allocWithZone(VoidPtr zone);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Please use instance method `setNeedsUpdateOfSupportedInterfaceOrientations`.
     */
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
    public static native UIViewController new_objc();

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
     * If the child controller has a different parent controller, it will first be removed from its current parent
     * by calling removeFromParentViewController. If this method is overridden then the super implementation must
     * be called.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("addChildViewController:")
    public native void addChildViewController(UIViewController childController);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("addKeyCommand:")
    public native void addKeyCommand(UIKeyCommand keyCommand);

    /**
     * Returns a subset of the receiver's childViewControllers in the order they should be searched for an unwind
     * destination.
     * The default implementation first sends itself -childViewControllerContainingSegueSource:, then returns a copy of
     * its childViewControllers array excluding that object. A custom container view controller can override this method
     * to affect the order in which its children are searched, or to modify the result of the default implementation.
     * For compatibility, if a view controller overrides the deprecated
     * -viewControllerForUnwindSegueAction:fromViewController:sender: method, but does not override this method, it will
     * receive the deprecated method instead of this method.
     * To affect this view controller's eligibility as an unwind destination, override
     * -canPerformUnwindSegueAction:fromViewController:sender: instead.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowedChildViewControllersForUnwindingFromSource:")
    public native NSArray<? extends UIViewController> allowedChildViewControllersForUnwindingFromSource(
            UIStoryboardUnwindSegueSource source);

    @Generated
    @Selector("applicationFinishedRestoringState")
    public native void applicationFinishedRestoringState();

    /**
     * Defaults to YES
     * 
     * API-Since: 7.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use UIScrollView's contentInsetAdjustmentBehavior instead
     */
    @Deprecated
    @Generated
    @Selector("automaticallyAdjustsScrollViewInsets")
    public native boolean automaticallyAdjustsScrollViewInsets();

    /**
     * This method is consulted to determine if a view controller manually forwards its containment callbacks to
     * any children view controllers. Subclasses of UIViewController that implement containment logic may override
     * this method. The default implementation returns YES. If it is overridden and returns NO, then the subclass is
     * responsible for forwarding the following methods as appropriate - viewWillAppear: viewDidAppear:
     * viewWillDisappear:
     * viewDidDisappear: willRotateToInterfaceOrientation:duration:
     * willAnimateRotationToInterfaceOrientation:duration: didRotateFromInterfaceOrientation:
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers")
    public native boolean automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers();

    /**
     * If a custom container controller manually forwards its appearance callbacks, then rather than calling
     * viewWillAppear:, viewDidAppear: viewWillDisappear:, or viewDidDisappear: on the children these methods
     * should be used instead. This will ensure that descendent child controllers appearance methods will be
     * invoked. It also enables more complex custom transitions to be implemented since the appearance callbacks are
     * now tied to the final matching invocation of endAppearanceTransition.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("beginAppearanceTransition:animated:")
    public native void beginAppearanceTransitionAnimated(boolean isAppearing, boolean animated);

    @Generated
    @Selector("beginRequestWithExtensionContext:")
    public native void beginRequestWithExtensionContext(NSExtensionContext context);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use view.safeAreaLayoutGuide.bottomAnchor instead of bottomLayoutGuide.topAnchor
     */
    @Deprecated
    @Generated
    @Selector("bottomLayoutGuide")
    @MappedReturn(ObjCObjectMapper.class)
    public native UILayoutSupport bottomLayoutGuide();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("canPerformUnwindSegueAction:fromViewController:withSender:")
    public native boolean canPerformUnwindSegueActionFromViewControllerWithSender(SEL action,
            UIViewController fromViewController, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Returns the child view controller that contains the provided segue source.
     * Custom container view controllers should call this method from their implementation of
     * -allowedChildViewControllersForUnwindingFromSource: to exclude the result from the returned array, as well as to
     * determine the order of the returned array's contents.
     * Do not try to re-implement or override this method; it takes special care to handle situations such as unwinding
     * from a modally-presented view controller.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("childViewControllerContainingSegueSource:")
    public native UIViewController childViewControllerContainingSegueSource(UIStoryboardUnwindSegueSource source);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("childViewControllerForStatusBarHidden")
    public native UIViewController childViewControllerForStatusBarHidden();

    /**
     * Override to return a child view controller or nil. If non-nil, that view controller's status bar appearance
     * attributes will be used. If nil, self is used. Whenever the return values from these methods change,
     * -setNeedsStatusBarAppearanceUpdate should be called.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("childViewControllerForStatusBarStyle")
    public native UIViewController childViewControllerForStatusBarStyle();

    /**
     * An array of children view controllers. This array does not include any presented view controllers.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("childViewControllers")
    public native NSArray<? extends UIViewController> childViewControllers();

    /**
     * Called on the primary view controller when a split view controller is collapsing its children for a transition to
     * a compact-width size class, if its delegate does not provide overridden behavior. The default implementation
     * simply shows the primary (the secondary controller disappears.)
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("collapseSecondaryViewController:forSplitViewController:")
    public native void collapseSecondaryViewControllerForSplitViewController(UIViewController secondaryViewController,
            UISplitViewController splitViewController);

    /**
     * contentSizeForViewInPopover allows you to set the size of the content from within the view controller. This
     * property is read/write, and you should generally not override it.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("contentSizeForViewInPopover")
    @ByValue
    public native CGSize contentSizeForViewInPopover();

    @Generated
    @Selector("decodeRestorableStateWithCoder:")
    public native void decodeRestorableStateWithCoder(NSCoder coder);

    /**
     * Determines which parent view controller's view should be presented over for presentations of type
     * UIModalPresentationCurrentContext. If no ancestor view controller has this flag set, then the presenter
     * will be the root view controller.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("definesPresentationContext")
    public native boolean definesPresentationContext();

    /**
     * The rotating header and footer views are offscreen.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 5.0
     */
    @Generated
    @Deprecated
    @Selector("didAnimateFirstHalfOfRotationToInterfaceOrientation:")
    public native void didAnimateFirstHalfOfRotationToInterfaceOrientation(@NInt long toInterfaceOrientation);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("didMoveToParentViewController:")
    public native void didMoveToParentViewController(UIViewController parent);

    /**
     * Called when the parent application receives a memory warning. On iOS 6.0 it will no longer clear the view by
     * default.
     */
    @Generated
    @Selector("didReceiveMemoryWarning")
    public native void didReceiveMemoryWarning();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("didRotateFromInterfaceOrientation:")
    public native void didRotateFromInterfaceOrientation(@NInt long fromInterfaceOrientation);

    @Generated
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    /**
     * Presentation modes may keep the keyboard visible when not required. Default implementation affects
     * UIModalPresentationFormSheet visibility.
     * 
     * API-Since: 4.3
     */
    @Generated
    @Selector("disablesAutomaticKeyboardDismissal")
    public native boolean disablesAutomaticKeyboardDismissal();

    /**
     * Dismiss the current modal child. Uses a vertical sheet transition if animated. This method has been replaced by
     * dismissViewControllerAnimated:completion:
     * 
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("dismissModalViewControllerAnimated:")
    public native void dismissModalViewControllerAnimated(boolean animated);

    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit.
     */
    @Generated
    @Deprecated
    @Selector("dismissMoviePlayerViewControllerAnimated")
    public native void dismissMoviePlayerViewControllerAnimated();

    /**
     * The completion handler, if provided, will be invoked after the dismissed controller's viewDidDisappear: callback
     * is invoked.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("dismissViewControllerAnimated:completion:")
    public native void dismissViewControllerAnimatedCompletion(boolean flag,
            @ObjCBlock(name = "call_dismissViewControllerAnimatedCompletion") Block_dismissViewControllerAnimatedCompletion completion);

    /**
     * Defaults to UIRectEdgeAll
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("edgesForExtendedLayout")
    @NUInt
    public native long edgesForExtendedLayout();

    /**
     * Return an Edit|Done button that can be used as a navigation item's custom view. Default action toggles the
     * editing state with animation.
     */
    @Generated
    @Selector("editButtonItem")
    public native UIBarButtonItem editButtonItem();

    @Generated
    @Selector("encodeRestorableStateWithCoder:")
    public native void encodeRestorableStateWithCoder(NSCoder coder);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("endAppearanceTransition")
    public native void endAppearanceTransition();

    /**
     * Defaults to NO, but bars are translucent by default on 7_0.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("extendedLayoutIncludesOpaqueBars")
    public native boolean extendedLayoutIncludesOpaqueBars();

    /**
     * Returns the extension context. Also acts as a convenience method for a view controller to check if it
     * participating in an extension request.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("extensionContext")
    public native NSExtensionContext extensionContext();

    /**
     * If YES, then when this view controller is pushed into a controller hierarchy with a bottom bar (like a tab bar),
     * the bottom bar will slide out. Default is NO.
     */
    @Generated
    @Selector("hidesBottomBarWhenPushed")
    public native boolean hidesBottomBarWhenPushed();

    @Generated
    @Selector("init")
    public native UIViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UIViewController initWithCoder(NSCoder coder);

    /**
     * The designated initializer. If you subclass UIViewController, you must call the super implementation of this
     * method, even if you aren't using a NIB. (As a convenience, the default init method will do this for you,
     * and specify nil for both of this methods arguments.) In the specified NIB, the File's Owner proxy should
     * have its class set to your view controller subclass, with the view outlet connected to the main view. If you
     * invoke this method with a nil nib name, then this class' -loadView method will attempt to load a NIB whose
     * name is the same as your view controller's class. If no such NIB in fact exists then you must either call
     * -setView: before -view is invoked, or override the -loadView method to set up your views programatically.
     */
    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("interfaceOrientation")
    @NInt
    public native long interfaceOrientation();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("isBeingDismissed")
    public native boolean isBeingDismissed();

    /**
     * These four methods can be used in a view controller's appearance callbacks to determine if it is being
     * presented, dismissed, or added or removed as a child view controller. For example, a view controller can
     * check if it is disappearing because it was dismissed or popped by asking itself in its viewWillDisappear:
     * method by checking the expression ([self isBeingDismissed] || [self isMovingFromParentViewController]).
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("isBeingPresented")
    public native boolean isBeingPresented();

    @Generated
    @Selector("isEditing")
    public native boolean isEditing();

    @Generated
    @Selector("setEditing:")
    public native void setEditing(boolean value);

    /**
     * modalInPopover is set on the view controller when you wish to force the popover hosting the view controller into
     * modal behavior. When this is active, the popover will ignore events outside of its bounds until this is set to
     * NO.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("isModalInPopover")
    public native boolean isModalInPopover();

    /**
     * modalInPopover is set on the view controller when you wish to force the popover hosting the view controller into
     * modal behavior. When this is active, the popover will ignore events outside of its bounds until this is set to
     * NO.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("setModalInPopover:")
    public native void setModalInPopover(boolean value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("isMovingFromParentViewController")
    public native boolean isMovingFromParentViewController();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("isMovingToParentViewController")
    public native boolean isMovingToParentViewController();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("isViewLoaded")
    public native boolean isViewLoaded();

    /**
     * This is where subclasses should create their custom view hierarchy if they aren't using a nib. Should never be
     * called directly.
     */
    @Generated
    @Selector("loadView")
    public native void loadView();

    /**
     * Loads the view controller's view if it has not already been set.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("loadViewIfNeeded")
    public native void loadViewIfNeeded();

    /**
     * This controls whether this view controller takes over control of the status bar's appearance when presented
     * non-full screen on another view controller. Defaults to NO.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("modalPresentationCapturesStatusBarAppearance")
    public native boolean modalPresentationCapturesStatusBarAppearance();

    /**
     * Defines the presentation style that will be used for this view controller when it is presented modally. Set this
     * property on the view controller to be presented, not the presenter.
     * If this property has been set to UIModalPresentationAutomatic, reading it will always return a concrete
     * presentation style. By default UIViewController resolves UIModalPresentationAutomatic to
     * UIModalPresentationPageSheet, but system-provided subclasses may resolve UIModalPresentationAutomatic to other
     * concrete presentation styles. Participation in the resolution of UIModalPresentationAutomatic is reserved for
     * system-provided view controllers.
     * Defaults to UIModalPresentationAutomatic on iOS starting in iOS 13.0, and UIModalPresentationFullScreen on
     * previous versions. Defaults to UIModalPresentationFullScreen on all other platforms.
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("modalPresentationStyle")
    @NInt
    public native long modalPresentationStyle();

    /**
     * Defines the transition style that will be used for this view controller when it is presented modally. Set
     * this property on the view controller to be presented, not the presenter. Defaults to
     * UIModalTransitionStyleCoverVertical.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("modalTransitionStyle")
    @NInt
    public native long modalTransitionStyle();

    /**
     * This property has been replaced by presentedViewController.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("modalViewController")
    public native UIViewController modalViewController();

    /**
     * If this view controller has been pushed onto a navigation controller, return it.
     */
    @Generated
    @Selector("navigationController")
    public native UINavigationController navigationController();

    /**
     * Created on-demand so that a view controller may customize its navigation appearance.
     */
    @Generated
    @Selector("navigationItem")
    public native UINavigationItem navigationItem();

    /**
     * The bundle from which to load the nib.
     */
    @Generated
    @Selector("nibBundle")
    public native NSBundle nibBundle();

    /**
     * The name of the nib to be loaded to instantiate the view.
     */
    @Generated
    @Selector("nibName")
    public native String nibName();

    @Generated
    @IsOptional
    @Selector("objectRestorationClass")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIObjectRestoration objectRestorationClass();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("overrideTraitCollectionForChildViewController:")
    public native UITraitCollection overrideTraitCollectionForChildViewController(UIViewController childViewController);

    /**
     * If this view controller is a child of a containing view controller (e.g. a navigation controller or tab bar
     * controller,) this is the containing view controller. Note that as of 5.0 this no longer will return the
     * presenting view controller.
     */
    @Generated
    @Selector("parentViewController")
    public native UIViewController parentViewController();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("performSegueWithIdentifier:sender:")
    public native void performSegueWithIdentifierSender(String identifier,
            @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * API-Since: 8.0
     */
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
            @Mapped(ObjCObjectMapper.class) UIContentContainer container);

    @Generated
    @Selector("preferredFocusEnvironments")
    public native NSArray<?> preferredFocusEnvironments();

    @Deprecated
    @Generated
    @IsOptional
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    /**
     * Returns interface orientation masks.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("preferredInterfaceOrientationForPresentation")
    @NInt
    public native long preferredInterfaceOrientationForPresentation();

    /**
     * Defaults to UIStatusBarStyleDefault
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("preferredStatusBarStyle")
    @NInt
    public native long preferredStatusBarStyle();

    /**
     * Defaults to UIStatusBarAnimationFade
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("preferredStatusBarUpdateAnimation")
    @NInt
    public native long preferredStatusBarUpdateAnimation();

    /**
     * Defaults to NO
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("prefersStatusBarHidden")
    public native boolean prefersStatusBarHidden();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("prepareForSegue:sender:")
    public native void prepareForSegueSender(UIStoryboardSegue segue, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Display another view controller as a modal child. Uses a vertical sheet transition if animated.This method has
     * been replaced by presentViewController:animated:completion:
     * 
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("presentModalViewController:animated:")
    public native void presentModalViewControllerAnimated(UIViewController modalViewController, boolean animated);

    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit.
     */
    @Generated
    @Deprecated
    @Selector("presentMoviePlayerViewControllerAnimated:")
    public native void presentMoviePlayerViewControllerAnimated(MPMoviePlayerViewController moviePlayerViewController);

    /**
     * The next two methods are replacements for presentModalViewController:animated and
     * dismissModalViewControllerAnimated: The completion handler, if provided, will be invoked after the presented
     * controllers viewDidAppear: callback is invoked.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("presentViewController:animated:completion:")
    public native void presentViewControllerAnimatedCompletion(UIViewController viewControllerToPresent, boolean flag,
            @ObjCBlock(name = "call_presentViewControllerAnimatedCompletion") Block_presentViewControllerAnimatedCompletion completion);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("presentationController")
    public native UIPresentationController presentationController();

    /**
     * The view controller that was presented by this view controller or its nearest ancestor.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("presentedViewController")
    public native UIViewController presentedViewController();

    /**
     * The view controller that presented this view controller (or its farthest ancestor.)
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("presentingViewController")
    public native UIViewController presentingViewController();

    /**
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: UIViewControllerPreviewing is deprecated. Please use UIContextMenuInteraction.
     */
    @Deprecated
    @Generated
    @Selector("previewActionItems")
    public native NSArray<?> previewActionItems();

    /**
     * A controller that defines the presentation context can also specify the modal transition style if this property
     * is true.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("providesPresentationContextTransitionStyle")
    public native boolean providesPresentationContextTransitionStyle();

    /**
     * Registers a view controller to participate with 3D Touch preview (peek) and commit (pop).
     * 
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("registerForPreviewingWithDelegate:sourceView:")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerPreviewing registerForPreviewingWithDelegateSourceView(
            @Mapped(ObjCObjectMapper.class) UIViewControllerPreviewingDelegate delegate, UIView sourceView);

    /**
     * Removes the the receiver from its parent's children controllers array. If this method is overridden then
     * the super implementation must be called.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("removeFromParentViewController")
    public native void removeFromParentViewController();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("removeKeyCommand:")
    public native void removeKeyCommand(UIKeyCommand keyCommand);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("restorationClass")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerRestoration restorationClass();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("restorationIdentifier")
    public native String restorationIdentifier();

    @Generated
    @IsOptional
    @Selector("restorationParent")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIStateRestoring restorationParent();

    /**
     * If YES, when this view controller becomes visible and focusable, focus will be automatically restored to the item
     * that was last focused. For example, when an item in this view controller is focused, and then another view
     * controller is presented and dismissed, the original item will become focused again. Defaults to YES.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("restoresFocusAfterTransition")
    public native boolean restoresFocusAfterTransition();

    /**
     * Must be in the view hierarchy. Default returns nil.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Footer views are animated along with the rest of the view hierarchy
     */
    @Generated
    @Deprecated
    @Selector("rotatingFooterView")
    public native UIView rotatingFooterView();

    /**
     * Must be in the view hierarchy. Default returns nil.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Header views are animated along with the rest of the view hierarchy
     */
    @Generated
    @Deprecated
    @Selector("rotatingHeaderView")
    public native UIView rotatingHeaderView();

    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     */
    @Generated
    @Deprecated
    @Selector("searchDisplayController")
    public native UISearchDisplayController searchDisplayController();

    /**
     * Deprecated. This method is only used for unwind segues whose destination view controller has been returned by an
     * override of the deprecated method -viewControllerForUnwindSegueAction:fromViewController:withSender:. In that
     * case, UIKit will choose a view controller to act as the “executor” of the unwind. If the destination view
     * controller is being modally presented, the destination view controller itself is the executor. Otherwise, the
     * destination view controller’s parent view controller is the executor. If the executor overrides this method,
     * UIKit will ignore the Custom Class specified in Interface Builder and instead call this method on the executor to
     * obtain a segue that can perform the unwind.
     * The returned segue object must be able to perform all steps necessary to unwind, including dismissing any
     * intermediate modal presentations or popping any necessary navigation items.
     * Applications targeting iOS 9 or later should not override this method. Custom container view controllers should
     * instead override -unwindForSegue:towardsViewController: to modify their local state as part of a UIKit-generated
     * incremental unwind segue.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("segueForUnwindingToViewController:fromViewController:identifier:")
    public native UIStoryboardSegue segueForUnwindingToViewControllerFromViewControllerIdentifier(
            UIViewController toViewController, UIViewController fromViewController, String identifier);

    /**
     * Called on the primary view controller when a split view controller is separating its children for a transition to
     * a regular-width size class, if its delegate does not provide overridden behavior. The default implementation
     * restores the previous secondary controller.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("separateSecondaryViewControllerForSplitViewController:")
    public native UIViewController separateSecondaryViewControllerForSplitViewController(
            UISplitViewController splitViewController);

    /**
     * Defaults to YES
     * 
     * API-Since: 7.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use UIScrollView's contentInsetAdjustmentBehavior instead
     */
    @Deprecated
    @Generated
    @Selector("setAutomaticallyAdjustsScrollViewInsets:")
    public native void setAutomaticallyAdjustsScrollViewInsets(boolean value);

    /**
     * contentSizeForViewInPopover allows you to set the size of the content from within the view controller. This
     * property is read/write, and you should generally not override it.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("setContentSizeForViewInPopover:")
    public native void setContentSizeForViewInPopover(@ByValue CGSize value);

    /**
     * Determines which parent view controller's view should be presented over for presentations of type
     * UIModalPresentationCurrentContext. If no ancestor view controller has this flag set, then the presenter
     * will be the root view controller.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setDefinesPresentationContext:")
    public native void setDefinesPresentationContext(boolean value);

    /**
     * Defaults to UIRectEdgeAll
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setEdgesForExtendedLayout:")
    public native void setEdgesForExtendedLayout(@NUInt long value);

    /**
     * Updates the appearance of the Edit|Done button item as necessary. Clients who override it must call super first.
     */
    @Generated
    @Selector("setEditing:animated:")
    public native void setEditingAnimated(boolean editing, boolean animated);

    /**
     * Defaults to NO, but bars are translucent by default on 7_0.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setExtendedLayoutIncludesOpaqueBars:")
    public native void setExtendedLayoutIncludesOpaqueBars(boolean value);

    /**
     * If YES, then when this view controller is pushed into a controller hierarchy with a bottom bar (like a tab bar),
     * the bottom bar will slide out. Default is NO.
     */
    @Generated
    @Selector("setHidesBottomBarWhenPushed:")
    public native void setHidesBottomBarWhenPushed(boolean value);

    /**
     * This controls whether this view controller takes over control of the status bar's appearance when presented
     * non-full screen on another view controller. Defaults to NO.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setModalPresentationCapturesStatusBarAppearance:")
    public native void setModalPresentationCapturesStatusBarAppearance(boolean value);

    /**
     * Defines the presentation style that will be used for this view controller when it is presented modally. Set this
     * property on the view controller to be presented, not the presenter.
     * If this property has been set to UIModalPresentationAutomatic, reading it will always return a concrete
     * presentation style. By default UIViewController resolves UIModalPresentationAutomatic to
     * UIModalPresentationPageSheet, but system-provided subclasses may resolve UIModalPresentationAutomatic to other
     * concrete presentation styles. Participation in the resolution of UIModalPresentationAutomatic is reserved for
     * system-provided view controllers.
     * Defaults to UIModalPresentationAutomatic on iOS starting in iOS 13.0, and UIModalPresentationFullScreen on
     * previous versions. Defaults to UIModalPresentationFullScreen on all other platforms.
     * 
     * API-Since: 3.2
     */
    @Generated
    @Selector("setModalPresentationStyle:")
    public native void setModalPresentationStyle(@NInt long value);

    /**
     * Defines the transition style that will be used for this view controller when it is presented modally. Set
     * this property on the view controller to be presented, not the presenter. Defaults to
     * UIModalTransitionStyleCoverVertical.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setModalTransitionStyle:")
    public native void setModalTransitionStyle(@NInt long value);

    @Generated
    @Selector("setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();

    /**
     * This should be called whenever the return values for the view controller's status bar attributes have changed. If
     * it is called from within an animation block, the changes will be animated along with the rest of the animation
     * block.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setNeedsStatusBarAppearanceUpdate")
    public native void setNeedsStatusBarAppearanceUpdate();

    /**
     * Call to modify the trait collection for child view controllers.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setOverrideTraitCollection:forChildViewController:")
    public native void setOverrideTraitCollectionForChildViewController(UITraitCollection collection,
            UIViewController childViewController);

    /**
     * The preferredContentSize is used for any container laying out a child view controller.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setPreferredContentSize:")
    public native void setPreferredContentSize(@ByValue CGSize value);

    /**
     * A controller that defines the presentation context can also specify the modal transition style if this property
     * is true.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setProvidesPresentationContextTransitionStyle:")
    public native void setProvidesPresentationContextTransitionStyle(boolean value);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setRestorationClass:")
    public native void setRestorationClass_unsafe(@Mapped(ObjCObjectMapper.class) UIViewControllerRestoration value);

    /**
     * API-Since: 6.0
     */
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

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setRestorationIdentifier:")
    public native void setRestorationIdentifier(String value);

    /**
     * If YES, when this view controller becomes visible and focusable, focus will be automatically restored to the item
     * that was last focused. For example, when an item in this view controller is focused, and then another view
     * controller is presented and dismissed, the original item will become focused again. Defaults to YES.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setRestoresFocusAfterTransition:")
    public native void setRestoresFocusAfterTransition(boolean value);

    /**
     * Automatically created lazily with the view controller's title if it's not set explicitly.
     */
    @Generated
    @Selector("setTabBarItem:")
    public native void setTabBarItem(UITabBarItem value);

    /**
     * Localized title for use by a parent controller.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setToolbarItems:")
    public native void setToolbarItems(NSArray<? extends UIBarButtonItem> value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setToolbarItems:animated:")
    public native void setToolbarItemsAnimated(NSArray<? extends UIBarButtonItem> toolbarItems, boolean animated);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setTransitioningDelegate:")
    public native void setTransitioningDelegate_unsafe(
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitioningDelegate value);

    /**
     * API-Since: 7.0
     */
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

    /**
     * The getter first invokes [self loadView] if the view hasn't been set yet. Subclasses must call super if they
     * override the setter or getter.
     */
    @Generated
    @Selector("setView:")
    public native void setView(UIView value);

    /**
     * Deprecated in 7_0, Replaced by the following:
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("setWantsFullScreenLayout:")
    public native void setWantsFullScreenLayout(boolean value);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("shouldAutomaticallyForwardAppearanceMethods")
    public native boolean shouldAutomaticallyForwardAppearanceMethods();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Manually forward viewWillTransitionToSize:withTransitionCoordinator: if necessary
     */
    @Generated
    @Deprecated
    @Selector("shouldAutomaticallyForwardRotationMethods")
    public native boolean shouldAutomaticallyForwardRotationMethods();

    /**
     * New Autorotation support.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Update supported interface orientations and call
     * setNeedsUpdateOfSupportedInterfaceOrientations to indicate a change.
     */
    @Deprecated
    @Generated
    @Selector("shouldAutorotate")
    public native boolean shouldAutorotate();

    /**
     * Applications should use supportedInterfaceOrientations and/or shouldAutorotate.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("shouldAutorotateToInterfaceOrientation:")
    public native boolean shouldAutorotateToInterfaceOrientation(@NInt long toInterfaceOrientation);

    /**
     * Invoked immediately prior to initiating a segue. Return NO to prevent the segue from firing. The default
     * implementation returns YES. This method is not invoked when -performSegueWithIdentifier:sender: is used.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("shouldPerformSegueWithIdentifier:sender:")
    public native boolean shouldPerformSegueWithIdentifierSender(String identifier,
            @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    /**
     * This method will show a view controller within the semantic "detail" UI associated with the current size-class
     * environment. It's implementation calls `[self targetViewControllerForAction:sender:]` first and redirects
     * accordingly if the return value is not `self`, otherwise it will present the vc.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("showDetailViewController:sender:")
    public native void showDetailViewControllerSender(UIViewController vc,
            @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * This method will show a view controller appropriately for the current size-class environment. It's implementation
     * calls
     * `[self targetViewControllerForAction:sender:]` first and redirects accordingly if the return value is not `self`,
     * otherwise it will present the vc.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("showViewController:sender:")
    public native void showViewControllerSender(UIViewController vc, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("sizeForChildContentContainer:withParentContainerSize:")
    @ByValue
    public native CGSize sizeForChildContentContainerWithParentContainerSize(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container, @ByValue CGSize parentSize);

    /**
     * If the view controller has a split view controller as its ancestor, return it. Returns nil otherwise.
     */
    @Generated
    @Selector("splitViewController")
    public native UISplitViewController splitViewController();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("storyboard")
    public native UIStoryboard storyboard();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("supportedInterfaceOrientations")
    @NUInt
    public native long supportedInterfaceOrientations();

    @Generated
    @Selector("systemLayoutFittingSizeDidChangeForChildContentContainer:")
    public native void systemLayoutFittingSizeDidChangeForChildContentContainer(
            @Mapped(ObjCObjectMapper.class) UIContentContainer container);

    /**
     * If the view controller has a tab bar controller as its ancestor, return it. Returns nil otherwise.
     */
    @Generated
    @Selector("tabBarController")
    public native UITabBarController tabBarController();

    /**
     * Automatically created lazily with the view controller's title if it's not set explicitly.
     */
    @Generated
    @Selector("tabBarItem")
    public native UITabBarItem tabBarItem();

    /**
     * This method returns either itself or the nearest ancestor that can perform the given action and, if applicable,
     * has overridden UIViewController's default implementation of the action method. View controllers can return NO
     * from canPerformAction:withSender: to opt out of being a target for a given action.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("targetViewControllerForAction:sender:")
    public native UIViewController targetViewControllerForActionSender(SEL action,
            @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Localized title for use by a parent controller.
     */
    @Generated
    @Selector("title")
    public native String title();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("toolbarItems")
    public native NSArray<? extends UIBarButtonItem> toolbarItems();

    /**
     * These objects may be used as layout items in the NSLayoutConstraint API
     * 
     * API-Since: 7.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use view.safeAreaLayoutGuide.topAnchor instead of topLayoutGuide.bottomAnchor
     */
    @Deprecated
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

    /**
     * The default implementation will return a transition coordinator if called during
     * an active presentation or dismissal. Otherwise it will ask the parent view
     * controller. This method, if overridden, can first check if there is an
     * appropriate transition coordinator to return, otherwise it should call
     * super. Only custom container view controllers should ever need to override
     * this method.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("transitionCoordinator")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerTransitionCoordinator transitionCoordinator();

    /**
     * This method can be used to transition between sibling child view controllers. The receiver of this method is
     * their common parent view controller. (Use [UIViewController addChildViewController:] to create the
     * parent/child relationship.) This method will add the toViewController's view to the superview of the
     * fromViewController's view and the fromViewController's view will be removed from its superview after the
     * transition completes. It is important to allow this method to add and remove the views. The arguments to
     * this method are the same as those defined by UIView's block animation API. This method will fail with an
     * NSInvalidArgumentException if the parent view controllers are not the same as the receiver, or if the
     * receiver explicitly forwards its appearance and rotation callbacks to its children. Finally, the receiver
     * should not be a subclass of an iOS container view controller. Note also that it is possible to use the
     * UIView APIs directly. If they are used it is important to ensure that the toViewController's view is added
     * to the visible view hierarchy while the fromViewController's view is removed.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("transitionFromViewController:toViewController:duration:options:animations:completion:")
    public native void transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion(
            UIViewController fromViewController, UIViewController toViewController, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_4") Block_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_4 animations,
            @ObjCBlock(name = "call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5") Block_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5 completion);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("transitioningDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewControllerTransitioningDelegate transitioningDelegate();

    /**
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("unregisterForPreviewingWithContext:")
    public native void unregisterForPreviewingWithContext(
            @Mapped(ObjCObjectMapper.class) UIViewControllerPreviewing previewing);

    /**
     * Custom container view controllers should override this method to modify themselves as part of an ongoing unwind
     * segue. The subsequentVC is the parent, child, or presented view controller closest to the receiver in the
     * direction of the segue's destinationViewController. For example, UINavigationController's implementation of this
     * method will pop any necessary view controllers to reveal the subsequentVC.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("unwindForSegue:towardsViewController:")
    public native void unwindForSegueTowardsViewController(UIStoryboardSegue unwindSegue,
            UIViewController subsequentVC);

    @Generated
    @Selector("updateFocusIfNeeded")
    public native void updateFocusIfNeeded();

    /**
     * Base implementation sends -updateConstraints to the view.
     * When a view has a view controller, this message is sent to the view controller during
     * the Auto Layout updateConstraints pass in lieu of sending updateConstraints directly
     * to the view.
     * You may override this method in a UIViewController subclass for updating custom
     * constraints instead of subclassing your view and overriding -[UIView updateConstraints].
     * Overrides must call super or send -updateConstraints to the view.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("updateViewConstraints")
    public native void updateViewConstraints();

    /**
     * The getter first invokes [self loadView] if the view hasn't been set yet. Subclasses must call super if they
     * override the setter or getter.
     */
    @Generated
    @Selector("view")
    public native UIView view();

    /**
     * Deprecated. Returns a direct child of the receiver that responds YES to
     * -canPerformUnwindSegueAction:fromViewController:sender:, or self if no children respond YES but the receiver
     * itself does. If this method has been overridden, UIViewController's implementation does not consult child view
     * controllers at all, and skips straight to sending -canPerformUnwindSegueAction:... to self.
     * Applications targeting iOS 9 or later should not override this method. Applications can instead override
     * -allowedChildViewControllersForUnwindingFromSource: to guide UIKit’s search for a descendant view controller that
     * returns YES from -canPerformUnwindSegueAction:fromViewController:sender:.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("viewControllerForUnwindSegueAction:fromViewController:withSender:")
    public native UIViewController viewControllerForUnwindSegueActionFromViewControllerWithSender(SEL action,
            UIViewController fromViewController, @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * Called when the view has been fully transitioned onto the screen. Default does nothing
     */
    @Generated
    @Selector("viewDidAppear:")
    public native void viewDidAppear(boolean animated);

    /**
     * Called after the view was dismissed, covered or otherwise hidden. Default does nothing
     */
    @Generated
    @Selector("viewDidDisappear:")
    public native void viewDidDisappear(boolean animated);

    /**
     * Called just after the view controller's view's layoutSubviews method is invoked. Subclasses can implement as
     * necessary. The default is a no-op.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("viewDidLayoutSubviews")
    public native void viewDidLayoutSubviews();

    /**
     * Called after the view has been loaded. For view controllers created in code, this is after -loadView. For view
     * controllers unarchived from a nib, this is after the view is set.
     */
    @Generated
    @Selector("viewDidLoad")
    public native void viewDidLoad();

    /**
     * Called after the view controller's view is released and set to nil. For example, a memory warning which causes
     * the view to be purged. Not invoked as a result of -dealloc.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("viewDidUnload")
    public native void viewDidUnload();

    /**
     * Returns the view controller's view if loaded, nil if not.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("viewIfLoaded")
    public native UIView viewIfLoaded();

    /**
     * Called when the view is about to made visible. Default does nothing
     */
    @Generated
    @Selector("viewWillAppear:")
    public native void viewWillAppear(boolean animated);

    /**
     * Called when the view is dismissed, covered or otherwise hidden. Default does nothing
     */
    @Generated
    @Selector("viewWillDisappear:")
    public native void viewWillDisappear(boolean animated);

    /**
     * Called just before the view controller's view's layoutSubviews method is invoked. Subclasses can implement as
     * necessary. The default is a no-op.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("viewWillLayoutSubviews")
    public native void viewWillLayoutSubviews();

    @Generated
    @Selector("viewWillTransitionToSize:withTransitionCoordinator:")
    public native void viewWillTransitionToSizeWithTransitionCoordinator(@ByValue CGSize size,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("viewWillUnload")
    public native void viewWillUnload();

    /**
     * Deprecated in 7_0, Replaced by the following:
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("wantsFullScreenLayout")
    public native boolean wantsFullScreenLayout();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 5.0
     */
    @Generated
    @Deprecated
    @Selector("willAnimateFirstHalfOfRotationToInterfaceOrientation:duration:")
    public native void willAnimateFirstHalfOfRotationToInterfaceOrientationDuration(@NInt long toInterfaceOrientation,
            double duration);

    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Implement viewWillTransitionToSize:withTransitionCoordinator: instead
     */
    @Generated
    @Deprecated
    @Selector("willAnimateRotationToInterfaceOrientation:duration:")
    public native void willAnimateRotationToInterfaceOrientationDuration(@NInt long toInterfaceOrientation,
            double duration);

    /**
     * A this point, our view orientation is set to the new orientation.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 5.0
     */
    @Generated
    @Deprecated
    @Selector("willAnimateSecondHalfOfRotationFromInterfaceOrientation:duration:")
    public native void willAnimateSecondHalfOfRotationFromInterfaceOrientationDuration(
            @NInt long fromInterfaceOrientation, double duration);

    /**
     * These two methods are public for container subclasses to call when transitioning between child
     * controllers. If they are overridden, the overrides should ensure to call the super. The parent argument in
     * both of these methods is nil when a child is being removed from its parent; otherwise it is equal to the new
     * parent view controller.
     * 
     * addChildViewController: will call [child willMoveToParentViewController:self] before adding the
     * child. However, it will not call didMoveToParentViewController:. It is expected that a container view
     * controller subclass will make this call after a transition to the new child has completed or, in the
     * case of no transition, immediately after the call to addChildViewController:. Similarly,
     * removeFromParentViewController does not call [self willMoveToParentViewController:nil] before removing the
     * child. This is also the responsibility of the container subclass. Container subclasses will typically define
     * a method that transitions to a new child by first calling addChildViewController:, then executing a
     * transition which will add the new child's view into the view hierarchy of its parent, and finally will call
     * didMoveToParentViewController:. Similarly, subclasses will typically define a method that removes a child in
     * the reverse manner by first calling [child willMoveToParentViewController:nil].
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("willMoveToParentViewController:")
    public native void willMoveToParentViewController(UIViewController parent);

    /**
     * Notifies when rotation begins, reaches halfway point and ends.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Implement viewWillTransitionToSize:withTransitionCoordinator: instead
     */
    @Generated
    @Deprecated
    @Selector("willRotateToInterfaceOrientation:duration:")
    public native void willRotateToInterfaceOrientationDuration(@NInt long toInterfaceOrientation, double duration);

    @Generated
    @Selector("willTransitionToTraitCollection:withTransitionCoordinator:")
    public native void willTransitionToTraitCollectionWithTransitionCoordinator(UITraitCollection newCollection,
            @Mapped(ObjCObjectMapper.class) UIViewControllerTransitionCoordinator coordinator);

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
        void call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5(boolean finished);
    }

    /**
     * Custom container UIViewController subclasses can use this property to add to the overlay
     * that UIViewController calculates for the safeAreaInsets for contained view controllers.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("additionalSafeAreaInsets")
    @ByValue
    public native UIEdgeInsets additionalSafeAreaInsets();

    /**
     * Override to return a child view controller or nil. If non-nil, that view controller's home indicator auto-hiding
     * will be used. If nil, self is used. Whenever the return value changes, -setNeedsHomeIndicatorAutoHiddenUpdate
     * should be called.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("childViewControllerForHomeIndicatorAutoHidden")
    public native UIViewController childViewControllerForHomeIndicatorAutoHidden();

    /**
     * Override to return a child view controller or nil. If non-nil, that view controller's screen edges deferring
     * system gestures will be used. If nil, self is used. Whenever the return value changes,
     * -setNeedsScreenEdgesDeferringSystemGesturesUpdate should be called.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("childViewControllerForScreenEdgesDeferringSystemGestures")
    public native UIViewController childViewControllerForScreenEdgesDeferringSystemGestures();

    /**
     * Controls the application's preferred screen edges deferring system gestures when this view controller is shown.
     * Default is UIRectEdgeNone.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("preferredScreenEdgesDeferringSystemGestures")
    @NUInt
    public native long preferredScreenEdgesDeferringSystemGestures();

    /**
     * Controls the application's preferred home indicator auto-hiding when this view controller is shown.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("prefersHomeIndicatorAutoHidden")
    public native boolean prefersHomeIndicatorAutoHidden();

    /**
     * Custom container UIViewController subclasses can use this property to add to the overlay
     * that UIViewController calculates for the safeAreaInsets for contained view controllers.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAdditionalSafeAreaInsets:")
    public native void setAdditionalSafeAreaInsets(@ByValue UIEdgeInsets value);

    /**
     * This should be called whenever the return values for the view controller's home indicator auto-hiding have
     * changed.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setNeedsUpdateOfHomeIndicatorAutoHidden")
    public native void setNeedsUpdateOfHomeIndicatorAutoHidden();

    /**
     * This should be called whenever the return values for the view controller's screen edges deferring system gestures
     * have changed.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setNeedsUpdateOfScreenEdgesDeferringSystemGestures")
    public native void setNeedsUpdateOfScreenEdgesDeferringSystemGestures();

    /**
     * Default YES. The return value of the view's layoutMargins and directionalLayoutMargins properties will have
     * values no smaller than the systemMinimumLayoutMargins. Set to NO for full customizability of the view's
     * layoutMargins.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setViewRespectsSystemMinimumLayoutMargins:")
    public native void setViewRespectsSystemMinimumLayoutMargins(boolean value);

    /**
     * Minimum layoutMargins for the view determined by the view controller from context and hardware information.
     * The view controller's view will respect these minimums unless viewRespectsSystemMinimumLayoutMargins
     * (which defaults to YES) is set to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("systemMinimumLayoutMargins")
    @ByValue
    public native NSDirectionalEdgeInsets systemMinimumLayoutMargins();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("viewLayoutMarginsDidChange")
    public native void viewLayoutMarginsDidChange();

    /**
     * Default YES. The return value of the view's layoutMargins and directionalLayoutMargins properties will have
     * values no smaller than the systemMinimumLayoutMargins. Set to NO for full customizability of the view's
     * layoutMargins.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("viewRespectsSystemMinimumLayoutMargins")
    public native boolean viewRespectsSystemMinimumLayoutMargins();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("viewSafeAreaInsetsDidChange")
    public native void viewSafeAreaInsetsDidChange();

    /**
     * View controllers will receive this message during segue unwinding. The default implementation returns the result
     * of -respondsToSelector: - controllers can override this to perform any ancillary checks, if necessary.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("canPerformUnwindSegueAction:fromViewController:sender:")
    public native boolean canPerformUnwindSegueActionFromViewControllerSender(SEL action,
            UIViewController fromViewController, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("focusItemContainer")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusItemContainer focusItemContainer();

    /**
     * modalInPresentation is set on the view controller when you wish to force the presentation hosting the view
     * controller into modal behavior. When this is active, the presentation will prevent interactive dismiss and ignore
     * events outside of the presented view controller's bounds until this is set to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isModalInPresentation")
    public native boolean isModalInPresentation();

    /**
     * Defaults to UIUserInterfaceStyleUnspecified
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("overrideUserInterfaceStyle")
    @NInt
    public native long overrideUserInterfaceStyle();

    @Generated
    @Selector("parentFocusEnvironment")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusEnvironment parentFocusEnvironment();

    /**
     * Determines whether the receiver continues to respond to actions while it is presenting a view controller modally.
     * 
     * Defaults to YES. You can change the default return value by providing a value for
     * UIViewControllerPerformsActionsWhilePresentingModally in your Info.plist file.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("performsActionsWhilePresentingModally")
    public native boolean performsActionsWhilePresentingModally();

    /**
     * modalInPresentation is set on the view controller when you wish to force the presentation hosting the view
     * controller into modal behavior. When this is active, the presentation will prevent interactive dismiss and ignore
     * events outside of the presented view controller's bounds until this is set to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setModalInPresentation:")
    public native void setModalInPresentation(boolean value);

    /**
     * Defaults to UIUserInterfaceStyleUnspecified
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(@NInt long value);

    /**
     * Override to return a child view controller or nil. If non-nil, that view controller's preferred pointer lock
     * value will be used. If nil, self is used. Whenever the return value changes,
     * setNeedsUpdateOfPrefersPointerLocked() should be called.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("childViewControllerForPointerLock")
    public native UIViewController childViewControllerForPointerLock();

    @Generated
    @Selector("focusGroupIdentifier")
    public native String focusGroupIdentifier();

    /**
     * Whether the pointer should be locked to a given scene when this view controller is shown.
     * The default is NO. This preference may or may not be honored.
     * See UIPointerLockState.locked for the current pointer lock state as determined by the system.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("prefersPointerLocked")
    public native boolean prefersPointerLocked();

    /**
     * This should be called whenever the view controller's preferred pointer lock value has changed.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setNeedsUpdateOfPrefersPointerLocked")
    public native void setNeedsUpdateOfPrefersPointerLocked();

    /**
     * Subclass overrides will be called when available
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("contentScrollViewForEdge:")
    public native UIScrollView contentScrollViewForEdge(@NUInt long edge);

    /**
     * Depending on the value passed in the `edge` parameter, a containing UINavigationController,
     * UITabBarController, or both will observe the UIScrollView instance in the
     * `contentScrollView` parameter to determine the background blur for the bars and to
     * update contentInset adjustments for the scroll view.
     * 
     * When contentScrollView is nil for an edge, UIKit uses a heuristic to search for
     * a UIScrollView to track. If none is found, the relevant bar will be transparent unless
     * otherwise customized with the `scrollEdgeAppearance` APIs.
     * Aggregate values (e.g., NSDirectionalRectEdgeAll) are accepted in the `edge` parameter;
     * NSDirectionalRectEdgeLeading and Trailing are ignored on iOS 15.0
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setContentScrollView:forEdge:")
    public native void setContentScrollViewForEdge(UIScrollView scrollView, @NUInt long edge);

    /**
     * The identifier of the focus group that this view controller belongs to. If this is nil, the view controller
     * inherits the focus group of its parent focus environment.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFocusGroupIdentifier:")
    public native void setFocusGroupIdentifier(String value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("sheetPresentationController")
    public native UISheetPresentationController sheetPresentationController();

    /**
     * Gets the presentation controller managing this view controller. If the original presentation controller has
     * adapted, this returns the adaptive presentation controller. If this view controller has not yet been presented,
     * this property returns nil.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("activePresentationController")
    public native UIPresentationController activePresentationController();

    /**
     * The base name for tracking user interactions as activities hosted by this view controller.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("interactionActivityTrackingBaseName")
    public native String interactionActivityTrackingBaseName();

    /**
     * The base name for tracking user interactions as activities hosted by this view controller.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInteractionActivityTrackingBaseName:")
    public native void setInteractionActivityTrackingBaseName(String value);

    /**
     * Notifies the view controller that a change occurred that affects supported interface orientations or the
     * preferred interface orientation for presentation.
     * By default, this will animate any changes to orientation. To perform a non-animated update, call within `[UIView
     * performWithoutAnimation:]`.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setNeedsUpdateOfSupportedInterfaceOrientations")
    public native void setNeedsUpdateOfSupportedInterfaceOrientations();
}
