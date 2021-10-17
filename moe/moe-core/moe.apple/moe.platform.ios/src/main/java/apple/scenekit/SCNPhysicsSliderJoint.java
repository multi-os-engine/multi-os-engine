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
import apple.scenekit.struct.SCNVector3;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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

/**
 * SCNPhysicsSliderJoint
 * <p>
 * SCNPhysicsSliderJoint provides a linear sliding joint between two bodies.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsSliderJoint extends SCNPhysicsBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPhysicsSliderJoint(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPhysicsSliderJoint alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native SCNPhysicsSliderJoint allocWithZone(VoidPtr zone);

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

    /**
     * Initializes and returns a physics slider joint.
     * The joint attaches "body" to the 3d location specified by "anchor" and relative to the node that owns the body.
     */
    @Generated
    @Selector("jointWithBody:axis:anchor:")
    public static native SCNPhysicsSliderJoint jointWithBodyAxisAnchor(SCNPhysicsBody body, @ByValue SCNVector3 axis,
            @ByValue SCNVector3 anchor);

    /**
     * Initializes and returns a physics slider joint.
     * The joint attaches bodyA and bodyB on anchorA and anchorB respectively.
     */
    @Generated
    @Selector("jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:")
    public static native SCNPhysicsSliderJoint jointWithBodyAAxisAAnchorABodyBAxisBAnchorB(SCNPhysicsBody bodyA,
            @ByValue SCNVector3 axisA, @ByValue SCNVector3 anchorA, SCNPhysicsBody bodyB, @ByValue SCNVector3 axisB,
            @ByValue SCNVector3 anchorB);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNPhysicsSliderJoint new_objc();

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

    /**
     * the attach point of bodyA
     */
    @Generated
    @Selector("anchorA")
    @ByValue
    public native SCNVector3 anchorA();

    /**
     * the attach point of bodyB
     */
    @Generated
    @Selector("anchorB")
    @ByValue
    public native SCNVector3 anchorB();

    /**
     * the axis on which bodyA can slide
     */
    @Generated
    @Selector("axisA")
    @ByValue
    public native SCNVector3 axisA();

    /**
     * the axis on which bodyB can slide
     */
    @Generated
    @Selector("axisB")
    @ByValue
    public native SCNVector3 axisB();

    /**
     * the first body attached to the slider joint
     */
    @Generated
    @Selector("bodyA")
    public native SCNPhysicsBody bodyA();

    /**
     * the second body attached to the slider joint
     */
    @Generated
    @Selector("bodyB")
    public native SCNPhysicsBody bodyB();

    @Generated
    @Selector("init")
    public native SCNPhysicsSliderJoint init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPhysicsSliderJoint initWithCoder(NSCoder coder);

    @Generated
    @Selector("maximumAngularLimit")
    @NFloat
    public native double maximumAngularLimit();

    @Generated
    @Selector("maximumLinearLimit")
    @NFloat
    public native double maximumLinearLimit();

    @Generated
    @Selector("minimumAngularLimit")
    @NFloat
    public native double minimumAngularLimit();

    /**
     * The minimum and maximum linear/angular limits in radians
     */
    @Generated
    @Selector("minimumLinearLimit")
    @NFloat
    public native double minimumLinearLimit();

    @Generated
    @Selector("motorMaximumForce")
    @NFloat
    public native double motorMaximumForce();

    @Generated
    @Selector("motorMaximumTorque")
    @NFloat
    public native double motorMaximumTorque();

    @Generated
    @Selector("motorTargetAngularVelocity")
    @NFloat
    public native double motorTargetAngularVelocity();

    /**
     * Linear and angular motors in newtons
     */
    @Generated
    @Selector("motorTargetLinearVelocity")
    @NFloat
    public native double motorTargetLinearVelocity();

    /**
     * the attach point of bodyA
     */
    @Generated
    @Selector("setAnchorA:")
    public native void setAnchorA(@ByValue SCNVector3 value);

    /**
     * the attach point of bodyB
     */
    @Generated
    @Selector("setAnchorB:")
    public native void setAnchorB(@ByValue SCNVector3 value);

    /**
     * the axis on which bodyA can slide
     */
    @Generated
    @Selector("setAxisA:")
    public native void setAxisA(@ByValue SCNVector3 value);

    /**
     * the axis on which bodyB can slide
     */
    @Generated
    @Selector("setAxisB:")
    public native void setAxisB(@ByValue SCNVector3 value);

    @Generated
    @Selector("setMaximumAngularLimit:")
    public native void setMaximumAngularLimit(@NFloat double value);

    @Generated
    @Selector("setMaximumLinearLimit:")
    public native void setMaximumLinearLimit(@NFloat double value);

    @Generated
    @Selector("setMinimumAngularLimit:")
    public native void setMinimumAngularLimit(@NFloat double value);

    /**
     * The minimum and maximum linear/angular limits in radians
     */
    @Generated
    @Selector("setMinimumLinearLimit:")
    public native void setMinimumLinearLimit(@NFloat double value);

    @Generated
    @Selector("setMotorMaximumForce:")
    public native void setMotorMaximumForce(@NFloat double value);

    @Generated
    @Selector("setMotorMaximumTorque:")
    public native void setMotorMaximumTorque(@NFloat double value);

    @Generated
    @Selector("setMotorTargetAngularVelocity:")
    public native void setMotorTargetAngularVelocity(@NFloat double value);

    /**
     * Linear and angular motors in newtons
     */
    @Generated
    @Selector("setMotorTargetLinearVelocity:")
    public native void setMotorTargetLinearVelocity(@NFloat double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
