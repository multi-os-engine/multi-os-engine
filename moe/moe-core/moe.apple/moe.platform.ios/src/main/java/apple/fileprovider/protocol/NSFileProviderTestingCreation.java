package apple.fileprovider.protocol;

import apple.fileprovider.NSFileProviderDomainVersion;
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
 * This operation causes the system to propagate a creation of an item from a source side to a target side.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderTestingCreation")
public interface NSFileProviderTestingCreation extends NSFileProviderTestingOperation {
    /**
     * The domain version at the time the creation was discovered on the source side.
     */
    @Generated
    @Selector("domainVersion")
    NSFileProviderDomainVersion domainVersion();

    /**
     * The description of the item.
     */
    @Generated
    @Selector("sourceItem")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderItem sourceItem();

    /**
     * The target side of the operation.
     */
    @Generated
    @Selector("targetSide")
    @NUInt
    long targetSide();
}