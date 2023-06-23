package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDiffableDataSourceSectionSnapshot(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDiffableDataSourceSectionSnapshot<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSDiffableDataSourceSectionSnapshot<?> allocWithZone(VoidPtr zone);

    /**
     * append items to Root
     */
    @Generated
    @Selector("appendItems:")
    public native void appendItems(@NotNull NSArray<_ItemIdentifierType> items);

    /**
     * append items into parent (creating a new Parent+Child relationship if not present; appends to existing children
     * if present)
     */
    @Generated
    @Selector("appendItems:intoParentItem:")
    public native void appendItemsIntoParentItem(@NotNull NSArray<_ItemIdentifierType> items,
            @Nullable @Mapped(ObjCObjectMapper.class) _ItemIdentifierType parentItem);

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

    /**
     * will log if item is not found
     */
    @Generated
    @Selector("collapseItems:")
    public native void collapseItems(@NotNull NSArray<_ItemIdentifierType> items);

    @Generated
    @Selector("containsItem:")
    public native boolean containsItem(@NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("deleteAllItems")
    public native void deleteAllItems();

    /**
     * will also delete children
     */
    @Generated
    @Selector("deleteItems:")
    public native void deleteItems(@NotNull NSArray<_ItemIdentifierType> items);

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * will log if item is not found
     */
    @Generated
    @Selector("expandItems:")
    public native void expandItems(@NotNull NSArray<_ItemIdentifierType> items);

    @NotNull
    @Generated
    @Selector("expandedItems")
    public native NSArray<_ItemIdentifierType> expandedItems();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("indexOfItem:")
    @NInt
    public native long indexOfItem(@NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    /**
     * creates an empty snapshot
     */
    @Generated
    @Selector("init")
    public native NSDiffableDataSourceSectionSnapshot<?> init();

    /**
     * Insert After: respect any destination item's children and inserts the new items after them
     * at the same level as the destination item.
     * 
     * 
     * +---------+
     * | 0 |
     * +---------+ +-+-------+-+
     * | 0 | | 1 |
     * +-+-------+-+ +---------+
     * | 1 | | 2 |
     * +---------+ +-+-------+-+
     * | 2 | | INS |
     * +-+-------+-+ +---------+
     * | 3 | | 3 |
     * +---------+ +---------+
     * 
     * +--------------------------------+
     * | insertAfter(INS, after:0) |
     * +--------------------------------+
     * 
     * +---------+
     * | 0 |
     * +---------+ +-+-------+-+
     * | 0 | | 1 |
     * +-+-------+-+ +---------+
     * | 1 | | 2 |
     * +---------+ +-+-------+-+
     * | 2 | | 3 |
     * +-+-------+-+ +-+-------+-+
     * | 3 | | INS |
     * +---+-----+---+ +-+-------+-+
     * | 4 | | 4 |
     * +---------+ +---------+
     * 
     * +--------------------------------+
     * | insertAfter(INS, after:2) |
     * +--------------------------------+
     */
    @Generated
    @Selector("insertItems:afterItem:")
    public native void insertItemsAfterItem(@NotNull NSArray<_ItemIdentifierType> items,
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType afterIdentifier);

    /**
     * Insert Before will always match the level of the destination item.
     * 
     * Examples:
     * 
     * +---------+
     * | 0 |
     * +---------+ +-+-------+-+
     * | 0 | | INS |
     * +-+-------+-+ +---------+
     * | 1 | | 1 |
     * +---------+ +---------+
     * | 2 | | 2 |
     * +-+-------+-+ +-+-------+-+
     * | 3 | | 3 |
     * +---------+ +---------+
     * 
     * +--------------------------------+
     * | insertBefore(1) |
     * +--------------------------------+
     * 
     * +---------+
     * | INS |
     * +---------+ +---------+
     * | 0 | | 0 |
     * +-+-------+-+ +-+-------+-+
     * | 1 | | 1 |
     * +---------+ +---------+
     * | 2 | | 2 |
     * +-+-------+-+ +-+-------+-+
     * | 3 | | 3 |
     * +---------+ +---------+
     * 
     * +--------------------------------+
     * | insertBefore(0) |
     * +--------------------------------+
     */
    @Generated
    @Selector("insertItems:beforeItem:")
    public native void insertItemsBeforeItem(@NotNull NSArray<_ItemIdentifierType> items,
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType beforeIdentifier);

    @NotNull
    @Generated
    @Selector("insertSnapshot:afterItem:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ItemIdentifierType insertSnapshotAfterItem(
            @NotNull NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot,
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    /**
     * insert a subtree -- represented by a snapshot -- before/after a destination item
     */
    @Generated
    @Selector("insertSnapshot:beforeItem:")
    public native void insertSnapshotBeforeItem(
            @NotNull NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot,
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

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

    /**
     * these methods are all O(1)
     */
    @Generated
    @Selector("isExpanded:")
    public native boolean isExpanded(@NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isVisible:")
    public native boolean isVisible(@NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @NotNull
    @Generated
    @Selector("items")
    public native NSArray<_ItemIdentifierType> items();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * NSNotFound if not present
     */
    @Generated
    @Selector("levelOfItem:")
    @NInt
    public native long levelOfItem(@NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @Generated
    @Owned
    @Selector("new")
    public static native NSDiffableDataSourceSectionSnapshot<?> new_objc();

    /**
     * nil == root node
     */
    @Nullable
    @Generated
    @Selector("parentOfChildItem:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ItemIdentifierType parentOfChildItem(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType childItem);

    @Generated
    @Selector("replaceChildrenOfParentItem:withSnapshot:")
    public native void replaceChildrenOfParentItemWithSnapshot(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType parentItem,
            @NotNull NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @NotNull
    @Generated
    @Selector("rootItems")
    public native NSArray<_ItemIdentifierType> rootItems();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * snapshot will not include parentItem
     */
    @NotNull
    @Generated
    @Selector("snapshotOfParentItem:")
    public native NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshotOfParentItem(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType parentItem);

    @NotNull
    @Generated
    @Selector("snapshotOfParentItem:includingParentItem:")
    public native NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshotOfParentItemIncludingParentItem(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType parentItem, boolean includingParentItem);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Selector("visibleItems")
    public native NSArray<_ItemIdentifierType> visibleItems();

    /**
     * debugging; displays hierarchy
     * legend:
     * * == visible
     * + == expanded
     * - == collapsed
     */
    @NotNull
    @Generated
    @Selector("visualDescription")
    public native String visualDescription();
}
