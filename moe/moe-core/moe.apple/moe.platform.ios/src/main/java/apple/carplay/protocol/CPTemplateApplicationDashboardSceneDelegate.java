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
    /**
     * The Dashboard navigation widget has connected and is ready to present content.
     * <p>
     * Your app should create its view controller and assign it to the @c rootViewController property
     * of this window.
     * <p>
     * [@note] The dashboardController object will be strongly retained by the CPTemplateApplicationDashboardScene, the delegate does not need to retain it.
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationDashboardScene:didConnectDashboardController:toWindow:")
    default void templateApplicationDashboardSceneDidConnectDashboardControllerToWindow(
            CPTemplateApplicationDashboardScene templateApplicationDashboardScene,
            CPDashboardController dashboardController, UIWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The Dashboard navigation widget has disconnected.
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationDashboardScene:didDisconnectDashboardController:fromWindow:")
    default void templateApplicationDashboardSceneDidDisconnectDashboardControllerFromWindow(
            CPTemplateApplicationDashboardScene templateApplicationDashboardScene,
            CPDashboardController dashboardController, UIWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }
}
