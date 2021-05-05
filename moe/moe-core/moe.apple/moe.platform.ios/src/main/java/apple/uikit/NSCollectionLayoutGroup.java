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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCollectionLayoutGroup extends NSCollectionLayoutItem implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCollectionLayoutGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCollectionLayoutGroup alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * Specifies a custom group with client-specified frames.
     *   During layout, the itemProvider will be called with the group's current geometry provided via the NSCollectionLayoutEnvironment supplied.
     *   The coordinate space for returned frames should be {0,0} relative to this group's geometry.
     *   Custom groups can be nested arbitrarily inside other groups.
     */
    @Generated
    @Selector("customGroupWithLayoutSize:itemProvider:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object customGroupWithLayoutSizeItemProvider(NSCollectionLayoutSize layoutSize,
            @ObjCBlock(name = "call_customGroupWithLayoutSizeItemProvider") Block_customGroupWithLayoutSizeItemProvider itemProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customGroupWithLayoutSizeItemProvider {
        @Generated
        NSArray<? extends NSCollectionLayoutGroupCustomItem> call_customGroupWithLayoutSizeItemProvider(
                @Mapped(ObjCObjectMapper.class) Object layoutEnvironment);
    }

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

    /**
     * Specifies a group that will have N items equally sized along the horizontal axis. use interItemSpacing to insert space between items
     * 
     *   +------+--+------+--+------+
     *   |~~~~~~|  |~~~~~~|  |~~~~~~|
     *   |~~~~~~|  |~~~~~~|  |~~~~~~|
     *   |~~~~~~|  |~~~~~~|  |~~~~~~|
     *   +------+--+------+--+------+
     *            ^        ^
     *            |        |
     *    +-----------------------+
     *    |  Inter Item Spacing   |
     *    +-----------------------+
     */
    @Generated
    @Selector("horizontalGroupWithLayoutSize:subitem:count:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object horizontalGroupWithLayoutSizeSubitemCount(NSCollectionLayoutSize layoutSize,
            NSCollectionLayoutItem subitem, @NInt long count);

    /**
     * Specifies a group that will repeat items until available horizontal space is exhausted.
     *   note: any remaining space after laying out items can be apportioned among flexible interItemSpacing defintions
     */
    @Generated
    @Selector("horizontalGroupWithLayoutSize:subitems:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object horizontalGroupWithLayoutSizeSubitems(NSCollectionLayoutSize layoutSize,
            NSArray<? extends NSCollectionLayoutItem> subitems);

    @Generated
    @Selector("init")
    public native NSCollectionLayoutGroup init();

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
     * Supplies additional spacing between items along the layout axis of the group
     */
    @Generated
    @Selector("interItemSpacing")
    public native NSCollectionLayoutSpacing interItemSpacing();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("itemWithLayoutSize:")
    public static native NSCollectionLayoutGroup itemWithLayoutSize(NSCollectionLayoutSize layoutSize);

    @Generated
    @Selector("itemWithLayoutSize:supplementaryItems:")
    public static native NSCollectionLayoutGroup itemWithLayoutSizeSupplementaryItems(NSCollectionLayoutSize layoutSize,
            NSArray<? extends NSCollectionLayoutSupplementaryItem> supplementaryItems);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Supplies additional spacing between items along the layout axis of the group
     */
    @Generated
    @Selector("setInterItemSpacing:")
    public native void setInterItemSpacing(NSCollectionLayoutSpacing value);

    /**
     * Supplementary items are "anchored" to the group's geometry.
     */
    @Generated
    @Selector("setSupplementaryItems:")
    public native void setSupplementaryItems(NSArray<? extends NSCollectionLayoutSupplementaryItem> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("subitems")
    public native NSArray<? extends NSCollectionLayoutItem> subitems();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Supplementary items are "anchored" to the group's geometry.
     */
    @Generated
    @Selector("supplementaryItems")
    public native NSArray<? extends NSCollectionLayoutSupplementaryItem> supplementaryItems();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Specifies a group that will have N items equally sized along the vertical axis. use interItemSpacing to insert space between items
     *   +------+
     *   |~~~~~~|
     *   |~~~~~~|
     *   |~~~~~~|
     *   +------+
     *   |      |<--+
     *   +------+   |
     *   |~~~~~~|   |    +-----------------------+
     *   |~~~~~~|   +----|  Inter Item Spacing   |
     *   |~~~~~~|   |    +-----------------------+
     *   +------+   |
     *   |      |<--+
     *   +------+
     *   |~~~~~~|
     *   |~~~~~~|
     *   |~~~~~~|
     *   +------+
     */
    @Generated
    @Selector("verticalGroupWithLayoutSize:subitem:count:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object verticalGroupWithLayoutSizeSubitemCount(NSCollectionLayoutSize layoutSize,
            NSCollectionLayoutItem subitem, @NInt long count);

    /**
     * Specifies a group that will repeat items until available vertical space is exhausted.
     *   note: any remaining space after laying out items can be apportioned among flexible interItemSpacing defintions
     */
    @Generated
    @Selector("verticalGroupWithLayoutSize:subitems:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object verticalGroupWithLayoutSizeSubitems(NSCollectionLayoutSize layoutSize,
            NSArray<? extends NSCollectionLayoutItem> subitems);

    /**
     * for visual debugging; will print an ASCII art rendering to console
     */
    @Generated
    @Selector("visualDescription")
    public native String visualDescription();
}