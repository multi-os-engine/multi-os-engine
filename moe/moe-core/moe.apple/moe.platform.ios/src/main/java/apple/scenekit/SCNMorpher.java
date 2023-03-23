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
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNAnimation;
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

/**
 * SCNMorpher
 * 
 * SCNMorpher controls the deformation of morphed geometries
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNMorpher extends NSObject implements SCNAnimatable, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNMorpher(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNMorpher alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNMorpher allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNMorpher new_objc();

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
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    @Deprecated
    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * [@property] calculationMode
     * 
     * Specifies how the morph result is calculated by the receiver. Defaults to SCNMorpherCalculationModeNormalized.
     */
    @Generated
    @Selector("calculationMode")
    @NInt
    public native long calculationMode();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native SCNMorpher init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNMorpher initWithCoder(NSCoder coder);

    @Deprecated
    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    @Deprecated
    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Deprecated
    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    @Deprecated
    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    /**
     * [@property] calculationMode
     * 
     * Specifies how the morph result is calculated by the receiver. Defaults to SCNMorpherCalculationModeNormalized.
     */
    @Generated
    @Selector("setCalculationMode:")
    public native void setCalculationMode(@NInt long value);

    @Deprecated
    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    /**
     * [@property] targets
     * 
     * Specifies the morph targets as an array of SCNGeometry.
     * 
     * The target geometries must have the same number of entries in their geometry sources and the same topology as the
     * base geometry.
     */
    @Generated
    @Selector("setTargets:")
    public native void setTargets(NSArray<? extends SCNGeometry> value);

    /**
     * setWeight:forTargetAtIndex:
     * 
     * Sets the weight for the target at the specified index. Animatable implicitly or explicitly with the keyPath
     * "weights[index]" or "weights["targetName"]" (targetName is the name of the target geometry).
     */
    @Generated
    @Selector("setWeight:forTargetAtIndex:")
    public native void setWeightForTargetAtIndex(@NFloat double weight, @NUInt long targetIndex);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] targets
     * 
     * Specifies the morph targets as an array of SCNGeometry.
     * 
     * The target geometries must have the same number of entries in their geometry sources and the same topology as the
     * base geometry.
     */
    @Generated
    @Selector("targets")
    public native NSArray<? extends SCNGeometry> targets();

    /**
     * weightForTargetAtIndex:
     * 
     * Retrieves the weight for the target at the specified index.
     */
    @Generated
    @Selector("weightForTargetAtIndex:")
    @NFloat
    public native double weightForTargetAtIndex(@NUInt long targetIndex);

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    /**
     * [@property] unifiesNormals
     * 
     * When set to YES the normals are not morphed but are recomputed after morphing the vertex instead. When set to NO,
     * the morpher will morph the normals if the geometry targets have normals. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setUnifiesNormals:")
    public native void setUnifiesNormals(boolean value);

    /**
     * setWeight:forTargetNamed:
     * 
     * Sets the weight for the target with the specified name (targetName is the name of the target geometry).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setWeight:forTargetNamed:")
    public native void setWeightForTargetNamed(@NFloat double weight, String targetName);

    /**
     * [@property] weights
     * 
     * Access to all the weights of all the targets.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setWeights:")
    public native void setWeights(NSArray<? extends NSNumber> value);

    /**
     * [@property] unifiesNormals
     * 
     * When set to YES the normals are not morphed but are recomputed after morphing the vertex instead. When set to NO,
     * the morpher will morph the normals if the geometry targets have normals. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("unifiesNormals")
    public native boolean unifiesNormals();

    /**
     * weightForTargetNamed:
     * 
     * Retrieves the weight for the target with the specified name (targetName is the name of the target geometry).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("weightForTargetNamed:")
    @NFloat
    public native double weightForTargetNamed(String targetName);

    /**
     * [@property] weights
     * 
     * Access to all the weights of all the targets.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("weights")
    public native NSArray<? extends NSNumber> weights();

    @Generated
    @Selector("removeAllAnimationsWithBlendOutDuration:")
    public native void removeAllAnimationsWithBlendOutDuration(@NFloat double duration);
}
