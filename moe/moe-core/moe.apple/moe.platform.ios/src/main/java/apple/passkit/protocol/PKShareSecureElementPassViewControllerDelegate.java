package apple.passkit.protocol;

import apple.foundation.NSURL;
import apple.passkit.PKShareSecureElementPassViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKShareSecureElementPassViewControllerDelegate")
public interface PKShareSecureElementPassViewControllerDelegate {
    /**
     * This is called when using the `PKShareSecureElementPassViewControllerFlowDoNotPromptToShareURL` flow.
     * 
     * Upon a successful share the share URL will be returned to be sent over an internal messaging channel.
     * In an activation code was attached to the share it will also be returned. It it is up to the delegate
     * to show the user the activationCode so that the recipient can successfully redeem the share.
     */
    @Generated
    @IsOptional
    @Selector("shareSecureElementPassViewController:didCreateShareURL:activationCode:")
    default void shareSecureElementPassViewControllerDidCreateShareURLActivationCode(
            @NotNull PKShareSecureElementPassViewController controller, @Nullable NSURL universalShareURL,
            @Nullable String activationCode) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called once the share pass flow finishes.
     * 
     * The delegate is responsible for dismissing the view controller in this method.
     */
    @Generated
    @Selector("shareSecureElementPassViewController:didFinishWithResult:")
    void shareSecureElementPassViewControllerDidFinishWithResult(
            @NotNull PKShareSecureElementPassViewController controller, @NInt long result);
}