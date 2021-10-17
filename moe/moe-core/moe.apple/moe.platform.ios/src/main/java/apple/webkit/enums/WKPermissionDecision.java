package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class WKPermissionDecision {
    @Generated
    private WKPermissionDecision() {
    }

    @Generated @NInt public static final long Prompt = 0x0000000000000000L;
    @Generated @NInt public static final long Grant = 0x0000000000000001L;
    @Generated @NInt public static final long Deny = 0x0000000000000002L;
}
