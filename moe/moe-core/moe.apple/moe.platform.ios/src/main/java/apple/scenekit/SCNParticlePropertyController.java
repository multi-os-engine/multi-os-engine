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
import apple.quartzcore.CAAnimation;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNParticlePropertyController
 * 
 * The SCNParticlePropertyController class controls the variation over time or over distance of a particle property.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNParticlePropertyController extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNParticlePropertyController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNParticlePropertyController alloc();

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

    /**
     * Creates and initializes a particle property controller with the specified animation.
     */
    @Generated
    @Selector("controllerWithAnimation:")
    public static native SCNParticlePropertyController controllerWithAnimation(CAAnimation animation);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Specifies the animation to be applied on the particle system property. The type of the animation will depend of the property controlled.
     * See the documentation along property name definition.
     */
    @Generated
    @Selector("animation")
    public native CAAnimation animation();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native SCNParticlePropertyController init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNParticlePropertyController initWithCoder(NSCoder coder);

    @Generated
    @Selector("inputBias")
    @NFloat
    public native double inputBias();

    /**
     * Specify the input mode of the receiver.
     * This can be over life, over distance or over the evolution of another proprety.
     * Defaults to SCNParticleInputModeOverLife.
     */
    @Generated
    @Selector("inputMode")
    @NInt
    public native long inputMode();

    /**
     * Specifies an origin for the variation mode "SCNParticleInputModeOverDistance".
     */
    @Generated
    @Selector("inputOrigin")
    public native SCNNode inputOrigin();

    /**
     * Specifies which property to use as input for the input mode "SCNParticleInputModeOverOtherProperty".
     */
    @Generated
    @Selector("inputProperty")
    public native String inputProperty();

    /**
     * Specifies the input scale and bias.
     * inputScale defaults to 1 and inputBias to 0.
     */
    @Generated
    @Selector("inputScale")
    @NFloat
    public native double inputScale();

    /**
     * Specifies the animation to be applied on the particle system property. The type of the animation will depend of the property controlled.
     * See the documentation along property name definition.
     */
    @Generated
    @Selector("setAnimation:")
    public native void setAnimation(CAAnimation value);

    @Generated
    @Selector("setInputBias:")
    public native void setInputBias(@NFloat double value);

    /**
     * Specify the input mode of the receiver.
     * This can be over life, over distance or over the evolution of another proprety.
     * Defaults to SCNParticleInputModeOverLife.
     */
    @Generated
    @Selector("setInputMode:")
    public native void setInputMode(@NInt long value);

    /**
     * Specifies an origin for the variation mode "SCNParticleInputModeOverDistance".
     */
    @Generated
    @Selector("setInputOrigin:")
    public native void setInputOrigin_unsafe(SCNNode value);

    /**
     * Specifies an origin for the variation mode "SCNParticleInputModeOverDistance".
     */
    @Generated
    public void setInputOrigin(SCNNode value) {
        Object __old = inputOrigin();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setInputOrigin_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Specifies which property to use as input for the input mode "SCNParticleInputModeOverOtherProperty".
     */
    @Generated
    @Selector("setInputProperty:")
    public native void setInputProperty(String value);

    /**
     * Specifies the input scale and bias.
     * inputScale defaults to 1 and inputBias to 0.
     */
    @Generated
    @Selector("setInputScale:")
    public native void setInputScale(@NFloat double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
