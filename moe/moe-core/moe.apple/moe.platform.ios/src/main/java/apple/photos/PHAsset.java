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
import org.moe.natj.general.ann.MappedReturn;
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
    @Selector("fetchAssetsInAssetCollection:options:")
    public static native PHFetchResult<PHAsset> fetchAssetsInAssetCollectionOptions(PHAssetCollection assetCollection,
            PHFetchOptions options);

    @Generated
    @Selector("fetchAssetsWithALAssetURLs:options:")
    public static native PHFetchResult<PHAsset> fetchAssetsWithALAssetURLsOptions(NSArray<? extends NSURL> assetURLs,
            PHFetchOptions options);

    @Generated
    @Selector("fetchAssetsWithBurstIdentifier:options:")
    public static native PHFetchResult<PHAsset> fetchAssetsWithBurstIdentifierOptions(String burstIdentifier,
            PHFetchOptions options);

    @Generated
    @Selector("fetchAssetsWithLocalIdentifiers:options:")
    public static native PHFetchResult<PHAsset> fetchAssetsWithLocalIdentifiersOptions(NSArray<String> identifiers,
            PHFetchOptions options);

    @Generated
    @Selector("fetchAssetsWithMediaType:options:")
    public static native PHFetchResult<PHAsset> fetchAssetsWithMediaTypeOptions(@NInt long mediaType,
            PHFetchOptions options);

    @Generated
    @Selector("fetchAssetsWithOptions:")
    public static native PHFetchResult<PHAsset> fetchAssetsWithOptions(PHFetchOptions options);

    @Generated
    @Selector("fetchKeyAssetsInAssetCollection:options:")
    public static native PHFetchResult<PHAsset> fetchKeyAssetsInAssetCollectionOptions(
            PHAssetCollection assetCollection, PHFetchOptions options);

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

    @Generated
    @Selector("burstIdentifier")
    public native String burstIdentifier();

    @Generated
    @Selector("burstSelectionTypes")
    @NUInt
    public native long burstSelectionTypes();

    @Generated
    @Selector("canPerformEditOperation:")
    public native boolean canPerformEditOperation(@NInt long editOperation);

    @Generated
    @Selector("cancelContentEditingInputRequest:")
    public native void cancelContentEditingInputRequest(@NUInt long requestID);

    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("init")
    public native PHAsset init();

    @Generated
    @Selector("isFavorite")
    public native boolean isFavorite();

    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    @Generated
    @Selector("location")
    public native CLLocation location();

    @Generated
    @Selector("mediaSubtypes")
    @NUInt
    public native long mediaSubtypes();

    @Generated
    @Selector("mediaType")
    @NInt
    public native long mediaType();

    @Generated
    @Selector("modificationDate")
    public native NSDate modificationDate();

    @Generated
    @Selector("pixelHeight")
    @NUInt
    public native long pixelHeight();

    @Generated
    @Selector("pixelWidth")
    @NUInt
    public native long pixelWidth();

    @Generated
    @Selector("representsBurst")
    public native boolean representsBurst();

    @Generated
    @Selector("requestContentEditingInputWithOptions:completionHandler:")
    @NUInt
    public native long requestContentEditingInputWithOptionsCompletionHandler(
            PHContentEditingInputRequestOptions options,
            @ObjCBlock(name = "call_requestContentEditingInputWithOptionsCompletionHandler") Block_requestContentEditingInputWithOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("sourceType")
    @NUInt
    public native long sourceType();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestContentEditingInputWithOptionsCompletionHandler {
        @Generated
        void call_requestContentEditingInputWithOptionsCompletionHandler(PHContentEditingInput arg0,
                NSDictionary<?, ?> arg1);
    }

    @Generated
    @Selector("playbackStyle")
    @NInt
    public native long playbackStyle();
}
