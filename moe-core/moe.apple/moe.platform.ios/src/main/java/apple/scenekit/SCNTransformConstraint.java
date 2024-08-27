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
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNTransformConstraint
 * 
 * A SCNTransformConstraint applies on the transform of a node via a custom block.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNTransformConstraint extends SCNConstraint {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNTransformConstraint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNTransformConstraint alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNTransformConstraint allocWithZone(VoidPtr zone);

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
    public static native SCNTransformConstraint new_objc();

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

    /**
     * transformConstraintInWorldSpace:withBlock:
     * 
     * Creates and returns a SCNTransformConstraint object with the specified parameters.
     * 
     * The node and its transform are passed to the block. The transform returned by the block will be used to render
     * the node.
     * 
     * @param world Determines whether the constraint is evaluated in world or local space.
     * @param block The custom block to call to evaluate the constraint.
     */
    @Generated
    @Selector("transformConstraintInWorldSpace:withBlock:")
    public static native SCNTransformConstraint transformConstraintInWorldSpaceWithBlock(boolean world,
            @NotNull @ObjCBlock(name = "call_transformConstraintInWorldSpaceWithBlock") Block_transformConstraintInWorldSpaceWithBlock block);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native SCNTransformConstraint init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNTransformConstraint initWithCoder(@NotNull NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transformConstraintInWorldSpaceWithBlock {
        @Generated
        @ByValue
        SCNMatrix4 call_transformConstraintInWorldSpaceWithBlock(@NotNull SCNNode node, @ByValue SCNMatrix4 transform);
    }

    /**
     * orientationConstraintInWorldSpace:withBlock:
     * 
     * Creates and returns a SCNTransformConstraint object with the specified parameters.
     * 
     * The node and its quaternion are passed to the block. The quaternion returned by the block will be used to render
     * the node.
     * 
     * API-Since: 11.0
     * 
     * @param world Determines whether the constraint is evaluated in world or local space.
     * @param block The custom block to call to evaluate the constraint.
     */
    @NotNull
    @Generated
    @Selector("orientationConstraintInWorldSpace:withBlock:")
    public static native SCNTransformConstraint orientationConstraintInWorldSpaceWithBlock(boolean world,
            @NotNull @ObjCBlock(name = "call_orientationConstraintInWorldSpaceWithBlock") Block_orientationConstraintInWorldSpaceWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_orientationConstraintInWorldSpaceWithBlock {
        @Generated
        @ByValue
        SCNVector4 call_orientationConstraintInWorldSpaceWithBlock(@NotNull SCNNode node,
                @ByValue SCNVector4 quaternion);
    }

    /**
     * positionConstraintInWorldSpace:withBlock:
     * 
     * Creates and returns a SCNTransformConstraint object with the specified parameters.
     * 
     * The node and its position are passed to the block. The position returned by the block will be used to render the
     * node.
     * 
     * API-Since: 11.0
     * 
     * @param world Determines whether the constraint is evaluated in world or local space.
     * @param block The custom block to call to evaluate the constraint.
     */
    @NotNull
    @Generated
    @Selector("positionConstraintInWorldSpace:withBlock:")
    public static native SCNTransformConstraint positionConstraintInWorldSpaceWithBlock(boolean world,
            @NotNull @ObjCBlock(name = "call_positionConstraintInWorldSpaceWithBlock") Block_positionConstraintInWorldSpaceWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_positionConstraintInWorldSpaceWithBlock {
        @Generated
        @ByValue
        SCNVector3 call_positionConstraintInWorldSpaceWithBlock(@NotNull SCNNode node, @ByValue SCNVector3 position);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
