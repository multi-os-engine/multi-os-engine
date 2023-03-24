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
import org.jetbrains.annotations.NotNull;

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
     * 
     * API-Since: 12.5
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ENErrorDomain();

    /**
     * ===========================================================================================================================
     * 
     * The value used when days since onset of symptoms is unspecified.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 14.2
     * Deprecated-Message: Server must provide keys with days_since_onset_of_symptoms set.
     */
    @Deprecated @Generated @NInt public static final long ENDaysSinceOnsetOfSymptomsUnknown = org.moe.natj.general.NatJ
            .is64Bit() ? 0x7FFFFFFFFFFFFFFFL : 0x000000007FFFFFFFL;
    @Generated public static final double EN_FEATURE_GENERAL = 1.0;
}
