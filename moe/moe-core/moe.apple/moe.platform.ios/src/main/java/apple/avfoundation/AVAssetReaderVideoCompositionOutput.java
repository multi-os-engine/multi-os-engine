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
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAssetReaderVideoCompositionOutput
 * 
 * AVAssetReaderVideoCompositionOutput is a concrete subclass of AVAssetReaderOutput that defines an interface for
 * reading video frames that have been composited together from the frames in one or more AVAssetTracks of an
 * AVAssetReader's AVAsset.
 * 
 * Clients can read the video frames composited from one or more asset tracks by adding an instance of
 * AVAssetReaderVideoCompositionOutput to an AVAssetReader using the -[AVAssetReader addOutput:] method.
 * 
 * API-Since: 4.1
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetReaderVideoCompositionOutput extends AVAssetReaderOutput {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAssetReaderVideoCompositionOutput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAssetReaderVideoCompositionOutput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAssetReaderVideoCompositionOutput allocWithZone(VoidPtr zone);

    /**
     * assetReaderVideoCompositionOutputWithVideoTracks:videoSettings:
     * 
     * Creates an instance of AVAssetReaderVideoCompositionOutput for reading composited video from the specified video
     * tracks and supplying media data according to the specified video settings.
     * 
     * Each track must be one of the tracks owned by the target AVAssetReader's asset and must be of media type
     * AVMediaTypeVideo.
     * 
     * A value of nil for videoSettings configures the output to return samples in a convenient uncompressed format,
     * with properties determined according to the properties of the specified video tracks. Initialization will fail if
     * the video settings cannot be used with the specified tracks.
     * 
     * AVAssetReaderVideoCompositionOutput can only produce uncompressed output. This means that the video settings
     * dictionary must follow the rules for uncompressed video output, as laid out in AVVideoSettings.h. In addition,
     * the following keys are not supported:
     * 
     * AVVideoCleanApertureKey
     * AVVideoPixelAspectRatioKey
     * AVVideoScalingModeKey
     * 
     * @param tracks
     *                      An NSArray of AVAssetTrack objects from which the resulting
     *                      AVAssetReaderVideoCompositionOutput should read video frames for compositing.
     * @param videoSettings
     *                      An NSDictionary of video settings to be used for video output. See AVVideoSettings.h for
     *                      more information about how to construct a video settings dictionary.
     * @return
     *         An instance of AVAssetReaderVideoCompositionOutput.
     */
    @Generated
    @Selector("assetReaderVideoCompositionOutputWithVideoTracks:videoSettings:")
    public static native AVAssetReaderVideoCompositionOutput assetReaderVideoCompositionOutputWithVideoTracksVideoSettings(
            @NotNull NSArray<? extends AVAssetTrack> videoTracks, @Nullable NSDictionary<String, ?> videoSettings);

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
    public static native AVAssetReaderVideoCompositionOutput new_objc();

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
     * [@property] customVideoCompositor
     * 
     * Indicates the custom video compositor instance used by the receiver.
     * 
     * This property is nil if there is no video compositor, or if the internal video compositor is in use.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("customVideoCompositor")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositor();

    @Generated
    @Selector("init")
    public native AVAssetReaderVideoCompositionOutput init();

    /**
     * initWithVideoTracks:videoSettings:
     * 
     * Creates an instance of AVAssetReaderVideoCompositionOutput for reading composited video from the specified video
     * tracks and supplying media data according to the specified video settings.
     * 
     * Each track must be one of the tracks owned by the target AVAssetReader's asset and must be of media type
     * AVMediaTypeVideo.
     * 
     * A value of nil for videoSettings configures the output to return samples in a convenient uncompressed format,
     * with properties determined according to the properties of the specified video tracks. Initialization will fail if
     * the video settings cannot be used with the specified tracks.
     * 
     * AVAssetReaderVideoCompositionOutput can only produce uncompressed output. This means that the video settings
     * dictionary must follow the rules for uncompressed video output, as laid out in AVVideoSettings.h.
     * 
     * This method throws an exception for any of the following reasons:
     * - any video track is not of media type AVMediaTypeVideo
     * - any video track is not part of this asset reader output's AVAsset
     * - track output settings would cause the output to yield compressed samples
     * - video settings does not follow the rules for uncompressed video output (AVVideoSettings.h)
     * - video settings contains any of the following keys:
     * - AVVideoCleanApertureKey
     * - AVVideoPixelAspectRatioKey
     * - AVVideoScalingModeKey
     * - AVVideoDecompressionPropertiesKey
     * 
     * @param tracks
     *                      An NSArray of AVAssetTrack objects from which the resulting
     *                      AVAssetReaderVideoCompositionOutput should read video frames for compositing.
     * @param videoSettings
     *                      An NSDictionary of video settings to be used for video output. See AVVideoSettings.h for
     *                      more information about how to construct a video settings dictionary.
     * @return An instance of AVAssetReaderVideoCompositionOutput.
     */
    @Generated
    @Selector("initWithVideoTracks:videoSettings:")
    public native AVAssetReaderVideoCompositionOutput initWithVideoTracksVideoSettings(
            @NotNull NSArray<? extends AVAssetTrack> videoTracks, @Nullable NSDictionary<String, ?> videoSettings);

    /**
     * [@property] videoComposition
     * 
     * The composition of video used by the receiver.
     * 
     * The value of this property is an AVVideoComposition that can be used to specify the visual arrangement of video
     * frames read from each source track over the timeline of the source asset.
     * 
     * This property throws an exception if a value is set after reading has started.
     */
    @Generated
    @Selector("setVideoComposition:")
    public native void setVideoComposition(@Nullable AVVideoComposition value);

    /**
     * [@property] videoComposition
     * 
     * The composition of video used by the receiver.
     * 
     * The value of this property is an AVVideoComposition that can be used to specify the visual arrangement of video
     * frames read from each source track over the timeline of the source asset.
     * 
     * This property throws an exception if a value is set after reading has started.
     */
    @Nullable
    @Generated
    @Selector("videoComposition")
    public native AVVideoComposition videoComposition();

    /**
     * [@property] videoSettings
     * 
     * The video settings used by the receiver.
     * 
     * The value of this property is an NSDictionary that contains values for keys as specified by AVVideoSettings.h. A
     * value of nil indicates that the receiver will return video frames in a convenient uncompressed format, with
     * properties determined according to the properties of the receiver's video tracks.
     */
    @Nullable
    @Generated
    @Selector("videoSettings")
    public native NSDictionary<String, ?> videoSettings();

    /**
     * [@property] videoTracks
     * 
     * The tracks from which the receiver reads composited video.
     * 
     * The value of this property is an NSArray of AVAssetTracks owned by the target AVAssetReader's asset.
     */
    @NotNull
    @Generated
    @Selector("videoTracks")
    public native NSArray<? extends AVAssetTrack> videoTracks();
}
