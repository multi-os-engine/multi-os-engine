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
    @Owned
    @Selector("alloc")
    public static native ALAsset alloc();

    /**
     * aspectRatioThumbnail</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/aspectRatioThumbnail">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("aspectRatioThumbnail")
    public native CGImageRef aspectRatioThumbnail();

    /**
     * defaultRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/defaultRepresentation">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("defaultRepresentation")
    public native ALAssetRepresentation defaultRepresentation();

    @Generated
    @Selector("init")
    public native ALAsset init();

    /**
     * editable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instp/ALAsset/editable">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("isEditable")
    public native boolean isEditable();

    /**
     * originalAsset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instp/ALAsset/originalAsset">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("originalAsset")
    public native ALAsset originalAsset();

    /**
     * representationForUTI:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/representationForUTI:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("representationForUTI:")
    public native ALAssetRepresentation representationForUTI(String representationUTI);

    /**
     * setImageData:metadata:completionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/setImageData:metadata:completionBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setImageData:metadata:completionBlock:")
    public native void setImageDataMetadataCompletionBlock(NSData imageData, NSDictionary<?, ?> metadata,
            @ObjCBlock(name = "call_setImageDataMetadataCompletionBlock") Block_setImageDataMetadataCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setImageDataMetadataCompletionBlock {
        @Generated
        void call_setImageDataMetadataCompletionBlock(NSURL arg0, NSError arg1);
    }

    /**
     * setVideoAtPath:completionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/setVideoAtPath:completionBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setVideoAtPath:completionBlock:")
    public native void setVideoAtPathCompletionBlock(NSURL videoPathURL,
            @ObjCBlock(name = "call_setVideoAtPathCompletionBlock") Block_setVideoAtPathCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setVideoAtPathCompletionBlock {
        @Generated
        void call_setVideoAtPathCompletionBlock(NSURL arg0, NSError arg1);
    }

    /**
     * thumbnail</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/thumbnail">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("thumbnail")
    public native CGImageRef thumbnail();

    /**
     * valueForProperty:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/valueForProperty:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("valueForProperty:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForProperty(String property);

    /**
     * writeModifiedImageDataToSavedPhotosAlbum:metadata:completionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/writeModifiedImageDataToSavedPhotosAlbum:metadata:completionBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("writeModifiedImageDataToSavedPhotosAlbum:metadata:completionBlock:")
    public native void writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock(NSData imageData,
            NSDictionary<?, ?> metadata,
            @ObjCBlock(name = "call_writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock") Block_writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock {
        @Generated
        void call_writeModifiedImageDataToSavedPhotosAlbumMetadataCompletionBlock(NSURL arg0, NSError arg1);
    }

    /**
     * writeModifiedVideoAtPathToSavedPhotosAlbum:completionBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AssetsLibrary/Reference/ALAsset_Class/index.html#//apple_ref/occ/instm/ALAsset/writeModifiedVideoAtPathToSavedPhotosAlbum:completionBlock:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("writeModifiedVideoAtPathToSavedPhotosAlbum:completionBlock:")
    public native void writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock(NSURL videoPathURL,
            @ObjCBlock(name = "call_writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock") Block_writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock completionBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock {
        @Generated
        void call_writeModifiedVideoAtPathToSavedPhotosAlbumCompletionBlock(NSURL arg0, NSError arg1);
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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
