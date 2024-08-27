package apple.coreml.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Events on which update task is capable of invoking progress handler.
 * 
 * [@note] MLUpdateProgressEventMiniBatchEnd may induce performance problems
 * during pipeline execution.
 */
@Generated
public final class MLUpdateProgressEvent {
    @Generated
    private MLUpdateProgressEvent() {
    }

    @Generated @NInt public static final long TrainingBegin = 0x0000000000000001L;
    @Generated @NInt public static final long EpochEnd = 0x0000000000000002L;
    @Generated @NInt public static final long MiniBatchEnd = 0x0000000000000004L;
}
