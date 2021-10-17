package apple.soundanalysis.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("SoundAnalysis")
@Runtime(CRuntime.class)
public final class SoundAnalysis {
    static {
        NatJ.register();
    }

    @Generated
    private SoundAnalysis() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SNErrorDomain();

    /**
     * Denotes the first edition of the Apple-provided sound classifier.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SNClassifierIdentifierVersion1();
}