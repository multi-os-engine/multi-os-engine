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
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 6.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewController extends UIViewController implements UICollectionViewDelegate,
        UICollectionViewDataSource {
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

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public native boolean collectionViewCanFocusItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:canMoveItemAtIndexPath:")
    public native boolean collectionViewCanMoveItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    public native boolean collectionViewCanPerformActionForItemAtIndexPathWithSender(
            @NotNull UICollectionView collectionView, @NotNull SEL action, @NotNull NSIndexPath indexPath,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @NotNull
    @Generated
    @Selector("collectionView:cellForItemAtIndexPath:")
    public native UICollectionViewCell collectionViewCellForItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didDeselectItemAtIndexPath:")
    public native void collectionViewDidDeselectItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    public native void collectionViewDidEndDisplayingCellForItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull UICollectionViewCell cell, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    public native void collectionViewDidEndDisplayingSupplementaryViewForElementOfKindAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull UICollectionReusableView view,
            @NotNull String elementKind, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didHighlightItemAtIndexPath:")
    public native void collectionViewDidHighlightItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didSelectItemAtIndexPath:")
    public native void collectionViewDidSelectItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didUnhighlightItemAtIndexPath:")
    public native void collectionViewDidUnhighlightItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:didUpdateFocusInContext:withAnimationCoordinator:")
    public native void collectionViewDidUpdateFocusInContextWithAnimationCoordinator(
            @NotNull UICollectionView collectionView, @NotNull UICollectionViewFocusUpdateContext context,
            @NotNull UIFocusAnimationCoordinator coordinator);

    @Generated
    @IsOptional
    @Selector("collectionView:moveItemAtIndexPath:toIndexPath:")
    public native void collectionViewMoveItemAtIndexPathToIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath sourceIndexPath, @NotNull NSIndexPath destinationIndexPath);

    @Generated
    @Selector("collectionView:numberOfItemsInSection:")
    @NInt
    public native long collectionViewNumberOfItemsInSection(@NotNull UICollectionView collectionView,
            @NInt long section);

    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:performAction:forItemAtIndexPath:withSender:")
    public native void collectionViewPerformActionForItemAtIndexPathWithSender(@NotNull UICollectionView collectionView,
            @NotNull SEL action, @NotNull NSIndexPath indexPath,
            @Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldDeselectItemAtIndexPath:")
    public native boolean collectionViewShouldDeselectItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldHighlightItemAtIndexPath:")
    public native boolean collectionViewShouldHighlightItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldSelectItemAtIndexPath:")
    public native boolean collectionViewShouldSelectItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:shouldShowMenuForItemAtIndexPath:")
    public native boolean collectionViewShouldShowMenuForItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldUpdateFocusInContext:")
    public native boolean collectionViewShouldUpdateFocusInContext(@NotNull UICollectionView collectionView,
            @NotNull UICollectionViewFocusUpdateContext context);

    @Generated
    @IsOptional
    @Selector("collectionView:targetContentOffsetForProposedContentOffset:")
    @ByValue
    public native CGPoint collectionViewTargetContentOffsetForProposedContentOffset(
            @NotNull UICollectionView collectionView, @ByValue CGPoint proposedContentOffset);

    @NotNull
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:targetIndexPathForMoveFromItemAtIndexPath:toProposedIndexPath:")
    public native NSIndexPath collectionViewTargetIndexPathForMoveFromItemAtIndexPathToProposedIndexPath(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath currentIndexPath,
            @NotNull NSIndexPath proposedIndexPath);

    @NotNull
    @Generated
    @IsOptional
    @Selector("collectionView:transitionLayoutForOldLayout:newLayout:")
    public native UICollectionViewTransitionLayout collectionViewTransitionLayoutForOldLayoutNewLayout(
            @NotNull UICollectionView collectionView, @NotNull UICollectionViewLayout fromLayout,
            @NotNull UICollectionViewLayout toLayout);

    @NotNull
    @Generated
    @IsOptional
    @Selector("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionReusableView collectionViewViewForSupplementaryElementOfKindAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull String kind, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:willDisplayCell:forItemAtIndexPath:")
    public native void collectionViewWillDisplayCellForItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull UICollectionViewCell cell, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:willDisplaySupplementaryView:forElementKind:atIndexPath:")
    public native void collectionViewWillDisplaySupplementaryViewForElementKindAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull UICollectionReusableView view,
            @NotNull String elementKind, @NotNull NSIndexPath indexPath);

    /**
     * The layout object is needed when defining interactive layout to layout transitions.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("collectionViewLayout")
    public native UICollectionViewLayout collectionViewLayout();

    @Nullable
    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInCollectionView:")
    public native NSIndexPath indexPathForPreferredFocusedViewInCollectionView(
            @NotNull UICollectionView collectionView);

    @Generated
    @Selector("init")
    public native UICollectionViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCollectionViewLayout:")
    public native UICollectionViewController initWithCollectionViewLayout(@NotNull UICollectionViewLayout layout);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UICollectionViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * Defaults to YES, and if YES, a system standard reordering gesture is used to drive collection view reordering
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("installsStandardGestureForInteractiveMovement")
    public native boolean installsStandardGestureForInteractiveMovement();

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInCollectionView:")
    @NInt
    public native long numberOfSectionsInCollectionView(@NotNull UICollectionView collectionView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDecelerating:")
    public native void scrollViewDidEndDecelerating(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndDragging:willDecelerate:")
    public native void scrollViewDidEndDraggingWillDecelerate(@NotNull UIScrollView scrollView, boolean decelerate);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndScrollingAnimation:")
    public native void scrollViewDidEndScrollingAnimation(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidEndZooming:withView:atScale:")
    public native void scrollViewDidEndZoomingWithViewAtScale(@NotNull UIScrollView scrollView, @Nullable UIView view,
            @NFloat double scale);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScroll:")
    public native void scrollViewDidScroll(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidScrollToTop:")
    public native void scrollViewDidScrollToTop(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidZoom:")
    public native void scrollViewDidZoom(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewShouldScrollToTop:")
    public native boolean scrollViewShouldScrollToTop(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDecelerating:")
    public native void scrollViewWillBeginDecelerating(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginDragging:")
    public native void scrollViewWillBeginDragging(@NotNull UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewWillBeginZooming:withView:")
    public native void scrollViewWillBeginZoomingWithView(@NotNull UIScrollView scrollView, @Nullable UIView view);

    @Generated
    @IsOptional
    @Selector("scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void scrollViewWillEndDraggingWithVelocityTargetContentOffset(@NotNull UIScrollView scrollView,
            @ByValue CGPoint velocity, @NotNull CGPoint targetContentOffset);

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
     * 
     * API-Since: 9.0
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
     * 
     * API-Since: 7.0
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
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("useLayoutToLayoutNavigationTransitions")
    public native boolean useLayoutToLayoutNavigationTransitions();

    @Nullable
    @Generated
    @IsOptional
    @Selector("viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView(@NotNull UIScrollView scrollView);

    @NotNull
    @Generated
    @IsOptional
    @Selector("collectionView:indexPathForIndexTitle:atIndex:")
    public native NSIndexPath collectionViewIndexPathForIndexTitleAtIndex(@NotNull UICollectionView collectionView,
            @NotNull String title, @NInt long index);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldSpringLoadItemAtIndexPath:withContext:")
    public native boolean collectionViewShouldSpringLoadItemAtIndexPathWithContext(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath indexPath,
            @NotNull @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context);

    @Nullable
    @Generated
    @IsOptional
    @Selector("indexTitlesForCollectionView:")
    public native NSArray<String> indexTitlesForCollectionView(@NotNull UICollectionView collectionView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidChangeAdjustedContentInset:")
    public native void scrollViewDidChangeAdjustedContentInset(@NotNull UIScrollView scrollView);

    @Nullable
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfigurationForItemAtIndexPath:point:")
    public native UIContextMenuConfiguration collectionViewContextMenuConfigurationForItemAtIndexPathPoint(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath indexPath, @ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("collectionView:didBeginMultipleSelectionInteractionAtIndexPath:")
    public native void collectionViewDidBeginMultipleSelectionInteractionAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath indexPath);

    @Nullable
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:previewForDismissingContextMenuWithConfiguration:")
    public native UITargetedPreview collectionViewPreviewForDismissingContextMenuWithConfiguration(
            @NotNull UICollectionView collectionView, @NotNull UIContextMenuConfiguration configuration);

    @Nullable
    @Deprecated
    @Generated
    @IsOptional
    @Selector("collectionView:previewForHighlightingContextMenuWithConfiguration:")
    public native UITargetedPreview collectionViewPreviewForHighlightingContextMenuWithConfiguration(
            @NotNull UICollectionView collectionView, @NotNull UIContextMenuConfiguration configuration);

    @Generated
    @IsOptional
    @Selector("collectionView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    public native boolean collectionViewShouldBeginMultipleSelectionInteractionAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public native void collectionViewWillPerformPreviewActionForMenuWithConfigurationAnimator(
            @NotNull UICollectionView collectionView, @NotNull UIContextMenuConfiguration configuration,
            @NotNull @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator);

    @Generated
    @IsOptional
    @Selector("collectionViewDidEndMultipleSelectionInteraction:")
    public native void collectionViewDidEndMultipleSelectionInteraction(@NotNull UICollectionView collectionView);

    @Generated
    @IsOptional
    @Selector("collectionView:canEditItemAtIndexPath:")
    public native boolean collectionViewCanEditItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:willDisplayContextMenuWithConfiguration:animator:")
    public native void collectionViewWillDisplayContextMenuWithConfigurationAnimator(
            @NotNull UICollectionView collectionView, @NotNull UIContextMenuConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator);

    @Generated
    @IsOptional
    @Selector("collectionView:willEndContextMenuInteractionWithConfiguration:animator:")
    public native void collectionViewWillEndContextMenuInteractionWithConfigurationAnimator(
            @NotNull UICollectionView collectionView, @NotNull UIContextMenuConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator);

    @Nullable
    @Generated
    @IsOptional
    @Selector("collectionView:sceneActivationConfigurationForItemAtIndexPath:point:")
    public native UIWindowSceneActivationConfiguration collectionViewSceneActivationConfigurationForItemAtIndexPathPoint(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath indexPath, @ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("collectionView:selectionFollowsFocusForItemAtIndexPath:")
    public native boolean collectionViewSelectionFollowsFocusForItemAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath indexPath);

    @NotNull
    @Generated
    @IsOptional
    @Selector("collectionView:targetIndexPathForMoveOfItemFromOriginalIndexPath:atCurrentIndexPath:toProposedIndexPath:")
    public native NSIndexPath collectionViewTargetIndexPathForMoveOfItemFromOriginalIndexPathAtCurrentIndexPathToProposedIndexPath(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath originalIndexPath,
            @NotNull NSIndexPath currentIndexPath, @NotNull NSIndexPath proposedIndexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:canPerformPrimaryActionForItemAtIndexPath:")
    public native boolean collectionViewCanPerformPrimaryActionForItemAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfiguration:dismissalPreviewForItemAtIndexPath:")
    public native UITargetedPreview collectionViewContextMenuConfigurationDismissalPreviewForItemAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull UIContextMenuConfiguration configuration,
            @NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfiguration:highlightPreviewForItemAtIndexPath:")
    public native UITargetedPreview collectionViewContextMenuConfigurationHighlightPreviewForItemAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull UIContextMenuConfiguration configuration,
            @NotNull NSIndexPath indexPath);

    @Nullable
    @Generated
    @IsOptional
    @Selector("collectionView:contextMenuConfigurationForItemsAtIndexPaths:point:")
    public native UIContextMenuConfiguration collectionViewContextMenuConfigurationForItemsAtIndexPathsPoint(
            @NotNull UICollectionView collectionView, @NotNull NSArray<? extends NSIndexPath> indexPaths,
            @ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("collectionView:performPrimaryActionForItemAtIndexPath:")
    public native void collectionViewPerformPrimaryActionForItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);
}
