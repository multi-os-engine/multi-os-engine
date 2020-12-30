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

package apple.avkit;

import apple.NSObject;
import apple.avfoundation.AVPlayer;
import apple.avkit.protocol.AVPlayerViewControllerDelegate;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIView;
import apple.uikit.UIViewController;
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

/**
 * AVPlayerViewController
 * 
 * AVPlayerViewController is a subclass of UIViewController that can be used to display the visual content of an AVPlayer object and the standard playback controls.
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVPlayerViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerViewController alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

    /**
     * +preparePrerollAds
     * 
     * Inform iAd that the application intends to use AVPlayerViewController's
     * -playPrerollAdWithCompletionHandler: API. Ad metadata will be fetched eagerly,
     * increasing the likelihood of an ad being available when first requested.
     */
    @Generated
    @Selector("preparePrerollAds")
    public static native void preparePrerollAds();

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
     * [@property]	allowsPictureInPicturePlayback
     * 
     * Whether or not the receiver allows Picture in Picture playback. Default is YES.
     */
    @Generated
    @Selector("allowsPictureInPicturePlayback")
    public native boolean allowsPictureInPicturePlayback();

    /**
     * -cancelPreroll
     * 
     * Cancel pre-roll video ad playback.
     */
    @Generated
    @Selector("cancelPreroll")
    public native void cancelPreroll();

    /**
     * [@property]	contentOverlayView
     * 
     * Use the content overlay view to add additional custom views between the video content and the controls.
     */
    @Generated
    @Selector("contentOverlayView")
    public native UIView contentOverlayView();

    /**
     * [@property]	delegate
     * 
     * The receiver's delegate.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPlayerViewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native AVPlayerViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native AVPlayerViewController initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native AVPlayerViewController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    /**
     * [@property]	readyForDisplay
     * 
     * Boolean indicating that the first video frame has been made ready for display for the current item of the associated AVPlayer.
     */
    @Generated
    @Selector("isReadyForDisplay")
    public native boolean isReadyForDisplay();

    /**
     * -playPrerollAdWithCompletionHandler:
     * 
     * Request playback of a pre-roll video iAd.
     * 
     * If -[AVPlayerViewController player] begins playing during a pre-roll ad, the
     * video ad will stop immediately.
     * 
     * The completion handler's error argument will be non-nil if the pre-roll ad
     * could not be played. Errors can occur for a number of reasons, such as lack
     * of ad inventory, exceeding the maximum pre-roll ad playback frequency, iAd
     * account configuration issues, and media playback issues. See ADError for an
     * exhaustive list of possible errors.
     * 
     * Passing nil as the completion handler is an error and will throw an exception.
     */
    @Generated
    @Selector("playPrerollAdWithCompletionHandler:")
    public native void playPrerollAdWithCompletionHandler(
            @ObjCBlock(name = "call_playPrerollAdWithCompletionHandler") Block_playPrerollAdWithCompletionHandler completionHandler);

    /**
     * [@property]	player
     * 
     * The player from which to source the media content for the view controller.
     */
    @Generated
    @Selector("player")
    public native AVPlayer player();

    /**
     * [@property]	allowsPictureInPicturePlayback
     * 
     * Whether or not the receiver allows Picture in Picture playback. Default is YES.
     */
    @Generated
    @Selector("setAllowsPictureInPicturePlayback:")
    public native void setAllowsPictureInPicturePlayback(boolean value);

    /**
     * [@property]	delegate
     * 
     * The receiver's delegate.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) AVPlayerViewControllerDelegate value);

    /**
     * [@property]	delegate
     * 
     * The receiver's delegate.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) AVPlayerViewControllerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property]	player
     * 
     * The player from which to source the media content for the view controller.
     */
    @Generated
    @Selector("setPlayer:")
    public native void setPlayer(AVPlayer value);

    /**
     * [@property]	showsPlaybackControls
     * 
     * Whether or not the receiver shows playback controls. Default is YES.
     * 
     * Clients can set this property to NO when they don't want to have any playback controls on top of the visual content (e.g. for a game splash screen).
     */
    @Generated
    @Selector("setShowsPlaybackControls:")
    public native void setShowsPlaybackControls(boolean value);

    /**
     * [@property]	updatesNowPlayingInfoCenter
     * 
     * Whether or not the now playing info center should be updated. Default is YES.
     */
    @Generated
    @Selector("setUpdatesNowPlayingInfoCenter:")
    public native void setUpdatesNowPlayingInfoCenter(boolean value);

    /**
     * [@property]	videoGravity
     * 
     * A string defining how the video is displayed within an AVPlayerLayer bounds rect.
     * 
     * Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill and AVLayerVideoGravityResize. AVLayerVideoGravityResizeAspect is default.
     */
    @Generated
    @Selector("setVideoGravity:")
    public native void setVideoGravity(String value);

    /**
     * [@property]	showsPlaybackControls
     * 
     * Whether or not the receiver shows playback controls. Default is YES.
     * 
     * Clients can set this property to NO when they don't want to have any playback controls on top of the visual content (e.g. for a game splash screen).
     */
    @Generated
    @Selector("showsPlaybackControls")
    public native boolean showsPlaybackControls();

    /**
     * [@property]	updatesNowPlayingInfoCenter
     * 
     * Whether or not the now playing info center should be updated. Default is YES.
     */
    @Generated
    @Selector("updatesNowPlayingInfoCenter")
    public native boolean updatesNowPlayingInfoCenter();

    /**
     * [@property]	videoBounds
     * 
     * The current size and position of the video image as displayed within the receiver's view's bounds.
     */
    @Generated
    @Selector("videoBounds")
    @ByValue
    public native CGRect videoBounds();

    /**
     * [@property]	videoGravity
     * 
     * A string defining how the video is displayed within an AVPlayerLayer bounds rect.
     * 
     * Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill and AVLayerVideoGravityResize. AVLayerVideoGravityResizeAspect is default.
     */
    @Generated
    @Selector("videoGravity")
    public native String videoGravity();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playPrerollAdWithCompletionHandler {
        @Generated
        void call_playPrerollAdWithCompletionHandler(NSError error);
    }

    /**
     * [@property]	entersFullScreenWhenPlaybackBegins
     * 
     * Whether or not the receiver automatically enters full screen when the play button is tapped. Default is NO.
     * 
     * If YES, the receiver will show a user interface tailored to this behavior.
     */
    @Generated
    @Selector("entersFullScreenWhenPlaybackBegins")
    public native boolean entersFullScreenWhenPlaybackBegins();

    /**
     * [@property]	exitsFullScreenWhenPlaybackEnds
     * 
     * Whether or not the receiver automatically exits full screen when playback ends. Default is NO.
     * 
     * If multiple player items have been enqueued, the receiver exits fullscreen once no more items are remaining in the queue.
     */
    @Generated
    @Selector("exitsFullScreenWhenPlaybackEnds")
    public native boolean exitsFullScreenWhenPlaybackEnds();

    /**
     * [@property]	entersFullScreenWhenPlaybackBegins
     * 
     * Whether or not the receiver automatically enters full screen when the play button is tapped. Default is NO.
     * 
     * If YES, the receiver will show a user interface tailored to this behavior.
     */
    @Generated
    @Selector("setEntersFullScreenWhenPlaybackBegins:")
    public native void setEntersFullScreenWhenPlaybackBegins(boolean value);

    /**
     * [@property]	exitsFullScreenWhenPlaybackEnds
     * 
     * Whether or not the receiver automatically exits full screen when playback ends. Default is NO.
     * 
     * If multiple player items have been enqueued, the receiver exits fullscreen once no more items are remaining in the queue.
     */
    @Generated
    @Selector("setExitsFullScreenWhenPlaybackEnds:")
    public native void setExitsFullScreenWhenPlaybackEnds(boolean value);

    /**
     * [@property]	pixelBufferAttributes
     * 
     * The client requirements for the visual output during playback.
     * 
     * Pixel buffer attribute keys are defined in <CoreVideo/CVPixelBuffer.h>
     */
    @Generated
    @Selector("pixelBufferAttributes")
    public native NSDictionary<String, ?> pixelBufferAttributes();

    /**
     * [@property]	pixelBufferAttributes
     * 
     * The client requirements for the visual output during playback.
     * 
     * Pixel buffer attribute keys are defined in <CoreVideo/CVPixelBuffer.h>
     */
    @Generated
    @Selector("setPixelBufferAttributes:")
    public native void setPixelBufferAttributes(NSDictionary<String, ?> value);

    /**
     * [@property]    requiresLinearPlayback
     * 
     * Disables certain user operations (fast forward, forward skip, and scrubbing).
     * 
     * This can be used to enforce playback of mandatory content (such as legalese or advertisements).
     */
    @Generated
    @Selector("requiresLinearPlayback")
    public native boolean requiresLinearPlayback();

    /**
     * [@property]    requiresLinearPlayback
     * 
     * Disables certain user operations (fast forward, forward skip, and scrubbing).
     * 
     * This can be used to enforce playback of mandatory content (such as legalese or advertisements).
     */
    @Generated
    @Selector("setRequiresLinearPlayback:")
    public native void setRequiresLinearPlayback(boolean value);

    /**
     * [@property]	showsTimecodes
     * 
     * Controls whether timecodes can be displayed in the playback UI when playing media with embedded timecodes. Default NO.
     */
    @Generated
    @Selector("setShowsTimecodes:")
    public native void setShowsTimecodes(boolean value);

    /**
     * [@property]	showsTimecodes
     * 
     * Controls whether timecodes can be displayed in the playback UI when playing media with embedded timecodes. Default NO.
     */
    @Generated
    @Selector("showsTimecodes")
    public native boolean showsTimecodes();

    /**
     * [@property]    canStartPictureInPictureAutomaticallyFromInline
     * 
     * Indicates whether Picture in Picture should be allowed to start automatically when transitioning to background when the receiver’s content is embedded inline. Default is NO.
     * 
     * This property must only be set to YES for content intended to be the user's primary focus.
     */
    @Generated
    @Selector("canStartPictureInPictureAutomaticallyFromInline")
    public native boolean canStartPictureInPictureAutomaticallyFromInline();

    /**
     * [@property]    canStartPictureInPictureAutomaticallyFromInline
     * 
     * Indicates whether Picture in Picture should be allowed to start automatically when transitioning to background when the receiver’s content is embedded inline. Default is NO.
     * 
     * This property must only be set to YES for content intended to be the user's primary focus.
     */
    @Generated
    @Selector("setCanStartPictureInPictureAutomaticallyFromInline:")
    public native void setCanStartPictureInPictureAutomaticallyFromInline(boolean value);
}
