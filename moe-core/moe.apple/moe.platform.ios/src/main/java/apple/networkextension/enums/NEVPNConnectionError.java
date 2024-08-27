package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEVPNConnectionError
 * 
 * VPN error codes
 * 
 * API-Since: 16.0
 */
@Generated
public final class NEVPNConnectionError {
    @Generated
    private NEVPNConnectionError() {
    }

    /**
     * [@const] NEVPNConnectionErrorOverslept The VPN connection was terminated because the system slept for an extended
     * period of time.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Overslept = 0x0000000000000001L;
    /**
     * [@const] NEVPNConnectionErrorNoNetworkAvailable The VPN connection could not be established because the system is
     * not connected to a network.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NoNetworkAvailable = 0x0000000000000002L;
    /**
     * [@const] NEVPNConnectionErrorUnrecoverableNetworkChange The VPN connection was terminated because the network
     * conditions changed in such a
     * way that the VPN connection could not be maintained.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long UnrecoverableNetworkChange = 0x0000000000000003L;
    /**
     * [@const] NEVPNConnectionErrorConfigurationFailed The VPN connection could not be established because the
     * configuration is invalid.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ConfigurationFailed = 0x0000000000000004L;
    /**
     * [@const] NEVPNConnectionErrorServerAddressResolutionFailed The address of the VPN server could not be determined.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ServerAddressResolutionFailed = 0x0000000000000005L;
    /**
     * [@const] NEVPNConnectionErrorServerNotResponding Network communication with the VPN server has failed.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ServerNotResponding = 0x0000000000000006L;
    /**
     * [@const] NEVPNConnectionErrorServerDead The VPN server is no longer functioning.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ServerDead = 0x0000000000000007L;
    /**
     * [@const] NEVPNConnectionErrorAuthenticationFailed The user credentials were rejected by the VPN server.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long AuthenticationFailed = 0x0000000000000008L;
    /**
     * [@const] NEVPNConnectionErrorClientCertificateInvalid The client certificate is invalid.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ClientCertificateInvalid = 0x0000000000000009L;
    /**
     * [@const] NEVPNConnectionErrorClientCertificateNotYetValid The client certificate will not be valid until some
     * future point in time.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ClientCertificateNotYetValid = 0x000000000000000AL;
    /**
     * [@const] NEVPNConnectionErrorClientCertificateExpired The validity period of the client certificate has passed.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ClientCertificateExpired = 0x000000000000000BL;
    /**
     * [@const] NEVPNConnectionErrorPluginFailed The VPN plugin died unexpectedly.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PluginFailed = 0x000000000000000CL;
    /**
     * [@const] NEVPNConnectionErrorConfigurationNotFound The VPN configuration could not be found .
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ConfigurationNotFound = 0x000000000000000DL;
    /**
     * [@const] NEVPNConnectionErrorPluginDisabled The VPN plugin could not be found or needed to be updated.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long PluginDisabled = 0x000000000000000EL;
    /**
     * [@const] NEVPNConnectionErrorNegotiationFailed The VPN protocol negotiation failed.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NegotiationFailed = 0x000000000000000FL;
    /**
     * [@const] NEVPNConnectionErrorServerDisconnected The VPN server terminated the connection.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ServerDisconnected = 0x0000000000000010L;
    /**
     * [@const] NEVPNConnectionErrorServerCertificateInvalid The server certificate is invalid.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ServerCertificateInvalid = 0x0000000000000011L;
    /**
     * [@const] NEVPNConnectionErrorServerCertificateNotYetValid The server certificate will not be valid until some
     * future point in time.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ServerCertificateNotYetValid = 0x0000000000000012L;
    /**
     * [@const] NEVPNConnectionErrorServerCertificateExpired The validity period of the server certificate has passed.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ServerCertificateExpired = 0x0000000000000013L;
}