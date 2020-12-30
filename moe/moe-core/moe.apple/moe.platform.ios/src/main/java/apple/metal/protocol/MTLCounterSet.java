package apple.metal.protocol;

import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @protocol MTLCounterSet
 * @abstract A collection of MTLCounters that the device can capture in
 * a single pass.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCounterSet")
public interface MTLCounterSet {
    /**
     * @property counters The set of counters captured by the counter set.
     * @discussion The counters array contains all the counters that will be written
     * when a counter sample is collected.  Counters that do not appear in this array
     * will not be written to the resolved buffer when the samples are resolved, even if
     * they appear in the corresponding resolved counter structure.  Instead
     * MTLCounterErrorValue will be written in the resolved buffer.
     */
    @Generated
    @Selector("counters")
    NSArray<?> counters();

    /**
     * @property name The name of the counter set.
     */
    @Generated
    @Selector("name")
    String name();
}