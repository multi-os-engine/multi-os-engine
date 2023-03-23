package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVMIDIControlChangeMessageType
 * 
 * Types of MIDI control change events. See the General MIDI Specification for details.
 */
@Generated
public final class AVMIDIControlChangeMessageType {
    @Generated
    private AVMIDIControlChangeMessageType() {
    }

    @Generated @NInt public static final long BankSelect = 0x0000000000000000L;
    @Generated @NInt public static final long ModWheel = 0x0000000000000001L;
    @Generated @NInt public static final long Breath = 0x0000000000000002L;
    @Generated @NInt public static final long Foot = 0x0000000000000004L;
    @Generated @NInt public static final long PortamentoTime = 0x0000000000000005L;
    @Generated @NInt public static final long DataEntry = 0x0000000000000006L;
    @Generated @NInt public static final long Volume = 0x0000000000000007L;
    @Generated @NInt public static final long Balance = 0x0000000000000008L;
    @Generated @NInt public static final long Pan = 0x000000000000000AL;
    @Generated @NInt public static final long Expression = 0x000000000000000BL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long Sustain = 0x0000000000000040L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long Portamento = 0x0000000000000041L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long Sostenuto = 0x0000000000000042L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long Soft = 0x0000000000000043L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long LegatoPedal = 0x0000000000000044L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long Hold2Pedal = 0x0000000000000045L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long FilterResonance = 0x0000000000000047L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long ReleaseTime = 0x0000000000000048L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long AttackTime = 0x0000000000000049L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long Brightness = 0x000000000000004AL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long DecayTime = 0x000000000000004BL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long VibratoRate = 0x000000000000004CL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long VibratoDepth = 0x000000000000004DL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long VibratoDelay = 0x000000000000004EL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long ReverbLevel = 0x000000000000005BL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long ChorusLevel = 0x000000000000005DL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long RPN_LSB = 0x0000000000000064L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long RPN_MSB = 0x0000000000000065L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long AllSoundOff = 0x0000000000000078L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long ResetAllControllers = 0x0000000000000079L;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long AllNotesOff = 0x000000000000007BL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long OmniModeOff = 0x000000000000007CL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long OmniModeOn = 0x000000000000007DL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long MonoModeOn = 0x000000000000007EL;
    /**
     * these events have value (0-63) == off, (64-127) == on
     */
    @Generated @NInt public static final long MonoModeOff = 0x000000000000007FL;
}