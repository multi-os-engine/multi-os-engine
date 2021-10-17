package apple.oslog.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] OSLogEntryFromProcess
 * <p>
 * Entry subclasses conforming to this protocol represent data
 * that are generated from a process; they have metadata about
 * the originator.
 */
@Generated
@Library("OSLog")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("OSLogEntryFromProcess")
public interface OSLogEntryFromProcess {
    /**
     * [@property] activityIdentifier
     * <p>
     * The activity ID associated with the entry.
     */
    @Generated
    @Selector("activityIdentifier")
    long activityIdentifier();

    /**
     * [@property] process
     * <p>
     * The name of the process that made the entry.
     */
    @Generated
    @Selector("process")
    String process();

    /**
     * [@property] processIdentifier
     * <p>
     * The pid of the process that made the entry.
     */
    @Generated
    @Selector("processIdentifier")
    int processIdentifier();

    /**
     * [@property] sender
     * <p>
     * The name of the binary image that made the entry.
     */
    @Generated
    @Selector("sender")
    String sender();

    /**
     * [@property] threadIdentifier
     * <p>
     * The tid of the thread that made the entry.
     */
    @Generated
    @Selector("threadIdentifier")
    long threadIdentifier();
}
