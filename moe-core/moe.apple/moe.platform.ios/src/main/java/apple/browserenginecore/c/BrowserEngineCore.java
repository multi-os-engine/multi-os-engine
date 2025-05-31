package apple.browserenginecore.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import apple.struct.kevent;
import apple.struct.kevent64_s;
import org.moe.natj.general.ann.UncertainArgument;

@Generated
@Library("BrowserEngineCore")
@Runtime(CRuntime.class)
public final class BrowserEngineCore {
    static {
        NatJ.register();
    }

    @Generated
    private BrowserEngineCore() {
    }

    /**
     * We export this symbol, but this function should never be called directly.
     * Call be_memory_inline_jit_restrict_rwx_to_rw_with_witness directly.
     * 
     * API-Since: 17.4
     */
    @Generated
    @CFunction
    public static native void be_memory_inline_jit_restrict_rwx_to_rw_with_witness_impl();

    /**
     * We export this symbol, but this function should never be called directly.
     * Call be_memory_inline_jit_restrict_rwx_to_rx_with_witness directly.
     * 
     * API-Since: 17.4
     */
    @Generated
    @CFunction
    public static native void be_memory_inline_jit_restrict_rwx_to_rx_with_witness_impl();

    /**
     * Returns true iff the inlinable version of the jit_write_protect API
     * is available.
     * 
     * API-Since: 17.4
     */
    @Generated
    @CFunction
    public static native int be_memory_inline_jit_restrict_with_witness_supported();

    /**
     * These functions that can toggle JIT R^X permissions, while enforcing
     * control flow integrity using PAC. This function is intended to be used
     * only in performance-critical sections of code. Please consult the documentation
     * extensively before relying on this API.
     * 
     * This function should always be inlined. It will sign the return lr pointer
     * as a witness using PAC, and then call into the implementation.
     * 
     * This implementation is not permitted to be inlined into app binaries
     * because the instruction sequence required may change in the future.
     * 
     * Instead, we use a custom calling convention. This serves two purposes:
     * 1) Performance. The effects of this call can be precisely modeled, so
     * the performance is as close as possible to the case where we can
     * inline this body directly.
     * 2) Security. This calling convention greatly reduces the chances of spilling
     * an important value to the stack. See below.
     * 
     * In support of this function's security goals, users of this function must
     * confirm the following:
     * 
     * 1) You must not emit general PAC signing gadgets.
     * 2) The critical section defined by calls to these two functions must not
     * loop on any induction variable that is spilled to the stack, or otherwise
     * spill any important values there. An attacker can control these values.
     * If any values must be spilled or loaded from the heap or stack, they should be signed
     * outside the critical section, and authenticated inside.
     * 3) Do not create a gadget that is overly general. For example, wrapping this
     * function inside a body like this is very bad:
     * 
     * NEVER_INLINE void myFunction() {
     * if (variableFromStackOrHeap)
     * be_memory_inline_jit_restrict_rwx_to_rx_with_witness();
     * else
     * be_memory_inline_jit_restrict_rwx_to_rw_with_witness();
     * }
     * 
     * Each use of this function should be maximally inlined to reduce the power
     * that attackers gain by manipulating calls to it.
     * 
     * There is an additional clang attribute that can help you detect these spills. Please
     * look at the WebKit source code for an example.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Inline
    @CFunction
    public static native void be_memory_inline_jit_restrict_rwx_to_rw_with_witness();

    /**
     * See @be_memory_inline_jit_restrict_rwx_to_rw_with_witness
     * 
     * API-Since: 17.4
     */
    @Generated
    @Inline
    @CFunction
    public static native void be_memory_inline_jit_restrict_rwx_to_rx_with_witness();

    /**
     * API-Since: 18.4
     */
    @Generated
    @CFunction
    public static native int be_kevent(int kq,
            @UncertainArgument("Options: reference, array Fallback: reference") kevent changelist, int nchanges,
            @UncertainArgument("Options: reference, array Fallback: reference") kevent eventlist, int nevents,
            int be_flags);

    /**
     * API-Since: 18.4
     */
    @Generated
    @CFunction
    public static native int be_kevent64(int kq,
            @UncertainArgument("Options: reference, array Fallback: reference") kevent64_s changelist, int nchanges,
            @UncertainArgument("Options: reference, array Fallback: reference") kevent64_s eventlist, int nevents,
            int flags);

    @Generated public static final double BE_KEVENT_NO_FLAGS = 0.0;
    @Generated public static final double BE_KEVENT_RETURN_IMMEDIATELY = 1.0;
}