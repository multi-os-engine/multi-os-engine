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
import apple.foundation.NSArray;
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
public class AVMutableVideoComposition extends AVVideoComposition {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMutableVideoComposition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMutableVideoComposition alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMutableVideoComposition allocWithZone(VoidPtr zone);

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
    public static native AVMutableVideoComposition new_objc();

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
     * Returns a new instance of AVMutableVideoComposition.
     * 
     * The returned AVMutableVideoComposition will have a frameDuration of kCMTimeZero, a renderSize of {0.0, 0.0}, a
     * nil array of instructions, and a nil animationTool.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("videoComposition")
    public static native AVMutableVideoComposition videoComposition();

    /**
     * Returns a new instance of AVMutableVideoComposition with values and instructions that will apply the specified
     * handler block to video frames represented as instances of CIImage.
     * 
     * The returned AVMutableVideoComposition will cause the specified handler block to be called to filter each frame
     * of the asset's first enabled video track. The handler block should use the properties of the provided
     * AVAsynchronousCIImageFilteringRequest and respond using finishWithImage:context: with a "filtered" new CIImage
     * (or the provided source image for no affect). In the event of an error, respond to the request using
     * finishWithError:. The error can be observed via AVPlayerItemFailedToPlayToEndTimeNotification, see
     * AVPlayerItemFailedToPlayToEndTimeErrorKey in notification payload. The client can set sourceTrackIDForFrameTiming
     * to kCMPersistentTrackID_Invalid and frameDuration to an appropriate value in order to specify the maximum output
     * frame rate independent of the source track timing.
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
     * - macOS: sRGB color space
     * 
     * Example usage:
     * ```objc
     * playerItem.videoComposition = [AVMutableVideoComposition videoCompositionWithAsset:srcAsset
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
     * ```
     * - Parameter asset: An instance of AVAsset. For best performance, ensure that the duration and tracks properties
     * of the asset are already loaded before invoking this method.
     * 
     * - Returns: An instance of AVMutableVideoComposition.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use videoCompositionWithAsset:applyingCIFiltersWithHandler:completionHandler: instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("videoCompositionWithAsset:applyingCIFiltersWithHandler:")
    public static native AVMutableVideoComposition videoCompositionWithAssetApplyingCIFiltersWithHandler(
            @NotNull AVAsset asset,
            @NotNull @ObjCBlock(name = "call_videoCompositionWithAssetApplyingCIFiltersWithHandler") Block_videoCompositionWithAssetApplyingCIFiltersWithHandler applier);

    /**
     * Returns a new instance of AVMutableVideoComposition with values and instructions suitable for presenting the
     * video tracks of the specified asset according to its temporal and geometric properties and those of its tracks.
     * 
     * The returned AVMutableVideoComposition will have instructions that respect the spatial properties and timeRanges
     * of the specified asset's video tracks. The client can set sourceTrackIDForFrameTiming to
     * kCMPersistentTrackID_Invalid and frameDuration to an appropriate value in order to specify the maximum output
     * frame rate independent of the source track timing.
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
     * If the specified asset has no video tracks, this method will return an AVMutableVideoComposition instance with an
     * empty collection of instructions.
     * 
     * - Parameter asset: An instance of AVAsset. For best performance, ensure that the duration and tracks properties
     * of the asset are already loaded before invoking this method.
     * 
     * - Returns: An instance of AVMutableVideoComposition.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use videoCompositionWithPropertiesOfAsset:completionHandler: instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("videoCompositionWithPropertiesOfAsset:")
    public static native AVMutableVideoComposition videoCompositionWithPropertiesOfAsset(@NotNull AVAsset asset);

    /**
     * Indicates a special video composition tool for use of Core Animation; may be nil
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("animationTool")
    public native AVVideoCompositionCoreAnimationTool animationTool();

    /**
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

    /**
     * Indicates the custom compositor class to use. If nil, the default, internal video compositor is used
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("customVideoCompositorClass")
    public native Class customVideoCompositorClass();

    /**
     * Indicates the interval which the video composition, when enabled, should render composed video frames
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("frameDuration")
    @ByValue
    public native CMTime frameDuration();

    @Generated
    @Selector("init")
    public native AVMutableVideoComposition init();

    /**
     * Indicates instructions for video composition via an NSArray of instances of classes implementing the
     * AVVideoCompositionInstruction protocol.
     * 
     * For the first instruction in the array, timeRange.start must be less than or equal to the earliest time for which
     * playback or other processing will be attempted (note that this will typically be kCMTimeZero). For subsequent
     * instructions, timeRange.start must be equal to the prior instruction's end time. The end time of the last
     * instruction must be greater than or equal to the latest time for which playback or other processing will be
     * attempted (note that this will often be the duration of the asset with which the instance of AVVideoComposition
     * is associated).
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @Selector("instructions")
    public native NSArray<?> instructions();

    /**
     * Indicates the scale at which the video composition should render. May only be other than 1.0 for a video
     * composition set on an AVPlayerItem
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("renderScale")
    public native float renderScale();

    /**
     * Indicates the size at which the video composition, when enabled, should render
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("renderSize")
    @ByValue
    public native CGSize renderSize();

    /**
     * Indicates a special video composition tool for use of Core Animation; may be nil
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setAnimationTool:")
    public native void setAnimationTool(@Nullable AVVideoCompositionCoreAnimationTool value);

    /**
     * Rendering will use these primaries and frames will be tagged as such. If the value of this property is nil then
     * the source's primaries will be propagated and used.
     * 
     * Default is nil. Valid values are those suitable for AVVideoColorPrimariesKey. Generally set as a triple along
     * with colorYCbCrMatrix and colorTransferFunction.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setColorPrimaries:")
    public native void setColorPrimaries(@Nullable String value);

    /**
     * Rendering will use this transfer function and frames will be tagged as such. If the value of this property is nil
     * then the source's transfer function will be propagated and used.
     * 
     * Default is nil. Valid values are those suitable for AVVideoTransferFunctionKey. Generally set as a triple along
     * with colorYCbCrMatrix and colorYCbCrMatrix.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setColorTransferFunction:")
    public native void setColorTransferFunction(@Nullable String value);

    /**
     * Rendering will use this matrix and frames will be tagged as such. If the value of this property is nil then the
     * source's matrix will be propagated and used.
     * 
     * Default is nil. Valid values are those suitable for AVVideoYCbCrMatrixKey. Generally set as a triple along with
     * colorPrimaries and colorTransferFunction.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setColorYCbCrMatrix:")
    public native void setColorYCbCrMatrix(@Nullable String value);

    /**
     * Indicates the custom compositor class to use. If nil, the default, internal video compositor is used
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setCustomVideoCompositorClass:")
    public native void setCustomVideoCompositorClass(@Nullable Class value);

    /**
     * Indicates the interval which the video composition, when enabled, should render composed video frames
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setFrameDuration:")
    public native void setFrameDuration(@ByValue CMTime value);

    /**
     * Indicates instructions for video composition via an NSArray of instances of classes implementing the
     * AVVideoCompositionInstruction protocol.
     * 
     * For the first instruction in the array, timeRange.start must be less than or equal to the earliest time for which
     * playback or other processing will be attempted (note that this will typically be kCMTimeZero). For subsequent
     * instructions, timeRange.start must be equal to the prior instruction's end time. The end time of the last
     * instruction must be greater than or equal to the latest time for which playback or other processing will be
     * attempted (note that this will often be the duration of the asset with which the instance of AVVideoComposition
     * is associated).
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setInstructions:")
    public native void setInstructions(@NotNull NSArray<?> value);

    /**
     * Indicates the scale at which the video composition should render. May only be other than 1.0 for a video
     * composition set on an AVPlayerItem
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setRenderScale:")
    public native void setRenderScale(float value);

    /**
     * Indicates the size at which the video composition, when enabled, should render
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setRenderSize:")
    public native void setRenderSize(@ByValue CGSize value);

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
    @Selector("setSourceTrackIDForFrameTiming:")
    public native void setSourceTrackIDForFrameTiming(int value);

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
     * Returns a new instance of AVMutableVideoComposition with values and instructions suitable for presenting the
     * video tracks of the specified asset according to its temporal and geometric properties and those of its tracks,
     * and also overrides default properties with those from a prototypeInstruction.
     * 
     * Also see videoCompositionWithPropertiesOfAsset:.
     * The returned AVVideoComposition will have instructions that respect the spatial properties and timeRanges of the
     * specified asset's video tracks. Anything not pertaining to spatial layout and timing, such as background color
     * for their composition or post-processing behaviors, is eligible to be specified via a prototype instruction.
     * Example: To add a background color,
     * ```objc
     * myPrototypeInstruction = [[AVMutableVideoCompositionInstruction alloc] init];
     * myPrototypeInstruction.backgroundColor = myCGColorRef; // Do not use constant CGColorRef colors here.
     * myVideoComposition = [AVVideoComposition videoCompositionWithPropertiesOfAsset:myAsset
     * prototypeInstruction:myPrototypeInstruction];
     * ```
     * - Parameter asset: An instance of AVAsset. For best performance, ensure that the duration and tracks properties
     * of the asset are already loaded before invoking this method.
     * - Parameter prototypeInstruction: Custom instructions that the client can choose to override.
     * 
     * - Returns: An instance of AVMutableVideoComposition.
     * 
     * API-Since: 13.0
     * Deprecated-Since: 18.0
     * Deprecated-Message: Use videoCompositionWithPropertiesOfAsset:prototypeInstruction:completionHandler: instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("videoCompositionWithPropertiesOfAsset:prototypeInstruction:")
    public static native AVMutableVideoComposition videoCompositionWithPropertiesOfAssetPrototypeInstruction(
            @NotNull AVAsset asset, @NotNull AVVideoCompositionInstruction prototypeInstruction);

    /**
     * List of all track IDs for tracks from which sample data should be presented to the compositor at any point in the
     * overall composition. Currently only tracks of type kCMMediaType_Metadata are allowed to be specified.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSourceSampleDataTrackIDs:")
    public native void setSourceSampleDataTrackIDs(@NotNull NSArray<? extends NSNumber> value);

    /**
     * List of all track IDs for tracks from which sample data should be presented to the compositor at any point in the
     * overall composition. Currently only tracks of type kCMMediaType_Metadata are allowed to be specified.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("sourceSampleDataTrackIDs")
    public native NSArray<? extends NSNumber> sourceSampleDataTrackIDs();

    /**
     * Vends a new instance of AVMutableVideoComposition with values and instructions that will apply the specified
     * handler block to video frames represented as instances of CIImage.
     * 
     * The new AVMutableVideoComposition will cause the specified handler block to be called to filter each frame of the
     * asset's first enabled video track. The handler block should use the properties of the provided
     * AVAsynchronousCIImageFilteringRequest and respond using finishWithImage:context: with a "filtered" new CIImage
     * (or the provided source image for no affect). In the event of an error, respond to the request using
     * finishWithError:. The error can be observed via AVPlayerItemFailedToPlayToEndTimeNotification, see
     * AVPlayerItemFailedToPlayToEndTimeErrorKey in notification payload. The client can set sourceTrackIDForFrameTiming
     * to kCMPersistentTrackID_Invalid and frameDuration to an appropriate value in order to specify the maximum output
     * frame rate independent of the source track timing.
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
     * - macOS: sRGB color space
     * 
     * Example usage:
     * ```objc
     * [AVMutableVideoComposition videoCompositionWithAsset:srcAsset applyingCIFiltersWithHandler:
     * ^(AVAsynchronousCIImageFilteringRequest *request)
     * {
     * NSError *err = nil;
     * CIImage *filtered = myRenderer(request, &err);
     * if (filtered)
     * [request finishWithImage:filtered context:nil];
     * else
     * [request finishWithError:err];
     * } completionHandler:
     * ^(AVMutableVideoComposition * _Nullable videoComposition, NSError * _Nullable error)
     * {
     * if (videoComposition != nil) {
     * playerItem.videoComposition = videoComposition
     * else {
     * // handle error
     * }];
     * ```
     * - Parameter asset: An instance of AVAsset.
     * - Parameter completionHandler: A block that is invoked when the new video composition has finished being created.
     * If the `videoComposition` parameter is nil, the `error` parameter describes the failure that occurred.
     * 
     * API-Since: 16.0
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
                @Nullable AVMutableVideoComposition videoComposition, @Nullable NSError error);
    }

    /**
     * Vends a new instance of AVMutableVideoComposition with values and instructions suitable for presenting the video
     * tracks of the specified asset according to its temporal and geometric properties and those of its tracks.
     * 
     * The new AVMutableVideoComposition will have instructions that respect the spatial properties and timeRanges of
     * the specified asset's video tracks. The client can set sourceTrackIDForFrameTiming to
     * kCMPersistentTrackID_Invalid and frameDuration to an appropriate value in order to specify the maximum output
     * frame rate independent of the source track timing.
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
     * If the specified asset has no video tracks, this method will return an AVMutableVideoComposition instance with an
     * empty collection of instructions.
     * 
     * - Parameter asset: An instance of AVAsset.
     * - Parameter completionHandler: A block that is invoked when the new video composition has finished being created.
     * If the `videoComposition` parameter is nil, the `error` parameter describes the failure that occurred.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("videoCompositionWithPropertiesOfAsset:completionHandler:")
    public static native void videoCompositionWithPropertiesOfAssetCompletionHandler(@NotNull AVAsset asset,
            @NotNull @ObjCBlock(name = "call_videoCompositionWithPropertiesOfAssetCompletionHandler") Block_videoCompositionWithPropertiesOfAssetCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_videoCompositionWithPropertiesOfAssetCompletionHandler {
        @Generated
        void call_videoCompositionWithPropertiesOfAssetCompletionHandler(
                @Nullable AVMutableVideoComposition videoComposition, @Nullable NSError error);
    }

    /**
     * Vends a new instance of AVMutableVideoComposition with values and instructions suitable for presenting the video
     * tracks of the specified asset according to its temporal and geometric properties and those of its tracks, and
     * also overrides default properties with those from a prototypeInstruction.
     * 
     * Also see videoCompositionWithPropertiesOfAsset:completionHandler:.
     * The new AVMutableVideoComposition will have instructions that respect the spatial properties and timeRanges of
     * the specified asset's video tracks. Anything not pertaining to spatial layout and timing, such as background
     * color for their composition or post-processing behaviors, is eligible to be specified via a prototype
     * instruction.
     * Example: To add a background color,
     * ```objc
     * myPrototypeInstruction = [[AVMutableVideoCompositionInstruction alloc] init];
     * myPrototypeInstruction.backgroundColor = myCGColorRef; // Do not use constant CGColorRef colors here.
     * myVideoComposition = [AVVideoComposition videoCompositionWithPropertiesOfAsset:myAsset
     * prototypeInstruction:myPrototypeInstruction completionHandler:^(AVMutableVideoComposition * _Nullable
     * myVideoComposition, NSError * _Nullable error) {
     * if (myVideoComposition != nil) {
     * // use myVideoComposition
     * }
     * else {
     * // handle error
     * }
     * }];
     * ```
     * - Parameter asset: An instance of AVAsset.
     * - Parameter prototypeInstruction: Custom instructions that the client can choose to override.
     * - Parameter completionHandler: A block that is invoked when the new video composition has finished being created.
     * If the `videoComposition` parameter is nil, the `error` parameter describes the failure that occurred.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("videoCompositionWithPropertiesOfAsset:prototypeInstruction:completionHandler:")
    public static native void videoCompositionWithPropertiesOfAssetPrototypeInstructionCompletionHandler(
            @NotNull AVAsset asset, @NotNull AVVideoCompositionInstruction prototypeInstruction,
            @NotNull @ObjCBlock(name = "call_videoCompositionWithPropertiesOfAssetPrototypeInstructionCompletionHandler") Block_videoCompositionWithPropertiesOfAssetPrototypeInstructionCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_videoCompositionWithPropertiesOfAssetPrototypeInstructionCompletionHandler {
        @Generated
        void call_videoCompositionWithPropertiesOfAssetPrototypeInstructionCompletionHandler(
                @Nullable AVMutableVideoComposition videoComposition, @Nullable NSError error);
    }

    /**
     * Configures policy for per frame HDR display metadata on the rendered frame
     * 
     * Allows the system to identify situations where HDR metadata can be generated and attached to the rendered video
     * frame.
     * Default is AVVideoCompositionPerFrameHDRDisplayMetadataPolicyPropagate. Any HDR metadata attached to the composed
     * frame will be propagated to the rendered video frames.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("perFrameHDRDisplayMetadataPolicy")
    @NotNull
    public native String perFrameHDRDisplayMetadataPolicy();

    /**
     * Configures policy for per frame HDR display metadata on the rendered frame
     * 
     * Allows the system to identify situations where HDR metadata can be generated and attached to the rendered video
     * frame.
     * Default is AVVideoCompositionPerFrameHDRDisplayMetadataPolicyPropagate. Any HDR metadata attached to the composed
     * frame will be propagated to the rendered video frames.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setPerFrameHDRDisplayMetadataPolicy:")
    public native void setPerFrameHDRDisplayMetadataPolicy(@NotNull String value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * The output buffers of the video composition can be specified with the outputBufferDescription. The value is an
     * array of CMTagCollectionRef objects that describes the output buffers.
     * 
     * If the video composition will output tagged buffers, the details of those buffers should be specified with
     * CMTags. Specifically, the StereoView (eyes) and ProjectionKind must be specified. The behavior is undefined if
     * the output tagged buffers do not match the outputBufferDescription.
     * The default is nil, which means monoscopic output. Note that an empty array is not valid. An exception will be
     * thrown if the objects in the array are not of type CMTagCollectionRef.
     * Note that tagged buffers are only supported for custom compositors.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputBufferDescription")
    @Nullable
    public native NSArray<?> outputBufferDescription();

    /**
     * The output buffers of the video composition can be specified with the outputBufferDescription. The value is an
     * array of CMTagCollectionRef objects that describes the output buffers.
     * 
     * If the video composition will output tagged buffers, the details of those buffers should be specified with
     * CMTags. Specifically, the StereoView (eyes) and ProjectionKind must be specified. The behavior is undefined if
     * the output tagged buffers do not match the outputBufferDescription.
     * The default is nil, which means monoscopic output. Note that an empty array is not valid. An exception will be
     * thrown if the objects in the array are not of type CMTagCollectionRef.
     * Note that tagged buffers are only supported for custom compositors.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOutputBufferDescription:")
    public native void setOutputBufferDescription(@Nullable NSArray<?> value);
}
