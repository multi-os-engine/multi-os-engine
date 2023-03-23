package apple.fileprovider.protocol;

import apple.fileprovider.NSFileProviderDomainVersion;
import apple.fileprovider.NSFileProviderItemVersion;
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
 * This operation causes the system to propagate a modification of an existing item from a source side to a target side.
 * 
 * The modification happens if a change is identified on an item that is already known by both sides.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderTestingModification")
public interface NSFileProviderTestingModification extends NSFileProviderTestingOperation {
    /**
     * The list of updated fields.
     */
    @Generated
    @Selector("changedFields")
    @NUInt
    long changedFields();

    /**
     * The domain version at the time the change was discovered on the source side.
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
     * The version of the target item on top of which the modification is applied
     */
    @Generated
    @Selector("targetItemBaseVersion")
    NSFileProviderItemVersion targetItemBaseVersion();

    /**
     * The identifier of the target item.
     */
    @Generated
    @Selector("targetItemIdentifier")
    String targetItemIdentifier();

    /**
     * The target side of the operation.
     */
    @Generated
    @Selector("targetSide")
    @NUInt
    long targetSide();
}