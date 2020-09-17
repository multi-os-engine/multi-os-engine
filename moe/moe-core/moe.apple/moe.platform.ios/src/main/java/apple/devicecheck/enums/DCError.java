package apple.devicecheck.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class DCError {
    @Generated
    private DCError() {
    }

    @Generated @NInt public static final long UnknownSystemFailure = 0x0000000000000000L;
    @Generated @NInt public static final long FeatureUnsupported = 0x0000000000000001L;
    @Generated @NInt public static final long InvalidInput = 0x0000000000000002L;
    @Generated @NInt public static final long InvalidKey = 0x0000000000000003L;
    @Generated @NInt public static final long ServerUnavailable = 0x0000000000000004L;
}