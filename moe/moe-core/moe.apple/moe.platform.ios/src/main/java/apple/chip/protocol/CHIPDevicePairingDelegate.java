package apple.chip.protocol;

import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The protocol definition for the CHIPDevicePairingDelegate
 * <p>
 * All delegate methods will be called on the supplied Delegate Queue.
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHIPDevicePairingDelegate")
public interface CHIPDevicePairingDelegate {
    /**
     * Notify the delegate when address is updated
     */
    @Generated
    @IsOptional
    @Selector("onAddressUpdated:")
    default void onAddressUpdated(NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when pairing is completed
     */
    @Generated
    @IsOptional
    @Selector("onPairingComplete:")
    default void onPairingComplete(NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when pairing is deleted
     */
    @Generated
    @IsOptional
    @Selector("onPairingDeleted:")
    default void onPairingDeleted(NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when pairing status gets updated
     */
    @Generated
    @IsOptional
    @Selector("onStatusUpdate:")
    default void onStatusUpdate(@NUInt long status) {
        throw new java.lang.UnsupportedOperationException();
    }
}
