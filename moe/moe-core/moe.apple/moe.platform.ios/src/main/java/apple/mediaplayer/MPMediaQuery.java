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

/**
 * MPMediaQuery represents a collection of items or playlists determined by a chain of MPMediaPredicate objects.
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
    @Generated
    @Selector("albumsQuery")
    public static native MPMediaQuery albumsQuery();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaQuery alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPMediaQuery allocWithZone(VoidPtr zone);

    @Generated
    @Selector("artistsQuery")
    public static native MPMediaQuery artistsQuery();

    @Generated
    @Selector("audiobooksQuery")
    public static native MPMediaQuery audiobooksQuery();

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
    @Selector("compilationsQuery")
    public static native MPMediaQuery compilationsQuery();

    @Generated
    @Selector("composersQuery")
    public static native MPMediaQuery composersQuery();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPMediaQuery new_objc();

    @Generated
    @Selector("playlistsQuery")
    public static native MPMediaQuery playlistsQuery();

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
    public native void addFilterPredicate(MPMediaPredicate predicate);

    @Generated
    @Selector("collectionSections")
    public native NSArray<? extends MPMediaQuerySection> collectionSections();

    /**
     * Returns an array of MPMediaItemCollections matching the query filter predicates. The collections are grouped by the groupingType.
     */
    @Generated
    @Selector("collections")
    public native NSArray<? extends MPMediaItemCollection> collections();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

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
    public native MPMediaQuery initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFilterPredicates:")
    public native MPMediaQuery initWithFilterPredicates(NSSet<? extends MPMediaPredicate> filterPredicates);

    /**
     * Returns an array of MPMediaQuerySection instances representing the section grouping of the query's items or collections.
     * May be nil in cases where no section grouping of the items or collections is appropriate.
     */
    @Generated
    @Selector("itemSections")
    public native NSArray<? extends MPMediaQuerySection> itemSections();

    /**
     * Returns an array of MPMediaItems matching the query filter predicates.
     * If no items match this method returns an empty array, otherwise returns nil if an error prevents the items from being fetched.
     */
    @Generated
    @Selector("items")
    public native NSArray<? extends MPMediaItem> items();

    @Generated
    @Selector("removeFilterPredicate:")
    public native void removeFilterPredicate(MPMediaPredicate predicate);

    @Generated
    @Selector("setFilterPredicates:")
    public native void setFilterPredicates(NSSet<? extends MPMediaPredicate> value);

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
}
