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
 * A NSDiffableDataSourceSnapshot represents the complete state of a UI element (e.g. UICollectionView)
 * 
 * Snapshots can be created in two ways:
 * 1. From a connected data source: e.g. UICollectionViewDiffableDataSource.snapshot()
 * This will contain the current state of the UI element.
 * 
 * 2. Constructing a new instance: e.g. NSDiffableDataSourceSnapshot<Int,UUID>()
 * This will construct an empty snapshot with no section or item identifiers.
 * 
 * Notes:
 * 1. All identifiers must be unique. Section and Item identifiers do not overlap and may contain values that exist in
 * the other (i.e. it is OK
 * to have a section identifier == 1 and an item identifier == 1)
 * 
 * 2. If you pass duplicate values in an item or section array (e.g. -appendItemsWithIdentifiers:), the system will
 * throw an exception.
 * 
 * 
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> extends NSObject implements
        NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDiffableDataSourceSnapshot(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDiffableDataSourceSnapshot<?, ?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSDiffableDataSourceSnapshot<?, ?> allocWithZone(VoidPtr zone);

    /**
     * convenience: appends into last section
     */
    @Generated
    @Selector("appendItemsWithIdentifiers:")
    public native void appendItemsWithIdentifiers(@NotNull NSArray<_ItemIdentifierType> identifiers);

    @Generated
    @Selector("appendItemsWithIdentifiers:intoSectionWithIdentifier:")
    public native void appendItemsWithIdentifiersIntoSectionWithIdentifier(
            @NotNull NSArray<_ItemIdentifierType> identifiers,
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier);

    /**
     * section operations
     */
    @Generated
    @Selector("appendSectionsWithIdentifiers:")
    public native void appendSectionsWithIdentifiers(@NotNull NSArray<_SectionIdentifierType> sectionIdentifiers);

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

    @Generated
    @Selector("deleteItemsWithIdentifiers:")
    public native void deleteItemsWithIdentifiers(@NotNull NSArray<_ItemIdentifierType> identifiers);

    @Generated
    @Selector("deleteSectionsWithIdentifiers:")
    public native void deleteSectionsWithIdentifiers(@NotNull NSArray<_SectionIdentifierType> sectionIdentifiers);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * If item identifier is not present returns NSNotFound
     */
    @Generated
    @Selector("indexOfItemIdentifier:")
    @NInt
    public native long indexOfItemIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType itemIdentifier);

    /**
     * If section identifier is not present returns NSNotFound
     */
    @Generated
    @Selector("indexOfSectionIdentifier:")
    @NInt
    public native long indexOfSectionIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier);

    @Generated
    @Selector("init")
    public native NSDiffableDataSourceSnapshot<?, ?> init();

    @Generated
    @Selector("insertItemsWithIdentifiers:afterItemWithIdentifier:")
    public native void insertItemsWithIdentifiersAfterItemWithIdentifier(
            @NotNull NSArray<_ItemIdentifierType> identifiers,
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType itemIdentifier);

    @Generated
    @Selector("insertItemsWithIdentifiers:beforeItemWithIdentifier:")
    public native void insertItemsWithIdentifiersBeforeItemWithIdentifier(
            @NotNull NSArray<_ItemIdentifierType> identifiers,
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType itemIdentifier);

    @Generated
    @Selector("insertSectionsWithIdentifiers:afterSectionWithIdentifier:")
    public native void insertSectionsWithIdentifiersAfterSectionWithIdentifier(
            @NotNull NSArray<_SectionIdentifierType> sectionIdentifiers,
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType toSectionIdentifier);

    @Generated
    @Selector("insertSectionsWithIdentifiers:beforeSectionWithIdentifier:")
    public native void insertSectionsWithIdentifiersBeforeSectionWithIdentifier(
            @NotNull NSArray<_SectionIdentifierType> sectionIdentifiers,
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType toSectionIdentifier);

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
    @Selector("itemIdentifiers")
    public native NSArray<_ItemIdentifierType> itemIdentifiers();

    @NotNull
    @Generated
    @Selector("itemIdentifiersInSectionWithIdentifier:")
    public native NSArray<_ItemIdentifierType> itemIdentifiersInSectionWithIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Selector("moveItemWithIdentifier:afterItemWithIdentifier:")
    public native void moveItemWithIdentifierAfterItemWithIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType fromIdentifier,
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType toIdentifier);

    @Generated
    @Selector("moveItemWithIdentifier:beforeItemWithIdentifier:")
    public native void moveItemWithIdentifierBeforeItemWithIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType fromIdentifier,
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType toIdentifier);

    @Generated
    @Selector("moveSectionWithIdentifier:afterSectionWithIdentifier:")
    public native void moveSectionWithIdentifierAfterSectionWithIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType fromSectionIdentifier,
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType toSectionIdentifier);

    @Generated
    @Selector("moveSectionWithIdentifier:beforeSectionWithIdentifier:")
    public native void moveSectionWithIdentifierBeforeSectionWithIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType fromSectionIdentifier,
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType toSectionIdentifier);

    @Generated
    @Owned
    @Selector("new")
    public static native NSDiffableDataSourceSnapshot<?, ?> new_objc();

    /**
     * structure
     */
    @Generated
    @Selector("numberOfItems")
    @NInt
    public native long numberOfItems();

    @Generated
    @Selector("numberOfItemsInSection:")
    @NInt
    public native long numberOfItemsInSection(
            @NotNull @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier);

    @Generated
    @Selector("numberOfSections")
    @NInt
    public native long numberOfSections();

    @Generated
    @Selector("reloadItemsWithIdentifiers:")
    public native void reloadItemsWithIdentifiers(@NotNull NSArray<_ItemIdentifierType> identifiers);

    @Generated
    @Selector("reloadSectionsWithIdentifiers:")
    public native void reloadSectionsWithIdentifiers(@NotNull NSArray<_SectionIdentifierType> sectionIdentifiers);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("sectionIdentifierForSectionContainingItemIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _SectionIdentifierType sectionIdentifierForSectionContainingItemIdentifier(
            @NotNull @Mapped(ObjCObjectMapper.class) _ItemIdentifierType itemIdentifier);

    @NotNull
    @Generated
    @Selector("sectionIdentifiers")
    public native NSArray<_SectionIdentifierType> sectionIdentifiers();

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
     * Reconfigures any existing cells for the items. Reconfiguring is more efficient than reloading an item, as it does
     * not replace the
     * existing cell with a new cell. Prefer reconfiguring over reloading unless you actually need an entirely new cell
     * for the item.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("reconfigureItemsWithIdentifiers:")
    public native void reconfigureItemsWithIdentifiers(@NotNull NSArray<_ItemIdentifierType> identifiers);

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reconfiguredItemIdentifiers")
    public native NSArray<_ItemIdentifierType> reconfiguredItemIdentifiers();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reloadedItemIdentifiers")
    public native NSArray<_ItemIdentifierType> reloadedItemIdentifiers();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("reloadedSectionIdentifiers")
    public native NSArray<_SectionIdentifierType> reloadedSectionIdentifiers();
}
