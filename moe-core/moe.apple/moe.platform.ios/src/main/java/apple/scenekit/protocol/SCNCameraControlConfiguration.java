package apple.scenekit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 11.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNCameraControlConfiguration")
public interface SCNCameraControlConfiguration {
    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("allowsTranslation")
    boolean allowsTranslation();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("autoSwitchToFreeCamera")
    boolean autoSwitchToFreeCamera();

    /**
     * in m/s
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("flyModeVelocity")
    @NFloat
    double flyModeVelocity();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("panSensitivity")
    @NFloat
    double panSensitivity();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("rotationSensitivity")
    @NFloat
    double rotationSensitivity();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAllowsTranslation:")
    void setAllowsTranslation(boolean value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAutoSwitchToFreeCamera:")
    void setAutoSwitchToFreeCamera(boolean value);

    /**
     * in m/s
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setFlyModeVelocity:")
    void setFlyModeVelocity(@NFloat double value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPanSensitivity:")
    void setPanSensitivity(@NFloat double value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setRotationSensitivity:")
    void setRotationSensitivity(@NFloat double value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTruckSensitivity:")
    void setTruckSensitivity(@NFloat double value);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("truckSensitivity")
    @NFloat
    double truckSensitivity();
}