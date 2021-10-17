package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] NFCReaderError
 * <p>
 * Possible errors returned by CoreNFC framework reader session.
 * [@constant]    NFCReaderErrorUnsupportedFeature                                Core NFC is not supported on the current platform.
 * [@constant]    NFCReaderErrorSecurityViolation                                 Missing required entitlement and/or privacy settings from the client app.
 * [@constant]    NFCReaderErrorInvalidParameter                                  Input parameter is invalid.
 * [@constant]    NFCReaderErrorInvalidParameterLength                            Length of input parameter is invalid, i.e. size of data container.
 * [@constant]    NFCReaderErrorParameterOutOfBound                               Parameter value is outside of the acceptable boundary / range.
 * [@constant]    NFCReaderErrorRadioDisabled                                     NFC Radio is disabled.
 * [@constant]    NFCReaderTransceiveErrorTagConnectionLost                       Connection to the tag is lost.
 * [@constant]    NFCReaderTransceiveErrorRetryExceeded                           Maximum data transmission retry has reached.
 * [@constant]    NFCReaderTransceiveErrorTagResponseError                        Tag response is invalid or tag does not provide a response.  Additional error information may be contain in the underlying user info dictionary.
 * [@constant]    NFCReaderTransceiveErrorSessionInvalidated                      Session has been previously invalidated.
 * [@constant]    NFCReaderTransceiveErrorPacketTooLong                           Packet length has exceeded the limit.
 * [@constant]    NFCReaderTransceiveErrorTagNotConnected                         Tag is not in the connected state.
 * [@constant]    NFCReaderSessionInvalidationErrorUserCanceled                   Session is invalidated by the user.
 * [@constant]    NFCReaderSessionInvalidationErrorSessionTimeout                 Session is timed out.
 * [@constant]    NFCReaderSessionInvalidationErrorSessionTerminatedUnexpectedly  Session is terminated unexpectly.
 * [@constant]    NFCReaderSessionInvalidationErrorSystemIsBusy                   Core NFC is temporary unavailable due to system resource constraints.
 * [@constant]    NFCReaderSessionInvalidationErrorFirstNDEFTagRead               Session is terminated after the 1st NDEF tag is read.
 * [@constant]    NFCTagCommandConfigurationErrorInvalidParameters
 * [@constant]    NFCNdefReaderSessionErrorTagNotWritable                         NDEF tag is not writable.
 * [@constant]    NFCNdefReaderSessionErrorTagUpdateFailure                       NDEF tag write fails.
 * [@constant]    NFCNdefReaderSessionErrorTagSizeTooSmall                        NDEF tag memory size is too small to store the desired data.
 * [@constant]    NFCNdefReaderSessionErrorZeroLengthMessage                      NDEF tag does not contain any NDEF message.
 */
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
    @Generated @NInt public static final long ReaderErrorRadioDisabled = 0x0000000000000006L;
    @Generated @NInt public static final long ReaderTransceiveErrorPacketTooLong = 0x0000000000000069L;
}
