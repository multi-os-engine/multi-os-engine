package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Constants used with kCMTagCategory_PackingType to signal the nature of any packing applied in a buffer or channel.
 * 
 * A video packing can be one of several types including frame-packing for stereo views or texture atlasing. A CMTag
 * having a CMTagCategory of kCMTagCategory_ProjectionType has a value that is an OSType indicating the kind of packing
 * using a kCMPackingType_* constant. Examples of frame-packing include side-by-side and over-under packing, There may
 * be related CMTags if a kind of packing requires additional parameters. The requirements will be documented with the
 * specific kind of packing.
 * [@constant] kCMPackingType_None There is no packing. This is a traditional 2D texture. For this case no packing tag
 * needs to be used.
 * [@constant] kCMPackingType_SideBySide The packing uses a horizontal side-by-side packing of two views. By default,
 * the left stereo eye view is to the left of the right stereo eye view. If the view order is reversed, indicated by
 * kCMTagCategory_StereoViewInterpretation/kCMStereoViewInterpretation_StereoOrderReversed, then the right view is to
 * the left of the left stereo view.
 * [@constant] kCMPackingType_OverUnder The packing uses a vertical over-under (or top-and-bottom) packing of two views.
 * By default, the left stereo eye view is above the right stereo eye view. If the view order is reversed, indicated by
 * kCMTagCategory_StereoViewInterpretation/kCMStereoViewInterpretation_StereoOrderReversed, then the right view is above
 * the left stereo view.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMPackingType {
    @Generated
    private CMPackingType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final long None = 0x000000006E6F6E65L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long SideBySide = 0x0000000073696465L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long OverUnder = 0x000000006F766572L;
}