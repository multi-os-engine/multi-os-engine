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

package apple.mediaplayer;

import apple.NSObject;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.mediaplayer.protocol.MPMediaPlayback;
import apple.uikit.UIImage;
import apple.uikit.UIView;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * -----------------------------------------------------------------------------
 * Movie Player
 * <p>
 * See MPMediaPlayback.h for the playback methods.
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMoviePlayerController extends NSObject implements MPMediaPlayback {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMoviePlayerController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMoviePlayerController alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPMoviePlayerController allocWithZone(VoidPtr zone);

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
    public static native MPMoviePlayerController new_objc();

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
     * Returns an object that represents a snapshot of the network access log. Can be nil.
     */
    @Generated
    @Deprecated
    @Selector("accessLog")
    public native MPMovieAccessLog accessLog();

    /**
     * Indicates whether the movie player allows AirPlay video playback. Defaults to YES on iOS 5.0 and later.
     */
    @Generated
    @Selector("allowsAirPlay")
    public native boolean allowsAirPlay();

    /**
     * A view for customization which is always displayed behind movie content.
     */
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    @Generated
    @Selector("beginSeekingBackward")
    public native void beginSeekingBackward();

    @Generated
    @Selector("beginSeekingForward")
    public native void beginSeekingForward();

    /**
     * Cancels all pending asynchronous thumbnail requests.
     */
    @Generated
    @Selector("cancelAllThumbnailImageRequests")
    public native void cancelAllThumbnailImageRequests();

    @Generated
    @Selector("contentURL")
    public native NSURL contentURL();

    /**
     * The style of the playback controls. Defaults to MPMovieControlStyleDefault.
     */
    @Generated
    @Selector("controlStyle")
    @NInt
    public native long controlStyle();

    @Generated
    @Selector("currentPlaybackRate")
    public native float currentPlaybackRate();

    @Generated
    @Selector("currentPlaybackTime")
    public native double currentPlaybackTime();

    /**
     * The duration of the movie, or 0.0 if not known.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * The end time of movie playback. Defaults to NaN, which indicates natural end time of the movie.
     */
    @Generated
    @Selector("endPlaybackTime")
    public native double endPlaybackTime();

    @Generated
    @Selector("endSeeking")
    public native void endSeeking();

    /**
     * Returns an object that represents a snapshot of the error log. Can be nil.
     */
    @Generated
    @Deprecated
    @Selector("errorLog")
    public native MPMovieErrorLog errorLog();

    @Generated
    @Selector("init")
    public native MPMoviePlayerController init();

    @Generated
    @Selector("initWithContentURL:")
    public native MPMoviePlayerController initWithContentURL(NSURL url);

    /**
     * The start time of movie playback. Defaults to NaN, indicating the natural start time of the movie.
     */
    @Generated
    @Selector("initialPlaybackTime")
    public native double initialPlaybackTime();

    /**
     * Indicates whether the movie player is currently playing video via AirPlay.
     */
    @Generated
    @Selector("isAirPlayVideoActive")
    public native boolean isAirPlayVideoActive();

    /**
     * Determines if the movie is presented in the entire screen (obscuring all other application content). Default is NO.
     * Setting this property to YES before the movie player's view is visible will have no effect.
     */
    @Generated
    @Selector("isFullscreen")
    public native boolean isFullscreen();

    /**
     * Determines if the movie is presented in the entire screen (obscuring all other application content). Default is NO.
     * Setting this property to YES before the movie player's view is visible will have no effect.
     */
    @Generated
    @Selector("setFullscreen:")
    public native void setFullscreen(boolean value);

    @Generated
    @Selector("isPreparedToPlay")
    public native boolean isPreparedToPlay();

    /**
     * Returns the network load state of the movie player.
     */
    @Generated
    @Selector("loadState")
    @NUInt
    public native long loadState();

    /**
     * The types of media in the movie, or MPMovieMediaTypeNone if not known.
     */
    @Generated
    @Selector("movieMediaTypes")
    @NUInt
    public native long movieMediaTypes();

    /**
     * The playback type of the movie. Defaults to MPMovieSourceTypeUnknown.
     * Specifying a playback type before playing the movie can result in faster load times.
     */
    @Generated
    @Selector("movieSourceType")
    @NInt
    public native long movieSourceType();

    /**
     * The natural size of the movie, or CGSizeZero if not known/applicable.
     */
    @Generated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("play")
    public native void play();

    /**
     * The currently playable duration of the movie, for progressively downloaded network content.
     */
    @Generated
    @Selector("playableDuration")
    public native double playableDuration();

    /**
     * Returns the current playback state of the movie player.
     */
    @Generated
    @Selector("playbackState")
    @NInt
    public native long playbackState();

    @Generated
    @Selector("prepareToPlay")
    public native void prepareToPlay();

    /**
     * Returns YES if the first video frame has been made ready for display for the current item.
     * Will remain NO for items that do not have video tracks associated.
     */
    @Generated
    @Selector("readyForDisplay")
    public native boolean readyForDisplay();

    /**
     * Determines how the movie player repeats when reaching the end of playback. Defaults to MPMovieRepeatModeNone.
     */
    @Generated
    @Selector("repeatMode")
    @NInt
    public native long repeatMode();

    /**
     * Asynchronously request thumbnails for one or more times, provided as an array of NSNumbers (double).
     * Posts MPMoviePlayerThumbnailImageRequestDidFinishNotification on completion.
     */
    @Generated
    @Selector("requestThumbnailImagesAtTimes:timeOption:")
    public native void requestThumbnailImagesAtTimesTimeOption(NSArray<?> playbackTimes, @NInt long option);

    /**
     * Determines how the content scales to fit the view. Defaults to MPMovieScalingModeAspectFit.
     */
    @Generated
    @Selector("scalingMode")
    @NInt
    public native long scalingMode();

    /**
     * Indicates whether the movie player allows AirPlay video playback. Defaults to YES on iOS 5.0 and later.
     */
    @Generated
    @Selector("setAllowsAirPlay:")
    public native void setAllowsAirPlay(boolean value);

    @Generated
    @Selector("setContentURL:")
    public native void setContentURL(NSURL value);

    /**
     * The style of the playback controls. Defaults to MPMovieControlStyleDefault.
     */
    @Generated
    @Selector("setControlStyle:")
    public native void setControlStyle(@NInt long value);

    @Generated
    @Selector("setCurrentPlaybackRate:")
    public native void setCurrentPlaybackRate(float value);

    @Generated
    @Selector("setCurrentPlaybackTime:")
    public native void setCurrentPlaybackTime(double value);

    /**
     * The end time of movie playback. Defaults to NaN, which indicates natural end time of the movie.
     */
    @Generated
    @Selector("setEndPlaybackTime:")
    public native void setEndPlaybackTime(double value);

    @Generated
    @Selector("setFullscreen:animated:")
    public native void setFullscreenAnimated(boolean fullscreen, boolean animated);

    /**
     * The start time of movie playback. Defaults to NaN, indicating the natural start time of the movie.
     */
    @Generated
    @Selector("setInitialPlaybackTime:")
    public native void setInitialPlaybackTime(double value);

    /**
     * The playback type of the movie. Defaults to MPMovieSourceTypeUnknown.
     * Specifying a playback type before playing the movie can result in faster load times.
     */
    @Generated
    @Selector("setMovieSourceType:")
    public native void setMovieSourceType(@NInt long value);

    /**
     * Determines how the movie player repeats when reaching the end of playback. Defaults to MPMovieRepeatModeNone.
     */
    @Generated
    @Selector("setRepeatMode:")
    public native void setRepeatMode(@NInt long value);

    /**
     * Determines how the content scales to fit the view. Defaults to MPMovieScalingModeAspectFit.
     */
    @Generated
    @Selector("setScalingMode:")
    public native void setScalingMode(@NInt long value);

    /**
     * Indicates if a movie should automatically start playback when it is likely to finish uninterrupted based on e.g. network conditions. Defaults to YES.
     */
    @Generated
    @Selector("setShouldAutoplay:")
    public native void setShouldAutoplay(boolean value);

    /**
     * Indicates if the movie player should inherit the application's audio session instead of creating a new session (which would interrupt the application's session).
     * Defaults to YES. Setting this property during playback will not take effect until playback is stopped and started again.
     */
    @Generated
    @Deprecated
    @Selector("setUseApplicationAudioSession:")
    public native void setUseApplicationAudioSession(boolean value);

    /**
     * Indicates if a movie should automatically start playback when it is likely to finish uninterrupted based on e.g. network conditions. Defaults to YES.
     */
    @Generated
    @Selector("shouldAutoplay")
    public native boolean shouldAutoplay();

    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * Returns a thumbnail at the given time.
     * Deprecated.  Use -requestThumbnailImagesAtTimes:timeOption: / MPMoviePlayerThumbnailImageRequestDidFinishNotification instead.
     */
    @Generated
    @Selector("thumbnailImageAtTime:timeOption:")
    public native UIImage thumbnailImageAtTimeTimeOption(double playbackTime, @NInt long option);

    /**
     * Returns an array of the most recent MPTimedMetadata objects provided by the media stream.
     */
    @Generated
    @Deprecated
    @Selector("timedMetadata")
    public native NSArray<?> timedMetadata();

    /**
     * Indicates if the movie player should inherit the application's audio session instead of creating a new session (which would interrupt the application's session).
     * Defaults to YES. Setting this property during playback will not take effect until playback is stopped and started again.
     */
    @Generated
    @Deprecated
    @Selector("useApplicationAudioSession")
    public native boolean useApplicationAudioSession();

    /**
     * The view in which the media and playback controls are displayed.
     */
    @Generated
    @Selector("view")
    public native UIView view();
}
