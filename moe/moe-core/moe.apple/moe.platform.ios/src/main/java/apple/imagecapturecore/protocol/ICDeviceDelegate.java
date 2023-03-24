package apple.imagecapturecore.protocol;

import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.imagecapturecore.ICDevice;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * -------------------------------------------------------------------------------------------------------------
 * ICDeviceDelegate
 * [@protocol] ICDeviceDelegate <NSObject>
 * 
 * A delegate of ICDevice must conform to ICDeviceDelegate protocol.
 * [@note] Unless otherwise noted, all delegate callbacks will occur on the main thread.
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ICDeviceDelegate")
public interface ICDeviceDelegate {
    /**
     * device:didCloseSessionWithError:
     * 
     * This message is sent when a session is closed on a device.
     * 
     * This message completes the process initiated by the message "requestCloseSession" sent to the device object. This
     * message is also sent if the device module in control of the device ceases to control the device.
     * [@note] Execution of the delegate callback will occur on the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("device:didCloseSessionWithError:")
    void deviceDidCloseSessionWithError(@NotNull ICDevice device, @Nullable NSError error);

    /**
     * device:didEjectWithError:
     * 
     * This message is sent to the device delegate when the eject has completed.
     * [@note] Execution of the delegate callback will occur on the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("device:didEjectWithError:")
    default void deviceDidEjectWithError(@NotNull ICDevice device, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * device:didEncounterError:
     * 
     * This message is sent to the device delegate a device encounters an error.
     * [@note] Execution of the delegate callback will occur on the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("device:didEncounterError:")
    default void deviceDidEncounterError(@NotNull ICDevice device, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * device:didOpenSessionWithError:
     * 
     * This message is sent when a session is opened on a device.
     * 
     * This message completes the process initiated by the message "requestOpenSession" sent to the device object.
     * [@note] Execution of the delegate callback will occur on the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("device:didOpenSessionWithError:")
    void deviceDidOpenSessionWithError(@NotNull ICDevice device, @Nullable NSError error);

    /**
     * device:didReceiveStatusInformation:
     * 
     * This message is sent to the device delegate when status information is received from a device.
     * 
     * The 'status' dictionary contains two keys, ICStatusNotificationKey and ICLocalizedStatusNotificationKey, which
     * are defined above. Status information keys are located in their respective ICDevice type class header.
     * [@note] Execution of the delegate callback will occur on the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("device:didReceiveStatusInformation:")
    default void deviceDidReceiveStatusInformation(@NotNull ICDevice device, @NotNull NSDictionary<String, ?> status) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * deviceDidBecomeReady:
     * 
     * This message is sent when the device is ready to receive requests.
     * [@note] Execution of the delegate callback will occur on the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("deviceDidBecomeReady:")
    default void deviceDidBecomeReady(@NotNull ICDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didRemoveDevice:
     * 
     * This message is sent to the delegate to inform that a device has been removed.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("didRemoveDevice:")
    void didRemoveDevice(@NotNull ICDevice device);
}
