package apple.metalperformanceshaders.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSNNTrainableNode")
public interface MPSNNTrainableNode {
    /**
     * Configure whether and when neural network training parameters are updated
     * <p>
     * Default: MPSNNTrainingStyleUpdateDeviceGPU
     */
    @Generated
    @Selector("setTrainingStyle:")
    void setTrainingStyle(@NUInt long value);

    /**
     * Configure whether and when neural network training parameters are updated
     * <p>
     * Default: MPSNNTrainingStyleUpdateDeviceGPU
     */
    @Generated
    @Selector("trainingStyle")
    @NUInt
    long trainingStyle();
}
