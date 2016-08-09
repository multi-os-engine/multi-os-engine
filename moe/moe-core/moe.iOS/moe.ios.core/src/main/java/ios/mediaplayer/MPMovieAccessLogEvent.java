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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSDate;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMovieAccessLogEvent extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected MPMovieAccessLogEvent(Pointer peer) {
		super(peer);
	}

	/**
	 * URI</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/URI">iOS Dev Center</a>
	 */
	@Generated
	@Selector("URI")
	public native String URI();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPMovieAccessLogEvent alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * durationWatched</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/durationWatched">iOS Dev Center</a>
	 */
	@Generated
	@Selector("durationWatched")
	public native double durationWatched();

	/**
	 * indicatedBitrate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/indicatedBitrate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("indicatedBitrate")
	public native double indicatedBitrate();

	@Generated
	@Selector("init")
	public native MPMovieAccessLogEvent init();

	/**
	 * numberOfBytesTransferred</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/numberOfBytesTransferred">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfBytesTransferred")
	public native long numberOfBytesTransferred();

	/**
	 * numberOfDroppedVideoFrames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/numberOfDroppedVideoFrames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfDroppedVideoFrames")
	@NInt
	public native long numberOfDroppedVideoFrames();

	/**
	 * numberOfSegmentsDownloaded</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/numberOfSegmentsDownloaded">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfSegmentsDownloaded")
	@NUInt
	public native long numberOfSegmentsDownloaded();

	/**
	 * numberOfServerAddressChanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/numberOfServerAddressChanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfServerAddressChanges")
	@NUInt
	public native long numberOfServerAddressChanges();

	/**
	 * numberOfStalls</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/numberOfStalls">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfStalls")
	@NInt
	public native long numberOfStalls();

	/**
	 * observedBitrate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/observedBitrate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("observedBitrate")
	public native double observedBitrate();

	/**
	 * playbackSessionID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/playbackSessionID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playbackSessionID")
	public native String playbackSessionID();

	/**
	 * playbackStartDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/playbackStartDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playbackStartDate")
	public native NSDate playbackStartDate();

	/**
	 * playbackStartOffset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/playbackStartOffset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("playbackStartOffset")
	public native double playbackStartOffset();

	/**
	 * segmentsDownloadedDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/segmentsDownloadedDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("segmentsDownloadedDuration")
	public native double segmentsDownloadedDuration();

	/**
	 * serverAddress</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMovieAccessLogEvent_Class/index.html#//apple_ref/occ/instp/MPMovieAccessLogEvent/serverAddress">iOS Dev Center</a>
	 */
	@Generated
	@Selector("serverAddress")
	public native String serverAddress();

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
