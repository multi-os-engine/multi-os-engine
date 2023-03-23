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
import apple.corelocation.CLLocation;
import apple.foundation.NSArray;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHAssetCollection extends PHCollection {
    static {
        NatJ.register();
    }

    @Generated
    protected PHAssetCollection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHAssetCollection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHAssetCollection allocWithZone(VoidPtr zone);

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

    /**
     * Smart Albums are not supported, only Albums and Moments
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("fetchAssetCollectionsContainingAsset:withType:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchAssetCollectionsContainingAssetWithTypeOptions(
            PHAsset asset, @NInt long type, PHFetchOptions options);

    /**
     * assetGroupURLs are URLs retrieved from ALAssetGroup's ALAssetsGroupPropertyURL
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Will be removed in a future release
     */
    @Deprecated
    @Generated
    @Selector("fetchAssetCollectionsWithALAssetGroupURLs:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchAssetCollectionsWithALAssetGroupURLsOptions(
            NSArray<? extends NSURL> assetGroupURLs, PHFetchOptions options);

    /**
     * Fetch asset collections of a single type matching the provided local identifiers (type is inferred from the local
     * identifiers)
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("fetchAssetCollectionsWithLocalIdentifiers:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchAssetCollectionsWithLocalIdentifiersOptions(
            NSArray<String> identifiers, PHFetchOptions options);

    /**
     * Fetch asset collections of a single type and subtype provided (use PHAssetCollectionSubtypeAny to match all
     * subtypes)
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("fetchAssetCollectionsWithType:subtype:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchAssetCollectionsWithTypeSubtypeOptions(
            @NInt long type, @NInt long subtype, PHFetchOptions options);

    @Generated
    @Selector("fetchCollectionsInCollectionList:options:")
    public static native PHFetchResult<? extends PHCollection> fetchCollectionsInCollectionListOptions(
            PHCollectionList collectionList, PHFetchOptions options);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Will be removed in a future release
     */
    @Deprecated
    @Generated
    @Selector("fetchMomentsInMomentList:options:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchMomentsInMomentListOptions(
            PHCollectionList momentList, PHFetchOptions options);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Will be removed in a future release
     */
    @Deprecated
    @Generated
    @Selector("fetchMomentsWithOptions:")
    public static native PHFetchResult<? extends PHAssetCollection> fetchMomentsWithOptions(PHFetchOptions options);

    @Generated
    @Selector("fetchTopLevelUserCollectionsWithOptions:")
    public static native PHFetchResult<? extends PHCollection> fetchTopLevelUserCollectionsWithOptions(
            PHFetchOptions options);

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
    public static native PHAssetCollection new_objc();

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
     * API-Since: 8.0
     */
    @Generated
    @Selector("transientAssetCollectionWithAssetFetchResult:title:")
    public static native PHAssetCollection transientAssetCollectionWithAssetFetchResultTitle(
            PHFetchResult<? extends PHAsset> fetchResult, String title);

    /**
     * These asset collections are only in-memory and are not persisted to disk
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("transientAssetCollectionWithAssets:title:")
    public static native PHAssetCollection transientAssetCollectionWithAssetsTitle(NSArray<? extends PHAsset> assets,
            String title);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("approximateLocation")
    public native CLLocation approximateLocation();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("assetCollectionSubtype")
    @NInt
    public native long assetCollectionSubtype();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("assetCollectionType")
    @NInt
    public native long assetCollectionType();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    /**
     * These counts are just estimates; the actual count of objects returned from a fetch should be used if you care
     * about accuracy. Returns NSNotFound if a count cannot be quickly returned.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("estimatedAssetCount")
    @NUInt
    public native long estimatedAssetCount();

    @Generated
    @Selector("init")
    public native PHAssetCollection init();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("localizedLocationNames")
    public native NSArray<String> localizedLocationNames();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();
}
