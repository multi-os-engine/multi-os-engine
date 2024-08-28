package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] OSLogStoreScope
 * 
 * Create a store to a subset of the libtrace entries.
 * 
 * [@constant] OSLogStoreSystem
 * [@constant] OSLogStoreCurrentProcessIdentifier
 * "System" scope indicates the entire system; i.e., all logs. Entries can be
 * retrieved for the current calling process, i.e., matching pid.
 * 
 * API-Since: 15.0
 */
@Generated
public final class OSLogStoreScope {
    @Generated
    private OSLogStoreScope() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long OSLogStoreCurrentProcessIdentifier = 0x0000000000000001L;
}
