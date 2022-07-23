package apple.uikit.protocol;

import apple.foundation.struct.NSRange;
import apple.uikit.NSTextStorage;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * NSTextStorageObserving defines the protocol for NSTextStorage controller objects observing changes in the text
 * backing-store.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSTextStorageObserving")
public interface NSTextStorageObserving {
    /**
     * Transactional editing support
     */
    @Generated
    @Selector("performEditingTransactionForTextStorage:usingBlock:")
    void performEditingTransactionForTextStorageUsingBlock(NSTextStorage textStorage,
            @ObjCBlock(name = "call_performEditingTransactionForTextStorageUsingBlock") Block_performEditingTransactionForTextStorageUsingBlock transaction);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performEditingTransactionForTextStorageUsingBlock {
        @Generated
        void call_performEditingTransactionForTextStorageUsingBlock();
    }

    /**
     * The newCharRange is the range in the final string which was explicitly edited. The invalidatedRange includes
     * portions that changed as a result of attribute fixing. invalidatedRange is either equal to newCharRange or
     * larger. Controllers should not change the contents of the text storage during the execution of this message.
     */
    @Generated
    @Selector("processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    void processEditingForTextStorageEditedRangeChangeInLengthInvalidatedRange(NSTextStorage textStorage,
            @NUInt long editMask, @ByValue NSRange newCharRange, @NInt long delta,
            @ByValue NSRange invalidatedCharRange);

    /**
     * The document object
     */
    @Generated
    @Selector("setTextStorage:")
    void setTextStorage(NSTextStorage value);

    /**
     * The document object
     */
    @Generated
    @Selector("textStorage")
    NSTextStorage textStorage();
}
