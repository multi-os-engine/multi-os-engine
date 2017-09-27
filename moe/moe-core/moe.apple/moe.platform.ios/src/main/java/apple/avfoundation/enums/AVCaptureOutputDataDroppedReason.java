package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVCaptureOutputDataDroppedReason {
    @Generated
    private AVCaptureOutputDataDroppedReason() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long LateData = 0x0000000000000001L;
    @Generated @NInt public static final long OutOfBuffers = 0x0000000000000002L;
    @Generated @NInt public static final long Discontinuity = 0x0000000000000003L;
}