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
import org.moe.natj.general.ann.NFloat;
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
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCollectionLayoutDimension extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCollectionLayoutDimension(Pointer peer) {
        super(peer);
    }

    /**
     * dimension with an absolute point value
     */
    @NotNull
    @Generated
    @Selector("absoluteDimension:")
    public static native NSCollectionLayoutDimension absoluteDimension(@NFloat double absoluteDimension);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCollectionLayoutDimension alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCollectionLayoutDimension allocWithZone(VoidPtr zone);

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
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("dimension")
    @NFloat
    public native double dimension();

    /**
     * dimension is estimated with a point value. Actual size will be determined when the content is rendered.
     */
    @NotNull
    @Generated
    @Selector("estimatedDimension:")
    public static native NSCollectionLayoutDimension estimatedDimension(@NFloat double estimatedDimension);

    /**
     * dimension is computed as a fraction of the height of the containing group
     */
    @NotNull
    @Generated
    @Selector("fractionalHeightDimension:")
    public static native NSCollectionLayoutDimension fractionalHeightDimension(@NFloat double fractionalHeight);

    /**
     * dimension is computed as a fraction of the width of the containing group
     */
    @NotNull
    @Generated
    @Selector("fractionalWidthDimension:")
    public static native NSCollectionLayoutDimension fractionalWidthDimension(@NFloat double fractionalWidth);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSCollectionLayoutDimension init();

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
    @Selector("isAbsolute")
    public native boolean isAbsolute();

    /**
     * Returns `YES` if the receiver is `estimated` OR `uniformAcrossSiblings`.
     */
    @Generated
    @Selector("isEstimated")
    public native boolean isEstimated();

    @Generated
    @Selector("isFractionalHeight")
    public native boolean isFractionalHeight();

    @Generated
    @Selector("isFractionalWidth")
    public native boolean isFractionalWidth();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSCollectionLayoutDimension new_objc();

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
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("isUniformAcrossSiblings")
    public native boolean isUniformAcrossSiblings();

    /**
     * Items with this dimension type will receive at least as much room as the view requires, and will
     * grow to match the dimension of the largest estimated sibling in their parent.
     * When specified on the outermost group for a section, the largest size will be shared across the entire section.
     * 
     * Eg: All `NSCollectionLayoutItem`s specified with a `uniformAcrossSiblingsWithEstimate:` `heightDimension` in a
     * horizontal `NSCollectionLayoutGroup`
     * will have a height equal to the height of the tallest item in that group.
     * 
     * When computing the size for a dimension of this type, the layout will need to retrieve preferred attributes for
     * all siblings
     * in its parent, which in `UICollectionView` means creating views for all dependent items. This can be very
     * expensive, so `uniformAcrossSiblingsWithEstimate` should
     * only be used in layouts where the number of dependent items is known to be relatively small.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("uniformAcrossSiblingsWithEstimate:")
    @NotNull
    public static native NSCollectionLayoutDimension uniformAcrossSiblingsWithEstimate(
            @NFloat double estimatedDimension);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
