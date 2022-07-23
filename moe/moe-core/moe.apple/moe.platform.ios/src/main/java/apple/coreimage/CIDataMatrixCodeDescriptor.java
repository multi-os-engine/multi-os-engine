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
 * CIDataMatrixCodeDescriptor
 * <p>
 * CIDataMatrixCodeDescriptor is a concrete subclass of CIBarcodeDescriptor that defines an abstract representation of a
 * Data Matrix code symbol.
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
     * The number of module columns.
     * <p>
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
     * Construct an autoreleased descriptor that can be used as input to CIBarcodeGenerator
     */
    @Generated
    @Selector("descriptorWithPayload:rowCount:columnCount:eccVersion:")
    public static native CIDataMatrixCodeDescriptor descriptorWithPayloadRowCountColumnCountEccVersion(
            NSData errorCorrectedPayload, @NInt long rowCount, @NInt long columnCount, @NInt long eccVersion);

    /**
     * [@property] eccVersion
     * <p>
     * The Data Matrix code ECC version.
     * <p>
     * Valid values are 000, 050, 080, 100, 140, and 200. Any symbol with an even number of rows and columns will be ECC
     * 200.
     */
    @Generated
    @Selector("eccVersion")
    @NInt
    public native long eccVersion();

    /**
     * [@property] errorCorrectedPayload
     * <p>
     * The error corrected payload that comprise the Data Matrix code symbol.
     * <p>
     * DataMatrix symbols are specified bn ISO/IEC 16022:2006(E). ECC 200-type symbols will always have an even number
     * of rows and columns.
     * <p>
     * For ECC 200-type symbols, the phases of encoding data into a symbol are described in section 5.1 -- Encode
     * procedure overview. The error corrected payload comprises the de-interleaved bits of the message described at the
     * end of Step 1: Data encodation.
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
    public native CIDataMatrixCodeDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native CIDataMatrixCodeDescriptor initWithCoder(NSCoder coder);

    /**
     * Initializes a descriptor that can be used as input to CIBarcodeGenerator
     */
    @Generated
    @Selector("initWithPayload:rowCount:columnCount:eccVersion:")
    public native CIDataMatrixCodeDescriptor initWithPayloadRowCountColumnCountEccVersion(NSData errorCorrectedPayload,
            @NInt long rowCount, @NInt long columnCount, @NInt long eccVersion);

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
     * [@property] rowCount
     * <p>
     * The number of module rows.
     * <p>
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
}
