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

package ios.photos;


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

import ios.corelocation.CLLocation;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native PHAssetCollection alloc();

	/**
	 * approximateLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/instp/PHAssetCollection/approximateLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("approximateLocation")
	public native CLLocation approximateLocation();

	/**
	 * assetCollectionSubtype</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/instp/PHAssetCollection/assetCollectionSubtype">iOS Dev Center</a>
	 */
	@Generated
	@Selector("assetCollectionSubtype")
	@NInt
	public native long assetCollectionSubtype();

	/**
	 * assetCollectionType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/instp/PHAssetCollection/assetCollectionType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("assetCollectionType")
	@NInt
	public native long assetCollectionType();

	/**
	 * endDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/instp/PHAssetCollection/endDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("endDate")
	public native NSDate endDate();

	/**
	 * estimatedAssetCount</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/instp/PHAssetCollection/estimatedAssetCount">iOS Dev Center</a>
	 */
	@Generated
	@Selector("estimatedAssetCount")
	@NUInt
	public native long estimatedAssetCount();

	/**
	 * fetchAssetCollectionsContainingAsset:withType:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/clm/PHAssetCollection/fetchAssetCollectionsContainingAsset:withType:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetCollectionsContainingAsset:withType:options:")
	public static native PHFetchResult<PHAssetCollection> fetchAssetCollectionsContainingAssetWithTypeOptions(
			PHAsset asset, @NInt long type, PHFetchOptions options);

	/**
	 * fetchAssetCollectionsWithALAssetGroupURLs:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/clm/PHAssetCollection/fetchAssetCollectionsWithALAssetGroupURLs:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetCollectionsWithALAssetGroupURLs:options:")
	public static native PHFetchResult<PHAssetCollection> fetchAssetCollectionsWithALAssetGroupURLsOptions(
			NSArray<? extends NSURL> assetGroupURLs, PHFetchOptions options);

	/**
	 * fetchAssetCollectionsWithLocalIdentifiers:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/clm/PHAssetCollection/fetchAssetCollectionsWithLocalIdentifiers:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetCollectionsWithLocalIdentifiers:options:")
	public static native PHFetchResult<PHAssetCollection> fetchAssetCollectionsWithLocalIdentifiersOptions(
			NSArray<String> identifiers, PHFetchOptions options);

	/**
	 * fetchAssetCollectionsWithType:subtype:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/clm/PHAssetCollection/fetchAssetCollectionsWithType:subtype:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetCollectionsWithType:subtype:options:")
	public static native PHFetchResult<PHAssetCollection> fetchAssetCollectionsWithTypeSubtypeOptions(
			@NInt long type, @NInt long subtype, PHFetchOptions options);

	/**
	 * fetchMomentsInMomentList:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/clm/PHAssetCollection/fetchMomentsInMomentList:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchMomentsInMomentList:options:")
	public static native PHFetchResult<PHAssetCollection> fetchMomentsInMomentListOptions(
			PHCollectionList momentList, PHFetchOptions options);

	/**
	 * fetchMomentsWithOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/clm/PHAssetCollection/fetchMomentsWithOptions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchMomentsWithOptions:")
	public static native PHFetchResult<PHAssetCollection> fetchMomentsWithOptions(
			PHFetchOptions options);

	@Generated
	@Selector("init")
	public native PHAssetCollection init();

	/**
	 * localizedLocationNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/instp/PHAssetCollection/localizedLocationNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("localizedLocationNames")
	public native NSArray<String> localizedLocationNames();

	/**
	 * startDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/instp/PHAssetCollection/startDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startDate")
	public native NSDate startDate();

	/**
	 * transientAssetCollectionWithAssetFetchResult:title:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/clm/PHAssetCollection/transientAssetCollectionWithAssetFetchResult:title:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transientAssetCollectionWithAssetFetchResult:title:")
	public static native PHAssetCollection transientAssetCollectionWithAssetFetchResultTitle(
			PHFetchResult<PHAsset> fetchResult, String title);

	/**
	 * transientAssetCollectionWithAssets:title:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAssetCollection_Class/index.html#//apple_ref/occ/clm/PHAssetCollection/transientAssetCollectionWithAssets:title:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transientAssetCollectionWithAssets:title:")
	public static native PHAssetCollection transientAssetCollectionWithAssetsTitle(
			NSArray<? extends PHAsset> assets, String title);

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
	@Selector("fetchCollectionsInCollectionList:options:")
	public static native PHFetchResult<PHCollection> fetchCollectionsInCollectionListOptions(
			PHCollectionList collectionList, PHFetchOptions options);

	@Generated
	@Selector("fetchTopLevelUserCollectionsWithOptions:")
	public static native PHFetchResult<PHCollection> fetchTopLevelUserCollectionsWithOptions(
			PHFetchOptions options);

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
	public static native long version_static();
}
