package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CMTagCategory
 * 
 * An enum indicating the available CMTagCategory identifiers that can be used to distinguish the tag from other kinds.
 * 
 * Different kinds of CMTags may be defined or registered. Each will be associated with a category. CMTags with the same
 * CMTagCategory will have the same kinds of values. The category serves as a namespace.
 * [@constant] kCMTagCategory_Undefined Indicates there is no category specified for this value or it could not be
 * determined. CMTags should typically not have this category except as sentinel values.
 * [@constant] kCMTagCategory_MediaType Value is an OSType holding a CMMediaType.
 * [@constant] kCMTagCategory_MediaSubType Value is an OSType holding a media subtype such as a video codec type.
 * [@constant] kCMTagCategory_TrackID Value is a CMPersistentTrackID for a corresponding asset.
 * [@constant] kCMTagCategory_ChannelID Value is the CMVideoTarget/CMVideoReceiver channel identifier.
 * [@constant] kCMTagCategory_VideoLayerID Value is a signed 64-bit integer specifying the video layer identifier.
 * [@constant] kCMTagCategory_PixelFormat Indicates the pixel format of the buffer or channel, if pixel-based. The type
 * is an OSType corresponding to a pixel format (i.e., a kCVPixelFormatType_* type).
 * [@constant] kCMTagCategory_PackingType Indicates this channel is packed in some way (e.g., frame packed, texture
 * atlas). The value is an OSType carrying kCMPackingType_* constants.
 * [@constant] kCMTagCategory_ProjectionType Indicates textures are related to a kind of texture projection (e.g.,
 * equirectangular). The value is an OSType carrying one of the kCMProjectionType_* constants.
 * [@constant] kCMTagCategory_StereoView Indicates this channel is related to carrying stereographic views. The value is
 * a Flags value carrying one of the kCMTagStereoViewComponent_* constants.
 * [@constant] kCMTagCategory_StereoViewInterpretation Indicates this channel has non default stereo view interpretation
 * (e.g., stereo eye view order is reversed.) Tags with this category will typically be associated with tags of category
 * kCMTagCategory_StereoView. This tag alone however does not indicate which stereo eyes are present. The value is a
 * Flags value carrying one of the kCMTagStereoInterpretationOption_* constants.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMTagCategory {
    @Generated
    private CMTagCategory() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final int Undefined = 0x00000000;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int MediaType = 0x6D646961;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int MediaSubType = 0x6D737562;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int TrackID = 0x7472616B;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int ChannelID = 0x7663686E;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int VideoLayerID = 0x766C6179;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int PixelFormat = 0x70697866;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int PackingType = 0x7061636B;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int ProjectionType = 0x70726F6A;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int StereoView = 0x65796573;
    /**
     * API-Since: 17.0
     */
    @Generated public static final int StereoViewInterpretation = 0x65796970;
}