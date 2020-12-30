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
 * @protocol NFCReaderSession
 * 
 * @discussion General reader session callbacks
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCReaderSessionDelegate")
public interface NFCReaderSessionDelegate {
    /**
     * @method readerSession:didDetectTags:
     * 
     * @param session   The session object used for tag detection.
     * @param tags      Array of @link NFCTag @link/ objects.
     * 
     * @discussion      Gets called when the reader detects NFC tag(s) in the polling sequence.
     */
    @Generated
    @IsOptional
    @Selector("readerSession:didDetectTags:")
    default void readerSessionDidDetectTags(NFCReaderSession session, NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method readerSession:didInvalidateWithError:
     * 
     * @param session   The session object that is invalidated.
     * @param error     The error indicates the invalidation reason.
     * 
     * @discussion      Gets called when a session becomes invalid.  At this point the client is expected to discard
     *                  the returned session object.
     */
    @Generated
    @Selector("readerSession:didInvalidateWithError:")
    void readerSessionDidInvalidateWithError(NFCReaderSession session, NSError error);

    /**
     * @method readerSessionDidBecomeActive:
     * 
     * @param session   The session object in the active state.
     * 
     * @discussion      Gets called when the NFC reader session has become active. RF is enabled and reader is scanning for tags.
     *                  The @link readerSession:didDetectTags: @link/ will be called when a tag is detected.
     */
    @Generated
    @Selector("readerSessionDidBecomeActive:")
    void readerSessionDidBecomeActive(NFCReaderSession session);
}