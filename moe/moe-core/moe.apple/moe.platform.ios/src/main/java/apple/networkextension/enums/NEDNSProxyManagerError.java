package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NEDNSProxyManagerError {
    @Generated
    private NEDNSProxyManagerError() {
    }

    @Generated @NInt public static final long Invalid = 0x0000000000000001L;
    @Generated @NInt public static final long Disabled = 0x0000000000000002L;
    @Generated @NInt public static final long Stale = 0x0000000000000003L;
    @Generated @NInt public static final long CannotBeRemoved = 0x0000000000000004L;
}