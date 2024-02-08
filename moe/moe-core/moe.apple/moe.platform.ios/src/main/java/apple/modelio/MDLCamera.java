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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 9.0
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLCamera allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("cameraWithSCNCamera:")
    public static native MDLCamera cameraWithSCNCamera(@NotNull SCNCamera scnCamera);

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
    public static native MDLCamera new_objc();

    @Generated
    @Selector("objectWithSCNNode:")
    public static native MDLCamera objectWithSCNNode(@NotNull SCNNode scnNode);

    @Generated
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLCamera objectWithSCNNodeBufferAllocator(@NotNull SCNNode scnNode,
            @Nullable @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

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
     * Aperture blade count, where zero indicates a circle.
     */
    @Generated
    @Selector("apertureBladeCount")
    @NUInt
    public native long apertureBladeCount();

    /**
     * Radial distortion of the lens, second order term
     */
    @Generated
    @Selector("barrelDistortion")
    public native float barrelDistortion();

    /**
     * Amount of chromatic abberation, from zero to one.
     */
    @Generated
    @Selector("chromaticAberration")
    public native float chromaticAberration();

    /**
     * f-stop, default is 5.6
     */
    @Generated
    @Selector("fStop")
    public native float fStop();

    @Generated
    @Selector("farVisibilityDistance")
    public native float farVisibilityDistance();

    /**
     * The field of view, in degrees.
     * 
     * @see focalLength
     */
    @Generated
    @Selector("fieldOfView")
    public native float fieldOfView();

    /**
     * Radial distortion of the lens, fourth order term
     */
    @Generated
    @Selector("fisheyeDistortion")
    public native float fisheyeDistortion();

    /**
     * Lens focal length in mm.
     * 
     * @see fieldOfView
     */
    @Generated
    @Selector("focalLength")
    public native float focalLength();

    /**
     * Focus distance
     */
    @Generated
    @Selector("focusDistance")
    public native float focusDistance();

    @Generated
    @Selector("init")
    public native MDLCamera init();

    /**
     * Maximum circle of confusion size in mm on the image plane
     */
    @Generated
    @Selector("maximumCircleOfConfusion")
    public native float maximumCircleOfConfusion();

    /**
     * Bounding distance for visible objects
     */
    @Generated
    @Selector("nearVisibilityDistance")
    public native float nearVisibilityDistance();

    /**
     * Amount of optical vignetting, rom zero to one.
     */
    @Generated
    @Selector("opticalVignetting")
    public native float opticalVignetting();

    /**
     */
    @Generated
    @Selector("projection")
    @NUInt
    public native long projection();

    /**
     * Sensor or film gate aperture aspect ratio, default is 1.5
     * 
     * @see sensorVerticalAperture
     */
    @Generated
    @Selector("sensorAspect")
    public native float sensorAspect();

    /**
     * vertical aperture of the sensor or film gate, default is 24mm
     * 
     * @see sensorAspect
     */
    @Generated
    @Selector("sensorVerticalAperture")
    public native float sensorVerticalAperture();

    /**
     * Aperture blade count, where zero indicates a circle.
     */
    @Generated
    @Selector("setApertureBladeCount:")
    public native void setApertureBladeCount(@NUInt long value);

    /**
     * Radial distortion of the lens, second order term
     */
    @Generated
    @Selector("setBarrelDistortion:")
    public native void setBarrelDistortion(float value);

    /**
     * Amount of chromatic abberation, from zero to one.
     */
    @Generated
    @Selector("setChromaticAberration:")
    public native void setChromaticAberration(float value);

    /**
     * f-stop, default is 5.6
     */
    @Generated
    @Selector("setFStop:")
    public native void setFStop(float value);

    @Generated
    @Selector("setFarVisibilityDistance:")
    public native void setFarVisibilityDistance(float value);

    /**
     * The field of view, in degrees.
     * 
     * @see focalLength
     */
    @Generated
    @Selector("setFieldOfView:")
    public native void setFieldOfView(float value);

    /**
     * Radial distortion of the lens, fourth order term
     */
    @Generated
    @Selector("setFisheyeDistortion:")
    public native void setFisheyeDistortion(float value);

    /**
     * Lens focal length in mm.
     * 
     * @see fieldOfView
     */
    @Generated
    @Selector("setFocalLength:")
    public native void setFocalLength(float value);

    /**
     * Focus distance
     */
    @Generated
    @Selector("setFocusDistance:")
    public native void setFocusDistance(float value);

    /**
     * Maximum circle of confusion size in mm on the image plane
     */
    @Generated
    @Selector("setMaximumCircleOfConfusion:")
    public native void setMaximumCircleOfConfusion(float value);

    /**
     * Bounding distance for visible objects
     */
    @Generated
    @Selector("setNearVisibilityDistance:")
    public native void setNearVisibilityDistance(float value);

    /**
     * Amount of optical vignetting, rom zero to one.
     */
    @Generated
    @Selector("setOpticalVignetting:")
    public native void setOpticalVignetting(float value);

    /**
     */
    @Generated
    @Selector("setProjection:")
    public native void setProjection(@NUInt long value);

    /**
     * Sensor or film gate aperture aspect ratio, default is 1.5
     * 
     * @see sensorVerticalAperture
     */
    @Generated
    @Selector("setSensorAspect:")
    public native void setSensorAspect(float value);

    /**
     * vertical aperture of the sensor or film gate, default is 24mm
     * 
     * @see sensorAspect
     */
    @Generated
    @Selector("setSensorVerticalAperture:")
    public native void setSensorVerticalAperture(float value);

    /**
     * Shutter open interval, in seconds
     */
    @Generated
    @Selector("setShutterOpenInterval:")
    public native void setShutterOpenInterval(double value);

    /**
     * World to meters conversion scale. Required for certain calculations.
     */
    @Generated
    @Selector("setWorldToMetersConversionScale:")
    public native void setWorldToMetersConversionScale(float value);

    /**
     * Shutter open interval, in seconds
     */
    @Generated
    @Selector("shutterOpenInterval")
    public native double shutterOpenInterval();

    /**
     * World to meters conversion scale. Required for certain calculations.
     */
    @Generated
    @Selector("worldToMetersConversionScale")
    public native float worldToMetersConversionScale();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
