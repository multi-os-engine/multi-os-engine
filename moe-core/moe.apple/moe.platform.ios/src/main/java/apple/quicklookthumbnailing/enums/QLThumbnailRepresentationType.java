package apple.quicklookthumbnailing.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class QLThumbnailRepresentationType {
    @Generated
    private QLThumbnailRepresentationType() {
    }

    /**
     * Icon of the file type of the thumbnail request, provided by the system, that may not satisfy the parameters of
     * the request.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Icon = 0x0000000000000000L;
    /**
     * A version of the thumbnail that was retrieved from a cache or low quality generation but not satisfying the
     * parameters of the request.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long LowQualityThumbnail = 0x0000000000000001L;
    /**
     * Final version of the thumbnail for the given request, satisfying the parameters of the request.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Thumbnail = 0x0000000000000002L;
}