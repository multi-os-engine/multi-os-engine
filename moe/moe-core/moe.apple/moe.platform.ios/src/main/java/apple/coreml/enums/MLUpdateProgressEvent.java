package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MLUpdateProgressEvent {
    @Generated
    private MLUpdateProgressEvent() {
    }

    @Generated @NInt public static final long TrainingBegin = 0x0000000000000001L;
    @Generated @NInt public static final long EpochEnd = 0x0000000000000002L;
    @Generated @NInt public static final long MiniBatchEnd = 0x0000000000000004L;
}