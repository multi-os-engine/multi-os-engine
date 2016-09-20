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

    /**
     * albumsQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/albumsQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("albumsQuery")
    public static native MPMediaQuery albumsQuery();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPMediaQuery alloc();

    /**
     * artistsQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/artistsQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("artistsQuery")
    public static native MPMediaQuery artistsQuery();

    /**
     * audiobooksQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/audiobooksQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("audiobooksQuery")
    public static native MPMediaQuery audiobooksQuery();

    /**
     * compilationsQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/compilationsQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("compilationsQuery")
    public static native MPMediaQuery compilationsQuery();

    /**
     * composersQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/composersQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("composersQuery")
    public static native MPMediaQuery composersQuery();

    /**
     * genresQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/genresQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("genresQuery")
    public static native MPMediaQuery genresQuery();

    /**
     * playlistsQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/playlistsQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("playlistsQuery")
    public static native MPMediaQuery playlistsQuery();

    /**
     * podcastsQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/podcastsQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("podcastsQuery")
    public static native MPMediaQuery podcastsQuery();

    /**
     * songsQuery</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/clm/MPMediaQuery/songsQuery">iOS Dev Center</a>
     */
    @Generated
    @Selector("songsQuery")
    public static native MPMediaQuery songsQuery();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
    @Selector("initialize")
    public static native void initialize();

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

    /**
     * addFilterPredicate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instm/MPMediaQuery/addFilterPredicate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addFilterPredicate:")
    public native void addFilterPredicate(MPMediaPredicate predicate);

    /**
     * collectionSections</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instp/MPMediaQuery/collectionSections">iOS Dev Center</a>
     */
    @Generated
    @Selector("collectionSections")
    public native NSArray<? extends MPMediaQuerySection> collectionSections();

    /**
     * collections</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instp/MPMediaQuery/collections">iOS Dev Center</a>
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
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * filterPredicates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instp/MPMediaQuery/filterPredicates">iOS Dev Center</a>
     */
    @Generated
    @Selector("filterPredicates")
    public native NSSet<? extends MPMediaPredicate> filterPredicates();

    /**
     * groupingType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instp/MPMediaQuery/groupingType">iOS Dev Center</a>
     */
    @Generated
    @Selector("groupingType")
    @NInt
    public native long groupingType();

    /**
     * init</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instm/MPMediaQuery/init">iOS Dev Center</a>
     */
    @Generated
    @Selector("init")
    public native MPMediaQuery init();

    @Generated
    @Selector("initWithCoder:")
    public native MPMediaQuery initWithCoder(NSCoder aDecoder);

    /**
     * initWithFilterPredicates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instm/MPMediaQuery/initWithFilterPredicates:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFilterPredicates:")
    public native MPMediaQuery initWithFilterPredicates(NSSet<? extends MPMediaPredicate> filterPredicates);

    /**
     * itemSections</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instp/MPMediaQuery/itemSections">iOS Dev Center</a>
     */
    @Generated
    @Selector("itemSections")
    public native NSArray<? extends MPMediaQuerySection> itemSections();

    /**
     * items</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instp/MPMediaQuery/items">iOS Dev Center</a>
     */
    @Generated
    @Selector("items")
    public native NSArray<? extends MPMediaItem> items();

    /**
     * removeFilterPredicate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instm/MPMediaQuery/removeFilterPredicate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFilterPredicate:")
    public native void removeFilterPredicate(MPMediaPredicate predicate);

    /**
     * filterPredicates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instp/MPMediaQuery/filterPredicates">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFilterPredicates:")
    public native void setFilterPredicates(NSSet<? extends MPMediaPredicate> value);

    /**
     * groupingType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaQuery_ClassReference/index.html#//apple_ref/occ/instp/MPMediaQuery/groupingType">iOS Dev Center</a>
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
