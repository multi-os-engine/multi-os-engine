package apple.cryptotokenkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Specifies PIN formatting properties.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TKSmartCardPINFormat extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TKSmartCardPINFormat(Pointer peer) {
        super(peer);
    }

    /**
     * Offset in bits within the PIN block to mark a location for filling in the formatted PIN (justified with respect
     * to PINJustification).
     * [@note] Default value: 0
     * 
     * Note that the value of PINBitOffset indirectly controls the internal system units indicator. If PINBitOffset is
     * byte aligned (PINBitOffset mod 8 is equal to 0), the internal representation of PINBitOffset gets converted from
     * bits to bytes.
     */
    @Generated
    @Selector("PINBitOffset")
    @NInt
    public native long PINBitOffset();

    /**
     * Total length of the PIN block in bytes.
     * [@note] Default value: 8
     */
    @Generated
    @Selector("PINBlockByteLength")
    @NInt
    public native long PINBlockByteLength();

    /**
     * PIN justification within the PIN block.
     * [@note] Default value: TKSmartCardPINJustificationLeft
     */
    @Generated
    @Selector("PINJustification")
    @NInt
    public native long PINJustification();

    /**
     * Offset in bits within the PIN block to mark a location for filling in the PIN length (always left justified).
     * [@note] Default value: 0
     * 
     * Note that the value of PINLengthBitOffset indirectly controls the internal system units indicator. If
     * PINLengthBitOffset is byte aligned (PINLengthBitOffset mod 8 is equal to 0), the internal representation of
     * PINLengthBitOffset gets converted from bits to bytes.
     */
    @Generated
    @Selector("PINLengthBitOffset")
    @NInt
    public native long PINLengthBitOffset();

    /**
     * Size in bits of the PIN length field. If set to 0, PIN length is not written.
     * [@note] Default value: 0
     */
    @Generated
    @Selector("PINLengthBitSize")
    @NInt
    public native long PINLengthBitSize();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TKSmartCardPINFormat alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native TKSmartCardPINFormat allocWithZone(VoidPtr zone);

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

    /**
     * Format of PIN characters.
     * [@note] Default value: TKSmartCardPINCharsetNumeric
     */
    @Generated
    @Selector("charset")
    @NInt
    public native long charset();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encoding of PIN characters.
     * [@note] Default value: TKSmartCardPINEncodingASCII
     */
    @Generated
    @Selector("encoding")
    @NInt
    public native long encoding();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native TKSmartCardPINFormat init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Maximum number of characters to form a valid PIN.
     * [@note] Default value: 8
     */
    @Generated
    @Selector("maxPINLength")
    @NInt
    public native long maxPINLength();

    /**
     * Minimum number of characters to form a valid PIN.
     * [@note] Default value: 4
     */
    @Generated
    @Selector("minPINLength")
    @NInt
    public native long minPINLength();

    @Generated
    @Owned
    @Selector("new")
    public static native TKSmartCardPINFormat new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Format of PIN characters.
     * [@note] Default value: TKSmartCardPINCharsetNumeric
     */
    @Generated
    @Selector("setCharset:")
    public native void setCharset(@NInt long value);

    /**
     * Encoding of PIN characters.
     * [@note] Default value: TKSmartCardPINEncodingASCII
     */
    @Generated
    @Selector("setEncoding:")
    public native void setEncoding(@NInt long value);

    /**
     * Maximum number of characters to form a valid PIN.
     * [@note] Default value: 8
     */
    @Generated
    @Selector("setMaxPINLength:")
    public native void setMaxPINLength(@NInt long value);

    /**
     * Minimum number of characters to form a valid PIN.
     * [@note] Default value: 4
     */
    @Generated
    @Selector("setMinPINLength:")
    public native void setMinPINLength(@NInt long value);

    /**
     * Offset in bits within the PIN block to mark a location for filling in the formatted PIN (justified with respect
     * to PINJustification).
     * [@note] Default value: 0
     * 
     * Note that the value of PINBitOffset indirectly controls the internal system units indicator. If PINBitOffset is
     * byte aligned (PINBitOffset mod 8 is equal to 0), the internal representation of PINBitOffset gets converted from
     * bits to bytes.
     */
    @Generated
    @Selector("setPINBitOffset:")
    public native void setPINBitOffset(@NInt long value);

    /**
     * Total length of the PIN block in bytes.
     * [@note] Default value: 8
     */
    @Generated
    @Selector("setPINBlockByteLength:")
    public native void setPINBlockByteLength(@NInt long value);

    /**
     * PIN justification within the PIN block.
     * [@note] Default value: TKSmartCardPINJustificationLeft
     */
    @Generated
    @Selector("setPINJustification:")
    public native void setPINJustification(@NInt long value);

    /**
     * Offset in bits within the PIN block to mark a location for filling in the PIN length (always left justified).
     * [@note] Default value: 0
     * 
     * Note that the value of PINLengthBitOffset indirectly controls the internal system units indicator. If
     * PINLengthBitOffset is byte aligned (PINLengthBitOffset mod 8 is equal to 0), the internal representation of
     * PINLengthBitOffset gets converted from bits to bytes.
     */
    @Generated
    @Selector("setPINLengthBitOffset:")
    public native void setPINLengthBitOffset(@NInt long value);

    /**
     * Size in bits of the PIN length field. If set to 0, PIN length is not written.
     * [@note] Default value: 0
     */
    @Generated
    @Selector("setPINLengthBitSize:")
    public native void setPINLengthBitSize(@NInt long value);

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
