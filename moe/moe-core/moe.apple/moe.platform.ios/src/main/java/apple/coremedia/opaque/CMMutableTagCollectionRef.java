package apple.coremedia.opaque;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.impl.OpaquePtrImpl;

@Generated
@Runtime(CRuntime.class)
public interface CMMutableTagCollectionRef extends CMTagCollectionRef {
    @Generated
    class Impl extends OpaquePtrImpl implements CMMutableTagCollectionRef {
        @Generated
        protected Impl(Pointer peer) {
            super(peer);
        }
    }
}