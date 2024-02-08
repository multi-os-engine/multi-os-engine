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
import apple.cloudkit.protocol.CKRecordValue;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
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

/**
 * Immutable Data ***************
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSData extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding, CKRecordValue {
    static {
        NatJ.register();
    }

    @Generated
    protected NSData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSData alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSData allocWithZone(VoidPtr zone);

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
    @Selector("data")
    public static native NSData data();

    @Generated
    @Selector("dataWithBytes:length:")
    public static native NSData dataWithBytesLength(@Nullable ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:")
    public static native NSData dataWithBytesNoCopyLength(@NotNull VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:freeWhenDone:")
    public static native NSData dataWithBytesNoCopyLengthFreeWhenDone(@NotNull VoidPtr bytes, @NUInt long length,
            boolean b);

    @Generated
    @Selector("dataWithContentsOfFile:")
    public static native NSData dataWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("dataWithContentsOfFile:options:error:")
    public static native NSData dataWithContentsOfFileOptionsError(@NotNull String path, @NUInt long readOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use +dataWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or
     * NSDataReadingMappedAlways instead.
     */
    @Generated
    @Deprecated
    @Selector("dataWithContentsOfMappedFile:")
    public static native NSData dataWithContentsOfMappedFile(@NotNull String path);

    @Generated
    @Selector("dataWithContentsOfURL:")
    public static native NSData dataWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("dataWithContentsOfURL:options:error:")
    public static native NSData dataWithContentsOfURLOptionsError(@NotNull NSURL url, @NUInt long readOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Selector("dataWithData:")
    public static native NSData dataWithData(@NotNull NSData data);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

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
    public static native NSData new_objc();

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

    /**
     * Create a Base-64, UTF-8 encoded NSData from the receiver's contents using the given options.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("base64EncodedDataWithOptions:")
    public native NSData base64EncodedDataWithOptions(@NUInt long options);

    /**
     * Create a Base-64 encoded NSString from the receiver's contents using the given options.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @Selector("base64EncodedStringWithOptions:")
    public native String base64EncodedStringWithOptions(@NUInt long options);

    /**
     * API-Since: 4.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use base64EncodedStringWithOptions: instead
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("base64Encoding")
    public native String base64Encoding();

    /**
     * The -bytes method returns a pointer to a contiguous region of memory managed by the receiver.
     * If the regions of memory represented by the receiver are already contiguous, it does so in O(1) time, otherwise
     * it may take longer
     * Using -enumerateByteRangesUsingBlock: will be efficient for both contiguous and discontiguous data.
     */
    @NotNull
    @Generated
    @Selector("bytes")
    public native ConstVoidPtr bytes();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @NotNull
    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * 'block' is called once for each contiguous region of memory in the receiver (once total for contiguous NSDatas),
     * until either all bytes have been enumerated, or the 'stop' parameter is set to YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("enumerateByteRangesUsingBlock:")
    public native void enumerateByteRangesUsingBlock(
            @NotNull @ObjCBlock(name = "call_enumerateByteRangesUsingBlock") Block_enumerateByteRangesUsingBlock block);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: This method is unsafe because it could potentially cause buffer overruns. Use
     * -getBytes:length: instead.
     */
    @Generated
    @Deprecated
    @Selector("getBytes:")
    public native void getBytes(@NotNull VoidPtr buffer);

    @Generated
    @Selector("getBytes:length:")
    public native void getBytesLength(@NotNull VoidPtr buffer, @NUInt long length);

    @Generated
    @Selector("getBytes:range:")
    public native void getBytesRange(@NotNull VoidPtr buffer, @ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSData init();

    /**
     * Create an NSData from a Base-64, UTF-8 encoded NSData. By default, returns nil when the input is not recognized
     * as valid Base-64.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("initWithBase64EncodedData:options:")
    public native NSData initWithBase64EncodedDataOptions(@NotNull NSData base64Data, @NUInt long options);

    /**
     * Create an NSData from a Base-64 encoded NSString using the given options. By default, returns nil when the input
     * is not recognized as valid Base-64.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("initWithBase64EncodedString:options:")
    public native NSData initWithBase64EncodedStringOptions(@NotNull String base64String, @NUInt long options);

    /**
     * These methods first appeared in NSData.h on OS X 10.9 and iOS 7.0. They are deprecated in the same releases in
     * favor of the methods in the NSDataBase64Encoding category. However, these methods have existed for several
     * releases, so they may be used for applications targeting releases prior to OS X 10.9 and iOS 7.0.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use initWithBase64EncodedString:options: instead
     */
    @Generated
    @Deprecated
    @Selector("initWithBase64Encoding:")
    public native NSData initWithBase64Encoding(@NotNull String base64String);

    @Generated
    @Selector("initWithBytes:length:")
    public native NSData initWithBytesLength(@Nullable ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:")
    public native NSData initWithBytesNoCopyLength(@NotNull VoidPtr bytes, @NUInt long length);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("initWithBytesNoCopy:length:deallocator:")
    public native NSData initWithBytesNoCopyLengthDeallocator(@NotNull VoidPtr bytes, @NUInt long length,
            @Nullable @ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") Block_initWithBytesNoCopyLengthDeallocator deallocator);

    @Generated
    @Selector("initWithBytesNoCopy:length:freeWhenDone:")
    public native NSData initWithBytesNoCopyLengthFreeWhenDone(@NotNull VoidPtr bytes, @NUInt long length, boolean b);

    @Generated
    @Selector("initWithCoder:")
    public native NSData initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSData initWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("initWithContentsOfFile:options:error:")
    public native NSData initWithContentsOfFileOptionsError(@NotNull String path, @NUInt long readOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use -initWithContentsOfURL:options:error: and NSDataReadingMappedIfSafe or
     * NSDataReadingMappedAlways instead.
     */
    @Generated
    @Deprecated
    @Selector("initWithContentsOfMappedFile:")
    public native NSData initWithContentsOfMappedFile(@NotNull String path);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSData initWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:options:error:")
    public native NSData initWithContentsOfURLOptionsError(@NotNull NSURL url, @NUInt long readOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Selector("initWithData:")
    public native NSData initWithData(@NotNull NSData data);

    @Generated
    @Selector("isEqualToData:")
    public native boolean isEqualToData(@NotNull NSData other);

    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("rangeOfData:options:range:")
    @ByValue
    public native NSRange rangeOfDataOptionsRange(@NotNull NSData dataToFind, @NUInt long mask,
            @ByValue NSRange searchRange);

    @NotNull
    @Generated
    @Selector("subdataWithRange:")
    public native NSData subdataWithRange(@ByValue NSRange range);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(@NotNull String path, boolean useAuxiliaryFile);

    @Generated
    @Selector("writeToFile:options:error:")
    public native boolean writeToFileOptionsError(@NotNull String path, @NUInt long writeOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * the atomically flag is ignored if the url is not of a type the supports atomic writes
     */
    @Generated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(@NotNull NSURL url, boolean atomically);

    @Generated
    @Selector("writeToURL:options:error:")
    public native boolean writeToURLOptionsError(@NotNull NSURL url, @NUInt long writeOptionsMask,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateByteRangesUsingBlock {
        @Generated
        void call_enumerateByteRangesUsingBlock(@NotNull ConstVoidPtr bytes, @ByValue NSRange byteRange,
                @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithBytesNoCopyLengthDeallocator {
        @Generated
        void call_initWithBytesNoCopyLengthDeallocator(@NotNull VoidPtr bytes, @NUInt long length);
    }

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("compressedDataUsingAlgorithm:error:")
    public native NSData compressedDataUsingAlgorithmError(@NInt long algorithm,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These methods return a compressed or decompressed version of the receiver using the specified algorithm.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("decompressedDataUsingAlgorithm:error:")
    public native NSData decompressedDataUsingAlgorithmError(@NInt long algorithm,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
