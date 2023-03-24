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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.MDLMesh;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNFloor
 * 
 * SCNFloor represents an infinite plane geometry.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNFloor extends SCNGeometry {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNFloor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNFloor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNFloor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    /**
     * floor
     * 
     * Creates and returns a floor.
     * 
     * A floor is an infinite plane.
     */
    @Generated
    @Selector("floor")
    public static native SCNFloor floor();

    @Generated
    @Selector("geometry")
    public static native SCNFloor geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNFloor geometryWithMDLMesh(@NotNull MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNFloor geometryWithSourcesElements(@NotNull NSArray<? extends SCNGeometrySource> sources,
            @Nullable NSArray<? extends SCNGeometryElement> elements);

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
    public static native SCNFloor new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native SCNFloor init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNFloor initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] length
     * 
     * The floor extent along the Z axis. Animatable.
     * 
     * If the value is equal to 0, the floor is infinite on the Z axis. The default value is 0.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("length")
    @NFloat
    public native double length();

    /**
     * [@property] reflectionCategoryBitMask
     * 
     * Determines the node categories to reflect. Defaults to all bits set.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("reflectionCategoryBitMask")
    @NUInt
    public native long reflectionCategoryBitMask();

    /**
     * [@property] reflectionFalloffEnd
     * 
     * Specifies the distance from the floor where the falloff finishes. Animatable.
     * 
     * If the value is 0 then there is no falloff. The default value is 0.
     */
    @Generated
    @Selector("reflectionFalloffEnd")
    @NFloat
    public native double reflectionFalloffEnd();

    /**
     * [@property] reflectionFalloffStart
     * 
     * Specifies the distance from the floor where the falloff begins. Animatable.
     * 
     * The default value is 0.
     */
    @Generated
    @Selector("reflectionFalloffStart")
    @NFloat
    public native double reflectionFalloffStart();

    /**
     * [@property] reflectionResolutionScaleFactor
     * 
     * Specifies the resolution scale factor of the buffer used to render the reflection.
     * 
     * Defaults to 0.5.
     * #endif
     */
    @Generated
    @Selector("reflectionResolutionScaleFactor")
    @NFloat
    public native double reflectionResolutionScaleFactor();

    /**
     * [@property] reflectivity
     * 
     * Specifies the reflectivity of the floor. Animatable.
     * 
     * If the value is greater than zero then the surface will reflect other objects in the scene. The default value is
     * 0.25.
     */
    @Generated
    @Selector("reflectivity")
    @NFloat
    public native double reflectivity();

    /**
     * [@property] length
     * 
     * The floor extent along the Z axis. Animatable.
     * 
     * If the value is equal to 0, the floor is infinite on the Z axis. The default value is 0.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setLength:")
    public native void setLength(@NFloat double value);

    /**
     * [@property] reflectionCategoryBitMask
     * 
     * Determines the node categories to reflect. Defaults to all bits set.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setReflectionCategoryBitMask:")
    public native void setReflectionCategoryBitMask(@NUInt long value);

    /**
     * [@property] reflectionFalloffEnd
     * 
     * Specifies the distance from the floor where the falloff finishes. Animatable.
     * 
     * If the value is 0 then there is no falloff. The default value is 0.
     */
    @Generated
    @Selector("setReflectionFalloffEnd:")
    public native void setReflectionFalloffEnd(@NFloat double value);

    /**
     * [@property] reflectionFalloffStart
     * 
     * Specifies the distance from the floor where the falloff begins. Animatable.
     * 
     * The default value is 0.
     */
    @Generated
    @Selector("setReflectionFalloffStart:")
    public native void setReflectionFalloffStart(@NFloat double value);

    /**
     * [@property] reflectionResolutionScaleFactor
     * 
     * Specifies the resolution scale factor of the buffer used to render the reflection.
     * 
     * Defaults to 0.5.
     * #endif
     */
    @Generated
    @Selector("setReflectionResolutionScaleFactor:")
    public native void setReflectionResolutionScaleFactor(@NFloat double value);

    /**
     * [@property] reflectivity
     * 
     * Specifies the reflectivity of the floor. Animatable.
     * 
     * If the value is greater than zero then the surface will reflect other objects in the scene. The default value is
     * 0.25.
     */
    @Generated
    @Selector("setReflectivity:")
    public native void setReflectivity(@NFloat double value);

    /**
     * [@property] width
     * 
     * The floor extent along the X axis. Animatable.
     * 
     * If the value is equal to 0, the floor is infinite on the X axis. The default value is 0.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NFloat double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] width
     * 
     * The floor extent along the X axis. Animatable.
     * 
     * If the value is equal to 0, the floor is infinite on the X axis. The default value is 0.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("width")
    @NFloat
    public native double width();
}
