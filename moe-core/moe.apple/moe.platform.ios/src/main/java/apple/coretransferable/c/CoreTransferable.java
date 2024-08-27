package apple.coretransferable.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Generated
@Library("CoreTransferable")
@Runtime(CRuntime.class)
public final class CoreTransferable {
    static {
        NatJ.register();
    }

    @Generated
    private CoreTransferable() {
    }

    /**
     * ! Project version number for CoreTransferable.
     */
    @Generated
    @CVariable()
    public static native double CoreTransferableVersionNumber();
}