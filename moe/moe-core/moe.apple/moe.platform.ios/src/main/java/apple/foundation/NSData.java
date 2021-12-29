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

/**
 * Immutable Data		***************
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
    @Selector("data")
    public static native NSData data();

    @Generated
    @Selector("dataWithBytes:length:")
    public static native NSData dataWithBytesLength(ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:")
    public static native NSData dataWithBytesNoCopyLength(VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:freeWhenDone:")
    public static native NSData dataWithBytesNoCopyLengthFreeWhenDone(VoidPtr bytes, @NUInt long length, boolean b);

    @Generated
    @Selector("dataWithContentsOfFile:")
    public static native NSData dataWithContentsOfFile(String path);

    @Generated
    @Selector("dataWithContentsOfFile:options:error:")
    public static native NSData dataWithContentsOfFileOptionsError(String path, @NUInt long readOptionsMask,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("dataWithContentsOfMappedFile:")
    public static native NSData dataWithContentsOfMappedFile(String path);

    @Generated
    @Selector("dataWithContentsOfURL:")
    public static native NSData dataWithContentsOfURL(NSURL url);

    @Generated
    @Selector("dataWithContentsOfURL:options:error:")
    public static native NSData dataWithContentsOfURLOptionsError(NSURL url, @NUInt long readOptionsMask,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Selector("dataWithData:")
    public static native NSData dataWithData(NSData data);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
     */
    @Generated
    @Selector("base64EncodedDataWithOptions:")
    public native NSData base64EncodedDataWithOptions(@NUInt long options);

    /**
     * Create a Base-64 encoded NSString from the receiver's contents using the given options.
     */
    @Generated
    @Selector("base64EncodedStringWithOptions:")
    public native String base64EncodedStringWithOptions(@NUInt long options);

    @Generated
    @Deprecated
    @Selector("base64Encoding")
    public native String base64Encoding();

    /**
     * The -bytes method returns a pointer to a contiguous region of memory managed by the receiver.
     * If the regions of memory represented by the receiver are already contiguous, it does so in O(1) time, otherwise it may take longer
     * Using -enumerateByteRangesUsingBlock: will be efficient for both contiguous and discontiguous data.
     */
    @Generated
    @Selector("bytes")
    public native ConstVoidPtr bytes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * 'block' is called once for each contiguous region of memory in the receiver (once total for contiguous NSDatas), until either all bytes have been enumerated, or the 'stop' parameter is set to YES.
     */
    @Generated
    @Selector("enumerateByteRangesUsingBlock:")
    public native void enumerateByteRangesUsingBlock(
            @ObjCBlock(name = "call_enumerateByteRangesUsingBlock") Block_enumerateByteRangesUsingBlock block);

    @Generated
    @Deprecated
    @Selector("getBytes:")
    public native void getBytes(VoidPtr buffer);

    @Generated
    @Selector("getBytes:length:")
    public native void getBytesLength(VoidPtr buffer, @NUInt long length);

    @Generated
    @Selector("getBytes:range:")
    public native void getBytesRange(VoidPtr buffer, @ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSData init();

    /**
     * Create an NSData from a Base-64, UTF-8 encoded NSData. By default, returns nil when the input is not recognized as valid Base-64.
     */
    @Generated
    @Selector("initWithBase64EncodedData:options:")
    public native NSData initWithBase64EncodedDataOptions(NSData base64Data, @NUInt long options);

    /**
     * Create an NSData from a Base-64 encoded NSString using the given options. By default, returns nil when the input is not recognized as valid Base-64.
     */
    @Generated
    @Selector("initWithBase64EncodedString:options:")
    public native NSData initWithBase64EncodedStringOptions(String base64String, @NUInt long options);

    /**
     * These methods first appeared in NSData.h on OS X 10.9 and iOS 7.0. They are deprecated in the same releases in favor of the methods in the NSDataBase64Encoding category. However, these methods have existed for several releases, so they may be used for applications targeting releases prior to OS X 10.9 and iOS 7.0.
     */
    @Generated
    @Deprecated
    @Selector("initWithBase64Encoding:")
    public native NSData initWithBase64Encoding(String base64String);

    @Generated
    @Selector("initWithBytes:length:")
    public native NSData initWithBytesLength(ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:")
    public native NSData initWithBytesNoCopyLength(VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:deallocator:")
    public native NSData initWithBytesNoCopyLengthDeallocator(VoidPtr bytes, @NUInt long length,
            @ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") Block_initWithBytesNoCopyLengthDeallocator deallocator);

    @Generated
    @Selector("initWithBytesNoCopy:length:freeWhenDone:")
    public native NSData initWithBytesNoCopyLengthFreeWhenDone(VoidPtr bytes, @NUInt long length, boolean b);

    @Generated
    @Selector("initWithCoder:")
    public native NSData initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSData initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithContentsOfFile:options:error:")
    public native NSData initWithContentsOfFileOptionsError(String path, @NUInt long readOptionsMask,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfMappedFile:")
    public native NSData initWithContentsOfMappedFile(String path);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSData initWithContentsOfURL(NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:options:error:")
    public native NSData initWithContentsOfURLOptionsError(NSURL url, @NUInt long readOptionsMask,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Generated
    @Selector("initWithData:")
    public native NSData initWithData(NSData data);

    @Generated
    @Selector("isEqualToData:")
    public native boolean isEqualToData(NSData other);

    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    @Generated
    @Selector("rangeOfData:options:range:")
    @ByValue
    public native NSRange rangeOfDataOptionsRange(NSData dataToFind, @NUInt long mask, @ByValue NSRange searchRange);

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
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    @Generated
    @Selector("writeToFile:options:error:")
    public native boolean writeToFileOptionsError(String path, @NUInt long writeOptionsMask,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    /**
     * the atomically flag is ignored if the url is not of a type the supports atomic writes
     */
    @Generated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(NSURL url, boolean atomically);

    @Generated
    @Selector("writeToURL:options:error:")
    public native boolean writeToURLOptionsError(NSURL url, @NUInt long writeOptionsMask,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> errorPtr);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateByteRangesUsingBlock {
        @Generated
        void call_enumerateByteRangesUsingBlock(ConstVoidPtr bytes, @ByValue NSRange byteRange, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithBytesNoCopyLengthDeallocator {
        @Generated
        void call_initWithBytesNoCopyLengthDeallocator(VoidPtr bytes, @NUInt long length);
    }

    @Generated
    @Selector("compressedDataUsingAlgorithm:error:")
    public native NSData compressedDataUsingAlgorithmError(@NInt long algorithm,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These methods return a compressed or decompressed version of the receiver using the specified algorithm.
     */
    @Generated
    @Selector("decompressedDataUsingAlgorithm:error:")
    public native NSData decompressedDataUsingAlgorithmError(@NInt long algorithm,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
