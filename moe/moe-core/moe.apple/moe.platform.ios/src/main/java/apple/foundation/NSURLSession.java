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

package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSURLSessionDelegate;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLSession allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Please use +[NSURLSession sessionWithConfiguration:] or other class methods to create
     * instances
     */
    @Deprecated
    @Generated
    @Owned
    @Selector("new")
    public static native NSURLSession new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Customization of NSURLSession occurs during creation of a new session.
     * If you only need to use the convenience routines with custom
     * configuration options it is not necessary to specify a delegate.
     * If you do specify a delegate, the delegate will be retained until after
     * the delegate has been sent the URLSession:didBecomeInvalidWithError: message.
     */
    @NotNull
    @Generated
    @Selector("sessionWithConfiguration:")
    public static native NSURLSession sessionWithConfiguration(@NotNull NSURLSessionConfiguration configuration);

    @NotNull
    @Generated
    @Selector("sessionWithConfiguration:delegate:delegateQueue:")
    public static native NSURLSession sessionWithConfigurationDelegateDelegateQueue(
            @NotNull NSURLSessionConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) NSURLSessionDelegate delegate, @Nullable NSOperationQueue queue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The shared session uses the currently set global NSURLCache,
     * NSHTTPCookieStorage and NSURLCredentialStorage objects.
     */
    @NotNull
    @Generated
    @Selector("sharedSession")
    public static native NSURLSession sharedSession();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Selector("configuration")
    public native NSURLSessionConfiguration configuration();

    /**
     * Creates a data task with the given request. The request may have a body stream.
     */
    @NotNull
    @Generated
    @Selector("dataTaskWithRequest:")
    public native NSURLSessionDataTask dataTaskWithRequest(@NotNull NSURLRequest request);

    /**
     * data task convenience methods. These methods create tasks that
     * bypass the normal delegate calls for response and data delivery,
     * and provide a simple cancelable asynchronous interface to receiving
     * data. Errors will be returned in the NSURLErrorDomain,
     * see <Foundation/NSURLError.h>. The delegate, if any, will still be
     * called for authentication challenges.
     */
    @NotNull
    @Generated
    @Selector("dataTaskWithRequest:completionHandler:")
    public native NSURLSessionDataTask dataTaskWithRequestCompletionHandler(@NotNull NSURLRequest request,
            @NotNull @ObjCBlock(name = "call_dataTaskWithRequestCompletionHandler") Block_dataTaskWithRequestCompletionHandler completionHandler);

    /**
     * Creates a data task to retrieve the contents of the given URL.
     */
    @NotNull
    @Generated
    @Selector("dataTaskWithURL:")
    public native NSURLSessionDataTask dataTaskWithURL(@NotNull NSURL url);

    @NotNull
    @Generated
    @Selector("dataTaskWithURL:completionHandler:")
    public native NSURLSessionDataTask dataTaskWithURLCompletionHandler(@NotNull NSURL url,
            @NotNull @ObjCBlock(name = "call_dataTaskWithURLCompletionHandler") Block_dataTaskWithURLCompletionHandler completionHandler);

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSURLSessionDelegate delegate();

    @NotNull
    @Generated
    @Selector("delegateQueue")
    public native NSOperationQueue delegateQueue();

    /**
     * Creates a download task with the given request.
     */
    @NotNull
    @Generated
    @Selector("downloadTaskWithRequest:")
    public native NSURLSessionDownloadTask downloadTaskWithRequest(@NotNull NSURLRequest request);

    /**
     * download task convenience methods. When a download successfully
     * completes, the NSURL will point to a file that must be read or
     * copied during the invocation of the completion routine. The file
     * will be removed automatically.
     */
    @NotNull
    @Generated
    @Selector("downloadTaskWithRequest:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithRequestCompletionHandler(@NotNull NSURLRequest request,
            @NotNull @ObjCBlock(name = "call_downloadTaskWithRequestCompletionHandler") Block_downloadTaskWithRequestCompletionHandler completionHandler);

    /**
     * Creates a download task with the resume data. If the download cannot be successfully resumed,
     * URLSession:task:didCompleteWithError: will be called.
     */
    @NotNull
    @Generated
    @Selector("downloadTaskWithResumeData:")
    public native NSURLSessionDownloadTask downloadTaskWithResumeData(@NotNull NSData resumeData);

    @NotNull
    @Generated
    @Selector("downloadTaskWithResumeData:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithResumeDataCompletionHandler(@NotNull NSData resumeData,
            @NotNull @ObjCBlock(name = "call_downloadTaskWithResumeDataCompletionHandler") Block_downloadTaskWithResumeDataCompletionHandler completionHandler);

    /**
     * Creates a download task to download the contents of the given URL.
     */
    @NotNull
    @Generated
    @Selector("downloadTaskWithURL:")
    public native NSURLSessionDownloadTask downloadTaskWithURL(@NotNull NSURL url);

    @NotNull
    @Generated
    @Selector("downloadTaskWithURL:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithURLCompletionHandler(@NotNull NSURL url,
            @NotNull @ObjCBlock(name = "call_downloadTaskWithURLCompletionHandler") Block_downloadTaskWithURLCompletionHandler completionHandler);

    /**
     * -finishTasksAndInvalidate returns immediately and existing tasks will be allowed
     * to run to completion. New tasks may not be created. The session
     * will continue to make delegate callbacks until URLSession:didBecomeInvalidWithError:
     * has been issued.
     * 
     * -finishTasksAndInvalidate and -invalidateAndCancel do not
     * have any effect on the shared session singleton.
     * 
     * When invalidating a background session, it is not safe to create another background
     * session with the same identifier until URLSession:didBecomeInvalidWithError: has
     * been issued.
     */
    @Generated
    @Selector("finishTasksAndInvalidate")
    public native void finishTasksAndInvalidate();

    /**
     * flush storage to disk and clear transient network caches. Invokes completionHandler() on the delegate queue.
     */
    @Generated
    @Selector("flushWithCompletionHandler:")
    public native void flushWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_flushWithCompletionHandler") Block_flushWithCompletionHandler completionHandler);

    /**
     * invokes completionHandler with all outstanding tasks.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("getAllTasksWithCompletionHandler:")
    public native void getAllTasksWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getAllTasksWithCompletionHandler") Block_getAllTasksWithCompletionHandler completionHandler);

    /**
     * invokes completionHandler with outstanding data, upload and download tasks.
     */
    @Generated
    @Selector("getTasksWithCompletionHandler:")
    public native void getTasksWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getTasksWithCompletionHandler") Block_getTasksWithCompletionHandler completionHandler);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Please use +[NSURLSession sessionWithConfiguration:] or other class methods to create
     * instances
     */
    @Deprecated
    @Generated
    @Selector("init")
    public native NSURLSession init();

    /**
     * -invalidateAndCancel acts as -finishTasksAndInvalidate, but issues
     * -cancel to all outstanding tasks for this session. Note task
     * cancellation is subject to the state of the task, and some tasks may
     * have already have completed at the time they are sent -cancel.
     */
    @Generated
    @Selector("invalidateAndCancel")
    public native void invalidateAndCancel();

    /**
     * empty all cookies, cache and credential stores, removes disk files, issues -flushWithCompletionHandler:. Invokes
     * completionHandler() on the delegate queue.
     */
    @Generated
    @Selector("resetWithCompletionHandler:")
    public native void resetWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_resetWithCompletionHandler") Block_resetWithCompletionHandler completionHandler);

    /**
     * The sessionDescription property is available for the developer to
     * provide a descriptive label for the session.
     */
    @Nullable
    @Generated
    @Selector("sessionDescription")
    public native String sessionDescription();

    /**
     * The sessionDescription property is available for the developer to
     * provide a descriptive label for the session.
     */
    @Generated
    @Selector("setSessionDescription:")
    public native void setSessionDescription(@Nullable String value);

    /**
     * Creates a bidirectional stream task to a given host and port.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("streamTaskWithHostName:port:")
    public native NSURLSessionStreamTask streamTaskWithHostNamePort(@NotNull String hostname, @NInt long port);

    /**
     * Creates a bidirectional stream task with an NSNetService to identify the endpoint.
     * The NSNetService will be resolved before any IO completes.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use nw_connection_t in Network framework instead
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("streamTaskWithNetService:")
    public native NSURLSessionStreamTask streamTaskWithNetService(@NotNull NSNetService service);

    /**
     * Creates an upload task with the given request. The body of the request is provided from the bodyData.
     */
    @NotNull
    @Generated
    @Selector("uploadTaskWithRequest:fromData:")
    public native NSURLSessionUploadTask uploadTaskWithRequestFromData(@NotNull NSURLRequest request,
            @NotNull NSData bodyData);

    @NotNull
    @Generated
    @Selector("uploadTaskWithRequest:fromData:completionHandler:")
    public native NSURLSessionUploadTask uploadTaskWithRequestFromDataCompletionHandler(@NotNull NSURLRequest request,
            @Nullable NSData bodyData,
            @NotNull @ObjCBlock(name = "call_uploadTaskWithRequestFromDataCompletionHandler") Block_uploadTaskWithRequestFromDataCompletionHandler completionHandler);

    /**
     * Creates an upload task with the given request. The body of the request will be created from the file referenced
     * by fileURL
     */
    @NotNull
    @Generated
    @Selector("uploadTaskWithRequest:fromFile:")
    public native NSURLSessionUploadTask uploadTaskWithRequestFromFile(@NotNull NSURLRequest request,
            @NotNull NSURL fileURL);

    /**
     * upload convenience method.
     */
    @NotNull
    @Generated
    @Selector("uploadTaskWithRequest:fromFile:completionHandler:")
    public native NSURLSessionUploadTask uploadTaskWithRequestFromFileCompletionHandler(@NotNull NSURLRequest request,
            @NotNull NSURL fileURL,
            @NotNull @ObjCBlock(name = "call_uploadTaskWithRequestFromFileCompletionHandler") Block_uploadTaskWithRequestFromFileCompletionHandler completionHandler);

    /**
     * Creates an upload task with the given request. The previously set body stream of the request (if any) is ignored
     * and the URLSession:task:needNewBodyStream: delegate will be called when the body payload is required.
     */
    @NotNull
    @Generated
    @Selector("uploadTaskWithStreamedRequest:")
    public native NSURLSessionUploadTask uploadTaskWithStreamedRequest(@NotNull NSURLRequest request);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dataTaskWithRequestCompletionHandler {
        @Generated
        void call_dataTaskWithRequestCompletionHandler(@Nullable NSData data, @Nullable NSURLResponse response,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dataTaskWithURLCompletionHandler {
        @Generated
        void call_dataTaskWithURLCompletionHandler(@Nullable NSData data, @Nullable NSURLResponse response,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadTaskWithRequestCompletionHandler {
        @Generated
        void call_downloadTaskWithRequestCompletionHandler(@Nullable NSURL location, @Nullable NSURLResponse response,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadTaskWithResumeDataCompletionHandler {
        @Generated
        void call_downloadTaskWithResumeDataCompletionHandler(@Nullable NSURL location,
                @Nullable NSURLResponse response, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadTaskWithURLCompletionHandler {
        @Generated
        void call_downloadTaskWithURLCompletionHandler(@Nullable NSURL location, @Nullable NSURLResponse response,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_flushWithCompletionHandler {
        @Generated
        void call_flushWithCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getAllTasksWithCompletionHandler {
        @Generated
        void call_getAllTasksWithCompletionHandler(@NotNull NSArray<? extends NSURLSessionTask> tasks);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getTasksWithCompletionHandler {
        @Generated
        void call_getTasksWithCompletionHandler(@NotNull NSArray<? extends NSURLSessionDataTask> dataTasks,
                @NotNull NSArray<? extends NSURLSessionUploadTask> uploadTasks,
                @NotNull NSArray<? extends NSURLSessionDownloadTask> downloadTasks);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetWithCompletionHandler {
        @Generated
        void call_resetWithCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_uploadTaskWithRequestFromDataCompletionHandler {
        @Generated
        void call_uploadTaskWithRequestFromDataCompletionHandler(@Nullable NSData data,
                @Nullable NSURLResponse response, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_uploadTaskWithRequestFromFileCompletionHandler {
        @Generated
        void call_uploadTaskWithRequestFromFileCompletionHandler(@Nullable NSData data,
                @Nullable NSURLResponse response, @Nullable NSError error);
    }

    /**
     * Creates a WebSocket task given the request. The request properties can be modified and will be used by the task
     * during the HTTP handshake phase.
     * Clients who want to add custom protocols can do so by directly adding headers with the key Sec-WebSocket-Protocol
     * and a comma separated list of protocols they wish to negotiate with the server. The custom HTTP headers provided
     * by the client will remain unchanged for the handshake with the server.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("webSocketTaskWithRequest:")
    public native NSURLSessionWebSocketTask webSocketTaskWithRequest(@NotNull NSURLRequest request);

    /**
     * Creates a WebSocket task given the url. The given url must have a ws or wss scheme.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("webSocketTaskWithURL:")
    public native NSURLSessionWebSocketTask webSocketTaskWithURL(@NotNull NSURL url);

    /**
     * Creates a WebSocket task given the url and an array of protocols. The protocols will be used in the WebSocket
     * handshake to
     * negotiate a preferred protocol with the server
     * Note - The protocol will not affect the WebSocket framing. More details on the protocol can be found by reading
     * the WebSocket RFC
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("webSocketTaskWithURL:protocols:")
    public native NSURLSessionWebSocketTask webSocketTaskWithURLProtocols(@NotNull NSURL url,
            @NotNull NSArray<String> protocols);

    /**
     * Creates an upload task from a resume data blob. Requires the server to support the latest resumable uploads
     * Internet-Draft from the HTTP Working Group, found at
     * https://datatracker.ietf.org/doc/draft-ietf-httpbis-resumable-upload/
     * If resuming from an upload file, the file must still exist and be unmodified. If the upload cannot be
     * successfully
     * resumed, URLSession:task:didCompleteWithError: will be called.
     * 
     * - Parameter resumeData: Resume data blob from an incomplete upload, such as data returned by the
     * cancelByProducingResumeData: method.
     * - Returns: A new session upload task, or nil if the resumeData is invalid.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("uploadTaskWithResumeData:")
    @NotNull
    public native NSURLSessionUploadTask uploadTaskWithResumeData(@NotNull NSData resumeData);

    /**
     * Creates a URLSessionUploadTask from a resume data blob. If resuming from an upload
     * file, the file must still exist and be unmodified.
     * 
     * - Parameter resumeData: Resume data blob from an incomplete upload, such as data returned by the
     * cancelByProducingResumeData: method.
     * - Parameter completionHandler: The completion handler to call when the load request is complete.
     * - Returns: A new session upload task, or nil if the resumeData is invalid.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("uploadTaskWithResumeData:completionHandler:")
    @NotNull
    public native NSURLSessionUploadTask uploadTaskWithResumeDataCompletionHandler(@NotNull NSData resumeData,
            @ObjCBlock(name = "call_uploadTaskWithResumeDataCompletionHandler") @NotNull Block_uploadTaskWithResumeDataCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_uploadTaskWithResumeDataCompletionHandler {
        @Generated
        void call_uploadTaskWithResumeDataCompletionHandler(@Nullable NSData data, @Nullable NSURLResponse response,
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
