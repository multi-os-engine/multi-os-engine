package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBinding")
public interface MTLBinding {
    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("access")
    @NUInt
    long access();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("index")
    @NUInt
    long index();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("isArgument")
    boolean isArgument();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("isUsed")
    boolean isUsed();

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("name")
    String name();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("type")
    @NInt
    long type();
}