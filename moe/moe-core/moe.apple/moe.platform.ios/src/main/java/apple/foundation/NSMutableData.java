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
public class NSMutableData extends NSData {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableData alloc();

    /**
     * appendBytes:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/appendBytes:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("appendBytes:length:")
    public native void appendBytesLength(ConstVoidPtr bytes, @NUInt long length);

    /**
     * appendData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/appendData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("appendData:")
    public native void appendData(NSData other);

    @Generated
    @Selector("data")
    public static native NSMutableData data();

    @Generated
    @Selector("dataWithBytes:length:")
    public static native NSMutableData dataWithBytesLength(ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:")
    public static native NSMutableData dataWithBytesNoCopyLength(VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("dataWithBytesNoCopy:length:freeWhenDone:")
    public static native NSMutableData dataWithBytesNoCopyLengthFreeWhenDone(VoidPtr bytes, @NUInt long length,
            boolean b);

    /**
     * dataWithCapacity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/clm/NSMutableData/dataWithCapacity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithCapacity:")
    public static native NSMutableData dataWithCapacity(@NUInt long aNumItems);

    @Generated
    @Selector("dataWithContentsOfFile:")
    public static native NSMutableData dataWithContentsOfFile(String path);

    @Generated
    @Selector("dataWithContentsOfFile:options:error:")
    public static native NSMutableData dataWithContentsOfFileOptionsError(String path, @NUInt long readOptionsMask,
            Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("dataWithContentsOfMappedFile:")
    public static native NSMutableData dataWithContentsOfMappedFile(String path);

    @Generated
    @Selector("dataWithContentsOfURL:")
    public static native NSMutableData dataWithContentsOfURL(NSURL url);

    @Generated
    @Selector("dataWithContentsOfURL:options:error:")
    public static native NSMutableData dataWithContentsOfURLOptionsError(NSURL url, @NUInt long readOptionsMask,
            Ptr<NSError> errorPtr);

    @Generated
    @Selector("dataWithData:")
    public static native NSMutableData dataWithData(NSData data);

    /**
     * dataWithLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/clm/NSMutableData/dataWithLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("dataWithLength:")
    public static native NSMutableData dataWithLength(@NUInt long length);

    /**
     * increaseLengthBy:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/increaseLengthBy:">iOS Dev Center</a>
     */
    @Generated
    @Selector("increaseLengthBy:")
    public native void increaseLengthBy(@NUInt long extraLength);

    @Generated
    @Selector("init")
    public native NSMutableData init();

    @Generated
    @Selector("initWithBase64EncodedData:options:")
    public native NSMutableData initWithBase64EncodedDataOptions(NSData base64Data, @NUInt long options);

    @Generated
    @Selector("initWithBase64EncodedString:options:")
    public native NSMutableData initWithBase64EncodedStringOptions(String base64String, @NUInt long options);

    @Generated
    @Deprecated
    @Selector("initWithBase64Encoding:")
    public native NSMutableData initWithBase64Encoding(String base64String);

    @Generated
    @Selector("initWithBytes:length:")
    public native NSMutableData initWithBytesLength(ConstVoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:")
    public native NSMutableData initWithBytesNoCopyLength(VoidPtr bytes, @NUInt long length);

    @Generated
    @Selector("initWithBytesNoCopy:length:deallocator:")
    public native NSMutableData initWithBytesNoCopyLengthDeallocator(VoidPtr bytes, @NUInt long length,
            @ObjCBlock(name = "call_initWithBytesNoCopyLengthDeallocator") NSData.Block_initWithBytesNoCopyLengthDeallocator deallocator);

    @Generated
    @Selector("initWithBytesNoCopy:length:freeWhenDone:")
    public native NSMutableData initWithBytesNoCopyLengthFreeWhenDone(VoidPtr bytes, @NUInt long length, boolean b);

    /**
     * initWithCapacity:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/initWithCapacity:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableData initWithCapacity(@NUInt long capacity);

    @Generated
    @Selector("initWithContentsOfFile:")
    public native NSMutableData initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithContentsOfFile:options:error:")
    public native NSMutableData initWithContentsOfFileOptionsError(String path, @NUInt long readOptionsMask,
            Ptr<NSError> errorPtr);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfMappedFile:")
    public native NSMutableData initWithContentsOfMappedFile(String path);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native NSMutableData initWithContentsOfURL(NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:options:error:")
    public native NSMutableData initWithContentsOfURLOptionsError(NSURL url, @NUInt long readOptionsMask,
            Ptr<NSError> errorPtr);

    @Generated
    @Selector("initWithData:")
    public native NSMutableData initWithData(NSData data);

    /**
     * initWithLength:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/initWithLength:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithLength:")
    public native NSMutableData initWithLength(@NUInt long length);

    /**
     * length</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instp/NSMutableData/length">iOS Dev Center</a>
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    /**
     * mutableBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instp/NSMutableData/mutableBytes">iOS Dev Center</a>
     */
    @Generated
    @Selector("mutableBytes")
    public native VoidPtr mutableBytes();

    /**
     * replaceBytesInRange:withBytes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/replaceBytesInRange:withBytes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceBytesInRange:withBytes:")
    public native void replaceBytesInRangeWithBytes(@ByValue NSRange range, ConstVoidPtr bytes);

    /**
     * replaceBytesInRange:withBytes:length:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/replaceBytesInRange:withBytes:length:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceBytesInRange:withBytes:length:")
    public native void replaceBytesInRangeWithBytesLength(@ByValue NSRange range, ConstVoidPtr replacementBytes,
            @NUInt long replacementLength);

    /**
     * resetBytesInRange:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/resetBytesInRange:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resetBytesInRange:")
    public native void resetBytesInRange(@ByValue NSRange range);

    /**
     * setData:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instm/NSMutableData/setData:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setData:")
    public native void setData(NSData data);

    /**
     * length</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSMutableData_Class/index.html#//apple_ref/occ/instp/NSMutableData/length">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLength:")
    public native void setLength(@NUInt long value);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableData initWithCoder(NSCoder aDecoder);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
