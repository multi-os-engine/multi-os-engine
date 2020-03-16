package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ASWebAuthenticationSessionErrorCode {
    @Generated
    private ASWebAuthenticationSessionErrorCode() {
    }

    @Generated @NInt public static final long CanceledLogin = 0x0000000000000001L;
    @Generated @NInt public static final long PresentationContextNotProvided = 0x0000000000000002L;
    @Generated @NInt public static final long PresentationContextInvalid = 0x0000000000000003L;
}