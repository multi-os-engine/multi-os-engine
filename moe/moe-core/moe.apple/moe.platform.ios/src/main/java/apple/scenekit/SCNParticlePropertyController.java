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
    @Owned
    @Selector("alloc")
    public static native SCNParticlePropertyController alloc();

    /**
     * controllerWithAnimation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/clm/SCNParticlePropertyController/controllerWithAnimation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("controllerWithAnimation:")
    public static native SCNParticlePropertyController controllerWithAnimation(CAAnimation animation);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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

    /**
     * animation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/animation">iOS Dev Center</a>
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
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native SCNParticlePropertyController init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNParticlePropertyController initWithCoder(NSCoder aDecoder);

    /**
     * inputBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputBias")
    @NFloat
    public native double inputBias();

    /**
     * inputMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputMode")
    @NInt
    public native long inputMode();

    /**
     * inputOrigin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputOrigin">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputOrigin")
    public native SCNNode inputOrigin();

    /**
     * inputProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputProperty">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputProperty")
    public native String inputProperty();

    /**
     * inputScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("inputScale")
    @NFloat
    public native double inputScale();

    /**
     * animation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/animation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimation:")
    public native void setAnimation(CAAnimation value);

    /**
     * inputBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputBias:")
    public native void setInputBias(@NFloat double value);

    /**
     * inputMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputMode:")
    public native void setInputMode(@NInt long value);

    /**
     * inputOrigin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputOrigin">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputOrigin:")
    public native void setInputOrigin_unsafe(SCNNode value);

    /**
     * inputOrigin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputOrigin">iOS Dev Center</a>
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
     * inputProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputProperty">iOS Dev Center</a>
     */
    @Generated
    @Selector("setInputProperty:")
    public native void setInputProperty(String value);

    /**
     * inputScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticlePropertyController_Class/index.html#//apple_ref/occ/instp/SCNParticlePropertyController/inputScale">iOS Dev Center</a>
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
