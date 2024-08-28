package apple.corenfc.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("CoreNFC")
@Runtime(CRuntime.class)
public final class CoreNFC {
    static {
        NatJ.register();
    }

    @Generated
    private CoreNFC() {
    }

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NFCErrorDomain();

    /**
     * Key in NSError userInfo dictionary. The corresponding value is the NSUInteger error code from tag's response.
     * Refer to ISO15693 specification for the error code values.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NFCISO15693TagResponseErrorKey();

    /**
     * Key in NSError userInfo dictionary. Presence of this key indicates the received response packet length is
     * invalid.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NFCTagResponseUnexpectedLengthErrorKey();
}