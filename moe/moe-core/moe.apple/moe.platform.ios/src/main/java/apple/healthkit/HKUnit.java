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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("atmosphereUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object atmosphereUnit();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("calorieUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object calorieUnit();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("centimeterOfWaterUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object centimeterOfWaterUnit();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("countUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object countUnit();

    @Generated
    @Selector("cupImperialUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cupImperialUnit();

    @Generated
    @Selector("cupUSUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cupUSUnit();

    @Generated
    @Selector("dayUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object dayUnit();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("degreeCelsiusUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object degreeCelsiusUnit();

    @Generated
    @Selector("degreeFahrenheitUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object degreeFahrenheitUnit();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("energyFormatterUnitFromUnit:")
    @NInt
    public static native long energyFormatterUnitFromUnit(HKUnit unit);

    @Generated
    @Selector("fluidOunceImperialUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object fluidOunceImperialUnit();

    @Generated
    @Selector("fluidOunceUSUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object fluidOunceUSUnit();

    @Generated
    @Selector("footUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object footUnit();

    @Generated
    @Selector("gramUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object gramUnit();

    @Generated
    @Selector("gramUnitWithMetricPrefix:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object gramUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("hourUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object hourUnit();

    @Generated
    @Selector("inchUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object inchUnit();

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
    @Selector("jouleUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object jouleUnit();

    @Generated
    @Selector("jouleUnitWithMetricPrefix:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object jouleUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("kelvinUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object kelvinUnit();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("kilocalorieUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object kilocalorieUnit();

    @Generated
    @Selector("lengthFormatterUnitFromUnit:")
    @NInt
    public static native long lengthFormatterUnitFromUnit(HKUnit unit);

    @Generated
    @Selector("literUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object literUnit();

    @Generated
    @Selector("literUnitWithMetricPrefix:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object literUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("massFormatterUnitFromUnit:")
    @NInt
    public static native long massFormatterUnitFromUnit(HKUnit unit);

    @Generated
    @Selector("meterUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object meterUnit();

    @Generated
    @Selector("meterUnitWithMetricPrefix:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object meterUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("mileUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object mileUnit();

    @Generated
    @Selector("millimeterOfMercuryUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object millimeterOfMercuryUnit();

    @Generated
    @Selector("minuteUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object minuteUnit();

    @Generated
    @Selector("moleUnitWithMetricPrefix:molarMass:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object moleUnitWithMetricPrefixMolarMass(@NInt long prefix, double gramsPerMole);

    @Generated
    @Selector("moleUnitWithMolarMass:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object moleUnitWithMolarMass(double gramsPerMole);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("ounceUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object ounceUnit();

    @Generated
    @Selector("pascalUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object pascalUnit();

    @Generated
    @Selector("pascalUnitWithMetricPrefix:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object pascalUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("percentUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object percentUnit();

    @Generated
    @Selector("pintImperialUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object pintImperialUnit();

    @Generated
    @Selector("pintUSUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object pintUSUnit();

    @Generated
    @Selector("poundUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object poundUnit();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("secondUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object secondUnit();

    @Generated
    @Selector("secondUnitWithMetricPrefix:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object secondUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("siemenUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object siemenUnit();

    @Generated
    @Selector("siemenUnitWithMetricPrefix:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object siemenUnitWithMetricPrefix(@NInt long prefix);

    @Generated
    @Selector("stoneUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object stoneUnit();

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

    @Generated
    @Selector("unitFromMassFormatterUnit:")
    public static native HKUnit unitFromMassFormatterUnit(@NInt long massFormatterUnit);

    @Generated
    @Selector("unitFromString:")
    public static native HKUnit unitFromString(String string);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("yardUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object yardUnit();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native HKUnit init();

    @Generated
    @Selector("initWithCoder:")
    public native HKUnit initWithCoder(NSCoder coder);

    @Generated
    @Selector("isNull")
    public native boolean isNull();

    @Generated
    @Selector("reciprocalUnit")
    public native HKUnit reciprocalUnit();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("unitDividedByUnit:")
    public native HKUnit unitDividedByUnit(HKUnit unit);

    @Generated
    @Selector("unitMultipliedByUnit:")
    public native HKUnit unitMultipliedByUnit(HKUnit unit);

    @Generated
    @Selector("unitRaisedToPower:")
    public native HKUnit unitRaisedToPower(@NInt long power);

    @Generated
    @Selector("unitString")
    public native String unitString();

    @Generated
    @Selector("internationalUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object internationalUnit();

    @Generated
    @Selector("largeCalorieUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object largeCalorieUnit();

    @Generated
    @Selector("smallCalorieUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object smallCalorieUnit();

    @Generated
    @Selector("decibelAWeightedSoundPressureLevelUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object decibelAWeightedSoundPressureLevelUnit();

    @Generated
    @Selector("decibelHearingLevelUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object decibelHearingLevelUnit();

    @Generated
    @Selector("hertzUnit")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object hertzUnit();

    @Generated
    @Selector("hertzUnitWithMetricPrefix:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object hertzUnitWithMetricPrefix(@NInt long prefix);
}
