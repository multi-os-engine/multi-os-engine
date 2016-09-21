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

package apple.modelio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.scenekit.SCNCamera;
import apple.scenekit.SCNNode;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLCamera extends MDLObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLCamera(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLCamera alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cameraWithSCNCamera:")
    public static native MDLCamera cameraWithSCNCamera(SCNCamera scnCamera);

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
    @Selector("objectWithSCNNode:")
    public static native MDLCamera objectWithSCNNode(SCNNode scnNode);

    @Generated
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLCamera objectWithSCNNodeBufferAllocator(SCNNode scnNode,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

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
    @Selector("apertureBladeCount")
    @NUInt
    public native long apertureBladeCount();

    @Generated
    @Selector("barrelDistortion")
    public native float barrelDistortion();

    @Generated
    @Selector("chromaticAberration")
    public native float chromaticAberration();

    @Generated
    @Selector("fStop")
    public native float fStop();

    @Generated
    @Selector("farVisibilityDistance")
    public native float farVisibilityDistance();

    @Generated
    @Selector("fieldOfView")
    public native float fieldOfView();

    @Generated
    @Selector("fisheyeDistortion")
    public native float fisheyeDistortion();

    @Generated
    @Selector("focalLength")
    public native float focalLength();

    @Generated
    @Selector("focusDistance")
    public native float focusDistance();

    @Generated
    @Selector("init")
    public native MDLCamera init();

    @Generated
    @Selector("maximumCircleOfConfusion")
    public native float maximumCircleOfConfusion();

    @Generated
    @Selector("nearVisibilityDistance")
    public native float nearVisibilityDistance();

    @Generated
    @Selector("opticalVignetting")
    public native float opticalVignetting();

    @Generated
    @Selector("projection")
    @NUInt
    public native long projection();

    @Generated
    @Selector("sensorAspect")
    public native float sensorAspect();

    @Generated
    @Selector("sensorVerticalAperture")
    public native float sensorVerticalAperture();

    @Generated
    @Selector("setApertureBladeCount:")
    public native void setApertureBladeCount(@NUInt long value);

    @Generated
    @Selector("setBarrelDistortion:")
    public native void setBarrelDistortion(float value);

    @Generated
    @Selector("setChromaticAberration:")
    public native void setChromaticAberration(float value);

    @Generated
    @Selector("setFStop:")
    public native void setFStop(float value);

    @Generated
    @Selector("setFarVisibilityDistance:")
    public native void setFarVisibilityDistance(float value);

    @Generated
    @Selector("setFieldOfView:")
    public native void setFieldOfView(float value);

    @Generated
    @Selector("setFisheyeDistortion:")
    public native void setFisheyeDistortion(float value);

    @Generated
    @Selector("setFocalLength:")
    public native void setFocalLength(float value);

    @Generated
    @Selector("setFocusDistance:")
    public native void setFocusDistance(float value);

    @Generated
    @Selector("setMaximumCircleOfConfusion:")
    public native void setMaximumCircleOfConfusion(float value);

    @Generated
    @Selector("setNearVisibilityDistance:")
    public native void setNearVisibilityDistance(float value);

    @Generated
    @Selector("setOpticalVignetting:")
    public native void setOpticalVignetting(float value);

    @Generated
    @Selector("setProjection:")
    public native void setProjection(@NUInt long value);

    @Generated
    @Selector("setSensorAspect:")
    public native void setSensorAspect(float value);

    @Generated
    @Selector("setSensorVerticalAperture:")
    public native void setSensorVerticalAperture(float value);

    @Generated
    @Selector("setShutterOpenInterval:")
    public native void setShutterOpenInterval(double value);

    @Generated
    @Selector("setWorldToMetersConversionScale:")
    public native void setWorldToMetersConversionScale(float value);

    @Generated
    @Selector("shutterOpenInterval")
    public native double shutterOpenInterval();

    @Generated
    @Selector("worldToMetersConversionScale")
    public native float worldToMetersConversionScale();
}
