package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import apple.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.MappedReturn;

/**
 * An optional information item present in the setup payload.
 * 
 * Note that while the Matter specification allows elements containing
 * arbitrary TLV data types, this implementation currently only supports
 * String and Int32 values.
 * 
 * Objects of this type are immutable; calling any deprecated property
 * setters has no effect.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTROptionalQRCodeInfo extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTROptionalQRCodeInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTROptionalQRCodeInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTROptionalQRCodeInfo allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use type
     */
    @Generated
    @Deprecated
    @Selector("infoType")
    @NotNull
    public native NSNumber infoType();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.6
     * Deprecated-Message: Please use -initWithTag:...value:
     */
    @Deprecated
    @Generated
    @Selector("init")
    public native MTROptionalQRCodeInfo init();

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
     * The value held in this extension element,
     * if `type` is an integer type, or nil otherwise.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("integerValue")
    @Nullable
    public native NSNumber integerValue();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MTROptionalQRCodeInfo new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use type
     */
    @Generated
    @Deprecated
    @Selector("setInfoType:")
    public native void setInfoType(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.6
     * Deprecated-Message: MTROptionalQRCodeInfo is immutable
     */
    @Deprecated
    @Generated
    @Selector("setIntegerValue:")
    public native void setIntegerValue(@NotNull NSNumber integerValue);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.6
     * Deprecated-Message: MTROptionalQRCodeInfo is immutable
     */
    @Deprecated
    @Generated
    @Selector("setStringValue:")
    public native void setStringValue(@NotNull String stringValue);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.6
     * Deprecated-Message: MTROptionalQRCodeInfo is immutable
     */
    @Deprecated
    @Generated
    @Selector("setTag:")
    public native void setTag(@NotNull NSNumber tag);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.6
     * Deprecated-Message: MTROptionalQRCodeInfo is immutable
     */
    @Deprecated
    @Generated
    @Selector("setType:")
    public native void setType(@NUInt long type);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The value held in this extension element,
     * if `type` is `MTROptionalQRCodeInfoTypeString`, or nil otherwise.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("stringValue")
    @Nullable
    public native String stringValue();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The vendor-specific TLV tag number for this information item.
     * 
     * Vendor-specific elements have tags in the range 0x80 - 0xFF.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("tag")
    @NotNull
    public native NSNumber tag();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("type")
    @NUInt
    public native long type();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Initializes the object with a tag and int32 value.
     * The tag must be in the range 0x80 - 0xFF.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithTag:int32Value:")
    public native MTROptionalQRCodeInfo initWithTagInt32Value(@NotNull NSNumber tag, int value);

    /**
     * Initializes the object with a tag and string value.
     * The tag must be in the range 0x80 - 0xFF.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithTag:stringValue:")
    public native MTROptionalQRCodeInfo initWithTagStringValue(@NotNull NSNumber tag, @NotNull String value);
}