package apple.metalperformanceshaders.protocol;

import apple.foundation.NSArray;
import apple.foundation.protocol.NSSecureCoding;
import apple.metalperformanceshaders.MPSImage;
import apple.metalperformanceshaders.MPSImageDescriptor;
import apple.metalperformanceshaders.MPSKernel;
import apple.metalperformanceshaders.MPSState;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSNNPadding")
public interface MPSNNPadding extends NSSecureCoding {
    @Generated
    @IsOptional
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:forKernel:suggestedDescriptor:")
    default MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStatesForKernelSuggestedDescriptor(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates, MPSKernel kernel,
            MPSImageDescriptor inDescriptor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("label")
    default String label() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("paddingMethod")
    @NUInt
    long paddingMethod();
}