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
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.scenekit.protocol.SCNPhysicsContactDelegate;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsWorld extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPhysicsWorld(Pointer peer) {
        super(peer);
    }

    /**
     * addBehavior:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instm/SCNPhysicsWorld/addBehavior:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addBehavior:")
    public native void addBehavior(SCNPhysicsBehavior behavior);

    /**
     * allBehaviors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/allBehaviors">iOS Dev Center</a>
     */
    @Generated
    @Selector("allBehaviors")
    public native NSArray<? extends SCNPhysicsBehavior> allBehaviors();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPhysicsWorld alloc();

    /**
     * contactDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/contactDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("contactDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNPhysicsContactDelegate contactDelegate();

    /**
     * contactTestBetweenBody:andBody:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instm/SCNPhysicsWorld/contactTestBetweenBody:andBody:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contactTestBetweenBody:andBody:options:")
    public native NSArray<? extends SCNPhysicsContact> contactTestBetweenBodyAndBodyOptions(SCNPhysicsBody bodyA,
            SCNPhysicsBody bodyB, NSDictionary<String, ?> options);

    /**
     * contactTestWithBody:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instm/SCNPhysicsWorld/contactTestWithBody:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contactTestWithBody:options:")
    public native NSArray<? extends SCNPhysicsContact> contactTestWithBodyOptions(SCNPhysicsBody body,
            NSDictionary<String, ?> options);

    /**
     * convexSweepTestWithShape:fromTransform:toTransform:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instm/SCNPhysicsWorld/convexSweepTestWithShape:fromTransform:toTransform:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convexSweepTestWithShape:fromTransform:toTransform:options:")
    public native NSArray<? extends SCNPhysicsContact> convexSweepTestWithShapeFromTransformToTransformOptions(
            SCNPhysicsShape shape, @ByValue SCNMatrix4 from, @ByValue SCNMatrix4 to, NSDictionary<String, ?> options);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * gravity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/gravity">iOS Dev Center</a>
     */
    @Generated
    @Selector("gravity")
    @ByValue
    public native SCNVector3 gravity();

    @Generated
    @Selector("init")
    public native SCNPhysicsWorld init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPhysicsWorld initWithCoder(NSCoder aDecoder);

    /**
     * rayTestWithSegmentFromPoint:toPoint:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instm/SCNPhysicsWorld/rayTestWithSegmentFromPoint:toPoint:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rayTestWithSegmentFromPoint:toPoint:options:")
    public native NSArray<? extends SCNHitTestResult> rayTestWithSegmentFromPointToPointOptions(
            @ByValue SCNVector3 origin, @ByValue SCNVector3 dest, NSDictionary<String, ?> options);

    /**
     * removeAllBehaviors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instm/SCNPhysicsWorld/removeAllBehaviors">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllBehaviors")
    public native void removeAllBehaviors();

    /**
     * removeBehavior:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instm/SCNPhysicsWorld/removeBehavior:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeBehavior:")
    public native void removeBehavior(SCNPhysicsBehavior behavior);

    /**
     * contactDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/contactDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContactDelegate:")
    public native void setContactDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SCNPhysicsContactDelegate value);

    /**
     * contactDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/contactDelegate">iOS Dev Center</a>
     */
    @Generated
    public void setContactDelegate(@Mapped(ObjCObjectMapper.class) SCNPhysicsContactDelegate value) {
        Object __old = contactDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setContactDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * gravity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/gravity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGravity:")
    public native void setGravity(@ByValue SCNVector3 value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    /**
     * timeStep</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/timeStep">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTimeStep:")
    public native void setTimeStep(double value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * timeStep</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instp/SCNPhysicsWorld/timeStep">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeStep")
    public native double timeStep();

    /**
     * updateCollisionPairs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsWorld_Class/index.html#//apple_ref/occ/instm/SCNPhysicsWorld/updateCollisionPairs">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateCollisionPairs")
    public native void updateCollisionPairs();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
