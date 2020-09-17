package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDateComponents;
import apple.foundation.NSDictionary;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSUnitEnergy;
import apple.foundation.NSUnitLength;
import apple.foundation.NSUserActivity;
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
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INGetCarPowerLevelStatusIntentResponse extends INIntentResponse {
    static {
        NatJ.register();
    }

    @Generated
    protected INGetCarPowerLevelStatusIntentResponse(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INGetCarPowerLevelStatusIntentResponse alloc();

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
    @Selector("chargePercentRemaining")
    public native NSNumber chargePercentRemaining();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("code")
    @NInt
    public native long code();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("distanceRemaining")
    public native NSMeasurement<NSUnitLength> distanceRemaining();

    @Generated
    @Selector("fuelPercentRemaining")
    public native NSNumber fuelPercentRemaining();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native INGetCarPowerLevelStatusIntentResponse init();

    @Generated
    @Selector("initWithCode:userActivity:")
    public native INGetCarPowerLevelStatusIntentResponse initWithCodeUserActivity(@NInt long code,
            NSUserActivity userActivity);

    @Generated
    @Selector("initWithCoder:")
    public native INGetCarPowerLevelStatusIntentResponse initWithCoder(NSCoder coder);

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
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setChargePercentRemaining:")
    public native void setChargePercentRemaining(NSNumber value);

    @Generated
    @Selector("setDistanceRemaining:")
    public native void setDistanceRemaining(NSMeasurement<NSUnitLength> value);

    @Generated
    @Selector("setFuelPercentRemaining:")
    public native void setFuelPercentRemaining(NSNumber value);

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
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("charging")
    public native NSNumber charging();

    @Generated
    @Selector("minutesToFull")
    public native NSNumber minutesToFull();

    @Generated
    @Selector("setCharging:")
    public native void setCharging(NSNumber value);

    @Generated
    @Selector("setMinutesToFull:")
    public native void setMinutesToFull(NSNumber value);

    @Generated
    @Selector("activeConnector")
    public native String activeConnector();

    @Generated
    @Selector("carIdentifier")
    public native String carIdentifier();

    @Generated
    @Selector("chargingFormulaArguments")
    public native NSDictionary<String, ?> chargingFormulaArguments();

    @Generated
    @Selector("consumptionFormulaArguments")
    public native NSDictionary<String, ?> consumptionFormulaArguments();

    @Generated
    @Selector("currentBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> currentBatteryCapacity();

    @Generated
    @Selector("dateOfLastStateUpdate")
    public native NSDateComponents dateOfLastStateUpdate();

    @Generated
    @Selector("distanceRemainingElectric")
    public native NSMeasurement<NSUnitLength> distanceRemainingElectric();

    @Generated
    @Selector("distanceRemainingFuel")
    public native NSMeasurement<NSUnitLength> distanceRemainingFuel();

    @Generated
    @Selector("maximumBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> maximumBatteryCapacity();

    @Generated
    @Selector("maximumDistance")
    public native NSMeasurement<NSUnitLength> maximumDistance();

    @Generated
    @Selector("maximumDistanceElectric")
    public native NSMeasurement<NSUnitLength> maximumDistanceElectric();

    @Generated
    @Selector("maximumDistanceFuel")
    public native NSMeasurement<NSUnitLength> maximumDistanceFuel();

    @Generated
    @Selector("minimumBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> minimumBatteryCapacity();

    @Generated
    @Selector("setActiveConnector:")
    public native void setActiveConnector(String value);

    @Generated
    @Selector("setCarIdentifier:")
    public native void setCarIdentifier(String value);

    @Generated
    @Selector("setChargingFormulaArguments:")
    public native void setChargingFormulaArguments(NSDictionary<String, ?> value);

    @Generated
    @Selector("setConsumptionFormulaArguments:")
    public native void setConsumptionFormulaArguments(NSDictionary<String, ?> value);

    @Generated
    @Selector("setCurrentBatteryCapacity:")
    public native void setCurrentBatteryCapacity(NSMeasurement<NSUnitEnergy> value);

    @Generated
    @Selector("setDateOfLastStateUpdate:")
    public native void setDateOfLastStateUpdate(NSDateComponents value);

    @Generated
    @Selector("setDistanceRemainingElectric:")
    public native void setDistanceRemainingElectric(NSMeasurement<NSUnitLength> value);

    @Generated
    @Selector("setDistanceRemainingFuel:")
    public native void setDistanceRemainingFuel(NSMeasurement<NSUnitLength> value);

    @Generated
    @Selector("setMaximumBatteryCapacity:")
    public native void setMaximumBatteryCapacity(NSMeasurement<NSUnitEnergy> value);

    @Generated
    @Selector("setMaximumDistance:")
    public native void setMaximumDistance(NSMeasurement<NSUnitLength> value);

    @Generated
    @Selector("setMaximumDistanceElectric:")
    public native void setMaximumDistanceElectric(NSMeasurement<NSUnitLength> value);

    @Generated
    @Selector("setMaximumDistanceFuel:")
    public native void setMaximumDistanceFuel(NSMeasurement<NSUnitLength> value);

    @Generated
    @Selector("setMinimumBatteryCapacity:")
    public native void setMinimumBatteryCapacity(NSMeasurement<NSUnitEnergy> value);
}