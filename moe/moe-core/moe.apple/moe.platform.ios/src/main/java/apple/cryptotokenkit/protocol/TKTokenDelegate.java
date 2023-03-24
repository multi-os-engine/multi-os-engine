package apple.cryptotokenkit.protocol;

import apple.cryptotokenkit.TKToken;
import apple.cryptotokenkit.TKTokenSession;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * TKTokenDelegate contains operations implementing functionality of token class.
 * 
 * TKTokenDelegate represents protocol which must be implemented by token implementors' class representing token. Apart
 * from being able to identify itself with its unique identifier, and must be able to establish new TKTokenSession when
 * requested.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TKTokenDelegate")
public interface TKTokenDelegate {
    /**
     * Create new session instance
     * 
     * All operations with objects on the token are performed inside TKTokenSession which represent authentication
     * context. This method is called whenever new authentication context is needed (typically when client application
     * wants to perform token operation using keychain object which has associated LocalAuthentication LAContext which
     * was not yet seen by this token instance).
     * 
     * @param token Related token instance.
     */
    @Nullable
    @Generated
    @Selector("token:createSessionWithError:")
    TKTokenSession tokenCreateSessionWithError(@NotNull TKToken token,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Terminates previously created session, implementation should free all associated resources.
     * 
     * @param token Related token instance.
     */
    @Generated
    @IsOptional
    @Selector("token:terminateSession:")
    default void tokenTerminateSession(@NotNull TKToken token, @NotNull TKTokenSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}
