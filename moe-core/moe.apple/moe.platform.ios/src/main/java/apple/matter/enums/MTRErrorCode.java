package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * MTRErrorDomain contains errors caused by data processing the framework
 * itself is performing. These can be caused by invalid values provided to a
 * framework API, failure to decode an incoming message, and so forth.
 * 
 * This error domain also contains errors that are communicated via success
 * responses from a server but mapped to an error on the client.
 * 
 * Errors reported by the server side of a Matter interaction via the normal
 * Matter error-reporting mechanisms use MTRInteractionErrorDomain instead.
 * 
 * API-Since: 16.1
 */
@Generated
public final class MTRErrorCode {
    @Generated
    private MTRErrorCode() {
    }

    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long GeneralError = 0x0000000000000001L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long InvalidStringLength = 0x0000000000000002L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long InvalidIntegerValue = 0x0000000000000003L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long InvalidArgument = 0x0000000000000004L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long InvalidMessageLength = 0x0000000000000005L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long InvalidState = 0x0000000000000006L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long WrongAddressType = 0x0000000000000007L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long IntegrityCheckFailed = 0x0000000000000008L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long Timeout = 0x0000000000000009L;
    /**
     * MTRErrorCodeGeneralError represents a generic Matter error with no
     * further categorization.
     * 
     * The userInfo will have a key named @"errorCode" whose value will be an
     * integer representing the underlying Matter error code. These integer
     * values should not be assumed to be stable across releases, but may be
     * useful in logging and debugging.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long BufferTooSmall = 0x000000000000000AL;
    /**
     * MTRErrorCodeFabricExists is returned when trying to commission a device
     * into a fabric when it's already part of that fabric.
     * 
     * API-Since: 16.1
     */
    @Generated @NInt public static final long FabricExists = 0x000000000000000BL;
    /**
     * MTRErrorCodeUnknownSchema means the schema for the given cluster/attribute,
     * cluster/event, or cluster/command combination is not known.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long UnknownSchema = 0x000000000000000CL;
    /**
     * MTRErrorCodeSchemaMismatch means that provided data did not match the
     * expected schema.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long SchemaMismatch = 0x000000000000000DL;
    /**
     * MTRErrorCodeTLVDecodeFailed means that the TLV being decoded was malformed in
     * some way. This can include things like lengths running past the end of
     * the buffer, strings that are not actually UTF-8, and various other
     * TLV-level failures.
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long TLVDecodeFailed = 0x000000000000000EL;
    /**
     * MTRErrorCodeDNSSDUnauthorized means that the application is not
     * authorized to perform DNS_SD lookups. This typically means missing
     * entries for "_matter._tcp" (for operational lookup) and "_matterc._udp"
     * (for commissionable lookup) under the NSBonjourServices key in the
     * application's Info.plist.
     * 
     * API-Since: 17.2
     */
    @Generated @NInt public static final long DNSSDUnauthorized = 0x000000000000000FL;
    /**
     * The operation was cancelled.
     * 
     * API-Since: 17.6
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000010L;
    /**
     * Access to some resource was denied.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long AccessDenied = 0x0000000000000011L;
    /**
     * A request was made to some entity, and that entity cannot handle the
     * request right now, but might be able to at a different point in time.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Busy = 0x0000000000000012L;
    /**
     * Something was requested that could not be located.
     * 
     * API-Since: 18.4
     */
    @Generated @NInt public static final long NotFound = 0x0000000000000013L;
}