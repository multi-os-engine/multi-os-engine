package apple.metal.protocol;

import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFunctionLogDebugLocation")
public interface MTLFunctionLogDebugLocation {
    /**
     * source location
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("URL")
    NSURL URL();

    /**
     * column in line
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("column")
    @NUInt
    long column();

    /**
     * faulting function
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("functionName")
    String functionName();

    /**
     * line number
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("line")
    @NUInt
    long line();
}