package apple.scenekit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNCameraControlConfiguration")
public interface SCNCameraControlConfiguration {
    @Generated
    @Selector("allowsTranslation")
    boolean allowsTranslation();

    @Generated
    @Selector("autoSwitchToFreeCamera")
    boolean autoSwitchToFreeCamera();

    /**
     * in m/s
     */
    @Generated
    @Selector("flyModeVelocity")
    @NFloat
    double flyModeVelocity();

    @Generated
    @Selector("panSensitivity")
    @NFloat
    double panSensitivity();

    @Generated
    @Selector("rotationSensitivity")
    @NFloat
    double rotationSensitivity();

    @Generated
    @Selector("setAllowsTranslation:")
    void setAllowsTranslation(boolean value);

    @Generated
    @Selector("setAutoSwitchToFreeCamera:")
    void setAutoSwitchToFreeCamera(boolean value);

    /**
     * in m/s
     */
    @Generated
    @Selector("setFlyModeVelocity:")
    void setFlyModeVelocity(@NFloat double value);

    @Generated
    @Selector("setPanSensitivity:")
    void setPanSensitivity(@NFloat double value);

    @Generated
    @Selector("setRotationSensitivity:")
    void setRotationSensitivity(@NFloat double value);

    @Generated
    @Selector("setTruckSensitivity:")
    void setTruckSensitivity(@NFloat double value);

    @Generated
    @Selector("truckSensitivity")
    @NFloat
    double truckSensitivity();
}