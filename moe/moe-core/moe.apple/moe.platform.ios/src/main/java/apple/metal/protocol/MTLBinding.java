package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
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
@ObjCProtocolName("MTLBinding")
public interface MTLBinding {
    @Generated
    @Selector("access")
    @NUInt
    long access();

    @Generated
    @Selector("index")
    @NUInt
    long index();

    @Generated
    @Selector("isArgument")
    boolean isArgument();

    @Generated
    @Selector("isUsed")
    boolean isUsed();

    @Generated
    @Selector("name")
    String name();

    @Generated
    @Selector("type")
    @NInt
    long type();
}