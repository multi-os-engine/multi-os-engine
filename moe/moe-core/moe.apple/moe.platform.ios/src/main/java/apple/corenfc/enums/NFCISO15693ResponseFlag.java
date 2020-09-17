package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class NFCISO15693ResponseFlag {
    @Generated
    private NFCISO15693ResponseFlag() {
    }

    @Generated public static final byte Error = 1;
    @Generated public static final byte ResponseBufferValid = 2;
    @Generated public static final byte FinalResponse = 4;
    @Generated public static final byte ProtocolExtension = 8;
    @Generated public static final byte BlockSecurityStatusBit5 = 16;
    @Generated public static final byte BlockSecurityStatusBit6 = 32;
    @Generated public static final byte WaitTimeExtension = 64;
}