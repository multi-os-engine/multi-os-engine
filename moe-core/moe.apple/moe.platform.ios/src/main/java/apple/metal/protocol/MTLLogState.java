package apple.metal.protocol;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLLogState")
public interface MTLLogState {
    /**
     * addLogHandler
     * 
     * Add a function block to handle log message output.
     * In the absence of any handlers, log messages go through the default handler.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addLogHandler:")
    void addLogHandler(@ObjCBlock(name = "call_addLogHandler") @NotNull Block_addLogHandler block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addLogHandler {
        @Generated
        void call_addLogHandler(@Nullable String subSystem, @Nullable String category, @NInt long logLevel,
                @NotNull String message);
    }
}