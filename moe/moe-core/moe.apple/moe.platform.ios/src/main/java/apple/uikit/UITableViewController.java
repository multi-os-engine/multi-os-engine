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
import apple.uikit.protocol.UIContextMenuInteractionCommitAnimating;
import apple.uikit.protocol.UISpringLoadedInteractionContext;
import apple.uikit.protocol.UITableViewDataSource;
import apple.uikit.protocol.UITableViewDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
public class UITableViewController extends UIViewController implements UITableViewDelegate, UITableViewDataSource {
    static {
        NatJ.register();
    }

    @Generated
    protected UITableViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITableViewController alloc();

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
    @Selector("clearsSelectionOnViewWillAppear")
    public native boolean clearsSelectionOnViewWillAppear();

    @Generated
    @IsOptional
    @Selector("indexPathForPreferredFocusedViewInTableView:")
    public native NSIndexPath indexPathForPreferredFocusedViewInTableView(UITableView tableView);

    @Generated
    @Selector("init")
    public native UITableViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native UITableViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UITableViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithStyle:")
    public native UITableViewController initWithStyle(@NInt long style);

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInTableView:")
    @NInt
    public native long numberOfSectionsInTableView(UITableView tableView);

    @Generated
    @Selector("refreshControl")
    public native UIRefreshControl refreshControl();

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

    @Generated
    @IsOptional
    @Selector("sectionIndexTitlesForTableView:")
    public native NSArray<String> sectionIndexTitlesForTableView(UITableView tableView);

    @Generated
    @Selector("setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean value);

    @Generated
    @Selector("setRefreshControl:")
    public native void setRefreshControl(UIRefreshControl value);

    @Generated
    @Selector("setTableView:")
    public native void setTableView(UITableView value);

    @Generated
    @Selector("tableView")
    public native UITableView tableView();

    @Generated
    @IsOptional
    @Selector("tableView:accessoryButtonTappedForRowWithIndexPath:")
    public native void tableViewAccessoryButtonTappedForRowWithIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Deprecated
    @Selector("tableView:accessoryTypeForRowWithIndexPath:")
    @NInt
    public native long tableViewAccessoryTypeForRowWithIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canEditRowAtIndexPath:")
    public native boolean tableViewCanEditRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canFocusRowAtIndexPath:")
    public native boolean tableViewCanFocusRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canMoveRowAtIndexPath:")
    public native boolean tableViewCanMoveRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canPerformAction:forRowAtIndexPath:withSender:")
    public native boolean tableViewCanPerformActionForRowAtIndexPathWithSender(UITableView tableView, SEL action,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @Selector("tableView:cellForRowAtIndexPath:")
    public native UITableViewCell tableViewCellForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void tableViewCommitEditingStyleForRowAtIndexPath(UITableView tableView, @NInt long editingStyle,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didDeselectRowAtIndexPath:")
    public native void tableViewDidDeselectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingCell:forRowAtIndexPath:")
    public native void tableViewDidEndDisplayingCellForRowAtIndexPath(UITableView tableView, UITableViewCell cell,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingFooterView:forSection:")
    public native void tableViewDidEndDisplayingFooterViewForSection(UITableView tableView, UIView view,
            @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:didEndDisplayingHeaderView:forSection:")
    public native void tableViewDidEndDisplayingHeaderViewForSection(UITableView tableView, UIView view,
            @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:didEndEditingRowAtIndexPath:")
    public native void tableViewDidEndEditingRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didHighlightRowAtIndexPath:")
    public native void tableViewDidHighlightRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didSelectRowAtIndexPath:")
    public native void tableViewDidSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didUnhighlightRowAtIndexPath:")
    public native void tableViewDidUnhighlightRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:didUpdateFocusInContext:withAnimationCoordinator:")
    public native void tableViewDidUpdateFocusInContextWithAnimationCoordinator(UITableView tableView,
            UITableViewFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);

    @Generated
    @IsOptional
    @Selector("tableView:editActionsForRowAtIndexPath:")
    public native NSArray<? extends UITableViewRowAction> tableViewEditActionsForRowAtIndexPath(UITableView tableView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:editingStyleForRowAtIndexPath:")
    @NInt
    public native long tableViewEditingStyleForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForFooterInSection:")
    @NFloat
    public native double tableViewEstimatedHeightForFooterInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForHeaderInSection:")
    @NFloat
    public native double tableViewEstimatedHeightForHeaderInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:estimatedHeightForRowAtIndexPath:")
    @NFloat
    public native double tableViewEstimatedHeightForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:heightForFooterInSection:")
    @NFloat
    public native double tableViewHeightForFooterInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:heightForHeaderInSection:")
    @NFloat
    public native double tableViewHeightForHeaderInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:heightForRowAtIndexPath:")
    @NFloat
    public native double tableViewHeightForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:indentationLevelForRowAtIndexPath:")
    @NInt
    public native long tableViewIndentationLevelForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:moveRowAtIndexPath:toIndexPath:")
    public native void tableViewMoveRowAtIndexPathToIndexPath(UITableView tableView, NSIndexPath sourceIndexPath,
            NSIndexPath destinationIndexPath);

    @Generated
    @Selector("tableView:numberOfRowsInSection:")
    @NInt
    public native long tableViewNumberOfRowsInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:performAction:forRowAtIndexPath:withSender:")
    public native void tableViewPerformActionForRowAtIndexPathWithSender(UITableView tableView, SEL action,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) Object sender);

    @Generated
    @IsOptional
    @Selector("tableView:sectionForSectionIndexTitle:atIndex:")
    @NInt
    public native long tableViewSectionForSectionIndexTitleAtIndex(UITableView tableView, String title,
            @NInt long index);

    @Generated
    @IsOptional
    @Selector("tableView:shouldHighlightRowAtIndexPath:")
    public native boolean tableViewShouldHighlightRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:shouldIndentWhileEditingRowAtIndexPath:")
    public native boolean tableViewShouldIndentWhileEditingRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:shouldShowMenuForRowAtIndexPath:")
    public native boolean tableViewShouldShowMenuForRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:shouldUpdateFocusInContext:")
    public native boolean tableViewShouldUpdateFocusInContext(UITableView tableView,
            UITableViewFocusUpdateContext context);

    @Generated
    @IsOptional
    @Selector("tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    public native NSIndexPath tableViewTargetIndexPathForMoveFromRowAtIndexPathToProposedIndexPath(
            UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath);

    @Generated
    @IsOptional
    @Selector("tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    public native String tableViewTitleForDeleteConfirmationButtonForRowAtIndexPath(UITableView tableView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:titleForFooterInSection:")
    public native String tableViewTitleForFooterInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:titleForHeaderInSection:")
    public native String tableViewTitleForHeaderInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:viewForFooterInSection:")
    public native UIView tableViewViewForFooterInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:viewForHeaderInSection:")
    public native UIView tableViewViewForHeaderInSection(UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:willBeginEditingRowAtIndexPath:")
    public native void tableViewWillBeginEditingRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:willDeselectRowAtIndexPath:")
    public native NSIndexPath tableViewWillDeselectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayCell:forRowAtIndexPath:")
    public native void tableViewWillDisplayCellForRowAtIndexPath(UITableView tableView, UITableViewCell cell,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayFooterView:forSection:")
    public native void tableViewWillDisplayFooterViewForSection(UITableView tableView, UIView view, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:willDisplayHeaderView:forSection:")
    public native void tableViewWillDisplayHeaderViewForSection(UITableView tableView, UIView view, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:willSelectRowAtIndexPath:")
    public native NSIndexPath tableViewWillSelectRowAtIndexPath(UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("scrollViewDidChangeAdjustedContentInset:")
    public native void scrollViewDidChangeAdjustedContentInset(UIScrollView scrollView);

    @Generated
    @IsOptional
    @Selector("tableView:leadingSwipeActionsConfigurationForRowAtIndexPath:")
    public native UISwipeActionsConfiguration tableViewLeadingSwipeActionsConfigurationForRowAtIndexPath(
            UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:shouldSpringLoadRowAtIndexPath:withContext:")
    public native boolean tableViewShouldSpringLoadRowAtIndexPathWithContext(UITableView tableView,
            NSIndexPath indexPath, @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionContext context);

    @Generated
    @IsOptional
    @Selector("tableView:trailingSwipeActionsConfigurationForRowAtIndexPath:")
    public native UISwipeActionsConfiguration tableViewTrailingSwipeActionsConfigurationForRowAtIndexPath(
            UITableView tableView, NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:contextMenuConfigurationForRowAtIndexPath:point:")
    public native UIContextMenuConfiguration tableViewContextMenuConfigurationForRowAtIndexPathPoint(
            UITableView tableView, NSIndexPath indexPath, @ByValue CGPoint point);

    @Generated
    @IsOptional
    @Selector("tableView:didBeginMultipleSelectionInteractionAtIndexPath:")
    public native void tableViewDidBeginMultipleSelectionInteractionAtIndexPath(UITableView tableView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:previewForDismissingContextMenuWithConfiguration:")
    public native UITargetedPreview tableViewPreviewForDismissingContextMenuWithConfiguration(UITableView tableView,
            UIContextMenuConfiguration configuration);

    @Generated
    @IsOptional
    @Selector("tableView:previewForHighlightingContextMenuWithConfiguration:")
    public native UITargetedPreview tableViewPreviewForHighlightingContextMenuWithConfiguration(UITableView tableView,
            UIContextMenuConfiguration configuration);

    @Generated
    @IsOptional
    @Selector("tableView:shouldBeginMultipleSelectionInteractionAtIndexPath:")
    public native boolean tableViewShouldBeginMultipleSelectionInteractionAtIndexPath(UITableView tableView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public native void tableViewWillPerformPreviewActionForMenuWithConfigurationAnimator(UITableView tableView,
            UIContextMenuConfiguration configuration,
            @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator);

    @Generated
    @IsOptional
    @Selector("tableViewDidEndMultipleSelectionInteraction:")
    public native void tableViewDidEndMultipleSelectionInteraction(UITableView tableView);
}
