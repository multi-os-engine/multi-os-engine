package apple.authenticationservices.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AuthenticationServices")
@Runtime(CRuntime.class)
public final class AuthenticationServices {
    static {
        NatJ.register();
    }

    @Generated
    private AuthenticationServices() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASWebAuthenticationSessionErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASCredentialIdentityStoreErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASExtensionErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationScopeFullName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationScopeEmail();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationOperationImplicit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationOperationLogin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationOperationRefresh();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationOperationLogout();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationAppleIDProviderCredentialRevokedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ASAuthorizationErrorDomain();
}