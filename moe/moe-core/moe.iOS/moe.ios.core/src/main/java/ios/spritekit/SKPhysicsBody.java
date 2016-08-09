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

package ios.spritekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.opaque.CGPathRef;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.coregraphics.struct.CGVector;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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

	/**
	 * affectedByGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/affectedByGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("affectedByGravity")
	public native boolean affectedByGravity();

	/**
	 * allContactedBodies</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instm/SKPhysicsBody/allContactedBodies">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allContactedBodies")
	public native NSArray<? extends SKPhysicsBody> allContactedBodies();

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKPhysicsBody alloc();

	/**
	 * allowsRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/allowsRotation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsRotation")
	public native boolean allowsRotation();

	/**
	 * angularDamping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/angularDamping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("angularDamping")
	@NFloat
	public native double angularDamping();

	/**
	 * angularVelocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/angularVelocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("angularVelocity")
	@NFloat
	public native double angularVelocity();

	/**
	 * applyAngularImpulse:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instm/SKPhysicsBody/applyAngularImpulse:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyAngularImpulse:")
	public native void applyAngularImpulse(@NFloat double impulse);

	/**
	 * applyForce:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instm/SKPhysicsBody/applyForce:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyForce:")
	public native void applyForce(@ByValue CGVector force);

	/**
	 * applyForce:atPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instm/SKPhysicsBody/applyForce:atPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyForce:atPoint:")
	public native void applyForceAtPoint(@ByValue CGVector force,
			@ByValue CGPoint point);

	/**
	 * applyImpulse:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instm/SKPhysicsBody/applyImpulse:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyImpulse:")
	public native void applyImpulse(@ByValue CGVector impulse);

	/**
	 * applyImpulse:atPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instm/SKPhysicsBody/applyImpulse:atPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyImpulse:atPoint:")
	public native void applyImpulseAtPoint(@ByValue CGVector impulse,
			@ByValue CGPoint point);

	/**
	 * applyTorque:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instm/SKPhysicsBody/applyTorque:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyTorque:")
	public native void applyTorque(@NFloat double torque);

	/**
	 * area</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/area">iOS Dev Center</a>
	 */
	@Generated
	@Selector("area")
	@NFloat
	public native double area();

	/**
	 * bodyWithBodies:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithBodies:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithBodies:")
	public static native SKPhysicsBody bodyWithBodies(NSArray<? extends SKPhysicsBody> bodies);

	/**
	 * bodyWithCircleOfRadius:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithCircleOfRadius:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithCircleOfRadius:")
	public static native SKPhysicsBody bodyWithCircleOfRadius(@NFloat double r);

	/**
	 * bodyWithCircleOfRadius:center:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithCircleOfRadius:center:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithCircleOfRadius:center:")
	public static native SKPhysicsBody bodyWithCircleOfRadiusCenter(
			@NFloat double r, @ByValue CGPoint center);

	/**
	 * bodyWithEdgeChainFromPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithEdgeChainFromPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithEdgeChainFromPath:")
	public static native SKPhysicsBody bodyWithEdgeChainFromPath(CGPathRef path);

	/**
	 * bodyWithEdgeFromPoint:toPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithEdgeFromPoint:toPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithEdgeFromPoint:toPoint:")
	public static native SKPhysicsBody bodyWithEdgeFromPointToPoint(
			@ByValue CGPoint p1, @ByValue CGPoint p2);

	/**
	 * bodyWithEdgeLoopFromPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithEdgeLoopFromPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithEdgeLoopFromPath:")
	public static native SKPhysicsBody bodyWithEdgeLoopFromPath(CGPathRef path);

	/**
	 * bodyWithEdgeLoopFromRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithEdgeLoopFromRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithEdgeLoopFromRect:")
	public static native SKPhysicsBody bodyWithEdgeLoopFromRect(
			@ByValue CGRect rect);

	/**
	 * bodyWithPolygonFromPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithPolygonFromPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithPolygonFromPath:")
	public static native SKPhysicsBody bodyWithPolygonFromPath(CGPathRef path);

	/**
	 * bodyWithRectangleOfSize:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithRectangleOfSize:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithRectangleOfSize:")
	public static native SKPhysicsBody bodyWithRectangleOfSize(@ByValue CGSize s);

	/**
	 * bodyWithRectangleOfSize:center:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithRectangleOfSize:center:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithRectangleOfSize:center:")
	public static native SKPhysicsBody bodyWithRectangleOfSizeCenter(
			@ByValue CGSize s, @ByValue CGPoint center);

	/**
	 * bodyWithTexture:alphaThreshold:size:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithTexture:alphaThreshold:size:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithTexture:alphaThreshold:size:")
	public static native SKPhysicsBody bodyWithTextureAlphaThresholdSize(
			SKTexture texture, float alphaThreshold, @ByValue CGSize size);

	/**
	 * bodyWithTexture:size:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/clm/SKPhysicsBody/bodyWithTexture:size:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithTexture:size:")
	public static native SKPhysicsBody bodyWithTextureSize(SKTexture texture,
			@ByValue CGSize size);

	/**
	 * categoryBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/categoryBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("categoryBitMask")
	public native int categoryBitMask();

	/**
	 * charge</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/charge">iOS Dev Center</a>
	 */
	@Generated
	@Selector("charge")
	@NFloat
	public native double charge();

	/**
	 * collisionBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/collisionBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("collisionBitMask")
	public native int collisionBitMask();

	/**
	 * contactTestBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/contactTestBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contactTestBitMask")
	public native int contactTestBitMask();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * density</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/density">iOS Dev Center</a>
	 */
	@Generated
	@Selector("density")
	@NFloat
	public native double density();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * fieldBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/fieldBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fieldBitMask")
	public native int fieldBitMask();

	/**
	 * friction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/friction">iOS Dev Center</a>
	 */
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

	/**
	 * dynamic</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/dynamic">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isDynamic")
	public native boolean isDynamic();

	/**
	 * resting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/resting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isResting")
	public native boolean isResting();

	/**
	 * joints</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/joints">iOS Dev Center</a>
	 */
	@Generated
	@Selector("joints")
	public native NSArray<? extends SKPhysicsJoint> joints();

	/**
	 * linearDamping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/linearDamping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("linearDamping")
	@NFloat
	public native double linearDamping();

	/**
	 * mass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/mass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mass")
	@NFloat
	public native double mass();

	/**
	 * node</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/node">iOS Dev Center</a>
	 */
	@Generated
	@Selector("node")
	public native SKNode node();

	/**
	 * pinned</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/pinned">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pinned")
	public native boolean pinned();

	/**
	 * restitution</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/restitution">iOS Dev Center</a>
	 */
	@Generated
	@Selector("restitution")
	@NFloat
	public native double restitution();

	/**
	 * affectedByGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/affectedByGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAffectedByGravity:")
	public native void setAffectedByGravity(boolean value);

	/**
	 * allowsRotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/allowsRotation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsRotation:")
	public native void setAllowsRotation(boolean value);

	/**
	 * angularDamping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/angularDamping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAngularDamping:")
	public native void setAngularDamping(@NFloat double value);

	/**
	 * angularVelocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/angularVelocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAngularVelocity:")
	public native void setAngularVelocity(@NFloat double value);

	/**
	 * categoryBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/categoryBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCategoryBitMask:")
	public native void setCategoryBitMask(int value);

	/**
	 * charge</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/charge">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCharge:")
	public native void setCharge(@NFloat double value);

	/**
	 * collisionBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/collisionBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCollisionBitMask:")
	public native void setCollisionBitMask(int value);

	/**
	 * contactTestBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/contactTestBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContactTestBitMask:")
	public native void setContactTestBitMask(int value);

	/**
	 * density</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/density">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDensity:")
	public native void setDensity(@NFloat double value);

	/**
	 * dynamic</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/dynamic">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDynamic:")
	public native void setDynamic(boolean value);

	/**
	 * fieldBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/fieldBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFieldBitMask:")
	public native void setFieldBitMask(int value);

	/**
	 * friction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/friction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFriction:")
	public native void setFriction(@NFloat double value);

	/**
	 * linearDamping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/linearDamping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLinearDamping:")
	public native void setLinearDamping(@NFloat double value);

	/**
	 * mass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/mass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMass:")
	public native void setMass(@NFloat double value);

	/**
	 * pinned</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/pinned">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPinned:")
	public native void setPinned(boolean value);

	/**
	 * resting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/resting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setResting:")
	public native void setResting(boolean value);

	/**
	 * restitution</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/restitution">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRestitution:")
	public native void setRestitution(@NFloat double value);

	/**
	 * usesPreciseCollisionDetection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/usesPreciseCollisionDetection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUsesPreciseCollisionDetection:")
	public native void setUsesPreciseCollisionDetection(boolean value);

	/**
	 * velocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/velocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVelocity:")
	public native void setVelocity(@ByValue CGVector value);

	/**
	 * usesPreciseCollisionDetection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/usesPreciseCollisionDetection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("usesPreciseCollisionDetection")
	public native boolean usesPreciseCollisionDetection();

	/**
	 * velocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsBody_Ref/index.html#//apple_ref/occ/instp/SKPhysicsBody/velocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("velocity")
	@ByValue
	public native CGVector velocity();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
}
