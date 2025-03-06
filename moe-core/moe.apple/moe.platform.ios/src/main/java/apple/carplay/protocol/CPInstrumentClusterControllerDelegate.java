package apple.carplay.protocol;

import apple.carplay.CPInstrumentClusterController;
import apple.uikit.UIWindow;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 15.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPInstrumentClusterControllerDelegate")
public interface CPInstrumentClusterControllerDelegate {
    /**
     * API-Since: 15.4
     */
    @Generated
    @IsOptional
    @Selector("instrumentClusterController:didChangeCompassSetting:")
    default void instrumentClusterControllerDidChangeCompassSetting(
            @NotNull CPInstrumentClusterController instrumentClusterController, @NUInt long compassSetting) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 15.4
     */
    @Generated
    @IsOptional
    @Selector("instrumentClusterController:didChangeSpeedLimitSetting:")
    default void instrumentClusterControllerDidChangeSpeedLimitSetting(
            @NotNull CPInstrumentClusterController instrumentClusterController, @NUInt long speedLimitSetting) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 15.4
     */
    @Generated
    @Selector("instrumentClusterControllerDidConnectWindow:")
    void instrumentClusterControllerDidConnectWindow(@NotNull UIWindow instrumentClusterWindow);

    /**
     * API-Since: 15.4
     */
    @Generated
    @Selector("instrumentClusterControllerDidDisconnectWindow:")
    void instrumentClusterControllerDidDisconnectWindow(@NotNull UIWindow instrumentClusterWindow);

    /**
     * API-Since: 15.4
     */
    @Generated
    @IsOptional
    @Selector("instrumentClusterControllerDidZoomIn:")
    default void instrumentClusterControllerDidZoomIn(
            @NotNull CPInstrumentClusterController instrumentClusterController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 15.4
     */
    @Generated
    @IsOptional
    @Selector("instrumentClusterControllerDidZoomOut:")
    default void instrumentClusterControllerDidZoomOut(
            @NotNull CPInstrumentClusterController instrumentClusterController) {
        throw new java.lang.UnsupportedOperationException();
    }
}