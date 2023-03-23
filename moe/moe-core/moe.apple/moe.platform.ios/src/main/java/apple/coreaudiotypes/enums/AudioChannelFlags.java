package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] AudioChannelFlags
 * 
 * These constants are used in the mChannelFlags field of an
 * AudioChannelDescription structure.
 * [@constant] kAudioChannelFlags_RectangularCoordinates
 * The channel is specified by the cartesian coordinates of the speaker
 * position. This flag is mutally exclusive with
 * kAudioChannelFlags_SphericalCoordinates.
 * [@constant] kAudioChannelFlags_SphericalCoordinates
 * The channel is specified by the spherical coordinates of the speaker
 * position. This flag is mutally exclusive with
 * kAudioChannelFlags_RectangularCoordinates.
 * [@constant] kAudioChannelFlags_Meters
 * Set to indicate the units are in meters, clear to indicate the units are
 * relative to the unit cube or unit sphere.
 */
@Generated
public final class AudioChannelFlags {
    @Generated
    private AudioChannelFlags() {
    }

    @Generated public static final int AllOff = 0x00000000;
    @Generated public static final int RectangularCoordinates = 0x00000001;
    @Generated public static final int SphericalCoordinates = 0x00000002;
    @Generated public static final int Meters = 0x00000004;
}
