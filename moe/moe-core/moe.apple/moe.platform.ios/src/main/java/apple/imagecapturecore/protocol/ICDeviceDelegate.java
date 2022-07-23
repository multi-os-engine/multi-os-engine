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

/**
 * -------------------------------------------------------------------------------------------------------------
 * ICDeviceDelegate
 * [@protocol] ICDeviceDelegate <NSObject>
 * <p>
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
     * <p>
     * This message is sent when a session is closed on a device.
     * <p>
     * This message completes the process initiated by the message "requestCloseSession" sent to the device object. This
     * message is also sent if the device module in control of the device ceases to control the device.
     * [@note] Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @Selector("device:didCloseSessionWithError:")
    void deviceDidCloseSessionWithError(ICDevice device, NSError error);

    /**
     * device:didEjectWithError:
     * <p>
     * This message is sent to the device delegate when the eject has completed.
     * [@note] Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @IsOptional
    @Selector("device:didEjectWithError:")
    default void deviceDidEjectWithError(ICDevice device, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * device:didEncounterError:
     * <p>
     * This message is sent to the device delegate a device encounters an error.
     * [@note] Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @IsOptional
    @Selector("device:didEncounterError:")
    default void deviceDidEncounterError(ICDevice device, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * device:didOpenSessionWithError:
     * <p>
     * This message is sent when a session is opened on a device.
     * <p>
     * This message completes the process initiated by the message "requestOpenSession" sent to the device object.
     * [@note] Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @Selector("device:didOpenSessionWithError:")
    void deviceDidOpenSessionWithError(ICDevice device, NSError error);

    /**
     * device:didReceiveStatusInformation:
     * <p>
     * This message is sent to the device delegate when status information is received from a device.
     * <p>
     * The 'status' dictionary contains two keys, ICStatusNotificationKey and ICLocalizedStatusNotificationKey, which
     * are defined above. Status information keys are located in their respective ICDevice type class header.
     * [@note] Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @IsOptional
    @Selector("device:didReceiveStatusInformation:")
    default void deviceDidReceiveStatusInformation(ICDevice device, NSDictionary<String, ?> status) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * deviceDidBecomeReady:
     * <p>
     * This message is sent when the device is ready to receive requests.
     * [@note] Execution of the delegate callback will occur on the main thread.
     */
    @Generated
    @IsOptional
    @Selector("deviceDidBecomeReady:")
    default void deviceDidBecomeReady(ICDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * didRemoveDevice:
     * <p>
     * This message is sent to the delegate to inform that a device has been removed.
     */
    @Generated
    @Selector("didRemoveDevice:")
    void didRemoveDevice(ICDevice device);
}
