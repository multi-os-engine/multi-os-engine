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
 * All communication about matches is performed through this delegate.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("ShazamKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SHSessionDelegate")
public interface SHSessionDelegate {
    /**
     * A match was found in the @c SHCatalog for the provided @c SHSignature
     * 
     * @param session The @c SHSession that made the match
     * @param match   The @c SHMatch of the matching audio
     */
    @Generated
    @IsOptional
    @Selector("session:didFindMatch:")
    default void sessionDidFindMatch(@NotNull SHSession session, @NotNull SHMatch match) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The @c SHSignature did not match anything
     * 
     * @param session   The @c SHSession that attempted to match the @c SHSignature
     * @param signature The @c SHSignature that did not match
     * @param error     An optional error. If simply no match was found this will be set to nil. It will be populated if
     *                  there was an issue performing the match
     */
    @Generated
    @IsOptional
    @Selector("session:didNotFindMatchForSignature:error:")
    default void sessionDidNotFindMatchForSignatureError(@NotNull SHSession session, @NotNull SHSignature signature,
            @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}
