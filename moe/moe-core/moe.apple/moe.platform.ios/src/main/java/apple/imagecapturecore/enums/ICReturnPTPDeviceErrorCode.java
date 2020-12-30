package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICReturnPTPDeviceErrorCode {
    @Generated
    private ICReturnPTPDeviceErrorCode() {
    }

    /**
     * PTP Command failed to send
     */
    @Generated @NInt public static final long FailedToSendCommand = 0xFFFFFFFFFFFFACFEL;
    /**
     * PTP Command not authorized
     */
    @Generated @NInt public static final long NotAuthorizedToSendCommand = 0xFFFFFFFFFFFFACFFL;
}