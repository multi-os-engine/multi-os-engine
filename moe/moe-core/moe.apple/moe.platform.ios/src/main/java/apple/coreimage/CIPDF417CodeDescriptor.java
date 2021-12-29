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

/**
 * CIPDF417CodeDescriptor
 * <p>
 * CIPDF417CodeDescriptor is a concrete subclass of CIBarcodeDescriptor that defines an abstract representation of a PDF417 code symbol.
 * <p>
 * Refer to the ISO/IEC 15438:2006(E) for the PDF417 symbol specification.
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIPDF417CodeDescriptor extends CIBarcodeDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected CIPDF417CodeDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIPDF417CodeDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIPDF417CodeDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * [@property] columnCount
     * <p>
     * Indicates the number of columns in the rectangular matrix, excluding the columns used to indicate the symbol structure.
     * <p>
     * columnCount values range from 1 to 30.
     */
    @Generated
    @Selector("columnCount")
    @NInt
    public native long columnCount();

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
    @Selector("descriptorWithPayload:isCompact:rowCount:columnCount:")
    public static native CIPDF417CodeDescriptor descriptorWithPayloadIsCompactRowCountColumnCount(
            NSData errorCorrectedPayload, boolean isCompact, @NInt long rowCount, @NInt long columnCount);

    /**
     * [@property] errorCorrectedPayload
     * <p>
     * The error-corrected codewords which comprise the PDF417 symbol. The first codeword indicates the number of data codewords in the errorCorrectedPayload.
     * <p>
     * PDF417 codes are comprised of a start character on the left and a stop character on the right. Each row begins and ends with special characters indicating the current row as well as information about the dimensions of the PDF417 symbol. The errorCorrectedPayload represents the sequence of PDF417 codewords that make up the body of the message. The first codeword indicates the number of codewords in the message. This count includes the "count" codeword and any padding codewords, but does not include the error correction codewords. Each codeword is a 16-bit value in the range of 0...928. The sequence is to be interpreted as described in the PDF417 bar code symbology specification -- ISO/IEC 15438:2006(E).
     */
    @Generated
    @Selector("errorCorrectedPayload")
    public native NSData errorCorrectedPayload();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CIPDF417CodeDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native CIPDF417CodeDescriptor initWithCoder(NSCoder coder);

    /**
     * Initializes a descriptor that can be used as input to CIBarcodeGenerator
     */
    @Generated
    @Selector("initWithPayload:isCompact:rowCount:columnCount:")
    public native CIPDF417CodeDescriptor initWithPayloadIsCompactRowCountColumnCount(NSData errorCorrectedPayload,
            boolean isCompact, @NInt long rowCount, @NInt long columnCount);

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
     * <p>
     * A BOOL indicating whether the symbol is compact.
     * <p>
     * Compact PDF417 symbols have abbreviated right-side guard bars.
     */
    @Generated
    @Selector("isCompact")
    public native boolean isCompact();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CIPDF417CodeDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] rowCount
     * <p>
     * Indicates the number of rows in the rectangular matrix.
     * <p>
     * rowCount values range from 3 to 90.
     */
    @Generated
    @Selector("rowCount")
    @NInt
    public native long rowCount();

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
}
