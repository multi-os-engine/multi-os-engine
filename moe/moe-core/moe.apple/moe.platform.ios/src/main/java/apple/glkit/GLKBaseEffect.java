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
import apple.glkit.protocol.GLKNamedEffect;
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
public class GLKBaseEffect extends NSObject implements GLKNamedEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected GLKBaseEffect(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKBaseEffect alloc();

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

    /**
     * GL_FALSE
     */
    @Generated
    @Selector("colorMaterialEnabled")
    public native byte colorMaterialEnabled();

    /**
     * { 1.0, 1.0, 1.0, 1.0 }
     */
    @Generated
    @Selector("constantColor")
    @ByValue
    public native GLKVector4 constantColor();

    /**
     * Disabled
     */
    @Generated
    @Selector("fog")
    public native GLKEffectPropertyFog fog();

    @Generated
    @Selector("init")
    public native GLKBaseEffect init();

    /**
     * @"GLKBaseEffect"
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * Disabled
     */
    @Generated
    @Selector("light0")
    public native GLKEffectPropertyLight light0();

    /**
     * Disabled
     */
    @Generated
    @Selector("light1")
    public native GLKEffectPropertyLight light1();

    /**
     * Disabled
     */
    @Generated
    @Selector("light2")
    public native GLKEffectPropertyLight light2();

    /**
     * { 0.2, 0.2, 0.2, 1.0 }
     */
    @Generated
    @Selector("lightModelAmbientColor")
    @ByValue
    public native GLKVector4 lightModelAmbientColor();

    /**
     * GL_FALSE
     */
    @Generated
    @Selector("lightModelTwoSided")
    public native byte lightModelTwoSided();

    /**
     * GLKLightingTypePerVertex
     */
    @Generated
    @Selector("lightingType")
    public native int lightingType();

    /**
     * Default material state
     */
    @Generated
    @Selector("material")
    public native GLKEffectPropertyMaterial material();

    @Generated
    @Selector("prepareToDraw")
    public native void prepareToDraw();

    /**
     * GL_FALSE
     */
    @Generated
    @Selector("setColorMaterialEnabled:")
    public native void setColorMaterialEnabled(byte value);

    /**
     * { 1.0, 1.0, 1.0, 1.0 }
     */
    @Generated
    @Selector("setConstantColor:")
    public native void setConstantColor(@ByValue GLKVector4 value);

    /**
     * @"GLKBaseEffect"
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * { 0.2, 0.2, 0.2, 1.0 }
     */
    @Generated
    @Selector("setLightModelAmbientColor:")
    public native void setLightModelAmbientColor(@ByValue GLKVector4 value);

    /**
     * GL_FALSE
     */
    @Generated
    @Selector("setLightModelTwoSided:")
    public native void setLightModelTwoSided(byte value);

    /**
     * GLKLightingTypePerVertex
     */
    @Generated
    @Selector("setLightingType:")
    public native void setLightingType(int value);

    /**
     * texture2d0, texture2d1
     */
    @Generated
    @Selector("setTextureOrder:")
    public native void setTextureOrder(NSArray<? extends GLKEffectPropertyTexture> value);

    /**
     * GL_TRUE
     */
    @Generated
    @Selector("setUseConstantColor:")
    public native void setUseConstantColor(byte value);

    /**
     * Disabled
     */
    @Generated
    @Selector("texture2d0")
    public native GLKEffectPropertyTexture texture2d0();

    /**
     * Disabled
     */
    @Generated
    @Selector("texture2d1")
    public native GLKEffectPropertyTexture texture2d1();

    /**
     * texture2d0, texture2d1
     */
    @Generated
    @Selector("textureOrder")
    public native NSArray<? extends GLKEffectPropertyTexture> textureOrder();

    /**
     * Identity Matrices
     */
    @Generated
    @Selector("transform")
    public native GLKEffectPropertyTransform transform();

    /**
     * GL_TRUE
     */
    @Generated
    @Selector("useConstantColor")
    public native byte useConstantColor();
}
