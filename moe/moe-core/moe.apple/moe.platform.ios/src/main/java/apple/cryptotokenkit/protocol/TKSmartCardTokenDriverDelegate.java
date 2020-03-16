package apple.cryptotokenkit.protocol;

import apple.cryptotokenkit.TKSmartCard;
import apple.cryptotokenkit.TKSmartCardToken;
import apple.cryptotokenkit.TKSmartCardTokenDriver;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TKSmartCardTokenDriverDelegate")
public interface TKSmartCardTokenDriverDelegate extends TKTokenDriverDelegate {
    @Generated
    @Selector("tokenDriver:createTokenForSmartCard:AID:error:")
    TKSmartCardToken tokenDriverCreateTokenForSmartCardAIDError(TKSmartCardTokenDriver driver, TKSmartCard smartCard,
            NSData AID, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}