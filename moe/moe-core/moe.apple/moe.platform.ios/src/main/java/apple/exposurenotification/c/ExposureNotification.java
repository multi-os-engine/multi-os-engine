package apple.exposurenotification.c;

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
@Library("ExposureNotification")
@Runtime(CRuntime.class)
public final class ExposureNotification {
    static {
        NatJ.register();
    }

    @Generated
    private ExposureNotification() {
    }

    /**
     * NSError domain for Exposure Notification errors.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ENErrorDomain();

    /**
     * ===========================================================================================================================
     * <p>
     * The value used when days since onset of symptoms is unspecified.
     */
    @Generated @NInt public static final long ENDaysSinceOnsetOfSymptomsUnknown = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
}
