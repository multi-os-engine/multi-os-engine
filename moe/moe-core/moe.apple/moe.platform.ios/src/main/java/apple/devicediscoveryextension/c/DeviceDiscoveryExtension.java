package apple.devicediscoveryextension.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("DeviceDiscoveryExtension")
@Runtime(CRuntime.class)
public final class DeviceDiscoveryExtension {
    static {
        NatJ.register();
    }

    @Generated
    private DeviceDiscoveryExtension() {
    }

    /**
     * Converts a device protocol type to a string for logging, etc.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String DDDeviceProtocolToString(@NInt long inValue);

    /**
     * Converts a device category to a string for logging, etc.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String DDDeviceCategoryToString(@NInt long inValue);

    /**
     * Converts a device state to a string for logging, etc.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String DDDeviceStateToString(@NInt long inValue);

    /**
     * Converts a device media playback state to a string for logging, etc.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String DDDeviceMediaPlaybackStateToString(@NInt long inValue);

    /**
     * Converts an event to a string for logging, etc.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String DDEventTypeToString(@NInt long inValue);

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String DDDeviceProtocolStringInvalid();

    /**
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String DDDeviceProtocolStringDIAL();

    /**
     * NSError domain for DeviceAccess errors.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String DDErrorDomain();
}