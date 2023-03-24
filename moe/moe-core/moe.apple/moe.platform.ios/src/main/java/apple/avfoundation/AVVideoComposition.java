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
import apple.avfoundation.protocol.AVVideoCompositionValidationHandling;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSError;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVVideoComposition extends NSObject implements NSCopying, NSMutableCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVVideoComposition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVVideoComposition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVVideoComposition allocWithZone(VoidPtr zone);

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
    public static native AVVideoComposition new_objc();

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
     * videoCompositionWithAsset:applyingCIFiltersWithHandler:
     * 
     * Returns a new instance of AVVideoComposition with values and instructions that will apply the specified handler
     * block to video frames represented as instances of CIImage.
     * 
     * The returned AVVideoComposition will cause the specified handler block to be called to filter each frame of the
     * asset's first enabled video track. The handler block should use the properties of the provided
     * AVAsynchronousCIImageFilteringRequest and respond using finishWithImage:context: with a "filtered" new CIImage
     * (or the provided source image for no affect). In the event of an error, respond to the request using
     * finishWithError:. The error can be observed via AVPlayerItemFailedToPlayToEndTimeNotification, see
     * AVPlayerItemFailedToPlayToEndTimeErrorKey in notification payload.
     * 
     * NOTE: The returned AVVideoComposition's properties are private and support only CIFilter-based operations.
     * Mutations are not supported, either in the values of properties of the AVVideoComposition itself or in its
     * private instructions. If rotations or other transformations are desired, they must be accomplished via the
     * application of CIFilters during the execution of your specified handler.
     * 
     * The video composition will also have the following values for its properties:
     * 
     * - The original timing of the asset's first enabled video track will be used.
     * - A renderSize that encompasses the asset's first enabled video track respecting the track's preferredTransform.
     * - A renderScale of 1.0.
     * 
     * The default CIContext has the following properties:
     * 
     * - iOS: Device RGB color space
     * - OS X: sRGB color space
     * 
     * Example usage:
     * 
     * playerItem.videoComposition = [AVVideoComposition videoCompositionWithAsset:srcAsset
     * applyingCIFiltersWithHandler:
     * ^(AVAsynchronousCIImageFilteringRequest *request)
     * {
     * NSError *err = nil;
     * CIImage *filtered = myRenderer(request, &err);
     * if (filtered)
     * [request finishWithImage:filtered context:nil];
     * else
     * [request finishWithError:err];
     * }];
     * 
     * API-Since: 9.0
     * Deprecated-Since: 100000.0
     * 
     * @param asset An instance of AVAsset. For best performance, ensure that the duration and tracks properties of the
     *              asset are already loaded before invoking this method.
     * @return An instance of AVVideoComposition.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("videoCompositionWithAsset:applyingCIFiltersWithHandler:")
    public static native AVVideoComposition videoCompositionWithAssetApplyingCIFiltersWithHandler(
            @NotNull AVAsset asset,
            @NotNull @ObjCBlock(name = "call_videoCompositionWithAssetApplyingCIFiltersWithHandler") Block_videoCompositionWithAssetApplyingCIFiltersWithHandler applier);

    /**
     * videoCompositionWithPropertiesOfAsset:
     * 
     * Returns a new instance of AVVideoComposition with values and instructions suitable for presenting the video
     * tracks of the specified asset according to its temporal and geometric properties and those of its tracks.
     * 
     * The returned AVVideoComposition will have instructions that respect the spatial properties and timeRanges of the
     * specified asset's video tracks.
     * It will also have the following values for its properties:
     * 
     * - If the asset has exactly one video track, the original timing of the source video track will be used. If the
     * asset has more than one video track, and the nominal frame rate of any of video tracks is known, the reciprocal
     * of the greatest known nominalFrameRate will be used as the value of frameDuration. Otherwise, a default framerate
     * of 30fps is used.
     * - If the specified asset is an instance of AVComposition, the renderSize will be set to the naturalSize of the
     * AVComposition; otherwise the renderSize will be set to a value that encompasses all of the asset's video tracks.
     * - A renderScale of 1.0.
     * - A nil animationTool.
     * 
     * If the specified asset has no video tracks, this method will return an AVVideoComposition instance with an empty
     * collection of instructions.
     * 
     * 
     * API-Since: 6.0
     * Deprecated-Since: 100000.0
     * 
     * @param asset An instance of AVAsset. Ensure that the duration and tracks properties of the asset are already
     *              loaded before invoking this method.
     * @return An instance of AVVideoComposition.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("videoCompositionWithPropertiesOfAsset:")
    public static native AVVideoComposition videoCompositionWithPropertiesOfAsset(@NotNull AVAsset asset);

    /**
     * indicates a special video composition tool for use of Core Animation; may be nil
     */
    @Nullable
    @Generated
    @Selector("animationTool")
    public native AVVideoCompositionCoreAnimationTool animationTool();

    /**
     * [@property] colorPrimaries
     * 
     * Rendering will use these primaries and frames will be tagged as such. If the value of this property is nil then
     * the source's primaries will be propagated and used.
     * 
     * Default is nil. Valid values are those suitable for AVVideoColorPrimariesKey. Generally set as a triple along
     * with colorYCbCrMatrix and colorTransferFunction.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("colorPrimaries")
    public native String colorPrimaries();

    /**
     * [@property] colorTransferFunction
     * 
     * Rendering will use this transfer function and frames will be tagged as such. If the value of this property is nil
     * then the source's transfer function will be propagated and used.
     * 
     * Default is nil. Valid values are those suitable for AVVideoTransferFunctionKey. Generally set as a triple along
     * with colorYCbCrMatrix and colorYCbCrMatrix.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("colorTransferFunction")
    public native String colorTransferFunction();

    /**
     * [@property] colorYCbCrMatrix
     * 
     * Rendering will use this matrix and frames will be tagged as such. If the value of this property is nil then the
     * source's matrix will be propagated and used.
     * 
     * Default is nil. Valid values are those suitable for AVVideoYCbCrMatrixKey. Generally set as a triple along with
     * colorPrimaries and colorTransferFunction.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("colorYCbCrMatrix")
    public native String colorYCbCrMatrix();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * indicates a custom compositor class to use. The class must implement the AVVideoCompositing protocol.
     * If nil, the default, internal video compositor is used
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("customVideoCompositorClass")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositorClass();

    /**
     * indicates the interval which the video composition, when enabled, should render composed video frames
     */
    @Generated
    @Selector("frameDuration")
    @ByValue
    public native CMTime frameDuration();

    @Generated
    @Selector("init")
    public native AVVideoComposition init();

    /**
     * Indicates instructions for video composition via an NSArray of instances of classes implementing the
     * AVVideoCompositionInstruction protocol.
     * For the first instruction in the array, timeRange.start must be less than or equal to the earliest time for which
     * playback or other processing will be attempted
     * (note that this will typically be kCMTimeZero). For subsequent instructions, timeRange.start must be equal to the
     * prior instruction's end time. The end time of
     * the last instruction must be greater than or equal to the latest time for which playback or other processing will
     * be attempted (note that this will often be
     * the duration of the asset with which the instance of AVVideoComposition is associated).
     */
    @NotNull
    @Generated
    @Selector("instructions")
    public native NSArray<?> instructions();

    /**
     * isValidForAsset:timeRange:validationDelegate:
     * 
     * Indicates whether the timeRanges of the receiver's instructions conform to the requirements described for them
     * immediately above (in connection with the instructions property) and also whether all of the layer instructions
     * have a value for trackID that corresponds either to a track of the specified asset or to the receiver's
     * animationTool.
     * 
     * In the course of validation, the receiver will invoke its validationDelegate with reference to any trouble spots
     * in the video composition.
     * An exception will be raised if the delegate modifies the receiver's array of instructions or the array of
     * layerInstructions of any AVVideoCompositionInstruction contained therein during validation.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * 
     * @param asset
     *                           Pass a reference to an AVAsset if you wish to validate the timeRanges of the
     *                           instructions against the duration of the asset and the trackIDs of the layer
     *                           instructions against the asset's tracks. Pass nil to skip that validation. Clients
     *                           should ensure that the keys @"tracks" and @"duration" are already loaded on the AVAsset
     *                           before validation is attempted.
     * @param timeRange
     *                           A CMTimeRange. Only those instuctions with timeRanges that overlap with the specified
     *                           timeRange will be validated. To validate all instructions that may be used for playback
     *                           or other processing, regardless of timeRange, pass CMTimeRangeMake(kCMTimeZero,
     *                           kCMTimePositiveInfinity).
     * @param validationDelegate
     *                           Indicates an object implementing the AVVideoCompositionValidationHandling protocol to
     *                           receive information about troublesome portions of a video composition during processing
     *                           of -isValidForAsset:. May be nil.
     */
    @Deprecated
    @Generated
    @Selector("isValidForAsset:timeRange:validationDelegate:")
    public native boolean isValidForAssetTimeRangeValidationDelegate(@Nullable AVAsset asset,
            @ByValue CMTimeRange timeRange,
            @Nullable @Mapped(ObjCObjectMapper.class) AVVideoCompositionValidationHandling validationDelegate);

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    /**
     * indicates the scale at which the video composition should render. May only be other than 1.0 for a video
     * composition set on an AVPlayerItem
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("renderScale")
    public native float renderScale();

    /**
     * indicates the size at which the video composition, when enabled, should render
     */
    @Generated
    @Selector("renderSize")
    @ByValue
    public native CGSize renderSize();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_videoCompositionWithAssetApplyingCIFiltersWithHandler {
        @Generated
        void call_videoCompositionWithAssetApplyingCIFiltersWithHandler(
                @NotNull AVAsynchronousCIImageFilteringRequest request);
    }

    /**
     * If sourceTrackIDForFrameTiming is not kCMPersistentTrackID_Invalid, frame timing for the video composition is
     * derived from the source asset's track with the corresponding ID. This may be used to preserve a source asset's
     * variable frame timing. If an empty edit is encountered in the source asset’s track, the compositor composes
     * frames as needed up to the frequency specified in frameDuration property.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("sourceTrackIDForFrameTiming")
    public native int sourceTrackIDForFrameTiming();

    /**
     * List of all track IDs for tracks from which sample data should be presented to the compositor at any point in the
     * overall composition. The sample data will be delivered to the custom compositor via
     * AVAsynchronousVideoCompositionRequest.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("sourceSampleDataTrackIDs")
    public native NSArray<? extends NSNumber> sourceSampleDataTrackIDs();

    /**
     * determineValidityForAsset:timeRange:validationDelegate:completionHandler:
     * 
     * Determines whether the timeRanges of the receiver's instructions conform to the requirements described for them
     * immediately above (in connection with the instructions property) and also whether all of the layer instructions
     * have a value for trackID that corresponds either to a track of the specified asset or to the receiver's
     * animationTool.
     * 
     * In the course of validation, the receiver will invoke its validationDelegate with reference to any trouble spots
     * in the video composition.
     * An exception will be raised if the delegate modifies the receiver's array of instructions or the array of
     * layerInstructions of any AVVideoCompositionInstruction contained therein during validation.
     * 
     * API-Since: 16.0
     * 
     * @param asset
     *                           Pass a reference to an AVAsset if you wish to validate the timeRanges of the
     *                           instructions against the duration of the asset and the trackIDs of the layer
     *                           instructions against the asset's tracks. Pass nil to skip that validation.
     * @param timeRange
     *                           A CMTimeRange. Only those instuctions with timeRanges that overlap with the specified
     *                           timeRange will be validated. To validate all instructions that may be used for playback
     *                           or other processing, regardless of timeRange, pass CMTimeRangeMake(kCMTimeZero,
     *                           kCMTimePositiveInfinity).
     * @param validationDelegate
     *                           Indicates an object implementing the AVVideoCompositionValidationHandling protocol to
     *                           receive information about troublesome portions of a video composition during processing
     *                           of -determineValidityForAsset:. May be nil.
     * @param completionHandler
     *                           A block that is invoked when a determination is made about whether the video
     *                           composition is valid. If the `isValid` parameter is NO, either the video composition is
     *                           not valid, in which case the `error` parameter will be nil, or the answer could not be
     *                           determined, in which case the `error` parameter will be non-nil and describe the
     *                           failure that occurred.
     */
    @Generated
    @Selector("determineValidityForAsset:timeRange:validationDelegate:completionHandler:")
    public native void determineValidityForAssetTimeRangeValidationDelegateCompletionHandler(@Nullable AVAsset asset,
            @ByValue CMTimeRange timeRange,
            @Nullable @Mapped(ObjCObjectMapper.class) AVVideoCompositionValidationHandling validationDelegate,
            @NotNull @ObjCBlock(name = "call_determineValidityForAssetTimeRangeValidationDelegateCompletionHandler") Block_determineValidityForAssetTimeRangeValidationDelegateCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_determineValidityForAssetTimeRangeValidationDelegateCompletionHandler {
        @Generated
        void call_determineValidityForAssetTimeRangeValidationDelegateCompletionHandler(boolean isValid,
                @Nullable NSError error);
    }

    /**
     * videoCompositionWithAsset:applyingCIFiltersWithHandler:completionHandler:
     * 
     * Vends a new instance of AVVideoComposition with values and instructions that will apply the specified handler
     * block to video frames represented as instances of CIImage.
     * 
     * The new AVVideoComposition will cause the specified handler block to be called to filter each frame of the
     * asset's first enabled video track. The handler block should use the properties of the provided
     * AVAsynchronousCIImageFilteringRequest and respond using finishWithImage:context: with a "filtered" new CIImage
     * (or the provided source image for no affect). In the event of an error, respond to the request using
     * finishWithError:. The error can be observed via AVPlayerItemFailedToPlayToEndTimeNotification, see
     * AVPlayerItemFailedToPlayToEndTimeErrorKey in notification payload.
     * 
     * NOTE: The returned AVVideoComposition's properties are private and support only CIFilter-based operations.
     * Mutations are not supported, either in the values of properties of the AVVideoComposition itself or in its
     * private instructions. If rotations or other transformations are desired, they must be accomplished via the
     * application of CIFilters during the execution of your specified handler.
     * 
     * The video composition will also have the following values for its properties:
     * 
     * - The original timing of the asset's first enabled video track will be used.
     * - A renderSize that encompasses the asset's first enabled video track respecting the track's preferredTransform.
     * - A renderScale of 1.0.
     * 
     * The default CIContext has the following properties:
     * 
     * - iOS: Device RGB color space
     * - OS X: sRGB color space
     * 
     * Example usage:
     * 
     * [AVVideoComposition videoCompositionWithAsset:srcAsset applyingCIFiltersWithHandler:
     * ^(AVAsynchronousCIImageFilteringRequest *request)
     * {
     * NSError *err = nil;
     * CIImage *filtered = myRenderer(request, &err);
     * if (filtered)
     * [request finishWithImage:filtered context:nil];
     * else
     * [request finishWithError:err];
     * } completionHandler:
     * ^(AVVideoComposition * _Nullable videoComposition, NSError * _Nullable error)
     * {
     * if (videoComposition != nil) {
     * playerItem.videoComposition = videoComposition
     * else {
     * // handle error
     * }];
     * 
     * API-Since: 16.0
     * 
     * @param asset
     *                          An instance of AVAsset.
     * @param completionHandler
     *                          A block that is invoked when the new video composition has finished being created. If
     *                          the `videoComposition` parameter is nil, the `error` parameter describes the failure
     *                          that occurred.
     */
    @Generated
    @Selector("videoCompositionWithAsset:applyingCIFiltersWithHandler:completionHandler:")
    public static native void videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler(
            @NotNull AVAsset asset,
            @NotNull @ObjCBlock(name = "call_videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler_1") Block_videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler_1 applier,
            @NotNull @ObjCBlock(name = "call_videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler_2") Block_videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler_2 completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler_1 {
        @Generated
        void call_videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler_1(
                @NotNull AVAsynchronousCIImageFilteringRequest request);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler_2 {
        @Generated
        void call_videoCompositionWithAssetApplyingCIFiltersWithHandlerCompletionHandler_2(
                @Nullable AVVideoComposition videoComposition, @Nullable NSError error);
    }

    /**
     * videoCompositionWithPropertiesOfAsset:completionHandler:
     * 
     * Vends a new instance of AVVideoComposition with values and instructions suitable for presenting the video tracks
     * of the specified asset according to its temporal and geometric properties and those of its tracks.
     * 
     * The new AVVideoComposition will have instructions that respect the spatial properties and timeRanges of the
     * specified asset's video tracks.
     * It will also have the following values for its properties:
     * 
     * - If the asset has exactly one video track, the original timing of the source video track will be used. If the
     * asset has more than one video track, and the nominal frame rate of any of video tracks is known, the reciprocal
     * of the greatest known nominalFrameRate will be used as the value of frameDuration. Otherwise, a default framerate
     * of 30fps is used.
     * - If the specified asset is an instance of AVComposition, the renderSize will be set to the naturalSize of the
     * AVComposition; otherwise the renderSize will be set to a value that encompasses all of the asset's video tracks.
     * - A renderScale of 1.0.
     * - A nil animationTool.
     * 
     * If the specified asset has no video tracks, this method will return an AVVideoComposition instance with an empty
     * collection of instructions.
     * 
     * API-Since: 16.0
     * 
     * @param asset
     *                          An instance of AVAsset.
     * @param completionHandler
     *                          A block that is invoked when the new video composition has finished being created. If
     *                          the `videoComposition` parameter is nil, the `error` parameter describes the failure
     *                          that occurred.
     */
    @Generated
    @Selector("videoCompositionWithPropertiesOfAsset:completionHandler:")
    public static native void videoCompositionWithPropertiesOfAssetCompletionHandler(@NotNull AVAsset asset,
            @NotNull @ObjCBlock(name = "call_videoCompositionWithPropertiesOfAssetCompletionHandler") Block_videoCompositionWithPropertiesOfAssetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_videoCompositionWithPropertiesOfAssetCompletionHandler {
        @Generated
        void call_videoCompositionWithPropertiesOfAssetCompletionHandler(@Nullable AVVideoComposition videoComposition,
                @Nullable NSError error);
    }
}
