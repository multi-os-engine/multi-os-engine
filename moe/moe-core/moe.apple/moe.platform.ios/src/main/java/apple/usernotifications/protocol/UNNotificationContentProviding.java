package apple.usernotifications.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;

/**
 * Other system framework objects can conform to UNNotificationContentProviding to provide context relevant to the notification. Only objects that conform to UNNotificationContentProviding in the Apple SDK are allowed. The conformance will be ignored by other objects conforming to UNNotificationContentProviding. Do not conform objects to UNNotificationContentProviding.
 */
@Generated
@Library("UserNotifications")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UNNotificationContentProviding")
public interface UNNotificationContentProviding {
}
