package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Options that may be passed to a connection.
 * 
 * API-Since: 6.0
 */
@Generated
public final class NSXPCConnectionOptions {
    @Generated
    private NSXPCConnectionOptions() {
    }

    /**
     * Use this option if connecting to a service in the privileged Mach bootstrap (for example, a launchd.plist in
     * /Library/LaunchDaemons).
     * 
     * API-Since: 6.0
     */
    @Generated @NUInt public static final long NSXPCConnectionPrivileged = 0x0000000000001000L;
}