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
import apple.coregraphics.struct.CGAffineTransform;
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("availableCaptureModesForCameraDevice:")
    public static native NSArray<? extends NSNumber> availableCaptureModesForCameraDevice(@NInt long cameraDevice);

    @Generated
    @Selector("availableMediaTypesForSourceType:")
    public static native NSArray<String> availableMediaTypesForSourceType(@NInt long sourceType);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    @Selector("isCameraDeviceAvailable:")
    public static native boolean isCameraDeviceAvailable(@NInt long cameraDevice);

    @Generated
    @Selector("isFlashAvailableForCameraDevice:")
    public static native boolean isFlashAvailableForCameraDevice(@NInt long cameraDevice);

    @Generated
    @Selector("isSourceTypeAvailable:")
    public static native boolean isSourceTypeAvailable(@NInt long sourceType);

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
    @Selector("prepareInterstitialAds")
    public static native void prepareInterstitialAds();

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
    @Selector("allowsEditing")
    public native boolean allowsEditing();

    @Generated
    @Deprecated
    @Selector("allowsImageEditing")
    public native boolean allowsImageEditing();

    @Generated
    @Selector("cameraCaptureMode")
    @NInt
    public native long cameraCaptureMode();

    @Generated
    @Selector("cameraDevice")
    @NInt
    public native long cameraDevice();

    @Generated
    @Selector("cameraFlashMode")
    @NInt
    public native long cameraFlashMode();

    @Generated
    @Selector("cameraOverlayView")
    public native UIView cameraOverlayView();

    @Generated
    @Selector("cameraViewTransform")
    @ByValue
    public native CGAffineTransform cameraViewTransform();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native UIImagePickerController init();

    @Generated
    @Selector("initWithCoder:")
    public native UIImagePickerController initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithNavigationBarClass:toolbarClass:")
    public native UIImagePickerController initWithNavigationBarClassToolbarClass(Class navigationBarClass,
            Class toolbarClass);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native UIImagePickerController initWithNibNameBundle(String nibNameOrNil, NSBundle nibBundleOrNil);

    @Generated
    @Selector("initWithRootViewController:")
    public native UIImagePickerController initWithRootViewController(UIViewController rootViewController);

    @Generated
    @Selector("mediaTypes")
    public native NSArray<String> mediaTypes();

    @Generated
    @Selector("setAllowsEditing:")
    public native void setAllowsEditing(boolean value);

    @Generated
    @Deprecated
    @Selector("setAllowsImageEditing:")
    public native void setAllowsImageEditing(boolean value);

    @Generated
    @Selector("setCameraCaptureMode:")
    public native void setCameraCaptureMode(@NInt long value);

    @Generated
    @Selector("setCameraDevice:")
    public native void setCameraDevice(@NInt long value);

    @Generated
    @Selector("setCameraFlashMode:")
    public native void setCameraFlashMode(@NInt long value);

    @Generated
    @Selector("setCameraOverlayView:")
    public native void setCameraOverlayView(UIView value);

    @Generated
    @Selector("setCameraViewTransform:")
    public native void setCameraViewTransform(@ByValue CGAffineTransform value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
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
    public native void setMediaTypes(NSArray<String> value);

    @Generated
    @Selector("setShowsCameraControls:")
    public native void setShowsCameraControls(boolean value);

    @Generated
    @Selector("setSourceType:")
    public native void setSourceType(@NInt long value);

    @Generated
    @Selector("setVideoMaximumDuration:")
    public native void setVideoMaximumDuration(double value);

    @Generated
    @Selector("setVideoQuality:")
    public native void setVideoQuality(@NInt long value);

    @Generated
    @Selector("showsCameraControls")
    public native boolean showsCameraControls();

    @Generated
    @Selector("sourceType")
    @NInt
    public native long sourceType();

    @Generated
    @Selector("startVideoCapture")
    public native boolean startVideoCapture();

    @Generated
    @Selector("stopVideoCapture")
    public native void stopVideoCapture();

    @Generated
    @Selector("takePicture")
    public native void takePicture();

    @Generated
    @Selector("videoMaximumDuration")
    public native double videoMaximumDuration();

    @Generated
    @Selector("videoQuality")
    @NInt
    public native long videoQuality();

    @Generated
    @Selector("imageExportPreset")
    @NInt
    public native long imageExportPreset();

    @Generated
    @Selector("setImageExportPreset:")
    public native void setImageExportPreset(@NInt long value);

    @Generated
    @Selector("setVideoExportPreset:")
    public native void setVideoExportPreset(String value);

    @Generated
    @Selector("videoExportPreset")
    public native String videoExportPreset();
}
