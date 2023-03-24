package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.protocol.AVQueuedSampleBufferRendering;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.opaque.CMTimebaseRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVSampleBufferAudioRenderer
 * 
 * AVSampleBufferAudioRenderer can decompress and play compressed or uncompressed audio.
 * 
 * An instance of AVSampleBufferAudioRenderer must be added to an AVSampleBufferRenderSynchronizer before the first
 * sample buffer is enqueued.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSampleBufferAudioRenderer extends NSObject implements AVQueuedSampleBufferRendering {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSampleBufferAudioRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSampleBufferAudioRenderer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVSampleBufferAudioRenderer allocWithZone(VoidPtr zone);

    /**
     * [@property] audioTimePitchAlgorithm
     * 
     * Indicates the processing algorithm used to manage audio pitch at varying rates.
     * 
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchSpectral, are defined in
     * AVAudioProcessingSettings.h.
     * 
     * The default value for applications linked on or after iOS 15.0 or macOS 12.0 is
     * AVAudioTimePitchAlgorithmTimeDomain. For iOS versions prior to 15.0 the default value is
     * AVAudioTimePitchAlgorithmLowQualityZeroLatency.
     * For macOS versions prior to 12.0 the default value is AVAudioTimePitchAlgorithmSpectral.
     * 
     * If the timebase's rate is not supported by the audioTimePitchAlgorithm, audio will be muted.
     * 
     * Modifying this property while the timebase's rate is not 0.0 may cause the rate to briefly change to 0.0.
     */
    @NotNull
    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

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
    @Selector("enqueueSampleBuffer:")
    public native void enqueueSampleBuffer(@NotNull CMSampleBufferRef sampleBuffer);

    /**
     * [@property] error
     * 
     * If the renderer's status is AVQueuedSampleBufferRenderingStatusFailed, this describes the error that caused the
     * failure.
     * 
     * The value of this property is an NSError that describes what caused the renderer to no longer be able to render
     * sample buffers. The value of this property is nil unless the value of status is
     * AVQueuedSampleBufferRenderingStatusFailed.
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("flush")
    public native void flush();

    /**
     * flushFromSourceTime:completionHandler:
     * 
     * Flushes enqueued sample buffers with presentation time stamps later than or equal to the specified time.
     * 
     * This method can be used to replace media data scheduled to be rendered in the future, without interrupting
     * playback. One example of this is when the data that has already been enqueued is from a sequence of two songs and
     * the second song is swapped for a new song. In this case, this method would be called with the time stamp of the
     * first sample buffer from the second song. After the completion handler is executed with a YES parameter, media
     * data may again be enqueued with timestamps at the specified time.
     * 
     * If NO is provided to the completion handler, the flush did not succeed and the set of enqueued sample buffers
     * remains unchanged. A flush can fail becuse the source time was too close to (or earlier than) the current time or
     * because the current configuration of the receiver does not support flushing at a particular time. In these cases,
     * the caller can choose to flush all enqueued media data by invoking the -flush method.
     * 
     * @param completionHandler
     *                          A block that is invoked, possibly asynchronously, after the flush operation completes or
     *                          fails.
     */
    @Generated
    @Selector("flushFromSourceTime:completionHandler:")
    public native void flushFromSourceTimeCompletionHandler(@ByValue CMTime time,
            @NotNull @ObjCBlock(name = "call_flushFromSourceTimeCompletionHandler") Block_flushFromSourceTimeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_flushFromSourceTimeCompletionHandler {
        @Generated
        void call_flushFromSourceTimeCompletionHandler(boolean flushSucceeded);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVSampleBufferAudioRenderer init();

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
     * [@property] muted
     * 
     * Indicates whether or not audio output of the AVSampleBufferAudioRenderer is muted.
     * 
     * Setting this property only affects audio muting for the renderer instance and not for the device.
     */
    @Generated
    @Selector("isMuted")
    public native boolean isMuted();

    @Generated
    @Selector("isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();

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
    public static native AVSampleBufferAudioRenderer new_objc();

    @Generated
    @Selector("requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueueUsingBlock(@NotNull NSObject queue,
            @NotNull @ObjCBlock(name = "call_requestMediaDataWhenReadyOnQueueUsingBlock") AVQueuedSampleBufferRendering.Block_requestMediaDataWhenReadyOnQueueUsingBlock block);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] audioTimePitchAlgorithm
     * 
     * Indicates the processing algorithm used to manage audio pitch at varying rates.
     * 
     * Constants for various time pitch algorithms, e.g. AVAudioTimePitchSpectral, are defined in
     * AVAudioProcessingSettings.h.
     * 
     * The default value for applications linked on or after iOS 15.0 or macOS 12.0 is
     * AVAudioTimePitchAlgorithmTimeDomain. For iOS versions prior to 15.0 the default value is
     * AVAudioTimePitchAlgorithmLowQualityZeroLatency.
     * For macOS versions prior to 12.0 the default value is AVAudioTimePitchAlgorithmSpectral.
     * 
     * If the timebase's rate is not supported by the audioTimePitchAlgorithm, audio will be muted.
     * 
     * Modifying this property while the timebase's rate is not 0.0 may cause the rate to briefly change to 0.0.
     */
    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(@NotNull String value);

    /**
     * [@property] muted
     * 
     * Indicates whether or not audio output of the AVSampleBufferAudioRenderer is muted.
     * 
     * Setting this property only affects audio muting for the renderer instance and not for the device.
     */
    @Generated
    @Selector("setMuted:")
    public native void setMuted(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] volume
     * 
     * Indicates the current audio volume of the AVSampleBufferAudioRenderer.
     * 
     * A value of 0.0 means "silence all audio", while 1.0 means "play at the full volume of the audio media".
     * 
     * This property should be used for frequent volume changes, for example via a volume knob or fader.
     * 
     * This property is most useful on iOS to control the volume of the AVSampleBufferAudioRenderer relative to other
     * audio output, not for setting absolute volume.
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * [@property] status
     * 
     * Indicates the status of the audio renderer.
     * 
     * A renderer begins with status AVQueuedSampleBufferRenderingStatusUnknown.
     * 
     * As sample buffers are enqueued for rendering using -enqueueSampleBuffer:, the renderer will transition to either
     * AVQueuedSampleBufferRenderingStatusRendering or AVQueuedSampleBufferRenderingStatusFailed.
     * 
     * If the status is AVQueuedSampleBufferRenderingStatusFailed, check the value of the renderer's error property for
     * information on the error encountered. This is terminal status from which recovery is not always possible.
     * 
     * This property is key value observable.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("stopRequestingMediaData")
    public native void stopRequestingMediaData();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @NotNull
    @Generated
    @Selector("timebase")
    public native CMTimebaseRef timebase();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] volume
     * 
     * Indicates the current audio volume of the AVSampleBufferAudioRenderer.
     * 
     * A value of 0.0 means "silence all audio", while 1.0 means "play at the full volume of the audio media".
     * 
     * This property should be used for frequent volume changes, for example via a volume knob or fader.
     * 
     * This property is most useful on iOS to control the volume of the AVSampleBufferAudioRenderer relative to other
     * audio output, not for setting absolute volume.
     */
    @Generated
    @Selector("volume")
    public native float volume();

    /**
     * [@property] allowedAudioSpatializationFormats
     * 
     * Indicates the source audio channel layouts allowed by the receiver for spatialization.
     * 
     * Spatialization uses psychoacoustic methods to create a more immersive audio rendering when the content is played
     * on specialized headphones and speaker arrangements. When an AVSampleBufferAudioRenderer's
     * allowedAudioSpatializationFormats property is set to AVAudioSpatializationFormatMonoAndStereo the
     * AVSampleBufferAudioRenderer will attempt to spatialize content tagged with a stereo channel layout, two-channel
     * content with no layout specified as well as mono. It is considered incorrect to render a binaural recording with
     * spatialization. A binaural recording is captured using two carefully placed microphones at each ear where the
     * intent, when played on headphones, is to reproduce a naturally occurring spatial effect. Content tagged with a
     * binaural channel layout will ignore this property value. When an AVSampleBufferAudioRenderer's
     * allowedAudioSpatializationFormats property is set to AVAudioSpatializationFormatMultichannel the
     * AVSampleBufferAudioRenderer will attempt to spatialize any decodable multichannel layout. Setting this property
     * to AVAudioSpatializationFormatMonoStereoAndMultichannel indicates that the sender allows the
     * AVSampleBufferAudioRenderer to spatialize any decodable mono, stereo or multichannel layout. This property is not
     * observable. The default value for this property is AVAudioSpatializationFormatMultichannel.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("allowedAudioSpatializationFormats")
    @NUInt
    public native long allowedAudioSpatializationFormats();

    @Generated
    @Selector("hasSufficientMediaDataForReliablePlaybackStart")
    public native boolean hasSufficientMediaDataForReliablePlaybackStart();

    /**
     * [@property] allowedAudioSpatializationFormats
     * 
     * Indicates the source audio channel layouts allowed by the receiver for spatialization.
     * 
     * Spatialization uses psychoacoustic methods to create a more immersive audio rendering when the content is played
     * on specialized headphones and speaker arrangements. When an AVSampleBufferAudioRenderer's
     * allowedAudioSpatializationFormats property is set to AVAudioSpatializationFormatMonoAndStereo the
     * AVSampleBufferAudioRenderer will attempt to spatialize content tagged with a stereo channel layout, two-channel
     * content with no layout specified as well as mono. It is considered incorrect to render a binaural recording with
     * spatialization. A binaural recording is captured using two carefully placed microphones at each ear where the
     * intent, when played on headphones, is to reproduce a naturally occurring spatial effect. Content tagged with a
     * binaural channel layout will ignore this property value. When an AVSampleBufferAudioRenderer's
     * allowedAudioSpatializationFormats property is set to AVAudioSpatializationFormatMultichannel the
     * AVSampleBufferAudioRenderer will attempt to spatialize any decodable multichannel layout. Setting this property
     * to AVAudioSpatializationFormatMonoStereoAndMultichannel indicates that the sender allows the
     * AVSampleBufferAudioRenderer to spatialize any decodable mono, stereo or multichannel layout. This property is not
     * observable. The default value for this property is AVAudioSpatializationFormatMultichannel.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAllowedAudioSpatializationFormats:")
    public native void setAllowedAudioSpatializationFormats(@NUInt long value);
}
