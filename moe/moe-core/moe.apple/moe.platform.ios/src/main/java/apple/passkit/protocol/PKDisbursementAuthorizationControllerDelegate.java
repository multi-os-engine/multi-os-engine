package apple.passkit.protocol;

import apple.passkit.PKDisbursementAuthorizationController;
import apple.passkit.PKDisbursementVoucher;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKDisbursementAuthorizationControllerDelegate")
public interface PKDisbursementAuthorizationControllerDelegate {
    /**
     * Sent to the delegate when disbursement controller has authorized the disbursement request.
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("disbursementAuthorizationController:didAuthorizeWithDisbursementVoucher:")
    void disbursementAuthorizationControllerDidAuthorizeWithDisbursementVoucher(
            PKDisbursementAuthorizationController controller, PKDisbursementVoucher disbursementVoucher);

    /**
     * Sent to the delegate when disbursement controller is finished. This may occur when
     * the user cancels the request or after the disbursement has been authorized.
     * 
     * API-Since: 12.2
     */
    @Generated
    @Selector("disbursementAuthorizationControllerDidFinish:")
    void disbursementAuthorizationControllerDidFinish(PKDisbursementAuthorizationController controller);
}