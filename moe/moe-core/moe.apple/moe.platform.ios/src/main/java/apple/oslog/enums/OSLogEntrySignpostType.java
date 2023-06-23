package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] OSLogEntrySignpostType
 * 
 * The kind of of signpost emitted.
 * 
 * API-Since: 15.0
 */
@Generated
public final class OSLogEntrySignpostType {
    @Generated
    private OSLogEntrySignpostType() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Undefined = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long IntervalBegin = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long IntervalEnd = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Event = 0x0000000000000003L;
}
