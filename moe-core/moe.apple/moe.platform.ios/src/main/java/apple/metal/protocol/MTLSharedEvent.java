package apple.metal.protocol;

import apple.metal.MTLSharedEventHandle;
import apple.metal.MTLSharedEventListener;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 12.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLSharedEvent")
public interface MTLSharedEvent extends MTLEvent {
    /**
     * Convenience method for creating a shared event handle that may be passed to other processes via XPC.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("newSharedEventHandle")
    MTLSharedEventHandle newSharedEventHandle();

    /**
     * When the event's signaled value reaches value or higher, invoke the block on the dispatch queue owned by the
     * listener.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("notifyListener:atValue:block:")
    void notifyListenerAtValueBlock(@NotNull MTLSharedEventListener listener, long value,
            @NotNull @ObjCBlock(name = "call_notifyListenerAtValueBlock") Block_notifyListenerAtValueBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyListenerAtValueBlock {
        @Generated
        void call_notifyListenerAtValueBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object arg0, long arg1);
    }

    /**
     * Read or set signaled value
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setSignaledValue:")
    void setSignaledValue(long value);

    /**
     * Read or set signaled value
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("signaledValue")
    long signaledValue();

    /**
     * Synchronously wait for the signaledValue to be greater than or equal to 'value', with a timeout
     * specified in milliseconds. Returns YES if the value was signaled before the timeout, otherwise NO.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("waitUntilSignaledValue:timeoutMS:")
    boolean waitUntilSignaledValueTimeoutMS(long value, long milliseconds);
}