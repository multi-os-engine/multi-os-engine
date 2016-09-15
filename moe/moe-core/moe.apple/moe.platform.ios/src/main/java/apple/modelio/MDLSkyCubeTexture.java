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
import apple.foundation.NSBundle;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLSkyCubeTexture extends MDLTexture {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLSkyCubeTexture(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLSkyCubeTexture alloc();

    /**
     * brightness</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/brightness">iOS Dev Center</a>
     */
    @Generated
    @Selector("brightness")
    public native float brightness();

    /**
     * contrast</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/contrast">iOS Dev Center</a>
     */
    @Generated
    @Selector("contrast")
    public native float contrast();

    /**
     * exposure</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/exposure">iOS Dev Center</a>
     */
    @Generated
    @Selector("exposure")
    public native float exposure();

    /**
     * gamma</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/gamma">iOS Dev Center</a>
     */
    @Generated
    @Selector("gamma")
    public native float gamma();

    /**
     * groundAlbedo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/groundAlbedo">iOS Dev Center</a>
     */
    @Generated
    @Selector("groundAlbedo")
    public native float groundAlbedo();

    /**
     * groundColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/groundColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("groundColor")
    public native CGColorRef groundColor();

    /**
     * horizonElevation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/horizonElevation">iOS Dev Center</a>
     */
    @Generated
    @Selector("horizonElevation")
    public native float horizonElevation();

    @Generated
    @Selector("init")
    public native MDLSkyCubeTexture init();

    /**
     * saturation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/saturation">iOS Dev Center</a>
     */
    @Generated
    @Selector("saturation")
    public native float saturation();

    /**
     * brightness</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/brightness">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBrightness:")
    public native void setBrightness(float value);

    /**
     * contrast</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/contrast">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContrast:")
    public native void setContrast(float value);

    /**
     * exposure</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/exposure">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExposure:")
    public native void setExposure(float value);

    /**
     * gamma</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/gamma">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGamma:")
    public native void setGamma(float value);

    /**
     * groundAlbedo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/groundAlbedo">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGroundAlbedo:")
    public native void setGroundAlbedo(float value);

    /**
     * groundColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/groundColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGroundColor:")
    public native void setGroundColor(CGColorRef value);

    /**
     * horizonElevation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/horizonElevation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHorizonElevation:")
    public native void setHorizonElevation(float value);

    /**
     * saturation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/saturation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSaturation:")
    public native void setSaturation(float value);

    /**
     * sunElevation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/sunElevation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSunElevation:")
    public native void setSunElevation(float value);

    /**
     * turbidity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/turbidity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTurbidity:")
    public native void setTurbidity(float value);

    /**
     * upperAtmosphereScattering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/upperAtmosphereScattering">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUpperAtmosphereScattering:")
    public native void setUpperAtmosphereScattering(float value);

    /**
     * sunElevation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/sunElevation">iOS Dev Center</a>
     */
    @Generated
    @Selector("sunElevation")
    public native float sunElevation();

    @Generated
    @Selector("textureCubeWithImagesNamed:")
    public static native MDLSkyCubeTexture textureCubeWithImagesNamed(NSArray<String> names);

    @Generated
    @Selector("textureCubeWithImagesNamed:bundle:")
    public static native MDLSkyCubeTexture textureCubeWithImagesNamedBundle(NSArray<String> names,
            NSBundle bundleOrNil);

    @Generated
    @Selector("textureNamed:")
    public static native MDLSkyCubeTexture textureNamed(String name);

    @Generated
    @Selector("textureNamed:bundle:")
    public static native MDLSkyCubeTexture textureNamedBundle(String name, NSBundle bundleOrNil);

    /**
     * turbidity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/turbidity">iOS Dev Center</a>
     */
    @Generated
    @Selector("turbidity")
    public native float turbidity();

    /**
     * updateTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instm/MDLSkyCubeTexture/updateTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateTexture")
    public native void updateTexture();

    /**
     * upperAtmosphereScattering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLSkyCubeTexture_Class/index.html#//apple_ref/occ/instp/MDLSkyCubeTexture/upperAtmosphereScattering">iOS Dev Center</a>
     */
    @Generated
    @Selector("upperAtmosphereScattering")
    public native float upperAtmosphereScattering();

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
