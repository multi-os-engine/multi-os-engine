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

/**
 * @discussion TKSmartCardTokenDriverDelegate is used to implement creation of new token instance according to the SmartCard.
 */
@Generated
@Library("CryptoTokenKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("TKSmartCardTokenDriverDelegate")
public interface TKSmartCardTokenDriverDelegate extends TKTokenDriverDelegate {
    /**
     * @discussion Called by system when new SmartCard is detected.  You must override this method to create a new valid token TKSmartCardToken instance for @c smartCard.
     * @param smartCard Target SmartCard.
     * @param AID ISO7816-4 AID (application ID) which is already selected on the card.  If @c com.apple.ctk.aid is not present, no application is selected and this parameter is nil.
     * @param error Error details if operation fails.
     * @return Newly created token instance representing @c smartCard.  If an error occurs or driver decides that it does not want to handle specified smartCard as token, return nil.
     */
    @Generated
    @Selector("tokenDriver:createTokenForSmartCard:AID:error:")
    TKSmartCardToken tokenDriverCreateTokenForSmartCardAIDError(TKSmartCardTokenDriver driver, TKSmartCard smartCard,
            NSData AID, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}