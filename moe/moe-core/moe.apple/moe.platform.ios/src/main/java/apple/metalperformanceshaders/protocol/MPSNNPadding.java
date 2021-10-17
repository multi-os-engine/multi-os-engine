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

/**
 * [@protocol]   MPSNNPadding
 * <p>
 * A method to describe how MPSCNNKernels should pad images when data outside the image is needed
 * <p>
 * Different (non-Apple) CNN frameworks have different policies for how to size the result
 * of a CNN filter and what padding to add around the edges.  Some filters such
 * as pooling and convolution read from neighboring feature channel (pixel) values.
 * Four predefined MPSPaddingMethods are available: MPSNNPaddingMethodValidOnly,
 * MPSNNPaddingMethodFull, MPSNNPaddingMethodSameTL, MPSNNPaddingMethodSameBR. You
 * may also implement your own padding definition with a block that conforms
 * to this prototype.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSNNPadding")
public interface MPSNNPadding extends NSSecureCoding {
    /**
     * Determine padding and sizing of result images
     * <p>
     * A MPSNNPaddingMethod must both return a valid MPSImageDescriptor
     * and set the MPSKernel.offset to the correct value.  This is a
     * required feature if the MPSNNPaddingMethodCustom bit is set in
     * the paddingMethod.
     * <p>
     * Some code that may prove helpful:
     * <p>
     * [@code]
     * const int centeringPolicy = 0;  // When kernelSize is even: 0 pad bottom right. 1 pad top left.    Centers the kernel for even sized kernels.
     * <p>
     * typedef enum Style{
     * StyleValidOnly = -1,
     * StyleSame = 0,
     * StyleFull = 1
     * }Style;
     * <p>
     * // Typical destination size in one dimension for forward filters (most filters)
     * static int DestSize( int sourceSize, int stride, int filterWindowSize, Style style ){
     * sourceSize += style * (filterWindowSize - 1);       // adjust how many pixels we are allowed to read
     * return (sourceSize + stride - 1) / stride;          // sourceSize / stride, round up
     * }
     * <p>
     * // Typical destination size in one dimension for reverse filters (e.g. convolution transpose)
     * static int DestSizeReverse( int sourceSize, int stride, int filterWindowSize, Style style ){
     * return (sourceSize-1) * stride +        // center tap for the last N-1 results. Take stride into account
     * 1 +                             // center tap for the first result
     * style * (filterWindowSize-1);   // add or subtract (or ignore) the filter extent
     * }
     * <p>
     * // Find the MPSOffset in one dimension
     * static int Offset( int sourceSize, int stride, int filterWindowSize, Style style ){
     * // The correction needed to adjust from position of left edge to center per MPSOffset definition
     * int correction = filterWindowSize / 2;
     * <p>
     * // exit if all we want is to start consuming pixels at the left edge of the image.
     * if( 0 )
     * return correction;
     * <p>
     * // Center the area consumed in the source image:
     * // Calculate the size of the destination image
     * int destSize = DestSize( sourceSize, stride, filterWindowSize, style ); // use DestSizeReverse here instead as appropriate
     * <p>
     * // calculate extent of pixels we need to read in source to populate the destination
     * int readSize = (destSize-1) * stride + filterWindowSize;
     * <p>
     * // calculate number of missing pixels in source
     * int extraSize = readSize - sourceSize;
     * <p>
     * // number of missing pixels on left side
     * int leftExtraPixels = (extraSize + centeringPolicy) / 2;
     * <p>
     * // account for the fact that the offset is based on the center pixel, not the left edge
     * return correction - leftExtraPixels;
     * }
     * [@endcode]
     *
     * @param sourceImages The list of source images to be used
     * @param sourceStates The list of source states to be used
     * @param kernel       The MPSKernel the padding method will be applied to. Set the kernel.offset
     * @param inDescriptor MPS will prepare a starting guess based on the padding policy (exclusive of
     *                     MPSNNPaddingMethodCustom) set for the object. You should adjust the offset
     *                     and image size accordingly. It is on an autoreleasepool.
     * @return The MPSImageDescriptor to use to make a MPSImage to capture the results from the filter.
     * The MPSImageDescriptor is assumed to be on an autoreleasepool. Your method must also set the
     * kernel.offset property.
     */
    @Generated
    @IsOptional
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:forKernel:suggestedDescriptor:")
    default MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStatesForKernelSuggestedDescriptor(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates, MPSKernel kernel,
            MPSImageDescriptor inDescriptor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * FIXME:  to be made @required
     */
    @Generated
    @IsOptional
    @Selector("label")
    default String label() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Get the preferred padding method for the node
     */
    @Generated
    @Selector("paddingMethod")
    @NUInt
    long paddingMethod();

    /**
     * Make a "inverted" padding policy suitable for a training gradient pass.
     */
    @Generated
    @IsOptional
    @Selector("inverse")
    default MPSNNPadding inverse() {
        throw new java.lang.UnsupportedOperationException();
    }
}
