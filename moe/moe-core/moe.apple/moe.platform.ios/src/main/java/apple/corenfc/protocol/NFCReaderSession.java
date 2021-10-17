package apple.corenfc.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] NFCReaderSession
 * <p>
 * General reader session functions
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCReaderSession")
public interface NFCReaderSession {
    /**
     * [@property] alertMessage
     * <p>
     * Descriptive text message that is displayed on the alert action sheet once tag scanning has started.  The string can be update
     * dynamically in any thread context as long as the session is valid.  This should be set prior to calling @link beginSession @link/ to display
     * the correct message.  Use this string to provide additional context about the NFC reader mode operation.
     */
    @Generated
    @Selector("alertMessage")
    String alertMessage();

    /**
     * beginSession:
     * <p>
     * Starts the session.  The @link [NFCReaderSessionDelegate readerSessionDidBecomeActive:] @link/ will be called when the reader session
     * is activated successfully.  @link [NFCReaderSessionDelegate readerSession:didDetectTags:] @link/ will return tag objects that are
     * conformed to the @link NFCTag @link/ protocol.  @link [NFCReaderSessionDelegate readerSession:didInvalidateWithError:] will return
     * errors related to the session start.
     */
    @Generated
    @Selector("beginSession")
    void beginSession();

    /**
     * invalidateSession
     * <p>
     * Closes the reader session.  The session cannot be re-used.
     */
    @Generated
    @Selector("invalidateSession")
    void invalidateSession();

    /**
     * invalidateSessionWithErrorMessage:
     * <p>
     * Closes the reader session.  The session cannot be re-used.  The specified error message and an error symbol will be displayed momentarily
     * on the action sheet before it is automatically dismissed.
     */
    @Generated
    @Selector("invalidateSessionWithErrorMessage:")
    void invalidateSessionWithErrorMessage(String errorMessage);

    /**
     * [@property] ready
     * <p>
     * The RF discovery polling begins immediately when a reader session is activated successfully.
     * The @link readerSession:didDetectTags: @link/ will be called when a tag is detected.
     *
     * @return <i>YES</i> if the reader session is started and ready to use.
     */
    @Generated
    @Selector("isReady")
    boolean isReady();

    /**
     * [@property] alertMessage
     * <p>
     * Descriptive text message that is displayed on the alert action sheet once tag scanning has started.  The string can be update
     * dynamically in any thread context as long as the session is valid.  This should be set prior to calling @link beginSession @link/ to display
     * the correct message.  Use this string to provide additional context about the NFC reader mode operation.
     */
    @Generated
    @Selector("setAlertMessage:")
    void setAlertMessage(String value);
}
