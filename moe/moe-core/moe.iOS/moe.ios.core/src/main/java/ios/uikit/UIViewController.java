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

package ios.uikit;


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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGSize;
import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSExtensionContext;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSExtensionRequestHandling;
import ios.mediaplayer.MPMoviePlayerViewController;
import ios.uikit.protocol.UIAppearanceContainer;
import ios.uikit.protocol.UIContentContainer;
import ios.uikit.protocol.UIStateRestoring;
import ios.uikit.protocol.UITraitEnvironment;
import ios.uikit.protocol.UIFocusEnvironment;
import ios.uikit.protocol.UILayoutSupport;
import ios.uikit.protocol.UIViewControllerPreviewing;
import ios.uikit.protocol.UIViewControllerPreviewingDelegate;
import ios.uikit.protocol.UIViewControllerRestoration;
import ios.uikit.protocol.UIViewControllerTransitionCoordinator;
import ios.uikit.protocol.UIViewControllerTransitioningDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIViewController extends UIResponder implements NSCoding,
		UIAppearanceContainer, UITraitEnvironment, UIContentContainer,
		UIFocusEnvironment, UIStateRestoring, NSExtensionRequestHandling {
	static {
		NatJ.register();
	}

	@Generated
	protected UIViewController(Pointer peer) {
		super(peer);
	}

	/**
	 * addChildViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/addChildViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addChildViewController:")
	public native void addChildViewController(UIViewController childController);

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIViewController alloc();

	@Generated
	@Selector("applicationFinishedRestoringState")
	public native void applicationFinishedRestoringState();

	/**
	 * attemptRotationToDeviceOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/clm/UIViewController/attemptRotationToDeviceOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("attemptRotationToDeviceOrientation")
	public static native void attemptRotationToDeviceOrientation();

	/**
	 * automaticallyAdjustsScrollViewInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/automaticallyAdjustsScrollViewInsets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("automaticallyAdjustsScrollViewInsets")
	public native boolean automaticallyAdjustsScrollViewInsets();

	/**
	 * automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers")
	public native boolean automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers();

	/**
	 * beginAppearanceTransition:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/beginAppearanceTransition:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("beginAppearanceTransition:animated:")
	public native void beginAppearanceTransitionAnimated(boolean isAppearing,
			boolean animated);

	@Generated
	@Selector("beginRequestWithExtensionContext:")
	public native void beginRequestWithExtensionContext(
			NSExtensionContext context);

	/**
	 * bottomLayoutGuide</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/bottomLayoutGuide">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bottomLayoutGuide")
	@MappedReturn(ObjCObjectMapper.class)
	public native UILayoutSupport bottomLayoutGuide();

	/**
	 * canDisplayBannerAds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/canDisplayBannerAds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("canDisplayBannerAds")
	public native boolean canDisplayBannerAds();

	/**
	 * canPerformUnwindSegueAction:fromViewController:withSender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/canPerformUnwindSegueAction:fromViewController:withSender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("canPerformUnwindSegueAction:fromViewController:withSender:")
	public native boolean canPerformUnwindSegueActionFromViewControllerWithSender(
			SEL action, UIViewController fromViewController,
			@Mapped(ObjCObjectMapper.class) Object sender);

	/**
	 * childViewControllerForStatusBarHidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/childViewControllerForStatusBarHidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("childViewControllerForStatusBarHidden")
	public native UIViewController childViewControllerForStatusBarHidden();

	/**
	 * childViewControllerForStatusBarStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/childViewControllerForStatusBarStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("childViewControllerForStatusBarStyle")
	public native UIViewController childViewControllerForStatusBarStyle();

	/**
	 * childViewControllers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/childViewControllers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("childViewControllers")
	public native NSArray<? extends UIViewController> childViewControllers();

	/**
	 * collapseSecondaryViewController:forSplitViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/collapseSecondaryViewController:forSplitViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("collapseSecondaryViewController:forSplitViewController:")
	public native void collapseSecondaryViewControllerForSplitViewController(
			UIViewController secondaryViewController,
			UISplitViewController splitViewController);

	/**
	 * contentSizeForViewInPopover</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/contentSizeForViewInPopover">iOS Dev Center</a>
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
	 * definesPresentationContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/definesPresentationContext">iOS Dev Center</a>
	 */
	@Generated
	@Selector("definesPresentationContext")
	public native boolean definesPresentationContext();

	/**
	 * didAnimateFirstHalfOfRotationToInterfaceOrientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/didAnimateFirstHalfOfRotationToInterfaceOrientation:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("didAnimateFirstHalfOfRotationToInterfaceOrientation:")
	public native void didAnimateFirstHalfOfRotationToInterfaceOrientation(
			@NInt long toInterfaceOrientation);

	/**
	 * didMoveToParentViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/didMoveToParentViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didMoveToParentViewController:")
	public native void didMoveToParentViewController(UIViewController parent);

	/**
	 * didReceiveMemoryWarning</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/didReceiveMemoryWarning">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didReceiveMemoryWarning")
	public native void didReceiveMemoryWarning();

	/**
	 * didRotateFromInterfaceOrientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/didRotateFromInterfaceOrientation:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("didRotateFromInterfaceOrientation:")
	public native void didRotateFromInterfaceOrientation(
			@NInt long fromInterfaceOrientation);

	/**
	 * disablesAutomaticKeyboardDismissal</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/disablesAutomaticKeyboardDismissal">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disablesAutomaticKeyboardDismissal")
	public native boolean disablesAutomaticKeyboardDismissal();

	/**
	 * dismissModalViewControllerAnimated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/dismissModalViewControllerAnimated:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("dismissModalViewControllerAnimated:")
	public native void dismissModalViewControllerAnimated(boolean animated);

	/**
	 * dismissMoviePlayerViewControllerAnimated</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/dismissMoviePlayerViewControllerAnimated">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("dismissMoviePlayerViewControllerAnimated")
	public native void dismissMoviePlayerViewControllerAnimated();

	/**
	 * dismissViewControllerAnimated:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/dismissViewControllerAnimated:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dismissViewControllerAnimated:completion:")
	public native void dismissViewControllerAnimatedCompletion(
			boolean flag,
			@ObjCBlock(name = "call_dismissViewControllerAnimatedCompletion") Block_dismissViewControllerAnimatedCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_dismissViewControllerAnimatedCompletion {
		@Generated
		void call_dismissViewControllerAnimatedCompletion();
	}

	/**
	 * edgesForExtendedLayout</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/edgesForExtendedLayout">iOS Dev Center</a>
	 */
	@Generated
	@Selector("edgesForExtendedLayout")
	@NUInt
	public native long edgesForExtendedLayout();

	/**
	 * editButtonItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/editButtonItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("editButtonItem")
	public native UIBarButtonItem editButtonItem();

	@Generated
	@Selector("encodeRestorableStateWithCoder:")
	public native void encodeRestorableStateWithCoder(NSCoder coder);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * endAppearanceTransition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/endAppearanceTransition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endAppearanceTransition")
	public native void endAppearanceTransition();

	/**
	 * extendedLayoutIncludesOpaqueBars</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/extendedLayoutIncludesOpaqueBars">iOS Dev Center</a>
	 */
	@Generated
	@Selector("extendedLayoutIncludesOpaqueBars")
	public native boolean extendedLayoutIncludesOpaqueBars();

	/**
	 * extensionContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/extensionContext">iOS Dev Center</a>
	 */
	@Generated
	@Selector("extensionContext")
	public native NSExtensionContext extensionContext();

	/**
	 * hidesBottomBarWhenPushed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/hidesBottomBarWhenPushed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hidesBottomBarWhenPushed")
	public native boolean hidesBottomBarWhenPushed();

	@Generated
	@Selector("init")
	public native UIViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native UIViewController initWithCoder(NSCoder aDecoder);

	/**
	 * initWithNibName:bundle:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/initWithNibName:bundle:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithNibName:bundle:")
	public native UIViewController initWithNibNameBundle(String nibNameOrNil,
			NSBundle nibBundleOrNil);

	/**
	 * interfaceOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/interfaceOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("interfaceOrientation")
	@NInt
	public native long interfaceOrientation();

	/**
	 * interstitialPresentationPolicy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/interstitialPresentationPolicy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("interstitialPresentationPolicy")
	@NInt
	public native long interstitialPresentationPolicy();

	/**
	 * isBeingDismissed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/isBeingDismissed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isBeingDismissed")
	public native boolean isBeingDismissed();

	/**
	 * isBeingPresented</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/isBeingPresented">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isBeingPresented")
	public native boolean isBeingPresented();

	/**
	 * displayingBannerAd</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/displayingBannerAd">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isDisplayingBannerAd")
	public native boolean isDisplayingBannerAd();

	/**
	 * editing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/editing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEditing")
	public native boolean isEditing();

	/**
	 * modalInPopover</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalInPopover">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isModalInPopover")
	public native boolean isModalInPopover();

	/**
	 * isMovingFromParentViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/isMovingFromParentViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isMovingFromParentViewController")
	public native boolean isMovingFromParentViewController();

	/**
	 * isMovingToParentViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/isMovingToParentViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isMovingToParentViewController")
	public native boolean isMovingToParentViewController();

	/**
	 * presentingFullScreenAd</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/presentingFullScreenAd">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPresentingFullScreenAd")
	public native boolean isPresentingFullScreenAd();

	/**
	 * isViewLoaded</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/isViewLoaded">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isViewLoaded")
	public native boolean isViewLoaded();

	/**
	 * loadView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/loadView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadView")
	public native void loadView();

	/**
	 * modalPresentationCapturesStatusBarAppearance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalPresentationCapturesStatusBarAppearance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("modalPresentationCapturesStatusBarAppearance")
	public native boolean modalPresentationCapturesStatusBarAppearance();

	/**
	 * modalPresentationStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalPresentationStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("modalPresentationStyle")
	@NInt
	public native long modalPresentationStyle();

	/**
	 * modalTransitionStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalTransitionStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("modalTransitionStyle")
	@NInt
	public native long modalTransitionStyle();

	/**
	 * modalViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalViewController">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("modalViewController")
	public native UIViewController modalViewController();

	/**
	 * navigationController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/navigationController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("navigationController")
	public native UINavigationController navigationController();

	/**
	 * navigationItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/navigationItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("navigationItem")
	public native UINavigationItem navigationItem();

	/**
	 * nibBundle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/nibBundle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nibBundle")
	public native NSBundle nibBundle();

	/**
	 * nibName</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/nibName">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nibName")
	public native String nibName();

	@Generated
	@IsOptional
	@Selector("objectRestorationClass")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectRestorationClass();

	/**
	 * originalContentView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/originalContentView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("originalContentView")
	public native UIView originalContentView();

	/**
	 * overrideTraitCollectionForChildViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/overrideTraitCollectionForChildViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("overrideTraitCollectionForChildViewController:")
	public native UITraitCollection overrideTraitCollectionForChildViewController(
			UIViewController childViewController);

	/**
	 * parentViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/parentViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("parentViewController")
	public native UIViewController parentViewController();

	/**
	 * performSegueWithIdentifier:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/performSegueWithIdentifier:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("performSegueWithIdentifier:sender:")
	public native void performSegueWithIdentifierSender(String identifier,
			@Mapped(ObjCObjectMapper.class) Object sender);

	/**
	 * popoverPresentationController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/popoverPresentationController">iOS Dev Center</a>
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
			@Mapped(ObjCObjectMapper.class) Object container);

	/**
	 * preferredInterfaceOrientationForPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/preferredInterfaceOrientationForPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredInterfaceOrientationForPresentation")
	@NInt
	public native long preferredInterfaceOrientationForPresentation();

	/**
	 * preferredStatusBarStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/preferredStatusBarStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredStatusBarStyle")
	@NInt
	public native long preferredStatusBarStyle();

	/**
	 * preferredStatusBarUpdateAnimation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/preferredStatusBarUpdateAnimation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredStatusBarUpdateAnimation")
	@NInt
	public native long preferredStatusBarUpdateAnimation();

	/**
	 * prefersStatusBarHidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/prefersStatusBarHidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prefersStatusBarHidden")
	public native boolean prefersStatusBarHidden();

	/**
	 * prepareForSegue:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/prepareForSegue:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prepareForSegue:sender:")
	public native void prepareForSegueSender(UIStoryboardSegue segue,
			@Mapped(ObjCObjectMapper.class) Object sender);

	/**
	 * prepareInterstitialAds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/clm/UIViewController/prepareInterstitialAds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prepareInterstitialAds")
	public static native void prepareInterstitialAds();

	/**
	 * presentModalViewController:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/presentModalViewController:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("presentModalViewController:animated:")
	public native void presentModalViewControllerAnimated(
			UIViewController modalViewController, boolean animated);

	/**
	 * presentMoviePlayerViewControllerAnimated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/presentMoviePlayerViewControllerAnimated:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("presentMoviePlayerViewControllerAnimated:")
	public native void presentMoviePlayerViewControllerAnimated(
			MPMoviePlayerViewController moviePlayerViewController);

	/**
	 * presentViewController:animated:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/presentViewController:animated:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentViewController:animated:completion:")
	public native void presentViewControllerAnimatedCompletion(
			UIViewController viewControllerToPresent,
			boolean flag,
			@ObjCBlock(name = "call_presentViewControllerAnimatedCompletion") Block_presentViewControllerAnimatedCompletion completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_presentViewControllerAnimatedCompletion {
		@Generated
		void call_presentViewControllerAnimatedCompletion();
	}

	/**
	 * presentationController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/presentationController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentationController")
	public native UIPresentationController presentationController();

	/**
	 * presentedViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/presentedViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentedViewController")
	public native UIViewController presentedViewController();

	/**
	 * presentingViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/presentingViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentingViewController")
	public native UIViewController presentingViewController();

	/**
	 * providesPresentationContextTransitionStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/providesPresentationContextTransitionStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("providesPresentationContextTransitionStyle")
	public native boolean providesPresentationContextTransitionStyle();

	/**
	 * removeFromParentViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/removeFromParentViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeFromParentViewController")
	public native void removeFromParentViewController();

	/**
	 * requestInterstitialAdPresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/requestInterstitialAdPresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestInterstitialAdPresentation")
	public native boolean requestInterstitialAdPresentation();

	/**
	 * restorationClass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/restorationClass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("restorationClass")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIViewControllerRestoration restorationClass();

	/**
	 * restorationIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/restorationIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("restorationIdentifier")
	public native String restorationIdentifier();

	@Generated
	@IsOptional
	@Selector("restorationParent")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object restorationParent();

	/**
	 * rotatingFooterView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/rotatingFooterView">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("rotatingFooterView")
	public native UIView rotatingFooterView();

	/**
	 * rotatingHeaderView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/rotatingHeaderView">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("rotatingHeaderView")
	public native UIView rotatingHeaderView();

	/**
	 * searchDisplayController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/searchDisplayController">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("searchDisplayController")
	public native UISearchDisplayController searchDisplayController();

	/**
	 * segueForUnwindingToViewController:fromViewController:identifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/segueForUnwindingToViewController:fromViewController:identifier:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("segueForUnwindingToViewController:fromViewController:identifier:")
	public native UIStoryboardSegue segueForUnwindingToViewControllerFromViewControllerIdentifier(
			UIViewController toViewController,
			UIViewController fromViewController, String identifier);

	/**
	 * separateSecondaryViewControllerForSplitViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/separateSecondaryViewControllerForSplitViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("separateSecondaryViewControllerForSplitViewController:")
	public native UIViewController separateSecondaryViewControllerForSplitViewController(
			UISplitViewController splitViewController);

	/**
	 * automaticallyAdjustsScrollViewInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/automaticallyAdjustsScrollViewInsets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAutomaticallyAdjustsScrollViewInsets:")
	public native void setAutomaticallyAdjustsScrollViewInsets(boolean value);

	/**
	 * canDisplayBannerAds</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/canDisplayBannerAds">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCanDisplayBannerAds:")
	public native void setCanDisplayBannerAds(boolean value);

	/**
	 * contentSizeForViewInPopover</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/contentSizeForViewInPopover">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setContentSizeForViewInPopover:")
	public native void setContentSizeForViewInPopover(@ByValue CGSize value);

	/**
	 * definesPresentationContext</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/definesPresentationContext">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDefinesPresentationContext:")
	public native void setDefinesPresentationContext(boolean value);

	/**
	 * edgesForExtendedLayout</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/edgesForExtendedLayout">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEdgesForExtendedLayout:")
	public native void setEdgesForExtendedLayout(@NUInt long value);

	/**
	 * editing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/editing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEditing:")
	public native void setEditing(boolean value);

	/**
	 * setEditing:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/setEditing:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEditing:animated:")
	public native void setEditingAnimated(boolean editing, boolean animated);

	/**
	 * extendedLayoutIncludesOpaqueBars</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/extendedLayoutIncludesOpaqueBars">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setExtendedLayoutIncludesOpaqueBars:")
	public native void setExtendedLayoutIncludesOpaqueBars(boolean value);

	/**
	 * hidesBottomBarWhenPushed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/hidesBottomBarWhenPushed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHidesBottomBarWhenPushed:")
	public native void setHidesBottomBarWhenPushed(boolean value);

	/**
	 * interstitialPresentationPolicy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/interstitialPresentationPolicy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setInterstitialPresentationPolicy:")
	public native void setInterstitialPresentationPolicy(@NInt long value);

	/**
	 * modalInPopover</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalInPopover">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setModalInPopover:")
	public native void setModalInPopover(boolean value);

	/**
	 * modalPresentationCapturesStatusBarAppearance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalPresentationCapturesStatusBarAppearance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setModalPresentationCapturesStatusBarAppearance:")
	public native void setModalPresentationCapturesStatusBarAppearance(
			boolean value);

	/**
	 * modalPresentationStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalPresentationStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setModalPresentationStyle:")
	public native void setModalPresentationStyle(@NInt long value);

	/**
	 * modalTransitionStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/modalTransitionStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setModalTransitionStyle:")
	public native void setModalTransitionStyle(@NInt long value);

	/**
	 * setNeedsStatusBarAppearanceUpdate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/setNeedsStatusBarAppearanceUpdate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNeedsStatusBarAppearanceUpdate")
	public native void setNeedsStatusBarAppearanceUpdate();

	/**
	 * setOverrideTraitCollection:forChildViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/setOverrideTraitCollection:forChildViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOverrideTraitCollection:forChildViewController:")
	public native void setOverrideTraitCollectionForChildViewController(
			UITraitCollection collection, UIViewController childViewController);

	/**
	 * preferredContentSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/preferredContentSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPreferredContentSize:")
	public native void setPreferredContentSize(@ByValue CGSize value);

	/**
	 * providesPresentationContextTransitionStyle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/providesPresentationContextTransitionStyle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProvidesPresentationContextTransitionStyle:")
	public native void setProvidesPresentationContextTransitionStyle(
			boolean value);

	/**
	 * restorationClass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/restorationClass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRestorationClass:")
	public native void setRestorationClass_unsafe(
			@Mapped(ObjCObjectMapper.class) UIViewControllerRestoration value);

	/**
	 * restorationClass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/restorationClass">iOS Dev Center</a>
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
	 * restorationIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/restorationIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRestorationIdentifier:")
	public native void setRestorationIdentifier(String value);

	/**
	 * tabBarItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/tabBarItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTabBarItem:")
	public native void setTabBarItem(UITabBarItem value);

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTitle:")
	public native void setTitle(String value);

	/**
	 * toolbarItems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/toolbarItems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setToolbarItems:")
	public native void setToolbarItems(NSArray<? extends UIBarButtonItem> value);

	/**
	 * setToolbarItems:animated:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/setToolbarItems:animated:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setToolbarItems:animated:")
	public native void setToolbarItemsAnimated(NSArray<? extends UIBarButtonItem> toolbarItems,
			boolean animated);

	/**
	 * transitioningDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/transitioningDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTransitioningDelegate:")
	public native void setTransitioningDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) UIViewControllerTransitioningDelegate value);

	/**
	 * transitioningDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/transitioningDelegate">iOS Dev Center</a>
	 */
	@Generated
	public void setTransitioningDelegate(
			@Mapped(ObjCObjectMapper.class) UIViewControllerTransitioningDelegate value) {
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
	 * view</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/view">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setView:")
	public native void setView(UIView value);

	/**
	 * wantsFullScreenLayout</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/wantsFullScreenLayout">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setWantsFullScreenLayout:")
	public native void setWantsFullScreenLayout(boolean value);

	/**
	 * shouldAutomaticallyForwardAppearanceMethods</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/shouldAutomaticallyForwardAppearanceMethods">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldAutomaticallyForwardAppearanceMethods")
	public native boolean shouldAutomaticallyForwardAppearanceMethods();

	/**
	 * shouldAutomaticallyForwardRotationMethods</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/shouldAutomaticallyForwardRotationMethods">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("shouldAutomaticallyForwardRotationMethods")
	public native boolean shouldAutomaticallyForwardRotationMethods();

	/**
	 * shouldAutorotate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/shouldAutorotate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldAutorotate")
	public native boolean shouldAutorotate();

	/**
	 * shouldAutorotateToInterfaceOrientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/shouldAutorotateToInterfaceOrientation:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("shouldAutorotateToInterfaceOrientation:")
	public native boolean shouldAutorotateToInterfaceOrientation(
			@NInt long toInterfaceOrientation);

	/**
	 * shouldPerformSegueWithIdentifier:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/shouldPerformSegueWithIdentifier:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldPerformSegueWithIdentifier:sender:")
	public native boolean shouldPerformSegueWithIdentifierSender(
			String identifier, @Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("shouldPresentInterstitialAd")
	public native boolean shouldPresentInterstitialAd();

	/**
	 * showDetailViewController:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/showDetailViewController:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showDetailViewController:sender:")
	public native void showDetailViewControllerSender(UIViewController vc,
			@Mapped(ObjCObjectMapper.class) Object sender);

	/**
	 * showViewController:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/showViewController:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showViewController:sender:")
	public native void showViewControllerSender(UIViewController vc,
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("sizeForChildContentContainer:withParentContainerSize:")
	@ByValue
	public native CGSize sizeForChildContentContainerWithParentContainerSize(
			@Mapped(ObjCObjectMapper.class) Object container,
			@ByValue CGSize parentSize);

	/**
	 * splitViewController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/splitViewController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("splitViewController")
	public native UISplitViewController splitViewController();

	/**
	 * storyboard</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/storyboard">iOS Dev Center</a>
	 */
	@Generated
	@Selector("storyboard")
	public native UIStoryboard storyboard();

	/**
	 * supportedInterfaceOrientations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/supportedInterfaceOrientations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportedInterfaceOrientations")
	@NUInt
	public native long supportedInterfaceOrientations();

	@Generated
	@Selector("systemLayoutFittingSizeDidChangeForChildContentContainer:")
	public native void systemLayoutFittingSizeDidChangeForChildContentContainer(
			@Mapped(ObjCObjectMapper.class) Object container);

	/**
	 * tabBarController</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/tabBarController">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tabBarController")
	public native UITabBarController tabBarController();

	/**
	 * tabBarItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/tabBarItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tabBarItem")
	public native UITabBarItem tabBarItem();

	/**
	 * targetViewControllerForAction:sender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/targetViewControllerForAction:sender:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("targetViewControllerForAction:sender:")
	public native UIViewController targetViewControllerForActionSender(
			SEL action, @Mapped(ObjCObjectMapper.class) Object sender);

	/**
	 * title</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/title">iOS Dev Center</a>
	 */
	@Generated
	@Selector("title")
	public native String title();

	/**
	 * toolbarItems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/toolbarItems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("toolbarItems")
	public native NSArray<? extends UIBarButtonItem> toolbarItems();

	/**
	 * topLayoutGuide</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/topLayoutGuide">iOS Dev Center</a>
	 */
	@Generated
	@Selector("topLayoutGuide")
	@MappedReturn(ObjCObjectMapper.class)
	public native UILayoutSupport topLayoutGuide();

	@Generated
	@Selector("traitCollection")
	public native UITraitCollection traitCollection();

	@Generated
	@Selector("traitCollectionDidChange:")
	public native void traitCollectionDidChange(
			UITraitCollection previousTraitCollection);

	/**
	 * transitionCoordinator</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/transitionCoordinator">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transitionCoordinator")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIViewControllerTransitionCoordinator transitionCoordinator();

	/**
	 * transitionFromViewController:toViewController:duration:options:animations:completion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/transitionFromViewController:toViewController:duration:options:animations:completion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transitionFromViewController:toViewController:duration:options:animations:completion:")
	public native void transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion(
			UIViewController fromViewController,
			UIViewController toViewController,
			double duration,
			@NUInt long options,
			@ObjCBlock(name = "call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_4") Block_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_4 animations,
			@ObjCBlock(name = "call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5") Block_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5 completion);

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
		void call_transitionFromViewControllerToViewControllerDurationOptionsAnimationsCompletion_5(
				boolean arg0);
	}

	/**
	 * transitioningDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/transitioningDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transitioningDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIViewControllerTransitioningDelegate transitioningDelegate();

	/**
	 * updateViewConstraints</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/updateViewConstraints">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updateViewConstraints")
	public native void updateViewConstraints();

	/**
	 * view</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/view">iOS Dev Center</a>
	 */
	@Generated
	@Selector("view")
	public native UIView view();

	/**
	 * viewControllerForUnwindSegueAction:fromViewController:withSender:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewControllerForUnwindSegueAction:fromViewController:withSender:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("viewControllerForUnwindSegueAction:fromViewController:withSender:")
	public native UIViewController viewControllerForUnwindSegueActionFromViewControllerWithSender(
			SEL action, UIViewController fromViewController,
			@Mapped(ObjCObjectMapper.class) Object sender);

	/**
	 * viewDidAppear:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewDidAppear:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewDidAppear:")
	public native void viewDidAppear(boolean animated);

	/**
	 * viewDidDisappear:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewDidDisappear:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewDidDisappear:")
	public native void viewDidDisappear(boolean animated);

	/**
	 * viewDidLayoutSubviews</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewDidLayoutSubviews">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewDidLayoutSubviews")
	public native void viewDidLayoutSubviews();

	/**
	 * viewDidLoad</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewDidLoad">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewDidLoad")
	public native void viewDidLoad();

	/**
	 * viewDidUnload</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewDidUnload">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("viewDidUnload")
	public native void viewDidUnload();

	/**
	 * viewWillAppear:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewWillAppear:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewWillAppear:")
	public native void viewWillAppear(boolean animated);

	/**
	 * viewWillDisappear:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewWillDisappear:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewWillDisappear:")
	public native void viewWillDisappear(boolean animated);

	/**
	 * viewWillLayoutSubviews</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewWillLayoutSubviews">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewWillLayoutSubviews")
	public native void viewWillLayoutSubviews();

	@Generated
	@Selector("viewWillTransitionToSize:withTransitionCoordinator:")
	public native void viewWillTransitionToSizeWithTransitionCoordinator(
			@ByValue CGSize size,
			@Mapped(ObjCObjectMapper.class) Object coordinator);

	/**
	 * viewWillUnload</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/viewWillUnload">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("viewWillUnload")
	public native void viewWillUnload();

	/**
	 * wantsFullScreenLayout</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/wantsFullScreenLayout">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("wantsFullScreenLayout")
	public native boolean wantsFullScreenLayout();

	/**
	 * willAnimateFirstHalfOfRotationToInterfaceOrientation:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/willAnimateFirstHalfOfRotationToInterfaceOrientation:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("willAnimateFirstHalfOfRotationToInterfaceOrientation:duration:")
	public native void willAnimateFirstHalfOfRotationToInterfaceOrientationDuration(
			@NInt long toInterfaceOrientation, double duration);

	/**
	 * willAnimateRotationToInterfaceOrientation:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/willAnimateRotationToInterfaceOrientation:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("willAnimateRotationToInterfaceOrientation:duration:")
	public native void willAnimateRotationToInterfaceOrientationDuration(
			@NInt long toInterfaceOrientation, double duration);

	/**
	 * willAnimateSecondHalfOfRotationFromInterfaceOrientation:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/willAnimateSecondHalfOfRotationFromInterfaceOrientation:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("willAnimateSecondHalfOfRotationFromInterfaceOrientation:duration:")
	public native void willAnimateSecondHalfOfRotationFromInterfaceOrientationDuration(
			@NInt long fromInterfaceOrientation, double duration);

	/**
	 * willMoveToParentViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/willMoveToParentViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("willMoveToParentViewController:")
	public native void willMoveToParentViewController(UIViewController parent);

	/**
	 * willRotateToInterfaceOrientation:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/willRotateToInterfaceOrientation:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("willRotateToInterfaceOrientation:duration:")
	public native void willRotateToInterfaceOrientationDuration(
			@NInt long toInterfaceOrientation, double duration);

	@Generated
	@Selector("willTransitionToTraitCollection:withTransitionCoordinator:")
	public native void willTransitionToTraitCollectionWithTransitionCoordinator(
			UITraitCollection newCollection,
			@Mapped(ObjCObjectMapper.class) Object coordinator);

	/**
	 * addKeyCommand:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/addKeyCommand:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addKeyCommand:")
	public native void addKeyCommand(UIKeyCommand keyCommand);

	/**
	 * allowedChildViewControllersForUnwindingFromSource:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/allowedChildViewControllersForUnwindingFromSource:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowedChildViewControllersForUnwindingFromSource:")
	public native NSArray<? extends UIViewController> allowedChildViewControllersForUnwindingFromSource(UIStoryboardUnwindSegueSource source);

	/**
	 * childViewControllerContainingSegueSource:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/childViewControllerContainingSegueSource:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("childViewControllerContainingSegueSource:")
	public native UIViewController childViewControllerContainingSegueSource(UIStoryboardUnwindSegueSource source);

	/**
	 * loadViewIfNeeded</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/loadViewIfNeeded">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loadViewIfNeeded")
	public native void loadViewIfNeeded();

	/**
	 * removeKeyCommand:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/removeKeyCommand:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeKeyCommand:")
	public native void removeKeyCommand(UIKeyCommand keyCommand);

	/**
	 * unwindForSegue:towardsViewController:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/unwindForSegue:towardsViewController:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unwindForSegue:towardsViewController:")
	public native void unwindForSegueTowardsViewController(UIStoryboardSegue unwindSegue,
			UIViewController subsequentVC);

	/**
	 * viewIfLoaded</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instp/UIViewController/viewIfLoaded">iOS Dev Center</a>
	 */
	@Generated
	@Selector("viewIfLoaded")
	public native UIView viewIfLoaded();

	/**
	 * previewActionItems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/previewActionItems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("previewActionItems")
	public native NSArray<?> previewActionItems();

	/**
	 * registerForPreviewingWithDelegate:sourceView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/registerForPreviewingWithDelegate:sourceView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("registerForPreviewingWithDelegate:sourceView:")
	@MappedReturn(ObjCObjectMapper.class)
	public native UIViewControllerPreviewing registerForPreviewingWithDelegateSourceView(@Mapped(ObjCObjectMapper.class) UIViewControllerPreviewingDelegate delegate,
			UIView sourceView);

	/**
	 * unregisterForPreviewingWithContext:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIViewController_Class/index.html#//apple_ref/occ/instm/UIViewController/unregisterForPreviewingWithContext:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unregisterForPreviewingWithContext:")
	public native void unregisterForPreviewingWithContext(@Mapped(ObjCObjectMapper.class) UIViewControllerPreviewing previewing);

	@Generated
	@Selector("didUpdateFocusInContext:withAnimationCoordinator:")
	public native void didUpdateFocusInContextWithAnimationCoordinator(
			UIFocusUpdateContext context,
			UIFocusAnimationCoordinator coordinator);

	@Generated
	@Selector("preferredFocusedView")
	public native UIView preferredFocusedView();

	@Generated
	@Selector("setNeedsFocusUpdate")
	public native void setNeedsFocusUpdate();

	@Generated
	@Selector("shouldUpdateFocusInContext:")
	public native boolean shouldUpdateFocusInContext(
			UIFocusUpdateContext context);

	@Generated
	@Selector("updateFocusIfNeeded")
	public native void updateFocusIfNeeded();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version();
}
