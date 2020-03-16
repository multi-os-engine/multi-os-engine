package apple.identitylookup.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ILMessageFilterError {
    @Generated
    private ILMessageFilterError() {
    }

    @Generated @NInt public static final long System = 0x0000000000000001L;
    @Generated @NInt public static final long InvalidNetworkURL = 0x0000000000000002L;
    @Generated @NInt public static final long NetworkURLUnauthorized = 0x0000000000000003L;
    @Generated @NInt public static final long NetworkRequestFailed = 0x0000000000000004L;
    @Generated @NInt public static final long RedundantNetworkDeferral = 0x0000000000000005L;
}