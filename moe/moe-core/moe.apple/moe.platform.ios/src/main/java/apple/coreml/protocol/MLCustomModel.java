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

/**
 * Protocol for specifying a custom model implementation.
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MLCustomModel")
public interface MLCustomModel {
    /**
     * Initialize the custom model implementation. The model description describes the input
     * and output feature types and metadata in the Model specificaiton.
     * The parameter dictionary contains the contents of the 'parameters' map from the CustomModel specification.
     * This function is called once on model load.
     * We expect the implementation to return 'nil' and set an error in the event of failure
     * initializing the object.
     */
    @Generated
    @Selector("initWithModelDescription:parameterDictionary:error:")
    @MappedReturn(ObjCObjectMapper.class)
    Object initWithModelDescriptionParameterDictionaryError(MLModelDescription modelDescription,
            NSDictionary<String, ?> parameters, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Required implemenationat of a single sample input prediction.
     */
    @Generated
    @Selector("predictionFromFeatures:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MLFeatureProvider predictionFromFeaturesOptionsError(@Mapped(ObjCObjectMapper.class) MLFeatureProvider input,
            MLPredictionOptions options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Batch prediction with explicit options, if not implemented the single input predictionFromFeatures:options:error will be used
     */
    @Generated
    @IsOptional
    @Selector("predictionsFromBatch:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    default MLBatchProvider predictionsFromBatchOptionsError(@Mapped(ObjCObjectMapper.class) MLBatchProvider inputBatch,
            MLPredictionOptions options, @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }
}