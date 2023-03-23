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

package apple.modelio;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.modelio.protocol.MDLNamed;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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

/**
 * If a color is encoded in a floatN property, it is to be interpreted as
 * a Rec 709 color.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLMaterialProperty extends NSObject implements MDLNamed, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLMaterialProperty(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLMaterialProperty alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLMaterialProperty allocWithZone(VoidPtr zone);

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
    public static native MDLMaterialProperty new_objc();

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
    @Selector("URLValue")
    public native NSURL URLValue();

    @Generated
    @Selector("color")
    public native CGColorRef color();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("floatValue")
    public native float floatValue();

    @Generated
    @Selector("init")
    public native MDLMaterialProperty init();

    @Generated
    @Selector("initWithName:semantic:")
    public native MDLMaterialProperty initWithNameSemantic(String name, @NUInt long semantic);

    @Generated
    @Selector("initWithName:semantic:URL:")
    public native MDLMaterialProperty initWithNameSemanticURL(String name, @NUInt long semantic, NSURL URL);

    @Generated
    @Selector("initWithName:semantic:color:")
    public native MDLMaterialProperty initWithNameSemanticColor(String name, @NUInt long semantic, CGColorRef color);

    @Generated
    @Selector("initWithName:semantic:float:")
    public native MDLMaterialProperty initWithNameSemanticFloat(String name, @NUInt long semantic, float value);

    @Generated
    @Selector("initWithName:semantic:string:")
    public native MDLMaterialProperty initWithNameSemanticString(String name, @NUInt long semantic, String string);

    @Generated
    @Selector("initWithName:semantic:textureSampler:")
    public native MDLMaterialProperty initWithNameSemanticTextureSampler(String name, @NUInt long semantic,
            MDLTextureSampler textureSampler);

    @Generated
    @Selector("luminance")
    public native float luminance();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("semantic")
    @NUInt
    public native long semantic();

    @Generated
    @Selector("setColor:")
    public native void setColor(CGColorRef value);

    @Generated
    @Selector("setFloatValue:")
    public native void setFloatValue(float value);

    @Generated
    @Selector("setLuminance:")
    public native void setLuminance(float value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setProperties:")
    public native void setProperties(MDLMaterialProperty property);

    @Generated
    @Selector("setSemantic:")
    public native void setSemantic(@NUInt long value);

    @Generated
    @Selector("setStringValue:")
    public native void setStringValue(String value);

    @Generated
    @Selector("setTextureSamplerValue:")
    public native void setTextureSamplerValue(MDLTextureSampler value);

    @Generated
    @Selector("setURLValue:")
    public native void setURLValue(NSURL value);

    @Generated
    @Selector("stringValue")
    public native String stringValue();

    @Generated
    @Selector("textureSamplerValue")
    public native MDLTextureSampler textureSamplerValue();

    @Generated
    @Selector("type")
    @NUInt
    public native long type();

    @Generated
    @Selector("setType:")
    public native void setType(@NUInt long value);
}
