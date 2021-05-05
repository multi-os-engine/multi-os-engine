package apple.fileproviderui.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("FileProviderUI")
@Runtime(CRuntime.class)
public final class FileProviderUI {
    static {
        NatJ.register();
    }

    @Generated
    private FileProviderUI() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String FPUIErrorDomain();
}