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
     * netService:didAcceptConnectionWithInputStream:outputStream:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netService:didAcceptConnectionWithInputStream:outputStream:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netService:didAcceptConnectionWithInputStream:outputStream:")
    default void netServiceDidAcceptConnectionWithInputStreamOutputStream(NSNetService sender,
            NSInputStream inputStream, NSOutputStream outputStream) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * netService:didNotPublish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netService:didNotPublish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netService:didNotPublish:")
    default void netServiceDidNotPublish(NSNetService sender, NSDictionary<String, ? extends NSNumber> errorDict) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * netService:didNotResolve:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netService:didNotResolve:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netService:didNotResolve:")
    default void netServiceDidNotResolve(NSNetService sender, NSDictionary<String, ? extends NSNumber> errorDict) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * netService:didUpdateTXTRecordData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netService:didUpdateTXTRecordData:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netService:didUpdateTXTRecordData:")
    default void netServiceDidUpdateTXTRecordData(NSNetService sender, NSData data) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * netServiceDidPublish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netServiceDidPublish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netServiceDidPublish:")
    default void netServiceDidPublish(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * netServiceDidResolveAddress:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netServiceDidResolveAddress:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netServiceDidResolveAddress:")
    default void netServiceDidResolveAddress(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * netServiceDidStop:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netServiceDidStop:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netServiceDidStop:")
    default void netServiceDidStop(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * netServiceWillPublish:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netServiceWillPublish:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netServiceWillPublish:")
    default void netServiceWillPublish(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * netServiceWillResolve:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSNetServiceDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSNetServiceDelegate/netServiceWillResolve:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("netServiceWillResolve:")
    default void netServiceWillResolve(NSNetService sender) {
        throw new java.lang.UnsupportedOperationException();
    }
}
