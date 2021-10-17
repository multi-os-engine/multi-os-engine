package apple.corenfc.protocol;

import apple.corenfc.NFCTagReaderSession;
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
 * [@protocol] NFCTagReaderSessionDelegate
 * <p>
 * Tag reader session delegate
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCTagReaderSessionDelegate")
public interface NFCTagReaderSessionDelegate {
    /**
     * tagReaderSession:didDetectTags:
     * <p>
     * Gets called when the reader detects NFC tag(s) in the polling sequence.
     *
     * @param session The session object used for tag detection.
     * @param tags    Array of @link NFCTag @link/ objects.
     */
    @Generated
    @IsOptional
    @Selector("tagReaderSession:didDetectTags:")
    default void tagReaderSessionDidDetectTags(NFCTagReaderSession session, NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * tagReaderSession:didInvalidateWithError:
     * <p>
     * Gets called when a session becomes invalid.  At this point the client is expected to discard
     * the returned session object.
     *
     * @param session The session object that is invalidated.
     * @param error   The error indicates the invalidation reason.
     */
    @Generated
    @Selector("tagReaderSession:didInvalidateWithError:")
    void tagReaderSessionDidInvalidateWithError(NFCTagReaderSession session, NSError error);

    /**
     * tagReaderSessionDidBecomeActive:
     * <p>
     * Gets called when the NFC reader session has become active. RF is enabled and reader is scanning for tags.
     * The @link readerSession:didDetectTags: @link/ will be called when a tag is detected.
     *
     * @param session The session object in the active state.
     */
    @Generated
    @IsOptional
    @Selector("tagReaderSessionDidBecomeActive:")
    default void tagReaderSessionDidBecomeActive(NFCTagReaderSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
