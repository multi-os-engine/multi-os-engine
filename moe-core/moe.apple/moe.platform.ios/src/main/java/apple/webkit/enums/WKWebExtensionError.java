package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used by ``NSError`` to indicate errors in the ``WKWebExtension`` domain.
 * [@constant] WKWebExtensionErrorUnknown Indicates that an unknown error occurred.
 * [@constant] WKWebExtensionErrorResourceNotFound Indicates that a specified resource was not found on disk.
 * [@constant] WKWebExtensionErrorInvalidResourceCodeSignature Indicates that a resource failed the bundle's code
 * signature checks.
 * [@constant] WKWebExtensionErrorInvalidManifest Indicates that an invalid `manifest.json` was encountered.
 * [@constant] WKWebExtensionErrorUnsupportedManifestVersion Indicates that the manifest version is not supported.
 * [@constant] WKWebExtensionErrorInvalidManifestEntry Indicates that an invalid manifest entry was encountered.
 * [@constant] WKWebExtensionErrorInvalidDeclarativeNetRequestEntry Indicates that an invalid declarative net request
 * entry was encountered.
 * [@constant] WKWebExtensionErrorInvalidBackgroundPersistence Indicates that the extension specified background
 * persistence that was not compatible with the platform or features requested.
 * [@constant] WKWebExtensionErrorInvalidArchive Indicates that the archive file is invalid or corrupt.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionError {
    @Generated
    private WKWebExtensionError() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long ResourceNotFound = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidResourceCodeSignature = 0x0000000000000003L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidManifest = 0x0000000000000004L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long UnsupportedManifestVersion = 0x0000000000000005L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidManifestEntry = 0x0000000000000006L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidDeclarativeNetRequestEntry = 0x0000000000000007L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidBackgroundPersistence = 0x0000000000000008L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long InvalidArchive = 0x0000000000000009L;
}