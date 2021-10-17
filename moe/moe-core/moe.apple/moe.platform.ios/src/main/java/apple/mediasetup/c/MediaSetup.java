package apple.mediasetup.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("MediaSetup")
@Runtime(CRuntime.class)
public final class MediaSetup {
    static {
        NatJ.register();
    }

    @Generated
    private MediaSetup() {
    }

    /**
     * ! Project version number for MediaSetup.
     */
    @Generated
    @CVariable()
    public static native double MediaSetupVersionNumber();

    /**
     * ! Project version string for MediaSetup.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr MediaSetupVersionString();
}
