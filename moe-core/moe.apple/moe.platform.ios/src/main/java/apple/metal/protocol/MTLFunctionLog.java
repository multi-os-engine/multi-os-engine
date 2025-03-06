package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFunctionLog")
public interface MTLFunctionLog {
    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("debugLocation")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunctionLogDebugLocation debugLocation();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("encoderLabel")
    String encoderLabel();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("function")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction function();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("type")
    @NUInt
    long type();
}