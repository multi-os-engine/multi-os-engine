package apple.systemextensions.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 18.4
 */
@Generated
public final class OSSystemExtensionErrorCode {
    @Generated
    private OSSystemExtensionErrorCode() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long UnsupportedParentBundleLocation = 0x0000000000000003L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long ExtensionNotFound = 0x0000000000000004L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long ExtensionMissingIdentifier = 0x0000000000000005L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long DuplicateExtensionIdentifer = 0x0000000000000006L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long UnknownExtensionCategory = 0x0000000000000007L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long CodeSignatureInvalid = 0x0000000000000008L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long ValidationFailed = 0x0000000000000009L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long ForbiddenBySystemPolicy = 0x000000000000000AL;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long RequestCanceled = 0x000000000000000BL;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long RequestSuperseded = 0x000000000000000CL;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long AuthorizationRequired = 0x000000000000000DL;
}