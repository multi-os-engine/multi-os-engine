package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVAudioEngineManualRenderingStatus {
    @Generated
    private AVAudioEngineManualRenderingStatus() {
    }

    @Generated @NInt public static final long Error = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long Success = 0x0000000000000000L;
    @Generated @NInt public static final long InsufficientDataFromInputNode = 0x0000000000000001L;
    @Generated @NInt public static final long CannotDoInCurrentContext = 0x0000000000000002L;
}