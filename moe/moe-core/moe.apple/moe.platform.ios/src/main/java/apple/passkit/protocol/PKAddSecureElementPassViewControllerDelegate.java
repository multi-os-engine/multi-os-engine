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
import org.moe.natj.objc.ann.IsOptional;

/**
 * API-Since: 13.4
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKAddSecureElementPassViewControllerDelegate")
public interface PKAddSecureElementPassViewControllerDelegate {
    /**
     * API-Since: 13.4
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use addSecureElementPassViewController:didFinishAddingSecureElementPasses:error: instead
     */
    @IsOptional
    @Deprecated
    @Generated
    @Selector("addSecureElementPassViewController:didFinishAddingSecureElementPass:error:")
    default void addSecureElementPassViewControllerDidFinishAddingSecureElementPassError(
            PKAddSecureElementPassViewController controller, PKSecureElementPass pass, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("addSecureElementPassViewController:didFinishAddingSecureElementPasses:error:")
    void addSecureElementPassViewControllerDidFinishAddingSecureElementPassesError(
            PKAddSecureElementPassViewController controller, NSArray<? extends PKSecureElementPass> passes,
            NSError error);
}