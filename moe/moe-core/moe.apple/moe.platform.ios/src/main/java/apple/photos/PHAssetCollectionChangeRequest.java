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
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSFastEnumeration;
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
 * PHAssetCollectionChangeRequest can only be created or used within a -[PHPhotoLibrary performChanges:] or
 * -[PHPhotoLibrary performChangesAndWait:] block.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Photos")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PHAssetCollectionChangeRequest extends PHChangeRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected PHAssetCollectionChangeRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHAssetCollectionChangeRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PHAssetCollectionChangeRequest allocWithZone(VoidPtr zone);

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

    /**
     * if the asset collection does not allow the type of change requested, these methods will raise an exception, call
     * canPerformEditOperation: on the asset collection to determine if the type of edit operation is allowed.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("changeRequestForAssetCollection:")
    public static native PHAssetCollectionChangeRequest changeRequestForAssetCollection(
            PHAssetCollection assetCollection);

    /**
     * to add, remove or rearrange assets in a collection, passing in the fetched assets in that collection will ensure
     * that the asset positions are tracked correctly in the case that the collection has been externally edited after
     * the fetch, but before this change is applied
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("changeRequestForAssetCollection:assets:")
    public static native PHAssetCollectionChangeRequest changeRequestForAssetCollectionAssets(
            PHAssetCollection assetCollection, PHFetchResult<? extends PHAsset> assets);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("creationRequestForAssetCollectionWithTitle:")
    public static native PHAssetCollectionChangeRequest creationRequestForAssetCollectionWithTitle(String title);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * requests that the specified asset collections be deleted
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("deleteAssetCollections:")
    public static native void deleteAssetCollections(
            @Mapped(ObjCObjectMapper.class) NSFastEnumeration assetCollections);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native PHAssetCollectionChangeRequest new_objc();

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
    @Generated
    @Selector("addAssets:")
    public native void addAssets(@Mapped(ObjCObjectMapper.class) NSFastEnumeration assets);

    @Generated
    @Selector("init")
    public native PHAssetCollectionChangeRequest init();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("insertAssets:atIndexes:")
    public native void insertAssetsAtIndexes(@Mapped(ObjCObjectMapper.class) NSFastEnumeration assets,
            NSIndexSet indexes);

    /**
     * The move removes the assets at fromIndexes first then inserts those assets at the toIndex, so toIndex should
     * point to a location based on the updated indexes after having removed the assets at fromIndexes
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("moveAssetsAtIndexes:toIndex:")
    public native void moveAssetsAtIndexesToIndex(NSIndexSet fromIndexes, @NUInt long toIndex);

    /**
     * This can be used to fetch the newly created asset collection after the change block has completed by using
     * -localIdentifier
     * It can also be added directly to collection lists within the current change block
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("placeholderForCreatedAssetCollection")
    public native PHObjectPlaceholder placeholderForCreatedAssetCollection();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("removeAssets:")
    public native void removeAssets(@Mapped(ObjCObjectMapper.class) NSFastEnumeration assets);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("removeAssetsAtIndexes:")
    public native void removeAssetsAtIndexes(NSIndexSet indexes);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("replaceAssetsAtIndexes:withAssets:")
    public native void replaceAssetsAtIndexesWithAssets(NSIndexSet indexes,
            @Mapped(ObjCObjectMapper.class) NSFastEnumeration assets);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("title")
    public native String title();
}
