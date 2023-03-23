package apple.accessibility.c;

import apple.coregraphics.opaque.CGColorRef;
import apple.foundation.NSArray;
import apple.foundation.NSUUID;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Accessibility")
@Runtime(CRuntime.class)
public final class Accessibility {
    static {
        NatJ.register();
    }

    @Generated
    private Accessibility() {
    }

    /**
     * Returns a localized description of the CGColorRef for use in accessibility attributes.
     * 
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXNameFromColor(CGColorRef color);

    /**
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long AXMFiHearingDeviceStreamingEar();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean AXSupportsBidirectionalAXMFiHearingDeviceStreaming();

    /**
     * Returns the CoreBluetooth UUIDs of the hearing device CBPeripherals. This requires that the value of the
     * "com.apple.developer.hearing-aid-app" entitlement match the manufacturer of the CBPeripherals. For bimodal
     * hearing devices the entitlement should be an array of the manufacturers.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native NSArray<? extends NSUUID> AXMFiHearingDevicePairedUUIDs();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXMFiHearingDeviceStreamingEarDidChangeNotification();

    /**
     * API-Since: 15.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AXMFiHearingDevicePairedUUIDsDidChangeNotification();
}
