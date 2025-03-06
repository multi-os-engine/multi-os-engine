package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MIDIUMPCIObjectBackingType
 * 
 * The underlying transport / backing device type variants.
 */
@Generated
public final class MIDIUMPCIObjectBackingType {
    @Generated
    private MIDIUMPCIObjectBackingType() {
    }

    @Generated public static final byte Unknown = 0;
    @Generated public static final byte Virtual = 1;
    @Generated public static final byte DriverDevice = 2;
    @Generated public static final byte USBMIDI = 3;
}