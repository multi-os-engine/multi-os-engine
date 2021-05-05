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
public class GCMicroGamepad extends GCPhysicalInputProfile {
    static {
        NatJ.register();
    }

    @Generated
    protected GCMicroGamepad(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCMicroGamepad alloc();

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
     * Allows the Micro profile to monitor the orientation of the controller, if the controller is positioned in landscape orientation, D-pad input values will be transposed 90 degrees to match the new orientation.
     * 
     * The default value for this property is NO.
     */
    @Generated
    @Selector("allowsRotation")
    public native boolean allowsRotation();

    /**
     * The Micro profile has two buttons that are optionally analog in the Micro profile.
     * Button A is the primary action button, it indicates affirmative action and should be used to advance in menus
     * or perform the primary action in gameplay.
     */
    @Generated
    @Selector("buttonA")
    public native GCControllerButtonInput buttonA();

    /**
     * Button X is the secondary action button, it indicates an alternate affirmative action and should be used to perform
     * a secondary action. If there is no secondary action it should be used as equivalent to buttonA.
     * 
     * Unlike on other profiles there is no negative button on this profile. Instead the menu button should be
     * used to present menu content or to retreat in a menu flow.
     * 
     * @see buttonA
     */
    @Generated
    @Selector("buttonX")
    public native GCControllerButtonInput buttonX();

    @Generated
    @Selector("controller")
    public native GCController controller();

    /**
     * Optionally analog in the Micro profile. All the elements of this directional input are either analog or digital.
     */
    @Generated
    @Selector("dpad")
    public native GCControllerDirectionPad dpad();

    @Generated
    @Selector("init")
    public native GCMicroGamepad init();

    /**
     * The Micro profile can use the raw position values of the touchpad on the remote as D-pad values, or it can create a virtual dpad centered around the first contact point with the surface.
     * 
     * If NO; a smaller sliding window is created around the initial touch point and subsequent movement is relative to that center. Movement outside the window will slide the window with it to re-center it. This is great for surfaces where there is no clear sense of a middle and drift over time is an issue.
     * 
     * If YES; the absolute values are used and any drift will have to managed manually either through user traning or by a developer using the dpad.
     * 
     * The default value for this property is NO, meaning a sliding window is used for the dpad.
     */
    @Generated
    @Selector("reportsAbsoluteDpadValues")
    public native boolean reportsAbsoluteDpadValues();

    /**
     * Polls the state vector of the controller and saves it to a snapshot. The snapshot is stored in a device independent
     * format that can be serialized and used at a later date. This is useful for features such as quality assurance,
     * save game or replay functionality among many.
     * 
     * If your application is heavily multithreaded this may also be useful to guarantee atomicity of input handling as
     * a snapshot will not change based on user input once it is taken.
     * 
     * @see GCMicroGamepadSnapshot
     */
    @Generated
    @Selector("saveSnapshot")
    public native GCMicroGamepadSnapshot saveSnapshot();

    /**
     * Allows the Micro profile to monitor the orientation of the controller, if the controller is positioned in landscape orientation, D-pad input values will be transposed 90 degrees to match the new orientation.
     * 
     * The default value for this property is NO.
     */
    @Generated
    @Selector("setAllowsRotation:")
    public native void setAllowsRotation(boolean value);

    /**
     * The Micro profile can use the raw position values of the touchpad on the remote as D-pad values, or it can create a virtual dpad centered around the first contact point with the surface.
     * 
     * If NO; a smaller sliding window is created around the initial touch point and subsequent movement is relative to that center. Movement outside the window will slide the window with it to re-center it. This is great for surfaces where there is no clear sense of a middle and drift over time is an issue.
     * 
     * If YES; the absolute values are used and any drift will have to managed manually either through user traning or by a developer using the dpad.
     * 
     * The default value for this property is NO, meaning a sliding window is used for the dpad.
     */
    @Generated
    @Selector("setReportsAbsoluteDpadValues:")
    public native void setReportsAbsoluteDpadValues(boolean value);

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
        void call_setValueChangedHandler(GCMicroGamepad gamepad, GCControllerElement element);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueChangedHandler_ret {
        @Generated
        void call_valueChangedHandler_ret(GCMicroGamepad gamepad, GCControllerElement element);
    }

    /**
     * Button menu is the primary menu button, and should be used to enter the main menu and pause the game.
     */
    @Generated
    @Selector("buttonMenu")
    public native GCControllerButtonInput buttonMenu();

    /**
     * Sets the state vector of the micro gamepad to a copy of the input micro gamepad's state vector.
     * 
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     * 
     * @see GCController.snapshot
     */
    @Generated
    @Selector("setStateFromMicroGamepad:")
    public native void setStateFromMicroGamepad(GCMicroGamepad microGamepad);
}
