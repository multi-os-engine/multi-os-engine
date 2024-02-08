package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ASPublicKeyCredentialClientDataCrossOriginValue {
    @Generated
    private ASPublicKeyCredentialClientDataCrossOriginValue() {
    }

    @Generated @NInt public static final long NotSet = 0x0000000000000000L;
    @Generated @NInt public static final long CrossOrigin = 0x0000000000000001L;
    @Generated @NInt public static final long SameOriginWithAncestors = 0x0000000000000002L;
}