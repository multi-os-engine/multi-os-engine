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

package apple.photos;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHCollectionList extends PHCollection {
    static {
        NatJ.register();
    }

    @Generated
    protected PHCollectionList(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHCollectionList alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHCollectionList allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A PHAssetCollectionTypeMoment will be contained by a PHCollectionListSubtypeMomentListCluster and a
     * PHCollectionListSubtypeMomentListYear
     * Non-moment PHAssetCollections will only be contained by a single collection list
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchCollectionListsContainingCollection:options:")
    public static native PHFetchResult<? extends PHCollectionList> fetchCollectionListsContainingCollectionOptions(
            @NotNull PHCollection collection, @Nullable PHFetchOptions options);

    /**
     * Fetch collection lists of a single type matching the provided local identifiers (type is inferred from the local
     * identifiers)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchCollectionListsWithLocalIdentifiers:options:")
    public static native PHFetchResult<? extends PHCollectionList> fetchCollectionListsWithLocalIdentifiersOptions(
            @NotNull NSArray<String> identifiers, @Nullable PHFetchOptions options);

    /**
     * Fetch asset collections of a single type and subtype provided (use PHCollectionListSubtypeAny to match all
     * subtypes)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchCollectionListsWithType:subtype:options:")
    public static native PHFetchResult<? extends PHCollectionList> fetchCollectionListsWithTypeSubtypeOptions(
            @NInt long collectionListType, @NInt long subtype, @Nullable PHFetchOptions options);

    @NotNull
    @Generated
    @Selector("fetchCollectionsInCollectionList:options:")
    public static native PHFetchResult<? extends PHCollection> fetchCollectionsInCollectionListOptions(
            @NotNull PHCollectionList collectionList, @Nullable PHFetchOptions options);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Will be removed in a future release
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("fetchMomentListsWithSubtype:containingMoment:options:")
    public static native PHFetchResult<? extends PHCollectionList> fetchMomentListsWithSubtypeContainingMomentOptions(
            @NInt long momentListSubtype, @NotNull PHAssetCollection moment, @Nullable PHFetchOptions options);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Will be removed in a future release
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("fetchMomentListsWithSubtype:options:")
    public static native PHFetchResult<? extends PHCollectionList> fetchMomentListsWithSubtypeOptions(
            @NInt long momentListSubtype, @Nullable PHFetchOptions options);

    @NotNull
    @Generated
    @Selector("fetchTopLevelUserCollectionsWithOptions:")
    public static native PHFetchResult<? extends PHCollection> fetchTopLevelUserCollectionsWithOptions(
            @Nullable PHFetchOptions options);

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
    public static native PHCollectionList new_objc();

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

    /**
     * These collection lists are only in-memory and are not persisted to disk
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("transientCollectionListWithCollections:title:")
    public static native PHCollectionList transientCollectionListWithCollectionsTitle(
            @NotNull NSArray<? extends PHCollection> collections, @Nullable String title);

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("transientCollectionListWithCollectionsFetchResult:title:")
    public static native PHCollectionList transientCollectionListWithCollectionsFetchResultTitle(
            @NotNull PHFetchResult<? extends PHCollection> fetchResult, @Nullable String title);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("collectionListSubtype")
    @NInt
    public native long collectionListSubtype();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("collectionListType")
    @NInt
    public native long collectionListType();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    @Generated
    @Selector("init")
    public native PHCollectionList init();

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("localizedLocationNames")
    public native NSArray<String> localizedLocationNames();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
