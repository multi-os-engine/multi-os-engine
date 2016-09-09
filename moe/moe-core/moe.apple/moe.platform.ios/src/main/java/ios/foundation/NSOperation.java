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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOperation extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOperation(Pointer peer) {
		super(peer);
	}

	/**
	 * addDependency:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instm/NSOperation/addDependency:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addDependency:")
	public native void addDependency(NSOperation op);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOperation alloc();

	/**
	 * cancel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instm/NSOperation/cancel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancel")
	public native void cancel();

	/**
	 * dependencies</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/dependencies">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dependencies")
	public native NSArray<? extends NSOperation> dependencies();

	/**
	 * init</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instm/NSOperation/init">iOS Dev Center</a>
	 */
	@Generated
	@Selector("init")
	public native NSOperation init();

	/**
	 * asynchronous</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/asynchronous">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAsynchronous")
	public native boolean isAsynchronous();

	/**
	 * cancelled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/cancelled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isCancelled")
	public native boolean isCancelled();

	/**
	 * concurrent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/concurrent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isConcurrent")
	public native boolean isConcurrent();

	/**
	 * executing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/executing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isExecuting")
	public native boolean isExecuting();

	/**
	 * finished</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/finished">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isFinished")
	public native boolean isFinished();

	/**
	 * ready</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/ready">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isReady")
	public native boolean isReady();

	/**
	 * main</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instm/NSOperation/main">iOS Dev Center</a>
	 */
	@Generated
	@Selector("main")
	public native void main();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * qualityOfService</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/qualityOfService">iOS Dev Center</a>
	 */
	@Generated
	@Selector("qualityOfService")
	@NInt
	public native long qualityOfService();

	/**
	 * queuePriority</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/queuePriority">iOS Dev Center</a>
	 */
	@Generated
	@Selector("queuePriority")
	@NInt
	public native long queuePriority();

	/**
	 * removeDependency:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instm/NSOperation/removeDependency:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeDependency:")
	public native void removeDependency(NSOperation op);

	/**
	 * completionBlock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/completionBlock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCompletionBlock:")
	public native void setCompletionBlock(
			@ObjCBlock(name = "call_setCompletionBlock") Block_setCompletionBlock value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setCompletionBlock {
		@Generated
		void call_setCompletionBlock();
	}

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * qualityOfService</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/qualityOfService">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setQualityOfService:")
	public native void setQualityOfService(@NInt long value);

	/**
	 * queuePriority</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/queuePriority">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setQueuePriority:")
	public native void setQueuePriority(@NInt long value);

	/**
	 * threadPriority</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/threadPriority">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setThreadPriority:")
	public native void setThreadPriority(double value);

	/**
	 * start</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instm/NSOperation/start">iOS Dev Center</a>
	 */
	@Generated
	@Selector("start")
	public native void start();

	/**
	 * threadPriority</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/threadPriority">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("threadPriority")
	public native double threadPriority();

	/**
	 * waitUntilFinished</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instm/NSOperation/waitUntilFinished">iOS Dev Center</a>
	 */
	@Generated
	@Selector("waitUntilFinished")
	public native void waitUntilFinished();

	/**
	 * completionBlock</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/NSOperation_class/index.html#//apple_ref/occ/instp/NSOperation/completionBlock">iOS Dev Center</a>
	 */
	@Generated
	@Selector("completionBlock")
	@ObjCBlock(name = "call_completionBlock_ret")
	public native Block_completionBlock_ret completionBlock();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_completionBlock_ret {
		@Generated
		void call_completionBlock_ret();
	}

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
	public static native void load_objc();

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
	public static native long version();
}
