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
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileHandle alloc();

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
    @Selector("fileHandleForReadingAtPath:")
    public static native NSFileHandle fileHandleForReadingAtPath(String path);

    @Generated
    @Selector("fileHandleForReadingFromURL:error:")
    public static native NSFileHandle fileHandleForReadingFromURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("fileHandleForUpdatingAtPath:")
    public static native NSFileHandle fileHandleForUpdatingAtPath(String path);

    @Generated
    @Selector("fileHandleForUpdatingURL:error:")
    public static native NSFileHandle fileHandleForUpdatingURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("fileHandleForWritingAtPath:")
    public static native NSFileHandle fileHandleForWritingAtPath(String path);

    @Generated
    @Selector("fileHandleForWritingToURL:error:")
    public static native NSFileHandle fileHandleForWritingToURLError(NSURL url,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("fileHandleWithNullDevice")
    public static native NSFileHandle fileHandleWithNullDevice();

    @Generated
    @Selector("fileHandleWithStandardError")
    public static native NSFileHandle fileHandleWithStandardError();

    @Generated
    @Selector("fileHandleWithStandardInput")
    public static native NSFileHandle fileHandleWithStandardInput();

    @Generated
    @Selector("fileHandleWithStandardOutput")
    public static native NSFileHandle fileHandleWithStandardOutput();

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
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("acceptConnectionInBackgroundAndNotify")
    public native void acceptConnectionInBackgroundAndNotify();

    @Generated
    @Selector("acceptConnectionInBackgroundAndNotifyForModes:")
    public native void acceptConnectionInBackgroundAndNotifyForModes(NSArray<String> modes);

    @Generated
    @Selector("availableData")
    public native NSData availableData();

    @Generated
    @Selector("closeFile")
    public native void closeFile();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("fileDescriptor")
    public native int fileDescriptor();

    @Generated
    @Selector("init")
    public native NSFileHandle init();

    @Generated
    @Selector("initWithCoder:")
    public native NSFileHandle initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFileDescriptor:")
    public native NSFileHandle initWithFileDescriptor(int fd);

    @Generated
    @Selector("initWithFileDescriptor:closeOnDealloc:")
    public native NSFileHandle initWithFileDescriptorCloseOnDealloc(int fd, boolean closeopt);

    @Generated
    @Selector("offsetInFile")
    public native long offsetInFile();

    @Generated
    @Selector("readDataOfLength:")
    public native NSData readDataOfLength(@NUInt long length);

    /**
     * The API below may throw exceptions and will be deprecated in a future version of the OS.
     * Use their replacements instead.
     */
    @Generated
    @Selector("readDataToEndOfFile")
    public native NSData readDataToEndOfFile();

    @Generated
    @Selector("readInBackgroundAndNotify")
    public native void readInBackgroundAndNotify();

    @Generated
    @Selector("readInBackgroundAndNotifyForModes:")
    public native void readInBackgroundAndNotifyForModes(NSArray<String> modes);

    @Generated
    @Selector("readToEndOfFileInBackgroundAndNotify")
    public native void readToEndOfFileInBackgroundAndNotify();

    @Generated
    @Selector("readToEndOfFileInBackgroundAndNotifyForModes:")
    public native void readToEndOfFileInBackgroundAndNotifyForModes(NSArray<String> modes);

    @Generated
    @Selector("readabilityHandler")
    @ObjCBlock(name = "call_readabilityHandler_ret")
    public native Block_readabilityHandler_ret readabilityHandler();

    @Generated
    @Selector("seekToEndOfFile")
    public native long seekToEndOfFile();

    @Generated
    @Selector("seekToFileOffset:")
    public native void seekToFileOffset(long offset);

    @Generated
    @Selector("setReadabilityHandler:")
    public native void setReadabilityHandler(
            @ObjCBlock(name = "call_setReadabilityHandler") Block_setReadabilityHandler value);

    @Generated
    @Selector("setWriteabilityHandler:")
    public native void setWriteabilityHandler(
            @ObjCBlock(name = "call_setWriteabilityHandler") Block_setWriteabilityHandler value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("synchronizeFile")
    public native void synchronizeFile();

    @Generated
    @Selector("truncateFileAtOffset:")
    public native void truncateFileAtOffset(long offset);

    @Generated
    @Selector("waitForDataInBackgroundAndNotify")
    public native void waitForDataInBackgroundAndNotify();

    @Generated
    @Selector("waitForDataInBackgroundAndNotifyForModes:")
    public native void waitForDataInBackgroundAndNotifyForModes(NSArray<String> modes);

    @Generated
    @Selector("writeData:")
    public native void writeData(NSData data);

    @Generated
    @Selector("writeabilityHandler")
    @ObjCBlock(name = "call_writeabilityHandler_ret")
    public native Block_writeabilityHandler_ret writeabilityHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readabilityHandler_ret {
        @Generated
        void call_readabilityHandler_ret(NSFileHandle arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setReadabilityHandler {
        @Generated
        void call_setReadabilityHandler(NSFileHandle arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWriteabilityHandler {
        @Generated
        void call_setWriteabilityHandler(NSFileHandle arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeabilityHandler_ret {
        @Generated
        void call_writeabilityHandler_ret(NSFileHandle arg0);
    }

    @Generated
    @Selector("closeAndReturnError:")
    public native boolean closeAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("getOffset:error:")
    public native boolean getOffsetError(LongPtr offsetInFile, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("readDataToEndOfFileAndReturnError:")
    public native NSData readDataToEndOfFileAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("readDataUpToLength:error:")
    public native NSData readDataUpToLengthError(@NUInt long length,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("seekToEndReturningOffset:error:")
    public native boolean seekToEndReturningOffsetError(LongPtr offsetInFile,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("seekToOffset:error:")
    public native boolean seekToOffsetError(long offset, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("synchronizeAndReturnError:")
    public native boolean synchronizeAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("truncateAtOffset:error:")
    public native boolean truncateAtOffsetError(long offset, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("writeData:error:")
    public native boolean writeDataError(NSData data, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
