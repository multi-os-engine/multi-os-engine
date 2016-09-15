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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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

    /**
     * addAssetsGroupAlbumWithName:resultBlock:failureBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/addAssetsGroupAlbumWithName:resultBlock:failureBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("addAssetsGroupAlbumWithName:resultBlock:failureBlock:")
    public native void addAssetsGroupAlbumWithNameResultBlockFailureBlock(String name,
            @ObjCBlock(name = "call_addAssetsGroupAlbumWithNameResultBlockFailureBlock_1") Block_addAssetsGroupAlbumWithNameResultBlockFailureBlock_1 resultBlock,
            @ObjCBlock(name = "call_addAssetsGroupAlbumWithNameResultBlockFailureBlock_2") Block_addAssetsGroupAlbumWithNameResultBlockFailureBlock_2 failureBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAssetsGroupAlbumWithNameResultBlockFailureBlock_1 {
        @Generated
        void call_addAssetsGroupAlbumWithNameResultBlockFailureBlock_1(ALAssetsGroup arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addAssetsGroupAlbumWithNameResultBlockFailureBlock_2 {
        @Generated
        void call_addAssetsGroupAlbumWithNameResultBlockFailureBlock_2(NSError arg0);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native ALAssetsLibrary alloc();

    /**
     * assetForURL:resultBlock:failureBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/assetForURL:resultBlock:failureBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("assetForURL:resultBlock:failureBlock:")
    public native void assetForURLResultBlockFailureBlock(NSURL assetURL,
            @ObjCBlock(name = "call_assetForURLResultBlockFailureBlock_1") Block_assetForURLResultBlockFailureBlock_1 resultBlock,
            @ObjCBlock(name = "call_assetForURLResultBlockFailureBlock_2") Block_assetForURLResultBlockFailureBlock_2 failureBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_assetForURLResultBlockFailureBlock_1 {
        @Generated
        void call_assetForURLResultBlockFailureBlock_1(ALAsset arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_assetForURLResultBlockFailureBlock_2 {
        @Generated
        void call_assetForURLResultBlockFailureBlock_2(NSError arg0);
    }

    /**
     * authorizationStatus</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/clm/ALAssetsLibrary/authorizationStatus">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

    /**
     * disableSharedPhotoStreamsSupport</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/clm/ALAssetsLibrary/disableSharedPhotoStreamsSupport">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("disableSharedPhotoStreamsSupport")
    public static native void disableSharedPhotoStreamsSupport();

    /**
     * enumerateGroupsWithTypes:usingBlock:failureBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/enumerateGroupsWithTypes:usingBlock:failureBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("enumerateGroupsWithTypes:usingBlock:failureBlock:")
    public native void enumerateGroupsWithTypesUsingBlockFailureBlock(@NUInt long types,
            @ObjCBlock(name = "call_enumerateGroupsWithTypesUsingBlockFailureBlock_1") Block_enumerateGroupsWithTypesUsingBlockFailureBlock_1 enumerationBlock,
            @ObjCBlock(name = "call_enumerateGroupsWithTypesUsingBlockFailureBlock_2") Block_enumerateGroupsWithTypesUsingBlockFailureBlock_2 failureBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateGroupsWithTypesUsingBlockFailureBlock_1 {
        @Generated
        void call_enumerateGroupsWithTypesUsingBlockFailureBlock_1(ALAssetsGroup arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateGroupsWithTypesUsingBlockFailureBlock_2 {
        @Generated
        void call_enumerateGroupsWithTypesUsingBlockFailureBlock_2(NSError arg0);
    }

    /**
     * groupForURL:resultBlock:failureBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/groupForURL:resultBlock:failureBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("groupForURL:resultBlock:failureBlock:")
    public native void groupForURLResultBlockFailureBlock(NSURL groupURL,
            @ObjCBlock(name = "call_groupForURLResultBlockFailureBlock_1") Block_groupForURLResultBlockFailureBlock_1 resultBlock,
            @ObjCBlock(name = "call_groupForURLResultBlockFailureBlock_2") Block_groupForURLResultBlockFailureBlock_2 failureBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_groupForURLResultBlockFailureBlock_1 {
        @Generated
        void call_groupForURLResultBlockFailureBlock_1(ALAssetsGroup arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_groupForURLResultBlockFailureBlock_2 {
        @Generated
        void call_groupForURLResultBlockFailureBlock_2(NSError arg0);
    }

    @Generated
    @Selector("init")
    public native ALAssetsLibrary init();

    /**
     * videoAtPathIsCompatibleWithSavedPhotosAlbum:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/videoAtPathIsCompatibleWithSavedPhotosAlbum:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("videoAtPathIsCompatibleWithSavedPhotosAlbum:")
    public native boolean videoAtPathIsCompatibleWithSavedPhotosAlbum(NSURL videoPathURL);

    /**
     * writeImageDataToSavedPhotosAlbum:metadata:completionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/writeImageDataToSavedPhotosAlbum:metadata:completionBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("writeImageDataToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeImageDataToSavedPhotosAlbumMetadataCompletionBlock(NSData imageData,
            NSDictionary<?, ?> metadata,
            @ObjCBlock(name = "call_writeImageDataToSavedPhotosAlbumMetadataCompletionBlock") Block_writeImageDataToSavedPhotosAlbumMetadataCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeImageDataToSavedPhotosAlbumMetadataCompletionBlock {
        @Generated
        void call_writeImageDataToSavedPhotosAlbumMetadataCompletionBlock(NSURL arg0, NSError arg1);
    }

    /**
     * writeImageToSavedPhotosAlbum:metadata:completionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/writeImageToSavedPhotosAlbum:metadata:completionBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("writeImageToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeImageToSavedPhotosAlbumMetadataCompletionBlock(CGImageRef imageRef,
            NSDictionary<?, ?> metadata,
            @ObjCBlock(name = "call_writeImageToSavedPhotosAlbumMetadataCompletionBlock") Block_writeImageToSavedPhotosAlbumMetadataCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeImageToSavedPhotosAlbumMetadataCompletionBlock {
        @Generated
        void call_writeImageToSavedPhotosAlbumMetadataCompletionBlock(NSURL arg0, NSError arg1);
    }

    /**
     * writeImageToSavedPhotosAlbum:orientation:completionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/writeImageToSavedPhotosAlbum:orientation:completionBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("writeImageToSavedPhotosAlbum:orientation:completionBlock:")
    public native void writeImageToSavedPhotosAlbumOrientationCompletionBlock(CGImageRef imageRef,
            @NInt long orientation,
            @ObjCBlock(name = "call_writeImageToSavedPhotosAlbumOrientationCompletionBlock") Block_writeImageToSavedPhotosAlbumOrientationCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeImageToSavedPhotosAlbumOrientationCompletionBlock {
        @Generated
        void call_writeImageToSavedPhotosAlbumOrientationCompletionBlock(NSURL arg0, NSError arg1);
    }

    /**
     * writeVideoAtPathToSavedPhotosAlbum:completionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAssetsLibrary_Class/index.html#//apple_ref/occ/instm/ALAssetsLibrary/writeVideoAtPathToSavedPhotosAlbum:completionBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("writeVideoAtPathToSavedPhotosAlbum:completionBlock:")
    public native void writeVideoAtPathToSavedPhotosAlbumCompletionBlock(NSURL videoPathURL,
            @ObjCBlock(name = "call_writeVideoAtPathToSavedPhotosAlbumCompletionBlock") Block_writeVideoAtPathToSavedPhotosAlbumCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeVideoAtPathToSavedPhotosAlbumCompletionBlock {
        @Generated
        void call_writeVideoAtPathToSavedPhotosAlbumCompletionBlock(NSURL arg0, NSError arg1);
    }

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

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
