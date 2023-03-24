package apple.coretelephony.protocol;

import apple.coretelephony.CTSubscriber;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 12.1
 */
@Generated
@Library("CoreTelephony")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CTSubscriberDelegate")
public interface CTSubscriberDelegate {
    @Generated
    @Selector("subscriberTokenRefreshed:")
    void subscriberTokenRefreshed(@NotNull CTSubscriber subscriber);
}