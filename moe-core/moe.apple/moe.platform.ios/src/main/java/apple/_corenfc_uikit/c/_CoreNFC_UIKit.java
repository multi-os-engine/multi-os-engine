package apple._corenfc_uikit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("_CoreNFC_UIKit")
@Runtime(CRuntime.class)
public final class _CoreNFC_UIKit {
    static {
        NatJ.register();
    }

    @Generated
    private _CoreNFC_UIKit() {
    }

    /**
     * ! Project version number for _CoreNFC_UIKit.
     */
    @Generated
    @CVariable()
    public static native double _CoreNFC_UIKitVersionNumber();

    /**
     * ! Project version string for _CoreNFC_UIKit.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr _CoreNFC_UIKitVersionString();
}