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
     */
    @Generated
    @IsOptional
    @Selector("controller:commissioningSessionEstablishmentDone:")
    default void controllerCommissioningSessionEstablishmentDone(@NotNull MTRDeviceController controller,
            @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when commissioning infomation has been read from the Basic
     * Information cluster of the commissionee.
     * 
     * At the point when this notification happens, device attestation has not been performed yet,
     * so the information delivered by this notification should not be trusted.
     * 
     * API-Since: 17.0
     */
    @Generated
    @IsOptional
    @Selector("controller:readCommissioningInfo:")
    default void controllerReadCommissioningInfo(@NotNull MTRDeviceController controller,
            @NotNull MTRProductIdentity info) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when commissioning status gets updated.
     */
    @Generated
    @IsOptional
    @Selector("controller:statusUpdate:")
    default void controllerStatusUpdate(@NotNull MTRDeviceController controller, @NInt long status) {
        throw new java.lang.UnsupportedOperationException();
    }
}