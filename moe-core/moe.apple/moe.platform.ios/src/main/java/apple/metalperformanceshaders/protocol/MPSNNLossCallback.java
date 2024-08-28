package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metalperformanceshaders.MPSImage;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] MPSNNLossCallback
 * 
 * MPSNNLossCallback Defines a callback protocol for @ref MPSNNForwardLossNode and @ref MPSNNLossGradientNode
 * to set the scalar weight value just before encoding the underlying kernels.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSNNLossCallback")
public interface MPSNNLossCallback extends NSSecureCoding, NSCopying {
    /**
     * Returns the desired loss scaling weight value.
     * 
     * @param sourceImage      One of the source images in the batch given as a reference.
     * @param destinationImage One of the destination images in the batch given as a reference.
     * @return The desired scalar weight value.
     */
    @Generated
    @Selector("scalarWeightForSourceImage:destinationImage:")
    float scalarWeightForSourceImageDestinationImage(@NotNull MPSImage sourceImage, @NotNull MPSImage destinationImage);
}
