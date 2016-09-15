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
import apple.foundation.protocol.NSSecureCoding;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.struct.SCNMatrix4;
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
public class SCNMaterialProperty extends NSObject implements SCNAnimatable, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNMaterialProperty(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(CAAnimation animation, String key);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNMaterialProperty alloc();

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * borderColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/borderColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("borderColor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object borderColor();

    /**
     * contents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/contents">iOS Dev Center</a>
     */
    @Generated
    @Selector("contents")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object contents();

    /**
     * contentsTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/contentsTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentsTransform")
    @ByValue
    public native SCNMatrix4 contentsTransform();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("init")
    public native SCNMaterialProperty init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNMaterialProperty initWithCoder(NSCoder aDecoder);

    /**
     * intensity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/intensity">iOS Dev Center</a>
     */
    @Generated
    @Selector("intensity")
    @NFloat
    public native double intensity();

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * magnificationFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/magnificationFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("magnificationFilter")
    @NInt
    public native long magnificationFilter();

    /**
     * mappingChannel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/mappingChannel">iOS Dev Center</a>
     */
    @Generated
    @Selector("mappingChannel")
    @NInt
    public native long mappingChannel();

    /**
     * materialPropertyWithContents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/clm/SCNMaterialProperty/materialPropertyWithContents:">iOS Dev Center</a>
     */
    @Generated
    @Selector("materialPropertyWithContents:")
    public static native SCNMaterialProperty materialPropertyWithContents(
            @Mapped(ObjCObjectMapper.class) Object contents);

    /**
     * maxAnisotropy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/maxAnisotropy">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxAnisotropy")
    @NFloat
    public native double maxAnisotropy();

    /**
     * minificationFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/minificationFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("minificationFilter")
    @NInt
    public native long minificationFilter();

    /**
     * mipFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/mipFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("mipFilter")
    @NInt
    public native long mipFilter();

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
     * borderColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/borderColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBorderColor:")
    public native void setBorderColor(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * contents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/contents">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContents:")
    public native void setContents(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * contentsTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/contentsTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentsTransform:")
    public native void setContentsTransform(@ByValue SCNMatrix4 value);

    /**
     * intensity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/intensity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIntensity:")
    public native void setIntensity(@NFloat double value);

    /**
     * magnificationFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/magnificationFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMagnificationFilter:")
    public native void setMagnificationFilter(@NInt long value);

    /**
     * mappingChannel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/mappingChannel">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMappingChannel:")
    public native void setMappingChannel(@NInt long value);

    /**
     * maxAnisotropy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/maxAnisotropy">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaxAnisotropy:")
    public native void setMaxAnisotropy(@NFloat double value);

    /**
     * minificationFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/minificationFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinificationFilter:")
    public native void setMinificationFilter(@NInt long value);

    /**
     * mipFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/mipFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMipFilter:")
    public native void setMipFilter(@NInt long value);

    /**
     * wrapS</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/wrapS">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWrapS:")
    public native void setWrapS(@NInt long value);

    /**
     * wrapT</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/wrapT">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWrapT:")
    public native void setWrapT(@NInt long value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * wrapS</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/wrapS">iOS Dev Center</a>
     */
    @Generated
    @Selector("wrapS")
    @NInt
    public native long wrapS();

    /**
     * wrapT</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNMaterialProperty_Class/index.html#//apple_ref/occ/instp/SCNMaterialProperty/wrapT">iOS Dev Center</a>
     */
    @Generated
    @Selector("wrapT")
    @NInt
    public native long wrapT();

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
