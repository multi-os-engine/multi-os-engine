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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileHandle extends NSObject implements NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFileHandle(Pointer peer) {
		super(peer);
	}

	/**
	 * acceptConnectionInBackgroundAndNotify</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/acceptConnectionInBackgroundAndNotify">iOS Dev Center</a>
	 */
	@Generated
	@Selector("acceptConnectionInBackgroundAndNotify")
	public native void acceptConnectionInBackgroundAndNotify();

	/**
	 * acceptConnectionInBackgroundAndNotifyForModes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/acceptConnectionInBackgroundAndNotifyForModes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("acceptConnectionInBackgroundAndNotifyForModes:")
	public native void acceptConnectionInBackgroundAndNotifyForModes(
			NSArray<String> modes);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFileHandle alloc();

	/**
	 * availableData</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instp/NSFileHandle/availableData">iOS Dev Center</a>
	 */
	@Generated
	@Selector("availableData")
	public native NSData availableData();

	/**
	 * closeFile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/closeFile">iOS Dev Center</a>
	 */
	@Generated
	@Selector("closeFile")
	public native void closeFile();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * fileDescriptor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instp/NSFileHandle/fileDescriptor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileDescriptor")
	public native int fileDescriptor();

	/**
	 * fileHandleForReadingAtPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleForReadingAtPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleForReadingAtPath:")
	public static native NSFileHandle fileHandleForReadingAtPath(String path);

	/**
	 * fileHandleForReadingFromURL:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleForReadingFromURL:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleForReadingFromURL:error:")
	public static native NSFileHandle fileHandleForReadingFromURLError(
			NSURL url, Ptr<NSError> error);

	/**
	 * fileHandleForUpdatingAtPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleForUpdatingAtPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleForUpdatingAtPath:")
	public static native NSFileHandle fileHandleForUpdatingAtPath(String path);

	/**
	 * fileHandleForUpdatingURL:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleForUpdatingURL:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleForUpdatingURL:error:")
	public static native NSFileHandle fileHandleForUpdatingURLError(NSURL url,
			Ptr<NSError> error);

	/**
	 * fileHandleForWritingAtPath:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleForWritingAtPath:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleForWritingAtPath:")
	public static native NSFileHandle fileHandleForWritingAtPath(String path);

	/**
	 * fileHandleForWritingToURL:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleForWritingToURL:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleForWritingToURL:error:")
	public static native NSFileHandle fileHandleForWritingToURLError(NSURL url,
			Ptr<NSError> error);

	/**
	 * fileHandleWithNullDevice</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleWithNullDevice">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleWithNullDevice")
	public static native NSFileHandle fileHandleWithNullDevice();

	/**
	 * fileHandleWithStandardError</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleWithStandardError">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleWithStandardError")
	public static native NSFileHandle fileHandleWithStandardError();

	/**
	 * fileHandleWithStandardInput</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleWithStandardInput">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleWithStandardInput")
	public static native NSFileHandle fileHandleWithStandardInput();

	/**
	 * fileHandleWithStandardOutput</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/clm/NSFileHandle/fileHandleWithStandardOutput">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fileHandleWithStandardOutput")
	public static native NSFileHandle fileHandleWithStandardOutput();

	@Generated
	@Selector("init")
	public native NSFileHandle init();

	@Generated
	@Selector("initWithCoder:")
	public native NSFileHandle initWithCoder(NSCoder coder);

	/**
	 * initWithFileDescriptor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/initWithFileDescriptor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithFileDescriptor:")
	public native NSFileHandle initWithFileDescriptor(int fd);

	/**
	 * initWithFileDescriptor:closeOnDealloc:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/initWithFileDescriptor:closeOnDealloc:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithFileDescriptor:closeOnDealloc:")
	public native NSFileHandle initWithFileDescriptorCloseOnDealloc(int fd,
			boolean closeopt);

	/**
	 * offsetInFile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instp/NSFileHandle/offsetInFile">iOS Dev Center</a>
	 */
	@Generated
	@Selector("offsetInFile")
	public native long offsetInFile();

	/**
	 * readDataOfLength:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/readDataOfLength:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("readDataOfLength:")
	public native NSData readDataOfLength(@NUInt long length);

	/**
	 * readDataToEndOfFile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/readDataToEndOfFile">iOS Dev Center</a>
	 */
	@Generated
	@Selector("readDataToEndOfFile")
	public native NSData readDataToEndOfFile();

	/**
	 * readInBackgroundAndNotify</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/readInBackgroundAndNotify">iOS Dev Center</a>
	 */
	@Generated
	@Selector("readInBackgroundAndNotify")
	public native void readInBackgroundAndNotify();

	/**
	 * readInBackgroundAndNotifyForModes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/readInBackgroundAndNotifyForModes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("readInBackgroundAndNotifyForModes:")
	public native void readInBackgroundAndNotifyForModes(NSArray<String> modes);

	/**
	 * readToEndOfFileInBackgroundAndNotify</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/readToEndOfFileInBackgroundAndNotify">iOS Dev Center</a>
	 */
	@Generated
	@Selector("readToEndOfFileInBackgroundAndNotify")
	public native void readToEndOfFileInBackgroundAndNotify();

	/**
	 * readToEndOfFileInBackgroundAndNotifyForModes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/readToEndOfFileInBackgroundAndNotifyForModes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("readToEndOfFileInBackgroundAndNotifyForModes:")
	public native void readToEndOfFileInBackgroundAndNotifyForModes(
			NSArray<String> modes);

	/**
	 * seekToEndOfFile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/seekToEndOfFile">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekToEndOfFile")
	public native long seekToEndOfFile();

	/**
	 * seekToFileOffset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/seekToFileOffset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("seekToFileOffset:")
	public native void seekToFileOffset(long offset);

	/**
	 * readabilityHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instp/NSFileHandle/readabilityHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setReadabilityHandler:")
	public native void setReadabilityHandler(
			@ObjCBlock(name = "call_setReadabilityHandler") Block_setReadabilityHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setReadabilityHandler {
		@Generated
		void call_setReadabilityHandler(NSFileHandle arg0);
	}

	/**
	 * writeabilityHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instp/NSFileHandle/writeabilityHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setWriteabilityHandler:")
	public native void setWriteabilityHandler(
			@ObjCBlock(name = "call_setWriteabilityHandler") Block_setWriteabilityHandler value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_setWriteabilityHandler {
		@Generated
		void call_setWriteabilityHandler(NSFileHandle arg0);
	}

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * synchronizeFile</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/synchronizeFile">iOS Dev Center</a>
	 */
	@Generated
	@Selector("synchronizeFile")
	public native void synchronizeFile();

	/**
	 * truncateFileAtOffset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/truncateFileAtOffset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("truncateFileAtOffset:")
	public native void truncateFileAtOffset(long offset);

	/**
	 * waitForDataInBackgroundAndNotify</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/waitForDataInBackgroundAndNotify">iOS Dev Center</a>
	 */
	@Generated
	@Selector("waitForDataInBackgroundAndNotify")
	public native void waitForDataInBackgroundAndNotify();

	/**
	 * waitForDataInBackgroundAndNotifyForModes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/waitForDataInBackgroundAndNotifyForModes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("waitForDataInBackgroundAndNotifyForModes:")
	public native void waitForDataInBackgroundAndNotifyForModes(NSArray<String> modes);

	/**
	 * writeData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instm/NSFileHandle/writeData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("writeData:")
	public native void writeData(NSData data);

	/**
	 * readabilityHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instp/NSFileHandle/readabilityHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("readabilityHandler")
	@ObjCBlock(name = "call_readabilityHandler_ret")
	public native Block_readabilityHandler_ret readabilityHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_readabilityHandler_ret {
		@Generated
		void call_readabilityHandler_ret(NSFileHandle arg0);
	}

	/**
	 * writeabilityHandler</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSFileHandle_Class/index.html#//apple_ref/occ/instp/NSFileHandle/writeabilityHandler">iOS Dev Center</a>
	 */
	@Generated
	@Selector("writeabilityHandler")
	@ObjCBlock(name = "call_writeabilityHandler_ret")
	public native Block_writeabilityHandler_ret writeabilityHandler();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_writeabilityHandler_ret {
		@Generated
		void call_writeabilityHandler_ret(NSFileHandle arg0);
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
