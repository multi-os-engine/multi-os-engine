package apple.matter.c;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.map.ObjCStringMapper;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import org.moe.natj.objc.Class;

@Generated
@Library("Matter")
@Runtime(CRuntime.class)
public final class Matter {
    static {
        NatJ.register();
    }

    @Generated
    private Matter() {
    }

    /**
     * Arranges for log messages from the Matter stack to be delivered to a callback block.
     * 
     * @param logTypeThreshold only messages up to (and including) the specified log type will be delivered
     * @param callback         the block to call, or nil to disable the log callback.
     * 
     *                         The callback block may be called concurrently and/or from arbitrary threads.
     *                         It SHALL NOT call back directly or indirectly into any Matter APIs,
     *                         nor block the calling thread for a non-trivial amount of time.
     * 
     *                         API-Since: 16.4
     */
    @Generated
    @CFunction
    public static native void MTRSetLogCallback(@NInt long logTypeThreshold,
            @ObjCBlock(name = "call_MTRSetLogCallback") @Nullable Block_MTRSetLogCallback callback);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_MTRSetLogCallback {
        @Generated
        void call_MTRSetLogCallback(@NInt long type, @NotNull String moduleName, @NotNull String message);
    }

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRAttributePathKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRCommandPathKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTREventPathKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRDataKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRErrorKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRTypeKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRValueKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRContextTagKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRSignedIntegerValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRUnsignedIntegerValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRBooleanValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRUTF8StringValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTROctetStringValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRFloatValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRDoubleValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRNullValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRStructureValueType();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRArrayValueType();

    /**
     * API-Since: 16.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTREventNumberKey();

    /**
     * API-Since: 16.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTREventPriorityKey();

    /**
     * API-Since: 16.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTREventTimeTypeKey();

    /**
     * API-Since: 16.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTREventSystemUpTimeKey();

    /**
     * API-Since: 16.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTREventTimestampDateKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRErrorDomain();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRInteractionErrorDomain();

    /**
     * The expected lengths of each of the NSData fields in the MTRThreadOperationalDataset
     * 
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long MTRSizeThreadNetworkName();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRSizeThreadExtendedPANID
     */
    @Generated
    @Deprecated
    @CVariable()
    @NUInt
    public static native long MTRSizeThreadExtendedPanId();

    /**
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long MTRSizeThreadExtendedPANID();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long MTRSizeThreadMasterKey();

    /**
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long MTRSizeThreadPSKc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long MTRSizeThreadPANID();

    @Generated public static final double MTR_NO_AVAILABILITY = 0.0;
    @Generated public static final double MTR_ENABLE_PROVISIONAL = 0.0;

    /**
     * Resolve Matter cluster IDs into a descriptive string.
     * 
     * For unknown IDs, a string '<Unknown clusterID %d>' will be returned.
     * 
     * API-Since: 17.6
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTRClusterNameForID(int clusterID);

    /**
     * Resolve Matter attribute IDs into a descriptive string.
     * 
     * For unknown IDs, a string '<Unknown clusterID %d>' (if the cluster ID is not known)
     * or '<Unknown attributeID %d>' (if the cluster ID is known but the attribute ID is not known)
     * will be returned.
     * 
     * API-Since: 17.6
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTRAttributeNameForID(int clusterID, int attributeID);

    /**
     * Resolve Matter request (client to server) command IDs into a descriptive string.
     * 
     * For unknown IDs, a string '<Unknown clusterID %d>' (if the cluster ID is not known)
     * or '<Unknown commandID %d>' (if the cluster ID is known but the command ID is not known)
     * will be returned.
     * 
     * API-Since: 18.2
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTRRequestCommandNameForID(int clusterID, int commandID);

    /**
     * Resolve Matter response (server to client) command IDs into a descriptive string.
     * 
     * For unknown IDs, a string '<Unknown clusterID %d>' (if the cluster ID is not known)
     * or '<Unknown commandID %d>' (if the cluster ID is known but the command ID is not known)
     * will be returned.
     * 
     * API-Since: 18.2
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTRResponseCommandNameForID(int clusterID, int commandID);

    /**
     * Resolve Matter event IDs into a descriptive string.
     * 
     * For unknown IDs, a string '<Unknown clusterID %d>' (if the cluster ID is not known)
     * or '<Unknown eventID %d>' (if the cluster ID is known but the event ID is not known)
     * will be returned.
     * 
     * API-Since: 18.2
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MTREventNameForID(int clusterID, int eventID);

    /**
     * Set the Message Reliability Protocol parameters for all controllers,
     * including already-running ones. This allows control over retransmit delays
     * to account for high-latency networks.
     * 
     * Since MRP parameters are communicated to peers during session setup, existing
     * sessions will not be affected when this function is called, but all sessions
     * established after the call will be.
     * 
     * Setting all arguments to nil will reset to the MRP parameters to their
     * default values.
     * 
     * Setting some arguments to non-nil will change just those values, keeping
     * current values for any arguments that are nil (not resetting them to
     * defaults).
     * 
     * Non-nil arguments are specified as an integer number of milliseconds.
     * 
     * @param idleRetransmitMs            the minimal interval between retransmits for someone
     *                                    sending messages to us, when they think we are
     *                                    "idle" and might have our radio only turned on
     *                                    intermittently.
     * @param activeRetransmitMs          the minimal interval between retransmits for
     *                                    someone sending messages to us, when they think we
     *                                    are "active" and have the radio turned on
     *                                    consistently.
     * @param activeThresholdMs           the amount of time we will stay in "active" mode after
     *                                    network activity.
     * @param additionalRetransmitDelayMs additional delay between retransmits for
     *                                    messages we send, on top of whatever delay
     *                                    the other side requests via its MRP
     *                                    parameters.
     * 
     *                                    API-Since: 17.6
     */
    @Generated
    @CFunction
    public static native void MTRSetMessageReliabilityParameters(@Nullable NSNumber idleRetransmitMs,
            @Nullable NSNumber activeRetransmitMs, @Nullable NSNumber activeThresholdMs,
            @Nullable NSNumber additionalRetransmitDelayMs);

    /**
     * API-Since: 17.6
     */
    @Generated
    @CFunction
    @NotNull
    public static native NSSet<? extends Class> MTRDeviceControllerStorageClasses();

    /**
     * API-Since: 17.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTREventIsHistoricalKey();

    /**
     * API-Since: 17.6
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRPreviousDataKey();

    /**
     * API-Since: 17.6
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRDataVersionKey();

    /**
     * API-Since: 18.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRDeviceControllerRegistrationNodeIDsKey();

    /**
     * API-Since: 18.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRDeviceControllerRegistrationNodeIDKey();

    /**
     * API-Since: 18.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRDeviceControllerRegistrationControllerContextKey();

    @Generated public static final double MTR_ENABLE_UNSTABLE_API = 0.0;
}