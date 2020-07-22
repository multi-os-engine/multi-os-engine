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
    @Selector("playerWithPlayerItem:")
    public static native AVPlayer playerWithPlayerItem(AVPlayerItem item);

    @Generated
    @Selector("playerWithURL:")
    public static native AVPlayer playerWithURL(NSURL URL);

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
    @Selector("actionAtItemEnd")
    @NInt
    public native long actionAtItemEnd();

    @Generated
    @Selector("addBoundaryTimeObserverForTimes:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object addBoundaryTimeObserverForTimesQueueUsingBlock(NSArray<? extends NSValue> times,
            NSObject queue,
            @ObjCBlock(name = "call_addBoundaryTimeObserverForTimesQueueUsingBlock") Block_addBoundaryTimeObserverForTimesQueueUsingBlock block);

    @Generated
    @Selector("addPeriodicTimeObserverForInterval:queue:usingBlock:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object addPeriodicTimeObserverForIntervalQueueUsingBlock(@ByValue CMTime interval, NSObject queue,
            @ObjCBlock(name = "call_addPeriodicTimeObserverForIntervalQueueUsingBlock") Block_addPeriodicTimeObserverForIntervalQueueUsingBlock block);

    @Generated
    @Deprecated
    @Selector("allowsAirPlayVideo")
    public native boolean allowsAirPlayVideo();

    @Generated
    @Selector("allowsExternalPlayback")
    public native boolean allowsExternalPlayback();

    @Generated
    @Selector("appliesMediaSelectionCriteriaAutomatically")
    public native boolean appliesMediaSelectionCriteriaAutomatically();

    @Generated
    @Selector("automaticallyWaitsToMinimizeStalling")
    public native boolean automaticallyWaitsToMinimizeStalling();

    @Generated
    @Selector("cancelPendingPrerolls")
    public native void cancelPendingPrerolls();

    @Generated
    @Selector("currentItem")
    public native AVPlayerItem currentItem();

    @Generated
    @Selector("currentTime")
    @ByValue
    public native CMTime currentTime();

    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("externalPlaybackVideoGravity")
    public native String externalPlaybackVideoGravity();

    @Generated
    @Selector("init")
    public native AVPlayer init();

    @Generated
    @Selector("initWithPlayerItem:")
    public native AVPlayer initWithPlayerItem(AVPlayerItem item);

    @Generated
    @Selector("initWithURL:")
    public native AVPlayer initWithURL(NSURL URL);

    @Generated
    @Deprecated
    @Selector("isAirPlayVideoActive")
    public native boolean isAirPlayVideoActive();

    @Generated
    @Selector("isClosedCaptionDisplayEnabled")
    public native boolean isClosedCaptionDisplayEnabled();

    @Generated
    @Selector("setClosedCaptionDisplayEnabled:")
    public native void setClosedCaptionDisplayEnabled(boolean value);

    @Generated
    @Selector("isExternalPlaybackActive")
    public native boolean isExternalPlaybackActive();

    @Generated
    @Selector("isMuted")
    public native boolean isMuted();

    @Generated
    @Selector("setMuted:")
    public native void setMuted(boolean value);

    @Generated
    @Selector("masterClock")
    public native CMClockRef masterClock();

    @Generated
    @Selector("mediaSelectionCriteriaForMediaCharacteristic:")
    public native AVPlayerMediaSelectionCriteria mediaSelectionCriteriaForMediaCharacteristic(
            String mediaCharacteristic);

    @Generated
    @Selector("outputObscuredDueToInsufficientExternalProtection")
    public native boolean outputObscuredDueToInsufficientExternalProtection();

    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("play")
    public native void play();

    @Generated
    @Selector("playImmediatelyAtRate:")
    public native void playImmediatelyAtRate(float rate);

    @Generated
    @Selector("prerollAtRate:completionHandler:")
    public native void prerollAtRateCompletionHandler(float rate,
            @ObjCBlock(name = "call_prerollAtRateCompletionHandler") Block_prerollAtRateCompletionHandler completionHandler);

    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("reasonForWaitingToPlay")
    public native String reasonForWaitingToPlay();

    @Generated
    @Selector("removeTimeObserver:")
    public native void removeTimeObserver(@Mapped(ObjCObjectMapper.class) Object observer);

    @Generated
    @Selector("replaceCurrentItemWithPlayerItem:")
    public native void replaceCurrentItemWithPlayerItem(AVPlayerItem item);

    @Generated
    @Selector("seekToDate:")
    public native void seekToDate(NSDate date);

    @Generated
    @Selector("seekToDate:completionHandler:")
    public native void seekToDateCompletionHandler(NSDate date,
            @ObjCBlock(name = "call_seekToDateCompletionHandler") Block_seekToDateCompletionHandler completionHandler);

    @Generated
    @Selector("seekToTime:")
    public native void seekToTime(@ByValue CMTime time);

    @Generated
    @Selector("seekToTime:completionHandler:")
    public native void seekToTimeCompletionHandler(@ByValue CMTime time,
            @ObjCBlock(name = "call_seekToTimeCompletionHandler") Block_seekToTimeCompletionHandler completionHandler);

    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:")
    public native void seekToTimeToleranceBeforeToleranceAfter(@ByValue CMTime time, @ByValue CMTime toleranceBefore,
            @ByValue CMTime toleranceAfter);

    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTimeToleranceBeforeToleranceAfterCompletionHandler(@ByValue CMTime time,
            @ByValue CMTime toleranceBefore, @ByValue CMTime toleranceAfter,
            @ObjCBlock(name = "call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler") Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler completionHandler);

    @Generated
    @Selector("setActionAtItemEnd:")
    public native void setActionAtItemEnd(@NInt long value);

    @Generated
    @Deprecated
    @Selector("setAllowsAirPlayVideo:")
    public native void setAllowsAirPlayVideo(boolean value);

    @Generated
    @Selector("setAllowsExternalPlayback:")
    public native void setAllowsExternalPlayback(boolean value);

    @Generated
    @Selector("setAppliesMediaSelectionCriteriaAutomatically:")
    public native void setAppliesMediaSelectionCriteriaAutomatically(boolean value);

    @Generated
    @Selector("setAutomaticallyWaitsToMinimizeStalling:")
    public native void setAutomaticallyWaitsToMinimizeStalling(boolean value);

    @Generated
    @Selector("setExternalPlaybackVideoGravity:")
    public native void setExternalPlaybackVideoGravity(String value);

    @Generated
    @Selector("setMasterClock:")
    public native void setMasterClock(CMClockRef value);

    @Generated
    @Selector("setMediaSelectionCriteria:forMediaCharacteristic:")
    public native void setMediaSelectionCriteriaForMediaCharacteristic(AVPlayerMediaSelectionCriteria criteria,
            String mediaCharacteristic);

    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    @Generated
    @Selector("setRate:time:atHostTime:")
    public native void setRateTimeAtHostTime(float rate, @ByValue CMTime itemTime, @ByValue CMTime hostClockTime);

    @Generated
    @Deprecated
    @Selector("setUsesAirPlayVideoWhileAirPlayScreenIsActive:")
    public native void setUsesAirPlayVideoWhileAirPlayScreenIsActive(boolean value);

    @Generated
    @Selector("setUsesExternalPlaybackWhileExternalScreenIsActive:")
    public native void setUsesExternalPlaybackWhileExternalScreenIsActive(boolean value);

    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("timeControlStatus")
    @NInt
    public native long timeControlStatus();

    @Generated
    @Deprecated
    @Selector("usesAirPlayVideoWhileAirPlayScreenIsActive")
    public native boolean usesAirPlayVideoWhileAirPlayScreenIsActive();

    @Generated
    @Selector("usesExternalPlaybackWhileExternalScreenIsActive")
    public native boolean usesExternalPlaybackWhileExternalScreenIsActive();

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

    @Generated
    @Selector("availableHDRModes")
    @NInt
    public static native long availableHDRModes();

    @Generated
    @Selector("preventsDisplaySleepDuringVideoPlayback")
    public native boolean preventsDisplaySleepDuringVideoPlayback();

    @Generated
    @Selector("setPreventsDisplaySleepDuringVideoPlayback:")
    public native void setPreventsDisplaySleepDuringVideoPlayback(boolean value);

    @Generated
    @Selector("eligibleForHDRPlayback")
    public static native boolean eligibleForHDRPlayback();
}
