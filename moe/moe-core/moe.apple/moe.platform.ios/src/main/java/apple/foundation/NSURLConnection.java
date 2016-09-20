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
    @Owned
    @Selector("alloc")
    public static native NSURLConnection alloc();

    /**
     * canHandleRequest:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/clm/NSURLConnection/canHandleRequest:">iOS Dev Center</a>
     */
    @Generated
    @Selector("canHandleRequest:")
    public static native boolean canHandleRequest(NSURLRequest request);

    /**
     * connectionWithRequest:delegate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/clm/NSURLConnection/connectionWithRequest:delegate:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("connectionWithRequest:delegate:")
    public static native NSURLConnection connectionWithRequestDelegate(NSURLRequest request,
            @Mapped(ObjCObjectMapper.class) Object delegate);

    /**
     * sendAsynchronousRequest:queue:completionHandler:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/clm/NSURLConnection/sendAsynchronousRequest:queue:completionHandler:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("sendAsynchronousRequest:queue:completionHandler:")
    public static native void sendAsynchronousRequestQueueCompletionHandler(NSURLRequest request,
            NSOperationQueue queue,
            @ObjCBlock(name = "call_sendAsynchronousRequestQueueCompletionHandler") Block_sendAsynchronousRequestQueueCompletionHandler handler);

    /**
     * sendSynchronousRequest:returningResponse:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/clm/NSURLConnection/sendSynchronousRequest:returningResponse:error:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("sendSynchronousRequest:returningResponse:error:")
    public static native NSData sendSynchronousRequestReturningResponseError(NSURLRequest request,
            Ptr<NSURLResponse> response, Ptr<NSError> error);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * cancel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instm/NSURLConnection/cancel">iOS Dev Center</a>
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

    /**
     * currentRequest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instp/NSURLConnection/currentRequest">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentRequest")
    public native NSURLRequest currentRequest();

    @Generated
    @Selector("init")
    public native NSURLConnection init();

    /**
     * initWithRequest:delegate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instm/NSURLConnection/initWithRequest:delegate:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("initWithRequest:delegate:")
    public native NSURLConnection initWithRequestDelegate(NSURLRequest request,
            @Mapped(ObjCObjectMapper.class) Object delegate);

    /**
     * initWithRequest:delegate:startImmediately:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instm/NSURLConnection/initWithRequest:delegate:startImmediately:">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("initWithRequest:delegate:startImmediately:")
    public native NSURLConnection initWithRequestDelegateStartImmediately(NSURLRequest request,
            @Mapped(ObjCObjectMapper.class) Object delegate, boolean startImmediately);

    /**
     * newsstandAssetDownload</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instp/NSURLConnection/newsstandAssetDownload">iOS Dev Center</a>
     */
    @Generated
    @Selector("newsstandAssetDownload")
    public native NKAssetDownload newsstandAssetDownload();

    /**
     * originalRequest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instp/NSURLConnection/originalRequest">iOS Dev Center</a>
     */
    @Generated
    @Selector("originalRequest")
    public native NSURLRequest originalRequest();

    /**
     * scheduleInRunLoop:forMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instm/NSURLConnection/scheduleInRunLoop:forMode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoopForMode(NSRunLoop aRunLoop, String mode);

    /**
     * setDelegateQueue:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instm/NSURLConnection/setDelegateQueue:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDelegateQueue:")
    public native void setDelegateQueue(NSOperationQueue queue);

    /**
     * start</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instm/NSURLConnection/start">iOS Dev Center</a>
     */
    @Generated
    @Selector("start")
    public native void start();

    /**
     * unscheduleFromRunLoop:forMode:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSURLConnection_Class/index.html#//apple_ref/occ/instm/NSURLConnection/unscheduleFromRunLoop:forMode:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unscheduleFromRunLoop:forMode:")
    public native void unscheduleFromRunLoopForMode(NSRunLoop aRunLoop, String mode);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendAsynchronousRequestQueueCompletionHandler {
        @Generated
        void call_sendAsynchronousRequestQueueCompletionHandler(NSURLResponse arg0, NSData arg1, NSError arg2);
    }
}
