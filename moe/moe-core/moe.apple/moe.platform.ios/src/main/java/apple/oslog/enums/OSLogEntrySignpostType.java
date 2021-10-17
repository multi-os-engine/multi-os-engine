package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] OSLogEntrySignpostType
 * <p>
 * The kind of of signpost emitted.
 */
@Generated
public final class OSLogEntrySignpostType {
    @Generated
    private OSLogEntrySignpostType() {
    }

    @Generated @NInt public static final long Undefined = 0x0000000000000000L;
    @Generated @NInt public static final long IntervalBegin = 0x0000000000000001L;
    @Generated @NInt public static final long IntervalEnd = 0x0000000000000002L;
    @Generated @NInt public static final long Event = 0x0000000000000003L;
}
