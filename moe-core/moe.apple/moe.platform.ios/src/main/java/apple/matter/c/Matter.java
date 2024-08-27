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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRAttributePathKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRCommandPathKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTREventPathKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRDataKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRTypeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRValueKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRContextTagKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRSignedIntegerValueType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRUnsignedIntegerValueType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRBooleanValueType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRUTF8StringValueType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTROctetStringValueType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRFloatValueType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRDoubleValueType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRNullValueType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRStructureValueType();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String MTRInteractionErrorDomain();

    /**
     * The expected lengths of each of the NSData fields in the MTRThreadOperationalDataset
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

    @Generated
    @CVariable()
    @NUInt
    public static native long MTRSizeThreadMasterKey();

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
    @Generated public static final double MTR_PER_CONTROLLER_STORAGE_ENABLED = 0.0;
}