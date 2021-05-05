package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metalperformanceshaders.MPSImage;
import apple.metalperformanceshaders.MPSImageDescriptor;
import apple.metalperformanceshaders.MPSKernel;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A class  that allocates new MPSImage or MPSTemporaryImage
 * 
 * Sometimes it is prohibitively costly for MPS to figure out how
 *                 big an image should be in advance. In addition, you may want to
 *                 have some say over whether the image is a temporary image or not.
 *                 In such circumstances, the MPSImageAllocator is used to
 *                 provide the developer with an opportunity for just in time feedback
 *                 about how the image should be allocated.
 * 
 *                 Two standard MPSImageAllocators are provided: MPSImageDefaultAllocator
 *                 and MPSTemporaryImageDefaultAllocator. You may of course provide
 *                 your own allocator instead.
 * 
 *                 Example:
 *                 [@code]
 *                     // Note: MPSImageDefaultAllocator is already provided
 *                     //       by the framework under that name.  It is provided here
 *                     //       as sample code for writing your own variant.
 *                     -(MPSImage * __nonnull)  imageForCommandBuffer: (__nonnull id <MTLCommandBuffer>) cmdBuf
 *                                                    imageDescriptor: (MPSImageDescriptor * __nonnull) descriptor
 *                                                             kernel: (MPSKernel * __nonnull) kernel
 *                     {
 *                         MPSImage * result = [[MPSImage alloc] initWithDevice: cmdBuf.device
 *                                                              imageDescriptor: descriptor ];
 * 
 *                         // make sure the object sticks around at least as lomg as the command buffer
 *                         [result retain];
 *                         [cmdBuf addCompletedHandler: ^(id <MTLCommandBuffer> c){[result release];}];
 * 
 *                         // return autoreleased result
 *                         return [result autorelease];
 *                     };
 * 
 *                     -(BOOL) supportsSecureCoding{ return YES; }
 *                     -(void)encodeWithCoder:(NSCoder * __nonnull)aCoder
 *                     {
 *                         [super encodeWithCoder: aCoder];
 * 
 *                         // encode any data owned by the class at this level
 *                     }
 * 
 *                     -(nullable instancetype) initWithCoder: (NSCoder*__nonnull) aDecoder
 *                     {
 *                         self =  [super initWithCoder: aDecoder ];
 *                         if( nil == self )
 *                             return self;
 * 
 *                         // use coder to load any extra data kept by this object here
 * 
 *                         return self;
 *                     }
 *                 [@endcode]
 * 
 *             Please see [MPSImage defaultAllocator] and [MPSTemporaryImage defaultAllocator]
 *             for implentations of the protocol already provided by MPS.
 * 
 *             When considering whether to write your own MPSImageAllocator, you should know
 *             the existing MPSImage and MPSTemporaryImage default allocators are optimized
 *             to make image batch allocation much faster than one MPSImage at a time in a loop.
 *             When possible, it can be better to use the MPS provided allocators and override
 *             the behavior in a padding policy instead, if the changes can be contained in
 *             the MPSImageDescriptor. This will help reduce CPU encode time. However, custom
 *             padding policies can inhibit optimizations in the MPSNNGraph, particularly node
 *             fusion, resulting in more work for the GPU. In cases where the custom padding method
 *             does not change filter properties but only adjusts the result image (e.g. adjust result
 *             feature channel format) then MPSNNPaddingMethodCustomWhitelistForNodeFusion may be
 *             used to signal that node fusion is acceptable.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSImageAllocator")
public interface MPSImageAllocator extends NSSecureCoding {
    /**
     * Create a new MPSImage
     * 
     * See class description for sample implementation
     * 
     * @param          cmdBuf      The MTLCommandBuffer on which the image will be initialized.
     *                             cmdBuf.device encodes the MTLDevice.
     * @param          descriptor  A MPSImageDescriptor containing the image format to use.
     *                             This format is the result of your MPSPadding policy.
     * @param          kernel      The kernel that will overwrite the image returned by the filter.
     *                             Note that the MPS implementations of this protocol don't need
     *                             this field. It is provided for your convenience.
     * 
     * @return         A valid MPSImage or MPSTemporaryImage. It will be automatically released when the command buffer completes.
     */
    @Generated
    @Selector("imageForCommandBuffer:imageDescriptor:kernel:")
    MPSImage imageForCommandBufferImageDescriptorKernel(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf,
            MPSImageDescriptor descriptor, MPSKernel kernel);
}