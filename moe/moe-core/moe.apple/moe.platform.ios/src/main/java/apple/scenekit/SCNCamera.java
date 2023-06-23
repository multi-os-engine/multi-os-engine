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
import apple.scenekit.protocol.SCNAnimation;
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
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNCamera
 * 
 * SCNCamera represents a camera that can be attached to a SCNNode.
 * 
 * A node with a camera can be used as a point of view to visualize a 3D scene.
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNCamera alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNCamera allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * camera
     * 
     * Creates and returns a camera instance.
     */
    @Generated
    @Selector("camera")
    public static native SCNCamera camera();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("cameraWithMDLCamera:")
    public static native SCNCamera cameraWithMDLCamera(@NotNull MDLCamera mdlCamera);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNCamera new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@NotNull @Mapped(ObjCObjectMapper.class) SCNAnimation animation,
            @Nullable String key);

    @Nullable
    @Deprecated
    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * [@property] aperture
     * 
     * Determines the receiver's aperture. Animatable.
     * 
     * Defaults to 1/8.0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -[SCNCamera fStop] instead with fStop = sensorHeight / aperture.
     */
    @Deprecated
    @Generated
    @Selector("aperture")
    @NFloat
    public native double aperture();

    /**
     * [@property] automaticallyAdjustsZRange
     * 
     * Determines whether the receiver automatically adjusts the zFar value. Defaults to NO.
     * 
     * When set to YES, the near and far planes are automatically set to fit the bounding box of the entire scene at
     * render time.
     */
    @Generated
    @Selector("automaticallyAdjustsZRange")
    public native boolean automaticallyAdjustsZRange();

    /**
     * [@property] averageGray
     * 
     * Determines the average gray level desired in the final image. Defaults to 0.18.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("averageGray")
    @NFloat
    public native double averageGray();

    /**
     * [@property] bloomBlurRadius
     * 
     * Determines the radius of the bloom effect in points. Animatable. Defaults to 4.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("bloomBlurRadius")
    @NFloat
    public native double bloomBlurRadius();

    /**
     * [@property] bloomIntensity
     * 
     * Determines the intensity of the bloom effect. Animatable. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("bloomIntensity")
    @NFloat
    public native double bloomIntensity();

    /**
     * [@property] bloomThreshold
     * 
     * Determines the luminance threshold for the bloom effect. Animatable. Defaults to 1.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("bloomThreshold")
    @NFloat
    public native double bloomThreshold();

    /**
     * [@property] categoryBitMask
     * 
     * Determines the node categories that are visible from the receiver. Defaults to all bits set.
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    /**
     * [@property] colorFringeIntensity
     * 
     * Controls the intensity of the color shift effect. Defaults to 1.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("colorFringeIntensity")
    @NFloat
    public native double colorFringeIntensity();

    /**
     * [@property] colorFringeStrength
     * 
     * Controls the strength of the color shift effect. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("colorFringeStrength")
    @NFloat
    public native double colorFringeStrength();

    /**
     * [@property] colorGrading
     * 
     * Specifies a lookup texture to apply color grading. The contents must a 2D image representing `n` slices of a unit
     * color cube texture, arranged in an horizontal row of `n` images. For instance, a color cube of dimension 16x16x16
     * should be provided as an image of size 256x16.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("colorGrading")
    public native SCNMaterialProperty colorGrading();

    /**
     * [@property] contrast
     * 
     * Controls the overall contrast of the scene. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("contrast")
    @NFloat
    public native double contrast();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] exposureAdaptationBrighteningSpeedFactor
     * 
     * Determines the exposure adaptation speed when going from bright areas to dark areas. Defaults to 0.4.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("exposureAdaptationBrighteningSpeedFactor")
    @NFloat
    public native double exposureAdaptationBrighteningSpeedFactor();

    /**
     * [@property] exposureAdaptationDarkeningSpeedFactor
     * 
     * Determines the exposure adaptation speed when going from dark areas to bright areas. Defaults to 0.6.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("exposureAdaptationDarkeningSpeedFactor")
    @NFloat
    public native double exposureAdaptationDarkeningSpeedFactor();

    /**
     * [@property] exposureOffset
     * 
     * Determines the logarithmic exposure biasing, in EV. Defaults to 0.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("exposureOffset")
    @NFloat
    public native double exposureOffset();

    /**
     * [@property] focalBlurRadius
     * 
     * Determines the receiver's focal radius. Animatable.
     * 
     * Determines the maximum amount of blur for objects out of focus. Defaults to 0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use fStop instead
     */
    @Deprecated
    @Generated
    @Selector("focalBlurRadius")
    @NFloat
    public native double focalBlurRadius();

    /**
     * [@property] focalDistance
     * 
     * Determines the receiver's focal distance. Animatable.
     * 
     * When non zero, the focal distance determines how the camera focuses the objects in the 3d scene. Defaults to 10.0
     * prior to macOS 10.13, iOS 11, tvOS 11 and watchOS 4. Defaults to 2.5 otherwise.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("focalDistance")
    @NFloat
    public native double focalDistance();

    /**
     * [@property] focalSize
     * 
     * Determines the receiver's focal size. Animatable.
     * 
     * Determines the size of the area around focalDistance where the objects are in focus. Defaults to 0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("focalSize")
    @NFloat
    public native double focalSize();

    @Generated
    @Selector("init")
    public native SCNCamera init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNCamera initWithCoder(@NotNull NSCoder coder);

    @Deprecated
    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(@NotNull String key);

    /**
     * [@property] maximumExposure
     * 
     * Determines the maximum exposure offset of the adaptation, in EV. Defaults to -15.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("maximumExposure")
    @NFloat
    public native double maximumExposure();

    /**
     * [@property] minimumExposure
     * 
     * Determines the minimum exposure offset of the adaptation, in EV. Defaults to -15.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("minimumExposure")
    @NFloat
    public native double minimumExposure();

    /**
     * [@property] motionBlurIntensity
     * 
     * Determines the intensity of the motion blur. Animatable. Defaults to 0.
     * 
     * An intensity of zero means no motion blur. The intensity should not exceeed 1.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("motionBlurIntensity")
    @NFloat
    public native double motionBlurIntensity();

    /**
     * [@property] name
     * 
     * Determines the name of the receiver.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] orthographicScale
     * 
     * Determines the receiver's orthographic scale value. Animatable. Defaults to 1.
     * 
     * This setting determines the size of the camera's visible area. This is only enabled when
     * usesOrthographicProjection is set to YES.
     */
    @Generated
    @Selector("orthographicScale")
    public native double orthographicScale();

    @Deprecated
    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(@NotNull String key);

    /**
     * [@property] projectionTransform
     * 
     * Determines the projection transform used by the camera to project the world onscreen.
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
    public native void removeAnimationForKey(@NotNull String key);

    @Deprecated
    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(@NotNull String key, @NFloat double duration);

    @Deprecated
    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(@NotNull String key);

    /**
     * [@property] saturation
     * 
     * Controls the overall saturation of the scene. Defaults to 1 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("saturation")
    @NFloat
    public native double saturation();

    /**
     * [@property] aperture
     * 
     * Determines the receiver's aperture. Animatable.
     * 
     * Defaults to 1/8.0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -[SCNCamera fStop] instead with fStop = sensorHeight / aperture.
     */
    @Deprecated
    @Generated
    @Selector("setAperture:")
    public native void setAperture(@NFloat double value);

    /**
     * [@property] automaticallyAdjustsZRange
     * 
     * Determines whether the receiver automatically adjusts the zFar value. Defaults to NO.
     * 
     * When set to YES, the near and far planes are automatically set to fit the bounding box of the entire scene at
     * render time.
     */
    @Generated
    @Selector("setAutomaticallyAdjustsZRange:")
    public native void setAutomaticallyAdjustsZRange(boolean value);

    /**
     * [@property] averageGray
     * 
     * Determines the average gray level desired in the final image. Defaults to 0.18.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setAverageGray:")
    public native void setAverageGray(@NFloat double value);

    /**
     * [@property] bloomBlurRadius
     * 
     * Determines the radius of the bloom effect in points. Animatable. Defaults to 4.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setBloomBlurRadius:")
    public native void setBloomBlurRadius(@NFloat double value);

    /**
     * [@property] bloomIntensity
     * 
     * Determines the intensity of the bloom effect. Animatable. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setBloomIntensity:")
    public native void setBloomIntensity(@NFloat double value);

    /**
     * [@property] bloomThreshold
     * 
     * Determines the luminance threshold for the bloom effect. Animatable. Defaults to 1.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setBloomThreshold:")
    public native void setBloomThreshold(@NFloat double value);

    /**
     * [@property] categoryBitMask
     * 
     * Determines the node categories that are visible from the receiver. Defaults to all bits set.
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * [@property] colorFringeIntensity
     * 
     * Controls the intensity of the color shift effect. Defaults to 1.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setColorFringeIntensity:")
    public native void setColorFringeIntensity(@NFloat double value);

    /**
     * [@property] colorFringeStrength
     * 
     * Controls the strength of the color shift effect. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setColorFringeStrength:")
    public native void setColorFringeStrength(@NFloat double value);

    /**
     * [@property] contrast
     * 
     * Controls the overall contrast of the scene. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setContrast:")
    public native void setContrast(@NFloat double value);

    /**
     * [@property] exposureAdaptationBrighteningSpeedFactor
     * 
     * Determines the exposure adaptation speed when going from bright areas to dark areas. Defaults to 0.4.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setExposureAdaptationBrighteningSpeedFactor:")
    public native void setExposureAdaptationBrighteningSpeedFactor(@NFloat double value);

    /**
     * [@property] exposureAdaptationDarkeningSpeedFactor
     * 
     * Determines the exposure adaptation speed when going from dark areas to bright areas. Defaults to 0.6.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setExposureAdaptationDarkeningSpeedFactor:")
    public native void setExposureAdaptationDarkeningSpeedFactor(@NFloat double value);

    /**
     * [@property] exposureOffset
     * 
     * Determines the logarithmic exposure biasing, in EV. Defaults to 0.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setExposureOffset:")
    public native void setExposureOffset(@NFloat double value);

    /**
     * [@property] focalBlurRadius
     * 
     * Determines the receiver's focal radius. Animatable.
     * 
     * Determines the maximum amount of blur for objects out of focus. Defaults to 0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use fStop instead
     */
    @Deprecated
    @Generated
    @Selector("setFocalBlurRadius:")
    public native void setFocalBlurRadius(@NFloat double value);

    /**
     * [@property] focalDistance
     * 
     * Determines the receiver's focal distance. Animatable.
     * 
     * When non zero, the focal distance determines how the camera focuses the objects in the 3d scene. Defaults to 10.0
     * prior to macOS 10.13, iOS 11, tvOS 11 and watchOS 4. Defaults to 2.5 otherwise.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("setFocalDistance:")
    public native void setFocalDistance(@NFloat double value);

    /**
     * [@property] focalSize
     * 
     * Determines the receiver's focal size. Animatable.
     * 
     * Determines the size of the area around focalDistance where the objects are in focus. Defaults to 0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("setFocalSize:")
    public native void setFocalSize(@NFloat double value);

    /**
     * [@property] maximumExposure
     * 
     * Determines the maximum exposure offset of the adaptation, in EV. Defaults to -15.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setMaximumExposure:")
    public native void setMaximumExposure(@NFloat double value);

    /**
     * [@property] minimumExposure
     * 
     * Determines the minimum exposure offset of the adaptation, in EV. Defaults to -15.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setMinimumExposure:")
    public native void setMinimumExposure(@NFloat double value);

    /**
     * [@property] motionBlurIntensity
     * 
     * Determines the intensity of the motion blur. Animatable. Defaults to 0.
     * 
     * An intensity of zero means no motion blur. The intensity should not exceeed 1.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setMotionBlurIntensity:")
    public native void setMotionBlurIntensity(@NFloat double value);

    /**
     * [@property] name
     * 
     * Determines the name of the receiver.
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * [@property] orthographicScale
     * 
     * Determines the receiver's orthographic scale value. Animatable. Defaults to 1.
     * 
     * This setting determines the size of the camera's visible area. This is only enabled when
     * usesOrthographicProjection is set to YES.
     */
    @Generated
    @Selector("setOrthographicScale:")
    public native void setOrthographicScale(double value);

    /**
     * [@property] projectionTransform
     * 
     * Determines the projection transform used by the camera to project the world onscreen.
     */
    @Generated
    @Selector("setProjectionTransform:")
    public native void setProjectionTransform(@ByValue SCNMatrix4 value);

    /**
     * [@property] saturation
     * 
     * Controls the overall saturation of the scene. Defaults to 1 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setSaturation:")
    public native void setSaturation(@NFloat double value);

    @Deprecated
    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, @NotNull String key);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(@Nullable SCNTechnique value);

    /**
     * [@property] usesOrthographicProjection
     * 
     * Determines whether the receiver uses an orthographic projection or not. Defaults to NO.
     */
    @Generated
    @Selector("setUsesOrthographicProjection:")
    public native void setUsesOrthographicProjection(boolean value);

    /**
     * [@property] vignettingIntensity
     * 
     * Controls the intensity of the vignetting effect. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setVignettingIntensity:")
    public native void setVignettingIntensity(@NFloat double value);

    /**
     * [@property] vignettingPower
     * 
     * Controls the shape of the vignetting effect. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setVignettingPower:")
    public native void setVignettingPower(@NFloat double value);

    /**
     * [@property] wantsExposureAdaptation
     * 
     * Determines if the receiver should simulate an eye and continuously adjust to luminance. Defaults to YES.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setWantsExposureAdaptation:")
    public native void setWantsExposureAdaptation(boolean value);

    /**
     * [@property] wantsHDR
     * 
     * Determines if the receiver has a high dynamic range. Defaults to NO.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setWantsHDR:")
    public native void setWantsHDR(boolean value);

    /**
     * [@property] whitePoint
     * 
     * Determines the smallest luminance level that will be mapped to white in the final image. Defaults to 1.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setWhitePoint:")
    public native void setWhitePoint(@NFloat double value);

    /**
     * [@property] xFov
     * 
     * Determines the receiver's field of view on the X axis (in degree). Animatable.
     * 
     * When both xFov and yFov are null an yFov of 60° is used. When both are set, the one that best fits the renderer's
     * aspect ratio is used. When only one is set, it is used. Defaults to 0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -[SCNCamera fieldOfView] or -[SCNCamera focalLength] instead
     */
    @Deprecated
    @Generated
    @Selector("setXFov:")
    public native void setXFov(double value);

    /**
     * [@property] yFov
     * 
     * Determines the receiver's field of view on the Y axis (in degree). Animatable.
     * 
     * When both xFov and yFov are null an yFov of 60° is used. When both are set, the one that best fits the renderer's
     * aspect ratio is used. When only one is set, it is used. Defaults to 0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -[SCNCamera fieldOfView] or -[SCNCamera focalLength] instead
     */
    @Deprecated
    @Generated
    @Selector("setYFov:")
    public native void setYFov(double value);

    /**
     * [@property] zFar
     * 
     * Determines the receiver's far value. Animatable.
     * 
     * The far value determines the maximal distance between the camera and a visible surface. If a surface is further
     * from the camera than this maximal distance, then the surface is clipped. Defaults to 100.
     */
    @Generated
    @Selector("setZFar:")
    public native void setZFar(double value);

    /**
     * [@property] zNear
     * 
     * Determines the receiver's near value. Animatable.
     * 
     * The near value determines the minimal distance between the camera and a visible surface. If a surface is closer
     * to the camera than this minimal distance, then the surface is clipped. The near value must be different than
     * zero. Defaults to 1.
     */
    @Generated
    @Selector("setZNear:")
    public native void setZNear(double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Nullable
    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    /**
     * [@property] usesOrthographicProjection
     * 
     * Determines whether the receiver uses an orthographic projection or not. Defaults to NO.
     */
    @Generated
    @Selector("usesOrthographicProjection")
    public native boolean usesOrthographicProjection();

    /**
     * [@property] vignettingIntensity
     * 
     * Controls the intensity of the vignetting effect. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("vignettingIntensity")
    @NFloat
    public native double vignettingIntensity();

    /**
     * [@property] vignettingPower
     * 
     * Controls the shape of the vignetting effect. Defaults to 0 (no effect).
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("vignettingPower")
    @NFloat
    public native double vignettingPower();

    /**
     * [@property] wantsExposureAdaptation
     * 
     * Determines if the receiver should simulate an eye and continuously adjust to luminance. Defaults to YES.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("wantsExposureAdaptation")
    public native boolean wantsExposureAdaptation();

    /**
     * [@property] wantsHDR
     * 
     * Determines if the receiver has a high dynamic range. Defaults to NO.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("wantsHDR")
    public native boolean wantsHDR();

    /**
     * [@property] whitePoint
     * 
     * Determines the smallest luminance level that will be mapped to white in the final image. Defaults to 1.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("whitePoint")
    @NFloat
    public native double whitePoint();

    /**
     * [@property] xFov
     * 
     * Determines the receiver's field of view on the X axis (in degree). Animatable.
     * 
     * When both xFov and yFov are null an yFov of 60° is used. When both are set, the one that best fits the renderer's
     * aspect ratio is used. When only one is set, it is used. Defaults to 0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -[SCNCamera fieldOfView] or -[SCNCamera focalLength] instead
     */
    @Deprecated
    @Generated
    @Selector("xFov")
    public native double xFov();

    /**
     * [@property] yFov
     * 
     * Determines the receiver's field of view on the Y axis (in degree). Animatable.
     * 
     * When both xFov and yFov are null an yFov of 60° is used. When both are set, the one that best fits the renderer's
     * aspect ratio is used. When only one is set, it is used. Defaults to 0.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use -[SCNCamera fieldOfView] or -[SCNCamera focalLength] instead
     */
    @Deprecated
    @Generated
    @Selector("yFov")
    public native double yFov();

    /**
     * [@property] zFar
     * 
     * Determines the receiver's far value. Animatable.
     * 
     * The far value determines the maximal distance between the camera and a visible surface. If a surface is further
     * from the camera than this maximal distance, then the surface is clipped. Defaults to 100.
     */
    @Generated
    @Selector("zFar")
    public native double zFar();

    /**
     * [@property] zNear
     * 
     * Determines the receiver's near value. Animatable.
     * 
     * The near value determines the minimal distance between the camera and a visible surface. If a surface is closer
     * to the camera than this minimal distance, then the surface is clipped. The near value must be different than
     * zero. Defaults to 1.
     */
    @Generated
    @Selector("zNear")
    public native double zNear();

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(@NotNull SCNAnimationPlayer player, @Nullable String key);

    @Nullable
    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(@NotNull String key);

    /**
     * [@property] apertureBladeCount
     * 
     * Determines the receiver's blade count of the aperture.
     * 
     * Defaults to 6.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("apertureBladeCount")
    @NInt
    public native long apertureBladeCount();

    /**
     * [@property] fStop
     * 
     * Determines the receiver's fstop. Animatable.
     * 
     * Defaults to 5.6.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("fStop")
    @NFloat
    public native double fStop();

    /**
     * [@property] fieldOfView
     * 
     * Determines the receiver's field of view (in degree). Defaults to 60°. Animatable.
     * 
     * The fieldOfView is automatically updated when the sensorHeight or focalLength are set. Setting the fieldOfView
     * will update the focalLength according to the new fieldOfView and the current sensorHeight.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("fieldOfView")
    @NFloat
    public native double fieldOfView();

    /**
     * [@property] focalBlurSampleCount
     * 
     * Determines the receiver's sample count for depth of field effect.
     * 
     * Defaults to 25.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("focalBlurSampleCount")
    @NInt
    public native long focalBlurSampleCount();

    /**
     * [@property] focalLength
     * 
     * Determines the receiver's focal length in millimeter. Defaults to 50mm. Animatable.
     * 
     * The focalLength is automatically updated when the sensorHeight or fieldOfView are set. Setting the focalLength
     * will update the fieldOfView according to the new focalLength and the current sensorHeight.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("focalLength")
    @NFloat
    public native double focalLength();

    /**
     * [@property] focusDistance
     * 
     * Determines the receiver's focus distance. Animatable.
     * 
     * Defaults to 2.5
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("focusDistance")
    @NFloat
    public native double focusDistance();

    /**
     * [@property] projectionDirection
     * 
     * Determines whether the fieldOfView (or orthographicScale) is vertical or horizontal. Defaults to vertical.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("projectionDirection")
    @NInt
    public native long projectionDirection();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(@NotNull String key, @NFloat double duration);

    /**
     * [@property] screenSpaceAmbientOcclusionBias
     * 
     * Determines self occlusion bias in scene unit.
     * 
     * defaults to 0.03.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionBias")
    @NFloat
    public native double screenSpaceAmbientOcclusionBias();

    /**
     * [@property] screenSpaceAmbientOcclusionDepthThreshold
     * 
     * Determines the depth blur threshold in scene unit.
     * 
     * defaults to 0.2.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionDepthThreshold")
    @NFloat
    public native double screenSpaceAmbientOcclusionDepthThreshold();

    /**
     * [@property] screenSpaceAmbientOcclusionIntensity
     * 
     * Determines the intensity of the screen space ambient occlusion. Animatable.
     * 
     * defaults to 0.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionIntensity")
    @NFloat
    public native double screenSpaceAmbientOcclusionIntensity();

    /**
     * [@property] screenSpaceAmbientOcclusionNormalThreshold
     * 
     * Determines the normal blur threshold.
     * 
     * defaults to 0.3.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionNormalThreshold")
    @NFloat
    public native double screenSpaceAmbientOcclusionNormalThreshold();

    /**
     * [@property] screenSpaceAmbientOcclusionRadius
     * 
     * Determines the screen space ambient occlusion radius in scene unit. Animatable.
     * 
     * defaults to 5.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("screenSpaceAmbientOcclusionRadius")
    @NFloat
    public native double screenSpaceAmbientOcclusionRadius();

    /**
     * [@property] sensorHeight
     * 
     * Determines the vertical size of the sensor in millimeter. Defaults to 24mm. Animatable.
     * 
     * Setting the sensorHeight will automatically update the fieldOfView according to the new sensorHeight and the
     * current focalLength.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("sensorHeight")
    @NFloat
    public native double sensorHeight();

    /**
     * [@property] apertureBladeCount
     * 
     * Determines the receiver's blade count of the aperture.
     * 
     * Defaults to 6.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setApertureBladeCount:")
    public native void setApertureBladeCount(@NInt long value);

    /**
     * [@property] fStop
     * 
     * Determines the receiver's fstop. Animatable.
     * 
     * Defaults to 5.6.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setFStop:")
    public native void setFStop(@NFloat double value);

    /**
     * [@property] fieldOfView
     * 
     * Determines the receiver's field of view (in degree). Defaults to 60°. Animatable.
     * 
     * The fieldOfView is automatically updated when the sensorHeight or focalLength are set. Setting the fieldOfView
     * will update the focalLength according to the new fieldOfView and the current sensorHeight.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setFieldOfView:")
    public native void setFieldOfView(@NFloat double value);

    /**
     * [@property] focalBlurSampleCount
     * 
     * Determines the receiver's sample count for depth of field effect.
     * 
     * Defaults to 25.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setFocalBlurSampleCount:")
    public native void setFocalBlurSampleCount(@NInt long value);

    /**
     * [@property] focalLength
     * 
     * Determines the receiver's focal length in millimeter. Defaults to 50mm. Animatable.
     * 
     * The focalLength is automatically updated when the sensorHeight or fieldOfView are set. Setting the focalLength
     * will update the fieldOfView according to the new focalLength and the current sensorHeight.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setFocalLength:")
    public native void setFocalLength(@NFloat double value);

    /**
     * [@property] focusDistance
     * 
     * Determines the receiver's focus distance. Animatable.
     * 
     * Defaults to 2.5
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setFocusDistance:")
    public native void setFocusDistance(@NFloat double value);

    /**
     * [@property] projectionDirection
     * 
     * Determines whether the fieldOfView (or orthographicScale) is vertical or horizontal. Defaults to vertical.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setProjectionDirection:")
    public native void setProjectionDirection(@NInt long value);

    /**
     * [@property] screenSpaceAmbientOcclusionBias
     * 
     * Determines self occlusion bias in scene unit.
     * 
     * defaults to 0.03.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionBias:")
    public native void setScreenSpaceAmbientOcclusionBias(@NFloat double value);

    /**
     * [@property] screenSpaceAmbientOcclusionDepthThreshold
     * 
     * Determines the depth blur threshold in scene unit.
     * 
     * defaults to 0.2.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionDepthThreshold:")
    public native void setScreenSpaceAmbientOcclusionDepthThreshold(@NFloat double value);

    /**
     * [@property] screenSpaceAmbientOcclusionIntensity
     * 
     * Determines the intensity of the screen space ambient occlusion. Animatable.
     * 
     * defaults to 0.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionIntensity:")
    public native void setScreenSpaceAmbientOcclusionIntensity(@NFloat double value);

    /**
     * [@property] screenSpaceAmbientOcclusionNormalThreshold
     * 
     * Determines the normal blur threshold.
     * 
     * defaults to 0.3.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionNormalThreshold:")
    public native void setScreenSpaceAmbientOcclusionNormalThreshold(@NFloat double value);

    /**
     * [@property] screenSpaceAmbientOcclusionRadius
     * 
     * Determines the screen space ambient occlusion radius in scene unit. Animatable.
     * 
     * defaults to 5.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setScreenSpaceAmbientOcclusionRadius:")
    public native void setScreenSpaceAmbientOcclusionRadius(@NFloat double value);

    /**
     * [@property] sensorHeight
     * 
     * Determines the vertical size of the sensor in millimeter. Defaults to 24mm. Animatable.
     * 
     * Setting the sensorHeight will automatically update the fieldOfView according to the new sensorHeight and the
     * current focalLength.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSensorHeight:")
    public native void setSensorHeight(@NFloat double value);

    /**
     * [@property] wantsDepthOfField
     * 
     * Determines if the receiver has depth of field. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setWantsDepthOfField:")
    public native void setWantsDepthOfField(boolean value);

    /**
     * [@property] wantsDepthOfField
     * 
     * Determines if the receiver has depth of field. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("wantsDepthOfField")
    public native boolean wantsDepthOfField();

    /**
     * [@property] bloomIteration
     * 
     * Determines the number of blur iterations. Defaults to 1.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("bloomIterationCount")
    @NInt
    public native long bloomIterationCount();

    /**
     * [@property] bloomIterationSpread
     * 
     * Determines how the bloom iterations are spread. Defaults to 0.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("bloomIterationSpread")
    @NFloat
    public native double bloomIterationSpread();

    /**
     * [@property] grainIntensity
     * 
     * Controls the intensity of the grain. Defaults to 0 (no effect).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("grainIntensity")
    @NFloat
    public native double grainIntensity();

    /**
     * [@property] grainIsColored
     * 
     * Determines if the grain is colored or not. Defaults to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("grainIsColored")
    public native boolean grainIsColored();

    /**
     * [@property] grainScale
     * 
     * Controls the scale of the grain. Defaults to 1.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("grainScale")
    @NFloat
    public native double grainScale();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("projectionTransformWithViewportSize:")
    @ByValue
    public native SCNMatrix4 projectionTransformWithViewportSize(@ByValue CGSize viewportSize);

    /**
     * [@property] bloomIteration
     * 
     * Determines the number of blur iterations. Defaults to 1.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setBloomIterationCount:")
    public native void setBloomIterationCount(@NInt long value);

    /**
     * [@property] bloomIterationSpread
     * 
     * Determines how the bloom iterations are spread. Defaults to 0.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setBloomIterationSpread:")
    public native void setBloomIterationSpread(@NFloat double value);

    /**
     * [@property] grainIntensity
     * 
     * Controls the intensity of the grain. Defaults to 0 (no effect).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setGrainIntensity:")
    public native void setGrainIntensity(@NFloat double value);

    /**
     * [@property] grainIsColored
     * 
     * Determines if the grain is colored or not. Defaults to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setGrainIsColored:")
    public native void setGrainIsColored(boolean value);

    /**
     * [@property] grainScale
     * 
     * Controls the scale of the grain. Defaults to 1.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setGrainScale:")
    public native void setGrainScale(@NFloat double value);

    /**
     * [@property] whiteBalanceTemperature
     * 
     * Controls the overall white balance temperature of the scene. Defaults to 0 (no effect).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setWhiteBalanceTemperature:")
    public native void setWhiteBalanceTemperature(@NFloat double value);

    /**
     * [@property] whiteBalanceTint
     * 
     * Controls the overall white balance tint of the scene. Defaults to 0 (no effect).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setWhiteBalanceTint:")
    public native void setWhiteBalanceTint(@NFloat double value);

    /**
     * [@property] whiteBalanceTemperature
     * 
     * Controls the overall white balance temperature of the scene. Defaults to 0 (no effect).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("whiteBalanceTemperature")
    @NFloat
    public native double whiteBalanceTemperature();

    /**
     * [@property] whiteBalanceTint
     * 
     * Controls the overall white balance tint of the scene. Defaults to 0 (no effect).
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("whiteBalanceTint")
    @NFloat
    public native double whiteBalanceTint();

    @Generated
    @Selector("removeAllAnimationsWithBlendOutDuration:")
    public native void removeAllAnimationsWithBlendOutDuration(@NFloat double duration);
}
