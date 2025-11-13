package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The states of an upload job.
 * 
 * API-Since: 26.1
 */
@Generated
public final class PHAssetResourceUploadJobState {
    @Generated
    private PHAssetResourceUploadJobState() {
    }

    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Registered = 0x0000000000000001L;
    /**
     * The job has been registered.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Pending = 0x0000000000000002L;
    /**
     * A request has been made to send the asset resource to the destination, but has not yet been fulfilled.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Failed = 0x0000000000000003L;
    /**
     * The job has failed to send over.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Succeeded = 0x0000000000000004L;
}