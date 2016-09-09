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


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOutputStream extends NSStream {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOutputStream(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOutputStream alloc();

	/**
	 * hasSpaceAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/instp/NSOutputStream/hasSpaceAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hasSpaceAvailable")
	public native boolean hasSpaceAvailable();

	@Generated
	@Selector("init")
	public native NSOutputStream init();

	/**
	 * initToBuffer:capacity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/instm/NSOutputStream/initToBuffer:capacity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initToBuffer:capacity:")
	public native NSOutputStream initToBufferCapacity(BytePtr buffer,
			@NUInt long capacity);

	/**
	 * initToFileAtPath:append:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/instm/NSOutputStream/initToFileAtPath:append:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initToFileAtPath:append:")
	public native NSOutputStream initToFileAtPathAppend(String path,
			boolean shouldAppend);

	/**
	 * initToMemory</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/instm/NSOutputStream/initToMemory">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initToMemory")
	public native NSOutputStream initToMemory();

	/**
	 * initWithURL:append:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/instm/NSOutputStream/initWithURL:append:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithURL:append:")
	public native NSOutputStream initWithURLAppend(NSURL url,
			boolean shouldAppend);

	/**
	 * outputStreamToBuffer:capacity:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/clm/NSOutputStream/outputStreamToBuffer:capacity:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputStreamToBuffer:capacity:")
	public static native NSOutputStream outputStreamToBufferCapacity(
			BytePtr buffer, @NUInt long capacity);

	/**
	 * outputStreamToFileAtPath:append:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/clm/NSOutputStream/outputStreamToFileAtPath:append:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputStreamToFileAtPath:append:")
	public static native NSOutputStream outputStreamToFileAtPathAppend(
			String path, boolean shouldAppend);

	/**
	 * outputStreamToMemory</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/clm/NSOutputStream/outputStreamToMemory">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputStreamToMemory")
	public static native NSOutputStream outputStreamToMemory();

	/**
	 * outputStreamWithURL:append:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/clm/NSOutputStream/outputStreamWithURL:append:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("outputStreamWithURL:append:")
	public static native NSOutputStream outputStreamWithURLAppend(NSURL url,
			boolean shouldAppend);

	/**
	 * write:maxLength:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSOutputStream_Class/index.html#//apple_ref/occ/instm/NSOutputStream/write:maxLength:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("write:maxLength:")
	@NInt
	public native long writeMaxLength(
			ConstBytePtr buffer,
			@NUInt long len);

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
	@Selector("getBoundStreamsWithBufferSize:inputStream:outputStream:")
	public static native void getBoundStreamsWithBufferSizeInputStreamOutputStream(
			@NUInt long bufferSize, Ptr<NSInputStream> inputStream,
			Ptr<NSOutputStream> outputStream);

	@Generated
	@Selector("getStreamsToHostWithName:port:inputStream:outputStream:")
	public static native void getStreamsToHostWithNamePortInputStreamOutputStream(
			String hostname, @NInt long port, Ptr<NSInputStream> inputStream,
			Ptr<NSOutputStream> outputStream);

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
