package apple.metalperformanceshaders.protocol;

import apple.metalperformanceshaders.MPSCNNConvolutionDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSCNNConvolutionDataSource")
public interface MPSCNNConvolutionDataSource {
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
}