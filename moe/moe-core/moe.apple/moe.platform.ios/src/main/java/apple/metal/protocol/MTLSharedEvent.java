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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLSharedEvent")
public interface MTLSharedEvent extends MTLEvent {
    @Generated
    @Selector("newSharedEventHandle")
    MTLSharedEventHandle newSharedEventHandle();

    @Generated
    @Selector("notifyListener:atValue:block:")
    void notifyListenerAtValueBlock(MTLSharedEventListener listener, long value,
            @ObjCBlock(name = "call_notifyListenerAtValueBlock") Block_notifyListenerAtValueBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyListenerAtValueBlock {
        @Generated
        void call_notifyListenerAtValueBlock(@Mapped(ObjCObjectMapper.class) Object arg0, long arg1);
    }

    @Generated
    @Selector("setSignaledValue:")
    void setSignaledValue(long value);

    @Generated
    @Selector("signaledValue")
    long signaledValue();
}