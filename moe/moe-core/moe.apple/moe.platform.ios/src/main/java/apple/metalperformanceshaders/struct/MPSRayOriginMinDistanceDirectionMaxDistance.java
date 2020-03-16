package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSRayOriginMinDistanceDirectionMaxDistance extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSRayOriginMinDistanceDirectionMaxDistance() {
        super(MPSRayOriginMinDistanceDirectionMaxDistance.class);
    }

    @Generated
    protected MPSRayOriginMinDistanceDirectionMaxDistance(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSRayOriginMinDistanceDirectionMaxDistance(@ByValue MPSPackedFloat3 origin, float minDistance,
            @ByValue MPSPackedFloat3 direction, float maxDistance) {
        super(MPSRayOriginMinDistanceDirectionMaxDistance.class);
        setOrigin(origin);
        setMinDistance(minDistance);
        setDirection(direction);
        setMaxDistance(maxDistance);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MPSPackedFloat3 origin();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOrigin(@ByValue MPSPackedFloat3 value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float minDistance();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMinDistance(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native MPSPackedFloat3 direction();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDirection(@ByValue MPSPackedFloat3 value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native float maxDistance();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMaxDistance(float value);
}