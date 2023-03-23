package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLIOScratchBuffer
 * 
 * An extendible protocol that can be used to wrap the buffers vended by
 * a custom allocator. The underlying buffer is used as scratch space for IO commands
 * that need it.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIOScratchBuffer")
public interface MTLIOScratchBuffer {
    @Generated
    @Selector("buffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer buffer();
}