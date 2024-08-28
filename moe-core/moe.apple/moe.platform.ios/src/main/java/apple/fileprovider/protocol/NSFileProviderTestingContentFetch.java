package apple.fileprovider.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * This operation causes the system to fetch the content of an item.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderTestingContentFetch")
public interface NSFileProviderTestingContentFetch extends NSFileProviderTestingOperation {
    /**
     * The identifier of the item.
     */
    @NotNull
    @Generated
    @Selector("itemIdentifier")
    String itemIdentifier();

    /**
     * The side of the operation.
     */
    @Generated
    @Selector("side")
    @NUInt
    long side();
}