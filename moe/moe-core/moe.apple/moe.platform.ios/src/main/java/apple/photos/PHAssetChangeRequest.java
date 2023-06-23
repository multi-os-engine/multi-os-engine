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
import apple.foundation.protocol.NSFastEnumeration;
import apple.uikit.UIImage;
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
 * PHAssetChangeRequest can only be created or used within a -[PHPhotoLibrary performChanges:] or -[PHPhotoLibrary
 * performChangesAndWait:] block.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHAssetChangeRequest extends PHChangeRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected PHAssetChangeRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHAssetChangeRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHAssetChangeRequest allocWithZone(VoidPtr zone);

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

    /**
     * if the asset does not allow the type of change requested, these methods will raise an exception, call
     * canPerformEditOperation: on the asset to determine if the type of edit operation is allowed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("changeRequestForAsset:")
    public static native PHAssetChangeRequest changeRequestForAsset(@NotNull PHAsset asset);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Basic asset creation. For finer-grained control, see PHAssetCreationRequest.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("creationRequestForAssetFromImage:")
    public static native PHAssetChangeRequest creationRequestForAssetFromImage(@NotNull UIImage image);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("creationRequestForAssetFromImageAtFileURL:")
    public static native PHAssetChangeRequest creationRequestForAssetFromImageAtFileURL(@NotNull NSURL fileURL);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("creationRequestForAssetFromVideoAtFileURL:")
    public static native PHAssetChangeRequest creationRequestForAssetFromVideoAtFileURL(@NotNull NSURL fileURL);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("deleteAssets:")
    public static native void deleteAssets(@NotNull @Mapped(ObjCObjectMapper.class) NSFastEnumeration assets);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PHAssetChangeRequest new_objc();

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
    @Selector("contentEditingOutput")
    public native PHContentEditingOutput contentEditingOutput();

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("creationDate")
    public native NSDate creationDate();

    @Generated
    @Selector("init")
    public native PHAssetChangeRequest init();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("isFavorite")
    public native boolean isFavorite();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setFavorite:")
    public native void setFavorite(boolean value);

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
     * a hidden asset will be excluded from moment collections, but may still be included in other smart or regular
     * album collections
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("location")
    public native CLLocation location();

    /**
     * This can be used to fetch the newly created asset after the change block has completed by using -localIdentifier
     * It can also be added directly to collections within the current change block
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("placeholderForCreatedAsset")
    public native PHObjectPlaceholder placeholderForCreatedAsset();

    /**
     * Reverting requires that all original resources are downloaded to the device first and this must be performed
     * manually by the client if the original resources aren't already local.
     * Use PHAssetResourceManager to ensure that original asset content is downloaded to the current device before
     * making this request.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("revertAssetContentToOriginal")
    public native void revertAssetContentToOriginal();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setContentEditingOutput:")
    public native void setContentEditingOutput(@Nullable PHContentEditingOutput value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setCreationDate:")
    public native void setCreationDate(@Nullable NSDate value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLocation:")
    public native void setLocation(@Nullable CLLocation value);
}
