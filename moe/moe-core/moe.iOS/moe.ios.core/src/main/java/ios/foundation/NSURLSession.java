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

package ios.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSURLSessionDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

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
	@Owned
	@Selector("alloc")
	public static native NSURLSession alloc();

	/**
	 * configuration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instp/NSURLSession/configuration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("configuration")
	public native NSURLSessionConfiguration configuration();

	/**
	 * dataTaskWithRequest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/dataTaskWithRequest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataTaskWithRequest:")
	public native NSURLSessionDataTask dataTaskWithRequest(NSURLRequest request);

	/**
	 * dataTaskWithRequest:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/dataTaskWithRequest:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataTaskWithRequest:completionHandler:")
	public native NSURLSessionDataTask dataTaskWithRequestCompletionHandler(
			NSURLRequest request,
			@ObjCBlock(name = "call_dataTaskWithRequestCompletionHandler") Block_dataTaskWithRequestCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_dataTaskWithRequestCompletionHandler {
		@Generated
		void call_dataTaskWithRequestCompletionHandler(NSData arg0,
				NSURLResponse arg1, NSError arg2);
	}

	/**
	 * dataTaskWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/dataTaskWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataTaskWithURL:")
	public native NSURLSessionDataTask dataTaskWithURL(NSURL url);

	/**
	 * dataTaskWithURL:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/dataTaskWithURL:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dataTaskWithURL:completionHandler:")
	public native NSURLSessionDataTask dataTaskWithURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_dataTaskWithURLCompletionHandler") Block_dataTaskWithURLCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_dataTaskWithURLCompletionHandler {
		@Generated
		void call_dataTaskWithURLCompletionHandler(NSData arg0,
				NSURLResponse arg1, NSError arg2);
	}

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instp/NSURLSession/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native NSURLSessionDelegate delegate();

	/**
	 * delegateQueue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instp/NSURLSession/delegateQueue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegateQueue")
	public native NSOperationQueue delegateQueue();

	/**
	 * downloadTaskWithRequest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/downloadTaskWithRequest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("downloadTaskWithRequest:")
	public native NSURLSessionDownloadTask downloadTaskWithRequest(
			NSURLRequest request);

	/**
	 * downloadTaskWithRequest:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/downloadTaskWithRequest:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("downloadTaskWithRequest:completionHandler:")
	public native NSURLSessionDownloadTask downloadTaskWithRequestCompletionHandler(
			NSURLRequest request,
			@ObjCBlock(name = "call_downloadTaskWithRequestCompletionHandler") Block_downloadTaskWithRequestCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_downloadTaskWithRequestCompletionHandler {
		@Generated
		void call_downloadTaskWithRequestCompletionHandler(NSURL arg0,
				NSURLResponse arg1, NSError arg2);
	}

	/**
	 * downloadTaskWithResumeData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/downloadTaskWithResumeData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("downloadTaskWithResumeData:")
	public native NSURLSessionDownloadTask downloadTaskWithResumeData(
			NSData resumeData);

	/**
	 * downloadTaskWithResumeData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/downloadTaskWithResumeData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("downloadTaskWithResumeData:completionHandler:")
	public native NSURLSessionDownloadTask downloadTaskWithResumeDataCompletionHandler(
			NSData resumeData,
			@ObjCBlock(name = "call_downloadTaskWithResumeDataCompletionHandler") Block_downloadTaskWithResumeDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_downloadTaskWithResumeDataCompletionHandler {
		@Generated
		void call_downloadTaskWithResumeDataCompletionHandler(
				NSURL arg0, NSURLResponse arg1, NSError arg2);
	}

	/**
	 * downloadTaskWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/downloadTaskWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("downloadTaskWithURL:")
	public native NSURLSessionDownloadTask downloadTaskWithURL(NSURL url);

	/**
	 * downloadTaskWithURL:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/downloadTaskWithURL:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("downloadTaskWithURL:completionHandler:")
	public native NSURLSessionDownloadTask downloadTaskWithURLCompletionHandler(
			NSURL url,
			@ObjCBlock(name = "call_downloadTaskWithURLCompletionHandler") Block_downloadTaskWithURLCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_downloadTaskWithURLCompletionHandler {
		@Generated
		void call_downloadTaskWithURLCompletionHandler(NSURL arg0,
				NSURLResponse arg1, NSError arg2);
	}

	/**
	 * finishTasksAndInvalidate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/finishTasksAndInvalidate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("finishTasksAndInvalidate")
	public native void finishTasksAndInvalidate();

	/**
	 * flushWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/flushWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("flushWithCompletionHandler:")
	public native void flushWithCompletionHandler(
			@ObjCBlock(name = "call_flushWithCompletionHandler") Block_flushWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_flushWithCompletionHandler {
		@Generated
		void call_flushWithCompletionHandler();
	}

	/**
	 * getTasksWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/getTasksWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getTasksWithCompletionHandler:")
	public native void getTasksWithCompletionHandler(
			@ObjCBlock(name = "call_getTasksWithCompletionHandler") Block_getTasksWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_getTasksWithCompletionHandler {
		@Generated
		void call_getTasksWithCompletionHandler(NSArray<? extends NSURLSessionDataTask> arg0,
				NSArray<? extends NSURLSessionUploadTask> arg1, NSArray<? extends NSURLSessionDownloadTask> arg2);
	}

	@Generated
	@Selector("init")
	public native NSURLSession init();

	/**
	 * invalidateAndCancel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/invalidateAndCancel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("invalidateAndCancel")
	public native void invalidateAndCancel();

	/**
	 * resetWithCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/resetWithCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resetWithCompletionHandler:")
	public native void resetWithCompletionHandler(
			@ObjCBlock(name = "call_resetWithCompletionHandler") Block_resetWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_resetWithCompletionHandler {
		@Generated
		void call_resetWithCompletionHandler();
	}

	/**
	 * sessionDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instp/NSURLSession/sessionDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sessionDescription")
	public native String sessionDescription();

	/**
	 * sessionWithConfiguration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/clm/NSURLSession/sessionWithConfiguration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sessionWithConfiguration:")
	public static native NSURLSession sessionWithConfiguration(
			NSURLSessionConfiguration configuration);

	/**
	 * sessionWithConfiguration:delegate:delegateQueue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/clm/NSURLSession/sessionWithConfiguration:delegate:delegateQueue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sessionWithConfiguration:delegate:delegateQueue:")
	public static native NSURLSession sessionWithConfigurationDelegateDelegateQueue(
			NSURLSessionConfiguration configuration,
			@Mapped(ObjCObjectMapper.class) NSURLSessionDelegate delegate,
			NSOperationQueue queue);

	/**
	 * sessionDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instp/NSURLSession/sessionDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSessionDescription:")
	public native void setSessionDescription(String value);

	/**
	 * sharedSession</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/clm/NSURLSession/sharedSession">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sharedSession")
	public static native NSURLSession sharedSession();

	/**
	 * uploadTaskWithRequest:fromData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/uploadTaskWithRequest:fromData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uploadTaskWithRequest:fromData:")
	public native NSURLSessionUploadTask uploadTaskWithRequestFromData(
			NSURLRequest request, NSData bodyData);

	/**
	 * uploadTaskWithRequest:fromData:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/uploadTaskWithRequest:fromData:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uploadTaskWithRequest:fromData:completionHandler:")
	public native NSURLSessionUploadTask uploadTaskWithRequestFromDataCompletionHandler(
			NSURLRequest request,
			NSData bodyData,
			@ObjCBlock(name = "call_uploadTaskWithRequestFromDataCompletionHandler") Block_uploadTaskWithRequestFromDataCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_uploadTaskWithRequestFromDataCompletionHandler {
		@Generated
		void call_uploadTaskWithRequestFromDataCompletionHandler(
				NSData arg0, NSURLResponse arg1, NSError arg2);
	}

	/**
	 * uploadTaskWithRequest:fromFile:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/uploadTaskWithRequest:fromFile:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uploadTaskWithRequest:fromFile:")
	public native NSURLSessionUploadTask uploadTaskWithRequestFromFile(
			NSURLRequest request, NSURL fileURL);

	/**
	 * uploadTaskWithRequest:fromFile:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/uploadTaskWithRequest:fromFile:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uploadTaskWithRequest:fromFile:completionHandler:")
	public native NSURLSessionUploadTask uploadTaskWithRequestFromFileCompletionHandler(
			NSURLRequest request,
			NSURL fileURL,
			@ObjCBlock(name = "call_uploadTaskWithRequestFromFileCompletionHandler") Block_uploadTaskWithRequestFromFileCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_uploadTaskWithRequestFromFileCompletionHandler {
		@Generated
		void call_uploadTaskWithRequestFromFileCompletionHandler(
				NSData arg0, NSURLResponse arg1, NSError arg2);
	}

	/**
	 * uploadTaskWithStreamedRequest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/uploadTaskWithStreamedRequest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("uploadTaskWithStreamedRequest:")
	public native NSURLSessionUploadTask uploadTaskWithStreamedRequest(
			NSURLRequest request);

	@Generated
	@Selector("getAllTasksWithCompletionHandler:")
	public native void getAllTasksWithCompletionHandler(
			@ObjCBlock(name = "call_getAllTasksWithCompletionHandler") Block_getAllTasksWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_getAllTasksWithCompletionHandler {
		@Generated
		void call_getAllTasksWithCompletionHandler(NSArray<? extends NSURLSessionTask> arg0);
	}

	/**
	 * streamTaskWithHostName:port:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/streamTaskWithHostName:port:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("streamTaskWithHostName:port:")
	public native NSURLSessionStreamTask streamTaskWithHostNamePort(String hostname, @NInt long port);

	/**
	 * streamTaskWithNetService:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSession_class/index.html#//apple_ref/occ/instm/NSURLSession/streamTaskWithNetService:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("streamTaskWithNetService:")
	public native NSURLSessionStreamTask streamTaskWithNetService(NSNetService service);

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
}
