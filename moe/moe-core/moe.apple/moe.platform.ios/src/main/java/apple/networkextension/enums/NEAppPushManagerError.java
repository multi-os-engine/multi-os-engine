package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NEAppPushManagerError {
    @Generated
    private NEAppPushManagerError() {
    }

    @Generated @NInt public static final long ConfigurationInvalid = 0x0000000000000001L;
    @Generated @NInt public static final long ConfigurationNotLoaded = 0x0000000000000002L;
    @Generated @NInt public static final long InternalError = 0x0000000000000003L;
    @Generated @NInt public static final long InactiveSession = 0x0000000000000004L;
}