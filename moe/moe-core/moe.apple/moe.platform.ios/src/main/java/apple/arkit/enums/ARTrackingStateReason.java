package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ARTrackingStateReason {
    @Generated
    private ARTrackingStateReason() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Initializing = 0x0000000000000001L;
    @Generated @NInt public static final long ExcessiveMotion = 0x0000000000000002L;
    @Generated @NInt public static final long InsufficientFeatures = 0x0000000000000003L;
    @Generated @NInt public static final long Relocalizing = 0x0000000000000004L;
}