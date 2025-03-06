package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] MIDICICategoryOptions
 * 
 * MIDI Capability category supported (bitmap: D6 D5 D4 D3 D2 D1 D0)
 * Bit Category Sub-ID Range Description
 * D0 0x00~0x0F Reserved - No Messages Defined Yet
 * D1 0x10~0x1F Protocol Negotiation (Deprecated)
 * D2 0x20~0x2F Profile Configuration Supported
 * D3 0x30~0x3F Property Exchange Supported
 * D4 0x40~0x4F Process Inquiry Supported
 * D5 0x50~0x5F Reserved - No Messages Defined Yet
 * D6 0x60~0x6F Reserved - No Messages Defined Yet
 * 
 * e.g., a MIDICIDevice supporting Profile Configuration and Property Exchange has
 * category 0xC.
 */
@Generated
public final class MIDICICategoryOptions {
    @Generated
    private MIDICICategoryOptions() {
    }

    @Generated public static final byte ProtocolNegotiation = 2;
    @Generated public static final byte ProfileConfigurationSupported = 4;
    @Generated public static final byte PropertyExchangeSupported = 8;
    @Generated public static final byte ProcessInquirySupported = 16;
}