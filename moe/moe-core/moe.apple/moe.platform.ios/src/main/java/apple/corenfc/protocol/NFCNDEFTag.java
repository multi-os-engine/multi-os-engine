package apple.corenfc.protocol;

import apple.corenfc.NFCNDEFMessage;
import apple.foundation.NSError;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] NFCNDEFTag
 * 
 * Operations on a NDEF formatted tag. Unless it is specified all block completion handlers are dispatched on the
 * session work queue that is associated with the tag.
 * 
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCNDEFTag")
public interface NFCNDEFTag extends NSSecureCoding, NSCopying {
    /**
     * [@property] available:
     * 
     * Check whether a detected NDEF tag is available.
     * 
     * API-Since: 13.0
     * 
     * @return <i>YES</i> if NDEF tag is available in the current reader session. A tag remove from the RF field will
     *         become
     *         unavailable. Tag in disconnected state will return NO.
     */
    @Generated
    @Selector("isAvailable")
    boolean isAvailable();

    /**
     * queryNDEFStatusWithCompletionHandler:
     * 
     * Query the NDEF support status of the tag.
     * 
     * API-Since: 13.0
     * 
     * @param completionHandler Return the NFCNDEFStatus of the tag. capacity indicates the maximum NDEF message size in
     *                          bytes that can be store on the tag.
     *                          error returns a valid NSError object when query fails.
     */
    @Generated
    @Selector("queryNDEFStatusWithCompletionHandler:")
    void queryNDEFStatusWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_queryNDEFStatusWithCompletionHandler") Block_queryNDEFStatusWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryNDEFStatusWithCompletionHandler {
        @Generated
        void call_queryNDEFStatusWithCompletionHandler(@NUInt long status, @NUInt long capacity,
                @Nullable NSError error);
    }

    /**
     * readNDEFWithCompletionHandler:
     * 
     * Reads NDEF message from the tag.
     * 
     * API-Since: 13.0
     * 
     * @param completionHandler Returns the NDEF message from read operation. Successful read would return a valid
     *                          NFCNDEFMessage object with NSError object set to nil;
     *                          read failure returns a nil NFCNDEFMessage and a valid NSError object.
     */
    @Generated
    @Selector("readNDEFWithCompletionHandler:")
    void readNDEFWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_readNDEFWithCompletionHandler") Block_readNDEFWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readNDEFWithCompletionHandler {
        @Generated
        void call_readNDEFWithCompletionHandler(@Nullable NFCNDEFMessage arg0, @Nullable NSError arg1);
    }

    /**
     * writeLockWithCompletionHandler:
     * 
     * Locks the NDEF tag to read-only state; tag can no longer be written afterward. This is a permanent operation. A
     * successful lock operaiton via this method
     * will change the NFCNDEFStatus value of the tag to @link NFCNDEFStatusReadOnly @link/.
     * 
     * API-Since: 13.0
     * 
     * @param completionHandler Returns operation status. A nil NSError object indicates a successful lock operation.
     */
    @Generated
    @Selector("writeLockWithCompletionHandler:")
    void writeLockWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_writeLockWithCompletionHandler") Block_writeLockWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeLockWithCompletionHandler {
        @Generated
        void call_writeLockWithCompletionHandler(@Nullable NSError arg0);
    }

    /**
     * writeNDEF:completionHandler:
     * 
     * Writes a NDEF message to the tag.
     * 
     * API-Since: 13.0
     * 
     * @param completionHandler Returns operation status. A nil NSError object indicates a successful write operation.
     */
    @Generated
    @Selector("writeNDEF:completionHandler:")
    void writeNDEFCompletionHandler(@NotNull NFCNDEFMessage ndefMessage,
            @NotNull @ObjCBlock(name = "call_writeNDEFCompletionHandler") Block_writeNDEFCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeNDEFCompletionHandler {
        @Generated
        void call_writeNDEFCompletionHandler(@Nullable NSError arg0);
    }
}
