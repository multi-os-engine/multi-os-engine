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

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSNNGramMatrixCallback")
public interface MPSNNGramMatrixCallback extends NSSecureCoding, NSCopying {
    @Generated
    @Selector("alphaForSourceImage:destinationImage:")
    float alphaForSourceImageDestinationImage(MPSImage sourceImage, MPSImage destinationImage);
}