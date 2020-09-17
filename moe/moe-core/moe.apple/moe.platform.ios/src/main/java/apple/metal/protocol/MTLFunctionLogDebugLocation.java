package apple.metal.protocol;

import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFunctionLogDebugLocation")
public interface MTLFunctionLogDebugLocation {
    @Generated
    @Selector("URL")
    NSURL URL();

    @Generated
    @Selector("column")
    @NUInt
    long column();

    @Generated
    @Selector("functionName")
    String functionName();

    @Generated
    @Selector("line")
    @NUInt
    long line();
}