package apple.oslog.protocol;

import apple.foundation.NSArray;
import apple.oslog.OSLogMessageComponent;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] OSLogEntryWithPayload
 * 
 * Entry subclasses conforming to this protocol represent
 * entries that were made using a handle and a format string.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("OSLog")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("OSLogEntryWithPayload")
public interface OSLogEntryWithPayload {
    /**
     * [@property] category
     * 
     * The category from the os_log_t handle used.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("category")
    String category();

    /**
     * [@property] components
     * 
     * An array of the various parts of the composed message.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("components")
    NSArray<? extends OSLogMessageComponent> components();

    /**
     * [@property] formatString
     * 
     * The format string used.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("formatString")
    String formatString();

    /**
     * [@property] subsystem
     * 
     * The subsystem of the os_log_t handle used.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("subsystem")
    String subsystem();
}
