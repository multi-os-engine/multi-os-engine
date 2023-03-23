package apple.coreml.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Protocol for accessing a collection of feature providers
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CoreML")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MLBatchProvider")
public interface MLBatchProvider {
    /**
     * Total number of feature providers
     */
    @Generated
    @Selector("count")
    @NInt
    long count();

    /**
     * Indexed access to collection
     */
    @Generated
    @Selector("featuresAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    MLFeatureProvider featuresAtIndex(@NInt long index);
}