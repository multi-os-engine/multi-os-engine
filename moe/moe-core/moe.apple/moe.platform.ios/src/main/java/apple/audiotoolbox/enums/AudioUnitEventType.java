package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] AudioUnitEventType
 * 
 * Types of Audio Unit Events.
 * 
 * [@constant] kAudioUnitEvent_ParameterValueChange
 * The event is a change to a parameter value
 * [@constant] kAudioUnitEvent_BeginParameterChangeGesture
 * The event signifies a gesture (e.g. mouse-down) beginning a potential series of
 * related parameter value change events.
 * [@constant] kAudioUnitEvent_EndParameterChangeGesture
 * The event signifies a gesture (e.g. mouse-up) ending a series of related
 * parameter value change events.
 * [@constant] kAudioUnitEvent_PropertyChange
 * The event is a change to a property value.
 */
@Generated
public final class AudioUnitEventType {
    @Generated
    private AudioUnitEventType() {
    }

    @Generated public static final int ParameterValueChange = 0x00000000;
    @Generated public static final int BeginParameterChangeGesture = 0x00000001;
    @Generated public static final int EndParameterChangeGesture = 0x00000002;
    @Generated public static final int PropertyChange = 0x00000003;
}