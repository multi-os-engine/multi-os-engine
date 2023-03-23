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
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPTemplateApplicationSceneDelegate")
public interface CPTemplateApplicationSceneDelegate extends UISceneDelegate {
    /**
     * The CarPlay screen has connected and is ready to present content.
     * 
     * Your app should create its view controller and assign it to the @c rootViewController property
     * of this window.
     * 
     * [@note] The interfaceController object will be strongly retained by the CPTemplateApplicationScene, the delegate
     * does not need to retain it.
     * 
     * [@note] This method is provided only for navigation apps; other apps should use the variant that does not provide
     * a window.
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didConnectInterfaceController:toWindow:")
    default void templateApplicationSceneDidConnectInterfaceControllerToWindow(
            CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController,
            CPWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The CarPlay screen has disconnected.
     * 
     * [@note] This method is provided only for navigation apps; other apps should use the variant that does not provide
     * a window.
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didDisconnectInterfaceController:fromWindow:")
    default void templateApplicationSceneDidDisconnectInterfaceControllerFromWindow(
            CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController,
            CPWindow window) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If your application posts a @c CPManeuver while backgrounded, a notification banner may be presented to the user.
     * If the user taps on that banner, your application will launch on the car screen and this method will be called
     * with the maneuver the user tapped.
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didSelectManeuver:")
    default void templateApplicationSceneDidSelectManeuver(CPTemplateApplicationScene templateApplicationScene,
            CPManeuver maneuver) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If your application posts a @c CPNavigationAlert while backgrounded, a notification banner may be presented to
     * the user.
     * If the user taps on that banner, your application will launch on the car screen and this method will be called
     * with the alert the user tapped.
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didSelectNavigationAlert:")
    default void templateApplicationSceneDidSelectNavigationAlert(CPTemplateApplicationScene templateApplicationScene,
            CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The CarPlay screen has connected and is ready to present content.
     * 
     * Your app should create its view controller and assign it to the @c rootViewController property
     * of this window.
     * 
     * [@note] The interfaceController object will be strongly retained by the CPTemplateApplicationScene, the delegate
     * does not need to retain it.
     * 
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didConnectInterfaceController:")
    default void templateApplicationSceneDidConnectInterfaceController(
            CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The CarPlay screen has disconnected.
     * 
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("templateApplicationScene:didDisconnectInterfaceController:")
    default void templateApplicationSceneDidDisconnectInterfaceController(
            CPTemplateApplicationScene templateApplicationScene, CPInterfaceController interfaceController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The CarPlay system suggested content style for this scene has changed.
     * 
     * API-Since: 15.4
     */
    @Generated
    @IsOptional
    @Selector("contentStyleDidChange:")
    default void contentStyleDidChange(@NInt long contentStyle) {
        throw new java.lang.UnsupportedOperationException();
    }
}
