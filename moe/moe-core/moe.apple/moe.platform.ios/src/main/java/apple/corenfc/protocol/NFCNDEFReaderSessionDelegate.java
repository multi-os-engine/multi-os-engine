package apple.corenfc.protocol;

import apple.corenfc.NFCNDEFMessage;
import apple.corenfc.NFCNDEFReaderSession;
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
 * @protocol NFCNDEFReaderSessionDelegate
 * 
 * @discussion NDEF reader session callbacks.  Presence of the -readerSession:didDetectTags: optional method will change the session behaviour
 *             into a read-write session where @link NFCNDEFTag @link/ objects are returned.
 * 
 * @note       A read-write session does not trigger the -readerSession:didDetectNDEFs: method.
 * @note       A read-write session does not get invalidate automatically after a successful tag detection.  Invalidation occurs when
 *             the invalidation method is called explicitly or the 60 seconds session time limit is reached.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCNDEFReaderSessionDelegate")
public interface NFCNDEFReaderSessionDelegate {
    /**
     * @method readerSession:didDetectNDEFs:
     * 
     * @param session   The session object used for tag detection.
     * @param messages  Array of @link NFCNDEFMessage @link/ objects.
     * 
     * @discussion      Gets called when the reader detects NFC tag(s) with NDEF messages in the polling sequence.  Polling
     *                  is automatically restarted once the detected tag is removed from the reader's read range.  This method
     *                  is only get call if the optional -readerSession:didDetectTags: method is not
     *                  implemented.
     */
    @Generated
    @Selector("readerSession:didDetectNDEFs:")
    void readerSessionDidDetectNDEFs(NFCNDEFReaderSession session, NSArray<? extends NFCNDEFMessage> messages);

    /**
     * @method readerSession:didDetectTags:
     * 
     * @param session   The session object used for NDEF tag detection.
     * @param tags      Array of @link NFCNDEFTag @link/ objects.
     * 
     * @discussion      Gets called when the reader detects NDEF tag(s) in the RF field.  Presence of this method overrides -readerSession:didDetectNDEFs: and enables
     *                  read-write capability for the session.
     */
    @Generated
    @IsOptional
    @Selector("readerSession:didDetectTags:")
    default void readerSessionDidDetectTags(NFCNDEFReaderSession session, NSArray<?> tags) {
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
    void readerSessionDidInvalidateWithError(NFCNDEFReaderSession session, NSError error);

    /**
     * @method readerSessionDidBecomeActive:
     * 
     * @param session   The session object in the active state.
     * 
     * @discussion      Gets called when the NFC reader session has become active. RF is enabled and reader is scanning for tags.
     */
    @Generated
    @IsOptional
    @Selector("readerSessionDidBecomeActive:")
    default void readerSessionDidBecomeActive(NFCNDEFReaderSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}