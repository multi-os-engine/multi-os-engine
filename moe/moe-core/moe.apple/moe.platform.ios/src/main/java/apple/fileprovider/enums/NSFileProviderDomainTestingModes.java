package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Testing modes.
 */
@Generated
public final class NSFileProviderDomainTestingModes {
    @Generated
    private NSFileProviderDomainTestingModes() {
    }

    /**
     * Enable the domain without any user action required.
     */
    @Generated @NUInt public static final long AlwaysEnabled = 0x0000000000000001L;
    /**
     * Enable interactive mode.
     * <p>
     * Disable the automatic scheduling from the system and allow external tools to
     * control the execution of operations.
     * <p>
     * When manual scheduling is enabled, an external tool should use
     * -[NSFileProviderManager listAvailableTestingOperationsWithError:] and
     * -[NSFileProviderManager runTestingOperations:error:] to control the system.
     * <p>
     * If that mode is enabled, some crash recovery guarantees are lost. For instance,
     * the system may lose any event that hasn't been ingested. The system does not
     * support removing this mode from a domain on which it has been enabled.
     */
    @Generated @NUInt public static final long Interactive = 0x0000000000000002L;
}
