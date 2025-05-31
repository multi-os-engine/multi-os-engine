package apple.systemextensions.c;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("SystemExtensions")
@Runtime(CRuntime.class)
public final class SystemExtensions {
    static {
        NatJ.register();
    }

    @Generated
    private SystemExtensions() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String OSSystemExtensionErrorDomain();

    /**
     * A property of a Driver Extension bundle containing a message that tells
     * the user why the app is requesting to install it.
     * 
     * The 'OSBundleUsageDescription' key is required in your Driver
     * Extension if your app uses APIs that install them.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String OSBundleUsageDescriptionKey();

    /**
     * A property of a System Extension bundle containing a message that tells
     * the user why the app is requesting to install it.
     * 
     * The 'NSSystemExtensionUsageDescription' key is required in your
     * System Extension if your app uses APIs that install them.
     * 
     * API-Since: 18.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String NSSystemExtensionUsageDescriptionKey();
}