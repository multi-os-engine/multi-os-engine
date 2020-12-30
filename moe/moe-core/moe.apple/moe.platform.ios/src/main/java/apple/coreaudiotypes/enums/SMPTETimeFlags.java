package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]           SMPTETimeFlags
 * 
 * Flags that describe the SMPTE time state.
 * [@constant]       kSMPTETimeValid
 *                     The full time is valid.
 * [@constant]       kSMPTETimeRunning
 *                     Time is running.
 */
@Generated
public final class SMPTETimeFlags {
    @Generated
    private SMPTETimeFlags() {
    }

    @Generated public static final int Unknown = 0x00000000;
    @Generated public static final int Valid = 0x00000001;
    @Generated public static final int Running = 0x00000002;
}