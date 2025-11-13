package apple.metal.protocol;

import apple.foundation.NSData;
import apple.foundation.struct.NSRange;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Represents an opaque, driver-controlled section of memory that can store GPU counter data.
 * 
 * The data instances that this type stores correspond to the ``MTL4CounterHeapType`` heap type that you assign at
 * creation time.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4CounterHeap")
public interface MTL4CounterHeap {
    /**
     * Queries the number of entries in the heap.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("count")
    @NUInt
    long count();

    /**
     * Invalidates a range of entries in this counter heap.
     * 
     * The effect of this call is immediate on the CPU timeline. You are responsible for ensuring that this counter heap
     * is not currently in use on the GPU.
     * 
     * - Note: Invalidated entries produce 0 when resolved.
     * 
     * - Parameters:
     * - range: A heap index range to invalidate.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("invalidateCounterRange:")
    void invalidateCounterRange(@ByValue NSRange range);

    /**
     * Assigns a label for later inspection or visualization.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Resolves heap data on the CPU timeline.
     * 
     * This method resolves heap data in the CPU timeline. Your app needs to ensure the GPU work has completed in order
     * to
     * retrieve the data correctly. You can alternatively resolve the heap data in the GPU timeline by calling
     * ``MTL4CommandBuffer/resolveCounterHeap:withRange:intoBuffer:waitFence:updateFence:``.
     * 
     * - Note: When resolving counters in the CPU timeline, signaling an instance of ``MTLSharedEvent`` after any
     * workloads
     * write counters (and waiting on that signal on the CPU) is sufficient to ensure synchronization.
     * 
     * - Parameter range: The range in the heap to resolve.
     * - Returns a newly allocated autoreleased NSData containing tightly packed resolved heap counter values.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("resolveCounterRange:")
    @Nullable
    NSData resolveCounterRange(@ByValue NSRange range);

    /**
     * Assigns a label for later inspection or visualization.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);

    /**
     * Queries the type of the heap.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("type")
    @NInt
    long type();
}