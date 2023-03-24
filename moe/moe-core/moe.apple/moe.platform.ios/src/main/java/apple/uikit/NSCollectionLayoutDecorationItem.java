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
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCollectionLayoutDecorationItem extends NSCollectionLayoutItem implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected NSCollectionLayoutDecorationItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSCollectionLayoutDecorationItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSCollectionLayoutDecorationItem allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Useful for setting a background decoration view behind a section's content area.
     * 
     * contentInset can also be applied as-needed.
     * Register the elementKind with the layout instance to associate with your custom view class/nib
     * 
     * +----------------------------------+
     * | |
     * | +----------------------------+ | +--------------------------------+
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| | |Background Decoration Item |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~<--+------|* contentInsets applied |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| | +--------------------------------+
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| | +--------------------------------+
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |<-----| Section Geometry |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| | +--------------------------------+
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |
     * | |~~~~~~~~~~~~~~~~~~~~~~~~~~~~| |
     * | +----------------------------+ |
     * | |
     * +----------------------------------+
     */
    @NotNull
    @Generated
    @Selector("backgroundDecorationItemWithElementKind:")
    public static native NSCollectionLayoutDecorationItem backgroundDecorationItemWithElementKind(
            @NotNull String elementKind);

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

    @NotNull
    @Generated
    @Selector("elementKind")
    public native String elementKind();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSCollectionLayoutDecorationItem init();

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
    public static native NSCollectionLayoutDecorationItem itemWithLayoutSize(
            @NotNull NSCollectionLayoutSize layoutSize);

    @Generated
    @Selector("itemWithLayoutSize:supplementaryItems:")
    public static native NSCollectionLayoutDecorationItem itemWithLayoutSizeSupplementaryItems(
            @NotNull NSCollectionLayoutSize layoutSize,
            @NotNull NSArray<? extends NSCollectionLayoutSupplementaryItem> supplementaryItems);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSCollectionLayoutDecorationItem new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * default is 0; all other section items will be automatically be promoted to zIndex=1
     */
    @Generated
    @Selector("setZIndex:")
    public native void setZIndex(@NInt long value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * default is 0; all other section items will be automatically be promoted to zIndex=1
     */
    @Generated
    @Selector("zIndex")
    @NInt
    public native long zIndex();
}
