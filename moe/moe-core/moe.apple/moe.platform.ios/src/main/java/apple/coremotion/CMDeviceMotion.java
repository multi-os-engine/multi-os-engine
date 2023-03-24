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

package apple.coremotion;

import apple.NSObject;
import apple.coremotion.struct.CMAcceleration;
import apple.coremotion.struct.CMCalibratedMagneticField;
import apple.coremotion.struct.CMRotationRate;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * CMDeviceMotion
 * 
 * Discussion:
 * A CMDeviceMotion object contains basic information about the device's
 * motion.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMDeviceMotion extends CMLogItem {
    static {
        NatJ.register();
    }

    @Generated
    protected CMDeviceMotion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMDeviceMotion alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CMDeviceMotion allocWithZone(VoidPtr zone);

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
    public static native CMDeviceMotion new_objc();

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

    /**
     * attitude
     * 
     * Discussion:
     * Returns the attitude of the device.
     */
    @NotNull
    @Generated
    @Selector("attitude")
    public native CMAttitude attitude();

    /**
     * gravity
     * 
     * Discussion:
     * Returns the gravity vector expressed in the device's reference frame. Note
     * that the total acceleration of the device is equal to gravity plus
     * userAcceleration.
     */
    @Generated
    @Selector("gravity")
    @ByValue
    public native CMAcceleration gravity();

    @Generated
    @Selector("init")
    public native CMDeviceMotion init();

    @Generated
    @Selector("initWithCoder:")
    public native CMDeviceMotion initWithCoder(@NotNull NSCoder coder);

    /**
     * magneticField
     * 
     * Discussion:
     * Returns the magnetic field vector with respect to the device for devices with a magnetometer.
     * Note that this is the total magnetic field in the device's vicinity without device
     * bias (Earth's magnetic field plus surrounding fields, without device bias),
     * unlike CMMagnetometerData magneticField.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("magneticField")
    @ByValue
    public native CMCalibratedMagneticField magneticField();

    /**
     * rotationRate
     * 
     * Discussion:
     * Returns the rotation rate of the device for devices with a gyro.
     */
    @Generated
    @Selector("rotationRate")
    @ByValue
    public native CMRotationRate rotationRate();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * userAcceleration
     * 
     * Discussion:
     * Returns the acceleration that the user is giving to the device. Note
     * that the total acceleration of the device is equal to gravity plus
     * userAcceleration.
     */
    @Generated
    @Selector("userAcceleration")
    @ByValue
    public native CMAcceleration userAcceleration();

    /**
     * heading
     * 
     * Discussion:
     * Returns heading angle in the range [0,360) degrees with respect to the CMAttitude reference frame. A negative
     * value is returned
     * for CMAttitudeReferenceFrameXArbitraryZVertical and CMAttitudeReferenceFrameXArbitraryCorrectedZVertical.
     * 
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("heading")
    public native double heading();

    /**
     * sensorLocation
     * 
     * Discussion:
     * Returns the location of the sensors used to compute the device motion data.
     * 
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("sensorLocation")
    @NInt
    public native long sensorLocation();
}
