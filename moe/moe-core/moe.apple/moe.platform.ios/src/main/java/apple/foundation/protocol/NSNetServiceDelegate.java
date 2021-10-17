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

import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSInputStream;
import apple.foundation.NSNetService;
import apple.foundation.NSNumber;
import apple.foundation.NSOutputStream;
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
@ObjCProtocolName("NSNetServiceDelegate")
public interface NSNetServiceDelegate {
    /**
     * Sent to a published NSNetService instance's delegate when a new connection is
     * * received. Before you can communicate with the connecting client, you must -open
     * * and schedule the streams. To reject a connection, just -open both streams and
     * * then immediately -close them.
     * <p>
     * * To enable TLS on the stream, set the various TLS settings using
     * * kCFStreamPropertySSLSettings before calling -open. You must also specify
     * * kCFBooleanTrue for kCFStreamSSLIsServer in the settings dictionary along with
     * * a valid SecIdentityRef as the first entry of kCFStreamSSLCertificates.
     */
    @Generated
    @IsOptional
    @Selector("netService:didAcceptConnectionWithInputStream:outputStream:")
    default void netServiceDidAcceptConnectionWithInputStreamOutputStream(NSNetService sender,
            NSInputStream inputStream, NSOutputStream outputStream) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetService instance's delegate when an error in publishing the instance occurs. The error dictionary will contain two key/value pairs representing the error domain and code (see the NSNetServicesError enumeration above for error code constants). It is possible for an error to occur after a successful publication.
     */
    @Generated
    @IsOptional
    @Selector("netService:didNotPublish:")
    default void netServiceDidNotPublish(NSNetService sender, NSDictionary<String, ? extends NSNumber> errorDict) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetService instance's delegate when an error in resolving the instance occurs. The error dictionary will contain two key/value pairs representing the error domain and code (see the NSNetServicesError enumeration above for error code constants).
     */
    @Generated
    @IsOptional
    @Selector("netService:didNotResolve:")
    default void netServiceDidNotResolve(NSNetService sender, NSDictionary<String, ? extends NSNumber> errorDict) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetService instance's delegate when the instance is being monitored and the instance's TXT record has been updated. The new record is contained in the data parameter.
     */
    @Generated
    @IsOptional
    @Selector("netService:didUpdateTXTRecordData:")
    default void netServiceDidUpdateTXTRecordData(NSNetService sender, NSData data) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetService instance's delegate when the publication of the instance is complete and successful.
     */
    @Generated
    @IsOptional
    @Selector("netServiceDidPublish:")
    default void netServiceDidPublish(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetService instance's delegate when one or more addresses have been resolved for an NSNetService instance. Some NSNetService methods will return different results before and after a successful resolution. An NSNetService instance may get resolved more than once; truly robust clients may wish to resolve again after an error, or to resolve more than once.
     */
    @Generated
    @IsOptional
    @Selector("netServiceDidResolveAddress:")
    default void netServiceDidResolveAddress(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetService instance's delegate when the instance's previously running publication or resolution request has stopped.
     */
    @Generated
    @IsOptional
    @Selector("netServiceDidStop:")
    default void netServiceDidStop(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetService instance's delegate prior to advertising the service on the network. If for some reason the service cannot be published, the delegate will not receive this message, and an error will be delivered to the delegate via the delegate's -netService:didNotPublish: method.
     */
    @Generated
    @IsOptional
    @Selector("netServiceWillPublish:")
    default void netServiceWillPublish(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Sent to the NSNetService instance's delegate prior to resolving a service on the network. If for some reason the resolution cannot occur, the delegate will not receive this message, and an error will be delivered to the delegate via the delegate's -netService:didNotResolve: method.
     */
    @Generated
    @IsOptional
    @Selector("netServiceWillResolve:")
    default void netServiceWillResolve(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }
}
