package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UITableViewDataSource;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableViewDiffableDataSource<_SectionIdentifierType, _ItemIdentifierType> extends NSObject implements
        UITableViewDataSource {
    static {
        NatJ.register();
    }

    @Generated
    protected UITableViewDiffableDataSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITableViewDiffableDataSource<?, ?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITableViewDiffableDataSource<?, ?> allocWithZone(VoidPtr zone);

    /**
     * Apply a snapshot to the table view committing to the new data source state.
     * 
     * animatingDifferences == YES: perform a diff between the current UITableView state and the snapshot, and animate
     * the update.
     * animatingDifferences == NO: perform a diff between the current UITableView state and the snapshot, but don't
     * animate the update.
     * 
     * If the (optional) completion block is specified, it will be called on the main queue when any animations are
     * completed.
     * 
     * Note: you may call this from a background queue which will cause the diff (if needed) to be generated on the
     * calling queue and the
     * final UI update to be applied back on the main queue. However, all applySnapshot invocations must be confined to
     * the same queue.
     * (if you violate this restriction and mix calls between the main queue and some background queue, the framework
     * will log and/or assert to avoid deadlocks)
     */
    @Generated
    @Selector("applySnapshot:animatingDifferences:")
    public native void applySnapshotAnimatingDifferences(
            @NotNull NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot,
            boolean animatingDifferences);

    @Generated
    @Selector("applySnapshot:animatingDifferences:completion:")
    public native void applySnapshotAnimatingDifferencesCompletion(
            @NotNull NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot,
            boolean animatingDifferences,
            @Nullable @ObjCBlock(name = "call_applySnapshotAnimatingDifferencesCompletion") Block_applySnapshotAnimatingDifferencesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applySnapshotAnimatingDifferencesCompletion {
        @Generated
        void call_applySnapshotAnimatingDifferencesCompletion();
    }

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Default value is UITableViewRowAnimationAutomatic. Change takes effect on the next update.
     */
    @Generated
    @Selector("defaultRowAnimation")
    @NInt
    public native long defaultRowAnimation();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Nullable
    @Generated
    @Selector("indexPathForItemIdentifier:")
    public native NSIndexPath indexPathForItemIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType identifier);

    @Generated
    @Selector("init")
    public native UITableViewDiffableDataSource<?, ?> init();

    @Generated
    @Selector("initWithTableView:cellProvider:")
    public native UITableViewDiffableDataSource<?, ?> initWithTableViewCellProvider(@NotNull UITableView tableView,
            @NotNull @ObjCBlock(name = "call_initWithTableViewCellProvider") Block_initWithTableViewCellProvider cellProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithTableViewCellProvider {
        @Nullable
        @Generated
        UITableViewCell call_initWithTableViewCellProvider(@NotNull UITableView tableView,
                @NotNull NSIndexPath indexPath, @NotNull @Mapped(ObjCObjectMapper.class) Object itemIdentifier);
    }

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

    /**
     * convert item NSIndexPath <-> ItemIdentifierType
     */
    @Nullable
    @Generated
    @Selector("itemIdentifierForIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ItemIdentifierType itemIdentifierForIndexPath(@NotNull NSIndexPath indexPath);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UITableViewDiffableDataSource<?, ?> new_objc();

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInTableView:")
    @NInt
    public native long numberOfSectionsInTableView(@NotNull UITableView tableView);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @IsOptional
    @Selector("sectionIndexTitlesForTableView:")
    public native NSArray<String> sectionIndexTitlesForTableView(@NotNull UITableView tableView);

    /**
     * Default value is UITableViewRowAnimationAutomatic. Change takes effect on the next update.
     */
    @Generated
    @Selector("setDefaultRowAnimation:")
    public native void setDefaultRowAnimation(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Create a snapshot of the current UITableView data source state.
     * This snapshot can be mutated and later applied via -applySnapshot:animatingDifferences:
     */
    @NotNull
    @Generated
    @Selector("snapshot")
    public native NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @IsOptional
    @Selector("tableView:canEditRowAtIndexPath:")
    public native boolean tableViewCanEditRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:canMoveRowAtIndexPath:")
    public native boolean tableViewCanMoveRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @NotNull
    @Generated
    @Selector("tableView:cellForRowAtIndexPath:")
    public native UITableViewCell tableViewCellForRowAtIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void tableViewCommitEditingStyleForRowAtIndexPath(@NotNull UITableView tableView,
            @NInt long editingStyle, @NotNull NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("tableView:moveRowAtIndexPath:toIndexPath:")
    public native void tableViewMoveRowAtIndexPathToIndexPath(@NotNull UITableView tableView,
            @NotNull NSIndexPath sourceIndexPath, @NotNull NSIndexPath destinationIndexPath);

    @Generated
    @Selector("tableView:numberOfRowsInSection:")
    @NInt
    public native long tableViewNumberOfRowsInSection(@NotNull UITableView tableView, @NInt long section);

    @Generated
    @IsOptional
    @Selector("tableView:sectionForSectionIndexTitle:atIndex:")
    @NInt
    public native long tableViewSectionForSectionIndexTitleAtIndex(@NotNull UITableView tableView,
            @NotNull String title, @NInt long index);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:titleForFooterInSection:")
    public native String tableViewTitleForFooterInSection(@NotNull UITableView tableView, @NInt long section);

    @Nullable
    @Generated
    @IsOptional
    @Selector("tableView:titleForHeaderInSection:")
    public native String tableViewTitleForHeaderInSection(@NotNull UITableView tableView, @NInt long section);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Apply a snapshot to the table view using reloadData.
     * 
     * This always skips diffing, and immediately resets the UITableView to the new data source state without animation.
     * Generally this should only be used for specific cases where you need to fully reset the table view's data to the
     * new state immediately (e.g. recycling the table view for use with a completely different data set), or when you
     * specifically want to skip diffing (e.g. applying an exceptionally large changeset).
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("applySnapshotUsingReloadData:")
    public native void applySnapshotUsingReloadData(
            @NotNull NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("applySnapshotUsingReloadData:completion:")
    public native void applySnapshotUsingReloadDataCompletion(
            @NotNull NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot,
            @Nullable @ObjCBlock(name = "call_applySnapshotUsingReloadDataCompletion") Block_applySnapshotUsingReloadDataCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applySnapshotUsingReloadDataCompletion {
        @Generated
        void call_applySnapshotUsingReloadDataCompletion();
    }

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("indexForSectionIdentifier:")
    @NInt
    public native long indexForSectionIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType identifier);

    /**
     * convert section index <-> SectionIdentifierType
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("sectionIdentifierForIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _SectionIdentifierType sectionIdentifierForIndex(@NInt long index);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
