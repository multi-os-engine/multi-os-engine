package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NEDNSProtocol {
    @Generated
    private NEDNSProtocol() {
    }

    @Generated @NInt public static final long Cleartext = 0x0000000000000001L;
    @Generated @NInt public static final long TLS = 0x0000000000000002L;
    @Generated @NInt public static final long HTTPS = 0x0000000000000003L;
}