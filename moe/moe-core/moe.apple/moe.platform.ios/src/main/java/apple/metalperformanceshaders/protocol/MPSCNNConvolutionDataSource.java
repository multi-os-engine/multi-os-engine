package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSCopying;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.MPSCNNConvolutionDescriptor;
import apple.metalperformanceshaders.MPSCNNConvolutionGradientState;
import apple.metalperformanceshaders.MPSCNNConvolutionWeightsAndBiasesState;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSCNNConvolutionDataSource")
public interface MPSCNNConvolutionDataSource extends NSCopying {
    @Generated
    @Selector("biasTerms")
    FloatPtr biasTerms();

    @Generated
    @Selector("dataType")
    int dataType();

    @Generated
    @Selector("descriptor")
    MPSCNNConvolutionDescriptor descriptor();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("load")
    boolean load_objc();

    @Generated
    @IsOptional
    @Selector("lookupTableForUInt8Kernel")
    default FloatPtr lookupTableForUInt8Kernel() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("purge")
    void purge();

    @Generated
    @Selector("weights")
    VoidPtr weights();

    @Generated
    @Owned
    @IsOptional
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("updateWithCommandBuffer:gradientState:sourceState:")
    default MPSCNNConvolutionWeightsAndBiasesState updateWithCommandBufferGradientStateSourceState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionGradientState gradientState, MPSCNNConvolutionWeightsAndBiasesState sourceState) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("updateWithGradientState:sourceState:")
    default boolean updateWithGradientStateSourceState(MPSCNNConvolutionGradientState gradientState,
            MPSCNNConvolutionWeightsAndBiasesState sourceState) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("weightsLayout")
    default int weightsLayout() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("weightsQuantizationType")
    default int weightsQuantizationType() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("kernelWeightsDataType")
    default int kernelWeightsDataType() {
        throw new java.lang.UnsupportedOperationException();
    }
}