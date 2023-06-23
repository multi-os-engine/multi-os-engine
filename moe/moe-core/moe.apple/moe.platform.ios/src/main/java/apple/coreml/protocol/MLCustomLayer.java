package apple.coreml.protocol;

import apple.coreml.MLMultiArray;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import apple.metal.protocol.MTLCommandBuffer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Protocol for specifying a custom layer implementation.
 * 
 * API-Since: 11.2
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MLCustomLayer")
public interface MLCustomLayer {
    /**
     * Optional selector for encoding a shader implementing the custom layer to a command buffer.
     * The execution of the buffer will occur inside Core ML. Providing this function does not guarantee
     * GPU evaluation for each prediction. If not provided, the execution of this layer will always be
     * on the CPU. Should return 'YES' on sucessfully encoding, or 'NO' and set an error if the encoding
     * fails.
     */
    @Generated
    @IsOptional
    @Selector("encodeToCommandBuffer:inputs:outputs:error:")
    default boolean encodeToCommandBufferInputsOutputsError(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NotNull NSArray<?> inputs,
            @NotNull NSArray<?> outputs, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * For the given inputs, populate the provide output memory. This will be called for each evaluation performed
     * on the CPU. The inputs and outputs will have the shapes of the most recent call to outputShapesForInputShapes.
     * The memory for both input and output arrays are preallocated, and should not be copied or moved. The
     * implementation should not alter the inputs. Should return 'YES' on sucess, or 'NO' and set the error on
     * failure.
     */
    @Generated
    @Selector("evaluateOnCPUWithInputs:outputs:error:")
    boolean evaluateOnCPUWithInputsOutputsError(@NotNull NSArray<? extends MLMultiArray> inputs,
            @NotNull NSArray<? extends MLMultiArray> outputs,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Initialize the custom layer implementation. The dictionary contains the contents of the
     * 'parameters' map from the model specification. This function is called once on model load.
     * We expect the implementation to return 'nil' and set an error in the event of failure
     * initializing the object.
     */
    @Nullable
    @Generated
    @Selector("initWithParameterDictionary:error:")
    MLCustomLayer initWithParameterDictionaryError(@NotNull NSDictionary<String, ?> parameters,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * For the given input shapes, the implementation needs to return the output shape produced by this layer.
     * This will be called at least once at load time, and will be called any time the size of the inputs changes
     * in a call to predict. Consumes and returns 5D arrays of shapes in the usual Core ML convention - (Sequence,
     * Batch, Channel Height, Width). See the Core ML neural network protobuf specification for more details
     * about how layers use these dimensions. This will get called at load and run time. In the event of an error
     * the implementation should return 'nil' and set an error.
     */
    @Nullable
    @Generated
    @Selector("outputShapesForInputShapes:error:")
    NSArray<? extends NSArray<? extends NSNumber>> outputShapesForInputShapesError(
            @NotNull NSArray<? extends NSArray<? extends NSNumber>> inputShapes,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The data encoded in the 'weights' field of the model specification will be loaded and made
     * available to the implementation here, with one entry of the array for each entry in the 'repeated'
     * weights field in the Core ML neural network specification . This is called when the model is loaded,
     * but is a separate call from the initialization. The pointer to weights should be stored, but modifying
     * or copying its contents can significantly increase an app's memory footprint. The implementation
     * should return 'YES' on success, or return 'NO' and set an error in the event of a failure.
     */
    @Generated
    @Selector("setWeightData:error:")
    boolean setWeightDataError(@NotNull NSArray<? extends NSData> weights,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
