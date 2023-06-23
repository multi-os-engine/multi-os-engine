package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class UISceneErrorCode {
    @Generated
    private UISceneErrorCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MultipleScenesNotSupported = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long RequestDenied = 0x0000000000000001L;
    /**
     * UIWindowSceneGeometryRequest error codes
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long GeometryRequestUnsupported = 0x0000000000000064L;
    /**
     * UIWindowSceneGeometryRequest error codes
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long GeometryRequestDenied = 0x0000000000000065L;
}