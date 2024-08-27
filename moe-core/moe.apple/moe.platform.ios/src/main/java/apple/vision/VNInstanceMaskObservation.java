package apple.vision;

import apple.NSObject;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An observation resulting from an instance mask generation request. It contains an instance mask that labels instances
 * in the mask that labels per pixel an instance.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNInstanceMaskObservation extends VNObservation {
    static {
        NatJ.register();
    }

    @Generated
    protected VNInstanceMaskObservation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * *The IndexSet that encompases all instances except the background
     */
    @Generated
    @Selector("allInstances")
    @NotNull
    public native NSIndexSet allInstances();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNInstanceMaskObservation alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VNInstanceMaskObservation allocWithZone(VoidPtr zone);

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

    /**
     * The low res mask from the selected instances in the resolution of the performed analysis which is not upscaled to
     * the image resolution.
     * 
     * @param instances An NSIndexSet of selected instances where 0 is the background. An empty set selects all
     *                  instances but the background
     * @param error     The address of a variable that will be populated with the error that describes the failure. If
     *                  the caller does not require this information, NULL can be passed.
     *                  The pixel format of kCVPixelFormatType_OneComponent32Float
     */
    @Generated
    @Selector("generateMaskForInstances:error:")
    @Nullable
    public native CVBufferRef generateMaskForInstancesError(@NotNull NSIndexSet instances,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * *@brief High res image with everything but the selected instances removed to transparent black.
     * 
     * @param instances                An NSIndexSet of selected instances where 0 is the background.
     * @param croppedToInstancesExtent Crops the image to the smallest rectangle containg all instances with remaining
     *                                 alpha elements.
     *                                 Setting this value to NO does not perform any cropping.
     * @param error                    The address of a variable that will be populated with the error that describes
     *                                 the failure. If the caller does not require this information, NULL can be passed.
     */
    @Generated
    @Selector("generateMaskedImageOfInstances:fromRequestHandler:croppedToInstancesExtent:error:")
    @Nullable
    public native CVBufferRef generateMaskedImageOfInstancesFromRequestHandlerCroppedToInstancesExtentError(
            @NotNull NSIndexSet instances, @NotNull VNImageRequestHandler requestHandler, boolean cropResult,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * *@brief High res mask with the selected instances preserved while everything else is removed to transparent
     * black.
     * 
     * @param forInstances An NSIndexSet of selected instances where 0 is the background.
     * @param error        The address of a variable that will be populated with the error that describes the failure.
     *                     If the caller does not require this information, NULL can be passed.
     */
    @Generated
    @Selector("generateScaledMaskForImageForInstances:fromRequestHandler:error:")
    @Nullable
    public native CVBufferRef generateScaledMaskForImageForInstancesFromRequestHandlerError(
            @NotNull NSIndexSet instances, @NotNull VNImageRequestHandler requestHandler,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native VNInstanceMaskObservation init();

    @Generated
    @Selector("initWithCoder:")
    public native VNInstanceMaskObservation initWithCoder(@NotNull NSCoder coder);

    /**
     * *@brief The resulting mask represents all instances in a mask image where 0 represents the background and all
     * other values represent the indices of the instances identified.
     * Note that a pixel can only correspond to one instance and not multiple instances.
     */
    @Generated
    @Selector("instanceMask")
    @NotNull
    public native CVBufferRef instanceMask();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native VNInstanceMaskObservation new_objc();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}