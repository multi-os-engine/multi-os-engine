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
import apple.avfoundation.protocol.AVVideoCompositing;
import apple.coregraphics.struct.CGSize;
import apple.coremedia.opaque.CMTimebaseRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSValue;
import apple.foundation.protocol.NSCopying;
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
public class AVPlayerItem extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected AVPlayerItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItem alloc();

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
    @Selector("playerItemWithAsset:")
    public static native AVPlayerItem playerItemWithAsset(AVAsset asset);

    @Generated
    @Selector("playerItemWithAsset:automaticallyLoadedAssetKeys:")
    public static native AVPlayerItem playerItemWithAssetAutomaticallyLoadedAssetKeys(AVAsset asset,
            NSArray<String> automaticallyLoadedAssetKeys);

    @Generated
    @Selector("playerItemWithURL:")
    public static native AVPlayerItem playerItemWithURL(NSURL URL);

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
    @Selector("accessLog")
    public native AVPlayerItemAccessLog accessLog();

    @Generated
    @Selector("addMediaDataCollector:")
    public native void addMediaDataCollector(AVPlayerItemMediaDataCollector collector);

    @Generated
    @Selector("addOutput:")
    public native void addOutput(AVPlayerItemOutput output);

    @Generated
    @Selector("asset")
    public native AVAsset asset();

    @Generated
    @Selector("audioMix")
    public native AVAudioMix audioMix();

    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    @Generated
    @Selector("automaticallyLoadedAssetKeys")
    public native NSArray<String> automaticallyLoadedAssetKeys();

    @Generated
    @Selector("canPlayFastForward")
    public native boolean canPlayFastForward();

    @Generated
    @Selector("canPlayFastReverse")
    public native boolean canPlayFastReverse();

    @Generated
    @Selector("canPlayReverse")
    public native boolean canPlayReverse();

    @Generated
    @Selector("canPlaySlowForward")
    public native boolean canPlaySlowForward();

    @Generated
    @Selector("canPlaySlowReverse")
    public native boolean canPlaySlowReverse();

    @Generated
    @Selector("canStepBackward")
    public native boolean canStepBackward();

    @Generated
    @Selector("canStepForward")
    public native boolean canStepForward();

    @Generated
    @Selector("canUseNetworkResourcesForLiveStreamingWhilePaused")
    public native boolean canUseNetworkResourcesForLiveStreamingWhilePaused();

    @Generated
    @Selector("cancelPendingSeeks")
    public native void cancelPendingSeeks();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("currentDate")
    public native NSDate currentDate();

    @Generated
    @Selector("currentMediaSelection")
    public native AVMediaSelection currentMediaSelection();

    @Generated
    @Selector("currentTime")
    @ByValue
    public native CMTime currentTime();

    @Generated
    @Selector("customVideoCompositor")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositor();

    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("errorLog")
    public native AVPlayerItemErrorLog errorLog();

    @Generated
    @Selector("forwardPlaybackEndTime")
    @ByValue
    public native CMTime forwardPlaybackEndTime();

    @Generated
    @Selector("init")
    public native AVPlayerItem init();

    @Generated
    @Selector("initWithAsset:")
    public native AVPlayerItem initWithAsset(AVAsset asset);

    @Generated
    @Selector("initWithAsset:automaticallyLoadedAssetKeys:")
    public native AVPlayerItem initWithAssetAutomaticallyLoadedAssetKeys(AVAsset asset,
            NSArray<String> automaticallyLoadedAssetKeys);

    @Generated
    @Selector("initWithURL:")
    public native AVPlayerItem initWithURL(NSURL URL);

    @Generated
    @Selector("isPlaybackBufferEmpty")
    public native boolean isPlaybackBufferEmpty();

    @Generated
    @Selector("isPlaybackBufferFull")
    public native boolean isPlaybackBufferFull();

    @Generated
    @Selector("isPlaybackLikelyToKeepUp")
    public native boolean isPlaybackLikelyToKeepUp();

    @Generated
    @Selector("loadedTimeRanges")
    public native NSArray<? extends NSValue> loadedTimeRanges();

    @Generated
    @Selector("mediaDataCollectors")
    public native NSArray<? extends AVPlayerItemMediaDataCollector> mediaDataCollectors();

    @Generated
    @Selector("outputs")
    public native NSArray<? extends AVPlayerItemOutput> outputs();

    @Generated
    @Selector("preferredForwardBufferDuration")
    public native double preferredForwardBufferDuration();

    @Generated
    @Selector("preferredPeakBitRate")
    public native double preferredPeakBitRate();

    @Generated
    @Selector("presentationSize")
    @ByValue
    public native CGSize presentationSize();

    @Generated
    @Selector("removeMediaDataCollector:")
    public native void removeMediaDataCollector(AVPlayerItemMediaDataCollector collector);

    @Generated
    @Selector("removeOutput:")
    public native void removeOutput(AVPlayerItemOutput output);

    @Generated
    @Selector("reversePlaybackEndTime")
    @ByValue
    public native CMTime reversePlaybackEndTime();

    @Generated
    @Selector("seekToDate:")
    public native boolean seekToDate(NSDate date);

    @Generated
    @Selector("seekToDate:completionHandler:")
    public native boolean seekToDateCompletionHandler(NSDate date,
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
    @Selector("seekableTimeRanges")
    public native NSArray<? extends NSValue> seekableTimeRanges();

    @Generated
    @Selector("seekingWaitsForVideoCompositionRendering")
    public native boolean seekingWaitsForVideoCompositionRendering();

    @Generated
    @Selector("selectMediaOption:inMediaSelectionGroup:")
    public native void selectMediaOptionInMediaSelectionGroup(AVMediaSelectionOption mediaSelectionOption,
            AVMediaSelectionGroup mediaSelectionGroup);

    @Generated
    @Selector("selectMediaOptionAutomaticallyInMediaSelectionGroup:")
    public native void selectMediaOptionAutomaticallyInMediaSelectionGroup(AVMediaSelectionGroup mediaSelectionGroup);

    @Generated
    @Selector("selectedMediaOptionInMediaSelectionGroup:")
    public native AVMediaSelectionOption selectedMediaOptionInMediaSelectionGroup(
            AVMediaSelectionGroup mediaSelectionGroup);

    @Generated
    @Selector("setAudioMix:")
    public native void setAudioMix(AVAudioMix value);

    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String value);

    @Generated
    @Selector("setCanUseNetworkResourcesForLiveStreamingWhilePaused:")
    public native void setCanUseNetworkResourcesForLiveStreamingWhilePaused(boolean value);

    @Generated
    @Selector("setForwardPlaybackEndTime:")
    public native void setForwardPlaybackEndTime(@ByValue CMTime value);

    @Generated
    @Selector("setPreferredForwardBufferDuration:")
    public native void setPreferredForwardBufferDuration(double value);

    @Generated
    @Selector("setPreferredPeakBitRate:")
    public native void setPreferredPeakBitRate(double value);

    @Generated
    @Selector("setReversePlaybackEndTime:")
    public native void setReversePlaybackEndTime(@ByValue CMTime value);

    @Generated
    @Selector("setSeekingWaitsForVideoCompositionRendering:")
    public native void setSeekingWaitsForVideoCompositionRendering(boolean value);

    @Generated
    @Selector("setTextStyleRules:")
    public native void setTextStyleRules(NSArray<? extends AVTextStyleRule> value);

    @Generated
    @Selector("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition value);

    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("stepByCount:")
    public native void stepByCount(@NInt long stepCount);

    @Generated
    @Selector("textStyleRules")
    public native NSArray<? extends AVTextStyleRule> textStyleRules();

    @Generated
    @Selector("timebase")
    public native CMTimebaseRef timebase();

    @Generated
    @Selector("timedMetadata")
    public native NSArray<? extends AVMetadataItem> timedMetadata();

    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVPlayerItemTrack> tracks();

    @Generated
    @Selector("videoComposition")
    public native AVVideoComposition videoComposition();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToDateCompletionHandler {
        @Generated
        void call_seekToDateCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeCompletionHandler {
        @Generated
        void call_seekToTimeCompletionHandler(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler {
        @Generated
        void call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler(boolean arg0);
    }

    @Generated
    @Selector("preferredMaximumResolution")
    @ByValue
    public native CGSize preferredMaximumResolution();

    @Generated
    @Selector("setPreferredMaximumResolution:")
    public native void setPreferredMaximumResolution(@ByValue CGSize value);

    @Generated
    @Selector("setVideoApertureMode:")
    public native void setVideoApertureMode(String value);

    @Generated
    @Selector("videoApertureMode")
    public native String videoApertureMode();

    @Generated
    @Selector("automaticallyPreservesTimeOffsetFromLive")
    public native boolean automaticallyPreservesTimeOffsetFromLive();

    @Generated
    @Selector("configuredTimeOffsetFromLive")
    @ByValue
    public native CMTime configuredTimeOffsetFromLive();

    @Generated
    @Selector("isAudioSpatializationAllowed")
    public native boolean isAudioSpatializationAllowed();

    @Generated
    @Selector("recommendedTimeOffsetFromLive")
    @ByValue
    public native CMTime recommendedTimeOffsetFromLive();

    @Generated
    @Selector("setAudioSpatializationAllowed:")
    public native void setAudioSpatializationAllowed(boolean value);

    @Generated
    @Selector("setAutomaticallyPreservesTimeOffsetFromLive:")
    public native void setAutomaticallyPreservesTimeOffsetFromLive(boolean value);

    @Generated
    @Selector("setConfiguredTimeOffsetFromLive:")
    public native void setConfiguredTimeOffsetFromLive(@ByValue CMTime value);

    @Generated
    @Selector("externalMetadata")
    public native NSArray<? extends AVMetadataItem> externalMetadata();

    @Generated
    @Selector("setExternalMetadata:")
    public native void setExternalMetadata(NSArray<? extends AVMetadataItem> value);
}
