package apple.foundation.protocol;

import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSXPCProxyCreating")
public interface NSXPCProxyCreating {
    @Generated
    @Selector("remoteObjectProxy")
    @MappedReturn(ObjCObjectMapper.class)
    Object remoteObjectProxy();

    @Generated
    @Selector("remoteObjectProxyWithErrorHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    Object remoteObjectProxyWithErrorHandler(
            @ObjCBlock(name = "call_remoteObjectProxyWithErrorHandler") Block_remoteObjectProxyWithErrorHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_remoteObjectProxyWithErrorHandler {
        @Generated
        void call_remoteObjectProxyWithErrorHandler(NSError arg0);
    }

    @Generated
    @IsOptional
    @Selector("synchronousRemoteObjectProxyWithErrorHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object synchronousRemoteObjectProxyWithErrorHandler(
            @ObjCBlock(name = "call_synchronousRemoteObjectProxyWithErrorHandler") Block_synchronousRemoteObjectProxyWithErrorHandler handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_synchronousRemoteObjectProxyWithErrorHandler {
        @Generated
        void call_synchronousRemoteObjectProxyWithErrorHandler(NSError arg0);
    }
}