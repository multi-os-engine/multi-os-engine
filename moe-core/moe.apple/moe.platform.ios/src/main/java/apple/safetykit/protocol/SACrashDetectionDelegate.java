package apple.safetykit.protocol;

import apple.safetykit.SACrashDetectionEvent;
import apple.safetykit.SACrashDetectionManager;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * SACrashDetectionDelegate
 * 
 * SACrashDetectionManager notifies its delegate about Crash Detection related information using this protocol.
 * 
 * [@sa] SACrashDetectionManager
 * 
 * API-Since: 16.0
 */
@Generated
@Library("SafetyKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SACrashDetectionDelegate")
public interface SACrashDetectionDelegate {
    /**
     * Update the delegate with a new Crash Detection event
     * 
     * Crash Detection events may occur when the app is not running.
     * Following a Crash Detection event, the system will launch the iOS app in the background giving it small amount of
     * background execution time. This time should be used for critical tasks related to the Crash Event. For example:
     * placing a network request or scheduling a local notification.
     * In order to receive Crash Detection events, create a new SACrashDetectionManager instance and set its delegate
     * early in the iOS app lifecycle (applicationDidFinishLaunching for example).
     * 
     * If multiple Crash Detection events are generated while the app is not running, only the most recent event will be
     * reported on the next app launch.
     * 
     * The same event may be reported across different app launches, always check the date of the event before
     * processing it.
     * 
     * Crash Detection events can be simulated with the iOS simulator. Use it to test the background functionality of
     * your app.
     */
    @Generated
    @IsOptional
    @Selector("crashDetectionManager:didDetectEvent:")
    default void crashDetectionManagerDidDetectEvent(@NotNull SACrashDetectionManager crashDetectionManager,
            @NotNull SACrashDetectionEvent event) {
        throw new java.lang.UnsupportedOperationException();
    }
}