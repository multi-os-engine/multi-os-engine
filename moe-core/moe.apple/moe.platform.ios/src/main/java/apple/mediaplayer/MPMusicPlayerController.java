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
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mediaplayer.protocol.MPMediaPlayback;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * MPMusicPlayerController allows playback of MPMediaItems through the Music application.
 * See MPMediaPlayback.h for basic playback control.
 * 
 * API-Since: 3.0
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMusicPlayerController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMusicPlayerController allocWithZone(VoidPtr zone);

    /**
     * Playing items with applicationMusicPlayer does not affect Music's playback state.
     */
    @NotNull
    @Generated
    @Selector("applicationMusicPlayer")
    public static native MPMusicPlayerController applicationMusicPlayer();

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

    /**
     * API-Since: 3.0
     * Deprecated-Since: 8.0
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("iPodMusicPlayer")
    public static native MPMusicPlayerController iPodMusicPlayer();

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
    public static native MPMusicPlayerController new_objc();

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

    /**
     * Playing media items with the systemMusicPlayer will replace the user's current Music state.
     */
    @NotNull
    @Generated
    @Selector("systemMusicPlayer")
    public static native MPMusicPlayerController systemMusicPlayer();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * These methods determine whether playback notifications will be generated.
     * Calls to begin/endGeneratingPlaybackNotifications are nestable.
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

    @Generated
    @Selector("endGeneratingPlaybackNotifications")
    public native void endGeneratingPlaybackNotifications();

    @Generated
    @Selector("endSeeking")
    public native void endSeeking();

    /**
     * Returns the index of the now playing item in the current playback queue.
     * May return NSNotFound if the index is not valid (e.g. an empty queue or an infinite playlist).
     * 
     * API-Since: 5.0
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
     * Returns the currently playing media item, or nil if none is playing.
     * Setting the nowPlayingItem to an item in the current queue will begin playback at that item.
     */
    @Nullable
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
     * Returns the current playback state of the music player
     */
    @Generated
    @Selector("playbackState")
    @NInt
    public native long playbackState();

    @Generated
    @Selector("prepareToPlay")
    public native void prepareToPlay();

    /**
     * The completion handler will be called when the first item from the queue is buffered and ready to play.
     * If a first item has been specified using MPMusicPlayerQueueDescriptor, the error will be non-nil if the specified
     * item cannot be prepared for playback.
     * If a first item is not specified, the error will be non-nil if an item cannot be prepared for playback.
     * Errors will be in MPErrorDomain.
     * 
     * API-Since: 10.1
     */
    @Generated
    @Selector("prepareToPlayWithCompletionHandler:")
    public native void prepareToPlayWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_prepareToPlayWithCompletionHandler") Block_prepareToPlayWithCompletionHandler completionHandler);

    /**
     * Determines how music repeats after playback completes. Defaults to MPMusicRepeatModeDefault.
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
     * Returns the currently playing media item, or nil if none is playing.
     * Setting the nowPlayingItem to an item in the current queue will begin playback at that item.
     */
    @Generated
    @Selector("setNowPlayingItem:")
    public native void setNowPlayingItem(@Nullable MPMediaItem value);

    /**
     * API-Since: 10.1
     */
    @Generated
    @Selector("setQueueWithDescriptor:")
    public native void setQueueWithDescriptor(@NotNull MPMusicPlayerQueueDescriptor descriptor);

    @Generated
    @Selector("setQueueWithItemCollection:")
    public native void setQueueWithItemCollection(@NotNull MPMediaItemCollection itemCollection);

    /**
     * Call -play to begin playback after setting an item queue source. Setting a query will implicitly use
     * MPMediaGroupingTitle.
     */
    @Generated
    @Selector("setQueueWithQuery:")
    public native void setQueueWithQuery(@NotNull MPMediaQuery query);

    /**
     * API-Since: 9.3
     */
    @Generated
    @Selector("setQueueWithStoreIDs:")
    public native void setQueueWithStoreIDs(@NotNull NSArray<String> storeIDs);

    /**
     * Determines how music repeats after playback completes. Defaults to MPMusicRepeatModeDefault.
     */
    @Generated
    @Selector("setRepeatMode:")
    public native void setRepeatMode(@NInt long value);

    /**
     * Determines how music is shuffled when playing. Defaults to MPMusicShuffleModeDefault.
     */
    @Generated
    @Selector("setShuffleMode:")
    public native void setShuffleMode(@NInt long value);

    /**
     * The current volume of playing music, in the range of 0.0 to 1.0.
     * This property is deprecated -- use MPVolumeView for volume control instead.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use MPVolumeView for volume control.
     */
    @Generated
    @Deprecated
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * Determines how music is shuffled when playing. Defaults to MPMusicShuffleModeDefault.
     */
    @Generated
    @Selector("shuffleMode")
    @NInt
    public native long shuffleMode();

    /**
     * Restarts playback at the beginning of the currently playing media item.
     */
    @Generated
    @Selector("skipToBeginning")
    public native void skipToBeginning();

    /**
     * Skips to the next item in the queue.
     * If already at the last item, this resets the queue to the first item in a paused playback state.
     */
    @Generated
    @Selector("skipToNextItem")
    public native void skipToNextItem();

    /**
     * Skips to the previous item in the queue. If already at the first item, this will end playback.
     */
    @Generated
    @Selector("skipToPreviousItem")
    public native void skipToPreviousItem();

    @Generated
    @Selector("stop")
    public native void stop();

    /**
     * The current volume of playing music, in the range of 0.0 to 1.0.
     * This property is deprecated -- use MPVolumeView for volume control instead.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use MPVolumeView for volume control.
     */
    @Generated
    @Deprecated
    @Selector("volume")
    public native float volume();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareToPlayWithCompletionHandler {
        @Generated
        void call_prepareToPlayWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Adds the contents of the queue descriptor to the end of the queue
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("appendQueueDescriptor:")
    public native void appendQueueDescriptor(@NotNull MPMusicPlayerQueueDescriptor descriptor);

    /**
     * Similar to applicationMusicPlayer, but allows direct manipulation of the queue.
     * 
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @Selector("applicationQueuePlayer")
    public static native MPMusicPlayerApplicationController applicationQueuePlayer();

    /**
     * Inserts the contents of the queue descriptor after the now playing item
     * 
     * API-Since: 10.3
     */
    @Generated
    @Selector("prependQueueDescriptor:")
    public native void prependQueueDescriptor(@NotNull MPMusicPlayerQueueDescriptor descriptor);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
