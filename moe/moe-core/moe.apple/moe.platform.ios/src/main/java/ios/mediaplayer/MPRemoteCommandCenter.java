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

package ios.mediaplayer;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native MPRemoteCommandCenter alloc();

	/**
	 * bookmarkCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/bookmarkCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bookmarkCommand")
	public native MPFeedbackCommand bookmarkCommand();

	/**
	 * changePlaybackRateCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/changePlaybackRateCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("changePlaybackRateCommand")
	public native MPChangePlaybackRateCommand changePlaybackRateCommand();

	/**
	 * dislikeCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/dislikeCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dislikeCommand")
	public native MPFeedbackCommand dislikeCommand();

	@Generated
	@Selector("init")
	public native MPRemoteCommandCenter init();

	/**
	 * likeCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/likeCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("likeCommand")
	public native MPFeedbackCommand likeCommand();

	/**
	 * nextTrackCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/nextTrackCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nextTrackCommand")
	public native MPRemoteCommand nextTrackCommand();

	/**
	 * pauseCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/pauseCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pauseCommand")
	public native MPRemoteCommand pauseCommand();

	/**
	 * playCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/playCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playCommand")
	public native MPRemoteCommand playCommand();

	/**
	 * previousTrackCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/previousTrackCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("previousTrackCommand")
	public native MPRemoteCommand previousTrackCommand();

	/**
	 * ratingCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/ratingCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ratingCommand")
	public native MPRatingCommand ratingCommand();

	/**
	 * seekBackwardCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/seekBackwardCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekBackwardCommand")
	public native MPRemoteCommand seekBackwardCommand();

	/**
	 * seekForwardCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/seekForwardCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekForwardCommand")
	public native MPRemoteCommand seekForwardCommand();

	/**
	 * sharedCommandCenter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/clm/MPRemoteCommandCenter/sharedCommandCenter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sharedCommandCenter")
	public static native MPRemoteCommandCenter sharedCommandCenter();

	/**
	 * skipBackwardCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/skipBackwardCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("skipBackwardCommand")
	public native MPSkipIntervalCommand skipBackwardCommand();

	/**
	 * skipForwardCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/skipForwardCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("skipForwardCommand")
	public native MPSkipIntervalCommand skipForwardCommand();

	/**
	 * stopCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/stopCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopCommand")
	public native MPRemoteCommand stopCommand();

	/**
	 * togglePlayPauseCommand</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPRemoteCommandCenter_Ref/index.html#//apple_ref/occ/instp/MPRemoteCommandCenter/togglePlayPauseCommand">iOS Dev Center</a>
	 */
	@Generated
	@Selector("togglePlayPauseCommand")
	public native MPRemoteCommand togglePlayPauseCommand();

	@Generated
	@Selector("disableLanguageOptionCommand")
	public native MPRemoteCommand disableLanguageOptionCommand();

	@Generated
	@Selector("enableLanguageOptionCommand")
	public native MPRemoteCommand enableLanguageOptionCommand();

	@Generated
	@Selector("changePlaybackPositionCommand")
	public native MPChangePlaybackPositionCommand changePlaybackPositionCommand();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
