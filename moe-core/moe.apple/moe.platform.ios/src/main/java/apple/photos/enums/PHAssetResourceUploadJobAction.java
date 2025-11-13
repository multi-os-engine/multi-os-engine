package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * These actions correspond with the types of fetches we can make on a PHAssetResourceUploadJob and the actions we can
 * also take on those jobs.
 * 
 * API-Since: 26.1
 */
@Generated
public final class PHAssetResourceUploadJobAction {
    @Generated
    private PHAssetResourceUploadJobAction() {
    }

    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Acknowledge = 0x0000000000000001L;
    /**
     * Where PHAssetResourceUploadJobState = (success OR fail).
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Retry = 0x0000000000000002L;
}