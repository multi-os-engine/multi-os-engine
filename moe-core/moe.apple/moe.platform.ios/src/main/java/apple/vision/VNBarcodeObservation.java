package apple.vision;

import apple.NSObject;
import apple.coreimage.CIBarcodeDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSData;

/**
 * VNBarcodeObservation
 * [@superclass] VNRectangleObservation
 * 
 * VNBarcodeObservation Describes an area containing a barcode detected by the VNRequestNameDetectBarcodes request.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNBarcodeObservation extends VNRectangleObservation {
    static {
        NatJ.register();
    }

    @Generated
    protected VNBarcodeObservation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNBarcodeObservation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNBarcodeObservation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * An object that provides symbology-specific data for the barcode.
     */
    @Nullable
    @Generated
    @Selector("barcodeDescriptor")
    public native CIBarcodeDescriptor barcodeDescriptor();

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

    @Generated
    @Selector("init")
    public native VNBarcodeObservation init();

    @Generated
    @Selector("initWithCoder:")
    public native VNBarcodeObservation initWithCoder(@NotNull NSCoder coder);

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
    public static native VNBarcodeObservation new_objc();

    @Generated
    @Selector("observationWithBoundingBox:")
    public static native VNBarcodeObservation observationWithBoundingBox(@ByValue CGRect boundingBox);

    /**
     * The string representation of the barcode's payload. Depending on the symbology of the barcode and/or the payload
     * data itself, a string representation of the payload may not be available.
     */
    @Nullable
    @Generated
    @Selector("payloadStringValue")
    public native String payloadStringValue();

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
     * The symbology of the detected barcode.
     */
    @NotNull
    @Generated
    @Selector("symbology")
    public native String symbology();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("observationWithRequestRevision:boundingBox:")
    public static native VNBarcodeObservation observationWithRequestRevisionBoundingBox(@NUInt long requestRevision,
            @ByValue CGRect boundingBox);

    @Deprecated
    @Generated
    @Selector("rectangleObservationWithRequestRevision:topLeft:bottomLeft:bottomRight:topRight:")
    public static native VNBarcodeObservation rectangleObservationWithRequestRevisionTopLeftBottomLeftBottomRightTopRight(
            @NUInt long requestRevision, @ByValue CGPoint topLeft, @ByValue CGPoint bottomLeft,
            @ByValue CGPoint bottomRight, @ByValue CGPoint topRight);

    /**
     * A boolean indicating if the barcode is color inverted
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("isColorInverted")
    public native boolean isColorInverted();

    /**
     * Boolean indicating if the barcode carries any GS1 application specific data
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("isGS1DataCarrier")
    public native boolean isGS1DataCarrier();

    /**
     * The raw data representation of the barcode's payload if available.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("payloadData")
    @Nullable
    public native NSData payloadData();

    @Generated
    @Selector("rectangleObservationWithRequestRevision:topLeft:topRight:bottomRight:bottomLeft:")
    public static native VNBarcodeObservation rectangleObservationWithRequestRevisionTopLeftTopRightBottomRightBottomLeft(
            @NUInt long requestRevision, @ByValue CGPoint topLeft, @ByValue CGPoint topRight,
            @ByValue CGPoint bottomRight, @ByValue CGPoint bottomLeft);

    /**
     * Represents the supplemental composite type. Currently, this can only refer to the composite flag of the 2D
     * symbology as part of a GS1 composite symbology.
     * This attribute only exists when the primary descriptor is the 1D symbology of a GS1 composite symbology, and of
     * which a valid 2D counterpart has been coalesced into.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("supplementalCompositeType")
    @NInt
    public native long supplementalCompositeType();

    /**
     * Decode the supplemental code in the descriptor as a string value. Note: this property might be expensive the
     * first time it is accessed
     * When non-NULL, and if the descriptor has supplemental raw payload data, the pointee will be set to the decoded
     * supplemental payload raw data value.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("supplementalPayloadData")
    @Nullable
    public native NSData supplementalPayloadData();

    /**
     * Decode the supplemental code in the descriptor as a string value. Note: this property might be expensive the
     * first time it is accessed
     * When non-NULL, and if the descriptor has supplemental raw payload data, the pointee will be set to the decoded
     * supplemental payload string value.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("supplementalPayloadString")
    @Nullable
    public native String supplementalPayloadString();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
