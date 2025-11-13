package apple.coregraphics.struct;

import apple.corefoundation.opaque.CFDictionaryRef;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CGContentToneMappingInfo extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGContentToneMappingInfo() {
        super(CGContentToneMappingInfo.class);
    }

    @Generated
    protected CGContentToneMappingInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public CGContentToneMappingInfo(int method, @Nullable CFDictionaryRef options) {
        super(CGContentToneMappingInfo.class);
        setMethod(method);
        setOptions(options);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int method();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMethod(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @Nullable
    public native CFDictionaryRef options();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setOptions(@Nullable CFDictionaryRef value);
}