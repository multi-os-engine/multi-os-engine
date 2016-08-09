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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.corelocation.CLLocation;
import ios.foundation.NSArray;
import ios.foundation.NSDate;
import ios.foundation.NSDictionary;
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
public class PHAsset extends PHObject {
	static {
		NatJ.register();
	}

	@Generated
	protected PHAsset(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native PHAsset alloc();

	/**
	 * burstIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/burstIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("burstIdentifier")
	public native String burstIdentifier();

	/**
	 * burstSelectionTypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/burstSelectionTypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("burstSelectionTypes")
	@NUInt
	public native long burstSelectionTypes();

	/**
	 * canPerformEditOperation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instm/PHAsset/canPerformEditOperation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("canPerformEditOperation:")
	public native boolean canPerformEditOperation(@NInt long editOperation);

	/**
	 * cancelContentEditingInputRequest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instm/PHAsset/cancelContentEditingInputRequest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelContentEditingInputRequest:")
	public native void cancelContentEditingInputRequest(@NUInt long requestID);

	/**
	 * creationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/creationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("creationDate")
	public native NSDate creationDate();

	/**
	 * duration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/duration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("duration")
	public native double duration();

	/**
	 * fetchAssetsInAssetCollection:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/clm/PHAsset/fetchAssetsInAssetCollection:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetsInAssetCollection:options:")
	public static native PHFetchResult<PHAsset> fetchAssetsInAssetCollectionOptions(
			PHAssetCollection assetCollection, PHFetchOptions options);

	/**
	 * fetchAssetsWithALAssetURLs:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/clm/PHAsset/fetchAssetsWithALAssetURLs:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetsWithALAssetURLs:options:")
	public static native PHFetchResult<PHAsset> fetchAssetsWithALAssetURLsOptions(
			NSArray<? extends NSURL> assetURLs, PHFetchOptions options);

	/**
	 * fetchAssetsWithBurstIdentifier:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/clm/PHAsset/fetchAssetsWithBurstIdentifier:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetsWithBurstIdentifier:options:")
	public static native PHFetchResult<PHAsset> fetchAssetsWithBurstIdentifierOptions(
			String burstIdentifier, PHFetchOptions options);

	/**
	 * fetchAssetsWithLocalIdentifiers:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/clm/PHAsset/fetchAssetsWithLocalIdentifiers:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetsWithLocalIdentifiers:options:")
	public static native PHFetchResult<PHAsset> fetchAssetsWithLocalIdentifiersOptions(
			NSArray<String> identifiers, PHFetchOptions options);

	/**
	 * fetchAssetsWithMediaType:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/clm/PHAsset/fetchAssetsWithMediaType:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetsWithMediaType:options:")
	public static native PHFetchResult<PHAsset> fetchAssetsWithMediaTypeOptions(
			@NInt long mediaType, PHFetchOptions options);

	/**
	 * fetchAssetsWithOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/clm/PHAsset/fetchAssetsWithOptions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchAssetsWithOptions:")
	public static native PHFetchResult<PHAsset> fetchAssetsWithOptions(
			PHFetchOptions options);

	/**
	 * fetchKeyAssetsInAssetCollection:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/clm/PHAsset/fetchKeyAssetsInAssetCollection:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fetchKeyAssetsInAssetCollection:options:")
	public static native PHFetchResult<PHAsset> fetchKeyAssetsInAssetCollectionOptions(
			PHAssetCollection assetCollection, PHFetchOptions options);

	@Generated
	@Selector("init")
	public native PHAsset init();

	/**
	 * favorite</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/favorite">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isFavorite")
	public native boolean isFavorite();

	/**
	 * hidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/hidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	/**
	 * location</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/location">iOS Dev Center</a>
	 */
	@Generated
	@Selector("location")
	public native CLLocation location();

	/**
	 * mediaSubtypes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/mediaSubtypes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mediaSubtypes")
	@NUInt
	public native long mediaSubtypes();

	/**
	 * mediaType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/mediaType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mediaType")
	@NInt
	public native long mediaType();

	/**
	 * modificationDate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/modificationDate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("modificationDate")
	public native NSDate modificationDate();

	/**
	 * pixelHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/pixelHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pixelHeight")
	@NUInt
	public native long pixelHeight();

	/**
	 * pixelWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/pixelWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pixelWidth")
	@NUInt
	public native long pixelWidth();

	/**
	 * representsBurst</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/representsBurst">iOS Dev Center</a>
	 */
	@Generated
	@Selector("representsBurst")
	public native boolean representsBurst();

	/**
	 * requestContentEditingInputWithOptions:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instm/PHAsset/requestContentEditingInputWithOptions:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestContentEditingInputWithOptions:completionHandler:")
	@NUInt
	public native long requestContentEditingInputWithOptionsCompletionHandler(
			PHContentEditingInputRequestOptions options,
			@ObjCBlock(name = "call_requestContentEditingInputWithOptionsCompletionHandler") Block_requestContentEditingInputWithOptionsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_requestContentEditingInputWithOptionsCompletionHandler {
		@Generated
		void call_requestContentEditingInputWithOptionsCompletionHandler(
				PHContentEditingInput arg0, NSDictionary<?, ?> arg1);
	}

	/**
	 * sourceType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHAsset_Class/index.html#//apple_ref/occ/instp/PHAsset/sourceType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sourceType")
	@NUInt
	public native long sourceType();

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
