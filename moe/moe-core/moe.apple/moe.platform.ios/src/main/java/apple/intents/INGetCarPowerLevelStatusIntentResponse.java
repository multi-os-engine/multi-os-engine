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
 * API-Since: 10.3
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INGetCarPowerLevelStatusIntentResponse allocWithZone(VoidPtr zone);

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

    @Nullable
    @Generated
    @Selector("chargePercentRemaining")
    public native NSNumber chargePercentRemaining();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    /**
     * The distance that the car can travel on the remaining resources.
     */
    @Nullable
    @Generated
    @Selector("distanceRemaining")
    public native NSMeasurement<NSUnitLength> distanceRemaining();

    @Nullable
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

    /**
     * The app extension has the option of capturing its private state as an NSUserActivity and returning it as the
     * 'currentActivity'.
     * If the the app is launched, an NSUserActivity will be passed in with the private state. The NSUserActivity may
     * also be used to query the app's UI extension (if provided) for a view controller representing the current intent
     * handling state.
     * In the case of app launch, the NSUserActivity will have its activityType set to the name of the intent. This
     * intent object will also be available in the NSUserActivity.interaction property.
     */
    @Generated
    @Selector("initWithCode:userActivity:")
    public native INGetCarPowerLevelStatusIntentResponse initWithCodeUserActivity(@NInt long code,
            @Nullable NSUserActivity userActivity);

    @Generated
    @Selector("initWithCoder:")
    public native INGetCarPowerLevelStatusIntentResponse initWithCoder(@NotNull NSCoder coder);

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
    public static native INGetCarPowerLevelStatusIntentResponse new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setChargePercentRemaining:")
    public native void setChargePercentRemaining(@Nullable NSNumber value);

    /**
     * The distance that the car can travel on the remaining resources.
     */
    @Generated
    @Selector("setDistanceRemaining:")
    public native void setDistanceRemaining(@Nullable NSMeasurement<NSUnitLength> value);

    @Generated
    @Selector("setFuelPercentRemaining:")
    public native void setFuelPercentRemaining(@Nullable NSNumber value);

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

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("charging")
    public native NSNumber charging();

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("minutesToFull")
    public native NSNumber minutesToFull();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setCharging:")
    public native void setCharging(@Nullable NSNumber value);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setMinutesToFull:")
    public native void setMinutesToFull(@Nullable NSNumber value);

    /**
     * The current connector being used to deliver charge to the vehicle’s battery. If isCharging is set, this property
     * should contain the active connector that is currently being used to charge the vehicle.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("activeConnector")
    public native String activeConnector();

    /**
     * An identifier for the vehicles. Use this same value as the carIdentifier property of INCar. Do not use the VIN
     * (or the equivalent code) as the identifier.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("carIdentifier")
    public native String carIdentifier();

    /**
     * A dictionary mapping NSStrings to serializable objects (NSString, NSNumber, NSArray, NSDictionary, or NSNull)
     * that contains OEM provided parameters for the charging model that is used to calculate the duration of charging
     * at a station. The keys of this dictionary describe the parameters that fit into the Charging model of the
     * electric vehicle. The values of this dictionary represent the parameter values. model_id is a mandatory key in
     * this dictionary.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("chargingFormulaArguments")
    public native NSDictionary<String, ?> chargingFormulaArguments();

    /**
     * A dictionary mapping NSStrings to serializable objects (NSString, NSNumber, NSArray, NSDictionary, or NSNull)
     * that contains the OEM provided parameters for the consumption model used to calculate the vehicle’s energy
     * consumption as the user drives. The keys of this dictionary describe the parameters that fit into the consumption
     * model of the electric vehicle. The values of this dictionary represent the parameter values. model_id is a
     * mandatory key in this dictionary.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("consumptionFormulaArguments")
    public native NSDictionary<String, ?> consumptionFormulaArguments();

    /**
     * The current capacity of the battery. currentBatteryCapacity should be set such that maximumBatteryCapacity >=
     * currentBatteryCapacity >= minimumBatteryCapacity.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("currentBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> currentBatteryCapacity();

    /**
     * A time stamp for an instance of the state of charge. This time stamp should ideally indicate when the actual
     * state of charge was captured from the vehicle.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("dateOfLastStateUpdate")
    public native NSDateComponents dateOfLastStateUpdate();

    /**
     * The maximum distance an electric vehicle can travel with the remaining charge.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("distanceRemainingElectric")
    public native NSMeasurement<NSUnitLength> distanceRemainingElectric();

    /**
     * The maximum distance a vehicle can travel with the remaining fuel.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("distanceRemainingFuel")
    public native NSMeasurement<NSUnitLength> distanceRemainingFuel();

    /**
     * The maximum rated capacity of the vehicle’s battery. maximumBatteryCapacity should be set such that
     * maximumBatteryCapacity >= currentBatteryCapacity >= minimumBatteryCapacity.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("maximumBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> maximumBatteryCapacity();

    /**
     * The maximum distance a vehicle can travel with full resources. As the vehicle drives, this value can change over
     * time as a result of driving characteristics.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("maximumDistance")
    public native NSMeasurement<NSUnitLength> maximumDistance();

    /**
     * The maximum distance an electric vehicle can travel on a full charge. This value can change overtime (and over
     * several instances of the state of charge) as the vehicle drives.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("maximumDistanceElectric")
    public native NSMeasurement<NSUnitLength> maximumDistanceElectric();

    /**
     * The maximum distance a vehicle can travel with full resources. As the vehicle drives, this value can change over
     * time as a result of driving characteristics.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("maximumDistanceFuel")
    public native NSMeasurement<NSUnitLength> maximumDistanceFuel();

    /**
     * Minimum battery capacity. Used to display to the user as the minimum (not to be confused with the absolute 0 Wh).
     * This represents the value that is displayed to the driver as 0% battery. minimumBatteryCapacity should be set
     * such that maximumBatteryCapacity >= currentBatteryCapacity >= minimumBatteryCapacity.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("minimumBatteryCapacity")
    public native NSMeasurement<NSUnitEnergy> minimumBatteryCapacity();

    /**
     * The current connector being used to deliver charge to the vehicle’s battery. If isCharging is set, this property
     * should contain the active connector that is currently being used to charge the vehicle.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setActiveConnector:")
    public native void setActiveConnector(@Nullable String value);

    /**
     * An identifier for the vehicles. Use this same value as the carIdentifier property of INCar. Do not use the VIN
     * (or the equivalent code) as the identifier.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setCarIdentifier:")
    public native void setCarIdentifier(@Nullable String value);

    /**
     * A dictionary mapping NSStrings to serializable objects (NSString, NSNumber, NSArray, NSDictionary, or NSNull)
     * that contains OEM provided parameters for the charging model that is used to calculate the duration of charging
     * at a station. The keys of this dictionary describe the parameters that fit into the Charging model of the
     * electric vehicle. The values of this dictionary represent the parameter values. model_id is a mandatory key in
     * this dictionary.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setChargingFormulaArguments:")
    public native void setChargingFormulaArguments(@Nullable NSDictionary<String, ?> value);

    /**
     * A dictionary mapping NSStrings to serializable objects (NSString, NSNumber, NSArray, NSDictionary, or NSNull)
     * that contains the OEM provided parameters for the consumption model used to calculate the vehicle’s energy
     * consumption as the user drives. The keys of this dictionary describe the parameters that fit into the consumption
     * model of the electric vehicle. The values of this dictionary represent the parameter values. model_id is a
     * mandatory key in this dictionary.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setConsumptionFormulaArguments:")
    public native void setConsumptionFormulaArguments(@Nullable NSDictionary<String, ?> value);

    /**
     * The current capacity of the battery. currentBatteryCapacity should be set such that maximumBatteryCapacity >=
     * currentBatteryCapacity >= minimumBatteryCapacity.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setCurrentBatteryCapacity:")
    public native void setCurrentBatteryCapacity(@Nullable NSMeasurement<NSUnitEnergy> value);

    /**
     * A time stamp for an instance of the state of charge. This time stamp should ideally indicate when the actual
     * state of charge was captured from the vehicle.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDateOfLastStateUpdate:")
    public native void setDateOfLastStateUpdate(@Nullable NSDateComponents value);

    /**
     * The maximum distance an electric vehicle can travel with the remaining charge.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDistanceRemainingElectric:")
    public native void setDistanceRemainingElectric(@Nullable NSMeasurement<NSUnitLength> value);

    /**
     * The maximum distance a vehicle can travel with the remaining fuel.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setDistanceRemainingFuel:")
    public native void setDistanceRemainingFuel(@Nullable NSMeasurement<NSUnitLength> value);

    /**
     * The maximum rated capacity of the vehicle’s battery. maximumBatteryCapacity should be set such that
     * maximumBatteryCapacity >= currentBatteryCapacity >= minimumBatteryCapacity.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMaximumBatteryCapacity:")
    public native void setMaximumBatteryCapacity(@Nullable NSMeasurement<NSUnitEnergy> value);

    /**
     * The maximum distance a vehicle can travel with full resources. As the vehicle drives, this value can change over
     * time as a result of driving characteristics.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMaximumDistance:")
    public native void setMaximumDistance(@Nullable NSMeasurement<NSUnitLength> value);

    /**
     * The maximum distance an electric vehicle can travel on a full charge. This value can change overtime (and over
     * several instances of the state of charge) as the vehicle drives.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMaximumDistanceElectric:")
    public native void setMaximumDistanceElectric(@Nullable NSMeasurement<NSUnitLength> value);

    /**
     * The maximum distance a vehicle can travel with full resources. As the vehicle drives, this value can change over
     * time as a result of driving characteristics.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMaximumDistanceFuel:")
    public native void setMaximumDistanceFuel(@Nullable NSMeasurement<NSUnitLength> value);

    /**
     * Minimum battery capacity. Used to display to the user as the minimum (not to be confused with the absolute 0 Wh).
     * This represents the value that is displayed to the driver as 0% battery. minimumBatteryCapacity should be set
     * such that maximumBatteryCapacity >= currentBatteryCapacity >= minimumBatteryCapacity.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMinimumBatteryCapacity:")
    public native void setMinimumBatteryCapacity(@Nullable NSMeasurement<NSUnitEnergy> value);
}
