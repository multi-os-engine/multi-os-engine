package apple.corenfc.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NFCErrorDomain();

    /**
     * Key in NSError userInfo dictionary.  The corresponding value is the NSUInteger error code from tag's response.
     * Refer to ISO15693 specification for the error code values.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NFCISO15693TagResponseErrorKey();

    /**
     * Key in NSError userInfo dictionary.  Presence of this key indicates the received response packet length is invalid.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NFCTagResponseUnexpectedLengthErrorKey();
}