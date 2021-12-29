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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSProgressReporting;
import apple.foundation.protocol.NSURLSessionTaskDelegate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSURLSessionTask - a cancelable object that refers to the lifetime
 * of processing a given request.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionTask extends NSObject implements NSCopying, NSProgressReporting {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLSessionTask(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLSessionTask alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLSessionTask allocWithZone(VoidPtr zone);

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
    public static native NSURLSessionTask new_objc();

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
     * -cancel returns immediately, but marks a task as being canceled.
     * The task will signal -URLSession:task:didCompleteWithError: with an
     * error value of { NSURLErrorDomain, NSURLErrorCancelled }.  In some
     * cases, the task may signal other work before it acknowledges the
     * cancelation.  -cancel may be sent to a task that has been suspended.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * number of byte bytes we expect to receive, usually derived from the Content-Length header of an HTTP response.
     */
    @Generated
    @Selector("countOfBytesExpectedToReceive")
    public native long countOfBytesExpectedToReceive();

    /**
     * number of body bytes we expect to send, derived from the Content-Length of the HTTP request
     */
    @Generated
    @Selector("countOfBytesExpectedToSend")
    public native long countOfBytesExpectedToSend();

    /**
     * number of body bytes already received
     */
    @Generated
    @Selector("countOfBytesReceived")
    public native long countOfBytesReceived();

    /**
     * number of body bytes already sent
     */
    @Generated
    @Selector("countOfBytesSent")
    public native long countOfBytesSent();

    /**
     * may differ from originalRequest due to http server redirection
     */
    @Generated
    @Selector("currentRequest")
    public native NSURLRequest currentRequest();

    /**
     * The error, if any, delivered via -URLSession:task:didCompleteWithError:
     * This property will be nil in the event that no error occured.
     */
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("init")
    public native NSURLSessionTask init();

    /**
     * may be nil if this is a stream task
     */
    @Generated
    @Selector("originalRequest")
    public native NSURLRequest originalRequest();

    /**
     * Sets a scaling factor for the priority of the task. The scaling factor is a
     * value between 0.0 and 1.0 (inclusive), where 0.0 is considered the lowest
     * priority and 1.0 is considered the highest.
     * <p>
     * The priority is a hint and not a hard requirement of task performance. The
     * priority of a task may be changed using this API at any time, but not all
     * protocols support this; in these cases, the last priority that took effect
     * will be used.
     * <p>
     * If no priority is specified, the task will operate with the default priority
     * as defined by the constant NSURLSessionTaskPriorityDefault. Two additional
     * priority levels are provided: NSURLSessionTaskPriorityLow and
     * NSURLSessionTaskPriorityHigh, but use is not restricted to these.
     */
    @Generated
    @Selector("priority")
    public native float priority();

    /**
     * may be nil if no response has been received
     */
    @Generated
    @Selector("response")
    public native NSURLResponse response();

    @Generated
    @Selector("resume")
    public native void resume();

    /**
     * Sets a scaling factor for the priority of the task. The scaling factor is a
     * value between 0.0 and 1.0 (inclusive), where 0.0 is considered the lowest
     * priority and 1.0 is considered the highest.
     * <p>
     * The priority is a hint and not a hard requirement of task performance. The
     * priority of a task may be changed using this API at any time, but not all
     * protocols support this; in these cases, the last priority that took effect
     * will be used.
     * <p>
     * If no priority is specified, the task will operate with the default priority
     * as defined by the constant NSURLSessionTaskPriorityDefault. Two additional
     * priority levels are provided: NSURLSessionTaskPriorityLow and
     * NSURLSessionTaskPriorityHigh, but use is not restricted to these.
     */
    @Generated
    @Selector("setPriority:")
    public native void setPriority(float value);

    /**
     * The taskDescription property is available for the developer to
     * provide a descriptive label for the task.
     */
    @Generated
    @Selector("setTaskDescription:")
    public native void setTaskDescription(String value);

    /**
     * The current state of the task within the session.
     */
    @Generated
    @Selector("state")
    @NInt
    public native long state();

    /**
     * Suspending a task will prevent the NSURLSession from continuing to
     * load data.  There may still be delegate calls made on behalf of
     * this task (for instance, to report data received while suspending)
     * but no further transmissions will be made on behalf of the task
     * until -resume is sent.  The timeout timer associated with the task
     * will be disabled while a task is suspended. -suspend and -resume are
     * nestable.
     */
    @Generated
    @Selector("suspend")
    public native void suspend();

    /**
     * The taskDescription property is available for the developer to
     * provide a descriptive label for the task.
     */
    @Generated
    @Selector("taskDescription")
    public native String taskDescription();

    /**
     * an identifier for this task, assigned by and unique to the owning session
     */
    @Generated
    @Selector("taskIdentifier")
    @NUInt
    public native long taskIdentifier();

    @Generated
    @Selector("countOfBytesClientExpectsToReceive")
    public native long countOfBytesClientExpectsToReceive();

    /**
     * The number of bytes that the client expects (a best-guess upper-bound) will
     * be sent and received by this task. These values are used by system scheduling
     * policy. If unspecified, NSURLSessionTransferSizeUnknown is used.
     */
    @Generated
    @Selector("countOfBytesClientExpectsToSend")
    public native long countOfBytesClientExpectsToSend();

    /**
     * Start the network load for this task no earlier than the specified date. If
     * not specified, no start delay is used.
     * <p>
     * Only applies to tasks created from background NSURLSession instances; has no
     * effect for tasks created from other session types.
     */
    @Generated
    @Selector("earliestBeginDate")
    public native NSDate earliestBeginDate();

    @Generated
    @Selector("progress")
    public native NSProgress progress();

    @Generated
    @Selector("setCountOfBytesClientExpectsToReceive:")
    public native void setCountOfBytesClientExpectsToReceive(long value);

    /**
     * The number of bytes that the client expects (a best-guess upper-bound) will
     * be sent and received by this task. These values are used by system scheduling
     * policy. If unspecified, NSURLSessionTransferSizeUnknown is used.
     */
    @Generated
    @Selector("setCountOfBytesClientExpectsToSend:")
    public native void setCountOfBytesClientExpectsToSend(long value);

    /**
     * Start the network load for this task no earlier than the specified date. If
     * not specified, no start delay is used.
     * <p>
     * Only applies to tasks created from background NSURLSession instances; has no
     * effect for tasks created from other session types.
     */
    @Generated
    @Selector("setEarliestBeginDate:")
    public native void setEarliestBeginDate(NSDate value);

    /**
     * Sets a task-specific delegate. Methods not implemented on this delegate will
     * still be forwarded to the session delegate.
     * <p>
     * Cannot be modified after task resumes. Not supported on background session.
     * <p>
     * Delegate is strongly referenced until the task completes, after which it is
     * reset to `nil`.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSURLSessionTaskDelegate delegate();

    /**
     * Provides a hint indicating if incremental delivery of a partial response body
     * would be useful for the application, or if it cannot process the response
     * until it is complete. Indicating that incremental delivery is not desired may
     * improve task performance. For example, if a response cannot be decoded until
     * the entire content is received, set this property to false.
     * <p>
     * Defaults to true unless this task is created with completion-handler based
     * convenience methods, or if it is a download task.
     */
    @Generated
    @Selector("prefersIncrementalDelivery")
    public native boolean prefersIncrementalDelivery();

    /**
     * Sets a task-specific delegate. Methods not implemented on this delegate will
     * still be forwarded to the session delegate.
     * <p>
     * Cannot be modified after task resumes. Not supported on background session.
     * <p>
     * Delegate is strongly referenced until the task completes, after which it is
     * reset to `nil`.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate(@Mapped(ObjCObjectMapper.class) NSURLSessionTaskDelegate value);

    /**
     * Provides a hint indicating if incremental delivery of a partial response body
     * would be useful for the application, or if it cannot process the response
     * until it is complete. Indicating that incremental delivery is not desired may
     * improve task performance. For example, if a response cannot be decoded until
     * the entire content is received, set this property to false.
     * <p>
     * Defaults to true unless this task is created with completion-handler based
     * convenience methods, or if it is a download task.
     */
    @Generated
    @Selector("setPrefersIncrementalDelivery:")
    public native void setPrefersIncrementalDelivery(boolean value);
}
