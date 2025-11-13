package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Constants used with kCMTagCategory_ProjectionType to signal the nature of a video projection carried in a buffer or
 * channel.
 * 
 * A video projection can be one of several types. Examples include 360 degree equirectangular, 180 degree half
 * equirectangular, or a fisheye. A CMTag having a CMTagCategory of kCMTagCategory_ProjectionType has a value that is an
 * OSType indicating the kind of projection using a kCMProjectionType_* constant. The kCMProjectionType_Rectangular
 * projection type can signal that there is no projection other than the default 2D view. This is provided so it is
 * possible to still signal a kCMTagCategory_ProjectionType CMTag but indicates it has no effect. The
 * kCMProjectionType_ParametricImmersive projection type indicates a projection described mathematically by a model of
 * camera lens calibration parameters. Parameters may be found in lens calibration metadata in
 * kCMFormatDescriptionExtension_CameraCalibrationDataLensCollection with algorithm_kind parametric. If a
 * kCMTagCategory_ProjectionType CMTag is not signaled, a rectangular projection is implied. The
 * kCMTagCategory_ProjectionType tag may be associated with other tags if projection related parameters are also
 * signaled. What is carried will be defined for the specific type of projection.
 * [@constant] kCMProjectionType_Rectangular There is no projection.This is a traditional 2D texture. Default if no
 * projection type tag is signaled.
 * [@constant] kCMProjectionType_Equirectangular The projection is a 360 degree equirectangular projection.
 * [@constant] kCMProjectionType_HalfEquirectangular The projection is a 180 degree equirectangular projection.
 * [@constant] kCMProjectionType_Fisheye This projection is used by Apple Immersive Video (AIV) video and requires AIME
 * metadata to provide the projection details. Only use this projection when working with AIV content.
 * [@constant] kCMProjectionType_ParametricImmersive The projection is defined with a parametric description of lens
 * distortion and image dewarping parameters.
 * 
 * API-Since: 17.0
 */
@Generated
public final class CMProjectionType {
    @Generated
    private CMProjectionType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated public static final long Rectangular = 0x0000000072656374L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long Equirectangular = 0x0000000065717569L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long HalfEquirectangular = 0x0000000068657175L;
    /**
     * API-Since: 17.0
     */
    @Generated public static final long Fisheye = 0x0000000066697368L;
    /**
     * API-Since: 26.0
     */
    @Generated public static final long ParametricImmersive = 0x000000007072696DL;
}