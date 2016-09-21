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

package apple.spritekit;

import apple.NSObject;
import apple.coregraphics.opaque.CGPathRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
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
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKPhysicsBody extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKPhysicsBody(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKPhysicsBody alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bodyWithBodies:")
    public static native SKPhysicsBody bodyWithBodies(NSArray<? extends SKPhysicsBody> bodies);

    @Generated
    @Selector("bodyWithCircleOfRadius:")
    public static native SKPhysicsBody bodyWithCircleOfRadius(@NFloat double r);

    @Generated
    @Selector("bodyWithCircleOfRadius:center:")
    public static native SKPhysicsBody bodyWithCircleOfRadiusCenter(@NFloat double r, @ByValue CGPoint center);

    @Generated
    @Selector("bodyWithEdgeChainFromPath:")
    public static native SKPhysicsBody bodyWithEdgeChainFromPath(CGPathRef path);

    @Generated
    @Selector("bodyWithEdgeFromPoint:toPoint:")
    public static native SKPhysicsBody bodyWithEdgeFromPointToPoint(@ByValue CGPoint p1, @ByValue CGPoint p2);

    @Generated
    @Selector("bodyWithEdgeLoopFromPath:")
    public static native SKPhysicsBody bodyWithEdgeLoopFromPath(CGPathRef path);

    @Generated
    @Selector("bodyWithEdgeLoopFromRect:")
    public static native SKPhysicsBody bodyWithEdgeLoopFromRect(@ByValue CGRect rect);

    @Generated
    @Selector("bodyWithPolygonFromPath:")
    public static native SKPhysicsBody bodyWithPolygonFromPath(CGPathRef path);

    @Generated
    @Selector("bodyWithRectangleOfSize:")
    public static native SKPhysicsBody bodyWithRectangleOfSize(@ByValue CGSize s);

    @Generated
    @Selector("bodyWithRectangleOfSize:center:")
    public static native SKPhysicsBody bodyWithRectangleOfSizeCenter(@ByValue CGSize s, @ByValue CGPoint center);

    @Generated
    @Selector("bodyWithTexture:alphaThreshold:size:")
    public static native SKPhysicsBody bodyWithTextureAlphaThresholdSize(SKTexture texture, float alphaThreshold,
            @ByValue CGSize size);

    @Generated
    @Selector("bodyWithTexture:size:")
    public static native SKPhysicsBody bodyWithTextureSize(SKTexture texture, @ByValue CGSize size);

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
    @Selector("affectedByGravity")
    public native boolean affectedByGravity();

    @Generated
    @Selector("allContactedBodies")
    public native NSArray<? extends SKPhysicsBody> allContactedBodies();

    @Generated
    @Selector("allowsRotation")
    public native boolean allowsRotation();

    @Generated
    @Selector("angularDamping")
    @NFloat
    public native double angularDamping();

    @Generated
    @Selector("angularVelocity")
    @NFloat
    public native double angularVelocity();

    @Generated
    @Selector("applyAngularImpulse:")
    public native void applyAngularImpulse(@NFloat double impulse);

    @Generated
    @Selector("applyForce:")
    public native void applyForce(@ByValue CGVector force);

    @Generated
    @Selector("applyForce:atPoint:")
    public native void applyForceAtPoint(@ByValue CGVector force, @ByValue CGPoint point);

    @Generated
    @Selector("applyImpulse:")
    public native void applyImpulse(@ByValue CGVector impulse);

    @Generated
    @Selector("applyImpulse:atPoint:")
    public native void applyImpulseAtPoint(@ByValue CGVector impulse, @ByValue CGPoint point);

    @Generated
    @Selector("applyTorque:")
    public native void applyTorque(@NFloat double torque);

    @Generated
    @Selector("area")
    @NFloat
    public native double area();

    @Generated
    @Selector("categoryBitMask")
    public native int categoryBitMask();

    @Generated
    @Selector("charge")
    @NFloat
    public native double charge();

    @Generated
    @Selector("collisionBitMask")
    public native int collisionBitMask();

    @Generated
    @Selector("contactTestBitMask")
    public native int contactTestBitMask();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("density")
    @NFloat
    public native double density();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("fieldBitMask")
    public native int fieldBitMask();

    @Generated
    @Selector("friction")
    @NFloat
    public native double friction();

    @Generated
    @Selector("init")
    public native SKPhysicsBody init();

    @Generated
    @Selector("initWithCoder:")
    public native SKPhysicsBody initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isDynamic")
    public native boolean isDynamic();

    @Generated
    @Selector("setDynamic:")
    public native void setDynamic(boolean value);

    @Generated
    @Selector("isResting")
    public native boolean isResting();

    @Generated
    @Selector("setResting:")
    public native void setResting(boolean value);

    @Generated
    @Selector("joints")
    public native NSArray<? extends SKPhysicsJoint> joints();

    @Generated
    @Selector("linearDamping")
    @NFloat
    public native double linearDamping();

    @Generated
    @Selector("mass")
    @NFloat
    public native double mass();

    @Generated
    @Selector("node")
    public native SKNode node();

    @Generated
    @Selector("pinned")
    public native boolean pinned();

    @Generated
    @Selector("restitution")
    @NFloat
    public native double restitution();

    @Generated
    @Selector("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean value);

    @Generated
    @Selector("setAllowsRotation:")
    public native void setAllowsRotation(boolean value);

    @Generated
    @Selector("setAngularDamping:")
    public native void setAngularDamping(@NFloat double value);

    @Generated
    @Selector("setAngularVelocity:")
    public native void setAngularVelocity(@NFloat double value);

    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(int value);

    @Generated
    @Selector("setCharge:")
    public native void setCharge(@NFloat double value);

    @Generated
    @Selector("setCollisionBitMask:")
    public native void setCollisionBitMask(int value);

    @Generated
    @Selector("setContactTestBitMask:")
    public native void setContactTestBitMask(int value);

    @Generated
    @Selector("setDensity:")
    public native void setDensity(@NFloat double value);

    @Generated
    @Selector("setFieldBitMask:")
    public native void setFieldBitMask(int value);

    @Generated
    @Selector("setFriction:")
    public native void setFriction(@NFloat double value);

    @Generated
    @Selector("setLinearDamping:")
    public native void setLinearDamping(@NFloat double value);

    @Generated
    @Selector("setMass:")
    public native void setMass(@NFloat double value);

    @Generated
    @Selector("setPinned:")
    public native void setPinned(boolean value);

    @Generated
    @Selector("setRestitution:")
    public native void setRestitution(@NFloat double value);

    @Generated
    @Selector("setUsesPreciseCollisionDetection:")
    public native void setUsesPreciseCollisionDetection(boolean value);

    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(@ByValue CGVector value);

    @Generated
    @Selector("usesPreciseCollisionDetection")
    public native boolean usesPreciseCollisionDetection();

    @Generated
    @Selector("velocity")
    @ByValue
    public native CGVector velocity();
}
