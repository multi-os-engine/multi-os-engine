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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSCoder;
import ios.foundation.NSDate;
import ios.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMediaItem extends MPMediaEntity {
	static {
		NatJ.register();
	}

	@Generated
	protected MPMediaItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("albumArtist")
	public native String albumArtist();

	@Generated
	@Selector("albumArtistPersistentID")
	public native long albumArtistPersistentID();

	@Generated
	@Selector("albumPersistentID")
	public native long albumPersistentID();

	@Generated
	@Selector("albumTitle")
	public native String albumTitle();

	@Generated
	@Selector("albumTrackCount")
	@NUInt
	public native long albumTrackCount();

	@Generated
	@Selector("albumTrackNumber")
	@NUInt
	public native long albumTrackNumber();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPMediaItem alloc();

	@Generated
	@Selector("artist")
	public native String artist();

	@Generated
	@Selector("artistPersistentID")
	public native long artistPersistentID();

	@Generated
	@Selector("artwork")
	public native MPMediaItemArtwork artwork();

	@Generated
	@Selector("assetURL")
	public native NSURL assetURL();

	@Generated
	@Selector("beatsPerMinute")
	@NUInt
	public native long beatsPerMinute();

	@Generated
	@Selector("bookmarkTime")
	public native double bookmarkTime();

	@Generated
	@Selector("comments")
	public native String comments();

	@Generated
	@Selector("composer")
	public native String composer();

	@Generated
	@Selector("composerPersistentID")
	public native long composerPersistentID();

	@Generated
	@Selector("discCount")
	@NUInt
	public native long discCount();

	@Generated
	@Selector("discNumber")
	@NUInt
	public native long discNumber();

	@Generated
	@Selector("genre")
	public native String genre();

	@Generated
	@Selector("genrePersistentID")
	public native long genrePersistentID();

	@Generated
	@Selector("init")
	public native MPMediaItem init();

	@Generated
	@Selector("isCloudItem")
	public native boolean isCloudItem();

	@Generated
	@Selector("isCompilation")
	public native boolean isCompilation();

	@Generated
	@Selector("lastPlayedDate")
	public native NSDate lastPlayedDate();

	@Generated
	@Selector("lyrics")
	public native String lyrics();

	@Generated
	@Selector("mediaType")
	@NUInt
	public native long mediaType();

	@Generated
	@Selector("persistentID")
	public native long persistentID();

	/**
	 * persistentIDPropertyForGroupingType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaItem_ClassReference/index.html#//apple_ref/occ/clm/MPMediaItem/persistentIDPropertyForGroupingType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("persistentIDPropertyForGroupingType:")
	public static native String persistentIDPropertyForGroupingType(
			@NInt long groupingType);

	@Generated
	@Selector("playCount")
	@NUInt
	public native long playCount();

	@Generated
	@Selector("playbackDuration")
	public native double playbackDuration();

	@Generated
	@Selector("podcastPersistentID")
	public native long podcastPersistentID();

	@Generated
	@Selector("podcastTitle")
	public native String podcastTitle();

	@Generated
	@Selector("rating")
	@NUInt
	public native long rating();

	@Generated
	@Selector("releaseDate")
	public native NSDate releaseDate();

	@Generated
	@Selector("skipCount")
	@NUInt
	public native long skipCount();

	@Generated
	@Selector("title")
	public native String title();

	/**
	 * titlePropertyForGroupingType:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaItem_ClassReference/index.html#//apple_ref/occ/clm/MPMediaItem/titlePropertyForGroupingType:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("titlePropertyForGroupingType:")
	public static native String titlePropertyForGroupingType(
			@NInt long groupingType);

	@Generated
	@Selector("userGrouping")
	public native String userGrouping();

	@Generated
	@Selector("initWithCoder:")
	public native MPMediaItem initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("hasProtectedAsset")
	public native boolean hasProtectedAsset();

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
	@Selector("canFilterByProperty:")
	public static native boolean canFilterByProperty(String property);

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
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
