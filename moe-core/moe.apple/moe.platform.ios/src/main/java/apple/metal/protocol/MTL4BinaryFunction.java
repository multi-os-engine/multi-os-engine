package apple.metal.protocol;

import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Represents a binary function.
 * 
 * A binary function is a shader that you precompile from Metal IR to GPU machine code.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4BinaryFunction")
public interface MTL4BinaryFunction {
    /**
     * Describes the type of this binary function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("functionType")
    @NUInt
    long functionType();

    /**
     * Obtains the optional name of this binary function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("name")
    @Nullable
    String name();
}