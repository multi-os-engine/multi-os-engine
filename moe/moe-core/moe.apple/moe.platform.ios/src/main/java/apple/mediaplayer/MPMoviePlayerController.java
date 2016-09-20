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
import apple.foundation.NSError;
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
    @Owned
    @Selector("alloc")
    public static native MPMoviePlayerController alloc();

    @Generated
    @Selector("preparePrerollAds")
    public static native void preparePrerollAds();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
     * accessLog</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/accessLog">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("accessLog")
    public native MPMovieAccessLog accessLog();

    /**
     * allowsAirPlay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/allowsAirPlay">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("allowsAirPlay")
    public native boolean allowsAirPlay();

    /**
     * backgroundView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/backgroundView">iOS Dev Center</a>
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
     * cancelAllThumbnailImageRequests</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instm/MPMoviePlayerController/cancelAllThumbnailImageRequests">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("cancelAllThumbnailImageRequests")
    public native void cancelAllThumbnailImageRequests();

    @Generated
    @Selector("cancelPreroll")
    public native void cancelPreroll();

    /**
     * contentURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/contentURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentURL")
    public native NSURL contentURL();

    /**
     * controlStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/controlStyle">iOS Dev Center</a>
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
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/duration">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * endPlaybackTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/endPlaybackTime">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("endPlaybackTime")
    public native double endPlaybackTime();

    @Generated
    @Selector("endSeeking")
    public native void endSeeking();

    /**
     * errorLog</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/errorLog">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("errorLog")
    public native MPMovieErrorLog errorLog();

    @Generated
    @Selector("init")
    public native MPMoviePlayerController init();

    /**
     * initWithContentURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instm/MPMoviePlayerController/initWithContentURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentURL:")
    public native MPMoviePlayerController initWithContentURL(NSURL url);

    /**
     * initialPlaybackTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/initialPlaybackTime">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("initialPlaybackTime")
    public native double initialPlaybackTime();

    /**
     * airPlayVideoActive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/airPlayVideoActive">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("isAirPlayVideoActive")
    public native boolean isAirPlayVideoActive();

    /**
     * fullscreen</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/fullscreen">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFullscreen")
    public native boolean isFullscreen();

    /**
     * fullscreen</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/fullscreen">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFullscreen:")
    public native void setFullscreen(boolean value);

    @Generated
    @Selector("isPreparedToPlay")
    public native boolean isPreparedToPlay();

    /**
     * loadState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/loadState">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadState")
    @NUInt
    public native long loadState();

    /**
     * movieMediaTypes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/movieMediaTypes">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("movieMediaTypes")
    @NUInt
    public native long movieMediaTypes();

    /**
     * movieSourceType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/movieSourceType">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("movieSourceType")
    @NInt
    public native long movieSourceType();

    /**
     * naturalSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/naturalSize">iOS Dev Center</a>
     */
    @Deprecated
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
     * playPrerollAdWithCompletionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instm/MPMoviePlayerController/playPrerollAdWithCompletionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("playPrerollAdWithCompletionHandler:")
    public native void playPrerollAdWithCompletionHandler(
            @ObjCBlock(name = "call_playPrerollAdWithCompletionHandler") Block_playPrerollAdWithCompletionHandler completionHandler);

    /**
     * playableDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/playableDuration">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("playableDuration")
    public native double playableDuration();

    /**
     * playbackState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/playbackState">iOS Dev Center</a>
     */
    @Generated
    @Selector("playbackState")
    @NInt
    public native long playbackState();

    @Generated
    @Selector("prepareToPlay")
    public native void prepareToPlay();

    /**
     * readyForDisplay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/readyForDisplay">iOS Dev Center</a>
     */
    @Generated
    @Selector("readyForDisplay")
    public native boolean readyForDisplay();

    /**
     * repeatMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/repeatMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("repeatMode")
    @NInt
    public native long repeatMode();

    /**
     * requestThumbnailImagesAtTimes:timeOption:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instm/MPMoviePlayerController/requestThumbnailImagesAtTimes:timeOption:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("requestThumbnailImagesAtTimes:timeOption:")
    public native void requestThumbnailImagesAtTimesTimeOption(NSArray<?> playbackTimes, @NInt long option);

    /**
     * scalingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/scalingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("scalingMode")
    @NInt
    public native long scalingMode();

    /**
     * allowsAirPlay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/allowsAirPlay">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setAllowsAirPlay:")
    public native void setAllowsAirPlay(boolean value);

    /**
     * contentURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/contentURL">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentURL:")
    public native void setContentURL(NSURL value);

    /**
     * controlStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/controlStyle">iOS Dev Center</a>
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
     * endPlaybackTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/endPlaybackTime">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setEndPlaybackTime:")
    public native void setEndPlaybackTime(double value);

    /**
     * setFullscreen:animated:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instm/MPMoviePlayerController/setFullscreen:animated:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFullscreen:animated:")
    public native void setFullscreenAnimated(boolean fullscreen, boolean animated);

    /**
     * initialPlaybackTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/initialPlaybackTime">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setInitialPlaybackTime:")
    public native void setInitialPlaybackTime(double value);

    /**
     * movieSourceType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/movieSourceType">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setMovieSourceType:")
    public native void setMovieSourceType(@NInt long value);

    /**
     * repeatMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/repeatMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRepeatMode:")
    public native void setRepeatMode(@NInt long value);

    /**
     * scalingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/scalingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScalingMode:")
    public native void setScalingMode(@NInt long value);

    /**
     * shouldAutoplay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/shouldAutoplay">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShouldAutoplay:")
    public native void setShouldAutoplay(boolean value);

    /**
     * useApplicationAudioSession</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/useApplicationAudioSession">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setUseApplicationAudioSession:")
    public native void setUseApplicationAudioSession(boolean value);

    /**
     * shouldAutoplay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/shouldAutoplay">iOS Dev Center</a>
     */
    @Generated
    @Selector("shouldAutoplay")
    public native boolean shouldAutoplay();

    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * thumbnailImageAtTime:timeOption:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instm/MPMoviePlayerController/thumbnailImageAtTime:timeOption:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("thumbnailImageAtTime:timeOption:")
    public native UIImage thumbnailImageAtTimeTimeOption(double playbackTime, @NInt long option);

    @Deprecated
    @Generated
    @Selector("timedMetadata")
    public native NSArray<?> timedMetadata();

    /**
     * useApplicationAudioSession</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/useApplicationAudioSession">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("useApplicationAudioSession")
    public native boolean useApplicationAudioSession();

    /**
     * view</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMoviePlayerController_Class/index.html#//apple_ref/occ/instp/MPMoviePlayerController/view">iOS Dev Center</a>
     */
    @Generated
    @Selector("view")
    public native UIView view();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playPrerollAdWithCompletionHandler {
        @Generated
        void call_playPrerollAdWithCompletionHandler(NSError arg0);
    }
}
