package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Flags used with kCMTagCategory_StereoViewInterpretation tags to signal additional information that may be important
 * to the interpretation of stereo views carried in a buffer or channel.
 * 
 * A buffer or channel may carry one or more stereo eye views. The signaling of the presence of individual stereo eye
 * views can be done using CMTags with a kCMTagCategory_StereoView category and correspondng kCMTagStereoViewComponent_*
 * constants. There may however be additional signaling that is valuable beyond the presence of a stereo eye. The
 * kCMTagCategory_StereoViewInterpretation category allows additional signaling that may be relevant for interpretation
 * of storage, ordering or other details regarding the stereo views. A CMTag having a CMTagCategory of
 * kCMTagCategory_StereoViewInterpretation has a value that is a set of kCMStereoViewInterpretation_* flags (see
 * CMTagMakeWithFlagsValue()) that can be set to indicate additional aspects of the stereo view or stereo views. The
 * absence of a flag indicates the default interpretation of that feature or aspect should occur. If a flag is set, the
 * semantic of that feature and only that feature should be inferred. Two stereo view interpretations are currently
 * defined. One is that the order of stereo views is the reverse of the default of left then right. Here, order can be
 * the geometric order such as in frame packed video or in something such as storage order. The second is that buffers
 * or channels contain views other than the left stereo eye view and the right stereo eye view. Such a view might be
 * used as an alternative when perhaps monoscopic view is to be used instead of selecting the left or right stereo view
 * or synthesizing something based upon the left and right stereo eye views. The absence of a
 * kCMTagCategory_StereoViewInterpretation CMTag is meant to indicate defaults are used. Specifying
 * kCMStereoViewInterpretation_Default is equivalent to the absence of a CMTag with category
 * kCMTagCategory_StereoViewInterpretation.
 * [@constant] kCMStereoViewInterpretation_Default no additional interpretation other than the default is implied by
 * this tag. The absence of a tag of the kCMTagCategory_StereoViewInterpretation is considered equivalent to a CMTag
 * having the kCMStereoViewInterpretation_Default value.
 * [@constant] kCMStereoViewInterpretation_StereoOrderReversed the order of the stereo left eye and stereo right eye are
 * reversed from the default of left being first and right being second in whatever geometric sense or storage sense
 * that might imply. If set to 0, the order is the default left and then right eye.
 * [@constant] kCMStereoViewInterpretation_AdditionalViews one or more additional views may be present beyond stereo
 * left and stereo right eyes (e.g,. a “centerline” view). If set to 0, there are no additional views beyond the stereo
 * views or no additional views can be determined to exist.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMStereoViewInterpretationOptions {
    @Generated
    private CMStereoViewInterpretationOptions() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final long Default = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long StereoOrderReversed = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long AdditionalViews = 0x0000000000000002L;
}