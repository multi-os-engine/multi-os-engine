package apple.shazamkit.protocol;

import apple.foundation.NSError;
import apple.shazamkit.SHMatch;
import apple.shazamkit.SHSession;
import apple.shazamkit.SHSignature;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Methods that the session calls with the result of a match request.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("ShazamKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SHSessionDelegate")
public interface SHSessionDelegate {
    /**
     * Tells the delegate that the query signature matches an item in the catalog.
     * 
     * - Parameters:
     * - session: The session object that performs the match.
     * - match: The matching items from the catalog.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("session:didFindMatch:")
    default void sessionDidFindMatch(@NotNull SHSession session, @NotNull SHMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the query signature doesn't match an item in the catalog, or that there's an error.
     * 
     * You can retry the match if the error indicates an issue in communicating with the catalog server, such as
     * ``SHError/Code/matchAttemptFailed``.
     * 
     * - Parameters:
     * - session: The session object that performs the match.
     * - signature: The query signature to use for the match.
     * - error: The error that occurs; otherwise, `nil`, which indicates that there's no match.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("session:didNotFindMatchForSignature:error:")
    default void sessionDidNotFindMatchForSignatureError(@NotNull SHSession session, @NotNull SHSignature signature,
            @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}
