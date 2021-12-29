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
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UICollectionViewDataSource;
import apple.uikit.protocol.UICollectionViewDelegate;
import apple.uikit.protocol.UIContextMenuInteractionAnimating;
import apple.uikit.protocol.UIContextMenuInteractionCommitAnimating;
import apple.uikit.protocol.UISpringLoadedInteractionContext;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
public class UICollectionViewController extends UIViewController
        implements UICollectionViewDelegate, UICollectionViewDataSource {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewController allocWithZone(VoidPtr zone);

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
    public static native UICollectionViewController new_objc();

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
     * Defaults to YES, and if YES, any selection is cleared in viewWillAppear:
     * This property has no effect if the useLayoutToLayoutNavigationTransitions property is set to YES
     */
    @Generated
    @Selector("clearsSelectionOnViewWillAppear")
    public native boolean clearsSelectionOnViewWillAppear();

    @Generated
    @Selector("collectionView")
    public native UICollectionView collectionView();

    @Generated
    @IsOptional
    @Selector("collectionView:canFocusItemAtIndexPath:")
    public native boolean collectionViewCanFocusItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:canMoveItemAtIndexPath:")
    public native boolean collectionViewCanMoveItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    public native boolean collectionViewCanPerformActionForItemAtIndexPathWithSender(UICollectionView collectionView,
            SEL action, NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("collectionView:cellForItemAtIndexPath:")
    public native UICollectionViewCell collectionViewCellForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didDeselectItemAtIndexPath:")
    public native void collectionViewDidDeselectItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    public native void collectionViewDidEndDisplayingCellForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewCell cell, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    public native void collectionViewDidEndDisplayingSupplementaryViewForElementOfKindAtIndexPath(
            UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didHighlightItemAtIndexPath:")
    public native void collectionViewDidHighlightItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didSelectItemAtIndexPath:")
    public native void collectionViewDidSelectItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didUnhighlightItemAtIndexPath:")
    public native void collectionViewDidUnhighlightItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didUpdateFocusInContext:withAnimationCoordinator:")
    public native void collectionViewDidUpdateFocusInContextWithAnimationCoordinator(UICollectionView collectionView,
            UICollectionViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);

    @Generated
    @IsOptional
    @Selector("collectionView:moveItemAtIndexPath:toIndexPath:")
    public native void collectionViewMoveItemAtIndexPathToIndexPath(UICollectionView collectionView,
            NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);

    @Generated
    @Selector("collectionView:numberOfItemsInSection:")
    @NInt
    public native long collectionViewNumberOfItemsInSection(UICollectionView collectionView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("collectionView:performAction:forItemAtIndexPath:withSender:")
    public native void collectionViewPerformActionForItemAtIndexPathWithSender(UICollectionView collectionView,
            SEL action, NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldDeselectItemAtIndexPath:")
    public native boolean collectionViewShouldDeselectItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldHighlightItemAtIndexPath:")
    public native boolean collectionViewShouldHighlightItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldSelectItemAtIndexPath:")
    public native boolean collectionViewShouldSelectItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldShowMenuForItemAtIndexPath:")
    public native boolean collectionViewShouldShowMenuForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldUpdateFocusInContext:")
    public native boolean collectionViewShouldUpdateFocusInContext(UICollectionView collectionView,
            UICollectionViewFocusUpdateContext context);

    @Generated
    @IsOptional
    @Selector("collectionView:targetContentOffsetForProposedContentOffset:")
    @ByValue
    public native CGPoint collectionViewTargetContentOffsetForProposedContentOffset(UICollectionView collectionView,
            @ByValue CGPoint proposedContentOffset);

    @Generated
    @IsOptional
    @Selector("collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:")
    public native NSIndexPath collectionViewTargetIndexPathForMoveFromItemAtIndexPathToProposedIndexPath(
            UICollectionView collectionView, NSIndexPath currentIndexPath, NSIndexPath proposedIndexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:transitionLayoutForOldLayout:newLayout:")
    public native UICollectionViewTransitionLayout collectionViewTransitionLayoutForOldLayoutNewLayout(
            UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout);

    @Generated
    @IsOptional
    @Selector("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionReusableView collectionViewViewForSupplementaryElementOfKindAtIndexPath(
            UICollectionView collectionView, String kind, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:willDisplayCell:forItemAtIndexPath:")
    public native void collectionViewWillDisplayCellForItemAtIndexPath(UICollectionView collectionView,
            UICollectionViewCell cell, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    public native void collectionViewWillDisplaySupplementaryViewForElementKindAtIndexPath(
            UICollectionView collectionView, UICollectionReusableView view, String elementKind, NSIndexPath indexPath);

    /**
     * The layout object is needed when defining interactive layout to layout transitions.
     */
    @Generated
    @Selector("collectionViewLayout")
    public native UICollectionViewLayout collectionViewLayout();

    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInCollectionView:")
    public native NSIndexPath indexPathForPreferredFocusedViewInCollectionView(UICollectionView collectionView);

    @Generated
    @Selector("init")
    public native UICollectionViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCollectionViewLayout:")
    public native UICollectionViewController initWithCollectionViewLayout(UICollectionViewLayout layout);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UICollectionViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * Defaults to YES, and if YES, a system standard reordering gesture is used to drive collection view reordering
     */
    @Generated
    @Selector("installsStandardGestureForInteractiveMovement")
    public native boolean installsStandardGestureForInteractiveMovement();

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInCollectionView:")
    @NInt
    public native long numberOfSectionsInCollectionView(UICollectionView collectionView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDecelerating:")
    public native void scrollViewDidEndDecelerating(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDragging:willDecelerate:")
    public native void scrollViewDidEndDraggingWillDecelerate(UIScrollView scrollView, boolean decelerate);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndScrollingAnimation:")
    public native void scrollViewDidEndScrollingAnimation(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndZooming:withView:atScale:")
    public native void scrollViewDidEndZoomingWithViewAtScale(UIScrollView scrollView, UIView view,
            @NFloat double scale);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScroll:")
    public native void scrollViewDidScroll(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScrollToTop:")
    public native void scrollViewDidScrollToTop(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidZoom:")
    public native void scrollViewDidZoom(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewShouldScrollToTop:")
    public native boolean scrollViewShouldScrollToTop(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDecelerating:")
    public native void scrollViewWillBeginDecelerating(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDragging:")
    public native void scrollViewWillBeginDragging(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginZooming:withView:")
    public native void scrollViewWillBeginZoomingWithView(UIScrollView scrollView, UIView view);

    @Generated
    @IsOptional
    @Selector("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void scrollViewWillEndDraggingWithVelocityTargetContentOffset(UIScrollView scrollView,
            @ByValue CGPoint velocity, CGPoint targetContentOffset);

    /**
     * Defaults to YES, and if YES, any selection is cleared in viewWillAppear:
     * This property has no effect if the useLayoutToLayoutNavigationTransitions property is set to YES
     */
    @Generated
    @Selector("setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean value);

    @Generated
    @Selector("setCollectionView:")
    public native void setCollectionView(UICollectionView value);

    /**
     * Defaults to YES, and if YES, a system standard reordering gesture is used to drive collection view reordering
     */
    @Generated
    @Selector("setInstallsStandardGestureForInteractiveMovement:")
    public native void setInstallsStandardGestureForInteractiveMovement(boolean value);

    /**
     * Set to YES before pushing a a UICollectionViewController onto a
     * UINavigationController. The top view controller of the navigation controller
     * must be a UICollectionViewController that was pushed with this property set
     * to NO. This property should NOT be changed on a UICollectionViewController that
     * has already been pushed onto a UINavigationController.
     */
    @Generated
    @Selector("setUseLayoutToLayoutNavigationTransitions:")
    public native void setUseLayoutToLayoutNavigationTransitions(boolean value);

    /**
     * Set to YES before pushing a a UICollectionViewController onto a
     * UINavigationController. The top view controller of the navigation controller
     * must be a UICollectionViewController that was pushed with this property set
     * to NO. This property should NOT be changed on a UICollectionViewController that
     * has already been pushed onto a UINavigationController.
     */
    @Generated
    @Selector("useLayoutToLayoutNavigationTransitions")
    public native boolean useLayoutToLayoutNavigationTransitions();

    @Generated
    @IsOptional
    @Selector("viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("collectionView:indexPathForIndexTitle:atIndex:")
    public native NSIndexPath collectionViewIndexPathForIndexTitleAtIndex(UICollectionView collectionView, String title,
            @NInt long index);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldSpringLoadItemAtIndexPath:withContext:")
    public native boolean collectionViewShouldSpringLoadItemAtIndexPathWithContext(UICollectionView collectionView,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context);

    @Generated
    @IsOptional
    @Selector("indexTitlesForCollectionView:")
    public native NSArray<String> indexTitlesForCollectionView(UICollectionView collectionView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidChangeAdjustedContentInset:")
    public native void scrollViewDidChangeAdjustedContentInset(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfigurationForItemAtIndexPath:point:")
    public native UIContextMenuConfiguration collectionViewContextMenuConfigurationForItemAtIndexPathPoint(
            UICollectionView collectionView, NSIndexPath indexPath, @ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("collectionView:didBeginMultipleSelectionInteractionAtIndexPath:")
    public native void collectionViewDidBeginMultipleSelectionInteractionAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:previewForDismissingContextMenuWithConfiguration:")
    public native UITargetedPreview collectionViewPreviewForDismissingContextMenuWithConfiguration(
            UICollectionView collectionView, UIContextMenuConfiguration configuration);

    @Generated
    @IsOptional
    @Selector("collectionView:previewForHighlightingContextMenuWithConfiguration:")
    public native UITargetedPreview collectionViewPreviewForHighlightingContextMenuWithConfiguration(
            UICollectionView collectionView, UIContextMenuConfiguration configuration);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    public native boolean collectionViewShouldBeginMultipleSelectionInteractionAtIndexPath(
            UICollectionView collectionView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public native void collectionViewWillPerformPreviewActionForMenuWithConfigurationAnimator(
            UICollectionView collectionView, UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator);

    @Generated
    @IsOptional
    @Selector("collectionViewDidEndMultipleSelectionInteraction:")
    public native void collectionViewDidEndMultipleSelectionInteraction(UICollectionView collectionView);

    @Generated
    @IsOptional
    @Selector("collectionView:canEditItemAtIndexPath:")
    public native boolean collectionViewCanEditItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:willDisplayContextMenuWithConfiguration:animator:")
    public native void collectionViewWillDisplayContextMenuWithConfigurationAnimator(UICollectionView collectionView,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator);

    @Generated
    @IsOptional
    @Selector("collectionView:willEndContextMenuInteractionWithConfiguration:animator:")
    public native void collectionViewWillEndContextMenuInteractionWithConfigurationAnimator(
            UICollectionView collectionView, UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator);

    @Generated
    @IsOptional
    @Selector("collectionView:sceneActivationConfigurationForItemAtIndexPath:point:")
    public native UIWindowSceneActivationConfiguration collectionViewSceneActivationConfigurationForItemAtIndexPathPoint(
            UICollectionView collectionView, NSIndexPath indexPath, @ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("collectionView:selectionFollowsFocusForItemAtIndexPath:")
    public native boolean collectionViewSelectionFollowsFocusForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:")
    public native NSIndexPath collectionViewTargetIndexPathForMoveOfItemFromOriginalIndexPathAtCurrentIndexPathToProposedIndexPath(
            UICollectionView collectionView, NSIndexPath originalIndexPath, NSIndexPath currentIndexPath,
            NSIndexPath proposedIndexPath);
}
