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

/**
 * @protocol NFCNDEFTag
 * 
 * @discussion Operations on a NDEF formatted tag.  Unless it is specified all block completion handlers are dispatched on the session work queue that is associated with the tag.
 */
@Generated
@Library("CoreNFC")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NFCNDEFTag")
public interface NFCNDEFTag extends NSSecureCoding, NSCopying {
    /**
     * @property available:
     * 
     * @return      <i>YES</i> if NDEF tag is available in the current reader session.  A tag remove from the RF field will become
     *              unavailable.  Tag in disconnected state will return NO.
     * 
     * @discussion  Check whether a detected NDEF tag is available.
     */
    @Generated
    @Selector("isAvailable")
    boolean isAvailable();

    /**
     * @method queryNDEFStatusWithCompletionHandler:
     * 
     * @param completionHandler Return the NFCNDEFStatus of the tag.  capacity indicates the maximum NDEF message size in bytes that can be store on the tag.
     *                          error returns a valid NSError object when query fails.
     * 
     * @discussion Query the NDEF support status of the tag.
     */
    @Generated
    @Selector("queryNDEFStatusWithCompletionHandler:")
    void queryNDEFStatusWithCompletionHandler(
            @ObjCBlock(name = "call_queryNDEFStatusWithCompletionHandler") Block_queryNDEFStatusWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryNDEFStatusWithCompletionHandler {
        @Generated
        void call_queryNDEFStatusWithCompletionHandler(@NUInt long status, @NUInt long capacity, NSError error);
    }

    /**
     * @method readNDEFWithCompletionHandler:
     * 
     * @param completionHandler Returns the NDEF message from read operation.  Successful read would return a valid NFCNDEFMessage object with NSError object set to nil;
     *                          read failure returns a nil NFCNDEFMessage and a valid NSError object.
     * 
     * @discussion Reads NDEF message from the tag.
     */
    @Generated
    @Selector("readNDEFWithCompletionHandler:")
    void readNDEFWithCompletionHandler(
            @ObjCBlock(name = "call_readNDEFWithCompletionHandler") Block_readNDEFWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readNDEFWithCompletionHandler {
        @Generated
        void call_readNDEFWithCompletionHandler(NFCNDEFMessage arg0, NSError arg1);
    }

    /**
     * @method writeLockWithCompletionHandler:
     * 
     * @param completionHandler Returns operation status. A nil NSError object indicates a successful lock operation.
     * 
     * @discussion Locks the NDEF tag to read-only state; tag can no longer be written afterward.  This is a permanent operation.  A successful lock operaiton via this method
     *             will change the NFCNDEFStatus value of the tag to @link NFCNDEFStatusReadOnly @link/.
     */
    @Generated
    @Selector("writeLockWithCompletionHandler:")
    void writeLockWithCompletionHandler(
            @ObjCBlock(name = "call_writeLockWithCompletionHandler") Block_writeLockWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeLockWithCompletionHandler {
        @Generated
        void call_writeLockWithCompletionHandler(NSError arg0);
    }

    /**
     * @method writeNDEF:completionHandler:
     * 
     * @param completionHandler  Returns operation status.  A nil NSError object indicates a successful write operation.
     * 
     * @discussion Writes a NDEF message to the tag.
     */
    @Generated
    @Selector("writeNDEF:completionHandler:")
    void writeNDEFCompletionHandler(NFCNDEFMessage ndefMessage,
            @ObjCBlock(name = "call_writeNDEFCompletionHandler") Block_writeNDEFCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeNDEFCompletionHandler {
        @Generated
        void call_writeNDEFCompletionHandler(NSError arg0);
    }
}