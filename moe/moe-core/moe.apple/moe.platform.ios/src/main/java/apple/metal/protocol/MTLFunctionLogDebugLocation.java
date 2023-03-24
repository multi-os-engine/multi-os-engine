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
     */
    @Nullable
    @Generated
    @Selector("URL")
    NSURL URL();

    /**
     * column in line
     */
    @Generated
    @Selector("column")
    @NUInt
    long column();

    /**
     * faulting function
     */
    @Nullable
    @Generated
    @Selector("functionName")
    String functionName();

    /**
     * line number
     */
    @Generated
    @Selector("line")
    @NUInt
    long line();
}