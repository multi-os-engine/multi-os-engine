package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * MIDI 2.0 Note On/Off Message Attribute Types
 */
@Generated
public final class MIDINoteAttribute {
    @Generated
    private MIDINoteAttribute() {
    }

    /**
     * no attribute data
     */
    @Generated public static final byte None = 0;
    /**
     * Manufacturer-specific = unknown
     */
    @Generated public static final byte ManufacturerSpecific = 1;
    /**
     * MIDI-CI profile-specific data
     */
    @Generated public static final byte ProfileSpecific = 2;
    /**
     * Pitch 7.9
     */
    @Generated public static final byte Pitch = 3;
}
