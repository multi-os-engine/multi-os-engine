package apple.backgroundassets.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * An error code for a managed asset pack.
 * 
 * API-Since: 26.0
 */
@Generated
public final class BAManagedErrorCode {
    @Generated
    private BAManagedErrorCode() {
    }

    /**
     * An error code that indicates the system can’t find an asset pack with the given identifier.
     * 
     * Refer to the value in `-[NSError userInfo]` for the key `BAAssetPackIdentifierErrorKey` for the asset pack’s
     * identifier.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long AssetPackNotFound = 0x0000000000000000L;
    /**
     * An error code that indicates the system can’t find a file at the specified path.
     * 
     * Refer to the value in `-[NSError userInfo]` for the key `NSFilePathErrorKey` for the file path.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long FileNotFound = 0x0000000000000001L;
}