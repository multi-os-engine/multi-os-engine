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
 * GLKEffectPropertyLight
 * <p>
 * GLKEffectPropertyLight provides a single directional or spot light for an GLKEffect
 * in accordance with the OpenGL ES 1.1 specification.
 * <p>
 * Per the OpenGL ES 1.1 specification, light position and directions are transformed
 * by the modelview matrix. Accordingly, GLKEffectPropertyLight has a transform property.
 * If light transformation is required the transform property must be explicitly set
 * for light properties.
 * <p>
 * In order for lighting calculations to function properly, clients of GLKEffectPropertyLight
 * must enable the vertex attribute array GLKVertexAttribNormal to provide normals for
 * lighting calculations. The normals are always normalized.
 * <p>
 * The default values for GLKEffectPropertyLight properties are as follows:
 * <p>
 * { 0, 0, 1, 0}, // position
 * { 0, 0, 0, 1}, // ambient color
 * { 1, 1, 1, 1}, // diffuse color
 * { 1, 1, 1, 1}, // specular color
 * { 0, 0, -1}, // spot direction
 * 0, // spot exponent
 * 180, // spot cutoff
 * 1, // constant attenuation
 * 0, // linear attenuation
 * 0, // quadratic attenuation
 * <p>
 * Note that, as with OpenGL ES 1.1 differentiation between a directional and spot light
 * pivots on the value specified for _spotCutoff. A _spotCutoff of 180.0, the default
 * value, indicates a directional light while values less than 180.0 indicates a
 * spot light.
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GLKEffectPropertyLight allocWithZone(VoidPtr zone);

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
    public static native GLKEffectPropertyLight new_objc();

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
     * { 0.0, 0.0, 0.0, 1.0 }
     */
    @Generated
    @Selector("ambientColor")
    @ByValue
    public native GLKVector4 ambientColor();

    /**
     * 1.0, 0.0, 0.0
     */
    @Generated
    @Selector("constantAttenuation")
    public native float constantAttenuation();

    /**
     * { 1.0, 1.0, 1.0, 1.0 }
     */
    @Generated
    @Selector("diffuseColor")
    @ByValue
    public native GLKVector4 diffuseColor();

    /**
     * GL_TRUE
     */
    @Generated
    @Selector("enabled")
    public native byte enabled();

    @Generated
    @Selector("init")
    public native GLKEffectPropertyLight init();

    /**
     * 1.0, 0.0, 0.0
     */
    @Generated
    @Selector("linearAttenuation")
    public native float linearAttenuation();

    /**
     * { 0.0, 0.0, 0.0, 1.0 }
     */
    @Generated
    @Selector("position")
    @ByValue
    public native GLKVector4 position();

    /**
     * 1.0, 0.0, 0.0
     */
    @Generated
    @Selector("quadraticAttenuation")
    public native float quadraticAttenuation();

    /**
     * { 0.0, 0.0, 0.0, 1.0 }
     */
    @Generated
    @Selector("setAmbientColor:")
    public native void setAmbientColor(@ByValue GLKVector4 value);

    /**
     * 1.0, 0.0, 0.0
     */
    @Generated
    @Selector("setConstantAttenuation:")
    public native void setConstantAttenuation(float value);

    /**
     * { 1.0, 1.0, 1.0, 1.0 }
     */
    @Generated
    @Selector("setDiffuseColor:")
    public native void setDiffuseColor(@ByValue GLKVector4 value);

    /**
     * GL_TRUE
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(byte value);

    /**
     * 1.0, 0.0, 0.0
     */
    @Generated
    @Selector("setLinearAttenuation:")
    public native void setLinearAttenuation(float value);

    /**
     * { 0.0, 0.0, 0.0, 1.0 }
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue GLKVector4 value);

    /**
     * 1.0, 0.0, 0.0
     */
    @Generated
    @Selector("setQuadraticAttenuation:")
    public native void setQuadraticAttenuation(float value);

    /**
     * { 1.0, 1.0, 1.0, 1.0 }
     */
    @Generated
    @Selector("setSpecularColor:")
    public native void setSpecularColor(@ByValue GLKVector4 value);

    /**
     * 180.0
     */
    @Generated
    @Selector("setSpotCutoff:")
    public native void setSpotCutoff(float value);

    /**
     * { 0.0, 0.0, -1.0 }
     */
    @Generated
    @Selector("setSpotDirection:")
    public native void setSpotDirection(@ByValue GLKVector3 value);

    /**
     * 0.0
     */
    @Generated
    @Selector("setSpotExponent:")
    public native void setSpotExponent(float value);

    /**
     * All identity matrices
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(GLKEffectPropertyTransform value);

    /**
     * { 1.0, 1.0, 1.0, 1.0 }
     */
    @Generated
    @Selector("specularColor")
    @ByValue
    public native GLKVector4 specularColor();

    /**
     * 180.0
     */
    @Generated
    @Selector("spotCutoff")
    public native float spotCutoff();

    /**
     * { 0.0, 0.0, -1.0 }
     */
    @Generated
    @Selector("spotDirection")
    @ByValue
    public native GLKVector3 spotDirection();

    /**
     * 0.0
     */
    @Generated
    @Selector("spotExponent")
    public native float spotExponent();

    /**
     * All identity matrices
     */
    @Generated
    @Selector("transform")
    public native GLKEffectPropertyTransform transform();
}
