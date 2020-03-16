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

@Generated
@Library("ImageCaptureCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ICDeviceDelegate")
public interface ICDeviceDelegate {
    @Generated
    @Selector("device:didCloseSessionWithError:")
    void deviceDidCloseSessionWithError(ICDevice device, NSError error);

    @Generated
    @IsOptional
    @Selector("device:didEjectWithError:")
    default void deviceDidEjectWithError(ICDevice device, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("device:didEncounterError:")
    default void deviceDidEncounterError(ICDevice device, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("device:didOpenSessionWithError:")
    void deviceDidOpenSessionWithError(ICDevice device, NSError error);

    @Generated
    @IsOptional
    @Selector("device:didReceiveStatusInformation:")
    default void deviceDidReceiveStatusInformation(ICDevice device, NSDictionary<String, ?> status) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("deviceDidBecomeReady:")
    default void deviceDidBecomeReady(ICDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("didRemoveDevice:")
    void didRemoveDevice(ICDevice device);
}