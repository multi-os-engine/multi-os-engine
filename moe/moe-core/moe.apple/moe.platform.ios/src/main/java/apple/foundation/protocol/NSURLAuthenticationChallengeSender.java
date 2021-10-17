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

package apple.foundation.protocol;

import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLCredential;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] NSURLAuthenticationChallengeSender
 * <p>
 * This protocol represents the sender of an
 * authentication challenge. It has methods to provide a credential,
 * to continue without any credential, getting whatever failure
 * result would happen in that case, cancel a challenge, perform the default
 * action as defined by the system, or reject the currently supplied protection-space
 * in the challenge.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLAuthenticationChallengeSender")
public interface NSURLAuthenticationChallengeSender {
    /**
     * cancelAuthenticationChallenge:
     */
    @Generated
    @Selector("cancelAuthenticationChallenge:")
    void cancelAuthenticationChallenge(NSURLAuthenticationChallenge challenge);

    /**
     * continueWithoutCredentialForAuthenticationChallenge:
     */
    @Generated
    @Selector("continueWithoutCredentialForAuthenticationChallenge:")
    void continueWithoutCredentialForAuthenticationChallenge(NSURLAuthenticationChallenge challenge);

    /**
     * performDefaultHandlingForAuthenticationChallenge:
     */
    @Generated
    @IsOptional
    @Selector("performDefaultHandlingForAuthenticationChallenge:")
    default void performDefaultHandlingForAuthenticationChallenge(NSURLAuthenticationChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * rejectProtectionSpaceAndContinueWithChallenge:
     */
    @Generated
    @IsOptional
    @Selector("rejectProtectionSpaceAndContinueWithChallenge:")
    default void rejectProtectionSpaceAndContinueWithChallenge(NSURLAuthenticationChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * useCredential:forAuthenticationChallenge:
     */
    @Generated
    @Selector("useCredential:forAuthenticationChallenge:")
    void useCredentialForAuthenticationChallenge(NSURLCredential credential, NSURLAuthenticationChallenge challenge);
}
