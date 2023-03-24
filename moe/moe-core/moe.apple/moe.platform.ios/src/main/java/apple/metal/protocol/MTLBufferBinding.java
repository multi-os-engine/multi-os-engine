package apple.metal.protocol;

import apple.metal.MTLPointerType;
import apple.metal.MTLStructType;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBufferBinding")
public interface MTLBufferBinding extends MTLBinding {
    /**
     * min alignment of starting offset in the buffer
     */
    @Generated
    @Selector("bufferAlignment")
    @NUInt
    long bufferAlignment();

    /**
     * sizeof(T) for T *argName
     */
    @Generated
    @Selector("bufferDataSize")
    @NUInt
    long bufferDataSize();

    /**
     * MTLDataTypeFloat, MTLDataTypeFloat4, MTLDataTypeStruct, ...
     */
    @Generated
    @Selector("bufferDataType")
    @NUInt
    long bufferDataType();

    @Nullable
    @Generated
    @Selector("bufferPointerType")
    MTLPointerType bufferPointerType();

    @Nullable
    @Generated
    @Selector("bufferStructType")
    MTLStructType bufferStructType();
}