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

/**
 * A touchpad is a touch-based two axis input with a notion of "touch state". It keeps track of
 * whether the touchpad is actively being touched, and generates events based on a
 * change in touch state.
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCControllerTouchpad extends GCControllerElement {
    static {
        NatJ.register();
    }

    @Generated
    protected GCControllerTouchpad(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCControllerTouchpad alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Button is the button built into the touch surface.
     */
    @Generated
    @Selector("button")
    public native GCControllerButtonInput button();

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
    @Selector("init")
    public native GCControllerTouchpad init();

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

    /**
     * The touchpad can use the raw position values of its surface as D-pad values, or it can create a virtual dpad centered around the first contact point with the surface.
     * <p>
     * If NO; a smaller sliding window is created around the initial touch point and subsequent movement is relative to that center. Movement outside the window will slide the window with it to re-center it. This is great for surfaces where there is no clear sense of a middle and drift over time is an issue.
     * <p>
     * If YES; the absolute values are used and any drift will have to managed manually either through user traning or by a developer using the dpad.
     * <p>
     * The default value for this property is YES, meaning the touch surface's raw positional values are reported.
     */
    @Generated
    @Selector("reportsAbsoluteTouchSurfaceValues")
    public native boolean reportsAbsoluteTouchSurfaceValues();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The touchpad can use the raw position values of its surface as D-pad values, or it can create a virtual dpad centered around the first contact point with the surface.
     * <p>
     * If NO; a smaller sliding window is created around the initial touch point and subsequent movement is relative to that center. Movement outside the window will slide the window with it to re-center it. This is great for surfaces where there is no clear sense of a middle and drift over time is an issue.
     * <p>
     * If YES; the absolute values are used and any drift will have to managed manually either through user traning or by a developer using the dpad.
     * <p>
     * The default value for this property is YES, meaning the touch surface's raw positional values are reported.
     */
    @Generated
    @Selector("setReportsAbsoluteTouchSurfaceValues:")
    public native void setReportsAbsoluteTouchSurfaceValues(boolean value);

    /**
     * Called when a touch event begins on the touchpad.
     */
    @Generated
    @Selector("setTouchDown:")
    public native void setTouchDown(@ObjCBlock(name = "call_setTouchDown") Block_setTouchDown value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTouchDown {
        @Generated
        void call_setTouchDown(GCControllerTouchpad touchpad, float xValue, float yValue, float buttonValue,
                boolean buttonPressed);
    }

    /**
     * Called when a touch event continues on the touchpad, but not when it begins or ends.
     */
    @Generated
    @Selector("setTouchMoved:")
    public native void setTouchMoved(@ObjCBlock(name = "call_setTouchMoved") Block_setTouchMoved value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTouchMoved {
        @Generated
        void call_setTouchMoved(GCControllerTouchpad touchpad, float xValue, float yValue, float buttonValue,
                boolean buttonPressed);
    }

    /**
     * Called when a touch event ends on the touchpad.
     */
    @Generated
    @Selector("setTouchUp:")
    public native void setTouchUp(@ObjCBlock(name = "call_setTouchUp") Block_setTouchUp value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTouchUp {
        @Generated
        void call_setTouchUp(GCControllerTouchpad touchpad, float xValue, float yValue, float buttonValue,
                boolean buttonPressed);
    }

    /**
     * Sets the normalized value for the touchpad's axes, as well as its current touch and button state.
     * <p>
     * [@note] If the controller's snapshot flag is set to NO, this method has no effect.
     *
     * @see touchSurface
     * @see touchState
     */
    @Generated
    @Selector("setValueForXAxis:yAxis:touchDown:buttonValue:")
    public native void setValueForXAxisYAxisTouchDownButtonValue(float xAxis, float yAxis, boolean touchDown,
            float buttonValue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Called when a touch event begins on the touchpad.
     */
    @Generated
    @Selector("touchDown")
    @ObjCBlock(name = "call_touchDown_ret")
    public native Block_touchDown_ret touchDown();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_touchDown_ret {
        @Generated
        void call_touchDown_ret(GCControllerTouchpad touchpad, float xValue, float yValue, float buttonValue,
                boolean buttonPressed);
    }

    /**
     * Called when a touch event continues on the touchpad, but not when it begins or ends.
     */
    @Generated
    @Selector("touchMoved")
    @ObjCBlock(name = "call_touchMoved_ret")
    public native Block_touchMoved_ret touchMoved();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_touchMoved_ret {
        @Generated
        void call_touchMoved_ret(GCControllerTouchpad touchpad, float xValue, float yValue, float buttonValue,
                boolean buttonPressed);
    }

    /**
     * Indicates the current state of the touch event on the touchpad.
     */
    @Generated
    @Selector("touchState")
    @NInt
    public native long touchState();

    /**
     * The touch surface is a 2-axis control that represents the position of a touch event on the touchpad.
     * <p>
     * The axes will indicate the most recent touch position - a non-zero value does not indicate that the
     * surface is being touched, and a value of (0, 0) does not indicate the surface is not being touched.
     *
     * @see touchState - Should be polled in conjunction with touchSurface to determine if values are valid
     */
    @Generated
    @Selector("touchSurface")
    public native GCControllerDirectionPad touchSurface();

    /**
     * Called when a touch event ends on the touchpad.
     */
    @Generated
    @Selector("touchUp")
    @ObjCBlock(name = "call_touchUp_ret")
    public native Block_touchUp_ret touchUp();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_touchUp_ret {
        @Generated
        void call_touchUp_ret(GCControllerTouchpad touchpad, float xValue, float yValue, float buttonValue,
                boolean buttonPressed);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
