package apple.intents.protocol;

import apple.intents.INGetCarPowerLevelStatusIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 14.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetCarPowerLevelStatusIntentResponseObserver")
public interface INGetCarPowerLevelStatusIntentResponseObserver {
    @Generated
    @Selector("getCarPowerLevelStatusResponseDidUpdate:")
    void getCarPowerLevelStatusResponseDidUpdate(@NotNull INGetCarPowerLevelStatusIntentResponse response);
}