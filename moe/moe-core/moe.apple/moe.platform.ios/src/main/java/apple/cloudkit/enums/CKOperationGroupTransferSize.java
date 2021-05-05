package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CKOperationGroupTransferSize
 * 
 * Valid values for expectedSendSize and expectedReceiveSize
 * [@constant] CKOperationGroupTransferSizeUnknown Default value when you're completely unsure of your working set size.
 * [@constant] CKOperationGroupTransferSizeKilobytes Less than 1MB
 * [@constant] CKOperationGroupTransferSizeMegabytes 1-10MB
 * [@constant] CKOperationGroupTransferSizeTensOfMegabytes 10-100MB
 * [@constant] CKOperationGroupTransferSizeHundredsOfMegabytes 100MB-1GB
 * [@constant] CKOperationGroupTransferSizeGigabytes 1-10GB
 * [@constant] CKOperationGroupTransferSizeTensOfGigabytes 10-100GB
 * [@constant] CKOperationGroupTransferSizeHundredsOfGigabytes More than 100GB
 */
@Generated
public final class CKOperationGroupTransferSize {
    @Generated
    private CKOperationGroupTransferSize() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Kilobytes = 0x0000000000000001L;
    @Generated @NInt public static final long Megabytes = 0x0000000000000002L;
    @Generated @NInt public static final long TensOfMegabytes = 0x0000000000000003L;
    @Generated @NInt public static final long HundredsOfMegabytes = 0x0000000000000004L;
    @Generated @NInt public static final long Gigabytes = 0x0000000000000005L;
    @Generated @NInt public static final long TensOfGigabytes = 0x0000000000000006L;
    @Generated @NInt public static final long HundredsOfGigabytes = 0x0000000000000007L;
}