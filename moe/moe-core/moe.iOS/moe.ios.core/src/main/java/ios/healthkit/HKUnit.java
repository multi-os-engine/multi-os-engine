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

package ios.healthkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native HKUnit alloc();

	/**
	 * atmosphereUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/atmosphereUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("atmosphereUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object atmosphereUnit();

	/**
	 * calorieUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/calorieUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("calorieUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object calorieUnit();

	/**
	 * centimeterOfWaterUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/centimeterOfWaterUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("centimeterOfWaterUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object centimeterOfWaterUnit();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * countUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/countUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("countUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object countUnit();

	/**
	 * dayUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/dayUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dayUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dayUnit();

	/**
	 * degreeCelsiusUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/degreeCelsiusUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("degreeCelsiusUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object degreeCelsiusUnit();

	/**
	 * degreeFahrenheitUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/degreeFahrenheitUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("degreeFahrenheitUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object degreeFahrenheitUnit();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * energyFormatterUnitFromUnit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/energyFormatterUnitFromUnit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("energyFormatterUnitFromUnit:")
	@NInt
	public static native long energyFormatterUnitFromUnit(HKUnit unit);

	/**
	 * fluidOunceImperialUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/fluidOunceImperialUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fluidOunceImperialUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object fluidOunceImperialUnit();

	/**
	 * fluidOunceUSUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/fluidOunceUSUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fluidOunceUSUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object fluidOunceUSUnit();

	/**
	 * footUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/footUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("footUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object footUnit();

	/**
	 * gramUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/gramUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("gramUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object gramUnit();

	/**
	 * gramUnitWithMetricPrefix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/gramUnitWithMetricPrefix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("gramUnitWithMetricPrefix:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object gramUnitWithMetricPrefix(@NInt long prefix);

	/**
	 * hourUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/hourUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hourUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object hourUnit();

	/**
	 * inchUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/inchUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inchUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object inchUnit();

	@Generated
	@Selector("init")
	public native HKUnit init();

	@Generated
	@Selector("initWithCoder:")
	public native HKUnit initWithCoder(NSCoder aDecoder);

	/**
	 * isNull</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/instm/HKUnit/isNull">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isNull")
	public native boolean isNull();

	/**
	 * jouleUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/jouleUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("jouleUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object jouleUnit();

	/**
	 * jouleUnitWithMetricPrefix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/jouleUnitWithMetricPrefix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("jouleUnitWithMetricPrefix:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object jouleUnitWithMetricPrefix(@NInt long prefix);

	/**
	 * kelvinUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/kelvinUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("kelvinUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object kelvinUnit();

	/**
	 * kilocalorieUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/kilocalorieUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("kilocalorieUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object kilocalorieUnit();

	/**
	 * lengthFormatterUnitFromUnit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/lengthFormatterUnitFromUnit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lengthFormatterUnitFromUnit:")
	@NInt
	public static native long lengthFormatterUnitFromUnit(HKUnit unit);

	/**
	 * literUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/literUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("literUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object literUnit();

	/**
	 * literUnitWithMetricPrefix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/literUnitWithMetricPrefix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("literUnitWithMetricPrefix:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object literUnitWithMetricPrefix(@NInt long prefix);

	/**
	 * massFormatterUnitFromUnit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/massFormatterUnitFromUnit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("massFormatterUnitFromUnit:")
	@NInt
	public static native long massFormatterUnitFromUnit(HKUnit unit);

	/**
	 * meterUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/meterUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("meterUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object meterUnit();

	/**
	 * meterUnitWithMetricPrefix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/meterUnitWithMetricPrefix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("meterUnitWithMetricPrefix:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object meterUnitWithMetricPrefix(@NInt long prefix);

	/**
	 * mileUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/mileUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mileUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mileUnit();

	/**
	 * millimeterOfMercuryUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/millimeterOfMercuryUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("millimeterOfMercuryUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object millimeterOfMercuryUnit();

	/**
	 * minuteUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/minuteUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minuteUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object minuteUnit();

	/**
	 * moleUnitWithMetricPrefix:molarMass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/moleUnitWithMetricPrefix:molarMass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("moleUnitWithMetricPrefix:molarMass:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object moleUnitWithMetricPrefixMolarMass(
			@NInt long prefix, double gramsPerMole);

	/**
	 * moleUnitWithMolarMass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/moleUnitWithMolarMass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("moleUnitWithMolarMass:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object moleUnitWithMolarMass(double gramsPerMole);

	/**
	 * ounceUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/ounceUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ounceUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object ounceUnit();

	/**
	 * pascalUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/pascalUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pascalUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object pascalUnit();

	/**
	 * pascalUnitWithMetricPrefix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/pascalUnitWithMetricPrefix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pascalUnitWithMetricPrefix:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object pascalUnitWithMetricPrefix(@NInt long prefix);

	/**
	 * percentUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/percentUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("percentUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object percentUnit();

	/**
	 * pintImperialUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/pintImperialUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pintImperialUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object pintImperialUnit();

	/**
	 * pintUSUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/pintUSUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pintUSUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object pintUSUnit();

	/**
	 * poundUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/poundUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("poundUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object poundUnit();

	/**
	 * reciprocalUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/instm/HKUnit/reciprocalUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reciprocalUnit")
	public native HKUnit reciprocalUnit();

	/**
	 * secondUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/secondUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("secondUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object secondUnit();

	/**
	 * secondUnitWithMetricPrefix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/secondUnitWithMetricPrefix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("secondUnitWithMetricPrefix:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object secondUnitWithMetricPrefix(@NInt long prefix);

	/**
	 * siemenUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/siemenUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("siemenUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object siemenUnit();

	/**
	 * siemenUnitWithMetricPrefix:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/siemenUnitWithMetricPrefix:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("siemenUnitWithMetricPrefix:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object siemenUnitWithMetricPrefix(@NInt long prefix);

	/**
	 * stoneUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/stoneUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stoneUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object stoneUnit();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * unitDividedByUnit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/instm/HKUnit/unitDividedByUnit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitDividedByUnit:")
	public native HKUnit unitDividedByUnit(HKUnit unit);

	/**
	 * unitFromEnergyFormatterUnit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/unitFromEnergyFormatterUnit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitFromEnergyFormatterUnit:")
	public static native HKUnit unitFromEnergyFormatterUnit(
			@NInt long energyFormatterUnit);

	/**
	 * unitFromLengthFormatterUnit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/unitFromLengthFormatterUnit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitFromLengthFormatterUnit:")
	public static native HKUnit unitFromLengthFormatterUnit(
			@NInt long lengthFormatterUnit);

	/**
	 * unitFromMassFormatterUnit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/unitFromMassFormatterUnit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitFromMassFormatterUnit:")
	public static native HKUnit unitFromMassFormatterUnit(
			@NInt long massFormatterUnit);

	/**
	 * unitFromString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/unitFromString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitFromString:")
	public static native HKUnit unitFromString(String string);

	/**
	 * unitMultipliedByUnit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/instm/HKUnit/unitMultipliedByUnit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitMultipliedByUnit:")
	public native HKUnit unitMultipliedByUnit(HKUnit unit);

	/**
	 * unitRaisedToPower:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/instm/HKUnit/unitRaisedToPower:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitRaisedToPower:")
	public native HKUnit unitRaisedToPower(@NInt long power);

	/**
	 * unitString</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/instp/HKUnit/unitString">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unitString")
	public native String unitString();

	/**
	 * cupImperialUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/cupImperialUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cupImperialUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object cupImperialUnit();

	/**
	 * cupUSUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/cupUSUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cupUSUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object cupUSUnit();

	/**
	 * yardUnit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HealthKit/Reference/HKUnit_Class/index.html#//apple_ref/occ/clm/HKUnit/yardUnit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("yardUnit")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object yardUnit();

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
