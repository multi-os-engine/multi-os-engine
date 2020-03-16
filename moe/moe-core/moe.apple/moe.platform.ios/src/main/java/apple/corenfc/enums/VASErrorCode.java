package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class VASErrorCode {
    @Generated
    private VASErrorCode() {
    }

    @Generated @NInt public static final long Success = 0x0000000000009000L;
    @Generated @NInt public static final long DataNotFound = 0x0000000000006A83L;
    @Generated @NInt public static final long DataNotActivated = 0x0000000000006287L;
    @Generated @NInt public static final long WrongParameters = 0x0000000000006B00L;
    @Generated @NInt public static final long WrongLCField = 0x0000000000006700L;
    @Generated @NInt public static final long UserIntervention = 0x0000000000006984L;
    @Generated @NInt public static final long IncorrectData = 0x0000000000006A80L;
    @Generated @NInt public static final long UnsupportedApplicationVersion = 0x0000000000006340L;
}