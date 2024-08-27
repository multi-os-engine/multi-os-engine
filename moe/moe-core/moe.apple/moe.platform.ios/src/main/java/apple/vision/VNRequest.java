package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.coreml.protocol.MLComputeDeviceProtocol;
import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.Ptr;

/**
 * VNRequest
 * 
 * VNRequest objects describe the operation to be performed as well as act as the recipient of the operation's resultant
 * observations.
 * 
 * VNRequest objects are instantiated in a pre-configured nominal state. Prior to sending a VNRequest to a request
 * handler to perform a desired operation, the default configuration can be changed by modifying the values of VNRequest
 * properties. The VNRequest class itself acts as a base class and is not meant to be directly instantiated.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNRequest extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected VNRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNRequest allocWithZone(VoidPtr zone);

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
     * [@property] completionHandler
     * 
     * The completion handler block that will be invoked after the request has completed processing.
     */
    @Nullable
    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    public native Block_completionHandler_ret completionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(@NotNull VNRequest request, @Nullable NSError error);
    }

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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

    /**
     * Creates a new VNRequest with no completion handler.
     */
    @Generated
    @Selector("init")
    public native VNRequest init();

    /**
     * Creates a new VNRequest with an optional completion handler.
     * 
     * @param completionHandler The block to be invoked after the request has completed its processing. The completion
     *                          handler gets executed on the same dispatch queue as the request being executed.
     */
    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNRequest initWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_initWithCompletionHandler") Block_initWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithCompletionHandler {
        @Generated
        void call_initWithCompletionHandler(@NotNull VNRequest request, @Nullable NSError error);
    }

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
    public static native VNRequest new_objc();

    /**
     * A hint used to minimize the resource burden of the request. Memory footprint, processing footprint and/or CPU/GPU
     * contention will be reduced (depending on the request), at the potential cost of longer execution time. This can
     * help, for example, with ensuring UI updates and rendering are not getting blocked by Vision processing.
     */
    @Generated
    @Selector("preferBackgroundProcessing")
    public native boolean preferBackgroundProcessing();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] results
     * 
     * The collection of VNObservations generated by the processing of the request.
     * 
     * The only valid time to access this property is after the request has been processed by a request handler. If the
     * request failed, this property will be nil; otherwise, it will be an array of zero or more VNObservation
     * subclasses specific to the VNRequest subclass.
     */
    @Nullable
    @Generated
    @Selector("results")
    public native NSArray<? extends VNObservation> results();

    /**
     * A hint used to minimize the resource burden of the request. Memory footprint, processing footprint and/or CPU/GPU
     * contention will be reduced (depending on the request), at the potential cost of longer execution time. This can
     * help, for example, with ensuring UI updates and rendering are not getting blocked by Vision processing.
     */
    @Generated
    @Selector("setPreferBackgroundProcessing:")
    public native void setPreferBackgroundProcessing(boolean value);

    /**
     * This property, if set to YES, signifies that the request should be performed exclusively on the CPU and not on
     * the GPU. The default value is NO, which signifies that the request is free to leverage the GPU to accelerate any
     * work the request may require.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 17.0
     */
    @Deprecated
    @Generated
    @Selector("setUsesCPUOnly:")
    public native void setUsesCPUOnly(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * This property, if set to YES, signifies that the request should be performed exclusively on the CPU and not on
     * the GPU. The default value is NO, which signifies that the request is free to leverage the GPU to accelerate any
     * work the request may require.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 17.0
     */
    @Deprecated
    @Generated
    @Selector("usesCPUOnly")
    public native boolean usesCPUOnly();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Tries to abort the request as soon as possible. Results will be nil. The completionHandler (if present) will be
     * called with an error of VNErrorRequestCancelled.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * Provides the current revision supported by the request.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    /**
     * Provides the revision of the request that was latest for the particular SDK that was linked with the client
     * application.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    /**
     * The specific algorithm or implementation revision that is to be used to perform the request.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("revision")
    @NUInt
    public native long revision();

    /**
     * The specific algorithm or implementation revision that is to be used to perform the request.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setRevision:")
    public native void setRevision(@NUInt long value);

    /**
     * Provides the collection of currently-supported algorithm or implementation versions for the class of request.
     * 
     * This method allows clients to introspect at runtime what capabilities are available for each class of VNRequest
     * in the Vision framework.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();

    /**
     * Determine what the currently configured compute device is for a specific compute stage.
     * 
     * @param computeStage The compute stage to be introspected.
     * 
     * @return The currently assigned compute device, or `nil` if there is no explicit assignment.
     */
    @Generated
    @Selector("computeDeviceForComputeStage:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MLComputeDeviceProtocol computeDeviceForComputeStage(@NotNull String computeStage);

    /**
     * Assign a specific compute device for a compute stage.
     * 
     * It is important to note that any compute device can be configured for a given compute stage. Only when the
     * request is performed is the validity of the (compute device / compute stage) assignments checked. Valid compute
     * devices for a request's compute stages can be obtained via `-supportedComputeStageDevicesAndReturnError:`.
     * 
     * @param computeDevice The compute device to assign to the compute stage. Passing nil for this parameter will
     *                      remove any explicit compute device assignment, allowing Vision to select which device to
     *                      use.
     * @param computeStage  The compute stage being configured.
     */
    @Generated
    @Selector("setComputeDevice:forComputeStage:")
    public native void setComputeDeviceForComputeStage(
            @Mapped(ObjCObjectMapper.class) @Nullable MLComputeDeviceProtocol computeDevice,
            @NotNull String computeStage);

    /**
     * Obtain the collection of compute device per stage that are supported by the request.
     * 
     * This method's result is based on the current state of configuration of the target request at the time of the
     * call.
     * 
     * @param error The address of a variable that will be populated with the error that describes the failure. If the
     *              caller does not require this information, NULL can be passed.
     * 
     * @return A dictionary of per-stage supported compute devices, or `nil` if an error occurs.
     */
    @Generated
    @Selector("supportedComputeStageDevicesAndReturnError:")
    @Nullable
    public native NSDictionary<String, ? extends NSArray<?>> supportedComputeStageDevicesAndReturnError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
