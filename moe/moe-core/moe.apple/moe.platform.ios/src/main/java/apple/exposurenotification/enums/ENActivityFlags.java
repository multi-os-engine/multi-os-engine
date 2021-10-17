package apple.exposurenotification.enums;

import org.moe.natj.general.ann.Generated;

/**
 * ===========================================================================================================================
 * <p>
 * Activities that occurred while the app might not be running.
 */
@Generated
public final class ENActivityFlags {
    @Generated
    private ENActivityFlags() {
    }

    /**
     * Reserved field
     */
    @Generated public static final int Reserved1 = 0x00000001;
    /**
     * Reserved field
     */
    @Generated public static final int Reserved2 = 0x00000002;
    /**
     * The app launched in the background to perform periodic operations on iOS 12.5.
     */
    @Generated public static final int PeriodicRun = 0x00000004;
    /**
     * The app launched in the foreground to display information about the pre-authorized key release
     */
    @Generated public static final int PreAuthorizedKeyReleaseNotificationTapped = 0x00000008;
}
