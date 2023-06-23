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
import org.jetbrains.annotations.NotNull;

/**
 * This operation causes the system to resolve a collision by rename a colliding item.
 * 
 * In case two items claim the same disk location because the have the same parent and filename,
 * the system will choose to rename one of those items away from that location. The renamed item will
 * have the same parent, but a slightly modified name (for instance "a.txt" will be renamed to "a 2.txt").
 * 
 * This can for instance happen if the case sensitivity of the local filesystem and of the provider differs.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderTestingCollisionResolution")
public interface NSFileProviderTestingCollisionResolution extends NSFileProviderTestingOperation {
    /**
     * The state of the item.
     */
    @NotNull
    @Generated
    @Selector("renamedItem")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderItem renamedItem();

    /**
     * The side of the operation.
     */
    @Generated
    @Selector("side")
    @NUInt
    long side();
}