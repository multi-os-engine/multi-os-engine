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
 * A concrete subclass of Core Image Barcode Descriptor that represents a PDF417 symbol.
 * 
 * PDF417 is a stacked linear barcode symbol format used predominantly in transport, ID cards,
 * and inventory management. Each pattern in the code comprises 4 bars and spaces, 17 units long.
 * 
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
     * The number of columns in the PDF417 code symbol.
     * 
     * Valid column count values are from 1 to 30.
     * This count excluded the columns used to indicate the symbol structure.
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
     * Creates an PDF417 code descriptor for the given payload and parameters.
     * 
     * - Parameters:
     * - errorCorrectedPayload: The data to encode in the PDF417 code symbol.
     * - isCompact: A Boolean indicating whether or not the PDF417 code is compact.
     * - rowCount: The number of rows in the PDF417 code, from 3 to 90.
     * - columnCount: The number of columns in the Aztec code, from 1 to 30.
     * - Returns:
     * An autoreleased ``CIPDF417CodeDescriptor`` instance
     * or `nil` if the parameters are invalid
     */
    @Generated
    @Selector("descriptorWithPayload:isCompact:rowCount:columnCount:")
    public static native CIPDF417CodeDescriptor descriptorWithPayloadIsCompactRowCountColumnCount(
            @NotNull NSData errorCorrectedPayload, boolean isCompact, @NInt long rowCount, @NInt long columnCount);

    /**
     * The error-corrected payload containing the data encoded in the PDF417 code symbol.
     * 
     * The first codeword indicates the number of data codewords in the errorCorrectedPayload.
     * 
     * PDF417 codes are comprised of a start character on the left and a stop character on the right.
     * Each row begins and ends with special characters indicating the current row as well as information
     * about the dimensions of the PDF417 symbol. The errorCorrectedPayload represents the sequence
     * of PDF417 codewords that make up the body of the message. The first codeword indicates the number
     * of codewords in the message. This count includes the "count" codeword and any padding codewords,
     * but does not include the error correction codewords. Each codeword is a 16-bit value in the range
     * of 0...928. The sequence is to be interpreted as described in the PDF417 bar code symbology
     * specification -- ISO/IEC 15438:2006(E).
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
    public native CIPDF417CodeDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native CIPDF417CodeDescriptor initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes an PDF417 code descriptor for the given payload and parameters.
     * 
     * - Parameters:
     * - errorCorrectedPayload: The data to encode in the PDF417 code symbol.
     * - isCompact: A Boolean indicating whether or not the PDF417 code is compact.
     * - rowCount: The number of rows in the PDF417 code, from 3 to 90.
     * - columnCount: The number of columns in the Aztec code, from 1 to 30.
     * - Returns:
     * An initialized ``CIPDF417CodeDescriptor`` instance
     * or `nil` if the parameters are invalid
     */
    @Generated
    @Selector("initWithPayload:isCompact:rowCount:columnCount:")
    public native CIPDF417CodeDescriptor initWithPayloadIsCompactRowCountColumnCount(
            @NotNull NSData errorCorrectedPayload, boolean isCompact, @NInt long rowCount, @NInt long columnCount);

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
     * A boolean value telling if the PDF417 code is compact.
     * 
     * Compact PDF417 symbols have abbreviated right-side guard bars.
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
     * The number of rows in the PDF417 code symbol.
     * 
     * Valid row count values are from 3 to 90.
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
