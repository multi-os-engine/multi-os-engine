package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NERelayManagerClientError
 * 
 * NERelay Manager error codes detected by the client while trying to use this relay
 * 
 * API-Since: 18.0
 */
@Generated
public final class NERelayManagerClientError {
    @Generated
    private NERelayManagerClientError() {
    }

    /**
     * [@const] NERelayManagerClientErrorNone The client did not have an error on the last connection
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0x0000000000000001L;
    /**
     * [@const] NERelayManagerClientErrorDNSFailed DNS resolution of the relay server failed
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long DNSFailed = 0x0000000000000002L;
    /**
     * [@const] NERelayManagerClientErrorServerUnreachable The relay server was unreachable
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long ServerUnreachable = 0x0000000000000003L;
    /**
     * [@const] NERelayManagerClientErrorServerDisconnected The relay server prematurely disconnected the connection
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long ServerDisconnected = 0x0000000000000004L;
    /**
     * [@const] NERelayManagerClientErrorCertificateMissing The certificate needed to connect to the relay server could
     * not be accessed or was not provided
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long CertificateMissing = 0x0000000000000005L;
    /**
     * [@const] NERelayManagerClientErrorCertificateInvalid The certificate needed to connect to the relay server was
     * invalid.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long CertificateInvalid = 0x0000000000000006L;
    /**
     * [@const] NERelayManagerClientErrorCertificateExpired The certificate needed to connect to the relay server was
     * expired.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long CertificateExpired = 0x0000000000000007L;
    /**
     * [@const] NERelayManagerClientErrorServerCertificateInvalid The relay server certificate was invalid.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long ServerCertificateInvalid = 0x0000000000000008L;
    /**
     * [@const] NERelayManagerClientErrorServerCertificateExpired The relay server certificate was expired.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long ServerCertificateExpired = 0x0000000000000009L;
    /**
     * [@const] NERelayManagerClientErrorOther The client detected an error that has not yet been enumerated
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Other = 0x000000000000000AL;
}