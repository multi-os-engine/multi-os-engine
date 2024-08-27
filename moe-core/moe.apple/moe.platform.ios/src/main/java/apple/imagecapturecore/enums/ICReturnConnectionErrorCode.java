package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICReturnConnectionErrorCode {
    @Generated
    private ICReturnConnectionErrorCode() {
    }

    /**
     * Device driver exited without request.
     */
    @Generated @NInt public static final long DriverExited = 0xFFFFFFFFFFFFAC9AL;
    /**
     * Device closed session without request.
     */
    @Generated @NInt public static final long ClosedSessionSuddenly = 0xFFFFFFFFFFFFAC9BL;
    /**
     * Device ejected without request.
     */
    @Generated @NInt public static final long EjectedSuddenly = 0xFFFFFFFFFFFFAC9CL;
    /**
     * Device reports session is already open.
     */
    @Generated @NInt public static final long SessionAlreadyOpen = 0xFFFFFFFFFFFFAC9DL;
    /**
     * Device reports eject has failed.
     */
    @Generated @NInt public static final long EjectFailed = 0xFFFFFFFFFFFFAC9EL;
    /**
     * Failed to open a connection to the device.
     */
    @Generated @NInt public static final long FailedToOpen = 0xFFFFFFFFFFFFAC9FL;
    /**
     * Failed to open the device.
     */
    @Generated @NInt public static final long FailedToOpenDevice = 0xFFFFFFFFFFFFACA0L;
    /**
     * Not authorized to open device.
     */
    @Generated @NInt public static final long NotAuthorizedToOpenDevice = 0xFFFFFFFFFFFFACA1L;
}