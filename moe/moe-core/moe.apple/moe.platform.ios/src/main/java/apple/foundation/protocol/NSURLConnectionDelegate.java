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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLConnectionDelegate")
public interface NSURLConnectionDelegate {
    /**
     * connection:canAuthenticateAgainstProtectionSpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDelegate/connection:canAuthenticateAgainstProtectionSpace:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("connection:canAuthenticateAgainstProtectionSpace:")
    default boolean connectionCanAuthenticateAgainstProtectionSpace(NSURLConnection connection,
            NSURLProtectionSpace protectionSpace) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * connection:didCancelAuthenticationChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDelegate/connection:didCancelAuthenticationChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("connection:didCancelAuthenticationChallenge:")
    default void connectionDidCancelAuthenticationChallenge(NSURLConnection connection,
            NSURLAuthenticationChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * connection:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDelegate/connection:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("connection:didFailWithError:")
    default void connectionDidFailWithError(NSURLConnection connection, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * connection:didReceiveAuthenticationChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDelegate/connection:didReceiveAuthenticationChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("connection:didReceiveAuthenticationChallenge:")
    default void connectionDidReceiveAuthenticationChallenge(NSURLConnection connection,
            NSURLAuthenticationChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * connection:willSendRequestForAuthenticationChallenge:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDelegate/connection:willSendRequestForAuthenticationChallenge:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("connection:willSendRequestForAuthenticationChallenge:")
    default void connectionWillSendRequestForAuthenticationChallenge(NSURLConnection connection,
            NSURLAuthenticationChallenge challenge) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * connectionShouldUseCredentialStorage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLConnectionDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLConnectionDelegate/connectionShouldUseCredentialStorage:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("connectionShouldUseCredentialStorage:")
    default boolean connectionShouldUseCredentialStorage(NSURLConnection connection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
