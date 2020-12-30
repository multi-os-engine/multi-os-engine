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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewDiffableDataSource<_SectionIdentifierType, _ItemIdentifierType> extends NSObject
        implements UICollectionViewDataSource {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * Apply a snapshot to the collection view committing to the new data source state.
     * 
     *   animatingDifferences == YES: perform a diff between the current UICollectionView state and the snapshot and animate the update.
     *   animatingDifferences == NO: commit to the new collection view state from the snapshot. The changes will not be animated.
     * 
     *   If the (optional) completion block is specified, it will be called on the main queue when the animations are completed.
     * 
     *  Note: you may call this from a background queue which will cause the diff (if needed) to be generated on the calling queue and the
     *        final UI update to be applied back on the main queue. However, all applySnapshot invocations must be confined to the same queue.
     *        (if you violate this restriction and mix calls between the main queue and some background queue, the framework
     *         will log and/or assert to avoid deadlocks)
     */
    @Generated
    @Selector("applySnapshot:animatingDifferences:")
    public native void applySnapshotAnimatingDifferences(
            NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot,
            boolean animatingDifferences);

    @Generated
    @Selector("applySnapshot:animatingDifferences:completion:")
    public native void applySnapshotAnimatingDifferencesCompletion(
            NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot,
            boolean animatingDifferences,
            @ObjCBlock(name = "call_applySnapshotAnimatingDifferencesCompletion") Block_applySnapshotAnimatingDifferencesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applySnapshotAnimatingDifferencesCompletion {
        @Generated
        void call_applySnapshotAnimatingDifferencesCompletion();
    }

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
    @IsOptional
    @Selector("collectionView:canMoveItemAtIndexPath:")
    public native boolean collectionViewCanMoveItemAtIndexPath(UICollectionView collectionView, NSIndexPath indexPath);

    @Generated
    @Selector("collectionView:cellForItemAtIndexPath:")
    public native UICollectionViewCell collectionViewCellForItemAtIndexPath(UICollectionView collectionView,
            NSIndexPath indexPath);

    @Generated
    @IsOptional
    @Selector("collectionView:indexPathForIndexTitle:atIndex:")
    public native NSIndexPath collectionViewIndexPathForIndexTitleAtIndex(UICollectionView collectionView, String title,
            @NInt long index);

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
    @Selector("collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionReusableView collectionViewViewForSupplementaryElementOfKindAtIndexPath(
            UICollectionView collectionView, String kind, NSIndexPath indexPath);

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
    @Selector("indexPathForItemIdentifier:")
    public native NSIndexPath indexPathForItemIdentifier(
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType identifier);

    @Generated
    @IsOptional
    @Selector("indexTitlesForCollectionView:")
    public native NSArray<String> indexTitlesForCollectionView(UICollectionView collectionView);

    @Generated
    @Selector("init")
    public native UICollectionViewDiffableDataSource<?, ?> init();

    @Generated
    @Selector("initWithCollectionView:cellProvider:")
    public native UICollectionViewDiffableDataSource<?, ?> initWithCollectionViewCellProvider(
            UICollectionView collectionView,
            @ObjCBlock(name = "call_initWithCollectionViewCellProvider") Block_initWithCollectionViewCellProvider cellProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithCollectionViewCellProvider {
        @Generated
        UICollectionViewCell call_initWithCollectionViewCellProvider(UICollectionView collectionView, NSIndexPath indexPath,
                @Mapped(ObjCObjectMapper.class) Object itemIdentifier);
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
     * convert IndexPath <-> ItemIdentifierType
     */
    @Generated
    @Selector("itemIdentifierForIndexPath:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ItemIdentifierType itemIdentifierForIndexPath(NSIndexPath indexPath);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @IsOptional
    @Selector("numberOfSectionsInCollectionView:")
    @NInt
    public native long numberOfSectionsInCollectionView(UICollectionView collectionView);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setSupplementaryViewProvider:")
    public native void setSupplementaryViewProvider(
            @ObjCBlock(name = "call_setSupplementaryViewProvider") Block_setSupplementaryViewProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSupplementaryViewProvider {
        @Generated
        UICollectionReusableView call_setSupplementaryViewProvider(UICollectionView collectionView, String elementKind,
                NSIndexPath indexPath);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Create a snapshot of the current UICollectionView data source state.
     *   This snapshot can be mutated and later applied via -applySnapshot:animatingDifferences:
     */
    @Generated
    @Selector("snapshot")
    public native NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> snapshot();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supplementaryViewProvider")
    @ObjCBlock(name = "call_supplementaryViewProvider_ret")
    public native Block_supplementaryViewProvider_ret supplementaryViewProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_supplementaryViewProvider_ret {
        @Generated
        UICollectionReusableView call_supplementaryViewProvider_ret(UICollectionView collectionView, String elementKind,
                NSIndexPath indexPath);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Section Snapshot Support
     */
    @Generated
    @Selector("applySnapshot:toSection:animatingDifferences:")
    public native void applySnapshotToSectionAnimatingDifferences(
            NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot,
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier, boolean animatingDifferences);

    @Generated
    @Selector("applySnapshot:toSection:animatingDifferences:completion:")
    public native void applySnapshotToSectionAnimatingDifferencesCompletion(
            NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot,
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier, boolean animatingDifferences,
            @ObjCBlock(name = "call_applySnapshotToSectionAnimatingDifferencesCompletion") Block_applySnapshotToSectionAnimatingDifferencesCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_applySnapshotToSectionAnimatingDifferencesCompletion {
        @Generated
        void call_applySnapshotToSectionAnimatingDifferencesCompletion();
    }

    /**
     * Reordering Support
     */
    @Generated
    @Selector("reorderingHandlers")
    public native UICollectionViewDiffableDataSourceReorderingHandlers<_SectionIdentifierType, _ItemIdentifierType> reorderingHandlers();

    @Generated
    @Selector("sectionSnapshotHandlers")
    public native UICollectionViewDiffableDataSourceSectionSnapshotHandlers<_ItemIdentifierType> sectionSnapshotHandlers();

    /**
     * Reordering Support
     */
    @Generated
    @Selector("setReorderingHandlers:")
    public native void setReorderingHandlers(
            UICollectionViewDiffableDataSourceReorderingHandlers<_SectionIdentifierType, _ItemIdentifierType> value);

    @Generated
    @Selector("setSectionSnapshotHandlers:")
    public native void setSectionSnapshotHandlers(
            UICollectionViewDiffableDataSourceSectionSnapshotHandlers<_ItemIdentifierType> value);

    @Generated
    @Selector("snapshotForSection:")
    public native NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshotForSection(
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType section);
}