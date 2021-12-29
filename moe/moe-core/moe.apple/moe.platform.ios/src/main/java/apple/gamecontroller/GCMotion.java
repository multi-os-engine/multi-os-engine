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

package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamecontroller.struct.GCAcceleration;
import apple.gamecontroller.struct.GCQuaternion;
import apple.gamecontroller.struct.GCRotationRate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A profile for getting motion input from a controller that has the ability to measure acceleration
 * and rotation rate.
 * <p>
 * You check for the availablity of motion inputs by getting the motion property
 * of a controller. If that returns a nil value; motion is not available. A non-nil value is a valid
 * GCMotion profile that is able to provide motion input.
 *
 * @see GCController.motion
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCMotion extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GCMotion(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCMotion alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCMotion allocWithZone(VoidPtr zone);

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
    public static native GCMotion new_objc();

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
     * The current attitude of the controller.
     * <p>
     * [@note] Remotes without accurate attitude and rotation rate can not determine a stable attitude so the values will be (0,0,0,1) at all times.
     *
     * @see hasAttitude
     * @see GCMicroGamepad
     */
    @Generated
    @Selector("attitude")
    @ByValue
    public native GCQuaternion attitude();

    @Generated
    @Selector("controller")
    public native GCController controller();

    /**
     * The gravity vector expressed in the controller's reference frame.
     * <p>
     * Note that the total acceleration of the controller is equal to gravity plus userAcceleration.
     *
     * @see userAcceleration
     * @see acceleration
     */
    @Generated
    @Selector("gravity")
    @ByValue
    public native GCAcceleration gravity();

    @Generated
    @Selector("init")
    public native GCMotion init();

    /**
     * The current rotation rate of the controller.
     * <p>
     * [@note] Remotes without accurate attitude and rotation rate can not determine a stable rotation rate so the values will be (0,0,0) at all times.
     *
     * @see hasRotationRate
     * @see GCMicroGamepad
     */
    @Generated
    @Selector("rotationRate")
    @ByValue
    public native GCRotationRate rotationRate();

    @Generated
    @Selector("setValueChangedHandler:")
    public native void setValueChangedHandler(
            @ObjCBlock(name = "call_setValueChangedHandler") Block_setValueChangedHandler value);

    /**
     * The acceleration that the user is giving to the controller.
     * <p>
     * Note that the total acceleration of the controller is equal to gravity plus userAcceleration.
     *
     * @see gravity
     * @see acceleration
     */
    @Generated
    @Selector("userAcceleration")
    @ByValue
    public native GCAcceleration userAcceleration();

    @Generated
    @Selector("valueChangedHandler")
    @ObjCBlock(name = "call_valueChangedHandler_ret")
    public native Block_valueChangedHandler_ret valueChangedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setValueChangedHandler {
        @Generated
        void call_setValueChangedHandler(GCMotion motion);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueChangedHandler_ret {
        @Generated
        void call_valueChangedHandler_ret(GCMotion motion);
    }

    /**
     * The controller generating the motion data has sensors that can accurately determine the current attitude and rotation rate. If this is enabled the motion data for attitude and rotation rate are usable for inputs.
     */
    @Generated
    @Selector("hasAttitudeAndRotationRate")
    public native boolean hasAttitudeAndRotationRate();

    /**
     * Sets the current rotation rate of the controller.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @see attitude
     */
    @Generated
    @Selector("setAttitude:")
    public native void setAttitude(@ByValue GCQuaternion attitude);

    /**
     * Sets the gravity vector expressed in the controller's reference frame.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @see gravity
     */
    @Generated
    @Selector("setGravity:")
    public native void setGravity(@ByValue GCAcceleration gravity);

    /**
     * Sets the current rotation rate of the controller.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @see rotationRate
     */
    @Generated
    @Selector("setRotationRate:")
    public native void setRotationRate(@ByValue GCRotationRate rotationRate);

    /**
     * Sets the state vector of the motion profile to a copy of the input motion profile's state vector.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @see GCController.snapshot
     */
    @Generated
    @Selector("setStateFromMotion:")
    public native void setStateFromMotion(GCMotion motion);

    /**
     * Sets the acceleration that the user is giving to the controller.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @see userAcceleration
     */
    @Generated
    @Selector("setUserAcceleration:")
    public native void setUserAcceleration(@ByValue GCAcceleration userAcceleration);

    /**
     * The total acceleration of the controller.
     *
     * @see gravity
     * @see userAcceleration
     */
    @Generated
    @Selector("acceleration")
    @ByValue
    public native GCAcceleration acceleration();

    /**
     * The controller generating the motion data has sensors that can accurately determine the current attitude. If this is enabled the motion data for attitude is usable for inputs.
     */
    @Generated
    @Selector("hasAttitude")
    public native boolean hasAttitude();

    /**
     * Returns YES if the controller is capable of reporting gravity and user acceleration separately.
     * <p>
     * [@note] Some controllers do not separate gravity from user acceleration, and only report the total acceleration of the controller.
     * Query whether the connected controller has the ability to separate gravity and user acceleration, and it doesn’t, use acceleration instead.
     *
     * @see acceleration
     */
    @Generated
    @Selector("hasGravityAndUserAcceleration")
    public native boolean hasGravityAndUserAcceleration();

    /**
     * The controller generating the motion data has sensors that can accurately determine the current rotation rate. If this is enabled the motion data for rotation rate is usable for inputs.
     */
    @Generated
    @Selector("hasRotationRate")
    public native boolean hasRotationRate();

    /**
     * Set this property to YES when you wish to receive motion data from the controller. When you set this property to NO, the motion sensors
     * will be disabled and the GCMotion profile will not be updated.
     * <p>
     * [@note] It is highly recommended that you only enable sensor during the period of time you directly need motion data. Motion sensors
     * can drain controller battery, device battery, and needlessly consume Bluetooth bandwidth.
     *
     * @see sensorsRequireManualActivation
     */
    @Generated
    @Selector("sensorsActive")
    public native boolean sensorsActive();

    /**
     * If this property is returns YES, you are responsible for setting sensorsActive to YES when you need motion data from the controller.
     * <p>
     * Some controllers, such as the Siri Remote, automatically activate and deactivate motion sensors. In such a case, this property
     * will return NO.
     *
     * @see sensorsActive
     */
    @Generated
    @Selector("sensorsRequireManualActivation")
    public native boolean sensorsRequireManualActivation();

    /**
     * Sets the acceleration that the user is giving to the controller.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @see userAcceleration
     */
    @Generated
    @Selector("setAcceleration:")
    public native void setAcceleration(@ByValue GCAcceleration acceleration);

    /**
     * Set this property to YES when you wish to receive motion data from the controller. When you set this property to NO, the motion sensors
     * will be disabled and the GCMotion profile will not be updated.
     * <p>
     * [@note] It is highly recommended that you only enable sensor during the period of time you directly need motion data. Motion sensors
     * can drain controller battery, device battery, and needlessly consume Bluetooth bandwidth.
     *
     * @see sensorsRequireManualActivation
     */
    @Generated
    @Selector("setSensorsActive:")
    public native void setSensorsActive(boolean value);
}
