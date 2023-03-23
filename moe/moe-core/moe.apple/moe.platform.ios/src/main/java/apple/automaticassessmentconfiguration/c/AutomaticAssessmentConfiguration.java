package apple.automaticassessmentconfiguration.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AutomaticAssessmentConfiguration")
@Runtime(CRuntime.class)
public final class AutomaticAssessmentConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    private AutomaticAssessmentConfiguration() {
    }

    /**
     * API-Since: 13.4
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String AEAssessmentErrorDomain();
}
