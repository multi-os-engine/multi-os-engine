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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.modelio.MDLLight;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNTechniqueSupport;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class SCNLight extends NSObject implements SCNAnimatable, SCNTechniqueSupport, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNLight(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNLight alloc();

    /**
     * light</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/clm/SCNLight/light">iOS Dev Center</a>
     */
    @Generated
    @Selector("light")
    public static native SCNLight light();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * lightWithMDLLight:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/clm/SCNLight/lightWithMDLLight:">iOS Dev Center</a>
     */
    @Generated
    @Selector("lightWithMDLLight:")
    public static native SCNLight lightWithMDLLight(MDLLight mdlLight);

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

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(CAAnimation animation, String key);

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * attenuationEndDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/attenuationEndDistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("attenuationEndDistance")
    @NFloat
    public native double attenuationEndDistance();

    /**
     * attenuationFalloffExponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/attenuationFalloffExponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("attenuationFalloffExponent")
    @NFloat
    public native double attenuationFalloffExponent();

    /**
     * attenuationStartDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/attenuationStartDistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("attenuationStartDistance")
    @NFloat
    public native double attenuationStartDistance();

    /**
     * castsShadow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/castsShadow">iOS Dev Center</a>
     */
    @Generated
    @Selector("castsShadow")
    public native boolean castsShadow();

    /**
     * categoryBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/categoryBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("color")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object color();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * gobo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/gobo">iOS Dev Center</a>
     */
    @Generated
    @Selector("gobo")
    public native SCNMaterialProperty gobo();

    @Generated
    @Selector("init")
    public native SCNLight init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNLight initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * orthographicScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/orthographicScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("orthographicScale")
    @NFloat
    public native double orthographicScale();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    /**
     * attenuationEndDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/attenuationEndDistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttenuationEndDistance:")
    public native void setAttenuationEndDistance(@NFloat double value);

    /**
     * attenuationFalloffExponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/attenuationFalloffExponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttenuationFalloffExponent:")
    public native void setAttenuationFalloffExponent(@NFloat double value);

    /**
     * attenuationStartDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/attenuationStartDistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAttenuationStartDistance:")
    public native void setAttenuationStartDistance(@NFloat double value);

    /**
     * castsShadow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/castsShadow">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCastsShadow:")
    public native void setCastsShadow(boolean value);

    /**
     * categoryBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/categoryBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * color</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/color">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * orthographicScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/orthographicScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOrthographicScale:")
    public native void setOrthographicScale(@NFloat double value);

    /**
     * shadowBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShadowBias:")
    public native void setShadowBias(@NFloat double value);

    /**
     * shadowColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * shadowMapSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowMapSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShadowMapSize:")
    public native void setShadowMapSize(@ByValue CGSize value);

    /**
     * shadowMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShadowMode:")
    public native void setShadowMode(@NInt long value);

    /**
     * shadowRadius</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowRadius">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShadowRadius:")
    public native void setShadowRadius(@NFloat double value);

    /**
     * shadowSampleCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowSampleCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShadowSampleCount:")
    public native void setShadowSampleCount(@NUInt long value);

    /**
     * spotInnerAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/spotInnerAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpotInnerAngle:")
    public native void setSpotInnerAngle(@NFloat double value);

    /**
     * spotOuterAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/spotOuterAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpotOuterAngle:")
    public native void setSpotOuterAngle(@NFloat double value);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(SCNTechnique value);

    /**
     * type</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/type">iOS Dev Center</a>
     */
    @Generated
    @Selector("setType:")
    public native void setType(String value);

    /**
     * zFar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/zFar">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZFar:")
    public native void setZFar(@NFloat double value);

    /**
     * zNear</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/zNear">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZNear:")
    public native void setZNear(@NFloat double value);

    /**
     * shadowBias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowBias">iOS Dev Center</a>
     */
    @Generated
    @Selector("shadowBias")
    @NFloat
    public native double shadowBias();

    /**
     * shadowColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("shadowColor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object shadowColor();

    /**
     * shadowMapSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowMapSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("shadowMapSize")
    @ByValue
    public native CGSize shadowMapSize();

    /**
     * shadowMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("shadowMode")
    @NInt
    public native long shadowMode();

    /**
     * shadowRadius</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowRadius">iOS Dev Center</a>
     */
    @Generated
    @Selector("shadowRadius")
    @NFloat
    public native double shadowRadius();

    /**
     * shadowSampleCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/shadowSampleCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("shadowSampleCount")
    @NUInt
    public native long shadowSampleCount();

    /**
     * spotInnerAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/spotInnerAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("spotInnerAngle")
    @NFloat
    public native double spotInnerAngle();

    /**
     * spotOuterAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/spotOuterAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("spotOuterAngle")
    @NFloat
    public native double spotOuterAngle();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    /**
     * type</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/type">iOS Dev Center</a>
     */
    @Generated
    @Selector("type")
    public native String type();

    /**
     * zFar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/zFar">iOS Dev Center</a>
     */
    @Generated
    @Selector("zFar")
    @NFloat
    public native double zFar();

    /**
     * zNear</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNLight_Class/index.html#//apple_ref/occ/instp/SCNLight/zNear">iOS Dev Center</a>
     */
    @Generated
    @Selector("zNear")
    @NFloat
    public native double zNear();
}
