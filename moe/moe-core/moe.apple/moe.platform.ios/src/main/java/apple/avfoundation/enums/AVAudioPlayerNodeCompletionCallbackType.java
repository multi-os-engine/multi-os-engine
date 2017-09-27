package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class AVAudioPlayerNodeCompletionCallbackType {
    @Generated
    private AVAudioPlayerNodeCompletionCallbackType() {
    }

    @Generated @NInt public static final long Consumed = 0x0000000000000000L;
    @Generated @NInt public static final long Rendered = 0x0000000000000001L;
    @Generated @NInt public static final long PlayedBack = 0x0000000000000002L;
}