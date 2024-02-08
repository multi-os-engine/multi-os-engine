package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Abstract base class. Do not instantiate directly.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICellAccessory extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UICellAccessory(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UICellAccessory alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICellAccessory allocWithZone(VoidPtr zone);

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

    /**
     * The state(s) for which the accessory should be displayed.
     */
    @Generated
    @Selector("displayedState")
    @NInt
    public native long displayedState();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UICellAccessory init();

    @Generated
    @Selector("initWithCoder:")
    public native UICellAccessory initWithCoder(@NotNull NSCoder coder);

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
     * Hidden accessories take up space in the layout, but are not visible and do not provide any behaviors.
     * Use this property to achieve a consistent layout across cells when some show the accessory and others do not.
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

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
    public static native UICellAccessory new_objc();

    /**
     * The layout width that is reserved for the accessory, inside which the accessory will be centered.
     * This is used to ensure horizontal alignment of different accessories in adjacent cells, even when
     * the actual accessory view width varies slightly. A value of 0 means the actual width of the
     * accessory will be used. Use UICellAccessoryStandardDimension to request the standard width.
     */
    @Generated
    @Selector("reservedLayoutWidth")
    @NFloat
    public native double reservedLayoutWidth();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The state(s) for which the accessory should be displayed.
     */
    @Generated
    @Selector("setDisplayedState:")
    public native void setDisplayedState(@NInt long value);

    /**
     * Hidden accessories take up space in the layout, but are not visible and do not provide any behaviors.
     * Use this property to achieve a consistent layout across cells when some show the accessory and others do not.
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * The layout width that is reserved for the accessory, inside which the accessory will be centered.
     * This is used to ensure horizontal alignment of different accessories in adjacent cells, even when
     * the actual accessory view width varies slightly. A value of 0 means the actual width of the
     * accessory will be used. Use UICellAccessoryStandardDimension to request the standard width.
     */
    @Generated
    @Selector("setReservedLayoutWidth:")
    public native void setReservedLayoutWidth(@NFloat double value);

    /**
     * The tint color to apply to the accessory. Default value is nil, which uses the system default.
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(@Nullable UIColor value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The tint color to apply to the accessory. Default value is nil, which uses the system default.
     */
    @Nullable
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
