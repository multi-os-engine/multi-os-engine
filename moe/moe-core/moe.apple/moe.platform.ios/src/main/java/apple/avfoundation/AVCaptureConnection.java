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

package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCaptureConnection extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCaptureConnection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCaptureConnection alloc();

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
    @Selector("connectionWithInputPort:videoPreviewLayer:")
    public static native AVCaptureConnection connectionWithInputPortVideoPreviewLayer(AVCaptureInputPort port,
            AVCaptureVideoPreviewLayer layer);

    @Generated
    @Selector("connectionWithInputPorts:output:")
    public static native AVCaptureConnection connectionWithInputPortsOutput(NSArray<? extends AVCaptureInputPort> ports,
            AVCaptureOutput output);

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
    @Selector("activeVideoStabilizationMode")
    @NInt
    public native long activeVideoStabilizationMode();

    @Generated
    @Selector("audioChannels")
    public native NSArray<? extends AVCaptureAudioChannel> audioChannels();

    @Generated
    @Selector("automaticallyAdjustsVideoMirroring")
    public native boolean automaticallyAdjustsVideoMirroring();

    @Generated
    @Deprecated
    @Selector("enablesVideoStabilizationWhenAvailable")
    public native boolean enablesVideoStabilizationWhenAvailable();

    @Generated
    @Selector("init")
    public native AVCaptureConnection init();

    @Generated
    @Selector("initWithInputPort:videoPreviewLayer:")
    public native AVCaptureConnection initWithInputPortVideoPreviewLayer(AVCaptureInputPort port,
            AVCaptureVideoPreviewLayer layer);

    @Generated
    @Selector("initWithInputPorts:output:")
    public native AVCaptureConnection initWithInputPortsOutput(NSArray<? extends AVCaptureInputPort> ports,
            AVCaptureOutput output);

    @Generated
    @Selector("inputPorts")
    public native NSArray<? extends AVCaptureInputPort> inputPorts();

    @Generated
    @Selector("isActive")
    public native boolean isActive();

    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    @Generated
    @Deprecated
    @Selector("isVideoMaxFrameDurationSupported")
    public native boolean isVideoMaxFrameDurationSupported();

    @Generated
    @Deprecated
    @Selector("isVideoMinFrameDurationSupported")
    public native boolean isVideoMinFrameDurationSupported();

    @Generated
    @Selector("isVideoMirrored")
    public native boolean isVideoMirrored();

    @Generated
    @Selector("setVideoMirrored:")
    public native void setVideoMirrored(boolean value);

    @Generated
    @Selector("isVideoMirroringSupported")
    public native boolean isVideoMirroringSupported();

    @Generated
    @Selector("isVideoOrientationSupported")
    public native boolean isVideoOrientationSupported();

    @Generated
    @Deprecated
    @Selector("isVideoStabilizationEnabled")
    public native boolean isVideoStabilizationEnabled();

    @Generated
    @Selector("isVideoStabilizationSupported")
    public native boolean isVideoStabilizationSupported();

    @Generated
    @Selector("output")
    public native AVCaptureOutput output();

    @Generated
    @Selector("preferredVideoStabilizationMode")
    @NInt
    public native long preferredVideoStabilizationMode();

    @Generated
    @Selector("setAutomaticallyAdjustsVideoMirroring:")
    public native void setAutomaticallyAdjustsVideoMirroring(boolean value);

    @Generated
    @Deprecated
    @Selector("setEnablesVideoStabilizationWhenAvailable:")
    public native void setEnablesVideoStabilizationWhenAvailable(boolean value);

    @Generated
    @Selector("setPreferredVideoStabilizationMode:")
    public native void setPreferredVideoStabilizationMode(@NInt long value);

    @Generated
    @Deprecated
    @Selector("setVideoMaxFrameDuration:")
    public native void setVideoMaxFrameDuration(@ByValue CMTime value);

    @Generated
    @Deprecated
    @Selector("setVideoMinFrameDuration:")
    public native void setVideoMinFrameDuration(@ByValue CMTime value);

    @Generated
    @Selector("setVideoOrientation:")
    public native void setVideoOrientation(@NInt long value);

    @Generated
    @Selector("setVideoScaleAndCropFactor:")
    public native void setVideoScaleAndCropFactor(@NFloat double value);

    @Generated
    @Deprecated
    @Selector("videoMaxFrameDuration")
    @ByValue
    public native CMTime videoMaxFrameDuration();

    @Generated
    @Selector("videoMaxScaleAndCropFactor")
    @NFloat
    public native double videoMaxScaleAndCropFactor();

    @Generated
    @Deprecated
    @Selector("videoMinFrameDuration")
    @ByValue
    public native CMTime videoMinFrameDuration();

    @Generated
    @Selector("videoOrientation")
    @NInt
    public native long videoOrientation();

    @Generated
    @Selector("videoPreviewLayer")
    public native AVCaptureVideoPreviewLayer videoPreviewLayer();

    @Generated
    @Selector("videoScaleAndCropFactor")
    @NFloat
    public native double videoScaleAndCropFactor();

    @Generated
    @Selector("isCameraIntrinsicMatrixDeliveryEnabled")
    public native boolean isCameraIntrinsicMatrixDeliveryEnabled();

    @Generated
    @Selector("isCameraIntrinsicMatrixDeliverySupported")
    public native boolean isCameraIntrinsicMatrixDeliverySupported();

    @Generated
    @Selector("setCameraIntrinsicMatrixDeliveryEnabled:")
    public native void setCameraIntrinsicMatrixDeliveryEnabled(boolean value);
}
