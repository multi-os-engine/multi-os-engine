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
import apple.avfoundation.protocol.AVVideoCompositing;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetImageGenerator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetImageGenerator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetImageGenerator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetImageGenerator allocWithZone(VoidPtr zone);

    /**
     * assetImageGeneratorWithAsset:
     * <p>
     * Returns an instance of AVAssetImageGenerator for use with the specified asset.
     * <p>
     * This method may succeed even if the asset possesses no visual tracks at the time of initialization.
     * Clients may wish to test whether an asset has any tracks with the visual characteristic via
     * -[AVAsset tracksWithMediaCharacteristic:].
     * <p>
     * Note also that assets that belong to a mutable subclass of AVAsset, AVMutableComposition or AVMutableMovie,
     * may gain visual tracks after initialization of an associated AVAssetImageGenerator.
     * <p>
     * However, the results of image generation are undefined if mutations of the asset occur while images
     * are being generated.
     * <p>
     * AVAssetImageGenerator will use the default enabled video track(s) to generate images.
     *
     * @param asset The asset from which images will be extracted.
     * @return An instance of AVAssetImageGenerator
     */
    @Generated
    @Selector("assetImageGeneratorWithAsset:")
    public static native AVAssetImageGenerator assetImageGeneratorWithAsset(AVAsset asset);

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
    public static native AVAssetImageGenerator new_objc();

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
     * Specifies the aperture mode for the generated image. Default is AVAssetImageGeneratorApertureModeCleanAperture.
     */
    @Generated
    @Selector("apertureMode")
    public native String apertureMode();

    /**
     * Specifies whether or not to apply the track's preferredTransform (see -[AVAssetTrack preferredTransform]) when
     * extracting an image from the asset.
     * Default is NO. Only rotation by 90, 180, or 270 degrees is supported.
     */
    @Generated
    @Selector("appliesPreferredTrackTransform")
    public native boolean appliesPreferredTrackTransform();

    /**
     * Indicates the instance of AVAsset with which the AVAssetImageGenerator was initialized
     */
    @Generated
    @Selector("asset")
    public native AVAsset asset();

    /**
     * cancelAllCGImageGeneration
     * <p>
     * Cancels all outstanding image generation requests.
     * <p>
     * Calls the handler block with AVAssetImageGeneratorCancelled for each image time in every previous invocation of
     * -generateCGImagesAsynchronouslyForTimes:completionHandler:
     * for which images have not yet been supplied.
     */
    @Generated
    @Selector("cancelAllCGImageGeneration")
    public native void cancelAllCGImageGeneration();

    /**
     * copyCGImageAtTime:actualTime:error:
     * <p>
     * Returns a CFRetained CGImageRef for an asset at or near the specified time.
     * <p>
     * Returns the CGImage synchronously. Ownership follows the Create Rule.
     * <p>
     * Because of the nature of timed audiovisual media, generating an image may take significant time.
     * AVAssetImageGenerator may have to block the calling thread in order to do so. In order to avoid blocking, clients
     * can use -generateCGImagesAsynchronouslyForTimes:completionHandler: to request that one or more images be
     * generated asynchronously and to be notified when they become available.
     * <p>
     * On iOS and tvOS, it is particularly important to avoid blocking. To preserve responsiveness, a synchronous
     * request that blocks for too long (eg, a request to generate an image from an asset on a slow HTTP server) may
     * lead to media services being reset.
     *
     * @param requestedTime The time at which the image of the asset is to be created.
     * @param actualTime    A pointer to a CMTime to receive the time at which the image was actually generated. If you
     *                      are not interested
     *                      in this information, pass NULL.
     * @param outError      An error object describing the reason for failure, in the event that this method returns
     *                      NULL.
     * @return A CGImageRef.
     */
    @Generated
    @Selector("copyCGImageAtTime:actualTime:error:")
    public native CGImageRef copyCGImageAtTimeActualTimeError(@ByValue CMTime requestedTime, CMTime actualTime,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * Indicates the custom video compositor instance used, if any
     */
    @Generated
    @Selector("customVideoCompositor")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositor();

    /**
     * generateCGImagesAsynchronouslyForTimes:completionHandler:
     * <p>
     * Returns a series of CGImageRefs for an asset at or near the specified times.
     * <p>
     * Employs an efficient "batch mode" for getting images in time order.
     * The client will receive exactly one handler callback for each requested time in requestedTimes.
     * Changes to generator properties (snap behavior, maximum size, etc...) will not affect outstanding asynchronous
     * image generation requests.
     * The generated image is not retained. Clients should retain the image if they wish it to persist after the
     * completion handler returns.
     *
     * @param requestedTimes An NSArray of NSValues, each containing a CMTime, specifying the asset times at which an
     *                       image is requested.
     * @param handler        A block that will be called when an image request is complete.
     */
    @Generated
    @Selector("generateCGImagesAsynchronouslyForTimes:completionHandler:")
    public native void generateCGImagesAsynchronouslyForTimesCompletionHandler(
            NSArray<? extends NSValue> requestedTimes,
            @ObjCBlock(name = "call_generateCGImagesAsynchronouslyForTimesCompletionHandler") Block_generateCGImagesAsynchronouslyForTimesCompletionHandler handler);

    @Generated
    @Selector("init")
    public native AVAssetImageGenerator init();

    /**
     * initWithAsset:
     * <p>
     * Initializes an instance of AVAssetImageGenerator for use with the specified asset.
     * <p>
     * This method may succeed even if the asset possesses no visual tracks at the time of initialization.
     * Clients may wish to test whether an asset has any tracks with the visual characteristic via
     * -[AVAsset tracksWithMediaCharacteristic:].
     * <p>
     * Note also that assets that belong to a mutable subclass of AVAsset, AVMutableComposition or AVMutableMovie,
     * may gain visual tracks after initialization of an associated AVAssetImageGenerator.
     * <p>
     * However, the results of image generation are undefined if mutations of the asset occur while images
     * are being generated.
     * <p>
     * AVAssetImageGenerator will use the default enabled video track(s) to generate images.
     *
     * @param asset The asset from which images will be extracted.
     * @return An instance of AVAssetImageGenerator
     */
    @Generated
    @Selector("initWithAsset:")
    public native AVAssetImageGenerator initWithAsset(AVAsset asset);

    /**
     * Specifies the maximum dimensions for generated image. Default (CGSizeZero) is the asset's unscaled dimensions.
     * AVAssetImageGenerator will scale images such that they fit within the defined bounding box.
     * Images will never be scaled up. The aspect ratio of the scaled image will be defined by the apertureMode
     * property.
     */
    @Generated
    @Selector("maximumSize")
    @ByValue
    public native CGSize maximumSize();

    @Generated
    @Selector("requestedTimeToleranceAfter")
    @ByValue
    public native CMTime requestedTimeToleranceAfter();

    /**
     * The actual time of the generated images will be within the range [requestedTime-toleranceBefore,
     * requestedTime+toleranceAfter] and may differ from the requested time for efficiency.
     * Pass kCMTimeZero for both toleranceBefore and toleranceAfter to request frame-accurate image generation; this may
     * incur additional decoding delay.
     * Default is kCMTimePositiveInfinity.
     */
    @Generated
    @Selector("requestedTimeToleranceBefore")
    @ByValue
    public native CMTime requestedTimeToleranceBefore();

    /**
     * Specifies the aperture mode for the generated image. Default is AVAssetImageGeneratorApertureModeCleanAperture.
     */
    @Generated
    @Selector("setApertureMode:")
    public native void setApertureMode(String value);

    /**
     * Specifies whether or not to apply the track's preferredTransform (see -[AVAssetTrack preferredTransform]) when
     * extracting an image from the asset.
     * Default is NO. Only rotation by 90, 180, or 270 degrees is supported.
     */
    @Generated
    @Selector("setAppliesPreferredTrackTransform:")
    public native void setAppliesPreferredTrackTransform(boolean value);

    /**
     * Specifies the maximum dimensions for generated image. Default (CGSizeZero) is the asset's unscaled dimensions.
     * AVAssetImageGenerator will scale images such that they fit within the defined bounding box.
     * Images will never be scaled up. The aspect ratio of the scaled image will be defined by the apertureMode
     * property.
     */
    @Generated
    @Selector("setMaximumSize:")
    public native void setMaximumSize(@ByValue CGSize value);

    @Generated
    @Selector("setRequestedTimeToleranceAfter:")
    public native void setRequestedTimeToleranceAfter(@ByValue CMTime value);

    /**
     * The actual time of the generated images will be within the range [requestedTime-toleranceBefore,
     * requestedTime+toleranceAfter] and may differ from the requested time for efficiency.
     * Pass kCMTimeZero for both toleranceBefore and toleranceAfter to request frame-accurate image generation; this may
     * incur additional decoding delay.
     * Default is kCMTimePositiveInfinity.
     */
    @Generated
    @Selector("setRequestedTimeToleranceBefore:")
    public native void setRequestedTimeToleranceBefore(@ByValue CMTime value);

    /**
     * Specifies the video composition to use when extracting images from assets with multiple video tracks.
     * If no videoComposition is specified, only the first enabled video track will be used.
     * If a videoComposition is specified, the value of appliesPreferredTrackTransform is ignored.
     */
    @Generated
    @Selector("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition value);

    /**
     * Specifies the video composition to use when extracting images from assets with multiple video tracks.
     * If no videoComposition is specified, only the first enabled video track will be used.
     * If a videoComposition is specified, the value of appliesPreferredTrackTransform is ignored.
     */
    @Generated
    @Selector("videoComposition")
    public native AVVideoComposition videoComposition();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_generateCGImagesAsynchronouslyForTimesCompletionHandler {
        @Generated
        void call_generateCGImagesAsynchronouslyForTimesCompletionHandler(@ByValue CMTime requestedTime,
                CGImageRef image, @ByValue CMTime actualTime, @NInt long result, NSError error);
    }
}
