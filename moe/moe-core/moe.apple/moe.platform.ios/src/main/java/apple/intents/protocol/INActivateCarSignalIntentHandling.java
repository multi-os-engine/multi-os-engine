package apple.intents.protocol;

import apple.intents.INActivateCarSignalIntent;
import apple.intents.INActivateCarSignalIntentResponse;
import apple.intents.INCarSignalOptionsResolutionResult;
import apple.intents.INSpeakableStringResolutionResult;
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
@ObjCProtocolName("INActivateCarSignalIntentHandling")
public interface INActivateCarSignalIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmActivateCarSignal:completion:")
    default void confirmActivateCarSignalCompletion(INActivateCarSignalIntent intent,
            @ObjCBlock(name = "call_confirmActivateCarSignalCompletion") Block_confirmActivateCarSignalCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmActivateCarSignalCompletion {
        @Generated
        void call_confirmActivateCarSignalCompletion(INActivateCarSignalIntentResponse response);
    }

    @Generated
    @Selector("handleActivateCarSignal:completion:")
    void handleActivateCarSignalCompletion(INActivateCarSignalIntent intent,
            @ObjCBlock(name = "call_handleActivateCarSignalCompletion") Block_handleActivateCarSignalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleActivateCarSignalCompletion {
        @Generated
        void call_handleActivateCarSignalCompletion(INActivateCarSignalIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveCarNameForActivateCarSignal:withCompletion:")
    default void resolveCarNameForActivateCarSignalWithCompletion(INActivateCarSignalIntent intent,
            @ObjCBlock(name = "call_resolveCarNameForActivateCarSignalWithCompletion") Block_resolveCarNameForActivateCarSignalWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForActivateCarSignalWithCompletion {
        @Generated
        void call_resolveCarNameForActivateCarSignalWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveSignalsForActivateCarSignal:withCompletion:")
    default void resolveSignalsForActivateCarSignalWithCompletion(INActivateCarSignalIntent intent,
            @ObjCBlock(name = "call_resolveSignalsForActivateCarSignalWithCompletion") Block_resolveSignalsForActivateCarSignalWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSignalsForActivateCarSignalWithCompletion {
        @Generated
        void call_resolveSignalsForActivateCarSignalWithCompletion(INCarSignalOptionsResolutionResult resolutionResult);
    }
}