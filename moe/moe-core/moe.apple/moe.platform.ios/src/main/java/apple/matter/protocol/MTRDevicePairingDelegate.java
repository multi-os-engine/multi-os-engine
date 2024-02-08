package apple.matter.protocol;

import apple.foundation.NSError;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.1
 * Deprecated-Since: 16.4
 * Deprecated-Message: Please use MTRDeviceControllerDelegate
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRDevicePairingDelegate")
public interface MTRDevicePairingDelegate {
    @Generated
    @IsOptional
    @Selector("onCommissioningComplete:")
    default void onCommissioningComplete(@Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("onPairingComplete:")
    default void onPairingComplete(@Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("onPairingDeleted:")
    default void onPairingDeleted(@Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("onStatusUpdate:")
    default void onStatusUpdate(@NUInt long status) {
        throw new java.lang.UnsupportedOperationException();
    }
}