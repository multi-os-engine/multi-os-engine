package apple.extensionkit.protocol;

import apple.extensionkit.EXHostViewController;
import apple.foundation.NSError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The delegate for a hosted view controller.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("ExtensionKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EXHostViewControllerDelegate")
public interface EXHostViewControllerDelegate {
    /**
     * Tells the host that the app extension is active and ready to accept an XPC connection.
     * 
     * The host view controller calls this method after it launches an app extension and
     * connects to its remote scene. Use this method to establish an XPC connection to
     * the newly created UI instance.
     * 
     * - Parameters:
     * - viewController: The host view controller that initiated the connection.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("hostViewControllerDidActivate:")
    default void hostViewControllerDidActivate(@NotNull EXHostViewController viewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the host that the app extension disconnected and is no longer available.
     * 
     * The host view controller calls this method when the app extension exits or when
     * you change the view controller’s ``EXHostViewController/configuration`` property.
     * Use this method to close out the previous connection to the app extension.
     * 
     * - Parameters:
     * - viewController: The host view controller that initiated the connection.
     * - error: An error object indicating why the app extension disconnected, or `nil`
     * if the extension exited without issues.
     * 
     * API-Since: 26.0
     */
    @Generated
    @IsOptional
    @Selector("hostViewControllerWillDeactivate:error:")
    default void hostViewControllerWillDeactivateError(@NotNull EXHostViewController viewController,
            @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }
}