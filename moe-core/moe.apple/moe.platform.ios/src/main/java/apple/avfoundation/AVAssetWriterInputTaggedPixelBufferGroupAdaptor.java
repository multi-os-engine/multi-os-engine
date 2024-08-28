package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMTaggedBufferGroupRef;
import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVPixelBufferPoolRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAssetWriterInputTaggedPixelBufferGroupAdaptor
 * 
 * Defines an interface for appending tagged buffer groups packaged as CMTaggedBufferGroupRef objects to a single
 * AVAssetWriterInput object.
 * 
 * Instances of AVAssetWriterInputTaggedPixelBufferGroupAdaptor provide a CVPixelBufferPool that can be used to allocate
 * the pixel buffers of tagged buffer groups for writing to the output file. Using the provided pixel buffer pool for
 * buffer allocation is typically more efficient than appending pixel buffers allocated using a separate pool.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetWriterInputTaggedPixelBufferGroupAdaptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriterInputTaggedPixelBufferGroupAdaptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriterInputTaggedPixelBufferGroupAdaptor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVAssetWriterInputTaggedPixelBufferGroupAdaptor allocWithZone(VoidPtr zone);

    /**
     * appendTaggedPixelBufferGroup:withPresentationTime:
     * 
     * Appends a tagged buffer group to the receiver.
     * 
     * The receiver will retain the CMTaggedBufferGroup until it is done with it, and then release it. Do not modify a
     * CMTaggedBufferGroup or its contents after you have passed it to this method.
     * 
     * Before calling this method, you must ensure that the input that underlies the receiver is attached to an
     * AVAssetWriter via a prior call to -addInput: and that -startWriting has been called on the asset writer. It is an
     * error to invoke this method before starting a session (via -[AVAssetWriter startSessionAtSourceTime:]) or after
     * ending a session (via -[AVAssetWriter endSessionAtSourceTime:]).
     * 
     * In an AVAssetWriterInput instance creation with AVMediaTypeVideo, kVTCompressionPropertyKey_MVHEVCVideoLayerIDs
     * key must be specified as part of the dictionary given for AVVideoCompressionPropertiesKey. It sets video layer
     * IDs to a target multi-image video encoder. This method checks the values for kCMTagCategory_VideoLayerID tag in
     * tag collections of taggedPixelBufferGroup over the array values for kVTCompressionPropertyKey_MVHEVCVideoLayerIDs
     * key. An NSInvalidArgumentException will be raised if the video layer IDs mismatch between the value of
     * kVTCompressionPropertyKey_MVHEVCVideoLayerIDs in the AVVideoCompressionPropertiesKey sub-dictionary of the
     * input's outputSettings property and tag collections of taggedPixelBufferGroup.
     * 
     * Below is a sample code sketch focusing on data flow that illustrates how you might append a
     * taggedPixelBufferGroup instance.
     * // Set up an AVAssetWriterInput and AVAssetWriterInputTaggedPixelBufferGroupAdaptor instance
     * AVAssetWriterInput *assetWriterInput = [[AVAssetWriterInput alloc] initWithMediaType:AVMediaTypeVideo
     * outputSettings:@{
     * ..,
     * AVVideoCompressionPropertiesKey: @{ (NSString *)kVTCompressionPropertyKey_MVHEVCVideoLayerIDs : .. }}];
     * 
     * AVAssetWriterInputTaggedPixelBufferGroupAdaptor *assetWriterInputAdaptor =
     * [[AVAssetWriterInputTaggedPixelBufferGroupAdaptor alloc] initWithAssetWriterInput:assetWriterInput ..];
     * 
     * Later, when the writer input is ready for more media data, create and append a tagged buffer group containing one
     * or more pixel buffers and the exact tag values associated with kCMTagCategory_VideoLayerID being specified via
     * kVTCompressionPropertyKey_MVHEVCVideoLayerIDs.
     * // Set up tag collection buffers
     * CMTag tags[] = CMTagMakeWithSInt64Value(kCMTagCategory_VideoLayerID, ..);
     * CMTagCollectionCreate(.., tags, FigCountOf(tags), &tagCollection);
     * CFArrayAppendValue(tagCollectionArray, tagCollection);
     * 
     * // Set up pixel buffers
     * CVPixelBufferPoolCreatePixelBuffer(.., &pixelBuffer);
     * CFArrayAppendValue(pixelBufferArray, pixelBuffer);
     * 
     * // Append a CMTaggedBufferGroupRef instance to asset writer input
     * CMTaggedBufferGroupCreate(.., tagCollectionArray, pixelBufferArray, &taggedBufferGroup);
     * [assetWriterInputAdaptor appendTaggedPixelBufferGroup:taggedBufferGroup ..];
     * 
     * @param taggedPixelBufferGroup
     *                               The CMTaggedBufferGroup to be appended. All of the buffers in
     *                               taggedPixelBufferGroup should be CVPixelBuffers, and they should correspond to tag
     *                               collections that contain kCMTagCategory_VideoLayerID values matching the list set
     *                               using kVTCompressionPropertyKey_MVHEVCVideoLayerIDs. The pixel buffers should be
     *                               IOSurface-backed.
     * @param presentationTime
     *                               The presentation time for the tagged buffer group to be appended. This time will be
     *                               considered relative to the time passed to -[AVAssetWriter
     *                               startSessionAtSourceTime:] to determine the timing of the frame in the output file.
     * @return
     *         A BOOL value indicating success of appending the tagged buffer group. If a result of NO is returned,
     *         clients can check the value of AVAssetWriter.status to determine whether the writing operation completed,
     *         failed, or was cancelled. If the status is AVAssetWriterStatusFailed, AVAssetWriter.error will contain an
     *         instance of NSError that describes the failure.
     */
    @Generated
    @Selector("appendTaggedPixelBufferGroup:withPresentationTime:")
    public native boolean appendTaggedPixelBufferGroupWithPresentationTime(
            @NotNull CMTaggedBufferGroupRef taggedPixelBufferGroup, @ByValue CMTime presentationTime);

    /**
     * [@property] assetWriterInput
     * 
     * The asset writer input to which the receiver should append tagged buffer groups.
     */
    @Generated
    @Selector("assetWriterInput")
    @NotNull
    public native AVAssetWriterInput assetWriterInput();

    /**
     * assetWriterInputTaggedPixelBufferGroupAdaptorWithAssetWriterInput:sourcePixelBufferAttributes:
     * 
     * Creates a new tagged buffer adaptor to receive tagged buffer groups for writing to the output file.
     * 
     * In order to take advantage of the improved efficiency of appending buffers created from the adaptor's pixel
     * buffer pool, clients should specify pixel buffer attributes that most closely accommodate the source format of
     * the video frames being appended.
     * 
     * Pixel buffer attributes keys for the pixel buffer pool are defined in <CoreVideo/CVPixelBuffer.h>. To specify the
     * pixel format type, the pixelBufferAttributes dictionary should contain a value for
     * kCVPixelBufferPixelFormatTypeKey. For example, use [NSNumber numberWithInt:kCVPixelFormatType_32BGRA] for
     * 8-bit-per-channel BGRA. See the discussion under appendPixelBuffer:withPresentationTime: for advice on choosing a
     * pixel format.
     * 
     * Clients that do not need a pixel buffer pool for allocating buffers should set sourcePixelBufferAttributes to
     * nil.
     * 
     * This method throws an exception if the input is already attached to another asset writer input tagged buffer
     * group adaptor or if the input has already started writing (the asset writer has progressed beyond
     * AVAssetWriterStatusUnknown).
     * 
     * @param input
     *                                    An instance of AVAssetWriterInput to which the receiver should append tagged
     *                                    buffer groups. Currently, only asset writer inputs that accept media data of
     *                                    type AVMediaTypeVideo can be used to initialize a tagged buffer adaptor.
     * @param sourcePixelBufferAttributes
     *                                    Specifies the attributes of pixel buffers of tagged buffer groups that will be
     *                                    vended by the input's CVPixelBufferPool.
     * @return
     *         An instance of AVAssetWriterInputTaggedPixelBufferGroupAdaptor.
     */
    @Generated
    @Selector("assetWriterInputTaggedPixelBufferGroupAdaptorWithAssetWriterInput:sourcePixelBufferAttributes:")
    public static native AVAssetWriterInputTaggedPixelBufferGroupAdaptor assetWriterInputTaggedPixelBufferGroupAdaptorWithAssetWriterInputSourcePixelBufferAttributes(
            @NotNull AVAssetWriterInput input, @Nullable NSDictionary<String, ?> sourcePixelBufferAttributes);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAssetWriterInputTaggedPixelBufferGroupAdaptor init();

    /**
     * initWithAssetWriterInput:sourcePixelBufferAttributes:
     * 
     * Creates a new tagged buffer group adaptor to receive tagged buffer groups for writing to the output file.
     * 
     * In order to take advantage of the improved efficiency of appending buffers created from the adaptor's pixel
     * buffer pool, clients should specify pixel buffer attributes that most closely accommodate the source format of
     * the video frames of tagged buffer groups being appended.
     * 
     * Pixel buffer attributes keys for the pixel buffer pool are defined in <CoreVideo/CVPixelBuffer.h>. To specify the
     * pixel format type, the pixelBufferAttributes dictionary should contain a value for
     * kCVPixelBufferPixelFormatTypeKey. For example, use [NSNumber numberWithInt:kCVPixelFormatType_32BGRA] for
     * 8-bit-per-channel BGRA. See the discussion under appendPixelBuffer:withPresentationTime: in
     * AVAssetWriterInputPixelBufferAdaptor for advice on choosing a pixel format.
     * 
     * Clients that do not need a pixel buffer pool for allocating buffers should set sourcePixelBufferAttributes to
     * nil.
     * 
     * It is an error to initialize an instance of AVAssetWriterInputTaggedPixelBufferGroupAdaptor with an asset writer
     * input that is already attached to another instance of AVAssetWriterInputTaggedPixelBufferGroupAdaptor. It is also
     * an error to initialize an instance of AVAssetWriterInputTaggedPixelBufferGroupAdaptor with an asset writer input
     * whose asset writer has progressed beyond AVAssetWriterStatusUnknown.
     * 
     * @param input
     *                                    An instance of AVAssetWriterInput to which the receiver should append tagged
     *                                    buffer groups. In addition to the pixel buffer adaptor, asset writer inputs
     *                                    with media data of type AVMediaTypeVideo can be used to initialize a tagged
     *                                    buffer group adaptor.
     * @param sourcePixelBufferAttributes
     *                                    Specifies the attributes of pixel buffers of tagged buffer groups that will be
     *                                    vended by the input's CVPixelBufferPool.
     * @return
     *         An instance of AVAssetWriterInputTaggedPixelBufferGroupAdaptor.
     */
    @Generated
    @Selector("initWithAssetWriterInput:sourcePixelBufferAttributes:")
    public native AVAssetWriterInputTaggedPixelBufferGroupAdaptor initWithAssetWriterInputSourcePixelBufferAttributes(
            @NotNull AVAssetWriterInput input, @Nullable NSDictionary<String, ?> sourcePixelBufferAttributes);

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

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAssetWriterInputTaggedPixelBufferGroupAdaptor new_objc();

    /**
     * [@property] pixelBufferPool
     * 
     * A pixel buffer pool that will vend and efficiently recycle CVPixelBuffer objects of tagged buffer groups that can
     * be appended to the receiver.
     * 
     * For maximum efficiency, clients should create CVPixelBuffer objects of tagged buffer groups for
     * appendTaggedPixelBufferGroup:withPresentationTime: by using this pool with the
     * CVPixelBufferPoolCreatePixelBuffer() function.
     * 
     * The value of this property will be NULL before -[AVAssetWriter startWriting] is called on the associated
     * AVAssetWriter object. Clients should read this property after -[AVAssetWriter startWriting] calling to get a
     * non-NULL value.
     * 
     * This property is not key value observable.
     */
    @Generated
    @Selector("pixelBufferPool")
    @Nullable
    public native CVPixelBufferPoolRef pixelBufferPool();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] sourcePixelBufferAttributes
     * 
     * The pixel buffer attributes of pixel buffers that will be vended by the receiver's CVPixelBufferPool.
     * 
     * The value of this property is a dictionary containing pixel buffer attributes keys defined in
     * <CoreVideo/CVPixelBuffer.h>.
     */
    @Generated
    @Selector("sourcePixelBufferAttributes")
    @Nullable
    public native NSDictionary<String, ?> sourcePixelBufferAttributes();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}