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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("domainVersion")
    NSFileProviderDomainVersion domainVersion();

    /**
     * The description of the item.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("sourceItem")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderItem sourceItem();

    /**
     * The target side of the operation.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("targetSide")
    @NUInt
    long targetSide();
}