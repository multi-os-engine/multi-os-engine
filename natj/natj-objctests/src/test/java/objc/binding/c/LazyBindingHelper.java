package objc.binding.c;

import objc.binding.LazyParent;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;

@Generated
@Runtime(CRuntime.class)
@Library("TestClassesObjC")
public final class LazyBindingHelper {
    static {
        NatJ.register();
    }

    private LazyBindingHelper() {
    }

    @Generated
    @CFunction
    public static native LazyParent createLazyChildAsParent();
}
