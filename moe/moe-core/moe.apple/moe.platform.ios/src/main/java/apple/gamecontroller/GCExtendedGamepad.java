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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCExtendedGamepad extends GCPhysicalInputProfile {
    static {
        NatJ.register();
    }

    @Generated
    protected GCExtendedGamepad(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCExtendedGamepad alloc();

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
     * All face buttons are required to be analog in the Extended profile. These must be arranged
     * in the diamond pattern given below:
     * <p>
     * Y
     * / \
     * X   B
     * \ /
     * A
     */
    @Generated
    @Selector("buttonA")
    public native GCControllerButtonInput buttonA();

    @Generated
    @Selector("buttonB")
    public native GCControllerButtonInput buttonB();

    @Generated
    @Selector("buttonX")
    public native GCControllerButtonInput buttonX();

    @Generated
    @Selector("buttonY")
    public native GCControllerButtonInput buttonY();

    @Generated
    @Selector("controller")
    public native GCController controller();

    /**
     * Required to be analog in the Extended profile. All the elements of this directional input are thus analog.
     */
    @Generated
    @Selector("dpad")
    public native GCControllerDirectionPad dpad();

    @Generated
    @Selector("init")
    public native GCExtendedGamepad init();

    /**
     * Shoulder buttons are required to be analog inputs.
     */
    @Generated
    @Selector("leftShoulder")
    public native GCControllerButtonInput leftShoulder();

    /**
     * A thumbstick is a 2-axis control that is physically required to be analog. All the elements of this directional input are thus analog.
     */
    @Generated
    @Selector("leftThumbstick")
    public native GCControllerDirectionPad leftThumbstick();

    /**
     * Triggers are required to be analog inputs. Common uses would be acceleration and decelleration in a driving game for example.
     */
    @Generated
    @Selector("leftTrigger")
    public native GCControllerButtonInput leftTrigger();

    /**
     * Shoulder buttons are required to be analog inputs.
     */
    @Generated
    @Selector("rightShoulder")
    public native GCControllerButtonInput rightShoulder();

    /**
     * A thumbstick is a 2-axis control that is physically required to be analog. All the elements of this directional input are thus analog.
     */
    @Generated
    @Selector("rightThumbstick")
    public native GCControllerDirectionPad rightThumbstick();

    @Generated
    @Selector("rightTrigger")
    public native GCControllerButtonInput rightTrigger();

    /**
     * Polls the state vector of the controller and saves it to a snapshot. The snapshot is stored in a device independent
     * format that can be serialized and used at a later date. This is useful for features such as quality assurance,
     * save game or replay functionality among many.
     * <p>
     * If your application is heavily multithreaded this may also be useful to guarantee atomicity of input handling as
     * a snapshot will not change based on user input once it is taken.
     */
    @Generated
    @Selector("saveSnapshot")
    public native GCExtendedGamepadSnapshot saveSnapshot();

    @Generated
    @Selector("setValueChangedHandler:")
    public native void setValueChangedHandler(
            @ObjCBlock(name = "call_setValueChangedHandler") Block_setValueChangedHandler value);

    @Generated
    @Selector("valueChangedHandler")
    @ObjCBlock(name = "call_valueChangedHandler_ret")
    public native Block_valueChangedHandler_ret valueChangedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setValueChangedHandler {
        @Generated
        void call_setValueChangedHandler(GCExtendedGamepad gamepad, GCControllerElement element);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueChangedHandler_ret {
        @Generated
        void call_valueChangedHandler_ret(GCExtendedGamepad gamepad, GCControllerElement element);
    }

    /**
     * Button menu is the primary menu button, and should be used to enter the main menu and pause the game.
     */
    @Generated
    @Selector("buttonMenu")
    public native GCControllerButtonInput buttonMenu();

    /**
     * Button options is the secondary menu button. It should be used to enter a secondary menu, such as graphics and sound configuration, and pause the game.
     */
    @Generated
    @Selector("buttonOptions")
    public native GCControllerButtonInput buttonOptions();

    /**
     * A thumbstick may also have a clickable component, which is treated as a non-analog button.
     */
    @Generated
    @Selector("leftThumbstickButton")
    public native GCControllerButtonInput leftThumbstickButton();

    @Generated
    @Selector("rightThumbstickButton")
    public native GCControllerButtonInput rightThumbstickButton();

    /**
     * Sets the state vector of the extended gamepad to a copy of the input extended gamepad's state vector.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @see GCController.snapshot
     */
    @Generated
    @Selector("setStateFromExtendedGamepad:")
    public native void setStateFromExtendedGamepad(GCExtendedGamepad extendedGamepad);

    /**
     * Button home is a special menu button. If the system does not consume button home events, they will be passed to your application and should be used to enter a secondary menu, and pause the game.
     */
    @Generated
    @Selector("buttonHome")
    public native GCControllerButtonInput buttonHome();
}
