package apple.quicklookthumbnailing.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("QuickLookThumbnailing")
@Runtime(CRuntime.class)
public final class QuickLookThumbnailing {
    static {
        NatJ.register();
    }

    @Generated
    private QuickLookThumbnailing() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String QLThumbnailErrorDomain();
}