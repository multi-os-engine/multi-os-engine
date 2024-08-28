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
import apple.avfoundation.protocol.AVCaptureVideoDataOutputSampleBufferDelegate;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.foundation.NSURL;
import apple.opaque.dispatch_queue_t;

/**
 * AVCaptureVideoDataOutput
 * 
 * AVCaptureVideoDataOutput is a concrete subclass of AVCaptureOutput that can be used to process uncompressed or
 * compressed frames from the video being captured.
 * 
 * Instances of AVCaptureVideoDataOutput produce video frames suitable for processing using other media APIs.
 * Applications can access the frames with the captureOutput:didOutputSampleBuffer:fromConnection: delegate method.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureVideoDataOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureVideoDataOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureVideoDataOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureVideoDataOutput allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureVideoDataOutput new_objc();

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
     * [@property] alwaysDiscardsLateVideoFrames
     * 
     * Specifies whether the receiver should always discard any video frame that is not processed before the next frame
     * is captured.
     * 
     * When the value of this property is YES, the receiver will immediately discard frames that are captured while the
     * dispatch queue handling existing frames is blocked in the captureOutput:didOutputSampleBuffer:fromConnection:
     * delegate method. When the value of this property is NO, delegates will be allowed more time to process old frames
     * before new frames are discarded, but application memory usage may increase significantly as a result. The default
     * value is YES.
     */
    @Generated
    @Selector("alwaysDiscardsLateVideoFrames")
    public native boolean alwaysDiscardsLateVideoFrames();

    /**
     * [@property] availableVideoCVPixelFormatTypes
     * 
     * Indicates the supported video pixel formats that can be specified in videoSettings.
     * 
     * The value of this property is an NSArray of NSNumbers that can be used as values for the
     * kCVPixelBufferPixelFormatTypeKey in the receiver's videoSettings property. The formats are listed in an
     * unspecified order. This list can may change if the activeFormat of the AVCaptureDevice connected to the receiver
     * changes.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("availableVideoCVPixelFormatTypes")
    public native NSArray<? extends NSNumber> availableVideoCVPixelFormatTypes();

    /**
     * [@property] availableVideoCodecTypes
     * 
     * Indicates the supported video codec formats that can be specified in videoSettings.
     * 
     * The value of this property is an NSArray of AVVideoCodecTypes that can be used as values for the AVVideoCodecKey
     * in the receiver's videoSettings property.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @Selector("availableVideoCodecTypes")
    public native NSArray<String> availableVideoCodecTypes();

    @Generated
    @Selector("init")
    public native AVCaptureVideoDataOutput init();

    /**
     * [@property] minFrameDuration
     * 
     * Specifies the minimum time interval between which the receiver should output consecutive video frames.
     * 
     * The value of this property is a CMTime specifying the minimum duration of each video frame output by the
     * receiver, placing a lower bound on the amount of time that should separate consecutive frames. This is equivalent
     * to the inverse of the maximum frame rate. A value of kCMTimeZero or kCMTimeInvalid indicates an unlimited maximum
     * frame rate. The default value is kCMTimeInvalid. As of iOS 5.0, minFrameDuration is deprecated. Use
     * AVCaptureConnection's videoMinFrameDuration property instead.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 5.0
     * Deprecated-Message: Use AVCaptureConnection's videoMinFrameDuration property instead.
     */
    @Generated
    @Deprecated
    @Selector("minFrameDuration")
    @ByValue
    public native CMTime minFrameDuration();

    /**
     * recommendedVideoSettingsForAssetWriterWithOutputFileType:
     * 
     * Specifies the recommended settings for use with an AVAssetWriterInput.
     * 
     * The value of this property is an NSDictionary containing values for compression settings keys defined in
     * AVVideoSettings.h. This dictionary is suitable for use as the "outputSettings" parameter when creating an
     * AVAssetWriterInput, such as,
     * 
     * [AVAssetWriterInput assetWriterInputWithMediaType:AVMediaTypeVideo outputSettings:outputSettings
     * sourceFormatHint:hint];
     * 
     * The dictionary returned contains all necessary keys and values needed by AVAssetWriter (see AVAssetWriterInput.h,
     * -initWithMediaType:outputSettings: for a more in depth discussion). For QuickTime movie and ISO file types, the
     * recommended video settings will produce output comparable to that of AVCaptureMovieFileOutput.
     * 
     * Note that the dictionary of settings is dependent on the current configuration of the receiver's AVCaptureSession
     * and its inputs. The settings dictionary may change if the session's configuration changes. As such, you should
     * configure your session first, then query the recommended video settings. As of iOS 8.3, movies produced with
     * these settings successfully import into the iOS camera roll and sync to and from like devices via iTunes.
     * 
     * API-Since: 7.0
     * 
     * @param outputFileType
     *                       Specifies the UTI of the file type to be written (see AVMediaFormat.h for a list of file
     *                       format UTIs).
     * @return
     *         A fully populated dictionary of keys and values that are compatible with AVAssetWriter.
     */
    @Nullable
    @Generated
    @Selector("recommendedVideoSettingsForAssetWriterWithOutputFileType:")
    public native NSDictionary<String, ?> recommendedVideoSettingsForAssetWriterWithOutputFileType(
            @NotNull String outputFileType);

    /**
     * [@property] sampleBufferCallbackQueue
     * 
     * The dispatch queue on which all sample buffer delegate methods will be called.
     * 
     * The value of this property is a dispatch_queue_t. The queue is set using the setSampleBufferDelegate:queue:
     * method.
     */
    @Nullable
    @Generated
    @Selector("sampleBufferCallbackQueue")
    public native dispatch_queue_t sampleBufferCallbackQueue();

    /**
     * [@property] sampleBufferDelegate
     * 
     * The receiver's delegate.
     * 
     * The value of this property is an object conforming to the AVCaptureVideoDataOutputSampleBufferDelegate protocol
     * that will receive sample buffers after they are captured. The delegate is set using the
     * setSampleBufferDelegate:queue: method.
     */
    @Nullable
    @Generated
    @Selector("sampleBufferDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVCaptureVideoDataOutputSampleBufferDelegate sampleBufferDelegate();

    /**
     * [@property] alwaysDiscardsLateVideoFrames
     * 
     * Specifies whether the receiver should always discard any video frame that is not processed before the next frame
     * is captured.
     * 
     * When the value of this property is YES, the receiver will immediately discard frames that are captured while the
     * dispatch queue handling existing frames is blocked in the captureOutput:didOutputSampleBuffer:fromConnection:
     * delegate method. When the value of this property is NO, delegates will be allowed more time to process old frames
     * before new frames are discarded, but application memory usage may increase significantly as a result. The default
     * value is YES.
     */
    @Generated
    @Selector("setAlwaysDiscardsLateVideoFrames:")
    public native void setAlwaysDiscardsLateVideoFrames(boolean value);

    /**
     * [@property] minFrameDuration
     * 
     * Specifies the minimum time interval between which the receiver should output consecutive video frames.
     * 
     * The value of this property is a CMTime specifying the minimum duration of each video frame output by the
     * receiver, placing a lower bound on the amount of time that should separate consecutive frames. This is equivalent
     * to the inverse of the maximum frame rate. A value of kCMTimeZero or kCMTimeInvalid indicates an unlimited maximum
     * frame rate. The default value is kCMTimeInvalid. As of iOS 5.0, minFrameDuration is deprecated. Use
     * AVCaptureConnection's videoMinFrameDuration property instead.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 5.0
     * Deprecated-Message: Use AVCaptureConnection's videoMinFrameDuration property instead.
     */
    @Generated
    @Deprecated
    @Selector("setMinFrameDuration:")
    public native void setMinFrameDuration(@ByValue CMTime value);

    /**
     * setSampleBufferDelegate:queue:
     * 
     * Sets the receiver's delegate that will accept captured buffers and dispatch queue on which the delegate will be
     * called.
     * 
     * When a new video sample buffer is captured it will be vended to the sample buffer delegate using the
     * captureOutput:didOutputSampleBuffer:fromConnection: delegate method. All delegate methods will be called on the
     * specified dispatch queue. If the queue is blocked when new frames are captured, those frames will be
     * automatically dropped at a time determined by the value of the alwaysDiscardsLateVideoFrames property. This
     * allows clients to process existing frames on the same queue without having to manage the potential memory usage
     * increases that would otherwise occur when that processing is unable to keep up with the rate of incoming frames.
     * If their frame processing is consistently unable to keep up with the rate of incoming frames, clients should
     * consider using the minFrameDuration property, which will generally yield better performance characteristics and
     * more consistent frame rates than frame dropping alone.
     * 
     * Clients that need to minimize the chances of frames being dropped should specify a queue on which a sufficiently
     * small amount of processing is being done outside of receiving sample buffers. However, if such clients migrate
     * extra processing to another queue, they are responsible for ensuring that memory usage does not grow without
     * bound from frames that have not been processed.
     * 
     * A serial dispatch queue must be used to guarantee that video frames will be delivered in order. The
     * sampleBufferCallbackQueue parameter may not be NULL, except when setting the sampleBufferDelegate to nil.
     * 
     * @param sampleBufferDelegate
     *                                  An object conforming to the AVCaptureVideoDataOutputSampleBufferDelegate
     *                                  protocol that will receive sample buffers after they are captured.
     * @param sampleBufferCallbackQueue
     *                                  A dispatch queue on which all sample buffer delegate methods will be called.
     */
    @Generated
    @Selector("setSampleBufferDelegate:queue:")
    public native void setSampleBufferDelegateQueue(
            @Nullable @Mapped(ObjCObjectMapper.class) AVCaptureVideoDataOutputSampleBufferDelegate sampleBufferDelegate,
            @Nullable dispatch_queue_t sampleBufferCallbackQueue);

    /**
     * [@property] videoSettings
     * 
     * Specifies the settings used to decode or re-encode video before it is output by the receiver.
     * 
     * See AVVideoSettings.h for more information on how to construct a video settings dictionary. To receive samples in
     * their device native format, set this property to an empty dictionary (i.e. [NSDictionary dictionary]). To receive
     * samples in a default uncompressed format, set this property to nil. Note that after this property is set to nil,
     * subsequent querying of this property will yield a non-nil dictionary reflecting the settings used by the
     * AVCaptureSession's current sessionPreset.
     * 
     * On iOS versions prior to iOS 16.0, the only supported key is kCVPixelBufferPixelFormatTypeKey. Use
     * -availableVideoCVPixelFormatTypes for the list of supported pixel formats. For apps linked on or after iOS 16.0,
     * kCVPixelBufferPixelFormatTypeKey, kCVPixelBufferWidthKey, and kCVPixelBufferHeightKey are supported. The width
     * and height must match the videoOrientation specified on the output's AVCaptureConnection or an
     * NSInvalidArgumentException is thrown. The aspect ratio of width and height must match the aspect ratio of the
     * source's activeFormat (corrected for the connection's videoOrientation) or an NSInvalidArgumentException is
     * thrown. If width or height exceeds the source's activeFormat's width or height, an NSInvalidArgumentException is
     * thrown. Changing width and height when deliversPreviewSizedOutputBuffers is set to YES is not supported and
     * throws an NSInvalidArgumentException.
     */
    @Generated
    @Selector("setVideoSettings:")
    public native void setVideoSettings(NSDictionary<String, ?> value);

    /**
     * [@property] videoSettings
     * 
     * Specifies the settings used to decode or re-encode video before it is output by the receiver.
     * 
     * See AVVideoSettings.h for more information on how to construct a video settings dictionary. To receive samples in
     * their device native format, set this property to an empty dictionary (i.e. [NSDictionary dictionary]). To receive
     * samples in a default uncompressed format, set this property to nil. Note that after this property is set to nil,
     * subsequent querying of this property will yield a non-nil dictionary reflecting the settings used by the
     * AVCaptureSession's current sessionPreset.
     * 
     * On iOS versions prior to iOS 16.0, the only supported key is kCVPixelBufferPixelFormatTypeKey. Use
     * -availableVideoCVPixelFormatTypes for the list of supported pixel formats. For apps linked on or after iOS 16.0,
     * kCVPixelBufferPixelFormatTypeKey, kCVPixelBufferWidthKey, and kCVPixelBufferHeightKey are supported. The width
     * and height must match the videoOrientation specified on the output's AVCaptureConnection or an
     * NSInvalidArgumentException is thrown. The aspect ratio of width and height must match the aspect ratio of the
     * source's activeFormat (corrected for the connection's videoOrientation) or an NSInvalidArgumentException is
     * thrown. If width or height exceeds the source's activeFormat's width or height, an NSInvalidArgumentException is
     * thrown. Changing width and height when deliversPreviewSizedOutputBuffers is set to YES is not supported and
     * throws an NSInvalidArgumentException.
     */
    @Generated
    @Selector("videoSettings")
    public native NSDictionary<String, ?> videoSettings();

    /**
     * availableVideoCodecTypesForAssetWriterWithOutputFileType:
     * 
     * Specifies the available video codecs for use with AVAssetWriter and a given file type.
     * 
     * This method allows you to query the available video codecs that may be used when specifying an AVVideoCodecKey in
     * -recommendedVideoSettingsForVideoCodecType:assetWriterOutputFileType:. When specifying an outputFileType of
     * AVFileTypeQuickTimeMovie, video codecs are ordered identically to -[AVCaptureMovieFileOutput
     * availableVideoCodecTypes].
     * 
     * API-Since: 11.0
     * 
     * @param outputFileType
     *                       Specifies the UTI of the file type to be written (see AVMediaFormat.h for a list of file
     *                       format UTIs).
     * @return
     *         An array of video codecs; see AVVideoSettings.h for a full list.
     */
    @NotNull
    @Generated
    @Selector("availableVideoCodecTypesForAssetWriterWithOutputFileType:")
    public native NSArray<String> availableVideoCodecTypesForAssetWriterWithOutputFileType(
            @NotNull String outputFileType);

    /**
     * recommendedVideoSettingsForVideoCodecType:assetWriterOutputFileType:
     * 
     * Specifies the recommended settings for a particular video codec type, to be used with an AVAssetWriterInput.
     * 
     * The value of this property is an NSDictionary containing values for compression settings keys defined in
     * AVVideoSettings.h. This dictionary is suitable for use as the "outputSettings" parameter when creating an
     * AVAssetWriterInput, such as,
     * 
     * [AVAssetWriterInput assetWriterInputWithMediaType:AVMediaTypeVideo outputSettings:outputSettings
     * sourceFormatHint:hint];
     * 
     * The dictionary returned contains all necessary keys and values needed by AVAssetWriter (see AVAssetWriterInput.h,
     * -initWithMediaType:outputSettings: for a more in depth discussion). For QuickTime movie and ISO file types, the
     * recommended video settings will produce output comparable to that of AVCaptureMovieFileOutput.
     * 
     * The videoCodecType string provided must be present in the
     * availableVideoCodecTypesForAssetWriterWithOutputFileType: array, or an NSInvalidArgumentException is thrown.
     * 
     * Note that the dictionary of settings is dependent on the current configuration of the receiver's AVCaptureSession
     * and its inputs. The settings dictionary may change if the session's configuration changes. As such, you should
     * configure your session first, then query the recommended video settings. As of iOS 8.3, movies produced with
     * these settings successfully import into the iOS camera roll and sync to and from like devices via iTunes.
     * 
     * API-Since: 11.0
     * 
     * @param videoCodecType
     *                       Specifies the desired AVVideoCodecKey to be used for compression (see AVVideoSettings.h).
     * @param outputFileType
     *                       Specifies the UTI of the file type to be written (see AVMediaFormat.h for a list of file
     *                       format UTIs).
     * @return
     *         A fully populated dictionary of keys and values that are compatible with AVAssetWriter.
     */
    @Nullable
    @Generated
    @Selector("recommendedVideoSettingsForVideoCodecType:assetWriterOutputFileType:")
    public native NSDictionary<String, ?> recommendedVideoSettingsForVideoCodecTypeAssetWriterOutputFileType(
            @NotNull String videoCodecType, @NotNull String outputFileType);

    /**
     * [@property] automaticallyConfiguresOutputBufferDimensions
     * 
     * Indicates whether the receiver automatically configures the size of output buffers.
     * 
     * Default value is YES. In most configurations, AVCaptureVideoDataOutput delivers full-resolution buffers, that is,
     * buffers with the same dimensions as the source AVCaptureDevice's activeFormat's videoDimensions. When this
     * property is set to YES, the receiver is free to configure the dimensions of the buffers delivered to
     * -captureOutput:didOutputSampleBuffer:fromConnection:, such that they are a smaller preview size (roughly the size
     * of the screen). For instance, when the AVCaptureSession's sessionPreset is set to AVCaptureSessionPresetPhoto, it
     * is assumed that video data output buffers are being delivered as a preview proxy. Likewise, if an
     * AVCapturePhotoOutput is present in the session with livePhotoCaptureEnabled, it is assumed that video data output
     * is being used for photo preview, and thus preview-sized buffers are a better choice than full-res buffers. You
     * can query deliversPreviewSizedOutputBuffers to find out whether automatic configuration of output buffer
     * dimensions is currently downscaling buffers to a preview size. You can also query the videoSettings property to
     * find out the exact width and height being delivered. If you wish to manually set
     * deliversPreviewSizedOutputBuffers, you must first set automaticallyConfiguresOutputBufferDimensions to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("automaticallyConfiguresOutputBufferDimensions")
    public native boolean automaticallyConfiguresOutputBufferDimensions();

    /**
     * [@property] deliversPreviewSizedOutputBuffers
     * 
     * Indicates whether the receiver is currently configured to deliver preview sized buffers.
     * 
     * If you wish to manually set deliversPreviewSizedOutputBuffers, you must first set
     * automaticallyConfiguresOutputBufferDimensions to NO. When deliversPreviewSizedOutputBuffers is set to YES, auto
     * focus, exposure, and white balance changes are quicker. AVCaptureVideoDataOutput assumes that the buffers are
     * being used for on-screen preview rather than recording.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("deliversPreviewSizedOutputBuffers")
    public native boolean deliversPreviewSizedOutputBuffers();

    /**
     * [@property] automaticallyConfiguresOutputBufferDimensions
     * 
     * Indicates whether the receiver automatically configures the size of output buffers.
     * 
     * Default value is YES. In most configurations, AVCaptureVideoDataOutput delivers full-resolution buffers, that is,
     * buffers with the same dimensions as the source AVCaptureDevice's activeFormat's videoDimensions. When this
     * property is set to YES, the receiver is free to configure the dimensions of the buffers delivered to
     * -captureOutput:didOutputSampleBuffer:fromConnection:, such that they are a smaller preview size (roughly the size
     * of the screen). For instance, when the AVCaptureSession's sessionPreset is set to AVCaptureSessionPresetPhoto, it
     * is assumed that video data output buffers are being delivered as a preview proxy. Likewise, if an
     * AVCapturePhotoOutput is present in the session with livePhotoCaptureEnabled, it is assumed that video data output
     * is being used for photo preview, and thus preview-sized buffers are a better choice than full-res buffers. You
     * can query deliversPreviewSizedOutputBuffers to find out whether automatic configuration of output buffer
     * dimensions is currently downscaling buffers to a preview size. You can also query the videoSettings property to
     * find out the exact width and height being delivered. If you wish to manually set
     * deliversPreviewSizedOutputBuffers, you must first set automaticallyConfiguresOutputBufferDimensions to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAutomaticallyConfiguresOutputBufferDimensions:")
    public native void setAutomaticallyConfiguresOutputBufferDimensions(boolean value);

    /**
     * [@property] deliversPreviewSizedOutputBuffers
     * 
     * Indicates whether the receiver is currently configured to deliver preview sized buffers.
     * 
     * If you wish to manually set deliversPreviewSizedOutputBuffers, you must first set
     * automaticallyConfiguresOutputBufferDimensions to NO. When deliversPreviewSizedOutputBuffers is set to YES, auto
     * focus, exposure, and white balance changes are quicker. AVCaptureVideoDataOutput assumes that the buffers are
     * being used for on-screen preview rather than recording.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDeliversPreviewSizedOutputBuffers:")
    public native void setDeliversPreviewSizedOutputBuffers(boolean value);

    /**
     * recommendedVideoSettingsForVideoCodecType:assetWriterOutputFileType:outputFileURL:
     * 
     * Specifies the recommended settings for a particular video codec type with output file URL, to be used with an
     * AVAssetWriterInput.
     * 
     * The value of this property is an NSDictionary containing values for compression settings keys defined in
     * AVVideoSettings.h. This dictionary is suitable for use as the "outputSettings" parameter when creating an
     * AVAssetWriterInput, such as,
     * 
     * [AVAssetWriterInput assetWriterInputWithMediaType:AVMediaTypeVideo outputSettings:outputSettings
     * sourceFormatHint:hint];
     * 
     * The dictionary returned contains all necessary keys and values needed by AVAssetWriter (see AVAssetWriterInput.h,
     * -initWithMediaType:outputSettings: for a more in depth discussion). For QuickTime movie and ISO file types, the
     * recommended video settings will produce output comparable to that of AVCaptureMovieFileOutput.
     * 
     * The videoCodecType string provided must be present in the
     * availableVideoCodecTypesForAssetWriterWithOutputFileType: array, or an NSInvalidArgumentException is thrown.
     * 
     * Note that the dictionary of settings is dependent on the current configuration of the receiver's AVCaptureSession
     * and its inputs. The settings dictionary may change if the session's configuration changes. As such, you should
     * configure your session first, then query the recommended video settings. As of iOS 8.3, movies produced with
     * these settings successfully import into the iOS camera roll and sync to and from like devices via iTunes.
     * 
     * API-Since: 17.0
     * 
     * @param videoCodecType
     *                       Specifies the desired AVVideoCodecKey to be used for compression (see AVVideoSettings.h).
     * @param outputFileType
     *                       Specifies the UTI of the file type to be written (see AVMediaFormat.h for a list of file
     *                       format UTIs).
     * @param outputFileURL
     *                       Specifies the output URL of the file to be written.
     * 
     *                       If you wish to capture onto an external storage device get an externalStorageDevice of type
     *                       AVExternalStorageDevice (as defined in AVExternalStorageDevice.h):
     *                       [AVExternalStorageDeviceDiscoverySession sharedSession] externalStorageDevices]
     * 
     *                       Then use [externalStorageDevice nextAvailableURLsWithPathExtensions:pathExtensions
     *                       error:&error] to get the output file URL.
     * 
     * @return
     *         A fully populated dictionary of keys and values that are compatible with AVAssetWriter.
     */
    @Generated
    @Selector("recommendedVideoSettingsForVideoCodecType:assetWriterOutputFileType:outputFileURL:")
    @Nullable
    public native NSDictionary<String, ?> recommendedVideoSettingsForVideoCodecTypeAssetWriterOutputFileTypeOutputFileURL(
            @NotNull String videoCodecType, @NotNull String outputFileType, @Nullable NSURL outputFileURL);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
