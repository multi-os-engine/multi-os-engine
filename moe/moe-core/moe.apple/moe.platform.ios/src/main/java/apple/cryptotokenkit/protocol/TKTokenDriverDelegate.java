package apple.cryptotokenkit.protocol;

import apple.cryptotokenkit.TKToken;
import apple.cryptotokenkit.TKTokenConfiguration;
import apple.cryptotokenkit.TKTokenDriver;
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
@ObjCProtocolName("TKTokenDriverDelegate")
public interface TKTokenDriverDelegate {
    @Generated
    @IsOptional
    @Selector("tokenDriver:terminateToken:")
    default void tokenDriverTerminateToken(TKTokenDriver driver, TKToken token) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("tokenDriver:tokenForConfiguration:error:")
    default TKToken tokenDriverTokenForConfigurationError(TKTokenDriver driver, TKTokenConfiguration configuration,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error) {
        throw new java.lang.UnsupportedOperationException();
    }
}