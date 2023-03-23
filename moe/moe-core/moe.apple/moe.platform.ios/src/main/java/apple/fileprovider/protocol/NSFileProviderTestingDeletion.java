package apple.fileprovider.protocol;

import apple.fileprovider.NSFileProviderDomainVersion;
import apple.fileprovider.NSFileProviderItemVersion;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * This operation causes the system to propagate a deletion from a source side to a target side.
 * 
 * The deletion happens if an item that is known by the target side is deleted on the source side.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderTestingDeletion")
public interface NSFileProviderTestingDeletion extends NSFileProviderTestingOperation {
    /**
     * The domain version at the time the change was discovered on the source side.
     */
    @Generated
    @Selector("domainVersion")
    NSFileProviderDomainVersion domainVersion();

    /**
     * The identifier of the source item.
     */
    @Generated
    @Selector("sourceItemIdentifier")
    String sourceItemIdentifier();

    /**
     * The version of the target item on top of which the deletion is applied
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