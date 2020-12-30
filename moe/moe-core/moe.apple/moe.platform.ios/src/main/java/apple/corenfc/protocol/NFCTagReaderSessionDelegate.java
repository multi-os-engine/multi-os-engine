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
 * @protocol NFCTagReaderSessionDelegate
 * 
 * @discussion Tag reader session delegate
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCTagReaderSessionDelegate")
public interface NFCTagReaderSessionDelegate {
    /**
     * @method tagReaderSession:didDetectTags:
     * 
     * @param session   The session object used for tag detection.
     * @param tags      Array of @link NFCTag @link/ objects.
     * 
     * @discussion      Gets called when the reader detects NFC tag(s) in the polling sequence.
     */
    @Generated
    @IsOptional
    @Selector("tagReaderSession:didDetectTags:")
    default void tagReaderSessionDidDetectTags(NFCTagReaderSession session, NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @method tagReaderSession:didInvalidateWithError:
     * 
     * @param session   The session object that is invalidated.
     * @param error     The error indicates the invalidation reason.
     * 
     * @discussion      Gets called when a session becomes invalid.  At this point the client is expected to discard
     *                  the returned session object.
     */
    @Generated
    @Selector("tagReaderSession:didInvalidateWithError:")
    void tagReaderSessionDidInvalidateWithError(NFCTagReaderSession session, NSError error);

    /**
     * @method tagReaderSessionDidBecomeActive:
     * 
     * @param session   The session object in the active state.
     * 
     * @discussion      Gets called when the NFC reader session has become active. RF is enabled and reader is scanning for tags.
     *                  The @link readerSession:didDetectTags: @link/ will be called when a tag is detected.
     */
    @Generated
    @IsOptional
    @Selector("tagReaderSessionDidBecomeActive:")
    default void tagReaderSessionDidBecomeActive(NFCTagReaderSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}