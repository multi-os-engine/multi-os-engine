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
import apple.modelio.protocol.MDLAssetResolver;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * MDLSkyCubeTexture
 * [@summary] A physically realistic sky as a cube texture
 * <p>
 * [@property] sunElevation A value of zero is at the zenith, 0.5 is at the horizon,
 * 1.0 is at the nadir. Use in conjunction with turbidity to give a dawn,
 * dusk, or noon look.
 * [@property] turbidity A value of zero simulates the effect of a clear sky, the sun
 * will impart very little color to the sky. A value of one simulates a
 * great deal of dust and moisture in the sky, and will cause the sun's
 * color to spread across the atmosphere.
 * [@property] upperAtmosphereScattering A value of zero will give very dusky colors,
 * a value of one will give noon-ish saturated colors.
 * [@property] groundAlbedo controls the amount of light that bounces back up into
 * the sky from the ground. A value of zero will yield a clear sky, a
 * value of one will reduce the contrast of the sky, making it a bit foggy.
 * <p>
 * [@property] horizonElevation If the lower half of the environment is being replaced
 * by a color, horizonElevation is angle, in radians, below which the
 * replacement should occur. Negative values are below the horizon.
 * <p>
 * [@property] groundColor If this value is set, the environment will be replaced with
 * the color below the horizonElevation value blended with the w factor up to
 * Pi/2.0 past the horizon.
 * (e.g. w = 0.0 groundColor is applied immediatly on the horizon with no blend
 * w = Pi/2 groundColor is linearly applied all the way to the south pole)
 * NOTE: To maintain default behavior a simple length(groundColor) != 0 is used to determine
 * if we want to set the ground color (e.g. black and blended immediatly
 * on the horizon use (0.0, 0.0, 0.0, 0.0000001))
 * 4 component treats the first 3 components as color and w as blend factor
 * 3 component treats the first 3 components as color and 0 as blend factor
 * 2 component treats the first component as greyscale color and y as blend factor
 * 1 component treats the scalar component as greyscale color and 0 as blend factor
 * <p>
 * [@property] gamma Modifies the amount of gamma correction applied during
 * tone mapping.
 * [@property] exposure Modifies the exposure applied during tone mapping.
 * [@property] brighness Modifies the brightness of the image during tone mapping.
 * [@property] contrast Modifies the contrast of the image during tone mapping.
 * [@property] saturation Modifes the saturation of the image during tone mapping.
 * [@property] highDynamicRangeCompression values below the x component of this value
 * are not compressed during tone mapping. Values between the x component
 * and y component are compressed to the maximum brightness value during
 * tone mapping. Values above the limit are clamped.
 * <p>
 * the texture will be created if data is referenced, otherwise, this
 * object is merely a description. All parameters have legal values between zero and one.
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLSkyCubeTexture alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLSkyCubeTexture allocWithZone(VoidPtr zone);

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
    public static native MDLSkyCubeTexture new_objc();

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

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("brightness")
    public native float brightness();

    @Generated
    @Selector("contrast")
    public native float contrast();

    @Generated
    @Selector("exposure")
    public native float exposure();

    @Generated
    @Selector("gamma")
    public native float gamma();

    @Generated
    @Selector("groundAlbedo")
    public native float groundAlbedo();

    @Generated
    @Selector("groundColor")
    public native CGColorRef groundColor();

    @Generated
    @Selector("horizonElevation")
    public native float horizonElevation();

    @Generated
    @Selector("init")
    public native MDLSkyCubeTexture init();

    @Generated
    @Selector("saturation")
    public native float saturation();

    @Generated
    @Selector("setBrightness:")
    public native void setBrightness(float value);

    @Generated
    @Selector("setContrast:")
    public native void setContrast(float value);

    @Generated
    @Selector("setExposure:")
    public native void setExposure(float value);

    @Generated
    @Selector("setGamma:")
    public native void setGamma(float value);

    @Generated
    @Selector("setGroundAlbedo:")
    public native void setGroundAlbedo(float value);

    @Generated
    @Selector("setGroundColor:")
    public native void setGroundColor(CGColorRef value);

    @Generated
    @Selector("setHorizonElevation:")
    public native void setHorizonElevation(float value);

    @Generated
    @Selector("setSaturation:")
    public native void setSaturation(float value);

    @Generated
    @Selector("setSunElevation:")
    public native void setSunElevation(float value);

    @Generated
    @Selector("setTurbidity:")
    public native void setTurbidity(float value);

    @Generated
    @Selector("setUpperAtmosphereScattering:")
    public native void setUpperAtmosphereScattering(float value);

    @Generated
    @Selector("sunElevation")
    public native float sunElevation();

    @Generated
    @Selector("turbidity")
    public native float turbidity();

    /**
     * Call updateTexture if parameters have been changed and a new sky is required.
     */
    @Generated
    @Selector("updateTexture")
    public native void updateTexture();

    @Generated
    @Selector("upperAtmosphereScattering")
    public native float upperAtmosphereScattering();

    @Generated
    @Selector("setSunAzimuth:")
    public native void setSunAzimuth(float value);

    @Generated
    @Selector("sunAzimuth")
    public native float sunAzimuth();

    @Generated
    @Selector("textureNamed:assetResolver:")
    public static native MDLSkyCubeTexture textureNamedAssetResolver(String name,
            @Mapped(ObjCObjectMapper.class) MDLAssetResolver resolver);
}
