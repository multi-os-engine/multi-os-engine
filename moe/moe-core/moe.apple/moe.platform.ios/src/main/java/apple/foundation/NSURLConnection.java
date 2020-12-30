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
import apple.newsstandkit.NKAssetDownload;
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
 * @class NSURLConnection
 * 
 * @abstract An NSURLConnection object provides support to perform
 *     asynchronous loads of a URL request, providing data to a
 *     client supplied delegate.
 * 
 * @discussion The interface for NSURLConnection is very sparse, providing
 *     only the controls to start and cancel asynchronous loads of a
 *     URL request.<p>
 * 
 *     An NSURLConnection may be used for loading of resource data
 *     directly to memory, in which case an
 *     NSURLConnectionDataDelegate should be supplied, or for
 *     downloading of resource data directly to a file, in which case
 *     an NSURLConnectionDownloadDelegate is used.  The delegate is
 *     retained by the NSURLConnection until a terminal condition is
 *     encountered.  These two delegates are logically subclasses of
 *     the base protocol, NSURLConnectionDelegate.<p>
 * 
 *     A terminal condition produced by the loader will result in a
 *     connection:didFailWithError: in the case of an error, or
 *     connectiondidFinishLoading: or connectionDidFinishDownloading:
 *     delegate message.<p>
 * 
 *     The -cancel message hints to the loader that a resource load
 *     should be abandoned but does not guarantee that more delegate
 *     messages will not be delivered.  If -cancel does cause the
 *     load to be abandoned, the delegate will be released without
 *     further messages.  In general, a caller should be prepared for
 *     -cancel to have no effect, and internally ignore any delegate
 *     callbacks until the delegate is released.
 * 
 *     Scheduling of an NSURLConnection specifies the context in
 *     which delegate callbacks will be made, but the actual IO may
 *     occur on a separate thread and should be considered an
 *     implementation detail.<p>
 * 
 *     When created, an NSURLConnection performs a deep-copy of the
 *     NSURLRequest.  This copy is available through the
 *     -originalRequest method.  As the connection performs the load,
 *     this request may change as a result of protocol
 *     canonicalization or due to following redirects.
 *     -currentRequest can be used to retrieve this value.<p>
 * 
 *     An NSURLConnections created with the
 *     +connectionWithRequest:delegate: or -initWithRequest:delegate:
 *     methods are scheduled on the current runloop immediately, and
 *     it is not necessary to send the -start message to begin the
 *     resource load.<p>
 * 
 *     NSURLConnections created with
 *     -initWithRequest:delegate:startImmediately: are not
 *     automatically scheduled.  Use -scheduleWithRunLoop:forMode: or
 *     -setDelegateQueue: to specify the context for delegate
 *     callbacks, and -start to begin the load.  If you do not
 *     explicitly schedule the connection before -start, it will be
 *     scheduled on the current runloop and mode automatically.<p>
 * 
 *     The NSURLConnectionSynchronousLoading category adds
 *     +sendSynchronousRequest:returningResponse:error, which blocks
 *     the current thread until the resource data is available or an
 *     error occurs.  It should be noted that using this method on an
 *     applications main run loop may result in an unacceptably long
 *     delay in a user interface and its use is strongly
 *     discourage.<p>
 * 
 *     The NSURLConnectionQueuedLoading category implements
 *     +sendAsynchronousRequest:queue:completionHandler, providing
 *     similar simplicity but provides a mechanism where the current
 *     runloop is not blocked.<p>
 * 
 *     Both of the immediate loading categories do not provide for
 *     customization of resource load, and do not allow the caller to
 *     respond to, e.g., authentication challenges.<p>
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLConnection extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLConnection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLConnection alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * @method         canHandleRequest:
     * 
     * @abstract
     *                 Performs a "preflight" operation that performs
     *                 some speculative checks to see if a connection can
     *                 be initialized, and the associated I/O that is
     *                 started in the initializer methods can begin.
     * 
     * @discussion
     *                 The result of this method is valid only as long as
     *                 no protocols are registered or unregistered, and
     *                 as long as the request is not mutated (if the
     *                 request is mutable). Hence, clients should be
     *                 prepared to handle failures even if they have
     *                 performed request preflighting by calling this
     *                 method.
     * 
     * @param 
     *     request     The request to preflight.
     * 
     * @result         YES if it is likely that the given request can be used to
     *                 initialize a connection and the associated I/O can be
     *                 started, NO otherwise.
     */
    @Generated
    @Selector("canHandleRequest:")
    public static native boolean canHandleRequest(NSURLRequest request);

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
    @Deprecated
    @Selector("connectionWithRequest:delegate:")
    public static native NSURLConnection connectionWithRequestDelegate(NSURLRequest request,
            @Mapped(ObjCObjectMapper.class) Object delegate);

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

    /**
     * @method       sendAsynchronousRequest:queue:completionHandler:
     * 
     * @abstract 
     *               Performs an asynchronous load of the given
     *               request. When the request has completed or failed,
     *               the block will be executed from the context of the
     *               specified NSOperationQueue.
     * 
     * @discussion
     *               This is a convenience routine that allows for
     *               asynchronous loading of an url based resource.  If
     *               the resource load is successful, the data parameter
     *               to the callback will contain the resource data and
     *               the error parameter will be nil.  If the resource
     *               load fails, the data parameter will be nil and the
     *               error will contain information about the failure.
     * 
     * @param
     *      request   The request to load. Note that the request is
     *                deep-copied as part of the initialization
     *                process. Changes made to the request argument after
     *                this method returns do not affect the request that
     *                is used for the loading process.
     * 
     * @param 
     *      queue     An NSOperationQueue upon which    the handler block will
     *                be dispatched.
     * 
     * @param
     *      handler   A block which receives the results of the resource load.
     */
    @Generated
    @Deprecated
    @Selector("sendAsynchronousRequest:queue:completionHandler:")
    public static native void sendAsynchronousRequestQueueCompletionHandler(NSURLRequest request,
            NSOperationQueue queue,
            @ObjCBlock(name = "call_sendAsynchronousRequestQueueCompletionHandler") Block_sendAsynchronousRequestQueueCompletionHandler handler);

    /**
     * @method      sendSynchronousRequest:returningResponse:error:
     * 
     * @abstract 
     *              Performs a synchronous load of the given request,
     *              returning an NSURLResponse in the given out
     *              parameter.
     * 
     * @discussion
     *              A synchronous load for the given request is built on
     *              top of the asynchronous loading code made available
     *              by the class.  The calling thread is blocked while
     *              the asynchronous loading system performs the URL load
     *              on a thread spawned specifically for this load
     *              request. No special threading or run loop
     *              configuration is necessary in the calling thread in
     *              order to perform a synchronous load. For instance,
     *              the calling thread need not be running its run loop.
     * 
     * @param
     *    request   The request to load. Note that the request is
     *              deep-copied as part of the initialization
     *              process. Changes made to the request argument after
     *              this method returns do not affect the request that is
     *              used for the loading process.
     * 
     * @param
     *    response  An out parameter which is filled in with the
     *              response generated by performing the load.
     * 
     * @param
     *    error     Out parameter (may be NULL) used if an error occurs
     *              while processing the request. Will not be modified if the 
     *              load succeeds.
     * 
     * @result      The content of the URL resulting from performing the load,
     *              or nil if the load failed.
     */
    @Generated
    @Deprecated
    @Selector("sendSynchronousRequest:returningResponse:error:")
    public static native NSData sendSynchronousRequestReturningResponseError(NSURLRequest request,
            @ReferenceInfo(type = NSURLResponse.class) Ptr<NSURLResponse> response,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("cancel")
    public native void cancel();

    @Generated
    @Selector("currentRequest")
    public native NSURLRequest currentRequest();

    @Generated
    @Selector("init")
    public native NSURLConnection init();

    @Generated
    @Deprecated
    @Selector("initWithRequest:delegate:")
    public native NSURLConnection initWithRequestDelegate(NSURLRequest request,
            @Mapped(ObjCObjectMapper.class) Object delegate);

    /**
     * Designated initializer
     */
    @Generated
    @Deprecated
    @Selector("initWithRequest:delegate:startImmediately:")
    public native NSURLConnection initWithRequestDelegateStartImmediately(NSURLRequest request,
            @Mapped(ObjCObjectMapper.class) Object delegate, boolean startImmediately);

    /**
     * @property   newsstandAssetDownload
     * @abstract   A pointer to the asset download that this connection is associated with.
     */
    @Generated
    @Selector("newsstandAssetDownload")
    public native NKAssetDownload newsstandAssetDownload();

    @Generated
    @Selector("originalRequest")
    public native NSURLRequest originalRequest();

    @Generated
    @Selector("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

    @Generated
    @Selector("setDelegateQueue:")
    public native void setDelegateQueue(NSOperationQueue queue);

    @Generated
    @Selector("start")
    public native void start();

    @Generated
    @Selector("unscheduleFromRunLoop:forMode:")
    public native void unscheduleFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendAsynchronousRequestQueueCompletionHandler {
        @Generated
        void call_sendAsynchronousRequestQueueCompletionHandler(NSURLResponse response, NSData data,
                NSError connectionError);
    }
}
