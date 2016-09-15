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
import apple.foundation.protocol.NSCoding;
import apple.foundation.protocol.NSCopying;
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

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKShader extends NSObject implements NSCopying, NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKShader(Pointer peer) {
        super(peer);
    }

    /**
     * addUniform:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instm/SKShader/addUniform:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addUniform:")
    public native void addUniform(SKUniform uniform);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKShader alloc();

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
    public native SKShader init();

    @Generated
    @Selector("initWithCoder:")
    public native SKShader initWithCoder(NSCoder aDecoder);

    /**
     * initWithSource:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instm/SKShader/initWithSource:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSource:")
    public native SKShader initWithSource(String source);

    /**
     * initWithSource:uniforms:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instm/SKShader/initWithSource:uniforms:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithSource:uniforms:")
    public native SKShader initWithSourceUniforms(String source, NSArray<? extends SKUniform> uniforms);

    /**
     * removeUniformNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instm/SKShader/removeUniformNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeUniformNamed:")
    public native void removeUniformNamed(String name);

    /**
     * source</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instp/SKShader/source">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSource:")
    public native void setSource(String value);

    /**
     * uniforms</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instp/SKShader/uniforms">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUniforms:")
    public native void setUniforms(NSArray<? extends SKUniform> value);

    /**
     * shader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/clm/SKShader/shader">iOS Dev Center</a>
     */
    @Generated
    @Selector("shader")
    public static native SKShader shader();

    /**
     * shaderWithFileNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/clm/SKShader/shaderWithFileNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shaderWithFileNamed:")
    public static native SKShader shaderWithFileNamed(String name);

    /**
     * shaderWithSource:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/clm/SKShader/shaderWithSource:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shaderWithSource:")
    public static native SKShader shaderWithSource(String source);

    /**
     * shaderWithSource:uniforms:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/clm/SKShader/shaderWithSource:uniforms:">iOS Dev Center</a>
     */
    @Generated
    @Selector("shaderWithSource:uniforms:")
    public static native SKShader shaderWithSourceUniforms(String source, NSArray<? extends SKUniform> uniforms);

    /**
     * source</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instp/SKShader/source">iOS Dev Center</a>
     */
    @Generated
    @Selector("source")
    public native String source();

    /**
     * uniformNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instm/SKShader/uniformNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("uniformNamed:")
    public native SKUniform uniformNamed(String name);

    /**
     * uniforms</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKShader_Ref/index.html#//apple_ref/occ/instp/SKShader/uniforms">iOS Dev Center</a>
     */
    @Generated
    @Selector("uniforms")
    public native NSArray<? extends SKUniform> uniforms();

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
}
