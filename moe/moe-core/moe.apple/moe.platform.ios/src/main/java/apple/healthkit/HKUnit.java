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

package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 8.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKUnit extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKUnit(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKUnit alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKUnit allocWithZone(VoidPtr zone);

    /**
     * atm
     */
    @NotNull
    @Generated
    @Selector("atmosphereUnit")
    public static native HKUnit atmosphereUnit();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use smallCalorieUnit or largeCalorieUnit, depending on which you mean
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("calorieUnit")
    public static native HKUnit calorieUnit();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * cmAq
     */
    @NotNull
    @Generated
    @Selector("centimeterOfWaterUnit")
    public static native HKUnit centimeterOfWaterUnit();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * count
     */
    @NotNull
    @Generated
    @Selector("countUnit")
    public static native HKUnit countUnit();

    /**
     * cup_imp
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("cupImperialUnit")
    public static native HKUnit cupImperialUnit();

    /**
     * cup_us
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("cupUSUnit")
    public static native HKUnit cupUSUnit();

    /**
     * d
     */
    @NotNull
    @Generated
    @Selector("dayUnit")
    public static native HKUnit dayUnit();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * degC
     */
    @NotNull
    @Generated
    @Selector("degreeCelsiusUnit")
    public static native HKUnit degreeCelsiusUnit();

    /**
     * degF
     */
    @NotNull
    @Generated
    @Selector("degreeFahrenheitUnit")
    public static native HKUnit degreeFahrenheitUnit();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("energyFormatterUnitFromUnit:")
    @NInt
    public static native long energyFormatterUnitFromUnit(@NotNull HKUnit unit);

    /**
     * fl_oz_imp
     */
    @NotNull
    @Generated
    @Selector("fluidOunceImperialUnit")
    public static native HKUnit fluidOunceImperialUnit();

    /**
     * fl_oz_us
     */
    @NotNull
    @Generated
    @Selector("fluidOunceUSUnit")
    public static native HKUnit fluidOunceUSUnit();

    /**
     * ft
     */
    @NotNull
    @Generated
    @Selector("footUnit")
    public static native HKUnit footUnit();

    /**
     * g
     */
    @NotNull
    @Generated
    @Selector("gramUnit")
    public static native HKUnit gramUnit();

    /**
     * g
     */
    @NotNull
    @Generated
    @Selector("gramUnitWithMetricPrefix:")
    public static native HKUnit gramUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * hr
     */
    @NotNull
    @Generated
    @Selector("hourUnit")
    public static native HKUnit hourUnit();

    /**
     * in
     */
    @NotNull
    @Generated
    @Selector("inchUnit")
    public static native HKUnit inchUnit();

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

    /**
     * J
     */
    @NotNull
    @Generated
    @Selector("jouleUnit")
    public static native HKUnit jouleUnit();

    /**
     * J
     */
    @NotNull
    @Generated
    @Selector("jouleUnitWithMetricPrefix:")
    public static native HKUnit jouleUnitWithMetricPrefix(@NInt long prefix);

    /**
     * K
     */
    @NotNull
    @Generated
    @Selector("kelvinUnit")
    public static native HKUnit kelvinUnit();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * 1 kcal = 4184.0 J
     */
    @NotNull
    @Generated
    @Selector("kilocalorieUnit")
    public static native HKUnit kilocalorieUnit();

    @Generated
    @Selector("lengthFormatterUnitFromUnit:")
    @NInt
    public static native long lengthFormatterUnitFromUnit(@NotNull HKUnit unit);

    /**
     * L
     */
    @NotNull
    @Generated
    @Selector("literUnit")
    public static native HKUnit literUnit();

    /**
     * L
     */
    @NotNull
    @Generated
    @Selector("literUnitWithMetricPrefix:")
    public static native HKUnit literUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("massFormatterUnitFromUnit:")
    @NInt
    public static native long massFormatterUnitFromUnit(@NotNull HKUnit unit);

    /**
     * m
     */
    @NotNull
    @Generated
    @Selector("meterUnit")
    public static native HKUnit meterUnit();

    /**
     * m
     */
    @NotNull
    @Generated
    @Selector("meterUnitWithMetricPrefix:")
    public static native HKUnit meterUnitWithMetricPrefix(@NInt long prefix);

    /**
     * mi
     */
    @NotNull
    @Generated
    @Selector("mileUnit")
    public static native HKUnit mileUnit();

    /**
     * mmHg
     */
    @NotNull
    @Generated
    @Selector("millimeterOfMercuryUnit")
    public static native HKUnit millimeterOfMercuryUnit();

    /**
     * min
     */
    @NotNull
    @Generated
    @Selector("minuteUnit")
    public static native HKUnit minuteUnit();

    /**
     * mol<double>
     */
    @NotNull
    @Generated
    @Selector("moleUnitWithMetricPrefix:molarMass:")
    public static native HKUnit moleUnitWithMetricPrefixMolarMass(@NInt long prefix, double gramsPerMole);

    /**
     * mol<double>
     */
    @NotNull
    @Generated
    @Selector("moleUnitWithMolarMass:")
    public static native HKUnit moleUnitWithMolarMass(double gramsPerMole);

    @Generated
    @Owned
    @Selector("new")
    public static native HKUnit new_objc();

    /**
     * oz
     */
    @NotNull
    @Generated
    @Selector("ounceUnit")
    public static native HKUnit ounceUnit();

    /**
     * Pa
     */
    @NotNull
    @Generated
    @Selector("pascalUnit")
    public static native HKUnit pascalUnit();

    /**
     * Pa
     */
    @NotNull
    @Generated
    @Selector("pascalUnitWithMetricPrefix:")
    public static native HKUnit pascalUnitWithMetricPrefix(@NInt long prefix);

    /**
     * % (0.0 - 1.0)
     */
    @NotNull
    @Generated
    @Selector("percentUnit")
    public static native HKUnit percentUnit();

    /**
     * pt_imp
     */
    @NotNull
    @Generated
    @Selector("pintImperialUnit")
    public static native HKUnit pintImperialUnit();

    /**
     * pt_us
     */
    @NotNull
    @Generated
    @Selector("pintUSUnit")
    public static native HKUnit pintUSUnit();

    /**
     * lb
     */
    @NotNull
    @Generated
    @Selector("poundUnit")
    public static native HKUnit poundUnit();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * s
     */
    @NotNull
    @Generated
    @Selector("secondUnit")
    public static native HKUnit secondUnit();

    /**
     * s
     */
    @NotNull
    @Generated
    @Selector("secondUnitWithMetricPrefix:")
    public static native HKUnit secondUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * S
     */
    @NotNull
    @Generated
    @Selector("siemenUnit")
    public static native HKUnit siemenUnit();

    /**
     * S
     */
    @NotNull
    @Generated
    @Selector("siemenUnitWithMetricPrefix:")
    public static native HKUnit siemenUnitWithMetricPrefix(@NInt long prefix);

    /**
     * st
     */
    @NotNull
    @Generated
    @Selector("stoneUnit")
    public static native HKUnit stoneUnit();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("unitFromEnergyFormatterUnit:")
    public static native HKUnit unitFromEnergyFormatterUnit(@NInt long energyFormatterUnit);

    @Generated
    @Selector("unitFromLengthFormatterUnit:")
    public static native HKUnit unitFromLengthFormatterUnit(@NInt long lengthFormatterUnit);

    /**
     * The following methods convert between HKUnit and Foundation formatter units for mass, length and energy.
     * When converting from Foundation formatter unit to HKUnit, if there's not a match, nil will be returned.
     * When converting from HKUnit to the Foundation formatter unit, if there's not a match, an exception will be
     * thrown.
     */
    @Generated
    @Selector("unitFromMassFormatterUnit:")
    public static native HKUnit unitFromMassFormatterUnit(@NInt long massFormatterUnit);

    @Generated
    @Selector("unitFromString:")
    public static native HKUnit unitFromString(@NotNull String string);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * yd
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("yardUnit")
    public static native HKUnit yardUnit();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native HKUnit init();

    @Generated
    @Selector("initWithCoder:")
    public native HKUnit initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("isNull")
    public native boolean isNull();

    @NotNull
    @Generated
    @Selector("reciprocalUnit")
    public native HKUnit reciprocalUnit();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @NotNull
    @Generated
    @Selector("unitDividedByUnit:")
    public native HKUnit unitDividedByUnit(@NotNull HKUnit unit);

    @NotNull
    @Generated
    @Selector("unitMultipliedByUnit:")
    public native HKUnit unitMultipliedByUnit(@NotNull HKUnit unit);

    @NotNull
    @Generated
    @Selector("unitRaisedToPower:")
    public native HKUnit unitRaisedToPower(@NInt long power);

    /**
     * Returns a unique string representation for the unit that could be used with +unitFromString:
     */
    @NotNull
    @Generated
    @Selector("unitString")
    public native String unitString();

    /**
     * IU
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("internationalUnit")
    public static native HKUnit internationalUnit();

    /**
     * 1 Cal = 4184.0 J
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("largeCalorieUnit")
    public static native HKUnit largeCalorieUnit();

    /**
     * 1 cal = 4.1840 J
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("smallCalorieUnit")
    public static native HKUnit smallCalorieUnit();

    /**
     * dBASPL
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("decibelAWeightedSoundPressureLevelUnit")
    public static native HKUnit decibelAWeightedSoundPressureLevelUnit();

    /**
     * dBHL
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("decibelHearingLevelUnit")
    public static native HKUnit decibelHearingLevelUnit();

    /**
     * Hz
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("hertzUnit")
    public static native HKUnit hertzUnit();

    /**
     * Hz
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("hertzUnitWithMetricPrefix:")
    public static native HKUnit hertzUnitWithMetricPrefix(@NInt long prefix);

    /**
     * inHg
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("inchesOfMercuryUnit")
    public static native HKUnit inchesOfMercuryUnit();

    /**
     * V
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("voltUnit")
    public static native HKUnit voltUnit();

    /**
     * V
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("voltUnitWithMetricPrefix:")
    public static native HKUnit voltUnitWithMetricPrefix(@NInt long prefix);

    /**
     * deg
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("degreeAngleUnit")
    public static native HKUnit degreeAngleUnit();

    /**
     * D
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("diopterUnit")
    public static native HKUnit diopterUnit();

    /**
     * pD
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("prismDiopterUnit")
    public static native HKUnit prismDiopterUnit();

    /**
     * rad
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("radianAngleUnit")
    public static native HKUnit radianAngleUnit();

    /**
     * rad
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("radianAngleUnitWithMetricPrefix:")
    public static native HKUnit radianAngleUnitWithMetricPrefix(@NInt long prefix);

    /**
     * W
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("wattUnit")
    public static native HKUnit wattUnit();

    /**
     * W
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("wattUnitWithMetricPrefix:")
    public static native HKUnit wattUnitWithMetricPrefix(@NInt long prefix);
}
