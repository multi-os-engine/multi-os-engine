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

@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ICDeviceBrowserDelegate")
public interface ICDeviceBrowserDelegate {
    @Generated
    @IsOptional
    @Selector("deviceBrowser:deviceDidChangeName:")
    default void deviceBrowserDeviceDidChangeName(ICDeviceBrowser browser, ICDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("deviceBrowser:deviceDidChangeSharingState:")
    default void deviceBrowserDeviceDidChangeSharingState(ICDeviceBrowser browser, ICDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("deviceBrowser:didAddDevice:moreComing:")
    void deviceBrowserDidAddDeviceMoreComing(ICDeviceBrowser browser, ICDevice device, boolean moreComing);

    @Generated
    @Selector("deviceBrowser:didRemoveDevice:moreGoing:")
    void deviceBrowserDidRemoveDeviceMoreGoing(ICDeviceBrowser browser, ICDevice device, boolean moreGoing);
}