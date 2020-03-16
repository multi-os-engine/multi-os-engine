package apple.coreml.protocol;

import apple.coreml.MLModelDescription;
import apple.coreml.MLPredictionOptions;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
@ObjCProtocolName("MLCustomModel")
public interface MLCustomModel {
    @Generated
    @Selector("initWithModelDescription:parameterDictionary:error:")
    @MappedReturn(ObjCObjectMapper.class)
    Object initWithModelDescriptionParameterDictionaryError(MLModelDescription modelDescription,
            NSDictionary<String, ?> parameters, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("predictionFromFeatures:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    Object predictionFromFeaturesOptionsError(@Mapped(ObjCObjectMapper.class) Object input, MLPredictionOptions options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @IsOptional
    @Selector("predictionsFromBatch:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object predictionsFromBatchOptionsError(@Mapped(ObjCObjectMapper.class) Object inputBatch,
            MLPredictionOptions options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }
}