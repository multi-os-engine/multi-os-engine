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

import apple.foundation.NSError;
import apple.foundation.NSURLAuthenticationChallenge;
import apple.foundation.NSURLConnection;
import apple.foundation.NSURLProtectionSpace;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]       NSURLConnectionDelegate
 * <p>
 * Delegate methods that are common to all forms of
 * NSURLConnection.  These are all optional.  This
 * protocol should be considered a base class for the
 * NSURLConnectionDataDelegate and
 * NSURLConnectionDownloadDelegate protocols.
 * <p>
 * connection:didFailWithError: will be called at
 * most once, if an error occurs during a resource
 * load.  No other callbacks will be made after.<p>
 * <p>
 * connectionShouldUseCredentialStorage: will be
 * called at most once, before a resource load begins
 * (which means it may be called during construction
 * of the connection.)  The delegate should return
 * TRUE if the connection should consult the shared
 * NSURLCredentialStorage in response to
 * authentication challenges.  Regardless of the
 * result, the authentication challenge methods may
 * still be called.
 * <p>
 * connection:willSendRequestForAuthenticationChallenge:
 * is the preferred (Mac OS X 10.7 and iOS 5.0 or
 * later) mechanism for responding to authentication
 * challenges.  See
 * <Foundation/NSURLAuthenticationChallenge.h> for
 * more information on dealing with the various types
 * of authentication challenges.
 * <p>
 * connection:canAuthenticateAgainstProtectionSpace:
 * connection:didReciveAuthenticationChallenge:
 * connection:didCancelAuthenticationChallenge: are
 * deprected and new code should adopt
 * connection:willSendRequestForAuthenticationChallenge.
 * The older delegates will still be called for
 * compatability, but incur more latency in dealing
 * with the authentication challenge.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLConnectionDelegate")
public interface NSURLConnectionDelegate {
    @Generated
    @IsOptional
    @Deprecated
    @Selector("connection:canAuthenticateAgainstProtectionSpace:")
    default boolean connectionCanAuthenticateAgainstProtectionSpace(NSURLConnection connection,
            NSURLProtectionSpace protectionSpace) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("connection:didCancelAuthenticationChallenge:")
    default void connectionDidCancelAuthenticationChallenge(NSURLConnection connection,
            NSURLAuthenticationChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connection:didFailWithError:")
    default void connectionDidFailWithError(NSURLConnection connection, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("connection:didReceiveAuthenticationChallenge:")
    default void connectionDidReceiveAuthenticationChallenge(NSURLConnection connection,
            NSURLAuthenticationChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connection:willSendRequestForAuthenticationChallenge:")
    default void connectionWillSendRequestForAuthenticationChallenge(NSURLConnection connection,
            NSURLAuthenticationChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("connectionShouldUseCredentialStorage:")
    default boolean connectionShouldUseCredentialStorage(NSURLConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
