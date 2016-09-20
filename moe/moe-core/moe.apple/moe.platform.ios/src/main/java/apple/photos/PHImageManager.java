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
import apple.avfoundation.AVAsset;
import apple.avfoundation.AVAssetExportSession;
import apple.avfoundation.AVAudioMix;
import apple.avfoundation.AVPlayerItem;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class PHImageManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PHImageManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHImageManager alloc();

    /**
     * defaultManager</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageManager_Class/index.html#//apple_ref/occ/clm/PHImageManager/defaultManager">iOS Dev Center</a>
     */
    @Generated
    @Selector("defaultManager")
    public static native PHImageManager defaultManager();

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

    /**
     * cancelImageRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageManager_Class/index.html#//apple_ref/occ/instm/PHImageManager/cancelImageRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancelImageRequest:")
    public native void cancelImageRequest(int requestID);

    @Generated
    @Selector("init")
    public native PHImageManager init();

    /**
     * requestAVAssetForVideo:options:resultHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageManager_Class/index.html#//apple_ref/occ/instm/PHImageManager/requestAVAssetForVideo:options:resultHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestAVAssetForVideo:options:resultHandler:")
    public native int requestAVAssetForVideoOptionsResultHandler(PHAsset asset, PHVideoRequestOptions options,
            @ObjCBlock(name = "call_requestAVAssetForVideoOptionsResultHandler") Block_requestAVAssetForVideoOptionsResultHandler resultHandler);

    /**
     * requestExportSessionForVideo:options:exportPreset:resultHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageManager_Class/index.html#//apple_ref/occ/instm/PHImageManager/requestExportSessionForVideo:options:exportPreset:resultHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestExportSessionForVideo:options:exportPreset:resultHandler:")
    public native int requestExportSessionForVideoOptionsExportPresetResultHandler(PHAsset asset,
            PHVideoRequestOptions options, String exportPreset,
            @ObjCBlock(name = "call_requestExportSessionForVideoOptionsExportPresetResultHandler") Block_requestExportSessionForVideoOptionsExportPresetResultHandler resultHandler);

    /**
     * requestImageDataForAsset:options:resultHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageManager_Class/index.html#//apple_ref/occ/instm/PHImageManager/requestImageDataForAsset:options:resultHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestImageDataForAsset:options:resultHandler:")
    public native int requestImageDataForAssetOptionsResultHandler(PHAsset asset, PHImageRequestOptions options,
            @ObjCBlock(name = "call_requestImageDataForAssetOptionsResultHandler") Block_requestImageDataForAssetOptionsResultHandler resultHandler);

    /**
     * requestImageForAsset:targetSize:contentMode:options:resultHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageManager_Class/index.html#//apple_ref/occ/instm/PHImageManager/requestImageForAsset:targetSize:contentMode:options:resultHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestImageForAsset:targetSize:contentMode:options:resultHandler:")
    public native int requestImageForAssetTargetSizeContentModeOptionsResultHandler(PHAsset asset,
            @ByValue CGSize targetSize, @NInt long contentMode, PHImageRequestOptions options,
            @ObjCBlock(name = "call_requestImageForAssetTargetSizeContentModeOptionsResultHandler") Block_requestImageForAssetTargetSizeContentModeOptionsResultHandler resultHandler);

    /**
     * requestPlayerItemForVideo:options:resultHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageManager_Class/index.html#//apple_ref/occ/instm/PHImageManager/requestPlayerItemForVideo:options:resultHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestPlayerItemForVideo:options:resultHandler:")
    public native int requestPlayerItemForVideoOptionsResultHandler(PHAsset asset, PHVideoRequestOptions options,
            @ObjCBlock(name = "call_requestPlayerItemForVideoOptionsResultHandler") Block_requestPlayerItemForVideoOptionsResultHandler resultHandler);

    /**
     * requestLivePhotoForAsset:targetSize:contentMode:options:resultHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Photos/Reference/PHImageManager_Class/index.html#//apple_ref/occ/instm/PHImageManager/requestLivePhotoForAsset:targetSize:contentMode:options:resultHandler:">iOS Dev Center</a>
     */
    @Generated
    @Selector("requestLivePhotoForAsset:targetSize:contentMode:options:resultHandler:")
    public native int requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler(PHAsset asset,
            @ByValue CGSize targetSize, @NInt long contentMode, PHLivePhotoRequestOptions options,
            @ObjCBlock(name = "call_requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler") Block_requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler resultHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAVAssetForVideoOptionsResultHandler {
        @Generated
        void call_requestAVAssetForVideoOptionsResultHandler(AVAsset arg0, AVAudioMix arg1, NSDictionary<?, ?> arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestExportSessionForVideoOptionsExportPresetResultHandler {
        @Generated
        void call_requestExportSessionForVideoOptionsExportPresetResultHandler(AVAssetExportSession arg0,
                NSDictionary<?, ?> arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestImageDataForAssetOptionsResultHandler {
        @Generated
        void call_requestImageDataForAssetOptionsResultHandler(NSData arg0, String arg1, @NInt long arg2,
                NSDictionary<?, ?> arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestImageForAssetTargetSizeContentModeOptionsResultHandler {
        @Generated
        void call_requestImageForAssetTargetSizeContentModeOptionsResultHandler(UIImage arg0, NSDictionary<?, ?> arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestPlayerItemForVideoOptionsResultHandler {
        @Generated
        void call_requestPlayerItemForVideoOptionsResultHandler(AVPlayerItem arg0, NSDictionary<?, ?> arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler {
        @Generated
        void call_requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler(PHLivePhoto arg0,
                NSDictionary<?, ?> arg1);
    }
}
