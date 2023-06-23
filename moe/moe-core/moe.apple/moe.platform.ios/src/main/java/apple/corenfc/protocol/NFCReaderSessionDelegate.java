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
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] NFCReaderSession
 * 
 * General reader session callbacks
 * 
 * API-Since: 11.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCReaderSessionDelegate")
public interface NFCReaderSessionDelegate {
    /**
     * readerSession:didDetectTags:
     * 
     * Gets called when the reader detects NFC tag(s) in the polling sequence.
     * 
     * API-Since: 11.0
     * 
     * @param session The session object used for tag detection.
     * @param tags    Array of @link NFCTag @link/ objects.
     */
    @Generated
    @IsOptional
    @Selector("readerSession:didDetectTags:")
    default void readerSessionDidDetectTags(@NotNull NFCReaderSession session, @NotNull NSArray<?> tags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * readerSession:didInvalidateWithError:
     * 
     * Gets called when a session becomes invalid. At this point the client is expected to discard
     * the returned session object.
     * 
     * API-Since: 11.0
     * 
     * @param session The session object that is invalidated.
     * @param error   The error indicates the invalidation reason.
     */
    @Generated
    @Selector("readerSession:didInvalidateWithError:")
    void readerSessionDidInvalidateWithError(@NotNull NFCReaderSession session, @NotNull NSError error);

    /**
     * readerSessionDidBecomeActive:
     * 
     * Gets called when the NFC reader session has become active. RF is enabled and reader is scanning for tags.
     * The @link readerSession:didDetectTags: @link/ will be called when a tag is detected.
     * 
     * API-Since: 11.0
     * 
     * @param session The session object in the active state.
     */
    @Generated
    @Selector("readerSessionDidBecomeActive:")
    void readerSessionDidBecomeActive(@NotNull NFCReaderSession session);
}
