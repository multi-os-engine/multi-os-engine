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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("noiseWithComponentNoises:selectionNoise:")
    public static native GKNoise noiseWithComponentNoisesSelectionNoise(NSArray<? extends GKNoise> noises,
            GKNoise selectionNoise);

    @Generated
    @Selector("noiseWithComponentNoises:selectionNoise:componentBoundaries:boundaryBlendDistances:")
    public static native GKNoise noiseWithComponentNoisesSelectionNoiseComponentBoundariesBoundaryBlendDistances(
            NSArray<? extends GKNoise> noises, GKNoise selectionNoise, NSArray<? extends NSNumber> componentBoundaries,
            NSArray<? extends NSNumber> blendDistances);

    @Generated
    @Selector("noiseWithNoiseSource:")
    public static native GKNoise noiseWithNoiseSource(GKNoiseSource noiseSource);

    @Generated
    @Selector("noiseWithNoiseSource:gradientColors:")
    public static native GKNoise noiseWithNoiseSourceGradientColors(GKNoiseSource noiseSource,
            NSDictionary<? extends NSNumber, ? extends UIColor> gradientColors);

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
    @Selector("addWithNoise:")
    public native void addWithNoise(GKNoise noise);

    @Generated
    @Selector("applyAbsoluteValue")
    public native void applyAbsoluteValue();

    @Generated
    @Selector("applyTurbulenceWithFrequency:power:roughness:seed:")
    public native void applyTurbulenceWithFrequencyPowerRoughnessSeed(double frequency, double power, int roughness,
            int seed);

    @Generated
    @Selector("clampWithLowerBound:upperBound:")
    public native void clampWithLowerBoundUpperBound(double lowerBound, double upperBound);

    @Generated
    @Selector("displaceXWithNoise:yWithNoise:zWithNoise:")
    public native void displaceXWithNoiseYWithNoiseZWithNoise(GKNoise xDisplacementNoise, GKNoise yDisplacementNoise,
            GKNoise zDisplacementNoise);

    @Generated
    @Selector("gradientColors")
    public native NSDictionary<? extends NSNumber, ? extends UIColor> gradientColors();

    @Generated
    @Selector("init")
    public native GKNoise init();

    @Generated
    @Selector("initWithNoiseSource:")
    public native GKNoise initWithNoiseSource(GKNoiseSource noiseSource);

    @Generated
    @Selector("initWithNoiseSource:gradientColors:")
    public native GKNoise initWithNoiseSourceGradientColors(GKNoiseSource noiseSource,
            NSDictionary<? extends NSNumber, ? extends UIColor> gradientColors);

    @Generated
    @Selector("invert")
    public native void invert();

    @Generated
    @Selector("maximumWithNoise:")
    public native void maximumWithNoise(GKNoise noise);

    @Generated
    @Selector("minimumWithNoise:")
    public native void minimumWithNoise(GKNoise noise);

    @Generated
    @Selector("multiplyWithNoise:")
    public native void multiplyWithNoise(GKNoise noise);

    @Generated
    @Selector("raiseToPower:")
    public native void raiseToPower(double power);

    @Generated
    @Selector("raiseToPowerWithNoise:")
    public native void raiseToPowerWithNoise(GKNoise noise);

    @Generated
    @Selector("remapValuesToCurveWithControlPoints:")
    public native void remapValuesToCurveWithControlPoints(
            NSDictionary<? extends NSNumber, ? extends NSNumber> controlPoints);

    @Generated
    @Selector("remapValuesToTerracesWithPeaks:terracesInverted:")
    public native void remapValuesToTerracesWithPeaksTerracesInverted(NSArray<? extends NSNumber> peakInputValues,
            boolean inverted);

    @Generated
    @Selector("setGradientColors:")
    public native void setGradientColors(NSDictionary<? extends NSNumber, ? extends UIColor> value);
}
