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

/**
 * [@protocol] MPSNNGramMatrixCallback
 * 
 * MPSNNGramMatrixCallback Defines a callback protocol for @ref MPSNNGramMatrixCalculationNode to set the 'alpha'
 * scaling value dynamically just before encoding the underlying MPSNNGramMatrixCalculation kernel.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSNNGramMatrixCallback")
public interface MPSNNGramMatrixCallback extends NSSecureCoding, NSCopying {
    /**
     * Returns the desired alpha scaling value.
     * 
     * @param sourceImage      One of the source images in the batch given as a reference for the alpha computation.
     * @param destinationImage One of the destination images in the batch given as a reference for the alpha
     *                         computation.
     * @return The desired alpha value.
     */
    @Generated
    @Selector("alphaForSourceImage:destinationImage:")
    float alphaForSourceImageDestinationImage(MPSImage sourceImage, MPSImage destinationImage);
}
