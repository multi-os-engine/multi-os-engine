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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * DualSense triggers are required to be analog inputs. Common uses would be acceleration and decelleration in a driving game for example.
 * <p>
 * GCDualSenseAdaptiveTrigger respresents an adaptive trigger on the Sony DualSense controller, allowing you to specify a dynamic resistance force
 * that is applied when pulling the trigger. This can, for example, be used to emulate the feeling of pulling back a bow string, firing a weapon, or pulling a lever.
 *
 * @see GCDualSenseGamepad
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCDualSenseAdaptiveTrigger extends GCControllerButtonInput {
    static {
        NatJ.register();
    }

    @Generated
    protected GCDualSenseAdaptiveTrigger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCDualSenseAdaptiveTrigger alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    /**
     * A normalized float from [0-1], with 0 representing the lowest possible trigger arm position and 1 representing the maximum trigger arm position.
     *
     * @see GCDualSenseAdaptiveTriggerStatus
     */
    @Generated
    @Selector("armPosition")
    public native float armPosition();

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
    @Selector("init")
    public native GCDualSenseAdaptiveTrigger init();

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

    /**
     * The mode that the adaptive trigger is currently in. This property reflects the physical state of the triggers - and requires a response from the controller.
     * It does not update immediately after calling -[GCDualSenseAdaptiveTrigger setMode...].
     *
     * @see GCDualSenseAdaptiveTriggerMode
     */
    @Generated
    @Selector("mode")
    @NInt
    public native long mode();

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

    /**
     * Sets the adaptive trigger to feedback mode. The start position and strength of the effect can be set arbitrarily. The trigger arm will continue to provide a
     * constant degree of feedback whenever it is depressed further than the start position.
     *
     * @param startPosition     - A normalized float from [0-1], with 0 representing the smallest possible trigger depression and 1 representing the maximum trigger depression.
     * @param resistiveStrength - A normalized float from [0-1], with 0 representing the minimum effect strength (off entirely) and 1 representing the maximum effect strength.
     */
    @Generated
    @Selector("setModeFeedbackWithStartPosition:resistiveStrength:")
    public native void setModeFeedbackWithStartPositionResistiveStrength(float startPosition, float resistiveStrength);

    /**
     * Sets the adaptive trigger to off mode. This turns off the adaptive trigger effect.
     */
    @Generated
    @Selector("setModeOff")
    public native void setModeOff();

    /**
     * Sets the adaptive trigger to vibration mode. The start position, amplitude, and frequency of the effect can be set arbitrarily. The trigger arm will continue to strike against
     * the trigger whenever it is depressed further than the start position, providing a "sense of vibration".
     *
     * @param startPosition - A normalized float from [0-1], with 0 representing the smallest possible depression and 1 representing the maximum trigger depression. The effect will begin once the trigger is depressed beyond this point.
     * @param amplitude     - A normalized float from [0-1], with 0 representing the minimum effect strength (off entirely) and 1 representing the maximum effect strength.
     * @param frequency     - A normalized float from [0-1], with 0 representing the minimum frequency and 1 representing the maximum frequency of the vibration effect.
     */
    @Generated
    @Selector("setModeVibrationWithStartPosition:amplitude:frequency:")
    public native void setModeVibrationWithStartPositionAmplitudeFrequency(float startPosition, float amplitude,
            float frequency);

    /**
     * Sets the adaptive trigger to weapon mode. The start position, end position, and strength of the effect can be set arbitrarily; however the end position must be larger than the start position.
     * The trigger arm will continue to provide a constant degree of feedback whenever it is depressed further than the start position. Once the trigger arm has been depressed past the end
     * position, the strength of the effect will immediately fall to zero, providing a "sense of release" similar to that provided by pulling the trigger of a weapon.
     *
     * @param startPosition     - A normalized float from [0-1], with 0 representing the smallest possible depression and 1 representing the maximum trigger depression. The effect will begin once the trigger is depressed beyond this point.
     * @param endPosition       - A normalized float from [0-1], with 0 representing the smallest possible depression and 1 representing the maximum trigger depression. Must be greater than startPosition. The effect will end once the trigger is depressed beyond this point.
     * @param resistiveStrength - A normalized float from [0-1], with 0 representing the minimum effect strength (off entirely) and 1 representing the maximum effect strength.
     */
    @Generated
    @Selector("setModeWeaponWithStartPosition:endPosition:resistiveStrength:")
    public native void setModeWeaponWithStartPositionEndPositionResistiveStrength(float startPosition,
            float endPosition, float resistiveStrength);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The current status of the adaptive trigger - whether it is ready to apply a load, is currently applying a load, or has finished applying a load.
     *
     * @see GCDualSenseAdaptiveTriggerStatus
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
