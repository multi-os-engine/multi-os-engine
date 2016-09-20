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
    @Owned
    @Selector("alloc")
    public static native NSData alloc();

    /**
     * data</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/data">iOS Dev Center</a>
     */
    @Generated
    @Selector("data")
    public static native NSData data();

    /**
     * dataWithBytes:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithBytes:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithBytes:length:")
    public static native NSData dataWithBytesLength(ConstVoidPtr bytes, @NUInt long length);

    /**
     * dataWithBytesNoCopy:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithBytesNoCopy:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithBytesNoCopy:length:")
    public static native NSData dataWithBytesNoCopyLength(VoidPtr bytes, @NUInt long length);

    /**
     * dataWithBytesNoCopy:length:freeWhenDone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithBytesNoCopy:length:freeWhenDone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithBytesNoCopy:length:freeWhenDone:")
    public static native NSData dataWithBytesNoCopyLengthFreeWhenDone(VoidPtr bytes, @NUInt long length, boolean b);

    /**
     * dataWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithContentsOfFile:")
    public static native NSData dataWithContentsOfFile(String path);

    /**
     * dataWithContentsOfFile:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithContentsOfFile:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithContentsOfFile:options:error:")
    public static native NSData dataWithContentsOfFileOptionsError(String path, @NUInt long readOptionsMask,
            Ptr<NSError> errorPtr);

    /**
     * dataWithContentsOfMappedFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithContentsOfMappedFile:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("dataWithContentsOfMappedFile:")
    public static native NSData dataWithContentsOfMappedFile(String path);

    /**
     * dataWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithContentsOfURL:")
    public static native NSData dataWithContentsOfURL(NSURL url);

    /**
     * dataWithContentsOfURL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithContentsOfURL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithContentsOfURL:options:error:")
    public static native NSData dataWithContentsOfURLOptionsError(NSURL url, @NUInt long readOptionsMask,
            Ptr<NSError> errorPtr);

    /**
     * dataWithData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/clm/NSData/dataWithData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithData:")
    public static native NSData dataWithData(NSData data);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
     * base64EncodedDataWithOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/base64EncodedDataWithOptions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("base64EncodedDataWithOptions:")
    public native NSData base64EncodedDataWithOptions(@NUInt long options);

    /**
     * base64EncodedStringWithOptions:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/base64EncodedStringWithOptions:">iOS Dev Center</a>
     */
    @Generated
    @Selector("base64EncodedStringWithOptions:")
    public native String base64EncodedStringWithOptions(@NUInt long options);

    /**
     * base64Encoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/base64Encoding">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("base64Encoding")
    public native String base64Encoding();

    /**
     * bytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instp/NSData/bytes">iOS Dev Center</a>
     */
    @Generated
    @Selector("bytes")
    public native ConstVoidPtr bytes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * description</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instp/NSData/description">iOS Dev Center</a>
     */
    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * enumerateByteRangesUsingBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/enumerateByteRangesUsingBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("enumerateByteRangesUsingBlock:")
    public native void enumerateByteRangesUsingBlock(
            @ObjCBlock(name = "call_enumerateByteRangesUsingBlock") Block_enumerateByteRangesUsingBlock block);

    /**
     * getBytes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/getBytes:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("getBytes:")
    public native void getBytes(VoidPtr buffer);

    /**
     * getBytes:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/getBytes:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getBytes:length:")
    public native void getBytesLength(VoidPtr buffer, @NUInt long length);

    /**
     * getBytes:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/getBytes:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getBytes:range:")
    public native void getBytesRange(VoidPtr buffer, @ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSData init();

    /**
     * initWithBase64EncodedData:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithBase64EncodedData:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBase64EncodedData:options:")
    public native NSData initWithBase64EncodedDataOptions(NSData base64Data, @NUInt long options);

    /**
     * initWithBase64EncodedString:options:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithBase64EncodedString:options:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBase64EncodedString:options:")
    public native NSData initWithBase64EncodedStringOptions(String base64String, @NUInt long options);

    /**
     * initWithBase64Encoding:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithBase64Encoding:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("initWithBase64Encoding:")
    public native NSData initWithBase64Encoding(String base64String);

    /**
     * initWithBytes:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithBytes:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBytes:length:")
    public native NSData initWithBytesLength(ConstVoidPtr bytes, @NUInt long length);

    /**
     * initWithBytesNoCopy:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithBytesNoCopy:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBytesNoCopy:length:")
    public native NSData initWithBytesNoCopyLength(VoidPtr bytes, @NUInt long length);

    /**
     * initWithBytesNoCopy:length:deallocator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithBytesNoCopy:length:deallocator:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBytesNoCopy:length:deallocator:")
    public native NSData initWithBytesNoCopyLengthDeallocator(VoidPtr bytes, @NUInt long length,
            @ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") Block_initWithBytesNoCopyLengthDeallocator deallocator);

    /**
     * initWithBytesNoCopy:length:freeWhenDone:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithBytesNoCopy:length:freeWhenDone:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithBytesNoCopy:length:freeWhenDone:")
    public native NSData initWithBytesNoCopyLengthFreeWhenDone(VoidPtr bytes, @NUInt long length, boolean b);

    @Generated
    @Selector("initWithCoder:")
    public native NSData initWithCoder(NSCoder aDecoder);

    /**
     * initWithContentsOfFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithContentsOfFile:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSData initWithContentsOfFile(String path);

    /**
     * initWithContentsOfFile:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithContentsOfFile:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfFile:options:error:")
    public native NSData initWithContentsOfFileOptionsError(String path, @NUInt long readOptionsMask,
            Ptr<NSError> errorPtr);

    /**
     * initWithContentsOfMappedFile:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithContentsOfMappedFile:">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("initWithContentsOfMappedFile:")
    public native NSData initWithContentsOfMappedFile(String path);

    /**
     * initWithContentsOfURL:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithContentsOfURL:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSData initWithContentsOfURL(NSURL url);

    /**
     * initWithContentsOfURL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithContentsOfURL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithContentsOfURL:options:error:")
    public native NSData initWithContentsOfURLOptionsError(NSURL url, @NUInt long readOptionsMask,
            Ptr<NSError> errorPtr);

    /**
     * initWithData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/initWithData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithData:")
    public native NSData initWithData(NSData data);

    /**
     * isEqualToData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/isEqualToData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isEqualToData:")
    public native boolean isEqualToData(NSData other);

    /**
     * length</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instp/NSData/length">iOS Dev Center</a>
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    /**
     * rangeOfData:options:range:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/rangeOfData:options:range:">iOS Dev Center</a>
     */
    @Generated
    @Selector("rangeOfData:options:range:")
    @ByValue
    public native NSRange rangeOfDataOptionsRange(NSData dataToFind, @NUInt long mask, @ByValue NSRange searchRange);

    /**
     * subdataWithRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/subdataWithRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("subdataWithRange:")
    public native NSData subdataWithRange(@ByValue NSRange range);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * writeToFile:atomically:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/writeToFile:atomically:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    /**
     * writeToFile:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/writeToFile:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToFile:options:error:")
    public native boolean writeToFileOptionsError(String path, @NUInt long writeOptionsMask, Ptr<NSError> errorPtr);

    /**
     * writeToURL:atomically:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/writeToURL:atomically:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(NSURL url, boolean atomically);

    /**
     * writeToURL:options:error:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSData_Class/index.html#//apple_ref/occ/instm/NSData/writeToURL:options:error:">iOS Dev Center</a>
     */
    @Generated
    @Selector("writeToURL:options:error:")
    public native boolean writeToURLOptionsError(NSURL url, @NUInt long writeOptionsMask, Ptr<NSError> errorPtr);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateByteRangesUsingBlock {
        @Generated
        void call_enumerateByteRangesUsingBlock(ConstVoidPtr arg0, @ByValue NSRange arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithBytesNoCopyLengthDeallocator {
        @Generated
        void call_initWithBytesNoCopyLengthDeallocator(VoidPtr arg0, @NUInt long arg1);
    }
}
