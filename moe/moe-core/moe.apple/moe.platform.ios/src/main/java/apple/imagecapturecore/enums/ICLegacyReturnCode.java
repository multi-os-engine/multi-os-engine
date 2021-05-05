package apple.imagecapturecore.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ICLegacyReturnCode {
    @Generated
    private ICLegacyReturnCode() {
    }

    /**
     * An communication error occurred.
     */
    @Generated @NInt public static final long CommunicationErr = 0xFFFFFFFFFFFFD954L;
    /**
     * The specified device is not found.
     */
    @Generated @NInt public static final long DeviceNotFoundErr = 0xFFFFFFFFFFFFD953L;
    /**
     * The specified device is not open.
     */
    @Generated @NInt public static final long DeviceNotOpenErr = 0xFFFFFFFFFFFFD952L;
    /**
     * Encountered a corrupt file
     */
    @Generated @NInt public static final long FileCorruptedErr = 0xFFFFFFFFFFFFD951L;
    /**
     * There is Pending I/O
     */
    @Generated @NInt public static final long IOPendingErr = 0xFFFFFFFFFFFFD950L;
    /**
     * The specified object is invalid
     */
    @Generated @NInt public static final long InvalidObjectErr = 0xFFFFFFFFFFFFD94FL;
    /**
     * The specified property is invalid
     */
    @Generated @NInt public static final long InvalidPropertyErr = 0xFFFFFFFFFFFFD94EL;
    /**
     * The index of the object specified is outside of the available object indexes
     */
    @Generated @NInt public static final long IndexOutOfRangeErr = 0xFFFFFFFFFFFFD94DL;
    /**
     * Specific property type not found on object
     */
    @Generated @NInt public static final long PropertyTypeNotFoundErr = 0xFFFFFFFFFFFFD94CL;
    /**
     * Unable to yield device to a secondary process
     */
    @Generated @NInt public static final long CannotYieldDevice = 0xFFFFFFFFFFFFD94BL;
    /**
     * Device does not support data type
     */
    @Generated @NInt public static final long DataTypeNotFoundErr = 0xFFFFFFFFFFFFD94AL;
    /**
     * Unable to allocate memory
     */
    @Generated @NInt public static final long DeviceMemoryAllocationErr = 0xFFFFFFFFFFFFD949L;
    /**
     * Generic internal error
     */
    @Generated @NInt public static final long DeviceInternalErr = 0xFFFFFFFFFFFFD948L;
    /**
     * Generic parameter invalid error
     */
    @Generated @NInt public static final long DeviceInvalidParamErr = 0xFFFFFFFFFFFFD947L;
    /**
     * Device already opened
     */
    @Generated @NInt public static final long DeviceAlreadyOpenErr = 0xFFFFFFFFFFFFD946L;
    /**
     * Device USB locationID is not valid
     */
    @Generated @NInt public static final long DeviceLocationIDNotFoundErr = 0xFFFFFFFFFFFFD945L;
    /**
     * Device FireWire GUID is not valid
     */
    @Generated @NInt public static final long DeviceGUIDNotFoundErr = 0xFFFFFFFFFFFFD944L;
    /**
     * Device IOService point is not valid
     */
    @Generated @NInt public static final long DeviceIOServicePathNotFoundErr = 0xFFFFFFFFFFFFD943L;
    /**
     * Device is not supported under ICA
     */
    @Generated @NInt public static final long DeviceUnsupportedErr = 0xFFFFFFFFFFFFD942L;
    /**
     * Generic framework internal error
     */
    @Generated @NInt public static final long FrameworkInternalErr = 0xFFFFFFFFFFFFD941L;
    /**
     * Generic ImageCaptureExtension internal error
     */
    @Generated @NInt public static final long ExtensionInternalErr = 0xFFFFFFFFFFFFD940L;
    /**
     * Session is invalid
     */
    @Generated @NInt public static final long InvalidSessionErr = 0xFFFFFFFFFFFFD93FL;
}