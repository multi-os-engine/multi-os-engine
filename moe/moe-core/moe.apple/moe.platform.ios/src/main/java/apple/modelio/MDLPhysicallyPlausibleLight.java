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
import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.scenekit.SCNLight;
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

/**
 * MDLPhysicallyPlausibleLight
 * <p>
 * A light with characteristics representing plausible real world lights
 * <p>
 * [@property] color The color of the light.
 * [@property] lumens The brightness of the light.
 * [@property] innerConeAngle Within this cone, light is at maximum brightness. Units are degrees.
 * [@property] outerConeAngle Between the inner cone angle and the outer, light
 * quadratically attenuates to zero.
 * [@property] attenuationStartDistance. Within the attenuation start distance, the
 * light is maximally bright.
 * [@property] attenuationEndDistance. Beyond this distance, there is no light.
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLPhysicallyPlausibleLight extends MDLLight {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLPhysicallyPlausibleLight(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLPhysicallyPlausibleLight alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MDLPhysicallyPlausibleLight allocWithZone(VoidPtr zone);

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
    @Selector("lightWithSCNLight:")
    public static native MDLPhysicallyPlausibleLight lightWithSCNLight(SCNLight scnLight);

    @Generated
    @Owned
    @Selector("new")
    public static native MDLPhysicallyPlausibleLight new_objc();

    @Generated
    @Selector("objectWithSCNNode:")
    public static native MDLPhysicallyPlausibleLight objectWithSCNNode(SCNNode scnNode);

    @Generated
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLPhysicallyPlausibleLight objectWithSCNNodeBufferAllocator(SCNNode scnNode,
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
    @Selector("attenuationEndDistance")
    public native float attenuationEndDistance();

    @Generated
    @Selector("attenuationStartDistance")
    public native float attenuationStartDistance();

    @Generated
    @Selector("color")
    public native CGColorRef color();

    @Generated
    @Selector("init")
    public native MDLPhysicallyPlausibleLight init();

    /**
     * 90 means down the light axis to perpendicular is spanned (lightType will be MDLLightSpot)
     * 180 means down the light axis to up the light axis is spanned (lightType will be MDLLightPoint)
     * default is 22.5 degrees
     */
    @Generated
    @Selector("innerConeAngle")
    public native float innerConeAngle();

    /**
     * default light intensity is 1000 lumens
     */
    @Generated
    @Selector("lumens")
    public native float lumens();

    @Generated
    @Selector("outerConeAngle")
    public native float outerConeAngle();

    @Generated
    @Selector("setAttenuationEndDistance:")
    public native void setAttenuationEndDistance(float value);

    @Generated
    @Selector("setAttenuationStartDistance:")
    public native void setAttenuationStartDistance(float value);

    @Generated
    @Selector("setColor:")
    public native void setColor(CGColorRef value);

    /**
     * Light color specified by color temperature, in degrees Kelvin
     * <p>
     * default color is 6500K, cool daylight.
     */
    @Generated
    @Selector("setColorByTemperature:")
    public native void setColorByTemperature(float temperature);

    /**
     * 90 means down the light axis to perpendicular is spanned (lightType will be MDLLightSpot)
     * 180 means down the light axis to up the light axis is spanned (lightType will be MDLLightPoint)
     * default is 22.5 degrees
     */
    @Generated
    @Selector("setInnerConeAngle:")
    public native void setInnerConeAngle(float value);

    /**
     * default light intensity is 1000 lumens
     */
    @Generated
    @Selector("setLumens:")
    public native void setLumens(float value);

    @Generated
    @Selector("setOuterConeAngle:")
    public native void setOuterConeAngle(float value);
}
