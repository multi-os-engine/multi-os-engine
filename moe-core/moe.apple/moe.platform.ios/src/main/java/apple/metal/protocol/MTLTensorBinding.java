package apple.metal.protocol;

import apple.metal.MTLTensorExtents;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * An object that represents a tensor bound to a graphics or compute function or a machine learning function.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLTensorBinding")
public interface MTLTensorBinding extends MTLBinding {
    /**
     * The array of sizes, in elements, one for each dimension of this tensor.
     * 
     * Because shader-bound tensors have dynamic extents, if this tensor is shader bound, the ``MTLTensorExtents/rank``
     * of `dimensions` corresponds to the rank the shader function specifies, and
     * ``MTLTensorExtents/extentsAtDimensionIndex:`` always returns a value of -1.
     * In the case of functions used with machine learning pipelines, `dimensions` corresponds to the default shape, if
     * you provide one. Otherwise, it's `nil` in the case of an undefined shape.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dimensions")
    @Nullable
    MTLTensorExtents dimensions();

    /**
     * The data format you use for indexing into the tensor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indexType")
    @NUInt
    long indexType();

    /**
     * The underlying data format of this tensor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tensorDataType")
    @NInt
    long tensorDataType();
}