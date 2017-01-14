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

package apple.glkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.glkit.struct.GLKVector3;
import apple.glkit.struct.GLKVector4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKEffectPropertyLight extends GLKEffectProperty {
    static {
        NatJ.register();
    }

    @Generated
    protected GLKEffectPropertyLight(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKEffectPropertyLight alloc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("ambientColor")
    @ByValue
    public native GLKVector4 ambientColor();

    @Generated
    @Selector("constantAttenuation")
    public native float constantAttenuation();

    @Generated
    @Selector("diffuseColor")
    @ByValue
    public native GLKVector4 diffuseColor();

    @Generated
    @Selector("enabled")
    public native byte enabled();

    @Generated
    @Selector("init")
    public native GLKEffectPropertyLight init();

    @Generated
    @Selector("linearAttenuation")
    public native float linearAttenuation();

    @Generated
    @Selector("position")
    @ByValue
    public native GLKVector4 position();

    @Generated
    @Selector("quadraticAttenuation")
    public native float quadraticAttenuation();

    @Generated
    @Selector("setAmbientColor:")
    public native void setAmbientColor(@ByValue GLKVector4 value);

    @Generated
    @Selector("setConstantAttenuation:")
    public native void setConstantAttenuation(float value);

    @Generated
    @Selector("setDiffuseColor:")
    public native void setDiffuseColor(@ByValue GLKVector4 value);

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(byte value);

    @Generated
    @Selector("setLinearAttenuation:")
    public native void setLinearAttenuation(float value);

    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue GLKVector4 value);

    @Generated
    @Selector("setQuadraticAttenuation:")
    public native void setQuadraticAttenuation(float value);

    @Generated
    @Selector("setSpecularColor:")
    public native void setSpecularColor(@ByValue GLKVector4 value);

    @Generated
    @Selector("setSpotCutoff:")
    public native void setSpotCutoff(float value);

    @Generated
    @Selector("setSpotDirection:")
    public native void setSpotDirection(@ByValue GLKVector3 value);

    @Generated
    @Selector("setSpotExponent:")
    public native void setSpotExponent(float value);

    @Generated
    @Selector("setTransform:")
    public native void setTransform(GLKEffectPropertyTransform value);

    @Generated
    @Selector("specularColor")
    @ByValue
    public native GLKVector4 specularColor();

    @Generated
    @Selector("spotCutoff")
    public native float spotCutoff();

    @Generated
    @Selector("spotDirection")
    @ByValue
    public native GLKVector3 spotDirection();

    @Generated
    @Selector("spotExponent")
    public native float spotExponent();

    @Generated
    @Selector("transform")
    public native GLKEffectPropertyTransform transform();
}
