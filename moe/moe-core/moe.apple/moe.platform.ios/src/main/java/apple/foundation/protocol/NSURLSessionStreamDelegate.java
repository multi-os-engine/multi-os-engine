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
     * A notification that the system has determined that a better route
     * to the host has been detected (eg, a wi-fi interface becoming
     * available.) This is a hint to the delegate that it may be
     * desirable to create a new task for subsequent work. Note that
     * there is no guarantee that the future task will be able to connect
     * to the host, so callers should should be prepared for failure of
     * reads and writes over any new interface.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:betterRouteDiscoveredForStreamTask:")
    default void URLSessionBetterRouteDiscoveredForStreamTask(NSURLSession session, NSURLSessionStreamTask streamTask) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indiciates that the read side of a connection has been closed. Any
     * outstanding reads complete, but future reads will immediately fail.
     * This may be sent even when no reads are in progress. However, when
     * this delegate message is received, there may still be bytes
     * available. You only know that no more bytes are available when you
     * are able to read until EOF.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:readClosedForStreamTask:")
    default void URLSessionReadClosedForStreamTask(NSURLSession session, NSURLSessionStreamTask streamTask) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The given task has been completed, and unopened NSInputStream and
     * NSOutputStream objects are created from the underlying network
     * connection. This will only be invoked after all enqueued IO has
     * completed (including any necessary handshakes.) The streamTask
     * will not receive any further delegate messages.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:streamTask:didBecomeInputStream:outputStream:")
    default void URLSessionStreamTaskDidBecomeInputStreamOutputStream(NSURLSession session,
            NSURLSessionStreamTask streamTask, NSInputStream inputStream, NSOutputStream outputStream) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indiciates that the write side of a connection has been closed.
     * Any outstanding writes complete, but future writes will immediately
     * fail.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:writeClosedForStreamTask:")
    default void URLSessionWriteClosedForStreamTask(NSURLSession session, NSURLSessionStreamTask streamTask) {
        throw new java.lang.UnsupportedOperationException();
    }
}
