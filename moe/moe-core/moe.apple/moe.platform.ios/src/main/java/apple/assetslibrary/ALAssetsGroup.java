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

package apple.assetslibrary;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ptr.BoolPtr;
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
 * API-Since: 4.0
 * Deprecated-Since: 9.0
 * Deprecated-Message: Use PHAssetCollection from the Photos framework instead
 */
@Deprecated
@Generated
@Library("AssetsLibrary")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ALAssetsGroup extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ALAssetsGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ALAssetsGroup alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ALAssetsGroup allocWithZone(VoidPtr zone);

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
    public static native ALAssetsGroup new_objc();

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
     * Add an existing ALAsset to the group. An asset can belong to multiple ALAssetsGroups.
     * The caller should check the editable property of the group to see if it is possible to add an asset to the group.
     * Returns YES if the asset was added successfully. Returns NO if the group is not editable, or if the asset was not
     * able to be added to the group.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use addAssets: on a PHAssetCollectionChangeRequest: created from a PHAssetCollection in the
     * Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("addAsset:")
    public native boolean addAsset(ALAsset asset);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the PHFetchResult returned by fetchAssetsInAssetCollection:options: on PHAsset to
     * enumerate the assets in an asset collection from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("enumerateAssetsAtIndexes:options:usingBlock:")
    public native void enumerateAssetsAtIndexesOptionsUsingBlock(NSIndexSet indexSet, @NUInt long options,
            @ObjCBlock(name = "call_enumerateAssetsAtIndexesOptionsUsingBlock") Block_enumerateAssetsAtIndexesOptionsUsingBlock enumerationBlock);

    /**
     * These methods are used to retrieve the assets that match the filter.
     * The caller can specify which results are returned using an NSIndexSet. The index set's count or lastIndex cannot
     * exceed -numberOfAssets.
     * 'enumerationBlock' is used to pass back results to the caller and provide the opportunity to stop the filter.
     * When the enumeration is done, 'enumerationBlock' will be called with result set to nil and index set to
     * NSNotFound.
     * If the application has not been granted access to the data, 'enumerationBlock' will be called with result set to
     * nil, index set to NSNotFound, and stop set to YES.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the PHFetchResult returned by fetchAssetsInAssetCollection:options: on PHAsset to
     * enumerate the assets in an asset collection from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("enumerateAssetsUsingBlock:")
    public native void enumerateAssetsUsingBlock(
            @ObjCBlock(name = "call_enumerateAssetsUsingBlock") Block_enumerateAssetsUsingBlock enumerationBlock);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the PHFetchResult returned by fetchAssetsInAssetCollection:options: on PHAsset to
     * enumerate the assets in an asset collection from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("enumerateAssetsWithOptions:usingBlock:")
    public native void enumerateAssetsWithOptionsUsingBlock(@NUInt long options,
            @ObjCBlock(name = "call_enumerateAssetsWithOptionsUsingBlock") Block_enumerateAssetsWithOptionsUsingBlock enumerationBlock);

    @Generated
    @Selector("init")
    public native ALAssetsGroup init();

    /**
     * Returns YES if the application is able to edit the group. Returns NO if the application is not able to edit the
     * group.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use canPerformEditOperation: on a PHAssetCollection from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("isEditable")
    public native boolean isEditable();

    /**
     * Get the number of assets in the group that match the filter.
     * If no filter is set, it returns the count of all assets in the group.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the estimatedAssetCount on PHAssetCollection for a quick estimate of the total assets in
     * a collection (or fetch the assets to get an exact value) from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("numberOfAssets")
    @NInt
    public native long numberOfAssets();

    /**
     * Returns a CGImage of the poster photo for the group. The thumbnail will be in the correct orientation.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use fetchKeyAssetsInAssetCollection:options: on PHAsset, then use the PHImageManager to
     * request image data for key assets in the asset collection from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("posterImage")
    public native CGImageRef posterImage();

    /**
     * Set the ALAssetsFilter on the group to filter the group contents. This does not execute the filter.
     * For that, -enumerateAssetsUsingBlock:doneBlock: or -numberOfAssets needs to be called.
     * If no filter is set, the enumeration will return all the assets in the group.
     * Only one filter is active at a time. Calling this method again resets the filter and does not affect any
     * enumeration that may be in flight.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use fetchAssetsInAssetCollection:options: on PHAsset with a predicate in the PHFetchOptions
     * from the Photos framework to filter the assets in an asset collection instead
     */
    @Generated
    @Deprecated
    @Selector("setAssetsFilter:")
    public native void setAssetsFilter(ALAssetsFilter filter);

    /**
     * Use this method to get information about the group.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the class properties on a PHAssetCollection in the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("valueForProperty:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForProperty(String property);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAssetsAtIndexesOptionsUsingBlock {
        @Generated
        void call_enumerateAssetsAtIndexesOptionsUsingBlock(ALAsset result, @NUInt long index, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAssetsUsingBlock {
        @Generated
        void call_enumerateAssetsUsingBlock(ALAsset result, @NUInt long index, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAssetsWithOptionsUsingBlock {
        @Generated
        void call_enumerateAssetsWithOptionsUsingBlock(ALAsset result, @NUInt long index, BoolPtr stop);
    }
}
