package apple.opaque;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.OpaquePtr;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.impl.OpaquePtrImpl;

@Generated
@Runtime(CRuntime.class)
public interface DNSServiceRef extends OpaquePtr {
    @Generated
    class Impl extends OpaquePtrImpl implements DNSServiceRef {
        @Generated
        protected Impl(Pointer peer) {
            super(peer);
        }
    }
}