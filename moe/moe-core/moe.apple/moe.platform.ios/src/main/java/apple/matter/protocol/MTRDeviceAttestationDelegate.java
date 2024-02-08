package apple.matter.protocol;

import apple.foundation.NSError;
import apple.matter.MTRDeviceAttestationDeviceInfo;
import apple.matter.MTRDeviceController;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The protocol definition for the MTRDeviceAttestationDelegate.
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRDeviceAttestationDelegate")
public interface MTRDeviceAttestationDelegate {
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please implement
     * deviceAttestationCompletedForController:opaqueDeviceHandle:attestationDeviceInfo:error:
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("deviceAttestation:completedForDevice:attestationDeviceInfo:error:")
    default void deviceAttestationCompletedForDeviceAttestationDeviceInfoError(@NotNull MTRDeviceController controller,
            @NotNull VoidPtr device, @NotNull MTRDeviceAttestationDeviceInfo attestationDeviceInfo,
            @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please implement deviceAttestationFailedForController:opaqueDeviceHandle:error:
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("deviceAttestation:failedForDevice:error:")
    default void deviceAttestationFailedForDeviceError(@NotNull MTRDeviceController controller, @NotNull VoidPtr device,
            @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when device attestation completed with device info for additional verification. If
     * this callback is implemented, continueCommissioningDevice on MTRDeviceController is expected
     * to be called if commisioning should continue.
     * 
     * This allows the delegate to stop commissioning after examining the device info (DAC, PAI, CD).
     * 
     * @param controller            Controller corresponding to the commissioning process
     * @param opaqueDeviceHandle    Handle of device being commissioned
     * @param attestationDeviceInfo Attestation information for the device
     * @param error                 NSError representing the error code on attestation failure. Nil if success.
     * 
     *                              API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("deviceAttestationCompletedForController:opaqueDeviceHandle:attestationDeviceInfo:error:")
    default void deviceAttestationCompletedForControllerOpaqueDeviceHandleAttestationDeviceInfoError(
            @NotNull MTRDeviceController controller, @NotNull VoidPtr opaqueDeviceHandle,
            @NotNull MTRDeviceAttestationDeviceInfo attestationDeviceInfo, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when device attestation fails. If this callback is implemented,
     * continueCommissioningDevice on MTRDeviceController is expected to be called if commisioning
     * should continue.
     * 
     * @param controller         Controller corresponding to the commissioning process
     * @param opaqueDeviceHandle Handle of device being commissioned
     * @param error              NSError representing the error code for the failure
     * 
     *                           API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("deviceAttestationFailedForController:opaqueDeviceHandle:error:")
    default void deviceAttestationFailedForControllerOpaqueDeviceHandleError(@NotNull MTRDeviceController controller,
            @NotNull VoidPtr opaqueDeviceHandle, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}