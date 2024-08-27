package apple.videosubscriberaccount.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.4
 */
@Generated
public final class VSUserAccountQueryOptions {
    @Generated
    private VSUserAccountQueryOptions() {
    }

    /**
     * default
     * 
     * API-Since: 16.4
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * return VSUserAccounts also registered on other devices in the users iCloud account
     * 
     * API-Since: 16.4
     */
    @Generated @NInt public static final long AllDevices = 0x0000000000000001L;
}