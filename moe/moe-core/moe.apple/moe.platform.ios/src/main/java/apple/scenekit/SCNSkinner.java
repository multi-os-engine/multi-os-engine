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
import apple.foundation.NSValue;
import apple.foundation.protocol.NSSecureCoding;
import apple.scenekit.struct.SCNMatrix4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNSkinner
 * 
 * SCNSkinner controls the deformation of skinned geometries
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNSkinner extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNSkinner(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNSkinner alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNSkinner allocWithZone(VoidPtr zone);

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
    public static native SCNSkinner new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * skinnerWithBaseGeometry:bones:boneInverseBindTransforms:boneWeights:boneIndices:
     * 
     * Creates and initialize a skinner instance with the specified parameters.
     * 
     * @param baseGeometry              Specifies the base geometry used by the skinner
     * @param bones                     Specifies the array of bones.
     * @param boneInverseBindTransforms The inverse of the bone’s bind-space transformation matrix at the time the bind
     *                                  shape was bound to this bone.
     * @param boneWeights               A buffer of weights. This contains the weights of every influence of every
     *                                  vertex. The number of influence per vertex is controlled by the number of
     *                                  component in the geometry source.
     * @param boneIndices               A buffer of bone indexes. This buffer contains the corresponding index in the
     *                                  bones array for every weight in the weights buffer.
     */
    @Generated
    @Selector("skinnerWithBaseGeometry:bones:boneInverseBindTransforms:boneWeights:boneIndices:")
    public static native SCNSkinner skinnerWithBaseGeometryBonesBoneInverseBindTransformsBoneWeightsBoneIndices(
            @Nullable SCNGeometry baseGeometry, @NotNull NSArray<? extends SCNNode> bones,
            @Nullable NSArray<? extends NSValue> boneInverseBindTransforms, @NotNull SCNGeometrySource boneWeights,
            @NotNull SCNGeometrySource boneIndices);

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

    /**
     * [@property] baseGeometry
     * 
     * Specifies the base geometry of the receiver.
     * 
     * Updating this will change the geometry of all the nodes sharing the skinner.
     * Access the node's geometry if you want to update this specific skinner properties (materials for example).
     * Access this property if you want a whole new geometry (which will necessarily be shared among the skinner
     * instances), with
     * different sources, for instance.
     */
    @Nullable
    @Generated
    @Selector("baseGeometry")
    public native SCNGeometry baseGeometry();

    /**
     * [@property] baseGeometryBindTransform
     * 
     * Specifies the transform of the baseGeometry at the time when the mesh was bound to a skeleton. This transforms
     * the baseGeometry from object space to a space on which the skinning then applies.
     */
    @Generated
    @Selector("baseGeometryBindTransform")
    @ByValue
    public native SCNMatrix4 baseGeometryBindTransform();

    /**
     * [@property] boneIndices
     * 
     * The bone indices of the receiver.
     */
    @NotNull
    @Generated
    @Selector("boneIndices")
    public native SCNGeometrySource boneIndices();

    /**
     * [@property] boneInverseBindTransforms
     * 
     * The inverse of the bone’s bind-space transformation matrix at the time the bind shape was bound to this bone.
     * 
     * boneInverseBindTransforms is an array of SCNMatrix4 wrapped into instances of NSValue.
     */
    @Nullable
    @Generated
    @Selector("boneInverseBindTransforms")
    public native NSArray<? extends NSValue> boneInverseBindTransforms();

    /**
     * [@property] boneWeights
     * 
     * The bone weights of the receiver.
     */
    @NotNull
    @Generated
    @Selector("boneWeights")
    public native SCNGeometrySource boneWeights();

    /**
     * [@property] bones
     * 
     * The bones of the skinner.
     */
    @NotNull
    @Generated
    @Selector("bones")
    public native NSArray<? extends SCNNode> bones();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SCNSkinner init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNSkinner initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] baseGeometry
     * 
     * Specifies the base geometry of the receiver.
     * 
     * Updating this will change the geometry of all the nodes sharing the skinner.
     * Access the node's geometry if you want to update this specific skinner properties (materials for example).
     * Access this property if you want a whole new geometry (which will necessarily be shared among the skinner
     * instances), with
     * different sources, for instance.
     */
    @Generated
    @Selector("setBaseGeometry:")
    public native void setBaseGeometry(@Nullable SCNGeometry value);

    /**
     * [@property] baseGeometryBindTransform
     * 
     * Specifies the transform of the baseGeometry at the time when the mesh was bound to a skeleton. This transforms
     * the baseGeometry from object space to a space on which the skinning then applies.
     */
    @Generated
    @Selector("setBaseGeometryBindTransform:")
    public native void setBaseGeometryBindTransform(@ByValue SCNMatrix4 value);

    /**
     * [@property] skeleton
     * 
     * Specifies the skeleton of the receiver.
     * 
     * When setting a new skeleton, the new skeleton must have the same hierarchy of joints.
     */
    @Generated
    @Selector("setSkeleton:")
    public native void setSkeleton_unsafe(@Nullable SCNNode value);

    /**
     * [@property] skeleton
     * 
     * Specifies the skeleton of the receiver.
     * 
     * When setting a new skeleton, the new skeleton must have the same hierarchy of joints.
     */
    @Nullable
    @Generated
    @Selector("skeleton")
    public native SCNNode skeleton();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] skeleton
     * 
     * Specifies the skeleton of the receiver.
     * 
     * When setting a new skeleton, the new skeleton must have the same hierarchy of joints.
     */
    @Generated
    public void setSkeleton(@Nullable SCNNode value) {
        Object __old = skeleton();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setSkeleton_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }
}
