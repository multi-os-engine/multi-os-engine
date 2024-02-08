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
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVCaptureStillImageOutput
 * 
 * AVCaptureStillImageOutput is a concrete subclass of AVCaptureOutput that can be used to capture high-quality still
 * images with accompanying metadata.
 * 
 * Instances of AVCaptureStillImageOutput can be used to capture, on demand, high quality snapshots from a realtime
 * capture source. Clients can request a still image for the current time using the
 * captureStillImageAsynchronouslyFromConnection:completionHandler: method. Clients can also configure still image
 * outputs to produce still images in specific image formats.
 * 
 * API-Since: 4.0
 * Deprecated-Since: 10.0
 * Deprecated-Message: Use AVCapturePhotoOutput instead.
 */
@Deprecated
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureStillImageOutput extends AVCaptureOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureStillImageOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureStillImageOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVCaptureStillImageOutput allocWithZone(VoidPtr zone);

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

    /**
     * jpegStillImageNSDataRepresentation:
     * 
     * Converts the still image data and metadata attachments in a JPEG sample buffer to an NSData representation.
     * 
     * This method returns an NSData representation of a JPEG still image sample buffer, merging the image data and Exif
     * metadata sample buffer attachments without recompressing the image. The returned NSData is suitable for writing
     * to disk.
     * 
     * @param jpegSampleBuffer
     *                         The sample buffer carrying JPEG image data, optionally with Exif metadata sample buffer
     *                         attachments. This method throws an NSInvalidArgumentException if jpegSampleBuffer is NULL
     *                         or not in the JPEG format.
     */
    @Nullable
    @Generated
    @Selector("jpegStillImageNSDataRepresentation:")
    public static native NSData jpegStillImageNSDataRepresentation(@NotNull CMSampleBufferRef jpegSampleBuffer);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVCaptureStillImageOutput new_objc();

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
     * [@property] automaticallyEnablesStillImageStabilizationWhenAvailable
     * 
     * Indicates whether the receiver should automatically use still image stabilization when necessary.
     * 
     * On a receiver where -isStillImageStabilizationSupported returns YES, image stabilization may be applied to reduce
     * blur commonly found in low light photos. When stabilization is enabled, still image captures incur additional
     * latency. The default value is YES when supported, NO otherwise. Setting this property throws an
     * NSInvalidArgumentException if -isStillImageStabilizationSupported returns NO.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("automaticallyEnablesStillImageStabilizationWhenAvailable")
    public native boolean automaticallyEnablesStillImageStabilizationWhenAvailable();

    /**
     * [@property] availableImageDataCVPixelFormatTypes
     * 
     * Indicates the supported image pixel formats that can be specified in outputSettings.
     * 
     * The value of this property is an NSArray of NSNumbers that can be used as values for the
     * kCVPixelBufferPixelFormatTypeKey in the receiver's outputSettings property. The first format in the returned list
     * is the most efficient output format.
     */
    @NotNull
    @Generated
    @Selector("availableImageDataCVPixelFormatTypes")
    public native NSArray<? extends NSNumber> availableImageDataCVPixelFormatTypes();

    /**
     * [@property] availableImageDataCodecTypes
     * 
     * Indicates the supported image codec formats that can be specified in outputSettings.
     * 
     * The value of this property is an NSArray of AVVideoCodecTypes that can be used as values for the AVVideoCodecKey
     * in the receiver's outputSettings property.
     */
    @NotNull
    @Generated
    @Selector("availableImageDataCodecTypes")
    public native NSArray<String> availableImageDataCodecTypes();

    /**
     * captureStillImageAsynchronouslyFromConnection:completionHandler:
     * 
     * Initiates an asynchronous still image capture, returning the result to a completion handler.
     * 
     * This method will return immediately after it is invoked, later calling the provided completion handler block when
     * image data is ready. If the request could not be completed, the error parameter will contain an NSError object
     * describing the failure.
     * 
     * Attachments to the image data sample buffer may contain metadata appropriate to the image data format. For
     * instance, a sample buffer containing JPEG data may carry a kCGImagePropertyExifDictionary as an attachment. See
     * <ImageIO/CGImageProperties.h> for a list of keys and value types.
     * 
     * Clients should not assume that the completion handler will be called on a specific thread.
     * 
     * Calls to captureStillImageAsynchronouslyFromConnection:completionHandler: are not synchronized with
     * AVCaptureDevice manual control completion handlers. Setting a device manual control, waiting for its completion,
     * then calling captureStillImageAsynchronouslyFromConnection:completionHandler: DOES NOT ensure that the still
     * image returned reflects your manual control change. It may be from an earlier time. You can compare your manual
     * control completion handler sync time to the returned still image's presentation time. You can retrieve the sample
     * buffer's pts using CMSampleBufferGetPresentationTimestamp(). If the still image has an earlier timestamp, your
     * manual control command does not apply to it.
     * 
     * @param connection
     *                   The AVCaptureConnection object from which to capture the still image.
     * @param handler
     *                   A block that will be called when the still image capture is complete. The block will be passed
     *                   a CMSampleBuffer object containing the image data or an NSError object if an image could not be
     *                   captured.
     */
    @Generated
    @Selector("captureStillImageAsynchronouslyFromConnection:completionHandler:")
    public native void captureStillImageAsynchronouslyFromConnectionCompletionHandler(
            @NotNull AVCaptureConnection connection,
            @NotNull @ObjCBlock(name = "call_captureStillImageAsynchronouslyFromConnectionCompletionHandler") Block_captureStillImageAsynchronouslyFromConnectionCompletionHandler handler);

    /**
     * captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:
     * 
     * Captures a still image bracket.
     * 
     * If you have not called -prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler: for
     * this still image bracket request, the bracket may not be taken immediately, as the receiver may internally need
     * to prepare resources.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoOutput capturePhotoWithSettings:delegate: instead.
     * 
     * @param connection
     *                   The connection through which the still image bracket should be captured.
     * @param settings
     *                   An array of AVCaptureBracketedStillImageSettings objects. All must be of the same kind of
     *                   AVCaptureBracketedStillImageSettings subclass, or an NSInvalidArgumentException is thrown.
     * @param handler
     *                   A user provided block that will be called asynchronously as each still image in the bracket is
     *                   captured. If the capture request is successful, the "sampleBuffer" parameter contains a valid
     *                   CMSampleBuffer, the "stillImageSettings" parameter contains the settings object corresponding
     *                   to this still image, and a nil "error" parameter. If the bracketed capture fails, sample buffer
     *                   is NULL and error is non-nil. If [settings count] exceeds -maxBracketedCaptureStillImageCount,
     *                   then AVErrorMaximumStillImageCaptureRequestsExceeded is returned. You should not assume that
     *                   the completion handler will be called on a specific thread.
     */
    @Deprecated
    @Generated
    @Selector("captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler:")
    public native void captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler(
            @NotNull AVCaptureConnection connection,
            @NotNull NSArray<? extends AVCaptureBracketedStillImageSettings> settings,
            @NotNull @ObjCBlock(name = "call_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler") Block_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler handler);

    @Generated
    @Selector("init")
    public native AVCaptureStillImageOutput init();

    /**
     * [@property] capturingStillImage
     * 
     * A boolean value that becomes true when a still image is being captured.
     * 
     * The value of this property is a BOOL that becomes true when a still image is being captured, and false when no
     * still image capture is underway. This property is key-value observable.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("isCapturingStillImage")
    public native boolean isCapturingStillImage();

    /**
     * [@property] highResolutionStillImageOutputEnabled
     * 
     * Indicates whether the receiver should emit still images at the highest resolution supported by its source
     * AVCaptureDevice's activeFormat.
     * 
     * By default, AVCaptureStillImageOutput emits images with the same dimensions as its source AVCaptureDevice's
     * activeFormat.formatDescription. However, if you set this property to YES, the receiver emits still images at its
     * source AVCaptureDevice's activeFormat.highResolutionStillImageDimensions. Note that if you enable video
     * stabilization (see AVCaptureConnection's preferredVideoStabilizationMode) for any output, the high resolution
     * still images emitted by AVCaptureStillImageOutput may be smaller by 10 or more percent.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isHighResolutionStillImageOutputEnabled")
    public native boolean isHighResolutionStillImageOutputEnabled();

    /**
     * [@property] highResolutionStillImageOutputEnabled
     * 
     * Indicates whether the receiver should emit still images at the highest resolution supported by its source
     * AVCaptureDevice's activeFormat.
     * 
     * By default, AVCaptureStillImageOutput emits images with the same dimensions as its source AVCaptureDevice's
     * activeFormat.formatDescription. However, if you set this property to YES, the receiver emits still images at its
     * source AVCaptureDevice's activeFormat.highResolutionStillImageDimensions. Note that if you enable video
     * stabilization (see AVCaptureConnection's preferredVideoStabilizationMode) for any output, the high resolution
     * still images emitted by AVCaptureStillImageOutput may be smaller by 10 or more percent.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setHighResolutionStillImageOutputEnabled:")
    public native void setHighResolutionStillImageOutputEnabled(boolean value);

    /**
     * [@property] lensStabilizationDuringBracketedCaptureEnabled
     * 
     * Indicates whether the receiver should use lens stabilization during bracketed captures.
     * 
     * On a receiver where -isLensStabilizationDuringBracketedCaptureSupported returns YES, lens stabilization may be
     * applied to the bracket to reduce blur commonly found in low light photos. When lens stabilization is enabled,
     * bracketed still image captures incur additional latency. Lens stabilization is more effective with
     * longer-exposure captures, and offers limited or no benefit for exposure durations shorter than 1/30 of a second.
     * It is possible that during the bracket, the lens stabilization module may run out of correction range and
     * therefore will not be active for every frame in the bracket. Each emitted CMSampleBuffer from the bracket will
     * have an attachment of kCMSampleBufferAttachmentKey_StillImageLensStabilizationInfo indicating additional
     * information about stabilization was applied to the buffer, if any. The default value of
     * -isLensStabilizationDuringBracketedCaptureEnabled is NO. This value will be set to NO when
     * -isLensStabilizationDuringBracketedCaptureSupported changes to NO. Setting this property throws an
     * NSInvalidArgumentException if -isLensStabilizationDuringBracketedCaptureSupported returns NO. This property is
     * key-value observable.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoOutput with AVCapturePhotoBracketSettings instead.
     */
    @Deprecated
    @Generated
    @Selector("isLensStabilizationDuringBracketedCaptureEnabled")
    public native boolean isLensStabilizationDuringBracketedCaptureEnabled();

    /**
     * [@property] lensStabilizationDuringBracketedCaptureEnabled
     * 
     * Indicates whether the receiver should use lens stabilization during bracketed captures.
     * 
     * On a receiver where -isLensStabilizationDuringBracketedCaptureSupported returns YES, lens stabilization may be
     * applied to the bracket to reduce blur commonly found in low light photos. When lens stabilization is enabled,
     * bracketed still image captures incur additional latency. Lens stabilization is more effective with
     * longer-exposure captures, and offers limited or no benefit for exposure durations shorter than 1/30 of a second.
     * It is possible that during the bracket, the lens stabilization module may run out of correction range and
     * therefore will not be active for every frame in the bracket. Each emitted CMSampleBuffer from the bracket will
     * have an attachment of kCMSampleBufferAttachmentKey_StillImageLensStabilizationInfo indicating additional
     * information about stabilization was applied to the buffer, if any. The default value of
     * -isLensStabilizationDuringBracketedCaptureEnabled is NO. This value will be set to NO when
     * -isLensStabilizationDuringBracketedCaptureSupported changes to NO. Setting this property throws an
     * NSInvalidArgumentException if -isLensStabilizationDuringBracketedCaptureSupported returns NO. This property is
     * key-value observable.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoOutput with AVCapturePhotoBracketSettings instead.
     */
    @Deprecated
    @Generated
    @Selector("setLensStabilizationDuringBracketedCaptureEnabled:")
    public native void setLensStabilizationDuringBracketedCaptureEnabled(boolean value);

    /**
     * [@property] lensStabilizationDuringBracketedCaptureSupported
     * 
     * Indicates whether the receiver supports lens stabilization during bracketed captures.
     * 
     * The receiver's lensStabilizationDuringBracketedCaptureEnabled property can only be set if this property returns
     * YES. Its value may change as the session's -sessionPreset or input device's -activeFormat changes. This read-only
     * property is key-value observable.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoOutput lensStabilizationDuringBracketedCaptureSupported instead.
     */
    @Deprecated
    @Generated
    @Selector("isLensStabilizationDuringBracketedCaptureSupported")
    public native boolean isLensStabilizationDuringBracketedCaptureSupported();

    /**
     * [@property] stillImageStabilizationActive
     * 
     * Indicates whether still image stabilization is in use for the current capture.
     * 
     * On a receiver where -isStillImageStabilizationSupported returns YES, and
     * automaticallyEnablesStillImageStabilizationWhenAvailable is set to YES, this property may be key-value observed,
     * or queried from inside your key-value observation callback for the @"capturingStillImage" property, to find out
     * if still image stabilization is being applied to the current capture.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isStillImageStabilizationActive")
    public native boolean isStillImageStabilizationActive();

    /**
     * [@property] stillImageStabilizationSupported
     * 
     * Indicates whether the receiver supports still image stabilization.
     * 
     * The receiver's automaticallyEnablesStillImageStabilizationWhenAvailable property can only be set if this property
     * returns YES. Its value may change as the session's -sessionPreset or input device's -activeFormat changes.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isStillImageStabilizationSupported")
    public native boolean isStillImageStabilizationSupported();

    /**
     * [@property] maxBracketedCaptureStillImageCount
     * 
     * Specifies the maximum number of still images that may be taken in a single bracket.
     * 
     * AVCaptureStillImageOutput can only satisfy a limited number of image requests in a single bracket without
     * exhausting system resources. The maximum number of still images that may be taken in a single bracket depends on
     * the size of the images being captured, and consequently may vary with AVCaptureSession -sessionPreset and
     * AVCaptureDevice -activeFormat. Some formats do not support bracketed capture and return a
     * maxBracketedCaptureStillImageCount of 0. This read-only property is key-value observable. If you exceed
     * -maxBracketedCaptureStillImageCount, then
     * -captureStillImageBracketAsynchronouslyFromConnection:withSettingsArray:completionHandler: fails and the
     * completionHandler is called [settings count] times with a NULL sample buffer and
     * AVErrorMaximumStillImageCaptureRequestsExceeded.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoOutput maxBracketedCapturePhotoCount instead.
     */
    @Deprecated
    @Generated
    @Selector("maxBracketedCaptureStillImageCount")
    @NUInt
    public native long maxBracketedCaptureStillImageCount();

    /**
     * [@property] outputSettings
     * 
     * Specifies the options the receiver uses to encode still images before they are delivered.
     * 
     * See AVVideoSettings.h for more information on how to construct an output settings dictionary.
     * 
     * On iOS, the only currently supported keys are AVVideoCodecKey and kCVPixelBufferPixelFormatTypeKey. Use
     * -availableImageDataCVPixelFormatTypes and -availableImageDataCodecTypes to determine what codec keys and pixel
     * formats are supported. AVVideoQualityKey is supported on iOS 6.0 and later and may only be used when
     * AVVideoCodecKey is set to AVVideoCodecTypeJPEG.
     */
    @NotNull
    @Generated
    @Selector("outputSettings")
    public native NSDictionary<String, ?> outputSettings();

    /**
     * prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler:
     * 
     * Allows the receiver to prepare resources in advance of capturing a still image bracket.
     * 
     * -maxBracketedCaptureStillImageCount tells you the maximum number of images that may be taken in a single bracket
     * given the current AVCaptureDevice/AVCaptureSession/AVCaptureStillImageOutput configuration. But before taking a
     * still image bracket, additional resources may need to be allocated. By calling
     * -prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler: first, you are able to
     * deterministically know when the receiver is ready to capture the bracket with the specified settings array.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use AVCapturePhotoOutput setPreparedPhotoSettingsArray:completionHandler: instead.
     * 
     * @param connection
     *                   The connection through which the still image bracket should be captured.
     * @param settings
     *                   An array of AVCaptureBracketedStillImageSettings objects. All must be of the same kind of
     *                   AVCaptureBracketedStillImageSettings subclass, or an NSInvalidArgumentException is thrown.
     * @param handler
     *                   A user provided block that will be called asynchronously once resources have successfully been
     *                   allocated for the specified bracketed capture operation. If sufficient resources could not be
     *                   allocated, the "prepared" parameter contains NO, and "error" parameter contains a non-nil error
     *                   value. If [settings count] exceeds -maxBracketedCaptureStillImageCount, then
     *                   AVErrorMaximumStillImageCaptureRequestsExceeded is returned. You should not assume that the
     *                   completion handler will be called on a specific thread.
     */
    @Deprecated
    @Generated
    @Selector("prepareToCaptureStillImageBracketFromConnection:withSettingsArray:completionHandler:")
    public native void prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler(
            @NotNull AVCaptureConnection connection,
            @NotNull NSArray<? extends AVCaptureBracketedStillImageSettings> settings,
            @NotNull @ObjCBlock(name = "call_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler") Block_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler handler);

    /**
     * [@property] automaticallyEnablesStillImageStabilizationWhenAvailable
     * 
     * Indicates whether the receiver should automatically use still image stabilization when necessary.
     * 
     * On a receiver where -isStillImageStabilizationSupported returns YES, image stabilization may be applied to reduce
     * blur commonly found in low light photos. When stabilization is enabled, still image captures incur additional
     * latency. The default value is YES when supported, NO otherwise. Setting this property throws an
     * NSInvalidArgumentException if -isStillImageStabilizationSupported returns NO.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setAutomaticallyEnablesStillImageStabilizationWhenAvailable:")
    public native void setAutomaticallyEnablesStillImageStabilizationWhenAvailable(boolean value);

    /**
     * [@property] outputSettings
     * 
     * Specifies the options the receiver uses to encode still images before they are delivered.
     * 
     * See AVVideoSettings.h for more information on how to construct an output settings dictionary.
     * 
     * On iOS, the only currently supported keys are AVVideoCodecKey and kCVPixelBufferPixelFormatTypeKey. Use
     * -availableImageDataCVPixelFormatTypes and -availableImageDataCodecTypes to determine what codec keys and pixel
     * formats are supported. AVVideoQualityKey is supported on iOS 6.0 and later and may only be used when
     * AVVideoCodecKey is set to AVVideoCodecTypeJPEG.
     */
    @Generated
    @Selector("setOutputSettings:")
    public native void setOutputSettings(@NotNull NSDictionary<String, ?> value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_captureStillImageAsynchronouslyFromConnectionCompletionHandler {
        @Generated
        void call_captureStillImageAsynchronouslyFromConnectionCompletionHandler(
                @Nullable CMSampleBufferRef imageDataSampleBuffer, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler {
        @Generated
        void call_captureStillImageBracketAsynchronouslyFromConnectionWithSettingsArrayCompletionHandler(
                @Nullable CMSampleBufferRef sampleBuffer,
                @Nullable AVCaptureBracketedStillImageSettings stillImageSettings, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler {
        @Generated
        void call_prepareToCaptureStillImageBracketFromConnectionWithSettingsArrayCompletionHandler(boolean prepared,
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
