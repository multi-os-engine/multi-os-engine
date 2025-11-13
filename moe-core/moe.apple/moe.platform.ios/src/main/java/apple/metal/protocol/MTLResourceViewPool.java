package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import apple.metal.struct.MTLResourceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Contains views over resources of a specific type, and allows you to manage those views.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLResourceViewPool")
public interface MTLResourceViewPool {
    /**
     * Obtains the resource ID corresponding to the resource view at index 0 in this resource view pool.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("baseResourceID")
    @ByValue
    MTLResourceID baseResourceID();

    /**
     * Copies a range of resource views from a source view pool to a destination location in this view pool.
     * 
     * - Parameters:
     * - sourcePool: resource view pool from which to copy resource views.
     * - sourceRange: The range in the source resource view pool to copy.
     * - destinationIndex: The starting index in this destination view pool into which to copy the source range of
     * resource views.
     * 
     * - Returns: The ``MTLResourceID`` of the resource view corresponding to `destinationIndex` of the copy in this
     * resource view pool.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyResourceViewsFromPool:sourceRange:destinationIndex:")
    @ByValue
    MTLResourceID copyResourceViewsFromPoolSourceRangeDestinationIndex(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLResourceViewPool sourcePool, @ByValue NSRange sourceRange,
            @NUInt long destinationIndex);

    /**
     * Obtains a reference to the GPU device this pool belongs to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTLDevice device();

    /**
     * Queries the optional debug label of this resource view pool.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Queries the number of resource views that this pool contains.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("resourceViewCount")
    @NUInt
    long resourceViewCount();
}