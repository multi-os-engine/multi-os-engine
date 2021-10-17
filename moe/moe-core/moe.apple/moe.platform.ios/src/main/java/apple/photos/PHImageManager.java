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

/**
 * Note that all sizes are in pixels
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PHImageManager alloc();

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
    @Selector("defaultManager")
    public static native PHImageManager defaultManager();

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
    @Selector("cancelImageRequest:")
    public native void cancelImageRequest(int requestID);

    @Generated
    @Selector("init")
    public native PHImageManager init();

    /**
     * Everything else. The result handler is called on an arbitrary queue.
     */
    @Generated
    @Selector("requestAVAssetForVideo:options:resultHandler:")
    public native int requestAVAssetForVideoOptionsResultHandler(PHAsset asset, PHVideoRequestOptions options,
            @ObjCBlock(name = "call_requestAVAssetForVideoOptionsResultHandler") Block_requestAVAssetForVideoOptionsResultHandler resultHandler);

    /**
     * Export. The result handler is called on an arbitrary queue.
     */
    @Generated
    @Selector("requestExportSessionForVideo:options:exportPreset:resultHandler:")
    public native int requestExportSessionForVideoOptionsExportPresetResultHandler(PHAsset asset,
            PHVideoRequestOptions options, String exportPreset,
            @ObjCBlock(name = "call_requestExportSessionForVideoOptionsExportPresetResultHandler") Block_requestExportSessionForVideoOptionsExportPresetResultHandler resultHandler);

    /**
     * Request largest represented image as data bytes for the specified asset.
     *
     * @param asset         The asset whose image data is to be loaded.
     * @param options       Options specifying how Photos should handle the request, format the requested image, and notify your app of progress or errors.
     *                      If PHImageRequestOptionsVersionCurrent is requested and the asset has adjustments then the largest rendered image data is returned. In all other cases then the original image data is returned.
     * @param resultHandler A block that is called exactly once either synchronously on the current thread or asynchronously on the main thread depending on the synchronous option specified in the PHImageRequestOptions options parameter (deliveryMode is ignored).
     */
    @Generated
    @Selector("requestImageDataForAsset:options:resultHandler:")
    public native int requestImageDataForAssetOptionsResultHandler(PHAsset asset, PHImageRequestOptions options,
            @ObjCBlock(name = "call_requestImageDataForAssetOptionsResultHandler") Block_requestImageDataForAssetOptionsResultHandler resultHandler);

    /**
     * Request an image representation for the specified asset.
     *
     * @param asset         The asset whose image data is to be loaded.
     * @param targetSize    The target size of image to be returned.
     * @param contentMode   An option for how to fit the image to the aspect ratio of the requested size.
     *                      If the asset's aspect ratio does not match that of the given targetSize, contentMode determines how the image will be resized.
     *                      PHImageContentModeAspectFit: Fit the asked size by maintaining the aspect ratio, the delivered image may not necessarily be the asked targetSize (see PHImageRequestOptionsDeliveryMode and PHImageRequestOptionsResizeMode)
     *                      PHImageContentModeAspectFill: Fill the asked size, some portion of the content may be clipped, the delivered image may not necessarily be the asked targetSize (see PHImageRequestOptionsDeliveryMode and PHImageRequestOptionsResizeMode)
     *                      PHImageContentModeDefault: Use PHImageContentModeDefault when size is PHImageManagerMaximumSize (though no scaling/cropping will be done on the result)
     * @param options       Options specifying how Photos should handle the request, format the requested image, and notify your app of progress or errors.
     *                      If -[PHImageRequestOptions isSynchronous] returns NO (or options is nil), resultHandler may be called 1 or more times. Typically in this case, resultHandler will be called asynchronously on the main thread with the requested results. However, if deliveryMode = PHImageRequestOptionsDeliveryModeOpportunistic, resultHandler may be called synchronously on the calling thread if any image data is immediately available. If the image data returned in this first pass is of insufficient quality, resultHandler will be called again, asychronously on the main thread at a later time with the "correct" results. If the request is cancelled, resultHandler may not be called at all.
     *                      If -[PHImageRequestOptions isSynchronous] returns YES, resultHandler will be called exactly once, synchronously and on the calling thread. Synchronous requests cannot be cancelled.
     * @param resultHandler A block that is called one or more times either synchronously on the current thread or asynchronously on the main thread depending on the options specified in the PHImageRequestOptions options parameter.
     * @return A numeric identifier for the request. If you need to cancel the request before it completes, pass this identifier to the cancelImageRequest: method.
     */
    @Generated
    @Selector("requestImageForAsset:targetSize:contentMode:options:resultHandler:")
    public native int requestImageForAssetTargetSizeContentModeOptionsResultHandler(PHAsset asset,
            @ByValue CGSize targetSize, @NInt long contentMode, PHImageRequestOptions options,
            @ObjCBlock(name = "call_requestImageForAssetTargetSizeContentModeOptionsResultHandler") Block_requestImageForAssetTargetSizeContentModeOptionsResultHandler resultHandler);

    /**
     * Requests a live photo representation of the asset. With PHImageRequestOptionsDeliveryModeOpportunistic (or if no options are specified), the resultHandler block may be called more than once (the first call may occur before the method returns). The PHImageResultIsDegradedKey key in the result handler's info parameter indicates when a temporary low-quality live photo is provided.
     */
    @Generated
    @Selector("requestLivePhotoForAsset:targetSize:contentMode:options:resultHandler:")
    public native int requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler(PHAsset asset,
            @ByValue CGSize targetSize, @NInt long contentMode, PHLivePhotoRequestOptions options,
            @ObjCBlock(name = "call_requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler") Block_requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler resultHandler);

    /**
     * Playback only. The result handler is called on an arbitrary queue.
     */
    @Generated
    @Selector("requestPlayerItemForVideo:options:resultHandler:")
    public native int requestPlayerItemForVideoOptionsResultHandler(PHAsset asset, PHVideoRequestOptions options,
            @ObjCBlock(name = "call_requestPlayerItemForVideoOptionsResultHandler") Block_requestPlayerItemForVideoOptionsResultHandler resultHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAVAssetForVideoOptionsResultHandler {
        @Generated
        void call_requestAVAssetForVideoOptionsResultHandler(AVAsset asset, AVAudioMix audioMix,
                NSDictionary<?, ?> info);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestExportSessionForVideoOptionsExportPresetResultHandler {
        @Generated
        void call_requestExportSessionForVideoOptionsExportPresetResultHandler(AVAssetExportSession exportSession,
                NSDictionary<?, ?> info);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestImageDataForAssetOptionsResultHandler {
        @Generated
        void call_requestImageDataForAssetOptionsResultHandler(NSData imageData, String dataUTI, @NInt long orientation,
                NSDictionary<?, ?> info);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestImageForAssetTargetSizeContentModeOptionsResultHandler {
        @Generated
        void call_requestImageForAssetTargetSizeContentModeOptionsResultHandler(UIImage result,
                NSDictionary<?, ?> info);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler {
        @Generated
        void call_requestLivePhotoForAssetTargetSizeContentModeOptionsResultHandler(PHLivePhoto livePhoto,
                NSDictionary<?, ?> info);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestPlayerItemForVideoOptionsResultHandler {
        @Generated
        void call_requestPlayerItemForVideoOptionsResultHandler(AVPlayerItem playerItem, NSDictionary<?, ?> info);
    }

    /**
     * Request largest represented image as data bytes and EXIF orientation for the specified asset.
     *
     * @param asset         The asset whose image data is to be loaded.
     * @param options       Options specifying how Photos should handle the request, format the requested image, and notify your app of progress or errors.
     *                      If PHImageRequestOptionsVersionCurrent is requested and the asset has adjustments then the largest rendered image data is returned. In all other cases then the original image data is returned.
     * @param resultHandler A block that is called exactly once either synchronously on the current thread or asynchronously on the main thread depending on the synchronous option specified in the PHImageRequestOptions options parameter (deliveryMode is ignored). Orientation is an EXIF orientation as an CGImagePropertyOrientation. For iOS or tvOS, convert this to an UIImageOrientation.
     */
    @Generated
    @Selector("requestImageDataAndOrientationForAsset:options:resultHandler:")
    public native int requestImageDataAndOrientationForAssetOptionsResultHandler(PHAsset asset,
            PHImageRequestOptions options,
            @ObjCBlock(name = "call_requestImageDataAndOrientationForAssetOptionsResultHandler") Block_requestImageDataAndOrientationForAssetOptionsResultHandler resultHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestImageDataAndOrientationForAssetOptionsResultHandler {
        @Generated
        void call_requestImageDataAndOrientationForAssetOptionsResultHandler(NSData imageData, String dataUTI,
                int orientation, NSDictionary<?, ?> info);
    }
}
