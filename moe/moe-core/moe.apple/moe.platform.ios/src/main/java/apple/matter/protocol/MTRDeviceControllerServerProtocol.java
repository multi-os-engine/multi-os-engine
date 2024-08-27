package apple.matter.protocol;

import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Protocol that remote object must support over XPC
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRDeviceControllerServerProtocol")
public interface MTRDeviceControllerServerProtocol {
    /**
     * Gets any available device controller ID
     */
    @Generated
    @Selector("getAnyDeviceControllerWithCompletion:")
    void getAnyDeviceControllerWithCompletion(
            @ObjCBlock(name = "call_getAnyDeviceControllerWithCompletion") @NotNull Block_getAnyDeviceControllerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getAnyDeviceControllerWithCompletion {
        @Generated
        void call_getAnyDeviceControllerWithCompletion(@Mapped(ObjCObjectMapper.class) @Nullable Object controller,
                @Nullable NSError error);
    }

    /**
     * Gets device controller ID corresponding to a specific fabric ID
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: This never called.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("getDeviceControllerWithFabricId:completion:")
    default void getDeviceControllerWithFabricIdCompletion(long fabricId,
            @ObjCBlock(name = "call_getDeviceControllerWithFabricIdCompletion") @NotNull Block_getDeviceControllerWithFabricIdCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDeviceControllerWithFabricIdCompletion {
        @Generated
        void call_getDeviceControllerWithFabricIdCompletion(@Mapped(ObjCObjectMapper.class) @Nullable Object controller,
                @Nullable NSError error);
    }

    /**
     * Requests invoking command
     */
    @Generated
    @Selector("invokeCommandWithController:nodeId:endpointId:clusterId:commandId:fields:timedInvokeTimeout:completion:")
    void invokeCommandWithControllerNodeIdEndpointIdClusterIdCommandIdFieldsTimedInvokeTimeoutCompletion(
            @Mapped(ObjCObjectMapper.class) @Nullable Object controller, long nodeId, @NotNull NSNumber endpointId,
            @NotNull NSNumber clusterId, @NotNull NSNumber commandId,
            @Mapped(ObjCObjectMapper.class) @NotNull Object fields, @Nullable NSNumber timeoutMs,
            @ObjCBlock(name = "call_invokeCommandWithControllerNodeIdEndpointIdClusterIdCommandIdFieldsTimedInvokeTimeoutCompletion") @NotNull Block_invokeCommandWithControllerNodeIdEndpointIdClusterIdCommandIdFieldsTimedInvokeTimeoutCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invokeCommandWithControllerNodeIdEndpointIdClusterIdCommandIdFieldsTimedInvokeTimeoutCompletion {
        @Generated
        void call_invokeCommandWithControllerNodeIdEndpointIdClusterIdCommandIdFieldsTimedInvokeTimeoutCompletion(
                @Mapped(ObjCObjectMapper.class) @Nullable Object values, @Nullable NSError error);
    }

    /**
     * Requests reading attribute cache
     */
    @Generated
    @Selector("readAttributeCacheWithController:nodeId:endpointId:clusterId:attributeId:completion:")
    void readAttributeCacheWithControllerNodeIdEndpointIdClusterIdAttributeIdCompletion(
            @Mapped(ObjCObjectMapper.class) @Nullable Object controller, long nodeId, @Nullable NSNumber endpointId,
            @Nullable NSNumber clusterId, @Nullable NSNumber attributeId,
            @ObjCBlock(name = "call_readAttributeCacheWithControllerNodeIdEndpointIdClusterIdAttributeIdCompletion") @NotNull Block_readAttributeCacheWithControllerNodeIdEndpointIdClusterIdAttributeIdCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCacheWithControllerNodeIdEndpointIdClusterIdAttributeIdCompletion {
        @Generated
        void call_readAttributeCacheWithControllerNodeIdEndpointIdClusterIdAttributeIdCompletion(
                @Mapped(ObjCObjectMapper.class) @Nullable Object values, @Nullable NSError error);
    }

    /**
     * Requests reading attribute
     */
    @Generated
    @Selector("readAttributeWithController:nodeId:endpointId:clusterId:attributeId:params:completion:")
    void readAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdParamsCompletion(
            @Mapped(ObjCObjectMapper.class) @Nullable Object controller, long nodeId, @Nullable NSNumber endpointId,
            @Nullable NSNumber clusterId, @Nullable NSNumber attributeId, @Nullable NSDictionary<String, ?> params,
            @ObjCBlock(name = "call_readAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdParamsCompletion") @NotNull Block_readAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdParamsCompletion {
        @Generated
        void call_readAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdParamsCompletion(
                @Mapped(ObjCObjectMapper.class) @Nullable Object values, @Nullable NSError error);
    }

    /**
     * Requests to stop reporting
     */
    @Generated
    @Selector("stopReportsWithController:nodeId:completion:")
    void stopReportsWithControllerNodeIdCompletion(@Mapped(ObjCObjectMapper.class) @Nullable Object controller,
            long nodeId,
            @ObjCBlock(name = "call_stopReportsWithControllerNodeIdCompletion") @NotNull Block_stopReportsWithControllerNodeIdCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopReportsWithControllerNodeIdCompletion {
        @Generated
        void call_stopReportsWithControllerNodeIdCompletion();
    }

    /**
     * Requests subscribing attribute. The minInterval/maxInterval arguments
     * override whatever intervals might be present in params.
     */
    @Generated
    @Selector("subscribeAttributeWithController:nodeId:endpointId:clusterId:attributeId:minInterval:maxInterval:params:establishedHandler:")
    void subscribeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsEstablishedHandler(
            @Mapped(ObjCObjectMapper.class) @Nullable Object controller, long nodeId, @Nullable NSNumber endpointId,
            @Nullable NSNumber clusterId, @Nullable NSNumber attributeId, @NotNull NSNumber minInterval,
            @NotNull NSNumber maxInterval, @Nullable NSDictionary<String, ?> params,
            @ObjCBlock(name = "call_subscribeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsEstablishedHandler") @NotNull Block_subscribeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsEstablishedHandler establishedHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsEstablishedHandler {
        @Generated
        void call_subscribeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsEstablishedHandler();
    }

    /**
     * Requests subscription of all attributes. The minInterval/maxInterval
     * arguments override whatever intervals might be present in params.
     */
    @Generated
    @Selector("subscribeWithController:nodeId:minInterval:maxInterval:params:shouldCache:completion:")
    void subscribeWithControllerNodeIdMinIntervalMaxIntervalParamsShouldCacheCompletion(
            @Mapped(ObjCObjectMapper.class) @Nullable Object controller, long nodeId, @NotNull NSNumber minInterval,
            @NotNull NSNumber maxInterval, @Nullable NSDictionary<String, ?> params, boolean shouldCache,
            @ObjCBlock(name = "call_subscribeWithControllerNodeIdMinIntervalMaxIntervalParamsShouldCacheCompletion") @NotNull Block_subscribeWithControllerNodeIdMinIntervalMaxIntervalParamsShouldCacheCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithControllerNodeIdMinIntervalMaxIntervalParamsShouldCacheCompletion {
        @Generated
        void call_subscribeWithControllerNodeIdMinIntervalMaxIntervalParamsShouldCacheCompletion(
                @Nullable NSError error);
    }

    /**
     * Requests writing attribute
     */
    @Generated
    @Selector("writeAttributeWithController:nodeId:endpointId:clusterId:attributeId:value:timedWriteTimeout:completion:")
    void writeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutCompletion(
            @Mapped(ObjCObjectMapper.class) @Nullable Object controller, long nodeId, @NotNull NSNumber endpointId,
            @NotNull NSNumber clusterId, @NotNull NSNumber attributeId,
            @Mapped(ObjCObjectMapper.class) @NotNull Object value, @Nullable NSNumber timeoutMs,
            @ObjCBlock(name = "call_writeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutCompletion") @NotNull Block_writeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutCompletion {
        @Generated
        void call_writeAttributeWithControllerNodeIdEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutCompletion(
                @Mapped(ObjCObjectMapper.class) @Nullable Object values, @Nullable NSError error);
    }
}