package apple.gamekit.protocol;

import apple.gamekit.GKGameActivity;
import apple.gamekit.GKPlayer;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 26.0
 */
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKGameActivityListener")
public interface GKGameActivityListener {
    /**
     * Called when a player intends to play for a specific game activity.
     * A completion handler block is provided to indicate whether the activity was successfully handled.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("player:wantsToPlayGameActivity:completionHandler:")
    default void playerWantsToPlayGameActivityCompletionHandler(@NotNull GKPlayer player,
            @NotNull GKGameActivity activity,
            @ObjCBlock(name = "call_playerWantsToPlayGameActivityCompletionHandler") @NotNull Block_playerWantsToPlayGameActivityCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playerWantsToPlayGameActivityCompletionHandler {
        @Generated
        void call_playerWantsToPlayGameActivityCompletionHandler(boolean handled);
    }
}