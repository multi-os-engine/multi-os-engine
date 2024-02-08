package apple.coreimage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * CIAztecCodeDescriptor
 * 
 * CIAztecCodeDescriptor is a concrete subclass of CIBarcodeDescriptor that defines an abstract representation of an
 * Aztec Code symbol.
 * 
 * CIAztecCodeDescriptor may not be instantiated directly.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIAztecCodeDescriptor extends CIBarcodeDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected CIAztecCodeDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIAztecCodeDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIAztecCodeDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * [@property] dataCodewordCount
     * 
     * The number of non-error-correction codewords carried by the Aztec code symbol.
     * 
     * Used to determine the level of error correction in conjunction with the number of data layers. Valid values are
     * 1...2048. Compact symbols can have up to 64 message codewords.
     * 
     * Note that this value can exceed the number of message codewords allowed by the number of data layers in this
     * symbol. In this case, the actual number of message codewords is 1024 fewer than this value and the message
     * payload is to be interpreted in an application-defined manner.
     */
    @Generated
    @Selector("dataCodewordCount")
    @NInt
    public native long dataCodewordCount();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Construct an autoreleased descriptor that can be used as input to CIBarcodeGenerator
     */
    @Generated
    @Selector("descriptorWithPayload:isCompact:layerCount:dataCodewordCount:")
    public static native CIAztecCodeDescriptor descriptorWithPayloadIsCompactLayerCountDataCodewordCount(
            @NotNull NSData errorCorrectedPayload, boolean isCompact, @NInt long layerCount,
            @NInt long dataCodewordCount);

    /**
     * [@property] errorCorrectedPayload
     * 
     * The error-corrected codewords that comprise the Aztec code symbol.
     * 
     * Aztec Codes are formally specified in ISO/IEC 24778:2008(E).
     * 
     * The error corrected payload consists of the 6-, 8-, 10-, or 12-bit message codewords produced at the end of the
     * step described in section 7.3.1.2 "Formation of data codewords", which exists immediately prior to adding error
     * correction. These codewords have dummy bits inserted to ensure that an entire codeword isn't all 0's or all 1's.
     * Clients will need to remove these extra bits as part of interpreting the payload.
     */
    @NotNull
    @Generated
    @Selector("errorCorrectedPayload")
    public native NSData errorCorrectedPayload();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CIAztecCodeDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native CIAztecCodeDescriptor initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes a descriptor that can be used as input to CIBarcodeGenerator
     */
    @Generated
    @Selector("initWithPayload:isCompact:layerCount:dataCodewordCount:")
    public native CIAztecCodeDescriptor initWithPayloadIsCompactLayerCountDataCodewordCount(
            @NotNull NSData errorCorrectedPayload, boolean isCompact, @NInt long layerCount,
            @NInt long dataCodewordCount);

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
     * [@property] isCompact
     * 
     * A BOOL indicating whether the symbol is compact.
     * 
     * Compact Aztec symbols use one-fewer ring in the central finder pattern than full-range Aztec symbols of the same
     * number of data layers.
     */
    @Generated
    @Selector("isCompact")
    public native boolean isCompact();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] layerCount
     * 
     * The number of data layers in the Aztec code symbol.
     * 
     * Combined with the isCompact property, the number of data layers determines the number of modules in the Aztec
     * Code symbol. Valid values range from 1 to 32. Compact symbols can have up to 4 data layers.
     * 
     * The number of data layers also determines the number of bits in each data codeword of the message carried by the
     * Aztec Code symbol.
     */
    @Generated
    @Selector("layerCount")
    @NInt
    public native long layerCount();

    @Generated
    @Owned
    @Selector("new")
    public static native CIAztecCodeDescriptor new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
