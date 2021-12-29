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
 * GLKEffectPropertyFog
 * <p>
 * GLKEffectPropertyFog allows specification of fog parameters and operation per the OpenGL ES 1.1 specification.
 * Fog properties may be enabled or disabled through their enabled property.
 * <p>
 * The default values of the properties of this class are as follows:
 * <p>
 * enabled         GL_TRUE
 * mode            GLKFogModeExp
 * color           { 0.0, 0.0, 0.0, 0.0 }
 * density         1.0
 * start           0.0
 * end             1.0
 */
@Generated
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKEffectPropertyFog extends GLKEffectProperty {
    static {
        NatJ.register();
    }

    @Generated
    protected GLKEffectPropertyFog(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKEffectPropertyFog alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GLKEffectPropertyFog allocWithZone(VoidPtr zone);

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
    public static native GLKEffectPropertyFog new_objc();

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
     * { 0.0, 0.0, 0.0, 0.0 }
     */
    @Generated
    @Selector("color")
    @ByValue
    public native GLKVector4 color();

    /**
     * 1.0
     */
    @Generated
    @Selector("density")
    public native float density();

    /**
     * GL_FALSE
     */
    @Generated
    @Selector("enabled")
    public native byte enabled();

    /**
     * 1.0
     */
    @Generated
    @Selector("end")
    public native float end();

    @Generated
    @Selector("init")
    public native GLKEffectPropertyFog init();

    /**
     * GLKFogModeExp
     */
    @Generated
    @Selector("mode")
    public native int mode();

    /**
     * { 0.0, 0.0, 0.0, 0.0 }
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@ByValue GLKVector4 value);

    /**
     * 1.0
     */
    @Generated
    @Selector("setDensity:")
    public native void setDensity(float value);

    /**
     * GL_FALSE
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(byte value);

    /**
     * 1.0
     */
    @Generated
    @Selector("setEnd:")
    public native void setEnd(float value);

    /**
     * GLKFogModeExp
     */
    @Generated
    @Selector("setMode:")
    public native void setMode(int value);

    /**
     * 0.0
     */
    @Generated
    @Selector("setStart:")
    public native void setStart(float value);

    /**
     * 0.0
     */
    @Generated
    @Selector("start")
    public native float start();
}
