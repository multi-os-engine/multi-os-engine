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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.avfoundation.protocol.AVAsynchronousKeyValueLoading;
import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGSize;
import ios.coremedia.struct.CMTime;
import ios.coremedia.struct.CMTimeRange;
import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAssetTrack extends NSObject implements NSCopying,
		AVAsynchronousKeyValueLoading {
	static {
		NatJ.register();
	}

	@Generated
	protected AVAssetTrack(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native AVAssetTrack alloc();

	/**
	 * asset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/asset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("asset")
	public native AVAsset asset();

	/**
	 * associatedTracksOfType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instm/AVAssetTrack/associatedTracksOfType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("associatedTracksOfType:")
	public native NSArray<? extends AVAssetTrack> associatedTracksOfType(String trackAssociationType);

	/**
	 * availableMetadataFormats</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/availableMetadataFormats">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableMetadataFormats")
	public native NSArray<String> availableMetadataFormats();

	/**
	 * availableTrackAssociationTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/availableTrackAssociationTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableTrackAssociationTypes")
	public native NSArray<String> availableTrackAssociationTypes();

	/**
	 * commonMetadata</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/commonMetadata">iOS Dev Center</a>
	 */
	@Generated
	@Selector("commonMetadata")
	public native NSArray<? extends AVMetadataItem> commonMetadata();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * estimatedDataRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/estimatedDataRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("estimatedDataRate")
	public native float estimatedDataRate();

	/**
	 * extendedLanguageTag</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/extendedLanguageTag">iOS Dev Center</a>
	 */
	@Generated
	@Selector("extendedLanguageTag")
	public native String extendedLanguageTag();

	/**
	 * formatDescriptions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/formatDescriptions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("formatDescriptions")
	public native NSArray<?> formatDescriptions();

	/**
	 * hasMediaCharacteristic:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instm/AVAssetTrack/hasMediaCharacteristic:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasMediaCharacteristic:")
	public native boolean hasMediaCharacteristic(String mediaCharacteristic);

	@Generated
	@Selector("init")
	public native AVAssetTrack init();

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	/**
	 * playable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/playable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPlayable")
	public native boolean isPlayable();

	/**
	 * selfContained</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/selfContained">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isSelfContained")
	public native boolean isSelfContained();

	/**
	 * languageCode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/languageCode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("languageCode")
	public native String languageCode();

	@Generated
	@Selector("loadValuesAsynchronouslyForKeys:completionHandler:")
	public native void loadValuesAsynchronouslyForKeysCompletionHandler(
			NSArray<String> keys,
			@ObjCBlock(name = "call_loadValuesAsynchronouslyForKeysCompletionHandler") AVAsynchronousKeyValueLoading.Block_loadValuesAsynchronouslyForKeysCompletionHandler handler);

	/**
	 * mediaType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/mediaType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mediaType")
	public native String mediaType();

	/**
	 * metadata</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/metadata">iOS Dev Center</a>
	 */
	@Generated
	@Selector("metadata")
	public native NSArray<? extends AVMetadataItem> metadata();

	/**
	 * metadataForFormat:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instm/AVAssetTrack/metadataForFormat:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("metadataForFormat:")
	public native NSArray<? extends AVMetadataItem> metadataForFormat(String format);

	/**
	 * minFrameDuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/minFrameDuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minFrameDuration")
	@ByValue
	public native CMTime minFrameDuration();

	/**
	 * naturalSize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/naturalSize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("naturalSize")
	@ByValue
	public native CGSize naturalSize();

	/**
	 * naturalTimeScale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/naturalTimeScale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("naturalTimeScale")
	public native int naturalTimeScale();

	/**
	 * nominalFrameRate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/nominalFrameRate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nominalFrameRate")
	public native float nominalFrameRate();

	/**
	 * preferredTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/preferredTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredTransform")
	@ByValue
	public native CGAffineTransform preferredTransform();

	/**
	 * preferredVolume</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/preferredVolume">iOS Dev Center</a>
	 */
	@Generated
	@Selector("preferredVolume")
	public native float preferredVolume();

	/**
	 * requiresFrameReordering</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/requiresFrameReordering">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requiresFrameReordering")
	public native boolean requiresFrameReordering();

	/**
	 * samplePresentationTimeForTrackTime:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instm/AVAssetTrack/samplePresentationTimeForTrackTime:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("samplePresentationTimeForTrackTime:")
	@ByValue
	public native CMTime samplePresentationTimeForTrackTime(
			@ByValue CMTime trackTime);

	/**
	 * segmentForTrackTime:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instm/AVAssetTrack/segmentForTrackTime:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("segmentForTrackTime:")
	public native AVAssetTrackSegment segmentForTrackTime(
			@ByValue CMTime trackTime);

	/**
	 * segments</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/segments">iOS Dev Center</a>
	 */
	@Generated
	@Selector("segments")
	public native NSArray<? extends AVAssetTrackSegment> segments();

	@Generated
	@Selector("statusOfValueForKey:error:")
	@NInt
	public native long statusOfValueForKeyError(String key,
			Ptr<NSError> outError);

	/**
	 * timeRange</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/timeRange">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeRange")
	@ByValue
	public native CMTimeRange timeRange();

	/**
	 * totalSampleDataLength</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/totalSampleDataLength">iOS Dev Center</a>
	 */
	@Generated
	@Selector("totalSampleDataLength")
	public native long totalSampleDataLength();

	/**
	 * trackID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAssetTrack_Class/index.html#//apple_ref/occ/instp/AVAssetTrack/trackID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("trackID")
	public native int trackID();

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
