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
import apple.foundation.NSDictionary;
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
import org.moe.natj.objc.ann.ObjCBlock;
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
public class PHAsset extends PHObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHAsset(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHAsset alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHAsset allocWithZone(VoidPtr zone);

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
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchAssetsInAssetCollection:options:")
    public static native PHFetchResult<? extends PHAsset> fetchAssetsInAssetCollectionOptions(
            @NotNull PHAssetCollection assetCollection, @Nullable PHFetchOptions options);

    /**
     * assetURLs are URLs retrieved from ALAsset's ALAssetPropertyAssetURL
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Will be removed in a future release
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("fetchAssetsWithALAssetURLs:options:")
    public static native PHFetchResult<? extends PHAsset> fetchAssetsWithALAssetURLsOptions(
            @NotNull NSArray<? extends NSURL> assetURLs, @Nullable PHFetchOptions options);

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchAssetsWithBurstIdentifier:options:")
    public static native PHFetchResult<? extends PHAsset> fetchAssetsWithBurstIdentifierOptions(
            @NotNull String burstIdentifier, @Nullable PHFetchOptions options);

    /**
     * includes hidden assets by default
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchAssetsWithLocalIdentifiers:options:")
    public static native PHFetchResult<? extends PHAsset> fetchAssetsWithLocalIdentifiersOptions(
            @NotNull NSArray<String> identifiers, @Nullable PHFetchOptions options);

    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchAssetsWithMediaType:options:")
    public static native PHFetchResult<? extends PHAsset> fetchAssetsWithMediaTypeOptions(@NInt long mediaType,
            @Nullable PHFetchOptions options);

    /**
     * Fetches PHAssetSourceTypeUserLibrary assets by default (use includeAssetSourceTypes option to override)
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("fetchAssetsWithOptions:")
    public static native PHFetchResult<? extends PHAsset> fetchAssetsWithOptions(@Nullable PHFetchOptions options);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("fetchKeyAssetsInAssetCollection:options:")
    public static native PHFetchResult<? extends PHAsset> fetchKeyAssetsInAssetCollectionOptions(
            @NotNull PHAssetCollection assetCollection, @Nullable PHFetchOptions options);

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
    public static native PHAsset new_objc();

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
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("burstIdentifier")
    public native String burstIdentifier();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("burstSelectionTypes")
    @NUInt
    public native long burstSelectionTypes();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("canPerformEditOperation:")
    public native boolean canPerformEditOperation(@NInt long editOperation);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("cancelContentEditingInputRequest:")
    public native void cancelContentEditingInputRequest(@NUInt long requestID);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("init")
    public native PHAsset init();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("isFavorite")
    public native boolean isFavorite();

    /**
     * a hidden asset will be excluded from moment collections, but may still be included in other smart or regular
     * album collections
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("location")
    public native CLLocation location();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("mediaSubtypes")
    @NUInt
    public native long mediaSubtypes();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("mediaType")
    @NInt
    public native long mediaType();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("pixelHeight")
    @NUInt
    public native long pixelHeight();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("pixelWidth")
    @NUInt
    public native long pixelWidth();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("representsBurst")
    public native boolean representsBurst();

    /**
     * Completion and progress handlers are called on an arbitrary serial queue.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("requestContentEditingInputWithOptions:completionHandler:")
    @NUInt
    public native long requestContentEditingInputWithOptionsCompletionHandler(
            @Nullable PHContentEditingInputRequestOptions options,
            @NotNull @ObjCBlock(name = "call_requestContentEditingInputWithOptionsCompletionHandler") Block_requestContentEditingInputWithOptionsCompletionHandler completionHandler);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("sourceType")
    @NUInt
    public native long sourceType();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestContentEditingInputWithOptionsCompletionHandler {
        @Generated
        void call_requestContentEditingInputWithOptionsCompletionHandler(
                @Nullable PHContentEditingInput contentEditingInput, @NotNull NSDictionary<?, ?> info);
    }

    /**
     * Playback style describes how the asset should be presented to the user (regardless of the backing media for that
     * asset). Use this value to choose the type of view and the appropriate APIs on the PHImageManager to display this
     * asset
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("playbackStyle")
    @NInt
    public native long playbackStyle();

    /**
     * only applies to adjusted assets
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("adjustmentFormatIdentifier")
    public native String adjustmentFormatIdentifier();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("hasAdjustments")
    public native boolean hasAdjustments();
}
