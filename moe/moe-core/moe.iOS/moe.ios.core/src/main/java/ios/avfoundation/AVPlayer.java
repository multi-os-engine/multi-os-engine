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

package ios.avfoundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coremedia.opaque.CMClockRef;
import ios.coremedia.struct.CMTime;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import ios.foundation.NSValue;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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

	/**
	 * actionAtItemEnd</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/actionAtItemEnd">iOS Dev Center</a>
	 */
	@Generated
	@Selector("actionAtItemEnd")
	@NInt
	public native long actionAtItemEnd();

	/**
	 * addBoundaryTimeObserverForTimes:queue:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/addBoundaryTimeObserverForTimes:queue:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addBoundaryTimeObserverForTimes:queue:usingBlock:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object addBoundaryTimeObserverForTimesQueueUsingBlock(
			NSArray<? extends NSValue> times,
			NSObject queue,
			@ObjCBlock(name = "call_addBoundaryTimeObserverForTimesQueueUsingBlock") Block_addBoundaryTimeObserverForTimesQueueUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addBoundaryTimeObserverForTimesQueueUsingBlock {
		@Generated
		void call_addBoundaryTimeObserverForTimesQueueUsingBlock();
	}

	/**
	 * addPeriodicTimeObserverForInterval:queue:usingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/addPeriodicTimeObserverForInterval:queue:usingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addPeriodicTimeObserverForInterval:queue:usingBlock:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object addPeriodicTimeObserverForIntervalQueueUsingBlock(
			@ByValue CMTime interval,
			NSObject queue,
			@ObjCBlock(name = "call_addPeriodicTimeObserverForIntervalQueueUsingBlock") Block_addPeriodicTimeObserverForIntervalQueueUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addPeriodicTimeObserverForIntervalQueueUsingBlock {
		@Generated
		void call_addPeriodicTimeObserverForIntervalQueueUsingBlock(
				@ByValue CMTime arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVPlayer alloc();

	/**
	 * allowsAirPlayVideo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/allowsAirPlayVideo">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("allowsAirPlayVideo")
	public native boolean allowsAirPlayVideo();

	/**
	 * allowsExternalPlayback</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/allowsExternalPlayback">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsExternalPlayback")
	public native boolean allowsExternalPlayback();

	/**
	 * appliesMediaSelectionCriteriaAutomatically</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/appliesMediaSelectionCriteriaAutomatically">iOS Dev Center</a>
	 */
	@Generated
	@Selector("appliesMediaSelectionCriteriaAutomatically")
	public native boolean appliesMediaSelectionCriteriaAutomatically();

	/**
	 * cancelPendingPrerolls</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/cancelPendingPrerolls">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelPendingPrerolls")
	public native void cancelPendingPrerolls();

	/**
	 * currentItem</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/currentItem">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentItem")
	public native AVPlayerItem currentItem();

	/**
	 * currentTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/currentTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentTime")
	@ByValue
	public native CMTime currentTime();

	/**
	 * error</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/error">iOS Dev Center</a>
	 */
	@Generated
	@Selector("error")
	public native NSError error();

	/**
	 * externalPlaybackVideoGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/externalPlaybackVideoGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("externalPlaybackVideoGravity")
	public native String externalPlaybackVideoGravity();

	@Generated
	@Selector("init")
	public native AVPlayer init();

	/**
	 * initWithPlayerItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/initWithPlayerItem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPlayerItem:")
	public native AVPlayer initWithPlayerItem(AVPlayerItem item);

	/**
	 * initWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/initWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithURL:")
	public native AVPlayer initWithURL(NSURL URL);

	/**
	 * airPlayVideoActive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/airPlayVideoActive">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("isAirPlayVideoActive")
	public native boolean isAirPlayVideoActive();

	/**
	 * closedCaptionDisplayEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/closedCaptionDisplayEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isClosedCaptionDisplayEnabled")
	public native boolean isClosedCaptionDisplayEnabled();

	/**
	 * externalPlaybackActive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/externalPlaybackActive">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isExternalPlaybackActive")
	public native boolean isExternalPlaybackActive();

	/**
	 * muted</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/muted">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isMuted")
	public native boolean isMuted();

	/**
	 * masterClock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/masterClock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("masterClock")
	public native CMClockRef masterClock();

	/**
	 * mediaSelectionCriteriaForMediaCharacteristic:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/mediaSelectionCriteriaForMediaCharacteristic:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mediaSelectionCriteriaForMediaCharacteristic:")
	public native AVPlayerMediaSelectionCriteria mediaSelectionCriteriaForMediaCharacteristic(
			String mediaCharacteristic);

	/**
	 * outputObscuredDueToInsufficientExternalProtection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/outputObscuredDueToInsufficientExternalProtection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputObscuredDueToInsufficientExternalProtection")
	public native boolean outputObscuredDueToInsufficientExternalProtection();

	/**
	 * pause</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/pause">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pause")
	public native void pause();

	/**
	 * play</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/play">iOS Dev Center</a>
	 */
	@Generated
	@Selector("play")
	public native void play();

	/**
	 * playerWithPlayerItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/clm/AVPlayer/playerWithPlayerItem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playerWithPlayerItem:")
	public static native AVPlayer playerWithPlayerItem(AVPlayerItem item);

	/**
	 * playerWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/clm/AVPlayer/playerWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playerWithURL:")
	public static native AVPlayer playerWithURL(NSURL URL);

	/**
	 * prerollAtRate:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/prerollAtRate:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prerollAtRate:completionHandler:")
	public native void prerollAtRateCompletionHandler(
			float rate,
			@ObjCBlock(name = "call_prerollAtRateCompletionHandler") Block_prerollAtRateCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_prerollAtRateCompletionHandler {
		@Generated
		void call_prerollAtRateCompletionHandler(boolean arg0);
	}

	/**
	 * rate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/rate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rate")
	public native float rate();

	/**
	 * removeTimeObserver:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/removeTimeObserver:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeTimeObserver:")
	public native void removeTimeObserver(
			@Mapped(ObjCObjectMapper.class) Object observer);

	/**
	 * replaceCurrentItemWithPlayerItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/replaceCurrentItemWithPlayerItem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replaceCurrentItemWithPlayerItem:")
	public native void replaceCurrentItemWithPlayerItem(AVPlayerItem item);

	/**
	 * seekToDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/seekToDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekToDate:")
	public native void seekToDate(NSDate date);

	/**
	 * seekToDate:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/seekToDate:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekToDate:completionHandler:")
	public native void seekToDateCompletionHandler(
			NSDate date,
			@ObjCBlock(name = "call_seekToDateCompletionHandler") Block_seekToDateCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_seekToDateCompletionHandler {
		@Generated
		void call_seekToDateCompletionHandler(boolean arg0);
	}

	/**
	 * seekToTime:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/seekToTime:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekToTime:")
	public native void seekToTime(@ByValue CMTime time);

	/**
	 * seekToTime:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/seekToTime:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekToTime:completionHandler:")
	public native void seekToTimeCompletionHandler(
			@ByValue CMTime time,
			@ObjCBlock(name = "call_seekToTimeCompletionHandler") Block_seekToTimeCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_seekToTimeCompletionHandler {
		@Generated
		void call_seekToTimeCompletionHandler(boolean arg0);
	}

	/**
	 * seekToTime:toleranceBefore:toleranceAfter:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/seekToTime:toleranceBefore:toleranceAfter:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekToTime:toleranceBefore:toleranceAfter:")
	public native void seekToTimeToleranceBeforeToleranceAfter(
			@ByValue CMTime time, @ByValue CMTime toleranceBefore,
			@ByValue CMTime toleranceAfter);

	/**
	 * seekToTime:toleranceBefore:toleranceAfter:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/seekToTime:toleranceBefore:toleranceAfter:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekToTime:toleranceBefore:toleranceAfter:completionHandler:")
	public native void seekToTimeToleranceBeforeToleranceAfterCompletionHandler(
			@ByValue CMTime time,
			@ByValue CMTime toleranceBefore,
			@ByValue CMTime toleranceAfter,
			@ObjCBlock(name = "call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler") Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_seekToTimeToleranceBeforeToleranceAfterCompletionHandler {
		@Generated
		void call_seekToTimeToleranceBeforeToleranceAfterCompletionHandler(
				boolean arg0);
	}

	/**
	 * actionAtItemEnd</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/actionAtItemEnd">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActionAtItemEnd:")
	public native void setActionAtItemEnd(@NInt long value);

	/**
	 * allowsAirPlayVideo</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/allowsAirPlayVideo">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setAllowsAirPlayVideo:")
	public native void setAllowsAirPlayVideo(boolean value);

	/**
	 * allowsExternalPlayback</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/allowsExternalPlayback">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsExternalPlayback:")
	public native void setAllowsExternalPlayback(boolean value);

	/**
	 * appliesMediaSelectionCriteriaAutomatically</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/appliesMediaSelectionCriteriaAutomatically">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAppliesMediaSelectionCriteriaAutomatically:")
	public native void setAppliesMediaSelectionCriteriaAutomatically(
			boolean value);

	/**
	 * closedCaptionDisplayEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/closedCaptionDisplayEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setClosedCaptionDisplayEnabled:")
	public native void setClosedCaptionDisplayEnabled(boolean value);

	/**
	 * externalPlaybackVideoGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/externalPlaybackVideoGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setExternalPlaybackVideoGravity:")
	public native void setExternalPlaybackVideoGravity(String value);

	/**
	 * masterClock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/masterClock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMasterClock:")
	public native void setMasterClock(CMClockRef value);

	/**
	 * setMediaSelectionCriteria:forMediaCharacteristic:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/setMediaSelectionCriteria:forMediaCharacteristic:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMediaSelectionCriteria:forMediaCharacteristic:")
	public native void setMediaSelectionCriteriaForMediaCharacteristic(
			AVPlayerMediaSelectionCriteria criteria, String mediaCharacteristic);

	/**
	 * muted</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/muted">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMuted:")
	public native void setMuted(boolean value);

	/**
	 * rate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/rate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRate:")
	public native void setRate(float value);

	/**
	 * setRate:time:atHostTime:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instm/AVPlayer/setRate:time:atHostTime:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRate:time:atHostTime:")
	public native void setRateTimeAtHostTime(float rate,
			@ByValue CMTime itemTime, @ByValue CMTime hostClockTime);

	/**
	 * usesAirPlayVideoWhileAirPlayScreenIsActive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/usesAirPlayVideoWhileAirPlayScreenIsActive">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setUsesAirPlayVideoWhileAirPlayScreenIsActive:")
	public native void setUsesAirPlayVideoWhileAirPlayScreenIsActive(
			boolean value);

	/**
	 * usesExternalPlaybackWhileExternalScreenIsActive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/usesExternalPlaybackWhileExternalScreenIsActive">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUsesExternalPlaybackWhileExternalScreenIsActive:")
	public native void setUsesExternalPlaybackWhileExternalScreenIsActive(
			boolean value);

	/**
	 * volume</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/volume">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVolume:")
	public native void setVolume(float value);

	/**
	 * status</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/status">iOS Dev Center</a>
	 */
	@Generated
	@Selector("status")
	@NInt
	public native long status();

	/**
	 * usesAirPlayVideoWhileAirPlayScreenIsActive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/usesAirPlayVideoWhileAirPlayScreenIsActive">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("usesAirPlayVideoWhileAirPlayScreenIsActive")
	public native boolean usesAirPlayVideoWhileAirPlayScreenIsActive();

	/**
	 * usesExternalPlaybackWhileExternalScreenIsActive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/usesExternalPlaybackWhileExternalScreenIsActive">iOS Dev Center</a>
	 */
	@Generated
	@Selector("usesExternalPlaybackWhileExternalScreenIsActive")
	public native boolean usesExternalPlaybackWhileExternalScreenIsActive();

	/**
	 * volume</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayer_Class/index.html#//apple_ref/occ/instp/AVPlayer/volume">iOS Dev Center</a>
	 */
	@Generated
	@Selector("volume")
	public native float volume();

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
}
