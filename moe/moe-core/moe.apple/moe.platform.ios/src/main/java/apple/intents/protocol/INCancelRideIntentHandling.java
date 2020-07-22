package apple.intents.protocol;

import apple.intents.INCancelRideIntent;
import apple.intents.INCancelRideIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INCancelRideIntentHandling")
public interface INCancelRideIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmCancelRide:completion:")
    default void confirmCancelRideCompletion(INCancelRideIntent intent,
            @ObjCBlock(name = "call_confirmCancelRideCompletion") Block_confirmCancelRideCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmCancelRideCompletion {
        @Generated
        void call_confirmCancelRideCompletion(INCancelRideIntentResponse response);
    }

    @Generated
    @Selector("handleCancelRide:completion:")
    void handleCancelRideCompletion(INCancelRideIntent intent,
            @ObjCBlock(name = "call_handleCancelRideCompletion") Block_handleCancelRideCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleCancelRideCompletion {
        @Generated
        void call_handleCancelRideCompletion(INCancelRideIntentResponse response);
    }
}