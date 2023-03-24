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
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 4.0
 * Deprecated-Since: 9.0
 * Deprecated-Message: Use PHAsset from the Photos framework instead
 */
@Deprecated
@Generated
@Library("AssetsLibrary")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ALAsset extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ALAsset(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ALAsset alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ALAsset allocWithZone(VoidPtr zone);

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
    public static native ALAsset new_objc();

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
     * Returns a CGImage with an aspect ratio thumbnail of the asset. The size of the thumbnail is the appropriate size
     * for the platform. The thumbnail will be in the correct orientation.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the PHImageContentMode options to request thumbnail aspect ratio in PHImageRequestOptions
     * with the PHImageManager
     */
    @Generated
    @Deprecated
    @Selector("aspectRatioThumbnail")
    public native CGImageRef aspectRatioThumbnail();

    /**
     * Returns an ALAssetRepresentation object for the default representation of the ALAsset
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHImageRequestOptions with the PHImageManager from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("defaultRepresentation")
    public native ALAssetRepresentation defaultRepresentation();

    @Generated
    @Selector("init")
    public native ALAsset init();

    /**
     * Returns YES if the application is able to edit the asset. Returns NO if the application is not able to edit the
     * asset.
     * Applications are only allowed to edit assets that they originally wrote.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use canPerformEditOperation: on a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("isEditable")
    public native boolean isEditable();

    /**
     * Returns the original asset if the caller was saved as a modified version of an asset.
     * Returns nil if the caller was not saved as a modified version of an asset.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the PHImageRequestOptionsVersionOriginal or PHImageRequestOptionsVersionUnadjusted option
     * in PHImageRequestOptions with the PHImageManager from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("originalAsset")
    public native ALAsset originalAsset();

    /**
     * Returns an ALAssetRepresentation object for the given representation UTI. If the ALAsset does not
     * support the representation, nil is returned.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHImageRequestOptions with the PHImageManager from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("representationForUTI:")
    public native ALAssetRepresentation representationForUTI(String representationUTI);

    /**
     * Replaces the image data in the calling asset with the supplied image data.
     * The caller should check the editable property of the asset to see if it is possible to replace the image data.
     * If the application is able to edit the asset, the completion block will return the same assetURL as the calling
     * asset, since a new asset is not being created.
     * If the application is not able to edit the asset, the completion block will return a nil assetURL and an
     * ALAssetsLibraryWriteFailedError.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use contentEditingOutput on a PHAssetChangeRequest from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("setImageData:metadata:completionBlock:")
    public native void setImageDataMetadataCompletionBlock(NSData imageData, NSDictionary<?, ?> metadata,
            @ObjCBlock(name = "call_setImageDataMetadataCompletionBlock") Block_setImageDataMetadataCompletionBlock completionBlock);

    /**
     * Replaces the video data in the calling asset with the video at the specified path.
     * The caller should check the editable property of the asset to see if it is possible to replace the video data.
     * If the application is able to edit the asset, the completion block will return the same assetURL as the calling
     * asset, since a new asset is not being created.
     * If the application is not able to edit the asset (see the editable property on ALAsset), the completion block
     * will return a nil assetURL and an ALAssetsLibraryWriteFailedError.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use contentEditingOutput on a PHAssetChangeRequest from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("setVideoAtPath:completionBlock:")
    public native void setVideoAtPathCompletionBlock(NSURL videoPathURL,
            @ObjCBlock(name = "call_setVideoAtPathCompletionBlock") Block_setVideoAtPathCompletionBlock completionBlock);

    /**
     * Returns a CGImage with a square thumbnail of the asset. The size of the thumbnail is the appropriate size for the
     * platform. The thumbnail will be in the correct orientation.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use requestImageForAsset:targetSize:contentMode:options:resultHandler: on PHImageManager to
     * request a thumbnail sized image for a PHAsset from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("thumbnail")
    public native CGImageRef thumbnail();

    /**
     * Returns the value for a given property (as defined above). Calling it with an invalid property returns a
     * ALErrorInvalidProperty error.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAsset class properties from the Photos framework instead
     */
    @Generated
    @Deprecated
    @Selector("valueForProperty:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForProperty(String property);

    /**
     * Saves image data to the saved photos album as a new ALAsset that is considered a modified version of the calling
     * ALAsset.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use creationRequestForAssetFromImage: on PHAssetChangeRequest from the Photos framework to
     * create a new asset instead
     */
    @Generated
    @Deprecated
    @Selector("writeModifiedImageDataToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock(NSData imageData,
            NSDictionary<?, ?> metadata,
            @ObjCBlock(name = "call_writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock") Block_writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock completionBlock);

    /**
     * Saves the video at the specified path to the saved photos album as a new ALAsset that is considered a modified
     * version of the calling ALAsset.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use creationRequestForAssetFromVideoAtFileURL: on PHAssetChangeRequest from the Photos
     * framework to create a new asset instead
     */
    @Generated
    @Deprecated
    @Selector("writeModifiedVideoAtPathToSavedPhotosAlbum:completionBlock:")
    public native void writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock(NSURL videoPathURL,
            @ObjCBlock(name = "call_writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock") Block_writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImageDataMetadataCompletionBlock {
        @Generated
        void call_setImageDataMetadataCompletionBlock(NSURL assetURL, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setVideoAtPathCompletionBlock {
        @Generated
        void call_setVideoAtPathCompletionBlock(NSURL assetURL, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock {
        @Generated
        void call_writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock(NSURL assetURL, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock {
        @Generated
        void call_writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock(NSURL assetURL, NSError error);
    }
}
