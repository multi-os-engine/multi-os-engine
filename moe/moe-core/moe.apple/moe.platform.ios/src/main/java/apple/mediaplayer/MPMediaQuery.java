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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPMediaQuery represents a collection of items or playlists determined by a chain of MPMediaPredicate objects.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMediaQuery extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPMediaQuery(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Base queries which can be used directly or as the basis for custom queries.
     * The groupingType for these queries is preset to the appropriate type for the query.
     */
    @NotNull
    @Generated
    @Selector("albumsQuery")
    public static native MPMediaQuery albumsQuery();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaQuery alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPMediaQuery allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("artistsQuery")
    public static native MPMediaQuery artistsQuery();

    @NotNull
    @Generated
    @Selector("audiobooksQuery")
    public static native MPMediaQuery audiobooksQuery();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    @NotNull
    @Generated
    @Selector("compilationsQuery")
    public static native MPMediaQuery compilationsQuery();

    @NotNull
    @Generated
    @Selector("composersQuery")
    public static native MPMediaQuery composersQuery();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("genresQuery")
    public static native MPMediaQuery genresQuery();

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
    public static native MPMediaQuery new_objc();

    @NotNull
    @Generated
    @Selector("playlistsQuery")
    public static native MPMediaQuery playlistsQuery();

    @NotNull
    @Generated
    @Selector("podcastsQuery")
    public static native MPMediaQuery podcastsQuery();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @NotNull
    @Generated
    @Selector("songsQuery")
    public static native MPMediaQuery songsQuery();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addFilterPredicate:")
    public native void addFilterPredicate(@NotNull MPMediaPredicate predicate);

    /**
     * API-Since: 4.2
     */
    @Nullable
    @Generated
    @Selector("collectionSections")
    public native NSArray<? extends MPMediaQuerySection> collectionSections();

    /**
     * Returns an array of MPMediaItemCollections matching the query filter predicates. The collections are grouped by
     * the groupingType.
     */
    @Nullable
    @Generated
    @Selector("collections")
    public native NSArray<? extends MPMediaItemCollection> collections();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Nullable
    @Generated
    @Selector("filterPredicates")
    public native NSSet<? extends MPMediaPredicate> filterPredicates();

    /**
     * The property used to group collections, defaults to MPMediaGroupingTitle.
     */
    @Generated
    @Selector("groupingType")
    @NInt
    public native long groupingType();

    @Generated
    @Selector("init")
    public native MPMediaQuery init();

    @Generated
    @Selector("initWithCoder:")
    public native MPMediaQuery initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFilterPredicates:")
    public native MPMediaQuery initWithFilterPredicates(@Nullable NSSet<? extends MPMediaPredicate> filterPredicates);

    /**
     * Returns an array of MPMediaQuerySection instances representing the section grouping of the query's items or
     * collections.
     * May be nil in cases where no section grouping of the items or collections is appropriate.
     * 
     * API-Since: 4.2
     */
    @Nullable
    @Generated
    @Selector("itemSections")
    public native NSArray<? extends MPMediaQuerySection> itemSections();

    /**
     * Returns an array of MPMediaItems matching the query filter predicates.
     * If no items match this method returns an empty array, otherwise returns nil if an error prevents the items from
     * being fetched.
     */
    @Nullable
    @Generated
    @Selector("items")
    public native NSArray<? extends MPMediaItem> items();

    @Generated
    @Selector("removeFilterPredicate:")
    public native void removeFilterPredicate(@NotNull MPMediaPredicate predicate);

    @Generated
    @Selector("setFilterPredicates:")
    public native void setFilterPredicates(@Nullable NSSet<? extends MPMediaPredicate> value);

    /**
     * The property used to group collections, defaults to MPMediaGroupingTitle.
     */
    @Generated
    @Selector("setGroupingType:")
    public native void setGroupingType(@NInt long value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
