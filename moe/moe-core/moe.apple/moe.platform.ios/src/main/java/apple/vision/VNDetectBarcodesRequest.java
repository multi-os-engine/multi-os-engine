package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A request that detects barcodes in an image.
 * 
 * This request will return zero or more VNBarcodeObservation objects objects which describe the barcodes detected in an
 * image.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNDetectBarcodesRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNDetectBarcodesRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNDetectBarcodesRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNDetectBarcodesRequest allocWithZone(VoidPtr zone);

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
    public native VNDetectBarcodesRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNDetectBarcodesRequest initWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

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
    public static native VNDetectBarcodesRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The collection of barcode symbologies that are to be detected in the image. The default is to scan for all
     * possible symbologies. Setting a revision on the request will reset the symbologies to all symbologies for the
     * specified revision.
     */
    @Generated
    @Selector("setSymbologies:")
    public native void setSymbologies(@NotNull NSArray<String> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Obtain the collection of barcode symbologies currently recognized by the Vision framework.
     * 
     * Calling this method could be a potentially expensive operation.
     * 
     * @return An array of VNBarcodeSymbology objects describing the symbologies currently supported by the Vision
     *         framework.
     * 
     *         API-Since: 11.0
     *         Deprecated-Since: 15.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("supportedSymbologies")
    public static native NSArray<String> supportedSymbologies();

    /**
     * The collection of barcode symbologies that are to be detected in the image. The default is to scan for all
     * possible symbologies. Setting a revision on the request will reset the symbologies to all symbologies for the
     * specified revision.
     */
    @NotNull
    @Generated
    @Selector("symbologies")
    public native NSArray<String> symbologies();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @NotNull
    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    /**
     * VNBarcodeObservation results.
     */
    @Nullable
    @Generated
    @Selector("results")
    public native NSArray<? extends VNBarcodeObservation> results();

    /**
     * Obtain the collection of barcode symbologies that can be recognized by the request in its current configuration.
     * 
     * Calling this method could be a potentially expensive operation.
     * 
     * @return An array of VNBarcodeSymbology objects describing the symbologies recognized by the request in its
     *         current configuration.
     * 
     *         API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("supportedSymbologiesAndReturnError:")
    public native NSArray<String> supportedSymbologiesAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * An option to coalesce multiple codes if applicable based on the symbology
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("coalesceCompositeSymbologies")
    public native boolean coalesceCompositeSymbologies();

    /**
     * An option to coalesce multiple codes if applicable based on the symbology
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setCoalesceCompositeSymbologies:")
    public native void setCoalesceCompositeSymbologies(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
