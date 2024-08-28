package apple.authenticationservices.protocol;

import apple.authenticationservices.ASAccountAuthenticationModificationController;
import apple.authenticationservices.ASAccountAuthenticationModificationRequest;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ASAccountAuthenticationModificationControllerDelegate")
public interface ASAccountAuthenticationModificationControllerDelegate {
    @Generated
    @IsOptional
    @Selector("accountAuthenticationModificationController:didFailRequest:withError:")
    default void accountAuthenticationModificationControllerDidFailRequestWithError(
            @NotNull ASAccountAuthenticationModificationController controller,
            @NotNull ASAccountAuthenticationModificationRequest request, @NotNull NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("accountAuthenticationModificationController:didSuccessfullyCompleteRequest:withUserInfo:")
    default void accountAuthenticationModificationControllerDidSuccessfullyCompleteRequestWithUserInfo(
            @NotNull ASAccountAuthenticationModificationController controller,
            @NotNull ASAccountAuthenticationModificationRequest request, @Nullable NSDictionary<?, ?> userInfo) {
        throw new java.lang.UnsupportedOperationException();
    }
}