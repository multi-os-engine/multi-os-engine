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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.modelio.MDLCamera;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNTechniqueSupport;
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
public class SCNCamera extends NSObject implements SCNAnimatable, SCNTechniqueSupport, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNCamera(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(CAAnimation animation, String key);

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNCamera alloc();

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * aperture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/aperture">iOS Dev Center</a>
     */
    @Generated
    @Selector("aperture")
    @NFloat
    public native double aperture();

    /**
     * automaticallyAdjustsZRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/automaticallyAdjustsZRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("automaticallyAdjustsZRange")
    public native boolean automaticallyAdjustsZRange();

    /**
     * camera</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/clm/SCNCamera/camera">iOS Dev Center</a>
     */
    @Generated
    @Selector("camera")
    public static native SCNCamera camera();

    /**
     * categoryBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/categoryBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * focalBlurRadius</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/focalBlurRadius">iOS Dev Center</a>
     */
    @Generated
    @Selector("focalBlurRadius")
    @NFloat
    public native double focalBlurRadius();

    /**
     * focalDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/focalDistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("focalDistance")
    @NFloat
    public native double focalDistance();

    /**
     * focalSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/focalSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("focalSize")
    @NFloat
    public native double focalSize();

    @Generated
    @Selector("init")
    public native SCNCamera init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNCamera initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * orthographicScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/orthographicScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("orthographicScale")
    public native double orthographicScale();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    /**
     * projectionTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instm/SCNCamera/projectionTransform">iOS Dev Center</a>
     */
    @Generated
    @Selector("projectionTransform")
    @ByValue
    public native SCNMatrix4 projectionTransform();

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
     * aperture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/aperture">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAperture:")
    public native void setAperture(@NFloat double value);

    /**
     * automaticallyAdjustsZRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/automaticallyAdjustsZRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutomaticallyAdjustsZRange:")
    public native void setAutomaticallyAdjustsZRange(boolean value);

    /**
     * categoryBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/categoryBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * focalBlurRadius</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/focalBlurRadius">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFocalBlurRadius:")
    public native void setFocalBlurRadius(@NFloat double value);

    /**
     * focalDistance</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/focalDistance">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFocalDistance:")
    public native void setFocalDistance(@NFloat double value);

    /**
     * focalSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/focalSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFocalSize:")
    public native void setFocalSize(@NFloat double value);

    /**
     * name</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/name">iOS Dev Center</a>
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * orthographicScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/orthographicScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOrthographicScale:")
    public native void setOrthographicScale(double value);

    /**
     * setProjectionTransform:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instm/SCNCamera/setProjectionTransform:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setProjectionTransform:")
    public native void setProjectionTransform(@ByValue SCNMatrix4 projectionTransform);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(SCNTechnique value);

    /**
     * usesOrthographicProjection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/usesOrthographicProjection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUsesOrthographicProjection:")
    public native void setUsesOrthographicProjection(boolean value);

    /**
     * xFov</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/xFov">iOS Dev Center</a>
     */
    @Generated
    @Selector("setXFov:")
    public native void setXFov(double value);

    /**
     * yFov</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/yFov">iOS Dev Center</a>
     */
    @Generated
    @Selector("setYFov:")
    public native void setYFov(double value);

    /**
     * zFar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/zFar">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZFar:")
    public native void setZFar(double value);

    /**
     * zNear</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/zNear">iOS Dev Center</a>
     */
    @Generated
    @Selector("setZNear:")
    public native void setZNear(double value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    /**
     * usesOrthographicProjection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/usesOrthographicProjection">iOS Dev Center</a>
     */
    @Generated
    @Selector("usesOrthographicProjection")
    public native boolean usesOrthographicProjection();

    /**
     * xFov</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/xFov">iOS Dev Center</a>
     */
    @Generated
    @Selector("xFov")
    public native double xFov();

    /**
     * yFov</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/yFov">iOS Dev Center</a>
     */
    @Generated
    @Selector("yFov")
    public native double yFov();

    /**
     * zFar</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/zFar">iOS Dev Center</a>
     */
    @Generated
    @Selector("zFar")
    public native double zFar();

    /**
     * zNear</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/instp/SCNCamera/zNear">iOS Dev Center</a>
     */
    @Generated
    @Selector("zNear")
    public native double zNear();

    /**
     * cameraWithMDLCamera:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNCamera_Class/index.html#//apple_ref/occ/clm/SCNCamera/cameraWithMDLCamera:">iOS Dev Center</a>
     */
    @Generated
    @Selector("cameraWithMDLCamera:")
    public static native SCNCamera cameraWithMDLCamera(MDLCamera mdlCamera);

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
