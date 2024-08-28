package apple.devicediscoveryextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * ===========================================================================================================================
 * State of media playback on the device.
 */
@Generated
public final class DDDeviceMediaPlaybackState {
    @Generated
    private DDDeviceMediaPlaybackState() {
    }

    @Generated @NInt public static final long NoContent = 0x0000000000000000L;
    /**
     * Not playing any media content.
     */
    @Generated @NInt public static final long Paused = 0x0000000000000001L;
    /**
     * Media content playback is paused.
     */
    @Generated @NInt public static final long Playing = 0x0000000000000002L;
}