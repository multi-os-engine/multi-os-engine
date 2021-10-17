package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
 * MPSCNNMultiaryKernel
 * [@dependency] This depends on Metal.framework
 * <p>
 * Describes a  neural network kernel with multiple image sources.
 * <p>
 * A MPSCNNKernel consumes multiple MPSImages, possibly a MPSState, and produces one MPSImage.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNMultiaryKernel extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNMultiaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNMultiaryKernel alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * Returns YES if the filter must be run over the entire batch before its
     * results may be used
     * <p>
     * Nearly all filters do not need to see the entire batch all at once and can
     * operate correctly with partial batches. This allows the graph to
     * strip-mine the problem, processing the graph top to bottom on a subset
     * of the batch at a time, dramatically reducing memory usage. As the full
     * nominal working set for a graph is often so large that it may not fit
     * in memory, sub-batching may be required forward progress.
     * <p>
     * Batch normalization statistics on the other hand must complete the batch
     * before the statistics may be used to normalize the images in the batch
     * in the ensuing normalization filter. Consequently, batch normalization statistics
     * requests the graph insert a batch barrier following it by returning
     * YES from -appendBatchBarrier. This tells the graph to complete the batch
     * before any dependent filters can start. Note that the filter itself may
     * still be subject to sub-batching in its operation. All filters must be able to
     * function without seeing the entire batch in a single -encode call. Carry
     * over state that is accumulated across sub-batches is commonly carried in
     * a shared MPSState containing a MTLBuffer. See -isResultStateReusedAcrossBatch.
     * <p>
     * Caution: on most supported devices, the working set may be so large
     * that the graph may be forced to throw away and recalculate most
     * intermediate images in cases where strip-mining can not occur because
     * -appendBatchBarrier returns YES. A single batch barrier can commonly
     * cause a memory size increase and/or performance reduction by many fold
     * over the entire graph.  Filters of this variety should be avoided.
     * <p>
     * Default: NO
     */
    @Generated
    @Selector("appendBatchBarrier")
    public native boolean appendBatchBarrier();

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
     * [@property]   clipRect
     * <p>
     * An optional clip rectangle to use when writing data. Only the pixels in the rectangle will be overwritten.
     * <p>
     * A MTLRegion that indicates which part of the destination to overwrite. If the clipRect does not lie
     * completely within the destination image, the intersection between clip rectangle and destination bounds is
     * used.   Default: MPSRectNoClip (MPSKernel::MPSRectNoClip) indicating the entire image.
     * clipRect.origin.z is the index of starting destination image in batch processing mode. clipRect.size.depth
     * is the number of images to process in batch processing mode.
     * <p>
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
     * [@property]   destinationFeatureChannelOffset
     * <p>
     * The number of channels in the destination MPSImage to skip before writing output.
     * <p>
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
     * <p>
     * Default: MPSTemporaryImage.defaultAllocator
     */
    @Generated
    @Selector("destinationImageAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSImageAllocator destinationImageAllocator();

    /**
     * Get a suggested destination image descriptor for a source image
     * <p>
     * Your application is certainly free to pass in any destinationImage
     * it likes to encodeToCommandBuffer:sourceImage:destinationImage,
     * within reason. This is the basic design for iOS 10. This method
     * is therefore not required.
     * <p>
     * However, calculating the MPSImage size and MPSCNNKernel properties
     * for each filter can be tedious and complicated work, so this method
     * is made available to automate the process. The application may
     * modify the properties of the descriptor before a MPSImage is made from
     * it, so long as the choice is sensible for the kernel in question.
     * Please see individual kernel descriptions for restrictions.
     * <p>
     * The expected timeline for use is as follows:
     * <p>
     * 1) This method is called:
     * a) The default MPS padding calculation is applied. It
     * uses the MPSNNPaddingMethod of the .padding property to
     * provide a consistent addressing scheme over the graph.
     * It creates the MPSImageDescriptor and adjusts the .offset
     * property of the MPSNNKernel. When using a MPSNNGraph, the
     * padding is set using the MPSNNFilterNode as a proxy.
     * <p>
     * b) This method may be overridden by MPSCNNKernel subclass
     * to achieve any customization appropriate to the object type.
     * <p>
     * c) Source states are then applied in order. These may modify the
     * descriptor and may update other object properties. See:
     * -destinationImageDescriptorForSourceImages:sourceStates:
     * forKernel:suggestedDescriptor:  This is the typical way
     * in which MPS may attempt to influence the operation of
     * its kernels.
     * <p>
     * d) If the .padding property has a custom padding policy method
     * of the same name, it is called. Similarly, it may also adjust
     * the descriptor and any MPSCNNKernel properties. This is the
     * typical way in which your application may attempt to influence
     * the operation of the MPS kernels.
     * <p>
     * 2) A result is returned from this method and the caller
     * may further adjust the descriptor and kernel properties
     * directly.
     * <p>
     * 3) The caller uses the descriptor to make a new MPSImage to
     * use as the destination image for the -encode call in step 5.
     * <p>
     * 4) The caller calls -resultStateForSourceImage:sourceStates:destinationImage:
     * to make any result states needed for the kernel. If there isn't
     * one, it will return nil. A variant is available to return a
     * temporary state instead.
     * <p>
     * 5) a -encode method is called to encode the kernel.
     * <p>
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
     * <p>
     * No destination state or destination image is provided as an argument to this
     * function because it is expected they will be made / configured after this
     * is called. This method is expected to auto-configure important object properties
     * that may be needed in the ensuing destination image and state creation steps.
     *
     * @param sourceImages A array of source images that will be passed into the -encode call
     *                     Since MPSCNNKernel is a unary kernel, it is an array of length 1.
     * @param sourceStates An optional array of source states that will be passed into the -encode call
     * @return an image descriptor allocated on the autorelease pool
     */
    @Generated
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:")
    public native MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStates(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates);

    /**
     * Stride in source coordinates from one kernel tap to the next in the X dimension.
     *
     * @param index The index of the source image to which the dilation rate applies
     * @return The dilation rate
     */
    @Generated
    @Selector("dilationRateXatIndex:")
    @NUInt
    public native long dilationRateXatIndex(@NUInt long index);

    /**
     * Stride in source coordinates from one kernel tap to the next in the Y dimension.
     *
     * @param index The index of the source image to which the dilation rate applies
     * @return The dilation rate
     */
    @Generated
    @Selector("dilationRateYatIndex:")
    @NUInt
    public native long dilationRateYatIndex(@NUInt long index);

    /**
     * The MPSImageEdgeMode to use when texture reads stray off the edge of the primary source image
     * <p>
     * Most MPSKernel objects can read off the edge of the source image. This can happen
     * because of a negative offset property, because the offset + clipRect.size is larger
     * than the source image or because the filter looks at neighboring pixels, such as a
     * Convolution filter.   Default:  MPSImageEdgeModeZero.
     * <p>
     * See Also: @ref subsubsection_edgemode
     *
     * @param index The index of the source image to which the edge mode refers
     * @return The edge mode for that source image
     */
    @Generated
    @Selector("edgeModeAtIndex:")
    @NUInt
    public native long edgeModeAtIndex(@NUInt long index);

    /**
     * Encode a MPSCNNKernel into a command Buffer. Create a texture to hold the result and return it.
     * <p>
     * In the first iteration on this method, encodeToCommandBuffer:sourceImage:destinationImage:
     * some work was left for the developer to do in the form of correctly setting the offset property
     * and sizing the result buffer. With the introduction of the padding policy (see padding property)
     * the filter can do this work itself. If you would like to have some input into what sort of MPSImage
     * (e.g. temporary vs. regular) or what size it is or where it is allocated, you may set the
     * destinationImageAllocator to allocate the image yourself.
     * <p>
     * This method uses the MPSNNPadding padding property to figure out how to size
     * the result image and to set the offset property.  See discussion in MPSNeuralNetworkTypes.h.
     *
     * @param commandBuffer The command buffer
     * @param sourceImages  An array of MPSImages to use as the source images for the filter.
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the graph.
     * The returned image will be automatically released when the command buffer completes. If you want to
     * keep it around for longer, retain the image. (ARC will do this for you if you use it later.)
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImages:")
    public native MPSImage encodeToCommandBufferSourceImages(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages);

    /**
     * Encode a MPSCNNKernel into a command Buffer.  The operation shall proceed out-of-place.
     * <p>
     * This is the older style of encode which reads the offset, doesn't change it,
     * and ignores the padding method.
     *
     * @param commandBuffer    A valid MTLCommandBuffer to receive the encoded filter
     * @param sourceImages     An array containing the source images
     * @param destinationImage A valid MPSImage to be overwritten by result image. destinationImage may not alias primarySourceImage or secondarySourceImage.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImages:destinationImage:")
    public native void encodeToCommandBufferSourceImagesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages,
            MPSImage destinationImage);

    /**
     * Encode a MPSCNNKernel into a command Buffer. Create a texture and state to hold the results and return them.
     * <p>
     * In the first iteration on this method, encodeToCommandBuffer:sourceImage:destinationState:destinationImage:
     * some work was left for the developer to do in the form of correctly setting the offset property
     * and sizing the result buffer. With the introduction of the padding policy (see padding property)
     * the filter can do this work itself. If you would like to have some input into what sort of MPSImage
     * (e.g. temporary vs. regular) or what size it is or where it is allocated, you may set the
     * destinationImageAllocator to allocate the image yourself.
     * <p>
     * This method uses the MPSNNPadding padding property to figure out how to size
     * the result image and to set the offset property. See discussion in MPSNeuralNetworkTypes.h.
     * All images in a batch must have MPSImage.numberOfImages = 1.
     *
     * @param commandBuffer The command buffer
     * @param sourceImages  An array of MPSImages to use as the source images for the filter.
     * @param outState      The address of location to write the pointer to the result state of the operation
     * @param isTemporary   YES if the outState should be a temporary object
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the graph.
     * The offset property will be adjusted to reflect the offset used during the encode.
     * The returned image will be automatically released when the command buffer completes. If you want to
     * keep it around for longer, retain the image. (ARC will do this for you if you use it later.)
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImages:destinationState:destinationStateIsTemporary:")
    public native MPSImage encodeToCommandBufferSourceImagesDestinationStateDestinationStateIsTemporary(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages,
            @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outState, boolean isTemporary);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNMultiaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNMultiaryKernel initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly.  To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNMultiaryKernel initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNMultiaryKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Standard init with default properties per filter type
     *
     * @param device      The device that the filter will be used on. May not be NULL.
     * @param sourceCount The number of source images or MPSImageBatches
     * @return A pointer to the newly initialized object. This will fail, returning
     * nil if the device is not supported. Devices must be
     * MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSCNNMultiaryKernel initWithDeviceSourceCount(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long sourceCount);

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
     * [@property]   isBackwards
     * <p>
     * YES if the filter operates backwards.
     * <p>
     * This influences how strideInPixelsX/Y should be interpreted.
     */
    @Generated
    @Selector("isBackwards")
    public native boolean isBackwards();

    /**
     * Returns YES if the same state is used for every operation in a batch
     * <p>
     * If NO, then each image in a MPSImageBatch will need a corresponding
     * (and different) state to go with it. Set to YES to avoid allocating
     * redundant state in the case when the same state is used all the time.
     * Default: NO
     */
    @Generated
    @Selector("isResultStateReusedAcrossBatch")
    public native boolean isResultStateReusedAcrossBatch();

    /**
     * Returns true if the -encode call modifies the state object it accepts.
     */
    @Generated
    @Selector("isStateModified")
    public native boolean isStateModified();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * The height of the kernel filter window
     * <p>
     * This is the horizontal diameter of the region read by the filter for each
     * result pixel. If the MPSCNNKernel does not have a filter window, then
     * 1 will be returned.
     *
     * @param index The index of the source image to which the kernel width refers
     */
    @Generated
    @Selector("kernelHeightAtIndex:")
    @NUInt
    public native long kernelHeightAtIndex(@NUInt long index);

    /**
     * The width of the kernel filter window
     * <p>
     * This is the horizontal diameter of the region read by the filter for each
     * result pixel. If the MPSCNNKernel does not have a filter window, then
     * 1 will be returned.
     *
     * @param index The index of the source image to which the kernel width refers
     */
    @Generated
    @Selector("kernelWidthAtIndex:")
    @NUInt
    public native long kernelWidthAtIndex(@NUInt long index);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * The positon of the destination clip rectangle origin relative to each source buffer
     * <p>
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and source image align.
     * offset.z is the index of starting source image in batch processing mode.
     *
     * @param index The index of the source image described by the offset
     * @return A MPSOffset for that image
     */
    @Generated
    @Selector("offsetAtIndex:")
    @ByValue
    public native MPSOffset offsetAtIndex(@NUInt long index);

    /**
     * [@property]   padding
     * <p>
     * The padding method used by the filter
     * <p>
     * This influences how strideInPixelsX/Y should be interpreted.
     * Default:  MPSNNPaddingMethodAlignCentered | MPSNNPaddingMethodAddRemainderToTopLeft | MPSNNPaddingMethodSizeSame
     * Some object types (e.g. MPSCNNFullyConnected) may override this default with something appropriate to its operation.
     */
    @Generated
    @Selector("padding")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNNPadding padding();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Allocate a MPSState (subclass) to hold the results from a -encodeBatchToCommandBuffer... operation
     * <p>
     * A graph may need to allocate storage up front before executing.  This may be
     * necessary to avoid using too much memory and to manage large batches.  The function
     * should allocate any MPSState objects that will be produced by an -encode call
     * with the indicated sourceImages and sourceStates inputs. Though the states
     * can be further adjusted in the ensuing -encode call, the states should
     * be initialized with all important data and all MTLResource storage allocated.
     * The data stored in the MTLResource need not be initialized, unless the ensuing
     * -encode call expects it to be.
     * <p>
     * The MTLDevice used by the result is derived from the source image.
     * The padding policy will be applied to the filter before this is called
     * to give it the chance to configure any properties like MPSCNNKernel.offset.
     * <p>
     * CAUTION:
     * The kernel must have all properties set to values that will ultimately be
     * passed to the -encode call that writes to the state, before
     * -resultStateForSourceImages:sourceStates:destinationImage: is called or behavior is undefined.
     * Please note that -destinationImageDescriptorForSourceImages:sourceStates:
     * will alter some of these properties automatically based on the padding policy.
     * If you intend to call that to make the destination image, then you should
     * call that before -resultStateForSourceImages:sourceStates:destinationImage:. This will ensure the
     * properties used in the encode call and in the destination image creation
     * match those used to configure the state.
     * <p>
     * The following order is recommended:
     * <p>
     * // Configure MPSCNNKernel properties first
     * kernel.edgeMode = MPSImageEdgeModeZero;
     * kernel.destinationFeatureChannelOffset = 128; // concatenation without the copy
     * ...
     * <p>
     * // ALERT: will change MPSCNNKernel properties
     * MPSImageDescriptor * d = [kernel destinationImageDescriptorForSourceImage: source
     * sourceStates: states];
     * MPSTemporaryImage * dest = [MPSTemporaryImage temporaryImageWithCommandBuffer: cmdBuf
     * imageDescriptor: d];
     * <p>
     * // Now that all properties are configured properly, we can make the result state
     * // and call encode.
     * MPSState * __nullable destState = [kernel resultStateForSourceImage: source
     * sourceStates: states
     * destinationImage: dest];
     * <p>
     * // This form of -encode will be declared by the MPSCNNKernel subclass
     * [kernel encodeToCommandBuffer: cmdBuf
     * sourceImage: source
     * destinationState: destState
     * destinationImage: dest ];
     * <p>
     * Default: returns nil
     *
     * @param sourceImages     The MPSImage consumed by the associated -encode call.
     * @param sourceStates     The list of MPSStates consumed by the associated -encode call,
     *                         for a batch size of 1.
     * @param destinationImage The destination image for the encode call
     * @return The list of states produced by the -encode call for batch size of 1.
     * When the batch size is not 1, this function will be called repeatedly unless
     * -isResultStateReusedAcrossBatch returns YES. If  -isResultStateReusedAcrossBatch
     * returns YES, then it will be called once per batch and the MPSStateBatch array will
     * contain MPSStateBatch.length references to the same object.
     */
    @Generated
    @Selector("resultStateForSourceImages:sourceStates:destinationImage:")
    public native MPSState resultStateForSourceImagesSourceStatesDestinationImage(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates,
            MPSImage destinationImage);

    /**
     * [@property]   clipRect
     * <p>
     * An optional clip rectangle to use when writing data. Only the pixels in the rectangle will be overwritten.
     * <p>
     * A MTLRegion that indicates which part of the destination to overwrite. If the clipRect does not lie
     * completely within the destination image, the intersection between clip rectangle and destination bounds is
     * used.   Default: MPSRectNoClip (MPSKernel::MPSRectNoClip) indicating the entire image.
     * clipRect.origin.z is the index of starting destination image in batch processing mode. clipRect.size.depth
     * is the number of images to process in batch processing mode.
     * <p>
     * See Also: @ref subsubsection_clipRect
     */
    @Generated
    @Selector("setClipRect:")
    public native void setClipRect(@ByValue MTLRegion value);

    /**
     * [@property]   destinationFeatureChannelOffset
     * <p>
     * The number of channels in the destination MPSImage to skip before writing output.
     * <p>
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
     * <p>
     * Default: MPSTemporaryImage.defaultAllocator
     */
    @Generated
    @Selector("setDestinationImageAllocator:")
    public native void setDestinationImageAllocator(@Mapped(ObjCObjectMapper.class) MPSImageAllocator value);

    /**
     * Set the stride in source coordinates from one kernel tap to the next in the X dimension.
     *
     * @param index        The index of the source image to which the dilation rate applies
     * @param dilationRate The dilation rate
     */
    @Generated
    @Selector("setDilationRateX:atIndex:")
    public native void setDilationRateXAtIndex(@NUInt long dilationRate, @NUInt long index);

    /**
     * Set the stride in source coordinates from one kernel tap to the next in the Y dimension.
     *
     * @param index        The index of the source image to which the dilation rate applies
     * @param dilationRate The dilation rate
     */
    @Generated
    @Selector("setDilationRateY:atIndex:")
    public native void setDilationRateYAtIndex(@NUInt long dilationRate, @NUInt long index);

    /**
     * Set the MPSImageEdgeMode to use when texture reads stray off the edge of the primary source image
     * <p>
     * Most MPSKernel objects can read off the edge of the source image. This can happen
     * because of a negative offset property, because the offset + clipRect.size is larger
     * than the source image or because the filter looks at neighboring pixels, such as a
     * Convolution filter.   Default:  MPSImageEdgeModeZero.
     * <p>
     * See Also: @ref subsubsection_edgemode
     *
     * @param edgeMode The new edge mode to use
     * @param index    The index of the source image to which the edge mode refers
     */
    @Generated
    @Selector("setEdgeMode:atIndex:")
    public native void setEdgeModeAtIndex(@NUInt long edgeMode, @NUInt long index);

    /**
     * Set the height of the kernel filter window
     * <p>
     * This is the horizontal diameter of the region read by the filter for each
     * result pixel. If the MPSCNNKernel does not have a filter window, then
     * 1 will be returned.
     *
     * @param height The new width
     * @param index  The index of the source image to which the kernel width refers
     */
    @Generated
    @Selector("setKernelHeight:atIndex:")
    public native void setKernelHeightAtIndex(@NUInt long height, @NUInt long index);

    /**
     * Set the width of the kernel filter window
     * <p>
     * This is the horizontal diameter of the region read by the filter for each
     * result pixel. If the MPSCNNKernel does not have a filter window, then
     * 1 will be returned.
     *
     * @param width The new width
     * @param index The index of the source image to which the kernel width refers
     */
    @Generated
    @Selector("setKernelWidth:atIndex:")
    public native void setKernelWidthAtIndex(@NUInt long width, @NUInt long index);

    /**
     * Set the positon of the destination clip rectangle origin relative to each source buffer
     * <p>
     * The offset is defined to be the position of clipRect.origin in source coordinates.
     * Default: {0,0,0}, indicating that the top left corners of the clipRect and source image align.
     * offset.z is the index of starting source image in batch processing mode.
     *
     * @param offset The new offset
     * @param index  The index of the source image described by the offset
     */
    @Generated
    @Selector("setOffset:atIndex:")
    public native void setOffsetAtIndex(@ByValue MPSOffset offset, @NUInt long index);

    /**
     * [@property]   padding
     * <p>
     * The padding method used by the filter
     * <p>
     * This influences how strideInPixelsX/Y should be interpreted.
     * Default:  MPSNNPaddingMethodAlignCentered | MPSNNPaddingMethodAddRemainderToTopLeft | MPSNNPaddingMethodSizeSame
     * Some object types (e.g. MPSCNNFullyConnected) may override this default with something appropriate to its operation.
     */
    @Generated
    @Selector("setPadding:")
    public native void setPadding(@Mapped(ObjCObjectMapper.class) MPSNNPadding value);

    /**
     * Set the maximum number of channels in the source MPSImage to use
     * <p>
     * Most filters can insert a slice operation into the filter for free.
     * Use this to limit the size of the feature channel slice taken from
     * the input image. If the value is too large, it is truncated to be
     * the remaining size in the image after the sourceFeatureChannelOffset
     * is taken into account.  Default: ULONG_MAX
     *
     * @param count The new source feature channel max count
     * @param index The index of the source image to which the max count refers
     */
    @Generated
    @Selector("setSourceFeatureChannelMaxCount:atIndex:")
    public native void setSourceFeatureChannelMaxCountAtIndex(@NUInt long count, @NUInt long index);

    /**
     * Set the number of channels in the source MPSImage to skip before reading the input.
     * <p>
     * This is the starting offset into the  source image in the feature channel dimension
     * at which source data is read. Unit: feature channels
     * This allows an application to read a subset of all the channels in MPSImage as input of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel needs to read 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as input, we can set sourceFeatureChannelOffset[0] = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel inputs N channels,
     * the source image MUST have at least primarySourceFeatureChannelOffset + N channels. Using a source
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution inputs 32 channels, and the source has 64 channels, then it is an error to set
     * primarySourceFeatureChannelOffset > 32.
     *
     * @param index  The index of the source image that the feature channel offset describes
     * @param offset The source feature channel offset
     */
    @Generated
    @Selector("setSourceFeatureChannelOffset:atIndex:")
    public native void setSourceFeatureChannelOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * The downsampling factor in the horizontal dimension for the source image
     * <p>
     * If the filter does not do up or downsampling, 1 is returned.  Default: 1
     *
     * @param index  The index of the source Image
     * @param stride The stride for the source image
     */
    @Generated
    @Selector("setStrideInPixelsX:atIndex:")
    public native void setStrideInPixelsXAtIndex(@NUInt long stride, @NUInt long index);

    /**
     * The downsampling factor in the vertical dimension for the source image
     * <p>
     * If the filter does not do up or downsampling, 1 is returned.  Default: 1
     *
     * @param index  The index of the source Image
     * @param stride The stride for the source image
     */
    @Generated
    @Selector("setStrideInPixelsY:atIndex:")
    public native void setStrideInPixelsYAtIndex(@NUInt long stride, @NUInt long index);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The number of source images accepted by the kernel
     */
    @Generated
    @Selector("sourceCount")
    @NUInt
    public native long sourceCount();

    /**
     * The maximum number of channels in the source MPSImage to use
     * <p>
     * Most filters can insert a slice operation into the filter for free.
     * Use this to limit the size of the feature channel slice taken from
     * the input image. If the value is too large, it is truncated to be
     * the remaining size in the image after the sourceFeatureChannelOffset
     * is taken into account.  Default: ULONG_MAX
     *
     * @param index The index of the source image to which the max count refers
     * @return The source feature channel max count
     */
    @Generated
    @Selector("sourceFeatureChannelMaxCountAtIndex:")
    @NUInt
    public native long sourceFeatureChannelMaxCountAtIndex(@NUInt long index);

    /**
     * The number of channels in the source MPSImage to skip before reading the input.
     * <p>
     * This is the starting offset into the  source image in the feature channel dimension
     * at which source data is read. Unit: feature channels
     * This allows an application to read a subset of all the channels in MPSImage as input of MPSKernel.
     * E.g. Suppose MPSImage has 24 channels and a MPSKernel needs to read 8 channels. If
     * we want channels 8 to 15 of this MPSImage to be used as input, we can set sourceFeatureChannelOffset[0] = 8.
     * Note that this offset applies independently to each image when the MPSImage
     * is a container for multiple images and the MPSCNNKernel is processing multiple images (clipRect.size.depth > 1).
     * The default value is 0 and any value specifed shall be a multiple of 4. If MPSKernel inputs N channels,
     * the source image MUST have at least primarySourceFeatureChannelOffset + N channels. Using a source
     * image with insufficient number of feature channels will result in an error.
     * E.g. if the MPSCNNConvolution inputs 32 channels, and the source has 64 channels, then it is an error to set
     * primarySourceFeatureChannelOffset > 32.
     *
     * @param index The index of the source image that the feature channel offset describes
     * @return The source feature channel offset
     */
    @Generated
    @Selector("sourceFeatureChannelOffsetAtIndex:")
    @NUInt
    public native long sourceFeatureChannelOffsetAtIndex(@NUInt long index);

    /**
     * The downsampling factor in the horizontal dimension for the source image
     * <p>
     * If the filter does not do up or downsampling, 1 is returned.
     *
     * @param index The index of the source Image
     * @return The stride
     */
    @Generated
    @Selector("strideInPixelsXatIndex:")
    @NUInt
    public native long strideInPixelsXatIndex(@NUInt long index);

    /**
     * The downsampling factor in the vertical dimension for the source image
     * <p>
     * If the filter does not do up or downsampling, 1 is returned.
     *
     * @param index The index of the source Image
     * @return The stride
     */
    @Generated
    @Selector("strideInPixelsYatIndex:")
    @NUInt
    public native long strideInPixelsYatIndex(@NUInt long index);

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

    /**
     * Allocate a temporary MPSState (subclass) to hold the results from a -encodeBatchToCommandBuffer... operation
     * <p>
     * A graph may need to allocate storage up front before executing.  This may be
     * necessary to avoid using too much memory and to manage large batches.  The function
     * should allocate any MPSState objects that will be produced by an -encode call
     * with the indicated sourceImages and sourceStates inputs. Though the states
     * can be further adjusted in the ensuing -encode call, the states should
     * be initialized with all important data and all MTLResource storage allocated.
     * The data stored in the MTLResource need not be initialized, unless the ensuing
     * -encode call expects it to be.
     * <p>
     * The MTLDevice used by the result is derived from the command buffer.
     * The padding policy will be applied to the filter before this is called
     * to give it the chance to configure any properties like MPSCNNKernel.offset.
     * <p>
     * CAUTION:
     * The kernel must have all properties set to values that will ultimately be
     * passed to the -encode call that writes to the state, before
     * -resultStateForSourceImages:sourceStates:destinationImage: is called or behavior is undefined.
     * Please note that -destinationImageDescriptorForSourceImages:sourceStates:destinationImage:
     * will alter some of these properties automatically based on the padding policy.
     * If you intend to call that to make the destination image, then you should
     * call that before -resultStateForSourceImages:sourceStates:destinationImage:.  This will ensure the
     * properties used in the encode call and in the destination image creation
     * match those used to configure the state.
     * <p>
     * The following order is recommended:
     * <p>
     * // Configure MPSCNNKernel properties first
     * kernel.edgeMode = MPSImageEdgeModeZero;
     * kernel.destinationFeatureChannelOffset = 128; // concatenation without the copy
     * ...
     * <p>
     * // ALERT: will change MPSCNNKernel properties
     * MPSImageDescriptor * d = [kernel destinationImageDescriptorForSourceImage: source
     * sourceStates: states];
     * MPSTemporaryImage * dest = [MPSTemporaryImage temporaryImageWithCommandBuffer: cmdBuf
     * imageDescriptor: d];
     * <p>
     * // Now that all properties are configured properly, we can make the result state
     * // and call encode.
     * MPSState * __nullable destState = [kernel temporaryResultStateForCommandBuffer: cmdBuf
     * sourceImage: source
     * sourceStates: states];
     * <p>
     * // This form of -encode will be declared by the MPSCNNKernel subclass
     * [kernel encodeToCommandBuffer: cmdBuf
     * sourceImage: source
     * destinationState: destState
     * destinationImage: dest ];
     * <p>
     * Default: returns nil
     *
     * @param commandBuffer    The command buffer to allocate the temporary storage against
     *                         The state will only be valid on this command buffer.
     * @param sourceImage      The MPSImage consumed by the associated -encode call.
     * @param sourceStates     The list of MPSStates consumed by the associated -encode call,
     *                         for a batch size of 1.
     * @param destinationImage The destination image for the encode call
     * @return The list of states produced by the -encode call for batch size of 1.
     * When the batch size is not 1, this function will be called repeatedly unless
     * -isResultStateReusedAcrossBatch returns YES. If  -isResultStateReusedAcrossBatch
     * returns YES, then it will be called once per batch and the MPSStateBatch array will
     * contain MPSStateBatch.length references to the same object.
     */
    @Generated
    @Selector("temporaryResultStateForCommandBuffer:sourceImages:sourceStates:destinationImage:")
    public native MPSState temporaryResultStateForCommandBufferSourceImagesSourceStatesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImage,
            NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
