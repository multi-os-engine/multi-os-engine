package apple.coreml.protocol;

import apple.coreml.MLMultiArray;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MLCustomLayer")
public interface MLCustomLayer {
    @Generated
    @IsOptional
    @Selector("encodeToCommandBuffer:inputs:outputs:error:")
    default boolean encodeToCommandBufferInputsOutputsError(@Mapped(ObjCObjectMapper.class) Object commandBuffer,
            NSArray<?> inputs, NSArray<?> outputs, @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("evaluateOnCPUWithInputs:outputs:error:")
    boolean evaluateOnCPUWithInputsOutputsError(NSArray<? extends MLMultiArray> inputs,
            NSArray<? extends MLMultiArray> outputs, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithParameterDictionary:error:")
    @MappedReturn(ObjCObjectMapper.class)
    Object initWithParameterDictionaryError(NSDictionary<String, ?> parameters,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("outputShapesForInputShapes:error:")
    NSArray<? extends NSArray<? extends NSNumber>> outputShapesForInputShapesError(
            NSArray<? extends NSArray<? extends NSNumber>> inputShapes,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("setWeightData:error:")
    boolean setWeightDataError(NSArray<? extends NSData> weights,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}