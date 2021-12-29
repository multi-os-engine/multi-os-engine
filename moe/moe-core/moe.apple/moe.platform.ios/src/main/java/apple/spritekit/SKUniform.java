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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.glkit.struct.GLKMatrix2;
import apple.glkit.struct.GLKMatrix3;
import apple.glkit.struct.GLKMatrix4;
import apple.glkit.struct.GLKVector2;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKUniform extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKUniform(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKUniform alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKUniform allocWithZone(VoidPtr zone);

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
    public static native SKUniform new_objc();

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

    /**
     * Create a shader uniform with a given name.
     *
     * @param name the name of the shader uniform.
     */
    @Generated
    @Selector("uniformWithName:")
    public static native SKUniform uniformWithName(String name);

    /**
     * Create a shader uniform with a given name, and a float value
     *
     * @param name  the name of the shader uniform.
     * @param value the floating point value associated with this uniform.
     */
    @Generated
    @Selector("uniformWithName:float:")
    public static native SKUniform uniformWithNameFloat(String name, float value);

    @Generated
    @Selector("uniformWithName:floatMatrix2:")
    public static native SKUniform uniformWithNameFloatMatrix2(String name, @ByValue GLKMatrix2 value);

    @Generated
    @Selector("uniformWithName:floatMatrix3:")
    public static native SKUniform uniformWithNameFloatMatrix3(String name, @ByValue GLKMatrix3 value);

    @Generated
    @Selector("uniformWithName:floatMatrix4:")
    public static native SKUniform uniformWithNameFloatMatrix4(String name, @ByValue GLKMatrix4 value);

    @Generated
    @Selector("uniformWithName:floatVector2:")
    public static native SKUniform uniformWithNameFloatVector2(String name, @ByValue GLKVector2 value);

    @Generated
    @Selector("uniformWithName:floatVector3:")
    public static native SKUniform uniformWithNameFloatVector3(String name, @ByValue GLKVector3 value);

    @Generated
    @Selector("uniformWithName:floatVector4:")
    public static native SKUniform uniformWithNameFloatVector4(String name, @ByValue GLKVector4 value);

    /**
     * Create a shader uniform with a given name, and texture data
     *
     * @param name    the name of the shader uniform.
     * @param texture the texture data associated with this uniform.
     */
    @Generated
    @Selector("uniformWithName:texture:")
    public static native SKUniform uniformWithNameTexture(String name, SKTexture texture);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("floatMatrix2Value")
    @ByValue
    public native GLKMatrix2 floatMatrix2Value();

    @Generated
    @Selector("floatMatrix3Value")
    @ByValue
    public native GLKMatrix3 floatMatrix3Value();

    @Generated
    @Selector("floatMatrix4Value")
    @ByValue
    public native GLKMatrix4 floatMatrix4Value();

    /**
     * Access to the value associated with the uniform
     */
    @Generated
    @Selector("floatValue")
    public native float floatValue();

    @Generated
    @Selector("floatVector2Value")
    @ByValue
    public native GLKVector2 floatVector2Value();

    @Generated
    @Selector("floatVector3Value")
    @ByValue
    public native GLKVector3 floatVector3Value();

    @Generated
    @Selector("floatVector4Value")
    @ByValue
    public native GLKVector4 floatVector4Value();

    @Generated
    @Selector("init")
    public native SKUniform init();

    @Generated
    @Selector("initWithCoder:")
    public native SKUniform initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithName:")
    public native SKUniform initWithName(String name);

    @Generated
    @Selector("initWithName:float:")
    public native SKUniform initWithNameFloat(String name, float value);

    @Generated
    @Selector("initWithName:floatMatrix2:")
    public native SKUniform initWithNameFloatMatrix2(String name, @ByValue GLKMatrix2 value);

    @Generated
    @Selector("initWithName:floatMatrix3:")
    public native SKUniform initWithNameFloatMatrix3(String name, @ByValue GLKMatrix3 value);

    @Generated
    @Selector("initWithName:floatMatrix4:")
    public native SKUniform initWithNameFloatMatrix4(String name, @ByValue GLKMatrix4 value);

    @Generated
    @Selector("initWithName:floatVector2:")
    public native SKUniform initWithNameFloatVector2(String name, @ByValue GLKVector2 value);

    @Generated
    @Selector("initWithName:floatVector3:")
    public native SKUniform initWithNameFloatVector3(String name, @ByValue GLKVector3 value);

    @Generated
    @Selector("initWithName:floatVector4:")
    public native SKUniform initWithNameFloatVector4(String name, @ByValue GLKVector4 value);

    @Generated
    @Selector("initWithName:texture:")
    public native SKUniform initWithNameTexture(String name, SKTexture texture);

    /**
     * The name by which this uniform will be referenced in a shader
     */
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("setFloatMatrix2Value:")
    public native void setFloatMatrix2Value(@ByValue GLKMatrix2 value);

    @Generated
    @Selector("setFloatMatrix3Value:")
    public native void setFloatMatrix3Value(@ByValue GLKMatrix3 value);

    @Generated
    @Selector("setFloatMatrix4Value:")
    public native void setFloatMatrix4Value(@ByValue GLKMatrix4 value);

    /**
     * Access to the value associated with the uniform
     */
    @Generated
    @Selector("setFloatValue:")
    public native void setFloatValue(float value);

    @Generated
    @Selector("setFloatVector2Value:")
    public native void setFloatVector2Value(@ByValue GLKVector2 value);

    @Generated
    @Selector("setFloatVector3Value:")
    public native void setFloatVector3Value(@ByValue GLKVector3 value);

    @Generated
    @Selector("setFloatVector4Value:")
    public native void setFloatVector4Value(@ByValue GLKVector4 value);

    /**
     * Access to the texture data associated with the current uniform
     */
    @Generated
    @Selector("setTextureValue:")
    public native void setTextureValue(SKTexture value);

    /**
     * Access to the texture data associated with the current uniform
     */
    @Generated
    @Selector("textureValue")
    public native SKTexture textureValue();

    /**
     * Once created, a uniform is locked to a specific type, you may only access the property of this type
     */
    @Generated
    @Selector("uniformType")
    @NInt
    public native long uniformType();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
