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
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An MPMediaItem represents a single piece of media in an MPMediaLibrary.
 * Media items have a unique identifier which persists across application launches.
 * 
 * API-Since: 3.0
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMediaItem allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("canFilterByProperty:")
    public static native boolean canFilterByProperty(@NotNull String property);

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
    public static native MPMediaItem new_objc();

    /**
     * Returns the item property for a given grouping type.
     * For example, [MPMediaItem persistentIDPropertyForGroupingType:MPMediaGroupingAlbum] returns
     * MPMediaItemPropertyAlbumPersistentID.
     * 
     * API-Since: 4.2
     */
    @NotNull
    @Generated
    @Selector("persistentIDPropertyForGroupingType:")
    public static native String persistentIDPropertyForGroupingType(@NInt long groupingType);

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

    /**
     * Returns the item property to determine a title for a given grouping type.
     * For example, [MPMediaItem titlePropertyForGroupingType:MPMediaGroupingAlbum] returns
     * MPMediaItemPropertyAlbumTitle.
     * Note that distinct collections will not necessarily have unique titles, e.g. an album may exist with the title
     * "Greatest Hits" for multiple artists.
     * 
     * API-Since: 4.2
     */
    @NotNull
    @Generated
    @Selector("titlePropertyForGroupingType:")
    public static native String titlePropertyForGroupingType(@NInt long groupingType);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("albumArtist")
    public native String albumArtist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("albumArtistPersistentID")
    public native long albumArtistPersistentID();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("albumPersistentID")
    public native long albumPersistentID();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("albumTitle")
    public native String albumTitle();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("albumTrackCount")
    @NUInt
    public native long albumTrackCount();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("albumTrackNumber")
    @NUInt
    public native long albumTrackNumber();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("artist")
    public native String artist();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("artistPersistentID")
    public native long artistPersistentID();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("artwork")
    public native MPMediaItemArtwork artwork();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("assetURL")
    public native NSURL assetURL();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("beatsPerMinute")
    @NUInt
    public native long beatsPerMinute();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("bookmarkTime")
    public native double bookmarkTime();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("comments")
    public native String comments();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("composer")
    public native String composer();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("composerPersistentID")
    public native long composerPersistentID();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("dateAdded")
    public native NSDate dateAdded();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("discCount")
    @NUInt
    public native long discCount();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("discNumber")
    @NUInt
    public native long discNumber();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("genre")
    public native String genre();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("genrePersistentID")
    public native long genrePersistentID();

    /**
     * API-Since: 9.2
     */
    @Generated
    @Selector("hasProtectedAsset")
    public native boolean hasProtectedAsset();

    @Generated
    @Selector("init")
    public native MPMediaItem init();

    @Generated
    @Selector("initWithCoder:")
    public native MPMediaItem initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("isCloudItem")
    public native boolean isCloudItem();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("isCompilation")
    public native boolean isCompilation();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("isExplicitItem")
    public native boolean isExplicitItem();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("lastPlayedDate")
    public native NSDate lastPlayedDate();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("lyrics")
    public native String lyrics();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("mediaType")
    @NUInt
    public native long mediaType();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("persistentID")
    public native long persistentID();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("playCount")
    @NUInt
    public native long playCount();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("playbackDuration")
    public native double playbackDuration();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("podcastPersistentID")
    public native long podcastPersistentID();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("podcastTitle")
    public native String podcastTitle();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("rating")
    @NUInt
    public native long rating();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("releaseDate")
    public native NSDate releaseDate();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("skipCount")
    @NUInt
    public native long skipCount();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("userGrouping")
    public native String userGrouping();

    /**
     * API-Since: 10.3
     */
    @NotNull
    @Generated
    @Selector("playbackStoreID")
    public native String playbackStoreID();

    /**
     * API-Since: 10.3
     */
    @Generated
    @Selector("isPreorder")
    public native boolean isPreorder();
}
