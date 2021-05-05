package apple.imagecapturecore.protocol;

import apple.imagecapturecore.ICDevice;
import apple.imagecapturecore.ICDeviceBrowser;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * ------------------------------------------------------------------------------------------------------ ICDeviceBrowserDelegate
 * [@protocol] ICDeviceBrowserDelegate <NSObject>
 * 
 * A delegate of ICDeviceBrowser must conform to ICDeviceBrowserDelegate protocol.
 */
@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ICDeviceBrowserDelegate")
public interface ICDeviceBrowserDelegate {
    /**
     * deviceBrowser:deviceDidChangeName:
     * 
     * This message is sent if the name of a device changes.
     * 
     * This happens if the device module overrides the default name of the device reported by the device's transport layer, or if the name of the filesystem volume mounted by the device is changed by the user.
     */
    @Generated
    @IsOptional
    @Selector("deviceBrowser:deviceDidChangeName:")
    default void deviceBrowserDeviceDidChangeName(ICDeviceBrowser browser, ICDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * deviceBrowser:deviceDidChangeSharingState:
     * 
     * This message is sent when the sharing state of a device has changes.
     * [@discusson] Any Image Capture client application can choose to share the device over the network using the sharing or webSharing facility in Image Capture.
     */
    @Generated
    @IsOptional
    @Selector("deviceBrowser:deviceDidChangeSharingState:")
    default void deviceBrowserDeviceDidChangeSharingState(ICDeviceBrowser browser, ICDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * deviceBrowser:didAddDevice:moreComing:
     * 
     * This message is sent to the delegate to inform that a device has been added.
     * 
     * If several devices are found during the initial search, then this message is sent once for each device with the value of 'moreComing' set to YES in each message except the last one.
     */
    @Generated
    @Selector("deviceBrowser:didAddDevice:moreComing:")
    void deviceBrowserDidAddDeviceMoreComing(ICDeviceBrowser browser, ICDevice device, boolean moreComing);

    /**
     * deviceBrowser:didRemoveDevice:moreGoing:
     * 
     * This message is sent to the delegate to inform that a device has been removed.
     * 
     * If several devices are removed at the same time, then this message is sent once for each device with the value of 'moreGoing' set to YES in each message except the last one.
     */
    @Generated
    @Selector("deviceBrowser:didRemoveDevice:moreGoing:")
    void deviceBrowserDidRemoveDeviceMoreGoing(ICDeviceBrowser browser, ICDevice device, boolean moreGoing);

    /**
     * deviceBrowserDidCancelSuspendOperations:
     * 
     * This message is sent to the delegate to inform that operations on devices in the browser have resumed before the suspension timeout.
     * 
     * All communcation with the attached device will remain available as the application was switched back to the foreground before the
     *  suspension timeout.
     */
    @Generated
    @IsOptional
    @Selector("deviceBrowserDidCancelSuspendOperations:")
    default void deviceBrowserDidCancelSuspendOperations(ICDeviceBrowser browser) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * deviceBrowserDidResumeOperations:
     * 
     * This message is sent to the delegate to inform that operations on devices in the browser have resumed.
     * 
     * All communcation with the attached device has been resumed as the application has now entered the foreground.
     */
    @Generated
    @IsOptional
    @Selector("deviceBrowserDidResumeOperations:")
    default void deviceBrowserDidResumeOperations(ICDeviceBrowser browser) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * deviceBrowserDidSuspendOperations:
     * 
     * This message is sent to the delegate to inform that operations on devices in the browser have been suspended.
     * 
     * All communcation with the attached device will remain suspended until the application has entered the foreground.
     *   In no way does this suspension modify the state of the connected device, nor does it issue a close session of any kind.  State should always be
     * managed by the application.
     */
    @Generated
    @IsOptional
    @Selector("deviceBrowserDidSuspendOperations:")
    default void deviceBrowserDidSuspendOperations(ICDeviceBrowser browser) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * deviceBrowserWillSuspendOperations:
     * 
     * This message is sent to the delegate to inform that operations on devices in the browser will be suspended shortly.
     * 
     * Attached devices may require time to prepare the device for suspended communication.  This delegate method is called
     *   when the application is switched into the background.
     */
    @Generated
    @IsOptional
    @Selector("deviceBrowserWillSuspendOperations:")
    default void deviceBrowserWillSuspendOperations(ICDeviceBrowser browser) {
        throw new java.lang.UnsupportedOperationException();
    }
}