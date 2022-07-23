package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSHandle;
import apple.metalperformanceshaders.protocol.MPSImageAllocator;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNNGraph
 * <p>
 * Optimized representation of a graph of MPSNNImageNodes and MPSNNFilterNodes
 * <p>
 * Once you have prepared a graph of MPSNNImageNodes and MPSNNFilterNodes
 * (and if needed MPSNNStateNodes), you may initialize a MPSNNGraph using
 * the MPSNNImageNode that you wish to appear as the result. The MPSNNGraph
 * object will introspect the graph representation and determine which nodes
 * are needed for inputs, and which nodes are produced as output state (if any).
 * Nodes which are not needed to calculate the result image node are ignored.
 * Some nodes may be internally concatenated with other nodes for better
 * performance.
 * <p>
 * Note: the MPSNNImageNode that you choose as the result node may be interior
 * to a graph. This feature is provided as a means to examine intermediate
 * computations in the full graph for debugging purposes.
 * <p>
 * During MPSNNGraph construction, the graph attached to the result node will
 * be parsed and reduced to an optimized representation. This representation may
 * be saved using the NSSecureCoding protocol for later recall.
 * <p>
 * When decoding a MPSNNGraph using a NSCoder, it will be created against
 * the system default MTLDevice. If you would like to set the MTLDevice,
 * your NSCoder should conform to the <MPSDeviceProvider> protocol.
 * <p>
 * You may find it helpful to set MPSKernelOptionsVerbose on the graph when
 * debugging. To turn this on during MPSKernel initialization (including
 * MPSNNGraph initialization) set the MPS_LOG_INFO environment variable.
 * There is a lot of information about what optimizations are done to your
 * graph, including some information on why certain optimizations were not
 * made.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNGraph extends MPSKernel implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNGraph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNGraph alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNGraph allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Method to allocate the result image from -encodeToCommandBuffer...
     * <p>
     * This property overrides the allocator for the final result image in
     * the graph. Default: MPSImage.defaultAllocator
     */
    @Generated
    @Selector("destinationImageAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSImageAllocator destinationImageAllocator();

    /**
     * Encode the graph to a MTLCommandBuffer
     * <p>
     * IMPORTANT: Please use [MTLCommandBuffer addCompletedHandler:] to determine when this work is
     * done. Use CPU time that would have been spent waiting for the GPU to encode the next command
     * buffer and commit it too. That way, the work for the next command buffer is ready to go the
     * moment the GPU is done. This will keep the GPU busy and running at top speed.
     * <p>
     * Those who ignore this advice and use [MTLCommandBuffer waitUntilCompleted] instead will likely
     * cause their code to slow down by a factor of two or more. The CPU clock spins down while it
     * waits for the GPU. When the GPU completes, the CPU runs slowly for a while until it spins up.
     * The GPU has to wait for the CPU to encode more work (at low clock), giving it plenty of time to
     * spin its own clock down. In typical CNN graph usage, neither may ever reach maximum clock
     * frequency, causing slow down far beyond what otherwise would be expected from simple failure
     * to schedule CPU and GPU work concurrently. Regrattably, it is probable that every performance
     * benchmark you see on the net will be based on [MTLCommandBuffer waitUntilCompleted].
     *
     * @param commandBuffer The command buffer. If the command buffer is a MPSCommandBuffer,
     *                      the work will be committed to Metal in small pieces so that
     *                      the CPU-side latency is much reduced.
     * @param sourceImages  A list of MPSImages to use as the source images for the graph.
     *                      These should be in the same order as the list returned from MPSNNGraph.sourceImageHandles.
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the
     *         graph.
     *         It will be automatically released when commandBuffer completes. It can be nil if resultImageIsNeeded ==
     *         NO
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImages:")
    public native MPSImage encodeToCommandBufferSourceImages(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages);

    /**
     * Encode the graph to a MTLCommandBuffer
     *
     * @param commandBuffer      The command buffer. If the command buffer is a MPSCommandBuffer,
     *                           the work will be committed to Metal in small pieces so that
     *                           the CPU-side latency is much reduced.
     * @param sourceImages       A list of MPSImages to use as the source images for the graph.
     *                           These should be in the same order as the list returned from
     *                           MPSNNGraph.sourceImageHandles.
     *                           The images may be image arrays. Typically, this is only one or two images
     *                           such as a .JPG decoded into a MPSImage*. If the sourceImages are MPSTemporaryImages,
     *                           the graph will decrement the readCount by 1, even if the graph actually
     *                           reads an image multiple times.
     * @param sourceStates       A list of MPSState objects to use as state for a graph.
     *                           These should be in the same order as the list returned from
     *                           MPSNNGraph.sourceStateHandles.
     *                           May be nil, if there is no source state. If the sourceStates are temporary,
     *                           the graph will decrement the readCount by 1, even if the graph actually
     *                           reads the state multiple times.
     * @param intermediateImages An optional NSMutableArray to receive any MPSImage objects exported as part of its
     *                           operation.
     *                           These are only the images that were tagged with MPSNNImageNode.exportFromGraph = YES.
     *                           The
     *                           identity of the states is given by -resultStateHandles. If temporary, each
     *                           intermediateImage
     *                           will have a readCount of 1. If the result was tagged exportFromGraph = YES, it will be
     *                           here
     *                           too, with a readCount of 2. To be able to access the images from outside the graph on
     *                           the CPU,
     *                           your application must also set MPSNNImageNode.synchronizeResource = YES,
     *                           and MPSNNImageNode.imageAllocator = [MPSImage defaultAllocator]; The defaultAllocator
     *                           creates
     *                           a permanent image that can be read with readBytes.
     * @param destinationStates  An optional NSMutableArray to receive any MPSState objects created as part of its
     *                           operation.
     *                           The identity of the states is given by -resultStateHandles.
     * @return A MPSImage or MPSTemporaryImage allocated per the destinationImageAllocator containing the output of the
     *         graph.
     *         It will be automatically released when commandBuffer completes.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceImages:sourceStates:intermediateImages:destinationStates:")
    public native MPSImage encodeToCommandBufferSourceImagesSourceStatesIntermediateImagesDestinationStates(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages,
            NSArray<? extends MPSState> sourceStates, NSMutableArray<MPSImage> intermediateImages,
            NSMutableArray<MPSState> destinationStates);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Convenience method to execute a graph without having to manage many Metal details
     * <p>
     * This function will synchronously encode the graph on a private command buffer,
     * commit it to a MPS internal command queue and return. The GPU will start working.
     * When the GPU is done, the completion handler will be called. You should use
     * the intervening time to encode other work for execution on the GPU, so that
     * the GPU stays busy and doesn't clock down.
     * <p>
     * The work will be performed on the MTLDevice that hosts the source images.
     * <p>
     * This is a convenience API. There are a few situations it does not handle optimally.
     * These may be better handled using [encodeToCommandBuffer:sourceImages:].
     * Specifically:
     * [@code]
     * o If the graph needs to be run multiple times for different images,
     * it would be better to encode the graph multiple times on the same
     * command buffer using [encodeToCommandBuffer:sourceImages:] This
     * will allow the multiple graphs to share memory for intermediate
     * storage, dramatically reducing memory usage.
     * <p>
     * o If preprocessing or post-processing of the MPSImage is required,
     * such as resizing or normalization outside of a convolution, it would
     * be better to encode those things on the same command buffer.
     * Memory may be saved here too for intermediate storage. (MPSTemporaryImage
     * lifetime does not span multiple command buffers.)
     * [@endcode]
     *
     * @param sourceImages A list of MPSImages to use as the source images for the graph.
     *                     These should be in the same order as the list returned from
     *                     MPSNNGraph.sourceImageHandles. They should be allocated against
     *                     the same MTLDevice. There must be at least one source image.
     *                     Note: this array is intended to handle the case where multiple
     *                     input images are required to generate a single graph result.
     *                     That is, the graph itself has multiple inputs. If you need to
     *                     execute the graph multiple times, then call this API multiple
     *                     times, or (faster) make use of MPSImageBatches using
     *                     -executeBatchToCommandBuffer:sourceImages:sourceStates:...
     *                     (See discussion)
     * @param handler      A block to receive any errors generated. This block may run
     *                     on any thread and may be called before this method returns.
     *                     The image, if any, passed to this callback is the same image
     *                     as that returned from the left hand side.
     * @return A MPSImage to receive the result. The data in the image will not be valid until
     *         the completionHandler is called.
     */
    @Generated
    @Selector("executeAsyncWithSourceImages:completionHandler:")
    public native MPSImage executeAsyncWithSourceImagesCompletionHandler(NSArray<? extends MPSImage> sourceImages,
            @ObjCBlock(name = "call_executeAsyncWithSourceImagesCompletionHandler") Block_executeAsyncWithSourceImagesCompletionHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_executeAsyncWithSourceImagesCompletionHandler {
        @Generated
        void call_executeAsyncWithSourceImagesCompletionHandler(MPSImage result, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNGraph init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNGraph initWithCoder(NSCoder coder);

    /**
     * NSSecureCoding compatability
     * <p>
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
    public native MPSNNGraph initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNGraph initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:resultImage:")
    public native MPSNNGraph initWithDeviceResultImage(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSNNImageNode resultImage);

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
     * Get a list of identifiers for intermediate images objects produced by the graph
     */
    @Generated
    @Selector("intermediateImageHandles")
    public native NSArray<?> intermediateImageHandles();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNGraph new_objc();

    /**
     * Should MPSState objects produced by -encodeToCommandBuffer... be temporary objects.
     * <p>
     * See MPSState description. Default: NO
     */
    @Generated
    @Selector("outputStateIsTemporary")
    public native boolean outputStateIsTemporary();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Get a handle for the graph result image
     */
    @Generated
    @Selector("resultHandle")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSHandle resultHandle();

    /**
     * Get a list of identifiers for result state objects produced by the graph
     * <p>
     * Not guaranteed to be in the same order as sourceStateHandles
     */
    @Generated
    @Selector("resultStateHandles")
    public native NSArray<?> resultStateHandles();

    /**
     * Method to allocate the result image from -encodeToCommandBuffer...
     * <p>
     * This property overrides the allocator for the final result image in
     * the graph. Default: MPSImage.defaultAllocator
     */
    @Generated
    @Selector("setDestinationImageAllocator:")
    public native void setDestinationImageAllocator(@Mapped(ObjCObjectMapper.class) MPSImageAllocator value);

    /**
     * Should MPSState objects produced by -encodeToCommandBuffer... be temporary objects.
     * <p>
     * See MPSState description. Default: NO
     */
    @Generated
    @Selector("setOutputStateIsTemporary:")
    public native void setOutputStateIsTemporary(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Get a list of identifiers for source images needed to calculate the result image
     */
    @Generated
    @Selector("sourceImageHandles")
    public native NSArray<?> sourceImageHandles();

    /**
     * Get a list of identifiers for source state objects needed to calculate the result image
     * <p>
     * Not guaranteed to be in the same order as resultStateHandles
     */
    @Generated
    @Selector("sourceStateHandles")
    public native NSArray<?> sourceStateHandles();

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
     * The default storage format used for graph intermediate images
     * <p>
     * This doesn't affect how data is stored in buffers in states.
     * Nor does it affect the storage format for weights
     * such as convolution weights stored by individual filters.
     * Default: MPSImageFeatureChannelFormatFloat16
     */
    @Generated
    @Selector("format")
    @NUInt
    public native long format();

    @Generated
    @Selector("graphWithDevice:resultImage:")
    public static native MPSNNGraph graphWithDeviceResultImage(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSNNImageNode resultImage);

    @Generated
    @Selector("graphWithDevice:resultImage:resultImageIsNeeded:")
    public static native MPSNNGraph graphWithDeviceResultImageResultImageIsNeeded(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSNNImageNode resultImage, boolean resultIsNeeded);

    @Generated
    @Selector("graphWithDevice:resultImages:resultsAreNeeded:")
    public static native MPSNNGraph graphWithDeviceResultImagesResultsAreNeeded(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, NSArray<? extends MPSNNImageNode> resultImages,
            BoolPtr areResultsNeeded);

    /**
     * Initialize a MPSNNGraph object on a device starting with resultImage working backward
     * <p>
     * The MPSNNGraph constructor will start with the indicated result image, and look
     * to see what MPSNNFilterNode produced it, then look to its dependencies and so
     * forth to reveal the subsection of the graph necessary to compute the image.
     *
     * @param device         The MTLDevice on which to run the graph
     * @param resultImage    The MPSNNImageNode corresponding to the last image in the graph.
     *                       This is the image that will be returned. Note: the imageAllocator
     *                       for this node is ignored and the MPSNNGraph.destinationImageAllocator
     *                       is used for this node instead.
     * @param resultIsNeeded Commonly, when training a graph, the last MPSImage out of the
     *                       graph is not used. The final gradient filter is run solely to update
     *                       some weights. If resultIsNeeded is set to NO, nil will
     *                       be returned from the left hand side of the -encode call instead,
     *                       and computation to produce the last image may be pruned away.
     * @return A new MPSNNGraph.
     */
    @Generated
    @Selector("initWithDevice:resultImage:resultImageIsNeeded:")
    public native MPSNNGraph initWithDeviceResultImageResultImageIsNeeded(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSNNImageNode resultImage, boolean resultIsNeeded);

    /**
     * Initialize a MPSNNGraph object on a device starting with resultImage working backward
     * <p>
     * The MPSNNGraph constructor will start with the indicated result images, and look
     * to see what MPSNNFilterNode produced them, then look to its dependencies and so
     * forth to reveal the subsection of the graph necessary to compute the image. This variant
     * is provided to support graphs and subgraphs with multiple image outputs.
     *
     * @param device           The MTLDevice on which to run the graph
     * @param resultImages     The MPSNNImageNodes corresponding to the last images in the graph.
     *                         The first image in the array will be returned from the -encode method
     *                         LHS. The rest will be included in the list of intermediate images.
     * @param areResultsNeeded An array of BOOL values with count equal to resultImages.count.
     *                         If NO is passed for a given image, the image itself is marked unneeded
     *                         and might be skipped. The graph will prune this branch back to the
     *                         first requred filter. A filter is required if it generates a needed
     *                         result image, or is needed to update training parameters.
     * @return A new MPSNNGraph.
     */
    @Generated
    @Selector("initWithDevice:resultImages:resultsAreNeeded:")
    public native MPSNNGraph initWithDeviceResultImagesResultsAreNeeded(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, NSArray<? extends MPSNNImageNode> resultImages,
            BoolPtr areResultsNeeded);

    /**
     * Find the number of times a image will be read by the graph *
     * <p>
     * From the set of images (or image batches) passed in to the graph, find
     * the number of times the graph will read an image. This may be needed
     * by your application to correctly set the MPSImage.readCount property.
     *
     * @param index The index of the image. The index of the image matches the index of the image in the array returned
     *              by the sourceImageHandles property.
     * @return The read count of the image(s) at the index will be reduced by the value returned
     *         when the graph is finished encoding. The readcount of the image(s) must be at least
     *         this value when it is passed into the -encode... method.
     */
    @Generated
    @Selector("readCountForSourceImageAtIndex:")
    @NUInt
    public native long readCountForSourceImageAtIndex(@NUInt long index);

    /**
     * Find the number of times a state will be read by the graph *
     * <p>
     * From the set of state (or state batches) passed in to the graph, find
     * the number of times the graph will read a state. This may be needed
     * by your application to correctly set the MPSState.readCount property.
     *
     * @param index The index of the state. The index of the state matches the index of the state in the array returned
     *              by the sourceStateHandles property.
     * @return The read count of the state(s) at the index will be reduced by the value returned
     *         when the graph is finished encoding. The read count of the state(s) must be at least
     *         this value when it is passed into the -encode... method.
     */
    @Generated
    @Selector("readCountForSourceStateAtIndex:")
    @NUInt
    public native long readCountForSourceStateAtIndex(@NUInt long index);

    /**
     * Reinitialize all graph nodes from data sources
     * <p>
     * A number of the nodes that make up a graph have a data source
     * associated with them, for example a MPSCNNConvolutionDataSource
     * or a MPSCNNBatchNormalizationDataSource. Generally, the data
     * is read from these once at graph initialization time and then
     * not looked at again, except during the weight / parameter update
     * phase of the corresponding gradient nodes and then only if CPU
     * updates are requested. Otherwise, update occurs on the GPU,
     * and the data in the data source is thereafter ignored.
     * <p>
     * It can happen, though, that your application has determined the
     * graph should load a new set of weights from the data source.
     * When this method is called, the graph will find all nodes that
     * support reloading and direct them to reinitialize themselves
     * based on their data source.
     * <p>
     * This process occurs immediately. Your application will
     * need to make sure any GPU work being done by the graph is complete
     * to ensure data coherency. Most nodes do not have a data source
     * and will not be modified. Nodes that are not used by the graph
     * will not be updated.
     */
    @Generated
    @Selector("reloadFromDataSources")
    public native void reloadFromDataSources();

    /**
     * Set at -init time.
     * <p>
     * If NO, nil will be returned from -encode calls and some computation
     * may be omitted.
     */
    @Generated
    @Selector("resultImageIsNeeded")
    public native boolean resultImageIsNeeded();

    /**
     * The default storage format used for graph intermediate images
     * <p>
     * This doesn't affect how data is stored in buffers in states.
     * Nor does it affect the storage format for weights
     * such as convolution weights stored by individual filters.
     * Default: MPSImageFeatureChannelFormatFloat16
     */
    @Generated
    @Selector("setFormat:")
    public native void setFormat(@NUInt long value);
}
