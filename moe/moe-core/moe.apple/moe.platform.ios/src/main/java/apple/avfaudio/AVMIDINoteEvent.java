package apple.avfaudio;

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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVMIDINoteEvent
 * 
 * The event class representing MIDI note-on/off messages.
 * 
 * The AVAudioSequencer will automatically send a MIDI note-off after the note duration has passed.
 * To send an explicit note-off event, create an AVMIDINoteEvent with its velocity set to zero.
 * 
 * API-Since: 16.0
 * 
 * @param channel
 *                 The MIDI channel for the note. Range: 0-15.
 * @param key
 *                 The MIDI key number for the note. Range: 0-127.
 * @param velocity
 *                 The MIDI velocity for the note. Range: 0-127 (see discussion).
 * @param duration
 *                 The duration of this note event in AVMusicTimeStamp beats. Range: Any non-negative number.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMIDINoteEvent extends AVMusicEvent {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMIDINoteEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMIDINoteEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVMIDINoteEvent allocWithZone(VoidPtr zone);

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

    /**
     * [@property] channel
     * The MIDI channel for the event. Range: 0-15.
     */
    @Generated
    @Selector("channel")
    public native int channel();

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
     * The duration of the event in AVMusicTimeStamp beats. Range: Any non-negative number.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMIDINoteEvent init();

    /**
     * initWithChannel:key:velocity:duration
     * 
     * Initialize the event with a MIDI channel, key number, velocity and duration.
     * 
     * @param channel
     *                 The MIDI channel. Range: 0-15.
     * @param key
     *                 The MIDI key number. Range: 0-127.
     * @param velocity
     *                 The MIDI velocity. Range: 0-127 with zero indicating a note-off event.
     * @param duration
     *                 The duration in beats for this note. Range: Any non-negative number.
     */
    @Generated
    @Selector("initWithChannel:key:velocity:duration:")
    public native AVMIDINoteEvent initWithChannelKeyVelocityDuration(int channel, int keyNum, int velocity,
            double duration);

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

    /**
     * [@property] key
     * The MIDI key number for the event. Range: 0-127.
     */
    @Generated
    @Selector("key")
    public native int key();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVMIDINoteEvent new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] channel
     * The MIDI channel for the event. Range: 0-15.
     */
    @Generated
    @Selector("setChannel:")
    public native void setChannel(int value);

    /**
     * [@property] duration
     * The duration of the event in AVMusicTimeStamp beats. Range: Any non-negative number.
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * [@property] key
     * The MIDI key number for the event. Range: 0-127.
     */
    @Generated
    @Selector("setKey:")
    public native void setKey(int value);

    /**
     * [@property] velocity
     * The MIDI velocity for the event. Range: 0-127.
     */
    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(int value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] velocity
     * The MIDI velocity for the event. Range: 0-127.
     */
    @Generated
    @Selector("velocity")
    public native int velocity();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}