package apple.colorsync.opaque;

import apple.coregraphics.opaque.ColorSyncProfileRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.impl.OpaquePtrImpl;

@Generated
@Runtime(CRuntime.class)
public interface ColorSyncMutableProfileRef extends ColorSyncProfileRef {
    @Generated
    class Impl extends OpaquePtrImpl implements ColorSyncMutableProfileRef {
        @Generated
        protected Impl(Pointer peer) {
            super(peer);
        }
    }
}