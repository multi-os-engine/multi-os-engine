package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants used to indicate permission status in ``WKWebExtensionContext``.
 * [@constant] WKWebExtensionContextPermissionStatusDeniedExplicitly Indicates that the permission was explicitly
 * denied.
 * [@constant] WKWebExtensionContextPermissionStatusDeniedImplicitly Indicates that the permission was implicitly denied
 * because of another explicitly denied permission.
 * [@constant] WKWebExtensionContextPermissionStatusRequestedImplicitly Indicates that the permission was implicitly
 * requested because of another explicitly requested permission.
 * [@constant] WKWebExtensionContextPermissionStatusUnknown Indicates that an unknown permission status.
 * [@constant] WKWebExtensionContextPermissionStatusRequestedExplicitly Indicates that the permission was explicitly
 * requested.
 * [@constant] WKWebExtensionContextPermissionStatusGrantedImplicitly Indicates that the permission was implicitly
 * granted because of another explicitly granted permission.
 * [@constant] WKWebExtensionContextPermissionStatusGrantedExplicitly Indicates that the permission was explicitly
 * granted permission.
 * 
 * API-Since: 18.4
 */
@Generated
public final class WKWebExtensionContextPermissionStatus {
    @Generated
    private WKWebExtensionContextPermissionStatus() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long DeniedExplicitly = 0xFFFFFFFFFFFFFFFDL;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long DeniedImplicitly = 0xFFFFFFFFFFFFFFFEL;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long RequestedImplicitly = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long RequestedExplicitly = 0x0000000000000001L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long GrantedImplicitly = 0x0000000000000002L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long GrantedExplicitly = 0x0000000000000003L;
}