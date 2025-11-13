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
 * A concrete subclass the Core Image Barcode Descriptor that represents an Data Matrix code symbol.
 * 
 * A Data Matrix code symbol is a 2D barcode format defined by the ISO/IEC 16022:2006(E) standard.
 * It encodes data in square or rectangular symbol with solid lines on the left and bottom sides
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIDataMatrixCodeDescriptor extends CIBarcodeDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected CIDataMatrixCodeDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIDataMatrixCodeDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIDataMatrixCodeDescriptor allocWithZone(VoidPtr zone);

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
     * The number of columns in the Data Matrix code symbol.
     * 
     * Refer to ISO/IEC 16022:2006(E) for valid module row and column count combinations.
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
     * Creates a Data Matrix code descriptor for the given payload and parameters.
     * 
     * - Parameters:
     * - errorCorrectedPayload: The data to encode in the Data Matrix code symbol.
     * - rowCount: The number of rows in the Data Matrix code symbol.
     * - columnCount: The number of columns in the Data Matrix code symbol.
     * - eccVersion: The ``CIDataMatrixCodeECCVersion`` for the Data Matrix code symbol.
     * - Returns:
     * An autoreleased ``CIAztecCodeDescriptor`` instance
     * or `nil` if the parameters are invalid
     */
    @Generated
    @Selector("descriptorWithPayload:rowCount:columnCount:eccVersion:")
    public static native CIDataMatrixCodeDescriptor descriptorWithPayloadRowCountColumnCountEccVersion(
            @NotNull NSData errorCorrectedPayload, @NInt long rowCount, @NInt long columnCount, @NInt long eccVersion);

    /**
     * The error correction version of the Data Matrix code symbol.
     * 
     * The possible error correction version are enumerated in ``CIDataMatrixCodeECCVersion``.
     * Any symbol with an even number of rows and columns will be ECC 200.
     */
    @Generated
    @Selector("eccVersion")
    @NInt
    public native long eccVersion();

    /**
     * The error-corrected payload containing the data encoded in the Data Matrix code symbol.
     * 
     * DataMatrix symbols are specified bn ISO/IEC 16022:2006(E). ECC 200-type symbols will always
     * have an even number of rows and columns.
     * 
     * For ECC 200-type symbols, the phases of encoding data into a symbol are described in
     * section 5.1 -- Encode procedure overview. The error corrected payload comprises the
     * de-interleaved bits of the message described at the end of Step 1: Data encodation.
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
    public native CIDataMatrixCodeDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native CIDataMatrixCodeDescriptor initWithCoder(@NotNull NSCoder coder);

    /**
     * Initializes a descriptor that can be used as input to CIBarcodeGenerator
     * Initializes a Data Matrix code descriptor for the given payload and parameters.
     * 
     * - Parameters:
     * - errorCorrectedPayload: The data to encode in the Data Matrix code symbol.
     * - rowCount: The number of rows in the Data Matrix code symbol.
     * - columnCount: The number of columns in the Data Matrix code symbol.
     * - eccVersion: The ``CIDataMatrixCodeECCVersion`` for the Data Matrix code symbol.
     * - Returns:
     * An initialized ``CIAztecCodeDescriptor`` instance
     * or `nil` if the parameters are invalid
     */
    @Generated
    @Selector("initWithPayload:rowCount:columnCount:eccVersion:")
    public native CIDataMatrixCodeDescriptor initWithPayloadRowCountColumnCountEccVersion(
            @NotNull NSData errorCorrectedPayload, @NInt long rowCount, @NInt long columnCount, @NInt long eccVersion);

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

    @Generated
    @Owned
    @Selector("new")
    public static native CIDataMatrixCodeDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The number of rows in the Data Matrix code symbol.
     * 
     * Refer to ISO/IEC 16022:2006(E) for valid module row and column count combinations.
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
