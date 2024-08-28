package apple.apptrackingtransparency.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("AppTrackingTransparency")
@Runtime(CRuntime.class)
public final class AppTrackingTransparency {
    static {
        NatJ.register();
    }

    @Generated
    private AppTrackingTransparency() {
    }

    @Generated
    @CVariable()
    public static native double AppTrackingTransparencyVersionNumber();

    @Generated
    @CVariable()
    public static native ConstBytePtr AppTrackingTransparencyVersionString();
}
