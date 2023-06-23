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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGAffineTransform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIImagePickerController extends UINavigationController implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIImagePickerController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIImagePickerController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIImagePickerController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * returns array of NSNumbers (UIImagePickerControllerCameraCaptureMode)
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("availableCaptureModesForCameraDevice:")
    public static native NSArray<? extends NSNumber> availableCaptureModesForCameraDevice(@NInt long cameraDevice);

    /**
     * returns array of available media types (i.e. kUTTypeImage)
     */
    @Nullable
    @Generated
    @Selector("availableMediaTypesForSourceType:")
    public static native NSArray<String> availableMediaTypesForSourceType(@NInt long sourceType);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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

    /**
     * returns YES if camera device is available
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("isCameraDeviceAvailable:")
    public static native boolean isCameraDeviceAvailable(@NInt long cameraDevice);

    /**
     * returns YES if camera device supports flash and torch.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("isFlashAvailableForCameraDevice:")
    public static native boolean isFlashAvailableForCameraDevice(@NInt long cameraDevice);

    /**
     * returns YES if source is available (i.e. camera present)
     */
    @Generated
    @Selector("isSourceTypeAvailable:")
    public static native boolean isSourceTypeAvailable(@NInt long sourceType);

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
    public static native UIImagePickerController new_objc();

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
     * replacement for -allowsImageEditing; default value is NO.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("allowsEditing")
    public native boolean allowsEditing();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.1
     */
    @Generated
    @Deprecated
    @Selector("allowsImageEditing")
    public native boolean allowsImageEditing();

    /**
     * default is UIImagePickerControllerCameraCaptureModePhoto
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("cameraCaptureMode")
    @NInt
    public native long cameraCaptureMode();

    /**
     * default is UIImagePickerControllerCameraDeviceRear
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("cameraDevice")
    @NInt
    public native long cameraDevice();

    /**
     * default is UIImagePickerControllerCameraFlashModeAuto.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("cameraFlashMode")
    @NInt
    public native long cameraFlashMode();

    /**
     * set a view to overlay the preview view.
     * 
     * API-Since: 3.1
     */
    @Nullable
    @Generated
    @Selector("cameraOverlayView")
    public native UIView cameraOverlayView();

    /**
     * set the transform of the preview view.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("cameraViewTransform")
    @ByValue
    public native CGAffineTransform cameraViewTransform();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native UIImagePickerController init();

    @Generated
    @Selector("initWithCoder:")
    public native UIImagePickerController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native UIImagePickerController initWithNavigationBarClassToolbarClass(@Nullable Class navigationBarClass,
            @Nullable Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIImagePickerController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native UIImagePickerController initWithRootViewController(@NotNull UIViewController rootViewController);

    @NotNull
    @Generated
    @Selector("mediaTypes")
    public native NSArray<String> mediaTypes();

    /**
     * replacement for -allowsImageEditing; default value is NO.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("setAllowsEditing:")
    public native void setAllowsEditing(boolean value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.1
     */
    @Generated
    @Deprecated
    @Selector("setAllowsImageEditing:")
    public native void setAllowsImageEditing(boolean value);

    /**
     * default is UIImagePickerControllerCameraCaptureModePhoto
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setCameraCaptureMode:")
    public native void setCameraCaptureMode(@NInt long value);

    /**
     * default is UIImagePickerControllerCameraDeviceRear
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setCameraDevice:")
    public native void setCameraDevice(@NInt long value);

    /**
     * default is UIImagePickerControllerCameraFlashModeAuto.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setCameraFlashMode:")
    public native void setCameraFlashMode(@NInt long value);

    /**
     * set a view to overlay the preview view.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("setCameraOverlayView:")
    public native void setCameraOverlayView(@Nullable UIView value);

    /**
     * set the transform of the preview view.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("setCameraViewTransform:")
    public native void setCameraViewTransform(@ByValue CGAffineTransform value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setMediaTypes:")
    public native void setMediaTypes(@NotNull NSArray<String> value);

    /**
     * set to NO to hide all standard camera UI. default is YES
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("setShowsCameraControls:")
    public native void setShowsCameraControls(boolean value);

    /**
     * default value is UIImagePickerControllerSourceTypePhotoLibrary.
     */
    @Generated
    @Selector("setSourceType:")
    public native void setSourceType(@NInt long value);

    /**
     * default value is 10 minutes.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("setVideoMaximumDuration:")
    public native void setVideoMaximumDuration(double value);

    /**
     * default value is UIImagePickerControllerQualityTypeMedium. If the cameraDevice does not support the videoQuality,
     * it will use the default value.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("setVideoQuality:")
    public native void setVideoQuality(@NInt long value);

    /**
     * set to NO to hide all standard camera UI. default is YES
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("showsCameraControls")
    public native boolean showsCameraControls();

    /**
     * default value is UIImagePickerControllerSourceTypePhotoLibrary.
     */
    @Generated
    @Selector("sourceType")
    @NInt
    public native long sourceType();

    /**
     * programmatically initiates still image capture. ignored if image capture is in-flight.
     * clients can initiate additional captures after receiving -imagePickerController:didFinishPickingMediaWithInfo:
     * delegate callback
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("startVideoCapture")
    public native boolean startVideoCapture();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("stopVideoCapture")
    public native void stopVideoCapture();

    /**
     * API-Since: 3.1
     */
    @Generated
    @Selector("takePicture")
    public native void takePicture();

    /**
     * default value is 10 minutes.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("videoMaximumDuration")
    public native double videoMaximumDuration();

    /**
     * default value is UIImagePickerControllerQualityTypeMedium. If the cameraDevice does not support the videoQuality,
     * it will use the default value.
     * 
     * API-Since: 3.1
     */
    @Generated
    @Selector("videoQuality")
    @NInt
    public native long videoQuality();

    /**
     * default value is UIImagePickerControllerImageExportPresetCompatible.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Will be removed in a future release, use PHPicker.
     */
    @Deprecated
    @Generated
    @Selector("imageExportPreset")
    @NInt
    public native long imageExportPreset();

    /**
     * default value is UIImagePickerControllerImageExportPresetCompatible.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Will be removed in a future release, use PHPicker.
     */
    @Deprecated
    @Generated
    @Selector("setImageExportPreset:")
    public native void setImageExportPreset(@NInt long value);

    /**
     * videoExportPreset can be used to specify the transcoding quality for videos (via a AVAssetExportPreset* string).
     * If the value is nil (the default) then the transcodeQuality is determined by videoQuality instead. Not valid if
     * the source type is UIImagePickerControllerSourceTypeCamera
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Will be removed in a future release, use PHPicker.
     */
    @Deprecated
    @Generated
    @Selector("setVideoExportPreset:")
    public native void setVideoExportPreset(@NotNull String value);

    /**
     * videoExportPreset can be used to specify the transcoding quality for videos (via a AVAssetExportPreset* string).
     * If the value is nil (the default) then the transcodeQuality is determined by videoQuality instead. Not valid if
     * the source type is UIImagePickerControllerSourceTypeCamera
     * 
     * API-Since: 11.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Will be removed in a future release, use PHPicker.
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("videoExportPreset")
    public native String videoExportPreset();
}
