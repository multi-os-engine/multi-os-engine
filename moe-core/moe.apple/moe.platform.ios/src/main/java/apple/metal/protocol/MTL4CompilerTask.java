package apple.metal.protocol;

import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A reference to an asynchronous compilation task that you initiate from a compiler instance.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4CompilerTask")
public interface MTL4CompilerTask {
    /**
     * Returns the compiler instance that this asynchronous compiler task belongs to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("compiler")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTL4Compiler compiler();

    /**
     * Returns the compiler task status.
     * 
     * The default is `MTL4CompilerStatusNone`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("status")
    @NInt
    long status();

    /**
     * Waits synchronously for this compile task to complete by blocking the calling thread.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("waitUntilCompleted")
    void waitUntilCompleted();
}