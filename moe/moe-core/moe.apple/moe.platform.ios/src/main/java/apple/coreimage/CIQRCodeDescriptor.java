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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class CIQRCodeDescriptor
 * @abstract
 *    CIQRCodeDescriptor is a concrete subclass of CIBarcodeDescriptor that defines an abstract representation of a QR code symbol. 
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIQRCodeDescriptor extends CIBarcodeDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected CIQRCodeDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIQRCodeDescriptor alloc();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Construct an autoreleased descriptor that can be used as input to CIBarcodeGenerator
     */
    @Generated
    @Selector("descriptorWithPayload:symbolVersion:maskPattern:errorCorrectionLevel:")
    public static native CIQRCodeDescriptor descriptorWithPayloadSymbolVersionMaskPatternErrorCorrectionLevel(
            NSData errorCorrectedPayload, @NInt long symbolVersion, byte maskPattern, @NInt long errorCorrectionLevel);

    /**
     * @property errorCorrectedPayload
     * @abstract
     * The error-corrected codewords that comprise the QR code symbol.
     * 
     * @discussion
     * QR Codes are formally specified in ISO/IEC 18004:2006(E). Section 6.4.10 "Bitstream to codeword conversion" specifies the set of 8-bit codewords in the symbol immediately prior to splitting the message into blocks and applying error correction.
     * 
     * During decode, error correction is applied and if successful, the message is re-ordered to the state immediately following "Bitstream to codeword coversion." The errorCorrectedPayload corresponds to this sequence of 8-bit codewords.
     */
    @Generated
    @Selector("errorCorrectedPayload")
    public native NSData errorCorrectedPayload();

    /**
     * @property errorCorrectionLevel
     * @abstract
     *    The error correction level of the QR code.
     * 
     * @discussion
     *    QR Codes support four levels of Reed-Solomon error correction, in increasing error correction capability: L, M, Q, and H.
     */
    @Generated
    @Selector("errorCorrectionLevel")
    @NInt
    public native long errorCorrectionLevel();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CIQRCodeDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native CIQRCodeDescriptor initWithCoder(NSCoder coder);

    /**
     * Initializes a descriptor that can be used as input to CIBarcodeGenerator
     */
    @Generated
    @Selector("initWithPayload:symbolVersion:maskPattern:errorCorrectionLevel:")
    public native CIQRCodeDescriptor initWithPayloadSymbolVersionMaskPatternErrorCorrectionLevel(
            NSData errorCorrectedPayload, @NInt long symbolVersion, byte maskPattern, @NInt long errorCorrectionLevel);

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
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * @property maskPattern
     * @abstract
     *    The data mask pattern for the QR code symbol.
     * 
     * @discussion
     *    QR Codes support eight data mask patterns, which are used to avoid large black or large white areas inside the symbol body. Valid values range from 0 to 7.
     */
    @Generated
    @Selector("maskPattern")
    public native byte maskPattern();

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
     * @property symbolVersion
     * @abstract
     *    The version property corresponds to the size of the QR Code.
     * 
     * @discussion
     *    QR Codes are square. ISO/IEC 18004 defines versions from 1 to 40, where a higher symbol version indicates a larger data carrying capacity. This field is required in order to properly interpret the error corrected payload.
     */
    @Generated
    @Selector("symbolVersion")
    @NInt
    public native long symbolVersion();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}