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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFileHandle allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
    public static native NSFileHandle fileHandleForReadingAtPath(@NotNull String path);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("fileHandleForReadingFromURL:error:")
    public static native NSFileHandle fileHandleForReadingFromURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("fileHandleForUpdatingAtPath:")
    public static native NSFileHandle fileHandleForUpdatingAtPath(@NotNull String path);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("fileHandleForUpdatingURL:error:")
    public static native NSFileHandle fileHandleForUpdatingURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("fileHandleForWritingAtPath:")
    public static native NSFileHandle fileHandleForWritingAtPath(@NotNull String path);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("fileHandleForWritingToURL:error:")
    public static native NSFileHandle fileHandleForWritingToURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @NotNull
    @Generated
    @Selector("fileHandleWithNullDevice")
    public static native NSFileHandle fileHandleWithNullDevice();

    @NotNull
    @Generated
    @Selector("fileHandleWithStandardError")
    public static native NSFileHandle fileHandleWithStandardError();

    @NotNull
    @Generated
    @Selector("fileHandleWithStandardInput")
    public static native NSFileHandle fileHandleWithStandardInput();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSFileHandle new_objc();

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
    public native void acceptConnectionInBackgroundAndNotifyForModes(@Nullable NSArray<String> modes);

    @NotNull
    @Generated
    @Selector("availableData")
    public native NSData availableData();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("closeFile")
    public native void closeFile();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("fileDescriptor")
    public native int fileDescriptor();

    @Generated
    @Selector("init")
    public native NSFileHandle init();

    @Generated
    @Selector("initWithCoder:")
    public native NSFileHandle initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFileDescriptor:")
    public native NSFileHandle initWithFileDescriptor(int fd);

    @Generated
    @Selector("initWithFileDescriptor:closeOnDealloc:")
    public native NSFileHandle initWithFileDescriptorCloseOnDealloc(int fd, boolean closeopt);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("offsetInFile")
    public native long offsetInFile();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("readDataOfLength:")
    public native NSData readDataOfLength(@NUInt long length);

    /**
     * The API below may throw exceptions and will be deprecated in a future version of the OS.
     * Use their replacements instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("readDataToEndOfFile")
    public native NSData readDataToEndOfFile();

    @Generated
    @Selector("readInBackgroundAndNotify")
    public native void readInBackgroundAndNotify();

    @Generated
    @Selector("readInBackgroundAndNotifyForModes:")
    public native void readInBackgroundAndNotifyForModes(@Nullable NSArray<String> modes);

    @Generated
    @Selector("readToEndOfFileInBackgroundAndNotify")
    public native void readToEndOfFileInBackgroundAndNotify();

    @Generated
    @Selector("readToEndOfFileInBackgroundAndNotifyForModes:")
    public native void readToEndOfFileInBackgroundAndNotifyForModes(@Nullable NSArray<String> modes);

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("readabilityHandler")
    @ObjCBlock(name = "call_readabilityHandler_ret")
    public native Block_readabilityHandler_ret readabilityHandler();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("seekToEndOfFile")
    public native long seekToEndOfFile();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("seekToFileOffset:")
    public native void seekToFileOffset(long offset);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setReadabilityHandler:")
    public native void setReadabilityHandler(
            @Nullable @ObjCBlock(name = "call_setReadabilityHandler") Block_setReadabilityHandler value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setWriteabilityHandler:")
    public native void setWriteabilityHandler(
            @Nullable @ObjCBlock(name = "call_setWriteabilityHandler") Block_setWriteabilityHandler value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("synchronizeFile")
    public native void synchronizeFile();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("truncateFileAtOffset:")
    public native void truncateFileAtOffset(long offset);

    @Generated
    @Selector("waitForDataInBackgroundAndNotify")
    public native void waitForDataInBackgroundAndNotify();

    @Generated
    @Selector("waitForDataInBackgroundAndNotifyForModes:")
    public native void waitForDataInBackgroundAndNotifyForModes(@Nullable NSArray<String> modes);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated
    @Generated
    @Selector("writeData:")
    public native void writeData(@NotNull NSData data);

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("writeabilityHandler")
    @ObjCBlock(name = "call_writeabilityHandler_ret")
    public native Block_writeabilityHandler_ret writeabilityHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readabilityHandler_ret {
        @Generated
        void call_readabilityHandler_ret(@NotNull NSFileHandle arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setReadabilityHandler {
        @Generated
        void call_setReadabilityHandler(@NotNull NSFileHandle arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWriteabilityHandler {
        @Generated
        void call_setWriteabilityHandler(@NotNull NSFileHandle arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeabilityHandler_ret {
        @Generated
        void call_writeabilityHandler_ret(@NotNull NSFileHandle arg0);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("closeAndReturnError:")
    public native boolean closeAndReturnError(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("getOffset:error:")
    public native boolean getOffsetError(@NotNull LongPtr offsetInFile,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("readDataToEndOfFileAndReturnError:")
    public native NSData readDataToEndOfFileAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("readDataUpToLength:error:")
    public native NSData readDataUpToLengthError(@NUInt long length,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("seekToEndReturningOffset:error:")
    public native boolean seekToEndReturningOffsetError(@Nullable LongPtr offsetInFile,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("seekToOffset:error:")
    public native boolean seekToOffsetError(long offset,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("synchronizeAndReturnError:")
    public native boolean synchronizeAndReturnError(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("truncateAtOffset:error:")
    public native boolean truncateAtOffsetError(long offset,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("writeData:error:")
    public native boolean writeDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
