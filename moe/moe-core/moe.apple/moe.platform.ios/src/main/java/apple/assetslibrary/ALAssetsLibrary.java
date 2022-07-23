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

@Deprecated
@Generated
@Library("AssetsLibrary")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ALAssetsLibrary extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ALAssetsLibrary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ALAssetsLibrary alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ALAssetsLibrary allocWithZone(VoidPtr zone);

    /**
     * Returns photo data authorization status for this application
     */
    @Generated
    @Deprecated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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
     * Disable retrieval and notifications for Shared Photo Streams
     */
    @Generated
    @Deprecated
    @Selector("disableSharedPhotoStreamsSupport")
    public static native void disableSharedPhotoStreamsSupport();

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
    public static native ALAssetsLibrary new_objc();

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
     * Add a new ALAssetsGroup to the library.
     * The name of the ALAssetsGroup is name and the type is ALAssetsGroupAlbum. The editable property of this
     * ALAssetsGroup returns YES.
     * If name conflicts with another ALAssetsGroup with the same name, then the group is not created and the result
     * block returns a nil group.
     * When the ALAssetsGroup is added, the user may be asked to confirm the application's access to the data. If the
     * user denies access to the application or if no application is allowed to access the data, the failure block will
     * be called.
     * If the data is currently unavailable, the failure block will be called.
     */
    @Generated
    @Deprecated
    @Selector("addAssetsGroupAlbumWithName:resultBlock:failureBlock:")
    public native void addAssetsGroupAlbumWithNameResultBlockFailureBlock(String name,
            @ObjCBlock(name = "call_addAssetsGroupAlbumWithNameResultBlockFailureBlock_1") Block_addAssetsGroupAlbumWithNameResultBlockFailureBlock_1 resultBlock,
            @ObjCBlock(name = "call_addAssetsGroupAlbumWithNameResultBlockFailureBlock_2") Block_addAssetsGroupAlbumWithNameResultBlockFailureBlock_2 failureBlock);

    /**
     * Returns an ALAsset object in the result block for a URL previously retrieved from an ALAsset object.
     * When the ALAsset is requested, the user may be asked to confirm the application's access to the data. If the user
     * denies access to the application or if no application is allowed to access the data, the failure block will be
     * called.
     * If the data is currently unavailable, the failure block will be called.
     */
    @Generated
    @Deprecated
    @Selector("assetForURL:resultBlock:failureBlock:")
    public native void assetForURLResultBlockFailureBlock(NSURL assetURL,
            @ObjCBlock(name = "call_assetForURLResultBlockFailureBlock_1") Block_assetForURLResultBlockFailureBlock_1 resultBlock,
            @ObjCBlock(name = "call_assetForURLResultBlockFailureBlock_2") Block_assetForURLResultBlockFailureBlock_2 failureBlock);

    /**
     * Get the list of groups that match the given types. Multiple types can be ORed together. The results are passed
     * one by one to the caller by executing the enumeration block.
     * When the enumeration is done, 'enumerationBlock' will be called with group set to nil.
     * When groups are enumerated, the user may be asked to confirm the application's access to the data. If the user
     * denies access to the application or if no application is allowed to access the data, the failure block will be
     * called.
     * If the data is currently unavailable, the failure block will be called.
     */
    @Generated
    @Deprecated
    @Selector("enumerateGroupsWithTypes:usingBlock:failureBlock:")
    public native void enumerateGroupsWithTypesUsingBlockFailureBlock(@NUInt long types,
            @ObjCBlock(name = "call_enumerateGroupsWithTypesUsingBlockFailureBlock_1") Block_enumerateGroupsWithTypesUsingBlockFailureBlock_1 enumerationBlock,
            @ObjCBlock(name = "call_enumerateGroupsWithTypesUsingBlockFailureBlock_2") Block_enumerateGroupsWithTypesUsingBlockFailureBlock_2 failureBlock);

    /**
     * Returns an ALAssetsGroup object in the result block for a URL previously retrieved from an ALAssetsGroup object.
     * When the ALAssetsGroup is requested, the user may be asked to confirm the application's access to the data. If
     * the user denies access to the application or if no application is allowed to access the data, the failure block
     * will be called.
     * If the data is currently unavailable, the failure block will be called.
     */
    @Generated
    @Deprecated
    @Selector("groupForURL:resultBlock:failureBlock:")
    public native void groupForURLResultBlockFailureBlock(NSURL groupURL,
            @ObjCBlock(name = "call_groupForURLResultBlockFailureBlock_1") Block_groupForURLResultBlockFailureBlock_1 resultBlock,
            @ObjCBlock(name = "call_groupForURLResultBlockFailureBlock_2") Block_groupForURLResultBlockFailureBlock_2 failureBlock);

    @Generated
    @Selector("init")
    public native ALAssetsLibrary init();

    @Generated
    @Deprecated
    @Selector("videoAtPathIsCompatibleWithSavedPhotosAlbum:")
    public native boolean videoAtPathIsCompatibleWithSavedPhotosAlbum(NSURL videoPathURL);

    /**
     * If there is a conflict between the metadata in the image data and the metadata dictionary, the image data
     * metadata values will be overwritten
     */
    @Generated
    @Deprecated
    @Selector("writeImageDataToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeImageDataToSavedPhotosAlbumMetadataCompletionBlock(NSData imageData,
            NSDictionary<?, ?> metadata,
            @ObjCBlock(name = "call_writeImageDataToSavedPhotosAlbumMetadataCompletionBlock") Block_writeImageDataToSavedPhotosAlbumMetadataCompletionBlock completionBlock);

    /**
     * The API user will have to specify the orientation key in the metadata dictionary to preserve the orientation of
     * the image
     */
    @Generated
    @Deprecated
    @Selector("writeImageToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeImageToSavedPhotosAlbumMetadataCompletionBlock(CGImageRef imageRef,
            NSDictionary<?, ?> metadata,
            @ObjCBlock(name = "call_writeImageToSavedPhotosAlbumMetadataCompletionBlock") Block_writeImageToSavedPhotosAlbumMetadataCompletionBlock completionBlock);

    /**
     * With a UIImage, the API user can use -[UIImage CGImage] to get a CGImageRef, and cast -[UIImage imageOrientation]
     * to ALAssetOrientation.
     */
    @Generated
    @Deprecated
    @Selector("writeImageToSavedPhotosAlbum:orientation:completionBlock:")
    public native void writeImageToSavedPhotosAlbumOrientationCompletionBlock(CGImageRef imageRef,
            @NInt long orientation,
            @ObjCBlock(name = "call_writeImageToSavedPhotosAlbumOrientationCompletionBlock") Block_writeImageToSavedPhotosAlbumOrientationCompletionBlock completionBlock);

    @Generated
    @Deprecated
    @Selector("writeVideoAtPathToSavedPhotosAlbum:completionBlock:")
    public native void writeVideoAtPathToSavedPhotosAlbumCompletionBlock(NSURL videoPathURL,
            @ObjCBlock(name = "call_writeVideoAtPathToSavedPhotosAlbumCompletionBlock") Block_writeVideoAtPathToSavedPhotosAlbumCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAssetsGroupAlbumWithNameResultBlockFailureBlock_1 {
        @Generated
        void call_addAssetsGroupAlbumWithNameResultBlockFailureBlock_1(ALAssetsGroup group);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAssetsGroupAlbumWithNameResultBlockFailureBlock_2 {
        @Generated
        void call_addAssetsGroupAlbumWithNameResultBlockFailureBlock_2(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_assetForURLResultBlockFailureBlock_1 {
        @Generated
        void call_assetForURLResultBlockFailureBlock_1(ALAsset asset);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_assetForURLResultBlockFailureBlock_2 {
        @Generated
        void call_assetForURLResultBlockFailureBlock_2(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateGroupsWithTypesUsingBlockFailureBlock_1 {
        @Generated
        void call_enumerateGroupsWithTypesUsingBlockFailureBlock_1(ALAssetsGroup group, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateGroupsWithTypesUsingBlockFailureBlock_2 {
        @Generated
        void call_enumerateGroupsWithTypesUsingBlockFailureBlock_2(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_groupForURLResultBlockFailureBlock_1 {
        @Generated
        void call_groupForURLResultBlockFailureBlock_1(ALAssetsGroup group);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_groupForURLResultBlockFailureBlock_2 {
        @Generated
        void call_groupForURLResultBlockFailureBlock_2(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeImageDataToSavedPhotosAlbumMetadataCompletionBlock {
        @Generated
        void call_writeImageDataToSavedPhotosAlbumMetadataCompletionBlock(NSURL assetURL, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeImageToSavedPhotosAlbumMetadataCompletionBlock {
        @Generated
        void call_writeImageToSavedPhotosAlbumMetadataCompletionBlock(NSURL assetURL, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeImageToSavedPhotosAlbumOrientationCompletionBlock {
        @Generated
        void call_writeImageToSavedPhotosAlbumOrientationCompletionBlock(NSURL assetURL, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeVideoAtPathToSavedPhotosAlbumCompletionBlock {
        @Generated
        void call_writeVideoAtPathToSavedPhotosAlbumCompletionBlock(NSURL assetURL, NSError error);
    }
}
