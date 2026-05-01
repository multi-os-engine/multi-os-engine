package objc.binding;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

/**
 * Used by LazyBindingResolutionTest to verify that NatJ resolves an unloaded
 * binding via {@code unloadedObjCBindings} on demand. This class must NOT be
 * referenced from any other test class — loading it eagerly defeats the
 * lazy-resolution path under test.
 */
@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class LazyChild extends LazyParent {
    static {
        NatJ.register();
    }

    @Generated
    protected LazyChild(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native LazyChild alloc();

    @Generated
    @Selector("init")
    public native LazyChild init();
}
