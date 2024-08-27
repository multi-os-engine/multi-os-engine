package apple.matter.protocol;

import apple.matter.MTRCommissionableBrowserResult;
import apple.matter.MTRDeviceController;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 17.0
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRCommissionableBrowserDelegate")
public interface MTRCommissionableBrowserDelegate {
    /**
     * Tells the delegate the commissionable manager discovered a device while scanning for devices.
     */
    @Generated
    @Selector("controller:didFindCommissionableDevice:")
    void controllerDidFindCommissionableDevice(@NotNull MTRDeviceController controller,
            @NotNull MTRCommissionableBrowserResult device);

    /**
     * Tells the delegate a previously discovered device is is no longer available.
     */
    @Generated
    @Selector("controller:didRemoveCommissionableDevice:")
    void controllerDidRemoveCommissionableDevice(@NotNull MTRDeviceController controller,
            @NotNull MTRCommissionableBrowserResult device);
}