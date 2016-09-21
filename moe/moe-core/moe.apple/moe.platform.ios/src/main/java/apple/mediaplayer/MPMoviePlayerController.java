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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMoviePlayerController alloc();

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

    @Generated
    @Deprecated
    @Selector("accessLog")
    public native MPMovieAccessLog accessLog();

    @Generated
    @Deprecated
    @Selector("allowsAirPlay")
    public native boolean allowsAirPlay();

    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    @Generated
    @Selector("beginSeekingBackward")
    public native void beginSeekingBackward();

    @Generated
    @Selector("beginSeekingForward")
    public native void beginSeekingForward();

    @Generated
    @Deprecated
    @Selector("cancelAllThumbnailImageRequests")
    public native void cancelAllThumbnailImageRequests();

    @Generated
    @Selector("cancelPreroll")
    public native void cancelPreroll();

    @Generated
    @Selector("contentURL")
    public native NSURL contentURL();

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

    @Generated
    @Deprecated
    @Selector("duration")
    public native double duration();

    @Generated
    @Deprecated
    @Selector("endPlaybackTime")
    public native double endPlaybackTime();

    @Generated
    @Selector("endSeeking")
    public native void endSeeking();

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

    @Generated
    @Deprecated
    @Selector("initialPlaybackTime")
    public native double initialPlaybackTime();

    @Generated
    @Deprecated
    @Selector("isAirPlayVideoActive")
    public native boolean isAirPlayVideoActive();

    @Generated
    @Selector("isFullscreen")
    public native boolean isFullscreen();

    @Generated
    @Selector("setFullscreen:")
    public native void setFullscreen(boolean value);

    @Generated
    @Selector("isPreparedToPlay")
    public native boolean isPreparedToPlay();

    @Generated
    @Selector("loadState")
    @NUInt
    public native long loadState();

    @Generated
    @Deprecated
    @Selector("movieMediaTypes")
    @NUInt
    public native long movieMediaTypes();

    @Generated
    @Deprecated
    @Selector("movieSourceType")
    @NInt
    public native long movieSourceType();

    @Generated
    @Deprecated
    @Selector("naturalSize")
    @ByValue
    public native CGSize naturalSize();

    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("play")
    public native void play();

    @Generated
    @Selector("playPrerollAdWithCompletionHandler:")
    public native void playPrerollAdWithCompletionHandler(
            @ObjCBlock(name = "call_playPrerollAdWithCompletionHandler") Block_playPrerollAdWithCompletionHandler completionHandler);

    @Generated
    @Deprecated
    @Selector("playableDuration")
    public native double playableDuration();

    @Generated
    @Selector("playbackState")
    @NInt
    public native long playbackState();

    @Generated
    @Selector("prepareToPlay")
    public native void prepareToPlay();

    @Generated
    @Selector("readyForDisplay")
    public native boolean readyForDisplay();

    @Generated
    @Selector("repeatMode")
    @NInt
    public native long repeatMode();

    @Generated
    @Deprecated
    @Selector("requestThumbnailImagesAtTimes:timeOption:")
    public native void requestThumbnailImagesAtTimesTimeOption(NSArray<?> playbackTimes, @NInt long option);

    @Generated
    @Selector("scalingMode")
    @NInt
    public native long scalingMode();

    @Generated
    @Deprecated
    @Selector("setAllowsAirPlay:")
    public native void setAllowsAirPlay(boolean value);

    @Generated
    @Selector("setContentURL:")
    public native void setContentURL(NSURL value);

    @Generated
    @Selector("setControlStyle:")
    public native void setControlStyle(@NInt long value);

    @Generated
    @Selector("setCurrentPlaybackRate:")
    public native void setCurrentPlaybackRate(float value);

    @Generated
    @Selector("setCurrentPlaybackTime:")
    public native void setCurrentPlaybackTime(double value);

    @Generated
    @Deprecated
    @Selector("setEndPlaybackTime:")
    public native void setEndPlaybackTime(double value);

    @Generated
    @Selector("setFullscreen:animated:")
    public native void setFullscreenAnimated(boolean fullscreen, boolean animated);

    @Generated
    @Deprecated
    @Selector("setInitialPlaybackTime:")
    public native void setInitialPlaybackTime(double value);

    @Generated
    @Deprecated
    @Selector("setMovieSourceType:")
    public native void setMovieSourceType(@NInt long value);

    @Generated
    @Selector("setRepeatMode:")
    public native void setRepeatMode(@NInt long value);

    @Generated
    @Selector("setScalingMode:")
    public native void setScalingMode(@NInt long value);

    @Generated
    @Selector("setShouldAutoplay:")
    public native void setShouldAutoplay(boolean value);

    @Generated
    @Deprecated
    @Selector("setUseApplicationAudioSession:")
    public native void setUseApplicationAudioSession(boolean value);

    @Generated
    @Selector("shouldAutoplay")
    public native boolean shouldAutoplay();

    @Generated
    @Selector("stop")
    public native void stop();

    @Generated
    @Deprecated
    @Selector("thumbnailImageAtTime:timeOption:")
    public native UIImage thumbnailImageAtTimeTimeOption(double playbackTime, @NInt long option);

    @Generated
    @Deprecated
    @Selector("timedMetadata")
    public native NSArray<?> timedMetadata();

    @Generated
    @Deprecated
    @Selector("useApplicationAudioSession")
    public native boolean useApplicationAudioSession();

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
