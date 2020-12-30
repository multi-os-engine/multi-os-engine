/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.localauthentication;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.security.opaque.SecAccessControlRef;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Class that represents an authentication context.
 * 
 * This context can be used for evaluating policies.
 * 
 * @see LAPolicy
 */
@Generated
@Library("LocalAuthentication")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class LAContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected LAContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native LAContext alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Determines if a particular policy can be evaluated.
     * 
     * Policies can have certain requirements which, when not satisfied, would always cause
     *             the policy evaluation to fail - e.g. a passcode set, a fingerprint
     *             enrolled with Touch ID or a face set up with Face ID. This method allows easy checking
     *             for such conditions.
     * 
     *             Applications should consume the returned value immediately and avoid relying on it
     *             for an extensive period of time. At least, it is guaranteed to stay valid until the
     *             application enters background.
     * 
     * [@warning]    Do not call this method in the reply block of evaluatePolicy:reply: because it could
     *             lead to a deadlock.
     * 
     * @param policy Policy for which the preflight check should be run.
     * 
     * @param error Optional output parameter which is set to nil if the policy can be evaluated, or it
     *              contains error information if policy evaluation is not possible.
     * 
     * @return YES if the policy can be evaluated, NO otherwise.
     */
    @Generated
    @Selector("canEvaluatePolicy:error:")
    public native boolean canEvaluatePolicyError(@NInt long policy,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Evaluates access control object for the specified operation.
     * 
     * Access control evaluation may involve prompting user for various kinds of interaction
     *             or authentication. Actual behavior is dependent on evaluated access control, device type,
     *             and can be affected by installed configuration profiles.
     * 
     *             Be sure to keep a strong reference to the context while the evaluation is in progress.
     *             Otherwise, an evaluation would be canceled when the context is being deallocated.
     * 
     *             The method does not block. Instead, the caller must provide a reply block to be
     *             called asynchronously when evaluation finishes. The block is executed on a private
     *             queue internal to the framework in an unspecified threading context. Other than that,
     *             no guarantee is made about which queue, thread, or run-loop the block is executed on.
     * 
     *             After successful access control evaluation, the LAContext can be used with keychain operations,
     *             so that they do not require user to authenticate.
     * 
     *             Access control evaluation may fail for various reasons, including user cancel, system cancel
     *             and others, see LAError codes.
     * 
     * [@warning] localizedReason parameter is mandatory and the call will throw NSInvalidArgumentException if
     *          nil or empty string is specified.
     * 
     * [@warning] Applications should also supply NSFaceIDUsageDescription key in the Info.plist. This key identifies
     *          a string value that contains a message to be displayed to users when the app is trying to use
     *          Face ID for the first time. Users can choose to allow or deny the use of Face ID by the app before
     *          the first use or later in Face ID privacy settings. When the use of Face ID is denied, evaluations
     *          will fail with LAErrorBiometryNotAvailable.
     * 
     * @param accessControl Access control object that is typically created by SecAccessControlCreateWithFlags.
     * 
     * @param operation Type of operation the access control will be used with.
     * 
     * @param localizedReason Application reason for authentication. This string must be provided in correct
     *                        localization and should be short and clear. It will be eventually displayed in
     *                        the authentication dialog subtitle for Touch ID or passcode. The name of the
     *                        calling application will be displayed in title, so it should not be duplicated here.
     * 
     *                        This parameter is mostly ignored by Face ID authentication. Face ID will show
     *                        generic instructions unless a customized fallback title is provided in
     *                        localizedFallbackTitle property. For that case, it will show the authentication
     *                        reason so that the instructions can be made consistent with the custom button
     *                        title. Therefore, you should make sure that users are already aware of the need
     *                        and reason for Face ID authentication before they have triggered the policy evaluation.
     * 
     * @param reply Reply block that is executed when access control evaluation finishes.
     *              success Reply parameter that is YES if the access control has been evaluated successfully or
     *                      NO if the evaluation failed.
     *              error Reply parameter that is nil if the access control has been evaluated successfully, or
     *                    it contains error information about the evaluation failure.
     */
    @Generated
    @Selector("evaluateAccessControl:operation:localizedReason:reply:")
    public native void evaluateAccessControlOperationLocalizedReasonReply(SecAccessControlRef accessControl,
            @NInt long operation, String localizedReason,
            @ObjCBlock(name = "call_evaluateAccessControlOperationLocalizedReasonReply") Block_evaluateAccessControlOperationLocalizedReasonReply reply);

    /**
     * Evaluates the specified policy.
     * 
     * Policy evaluation may involve prompting user for various kinds of interaction
     *             or authentication. Actual behavior is dependent on evaluated policy, device type,
     *             and can be affected by installed configuration profiles.
     * 
     *             Be sure to keep a strong reference to the context while the evaluation is in progress.
     *             Otherwise, an evaluation would be canceled when the context is being deallocated.
     * 
     *             The method does not block. Instead, the caller must provide a reply block to be
     *             called asynchronously when evaluation finishes. The block is executed on a private
     *             queue internal to the framework in an unspecified threading context. Other than that,
     *             no guarantee is made about which queue, thread, or run-loop the block is executed on.
     * 
     *             Implications of successful policy evaluation are policy specific. In general, this
     *             operation is not idempotent. Policy evaluation may fail for various reasons, including
     *             user cancel, system cancel and others, see LAError codes.
     * 
     * [@warning] localizedReason parameter is mandatory and the call will throw NSInvalidArgumentException if
     *          nil or empty string is specified.
     * 
     * [@warning] Applications should also supply NSFaceIDUsageDescription key in the Info.plist. This key identifies
     *          a string value that contains a message to be displayed to users when the app is trying to use
     *          Face ID for the first time. Users can choose to allow or deny the use of Face ID by the app before
     *          the first use or later in Face ID privacy settings. When the use of Face ID is denied, evaluations
     *          will fail with LAErrorBiometryNotAvailable.
     * 
     * [@li]          LAErrorUserFallback if user tapped the fallback button
     * [@li]          LAErrorUserCancel if user has tapped the Cancel button
     * [@li]          LAErrorSystemCancel if some system event interrupted the evaluation (e.g. Home button pressed).
     * 
     * @param policy Policy to be evaluated.
     * 
     * @param reply Reply block that is executed when policy evaluation finishes.
     *              success Reply parameter that is YES if the policy has been evaluated successfully or
     *                      NO if the evaluation failed.
     *              error Reply parameter that is nil if the policy has been evaluated successfully, or it
     *                    contains error information about the evaluation failure.
     * 
     * @param localizedReason Application reason for authentication. This string must be provided in correct
     *                        localization and should be short and clear. It will be eventually displayed in
     *                        the authentication dialog subtitle for Touch ID or passcode. The name of the
     *                        calling application will be displayed in title, so it should not be duplicated here.
     * 
     *                        This parameter is mostly ignored by Face ID authentication. Face ID will show
     *                        generic instructions unless a customized fallback title is provided in
     *                        localizedFallbackTitle property. For that case, it will show the authentication
     *                        reason so that the instructions can be made consistent with the custom button
     *                        title. Therefore, you should make sure that users are already aware of the need
     *                        and reason for Face ID authentication before they have triggered the policy evaluation.
     * 
     * @see LAError
     * 
     * Typical error codes returned by this call are:
     */
    @Generated
    @Selector("evaluatePolicy:localizedReason:reply:")
    public native void evaluatePolicyLocalizedReasonReply(@NInt long policy, String localizedReason,
            @ObjCBlock(name = "call_evaluatePolicyLocalizedReasonReply") Block_evaluatePolicyLocalizedReasonReply reply);

    /**
     * Contains policy domain state.
     * 
     * This property is set only when evaluatePolicy is called and succesful Touch ID or Face ID authentication
     *              was performed, or when canEvaluatePolicy succeeds for a biometric policy.
     *              It stays nil for all other cases.
     *              If biometric database was modified (fingers or faces were removed or added), evaluatedPolicyDomainState
     *              data will change. Nature of such database changes cannot be determined
     *              but comparing data of evaluatedPolicyDomainState after different evaluatePolicy
     *              will reveal the fact database was changed between calls.
     * 
     * [@warning] Please note that the value returned by this property can change exceptionally between major OS versions even if
     *          the state of biometry has not changed.
     */
    @Generated
    @Selector("evaluatedPolicyDomainState")
    public native NSData evaluatedPolicyDomainState();

    @Generated
    @Selector("init")
    public native LAContext init();

    /**
     * Invalidates the context.
     * 
     * The context is invalidated automatically when it is (auto)released. This method
     *             allows invalidating it manually while it is still in scope.
     * 
     *             Invalidation terminates any existing policy evaluation and the respective call will
     *             fail with LAErrorAppCancel. After the context has been invalidated, it can not be
     *             used for policy evaluation and an attempt to do so will fail with LAErrorInvalidContext.
     * 
     *             Invalidating a context that has been already invalidated has no effect.
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    /**
     * Reveals if credential was set with this context.
     * 
     * @param type Type of credential we are asking for.
     * 
     * @return YES on success, NO otherwise.
     */
    @Generated
    @Selector("isCredentialSet:")
    public native boolean isCredentialSet(@NInt long type);

    /**
     * Cancel button title.
     * 
     * Allows cancel button title customization. A default title "Cancel" is used when
     *             this property is left nil or is set to empty string.
     */
    @Generated
    @Selector("localizedCancelTitle")
    public native String localizedCancelTitle();

    /**
     * Fallback button title.
     * 
     * Allows fallback button title customization. If set to empty string, the button will be hidden.
     *             A default title "Enter Password" is used when this property is left nil.
     */
    @Generated
    @Selector("localizedFallbackTitle")
    public native String localizedFallbackTitle();

    /**
     * This property is deprecated and setting it has no effect.
     */
    @Generated
    @Deprecated
    @Selector("maxBiometryFailures")
    public native NSNumber maxBiometryFailures();

    /**
     * Sets a credential to this context.
     * 
     * Some policies allow to bind application-provided credential with them.
     *             This method allows credential to be passed to the right context.
     * 
     * @param credential Credential to be used with subsequent calls. Setting this parameter to nil will remove
     *                   any existing credential of the specified type.
     * 
     * @param type Type of the provided credential.
     * 
     * @return YES if the credential was set successfully, NO otherwise.
     */
    @Generated
    @Selector("setCredential:type:")
    public native boolean setCredentialType(NSData credential, @NInt long type);

    /**
     * Cancel button title.
     * 
     * Allows cancel button title customization. A default title "Cancel" is used when
     *             this property is left nil or is set to empty string.
     */
    @Generated
    @Selector("setLocalizedCancelTitle:")
    public native void setLocalizedCancelTitle(String value);

    /**
     * Fallback button title.
     * 
     * Allows fallback button title customization. If set to empty string, the button will be hidden.
     *             A default title "Enter Password" is used when this property is left nil.
     */
    @Generated
    @Selector("setLocalizedFallbackTitle:")
    public native void setLocalizedFallbackTitle(String value);

    /**
     * This property is deprecated and setting it has no effect.
     */
    @Generated
    @Deprecated
    @Selector("setMaxBiometryFailures:")
    public native void setMaxBiometryFailures(NSNumber value);

    /**
     * Time interval for accepting a successful Touch ID or Face ID device unlock (on the lock screen) from the past.
     * 
     * This property can be set with a time interval in seconds. If the device was successfully unlocked by
     *             biometry within this time interval, then biometric authentication on this context will succeed
     *             automatically and the reply block will be called without prompting user for Touch ID or Face ID.
     * 
     *             The default value is 0, meaning that no previous biometric unlock can be reused.
     * 
     *             This property is meant only for reusing biometric matches from the device lock screen.
     *             It does not allow reusing previous biometric matches in application or between applications.
     * 
     *             The maximum supported interval is 5 minutes and setting the value beyond 5 minutes does not increase
     *             the accepted interval.
     * 
     * @see LATouchIDAuthenticationMaximumAllowableReuseDuration
     */
    @Generated
    @Selector("setTouchIDAuthenticationAllowableReuseDuration:")
    public native void setTouchIDAuthenticationAllowableReuseDuration(double value);

    /**
     * Time interval for accepting a successful Touch ID or Face ID device unlock (on the lock screen) from the past.
     * 
     * This property can be set with a time interval in seconds. If the device was successfully unlocked by
     *             biometry within this time interval, then biometric authentication on this context will succeed
     *             automatically and the reply block will be called without prompting user for Touch ID or Face ID.
     * 
     *             The default value is 0, meaning that no previous biometric unlock can be reused.
     * 
     *             This property is meant only for reusing biometric matches from the device lock screen.
     *             It does not allow reusing previous biometric matches in application or between applications.
     * 
     *             The maximum supported interval is 5 minutes and setting the value beyond 5 minutes does not increase
     *             the accepted interval.
     * 
     * @see LATouchIDAuthenticationMaximumAllowableReuseDuration
     */
    @Generated
    @Selector("touchIDAuthenticationAllowableReuseDuration")
    public native double touchIDAuthenticationAllowableReuseDuration();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_evaluateAccessControlOperationLocalizedReasonReply {
        @Generated
        void call_evaluateAccessControlOperationLocalizedReasonReply(boolean success, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_evaluatePolicyLocalizedReasonReply {
        @Generated
        void call_evaluatePolicyLocalizedReasonReply(boolean success, NSError error);
    }

    /**
     * Indicates the type of the biometry supported by the device.
     * 
     * This property is set when canEvaluatePolicy has been called for a biometric policy.
     *              The default value is LABiometryTypeNone.
     */
    @Generated
    @Selector("biometryType")
    @NInt
    public native long biometryType();

    /**
     * Allows running authentication in non-interactive mode.
     * 
     * If the context is used in a keychain query by the means of kSecUseAuthenticationContext,
     *             then setting this property to YES has the same effect as passing kSecUseNoAuthenticationUI
     *             in the query, i.e. the keychain call will eventually fail with errSecInteractionNotAllowed
     *             instead of displaying the authentication UI.
     * 
     *             If this property is used with a LocalAuthentication evaluation, it will eventually fail with
     *             LAErrorNotInteractive instead of displaying the authentication UI.
     */
    @Generated
    @Selector("interactionNotAllowed")
    public native boolean interactionNotAllowed();

    /**
     * Allows setting the default localized authentication reason on context.
     * 
     * A localized string from this property is displayed in the authentication UI if the caller didn't specify
     *             its own authentication reason (e.g. a keychain operation with kSecUseAuthenticationContext). This property
     *             is ignored if the authentication reason was provided by caller.
     */
    @Generated
    @Selector("localizedReason")
    public native String localizedReason();

    /**
     * Allows running authentication in non-interactive mode.
     * 
     * If the context is used in a keychain query by the means of kSecUseAuthenticationContext,
     *             then setting this property to YES has the same effect as passing kSecUseNoAuthenticationUI
     *             in the query, i.e. the keychain call will eventually fail with errSecInteractionNotAllowed
     *             instead of displaying the authentication UI.
     * 
     *             If this property is used with a LocalAuthentication evaluation, it will eventually fail with
     *             LAErrorNotInteractive instead of displaying the authentication UI.
     */
    @Generated
    @Selector("setInteractionNotAllowed:")
    public native void setInteractionNotAllowed(boolean value);

    /**
     * Allows setting the default localized authentication reason on context.
     * 
     * A localized string from this property is displayed in the authentication UI if the caller didn't specify
     *             its own authentication reason (e.g. a keychain operation with kSecUseAuthenticationContext). This property
     *             is ignored if the authentication reason was provided by caller.
     */
    @Generated
    @Selector("setLocalizedReason:")
    public native void setLocalizedReason(String value);
}
