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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCControllerButtonInput extends GCControllerElement {
    static {
        NatJ.register();
    }

    @Generated
    protected GCControllerButtonInput(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCControllerButtonInput alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCControllerButtonInput allocWithZone(VoidPtr zone);

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
    public static native GCControllerButtonInput new_objc();

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
    @Selector("init")
    public native GCControllerButtonInput init();

    /**
     * Buttons are mostly used in a digital sense, thus we have a recommended method for checking for pressed state
     * instead of
     * interpreting the value.
     * 
     * As a general guideline a button is pressed if the value exceeds 0. However there may be hysterisis applied
     * to counter noisy input values, thus incidental values around the threshold value may not trigger a change
     * in pressed state.
     * 
     * Others buttons may support two-stage actuation, where the button reports a value between 0 and 1 but is only
     * considered
     * pressed when its value is greater than some threshold other than 0.
     * 
     * @see pressedChangedHandler
     * @see value
     */
    @Generated
    @Selector("isPressed")
    public native boolean isPressed();

    /**
     * Set this block if you want to be notified when only the pressed state on this button changes. This
     * will get called less often than the valueChangedHandler with the additional feature of the pressed state
     * being different to the last time it was called.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("pressedChangedHandler")
    @ObjCBlock(name = "call_pressedChangedHandler_ret")
    public native Block_pressedChangedHandler_ret pressedChangedHandler();

    /**
     * Set this block if you want to be notified when only the pressed state on this button changes. This
     * will get called less often than the valueChangedHandler with the additional feature of the pressed state
     * being different to the last time it was called.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPressedChangedHandler:")
    public native void setPressedChangedHandler(
            @Nullable @ObjCBlock(name = "call_setPressedChangedHandler") Block_setPressedChangedHandler value);

    @Generated
    @Selector("setValueChangedHandler:")
    public native void setValueChangedHandler(
            @Nullable @ObjCBlock(name = "call_setValueChangedHandler") Block_setValueChangedHandler value);

    /**
     * A normalized value for the input. Between 0 and 1 for button inputs. Values are saturated and thus never exceed
     * the range of [0, 1].
     * 
     * @see valueChangedHandler
     * @see pressed
     */
    @Generated
    @Selector("value")
    public native float value();

    @Nullable
    @Generated
    @Selector("valueChangedHandler")
    @ObjCBlock(name = "call_valueChangedHandler_ret")
    public native Block_valueChangedHandler_ret valueChangedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pressedChangedHandler_ret {
        @Generated
        void call_pressedChangedHandler_ret(@NotNull GCControllerButtonInput button, float value, boolean pressed);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPressedChangedHandler {
        @Generated
        void call_setPressedChangedHandler(@NotNull GCControllerButtonInput button, float value, boolean pressed);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setValueChangedHandler {
        @Generated
        void call_setValueChangedHandler(@NotNull GCControllerButtonInput button, float value, boolean pressed);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueChangedHandler_ret {
        @Generated
        void call_valueChangedHandler_ret(@NotNull GCControllerButtonInput button, float value, boolean pressed);
    }

    /**
     * Sets the normalized value for the button input. Will update the pressed state of the button.
     * 
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     * 
     * @param value the value to set the input to.
     * @see value
     * 
     *      API-Since: 13.0
     */
    @Generated
    @Selector("setValue:")
    public native void setValue(float value);

    /**
     * Some buttons feature capacitive touch capabilities where the user can touch the button
     * without pressing it. In such cases, a button will be touched before it is pressed.
     * 
     * For buttons without capacitive sensing, the touched state is true if the value exceeds 0.
     * 
     * @see touchChangedHandler
     * @see pressed
     */
    @Generated
    @Selector("isTouched")
    public native boolean isTouched();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setTouchedChangedHandler:")
    public native void setTouchedChangedHandler(
            @Nullable @ObjCBlock(name = "call_setTouchedChangedHandler") Block_setTouchedChangedHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTouchedChangedHandler {
        @Generated
        void call_setTouchedChangedHandler(@NotNull GCControllerButtonInput button, float value, boolean pressed,
                boolean touched);
    }

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("touchedChangedHandler")
    @ObjCBlock(name = "call_touchedChangedHandler_ret")
    public native Block_touchedChangedHandler_ret touchedChangedHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_touchedChangedHandler_ret {
        @Generated
        void call_touchedChangedHandler_ret(@NotNull GCControllerButtonInput button, float value, boolean pressed,
                boolean touched);
    }
}
