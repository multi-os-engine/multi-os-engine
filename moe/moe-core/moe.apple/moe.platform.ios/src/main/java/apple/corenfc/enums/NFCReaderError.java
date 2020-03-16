package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NFCReaderError {
    @Generated
    private NFCReaderError() {
    }

    @Generated @NInt public static final long ReaderErrorUnsupportedFeature = 0x0000000000000001L;
    @Generated @NInt public static final long ReaderErrorSecurityViolation = 0x0000000000000002L;
    @Generated @NInt public static final long ReaderErrorInvalidParameter = 0x0000000000000003L;
    @Generated @NInt public static final long ReaderErrorInvalidParameterLength = 0x0000000000000004L;
    @Generated @NInt public static final long ReaderErrorParameterOutOfBound = 0x0000000000000005L;
    @Generated @NInt public static final long ReaderTransceiveErrorTagConnectionLost = 0x0000000000000064L;
    @Generated @NInt public static final long ReaderTransceiveErrorRetryExceeded = 0x0000000000000065L;
    @Generated @NInt public static final long ReaderTransceiveErrorTagResponseError = 0x0000000000000066L;
    @Generated @NInt public static final long ReaderTransceiveErrorSessionInvalidated = 0x0000000000000067L;
    @Generated @NInt public static final long ReaderTransceiveErrorTagNotConnected = 0x0000000000000068L;
    @Generated @NInt public static final long ReaderSessionInvalidationErrorUserCanceled = 0x00000000000000C8L;
    @Generated @NInt public static final long ReaderSessionInvalidationErrorSessionTimeout = 0x00000000000000C9L;
    @Generated @NInt public static final long ReaderSessionInvalidationErrorSessionTerminatedUnexpectedly = 0x00000000000000CAL;
    @Generated @NInt public static final long ReaderSessionInvalidationErrorSystemIsBusy = 0x00000000000000CBL;
    @Generated @NInt public static final long ReaderSessionInvalidationErrorFirstNDEFTagRead = 0x00000000000000CCL;
    @Generated @NInt public static final long TagCommandConfigurationErrorInvalidParameters = 0x000000000000012CL;
    @Generated @NInt public static final long NdefReaderSessionErrorTagNotWritable = 0x0000000000000190L;
    @Generated @NInt public static final long NdefReaderSessionErrorTagUpdateFailure = 0x0000000000000191L;
    @Generated @NInt public static final long NdefReaderSessionErrorTagSizeTooSmall = 0x0000000000000192L;
    @Generated @NInt public static final long NdefReaderSessionErrorZeroLengthMessage = 0x0000000000000193L;
}