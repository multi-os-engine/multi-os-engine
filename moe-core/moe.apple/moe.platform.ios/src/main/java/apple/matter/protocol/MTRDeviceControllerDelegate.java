package apple.matter.protocol;

import apple.foundation.NSError;
import apple.foundation.NSNumber;
import apple.matter.MTRDeviceController;
import apple.matter.MTRProductIdentity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.matter.MTRMetrics;
import apple.matter.MTRCommissioneeInfo;

/**
 * The protocol definition for the MTRDeviceControllerDelegate.
 * 
 * All delegate methods will be called on the supplied Delegate Queue.
 * 
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRDeviceControllerDelegate")
public interface MTRDeviceControllerDelegate {
    /**
     * Notify the delegate when commissioning is completed.
     * 
     * API-Since: 16.4
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use controller:commissioningComplete:nodeID:
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("controller:commissioningComplete:")
    default void controllerCommissioningComplete(@NotNull MTRDeviceController controller, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when commissioning is completed.
     * 
     * Exactly one of error and nodeID will be nil.
     * 
     * If nodeID is not nil, then it represents the node id the node was assigned, as encoded in its operational
     * certificate.
     * 
     * This selector will not be used if controller:commissioningComplete:nodeID:metrics: is supported.
     * 
     * API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("controller:commissioningComplete:nodeID:")
    default void controllerCommissioningCompleteNodeID(@NotNull MTRDeviceController controller, @Nullable NSError error,
            @Nullable NSNumber nodeID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when a commissioning session is established or the
     * establishment has errored out.
     * 
     * API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("controller:commissioningSessionEstablishmentDone:")
    default void controllerCommissioningSessionEstablishmentDone(@NotNull MTRDeviceController controller,
            @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 17.0
     * Deprecated-Since: 18.4
     * Deprecated-Message: Use controller:readCommissioneeInfo:
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("controller:readCommissioningInfo:")
    default void controllerReadCommissioningInfo(@NotNull MTRDeviceController controller,
            @NotNull MTRProductIdentity info) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when commissioning status gets updated.
     * 
     * API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("controller:statusUpdate:")
    default void controllerStatusUpdate(@NotNull MTRDeviceController controller, @NInt long status) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when commissioning is completed.
     * 
     * Exactly one of error and nodeID will be nil.
     * 
     * If nodeID is not nil, then it represents the node id the node was assigned, as encoded in its operational
     * certificate.
     * 
     * The metrics object contains information corresponding to the commissioning session.
     * 
     * If supported, this selector will be used in preference to controller:commissioningComplete:nodeID:.
     * 
     * API-Since: 17.6
     */
    @Generated
    @IsOptional
    @Selector("controller:commissioningComplete:nodeID:metrics:")
    default void controllerCommissioningCompleteNodeIDMetrics(@NotNull MTRDeviceController controller,
            @Nullable NSError error, @Nullable NSNumber nodeID, @NotNull MTRMetrics metrics) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when the suspended state changed of the controller, after this happens
     * the controller will be in the specified state.
     * 
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("controller:suspendedChangedTo:")
    default void controllerSuspendedChangedTo(@NotNull MTRDeviceController controller, boolean suspended) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate that we have successfully communicated the network
     * credentials to the device being commissioned and are about to tell it to join
     * that network. Note that for devices that are already on-network this
     * notification will not happen.
     * 
     * API-Since: 18.5
     */
    @Generated
    @IsOptional
    @Selector("controller:commissioneeHasReceivedNetworkCredentials:")
    default void controllerCommissioneeHasReceivedNetworkCredentials(@NotNull MTRDeviceController controller,
            @NotNull NSNumber nodeID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when commissioning infomation has been read from the commissionee.
     * 
     * Note that this notification happens before device attestation is performed,
     * so the information delivered by this notification should not be trusted.
     * 
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("controller:readCommissioneeInfo:")
    default void controllerReadCommissioneeInfo(@NotNull MTRDeviceController controller,
            @NotNull MTRCommissioneeInfo info) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when the list of MTRDevice objects in memory has changed.
     * 
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("devicesChangedForController:")
    default void devicesChangedForController(@NotNull MTRDeviceController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}