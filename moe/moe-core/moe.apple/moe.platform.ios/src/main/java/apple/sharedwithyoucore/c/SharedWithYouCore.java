package apple.sharedwithyoucore.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("SharedWithYouCore")
@Runtime(CRuntime.class)
public final class SharedWithYouCore {
    static {
        NatJ.register();
    }

    @Generated
    private SharedWithYouCore() {
    }

    /**
     * ! Project version number for SharedWithYouCore.
     */
    @Generated
    @CVariable()
    public static native double SharedWithYouCoreVersionNumber();

    /**
     * ! Project version string for SharedWithYouCore.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr SharedWithYouCoreVersionString();

    /**
     * String identifier used to initialize a UTType to represent the type of the array of SWCollaborationOptionsGroups
     * when registering to and reading from the NSItemProvider
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String UTCollaborationOptionsTypeIdentifier();
}