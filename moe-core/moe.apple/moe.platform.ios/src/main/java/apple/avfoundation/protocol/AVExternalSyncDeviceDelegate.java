package apple.avfoundation.protocol;

import apple.avfoundation.AVExternalSyncDevice;
import apple.foundation.NSError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Defines an interface for delegates of ``AVCaptureDeviceInput`` to respond to events that occur when connecting,
 * calibrating, and disconnecting external sync devices.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVExternalSyncDeviceDelegate")
public interface AVExternalSyncDeviceDelegate {
    /**
     * Informs your delegate when the external sync device has encountered an error.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("externalSyncDevice:failedWithError:")
    default void externalSyncDeviceFailedWithError(@NotNull AVExternalSyncDevice device, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Informs your delegate when the external sync device status has changed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("externalSyncDeviceStatusDidChange:")
    default void externalSyncDeviceStatusDidChange(@NotNull AVExternalSyncDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }
}