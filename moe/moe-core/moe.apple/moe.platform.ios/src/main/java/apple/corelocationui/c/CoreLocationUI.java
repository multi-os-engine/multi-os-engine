package apple.corelocationui.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("CoreLocationUI")
@Runtime(CRuntime.class)
public final class CoreLocationUI {
    static {
        NatJ.register();
    }

    @Generated
    private CoreLocationUI() {
    }

    /**
     * The project version number for CoreLocationUI.
     */
    @Generated
    @CVariable()
    public static native double CoreLocationUIVersionNumber();

    /**
     * The project version string for CoreLocationUI.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr CoreLocationUIVersionString();
}
