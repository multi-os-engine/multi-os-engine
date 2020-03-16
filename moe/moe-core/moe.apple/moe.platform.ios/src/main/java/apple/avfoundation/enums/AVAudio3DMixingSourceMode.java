package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVAudio3DMixingSourceMode {
    @Generated
    private AVAudio3DMixingSourceMode() {
    }

    @Generated @NInt public static final long SpatializeIfMono = 0x0000000000000000L;
    @Generated @NInt public static final long Bypass = 0x0000000000000001L;
    @Generated @NInt public static final long PointSource = 0x0000000000000002L;
    @Generated @NInt public static final long AmbienceBed = 0x0000000000000003L;
}