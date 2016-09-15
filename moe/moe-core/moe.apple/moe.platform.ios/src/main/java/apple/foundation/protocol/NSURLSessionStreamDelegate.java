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

import apple.foundation.NSInputStream;
import apple.foundation.NSOutputStream;
import apple.foundation.NSURLSession;
import apple.foundation.NSURLSessionStreamTask;
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
@ObjCProtocolName("NSURLSessionStreamDelegate")
public interface NSURLSessionStreamDelegate extends NSURLSessionTaskDelegate {
    /**
     * URLSession:betterRouteDiscoveredForStreamTask:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLSessionStreamDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLSessionStreamDelegate/URLSession:betterRouteDiscoveredForStreamTask:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("URLSession:betterRouteDiscoveredForStreamTask:")
    default void URLSessionBetterRouteDiscoveredForStreamTask(NSURLSession session, NSURLSessionStreamTask streamTask) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:readClosedForStreamTask:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLSessionStreamDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLSessionStreamDelegate/URLSession:readClosedForStreamTask:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("URLSession:readClosedForStreamTask:")
    default void URLSessionReadClosedForStreamTask(NSURLSession session, NSURLSessionStreamTask streamTask) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:streamTask:didBecomeInputStream:outputStream:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLSessionStreamDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLSessionStreamDelegate/URLSession:streamTask:didBecomeInputStream:outputStream:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("URLSession:streamTask:didBecomeInputStream:outputStream:")
    default void URLSessionStreamTaskDidBecomeInputStreamOutputStream(NSURLSession session,
            NSURLSessionStreamTask streamTask, NSInputStream inputStream, NSOutputStream outputStream) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * URLSession:writeClosedForStreamTask:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLSessionStreamDelegate_Protocol/index.html#//apple_ref/occ/intfm/NSURLSessionStreamDelegate/URLSession:writeClosedForStreamTask:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("URLSession:writeClosedForStreamTask:")
    default void URLSessionWriteClosedForStreamTask(NSURLSession session, NSURLSessionStreamTask streamTask) {
        throw new java.lang.UnsupportedOperationException();
    }
}
