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
import apple.coremedia.opaque.CMClockRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
 * API-Since: 4.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayer allocWithZone(VoidPtr zone);

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
    public static native AVPlayer new_objc();

    /**
     * playerWithPlayerItem:
     * 
     * Create an AVPlayer that plays a single audiovisual item.
     * 
     * Useful in order to play items for which an AVAsset has previously been created. See -[AVPlayerItem
     * initWithAsset:].
     * 
     * @param item
     * @return An instance of AVPlayer
     */
    @Generated
    @Selector("playerWithPlayerItem:")
    public static native AVPlayer playerWithPlayerItem(@Nullable AVPlayerItem item);

    /**
     * playerWithURL:
     * 
     * Returns an instance of AVPlayer that plays a single audiovisual resource referenced by URL.
     * 
     * Implicitly creates an AVPlayerItem. Clients can obtain the AVPlayerItem as it becomes the player's currentItem.
     * 
     * @param URL
     * @return An instance of AVPlayer
     */
    @Generated
    @Selector("playerWithURL:")
    public static native AVPlayer playerWithURL(@NotNull NSURL URL);

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
     * [@property] actionAtItemEnd
     * 
     * Indicates the action that the player should perform when playback of an item reaches its end time.
     * 
     * This property throws an exception if set to AVPlayerActionAtItemEndAdvance on an AVPlayer which is not an
     * AVQueuePlayer.
     */
    @Generated
    @Selector("actionAtItemEnd")
    @NInt
    public native long actionAtItemEnd();

    /**
     * addBoundaryTimeObserverForTimes:queue:usingBlock:
     * 
     * Requests invocation of a block when specified times are traversed during normal playback.
     * 
     * Each call to -addPeriodicTimeObserverForInterval:queue:usingBlock: should be paired with a corresponding call to
     * -removeTimeObserver:.
     * Releasing the observer object without a call to -removeTimeObserver: will result in undefined behavior.
     * 
     * @param times
     *              The times for which the observer requests notification, supplied as an array of NSValues carrying
     *              CMTimes.
     * @param queue
     *              The serial queue onto which block should be enqueued. If you pass NULL, the main queue (obtained
     *              using dispatch_get_main_queue()) will be used. Passing a
     *              concurrent queue to this method will result in undefined behavior.
     * @param block
     *              The block to be invoked when any of the specified times is crossed during normal playback.
     * @return
     *         An object conforming to the NSObject protocol. You must retain this returned value as long as you want
     *         the time observer to be invoked by the player.
     *         Pass this object to -removeTimeObserver: to cancel time observation.
     */
    @NotNull
    @Generated
    @Selector("addBoundaryTimeObserverForTimes:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object addBoundaryTimeObserverForTimesQueueUsingBlock(@NotNull NSArray<? extends NSValue> times,
            @Nullable NSObject queue,
            @NotNull @ObjCBlock(name = "call_addBoundaryTimeObserverForTimesQueueUsingBlock") Block_addBoundaryTimeObserverForTimesQueueUsingBlock block);

    /**
     * addPeriodicTimeObserverForInterval:queue:usingBlock:
     * 
     * Requests invocation of a block during playback to report changing time.
     * 
     * The block is invoked periodically at the interval specified, interpreted according to the timeline of the current
     * item.
     * The block is also invoked whenever time jumps and whenever playback starts or stops.
     * If the interval corresponds to a very short interval in real time, the player may invoke the block less
     * frequently
     * than requested. Even so, the player will invoke the block sufficiently often for the client to update indications
     * of the current time appropriately in its end-user interface.
     * Each call to -addPeriodicTimeObserverForInterval:queue:usingBlock: should be paired with a corresponding call to
     * -removeTimeObserver:.
     * Releasing the observer object without a call to -removeTimeObserver: will result in undefined behavior.
     * 
     * @param interval
     *                 The interval of invocation of the block during normal playback, according to progress of the
     *                 current time of the player.
     * @param queue
     *                 The serial queue onto which block should be enqueued. If you pass NULL, the main queue (obtained
     *                 using dispatch_get_main_queue()) will be used. Passing a
     *                 concurrent queue to this method will result in undefined behavior.
     * @param block
     *                 The block to be invoked periodically.
     * @return
     *         An object conforming to the NSObject protocol. You must retain this returned value as long as you want
     *         the time observer to be invoked by the player.
     *         Pass this object to -removeTimeObserver: to cancel time observation.
     */
    @NotNull
    @Generated
    @Selector("addPeriodicTimeObserverForInterval:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object addPeriodicTimeObserverForIntervalQueueUsingBlock(@ByValue CMTime interval,
            @Nullable NSObject queue,
            @NotNull @ObjCBlock(name = "call_addPeriodicTimeObserverForIntervalQueueUsingBlock") Block_addPeriodicTimeObserverForIntervalQueueUsingBlock block);

    /**
     * Indicates whether the player allows AirPlay Video playback. The default value is YES.
     * This property is deprecated. Use AVPlayer's -allowsExternalPlayback instead.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("allowsAirPlayVideo")
    public native boolean allowsAirPlayVideo();

    /**
     * Indicates whether the player allows switching to "external playback" mode. The default value is YES.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("allowsExternalPlayback")
    public native boolean allowsExternalPlayback();

    /**
     * Indicates whether the receiver should apply the current selection criteria automatically to AVPlayerItems.
     * For clients linked against the iOS 7 SDK or later or against the OS X 10.9 SDK or later, the default is YES. For
     * all others, the default is NO.
     * 
     * By default, AVPlayer applies selection criteria based on system preferences. To override the default criteria for
     * any media selection group, use -[AVPlayer setMediaSelectionCriteria:forMediaCharacteristic:].
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("appliesMediaSelectionCriteriaAutomatically")
    public native boolean appliesMediaSelectionCriteriaAutomatically();

    /**
     * [@property] automaticallyWaitsToMinimizeStalling
     * 
     * Indicates that the player is allowed to delay playback at the specified rate in order to minimize stalling
     * 
     * 
     * When this property is YES, whenever 1) the rate is set from zero to non-zero or 2) the playback buffer becomes
     * empty and playback stalls, the player will attempt to determine if, at the specified rate, its currentItem will
     * play to the end without interruptions. Should it determine that such interruptions would occur and these
     * interruptions can be avoided by delaying the start or resumption of playback, the value of timeControlStatus will
     * become AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate and playback will start automatically when the
     * likelihood of stalling has been minimized.
     * 
     * You may want to set this property to NO when you need precise control over playback start times, e.g., when
     * synchronizing multiple instances of AVPlayer, and you should set it to NO if you use an AVAssetResourceLoader
     * delegate to load media data (more on this below). If the value of this property is NO, reasonForWaitingToPlay
     * cannot assume a value of AVPlayerWaitingToMinimizeStallsReason.
     * This implies that setting rate to a non-zero value in AVPlayerTimeControlStatusPaused will cause playback to
     * start immediately as long as the playback buffer is not empty. When the playback buffer becomes empty during
     * AVPlayerTimeControlStatusPlaying and playback stalls, playback state will switch to
     * AVPlayerTimeControlStatusPaused and the rate will become 0.0.
     * 
     * Changing the value of this property to NO while the value of timeControlStatus is
     * AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate with a reasonForWaitingToPlay of
     * AVPlayerWaitingToMinimizeStallsReason will cause the player to attempt playback at the specified rate
     * immediately.
     * 
     * For clients linked against iOS 10.0 and running on that version or later or linked against OS X 10.12 and running
     * on that version or later, the default value of this property is YES.
     * In versions of iOS prior to iOS 10.0 and versions of OS X prior to 10.12, this property is unavailable, and the
     * behavior of the AVPlayer corresponds to the type of content being played. For streaming content, including HTTP
     * Live Streaming, the AVPlayer acts as if automaticallyWaitsToMinimizeStalling is YES. For file-based content,
     * including file-based content accessed via progressive http download, the AVPlayer acts as if
     * automaticallyWaitsToMinimizeStalling is NO.
     * 
     * If you employ an AVAssetResourceLoader delegate that loads media data for playback, you should set the value of
     * your AVPlayer’s automaticallyWaitsToMinimizeStalling property to NO. Allowing the value of
     * automaticallyWaitsToMinimizeStalling to remain YES when an AVAssetResourceLoader delegate is used for the loading
     * of media data can result in poor start-up times for playback and poor recovery from stalls, because the behaviors
     * provided by AVPlayer when automaticallyWaitsToMinimizeStalling has a value of YES depend on predictions of the
     * future availability of media data that that do not function as expected when data is loaded via a
     * client-controlled means, using the AVAssetResourceLoader delegate interface.
     * 
     * You can allow the value of automaticallyWaitsToMinimizeStalling to remain YES if you use an AVAssetResourceLoader
     * delegate to manage content keys for FairPlay Streaming, to provide dynamically-generated master playlists for
     * HTTP Live Streaming, or to respond to authentication challenges, but not to load media data for playback.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("automaticallyWaitsToMinimizeStalling")
    public native boolean automaticallyWaitsToMinimizeStalling();

    /**
     * cancelPendingPrerolls
     * 
     * Cancel any pending preroll requests and invoke the corresponding completion handlers if present.
     * 
     * Use this method to cancel and release the completion handlers for pending prerolls. The finished parameter of the
     * completion handlers will be set to NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("cancelPendingPrerolls")
    public native void cancelPendingPrerolls();

    /**
     * indicates the current item of the player
     */
    @Nullable
    @Generated
    @Selector("currentItem")
    public native AVPlayerItem currentItem();

    /**
     * currentTime
     * 
     * Returns the current time of the current item.
     * 
     * Returns the current time of the current item. Not key-value observable; use
     * -addPeriodicTimeObserverForInterval:queue:usingBlock: instead.
     * 
     * @return A CMTime
     */
    @Generated
    @Selector("currentTime")
    @ByValue
    public native CMTime currentTime();

    /**
     * [@property] error
     * 
     * If the receiver's status is AVPlayerStatusFailed, this describes the error that caused the failure.
     * 
     * The value of this property is an NSError that describes what caused the receiver to no longer be able to play
     * items.
     * If the receiver's status is not AVPlayerStatusFailed, the value of this property is nil.
     */
    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * Video gravity strictly for "external playback" mode, one of AVLayerVideoGravity* defined in AVAnimation.h
     * 
     * API-Since: 6.0
     */
    @NotNull
    @Generated
    @Selector("externalPlaybackVideoGravity")
    public native String externalPlaybackVideoGravity();

    @Generated
    @Selector("init")
    public native AVPlayer init();

    /**
     * initWithPlayerItem:
     * 
     * Create an AVPlayer that plays a single audiovisual item.
     * 
     * Useful in order to play items for which an AVAsset has previously been created. See -[AVPlayerItem
     * initWithAsset:].
     * This method throws an exception if the item is not an AVPlayerItem, or if the item is
     * associated with another AVPlayer.
     * 
     * @param item
     * @return An instance of AVPlayer
     */
    @Generated
    @Selector("initWithPlayerItem:")
    public native AVPlayer initWithPlayerItem(@Nullable AVPlayerItem item);

    /**
     * initWithURL:
     * 
     * Initializes an AVPlayer that plays a single audiovisual resource referenced by URL.
     * 
     * Implicitly creates an AVPlayerItem. Clients can obtain the AVPlayerItem as it becomes the player's currentItem.
     * 
     * @param URL
     * @return An instance of AVPlayer
     */
    @Generated
    @Selector("initWithURL:")
    public native AVPlayer initWithURL(@NotNull NSURL URL);

    /**
     * Indicates whether the player is currently playing video via AirPlay.
     * This property is deprecated. Use AVPlayer's -externalPlaybackActive instead.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("isAirPlayVideoActive")
    public native boolean isAirPlayVideoActive();

    /**
     * [@property] closedCaptionDisplayEnabled
     * 
     * Indicates whether display of closed captions is enabled.
     * 
     * This property is deprecated.
     * 
     * When the value of appliesMediaSelectionCriteriaAutomatically is YES, the receiver will enable closed captions
     * automatically either according to user preferences or, if you provide them, according to
     * AVPlayerMediaSelectionCriteria for the media characteristic AVMediaCharacteristicLegible.
     * 
     * If you want to determine whether closed captions may be available for a given AVPlayerItem, you can examine the
     * AVMediaSelectionOptions in the AVMediaSelectionGroup for the characteristic AVMediaCharacteristicLegible, as
     * vended by -[AVAsset mediaSelectionGroupForMediaCharacteristic:]. See
     * AVMediaCharacteristicTranscribesSpokenDialogForAccessibility and
     * AVMediaCharacteristicDescribesMusicAndSoundForAccessibility as documented in AVMediaFormat.h for information
     * about how to identify legible media selection options that offer the features of closed captions for
     * accessibility purposes.
     * 
     * You can select or deselect a specific AVMediaSelectionOption via -[AVPlayerItem
     * selectMediaOption:inMediaSelectionGroup:].
     * 
     * For further information about Media Accessibility preferences, see MediaAccessibility framework documentation.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Allow AVPlayer to enable closed captions automatically according to user preferences by
     * ensuring that the value of appliesMediaSelectionCriteriaAutomatically is YES.
     */
    @Deprecated
    @Generated
    @Selector("isClosedCaptionDisplayEnabled")
    public native boolean isClosedCaptionDisplayEnabled();

    /**
     * [@property] closedCaptionDisplayEnabled
     * 
     * Indicates whether display of closed captions is enabled.
     * 
     * This property is deprecated.
     * 
     * When the value of appliesMediaSelectionCriteriaAutomatically is YES, the receiver will enable closed captions
     * automatically either according to user preferences or, if you provide them, according to
     * AVPlayerMediaSelectionCriteria for the media characteristic AVMediaCharacteristicLegible.
     * 
     * If you want to determine whether closed captions may be available for a given AVPlayerItem, you can examine the
     * AVMediaSelectionOptions in the AVMediaSelectionGroup for the characteristic AVMediaCharacteristicLegible, as
     * vended by -[AVAsset mediaSelectionGroupForMediaCharacteristic:]. See
     * AVMediaCharacteristicTranscribesSpokenDialogForAccessibility and
     * AVMediaCharacteristicDescribesMusicAndSoundForAccessibility as documented in AVMediaFormat.h for information
     * about how to identify legible media selection options that offer the features of closed captions for
     * accessibility purposes.
     * 
     * You can select or deselect a specific AVMediaSelectionOption via -[AVPlayerItem
     * selectMediaOption:inMediaSelectionGroup:].
     * 
     * For further information about Media Accessibility preferences, see MediaAccessibility framework documentation.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Allow AVPlayer to enable closed captions automatically according to user preferences by
     * ensuring that the value of appliesMediaSelectionCriteriaAutomatically is YES.
     */
    @Deprecated
    @Generated
    @Selector("setClosedCaptionDisplayEnabled:")
    public native void setClosedCaptionDisplayEnabled(boolean value);

    /**
     * Indicates whether the player is currently playing video in "external playback" mode.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("isExternalPlaybackActive")
    public native boolean isExternalPlaybackActive();

    /**
     * indicates whether or not audio output of the player is muted. Only affects audio muting for the player instance
     * and not for the device.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isMuted")
    public native boolean isMuted();

    /**
     * indicates whether or not audio output of the player is muted. Only affects audio muting for the player instance
     * and not for the device.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setMuted:")
    public native void setMuted(boolean value);

    /**
     * Use sourceClock instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 100000.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("masterClock")
    public native CMClockRef masterClock();

    /**
     * mediaSelectionCriteriaForMediaCharacteristic:
     * 
     * Returns the automatic selection criteria for media that has the specified media characteristic.
     * 
     * @param mediaCharacteristic
     *                            The media characteristic for which the selection criteria is to be returned. Supported
     *                            values include AVMediaCharacteristicAudible, AVMediaCharacteristicLegible, and
     *                            AVMediaCharacteristicVisual.
     * 
     *                            Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this method must be invoked on the
     *                            main thread/queue.
     * 
     *                            API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("mediaSelectionCriteriaForMediaCharacteristic:")
    public native AVPlayerMediaSelectionCriteria mediaSelectionCriteriaForMediaCharacteristic(
            @NotNull String mediaCharacteristic);

    /**
     * [@property] outputObscuredDueToInsufficientExternalProtection
     * 
     * Whether or not decoded output is being obscured due to insufficient external protection.
     * 
     * The value of this property indicates whether the player is purposefully obscuring the visual output
     * of the current item because the requirement for an external protection mechanism is not met by the
     * current device configuration. It is highly recommended that clients whose content requires external
     * protection observe this property and set the playback rate to zero and display an appropriate user
     * interface when the value changes to YES. This property is key value observable.
     * 
     * Note that the value of this property is dependent on the external protection requirements of the
     * current item. These requirements are inherent to the content itself and cannot be externally specified.
     * If the current item does not require external protection, the value of this property will be NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("outputObscuredDueToInsufficientExternalProtection")
    public native boolean outputObscuredDueToInsufficientExternalProtection();

    /**
     * pause
     * 
     * Pauses playback.
     * 
     * Equivalent to setting the value of rate to 0.0.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this method must be invoked on the main thread/queue.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * play
     * 
     * Signals the desire to begin playback at the rate set in the defaultRate.
     * 
     * For releases up to iOS version 16.0, macOS versions 13.0, tvOS 16.0 and watchOS 9.0, this is equivalent to
     * setting the value of rate to `1.0`. Starting from iOS version 16.0, macOS versions 13.0, tvOS 16.0 and watchOS
     * 9.0, this will attempt to use the rate set in the `defaultRate` property. The effective rate of playback may
     * differ from the `defaultRate` due to the reasons mentioned in the documentation of the `rate` property. Clients
     * interested in knowing the effective rate can listen for `AVPlayerRateDidChangeNotification` notification.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this method must be invoked on the main thread/queue.
     */
    @Generated
    @Selector("play")
    public native void play();

    /**
     * playImmediatelyAtRate:
     * 
     * Immediately plays the available media data at the specified rate.
     * 
     * When the player's currentItem has a value of NO for playbackBufferEmpty, this method causes the value of rate to
     * change to the specified rate, the value of timeControlStatus to change to AVPlayerTimeControlStatusPlaying, and
     * the receiver to play the available media immediately, whether or not prior buffering of media data is sufficient
     * to ensure smooth playback.
     * If insufficient media data is buffered for playback to start (e.g. if the current item has a value of YES for
     * playbackBufferEmpty), the receiver will act as if the buffer became empty during playback, except that no
     * AVPlayerItemPlaybackStalledNotification will be posted.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this method must be invoked on the main thread/queue.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("playImmediatelyAtRate:")
    public native void playImmediatelyAtRate(float rate);

    /**
     * prerollAtRate:completionHandler:
     * 
     * Begins loading media data to prime the render pipelines for playback from the current time with the given rate.
     * 
     * Once the completion handler is called with YES, the player's rate can be set with minimal latency.
     * The completion handler will be called with NO if the preroll is interrupted by a time change or incompatible rate
     * change, or if preroll is not possible for some other reason.
     * Call this method only when the rate is currently zero and only after the AVPlayer's status has become
     * AVPlayerStatusReadyToPlay.
     * This method throws an exception if the status is not AVPlayerStatusReadyToPlay.
     * 
     * @param rate              The intended rate for subsequent playback.
     * @param completionHandler
     *                          The block that will be called when the preroll is either completed or is interrupted.
     * 
     *                          API-Since: 6.0
     */
    @Generated
    @Selector("prerollAtRate:completionHandler:")
    public native void prerollAtRateCompletionHandler(float rate,
            @Nullable @ObjCBlock(name = "call_prerollAtRateCompletionHandler") Block_prerollAtRateCompletionHandler completionHandler);

    /**
     * [@property] rate
     * 
     * Indicates the desired rate of playback; 0.0 means "paused", 1.0 indicates a desire to play at the natural rate of
     * the current item.
     * 
     * Setting the value of rate to 0.0 pauses playback, causing the value of timeControlStatus to change to
     * AVPlayerTimeControlStatusPaused.
     * Setting the rate to a non-zero value causes the value of timeControlStatus to become either
     * AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate or AVPlayerTimeControlStatusPlaying, depending on whether
     * sufficient media data has been buffered for playback to occur and whether the player's default behavior of
     * waiting in order to minimize stalling is permitted. See discussion of AVPlayerTimeControlStatus for more details.
     * 
     * AVPlayer can reset the desired rate to 0.0 when a change in overall state requires playback to be halted, such as
     * when an interruption occurs on iOS, as announced by AVAudioSession, or when the playback buffer becomes empty and
     * playback stalls while automaticallyWaitsToMinimizeStalling is NO.
     * 
     * The effective rate of playback may differ from the desired rate even while timeControlStatus is
     * AVPlayerTimeControlStatusPlaying, if the processing algorithm in use for managing audio pitch requires
     * quantization of playback rate. For information about quantization of rates for audio processing, see
     * AVAudioProcessingSettings.h. You can always obtain the effective rate of playback from the currentItem's
     * timebase; see the timebase property of AVPlayerItem.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     */
    @Generated
    @Selector("rate")
    public native float rate();

    /**
     * [@property] reasonForWaitingToPlay
     * 
     * Indicates the reason for waiting when the value of timeControlStatus is
     * AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate
     * 
     * When the value of timeControlStatus is AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate, this property
     * describes why the player is currently waiting. It is nil otherwise.
     * You can use the value of reasonForWaitingToPlay to show UI indicating the player's waiting state conditionally.
     * This property is key value observable.
     * Possible values are AVPlayerWaitingWithNoItemToPlayReason, AVPlayerWaitingWhileEvaluatingBufferingRateReason, and
     * AVPlayerWaitingToMinimizeStallsReason.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("reasonForWaitingToPlay")
    public native String reasonForWaitingToPlay();

    /**
     * removeTimeObserver:
     * 
     * Cancels a previously registered time observer.
     * 
     * Upon return, the caller is guaranteed that no new time observer blocks will begin executing. Depending on the
     * calling thread and the queue
     * used to add the time observer, an in-flight block may continue to execute after this method returns. You can
     * guarantee synchronous time
     * observer removal by enqueuing the call to -removeTimeObserver: on that queue. Alternatively, call
     * dispatch_sync(queue, ^{}) after
     * -removeTimeObserver: to wait for any in-flight blocks to finish executing.
     * -removeTimeObserver: should be used to explicitly cancel each time observer added using
     * -addPeriodicTimeObserverForInterval:queue:usingBlock:
     * and -addBoundaryTimeObserverForTimes:queue:usingBlock:.
     * 
     * This method throws an exception for any of the following reasons:
     * - observer was added by a different instance of AVPlayer
     * - observer was not returned by -addPeriodicTimeObserverForInterval:queue:usingBlock:
     * - observer was not returned by -addBoundaryTimeObserverForTimes:queue:usingBlock:
     * 
     * @param observer
     *                 An object returned by a previous call to -addPeriodicTimeObserverForInterval:queue:usingBlock: or
     *                 -addBoundaryTimeObserverForTimes:queue:usingBlock:.
     */
    @Generated
    @Selector("removeTimeObserver:")
    public native void removeTimeObserver(@NotNull @Mapped(ObjCObjectMapper.class) Object observer);

    /**
     * replaceCurrentItemWithPlayerItem:
     * 
     * Replaces the player's current item with the specified player item.
     * 
     * In all releases of iOS 4, invoking replaceCurrentItemWithPlayerItem: with an AVPlayerItem that's already the
     * receiver's currentItem results in an exception being raised. Starting with iOS 5, it's a no-op.
     * This method throws an exception if the item already exists in the play queue.
     * 
     * @param item
     *             The AVPlayerItem that will become the player's current item.
     */
    @Generated
    @Selector("replaceCurrentItemWithPlayerItem:")
    public native void replaceCurrentItemWithPlayerItem(@Nullable AVPlayerItem item);

    /**
     * seekToDate:
     * 
     * Moves the playback cursor.
     * 
     * Use this method to seek to a specified time for the current player item.
     * The time seeked to may differ from the specified time for efficiency. For sample accurate seeking see
     * seekToTime:toleranceBefore:toleranceAfter:.
     * 
     * @param date
     */
    @Generated
    @Selector("seekToDate:")
    public native void seekToDate(@NotNull NSDate date);

    /**
     * seekToDate:completionHandler:
     * 
     * Moves the playback cursor and invokes the specified block when the seek operation has either been completed or
     * been interrupted.
     * 
     * Use this method to seek to a specified time for the current player item and to be notified when the seek
     * operation is complete.
     * The completion handler for any prior seek request that is still in process will be invoked immediately with the
     * finished parameter
     * set to NO. If the new request completes without being interrupted by another seek request or by any other
     * operation the specified
     * completion handler will be invoked with the finished parameter set to YES. If no item is attached, the completion
     * handler will be
     * invoked immediately with the finished parameter set to NO.
     * 
     * API-Since: 5.0
     * 
     * @param date
     * @param completionHandler
     */
    @Generated
    @Selector("seekToDate:completionHandler:")
    public native void seekToDateCompletionHandler(@NotNull NSDate date,
            @NotNull @ObjCBlock(name = "call_seekToDateCompletionHandler") Block_seekToDateCompletionHandler completionHandler);

    /**
     * seekToTime:
     * 
     * Moves the playback cursor.
     * 
     * Use this method to seek to a specified time for the current player item.
     * The time seeked to may differ from the specified time for efficiency. For sample accurate seeking see
     * seekToTime:toleranceBefore:toleranceAfter:.
     * 
     * @param time
     */
    @Generated
    @Selector("seekToTime:")
    public native void seekToTime(@ByValue CMTime time);

    /**
     * seekToTime:completionHandler:
     * 
     * Moves the playback cursor and invokes the specified block when the seek operation has either been completed or
     * been interrupted.
     * 
     * Use this method to seek to a specified time for the current player item and to be notified when the seek
     * operation is complete.
     * The completion handler for any prior seek request that is still in process will be invoked immediately with the
     * finished parameter
     * set to NO. If the new request completes without being interrupted by another seek request or by any other
     * operation the specified
     * completion handler will be invoked with the finished parameter set to YES. If no item is attached, the completion
     * handler will be
     * invoked immediately with the finished parameter set to NO.
     * 
     * API-Since: 5.0
     * 
     * @param time
     * @param completionHandler
     */
    @Generated
    @Selector("seekToTime:completionHandler:")
    public native void seekToTimeCompletionHandler(@ByValue CMTime time,
            @NotNull @ObjCBlock(name = "call_seekToTimeCompletionHandler") Block_seekToTimeCompletionHandler completionHandler);

    /**
     * seekToTime:toleranceBefore:toleranceAfter:
     * 
     * Moves the playback cursor within a specified time bound.
     * 
     * Use this method to seek to a specified time for the current player item.
     * The time seeked to will be within the range [time-toleranceBefore, time+toleranceAfter] and may differ from the
     * specified time for efficiency.
     * Pass kCMTimeZero for both toleranceBefore and toleranceAfter to request sample accurate seeking which may incur
     * additional decoding delay.
     * Messaging this method with beforeTolerance:kCMTimePositiveInfinity and afterTolerance:kCMTimePositiveInfinity is
     * the same as messaging seekToTime: directly.
     * 
     * @param time
     * @param toleranceBefore
     * @param toleranceAfter
     */
    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:")
    public native void seekToTimeToleranceBeforeToleranceAfter(@ByValue CMTime time, @ByValue CMTime toleranceBefore,
            @ByValue CMTime toleranceAfter);

    /**
     * seekToTime:toleranceBefore:toleranceAfter:completionHandler:
     * 
     * Moves the playback cursor within a specified time bound and invokes the specified block when the seek operation
     * has either been completed or been interrupted.
     * 
     * Use this method to seek to a specified time for the current player item and to be notified when the seek
     * operation is complete.
     * The time seeked to will be within the range [time-toleranceBefore, time+toleranceAfter] and may differ from the
     * specified time for efficiency.
     * Pass kCMTimeZero for both toleranceBefore and toleranceAfter to request sample accurate seeking which may incur
     * additional decoding delay.
     * Messaging this method with beforeTolerance:kCMTimePositiveInfinity and afterTolerance:kCMTimePositiveInfinity is
     * the same as messaging seekToTime: directly.
     * The completion handler for any prior seek request that is still in process will be invoked immediately with the
     * finished parameter set to NO. If the new
     * request completes without being interrupted by another seek request or by any other operation the specified
     * completion handler will be invoked with the
     * finished parameter set to YES. If no item is attached, the completion handler will be invoked immediately with
     * the finished parameter set to NO.
     * 
     * API-Since: 5.0
     * 
     * @param time
     * @param toleranceBefore
     * @param toleranceAfter
     */
    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTimeToleranceBeforeToleranceAfterCompletionHandler(@ByValue CMTime time,
            @ByValue CMTime toleranceBefore, @ByValue CMTime toleranceAfter,
            @NotNull @ObjCBlock(name = "call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler") Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler completionHandler);

    /**
     * [@property] actionAtItemEnd
     * 
     * Indicates the action that the player should perform when playback of an item reaches its end time.
     * 
     * This property throws an exception if set to AVPlayerActionAtItemEndAdvance on an AVPlayer which is not an
     * AVQueuePlayer.
     */
    @Generated
    @Selector("setActionAtItemEnd:")
    public native void setActionAtItemEnd(@NInt long value);

    /**
     * Indicates whether the player allows AirPlay Video playback. The default value is YES.
     * This property is deprecated. Use AVPlayer's -allowsExternalPlayback instead.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("setAllowsAirPlayVideo:")
    public native void setAllowsAirPlayVideo(boolean value);

    /**
     * Indicates whether the player allows switching to "external playback" mode. The default value is YES.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAllowsExternalPlayback:")
    public native void setAllowsExternalPlayback(boolean value);

    /**
     * Indicates whether the receiver should apply the current selection criteria automatically to AVPlayerItems.
     * For clients linked against the iOS 7 SDK or later or against the OS X 10.9 SDK or later, the default is YES. For
     * all others, the default is NO.
     * 
     * By default, AVPlayer applies selection criteria based on system preferences. To override the default criteria for
     * any media selection group, use -[AVPlayer setMediaSelectionCriteria:forMediaCharacteristic:].
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setAppliesMediaSelectionCriteriaAutomatically:")
    public native void setAppliesMediaSelectionCriteriaAutomatically(boolean value);

    /**
     * [@property] automaticallyWaitsToMinimizeStalling
     * 
     * Indicates that the player is allowed to delay playback at the specified rate in order to minimize stalling
     * 
     * 
     * When this property is YES, whenever 1) the rate is set from zero to non-zero or 2) the playback buffer becomes
     * empty and playback stalls, the player will attempt to determine if, at the specified rate, its currentItem will
     * play to the end without interruptions. Should it determine that such interruptions would occur and these
     * interruptions can be avoided by delaying the start or resumption of playback, the value of timeControlStatus will
     * become AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate and playback will start automatically when the
     * likelihood of stalling has been minimized.
     * 
     * You may want to set this property to NO when you need precise control over playback start times, e.g., when
     * synchronizing multiple instances of AVPlayer, and you should set it to NO if you use an AVAssetResourceLoader
     * delegate to load media data (more on this below). If the value of this property is NO, reasonForWaitingToPlay
     * cannot assume a value of AVPlayerWaitingToMinimizeStallsReason.
     * This implies that setting rate to a non-zero value in AVPlayerTimeControlStatusPaused will cause playback to
     * start immediately as long as the playback buffer is not empty. When the playback buffer becomes empty during
     * AVPlayerTimeControlStatusPlaying and playback stalls, playback state will switch to
     * AVPlayerTimeControlStatusPaused and the rate will become 0.0.
     * 
     * Changing the value of this property to NO while the value of timeControlStatus is
     * AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate with a reasonForWaitingToPlay of
     * AVPlayerWaitingToMinimizeStallsReason will cause the player to attempt playback at the specified rate
     * immediately.
     * 
     * For clients linked against iOS 10.0 and running on that version or later or linked against OS X 10.12 and running
     * on that version or later, the default value of this property is YES.
     * In versions of iOS prior to iOS 10.0 and versions of OS X prior to 10.12, this property is unavailable, and the
     * behavior of the AVPlayer corresponds to the type of content being played. For streaming content, including HTTP
     * Live Streaming, the AVPlayer acts as if automaticallyWaitsToMinimizeStalling is YES. For file-based content,
     * including file-based content accessed via progressive http download, the AVPlayer acts as if
     * automaticallyWaitsToMinimizeStalling is NO.
     * 
     * If you employ an AVAssetResourceLoader delegate that loads media data for playback, you should set the value of
     * your AVPlayer’s automaticallyWaitsToMinimizeStalling property to NO. Allowing the value of
     * automaticallyWaitsToMinimizeStalling to remain YES when an AVAssetResourceLoader delegate is used for the loading
     * of media data can result in poor start-up times for playback and poor recovery from stalls, because the behaviors
     * provided by AVPlayer when automaticallyWaitsToMinimizeStalling has a value of YES depend on predictions of the
     * future availability of media data that that do not function as expected when data is loaded via a
     * client-controlled means, using the AVAssetResourceLoader delegate interface.
     * 
     * You can allow the value of automaticallyWaitsToMinimizeStalling to remain YES if you use an AVAssetResourceLoader
     * delegate to manage content keys for FairPlay Streaming, to provide dynamically-generated master playlists for
     * HTTP Live Streaming, or to respond to authentication challenges, but not to load media data for playback.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setAutomaticallyWaitsToMinimizeStalling:")
    public native void setAutomaticallyWaitsToMinimizeStalling(boolean value);

    /**
     * Video gravity strictly for "external playback" mode, one of AVLayerVideoGravity* defined in AVAnimation.h
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setExternalPlaybackVideoGravity:")
    public native void setExternalPlaybackVideoGravity(@NotNull String value);

    /**
     * Use sourceClock instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("setMasterClock:")
    public native void setMasterClock(@Nullable CMClockRef value);

    /**
     * setMediaSelectionCriteria:forMediaCharacteristic:
     * 
     * Applies automatic selection criteria for media that has the specified media characteristic.
     * 
     * Criteria will be applied to an AVPlayerItem when:
     * a) It is made ready to play
     * b) Specific media selections are made by -[AVPlayerItem selectMediaOption:inMediaSelectionGroup:] in a different
     * group. The automatic choice in one group may be influenced by a specific selection in another group.
     * c) Underlying system preferences change, e.g. system language, accessibility captions.
     * 
     * Specific selections made by -[AVPlayerItem selectMediaOption:inMediaSelectionGroup:] within any group will
     * override automatic selection in that group until -[AVPlayerItem
     * selectMediaOptionAutomaticallyInMediaSelectionGroup:] is received.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this method must be invoked on the main thread/queue.
     * 
     * API-Since: 7.0
     * 
     * @param criteria
     *                            An instance of AVPlayerMediaSelectionCriteria.
     * @param mediaCharacteristic
     *                            The media characteristic for which the selection criteria are to be applied. Supported
     *                            values include AVMediaCharacteristicAudible, AVMediaCharacteristicLegible, and
     *                            AVMediaCharacteristicVisual.
     */
    @Generated
    @Selector("setMediaSelectionCriteria:forMediaCharacteristic:")
    public native void setMediaSelectionCriteriaForMediaCharacteristic(
            @Nullable AVPlayerMediaSelectionCriteria criteria, @NotNull String mediaCharacteristic);

    /**
     * [@property] rate
     * 
     * Indicates the desired rate of playback; 0.0 means "paused", 1.0 indicates a desire to play at the natural rate of
     * the current item.
     * 
     * Setting the value of rate to 0.0 pauses playback, causing the value of timeControlStatus to change to
     * AVPlayerTimeControlStatusPaused.
     * Setting the rate to a non-zero value causes the value of timeControlStatus to become either
     * AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate or AVPlayerTimeControlStatusPlaying, depending on whether
     * sufficient media data has been buffered for playback to occur and whether the player's default behavior of
     * waiting in order to minimize stalling is permitted. See discussion of AVPlayerTimeControlStatus for more details.
     * 
     * AVPlayer can reset the desired rate to 0.0 when a change in overall state requires playback to be halted, such as
     * when an interruption occurs on iOS, as announced by AVAudioSession, or when the playback buffer becomes empty and
     * playback stalls while automaticallyWaitsToMinimizeStalling is NO.
     * 
     * The effective rate of playback may differ from the desired rate even while timeControlStatus is
     * AVPlayerTimeControlStatusPlaying, if the processing algorithm in use for managing audio pitch requires
     * quantization of playback rate. For information about quantization of rates for audio processing, see
     * AVAudioProcessingSettings.h. You can always obtain the effective rate of playback from the currentItem's
     * timebase; see the timebase property of AVPlayerItem.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    /**
     * setRate:time:atHostTime:
     * 
     * Simultaneously sets the playback rate and the relationship between the current item's current time and host time.
     * 
     * You can use this function to synchronize playback with an external activity.
     * 
     * The current item's timebase is adjusted so that its time will be (or was) itemTime when host time is (or was)
     * hostClockTime.
     * In other words: if hostClockTime is in the past, the timebase's time will be interpolated as though the timebase
     * has been running at the requested rate since that time. If hostClockTime is in the future, the timebase will
     * immediately start running at the requested rate from an earlier time so that it will reach the requested itemTime
     * at the requested hostClockTime. (Note that the item's time will not jump backwards, but instead will sit at
     * itemTime until the timebase reaches that time.)
     * 
     * Note that setRate:time:atHostTime: is not supported when automaticallyWaitsToMinimizeStalling is YES. For clients
     * linked against iOS 10.0 and later or OS X 12.0 and later, invoking setRate:time:atHostTime: when
     * automaticallyWaitsToMinimizeStalling is YES will raise an NSInvalidArgument exception. Support for HTTP Live
     * Streaming content requires iOS 11, tvOS 11, macOS 10.13 or later.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this method must be invoked on the main thread/queue.
     * 
     * @param itemTime      The time to start playback from, specified precisely (i.e., with zero tolerance).
     *                      Pass kCMTimeInvalid to use the current item's current time.
     * @param hostClockTime
     *                      The host time at which to start playback.
     *                      If hostClockTime is specified, the player will not ensure that media data is loaded before
     *                      the timebase starts moving.
     *                      If hostClockTime is kCMTimeInvalid, the rate and time will be set together, but without
     *                      external synchronization;
     *                      a host time in the near future will be used, allowing some time for media data loading.
     * 
     *                      API-Since: 6.0
     */
    @Generated
    @Selector("setRate:time:atHostTime:")
    public native void setRateTimeAtHostTime(float rate, @ByValue CMTime itemTime, @ByValue CMTime hostClockTime);

    /**
     * Indicates whether the player should automatically switch to AirPlay Video while AirPlay Screen is active in order
     * to play video content, switching back to AirPlay Screen as soon as playback is done.
     * The default value is NO. Has no effect if allowsAirPlayVideo is NO.
     * This property is deprecated. Use AVPlayer's -usesExternalPlaybackWhileExternalScreenIsActive instead.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("setUsesAirPlayVideoWhileAirPlayScreenIsActive:")
    public native void setUsesAirPlayVideoWhileAirPlayScreenIsActive(boolean value);

    /**
     * Indicates whether the player should automatically switch to "external playback" mode while the "external
     * screen" mode is active in order to play video content and switching back to "external screen" mode as soon
     * as playback is done. Brief transition may be visible on the external display when automatically switching
     * between the two modes. The default value is NO. Has no effect if allowsExternalPlayback is NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setUsesExternalPlaybackWhileExternalScreenIsActive:")
    public native void setUsesExternalPlaybackWhileExternalScreenIsActive(boolean value);

    /**
     * Indicates the current audio volume of the player; 0.0 means "silence all audio", 1.0 means "play at the full
     * volume of the current item".
     * 
     * iOS note: Do not use this property to implement a volume slider for media playback. For that purpose, use
     * MPVolumeView, which is customizable in appearance and provides standard media playback behaviors that users
     * expect.
     * This property is most useful on iOS to control the volume of the AVPlayer relative to other audio output, not for
     * volume control by end users.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * [@property] status
     * 
     * The ability of the receiver to be used for playback.
     * 
     * The value of this property is an AVPlayerStatus that indicates whether the receiver can be used for playback.
     * When
     * the value of this property is AVPlayerStatusFailed, the receiver can no longer be used for playback and a new
     * instance needs to be created in its place. When this happens, clients can check the value of the error property
     * to
     * determine the nature of the failure. This property is key value observable.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * [@property] timeControlStatus
     * 
     * Indicates whether playback is currently paused indefinitely, suspended while waiting for appropriate conditions,
     * or in progress.
     * 
     * For possible values and discussion, see AVPlayerTimeControlStatus.
     * 
     * When automaticallyWaitsToMinimizeStalling is YES, absent intervention in the form of invocations of -setRate: or
     * -pause or, on iOS, an interruption that requires user intervention before playback can resume, the value of the
     * property timeControlStatus automatically changes between AVPlayerTimeControlStatusPlaying and
     * AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate depending on whether sufficient media data is available to
     * continue playback. This property is key value observable.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("timeControlStatus")
    @NInt
    public native long timeControlStatus();

    /**
     * Indicates whether the player should automatically switch to AirPlay Video while AirPlay Screen is active in order
     * to play video content, switching back to AirPlay Screen as soon as playback is done.
     * The default value is NO. Has no effect if allowsAirPlayVideo is NO.
     * This property is deprecated. Use AVPlayer's -usesExternalPlaybackWhileExternalScreenIsActive instead.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("usesAirPlayVideoWhileAirPlayScreenIsActive")
    public native boolean usesAirPlayVideoWhileAirPlayScreenIsActive();

    /**
     * Indicates whether the player should automatically switch to "external playback" mode while the "external
     * screen" mode is active in order to play video content and switching back to "external screen" mode as soon
     * as playback is done. Brief transition may be visible on the external display when automatically switching
     * between the two modes. The default value is NO. Has no effect if allowsExternalPlayback is NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("usesExternalPlaybackWhileExternalScreenIsActive")
    public native boolean usesExternalPlaybackWhileExternalScreenIsActive();

    /**
     * Indicates the current audio volume of the player; 0.0 means "silence all audio", 1.0 means "play at the full
     * volume of the current item".
     * 
     * iOS note: Do not use this property to implement a volume slider for media playback. For that purpose, use
     * MPVolumeView, which is customizable in appearance and provides standard media playback behaviors that users
     * expect.
     * This property is most useful on iOS to control the volume of the AVPlayer relative to other audio output, not for
     * volume control by end users.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("volume")
    public native float volume();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addBoundaryTimeObserverForTimesQueueUsingBlock {
        @Generated
        void call_addBoundaryTimeObserverForTimesQueueUsingBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addPeriodicTimeObserverForIntervalQueueUsingBlock {
        @Generated
        void call_addPeriodicTimeObserverForIntervalQueueUsingBlock(@ByValue CMTime time);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prerollAtRateCompletionHandler {
        @Generated
        void call_prerollAtRateCompletionHandler(boolean finished);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToDateCompletionHandler {
        @Generated
        void call_seekToDateCompletionHandler(boolean finished);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeCompletionHandler {
        @Generated
        void call_seekToTimeCompletionHandler(boolean finished);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler {
        @Generated
        void call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler(boolean finished);
    }

    /**
     * [@property] availableHDRModes
     * 
     * An AVPlayerHDRMode value that indicates the HDR modes the device can play to an appropriate display. A value of 0
     * indicates that no HDR modes are supported.
     * 
     * This property indicates all of the HDR modes that the device can play. Each value indicates that an appropriate
     * HDR display is available for the specified HDR mode. Additionally, the device must be capable of playing the
     * specified HDR type. This property does not indicate whether video contains HDR content, whether HDR video is
     * currently playing, or whether video is playing on an HDR display.
     * 
     * API-Since: 11.2
     */
    @Generated
    @Selector("availableHDRModes")
    @NInt
    public static native long availableHDRModes();

    /**
     * [@property] preventsDisplaySleepDuringVideoPlayback
     * 
     * Indicates whether video playback prevents display and device sleep.
     * 
     * Default is YES on iOS, tvOS and in Mac Catalyst apps. Default is NO on macOS.
     * Setting this property to NO does not force the display to sleep, it simply stops preventing display sleep. Other
     * apps or frameworks within your app may still be preventing display sleep for various reasons.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("preventsDisplaySleepDuringVideoPlayback")
    public native boolean preventsDisplaySleepDuringVideoPlayback();

    /**
     * [@property] preventsDisplaySleepDuringVideoPlayback
     * 
     * Indicates whether video playback prevents display and device sleep.
     * 
     * Default is YES on iOS, tvOS and in Mac Catalyst apps. Default is NO on macOS.
     * Setting this property to NO does not force the display to sleep, it simply stops preventing display sleep. Other
     * apps or frameworks within your app may still be preventing display sleep for various reasons.
     * 
     * Before macOS 13, iOS 16, tvOS 16, and watchOS 9, this property must be accessed on the main thread/queue.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setPreventsDisplaySleepDuringVideoPlayback:")
    public native void setPreventsDisplaySleepDuringVideoPlayback(boolean value);

    /**
     * [@property] eligibleForHDRPlayback
     * 
     * Indicates whether HDR content can be played to an appropriate display.
     * 
     * This property is YES if an HDR display is available and the device is capable of playing HDR content from an
     * appropriate AVAsset, NO otherwise. This property does not indicate whether video contains HDR content, whether
     * HDR video is currently playing, or whether video is playing on an HDR display. This property is not KVO
     * observable.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("eligibleForHDRPlayback")
    public static native boolean eligibleForHDRPlayback();

    /**
     * [@property] audiovisualBackgroundPlaybackPolicy
     * 
     * Controls the policy to be used in deciding how playback of audiovisual content should continue while the
     * application transitions to background.
     * 
     * By default, the system is free to decide the background playback policy
     * (AVPlayerAudiovisualBackgroundPlaybackPolicyAutomatic).
     * If set to AVPlayerAudiovisualBackgroundPlaybackPolicyPauses, player will be paused on entering background.
     * If set to AVPlayerAudiovisualBackgroundPlaybackPolicyContinuesIfPossible, the system makes the best effort to
     * continue playback but the app also needs appropriate UIBackgroundModes for the system to let it continue running
     * in the background. Note that this policy only applies to items with enabled video.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("audiovisualBackgroundPlaybackPolicy")
    @NInt
    public native long audiovisualBackgroundPlaybackPolicy();

    /**
     * [@property] playbackCoordinator
     * 
     * The playback coordinator for this player.
     * 
     * If the playback coordinator is connected to other participants, rate changes and seeks on the current item will
     * be automatically mirrored to all connected participants.
     * Depending on policies, the coordinator may also intercept rate changes to non-zero to coordinate playback start
     * with the rest of the group.
     * Use [AVPlayer playImmediatelyAtRate:] to override the coordinated startup behavior and start playback
     * immediately. This is useful to give users an opportunity to override waiting caused by other participants'
     * suspensions.
     * Player configuration other than rate and seeks are not communicated to other participants and can be configured
     * independently by each participant.
     * A player with a connected playbackCoordinator will change behavior in situations that require the player to pause
     * for internal reasons, such as a route change or a stall.
     * When resuming after these events, the player will not resume at the stop time. Instead, it will attempt to rejoin
     * the group, potentially seeking to match the other participant's progress.
     * It is left to the owner of the AVPlayer to ensure that all participants are playing the same item. See the
     * discussion of AVPlaybackCoordinator for considerations about item transitions.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("playbackCoordinator")
    public native AVPlayerPlaybackCoordinator playbackCoordinator();

    /**
     * [@property] audiovisualBackgroundPlaybackPolicy
     * 
     * Controls the policy to be used in deciding how playback of audiovisual content should continue while the
     * application transitions to background.
     * 
     * By default, the system is free to decide the background playback policy
     * (AVPlayerAudiovisualBackgroundPlaybackPolicyAutomatic).
     * If set to AVPlayerAudiovisualBackgroundPlaybackPolicyPauses, player will be paused on entering background.
     * If set to AVPlayerAudiovisualBackgroundPlaybackPolicyContinuesIfPossible, the system makes the best effort to
     * continue playback but the app also needs appropriate UIBackgroundModes for the system to let it continue running
     * in the background. Note that this policy only applies to items with enabled video.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAudiovisualBackgroundPlaybackPolicy:")
    public native void setAudiovisualBackgroundPlaybackPolicy(@NInt long value);

    /**
     * [@property] sourceClock
     * 
     * Set to override the automatic choice of source clock for item timebases.
     * 
     * NULL by default. This is most useful for synchronizing video-only movies with audio played via other means.
     * IMPORTANT NOTE: If you specify a source clock other than the appropriate audio device clock, audio may drift out
     * of sync.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSourceClock:")
    public native void setSourceClock(@Nullable CMClockRef value);

    /**
     * [@property] sourceClock
     * 
     * Set to override the automatic choice of source clock for item timebases.
     * 
     * NULL by default. This is most useful for synchronizing video-only movies with audio played via other means.
     * IMPORTANT NOTE: If you specify a source clock other than the appropriate audio device clock, audio may drift out
     * of sync.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("sourceClock")
    public native CMClockRef sourceClock();

    /**
     * [@property] defaultRate
     * 
     * Indicates the rate at which to start playback when play is called; defaults to 1.0.
     * 
     * Setting this property does not imply playback starts automatically at this rate. Clients still have to kick off
     * playback using `play`. Note that using setRate to start playback will skip using the value in this property nor
     * would it update this property. Therefore, `setRate:1.0` is no longer recommended as a means to start playback.
     * Use `play` instead. Use `setRate` for operations like scanning where the rate is to be updated instantaneously.
     * Invoking `play` again would restore playback at the rate set in this property.
     * 
     * The effective rate of playback may still differ from the default rate subject to restrictions imposed by the
     * system. See documentation for the rate property for a discussion on when the desired rate does not translate to
     * effective rate.
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("defaultRate")
    public native float defaultRate();

    /**
     * [@property] defaultRate
     * 
     * Indicates the rate at which to start playback when play is called; defaults to 1.0.
     * 
     * Setting this property does not imply playback starts automatically at this rate. Clients still have to kick off
     * playback using `play`. Note that using setRate to start playback will skip using the value in this property nor
     * would it update this property. Therefore, `setRate:1.0` is no longer recommended as a means to start playback.
     * Use `play` instead. Use `setRate` for operations like scanning where the rate is to be updated instantaneously.
     * Invoking `play` again would restore playback at the rate set in this property.
     * 
     * The effective rate of playback may still differ from the default rate subject to restrictions imposed by the
     * system. See documentation for the rate property for a discussion on when the desired rate does not translate to
     * effective rate.
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDefaultRate:")
    public native void setDefaultRate(float value);
}
