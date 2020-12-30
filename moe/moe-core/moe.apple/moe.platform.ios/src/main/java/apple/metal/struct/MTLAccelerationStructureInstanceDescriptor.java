package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLAccelerationStructureInstanceDescriptor extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLAccelerationStructureInstanceDescriptor() {
        super(MTLAccelerationStructureInstanceDescriptor.class);
    }

    @Generated
    protected MTLAccelerationStructureInstanceDescriptor(Pointer peer) {
        super(peer);
    }

    /**
     * @brief Transformation matrix describing how to transform the bottom-level acceleration structure.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MTLPackedFloat4x3 transformationMatrix();

    /**
     * @brief Transformation matrix describing how to transform the bottom-level acceleration structure.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTransformationMatrix(@ByValue MTLPackedFloat4x3 value);

    /**
     * @brief Instance options
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int options();

    /**
     * @brief Instance options
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setOptions(int value);

    /**
     * @brief Instance mask used to ignore geometry during ray tracing
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int mask();

    /**
     * @brief Instance mask used to ignore geometry during ray tracing
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMask(int value);

    /**
     * @brief Used to index into intersection function tables
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int intersectionFunctionTableOffset();

    /**
     * @brief Used to index into intersection function tables
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIntersectionFunctionTableOffset(int value);

    /**
     * @brief Acceleration structure index to use for this instance
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int accelerationStructureIndex();

    /**
     * @brief Acceleration structure index to use for this instance
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAccelerationStructureIndex(int value);
}