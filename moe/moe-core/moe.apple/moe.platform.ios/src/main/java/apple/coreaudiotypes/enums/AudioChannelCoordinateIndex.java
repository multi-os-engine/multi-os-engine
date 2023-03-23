package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;

/**
 * these are indices for accessing the mCoordinates array in struct AudioChannelDescription
 * [@enum] AudioChannelCoordinateIndex
 * 
 * Constants for indexing the mCoordinates array in an AudioChannelDescription
 * structure.
 * [@constant] kAudioChannelCoordinates_LeftRight
 * For rectangular coordinates, negative is left and positive is right.
 * [@constant] kAudioChannelCoordinates_BackFront
 * For rectangular coordinates, negative is back and positive is front.
 * [@constant] kAudioChannelCoordinates_DownUp
 * For rectangular coordinates, negative is below ground level, 0 is ground
 * level, and positive is above ground level.
 * [@constant] kAudioChannelCoordinates_Azimuth
 * For spherical coordinates, 0 is front center, positive is right, negative is
 * left. This is measured in degrees.
 * [@constant] kAudioChannelCoordinates_Elevation
 * For spherical coordinates, +90 is zenith, 0 is horizontal, -90 is nadir.
 * This is measured in degrees.
 * [@constant] kAudioChannelCoordinates_Distance
 * For spherical coordinates, the units are described by flags.
 */
@Generated
public final class AudioChannelCoordinateIndex {
    @Generated
    private AudioChannelCoordinateIndex() {
    }

    @Generated public static final int LeftRight = 0x00000000;
    @Generated public static final int BackFront = 0x00000001;
    @Generated public static final int DownUp = 0x00000002;
    @Generated public static final int Azimuth = 0x00000000;
    @Generated public static final int Elevation = 0x00000001;
    @Generated public static final int Distance = 0x00000002;
}
