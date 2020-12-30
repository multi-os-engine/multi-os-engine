package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]   MPSHandle
 * 
 * MPS resource identification
 * 
 * Most of the time, there is only one image and one or fewer states needed as
 *             input to a graph, so the order of the images and states passed to
 *             [MPSNNGraph encodeToCommandBuffer:sourceImages:] or
 *             [MPSNNGraph encodeToCommandBuffer:sourceImages:sourceStates:intermediateImages:destinationStates:]
 *             is clear. There is only one order. However, sometimes graphs have more than one
 *             input image or state. What order should they appear in the NSArray passed to
 *             these methods?
 * 
 *             Each MPSNNImageNode or MPSNNStateNode can be tagged with a MPSHandle. MPSNNGraph
 *             keeps track of these. You can request that the MPSNNGraph return them to you in
 *             an array in the same order as needed to encode the MPSNNGraph, using
 *             MPSNNGraph.sourceImageHandles and MPSNNGraph.sourceStateHandles.
 * 
 *             Example:
 *             [@code]
 *             [@interface] MyHandle : NSObject <MPSHandle>
 *                 // Add a method for my use to get the image needed based on the handle to it.
 *                 // This isn't part of the MPSHandle protocol, but we need it for MyEncodeGraph
 *                 // below. Since it is my code calling my object, we can add whatever we want like this.
 *                 -(MPSImage*__nonnull) image;    // return the MPSImage corresponding to the handle
 * 
 *                 // required by MPSHandle protocol
 *                 -(NSString * __nullable) label;
 * 
 *                 // MPSHandle implies NSSecureCoding too
 *                 +(BOOL) supportsSecureCoding;
 *                 - (void)encodeWithCoder:(NSCoder * __nonnull )aCoder;
 *                 - (nullable instancetype)initWithCoder:(NSCoder * __nonnull )aDecoder; // NS_DESIGNATED_INITIALIZER
 *             [@end]
 * 
 *             // Encode a graph to cmdBuf using handles for images
 *             // Here we assume that the MPSNNImageNodes that are graph inputs (not produced
 *             // by the graph) are tagged with a unique instance of MyHandle that can be used
 *             // to get the appropriate image for that node.
 *             static void MyEncodeGraph( MPSNNGraph * graph, id <MTLCommandBuffer> cmdBuf )
 *             {
 *                 @autoreleasepool{
 *                     // prepare an array of source images, using the handles
 *                     NSArray<MyHandle*> * handles = graph.sourceImageHandles;
 *                     unsigned long count = handles.count;
 *                     NSMutableArray<MPSImage*> * __nonnull images = [NSMutableArray arrayWithCapacity: count];
 *                     for( unsigned long i = 0; i < count; i++ )
 *                         images[i] = handles[i].image;
 * 
 *                     // encode the graph using the array
 *                     [ graph encodeToCommandBuffer: cmdBuf
 *                                      sourceImages: images ];
 *                 }
 *             }
 *             [@endcode]
 * 
 *             But what is a handle?  Here MPS is giving you enough rope with which to hang
 *             yourself. Don't panic! As long as your response is not to start tying nooses,
 *             you should be fine. It is just rope. More precisely, it is just a pointer to a
 *             NSObject. MPS doesn't know or care what it is or does, so long as it conforms
 *             to the MPSHandle protocol. What it does is entirely up to you. We imagine it
 *             will be an object that describes the data that you intend to pass later to the graph.
 *             It could be a file reference, or an input to your own software component that wraps
 *             the graph or even the MPSImage / MPSState that you plan to use.
 * 
 *                 Do take note of the NSSecureCoding requirement in the MPSHandle protocol, however.
 *                 This is needed if you attempt to use NSSecureCoding to serialize the MPSNNGraph.
 *                 Normal MPSImages and MPSStates don't do that part.
 * 
 *             Your application should be able to use the handle to locate / create the correct
 *             image / state or batch thereof to pass as input to the graph.  Handles are also
 *             used to disambiguate graph intermediate images and state outputs. They aren't used
 *             to disambiguate image results (see -[MPSNNGraph initWithDevice:resultImages:resultsAreNeeded:]
 *             as you should already know the ordering of outputs there. It is the same as what
 *             you asked for.
 * 
 *             Do take note of the NSSecureCoding requirement in the MPSHandle protocol, however.
 *             This is needed if you attempt to use NSSecureCoding to serialize the MPSNNGraph.
 *             Normal MPSImages and MPSStates don't do that part.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSHandle")
public interface MPSHandle extends NSSecureCoding {
    /**
     * A label to be attached to associated MTLResources for this node
     * 
     * @return     A human readable string for debugging purposes
     */
    @Generated
    @Selector("label")
    String label();
}