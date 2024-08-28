package apple.coredata.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 14.0
 */
@Generated
public final class NSPersistentCloudKitContainerEventResultType {
    @Generated
    private NSPersistentCloudKitContainerEventResultType() {
    }

    /**
     * the result is an NSArray<NSPersistentCloudKitContainerEvent *>
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Events = 0x0000000000000000L;
    /**
     * the result is an NSArray<NSNumber *> indicating the count of events matching the request
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long CountEvents = 0x0000000000000001L;
}