package apple.passkit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.passkit.PKAddSecureElementPassViewController;
import apple.passkit.PKSecureElementPass;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKAddSecureElementPassViewControllerDelegate")
public interface PKAddSecureElementPassViewControllerDelegate {
    @Generated
    @Selector("addSecureElementPassViewController:didFinishAddingSecureElementPass:error:")
    void addSecureElementPassViewControllerDidFinishAddingSecureElementPassError(
            PKAddSecureElementPassViewController controller, PKSecureElementPass pass, NSError error);

    @Generated
    @Selector("addSecureElementPassViewController:didFinishAddingSecureElementPasses:error:")
    void addSecureElementPassViewControllerDidFinishAddingSecureElementPassesError(
            PKAddSecureElementPassViewController controller, NSArray<? extends PKSecureElementPass> passes,
            NSError error);
}