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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFunctionLog")
public interface MTLFunctionLog {
    @Generated
    @Selector("debugLocation")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunctionLogDebugLocation debugLocation();

    @Generated
    @Selector("encoderLabel")
    String encoderLabel();

    @Generated
    @Selector("function")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunction function();

    @Generated
    @Selector("type")
    @NUInt
    long type();
}