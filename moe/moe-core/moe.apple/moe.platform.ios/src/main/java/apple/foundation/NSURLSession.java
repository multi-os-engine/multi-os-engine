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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("sessionWithConfiguration:")
    public static native NSURLSession sessionWithConfiguration(NSURLSessionConfiguration configuration);

    @Generated
    @Selector("sessionWithConfiguration:delegate:delegateQueue:")
    public static native NSURLSession sessionWithConfigurationDelegateDelegateQueue(
            NSURLSessionConfiguration configuration, @Mapped(ObjCObjectMapper.class) NSURLSessionDelegate delegate,
            NSOperationQueue queue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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

    @Generated
    @Selector("configuration")
    public native NSURLSessionConfiguration configuration();

    @Generated
    @Selector("dataTaskWithRequest:")
    public native NSURLSessionDataTask dataTaskWithRequest(NSURLRequest request);

    @Generated
    @Selector("dataTaskWithRequest:completionHandler:")
    public native NSURLSessionDataTask dataTaskWithRequestCompletionHandler(NSURLRequest request,
            @ObjCBlock(name = "call_dataTaskWithRequestCompletionHandler") Block_dataTaskWithRequestCompletionHandler completionHandler);

    @Generated
    @Selector("dataTaskWithURL:")
    public native NSURLSessionDataTask dataTaskWithURL(NSURL url);

    @Generated
    @Selector("dataTaskWithURL:completionHandler:")
    public native NSURLSessionDataTask dataTaskWithURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_dataTaskWithURLCompletionHandler") Block_dataTaskWithURLCompletionHandler completionHandler);

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSURLSessionDelegate delegate();

    @Generated
    @Selector("delegateQueue")
    public native NSOperationQueue delegateQueue();

    @Generated
    @Selector("downloadTaskWithRequest:")
    public native NSURLSessionDownloadTask downloadTaskWithRequest(NSURLRequest request);

    @Generated
    @Selector("downloadTaskWithRequest:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithRequestCompletionHandler(NSURLRequest request,
            @ObjCBlock(name = "call_downloadTaskWithRequestCompletionHandler") Block_downloadTaskWithRequestCompletionHandler completionHandler);

    @Generated
    @Selector("downloadTaskWithResumeData:")
    public native NSURLSessionDownloadTask downloadTaskWithResumeData(NSData resumeData);

    @Generated
    @Selector("downloadTaskWithResumeData:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithResumeDataCompletionHandler(NSData resumeData,
            @ObjCBlock(name = "call_downloadTaskWithResumeDataCompletionHandler") Block_downloadTaskWithResumeDataCompletionHandler completionHandler);

    @Generated
    @Selector("downloadTaskWithURL:")
    public native NSURLSessionDownloadTask downloadTaskWithURL(NSURL url);

    @Generated
    @Selector("downloadTaskWithURL:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_downloadTaskWithURLCompletionHandler") Block_downloadTaskWithURLCompletionHandler completionHandler);

    @Generated
    @Selector("finishTasksAndInvalidate")
    public native void finishTasksAndInvalidate();

    @Generated
    @Selector("flushWithCompletionHandler:")
    public native void flushWithCompletionHandler(
            @ObjCBlock(name = "call_flushWithCompletionHandler") Block_flushWithCompletionHandler completionHandler);

    @Generated
    @Selector("getAllTasksWithCompletionHandler:")
    public native void getAllTasksWithCompletionHandler(
            @ObjCBlock(name = "call_getAllTasksWithCompletionHandler") Block_getAllTasksWithCompletionHandler completionHandler);

    @Generated
    @Selector("getTasksWithCompletionHandler:")
    public native void getTasksWithCompletionHandler(
            @ObjCBlock(name = "call_getTasksWithCompletionHandler") Block_getTasksWithCompletionHandler completionHandler);

    @Generated
    @Selector("init")
    public native NSURLSession init();

    @Generated
    @Selector("invalidateAndCancel")
    public native void invalidateAndCancel();

    @Generated
    @Selector("resetWithCompletionHandler:")
    public native void resetWithCompletionHandler(
            @ObjCBlock(name = "call_resetWithCompletionHandler") Block_resetWithCompletionHandler completionHandler);

    @Generated
    @Selector("sessionDescription")
    public native String sessionDescription();

    @Generated
    @Selector("setSessionDescription:")
    public native void setSessionDescription(String value);

    @Generated
    @Selector("streamTaskWithHostName:port:")
    public native NSURLSessionStreamTask streamTaskWithHostNamePort(String hostname, @NInt long port);

    @Generated
    @Selector("streamTaskWithNetService:")
    public native NSURLSessionStreamTask streamTaskWithNetService(NSNetService service);

    @Generated
    @Selector("uploadTaskWithRequest:fromData:")
    public native NSURLSessionUploadTask uploadTaskWithRequestFromData(NSURLRequest request, NSData bodyData);

    @Generated
    @Selector("uploadTaskWithRequest:fromData:completionHandler:")
    public native NSURLSessionUploadTask uploadTaskWithRequestFromDataCompletionHandler(NSURLRequest request,
            NSData bodyData,
            @ObjCBlock(name = "call_uploadTaskWithRequestFromDataCompletionHandler") Block_uploadTaskWithRequestFromDataCompletionHandler completionHandler);

    @Generated
    @Selector("uploadTaskWithRequest:fromFile:")
    public native NSURLSessionUploadTask uploadTaskWithRequestFromFile(NSURLRequest request, NSURL fileURL);

    @Generated
    @Selector("uploadTaskWithRequest:fromFile:completionHandler:")
    public native NSURLSessionUploadTask uploadTaskWithRequestFromFileCompletionHandler(NSURLRequest request,
            NSURL fileURL,
            @ObjCBlock(name = "call_uploadTaskWithRequestFromFileCompletionHandler") Block_uploadTaskWithRequestFromFileCompletionHandler completionHandler);

    @Generated
    @Selector("uploadTaskWithStreamedRequest:")
    public native NSURLSessionUploadTask uploadTaskWithStreamedRequest(NSURLRequest request);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dataTaskWithRequestCompletionHandler {
        @Generated
        void call_dataTaskWithRequestCompletionHandler(NSData data, NSURLResponse response, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_dataTaskWithURLCompletionHandler {
        @Generated
        void call_dataTaskWithURLCompletionHandler(NSData data, NSURLResponse response, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadTaskWithRequestCompletionHandler {
        @Generated
        void call_downloadTaskWithRequestCompletionHandler(NSURL location, NSURLResponse response, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadTaskWithResumeDataCompletionHandler {
        @Generated
        void call_downloadTaskWithResumeDataCompletionHandler(NSURL location, NSURLResponse response, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadTaskWithURLCompletionHandler {
        @Generated
        void call_downloadTaskWithURLCompletionHandler(NSURL location, NSURLResponse response, NSError error);
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
        void call_getAllTasksWithCompletionHandler(NSArray<? extends NSURLSessionTask> tasks);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getTasksWithCompletionHandler {
        @Generated
        void call_getTasksWithCompletionHandler(NSArray<? extends NSURLSessionDataTask> dataTasks,
                NSArray<? extends NSURLSessionUploadTask> uploadTasks,
                NSArray<? extends NSURLSessionDownloadTask> downloadTasks);
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
        void call_uploadTaskWithRequestFromDataCompletionHandler(NSData data, NSURLResponse response, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_uploadTaskWithRequestFromFileCompletionHandler {
        @Generated
        void call_uploadTaskWithRequestFromFileCompletionHandler(NSData data, NSURLResponse response, NSError error);
    }

    @Generated
    @Selector("webSocketTaskWithRequest:")
    public native NSURLSessionWebSocketTask webSocketTaskWithRequest(NSURLRequest request);

    @Generated
    @Selector("webSocketTaskWithURL:")
    public native NSURLSessionWebSocketTask webSocketTaskWithURL(NSURL url);

    @Generated
    @Selector("webSocketTaskWithURL:protocols:")
    public native NSURLSessionWebSocketTask webSocketTaskWithURLProtocols(NSURL url, NSArray<String> protocols);
}
