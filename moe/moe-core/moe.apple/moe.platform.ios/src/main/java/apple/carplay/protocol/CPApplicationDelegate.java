package apple.carplay.protocol;

import apple.carplay.CPInterfaceController;
import apple.carplay.CPManeuver;
import apple.carplay.CPNavigationAlert;
import apple.carplay.CPWindow;
import apple.uikit.UIApplication;
import apple.uikit.protocol.UIApplicationDelegate;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * A set of methods that are called by the @c UIApplication singleton in response to CarPlay lifecycle events.
 * 
 * This must be implemented by the same object that serves as your application's delegate object.
 * 
 * API-Since: 12.0
 * Deprecated-Since: 13.0
 */
@Deprecated
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPApplicationDelegate")
public interface CPApplicationDelegate extends UIApplicationDelegate {
    /**
     * The CarPlay screen has connected and is ready to present content.
     * 
     * Your app should create its view controller and assign it to the @c rootViewController property
     * of this window.
     * 
     * [@note] It is the responsibility of the delegate to maintain a reference to the interface controller beyond the
     * scope of this method.
     */
    @Generated
    @Selector("application:didConnectCarInterfaceController:toWindow:")
    void applicationDidConnectCarInterfaceControllerToWindow(@NotNull UIApplication application,
            @NotNull CPInterfaceController interfaceController, @NotNull CPWindow window);

    /**
     * The CarPlay screen has disconnected.
     */
    @Generated
    @Selector("application:didDisconnectCarInterfaceController:fromWindow:")
    void applicationDidDisconnectCarInterfaceControllerFromWindow(@NotNull UIApplication application,
            @NotNull CPInterfaceController interfaceController, @NotNull CPWindow window);

    /**
     * If your application posts a @c CPManeuver while backgrounded, a notification banner may be presented to the user.
     * If the user taps on that banner, your application will launch on the car screen and this method will be called
     * with the maneuver the user tapped.
     */
    @Generated
    @IsOptional
    @Selector("application:didSelectManeuver:")
    default void applicationDidSelectManeuver(@NotNull UIApplication application, @NotNull CPManeuver maneuver) {
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
    @Selector("application:didSelectNavigationAlert:")
    default void applicationDidSelectNavigationAlert(@NotNull UIApplication application,
            @NotNull CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }
}
