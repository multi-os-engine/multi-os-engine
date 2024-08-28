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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.1
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPRemoteCommandCenter extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPRemoteCommandCenter(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPRemoteCommandCenter alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPRemoteCommandCenter allocWithZone(VoidPtr zone);

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
    public static native MPRemoteCommandCenter new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("sharedCommandCenter")
    public static native MPRemoteCommandCenter sharedCommandCenter();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Selector("bookmarkCommand")
    public native MPFeedbackCommand bookmarkCommand();

    /**
     * API-Since: 9.1
     */
    @NotNull
    @Generated
    @Selector("changePlaybackPositionCommand")
    public native MPChangePlaybackPositionCommand changePlaybackPositionCommand();

    @NotNull
    @Generated
    @Selector("changePlaybackRateCommand")
    public native MPChangePlaybackRateCommand changePlaybackRateCommand();

    @NotNull
    @Generated
    @Selector("changeRepeatModeCommand")
    public native MPChangeRepeatModeCommand changeRepeatModeCommand();

    @NotNull
    @Generated
    @Selector("changeShuffleModeCommand")
    public native MPChangeShuffleModeCommand changeShuffleModeCommand();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("disableLanguageOptionCommand")
    public native MPRemoteCommand disableLanguageOptionCommand();

    @NotNull
    @Generated
    @Selector("dislikeCommand")
    public native MPFeedbackCommand dislikeCommand();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("enableLanguageOptionCommand")
    public native MPRemoteCommand enableLanguageOptionCommand();

    @Generated
    @Selector("init")
    public native MPRemoteCommandCenter init();

    /**
     * Feedback Commands
     * These are generalized to three distinct actions. Your application can provide
     * additional context about these actions with the localizedTitle property in
     * MPFeedbackCommand.
     */
    @NotNull
    @Generated
    @Selector("likeCommand")
    public native MPFeedbackCommand likeCommand();

    /**
     * Previous/Next Track Commands
     */
    @NotNull
    @Generated
    @Selector("nextTrackCommand")
    public native MPRemoteCommand nextTrackCommand();

    /**
     * Playback Commands
     */
    @NotNull
    @Generated
    @Selector("pauseCommand")
    public native MPRemoteCommand pauseCommand();

    @NotNull
    @Generated
    @Selector("playCommand")
    public native MPRemoteCommand playCommand();

    @NotNull
    @Generated
    @Selector("previousTrackCommand")
    public native MPRemoteCommand previousTrackCommand();

    /**
     * Rating Command
     */
    @NotNull
    @Generated
    @Selector("ratingCommand")
    public native MPRatingCommand ratingCommand();

    @NotNull
    @Generated
    @Selector("seekBackwardCommand")
    public native MPRemoteCommand seekBackwardCommand();

    /**
     * Seek Commands
     */
    @NotNull
    @Generated
    @Selector("seekForwardCommand")
    public native MPRemoteCommand seekForwardCommand();

    @NotNull
    @Generated
    @Selector("skipBackwardCommand")
    public native MPSkipIntervalCommand skipBackwardCommand();

    /**
     * Skip Interval Commands
     */
    @NotNull
    @Generated
    @Selector("skipForwardCommand")
    public native MPSkipIntervalCommand skipForwardCommand();

    @NotNull
    @Generated
    @Selector("stopCommand")
    public native MPRemoteCommand stopCommand();

    @NotNull
    @Generated
    @Selector("togglePlayPauseCommand")
    public native MPRemoteCommand togglePlayPauseCommand();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
