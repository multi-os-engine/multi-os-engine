package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCaptureScope")
public interface MTLCaptureScope {
    /**
     * Marks the begin of the capture scope. Note: This method should be invoked repeatedly per frame.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("beginScope")
    void beginScope();

    /**
     * If set, this scope will only capture Metal commands from the associated command queue. Defaults to nil (all
     * command queues from the associated device are captured).
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue commandQueue();

    /**
     * Associated device: this scope will capture Metal commands from the associated device
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * Marks the end of the capture scope. Note: This method should be invoked repeatedly per frame.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("endScope")
    void endScope();

    /**
     * Scope label
     * [@remarks] Created capture scopes are listed in Xcode when long-pressing the capture button, performing the
     * capture over the selected scope
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("label")
    String label();

    /**
     * Scope label
     * [@remarks] Created capture scopes are listed in Xcode when long-pressing the capture button, performing the
     * capture over the selected scope
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);

    /**
     * If set, this scope will only capture Metal commands from the associated Metal 4 command queue. Defaults to nil
     * (all command queues from the associated device are captured).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("mtl4CommandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4CommandQueue mtl4CommandQueue();
}