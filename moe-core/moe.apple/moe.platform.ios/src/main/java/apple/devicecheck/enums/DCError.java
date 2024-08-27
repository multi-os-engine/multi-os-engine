package apple.devicecheck.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * DeviceCheck error codes.
 * 
 * API-Since: 11.0
 */
@Generated
public final class DCError {
    @Generated
    private DCError() {
    }

    /**
     * A failure has occurred, such as the failure to generate a token.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long UnknownSystemFailure = 0x0000000000000000L;
    /**
     * DeviceCheck is unavailable on this device.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long FeatureUnsupported = 0x0000000000000001L;
    /**
     * An error code that indicates when your app provides data that isn’t
     * formatted correctly.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long InvalidInput = 0x0000000000000002L;
    /**
     * An error caused by a failed attempt to use the App Attest key.
     * 
     * You receive this error if something goes wrong with generating,
     * retrieving, or using an App Attest cryptographic key, when:
     * 
     * - You call
     * ``DeviceCheck/DCAppAttestService/attestKey:clientDataHash:completionHandler:``
     * for a key that’s already been attested.
     * - You call
     * ``DeviceCheck/DCAppAttestService/generateAssertion:clientDataHash:completionHandler:``
     * with an unattested key.
     * - The App Attest service rejects the key.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long InvalidKey = 0x0000000000000003L;
    /**
     * An error that indicates a failed attempt to contact the App Attest service
     * during an attestation.
     * 
     * You receive this error when you call
     * ``DeviceCheck/DCAppAttestService/attestKey:clientDataHash:completionHandler:``
     * and the framework isn’t able to complete the attestation. If you receive
     * this error, try the attestation again later using the same key and the same
     * value for the `clientDataHash` parameter. Retrying with the same inputs
     * helps to preserve the risk metric for a given device.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long ServerUnavailable = 0x0000000000000004L;
}