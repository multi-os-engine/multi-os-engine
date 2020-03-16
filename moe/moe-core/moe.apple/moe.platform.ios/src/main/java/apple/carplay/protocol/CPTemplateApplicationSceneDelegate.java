package apple.carplay.protocol;

import apple.carplay.CPInterfaceController;
import apple.carplay.CPManeuver;
import apple.carplay.CPNavigationAlert;
import apple.carplay.CPTemplateApplicationScene;
import apple.carplay.CPWindow;
import apple.uikit.protocol.UISceneDelegate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPTemplateApplicationSceneDelegate")
public interface CPTemplateApplicationSceneDelegate extends UISceneDelegate {
    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didConnectInterfaceController:toWindow:")
    default void templateApplicationSceneDidConnectInterfaceControllerToWindow(
            CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController,
            CPWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didDisconnectInterfaceController:fromWindow:")
    default void templateApplicationSceneDidDisconnectInterfaceControllerFromWindow(
            CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController,
            CPWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didSelectManeuver:")
    default void templateApplicationSceneDidSelectManeuver(CPTemplateApplicationScene templateApplicationScene,
            CPManeuver maneuver) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didSelectNavigationAlert:")
    default void templateApplicationSceneDidSelectNavigationAlert(CPTemplateApplicationScene templateApplicationScene,
            CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }
}