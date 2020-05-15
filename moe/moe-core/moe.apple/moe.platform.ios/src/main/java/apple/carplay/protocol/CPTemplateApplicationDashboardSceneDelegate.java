package apple.carplay.protocol;

import apple.carplay.CPDashboardController;
import apple.carplay.CPTemplateApplicationDashboardScene;
import apple.uikit.UIWindow;
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
@ObjCProtocolName("CPTemplateApplicationDashboardSceneDelegate")
public interface CPTemplateApplicationDashboardSceneDelegate extends UISceneDelegate {
    @Generated
    @IsOptional
    @Selector("templateApplicationDashboardScene:didConnectDashboardController:toWindow:")
    default void templateApplicationDashboardSceneDidConnectDashboardControllerToWindow(
            CPTemplateApplicationDashboardScene templateApplicationDashboardScene,
            CPDashboardController dashboardController, UIWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("templateApplicationDashboardScene:didDisconnectDashboardController:fromWindow:")
    default void templateApplicationDashboardSceneDidDisconnectDashboardControllerFromWindow(
            CPTemplateApplicationDashboardScene templateApplicationDashboardScene,
            CPDashboardController dashboardController, UIWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }
}