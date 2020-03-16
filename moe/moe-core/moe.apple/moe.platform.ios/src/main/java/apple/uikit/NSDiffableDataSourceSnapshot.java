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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDiffableDataSourceSnapshot<_SectionIdentifierType, _ItemIdentifierType> extends NSObject
        implements NSCopying {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("appendItemsWithIdentifiers:")
    public native void appendItemsWithIdentifiers(NSArray<_ItemIdentifierType> identifiers);

    @Generated
    @Selector("appendItemsWithIdentifiers:intoSectionWithIdentifier:")
    public native void appendItemsWithIdentifiersIntoSectionWithIdentifier(NSArray<_ItemIdentifierType> identifiers,
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier);

    @Generated
    @Selector("appendSectionsWithIdentifiers:")
    public native void appendSectionsWithIdentifiers(NSArray<?> sectionIdentifiers);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("deleteAllItems")
    public native void deleteAllItems();

    @Generated
    @Selector("deleteItemsWithIdentifiers:")
    public native void deleteItemsWithIdentifiers(NSArray<_ItemIdentifierType> identifiers);

    @Generated
    @Selector("deleteSectionsWithIdentifiers:")
    public native void deleteSectionsWithIdentifiers(NSArray<_SectionIdentifierType> sectionIdentifiers);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("indexOfItemIdentifier:")
    @NInt
    public native long indexOfItemIdentifier(@Mapped(ObjCObjectMapper.class) _ItemIdentifierType itemIdentifier);

    @Generated
    @Selector("indexOfSectionIdentifier:")
    @NInt
    public native long indexOfSectionIdentifier(
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier);

    @Generated
    @Selector("init")
    public native NSDiffableDataSourceSnapshot<?, ?> init();

    @Generated
    @Selector("insertItemsWithIdentifiers:afterItemWithIdentifier:")
    public native void insertItemsWithIdentifiersAfterItemWithIdentifier(NSArray<_ItemIdentifierType> identifiers,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType itemIdentifier);

    @Generated
    @Selector("insertItemsWithIdentifiers:beforeItemWithIdentifier:")
    public native void insertItemsWithIdentifiersBeforeItemWithIdentifier(NSArray<_ItemIdentifierType> identifiers,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType itemIdentifier);

    @Generated
    @Selector("insertSectionsWithIdentifiers:afterSectionWithIdentifier:")
    public native void insertSectionsWithIdentifiersAfterSectionWithIdentifier(
            NSArray<_SectionIdentifierType> sectionIdentifiers,
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType toSectionIdentifier);

    @Generated
    @Selector("insertSectionsWithIdentifiers:beforeSectionWithIdentifier:")
    public native void insertSectionsWithIdentifiersBeforeSectionWithIdentifier(
            NSArray<_SectionIdentifierType> sectionIdentifiers,
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType toSectionIdentifier);

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
    @Selector("itemIdentifiers")
    public native NSArray<_ItemIdentifierType> itemIdentifiers();

    @Generated
    @Selector("itemIdentifiersInSectionWithIdentifier:")
    public native NSArray<_ItemIdentifierType> itemIdentifiersInSectionWithIdentifier(
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("moveItemWithIdentifier:afterItemWithIdentifier:")
    public native void moveItemWithIdentifierAfterItemWithIdentifier(
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType fromIdentifier,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType toIdentifier);

    @Generated
    @Selector("moveItemWithIdentifier:beforeItemWithIdentifier:")
    public native void moveItemWithIdentifierBeforeItemWithIdentifier(
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType fromIdentifier,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType toIdentifier);

    @Generated
    @Selector("moveSectionWithIdentifier:afterSectionWithIdentifier:")
    public native void moveSectionWithIdentifierAfterSectionWithIdentifier(
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType fromSectionIdentifier,
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType toSectionIdentifier);

    @Generated
    @Selector("moveSectionWithIdentifier:beforeSectionWithIdentifier:")
    public native void moveSectionWithIdentifierBeforeSectionWithIdentifier(
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType fromSectionIdentifier,
            @Mapped(ObjCObjectMapper.class) _SectionIdentifierType toSectionIdentifier);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("numberOfItems")
    @NInt
    public native long numberOfItems();

    @Generated
    @Selector("numberOfItemsInSection:")
    @NInt
    public native long numberOfItemsInSection(@Mapped(ObjCObjectMapper.class) _SectionIdentifierType sectionIdentifier);

    @Generated
    @Selector("numberOfSections")
    @NInt
    public native long numberOfSections();

    @Generated
    @Selector("reloadItemsWithIdentifiers:")
    public native void reloadItemsWithIdentifiers(NSArray<_ItemIdentifierType> identifiers);

    @Generated
    @Selector("reloadSectionsWithIdentifiers:")
    public native void reloadSectionsWithIdentifiers(NSArray<_SectionIdentifierType> sectionIdentifiers);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("sectionIdentifierForSectionContainingItemIdentifier:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _SectionIdentifierType sectionIdentifierForSectionContainingItemIdentifier(
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType itemIdentifier);

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
}