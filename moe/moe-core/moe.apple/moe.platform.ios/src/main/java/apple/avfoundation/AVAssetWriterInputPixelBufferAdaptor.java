/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVBufferRef;
import apple.corevideo.opaque.CVPixelBufferPoolRef;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class AVAssetWriterInputPixelBufferAdaptor
 * @abstract
 * Defines an interface for appending video samples packaged as CVPixelBuffer objects to a single AVAssetWriterInput object.
 * 
 * @discussion
 * Instances of AVAssetWriterInputPixelBufferAdaptor provide a CVPixelBufferPool that can be used to allocate pixel buffers for writing to the output file.  Using the provided pixel buffer pool for buffer allocation is typically more efficient than appending pixel buffers allocated using a separate pool.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetWriterInputPixelBufferAdaptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetWriterInputPixelBufferAdaptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetWriterInputPixelBufferAdaptor alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * @method assetWriterInputPixelBufferAdaptorWithAssetWriterInput:sourcePixelBufferAttributes:
     * @abstract
     * Creates a new pixel buffer adaptor to receive pixel buffers for writing to the output file.
     * 
     * @param input
     * An instance of AVAssetWriterInput to which the receiver should append pixel buffers.  Currently, only asset writer inputs that accept media data of type AVMediaTypeVideo can be used to initialize a pixel buffer adaptor.
     * @param sourcePixelBufferAttributes
     * Specifies the attributes of pixel buffers that will be vended by the input's CVPixelBufferPool.
     * @result
     * An instance of AVAssetWriterInputPixelBufferAdaptor.
     * 
     * @discussion
     * In order to take advantage of the improved efficiency of appending buffers created from the adaptor's pixel buffer pool, clients should specify pixel buffer attributes that most closely accommodate the source format of the video frames being appended.
     * 
     * Pixel buffer attributes keys for the pixel buffer pool are defined in <CoreVideo/CVPixelBuffer.h>. To specify the pixel format type, the pixelBufferAttributes dictionary should contain a value for kCVPixelBufferPixelFormatTypeKey.  For example, use [NSNumber numberWithInt:kCVPixelFormatType_32BGRA] for 8-bit-per-channel BGRA. See the discussion under appendPixelBuffer:withPresentationTime: for advice on choosing a pixel format.
     * 
     * Clients that do not need a pixel buffer pool for allocating buffers should set sourcePixelBufferAttributes to nil.
     * 
     * It is an error to initialize an instance of AVAssetWriterInputPixelBufferAdaptor with a sample buffer input that is already attached to another instance of AVAssetWriterInputPixelBufferAdaptor.
     */
    @Generated
    @Selector("assetWriterInputPixelBufferAdaptorWithAssetWriterInput:sourcePixelBufferAttributes:")
    public static native AVAssetWriterInputPixelBufferAdaptor assetWriterInputPixelBufferAdaptorWithAssetWriterInputSourcePixelBufferAttributes(
            AVAssetWriterInput input, NSDictionary<String, ?> sourcePixelBufferAttributes);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @method appendPixelBuffer:withPresentationTime:
     * @abstract
     * Appends a pixel buffer to the receiver.
     * 
     * @param pixelBuffer
     * The CVPixelBuffer to be appended.
     * @param presentationTime
     * The presentation time for the pixel buffer to be appended.  This time will be considered relative to the time passed to -[AVAssetWriter startSessionAtSourceTime:] to determine the timing of the frame in the output file.
     * @result
     * A BOOL value indicating success of appending the pixel buffer. If a result of NO is returned, clients can check the value of AVAssetWriter.status to determine whether the writing operation completed, failed, or was cancelled.  If the status is AVAssetWriterStatusFailed, AVAsset.error will contain an instance of NSError that describes the failure.
     * 
     * @discussion
     * The receiver will retain the CVPixelBuffer until it is done with it, and then release it.  Do not modify a CVPixelBuffer or its contents after you have passed it to this method.
     * 
     * For optimal performance the format of the pixel buffer should match one of the native formats supported by the selected video encoder. Below are some recommendations:
     * 
     * The H.264 encoder natively supports kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange and kCVPixelFormatType_420YpCbCr8BiPlanarFullRange, which should be used with video and full range input respectively. The JPEG encoder on iOS natively supports kCVPixelFormatType_422YpCbCr8FullRange. For other video codecs on OSX, kCVPixelFormatType_422YpCbCr8 is the preferred pixel format for video and is generally the most performant when encoding. If you need to work in the RGB domain then kCVPixelFormatType_32BGRA is recommended on iOS and kCVPixelFormatType_32ARGB is recommended on OSX.
     * 
     * Pixel buffers not in a natively supported format will be converted internally prior to encoding when possible. Pixel format conversions within the same range (video or full) are generally faster than conversions between different ranges.
     * 
     * The ProRes encoders can preserve high bit depth sources, supporting up to 12bits/ch. ProRes 4444 can contain a mathematically lossless alpha channel and it doesn't do any chroma subsampling. This makes ProRes 4444 ideal for quality critical applications. If you are working with 8bit sources ProRes is also a good format to use due to its high image quality. Use either of the recommended pixel formats above. Note that RGB pixel formats by definition have 4:4:4 chroma sampling.
     * 
     * 	If you are working with high bit depth sources the following yuv pixel formats are recommended when encoding to ProRes: kCVPixelFormatType_4444AYpCbCr16, kCVPixelFormatType_422YpCbCr16, and kCVPixelFormatType_422YpCbCr10. When working in the RGB domain kCVPixelFormatType_64ARGB is recommended. Scaling and color matching are not currently supported when using AVAssetWriter with any of these high bit depth pixel formats. Please make sure that your track's output settings dictionary specifies the same width and height as the buffers you will be appending. Do not include AVVideoScalingModeKey or AVVideoColorPropertiesKey.
     * 
     * Before calling this method, you must ensure that the input that underlies the receiver is attached to an AVAssetWriter via a prior call to -addInput: and that -startWriting has been called on the asset writer.  It is an error to invoke this method before starting a session (via -[AVAssetWriter startSessionAtSourceTime:]) or after ending a session (via -[AVAssetWriter endSessionAtSourceTime:]).
     */
    @Generated
    @Selector("appendPixelBuffer:withPresentationTime:")
    public native boolean appendPixelBufferWithPresentationTime(CVBufferRef pixelBuffer,
            @ByValue CMTime presentationTime);

    /**
     * @property assetWriterInput
     * @abstract
     * The asset writer input to which the receiver should append pixel buffers.
     */
    @Generated
    @Selector("assetWriterInput")
    public native AVAssetWriterInput assetWriterInput();

    @Generated
    @Selector("init")
    public native AVAssetWriterInputPixelBufferAdaptor init();

    /**
     * @method initWithAssetWriterInput:sourcePixelBufferAttributes:
     * @abstract
     * Creates a new pixel buffer adaptor to receive pixel buffers for writing to the output file.
     * 
     * @param input
     * An instance of AVAssetWriterInput to which the receiver should append pixel buffers.  Currently, only asset writer inputs that accept media data of type AVMediaTypeVideo can be used to initialize a pixel buffer adaptor.
     * @param sourcePixelBufferAttributes
     * Specifies the attributes of pixel buffers that will be vended by the input's CVPixelBufferPool.
     * @result
     * An instance of AVAssetWriterInputPixelBufferAdaptor.
     * 
     * @discussion
     * In order to take advantage of the improved efficiency of appending buffers created from the adaptor's pixel buffer pool, clients should specify pixel buffer attributes that most closely accommodate the source format of the video frames being appended.
     * 
     * Pixel buffer attributes keys for the pixel buffer pool are defined in <CoreVideo/CVPixelBuffer.h>. To specify the pixel format type, the pixelBufferAttributes dictionary should contain a value for kCVPixelBufferPixelFormatTypeKey.  For example, use [NSNumber numberWithInt:kCVPixelFormatType_32BGRA] for 8-bit-per-channel BGRA. See the discussion under appendPixelBuffer:withPresentationTime: for advice on choosing a pixel format.
     * 
     * Clients that do not need a pixel buffer pool for allocating buffers should set sourcePixelBufferAttributes to nil.
     * 
     * It is an error to initialize an instance of AVAssetWriterInputPixelBufferAdaptor with an asset writer input that is already attached to another instance of AVAssetWriterInputPixelBufferAdaptor.  It is also an error to initialize an instance of AVAssetWriterInputPixelBufferAdaptor with an asset writer input whose asset writer has progressed beyond AVAssetWriterStatusUnknown.
     */
    @Generated
    @Selector("initWithAssetWriterInput:sourcePixelBufferAttributes:")
    public native AVAssetWriterInputPixelBufferAdaptor initWithAssetWriterInputSourcePixelBufferAttributes(
            AVAssetWriterInput input, NSDictionary<String, ?> sourcePixelBufferAttributes);

    /**
     * @property pixelBufferPool
     * @abstract
     * A pixel buffer pool that will vend and efficiently recycle CVPixelBuffer objects that can be appended to the receiver.
     * 
     * @discussion
     * For maximum efficiency, clients should create CVPixelBuffer objects for appendPixelBuffer:withPresentationTime: by using this pool with the CVPixelBufferPoolCreatePixelBuffer() function.
     * 
     * The value of this property will be NULL before -[AVAssetWriter startWriting] is called on the associated AVAssetWriter object.
     * 
     * This property is key value observable.
     */
    @Generated
    @Selector("pixelBufferPool")
    public native CVPixelBufferPoolRef pixelBufferPool();

    /**
     * @property sourcePixelBufferAttributes
     * @abstract
     * The pixel buffer attributes of pixel buffers that will be vended by the receiver's CVPixelBufferPool.
     * 
     * @discussion
     * The value of this property is a dictionary containing pixel buffer attributes keys defined in <CoreVideo/CVPixelBuffer.h>.
     */
    @Generated
    @Selector("sourcePixelBufferAttributes")
    public native NSDictionary<String, ?> sourcePixelBufferAttributes();
}
