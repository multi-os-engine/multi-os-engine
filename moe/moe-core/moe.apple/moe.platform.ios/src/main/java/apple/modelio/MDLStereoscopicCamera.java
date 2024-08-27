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
public class MDLStereoscopicCamera extends MDLCamera {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLStereoscopicCamera(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLStereoscopicCamera alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLStereoscopicCamera allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cameraWithSCNCamera:")
    public static native MDLStereoscopicCamera cameraWithSCNCamera(@NotNull SCNCamera scnCamera);

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
    public static native MDLStereoscopicCamera new_objc();

    @Generated
    @Selector("objectWithSCNNode:")
    public static native MDLStereoscopicCamera objectWithSCNNode(@NotNull SCNNode scnNode);

    @Generated
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLStereoscopicCamera objectWithSCNNodeBufferAllocator(@NotNull SCNNode scnNode,
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

    @Generated
    @Selector("init")
    public native MDLStereoscopicCamera init();

    /**
     * Inter-pupillary distance in mm.
     * Default is 63mm.
     */
    @Generated
    @Selector("interPupillaryDistance")
    public native float interPupillaryDistance();

    /**
     * Vergence in a stereoscopic camera can be controlled in two ways. A toed-in
     * binocular stereoscopic camera rotates the lens and sensor together such that a
     * ray projected from the center of either sensor and lens meets at a point. A
     * parallel binocular stereoscopic camera accomplishes the same thing by shifting
     * the relative centers of the sensor and lens.
     * 
     * If a parallel binocular stereoscopic camera is modeled, the sensor should be
     * considered to have shifted by an amount h. If left and right vergence are equal,
     * h = (focal length * interOcularDistance) / distance to vergence point.
     * 
     * Vergence is measured in degrees towards center and is usually positive.
     */
    @Generated
    @Selector("leftVergence")
    public native float leftVergence();

    /**
     * The amount, as a percentage of image width to offset an image towards the other
     * camera. This value is used in a stereo grade to enhance or reduce the intensity
     * of the stereoscopic effect
     */
    @Generated
    @Selector("overlap")
    public native float overlap();

    @Generated
    @Selector("rightVergence")
    public native float rightVergence();

    /**
     * Inter-pupillary distance in mm.
     * Default is 63mm.
     */
    @Generated
    @Selector("setInterPupillaryDistance:")
    public native void setInterPupillaryDistance(float value);

    /**
     * Vergence in a stereoscopic camera can be controlled in two ways. A toed-in
     * binocular stereoscopic camera rotates the lens and sensor together such that a
     * ray projected from the center of either sensor and lens meets at a point. A
     * parallel binocular stereoscopic camera accomplishes the same thing by shifting
     * the relative centers of the sensor and lens.
     * 
     * If a parallel binocular stereoscopic camera is modeled, the sensor should be
     * considered to have shifted by an amount h. If left and right vergence are equal,
     * h = (focal length * interOcularDistance) / distance to vergence point.
     * 
     * Vergence is measured in degrees towards center and is usually positive.
     */
    @Generated
    @Selector("setLeftVergence:")
    public native void setLeftVergence(float value);

    /**
     * The amount, as a percentage of image width to offset an image towards the other
     * camera. This value is used in a stereo grade to enhance or reduce the intensity
     * of the stereoscopic effect
     */
    @Generated
    @Selector("setOverlap:")
    public native void setOverlap(float value);

    @Generated
    @Selector("setRightVergence:")
    public native void setRightVergence(float value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
