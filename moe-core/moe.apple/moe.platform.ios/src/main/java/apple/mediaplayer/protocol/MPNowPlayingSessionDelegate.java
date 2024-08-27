package apple.mediaplayer.protocol;

import apple.mediaplayer.MPNowPlayingSession;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 16.0
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNowPlayingSessionDelegate")
public interface MPNowPlayingSessionDelegate {
    /**
     * Tells the delegate that the session has changed its active status.
     */
    @Generated
    @IsOptional
    @Selector("nowPlayingSessionDidChangeActive:")
    default void nowPlayingSessionDidChangeActive(@NotNull MPNowPlayingSession nowPlayingSession) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the session has changed its can become active status.
     */
    @Generated
    @IsOptional
    @Selector("nowPlayingSessionDidChangeCanBecomeActive:")
    default void nowPlayingSessionDidChangeCanBecomeActive(@NotNull MPNowPlayingSession nowPlayingSession) {
        throw new java.lang.UnsupportedOperationException();
    }
}