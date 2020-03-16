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

@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TKTokenDelegate")
public interface TKTokenDelegate {
    @Generated
    @Selector("token:createSessionWithError:")
    TKTokenSession tokenCreateSessionWithError(TKToken token, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @IsOptional
    @Selector("token:terminateSession:")
    default void tokenTerminateSession(TKToken token, TKTokenSession session) {
        throw new java.lang.UnsupportedOperationException();
    }
}