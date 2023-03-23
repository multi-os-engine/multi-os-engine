package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.struct.MTLRegion;
import apple.metalperformanceshaders.protocol.MPSImageAllocator;
import apple.metalperformanceshaders.protocol.MPSNNPadding;
import apple.metalperformanceshaders.struct.MPSOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSCNNBinaryKernel
 * [@dependency] This depends on Metal.framework
 * 
 * Describes a convolution neural network kernel.
 * 
 * A MPSCNNKernel consumes two MPSImages, primary and secondary, and produces one MPSImage.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNBinaryKernel extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBinaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBinaryKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNBinaryKernel allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] clipRect
     * 
     * An optional clip rectangle to use when writing data. Only the pixels in the rectangle will be overwritten.
     * 
     * A MTLRegion that indicates which part of the destination to overwrite. If the clipRect does not lie
     * completely within the destination image, the intersection between clip rectangle and destination bounds is
     * used. Default: MPSRectNoClip (MPSKernel::MPSRectNoClip) indicating the entire image.
     * clipRect.origin.z is the index of starting destination image in batch processing mode. clipRect.size.depth
     * is the number of images to process in batch processing mode.
     * 
     * See Also: @ref subsubsection_clipRect
     */
    @Generated
    @Selector("clipRect")
    @ByValue
    public native MTLRegion clipRect();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] destinationFeatureChannelOffset
     * 
     * The number of channels in the destination MPSImage to skip before writing output.
     * 
     * This is the starting offset into the destination image in the feature channel dimension
     * at which destination data is written.
     * This allows an application to pass a subset of all the channels in MPSImage as output of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel outputs 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as output, we can set destinationFeatureChannelOffset = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel outputs N channels,
     * destination image MUST have at least destinationFeatureChannelOffset + N channels. Using a destination
     * image with insufficient number of feature channels result in an error.
     * E.g. if the MPSCNNConvolution outputs 32 channels, and destination has 64 channels, then it is an error to set
     * destinationFeatureChannelOffset > 32.
     */
    @Generated
    @Selector("destinationFeatureChannelOffset")
    @NUInt
    public native long destinationFeatureChannelOffset();

    /**
     * Method to allocate the result image for -encodeToCommandBuffer:sourceImage:
     * 
     * Default: MPSTemporaryImage.defaultAllocator
     */
    @Generated
    @Selector("destinationImageAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSImageAllocator destinationImageAllocator();

    /**
     * Encode a MPSCNNKernel into a command Buffer. Create a texture to hold the result and return it.
     * 
     * In the first iteration on this method, encodeToCommandBuffer:sourceImage:destinationImage:
     * some work was left for the developer to do in the form of correctly setting the offset property
     * and sizing the result buffer. With the introduction of the padding policy (see padding property)
     * the filter can do this work itself. If you would like to have some input into what sort of MPSImage
     * (e.g. temporary vs. regular) or what size it is or where it is allocated, you may set the
     * destinationImageAllocator to allocate the image yourself.
     * 
     * This method uses the MPSNNPadding padding property to figure out how to size
     * the result image and to set the offset property. See discussion in MPSNeuralNetworkTypes.h.
     * 
     * @param commandBuffer  The command buffer
     * @param primaryImage   A MPSImages to use as the primary source images for the filter.
     * @param secondaryImage A MPSImages to use as the secondary source images for the filter.
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the
     *         graph.
     *         The returned image will be automatically released when the command buffer completes. If you want to
     *         keep it around for longer, retain the image. (ARC will do this for you if you use it later.)
     */
    @Generated
    @Selector("encodeToCommandBuffer:primaryImage:secondaryImage:")
    public native MPSImage encodeToCommandBufferPrimaryImageSecondaryImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage primaryImage,
            MPSImage secondaryImage);

    /**
     * Encode a MPSCNNKernel into a command Buffer. The operation shall proceed out-of-place.
     * 
     * This is the older style of encode which reads the offset, doesn't change it,
     * and ignores the padding method.
     * 
     * @param commandBuffer    A valid MTLCommandBuffer to receive the encoded filter
     * @param primaryImage     A valid MPSImage object containing the primary source image.
     * @param secondaryImage   A valid MPSImage object containing the secondary source image.
     * @param destinationImage A valid MPSImage to be overwritten by result image. destinationImage may not alias
     *                         primarySourceImage or secondarySourceImage.
     */
    @Generated
    @Selector("encodeToCommandBuffer:primaryImage:secondaryImage:destinationImage:")
    public native void encodeToCommandBufferPrimaryImageSecondaryImageDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage primaryImage,
            MPSImage secondaryImage, MPSImage destinationImage);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNBinaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNBinaryKernel initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNBinaryKernel initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Standard init with default properties per filter type
     * 
     * @param device The device that the filter will be used on. May not be NULL.
     * @return A pointer to the newly initialized object. This will fail, returning
     *         nil if the device is not supported. Devices must be
     *         MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNBinaryKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * [@property] isBackwards
     * 
     * YES if the filter operates backwards.
     * 
     * This influences how strideInPixelsX/Y should be interpreted.
     */
    @Generated
    @Selector("isBackwards")
    public native boolean isBackwards();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNBinaryKernel new_objc();

    /**
     * [@property] padding
     * 
     * The padding method used by the filter
     * 
     * This influences how strideInPixelsX/Y should be interpreted.
     * Default: MPSNNPaddingMethodAlignCentered | MPSNNPaddingMethodAddRemainderToTopLeft | MPSNNPaddingMethodSizeSame
     * Some object types (e.g. MPSCNNFullyConnected) may override this default with something appropriate to its
     * operation.
     */
    @Generated
    @Selector("padding")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNNPadding padding();

    /**
     * [@property] primaryEdgeMode
     * 
     * The MPSImageEdgeMode to use when texture reads stray off the edge of the primary source image
     * 
     * Most MPSKernel objects can read off the edge of the source image. This can happen
     * because of a negative offset property, because the offset + clipRect.size is larger
     * than the source image or because the filter looks at neighboring pixels, such as a
     * Convolution filter. Default: MPSImageEdgeModeZero.
     * 
     * See Also: @ref subsubsection_edgemode
     */
    @Generated
    @Selector("primaryEdgeMode")
    @NUInt
    public native long primaryEdgeMode();

    /**
     * [@property] primaryOffset
     * 
     * The position of the destination clip rectangle origin relative to the primary source buffer.
     * 
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and primary source image align.
     * offset.z is the index of starting source image in batch processing mode.
     * 
     * See Also: @ref subsubsection_mpsoffset
     */
    @Generated
    @Selector("primaryOffset")
    @ByValue
    public native MPSOffset primaryOffset();

    /**
     * [@property] primaryStrideInPixelsX
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the horizontal dimension
     * for the primary source image
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("primaryStrideInPixelsX")
    @NUInt
    public native long primaryStrideInPixelsX();

    /**
     * [@property] primaryStrideInPixelsY
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the vertical dimension
     * for the primary source image
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("primaryStrideInPixelsY")
    @NUInt
    public native long primaryStrideInPixelsY();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] secondaryEdgeMode
     * 
     * The MPSImageEdgeMode to use when texture reads stray off the edge of the primary source image
     * 
     * Most MPSKernel objects can read off the edge of the source image. This can happen
     * because of a negative offset property, because the offset + clipRect.size is larger
     * than the source image or because the filter looks at neighboring pixels, such as a
     * Convolution filter. Default: MPSImageEdgeModeZero.
     * 
     * See Also: @ref subsubsection_edgemode
     */
    @Generated
    @Selector("secondaryEdgeMode")
    @NUInt
    public native long secondaryEdgeMode();

    /**
     * [@property] secondaryOffset
     * 
     * The position of the destination clip rectangle origin relative to the secondary source buffer.
     * 
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and secondary source image align.
     * offset.z is the index of starting source image in batch processing mode.
     * 
     * See Also: @ref subsubsection_mpsoffset
     */
    @Generated
    @Selector("secondaryOffset")
    @ByValue
    public native MPSOffset secondaryOffset();

    /**
     * [@property] secondaryStrideInPixelsX
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the horizontal dimension
     * for the secondary source image
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("secondaryStrideInPixelsX")
    @NUInt
    public native long secondaryStrideInPixelsX();

    /**
     * [@property] secondaryStrideInPixelsY
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the vertical dimension
     * for the secondary source image
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("secondaryStrideInPixelsY")
    @NUInt
    public native long secondaryStrideInPixelsY();

    /**
     * [@property] clipRect
     * 
     * An optional clip rectangle to use when writing data. Only the pixels in the rectangle will be overwritten.
     * 
     * A MTLRegion that indicates which part of the destination to overwrite. If the clipRect does not lie
     * completely within the destination image, the intersection between clip rectangle and destination bounds is
     * used. Default: MPSRectNoClip (MPSKernel::MPSRectNoClip) indicating the entire image.
     * clipRect.origin.z is the index of starting destination image in batch processing mode. clipRect.size.depth
     * is the number of images to process in batch processing mode.
     * 
     * See Also: @ref subsubsection_clipRect
     */
    @Generated
    @Selector("setClipRect:")
    public native void setClipRect(@ByValue MTLRegion value);

    /**
     * [@property] destinationFeatureChannelOffset
     * 
     * The number of channels in the destination MPSImage to skip before writing output.
     * 
     * This is the starting offset into the destination image in the feature channel dimension
     * at which destination data is written.
     * This allows an application to pass a subset of all the channels in MPSImage as output of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel outputs 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as output, we can set destinationFeatureChannelOffset = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel outputs N channels,
     * destination image MUST have at least destinationFeatureChannelOffset + N channels. Using a destination
     * image with insufficient number of feature channels result in an error.
     * E.g. if the MPSCNNConvolution outputs 32 channels, and destination has 64 channels, then it is an error to set
     * destinationFeatureChannelOffset > 32.
     */
    @Generated
    @Selector("setDestinationFeatureChannelOffset:")
    public native void setDestinationFeatureChannelOffset(@NUInt long value);

    /**
     * Method to allocate the result image for -encodeToCommandBuffer:sourceImage:
     * 
     * Default: MPSTemporaryImage.defaultAllocator
     */
    @Generated
    @Selector("setDestinationImageAllocator:")
    public native void setDestinationImageAllocator(@Mapped(ObjCObjectMapper.class) MPSImageAllocator value);

    /**
     * [@property] padding
     * 
     * The padding method used by the filter
     * 
     * This influences how strideInPixelsX/Y should be interpreted.
     * Default: MPSNNPaddingMethodAlignCentered | MPSNNPaddingMethodAddRemainderToTopLeft | MPSNNPaddingMethodSizeSame
     * Some object types (e.g. MPSCNNFullyConnected) may override this default with something appropriate to its
     * operation.
     */
    @Generated
    @Selector("setPadding:")
    public native void setPadding(@Mapped(ObjCObjectMapper.class) MPSNNPadding value);

    /**
     * [@property] primaryEdgeMode
     * 
     * The MPSImageEdgeMode to use when texture reads stray off the edge of the primary source image
     * 
     * Most MPSKernel objects can read off the edge of the source image. This can happen
     * because of a negative offset property, because the offset + clipRect.size is larger
     * than the source image or because the filter looks at neighboring pixels, such as a
     * Convolution filter. Default: MPSImageEdgeModeZero.
     * 
     * See Also: @ref subsubsection_edgemode
     */
    @Generated
    @Selector("setPrimaryEdgeMode:")
    public native void setPrimaryEdgeMode(@NUInt long value);

    /**
     * [@property] primaryOffset
     * 
     * The position of the destination clip rectangle origin relative to the primary source buffer.
     * 
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and primary source image align.
     * offset.z is the index of starting source image in batch processing mode.
     * 
     * See Also: @ref subsubsection_mpsoffset
     */
    @Generated
    @Selector("setPrimaryOffset:")
    public native void setPrimaryOffset(@ByValue MPSOffset value);

    /**
     * [@property] secondaryEdgeMode
     * 
     * The MPSImageEdgeMode to use when texture reads stray off the edge of the primary source image
     * 
     * Most MPSKernel objects can read off the edge of the source image. This can happen
     * because of a negative offset property, because the offset + clipRect.size is larger
     * than the source image or because the filter looks at neighboring pixels, such as a
     * Convolution filter. Default: MPSImageEdgeModeZero.
     * 
     * See Also: @ref subsubsection_edgemode
     */
    @Generated
    @Selector("setSecondaryEdgeMode:")
    public native void setSecondaryEdgeMode(@NUInt long value);

    /**
     * [@property] secondaryOffset
     * 
     * The position of the destination clip rectangle origin relative to the secondary source buffer.
     * 
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and secondary source image align.
     * offset.z is the index of starting source image in batch processing mode.
     * 
     * See Also: @ref subsubsection_mpsoffset
     */
    @Generated
    @Selector("setSecondaryOffset:")
    public native void setSecondaryOffset(@ByValue MPSOffset value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Returns YES if the filter must be run over the entire batch before its
     * results may be considered complete
     * 
     * The MPSNNGraph may split batches into sub-batches to save memory. However,
     * some filters, like batch statistics calculations, need to operate over
     * the entire batch to calculate a valid result, in this case, the mean and
     * variance per channel over the set of images.
     * 
     * In such cases, the accumulated result is commonly stored in a MPSState
     * containing a MTLBuffer. (MTLTextures may not be able to be read from
     * and written to in the same filter on some devices.) -isResultStateReusedAcrossBatch
     * is set to YES, so that the state is allocated once and passed in for each
     * sub-batch and the filter accumulates its results into it, one sub-batch
     * at a time. Note that sub-batches may frequently be as small as 1.
     * 
     * Default: NO
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("appendBatchBarrier")
    public native boolean appendBatchBarrier();

    /**
     * Get a suggested destination image descriptor for a source image
     * 
     * Your application is certainly free to pass in any destinationImage
     * it likes to encodeToCommandBuffer:sourceImage:destinationImage,
     * within reason. This is the basic design for iOS 10. This method
     * is therefore not required.
     * 
     * However, calculating the MPSImage size and MPSCNNBinaryKernel properties
     * for each filter can be tedious and complicated work, so this method
     * is made available to automate the process. The application may
     * modify the properties of the descriptor before a MPSImage is made from
     * it, so long as the choice is sensible for the kernel in question.
     * Please see individual kernel descriptions for restrictions.
     * 
     * The expected timeline for use is as follows:
     * 
     * 1) This method is called:
     * a) The default MPS padding calculation is applied. It
     * uses the MPSNNPaddingMethod of the .padding property to
     * provide a consistent addressing scheme over the graph.
     * It creates the MPSImageDescriptor and adjusts the .offset
     * property of the MPSNNKernel. When using a MPSNNGraph, the
     * padding is set using the MPSNNFilterNode as a proxy.
     * 
     * b) This method may be overridden by MPSCNNBinaryKernel subclass
     * to achieve any customization appropriate to the object type.
     * 
     * c) Source states are then applied in order. These may modify the
     * descriptor and may update other object properties. See:
     * -destinationImageDescriptorForSourceImages:sourceStates:
     * forKernel:suggestedDescriptor: This is the typical way
     * in which MPS may attempt to influence the operation of
     * its kernels.
     * 
     * d) If the .padding property has a custom padding policy method
     * of the same name, it is called. Similarly, it may also adjust
     * the descriptor and any MPSCNNBinaryKernel properties. This is the
     * typical way in which your application may attempt to influence
     * the operation of the MPS kernels.
     * 
     * 2) A result is returned from this method and the caller
     * may further adjust the descriptor and kernel properties
     * directly.
     * 
     * 3) The caller uses the descriptor to make a new MPSImage to
     * use as the destination image for the -encode call in step 5.
     * 
     * 4) The caller calls -resultStateForSourceImage:sourceStates:destinationImage:
     * to make any result states needed for the kernel. If there isn't
     * one, it will return nil. A variant is available to return a
     * temporary state instead.
     * 
     * 5) a -encode method is called to encode the kernel.
     * 
     * The entire process 1-5 is more simply achieved by just calling an -encode...
     * method that returns a MPSImage out the left hand sid of the method. Simpler
     * still, use the MPSNNGraph to coordinate the entire process from end to end.
     * Opportunities to influence the process are of course reduced, as (2) is no longer
     * possible with either method. Your application may opt to use the five step method
     * if it requires greater customization as described, or if it would like to estimate
     * storage in advance based on the sum of MPSImageDescriptors before processing
     * a graph. Storage estimation is done by using the MPSImageDescriptor to create
     * a MPSImage (without passing it a texture), and then call -resourceSize. As long
     * as the MPSImage is not used in an encode call and the .texture property is not
     * invoked, the underlying MTLTexture is not created.
     * 
     * No destination state or destination image is provided as an argument to this
     * function because it is expected they will be made / configured after this
     * is called. This method is expected to auto-configure important object properties
     * that may be needed in the ensuing destination image and state creation steps.
     * 
     * @param sourceImages A array of source images that will be passed into the -encode call
     *                     Since MPSCNNBinaryKernel is a binary kernel, it is an array of length 2.
     * @param sourceStates An optional array of source states that will be passed into the -encode call
     * @return an image descriptor allocated on the autorelease pool
     */
    @Generated
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:")
    public native MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStates(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates);

    /**
     * Encode a MPSCNNKernel into a command Buffer. Create a texture and state to hold the results and return them.
     * 
     * In the first iteration on this method, encodeToCommandBuffer:sourceImage:destinationState:destinationImage:
     * some work was left for the developer to do in the form of correctly setting the offset property
     * and sizing the result buffer. With the introduction of the padding policy (see padding property)
     * the filter can do this work itself. If you would like to have some input into what sort of MPSImage
     * (e.g. temporary vs. regular) or what size it is or where it is allocated, you may set the
     * destinationImageAllocator to allocate the image yourself.
     * 
     * This method uses the MPSNNPadding padding property to figure out how to size
     * the result image and to set the offset property. See discussion in MPSNeuralNetworkTypes.h.
     * All images in a batch must have MPSImage.numberOfImages = 1.
     * 
     * @param commandBuffer  The command buffer
     * @param primaryImage   A MPSImage to use as the source images for the filter.
     * @param secondaryImage A MPSImage to use as the source images for the filter.
     * @param outState       The address of location to write the pointer to the result state of the operation
     * @param isTemporary    YES if the outState should be a temporary object
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the
     *         graph.
     *         The offset property will be adjusted to reflect the offset used during the encode.
     *         The returned image will be automatically released when the command buffer completes. If you want to
     *         keep it around for longer, retain the image. (ARC will do this for you if you use it later.)
     * 
     *         API-Since: 11.3
     */
    @Generated
    @Selector("encodeToCommandBuffer:primaryImage:secondaryImage:destinationState:destinationStateIsTemporary:")
    public native MPSImage encodeToCommandBufferPrimaryImageSecondaryImageDestinationStateDestinationStateIsTemporary(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage primaryImage,
            MPSImage secondaryImage, @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outState, boolean isTemporary);

    /**
     * The size of extra MPS heap storage allocated while the kernel is encoding
     * 
     * This is best effort and just describes things that are likely to end up on the MPS heap. It does not
     * describe all allocation done by the -encode call. It is intended for use with high water calculations
     * for MTLHeap sizing. Allocations are typically for temporary storage needed for multipass algorithms.
     * This interface should not be used to detect multipass algorithms.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("encodingStorageSizeForPrimaryImage:secondaryImage:sourceStates:destinationImage:")
    @NUInt
    public native long encodingStorageSizeForPrimaryImageSecondaryImageSourceStatesDestinationImage(
            MPSImage primaryImage, MPSImage secondaryImage, NSArray<? extends MPSState> sourceStates,
            MPSImage destinationImage);

    /**
     * Returns YES if the same state is used for every operation in a batch
     * 
     * If NO, then each image in a MPSImageBatch will need a corresponding
     * (and different) state to go with it. Set to YES to avoid allocating
     * redundant state in the case when the same state is used all the time.
     * Default: NO
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("isResultStateReusedAcrossBatch")
    public native boolean isResultStateReusedAcrossBatch();

    /**
     * Returns true if the -encode call modifies the state object it accepts.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("isStateModified")
    public native boolean isStateModified();

    /**
     * [@property] dilationRateX
     * 
     * Stride in source coordinates from one kernel tap to the next in the X dimension.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("primaryDilationRateX")
    @NUInt
    public native long primaryDilationRateX();

    /**
     * [@property] dilationRate
     * 
     * Stride in source coordinates from one kernel tap to the next in the Y dimension.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("primaryDilationRateY")
    @NUInt
    public native long primaryDilationRateY();

    /**
     * [@property] primaryKernelHeight
     * 
     * The height of the MPSCNNBinaryKernel filter window
     * 
     * This is the vertical diameter of the region read by the filter for each
     * result pixel. If the MPSCNNKernel does not have a filter window, then
     * 1 will be returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("primaryKernelHeight")
    @NUInt
    public native long primaryKernelHeight();

    /**
     * [@property] primaryKernelWidth
     * 
     * The width of the MPSCNNBinaryKernel filter window
     * 
     * This is the horizontal diameter of the region read by the filter for each
     * result pixel. If the MPSCNNKernel does not have a filter window, then
     * 1 will be returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("primaryKernelWidth")
    @NUInt
    public native long primaryKernelWidth();

    /**
     * [@property] primarySourceFeatureChannelMaxCount
     * 
     * The maximum number of channels in the primary source MPSImage to use
     * 
     * Most filters can insert a slice operation into the filter for free.
     * Use this to limit the size of the feature channel slice taken from
     * the input image. If the value is too large, it is truncated to be
     * the remaining size in the image after the sourceFeatureChannelOffset
     * is taken into account. Default: ULONG_MAX
     */
    @Generated
    @Selector("primarySourceFeatureChannelMaxCount")
    @NUInt
    public native long primarySourceFeatureChannelMaxCount();

    /**
     * [@property] primarySourceFeatureChannelOffset
     * 
     * The number of channels in the primary source MPSImage to skip before reading the input.
     * 
     * This is the starting offset into the primary source image in the feature channel dimension
     * at which source data is read. Unit: feature channels
     * This allows an application to read a subset of all the channels in MPSImage as input of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel needs to read 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as input, we can set primarySourceFeatureChannelOffset = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel inputs N channels,
     * the source image MUST have at least primarySourceFeatureChannelOffset + N channels. Using a source
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution inputs 32 channels, and the source has 64 channels, then it is an error to set
     * primarySourceFeatureChannelOffset > 32.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("primarySourceFeatureChannelOffset")
    @NUInt
    public native long primarySourceFeatureChannelOffset();

    /**
     * Allocate a MPSState (subclass) to hold the results from a -encodeBatchToCommandBuffer... operation
     * 
     * A graph may need to allocate storage up front before executing. This may be
     * necessary to avoid using too much memory and to manage large batches. The function
     * should allocate a MPSState object (if any) that will be produced by an -encode call
     * with the indicated sourceImages and sourceStates inputs. Though the states
     * can be further adjusted in the ensuing -encode call, the states should
     * be initialized with all important data and all MTLResource storage allocated.
     * The data stored in the MTLResource need not be initialized, unless the ensuing
     * -encode call expects it to be.
     * 
     * The MTLDevice used by the result is derived from the source image.
     * The padding policy will be applied to the filter before this is called
     * to give it the chance to configure any properties like MPSCNNKernel.offset.
     * 
     * CAUTION: the result state should be made after the kernel properties are
     * configured for the -encode call that will write to the state, and
     * after -destinationImageDescriptorForSourceImages:sourceStates:
     * is called (if it is called). Otherwise, behavior is undefined.
     * Please see the description of
     * -[MPSCNNKernel resultStateForSourceImage:sourceStates:destinationImage:] for more.
     * 
     * Default: returns nil
     * 
     * @param primaryImage   The MPSImage consumed by the associated -encode call.
     * @param secondaryImage The MPSImage consumed by the associated -encode call.
     * @param sourceStates   The list of MPSStates consumed by the associated -encode call,
     *                       for a batch size of 1.
     * @return The list of states produced by the -encode call for batch size of 1.
     *         When the batch size is not 1, this function will be called repeatedly unless
     *         -isResultStateReusedAcrossBatch returns YES. If -isResultStateReusedAcrossBatch
     *         returns YES, then it will be called once per batch and the MPSStateBatch array will
     *         contain MPSStateBatch.length references to the same object.
     * 
     *         API-Since: 11.3
     */
    @Generated
    @Selector("resultStateForPrimaryImage:secondaryImage:sourceStates:destinationImage:")
    public native MPSState resultStateForPrimaryImageSecondaryImageSourceStatesDestinationImage(MPSImage primaryImage,
            MPSImage secondaryImage, NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    /**
     * [@property] dilationRateX
     * 
     * Stride in source coordinates from one kernel tap to the next in the X dimension.
     * 
     * As applied to the secondary source image.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("secondaryDilationRateX")
    @NUInt
    public native long secondaryDilationRateX();

    /**
     * [@property] dilationRate
     * 
     * Stride in source coordinates from one kernel tap to the next in the Y dimension.
     * 
     * As applied to the secondary source image.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("secondaryDilationRateY")
    @NUInt
    public native long secondaryDilationRateY();

    /**
     * [@property] kernelHeight
     * 
     * The height of the MPSCNNBinaryKernel filter window for the second image source
     * 
     * This is the vertical diameter of the region read by the filter for each
     * result pixel. If the MPSCNNBinaryKernel does not have a filter window, then
     * 1 will be returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("secondaryKernelHeight")
    @NUInt
    public native long secondaryKernelHeight();

    /**
     * [@property] kernelWidth
     * 
     * The width of the MPSCNNBinaryKernel filter window for the second image source
     * 
     * This is the horizontal diameter of the region read by the filter for each
     * result pixel. If the MPSCNNBinaryKernel does not have a filter window, then
     * 1 will be returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("secondaryKernelWidth")
    @NUInt
    public native long secondaryKernelWidth();

    /**
     * [@property] secondarySourceFeatureChannelMaxCount
     * 
     * The maximum number of channels in the secondary source MPSImage to use
     * 
     * Most filters can insert a slice operation into the filter for free.
     * Use this to limit the size of the feature channel slice taken from
     * the input image. If the value is too large, it is truncated to be
     * the remaining size in the image after the sourceFeatureChannelOffset
     * is taken into account. Default: ULONG_MAX
     */
    @Generated
    @Selector("secondarySourceFeatureChannelMaxCount")
    @NUInt
    public native long secondarySourceFeatureChannelMaxCount();

    /**
     * [@property] secondarySourceFeatureChannelOffset
     * 
     * The number of channels in the secondary source MPSImage to skip before reading the input.
     * 
     * This is the starting offset into the secondary source image in the feature channel dimension
     * at which source data is read. Unit: feature channels
     * This allows an application to read a subset of all the channels in MPSImage as input of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel needs to read 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as input, we can set secondarySourceFeatureChannelOffset =
     * 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel inputs N channels,
     * the source image MUST have at least primarySourceFeatureChannelOffset + N channels. Using a source
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution inputs 32 channels, and the source has 64 channels, then it is an error to set
     * primarySourceFeatureChannelOffset > 32.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("secondarySourceFeatureChannelOffset")
    @NUInt
    public native long secondarySourceFeatureChannelOffset();

    /**
     * [@property] primarySourceFeatureChannelMaxCount
     * 
     * The maximum number of channels in the primary source MPSImage to use
     * 
     * Most filters can insert a slice operation into the filter for free.
     * Use this to limit the size of the feature channel slice taken from
     * the input image. If the value is too large, it is truncated to be
     * the remaining size in the image after the sourceFeatureChannelOffset
     * is taken into account. Default: ULONG_MAX
     */
    @Generated
    @Selector("setPrimarySourceFeatureChannelMaxCount:")
    public native void setPrimarySourceFeatureChannelMaxCount(@NUInt long value);

    /**
     * [@property] primarySourceFeatureChannelOffset
     * 
     * The number of channels in the primary source MPSImage to skip before reading the input.
     * 
     * This is the starting offset into the primary source image in the feature channel dimension
     * at which source data is read. Unit: feature channels
     * This allows an application to read a subset of all the channels in MPSImage as input of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel needs to read 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as input, we can set primarySourceFeatureChannelOffset = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel inputs N channels,
     * the source image MUST have at least primarySourceFeatureChannelOffset + N channels. Using a source
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution inputs 32 channels, and the source has 64 channels, then it is an error to set
     * primarySourceFeatureChannelOffset > 32.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setPrimarySourceFeatureChannelOffset:")
    public native void setPrimarySourceFeatureChannelOffset(@NUInt long value);

    /**
     * [@property] primaryStrideInPixelsX
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the horizontal dimension
     * for the primary source image
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setPrimaryStrideInPixelsX:")
    public native void setPrimaryStrideInPixelsX(@NUInt long value);

    /**
     * [@property] primaryStrideInPixelsY
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the vertical dimension
     * for the primary source image
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setPrimaryStrideInPixelsY:")
    public native void setPrimaryStrideInPixelsY(@NUInt long value);

    /**
     * [@property] secondarySourceFeatureChannelMaxCount
     * 
     * The maximum number of channels in the secondary source MPSImage to use
     * 
     * Most filters can insert a slice operation into the filter for free.
     * Use this to limit the size of the feature channel slice taken from
     * the input image. If the value is too large, it is truncated to be
     * the remaining size in the image after the sourceFeatureChannelOffset
     * is taken into account. Default: ULONG_MAX
     */
    @Generated
    @Selector("setSecondarySourceFeatureChannelMaxCount:")
    public native void setSecondarySourceFeatureChannelMaxCount(@NUInt long value);

    /**
     * [@property] secondarySourceFeatureChannelOffset
     * 
     * The number of channels in the secondary source MPSImage to skip before reading the input.
     * 
     * This is the starting offset into the secondary source image in the feature channel dimension
     * at which source data is read. Unit: feature channels
     * This allows an application to read a subset of all the channels in MPSImage as input of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel needs to read 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as input, we can set secondarySourceFeatureChannelOffset =
     * 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel inputs N channels,
     * the source image MUST have at least primarySourceFeatureChannelOffset + N channels. Using a source
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution inputs 32 channels, and the source has 64 channels, then it is an error to set
     * primarySourceFeatureChannelOffset > 32.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setSecondarySourceFeatureChannelOffset:")
    public native void setSecondarySourceFeatureChannelOffset(@NUInt long value);

    /**
     * [@property] secondaryStrideInPixelsX
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the horizontal dimension
     * for the secondary source image
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setSecondaryStrideInPixelsX:")
    public native void setSecondaryStrideInPixelsX(@NUInt long value);

    /**
     * [@property] secondaryStrideInPixelsY
     * 
     * The downsampling (or upsampling if a backwards filter) factor in the vertical dimension
     * for the secondary source image
     * 
     * If the filter does not do up or downsampling, 1 is returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("setSecondaryStrideInPixelsY:")
    public native void setSecondaryStrideInPixelsY(@NUInt long value);

    /**
     * Allocate a temporary MPSState (subclass) to hold the results from a -encodeBatchToCommandBuffer... operation
     * 
     * A graph may need to allocate storage up front before executing. This may be
     * necessary to avoid using too much memory and to manage large batches. The function
     * should allocate any MPSState objects that will be produced by an -encode call
     * with the indicated sourceImages and sourceStates inputs. Though the states
     * can be further adjusted in the ensuing -encode call, the states should
     * be initialized with all important data and all MTLResource storage allocated.
     * The data stored in the MTLResource need not be initialized, unless the ensuing
     * -encode call expects it to be.
     * 
     * The MTLDevice used by the result is derived from the command buffer.
     * The padding policy will be applied to the filter before this is called
     * to give it the chance to configure any properties like MPSCNNKernel.offset.
     * 
     * CAUTION: the result state should be made after the kernel properties are
     * configured for the -encode call that will write to the state, and
     * after -destinationImageDescriptorForSourceImages:sourceStates:
     * is called (if it is called). Otherwise, behavior is undefined.
     * Please see the description of
     * -[MPSCNNKernel resultStateForSourceImage:sourceStates:destinationImage] for more.
     * 
     * Default: returns nil
     * 
     * @param commandBuffer  The command buffer to allocate the temporary storage against
     *                       The state will only be valid on this command buffer.
     * @param primaryImage   The MPSImage consumed by the associated -encode call.
     * @param secondaryImage The MPSImage consumed by the associated -encode call.
     * @param sourceStates   The list of MPSStates consumed by the associated -encode call,
     *                       for a batch size of 1.
     * @return The list of states produced by the -encode call for batch size of 1.
     *         When the batch size is not 1, this function will be called repeatedly unless
     *         -isResultStateReusedAcrossBatch returns YES. If -isResultStateReusedAcrossBatch
     *         returns YES, then it will be called once per batch and the MPSStateBatch array will
     *         contain MPSStateBatch.length references to the same object.
     * 
     *         API-Since: 11.3
     */
    @Generated
    @Selector("temporaryResultStateForCommandBuffer:primaryImage:secondaryImage:sourceStates:destinationImage:")
    public native MPSState temporaryResultStateForCommandBufferPrimaryImageSecondaryImageSourceStatesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage primaryImage,
            MPSImage secondaryImage, NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);
}
