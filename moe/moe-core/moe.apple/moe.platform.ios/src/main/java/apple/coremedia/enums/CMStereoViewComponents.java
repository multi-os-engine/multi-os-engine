package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Flags used with kCMTagCategory_StereoView tags to signal the nature of the stereo views carried in a buffer or
 * channel.
 * 
 * A "stereo eye" is either for the left eye or for the right eye. A CMTag signaling of stereo views can indicate the
 * presence of one "stereo eye", both stereo eyes or no stereo eyes. A CMTag having a CMTagCategory of
 * kCMTagCategory_StereoView has a value that is a set of kCMTagStereoViewComponent_* flags (see
 * CMTagMakeWithFlagsValue()) that can be set to indicate the stereo eyes carried. If neither the left nor the right
 * stereo eye is signaled, this can be interpreted to mean that this is not stereo view related and is instead
 * monoscopic video. If it is not stereo related, a kCMTagCategory_StereoView CMTag need not be associated with the
 * buffer or channel. kCMTagCategory_StereoView does not prescribe how the stereo views are carried. It might be
 * contained in some kind of multiview carriage or might be frame packed in some way. The kCMTagCategory_PackingType
 * will typically be available if frame packing of stereo views is used. The presence of a CMTag with
 * kCMTagCategory_StereoView alone is insufficient to imply if there is some kind of packing or other mechanism
 * required. Additional CMTags with other CMTagCategories may be necessary. One or more kCMTagCategory_StereoView tags
 * may be present in a collection. When considering which stereo eyes are represented by the collection, the same
 * semantic can be expressed in more than one way in the collection. Specifying the same CMTag more than once has no
 * meaning as the first occurrence indicates the stereo eye or stereo eyes are present.
 * Here are compatible semantics expressed by one or more CMTags:
 * - a single CMTag with kCMTagStereoViewsOption_LeftEye bitwise ORed with kCMTagStereoViewsOption_RightEye.
 * - two kCMTagCategory_StereoView CMTags with one CMTag having the value kCMTagStereoViewsOption_LeftEye and the other
 * CMTag having the value kCMTagStereoViewsOption_RightEye.
 * - three or more CMTags made up of a CMTag with kCMTagStereoViewsOption_LeftEye bitwise ORed with
 * kCMTagStereoViewsOption_RightEye and both a CMTag with only kCMTagStereoViewsOption_LeftEye and a CMTag with
 * kCMTagStereoViewsOption_RightEye.
 * Likewise, if a collection contains only one or more CMTags with one stereo eye (e.g.,
 * kCMTagStereoViewsOption_LeftEye), only that stereo eye should be considered present. The absence of a
 * kCMTagCategory_StereoView CMTag is meant to indicate there is no stereo view present. If this signaling of no stereo
 * eyes is associated with a buffer or channel that carries stereo eye views, the buffer or channel should be configured
 * to present only a monoscopic view. This might be in the form of some fallback to a default view corresponding to a
 * stereo eye or even to some other view it includes or can synthesize.
 * [@constant] kCMTagStereoViewsOption_LeftEye the left stereo eye is present in encoded or decoded video buffers.
 * [@constant] kCMTagStereoViewsOption_RightEye the right stereo eye is present in encoded or decoded video buffers.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMStereoViewComponents {
    @Generated
    private CMStereoViewComponents() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long LeftEye = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long RightEye = 0x0000000000000002L;
}