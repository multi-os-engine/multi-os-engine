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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
public class SKFieldNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKFieldNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKFieldNode alloc();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("dragField")
    public static native SKFieldNode dragField();

    @Generated
    @Selector("electricField")
    public static native SKFieldNode electricField();

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
    @Selector("magneticField")
    public static native SKFieldNode magneticField();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("node")
    public static native SKFieldNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKFieldNode nodeWithFileNamed(String filename);

    @Generated
    @Selector("noiseFieldWithSmoothness:animationSpeed:")
    public static native SKFieldNode noiseFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            NSArray<? extends SKNode> sprites, float accuracy);

    @Generated
    @Selector("radialGravityField")
    public static native SKFieldNode radialGravityField();

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
    @Selector("springField")
    public static native SKFieldNode springField();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("turbulenceFieldWithSmoothness:animationSpeed:")
    public static native SKFieldNode turbulenceFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    @Generated
    @Selector("velocityFieldWithTexture:")
    public static native SKFieldNode velocityFieldWithTexture(SKTexture velocityTexture);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("vortexField")
    public static native SKFieldNode vortexField();

    @Generated
    @Selector("animationSpeed")
    public native float animationSpeed();

    @Generated
    @Selector("categoryBitMask")
    public native int categoryBitMask();

    @Generated
    @Selector("falloff")
    public native float falloff();

    @Generated
    @Selector("init")
    public native SKFieldNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKFieldNode initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    @Generated
    @Selector("isExclusive")
    public native boolean isExclusive();

    @Generated
    @Selector("setExclusive:")
    public native void setExclusive(boolean value);

    @Generated
    @Selector("minimumRadius")
    public native float minimumRadius();

    @Generated
    @Selector("region")
    public native SKRegion region();

    @Generated
    @Selector("setAnimationSpeed:")
    public native void setAnimationSpeed(float value);

    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(int value);

    @Generated
    @Selector("setFalloff:")
    public native void setFalloff(float value);

    @Generated
    @Selector("setMinimumRadius:")
    public native void setMinimumRadius(float value);

    @Generated
    @Selector("setRegion:")
    public native void setRegion(SKRegion value);

    @Generated
    @Selector("setSmoothness:")
    public native void setSmoothness(float value);

    @Generated
    @Selector("setStrength:")
    public native void setStrength(float value);

    @Generated
    @Selector("setTexture:")
    public native void setTexture(SKTexture value);

    @Generated
    @Selector("smoothness")
    public native float smoothness();

    @Generated
    @Selector("strength")
    public native float strength();

    @Generated
    @Selector("texture")
    public native SKTexture texture();
}
