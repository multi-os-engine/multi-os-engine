package apple.corelocation.protocol;

import apple.foundation.NSDictionary;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 15.0
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CLLocationPushServiceExtension")
public interface CLLocationPushServiceExtension {
    /**
     * Call the completion handler once the location push has been handled.
     */
    @Generated
    @Selector("didReceiveLocationPushPayload:completion:")
    void didReceiveLocationPushPayloadCompletion(@NotNull NSDictionary<String, ?> payload,
            @NotNull @ObjCBlock(name = "call_didReceiveLocationPushPayloadCompletion") Block_didReceiveLocationPushPayloadCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_didReceiveLocationPushPayloadCompletion {
        @Generated
        void call_didReceiveLocationPushPayloadCompletion();
    }

    /**
     * Called just before this extension is terminated by the system.
     */
    @Generated
    @IsOptional
    @Selector("serviceExtensionWillTerminate")
    default void serviceExtensionWillTerminate() {
        throw new java.lang.UnsupportedOperationException();
    }
}
