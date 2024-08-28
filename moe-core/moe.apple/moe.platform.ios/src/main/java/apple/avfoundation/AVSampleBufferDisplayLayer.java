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
import apple.avfoundation.protocol.AVQueuedSampleBufferRendering;
import apple.coremedia.opaque.CMSampleBufferRef;
import apple.coremedia.opaque.CMTimebaseRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.quartzcore.CALayer;
import apple.quartzcore.protocol.CAAction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

/**
 * API-Since: 8.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVSampleBufferDisplayLayer extends CALayer implements AVQueuedSampleBufferRendering {
    static {
        NatJ.register();
    }

    @Generated
    protected AVSampleBufferDisplayLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVSampleBufferDisplayLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVSampleBufferDisplayLayer allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("defaultActionForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CAAction defaultActionForKey(@NotNull String event);

    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

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
    @Selector("layer")
    public static native AVSampleBufferDisplayLayer layer();

    @Generated
    @Selector("needsDisplayForKey:")
    public static native boolean needsDisplayForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVSampleBufferDisplayLayer new_objc();

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
     * [@property] controlTimebase
     * 
     * The layer's control timebase, which governs how time stamps are interpreted.
     * 
     * By default, this property is NULL, in which case time stamps will be interpreted
     * according to the host time clock (mach_absolute_time with the appropriate timescale
     * conversion; this is the same as Core Animation's CACurrentMediaTime). With no
     * control timebase, once frames are enqueued, it is not possible to adjust exactly
     * when they are displayed.
     * 
     * If a non-NULL control timebase is set, it will be used to interpret time stamps.
     * You can control the timing of frame display by setting the rate and time of the
     * control timebase.
     * If you are synchronizing video to audio, you can use a timebase whose source clock
     * is a CMAudioDeviceClock for the appropriate audio device to prevent drift.
     * 
     * Note that prior to OSX 10.10 and iOS 8.0, the control timebase could not be changed after enqueueSampleBuffer:
     * was called. As of OSX 10.10 and iOS 8.0, the control timebase may be changed at any time.
     */
    @Nullable
    @Generated
    @Selector("controlTimebase")
    public native CMTimebaseRef controlTimebase();

    @Deprecated
    @Generated
    @Selector("enqueueSampleBuffer:")
    public native void enqueueSampleBuffer(@NotNull CMSampleBufferRef sampleBuffer);

    /**
     * [@property] error
     * 
     * If the display layer's status is AVQueuedSampleBufferRenderingStatusFailed, this describes the error that caused
     * the failure.
     * 
     * The value of this property is an NSError that describes what caused the display layer to no longer be able to
     * enqueue sample buffers. If the status is not AVQueuedSampleBufferRenderingStatusFailed, the value of this
     * property is nil.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use sampleBufferRenderer's error instead
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    @Deprecated
    @Generated
    @Selector("flush")
    public native void flush();

    /**
     * flushAndRemoveImage
     * 
     * Instructs the layer to discard pending enqueued sample buffers and remove any
     * currently displayed image.
     * 
     * It is not possible to determine which sample buffers have been decoded,
     * so the next frame passed to enqueueSampleBuffer: should be an IDR frame
     * (also known as a key frame or sync sample).
     * 
     * API-Since: 8.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use sampleBufferRenderer's flushWithRemovalOfDisplayedImage:completionHandler: instead
     */
    @Deprecated
    @Generated
    @Selector("flushAndRemoveImage")
    public native void flushAndRemoveImage();

    @Generated
    @Selector("init")
    public native AVSampleBufferDisplayLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native AVSampleBufferDisplayLayer initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithLayer:")
    public native AVSampleBufferDisplayLayer initWithLayer(@NotNull @Mapped(ObjCObjectMapper.class) Object layer);

    @Deprecated
    @Generated
    @Selector("isReadyForMoreMediaData")
    public native boolean isReadyForMoreMediaData();

    @Deprecated
    @Generated
    @Selector("requestMediaDataWhenReadyOnQueue:usingBlock:")
    public native void requestMediaDataWhenReadyOnQueueUsingBlock(@NotNull dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_requestMediaDataWhenReadyOnQueueUsingBlock") AVQueuedSampleBufferRendering.Block_requestMediaDataWhenReadyOnQueueUsingBlock block);

    /**
     * [@property] controlTimebase
     * 
     * The layer's control timebase, which governs how time stamps are interpreted.
     * 
     * By default, this property is NULL, in which case time stamps will be interpreted
     * according to the host time clock (mach_absolute_time with the appropriate timescale
     * conversion; this is the same as Core Animation's CACurrentMediaTime). With no
     * control timebase, once frames are enqueued, it is not possible to adjust exactly
     * when they are displayed.
     * 
     * If a non-NULL control timebase is set, it will be used to interpret time stamps.
     * You can control the timing of frame display by setting the rate and time of the
     * control timebase.
     * If you are synchronizing video to audio, you can use a timebase whose source clock
     * is a CMAudioDeviceClock for the appropriate audio device to prevent drift.
     * 
     * Note that prior to OSX 10.10 and iOS 8.0, the control timebase could not be changed after enqueueSampleBuffer:
     * was called. As of OSX 10.10 and iOS 8.0, the control timebase may be changed at any time.
     */
    @Generated
    @Selector("setControlTimebase:")
    public native void setControlTimebase(@Nullable CMTimebaseRef value);

    /**
     * [@property] videoGravity
     * 
     * A string defining how the video is displayed within an AVSampleBufferDisplayLayer bounds rect.
     * [@discusssion] Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill
     * and AVLayerVideoGravityResize. AVLayerVideoGravityResizeAspect is default.
     * See <AVFoundation/AVAnimation.h> for a description of these options.
     */
    @Generated
    @Selector("setVideoGravity:")
    public native void setVideoGravity(@NotNull String value);

    /**
     * [@property] status
     * 
     * The ability of the display layer to be used for enqueuing sample buffers.
     * 
     * The value of this property is an AVQueuedSampleBufferRenderingStatus that indicates whether the receiver can be
     * used for enqueuing and rendering sample buffers. When the value of this property is
     * AVQueuedSampleBufferRenderingStatusFailed, clients can check the value of the error property to determine the
     * failure. To resume rendering sample buffers using the display layer after a failure, clients must first reset the
     * status to AVQueuedSampleBufferRenderingStatusUnknown. This can be achieved by invoking -flush on the display
     * layer.
     * 
     * This property is key value observable.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use sampleBufferRenderer's status instead
     */
    @Deprecated
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Deprecated
    @Generated
    @Selector("stopRequestingMediaData")
    public native void stopRequestingMediaData();

    /**
     * [@property] videoGravity
     * 
     * A string defining how the video is displayed within an AVSampleBufferDisplayLayer bounds rect.
     * [@discusssion] Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill
     * and AVLayerVideoGravityResize. AVLayerVideoGravityResizeAspect is default.
     * See <AVFoundation/AVAnimation.h> for a description of these options.
     */
    @NotNull
    @Generated
    @Selector("videoGravity")
    public native String videoGravity();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Deprecated
    @NotNull
    @Generated
    @Selector("timebase")
    public native CMTimebaseRef timebase();

    @Generated
    @Selector("cornerCurveExpansionFactor:")
    @NFloat
    public static native double cornerCurveExpansionFactor(@NotNull String curve);

    /**
     * [@property] preventsCapture
     * 
     * Indicates that image data should be protected from capture.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("preventsCapture")
    public native boolean preventsCapture();

    /**
     * [@property] preventsDisplaySleepDuringVideoPlayback
     * 
     * Indicates whether video playback prevents display and device sleep.
     * 
     * Default is YES on iOS, tvOS and in Mac Catalyst apps. Default is NO on macOS.
     * Setting this property to NO does not force the display to sleep, it simply stops preventing display sleep. Other
     * apps or frameworks within your app may still be preventing display sleep for various reasons.
     * Note: If sample buffers are being enqueued for playback at the user's request, you should ensure that the value
     * of this property is set to YES. If video is not being displayed as part of the user's primary focus, you should
     * ensure that the value of this property is set to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("preventsDisplaySleepDuringVideoPlayback")
    public native boolean preventsDisplaySleepDuringVideoPlayback();

    /**
     * [@property] preventsCapture
     * 
     * Indicates that image data should be protected from capture.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPreventsCapture:")
    public native void setPreventsCapture(boolean value);

    /**
     * [@property] preventsDisplaySleepDuringVideoPlayback
     * 
     * Indicates whether video playback prevents display and device sleep.
     * 
     * Default is YES on iOS, tvOS and in Mac Catalyst apps. Default is NO on macOS.
     * Setting this property to NO does not force the display to sleep, it simply stops preventing display sleep. Other
     * apps or frameworks within your app may still be preventing display sleep for various reasons.
     * Note: If sample buffers are being enqueued for playback at the user's request, you should ensure that the value
     * of this property is set to YES. If video is not being displayed as part of the user's primary focus, you should
     * ensure that the value of this property is set to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPreventsDisplaySleepDuringVideoPlayback:")
    public native void setPreventsDisplaySleepDuringVideoPlayback(boolean value);

    /**
     * [@property] requiresFlushToResumeDecoding
     * 
     * Indicates that the receiver is in a state where it requires a call to -flush to continue decoding frames.
     * 
     * When the application enters a state where use of video decoder resources is not permissible, the value of this
     * property changes to YES along with the display layer's status changing to
     * AVQueuedSampleBufferRenderingStatusFailed.
     * To resume rendering sample buffers using the display layer after this property's value is YES, clients must first
     * reset the display layer's status to AVQueuedSampleBufferRenderingStatusUnknown. This can be achieved by invoking
     * -flush on the display layer.
     * Clients can track changes to this property via
     * AVSampleBufferDisplayLayerRequiresFlushToResumeDecodingDidChangeNotification.
     * This property is not key value observable.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use sampleBufferRenderer's requiresFlushToResumeDecoding instead
     */
    @Deprecated
    @Generated
    @Selector("requiresFlushToResumeDecoding")
    public native boolean requiresFlushToResumeDecoding();

    @Deprecated
    @Generated
    @Selector("hasSufficientMediaDataForReliablePlaybackStart")
    public native boolean hasSufficientMediaDataForReliablePlaybackStart();

    /**
     * [@property] outputObscuredDueToInsufficientExternalProtection
     * 
     * Whether or not decoded output is being obscured due to insufficient external protection.
     * 
     * The value of this property indicates whether the layer is purposefully obscuring its visual output
     * because the requirement for an external protection mechanism is not met by the current device
     * configuration. The change of this property can be observed through
     * AVSampleBufferDisplayLayerOutputObscuredDueToInsufficientExternalProtectionDidChangeNotification
     * 
     * It is highly recommended that clients whose content requires external
     * protection observe this property and set the playback rate to zero and display an appropriate user
     * interface when the value changes to YES.
     * 
     * Note that the value of this property is dependent on the external protection requirements of the
     * media being displayed by the layer. These requirements are inherent to the content itself and cannot
     * be externally specified. If the content does not require external protection, the value of this
     * property will be NO.
     * 
     * API-Since: 14.5
     */
    @Generated
    @Selector("outputObscuredDueToInsufficientExternalProtection")
    public native boolean outputObscuredDueToInsufficientExternalProtection();

    /**
     * [@property] sampleBufferRenderer
     * 
     * An AVSampleBufferVideoRenderer instance that allows enqueuing sample buffers for rendering.
     * 
     * Although AVSampleBufferDisplayLayer conforms to the AVQueuedSampleBufferRendering protocol, the
     * sampleBufferRenderer should be used to enqueue sample buffers. sampleBufferRenderer allows the client to safely
     * enqueue sample buffers from a background thread. NOTE: Do not use AVSampleBufferDisplayLayer's
     * AVQueuedSampleBufferRendering functions when using sampleBufferRenderer.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("sampleBufferRenderer")
    @NotNull
    public native AVSampleBufferVideoRenderer sampleBufferRenderer();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
