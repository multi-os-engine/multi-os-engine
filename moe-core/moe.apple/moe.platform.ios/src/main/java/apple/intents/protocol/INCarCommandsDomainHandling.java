package apple.intents.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;

/**
 * API-Since: 10.3
 * Deprecated-Since: 13.0
 * Deprecated-Message: Please conform to INActivateCarSignalIntentHandling, INSetCarLockStatusIntentHandling,
 * INGetCarLockStatusIntentHandling and INGetCarPowerLevelStatusIntentHandling instead
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INCarCommandsDomainHandling")
public interface INCarCommandsDomainHandling extends INActivateCarSignalIntentHandling,
        INSetCarLockStatusIntentHandling, INGetCarLockStatusIntentHandling, INGetCarPowerLevelStatusIntentHandling {
}