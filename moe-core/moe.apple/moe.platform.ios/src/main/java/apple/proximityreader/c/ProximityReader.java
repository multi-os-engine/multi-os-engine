package apple.proximityreader.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;

@Generated
@Library("ProximityReader")
@Runtime(CRuntime.class)
public final class ProximityReader {
    static {
        NatJ.register();
    }

    @Generated
    private ProximityReader() {
    }

    /**
     * ! Project version number for ProximityReader.
     */
    @Generated
    @CVariable()
    public static native double ProximityReaderVersionNumber();

    /**
     * ! Project version string for ProximityReader.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr ProximityReaderVersionString();
}