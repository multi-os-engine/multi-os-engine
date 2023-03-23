package apple.oslog.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] OSLogEntryFromProcess
 * 
 * Entry subclasses conforming to this protocol represent data
 * that are generated from a process; they have metadata about
 * the originator.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("OSLog")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("OSLogEntryFromProcess")
public interface OSLogEntryFromProcess {
    /**
     * [@property] activityIdentifier
     * 
     * The activity ID associated with the entry.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("activityIdentifier")
    long activityIdentifier();

    /**
     * [@property] process
     * 
     * The name of the process that made the entry.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("process")
    String process();

    /**
     * [@property] processIdentifier
     * 
     * The pid of the process that made the entry.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("processIdentifier")
    int processIdentifier();

    /**
     * [@property] sender
     * 
     * The name of the binary image that made the entry.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("sender")
    String sender();

    /**
     * [@property] threadIdentifier
     * 
     * The tid of the thread that made the entry.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("threadIdentifier")
    long threadIdentifier();
}
