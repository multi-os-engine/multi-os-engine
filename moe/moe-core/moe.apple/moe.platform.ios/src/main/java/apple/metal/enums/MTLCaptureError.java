package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MTLCaptureError {
    @Generated
    private MTLCaptureError() {
    }

    /**
     * Capturing is not supported, maybe the destination is not supported.
     */
    @Generated @NInt public static final long NotSupported = 0x0000000000000001L;
    /**
     * A capture is already in progress.
     */
    @Generated @NInt public static final long AlreadyCapturing = 0x0000000000000002L;
    /**
     * The MTLCaptureDescriptor contains an invalid parameters.
     */
    @Generated @NInt public static final long InvalidDescriptor = 0x0000000000000003L;
}