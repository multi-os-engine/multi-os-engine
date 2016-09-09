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
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coregraphics.struct.CGSize;
import ios.coremedia.struct.CMTime;
import ios.coremedia.struct.CMTimeRange;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMutableComposition extends AVComposition {
	static {
		NatJ.register();
	}

	@Generated
	protected AVMutableComposition(Pointer peer) {
		super(peer);
	}

	/**
	 * addMutableTrackWithMediaType:preferredTrackID:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instm/AVMutableComposition/addMutableTrackWithMediaType:preferredTrackID:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addMutableTrackWithMediaType:preferredTrackID:")
	public native AVMutableCompositionTrack addMutableTrackWithMediaTypePreferredTrackID(
			String mediaType, int preferredTrackID);

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVMutableComposition alloc();

	@Generated
	@Selector("assetWithURL:")
	public static native AVMutableComposition assetWithURL(NSURL URL);

	/**
	 * composition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/clm/AVMutableComposition/composition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("composition")
	public static native AVMutableComposition composition();

	@Generated
	@Selector("init")
	public native AVMutableComposition init();

	/**
	 * insertEmptyTimeRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instm/AVMutableComposition/insertEmptyTimeRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertEmptyTimeRange:")
	public native void insertEmptyTimeRange(@ByValue CMTimeRange timeRange);

	/**
	 * insertTimeRange:ofAsset:atTime:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instm/AVMutableComposition/insertTimeRange:ofAsset:atTime:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertTimeRange:ofAsset:atTime:error:")
	public native boolean insertTimeRangeOfAssetAtTimeError(
			@ByValue CMTimeRange timeRange, AVAsset asset,
			@ByValue CMTime startTime, Ptr<NSError> outError);

	/**
	 * mutableTrackCompatibleWithTrack:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instm/AVMutableComposition/mutableTrackCompatibleWithTrack:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mutableTrackCompatibleWithTrack:")
	public native AVMutableCompositionTrack mutableTrackCompatibleWithTrack(
			AVAssetTrack track);

	/**
	 * naturalSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instp/AVMutableComposition/naturalSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("naturalSize")
	@ByValue
	public native CGSize naturalSize();

	/**
	 * removeTimeRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instm/AVMutableComposition/removeTimeRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeTimeRange:")
	public native void removeTimeRange(@ByValue CMTimeRange timeRange);

	/**
	 * removeTrack:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instm/AVMutableComposition/removeTrack:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeTrack:")
	public native void removeTrack(AVCompositionTrack track);

	/**
	 * scaleTimeRange:toDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instm/AVMutableComposition/scaleTimeRange:toDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scaleTimeRange:toDuration:")
	public native void scaleTimeRangeToDuration(@ByValue CMTimeRange timeRange,
			@ByValue CMTime duration);

	/**
	 * naturalSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instp/AVMutableComposition/naturalSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNaturalSize:")
	public native void setNaturalSize(@ByValue CGSize value);

	/**
	 * tracks</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVMutableComposition_Class/index.html#//apple_ref/occ/instp/AVMutableComposition/tracks">iOS Dev Center</a>
	 */
	@Generated
	@Selector("tracks")
	public native NSArray<? extends AVMutableCompositionTrack> tracks();

	@Generated
	@Selector("compositionWithURLAssetInitializationOptions:")
	public static native AVMutableComposition compositionWithURLAssetInitializationOptions(
			NSDictionary<String, ?> URLAssetInitializationOptions);

	@Generated
	@Selector("trackWithTrackID:")
	public native AVMutableCompositionTrack trackWithTrackID(int trackID);

	@Generated
	@Selector("tracksWithMediaCharacteristic:")
	public native NSArray<? extends AVMutableCompositionTrack> tracksWithMediaCharacteristic(String mediaCharacteristic);

	@Generated
	@Selector("tracksWithMediaType:")
	public native NSArray<? extends AVMutableCompositionTrack> tracksWithMediaType(String mediaType);

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
	public static native long version();
}
