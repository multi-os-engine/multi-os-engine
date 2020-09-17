package apple.intents.protocol;

import apple.intents.INListCarsIntent;
import apple.intents.INListCarsIntentResponse;
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
@ObjCProtocolName("INListCarsIntentHandling")
public interface INListCarsIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmListCars:completion:")
    default void confirmListCarsCompletion(INListCarsIntent intent,
            @ObjCBlock(name = "call_confirmListCarsCompletion") Block_confirmListCarsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmListCarsCompletion {
        @Generated
        void call_confirmListCarsCompletion(INListCarsIntentResponse response);
    }

    @Generated
    @Selector("handleListCars:completion:")
    void handleListCarsCompletion(INListCarsIntent intent,
            @ObjCBlock(name = "call_handleListCarsCompletion") Block_handleListCarsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleListCarsCompletion {
        @Generated
        void call_handleListCarsCompletion(INListCarsIntentResponse response);
    }
}