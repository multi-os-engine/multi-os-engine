package apple.fileprovider.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

/**
 * An operation that can scheduled.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderTestingOperation")
public interface NSFileProviderTestingOperation {
    /**
     * Returns the operation as an ChildrenEnumeration.
     * 
     * Returns the operation if it conforms to NSFileProviderTestingChildrenEnumeration, otherwise returns nil.
     */
    @Nullable
    @Generated
    @Selector("asChildrenEnumeration")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderTestingChildrenEnumeration asChildrenEnumeration();

    /**
     * Returns the operation as an Bounce.
     * 
     * Returns the operation if it conforms to NSFileProviderTestingCollisionResolution, otherwise returns nil.
     */
    @Nullable
    @Generated
    @Selector("asCollisionResolution")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderTestingCollisionResolution asCollisionResolution();

    /**
     * Returns the operation as an ContentFetch.
     * 
     * Returns the operation if it conforms to NSFileProviderTestingContentFetch, otherwise returns nil.
     */
    @Nullable
    @Generated
    @Selector("asContentFetch")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderTestingContentFetch asContentFetch();

    /**
     * Returns the operation as an Creation.
     * 
     * Returns the operation if it conforms to NSFileProviderTestingCreation, otherwise returns nil.
     */
    @Nullable
    @Generated
    @Selector("asCreation")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderTestingCreation asCreation();

    /**
     * Returns the operation as an Deletion.
     * 
     * Returns the operation if it conforms to NSFileProviderTestingDeletion, otherwise returns nil.
     */
    @Nullable
    @Generated
    @Selector("asDeletion")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderTestingDeletion asDeletion();

    /**
     * Returns the operation as an Ingestion.
     * 
     * Returns the operation if it conforms to NSFileProviderTestingIngestion, otherwise returns nil.
     */
    @Nullable
    @Generated
    @Selector("asIngestion")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderTestingIngestion asIngestion();

    /**
     * Returns the operation as an Lookup.
     * 
     * Returns the operation if it conforms to NSFileProviderTestingLookup, otherwise returns nil.
     */
    @Nullable
    @Generated
    @Selector("asLookup")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderTestingLookup asLookup();

    /**
     * Returns the operation as an Modification.
     * 
     * Returns the operation if it conforms to NSFileProviderTestingModification, otherwise returns nil.
     */
    @Nullable
    @Generated
    @Selector("asModification")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderTestingModification asModification();

    /**
     * The operation type
     */
    @Generated
    @Selector("type")
    @NInt
    long type();
}