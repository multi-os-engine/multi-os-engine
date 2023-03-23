package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGPoint;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCollectionLayoutBoundarySupplementaryItem extends NSCollectionLayoutSupplementaryItem implements
        NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCollectionLayoutBoundarySupplementaryItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCollectionLayoutBoundarySupplementaryItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCollectionLayoutBoundarySupplementaryItem allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Specify the alignment of the supplementary relative the containing geometry's coordinate space to
     * position the boundary supplementary item.
     * 
     * +------------------------------------------+
     * +----------------------+ |Boundary Supplementary Item |
     * | |<----------------|* alignment: [.top, .leading] |
     * +----------------------+ |* absoluteOffset: CGPoint(x:0.0, y:-10.0) |
     * +------------------------------------------+
     * +----------------------------------+
     * | |
     * | |
     * | |
     * | |
     * | |
     * | |
     * | |
     * | |
     * | | +--------------------------------+
     * | |<-----| Section Geometry |
     * | | +--------------------------------+
     * | |
     * | |
     * | |
     * | |
     * | |
     * | |
     * | |
     * +----------------------------------+
     */
    @Generated
    @Selector("boundarySupplementaryItemWithLayoutSize:elementKind:alignment:")
    public static native NSCollectionLayoutBoundarySupplementaryItem boundarySupplementaryItemWithLayoutSizeElementKindAlignment(
            NSCollectionLayoutSize layoutSize, String elementKind, @NInt long alignment);

    @Generated
    @Selector("boundarySupplementaryItemWithLayoutSize:elementKind:alignment:absoluteOffset:")
    public static native NSCollectionLayoutBoundarySupplementaryItem boundarySupplementaryItemWithLayoutSizeElementKindAlignmentAbsoluteOffset(
            NSCollectionLayoutSize layoutSize, String elementKind, @NInt long alignment,
            @ByValue CGPoint absoluteOffset);

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
    @Selector("description")
    public static native String description_static();

    /**
     * Default is YES. This will automatically extend the content area of the host geometry (e.g. section)
     * For .estimated sized supplementary items, this allows automatic adjustment of the layout. (e.g. dynamic text)
     */
    @Generated
    @Selector("extendsBoundary")
    public native boolean extendsBoundary();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSCollectionLayoutBoundarySupplementaryItem init();

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
    @Selector("itemWithLayoutSize:")
    public static native NSCollectionLayoutBoundarySupplementaryItem itemWithLayoutSize(
            NSCollectionLayoutSize layoutSize);

    @Generated
    @Selector("itemWithLayoutSize:supplementaryItems:")
    public static native NSCollectionLayoutBoundarySupplementaryItem itemWithLayoutSizeSupplementaryItems(
            NSCollectionLayoutSize layoutSize,
            NSArray<? extends NSCollectionLayoutSupplementaryItem> supplementaryItems);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSCollectionLayoutBoundarySupplementaryItem new_objc();

    @Generated
    @Selector("offset")
    @ByValue
    public native CGPoint offset();

    /**
     * Default is NO. Specify YES to keep the supplementary visible while any portion of the host geometry (e.g.
     * section) is visible.
     * Occlusion disambiguation between other supplementaries will be managed automatically (e.g. section header +
     * footer both pinned)
     */
    @Generated
    @Selector("pinToVisibleBounds")
    public native boolean pinToVisibleBounds();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Default is YES. This will automatically extend the content area of the host geometry (e.g. section)
     * For .estimated sized supplementary items, this allows automatic adjustment of the layout. (e.g. dynamic text)
     */
    @Generated
    @Selector("setExtendsBoundary:")
    public native void setExtendsBoundary(boolean value);

    /**
     * Default is NO. Specify YES to keep the supplementary visible while any portion of the host geometry (e.g.
     * section) is visible.
     * Occlusion disambiguation between other supplementaries will be managed automatically (e.g. section header +
     * footer both pinned)
     */
    @Generated
    @Selector("setPinToVisibleBounds:")
    public native void setPinToVisibleBounds(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supplementaryItemWithLayoutSize:elementKind:containerAnchor:")
    public static native NSCollectionLayoutBoundarySupplementaryItem supplementaryItemWithLayoutSizeElementKindContainerAnchor(
            NSCollectionLayoutSize layoutSize, String elementKind, NSCollectionLayoutAnchor containerAnchor);

    @Generated
    @Selector("supplementaryItemWithLayoutSize:elementKind:containerAnchor:itemAnchor:")
    public static native NSCollectionLayoutBoundarySupplementaryItem supplementaryItemWithLayoutSizeElementKindContainerAnchorItemAnchor(
            NSCollectionLayoutSize layoutSize, String elementKind, NSCollectionLayoutAnchor containerAnchor,
            NSCollectionLayoutAnchor itemAnchor);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
