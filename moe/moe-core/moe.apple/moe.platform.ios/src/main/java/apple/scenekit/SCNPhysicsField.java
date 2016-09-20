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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsField extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPhysicsField(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPhysicsField alloc();

    /**
     * customFieldWithEvaluationBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/customFieldWithEvaluationBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("customFieldWithEvaluationBlock:")
    public static native SCNPhysicsField customFieldWithEvaluationBlock(
            @ObjCBlock(name = "call_customFieldWithEvaluationBlock") Block_customFieldWithEvaluationBlock block);

    /**
     * dragField</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/dragField">iOS Dev Center</a>
     */
    @Generated
    @Selector("dragField")
    public static native SCNPhysicsField dragField();

    /**
     * electricField</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/electricField">iOS Dev Center</a>
     */
    @Generated
    @Selector("electricField")
    public static native SCNPhysicsField electricField();

    /**
     * linearGravityField</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/linearGravityField">iOS Dev Center</a>
     */
    @Generated
    @Selector("linearGravityField")
    public static native SCNPhysicsField linearGravityField();

    /**
     * magneticField</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/magneticField">iOS Dev Center</a>
     */
    @Generated
    @Selector("magneticField")
    public static native SCNPhysicsField magneticField();

    /**
     * noiseFieldWithSmoothness:animationSpeed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/noiseFieldWithSmoothness:animationSpeed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("noiseFieldWithSmoothness:animationSpeed:")
    public static native SCNPhysicsField noiseFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    /**
     * radialGravityField</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/radialGravityField">iOS Dev Center</a>
     */
    @Generated
    @Selector("radialGravityField")
    public static native SCNPhysicsField radialGravityField();

    /**
     * springField</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/springField">iOS Dev Center</a>
     */
    @Generated
    @Selector("springField")
    public static native SCNPhysicsField springField();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * turbulenceFieldWithSmoothness:animationSpeed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/turbulenceFieldWithSmoothness:animationSpeed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("turbulenceFieldWithSmoothness:animationSpeed:")
    public static native SCNPhysicsField turbulenceFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    /**
     * vortexField</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/clm/SCNPhysicsField/vortexField">iOS Dev Center</a>
     */
    @Generated
    @Selector("vortexField")
    public static native SCNPhysicsField vortexField();

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
     * categoryBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/categoryBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * direction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/direction">iOS Dev Center</a>
     */
    @Generated
    @Selector("direction")
    @ByValue
    public native SCNVector3 direction();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * falloffExponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/falloffExponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("falloffExponent")
    @NFloat
    public native double falloffExponent();

    /**
     * halfExtent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/halfExtent">iOS Dev Center</a>
     */
    @Generated
    @Selector("halfExtent")
    @ByValue
    public native SCNVector3 halfExtent();

    @Generated
    @Selector("init")
    public native SCNPhysicsField init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPhysicsField initWithCoder(NSCoder aDecoder);

    /**
     * active</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/active">iOS Dev Center</a>
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * active</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/active">iOS Dev Center</a>
     */
    @Generated
    @Selector("setActive:")
    public native void setActive(boolean value);

    /**
     * exclusive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/exclusive">iOS Dev Center</a>
     */
    @Generated
    @Selector("isExclusive")
    public native boolean isExclusive();

    /**
     * exclusive</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/exclusive">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExclusive:")
    public native void setExclusive(boolean value);

    /**
     * minimumDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/minimumDistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("minimumDistance")
    @NFloat
    public native double minimumDistance();

    /**
     * offset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/offset">iOS Dev Center</a>
     */
    @Generated
    @Selector("offset")
    @ByValue
    public native SCNVector3 offset();

    /**
     * scope</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/scope">iOS Dev Center</a>
     */
    @Generated
    @Selector("scope")
    @NInt
    public native long scope();

    /**
     * categoryBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/categoryBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * direction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/direction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDirection:")
    public native void setDirection(@ByValue SCNVector3 value);

    /**
     * falloffExponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/falloffExponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFalloffExponent:")
    public native void setFalloffExponent(@NFloat double value);

    /**
     * halfExtent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/halfExtent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHalfExtent:")
    public native void setHalfExtent(@ByValue SCNVector3 value);

    /**
     * minimumDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/minimumDistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinimumDistance:")
    public native void setMinimumDistance(@NFloat double value);

    /**
     * offset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/offset">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue SCNVector3 value);

    /**
     * scope</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/scope">iOS Dev Center</a>
     */
    @Generated
    @Selector("setScope:")
    public native void setScope(@NInt long value);

    /**
     * strength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/strength">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStrength:")
    public native void setStrength(@NFloat double value);

    /**
     * usesEllipsoidalExtent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/usesEllipsoidalExtent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesEllipsoidalExtent:")
    public native void setUsesEllipsoidalExtent(boolean value);

    /**
     * strength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/strength">iOS Dev Center</a>
     */
    @Generated
    @Selector("strength")
    @NFloat
    public native double strength();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * usesEllipsoidalExtent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsField_Class/index.html#//apple_ref/occ/instp/SCNPhysicsField/usesEllipsoidalExtent">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesEllipsoidalExtent")
    public native boolean usesEllipsoidalExtent();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customFieldWithEvaluationBlock {
        @Generated
        @ByValue
        SCNVector3 call_customFieldWithEvaluationBlock(@ByValue SCNVector3 arg0, @ByValue SCNVector3 arg1, float arg2,
                float arg3, double arg4);
    }
}
