package apple.videotoolbox;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.videotoolbox.protocol.VTFrameProcessorConfiguration;
import apple.videotoolbox.protocol.VTFrameProcessorParameters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * Provides a unified interface you can use to apply video effects to frames.
 * 
 * The VTFrameProcessor gives access to a set of powerful video processing implementation suitable for different use
 * cases.
 * A configuration object (conforming to the ``VTFrameProcessorConfiguration`` protocol) passes initialization and
 * configuration parameters for the processor. A Parameter object (conforming to the ``VTFrameProcessorParameters``
 * protocol) provides the parameters for each individual processing operation. A Configuration object and a Parameter
 * object define each processor implementation. These Configuration and Parameters objects for each implementation are
 * defined in a processor-specific header file.
 * 
 * Use an instance of this class to apply configured video effects either directly to pixel buffers or as a
 * part of Metal pipeline. The video effect must be specified as a ``VTFrameProcessorConfiguration`` instance at session
 * startup. Once a session is started, you need to call one of the process methods for each input frame. After all input
 * frames have been provided, session must be ended for the system to finish all pending processing.
 * 
 * After you call the process function, you must not modify input and output buffers (including attachments) before the
 * function returns or the system receives the callback, in the case of asynchronous processing.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("VideoToolbox")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VTFrameProcessor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected VTFrameProcessor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VTFrameProcessor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native VTFrameProcessor allocWithZone(VoidPtr zone);

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
     * Performs all necessary tasks to end the session.
     * 
     * After this call completes, you can process no new frames unless you call ``startSessionWithConfiguration`` again.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("endSession")
    public native void endSession();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Create a new instance of the frame processor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("init")
    public native VTFrameProcessor init();

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
    public static native VTFrameProcessor new_objc();

    /**
     * Performs effects in a Metal command buffer.
     * 
     * This function allows you to add the effect to an existing Metal command buffer. The clients that have an existing
     * Metal pipeline and want to add this effect to it can use this function.
     * 
     * > Note: this function waits until all previously inserted tasks in the command buffer finish before running.
     * Tasks
     * inserted after the `processWithCommandBuffer` returns are run by the system after the effect is applied.
     * Processing
     * does not happen until the commandBuffer is executed.
     * 
     * - Parameters:
     * - commandBuffer: An existing Metal command buffer where the frame processing is inserted.
     * - parameters: A `VTFrameProcessorParameters` based object to specify additional frame based parameters to use
     * during processing. It needs to match the configuration type used during start session.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("processWithCommandBuffer:parameters:")
    public native void processWithCommandBufferParameters(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) @NotNull VTFrameProcessorParameters parameters);

    /**
     * Asynchronously performs the processor effects.
     * 
     * - Parameters:
     * - parameters: A `VTFrameProcessorParameters` based object to specify additional frame based parameters to use
     * during processing. It needs to match the configuration type used during start session.
     * - completionHandler: This completion handler is called when frame processing is completed. The completion handler
     * receives the same parameters object that you provided to the original call, as well as an `NSError` which
     * contains
     * an error code if processing was not successful.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("processWithParameters:completionHandler:")
    public native void processWithParametersCompletionHandler(
            @Mapped(ObjCObjectMapper.class) @NotNull VTFrameProcessorParameters parameters,
            @ObjCBlock(name = "call_processWithParametersCompletionHandler") @NotNull Block_processWithParametersCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_processWithParametersCompletionHandler {
        @Generated
        void call_processWithParametersCompletionHandler(
                @Mapped(ObjCObjectMapper.class) @NotNull VTFrameProcessorParameters arg0, @Nullable NSError arg1);
    }

    /**
     * Synchronously performs the processor effects.
     * 
     * Use the respective ``VTFrameProcessorParameters`` to pass frame level settings and frame level input/output
     * parameters
     * for the effect that you configured this session for by calling ``startSessionWithConfiguration:error``.
     * 
     * - Parameters:
     * - parameters: A `VTFrameProcessorParameters` based object to specify additional frame based parameters to use
     * during processing. It needs to match the configuration type used during start session.
     * - error: Contains error information if any. You may specify NULL for this parameter if you do not want the error
     * information.
     */
    @Generated
    @Selector("processWithParameters:error:")
    public native boolean processWithParametersError(
            @Mapped(ObjCObjectMapper.class) @NotNull VTFrameProcessorParameters parameters,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Asynchronously performs the processor effects and outputs each frame separately.
     * 
     * Use with frame processor configurations which allow multiple output frames from a single processing call, such
     * as frame rate conversion processor cases when you need access to output frames as they become available, rather
     * than
     * waiting for all output frames to be complete.
     * 
     * This interface is suitable for low-latency scenarios when a call would generate multiple output frames, but
     * waiting
     * for all frames to be generated before beginning to use the frames is not ideal. Because the processor may use the
     * output frames as references for frames still being generated, the output frames are strictly read-only. If you
     * want
     * to modify the frames, you must create a copy first.
     * 
     * - Parameters:
     * - parameters: A `VTFrameProcessorParameters` based object to specify additional frame based parameters to use
     * during processing. It needs to match the configuration type used during start session.
     * - frameOutputHandler: This frame output handler is called once for each destination frame in the provided
     * parameters
     * if no errors are encountered. The output handler receives the same parameters object that you provided to the
     * original call, a flag indicating if this is the final output to be called for this processing request, and the
     * presentation timestamp associated with the `VTFrameProcessorFrame` that it is being called for. The `NSError`
     * parameter contains an error code if processing was not successful.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("processWithParameters:frameOutputHandler:")
    public native void processWithParametersFrameOutputHandler(
            @Mapped(ObjCObjectMapper.class) @NotNull VTFrameProcessorParameters parameters,
            @ObjCBlock(name = "call_processWithParametersFrameOutputHandler") @NotNull Block_processWithParametersFrameOutputHandler frameOutputHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_processWithParametersFrameOutputHandler {
        @Generated
        void call_processWithParametersFrameOutputHandler(
                @Mapped(ObjCObjectMapper.class) @NotNull VTFrameProcessorParameters arg0, @ByValue CMTime arg1,
                boolean arg2, @Nullable NSError arg3);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Starts a new session and configures the processor pipeline for an effect.
     * 
     * - Parameters:
     * - configuration: The system uses this parameter to create an effect pipeline for processing frames. This object
     * must conform to the ``VTFrameProcessorConfiguration`` interface.
     * - error: Contains error information if any. You may specify NULL for this parameter if you do not want the error
     * information.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("startSessionWithConfiguration:error:")
    public native boolean startSessionWithConfigurationError(
            @Mapped(ObjCObjectMapper.class) @NotNull VTFrameProcessorConfiguration configuration,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}