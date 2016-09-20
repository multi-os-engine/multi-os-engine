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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.spritekit.protocol.SKPhysicsContactDelegate;
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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKPhysicsWorld extends NSObject implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKPhysicsWorld(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKPhysicsWorld alloc();

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
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addJoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/addJoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addJoint:")
    public native void addJoint(SKPhysicsJoint joint);

    /**
     * bodyAlongRayStart:end:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/bodyAlongRayStart:end:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bodyAlongRayStart:end:")
    public native SKPhysicsBody bodyAlongRayStartEnd(@ByValue CGPoint start, @ByValue CGPoint end);

    /**
     * bodyAtPoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/bodyAtPoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bodyAtPoint:")
    public native SKPhysicsBody bodyAtPoint(@ByValue CGPoint point);

    /**
     * bodyInRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/bodyInRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bodyInRect:")
    public native SKPhysicsBody bodyInRect(@ByValue CGRect rect);

    /**
     * contactDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instp/SKPhysicsWorld/contactDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("contactDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SKPhysicsContactDelegate contactDelegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateBodiesAlongRayStart:end:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/enumerateBodiesAlongRayStart:end:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateBodiesAlongRayStart:end:usingBlock:")
    public native void enumerateBodiesAlongRayStartEndUsingBlock(@ByValue CGPoint start, @ByValue CGPoint end,
            @ObjCBlock(name = "call_enumerateBodiesAlongRayStartEndUsingBlock") Block_enumerateBodiesAlongRayStartEndUsingBlock block);

    /**
     * enumerateBodiesAtPoint:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/enumerateBodiesAtPoint:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateBodiesAtPoint:usingBlock:")
    public native void enumerateBodiesAtPointUsingBlock(@ByValue CGPoint point,
            @ObjCBlock(name = "call_enumerateBodiesAtPointUsingBlock") Block_enumerateBodiesAtPointUsingBlock block);

    /**
     * enumerateBodiesInRect:usingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/enumerateBodiesInRect:usingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateBodiesInRect:usingBlock:")
    public native void enumerateBodiesInRectUsingBlock(@ByValue CGRect rect,
            @ObjCBlock(name = "call_enumerateBodiesInRectUsingBlock") Block_enumerateBodiesInRectUsingBlock block);

    /**
     * gravity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instp/SKPhysicsWorld/gravity">iOS Dev Center</a>
     */
    @Generated
    @Selector("gravity")
    @ByValue
    public native CGVector gravity();

    @Generated
    @Selector("init")
    public native SKPhysicsWorld init();

    @Generated
    @Selector("initWithCoder:")
    public native SKPhysicsWorld initWithCoder(NSCoder aDecoder);

    /**
     * removeAllJoints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/removeAllJoints">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllJoints")
    public native void removeAllJoints();

    /**
     * removeJoint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instm/SKPhysicsWorld/removeJoint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeJoint:")
    public native void removeJoint(SKPhysicsJoint joint);

    /**
     * contactDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instp/SKPhysicsWorld/contactDelegate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContactDelegate:")
    public native void setContactDelegate_unsafe(@Mapped(ObjCObjectMapper.class) SKPhysicsContactDelegate value);

    /**
     * contactDelegate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instp/SKPhysicsWorld/contactDelegate">iOS Dev Center</a>
     */
    @Generated
    public void setContactDelegate(@Mapped(ObjCObjectMapper.class) SKPhysicsContactDelegate value) {
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
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instp/SKPhysicsWorld/gravity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGravity:")
    public native void setGravity(@ByValue CGVector value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instp/SKPhysicsWorld/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    /**
     * speed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKPhysicsWorld_Ref/index.html#//apple_ref/occ/instp/SKPhysicsWorld/speed">iOS Dev Center</a>
     */
    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateBodiesAlongRayStartEndUsingBlock {
        @Generated
        void call_enumerateBodiesAlongRayStartEndUsingBlock(SKPhysicsBody arg0, @ByValue CGPoint arg1,
                @ByValue CGVector arg2, BoolPtr arg3);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateBodiesAtPointUsingBlock {
        @Generated
        void call_enumerateBodiesAtPointUsingBlock(SKPhysicsBody arg0, BoolPtr arg1);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateBodiesInRectUsingBlock {
        @Generated
        void call_enumerateBodiesInRectUsingBlock(SKPhysicsBody arg0, BoolPtr arg1);
    }
}
