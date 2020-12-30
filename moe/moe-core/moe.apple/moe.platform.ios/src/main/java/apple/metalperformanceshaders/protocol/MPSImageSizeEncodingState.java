package apple.metalperformanceshaders.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @abstract   MPSStates conforming to this protocol contain information about a image size elsewhere in the graph
 * @discussion In some graphs a sequence of operations are done, then they are undone ins a series of 'reverse'
 *             operations. Examples might be pooling vs pooling gradient / upsampling,  or convolution vs. convolution transpose.
 *             In such cases, the 'reverse' pass generally is converting from a smaller image to a larger image,
 *             and there is insufficient information to do this correctly. Several answers exist and we don't know
 *             which is correct.
 * 
 *             As an example, consider trying to 'undo' integer division with a multiplication. The expression c = a/b
 *             is incomplete because there is also a remainder, which may constitute information lost. If we want to
 *             reconstitute a based on c and b, we need to use a = c * b + remainder, not just a = c*b.  Similarly, when
 *             undoing a downsizing operation, we need the original size to find which answer in the range of
 *             a = c*b + [0,b-1] is the right one.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSImageSizeEncodingState")
public interface MPSImageSizeEncodingState {
    /**
     * @abstract   The height of the source image passed to MPSCNNConvolution encode call.
     */
    @Generated
    @Selector("sourceHeight")
    @NUInt
    long sourceHeight();

    /**
     * @abstract   The width of the source image passed to MPSCNNConvolution encode call.
     */
    @Generated
    @Selector("sourceWidth")
    @NUInt
    long sourceWidth();
}