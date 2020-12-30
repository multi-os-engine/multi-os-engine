package apple.corehaptics;

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
 * CHHapticEvent
 * 
 * 	The description of a single haptic/audio event, plus optional Event parameters which modify the event.
 * 
 * 	CHHapticEvents have a relative time property to allow specifying the time relationship between events in a pattern.
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHHapticEvent extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHHapticEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHHapticEvent alloc();

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

    /**
     * [@property] duration
     * The duration for this event.  Units are seconds.  If unset (0.0), Continuous event types will have no fixed end.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * [@property] eventParameters
     * NSArray of Event parameters.  Can be empty.
     */
    @Generated
    @Selector("eventParameters")
    public native NSArray<? extends CHHapticEventParameter> eventParameters();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHHapticEvent init();

    /**
     * initWithAudioResourceID:parameters:relativeTime
     * 
     * 	Initialize a new CHHapticEvent using a previously-loaded audio resource.
     * 
     * @param resID
     * 	A previously-registered audio resource ID (see `CHHapticEngine(registerAudioResource:options:error)`).
     * @param eventParams
     * 	An NSArray of Event parameters.  Can be empty.
     * @param time
     * 	The relative time for this event versus the other events in the CHHapticPattern.
     */
    @Generated
    @Selector("initWithAudioResourceID:parameters:relativeTime:")
    public native CHHapticEvent initWithAudioResourceIDParametersRelativeTime(@NUInt long resID,
            NSArray<? extends CHHapticEventParameter> eventParams, double time);

    /**
     * initWithAudioResourceID:parameters:relativeTime:duration
     * 
     * 	Initialize a new CHHapticEvent using a previously-loaded audio resource.
     * 
     * 	If the specified duration is less than the duration of the audio resource, its playback will be truncated.  If it
     * 	is greater, its playback will be padded with silence.  If zero, it will be ignored.
     * 
     * @param resID
     * 	A previously-registered audio resource ID (see `CHHapticEngine(registerAudioResource:options:error)`).
     * @param eventParams
     * 	An NSArray of Event parameters.  Can be empty.
     * @param time
     * 	The relative time for this event versus the other events in the CHHapticPattern.
     * @param duration
     * 	The duration of this event in seconds.
     */
    @Generated
    @Selector("initWithAudioResourceID:parameters:relativeTime:duration:")
    public native CHHapticEvent initWithAudioResourceIDParametersRelativeTimeDuration(@NUInt long resID,
            NSArray<? extends CHHapticEventParameter> eventParams, double time, double duration);

    /**
     * initWithEventType:parameters:relativeTime
     * 
     * 	Initialize a new CHHapticEvent.  This can only be used to create Transient event types (which do not require a duration).
     * 
     * @param type
     * 	The type of event.
     * @param eventParams
     * 	An NSArray of Event parameters.  Can be empty.
     * @param time
     * 	The relative time for this event versus the other events in the CHHapticPattern.
     */
    @Generated
    @Selector("initWithEventType:parameters:relativeTime:")
    public native CHHapticEvent initWithEventTypeParametersRelativeTime(String type,
            NSArray<? extends CHHapticEventParameter> eventParams, double time);

    /**
     * initWithEventType:parameters:relativeTime:duration
     * 
     * 	Initialize a new CHHapticEvent, providing a duration.
     * 
     * @param type
     * 	The type of event.
     * @param eventParams
     * 	An NSArray of Event parameters.  Can be empty.
     * @param time
     * 	The relative time for this event versus the other events in the CHHapticPattern.
     * 	@param duration
     * 		For Continuous event types, the length of time before the event playback begins its release.
     * 		For Transient event types, the logical length of the event (used to determine pattern end and loop points).
     */
    @Generated
    @Selector("initWithEventType:parameters:relativeTime:duration:")
    public native CHHapticEvent initWithEventTypeParametersRelativeTimeDuration(String type,
            NSArray<? extends CHHapticEventParameter> eventParams, double time, double duration);

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
     * [@property] relativeTime
     * The relative time for this event versus the start time of the pattern.  Units are seconds.
     */
    @Generated
    @Selector("relativeTime")
    public native double relativeTime();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] duration
     * The duration for this event.  Units are seconds.  If unset (0.0), Continuous event types will have no fixed end.
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * [@property] relativeTime
     * The relative time for this event versus the start time of the pattern.  Units are seconds.
     */
    @Generated
    @Selector("setRelativeTime:")
    public native void setRelativeTime(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] type
     * The type of event.
     */
    @Generated
    @Selector("type")
    public native String type();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}