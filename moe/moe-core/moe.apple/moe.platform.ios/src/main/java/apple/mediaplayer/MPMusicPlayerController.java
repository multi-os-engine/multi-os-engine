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
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mediaplayer.protocol.MPMediaPlayback;
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

@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMusicPlayerController extends NSObject implements MPMediaPlayback {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMusicPlayerController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMusicPlayerController alloc();

    /**
     * applicationMusicPlayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/clm/MPMusicPlayerController/applicationMusicPlayer">iOS Dev Center</a>
     */
    @Generated
    @Selector("applicationMusicPlayer")
    public static native MPMusicPlayerController applicationMusicPlayer();

    /**
     * iPodMusicPlayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/clm/MPMusicPlayerController/iPodMusicPlayer">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("iPodMusicPlayer")
    public static native MPMusicPlayerController iPodMusicPlayer();

    /**
     * systemMusicPlayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/clm/MPMusicPlayerController/systemMusicPlayer">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemMusicPlayer")
    public static native MPMusicPlayerController systemMusicPlayer();

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
     * beginGeneratingPlaybackNotifications</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instm/MPMusicPlayerController/beginGeneratingPlaybackNotifications">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginGeneratingPlaybackNotifications")
    public native void beginGeneratingPlaybackNotifications();

    @Generated
    @Selector("beginSeekingBackward")
    public native void beginSeekingBackward();

    @Generated
    @Selector("beginSeekingForward")
    public native void beginSeekingForward();

    @Generated
    @Selector("currentPlaybackRate")
    public native float currentPlaybackRate();

    @Generated
    @Selector("currentPlaybackTime")
    public native double currentPlaybackTime();

    /**
     * endGeneratingPlaybackNotifications</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instm/MPMusicPlayerController/endGeneratingPlaybackNotifications">iOS Dev Center</a>
     */
    @Generated
    @Selector("endGeneratingPlaybackNotifications")
    public native void endGeneratingPlaybackNotifications();

    @Generated
    @Selector("endSeeking")
    public native void endSeeking();

    /**
     * indexOfNowPlayingItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/indexOfNowPlayingItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("indexOfNowPlayingItem")
    @NUInt
    public native long indexOfNowPlayingItem();

    @Generated
    @Selector("init")
    public native MPMusicPlayerController init();

    @Generated
    @Selector("isPreparedToPlay")
    public native boolean isPreparedToPlay();

    /**
     * nowPlayingItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/nowPlayingItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("nowPlayingItem")
    public native MPMediaItem nowPlayingItem();

    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("play")
    public native void play();

    /**
     * playbackState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/playbackState">iOS Dev Center</a>
     */
    @Generated
    @Selector("playbackState")
    @NInt
    public native long playbackState();

    @Generated
    @Selector("prepareToPlay")
    public native void prepareToPlay();

    /**
     * repeatMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/repeatMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("repeatMode")
    @NInt
    public native long repeatMode();

    @Generated
    @Selector("setCurrentPlaybackRate:")
    public native void setCurrentPlaybackRate(float value);

    @Generated
    @Selector("setCurrentPlaybackTime:")
    public native void setCurrentPlaybackTime(double value);

    /**
     * nowPlayingItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/nowPlayingItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNowPlayingItem:")
    public native void setNowPlayingItem(MPMediaItem value);

    /**
     * setQueueWithItemCollection:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instm/MPMusicPlayerController/setQueueWithItemCollection:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQueueWithItemCollection:")
    public native void setQueueWithItemCollection(MPMediaItemCollection itemCollection);

    /**
     * setQueueWithQuery:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instm/MPMusicPlayerController/setQueueWithQuery:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQueueWithQuery:")
    public native void setQueueWithQuery(MPMediaQuery query);

    /**
     * repeatMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/repeatMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRepeatMode:")
    public native void setRepeatMode(@NInt long value);

    /**
     * shuffleMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/shuffleMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShuffleMode:")
    public native void setShuffleMode(@NInt long value);

    /**
     * volume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/volume">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * shuffleMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/shuffleMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("shuffleMode")
    @NInt
    public native long shuffleMode();

    /**
     * skipToBeginning</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instm/MPMusicPlayerController/skipToBeginning">iOS Dev Center</a>
     */
    @Generated
    @Selector("skipToBeginning")
    public native void skipToBeginning();

    /**
     * skipToNextItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instm/MPMusicPlayerController/skipToNextItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("skipToNextItem")
    public native void skipToNextItem();

    /**
     * skipToPreviousItem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instm/MPMusicPlayerController/skipToPreviousItem">iOS Dev Center</a>
     */
    @Generated
    @Selector("skipToPreviousItem")
    public native void skipToPreviousItem();

    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * volume</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMusicPlayerController_ClassReference/index.html#//apple_ref/occ/instp/MPMusicPlayerController/volume">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("volume")
    public native float volume();

    @Generated
    @Selector("setQueueWithStoreIDs:")
    public native void setQueueWithStoreIDs(NSArray<String> storeIDs);
}
