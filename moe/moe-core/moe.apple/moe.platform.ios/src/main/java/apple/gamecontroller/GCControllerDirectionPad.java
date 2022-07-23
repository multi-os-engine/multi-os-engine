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

/**
 * A direction pad is a common grouping of 2 axis inputs where the input can also be interpreted as 2 sets of mutually
 * exclusive button pairs.
 * Only one button in each pair, {up, down} and {left, right}, can be pressed at any one time.
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCControllerDirectionPad extends GCControllerElement {
    static {
        NatJ.register();
    }

    @Generated
    protected GCControllerDirectionPad(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCControllerDirectionPad alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GCControllerDirectionPad allocWithZone(VoidPtr zone);

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
    public static native GCControllerDirectionPad new_objc();

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
    @Selector("down")
    public native GCControllerButtonInput down();

    @Generated
    @Selector("init")
    public native GCControllerDirectionPad init();

    @Generated
    @Selector("left")
    public native GCControllerButtonInput left();

    @Generated
    @Selector("right")
    public native GCControllerButtonInput right();

    @Generated
    @Selector("setValueChangedHandler:")
    public native void setValueChangedHandler(
            @ObjCBlock(name = "call_setValueChangedHandler") Block_setValueChangedHandler value);

    @Generated
    @Selector("up")
    public native GCControllerButtonInput up();

    @Generated
    @Selector("valueChangedHandler")
    @ObjCBlock(name = "call_valueChangedHandler_ret")
    public native Block_valueChangedHandler_ret valueChangedHandler();

    @Generated
    @Selector("xAxis")
    public native GCControllerAxisInput xAxis();

    @Generated
    @Selector("yAxis")
    public native GCControllerAxisInput yAxis();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setValueChangedHandler {
        @Generated
        void call_setValueChangedHandler(GCControllerDirectionPad dpad, float xValue, float yValue);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_valueChangedHandler_ret {
        @Generated
        void call_valueChangedHandler_ret(GCControllerDirectionPad dpad, float xValue, float yValue);
    }

    /**
     * Sets the normalized value for the direction pad's axis inputs. Will update the states of the direction pad's
     * button inputs as well.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @param xAxis the value to set the xAxis of the touchpad to.
     * @param yAxis the value to set the yAxis of the touchpad to.
     * @see value
     * @see pressed
     */
    @Generated
    @Selector("setValueForXAxis:yAxis:")
    public native void setValueForXAxisYAxis(float xAxis, float yAxis);
}
