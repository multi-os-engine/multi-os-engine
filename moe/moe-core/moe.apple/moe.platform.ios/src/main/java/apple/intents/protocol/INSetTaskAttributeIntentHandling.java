package apple.intents.protocol;

import apple.intents.INSetTaskAttributeIntent;
import apple.intents.INSetTaskAttributeIntentResponse;
import apple.intents.INSpatialEventTriggerResolutionResult;
import apple.intents.INTaskResolutionResult;
import apple.intents.INTaskStatusResolutionResult;
import apple.intents.INTemporalEventTriggerResolutionResult;
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
@ObjCProtocolName("INSetTaskAttributeIntentHandling")
public interface INSetTaskAttributeIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetTaskAttribute:completion:")
    default void confirmSetTaskAttributeCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_confirmSetTaskAttributeCompletion") Block_confirmSetTaskAttributeCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetTaskAttributeCompletion {
        @Generated
        void call_confirmSetTaskAttributeCompletion(INSetTaskAttributeIntentResponse arg0);
    }

    @Generated
    @Selector("handleSetTaskAttribute:completion:")
    void handleSetTaskAttributeCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_handleSetTaskAttributeCompletion") Block_handleSetTaskAttributeCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetTaskAttributeCompletion {
        @Generated
        void call_handleSetTaskAttributeCompletion(INSetTaskAttributeIntentResponse arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveSpatialEventTriggerForSetTaskAttribute:withCompletion:")
    default void resolveSpatialEventTriggerForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveSpatialEventTriggerForSetTaskAttributeWithCompletion") Block_resolveSpatialEventTriggerForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSpatialEventTriggerForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveSpatialEventTriggerForSetTaskAttributeWithCompletion(
                INSpatialEventTriggerResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveStatusForSetTaskAttribute:withCompletion:")
    default void resolveStatusForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveStatusForSetTaskAttributeWithCompletion") Block_resolveStatusForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveStatusForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveStatusForSetTaskAttributeWithCompletion(INTaskStatusResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTargetTaskForSetTaskAttribute:withCompletion:")
    default void resolveTargetTaskForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveTargetTaskForSetTaskAttributeWithCompletion") Block_resolveTargetTaskForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTargetTaskForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveTargetTaskForSetTaskAttributeWithCompletion(INTaskResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTemporalEventTriggerForSetTaskAttribute:withCompletion:")
    default void resolveTemporalEventTriggerForSetTaskAttributeWithCompletion(INSetTaskAttributeIntent intent,
            @ObjCBlock(name = "call_resolveTemporalEventTriggerForSetTaskAttributeWithCompletion") Block_resolveTemporalEventTriggerForSetTaskAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemporalEventTriggerForSetTaskAttributeWithCompletion {
        @Generated
        void call_resolveTemporalEventTriggerForSetTaskAttributeWithCompletion(
                INTemporalEventTriggerResolutionResult arg0);
    }
}