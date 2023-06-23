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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.uikit.UIColor;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * GKNoise is the object used to manipulate and combine noise in continuous 3D space. It takes a GKNoiseSource as input.
 * To extract and use a portion of the noise within the 3D space use the GKNoiseMap class.
 * 
 * @see GKNoiseSource
 * @see GKNoiseMap
 * 
 *      API-Since: 10.0
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKNoise extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKNoise(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKNoise alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKNoise allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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
    public static native GKNoise new_objc();

    /**
     * Initializes a composite noise from one or more component noises. Useful for combining and layering noises
     * together.
     * 
     * @param noises         The component noises to combine.
     * @param selectionNoise The noise that governs which component noise is chosen for each position of the resulting
     *                       noise.
     *                       The range of values is equally-subdivided for each component noise.
     */
    @Generated
    @Selector("noiseWithComponentNoises:selectionNoise:")
    public static native GKNoise noiseWithComponentNoisesSelectionNoise(@NotNull NSArray<? extends GKNoise> noises,
            @NotNull GKNoise selectionNoise);

    /**
     * Initializes a composite noise from one or more component noises. Useful for combining and layering noises
     * together.
     * 
     * @param noises              The component noises to combine.
     * @param selectionNoise      The noise that governs which component noise is chosen for each position of the
     *                            resulting noise.
     *                            The range of values is equally-subdivided for each component noise.
     * @param componentBoundaries The noise value boundaries of the selection noise to use for the component noises.
     *                            Specify
     *                            one less boundary than the number of component noises. This is a parallel array to
     *                            blendDistances.
     * @param blendDistances      The size of smoothing that is applied to boundaries where two component noises meet.
     *                            Specify
     *                            one less blend distance than the number of component noises. This is a parallel array
     *                            to componentBoundaries.
     */
    @Generated
    @Selector("noiseWithComponentNoises:selectionNoise:componentBoundaries:boundaryBlendDistances:")
    public static native GKNoise noiseWithComponentNoisesSelectionNoiseComponentBoundariesBoundaryBlendDistances(
            @NotNull NSArray<? extends GKNoise> noises, @NotNull GKNoise selectionNoise,
            @NotNull NSArray<? extends NSNumber> componentBoundaries,
            @NotNull NSArray<? extends NSNumber> blendDistances);

    /**
     * Initializes a noise with the specified noise source.
     * 
     * @param noiseSource The noise source to use to initially populate the 3D noise space.
     */
    @Generated
    @Selector("noiseWithNoiseSource:")
    public static native GKNoise noiseWithNoiseSource(@NotNull GKNoiseSource noiseSource);

    /**
     * Initializes a noise with the specified noise source and parameters.
     * 
     * @param noiseSource    The noise source to use to initially populate the 3D noise space.
     * @param gradientColors The color gradient to use for this noise in 'value : color' pairs.
     */
    @Generated
    @Selector("noiseWithNoiseSource:gradientColors:")
    public static native GKNoise noiseWithNoiseSourceGradientColors(@NotNull GKNoiseSource noiseSource,
            @NotNull NSDictionary<? extends NSNumber, ? extends UIColor> gradientColors);

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
     * Adds all noise values by the noise values at the same position in specified noise.
     * 
     * @param noise The noise from which to add values to this noise.
     */
    @Generated
    @Selector("addWithNoise:")
    public native void addWithNoise(@NotNull GKNoise noise);

    /**
     * Takes the absoltue value of all noise positions.
     */
    @Generated
    @Selector("applyAbsoluteValue")
    public native void applyAbsoluteValue();

    /**
     * Applies a turbulent displacement to all noise values.
     */
    @Generated
    @Selector("applyTurbulenceWithFrequency:power:roughness:seed:")
    public native void applyTurbulenceWithFrequencyPowerRoughnessSeed(double frequency, double power, int roughness,
            int seed);

    /**
     * Clamps all noise values to the specified bounds.
     * 
     * @param lowerBound The noise value lower bound.
     * @param upperBound The noise value upper bound.
     */
    @Generated
    @Selector("clampWithLowerBound:upperBound:")
    public native void clampWithLowerBoundUpperBound(double lowerBound, double upperBound);

    /**
     * Displaces all noise values by the values at the same positions of the specified noises.
     * 
     * @param xDisplacementNoise The noise from which to displace along the x-axis this noise's values at the same
     *                           positions.
     * @param yDisplacementNoise The noise from which to displace along the y-axis this noise's values at the same
     *                           positions.
     * @param zDisplacementNoise The noise from which to displace along the z-axis this noise's values at the same
     *                           positions.
     */
    @Generated
    @Selector("displaceXWithNoise:yWithNoise:zWithNoise:")
    public native void displaceXWithNoiseYWithNoiseZWithNoise(@NotNull GKNoise xDisplacementNoise,
            @NotNull GKNoise yDisplacementNoise, @NotNull GKNoise zDisplacementNoise);

    /**
     * Color gradient of this noise, represented as 'value : color' pairs. Utilized when this noise is rendered to a
     * texture.
     */
    @NotNull
    @Generated
    @Selector("gradientColors")
    public native NSDictionary<? extends NSNumber, ? extends UIColor> gradientColors();

    /**
     * Initializes a constant noise of 0.0 at all positions.
     */
    @Generated
    @Selector("init")
    public native GKNoise init();

    /**
     * Initializes a noise with the specified noise source.
     * 
     * @param noiseSource The noise source to use to initially populate the 3D noise space.
     */
    @Generated
    @Selector("initWithNoiseSource:")
    public native GKNoise initWithNoiseSource(@NotNull GKNoiseSource noiseSource);

    /**
     * Initializes a noise with the specified noise source and parameters.
     * 
     * @param noiseSource    The noise source to use to initially populate the 3D noise space.
     * @param gradientColors The color gradient to use for this noise in 'value : color' pairs.
     */
    @Generated
    @Selector("initWithNoiseSource:gradientColors:")
    public native GKNoise initWithNoiseSourceGradientColors(@NotNull GKNoiseSource noiseSource,
            @NotNull NSDictionary<? extends NSNumber, ? extends UIColor> gradientColors);

    /**
     * Inverts all noise values, from positive to negative and vice versa.
     */
    @Generated
    @Selector("invert")
    public native void invert();

    /**
     * Takes the maximum value between this noise and the specified noise at each position.
     * 
     * @param noise The noise to compare against this noise at each position in determining which to take the maximum
     *              value from.
     */
    @Generated
    @Selector("maximumWithNoise:")
    public native void maximumWithNoise(@NotNull GKNoise noise);

    /**
     * Takes the minimum value between this noise and the specified noise at each position.
     * 
     * @param noise The noise to compare against this noise at each position in determining which to take the minimum
     *              value from.
     */
    @Generated
    @Selector("minimumWithNoise:")
    public native void minimumWithNoise(@NotNull GKNoise noise);

    /**
     * Multiplies all noise values by the noise values at the same position in specified noise.
     * 
     * @param noise The noise from which to multiply values to this noise.
     */
    @Generated
    @Selector("multiplyWithNoise:")
    public native void multiplyWithNoise(@NotNull GKNoise noise);

    /**
     * Raises all noise values to the specified power.
     * 
     * @param power The power to which to raise all noise values.
     */
    @Generated
    @Selector("raiseToPower:")
    public native void raiseToPower(double power);

    /**
     * Raises all noise values to the power of the value at the same position of the specified noise.
     * 
     * @param noise The noise from which to raise this noise's values by.
     */
    @Generated
    @Selector("raiseToPowerWithNoise:")
    public native void raiseToPowerWithNoise(@NotNull GKNoise noise);

    /**
     * Remaps all noise values to a smooth curve that passes through the specified control points.
     * 
     * @param controlPoints Pairs of 'input : output' values to use as control points for the smooth remapping curve.
     *                      Duplicate input values are not permitted.
     */
    @Generated
    @Selector("remapValuesToCurveWithControlPoints:")
    public native void remapValuesToCurveWithControlPoints(
            @NotNull NSDictionary<? extends NSNumber, ? extends NSNumber> controlPoints);

    /**
     * Remaps all noise values to one or more terraces with peaks. Useful for creating valleys and trenches.
     * 
     * @param peakInputValues Inputs positions of terrace peaks.
     * @param inverted        Governs the curve direction from peak to peak.
     */
    @Generated
    @Selector("remapValuesToTerracesWithPeaks:terracesInverted:")
    public native void remapValuesToTerracesWithPeaksTerracesInverted(
            @NotNull NSArray<? extends NSNumber> peakInputValues, boolean inverted);

    /**
     * Color gradient of this noise, represented as 'value : color' pairs. Utilized when this noise is rendered to a
     * texture.
     */
    @Generated
    @Selector("setGradientColors:")
    public native void setGradientColors(@NotNull NSDictionary<? extends NSNumber, ? extends UIColor> value);
}
