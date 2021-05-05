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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPContentItem represents high-level metadata for a particular media item for
 * representation outside the client application. Examples of media items that a
 * developer might want to represent include song files, streaming audio URLs,
 * or radio stations.
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPContentItem extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPContentItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPContentItem alloc();

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

    /**
     * Artwork for this item. Examples of artwork for a content item are the album
     * cover for a song, or a movie poster for a movie.
     */
    @Generated
    @Selector("artwork")
    public native MPMediaItemArtwork artwork();

    /**
     * A unique identifier for this content item. (Required)
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native MPContentItem init();

    /**
     * Designated initializer. A unique identifier is required to identify the item
     * for later use.
     */
    @Generated
    @Selector("initWithIdentifier:")
    public native MPContentItem initWithIdentifier(String identifier);

    /**
     * Represents whether the content item is a container that may contain other
     * content items, e.g. an album or a playlist.
     */
    @Generated
    @Selector("isContainer")
    public native boolean isContainer();

    /**
     * Represents whether the content item is a container that may contain other
     * content items, e.g. an album or a playlist.
     */
    @Generated
    @Selector("setContainer:")
    public native void setContainer(boolean value);

    /**
     * Represents whether this content item is explicit content
     */
    @Generated
    @Selector("isExplicitContent")
    public native boolean isExplicitContent();

    /**
     * Represents whether this content item is explicit content
     */
    @Generated
    @Selector("setExplicitContent:")
    public native void setExplicitContent(boolean value);

    /**
     * Represents whether the content item is actionable from a playback
     * perspective. Albums are playable, for example, because selecting an album
     * for playback means the app should play each song in the album in order. An
     * example of a content item that may not be playable is a genre, since an app
     * experience typically doesn't involve selecting an entire genre for playback.
     */
    @Generated
    @Selector("isPlayable")
    public native boolean isPlayable();

    /**
     * Represents whether the content item is actionable from a playback
     * perspective. Albums are playable, for example, because selecting an album
     * for playback means the app should play each song in the album in order. An
     * example of a content item that may not be playable is a genre, since an app
     * experience typically doesn't involve selecting an entire genre for playback.
     */
    @Generated
    @Selector("setPlayable:")
    public native void setPlayable(boolean value);

    /**
     * Represents whether this content item is streaming content, i.e. from the cloud
     * where the content is not stored locally.
     */
    @Generated
    @Selector("isStreamingContent")
    public native boolean isStreamingContent();

    /**
     * Represents whether this content item is streaming content, i.e. from the cloud
     * where the content is not stored locally.
     */
    @Generated
    @Selector("setStreamingContent:")
    public native void setStreamingContent(boolean value);

    /**
     * Represents the current playback progress of the item.
     * 0.0 = not watched/listened/viewed, 1.0 = fully watched/listened/viewed
     * Default is -1.0 (no progress indicator shown)
     */
    @Generated
    @Selector("playbackProgress")
    public native float playbackProgress();

    /**
     * Artwork for this item. Examples of artwork for a content item are the album
     * cover for a song, or a movie poster for a movie.
     */
    @Generated
    @Selector("setArtwork:")
    public native void setArtwork(MPMediaItemArtwork value);

    /**
     * Represents the current playback progress of the item.
     * 0.0 = not watched/listened/viewed, 1.0 = fully watched/listened/viewed
     * Default is -1.0 (no progress indicator shown)
     */
    @Generated
    @Selector("setPlaybackProgress:")
    public native void setPlaybackProgress(float value);

    /**
     * A subtitle for this item. If this were representing a song, this would
     * usually be the artist or composer.
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    /**
     * A title for this item. Usually this would be the track name, if representing
     * a song, the episode name of a podcast, etc.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * A subtitle for this item. If this were representing a song, this would
     * usually be the artist or composer.
     */
    @Generated
    @Selector("subtitle")
    public native String subtitle();

    /**
     * A title for this item. Usually this would be the track name, if representing
     * a song, the episode name of a podcast, etc.
     */
    @Generated
    @Selector("title")
    public native String title();
}
