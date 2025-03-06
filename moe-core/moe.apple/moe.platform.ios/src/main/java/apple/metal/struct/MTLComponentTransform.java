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
public final class MTLComponentTransform extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTLComponentTransform() {
        super(MTLComponentTransform.class);
    }

    @Generated
    protected MTLComponentTransform(Pointer peer) {
        super(peer);
    }

    /**
     * The scale of the instance applied before rotation alongside shear and pivot
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MTLPackedFloat3 scale();

    /**
     * The scale of the instance applied before rotation alongside shear and pivot
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setScale(@ByValue MTLPackedFloat3 value);

    /**
     * The shear of the instance applied before rotation alongside scale and pivot
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native MTLPackedFloat3 shear();

    /**
     * The shear of the instance applied before rotation alongside scale and pivot
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setShear(@ByValue MTLPackedFloat3 value);

    /**
     * Translation applied before rotation alongside scale and shear. Allows
     * rotation to pivot around a point.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native MTLPackedFloat3 pivot();

    /**
     * Translation applied before rotation alongside scale and shear. Allows
     * rotation to pivot around a point.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPivot(@ByValue MTLPackedFloat3 value);

    /**
     * The rotation of the instance as a normalized quaternion. Applied after scale,
     * shear, and pivot and before translation
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native MTLPackedFloatQuaternion rotation();

    /**
     * The rotation of the instance as a normalized quaternion. Applied after scale,
     * shear, and pivot and before translation
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRotation(@ByValue MTLPackedFloatQuaternion value);

    /**
     * The translation of the instance. Applied after rotation. Typically contains
     * the composition of object translation and the inverse of the pivot translation.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native MTLPackedFloat3 translation();

    /**
     * The translation of the instance. Applied after rotation. Typically contains
     * the composition of object translation and the inverse of the pivot translation.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTranslation(@ByValue MTLPackedFloat3 value);
}