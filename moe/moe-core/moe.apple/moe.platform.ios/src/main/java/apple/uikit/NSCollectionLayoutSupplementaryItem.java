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
public class NSCollectionLayoutSupplementaryItem extends NSCollectionLayoutItem implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCollectionLayoutSupplementaryItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCollectionLayoutSupplementaryItem alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSCollectionLayoutSupplementaryItem allocWithZone(VoidPtr zone);

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
    @Selector("containerAnchor")
    public native NSCollectionLayoutAnchor containerAnchor();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("elementKind")
    public native String elementKind();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSCollectionLayoutSupplementaryItem init();

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
    @Selector("itemAnchor")
    public native NSCollectionLayoutAnchor itemAnchor();

    @Generated
    @Selector("itemWithLayoutSize:")
    public static native NSCollectionLayoutSupplementaryItem itemWithLayoutSize(NSCollectionLayoutSize layoutSize);

    @Generated
    @Selector("itemWithLayoutSize:supplementaryItems:")
    public static native NSCollectionLayoutSupplementaryItem itemWithLayoutSizeSupplementaryItems(
            NSCollectionLayoutSize layoutSize,
            NSArray<? extends NSCollectionLayoutSupplementaryItem> supplementaryItems);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSCollectionLayoutSupplementaryItem new_objc();

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
    @Selector("setZIndex:")
    public native void setZIndex(@NInt long value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Supplementary items are positioned (i.e. anchored) to coordinate spaces throughout the layout
     * In this example, a supplementary is anchored to the top+trailing edge of a cell.
     * Supplementary items can be anchored to items (and groups, since a group is-a item)
     * Boundary supplementary items can be anchored to sections and the global layout
     * <p>
     * +-----+       +------------------------------------------+
     * |~~~~~|       | edges: [.top,.trailing]                  |
     * +----------------------------+~~~~~|<------+ fractionalOffset: CGPoint(x:0.5,y:-0.5)  |
     * |                            |~~~~~|       +------------------------------------------+
     * |                            +--+--+
     * |                               |
     * |                               |
     * |                               |
     * |                               |
     * +-------------------------------+
     * <p>
     * Container anchors are used to specify positioning of an item within the host geometry (e.g. item, group, section)
     */
    @Generated
    @Selector("supplementaryItemWithLayoutSize:elementKind:containerAnchor:")
    public static native NSCollectionLayoutSupplementaryItem supplementaryItemWithLayoutSizeElementKindContainerAnchor(
            NSCollectionLayoutSize layoutSize, String elementKind, NSCollectionLayoutAnchor containerAnchor);

    /**
     * +----------------------------------------------------+
     * +-----+         |* Container Anchor                                  |
     * |~~~~~|         |edges: [.top,.trailing] offset: CGPoint(x:10,y:-10) |
     * |~~~~~|<--------|                                                    |
     * |~~~~~|         |* Item Anchor:                                      |
     * +-----+         |edges: [.bottom, .leading]                          |
     * +-------------------------------+                 +----------------------------------------------------+
     * |                               |
     * |                               |
     * |                               |
     * |                               |
     * |                               |
     * |                               |
     * +-------------------------------+
     * <p>
     * Combine a container anchor with an item anchor for fine-grained positioning.
     * Optionally add an offset for additional refinement.
     */
    @Generated
    @Selector("supplementaryItemWithLayoutSize:elementKind:containerAnchor:itemAnchor:")
    public static native NSCollectionLayoutSupplementaryItem supplementaryItemWithLayoutSizeElementKindContainerAnchorItemAnchor(
            NSCollectionLayoutSize layoutSize, String elementKind, NSCollectionLayoutAnchor containerAnchor,
            NSCollectionLayoutAnchor itemAnchor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("zIndex")
    @NInt
    public native long zIndex();
}
