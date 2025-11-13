package apple.corelocation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CLLocationCoordinate2D extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CLLocationCoordinate2D() {
        super(CLLocationCoordinate2D.class);
    }

    @Generated
    protected CLLocationCoordinate2D(Pointer peer) {
        super(peer);
    }

    @Generated
    public CLLocationCoordinate2D(double latitude, double longitude) {
        super(CLLocationCoordinate2D.class);
        setLatitude(latitude);
        setLongitude(longitude);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double latitude();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setLatitude(double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double longitude();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLongitude(double value);
}