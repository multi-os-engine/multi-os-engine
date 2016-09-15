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

    /**
     * accessLog</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/accessLog">iOS Dev Center</a>
     */
    @Generated
    @Selector("accessLog")
    public native AVPlayerItemAccessLog accessLog();

    /**
     * addOutput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/addOutput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addOutput:")
    public native void addOutput(AVPlayerItemOutput output);

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVPlayerItem alloc();

    /**
     * asset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/asset">iOS Dev Center</a>
     */
    @Generated
    @Selector("asset")
    public native AVAsset asset();

    /**
     * audioMix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/audioMix">iOS Dev Center</a>
     */
    @Generated
    @Selector("audioMix")
    public native AVAudioMix audioMix();

    /**
     * audioTimePitchAlgorithm</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/audioTimePitchAlgorithm">iOS Dev Center</a>
     */
    @Generated
    @Selector("audioTimePitchAlgorithm")
    public native String audioTimePitchAlgorithm();

    /**
     * automaticallyLoadedAssetKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/automaticallyLoadedAssetKeys">iOS Dev Center</a>
     */
    @Generated
    @Selector("automaticallyLoadedAssetKeys")
    public native NSArray<String> automaticallyLoadedAssetKeys();

    /**
     * canPlayFastForward</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/canPlayFastForward">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPlayFastForward")
    public native boolean canPlayFastForward();

    /**
     * canPlayFastReverse</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/canPlayFastReverse">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPlayFastReverse")
    public native boolean canPlayFastReverse();

    /**
     * canPlayReverse</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/canPlayReverse">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPlayReverse")
    public native boolean canPlayReverse();

    /**
     * canPlaySlowForward</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/canPlaySlowForward">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPlaySlowForward")
    public native boolean canPlaySlowForward();

    /**
     * canPlaySlowReverse</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/canPlaySlowReverse">iOS Dev Center</a>
     */
    @Generated
    @Selector("canPlaySlowReverse")
    public native boolean canPlaySlowReverse();

    /**
     * canStepBackward</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/canStepBackward">iOS Dev Center</a>
     */
    @Generated
    @Selector("canStepBackward")
    public native boolean canStepBackward();

    /**
     * canStepForward</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/canStepForward">iOS Dev Center</a>
     */
    @Generated
    @Selector("canStepForward")
    public native boolean canStepForward();

    /**
     * cancelPendingSeeks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/cancelPendingSeeks">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelPendingSeeks")
    public native void cancelPendingSeeks();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * currentDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/currentDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentDate")
    public native NSDate currentDate();

    /**
     * currentTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/currentTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentTime")
    @ByValue
    public native CMTime currentTime();

    /**
     * customVideoCompositor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/customVideoCompositor">iOS Dev Center</a>
     */
    @Generated
    @Selector("customVideoCompositor")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVVideoCompositing customVideoCompositor();

    /**
     * duration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/duration">iOS Dev Center</a>
     */
    @Generated
    @Selector("duration")
    @ByValue
    public native CMTime duration();

    /**
     * error</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/error">iOS Dev Center</a>
     */
    @Generated
    @Selector("error")
    public native NSError error();

    /**
     * errorLog</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/errorLog">iOS Dev Center</a>
     */
    @Generated
    @Selector("errorLog")
    public native AVPlayerItemErrorLog errorLog();

    /**
     * forwardPlaybackEndTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/forwardPlaybackEndTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("forwardPlaybackEndTime")
    @ByValue
    public native CMTime forwardPlaybackEndTime();

    @Generated
    @Selector("init")
    public native AVPlayerItem init();

    /**
     * initWithAsset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/initWithAsset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAsset:")
    public native AVPlayerItem initWithAsset(AVAsset asset);

    /**
     * initWithAsset:automaticallyLoadedAssetKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/initWithAsset:automaticallyLoadedAssetKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithAsset:automaticallyLoadedAssetKeys:")
    public native AVPlayerItem initWithAssetAutomaticallyLoadedAssetKeys(AVAsset asset,
            NSArray<String> automaticallyLoadedAssetKeys);

    /**
     * initWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/initWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithURL:")
    public native AVPlayerItem initWithURL(NSURL URL);

    /**
     * playbackBufferEmpty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/playbackBufferEmpty">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPlaybackBufferEmpty")
    public native boolean isPlaybackBufferEmpty();

    /**
     * playbackBufferFull</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/playbackBufferFull">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPlaybackBufferFull")
    public native boolean isPlaybackBufferFull();

    /**
     * playbackLikelyToKeepUp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/playbackLikelyToKeepUp">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPlaybackLikelyToKeepUp")
    public native boolean isPlaybackLikelyToKeepUp();

    /**
     * loadedTimeRanges</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/loadedTimeRanges">iOS Dev Center</a>
     */
    @Generated
    @Selector("loadedTimeRanges")
    public native NSArray<? extends NSValue> loadedTimeRanges();

    /**
     * outputs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/outputs">iOS Dev Center</a>
     */
    @Generated
    @Selector("outputs")
    public native NSArray<? extends AVPlayerItemOutput> outputs();

    /**
     * playerItemWithAsset:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/clm/AVPlayerItem/playerItemWithAsset:">iOS Dev Center</a>
     */
    @Generated
    @Selector("playerItemWithAsset:")
    public static native AVPlayerItem playerItemWithAsset(AVAsset asset);

    /**
     * playerItemWithAsset:automaticallyLoadedAssetKeys:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/clm/AVPlayerItem/playerItemWithAsset:automaticallyLoadedAssetKeys:">iOS Dev Center</a>
     */
    @Generated
    @Selector("playerItemWithAsset:automaticallyLoadedAssetKeys:")
    public static native AVPlayerItem playerItemWithAssetAutomaticallyLoadedAssetKeys(AVAsset asset,
            NSArray<String> automaticallyLoadedAssetKeys);

    /**
     * playerItemWithURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/clm/AVPlayerItem/playerItemWithURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("playerItemWithURL:")
    public static native AVPlayerItem playerItemWithURL(NSURL URL);

    /**
     * preferredPeakBitRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/preferredPeakBitRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("preferredPeakBitRate")
    public native double preferredPeakBitRate();

    /**
     * presentationSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/presentationSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("presentationSize")
    @ByValue
    public native CGSize presentationSize();

    /**
     * removeOutput:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/removeOutput:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeOutput:")
    public native void removeOutput(AVPlayerItemOutput output);

    /**
     * reversePlaybackEndTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/reversePlaybackEndTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("reversePlaybackEndTime")
    @ByValue
    public native CMTime reversePlaybackEndTime();

    /**
     * seekToDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/seekToDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("seekToDate:")
    public native boolean seekToDate(NSDate date);

    /**
     * seekToDate:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/seekToDate:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("seekToDate:completionHandler:")
    public native boolean seekToDateCompletionHandler(NSDate date,
            @ObjCBlock(name = "call_seekToDateCompletionHandler") Block_seekToDateCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToDateCompletionHandler {
        @Generated
        void call_seekToDateCompletionHandler(boolean arg0);
    }

    /**
     * seekToTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/seekToTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("seekToTime:")
    public native void seekToTime(@ByValue CMTime time);

    /**
     * seekToTime:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/seekToTime:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("seekToTime:completionHandler:")
    public native void seekToTimeCompletionHandler(@ByValue CMTime time,
            @ObjCBlock(name = "call_seekToTimeCompletionHandler") Block_seekToTimeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeCompletionHandler {
        @Generated
        void call_seekToTimeCompletionHandler(boolean arg0);
    }

    /**
     * seekToTime:toleranceBefore:toleranceAfter:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/seekToTime:toleranceBefore:toleranceAfter:">iOS Dev Center</a>
     */
    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:")
    public native void seekToTimeToleranceBeforeToleranceAfter(@ByValue CMTime time, @ByValue CMTime toleranceBefore,
            @ByValue CMTime toleranceAfter);

    /**
     * seekToTime:toleranceBefore:toleranceAfter:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/seekToTime:toleranceBefore:toleranceAfter:completionHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
    public native void seekToTimeToleranceBeforeToleranceAfterCompletionHandler(@ByValue CMTime time,
            @ByValue CMTime toleranceBefore, @ByValue CMTime toleranceAfter,
            @ObjCBlock(name = "call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler") Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler {
        @Generated
        void call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler(boolean arg0);
    }

    /**
     * seekableTimeRanges</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/seekableTimeRanges">iOS Dev Center</a>
     */
    @Generated
    @Selector("seekableTimeRanges")
    public native NSArray<? extends NSValue> seekableTimeRanges();

    /**
     * seekingWaitsForVideoCompositionRendering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/seekingWaitsForVideoCompositionRendering">iOS Dev Center</a>
     */
    @Generated
    @Selector("seekingWaitsForVideoCompositionRendering")
    public native boolean seekingWaitsForVideoCompositionRendering();

    /**
     * selectMediaOption:inMediaSelectionGroup:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/selectMediaOption:inMediaSelectionGroup:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectMediaOption:inMediaSelectionGroup:")
    public native void selectMediaOptionInMediaSelectionGroup(AVMediaSelectionOption mediaSelectionOption,
            AVMediaSelectionGroup mediaSelectionGroup);

    /**
     * selectMediaOptionAutomaticallyInMediaSelectionGroup:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/selectMediaOptionAutomaticallyInMediaSelectionGroup:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectMediaOptionAutomaticallyInMediaSelectionGroup:")
    public native void selectMediaOptionAutomaticallyInMediaSelectionGroup(AVMediaSelectionGroup mediaSelectionGroup);

    /**
     * selectedMediaOptionInMediaSelectionGroup:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/selectedMediaOptionInMediaSelectionGroup:">iOS Dev Center</a>
     */
    @Generated
    @Selector("selectedMediaOptionInMediaSelectionGroup:")
    public native AVMediaSelectionOption selectedMediaOptionInMediaSelectionGroup(
            AVMediaSelectionGroup mediaSelectionGroup);

    /**
     * audioMix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/audioMix">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAudioMix:")
    public native void setAudioMix(AVAudioMix value);

    /**
     * audioTimePitchAlgorithm</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/audioTimePitchAlgorithm">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(String value);

    /**
     * forwardPlaybackEndTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/forwardPlaybackEndTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setForwardPlaybackEndTime:")
    public native void setForwardPlaybackEndTime(@ByValue CMTime value);

    /**
     * preferredPeakBitRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/preferredPeakBitRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreferredPeakBitRate:")
    public native void setPreferredPeakBitRate(double value);

    /**
     * reversePlaybackEndTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/reversePlaybackEndTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setReversePlaybackEndTime:")
    public native void setReversePlaybackEndTime(@ByValue CMTime value);

    /**
     * seekingWaitsForVideoCompositionRendering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/seekingWaitsForVideoCompositionRendering">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSeekingWaitsForVideoCompositionRendering:")
    public native void setSeekingWaitsForVideoCompositionRendering(boolean value);

    /**
     * textStyleRules</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/textStyleRules">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTextStyleRules:")
    public native void setTextStyleRules(NSArray<? extends AVTextStyleRule> value);

    /**
     * videoComposition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/videoComposition">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition value);

    /**
     * status</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/status">iOS Dev Center</a>
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * stepByCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instm/AVPlayerItem/stepByCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("stepByCount:")
    public native void stepByCount(@NInt long stepCount);

    /**
     * textStyleRules</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/textStyleRules">iOS Dev Center</a>
     */
    @Generated
    @Selector("textStyleRules")
    public native NSArray<? extends AVTextStyleRule> textStyleRules();

    /**
     * timebase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/timebase">iOS Dev Center</a>
     */
    @Generated
    @Selector("timebase")
    public native CMTimebaseRef timebase();

    /**
     * timedMetadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/timedMetadata">iOS Dev Center</a>
     */
    @Generated
    @Selector("timedMetadata")
    public native NSArray<? extends AVMetadataItem> timedMetadata();

    /**
     * tracks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/tracks">iOS Dev Center</a>
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVPlayerItemTrack> tracks();

    /**
     * videoComposition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItem_Class/index.html#//apple_ref/occ/instp/AVPlayerItem/videoComposition">iOS Dev Center</a>
     */
    @Generated
    @Selector("videoComposition")
    public native AVVideoComposition videoComposition();

    @Generated
    @Selector("canUseNetworkResourcesForLiveStreamingWhilePaused")
    public native boolean canUseNetworkResourcesForLiveStreamingWhilePaused();

    @Generated
    @Selector("currentMediaSelection")
    public native AVMediaSelection currentMediaSelection();

    @Generated
    @Selector("setCanUseNetworkResourcesForLiveStreamingWhilePaused:")
    public native void setCanUseNetworkResourcesForLiveStreamingWhilePaused(boolean value);

    @Generated
    @Selector("addMediaDataCollector:")
    public native void addMediaDataCollector(AVPlayerItemMediaDataCollector collector);

    @Generated
    @Selector("mediaDataCollectors")
    public native NSArray<? extends AVPlayerItemMediaDataCollector> mediaDataCollectors();

    @Generated
    @Selector("removeMediaDataCollector:")
    public native void removeMediaDataCollector(AVPlayerItemMediaDataCollector collector);

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
