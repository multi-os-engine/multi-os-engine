package apple.fileprovider.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * This operation causes the system to ingest a change.
 * 
 * When running this operation, the system will discover a change from the disk or the provider.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderTestingIngestion")
public interface NSFileProviderTestingIngestion extends NSFileProviderTestingOperation {
    /**
     * The metadata of the item.
     * 
     * This will be nil if the item is being deleted.
     */
    @Generated
    @Selector("item")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderItem item();

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