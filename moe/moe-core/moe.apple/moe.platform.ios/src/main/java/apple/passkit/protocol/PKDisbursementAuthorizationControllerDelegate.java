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
    @Generated
    @Selector("disbursementAuthorizationController:didAuthorizeWithDisbursementVoucher:")
    void disbursementAuthorizationControllerDidAuthorizeWithDisbursementVoucher(
            PKDisbursementAuthorizationController controller, PKDisbursementVoucher disbursementVoucher);

    @Generated
    @Selector("disbursementAuthorizationControllerDidFinish:")
    void disbursementAuthorizationControllerDidFinish(PKDisbursementAuthorizationController controller);
}