package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLThreadgroupBinding")
public interface MTLThreadgroupBinding extends MTLBinding {
    @Generated
    @Selector("threadgroupMemoryAlignment")
    @NUInt
    long threadgroupMemoryAlignment();

    /**
     * sizeof(T) for T *argName
     */
    @Generated
    @Selector("threadgroupMemoryDataSize")
    @NUInt
    long threadgroupMemoryDataSize();
}