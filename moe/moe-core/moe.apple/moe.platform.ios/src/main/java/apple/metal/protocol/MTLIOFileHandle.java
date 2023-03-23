package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] MTLIOFileHandle
 * 
 * Represents a file (raw or compressed) that can be used as a source
 * for load commands encoded in a MTLIOCommandBuffer.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIOFileHandle")
public interface MTLIOFileHandle {
    /**
     * [@property] label
     * 
     * An optional label for this handle.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * [@property] label
     * 
     * An optional label for this handle.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);
}