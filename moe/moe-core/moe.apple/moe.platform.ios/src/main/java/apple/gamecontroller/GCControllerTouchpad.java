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

    @Generated
    @Selector("reportsAbsoluteTouchSurfaceValues")
    public native boolean reportsAbsoluteTouchSurfaceValues();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setReportsAbsoluteTouchSurfaceValues:")
    public native void setReportsAbsoluteTouchSurfaceValues(boolean value);

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

    @Generated
    @Selector("touchState")
    @NInt
    public native long touchState();

    @Generated
    @Selector("touchSurface")
    public native GCControllerDirectionPad touchSurface();

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