package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UICollectionViewDataSource;
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
public class UICollectionViewDiffableDataSource<_SectionIdentifierType, _ItemIdentifierType> extends NSObject implements
        UICollectionViewDataSource {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewDiffableDataSource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICollectionViewDiffableDataSource<?, ?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewDiffableDataSource<?, ?> allocWithZone(VoidPtr zone);

    /**
     * Apply a snapshot to the collection view committing to the new data source state.
     * 
     * animatingDifferences == YES: perform a diff between the current UICollectionView state and the snapshot, and
     * animate the update.
     * animatingDifferences == NO: perform a diff between the current UICollectionView state and the snapshot, but don't
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
    @IsOptional
    @Selector("collectionView:canMoveItemAtIndexPath:")
    public native boolean collectionViewCanMoveItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @NotNull
    @Generated
    @Selector("collectionView:cellForItemAtIndexPath:")
    public native UICollectionViewCell collectionViewCellForItemAtIndexPath(@NotNull UICollectionView collectionView,
            @NotNull NSIndexPath indexPath);

    @NotNull
    @Generated
    @IsOptional
    @Selector("collectionView:indexPathForIndexTitle:atIndex:")
    public native NSIndexPath collectionViewIndexPathForIndexTitleAtIndex(@NotNull UICollectionView collectionView,
            @NotNull String title, @NInt long index);

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

    @NotNull
    @Generated
    @IsOptional
    @Selector("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionReusableView collectionViewViewForSupplementaryElementOfKindAtIndexPath(
            @NotNull UICollectionView collectionView, @NotNull String kind, @NotNull NSIndexPath indexPath);

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

    @Nullable
    @Generated
    @Selector("indexPathForItemIdentifier:")
    public native NSIndexPath indexPathForItemIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType identifier);

    @Nullable
    @Generated
    @IsOptional
    @Selector("indexTitlesForCollectionView:")
    public native NSArray<String> indexTitlesForCollectionView(@NotNull UICollectionView collectionView);

    @Generated
    @Selector("init")
    public native UICollectionViewDiffableDataSource<?, ?> init();

    @Generated
    @Selector("initWithCollectionView:cellProvider:")
    public native UICollectionViewDiffableDataSource<?, ?> initWithCollectionViewCellProvider(
            @NotNull UICollectionView collectionView,
            @NotNull @ObjCBlock(name = "call_initWithCollectionViewCellProvider") Block_initWithCollectionViewCellProvider cellProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithCollectionViewCellProvider {
        @Nullable
        @Generated
        UICollectionViewCell call_initWithCollectionViewCellProvider(@NotNull UICollectionView collectionView,
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
    public static native UICollectionViewDiffableDataSource<?, ?> new_objc();

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInCollectionView:")
    @NInt
    public native long numberOfSectionsInCollectionView(@NotNull UICollectionView collectionView);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setSupplementaryViewProvider:")
    public native void setSupplementaryViewProvider(
            @Nullable @ObjCBlock(name = "call_setSupplementaryViewProvider") Block_setSupplementaryViewProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSupplementaryViewProvider {
        @Nullable
        @Generated
        UICollectionReusableView call_setSupplementaryViewProvider(@NotNull UICollectionView collectionView,
                @NotNull String elementKind, @NotNull NSIndexPath indexPath);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Create a snapshot of the current UICollectionView data source state.
     * This snapshot can be mutated and later applied via -applySnapshot:animatingDifferences:
     */
    @NotNull
    @Generated
    @Selector("snapshot")
    public native NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Nullable
    @Generated
    @Selector("supplementaryViewProvider")
    @ObjCBlock(name = "call_supplementaryViewProvider_ret")
    public native Block_supplementaryViewProvider_ret supplementaryViewProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_supplementaryViewProvider_ret {
        @Nullable
        @Generated
        UICollectionReusableView call_supplementaryViewProvider_ret(@NotNull UICollectionView collectionView,
                @NotNull String elementKind, @NotNull NSIndexPath indexPath);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Section Snapshot Support
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("applySnapshot:toSection:animatingDifferences:")
    public native void applySnapshotToSectionAnimatingDifferences(
            @NotNull NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot,
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier,
            boolean animatingDifferences);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("applySnapshot:toSection:animatingDifferences:completion:")
    public native void applySnapshotToSectionAnimatingDifferencesCompletion(
            @NotNull NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot,
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier,
            boolean animatingDifferences,
            @Nullable @ObjCBlock(name = "call_applySnapshotToSectionAnimatingDifferencesCompletion") Block_applySnapshotToSectionAnimatingDifferencesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applySnapshotToSectionAnimatingDifferencesCompletion {
        @Generated
        void call_applySnapshotToSectionAnimatingDifferencesCompletion();
    }

    /**
     * Reordering Support
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("reorderingHandlers")
    public native UICollectionViewDiffableDataSourceReorderingHandlers<_SectionIdentifierType, _ItemIdentifierType> reorderingHandlers();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("sectionSnapshotHandlers")
    public native UICollectionViewDiffableDataSourceSectionSnapshotHandlers<_ItemIdentifierType> sectionSnapshotHandlers();

    /**
     * Reordering Support
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setReorderingHandlers:")
    public native void setReorderingHandlers(
            @NotNull UICollectionViewDiffableDataSourceReorderingHandlers<_SectionIdentifierType, _ItemIdentifierType> value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSectionSnapshotHandlers:")
    public native void setSectionSnapshotHandlers(
            @NotNull UICollectionViewDiffableDataSourceSectionSnapshotHandlers<_ItemIdentifierType> value);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("snapshotForSection:")
    public native NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshotForSection(
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType section);

    /**
     * Apply a snapshot to the collection view using reloadData.
     * 
     * This always skips diffing, and immediately resets the UICollectionView to the new data source state without
     * animation.
     * Generally this should only be used for specific cases where you need to fully reset the collection view's data to
     * the
     * new state immediately (e.g. recycling the collection view for use with a completely different data set), or when
     * you
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
