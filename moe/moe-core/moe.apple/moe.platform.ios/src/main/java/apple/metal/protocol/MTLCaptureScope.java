package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCaptureScope")
public interface MTLCaptureScope {
    @Generated
    @Selector("beginScope")
    void beginScope();

    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue commandQueue();

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Generated
    @Selector("endScope")
    void endScope();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);
}