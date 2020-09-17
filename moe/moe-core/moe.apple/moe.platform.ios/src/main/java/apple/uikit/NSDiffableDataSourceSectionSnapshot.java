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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("appendItems:")
    public native void appendItems(NSArray<_ItemIdentifierType> items);

    @Generated
    @Selector("appendItems:intoParentItem:")
    public native void appendItemsIntoParentItem(NSArray<_ItemIdentifierType> items,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType parentItem);

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
    @Selector("collapseItems:")
    public native void collapseItems(NSArray<_ItemIdentifierType> items);

    @Generated
    @Selector("containsItem:")
    public native boolean containsItem(@Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

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
    @Selector("deleteItems:")
    public native void deleteItems(NSArray<_ItemIdentifierType> items);

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("expandItems:")
    public native void expandItems(NSArray<_ItemIdentifierType> items);

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
    public native long indexOfItem(@Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @Generated
    @Selector("init")
    public native NSDiffableDataSourceSectionSnapshot<?> init();

    @Generated
    @Selector("insertItems:afterItem:")
    public native void insertItemsAfterItem(NSArray<_ItemIdentifierType> items,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType afterIdentifier);

    @Generated
    @Selector("insertItems:beforeItem:")
    public native void insertItemsBeforeItem(NSArray<_ItemIdentifierType> items,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType beforeIdentifier);

    @Generated
    @Selector("insertSnapshot:afterItem:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ItemIdentifierType insertSnapshotAfterItem(
            NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @Generated
    @Selector("insertSnapshot:beforeItem:")
    public native void insertSnapshotBeforeItem(NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot,
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

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
    @Selector("isExpanded:")
    public native boolean isExpanded(@Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("isVisible:")
    public native boolean isVisible(@Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @Generated
    @Selector("items")
    public native NSArray<_ItemIdentifierType> items();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("levelOfItem:")
    @NInt
    public native long levelOfItem(@Mapped(ObjCObjectMapper.class) _ItemIdentifierType item);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("parentOfChildItem:")
    @MappedReturn(ObjCObjectMapper.class)
    public native _ItemIdentifierType parentOfChildItem(@Mapped(ObjCObjectMapper.class) _ItemIdentifierType childItem);

    @Generated
    @Selector("replaceChildrenOfParentItem:withSnapshot:")
    public native void replaceChildrenOfParentItemWithSnapshot(
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType parentItem,
            NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshot);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("rootItems")
    public native NSArray<_ItemIdentifierType> rootItems();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("snapshotOfParentItem:")
    public native NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshotOfParentItem(
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType parentItem);

    @Generated
    @Selector("snapshotOfParentItem:includingParentItem:")
    public native NSDiffableDataSourceSectionSnapshot<_ItemIdentifierType> snapshotOfParentItemIncludingParentItem(
            @Mapped(ObjCObjectMapper.class) _ItemIdentifierType parentItem, boolean includingParentItem);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("visibleItems")
    public native NSArray<_ItemIdentifierType> visibleItems();

    @Generated
    @Selector("visualDescription")
    public native String visualDescription();
}