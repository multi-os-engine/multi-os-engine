package apple.matter.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSNumber;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.2
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRXPCClientProtocol_MTRDevice")
public interface MTRXPCClientProtocol_MTRDevice {
    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("device:internalStateUpdated:")
    void deviceInternalStateUpdated(@NotNull NSNumber nodeID, @NotNull NSDictionary<?, ?> dictionary);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("device:receivedAttributeReport:")
    void deviceReceivedAttributeReport(@NotNull NSNumber nodeID,
            @NotNull NSArray<? extends NSDictionary<String, ?>> attributeReport);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("device:receivedEventReport:")
    void deviceReceivedEventReport(@NotNull NSNumber nodeID,
            @NotNull NSArray<? extends NSDictionary<String, ?>> eventReport);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("device:stateChanged:")
    void deviceStateChanged(@NotNull NSNumber nodeID, @NUInt long state);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceBecameActive:")
    void deviceBecameActive(@NotNull NSNumber nodeID);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceCachePrimed:")
    void deviceCachePrimed(@NotNull NSNumber nodeID);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceConfigurationChanged:")
    void deviceConfigurationChanged(@NotNull NSNumber nodeID);
}