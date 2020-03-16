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

@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CPApplicationDelegate")
public interface CPApplicationDelegate extends UIApplicationDelegate {
    @Generated
    @Selector("application:didConnectCarInterfaceController:toWindow:")
    void applicationDidConnectCarInterfaceControllerToWindow(UIApplication application,
            CPInterfaceController interfaceController, CPWindow window);

    @Generated
    @Selector("application:didDisconnectCarInterfaceController:fromWindow:")
    void applicationDidDisconnectCarInterfaceControllerFromWindow(UIApplication application,
            CPInterfaceController interfaceController, CPWindow window);

    @Generated
    @IsOptional
    @Selector("application:didSelectManeuver:")
    default void applicationDidSelectManeuver(UIApplication application, CPManeuver maneuver) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("application:didSelectNavigationAlert:")
    default void applicationDidSelectNavigationAlert(UIApplication application, CPNavigationAlert navigationAlert) {
        throw new java.lang.UnsupportedOperationException();
    }
}