package apple.classkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CLSErrorCode {
    @Generated
    private CLSErrorCode() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long ClassKitUnavailable = 0x0000000000000001L;
    @Generated @NInt public static final long InvalidArgument = 0x0000000000000002L;
    @Generated @NInt public static final long InvalidModification = 0x0000000000000003L;
    @Generated @NInt public static final long AuthorizationDenied = 0x0000000000000004L;
    @Generated @NInt public static final long DatabaseInaccessible = 0x0000000000000005L;
    @Generated @NInt public static final long Limits = 0x0000000000000006L;
    @Generated @NInt public static final long InvalidCreate = 0x0000000000000007L;
    @Generated @NInt public static final long InvalidUpdate = 0x0000000000000008L;
    @Generated @NInt public static final long PartialFailure = 0x0000000000000009L;
}