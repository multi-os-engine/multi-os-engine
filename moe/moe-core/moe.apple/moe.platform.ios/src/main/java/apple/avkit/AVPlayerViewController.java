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
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVPlayerViewController
 * 
 * AVPlayerViewController is a subclass of UIViewController that can be used to display the visual content of an
 * AVPlayer object and the standard playback controls.
 * 
 * API-Since: 8.0
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVPlayerViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    public static native AVPlayerViewController new_objc();

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
     * [@property] allowsPictureInPicturePlayback
     * 
     * Whether or not the receiver allows Picture in Picture playback. Default is YES.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowsPictureInPicturePlayback")
    public native boolean allowsPictureInPicturePlayback();

    /**
     * [@property] contentOverlayView
     * 
     * Use the content overlay view to add additional custom views between the video content and the controls.
     */
    @Nullable
    @Generated
    @Selector("contentOverlayView")
    public native UIView contentOverlayView();

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVPlayerViewControllerDelegate delegate();

    @Generated
    @Selector("init")
    public native AVPlayerViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native AVPlayerViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native AVPlayerViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    /**
     * [@property] readyForDisplay
     * 
     * Boolean indicating that the first video frame has been made ready for display for the current item of the
     * associated AVPlayer.
     */
    @Generated
    @Selector("isReadyForDisplay")
    public native boolean isReadyForDisplay();

    /**
     * [@property] player
     * 
     * The player from which to source the media content for the view controller.
     */
    @Nullable
    @Generated
    @Selector("player")
    public native AVPlayer player();

    /**
     * [@property] allowsPictureInPicturePlayback
     * 
     * Whether or not the receiver allows Picture in Picture playback. Default is YES.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowsPictureInPicturePlayback:")
    public native void setAllowsPictureInPicturePlayback(boolean value);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) AVPlayerViewControllerDelegate value);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * API-Since: 9.0
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) AVPlayerViewControllerDelegate value) {
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
     * [@property] player
     * 
     * The player from which to source the media content for the view controller.
     */
    @Generated
    @Selector("setPlayer:")
    public native void setPlayer(@Nullable AVPlayer value);

    /**
     * [@property] showsPlaybackControls
     * 
     * Whether or not the receiver shows playback controls. Default is YES.
     * 
     * Clients can set this property to NO when they don't want to have any playback controls on top of the visual
     * content (e.g. for a game splash screen).
     */
    @Generated
    @Selector("setShowsPlaybackControls:")
    public native void setShowsPlaybackControls(boolean value);

    /**
     * [@property] updatesNowPlayingInfoCenter
     * 
     * Whether or not the now playing info center should be updated. Default is YES.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setUpdatesNowPlayingInfoCenter:")
    public native void setUpdatesNowPlayingInfoCenter(boolean value);

    /**
     * [@property] videoGravity
     * 
     * A string defining how the video is displayed within an AVPlayerLayer bounds rect.
     * 
     * Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill and AVLayerVideoGravityResize.
     * AVLayerVideoGravityResizeAspect is default.
     */
    @Generated
    @Selector("setVideoGravity:")
    public native void setVideoGravity(@NotNull String value);

    /**
     * [@property] showsPlaybackControls
     * 
     * Whether or not the receiver shows playback controls. Default is YES.
     * 
     * Clients can set this property to NO when they don't want to have any playback controls on top of the visual
     * content (e.g. for a game splash screen).
     */
    @Generated
    @Selector("showsPlaybackControls")
    public native boolean showsPlaybackControls();

    /**
     * [@property] updatesNowPlayingInfoCenter
     * 
     * Whether or not the now playing info center should be updated. Default is YES.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("updatesNowPlayingInfoCenter")
    public native boolean updatesNowPlayingInfoCenter();

    /**
     * [@property] videoBounds
     * 
     * The current size and position of the video image as displayed within the receiver's view's bounds.
     */
    @Generated
    @Selector("videoBounds")
    @ByValue
    public native CGRect videoBounds();

    /**
     * [@property] videoGravity
     * 
     * A string defining how the video is displayed within an AVPlayerLayer bounds rect.
     * 
     * Options are AVLayerVideoGravityResizeAspect, AVLayerVideoGravityResizeAspectFill and AVLayerVideoGravityResize.
     * AVLayerVideoGravityResizeAspect is default.
     */
    @NotNull
    @Generated
    @Selector("videoGravity")
    public native String videoGravity();

    /**
     * [@property] entersFullScreenWhenPlaybackBegins
     * 
     * Whether or not the receiver automatically enters full screen when the play button is tapped. Default is NO.
     * 
     * If YES, the receiver will show a user interface tailored to this behavior.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("entersFullScreenWhenPlaybackBegins")
    public native boolean entersFullScreenWhenPlaybackBegins();

    /**
     * [@property] exitsFullScreenWhenPlaybackEnds
     * 
     * Whether or not the receiver automatically exits full screen when playback ends. Default is NO.
     * 
     * If multiple player items have been enqueued, the receiver exits fullscreen once no more items are remaining in
     * the queue.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("exitsFullScreenWhenPlaybackEnds")
    public native boolean exitsFullScreenWhenPlaybackEnds();

    /**
     * [@property] entersFullScreenWhenPlaybackBegins
     * 
     * Whether or not the receiver automatically enters full screen when the play button is tapped. Default is NO.
     * 
     * If YES, the receiver will show a user interface tailored to this behavior.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setEntersFullScreenWhenPlaybackBegins:")
    public native void setEntersFullScreenWhenPlaybackBegins(boolean value);

    /**
     * [@property] exitsFullScreenWhenPlaybackEnds
     * 
     * Whether or not the receiver automatically exits full screen when playback ends. Default is NO.
     * 
     * If multiple player items have been enqueued, the receiver exits fullscreen once no more items are remaining in
     * the queue.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setExitsFullScreenWhenPlaybackEnds:")
    public native void setExitsFullScreenWhenPlaybackEnds(boolean value);

    /**
     * [@property] pixelBufferAttributes
     * 
     * The client requirements for the visual output during playback.
     * 
     * Pixel buffer attribute keys are defined in <CoreVideo/CVPixelBuffer.h>
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("pixelBufferAttributes")
    public native NSDictionary<String, ?> pixelBufferAttributes();

    /**
     * [@property] pixelBufferAttributes
     * 
     * The client requirements for the visual output during playback.
     * 
     * Pixel buffer attribute keys are defined in <CoreVideo/CVPixelBuffer.h>
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setPixelBufferAttributes:")
    public native void setPixelBufferAttributes(@Nullable NSDictionary<String, ?> value);

    /**
     * [@property] requiresLinearPlayback
     * 
     * Disables certain user operations (fast forward, forward skip, and scrubbing).
     * 
     * This can be used to enforce playback of mandatory content (such as legalese or advertisements).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("requiresLinearPlayback")
    public native boolean requiresLinearPlayback();

    /**
     * [@property] requiresLinearPlayback
     * 
     * Disables certain user operations (fast forward, forward skip, and scrubbing).
     * 
     * This can be used to enforce playback of mandatory content (such as legalese or advertisements).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRequiresLinearPlayback:")
    public native void setRequiresLinearPlayback(boolean value);

    /**
     * [@property] showsTimecodes
     * 
     * Controls whether timecodes can be displayed in the playback UI when playing media with embedded timecodes.
     * Default NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setShowsTimecodes:")
    public native void setShowsTimecodes(boolean value);

    /**
     * [@property] showsTimecodes
     * 
     * Controls whether timecodes can be displayed in the playback UI when playing media with embedded timecodes.
     * Default NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("showsTimecodes")
    public native boolean showsTimecodes();

    /**
     * [@property] canStartPictureInPictureAutomaticallyFromInline
     * 
     * Indicates whether Picture in Picture should be allowed to start automatically when transitioning to background
     * when the receiver’s content is embedded inline. Default is NO.
     * 
     * This property must only be set to YES for content intended to be the user's primary focus.
     * 
     * API-Since: 14.2
     */
    @Generated
    @Selector("canStartPictureInPictureAutomaticallyFromInline")
    public native boolean canStartPictureInPictureAutomaticallyFromInline();

    /**
     * [@property] canStartPictureInPictureAutomaticallyFromInline
     * 
     * Indicates whether Picture in Picture should be allowed to start automatically when transitioning to background
     * when the receiver’s content is embedded inline. Default is NO.
     * 
     * This property must only be set to YES for content intended to be the user's primary focus.
     * 
     * API-Since: 14.2
     */
    @Generated
    @Selector("setCanStartPictureInPictureAutomaticallyFromInline:")
    public native void setCanStartPictureInPictureAutomaticallyFromInline(boolean value);

    /**
     * [@property] allowsVideoFrameAnalysis
     * 
     * When set to YES, the AVPlayerViewController will try to find objects, text and people while the media is paused.
     * When an object is found, the user will be able to interact with it using long press to present a context menu.
     * Default is YES.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("allowsVideoFrameAnalysis")
    public native boolean allowsVideoFrameAnalysis();

    /**
     * [@property] selectSpeed
     * 
     * Sets the input AVPlaybackSpeed as the selected speed.
     * 
     * Calls to selectSpeed with AVPlaybackSpeeds not contained within the speeds property array will be ignored.
     * 
     * API-Since: 16.0
     * 
     * @param speed
     *              The playback speed to select.
     */
    @Generated
    @Selector("selectSpeed:")
    public native void selectSpeed(@NotNull AVPlaybackSpeed speed);

    /**
     * [@property] selectedSpeed
     * 
     * The currently selected playback speed.
     * 
     * Changes to the associated AVPlayer's defaultRate will be reflected in this property and vice versa. If the
     * associated AVPlayer's defaultRate is set to a value that does not match a speed in the speeds list property, the
     * selected speed will be nil.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("selectedSpeed")
    public native AVPlaybackSpeed selectedSpeed();

    /**
     * [@property] allowsVideoFrameAnalysis
     * 
     * When set to YES, the AVPlayerViewController will try to find objects, text and people while the media is paused.
     * When an object is found, the user will be able to interact with it using long press to present a context menu.
     * Default is YES.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAllowsVideoFrameAnalysis:")
    public native void setAllowsVideoFrameAnalysis(boolean value);

    /**
     * [@property] speeds
     * 
     * A list of user selectable playback speeds to be shown in the playback speed control.
     * 
     * By default this property will be set to the systemDefaultSpeeds class property. Setting this property to an empty
     * list will hide the playback speed selection UI.
     * 
     * To set the currently selected playback speed programmatically, either set the defaultRate on the AVPlayer
     * associated with this view controller or use the selectSpeed method on AVPlayerViewController.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setSpeeds:")
    public native void setSpeeds(@NotNull NSArray<? extends AVPlaybackSpeed> value);

    /**
     * [@property] speeds
     * 
     * A list of user selectable playback speeds to be shown in the playback speed control.
     * 
     * By default this property will be set to the systemDefaultSpeeds class property. Setting this property to an empty
     * list will hide the playback speed selection UI.
     * 
     * To set the currently selected playback speed programmatically, either set the defaultRate on the AVPlayer
     * associated with this view controller or use the selectSpeed method on AVPlayerViewController.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("speeds")
    public native NSArray<? extends AVPlaybackSpeed> speeds();
}
