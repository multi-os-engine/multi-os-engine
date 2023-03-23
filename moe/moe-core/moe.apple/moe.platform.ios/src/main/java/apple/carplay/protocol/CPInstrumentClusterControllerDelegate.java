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

/**
 * API-Since: 15.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPInstrumentClusterControllerDelegate")
public interface CPInstrumentClusterControllerDelegate {
    @Generated
    @IsOptional
    @Selector("instrumentClusterController:didChangeCompassSetting:")
    default void instrumentClusterControllerDidChangeCompassSetting(
            CPInstrumentClusterController instrumentClusterController, @NUInt long compassSetting) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("instrumentClusterController:didChangeSpeedLimitSetting:")
    default void instrumentClusterControllerDidChangeSpeedLimitSetting(
            CPInstrumentClusterController instrumentClusterController, @NUInt long speedLimitSetting) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("instrumentClusterControllerDidConnectWindow:")
    void instrumentClusterControllerDidConnectWindow(UIWindow instrumentClusterWindow);

    @Generated
    @Selector("instrumentClusterControllerDidDisconnectWindow:")
    void instrumentClusterControllerDidDisconnectWindow(UIWindow instrumentClusterWindow);

    @Generated
    @IsOptional
    @Selector("instrumentClusterControllerDidZoomIn:")
    default void instrumentClusterControllerDidZoomIn(CPInstrumentClusterController instrumentClusterController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("instrumentClusterControllerDidZoomOut:")
    default void instrumentClusterControllerDidZoomOut(CPInstrumentClusterController instrumentClusterController) {
        throw new java.lang.UnsupportedOperationException();
    }
}