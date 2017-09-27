package apple.fileprovider.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("FileProvider")
@Runtime(CRuntime.class)
public final class FileProvider {
    static {
        NatJ.register();
    }

    @Generated
    private FileProvider() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderRootContainerItemIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderWorkingSetContainerItemIdentifier();

    @Generated
    @CVariable()
    public static native long NSFileProviderFavoriteRankUnranked();
}