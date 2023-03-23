package apple.quicklookthumbnailing.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class QLThumbnailError {
    @Generated
    private QLThumbnailError() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long GenerationFailed = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long SavingToURLFailed = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NoCachedThumbnail = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NoCloudThumbnail = 0x0000000000000003L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long RequestInvalid = 0x0000000000000004L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long RequestCancelled = 0x0000000000000005L;
}