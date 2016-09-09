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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionTask extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSURLSessionTask(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSURLSessionTask alloc();

	/**
	 * cancel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instm/NSURLSessionTask/cancel">iOS Dev Center</a>
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
	 * countOfBytesExpectedToReceive</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/countOfBytesExpectedToReceive">iOS Dev Center</a>
	 */
	@Generated
	@Selector("countOfBytesExpectedToReceive")
	public native long countOfBytesExpectedToReceive();

	/**
	 * countOfBytesExpectedToSend</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/countOfBytesExpectedToSend">iOS Dev Center</a>
	 */
	@Generated
	@Selector("countOfBytesExpectedToSend")
	public native long countOfBytesExpectedToSend();

	/**
	 * countOfBytesReceived</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/countOfBytesReceived">iOS Dev Center</a>
	 */
	@Generated
	@Selector("countOfBytesReceived")
	public native long countOfBytesReceived();

	/**
	 * countOfBytesSent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/countOfBytesSent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("countOfBytesSent")
	public native long countOfBytesSent();

	/**
	 * currentRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/currentRequest">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentRequest")
	public native NSURLRequest currentRequest();

	/**
	 * error</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/error">iOS Dev Center</a>
	 */
	@Generated
	@Selector("error")
	public native NSError error();

	@Generated
	@Selector("init")
	public native NSURLSessionTask init();

	/**
	 * originalRequest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/originalRequest">iOS Dev Center</a>
	 */
	@Generated
	@Selector("originalRequest")
	public native NSURLRequest originalRequest();

	/**
	 * priority</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/priority">iOS Dev Center</a>
	 */
	@Generated
	@Selector("priority")
	public native float priority();

	/**
	 * response</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/response">iOS Dev Center</a>
	 */
	@Generated
	@Selector("response")
	public native NSURLResponse response();

	/**
	 * resume</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instm/NSURLSessionTask/resume">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resume")
	public native void resume();

	/**
	 * priority</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/priority">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPriority:")
	public native void setPriority(float value);

	/**
	 * taskDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/taskDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTaskDescription:")
	public native void setTaskDescription(String value);

	/**
	 * state</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/state">iOS Dev Center</a>
	 */
	@Generated
	@Selector("state")
	@NInt
	public native long state();

	/**
	 * suspend</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instm/NSURLSessionTask/suspend">iOS Dev Center</a>
	 */
	@Generated
	@Selector("suspend")
	public native void suspend();

	/**
	 * taskDescription</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/taskDescription">iOS Dev Center</a>
	 */
	@Generated
	@Selector("taskDescription")
	public native String taskDescription();

	/**
	 * taskIdentifier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Foundation/Reference/NSURLSessionTask_class/index.html#//apple_ref/occ/instp/NSURLSessionTask/taskIdentifier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("taskIdentifier")
	@NUInt
	public native long taskIdentifier();

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
