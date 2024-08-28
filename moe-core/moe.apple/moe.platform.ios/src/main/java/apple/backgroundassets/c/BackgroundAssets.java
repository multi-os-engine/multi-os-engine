package apple.backgroundassets.c;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("BackgroundAssets")
@Runtime(CRuntime.class)
public final class BackgroundAssets {
    static {
        NatJ.register();
    }

    @Generated
    private BackgroundAssets() {
    }

    /**
     * A value that represents the lowest priority for a download.
     * 
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @NInt
    public static native long BADownloaderPriorityMin();

    /**
     * A value that represents average priority for a download.
     * 
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @NInt
    public static native long BADownloaderPriorityDefault();

    /**
     * A value that represents the highest priority for a download.
     * 
     * API-Since: 16.1
     */
    @Generated
    @CVariable()
    @NInt
    public static native long BADownloaderPriorityMax();

    /**
     * The error domain used for Background Assets errors.
     * 
     * API-Since: 17.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    @NotNull
    public static native String BAErrorDomain();
}