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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Useful for setting a background decoration view behind a section's content area.
     * <p>
     * contentInset can also be applied as-needed.
     * Register the elementKind with the layout instance to associate with your custom view class/nib
     * <p>
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
    @Generated
    @Selector("backgroundDecorationItemWithElementKind:")
    public static native NSCollectionLayoutDecorationItem backgroundDecorationItemWithElementKind(String elementKind);

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
    public static native NSCollectionLayoutDecorationItem itemWithLayoutSize(NSCollectionLayoutSize layoutSize);

    @Generated
    @Selector("itemWithLayoutSize:supplementaryItems:")
    public static native NSCollectionLayoutDecorationItem itemWithLayoutSizeSupplementaryItems(
            NSCollectionLayoutSize layoutSize,
            NSArray<? extends NSCollectionLayoutSupplementaryItem> supplementaryItems);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
