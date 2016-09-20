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
    @Owned
    @Selector("alloc")
    public static native GLKEffectPropertyLight alloc();

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
     * ambientColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/ambientColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("ambientColor")
    @ByValue
    public native GLKVector4 ambientColor();

    /**
     * constantAttenuation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/constantAttenuation">iOS Dev Center</a>
     */
    @Generated
    @Selector("constantAttenuation")
    public native float constantAttenuation();

    /**
     * diffuseColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/diffuseColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("diffuseColor")
    @ByValue
    public native GLKVector4 diffuseColor();

    /**
     * enabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/enabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("enabled")
    public native byte enabled();

    @Generated
    @Selector("init")
    public native GLKEffectPropertyLight init();

    /**
     * linearAttenuation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/linearAttenuation">iOS Dev Center</a>
     */
    @Generated
    @Selector("linearAttenuation")
    public native float linearAttenuation();

    /**
     * position</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/position">iOS Dev Center</a>
     */
    @Generated
    @Selector("position")
    @ByValue
    public native GLKVector4 position();

    /**
     * quadraticAttenuation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/quadraticAttenuation">iOS Dev Center</a>
     */
    @Generated
    @Selector("quadraticAttenuation")
    public native float quadraticAttenuation();

    /**
     * ambientColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/ambientColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAmbientColor:")
    public native void setAmbientColor(@ByValue GLKVector4 value);

    /**
     * constantAttenuation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/constantAttenuation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setConstantAttenuation:")
    public native void setConstantAttenuation(float value);

    /**
     * diffuseColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/diffuseColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDiffuseColor:")
    public native void setDiffuseColor(@ByValue GLKVector4 value);

    /**
     * enabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/enabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(byte value);

    /**
     * linearAttenuation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/linearAttenuation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLinearAttenuation:")
    public native void setLinearAttenuation(float value);

    /**
     * position</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/position">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue GLKVector4 value);

    /**
     * quadraticAttenuation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/quadraticAttenuation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setQuadraticAttenuation:")
    public native void setQuadraticAttenuation(float value);

    /**
     * specularColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/specularColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpecularColor:")
    public native void setSpecularColor(@ByValue GLKVector4 value);

    /**
     * spotCutoff</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/spotCutoff">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpotCutoff:")
    public native void setSpotCutoff(float value);

    /**
     * spotDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/spotDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpotDirection:")
    public native void setSpotDirection(@ByValue GLKVector3 value);

    /**
     * spotExponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/spotExponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpotExponent:")
    public native void setSpotExponent(float value);

    /**
     * transform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/transform">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTransform:")
    public native void setTransform(GLKEffectPropertyTransform value);

    /**
     * specularColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/specularColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("specularColor")
    @ByValue
    public native GLKVector4 specularColor();

    /**
     * spotCutoff</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/spotCutoff">iOS Dev Center</a>
     */
    @Generated
    @Selector("spotCutoff")
    public native float spotCutoff();

    /**
     * spotDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/spotDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("spotDirection")
    @ByValue
    public native GLKVector3 spotDirection();

    /**
     * spotExponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/spotExponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("spotExponent")
    public native float spotExponent();

    /**
     * transform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GLkit/Reference/GLKEffectPropertyLight_ClassRef/index.html#//apple_ref/occ/instp/GLKEffectPropertyLight/transform">iOS Dev Center</a>
     */
    @Generated
    @Selector("transform")
    public native GLKEffectPropertyTransform transform();
}
