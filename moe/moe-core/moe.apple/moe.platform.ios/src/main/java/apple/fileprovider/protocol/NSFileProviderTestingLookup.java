package apple.fileprovider.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * This operation causes the system to lookup an item.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderTestingLookup")
public interface NSFileProviderTestingLookup extends NSFileProviderTestingOperation {
    /**
     * Identifier of the affected item.
     */
    @Generated
    @Selector("itemIdentifier")
    String itemIdentifier();

    /**
     * Side of the event.
     */
    @Generated
    @Selector("side")
    @NUInt
    long side();
}