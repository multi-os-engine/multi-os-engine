package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLVertexAmplificationViewMapping extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLVertexAmplificationViewMapping() {
        super(MTLVertexAmplificationViewMapping.class);
    }

    @Generated
    protected MTLVertexAmplificationViewMapping(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLVertexAmplificationViewMapping(int viewportArrayIndexOffset, int renderTargetArrayIndexOffset) {
        super(MTLVertexAmplificationViewMapping.class);
        setViewportArrayIndexOffset(viewportArrayIndexOffset);
        setRenderTargetArrayIndexOffset(renderTargetArrayIndexOffset);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int viewportArrayIndexOffset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setViewportArrayIndexOffset(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int renderTargetArrayIndexOffset();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRenderTargetArrayIndexOffset(int value);
}