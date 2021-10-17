package apple.corenfc.protocol;

import apple.corenfc.NFCReaderSession;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] NFCReaderSession
 * <p>
 * General reader session callbacks
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCReaderSessionDelegate")
public interface NFCReaderSessionDelegate {
    /**
     * readerSession:didDetectTags:
     * <p>
     * Gets called when the reader detects NFC tag(s) in the polling sequence.
     *
     * @param session The session object used for tag detection.
     * @param tags    Array of @link NFCTag @link/ objects.
     */
    @Generated
    @IsOptional
    @Selector("readerSession:didDetectTags:")
    default void readerSessionDidDetectTags(NFCReaderSession session, NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * readerSession:didInvalidateWithError:
     * <p>
     * Gets called when a session becomes invalid.  At this point the client is expected to discard
     * the returned session object.
     *
     * @param session The session object that is invalidated.
     * @param error   The error indicates the invalidation reason.
     */
    @Generated
    @Selector("readerSession:didInvalidateWithError:")
    void readerSessionDidInvalidateWithError(NFCReaderSession session, NSError error);

    /**
     * readerSessionDidBecomeActive:
     * <p>
     * Gets called when the NFC reader session has become active. RF is enabled and reader is scanning for tags.
     * The @link readerSession:didDetectTags: @link/ will be called when a tag is detected.
     *
     * @param session The session object in the active state.
     */
    @Generated
    @Selector("readerSessionDidBecomeActive:")
    void readerSessionDidBecomeActive(NFCReaderSession session);
}
