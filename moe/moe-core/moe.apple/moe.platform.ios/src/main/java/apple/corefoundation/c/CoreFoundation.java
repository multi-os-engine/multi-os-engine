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

package apple.corefoundation.c;

import apple.NSObject;
import apple.corefoundation.opaque.*;
import apple.corefoundation.struct.CFAllocatorContext;
import apple.corefoundation.struct.CFArrayCallBacks;
import apple.corefoundation.struct.CFBagCallBacks;
import apple.corefoundation.struct.CFBinaryHeapCallBacks;
import apple.corefoundation.struct.CFBinaryHeapCompareContext;
import apple.corefoundation.struct.CFDictionaryKeyCallBacks;
import apple.corefoundation.struct.CFDictionaryValueCallBacks;
import apple.corefoundation.struct.CFFileDescriptorContext;
import apple.corefoundation.struct.CFGregorianDate;
import apple.corefoundation.struct.CFGregorianUnits;
import apple.corefoundation.struct.CFMachPortContext;
import apple.corefoundation.struct.CFMessagePortContext;
import apple.corefoundation.struct.CFRange;
import apple.corefoundation.struct.CFRunLoopObserverContext;
import apple.corefoundation.struct.CFRunLoopSourceContext;
import apple.corefoundation.struct.CFRunLoopTimerContext;
import apple.corefoundation.struct.CFSetCallBacks;
import apple.corefoundation.struct.CFSocketContext;
import apple.corefoundation.struct.CFSocketSignature;
import apple.corefoundation.struct.CFStreamClientContext;
import apple.corefoundation.struct.CFStreamError;
import apple.corefoundation.struct.CFStringInlineBuffer;
import apple.corefoundation.struct.CFSwappedFloat32;
import apple.corefoundation.struct.CFSwappedFloat64;
import apple.corefoundation.struct.CFTreeContext;
import apple.corefoundation.struct.CFUUIDBytes;
import apple.opaque.acl_t;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("CoreFoundation")
@Runtime(CRuntime.class)
public final class CoreFoundation {
    static {
        NatJ.register();
    }

    @Generated
    private CoreFoundation() {
    }

    /**
     * CFRangeMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBaseUtils/index.html#//apple_ref/c/func/CFRangeMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFRange CFRangeMake(@NInt long loc, @NInt long len);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange __CFRangeMake(@NInt long loc, @NInt long len);

    /**
     * CFNullGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNullRef/index.html#//apple_ref/c/func/CFNullGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFNullGetTypeID();

    /**
     * CFAllocatorGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFAllocatorGetTypeID();

    /**
     * CFAllocatorSetDefault</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorSetDefault">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAllocatorSetDefault(CFAllocatorRef allocator);

    /**
     * CFAllocatorGetDefault</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorGetDefault">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFAllocatorRef CFAllocatorGetDefault();

    /**
     * CFAllocatorCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFAllocatorRef CFAllocatorCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFAllocatorContext context);

    /**
     * CFAllocatorAllocate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorAllocate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr CFAllocatorAllocate(CFAllocatorRef allocator, @NInt long size, @NUInt long hint);

    /**
     * CFAllocatorReallocate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorReallocate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr CFAllocatorReallocate(CFAllocatorRef allocator, VoidPtr ptr, @NInt long newsize,
            @NUInt long hint);

    /**
     * CFAllocatorDeallocate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorDeallocate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAllocatorDeallocate(CFAllocatorRef allocator, VoidPtr ptr);

    /**
     * CFAllocatorGetPreferredSizeForSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorGetPreferredSizeForSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFAllocatorGetPreferredSizeForSize(CFAllocatorRef allocator, @NInt long size,
            @NUInt long hint);

    /**
     * CFAllocatorGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAllocatorRef/index.html#//apple_ref/c/func/CFAllocatorGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAllocatorGetContext(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFAllocatorContext context);

    /**
     * CFGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFGetTypeID(ConstVoidPtr cf);

    /**
     * CFCopyTypeIDDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFCopyTypeIDDescription">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFCopyTypeIDDescription(@NUInt long type_id);

    /**
     * CFRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFRetain(ConstVoidPtr cf);

    /**
     * CFRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRelease(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFAutorelease(ConstVoidPtr arg);

    /**
     * CFGetRetainCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFGetRetainCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFGetRetainCount(ConstVoidPtr cf);

    /**
     * CFEqual</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFEqual">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFEqual(ConstVoidPtr cf1, ConstVoidPtr cf2);

    /**
     * CFHash</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFHash">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFHash(ConstVoidPtr cf);

    /**
     * CFCopyDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFCopyDescription">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFCopyDescription(ConstVoidPtr cf);

    /**
     * CFGetAllocator</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFGetAllocator">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFAllocatorRef CFGetAllocator(ConstVoidPtr cf);

    /**
     * CFDictionaryGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFDictionaryGetTypeID();

    /**
     * CFDictionaryCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFDictionaryCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> keys,
            Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryKeyCallBacks keyCallBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryValueCallBacks valueCallBacks);

    /**
     * CFDictionaryCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFDictionaryCreateCopy(CFAllocatorRef allocator, CFDictionaryRef theDict);

    /**
     * CFDictionaryCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableDictionaryRef CFDictionaryCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryKeyCallBacks keyCallBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryValueCallBacks valueCallBacks);

    /**
     * CFDictionaryCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableDictionaryRef CFDictionaryCreateMutableCopy(CFAllocatorRef allocator,
            @NInt long capacity, CFDictionaryRef theDict);

    /**
     * CFDictionaryGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCount(CFDictionaryRef theDict);

    /**
     * CFDictionaryGetCountOfKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryGetCountOfKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCountOfKey(CFDictionaryRef theDict, ConstVoidPtr key);

    /**
     * CFDictionaryGetCountOfValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryGetCountOfValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCountOfValue(CFDictionaryRef theDict, ConstVoidPtr value);

    /**
     * CFDictionaryContainsKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryContainsKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFDictionaryContainsKey(CFDictionaryRef theDict, ConstVoidPtr key);

    /**
     * CFDictionaryContainsValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryContainsValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFDictionaryContainsValue(CFDictionaryRef theDict, ConstVoidPtr value);

    /**
     * CFDictionaryGetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryGetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFDictionaryGetValue(CFDictionaryRef theDict, ConstVoidPtr key);

    /**
     * CFDictionaryGetValueIfPresent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryGetValueIfPresent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFDictionaryGetValueIfPresent(CFDictionaryRef theDict, ConstVoidPtr key,
            Ptr<ConstVoidPtr> value);

    /**
     * CFDictionaryGetKeysAndValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryGetKeysAndValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDictionaryGetKeysAndValues(CFDictionaryRef theDict, Ptr<ConstVoidPtr> keys,
            Ptr<ConstVoidPtr> values);

    /**
     * CFDictionaryApplyFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryApplyFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDictionaryApplyFunction(CFDictionaryRef theDict,
            @FunctionPtr(name = "call_CFDictionaryApplyFunction") Function_CFDictionaryApplyFunction applier,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFDictionaryApplyFunction {
        @Generated
        void call_CFDictionaryApplyFunction(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    /**
     * CFDictionaryAddValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryAddValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDictionaryAddValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    /**
     * CFDictionarySetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDictionaryRef/index.html#//apple_ref/c/func/CFDictionarySetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDictionarySetValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    /**
     * CFDictionaryReplaceValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryReplaceValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDictionaryReplaceValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    /**
     * CFDictionaryRemoveValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryRemoveValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDictionaryRemoveValue(CFMutableDictionaryRef theDict, ConstVoidPtr key);

    /**
     * CFDictionaryRemoveAllValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDictionaryRef/index.html#//apple_ref/c/func/CFDictionaryRemoveAllValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDictionaryRemoveAllValues(CFMutableDictionaryRef theDict);

    /**
     * CFDataGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDataRef/index.html#//apple_ref/c/func/CFDataGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFDataGetTypeID();

    /**
     * CFDataCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDataRef/index.html#//apple_ref/c/func/CFDataCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFDataCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length);

    /**
     * CFDataCreateWithBytesNoCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDataRef/index.html#//apple_ref/c/func/CFDataCreateWithBytesNoCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFDataCreateWithBytesNoCopy(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length, CFAllocatorRef bytesDeallocator);

    /**
     * CFDataCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDataRef/index.html#//apple_ref/c/func/CFDataCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFDataCreateCopy(CFAllocatorRef allocator, CFDataRef theData);

    /**
     * CFDataCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDataRef/index.html#//apple_ref/c/func/CFDataCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableDataRef CFDataCreateMutable(CFAllocatorRef allocator, @NInt long capacity);

    /**
     * CFDataCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDataRef/index.html#//apple_ref/c/func/CFDataCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableDataRef CFDataCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFDataRef theData);

    /**
     * CFDataGetLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDataRef/index.html#//apple_ref/c/func/CFDataGetLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDataGetLength(CFDataRef theData);

    /**
     * CFDataGetBytePtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDataRef/index.html#//apple_ref/c/func/CFDataGetBytePtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFDataGetBytePtr(CFDataRef theData);

    /**
     * CFDataGetMutableBytePtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDataRef/index.html#//apple_ref/c/func/CFDataGetMutableBytePtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native BytePtr CFDataGetMutableBytePtr(CFMutableDataRef theData);

    /**
     * CFDataGetBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDataRef/index.html#//apple_ref/c/func/CFDataGetBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDataGetBytes(CFDataRef theData, @ByValue CFRange range, BytePtr buffer);

    /**
     * CFDataSetLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDataRef/index.html#//apple_ref/c/func/CFDataSetLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDataSetLength(CFMutableDataRef theData, @NInt long length);

    /**
     * CFDataIncreaseLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDataRef/index.html#//apple_ref/c/func/CFDataIncreaseLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDataIncreaseLength(CFMutableDataRef theData, @NInt long extraLength);

    /**
     * CFDataAppendBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDataRef/index.html#//apple_ref/c/func/CFDataAppendBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDataAppendBytes(CFMutableDataRef theData,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length);

    /**
     * CFDataReplaceBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDataRef/index.html#//apple_ref/c/func/CFDataReplaceBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDataReplaceBytes(CFMutableDataRef theData, @ByValue CFRange range,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String newBytes,
            @NInt long newLength);

    /**
     * CFDataDeleteBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableDataRef/index.html#//apple_ref/c/func/CFDataDeleteBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDataDeleteBytes(CFMutableDataRef theData, @ByValue CFRange range);

    /**
     * CFDataFind</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDataRef/index.html#//apple_ref/c/func/CFDataFind">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFDataFind(CFDataRef theData, CFDataRef dataToFind, @ByValue CFRange searchRange,
            @NUInt long compareOptions);

    /**
     * CFArrayGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFArrayGetTypeID();

    /**
     * CFArrayCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFArrayCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values,
            @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFArrayCallBacks callBacks);

    /**
     * CFArrayCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFArrayCreateCopy(CFAllocatorRef allocator, CFArrayRef theArray);

    /**
     * CFArrayCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableArrayRef CFArrayCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFArrayCallBacks callBacks);

    /**
     * CFArrayCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableArrayRef CFArrayCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFArrayRef theArray);

    /**
     * CFArrayGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetCount(CFArrayRef theArray);

    /**
     * CFArrayGetCountOfValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayGetCountOfValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetCountOfValue(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value);

    /**
     * CFArrayContainsValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayContainsValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFArrayContainsValue(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value);

    /**
     * CFArrayGetValueAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayGetValueAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFArrayGetValueAtIndex(CFArrayRef theArray, @NInt long idx);

    /**
     * CFArrayGetValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayGetValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayGetValues(CFArrayRef theArray, @ByValue CFRange range, Ptr<ConstVoidPtr> values);

    /**
     * CFArrayApplyFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayApplyFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayApplyFunction(CFArrayRef theArray, @ByValue CFRange range,
            @FunctionPtr(name = "call_CFArrayApplyFunction") Function_CFArrayApplyFunction applier, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArrayApplyFunction {
        @Generated
        void call_CFArrayApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFArrayGetFirstIndexOfValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayGetFirstIndexOfValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetFirstIndexOfValue(CFArrayRef theArray, @ByValue CFRange range,
            ConstVoidPtr value);

    /**
     * CFArrayGetLastIndexOfValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayGetLastIndexOfValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetLastIndexOfValue(CFArrayRef theArray, @ByValue CFRange range,
            ConstVoidPtr value);

    /**
     * CFArrayBSearchValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFArrayRef/index.html#//apple_ref/c/func/CFArrayBSearchValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFArrayBSearchValues(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value,
            @FunctionPtr(name = "call_CFArrayBSearchValues") Function_CFArrayBSearchValues comparator, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArrayBSearchValues {
        @Generated
        @NInt
        long call_CFArrayBSearchValues(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    /**
     * CFArrayAppendValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayAppendValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayAppendValue(CFMutableArrayRef theArray, ConstVoidPtr value);

    /**
     * CFArrayInsertValueAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayInsertValueAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayInsertValueAtIndex(CFMutableArrayRef theArray, @NInt long idx, ConstVoidPtr value);

    /**
     * CFArraySetValueAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArraySetValueAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArraySetValueAtIndex(CFMutableArrayRef theArray, @NInt long idx, ConstVoidPtr value);

    /**
     * CFArrayRemoveValueAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayRemoveValueAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayRemoveValueAtIndex(CFMutableArrayRef theArray, @NInt long idx);

    /**
     * CFArrayRemoveAllValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayRemoveAllValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayRemoveAllValues(CFMutableArrayRef theArray);

    /**
     * CFArrayReplaceValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayReplaceValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayReplaceValues(CFMutableArrayRef theArray, @ByValue CFRange range,
            Ptr<ConstVoidPtr> newValues, @NInt long newCount);

    /**
     * CFArrayExchangeValuesAtIndices</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayExchangeValuesAtIndices">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayExchangeValuesAtIndices(CFMutableArrayRef theArray, @NInt long idx1,
            @NInt long idx2);

    /**
     * CFArraySortValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArraySortValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArraySortValues(CFMutableArrayRef theArray, @ByValue CFRange range,
            @FunctionPtr(name = "call_CFArraySortValues") Function_CFArraySortValues comparator, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArraySortValues {
        @Generated
        @NInt
        long call_CFArraySortValues(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    /**
     * CFArrayAppendArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableArrayRef/index.html#//apple_ref/c/func/CFArrayAppendArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFArrayAppendArray(CFMutableArrayRef theArray, CFArrayRef otherArray,
            @ByValue CFRange otherRange);

    /**
     * CFCharacterSetGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFCharacterSetGetTypeID();

    /**
     * CFCharacterSetGetPredefined</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetGetPredefined">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetGetPredefined(@NInt long theSetIdentifier);

    /**
     * CFCharacterSetCreateWithCharactersInRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetCreateWithCharactersInRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithCharactersInRange(CFAllocatorRef alloc,
            @ByValue CFRange theRange);

    /**
     * CFCharacterSetCreateWithCharactersInString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetCreateWithCharactersInString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithCharactersInString(CFAllocatorRef alloc,
            CFStringRef theString);

    /**
     * CFCharacterSetCreateWithBitmapRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetCreateWithBitmapRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithBitmapRepresentation(CFAllocatorRef alloc,
            CFDataRef theData);

    /**
     * CFCharacterSetCreateInvertedSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetCreateInvertedSet">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateInvertedSet(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    /**
     * CFCharacterSetIsSupersetOfSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetIsSupersetOfSet">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFCharacterSetIsSupersetOfSet(CFCharacterSetRef theSet, CFCharacterSetRef theOtherset);

    /**
     * CFCharacterSetHasMemberInPlane</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetHasMemberInPlane">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFCharacterSetHasMemberInPlane(CFCharacterSetRef theSet, @NInt long thePlane);

    /**
     * CFCharacterSetCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableCharacterSetRef CFCharacterSetCreateMutable(CFAllocatorRef alloc);

    /**
     * CFCharacterSetCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateCopy(CFAllocatorRef alloc, CFCharacterSetRef theSet);

    /**
     * CFCharacterSetCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableCharacterSetRef CFCharacterSetCreateMutableCopy(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    /**
     * CFCharacterSetIsCharacterMember</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetIsCharacterMember">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFCharacterSetIsCharacterMember(CFCharacterSetRef theSet, char theChar);

    /**
     * CFCharacterSetIsLongCharacterMember</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetIsLongCharacterMember">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFCharacterSetIsLongCharacterMember(CFCharacterSetRef theSet, int theChar);

    /**
     * CFCharacterSetCreateBitmapRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetCreateBitmapRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFCharacterSetCreateBitmapRepresentation(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    /**
     * CFCharacterSetAddCharactersInRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetAddCharactersInRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetAddCharactersInRange(CFMutableCharacterSetRef theSet,
            @ByValue CFRange theRange);

    /**
     * CFCharacterSetRemoveCharactersInRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetRemoveCharactersInRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetRemoveCharactersInRange(CFMutableCharacterSetRef theSet,
            @ByValue CFRange theRange);

    /**
     * CFCharacterSetAddCharactersInString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetAddCharactersInString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetAddCharactersInString(CFMutableCharacterSetRef theSet,
            CFStringRef theString);

    /**
     * CFCharacterSetRemoveCharactersInString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetRemoveCharactersInString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetRemoveCharactersInString(CFMutableCharacterSetRef theSet,
            CFStringRef theString);

    /**
     * CFCharacterSetUnion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetUnion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetUnion(CFMutableCharacterSetRef theSet, CFCharacterSetRef theOtherSet);

    /**
     * CFCharacterSetIntersect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetIntersect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetIntersect(CFMutableCharacterSetRef theSet, CFCharacterSetRef theOtherSet);

    /**
     * CFCharacterSetInvert</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableCharacterSetRef/index.html#//apple_ref/c/func/CFCharacterSetInvert">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCharacterSetInvert(CFMutableCharacterSetRef theSet);

    /**
     * CFLocaleGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFLocaleGetTypeID();

    /**
     * CFLocaleGetSystem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleGetSystem">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleGetSystem();

    /**
     * CFLocaleCopyCurrent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCopyCurrent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCopyCurrent();

    /**
     * CFLocaleCopyAvailableLocaleIdentifiers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCopyAvailableLocaleIdentifiers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyAvailableLocaleIdentifiers();

    /**
     * CFLocaleCopyISOLanguageCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCopyISOLanguageCodes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOLanguageCodes();

    /**
     * CFLocaleCopyISOCountryCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCopyISOCountryCodes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOCountryCodes();

    /**
     * CFLocaleCopyISOCurrencyCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCopyISOCurrencyCodes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOCurrencyCodes();

    /**
     * CFLocaleCopyCommonISOCurrencyCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCopyCommonISOCurrencyCodes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyCommonISOCurrencyCodes();

    /**
     * CFLocaleCopyPreferredLanguages</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCopyPreferredLanguages">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyPreferredLanguages();

    /**
     * CFLocaleCreateCanonicalLanguageIdentifierFromString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCreateCanonicalLanguageIdentifierFromString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLanguageIdentifierFromString(CFAllocatorRef allocator,
            CFStringRef localeIdentifier);

    /**
     * CFLocaleCreateCanonicalLocaleIdentifierFromString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCreateCanonicalLocaleIdentifierFromString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLocaleIdentifierFromString(CFAllocatorRef allocator,
            CFStringRef localeIdentifier);

    /**
     * CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes(
            CFAllocatorRef allocator, short lcode, short rcode);

    /**
     * CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode(CFAllocatorRef allocator,
            int lcid);

    /**
     * CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier(CFStringRef localeIdentifier);

    /**
     * CFLocaleGetLanguageCharacterDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleGetLanguageCharacterDirection">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFLocaleGetLanguageCharacterDirection(CFStringRef isoLangCode);

    /**
     * CFLocaleGetLanguageLineDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleGetLanguageLineDirection">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFLocaleGetLanguageLineDirection(CFStringRef isoLangCode);

    /**
     * CFLocaleCreateComponentsFromLocaleIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCreateComponentsFromLocaleIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFLocaleCreateComponentsFromLocaleIdentifier(CFAllocatorRef allocator,
            CFStringRef localeID);

    /**
     * CFLocaleCreateLocaleIdentifierFromComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCreateLocaleIdentifierFromComponents">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateLocaleIdentifierFromComponents(CFAllocatorRef allocator,
            CFDictionaryRef dictionary);

    /**
     * CFLocaleCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCreate(CFAllocatorRef allocator, CFStringRef localeIdentifier);

    /**
     * CFLocaleCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCreateCopy(CFAllocatorRef allocator, CFLocaleRef locale);

    /**
     * CFLocaleGetIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleGetIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleGetIdentifier(CFLocaleRef locale);

    /**
     * CFLocaleGetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleGetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFLocaleGetValue(CFLocaleRef locale, CFStringRef key);

    /**
     * CFLocaleCopyDisplayNameForPropertyValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFLocaleRef/index.html#//apple_ref/c/func/CFLocaleCopyDisplayNameForPropertyValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCopyDisplayNameForPropertyValue(CFLocaleRef displayLocale, CFStringRef key,
            CFStringRef value);

    /**
     * CFStringGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringGetTypeID();

    /**
     * CFStringCreateWithPascalString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithPascalString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithPascalString(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding);

    /**
     * CFStringCreateWithCString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithCString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCString(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding);

    /**
     * CFStringCreateWithBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithBytes(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBytes, int encoding, byte isExternalRepresentation);

    /**
     * CFStringCreateWithCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithCharacters">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCharacters(CFAllocatorRef alloc, ConstCharPtr chars,
            @NInt long numChars);

    /**
     * CFStringCreateWithPascalStringNoCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithPascalStringNoCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithPascalStringNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding, CFAllocatorRef contentsDeallocator);

    /**
     * CFStringCreateWithCStringNoCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithCStringNoCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCStringNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding, CFAllocatorRef contentsDeallocator);

    /**
     * CFStringCreateWithBytesNoCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithBytesNoCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithBytesNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBytes, int encoding, byte isExternalRepresentation, CFAllocatorRef contentsDeallocator);

    /**
     * CFStringCreateWithCharactersNoCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithCharactersNoCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCharactersNoCopy(CFAllocatorRef alloc, ConstCharPtr chars,
            @NInt long numChars, CFAllocatorRef contentsDeallocator);

    /**
     * CFStringCreateWithSubstring</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithSubstring">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithSubstring(CFAllocatorRef alloc, CFStringRef str,
            @ByValue CFRange range);

    /**
     * CFStringCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateCopy(CFAllocatorRef alloc, CFStringRef theString);

    /**
     * CFStringCreateWithFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithFormat">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @CFunction
    public static native CFStringRef CFStringCreateWithFormat(CFAllocatorRef alloc, CFDictionaryRef formatOptions,
            CFStringRef format, Object... varargs);

    /**
     * CFStringCreateWithFormatAndArguments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithFormatAndArguments">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithFormatAndArguments(CFAllocatorRef alloc,
            CFDictionaryRef formatOptions, CFStringRef format, BytePtr arguments);

    /**
     * CFStringCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutable(CFAllocatorRef alloc, @NInt long maxLength);

    /**
     * CFStringCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutableCopy(CFAllocatorRef alloc, @NInt long maxLength,
            CFStringRef theString);

    /**
     * CFStringCreateMutableWithExternalCharactersNoCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringCreateMutableWithExternalCharactersNoCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutableWithExternalCharactersNoCopy(CFAllocatorRef alloc,
            CharPtr chars, @NInt long numChars, @NInt long capacity, CFAllocatorRef externalCharactersAllocator);

    /**
     * CFStringGetLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetLength(CFStringRef theString);

    /**
     * CFStringGetCharacterAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetCharacterAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native char CFStringGetCharacterAtIndex(CFStringRef theString, @NInt long idx);

    /**
     * CFStringGetCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetCharacters">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringGetCharacters(CFStringRef theString, @ByValue CFRange range, CharPtr buffer);

    /**
     * CFStringGetPascalString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetPascalString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringGetPascalString(CFStringRef theString, BytePtr buffer, @NInt long bufferSize,
            int encoding);

    /**
     * CFStringGetCString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetCString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringGetCString(CFStringRef theString, BytePtr buffer, @NInt long bufferSize,
            int encoding);

    /**
     * CFStringGetPascalStringPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetPascalStringPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFStringGetPascalStringPtr(CFStringRef theString, int encoding);

    /**
     * CFStringGetCStringPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetCStringPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFStringGetCStringPtr(CFStringRef theString, int encoding);

    /**
     * CFStringGetCharactersPtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetCharactersPtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstCharPtr CFStringGetCharactersPtr(CFStringRef theString);

    /**
     * CFStringGetBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetBytes(CFStringRef theString, @ByValue CFRange range, int encoding,
            byte lossByte, byte isExternalRepresentation, BytePtr buffer, @NInt long maxBufLen, NIntPtr usedBufLen);

    /**
     * CFStringCreateFromExternalRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateFromExternalRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateFromExternalRepresentation(CFAllocatorRef alloc, CFDataRef data,
            int encoding);

    /**
     * CFStringCreateExternalRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateExternalRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFStringCreateExternalRepresentation(CFAllocatorRef alloc, CFStringRef theString,
            int encoding, byte lossByte);

    /**
     * CFStringGetSmallestEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetSmallestEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringGetSmallestEncoding(CFStringRef theString);

    /**
     * CFStringGetFastestEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetFastestEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringGetFastestEncoding(CFStringRef theString);

    /**
     * CFStringGetSystemEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetSystemEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringGetSystemEncoding();

    /**
     * CFStringGetMaximumSizeForEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetMaximumSizeForEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetMaximumSizeForEncoding(@NInt long length, int encoding);

    /**
     * CFStringGetFileSystemRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetFileSystemRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringGetFileSystemRepresentation(CFStringRef string, BytePtr buffer,
            @NInt long maxBufLen);

    /**
     * CFStringGetMaximumSizeOfFileSystemRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetMaximumSizeOfFileSystemRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetMaximumSizeOfFileSystemRepresentation(CFStringRef string);

    /**
     * CFStringCreateWithFileSystemRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateWithFileSystemRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithFileSystemRepresentation(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer);

    /**
     * CFStringCompareWithOptionsAndLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCompareWithOptionsAndLocale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompareWithOptionsAndLocale(CFStringRef theString1, CFStringRef theString2,
            @ByValue CFRange rangeToCompare, @NUInt long compareOptions, CFLocaleRef locale);

    /**
     * CFStringCompareWithOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCompareWithOptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompareWithOptions(CFStringRef theString1, CFStringRef theString2,
            @ByValue CFRange rangeToCompare, @NUInt long compareOptions);

    /**
     * CFStringCompare</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCompare">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompare(CFStringRef theString1, CFStringRef theString2,
            @NUInt long compareOptions);

    /**
     * CFStringFindWithOptionsAndLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringFindWithOptionsAndLocale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringFindWithOptionsAndLocale(CFStringRef theString, CFStringRef stringToFind,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions, CFLocaleRef locale,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    /**
     * CFStringFindWithOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringFindWithOptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringFindWithOptions(CFStringRef theString, CFStringRef stringToFind,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    /**
     * CFStringCreateArrayWithFindResults</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateArrayWithFindResults">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFStringCreateArrayWithFindResults(CFAllocatorRef alloc, CFStringRef theString,
            CFStringRef stringToFind, @ByValue CFRange rangeToSearch, @NUInt long compareOptions);

    /**
     * CFStringFind</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringFind">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringFind(CFStringRef theString, CFStringRef stringToFind,
            @NUInt long compareOptions);

    /**
     * CFStringHasPrefix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringHasPrefix">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringHasPrefix(CFStringRef theString, CFStringRef prefix);

    /**
     * CFStringHasSuffix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringHasSuffix">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringHasSuffix(CFStringRef theString, CFStringRef suffix);

    /**
     * CFStringGetRangeOfComposedCharactersAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetRangeOfComposedCharactersAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringGetRangeOfComposedCharactersAtIndex(CFStringRef theString,
            @NInt long theIndex);

    /**
     * CFStringFindCharacterFromSet</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringFindCharacterFromSet">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringFindCharacterFromSet(CFStringRef theString, CFCharacterSetRef theSet,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    /**
     * CFStringGetLineBounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetLineBounds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringGetLineBounds(CFStringRef theString, @ByValue CFRange range,
            NIntPtr lineBeginIndex, NIntPtr lineEndIndex, NIntPtr contentsEndIndex);

    /**
     * CFStringGetParagraphBounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetParagraphBounds">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringGetParagraphBounds(CFStringRef string, @ByValue CFRange range,
            NIntPtr parBeginIndex, NIntPtr parEndIndex, NIntPtr contentsEndIndex);

    /**
     * CFStringGetHyphenationLocationBeforeIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetHyphenationLocationBeforeIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetHyphenationLocationBeforeIndex(CFStringRef string, @NInt long location,
            @ByValue CFRange limitRange, @NUInt long options, CFLocaleRef locale, IntPtr character);

    /**
     * CFStringIsHyphenationAvailableForLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringIsHyphenationAvailableForLocale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringIsHyphenationAvailableForLocale(CFLocaleRef locale);

    /**
     * CFStringCreateByCombiningStrings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateByCombiningStrings">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateByCombiningStrings(CFAllocatorRef alloc, CFArrayRef theArray,
            CFStringRef separatorString);

    /**
     * CFStringCreateArrayBySeparatingStrings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringCreateArrayBySeparatingStrings">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFStringCreateArrayBySeparatingStrings(CFAllocatorRef alloc, CFStringRef theString,
            CFStringRef separatorString);

    /**
     * CFStringGetIntValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetIntValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringGetIntValue(CFStringRef str);

    /**
     * CFStringGetDoubleValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetDoubleValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFStringGetDoubleValue(CFStringRef str);

    /**
     * CFStringAppend</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringAppend">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringAppend(CFMutableStringRef theString, CFStringRef appendedString);

    /**
     * CFStringAppendCharacters</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringAppendCharacters">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringAppendCharacters(CFMutableStringRef theString, ConstCharPtr chars,
            @NInt long numChars);

    /**
     * CFStringAppendPascalString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringAppendPascalString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringAppendPascalString(CFMutableStringRef theString,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding);

    /**
     * CFStringAppendCString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringAppendCString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringAppendCString(CFMutableStringRef theString,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding);

    /**
     * CFStringAppendFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringAppendFormat">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @CFunction
    public static native void CFStringAppendFormat(CFMutableStringRef theString, CFDictionaryRef formatOptions,
            CFStringRef format, Object... varargs);

    /**
     * CFStringAppendFormatAndArguments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringAppendFormatAndArguments">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringAppendFormatAndArguments(CFMutableStringRef theString,
            CFDictionaryRef formatOptions, CFStringRef format, BytePtr arguments);

    /**
     * CFStringInsert</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringInsert">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringInsert(CFMutableStringRef str, @NInt long idx, CFStringRef insertedStr);

    /**
     * CFStringDelete</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringDelete">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringDelete(CFMutableStringRef theString, @ByValue CFRange range);

    /**
     * CFStringReplace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringReplace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringReplace(CFMutableStringRef theString, @ByValue CFRange range,
            CFStringRef replacement);

    /**
     * CFStringReplaceAll</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringReplaceAll">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringReplaceAll(CFMutableStringRef theString, CFStringRef replacement);

    /**
     * CFStringFindAndReplace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringFindAndReplace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringFindAndReplace(CFMutableStringRef theString, CFStringRef stringToFind,
            CFStringRef replacementString, @ByValue CFRange rangeToSearch, @NUInt long compareOptions);

    /**
     * CFStringSetExternalCharactersNoCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringSetExternalCharactersNoCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringSetExternalCharactersNoCopy(CFMutableStringRef theString, CharPtr chars,
            @NInt long length, @NInt long capacity);

    /**
     * CFStringPad</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringPad">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringPad(CFMutableStringRef theString, CFStringRef padString, @NInt long length,
            @NInt long indexIntoPad);

    /**
     * CFStringTrim</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringTrim">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringTrim(CFMutableStringRef theString, CFStringRef trimString);

    /**
     * CFStringTrimWhitespace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringTrimWhitespace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringTrimWhitespace(CFMutableStringRef theString);

    /**
     * CFStringLowercase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringLowercase">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringLowercase(CFMutableStringRef theString, CFLocaleRef locale);

    /**
     * CFStringUppercase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringUppercase">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringUppercase(CFMutableStringRef theString, CFLocaleRef locale);

    /**
     * CFStringCapitalize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringCapitalize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringCapitalize(CFMutableStringRef theString, CFLocaleRef locale);

    /**
     * CFStringNormalize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringNormalize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringNormalize(CFMutableStringRef theString, @NInt long theForm);

    /**
     * CFStringFold</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringFold">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringFold(CFMutableStringRef theString, @NUInt long theFlags, CFLocaleRef theLocale);

    /**
     * CFStringTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableStringRef/index.html#//apple_ref/c/func/CFStringTransform">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringTransform(CFMutableStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange range, CFStringRef transform,
            byte reverse);

    /**
     * CFStringIsEncodingAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringIsEncodingAvailable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFStringIsEncodingAvailable(int encoding);

    /**
     * CFStringGetListOfAvailableEncodings</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetListOfAvailableEncodings">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstIntPtr CFStringGetListOfAvailableEncodings();

    /**
     * CFStringGetNameOfEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetNameOfEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringGetNameOfEncoding(int encoding);

    /**
     * CFStringConvertEncodingToNSStringEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringConvertEncodingToNSStringEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringConvertEncodingToNSStringEncoding(int encoding);

    /**
     * CFStringConvertNSStringEncodingToEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringConvertNSStringEncodingToEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringConvertNSStringEncodingToEncoding(@NUInt long encoding);

    /**
     * CFStringConvertEncodingToWindowsCodepage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringConvertEncodingToWindowsCodepage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringConvertEncodingToWindowsCodepage(int encoding);

    /**
     * CFStringConvertWindowsCodepageToEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringConvertWindowsCodepageToEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringConvertWindowsCodepageToEncoding(int codepage);

    /**
     * CFStringConvertIANACharSetNameToEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringConvertIANACharSetNameToEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringConvertIANACharSetNameToEncoding(CFStringRef theString);

    /**
     * CFStringConvertEncodingToIANACharSetName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringConvertEncodingToIANACharSetName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringConvertEncodingToIANACharSetName(int encoding);

    /**
     * CFStringGetMostCompatibleMacStringEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetMostCompatibleMacStringEncoding">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFStringGetMostCompatibleMacStringEncoding(int encoding);

    /**
     * CFStringInitInlineBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringInitInlineBuffer">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native void CFStringInitInlineBuffer(CFStringRef str,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStringInlineBuffer buf,
            @ByValue CFRange range);

    /**
     * CFStringGetCharacterFromInlineBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetCharacterFromInlineBuffer">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native char CFStringGetCharacterFromInlineBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") CFStringInlineBuffer buf,
            @NInt long idx);

    /**
     * CFStringIsSurrogateHighCharacter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringIsSurrogateHighCharacter">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CFStringIsSurrogateHighCharacter(char character);

    /**
     * CFStringIsSurrogateLowCharacter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringIsSurrogateLowCharacter">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CFStringIsSurrogateLowCharacter(char character);

    /**
     * CFStringGetLongCharacterForSurrogatePair</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetLongCharacterForSurrogatePair">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native int CFStringGetLongCharacterForSurrogatePair(char surrogateHigh, char surrogateLow);

    /**
     * CFStringGetSurrogatePairForLongCharacter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFStringGetSurrogatePairForLongCharacter">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native byte CFStringGetSurrogatePairForLongCharacter(int character, CharPtr surrogates);

    /**
     * CFShow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTypeRef/index.html#//apple_ref/c/func/CFShow">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFShow(ConstVoidPtr obj);

    /**
     * CFShowStr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringRef/index.html#//apple_ref/c/func/CFShowStr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFShowStr(CFStringRef str);

    @Generated
    @CFunction
    public static native CFStringRef __CFStringMakeConstantString(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr);

    /**
     * CFErrorGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFErrorGetTypeID();

    /**
     * CFErrorCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFErrorRef CFErrorCreate(CFAllocatorRef allocator, CFStringRef domain, @NInt long code,
            CFDictionaryRef userInfo);

    /**
     * CFErrorCreateWithUserInfoKeysAndValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorCreateWithUserInfoKeysAndValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFErrorRef CFErrorCreateWithUserInfoKeysAndValues(CFAllocatorRef allocator, CFStringRef domain,
            @NInt long code, ConstPtr<ConstVoidPtr> userInfoKeys, ConstPtr<ConstVoidPtr> userInfoValues,
            @NInt long numUserInfoValues);

    /**
     * CFErrorGetDomain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorGetDomain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFErrorGetDomain(CFErrorRef err);

    /**
     * CFErrorGetCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorGetCode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFErrorGetCode(CFErrorRef err);

    /**
     * CFErrorCopyUserInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorCopyUserInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFErrorCopyUserInfo(CFErrorRef err);

    /**
     * CFErrorCopyDescription</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorCopyDescription">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyDescription(CFErrorRef err);

    /**
     * CFErrorCopyFailureReason</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorCopyFailureReason">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyFailureReason(CFErrorRef err);

    /**
     * CFErrorCopyRecoverySuggestion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFErrorRef/index.html#//apple_ref/c/func/CFErrorCopyRecoverySuggestion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyRecoverySuggestion(CFErrorRef err);

    /**
     * CFURLGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFURLGetTypeID();

    /**
     * CFURLCreateWithBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateWithBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithBytes(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String URLBytes,
            @NInt long length, int encoding, CFURLRef baseURL);

    /**
     * CFURLCreateData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateData(CFAllocatorRef allocator, CFURLRef url, int encoding,
            byte escapeWhitespace);

    /**
     * CFURLCreateWithString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateWithString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithString(CFAllocatorRef allocator, CFStringRef URLString,
            CFURLRef baseURL);

    /**
     * CFURLCreateAbsoluteURLWithBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateAbsoluteURLWithBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateAbsoluteURLWithBytes(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String relativeURLBytes,
            @NInt long length, int encoding, CFURLRef baseURL, byte useCompatibilityMode);

    /**
     * CFURLCreateWithFileSystemPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateWithFileSystemPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithFileSystemPath(CFAllocatorRef allocator, CFStringRef filePath,
            @NInt long pathStyle, byte isDirectory);

    /**
     * CFURLCreateFromFileSystemRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateFromFileSystemRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFromFileSystemRepresentation(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufLen, byte isDirectory);

    /**
     * CFURLCreateWithFileSystemPathRelativeToBase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateWithFileSystemPathRelativeToBase">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithFileSystemPathRelativeToBase(CFAllocatorRef allocator,
            CFStringRef filePath, @NInt long pathStyle, byte isDirectory, CFURLRef baseURL);

    /**
     * CFURLCreateFromFileSystemRepresentationRelativeToBase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateFromFileSystemRepresentationRelativeToBase">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFromFileSystemRepresentationRelativeToBase(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufLen, byte isDirectory, CFURLRef baseURL);

    /**
     * CFURLGetFileSystemRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLGetFileSystemRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLGetFileSystemRepresentation(CFURLRef url, byte resolveAgainstBase, BytePtr buffer,
            @NInt long maxBufLen);

    /**
     * CFURLCopyAbsoluteURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyAbsoluteURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCopyAbsoluteURL(CFURLRef relativeURL);

    /**
     * CFURLGetString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLGetString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLGetString(CFURLRef anURL);

    /**
     * CFURLGetBaseURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLGetBaseURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLGetBaseURL(CFURLRef anURL);

    /**
     * CFURLCanBeDecomposed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCanBeDecomposed">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLCanBeDecomposed(CFURLRef anURL);

    /**
     * CFURLCopyScheme</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyScheme">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyScheme(CFURLRef anURL);

    /**
     * CFURLCopyNetLocation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyNetLocation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyNetLocation(CFURLRef anURL);

    /**
     * CFURLCopyPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPath(CFURLRef anURL);

    /**
     * CFURLCopyStrictPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyStrictPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyStrictPath(CFURLRef anURL, BytePtr isAbsolute);

    /**
     * CFURLCopyFileSystemPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyFileSystemPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyFileSystemPath(CFURLRef anURL, @NInt long pathStyle);

    /**
     * CFURLHasDirectoryPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLHasDirectoryPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLHasDirectoryPath(CFURLRef anURL);

    /**
     * CFURLCopyResourceSpecifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyResourceSpecifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyResourceSpecifier(CFURLRef anURL);

    /**
     * CFURLCopyHostName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyHostName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyHostName(CFURLRef anURL);

    /**
     * CFURLGetPortNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLGetPortNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFURLGetPortNumber(CFURLRef anURL);

    /**
     * CFURLCopyUserName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyUserName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyUserName(CFURLRef anURL);

    /**
     * CFURLCopyPassword</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyPassword">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPassword(CFURLRef anURL);

    /**
     * CFURLCopyParameterString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyParameterString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyParameterString(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    /**
     * CFURLCopyQueryString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyQueryString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyQueryString(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    /**
     * CFURLCopyFragment</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyFragment">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyFragment(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    /**
     * CFURLCopyLastPathComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyLastPathComponent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyLastPathComponent(CFURLRef url);

    /**
     * CFURLCopyPathExtension</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyPathExtension">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPathExtension(CFURLRef url);

    /**
     * CFURLCreateCopyAppendingPathComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateCopyAppendingPathComponent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyAppendingPathComponent(CFAllocatorRef allocator, CFURLRef url,
            CFStringRef pathComponent, byte isDirectory);

    /**
     * CFURLCreateCopyDeletingLastPathComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateCopyDeletingLastPathComponent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyDeletingLastPathComponent(CFAllocatorRef allocator, CFURLRef url);

    /**
     * CFURLCreateCopyAppendingPathExtension</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateCopyAppendingPathExtension">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyAppendingPathExtension(CFAllocatorRef allocator, CFURLRef url,
            CFStringRef extension);

    /**
     * CFURLCreateCopyDeletingPathExtension</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateCopyDeletingPathExtension">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyDeletingPathExtension(CFAllocatorRef allocator, CFURLRef url);

    /**
     * CFURLGetBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLGetBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFURLGetBytes(CFURLRef url, BytePtr buffer, @NInt long bufferLength);

    /**
     * CFURLGetByteRangeForComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLGetByteRangeForComponent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFURLGetByteRangeForComponent(CFURLRef url, @NInt long component,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangeIncludingSeparators);

    /**
     * CFURLCreateStringByReplacingPercentEscapes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateStringByReplacingPercentEscapes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFURLCreateStringByReplacingPercentEscapes(CFAllocatorRef allocator,
            CFStringRef originalString, CFStringRef charactersToLeaveEscaped);

    /**
     * CFURLCreateStringByReplacingPercentEscapesUsingEncoding</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateStringByReplacingPercentEscapesUsingEncoding">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef CFURLCreateStringByReplacingPercentEscapesUsingEncoding(CFAllocatorRef allocator,
            CFStringRef origString, CFStringRef charsToLeaveEscaped, int encoding);

    /**
     * CFURLCreateStringByAddingPercentEscapes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateStringByAddingPercentEscapes">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef CFURLCreateStringByAddingPercentEscapes(CFAllocatorRef allocator,
            CFStringRef originalString, CFStringRef charactersToLeaveUnescaped,
            CFStringRef legalURLCharactersToBeEscaped, int encoding);

    @Generated
    @CFunction
    public static native byte CFURLIsFileReferenceURL(CFURLRef url);

    /**
     * CFURLCreateFileReferenceURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateFileReferenceURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFileReferenceURL(CFAllocatorRef allocator, CFURLRef url,
            Ptr<CFErrorRef> error);

    /**
     * CFURLCreateFilePathURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateFilePathURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFilePathURL(CFAllocatorRef allocator, CFURLRef url, Ptr<CFErrorRef> error);

    /**
     * CFURLCreateFromFSRef</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateFromFSRef">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFURLRef CFURLCreateFromFSRef(CFAllocatorRef allocator, VoidPtr fsRef);

    /**
     * CFURLGetFSRef</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLGetFSRef">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLGetFSRef(CFURLRef url, VoidPtr fsRef);

    /**
     * CFURLCopyResourcePropertyForKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyResourcePropertyForKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLCopyResourcePropertyForKey(CFURLRef url, CFStringRef key,
            VoidPtr propertyValueTypeRefPtr, Ptr<CFErrorRef> error);

    /**
     * CFURLCopyResourcePropertiesForKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCopyResourcePropertiesForKeys">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFURLCopyResourcePropertiesForKeys(CFURLRef url, CFArrayRef keys,
            Ptr<CFErrorRef> error);

    /**
     * CFURLSetResourcePropertyForKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLSetResourcePropertyForKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLSetResourcePropertyForKey(CFURLRef url, CFStringRef key, ConstVoidPtr propertyValue,
            Ptr<CFErrorRef> error);

    /**
     * CFURLSetResourcePropertiesForKeys</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLSetResourcePropertiesForKeys">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLSetResourcePropertiesForKeys(CFURLRef url, CFDictionaryRef keyedPropertyValues,
            Ptr<CFErrorRef> error);

    /**
     * CFURLClearResourcePropertyCacheForKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLClearResourcePropertyCacheForKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFURLClearResourcePropertyCacheForKey(CFURLRef url, CFStringRef key);

    /**
     * CFURLClearResourcePropertyCache</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLClearResourcePropertyCache">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFURLClearResourcePropertyCache(CFURLRef url);

    /**
     * CFURLSetTemporaryResourcePropertyForKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLSetTemporaryResourcePropertyForKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFURLSetTemporaryResourcePropertyForKey(CFURLRef url, CFStringRef key,
            ConstVoidPtr propertyValue);

    /**
     * CFURLResourceIsReachable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLResourceIsReachable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLResourceIsReachable(CFURLRef url, Ptr<CFErrorRef> error);

    /**
     * CFURLCreateBookmarkData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateBookmarkData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateBookmarkData(CFAllocatorRef allocator, CFURLRef url, @NUInt long options,
            CFArrayRef resourcePropertiesToInclude, CFURLRef relativeToURL, Ptr<CFErrorRef> error);

    /**
     * CFURLCreateByResolvingBookmarkData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateByResolvingBookmarkData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateByResolvingBookmarkData(CFAllocatorRef allocator, CFDataRef bookmark,
            @NUInt long options, CFURLRef relativeToURL, CFArrayRef resourcePropertiesToInclude, BytePtr isStale,
            Ptr<CFErrorRef> error);

    /**
     * CFURLCreateResourcePropertiesForKeysFromBookmarkData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateResourcePropertiesForKeysFromBookmarkData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFURLCreateResourcePropertiesForKeysFromBookmarkData(CFAllocatorRef allocator,
            CFArrayRef resourcePropertiesToReturn, CFDataRef bookmark);

    /**
     * CFURLCreateResourcePropertyForKeyFromBookmarkData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateResourcePropertyForKeyFromBookmarkData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFURLCreateResourcePropertyForKeyFromBookmarkData(CFAllocatorRef allocator,
            CFStringRef resourcePropertyKey, CFDataRef bookmark);

    /**
     * CFURLCreateBookmarkDataFromFile</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLCreateBookmarkDataFromFile">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateBookmarkDataFromFile(CFAllocatorRef allocator, CFURLRef fileURL,
            Ptr<CFErrorRef> errorRef);

    /**
     * CFURLWriteBookmarkDataToFile</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLWriteBookmarkDataToFile">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLWriteBookmarkDataToFile(CFDataRef bookmarkRef, CFURLRef fileURL, @NUInt long options,
            Ptr<CFErrorRef> errorRef);

    /**
     * CFURLStartAccessingSecurityScopedResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLStartAccessingSecurityScopedResource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFURLStartAccessingSecurityScopedResource(CFURLRef url);

    /**
     * CFURLStopAccessingSecurityScopedResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLRef/index.html#//apple_ref/c/func/CFURLStopAccessingSecurityScopedResource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFURLStopAccessingSecurityScopedResource(CFURLRef url);

    /**
     * CFAbsoluteTimeGetCurrent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFAbsoluteTimeGetCurrent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFAbsoluteTimeGetCurrent();

    /**
     * CFDateGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateRef/index.html#//apple_ref/c/func/CFDateGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFDateGetTypeID();

    /**
     * CFDateCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateRef/index.html#//apple_ref/c/func/CFDateCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDateRef CFDateCreate(CFAllocatorRef allocator, double at);

    /**
     * CFDateGetAbsoluteTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateRef/index.html#//apple_ref/c/func/CFDateGetAbsoluteTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFDateGetAbsoluteTime(CFDateRef theDate);

    /**
     * CFDateGetTimeIntervalSinceDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateRef/index.html#//apple_ref/c/func/CFDateGetTimeIntervalSinceDate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFDateGetTimeIntervalSinceDate(CFDateRef theDate, CFDateRef otherDate);

    /**
     * CFDateCompare</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateRef/index.html#//apple_ref/c/func/CFDateCompare">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDateCompare(CFDateRef theDate, CFDateRef otherDate, VoidPtr context);

    /**
     * CFGregorianDateIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFGregorianDateIsValid">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFGregorianDateIsValid(@ByValue CFGregorianDate gdate, @NUInt long unitFlags);

    /**
     * CFGregorianDateGetAbsoluteTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFGregorianDateGetAbsoluteTime">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native double CFGregorianDateGetAbsoluteTime(@ByValue CFGregorianDate gdate, CFTimeZoneRef tz);

    /**
     * CFAbsoluteTimeGetGregorianDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFAbsoluteTimeGetGregorianDate">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    @ByValue
    public static native CFGregorianDate CFAbsoluteTimeGetGregorianDate(double at, CFTimeZoneRef tz);

    /**
     * CFAbsoluteTimeAddGregorianUnits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFAbsoluteTimeAddGregorianUnits">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native double CFAbsoluteTimeAddGregorianUnits(double at, CFTimeZoneRef tz,
            @ByValue CFGregorianUnits units);

    /**
     * CFAbsoluteTimeGetDifferenceAsGregorianUnits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFAbsoluteTimeGetDifferenceAsGregorianUnits">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    @ByValue
    public static native CFGregorianUnits CFAbsoluteTimeGetDifferenceAsGregorianUnits(double at1, double at2,
            CFTimeZoneRef tz, @NUInt long unitFlags);

    /**
     * CFAbsoluteTimeGetDayOfWeek</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFAbsoluteTimeGetDayOfWeek">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetDayOfWeek(double at, CFTimeZoneRef tz);

    /**
     * CFAbsoluteTimeGetDayOfYear</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFAbsoluteTimeGetDayOfYear">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetDayOfYear(double at, CFTimeZoneRef tz);

    /**
     * CFAbsoluteTimeGetWeekOfYear</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeUtils/index.html#//apple_ref/c/func/CFAbsoluteTimeGetWeekOfYear">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetWeekOfYear(double at, CFTimeZoneRef tz);

    /**
     * CFBagGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFBagGetTypeID();

    /**
     * CFBagCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBagRef CFBagCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBagCallBacks callBacks);

    /**
     * CFBagCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBagRef CFBagCreateCopy(CFAllocatorRef allocator, CFBagRef theBag);

    /**
     * CFBagCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBagRef/index.html#//apple_ref/c/func/CFBagCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableBagRef CFBagCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBagCallBacks callBacks);

    /**
     * CFBagCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBagRef/index.html#//apple_ref/c/func/CFBagCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableBagRef CFBagCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFBagRef theBag);

    /**
     * CFBagGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBagGetCount(CFBagRef theBag);

    /**
     * CFBagGetCountOfValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagGetCountOfValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBagGetCountOfValue(CFBagRef theBag, ConstVoidPtr value);

    /**
     * CFBagContainsValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagContainsValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBagContainsValue(CFBagRef theBag, ConstVoidPtr value);

    /**
     * CFBagGetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagGetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFBagGetValue(CFBagRef theBag, ConstVoidPtr value);

    /**
     * CFBagGetValueIfPresent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagGetValueIfPresent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBagGetValueIfPresent(CFBagRef theBag, ConstVoidPtr candidate, Ptr<ConstVoidPtr> value);

    /**
     * CFBagGetValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagGetValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBagGetValues(CFBagRef theBag, Ptr<ConstVoidPtr> values);

    /**
     * CFBagApplyFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBagRef/index.html#//apple_ref/c/func/CFBagApplyFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBagApplyFunction(CFBagRef theBag,
            @FunctionPtr(name = "call_CFBagApplyFunction") Function_CFBagApplyFunction applier, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFBagApplyFunction {
        @Generated
        void call_CFBagApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFBagAddValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBagRef/index.html#//apple_ref/c/func/CFBagAddValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBagAddValue(CFMutableBagRef theBag, ConstVoidPtr value);

    /**
     * CFBagReplaceValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBagRef/index.html#//apple_ref/c/func/CFBagReplaceValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBagReplaceValue(CFMutableBagRef theBag, ConstVoidPtr value);

    /**
     * CFBagSetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBagRef/index.html#//apple_ref/c/func/CFBagSetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBagSetValue(CFMutableBagRef theBag, ConstVoidPtr value);

    /**
     * CFBagRemoveValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBagRef/index.html#//apple_ref/c/func/CFBagRemoveValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBagRemoveValue(CFMutableBagRef theBag, ConstVoidPtr value);

    /**
     * CFBagRemoveAllValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBagRef/index.html#//apple_ref/c/func/CFBagRemoveAllValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBagRemoveAllValues(CFMutableBagRef theBag);

    /**
     * CFBinaryHeapGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFBinaryHeapGetTypeID();

    /**
     * CFBinaryHeapCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBinaryHeapRef CFBinaryHeapCreate(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBinaryHeapCallBacks callBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBinaryHeapCompareContext compareContext);

    /**
     * CFBinaryHeapCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBinaryHeapRef CFBinaryHeapCreateCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFBinaryHeapRef heap);

    /**
     * CFBinaryHeapGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBinaryHeapGetCount(CFBinaryHeapRef heap);

    /**
     * CFBinaryHeapGetCountOfValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapGetCountOfValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBinaryHeapGetCountOfValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    /**
     * CFBinaryHeapContainsValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapContainsValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBinaryHeapContainsValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    /**
     * CFBinaryHeapGetMinimum</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapGetMinimum">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFBinaryHeapGetMinimum(CFBinaryHeapRef heap);

    /**
     * CFBinaryHeapGetMinimumIfPresent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapGetMinimumIfPresent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBinaryHeapGetMinimumIfPresent(CFBinaryHeapRef heap, Ptr<ConstVoidPtr> value);

    /**
     * CFBinaryHeapGetValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapGetValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapGetValues(CFBinaryHeapRef heap, Ptr<ConstVoidPtr> values);

    /**
     * CFBinaryHeapApplyFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapApplyFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapApplyFunction(CFBinaryHeapRef heap,
            @FunctionPtr(name = "call_CFBinaryHeapApplyFunction") Function_CFBinaryHeapApplyFunction applier,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFBinaryHeapApplyFunction {
        @Generated
        void call_CFBinaryHeapApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFBinaryHeapAddValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapAddValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapAddValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    /**
     * CFBinaryHeapRemoveMinimumValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapRemoveMinimumValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapRemoveMinimumValue(CFBinaryHeapRef heap);

    /**
     * CFBinaryHeapRemoveAllValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBinaryHeapRef/index.html#//apple_ref/c/func/CFBinaryHeapRemoveAllValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBinaryHeapRemoveAllValues(CFBinaryHeapRef heap);

    /**
     * CFBitVectorGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFBitVectorGetTypeID();

    /**
     * CFBitVectorCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBitVectorRef CFBitVectorCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBits);

    /**
     * CFBitVectorCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBitVectorRef CFBitVectorCreateCopy(CFAllocatorRef allocator, CFBitVectorRef bv);

    /**
     * CFBitVectorCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableBitVectorRef CFBitVectorCreateMutable(CFAllocatorRef allocator, @NInt long capacity);

    /**
     * CFBitVectorCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableBitVectorRef CFBitVectorCreateMutableCopy(CFAllocatorRef allocator,
            @NInt long capacity, CFBitVectorRef bv);

    /**
     * CFBitVectorGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetCount(CFBitVectorRef bv);

    /**
     * CFBitVectorGetCountOfBit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorGetCountOfBit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetCountOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    /**
     * CFBitVectorContainsBit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorContainsBit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBitVectorContainsBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    /**
     * CFBitVectorGetBitAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorGetBitAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFBitVectorGetBitAtIndex(CFBitVectorRef bv, @NInt long idx);

    /**
     * CFBitVectorGetBits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorGetBits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBitVectorGetBits(CFBitVectorRef bv, @ByValue CFRange range, BytePtr bytes);

    /**
     * CFBitVectorGetFirstIndexOfBit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorGetFirstIndexOfBit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetFirstIndexOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    /**
     * CFBitVectorGetLastIndexOfBit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorGetLastIndexOfBit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetLastIndexOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    /**
     * CFBitVectorSetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorSetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBitVectorSetCount(CFMutableBitVectorRef bv, @NInt long count);

    /**
     * CFBitVectorFlipBitAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorFlipBitAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBitVectorFlipBitAtIndex(CFMutableBitVectorRef bv, @NInt long idx);

    /**
     * CFBitVectorFlipBits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorFlipBits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBitVectorFlipBits(CFMutableBitVectorRef bv, @ByValue CFRange range);

    /**
     * CFBitVectorSetBitAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorSetBitAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBitVectorSetBitAtIndex(CFMutableBitVectorRef bv, @NInt long idx, int value);

    /**
     * CFBitVectorSetBits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorSetBits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBitVectorSetBits(CFMutableBitVectorRef bv, @ByValue CFRange range, int value);

    /**
     * CFBitVectorSetAllBits</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableBitVectorRef/index.html#//apple_ref/c/func/CFBitVectorSetAllBits">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBitVectorSetAllBits(CFMutableBitVectorRef bv, int value);

    /**
     * CFByteOrderGetCurrent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFByteOrderGetCurrent">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @NInt
    public static native long CFByteOrderGetCurrent();

    /**
     * CFSwapInt16</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt16">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16(char arg);

    /**
     * CFSwapInt32</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt32">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32(int arg);

    /**
     * CFSwapInt64</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt64">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64(long arg);

    /**
     * CFSwapInt16BigToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt16BigToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16BigToHost(char arg);

    /**
     * CFSwapInt32BigToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt32BigToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32BigToHost(int arg);

    /**
     * CFSwapInt64BigToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt64BigToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64BigToHost(long arg);

    /**
     * CFSwapInt16HostToBig</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt16HostToBig">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16HostToBig(char arg);

    /**
     * CFSwapInt32HostToBig</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt32HostToBig">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32HostToBig(int arg);

    /**
     * CFSwapInt64HostToBig</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt64HostToBig">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64HostToBig(long arg);

    /**
     * CFSwapInt16LittleToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt16LittleToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16LittleToHost(char arg);

    /**
     * CFSwapInt32LittleToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt32LittleToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32LittleToHost(int arg);

    /**
     * CFSwapInt64LittleToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt64LittleToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64LittleToHost(long arg);

    /**
     * CFSwapInt16HostToLittle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt16HostToLittle">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16HostToLittle(char arg);

    /**
     * CFSwapInt32HostToLittle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt32HostToLittle">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32HostToLittle(int arg);

    /**
     * CFSwapInt64HostToLittle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFSwapInt64HostToLittle">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64HostToLittle(long arg);

    /**
     * CFConvertFloat32HostToSwapped</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFConvertFloat32HostToSwapped">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat32 CFConvertFloat32HostToSwapped(float arg);

    /**
     * CFConvertFloat32SwappedToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFConvertFloat32SwappedToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native float CFConvertFloat32SwappedToHost(@ByValue CFSwappedFloat32 arg);

    /**
     * CFConvertFloat64HostToSwapped</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFConvertFloat64HostToSwapped">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat64 CFConvertFloat64HostToSwapped(double arg);

    /**
     * CFConvertFloat64SwappedToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFConvertFloat64SwappedToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double CFConvertFloat64SwappedToHost(@ByValue CFSwappedFloat64 arg);

    /**
     * CFConvertFloatHostToSwapped</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFConvertFloatHostToSwapped">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat32 CFConvertFloatHostToSwapped(float arg);

    /**
     * CFConvertFloatSwappedToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFConvertFloatSwappedToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native float CFConvertFloatSwappedToHost(@ByValue CFSwappedFloat32 arg);

    /**
     * CFConvertDoubleHostToSwapped</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFConvertDoubleHostToSwapped">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat64 CFConvertDoubleHostToSwapped(double arg);

    /**
     * CFConvertDoubleSwappedToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFByteOrderUtils/index.html#//apple_ref/c/func/CFConvertDoubleSwappedToHost">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    public static native double CFConvertDoubleSwappedToHost(@ByValue CFSwappedFloat64 arg);

    /**
     * CFTimeZoneGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFTimeZoneGetTypeID();

    /**
     * CFTimeZoneCopySystem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCopySystem">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCopySystem();

    /**
     * CFTimeZoneResetSystem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneResetSystem">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTimeZoneResetSystem();

    /**
     * CFTimeZoneCopyDefault</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCopyDefault">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCopyDefault();

    /**
     * CFTimeZoneSetDefault</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneSetDefault">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTimeZoneSetDefault(CFTimeZoneRef tz);

    /**
     * CFTimeZoneCopyKnownNames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCopyKnownNames">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFTimeZoneCopyKnownNames();

    /**
     * CFTimeZoneCopyAbbreviationDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCopyAbbreviationDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFTimeZoneCopyAbbreviationDictionary();

    /**
     * CFTimeZoneSetAbbreviationDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneSetAbbreviationDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTimeZoneSetAbbreviationDictionary(CFDictionaryRef dict);

    /**
     * CFTimeZoneCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreate(CFAllocatorRef allocator, CFStringRef name, CFDataRef data);

    /**
     * CFTimeZoneCreateWithTimeIntervalFromGMT</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCreateWithTimeIntervalFromGMT">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreateWithTimeIntervalFromGMT(CFAllocatorRef allocator, double ti);

    /**
     * CFTimeZoneCreateWithName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCreateWithName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreateWithName(CFAllocatorRef allocator, CFStringRef name,
            byte tryAbbrev);

    /**
     * CFTimeZoneGetName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneGetName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneGetName(CFTimeZoneRef tz);

    /**
     * CFTimeZoneGetData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneGetData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFTimeZoneGetData(CFTimeZoneRef tz);

    /**
     * CFTimeZoneGetSecondsFromGMT</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneGetSecondsFromGMT">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFTimeZoneGetSecondsFromGMT(CFTimeZoneRef tz, double at);

    /**
     * CFTimeZoneCopyAbbreviation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCopyAbbreviation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneCopyAbbreviation(CFTimeZoneRef tz, double at);

    /**
     * CFTimeZoneIsDaylightSavingTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneIsDaylightSavingTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFTimeZoneIsDaylightSavingTime(CFTimeZoneRef tz, double at);

    /**
     * CFTimeZoneGetDaylightSavingTimeOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneGetDaylightSavingTimeOffset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFTimeZoneGetDaylightSavingTimeOffset(CFTimeZoneRef tz, double at);

    /**
     * CFTimeZoneGetNextDaylightSavingTimeTransition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneGetNextDaylightSavingTimeTransition">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFTimeZoneGetNextDaylightSavingTimeTransition(CFTimeZoneRef tz, double at);

    /**
     * CFTimeZoneCopyLocalizedName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTimeZoneRef/index.html#//apple_ref/c/func/CFTimeZoneCopyLocalizedName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneCopyLocalizedName(CFTimeZoneRef tz, @NInt long style,
            CFLocaleRef locale);

    /**
     * CFCalendarGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFCalendarGetTypeID();

    /**
     * CFCalendarCopyCurrent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarCopyCurrent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCalendarRef CFCalendarCopyCurrent();

    /**
     * CFCalendarCreateWithIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarCreateWithIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFCalendarRef CFCalendarCreateWithIdentifier(CFAllocatorRef allocator, CFStringRef identifier);

    /**
     * CFCalendarGetIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFCalendarGetIdentifier(CFCalendarRef calendar);

    /**
     * CFCalendarCopyLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarCopyLocale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFCalendarCopyLocale(CFCalendarRef calendar);

    /**
     * CFCalendarSetLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarSetLocale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCalendarSetLocale(CFCalendarRef calendar, CFLocaleRef locale);

    /**
     * CFCalendarCopyTimeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarCopyTimeZone">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTimeZoneRef CFCalendarCopyTimeZone(CFCalendarRef calendar);

    /**
     * CFCalendarSetTimeZone</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarSetTimeZone">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCalendarSetTimeZone(CFCalendarRef calendar, CFTimeZoneRef tz);

    /**
     * CFCalendarGetFirstWeekday</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetFirstWeekday">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetFirstWeekday(CFCalendarRef calendar);

    /**
     * CFCalendarSetFirstWeekday</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarSetFirstWeekday">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCalendarSetFirstWeekday(CFCalendarRef calendar, @NInt long wkdy);

    /**
     * CFCalendarGetMinimumDaysInFirstWeek</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetMinimumDaysInFirstWeek">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetMinimumDaysInFirstWeek(CFCalendarRef calendar);

    /**
     * CFCalendarSetMinimumDaysInFirstWeek</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarSetMinimumDaysInFirstWeek">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFCalendarSetMinimumDaysInFirstWeek(CFCalendarRef calendar, @NInt long mwd);

    /**
     * CFCalendarGetMinimumRangeOfUnit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetMinimumRangeOfUnit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetMinimumRangeOfUnit(CFCalendarRef calendar, @NUInt long unit);

    /**
     * CFCalendarGetMaximumRangeOfUnit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetMaximumRangeOfUnit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetMaximumRangeOfUnit(CFCalendarRef calendar, @NUInt long unit);

    /**
     * CFCalendarGetRangeOfUnit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetRangeOfUnit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetRangeOfUnit(CFCalendarRef calendar, @NUInt long smallerUnit,
            @NUInt long biggerUnit, double at);

    /**
     * CFCalendarGetOrdinalityOfUnit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetOrdinalityOfUnit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetOrdinalityOfUnit(CFCalendarRef calendar, @NUInt long smallerUnit,
            @NUInt long biggerUnit, double at);

    /**
     * CFCalendarGetTimeRangeOfUnit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetTimeRangeOfUnit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFCalendarGetTimeRangeOfUnit(CFCalendarRef calendar, @NUInt long unit, double at,
            DoublePtr startp, DoublePtr tip);

    /**
     * CFCalendarComposeAbsoluteTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarComposeAbsoluteTime">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarComposeAbsoluteTime(CFCalendarRef calendar, DoublePtr at,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    /**
     * CFCalendarDecomposeAbsoluteTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarDecomposeAbsoluteTime">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarDecomposeAbsoluteTime(CFCalendarRef calendar, double at,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    /**
     * CFCalendarAddComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarAddComponents">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarAddComponents(CFCalendarRef calendar, DoublePtr at, @NUInt long options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    /**
     * CFCalendarGetComponentDifference</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFCalendarRef/index.html#//apple_ref/c/func/CFCalendarGetComponentDifference">iOS Dev Center</a>
     */
    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarGetComponentDifference(CFCalendarRef calendar, double startingAT,
            double resultAT, @NUInt long options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    /**
     * CFDateFormatterCreateDateFormatFromTemplate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterCreateDateFormatFromTemplate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateDateFormatFromTemplate(CFAllocatorRef allocator,
            CFStringRef tmplate, @NUInt long options, CFLocaleRef locale);

    /**
     * CFDateFormatterGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFDateFormatterGetTypeID();

    /**
     * CFDateFormatterCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDateFormatterRef CFDateFormatterCreate(CFAllocatorRef allocator, CFLocaleRef locale,
            @NInt long dateStyle, @NInt long timeStyle);

    /**
     * CFDateFormatterGetLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterGetLocale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFDateFormatterGetLocale(CFDateFormatterRef formatter);

    /**
     * CFDateFormatterGetDateStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterGetDateStyle">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDateFormatterGetDateStyle(CFDateFormatterRef formatter);

    /**
     * CFDateFormatterGetTimeStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterGetTimeStyle">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFDateFormatterGetTimeStyle(CFDateFormatterRef formatter);

    /**
     * CFDateFormatterGetFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterGetFormat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterGetFormat(CFDateFormatterRef formatter);

    /**
     * CFDateFormatterSetFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterSetFormat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDateFormatterSetFormat(CFDateFormatterRef formatter, CFStringRef formatString);

    /**
     * CFDateFormatterCreateStringWithDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterCreateStringWithDate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateStringWithDate(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, CFDateRef date);

    /**
     * CFDateFormatterCreateStringWithAbsoluteTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterCreateStringWithAbsoluteTime">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateStringWithAbsoluteTime(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, double at);

    /**
     * CFDateFormatterCreateDateFromString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterCreateDateFromString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDateRef CFDateFormatterCreateDateFromString(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep);

    /**
     * CFDateFormatterGetAbsoluteTimeFromString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterGetAbsoluteTimeFromString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFDateFormatterGetAbsoluteTimeFromString(CFDateFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, DoublePtr atp);

    /**
     * CFDateFormatterSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFDateFormatterSetProperty(CFDateFormatterRef formatter, CFStringRef key,
            ConstVoidPtr value);

    /**
     * CFDateFormatterCopyProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFDateFormatterRef/index.html#//apple_ref/c/func/CFDateFormatterCopyProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFDateFormatterCopyProperty(CFDateFormatterRef formatter, CFStringRef key);

    /**
     * CFBooleanGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBooleanRef/index.html#//apple_ref/c/func/CFBooleanGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFBooleanGetTypeID();

    /**
     * CFBooleanGetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBooleanRef/index.html#//apple_ref/c/func/CFBooleanGetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBooleanGetValue(CFBooleanRef boolean_);

    /**
     * CFNumberGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberRef/index.html#//apple_ref/c/func/CFNumberGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFNumberGetTypeID();

    /**
     * CFNumberCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberRef/index.html#//apple_ref/c/func/CFNumberCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFNumberRef CFNumberCreate(CFAllocatorRef allocator, @NInt long theType,
            ConstVoidPtr valuePtr);

    /**
     * CFNumberGetType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberRef/index.html#//apple_ref/c/func/CFNumberGetType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNumberGetType(CFNumberRef number);

    /**
     * CFNumberGetByteSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberRef/index.html#//apple_ref/c/func/CFNumberGetByteSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNumberGetByteSize(CFNumberRef number);

    /**
     * CFNumberIsFloatType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberRef/index.html#//apple_ref/c/func/CFNumberIsFloatType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFNumberIsFloatType(CFNumberRef number);

    /**
     * CFNumberGetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberRef/index.html#//apple_ref/c/func/CFNumberGetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFNumberGetValue(CFNumberRef number, @NInt long theType, VoidPtr valuePtr);

    /**
     * CFNumberCompare</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberRef/index.html#//apple_ref/c/func/CFNumberCompare">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNumberCompare(CFNumberRef number, CFNumberRef otherNumber, VoidPtr context);

    /**
     * CFNumberFormatterGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFNumberFormatterGetTypeID();

    /**
     * CFNumberFormatterCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFNumberFormatterRef CFNumberFormatterCreate(CFAllocatorRef allocator, CFLocaleRef locale,
            @NInt long style);

    /**
     * CFNumberFormatterGetLocale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterGetLocale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFLocaleRef CFNumberFormatterGetLocale(CFNumberFormatterRef formatter);

    /**
     * CFNumberFormatterGetStyle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterGetStyle">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFNumberFormatterGetStyle(CFNumberFormatterRef formatter);

    /**
     * CFNumberFormatterGetFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterGetFormat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterGetFormat(CFNumberFormatterRef formatter);

    /**
     * CFNumberFormatterSetFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterSetFormat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFNumberFormatterSetFormat(CFNumberFormatterRef formatter, CFStringRef formatString);

    /**
     * CFNumberFormatterCreateStringWithNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterCreateStringWithNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterCreateStringWithNumber(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, CFNumberRef number);

    /**
     * CFNumberFormatterCreateStringWithValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterCreateStringWithValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterCreateStringWithValue(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, @NInt long numberType, ConstVoidPtr valuePtr);

    /**
     * CFNumberFormatterCreateNumberFromString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterCreateNumberFromString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFNumberRef CFNumberFormatterCreateNumberFromString(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, @NUInt long options);

    /**
     * CFNumberFormatterGetValueFromString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterGetValueFromString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFNumberFormatterGetValueFromString(CFNumberFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, @NInt long numberType,
            VoidPtr valuePtr);

    /**
     * CFNumberFormatterSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFNumberFormatterSetProperty(CFNumberFormatterRef formatter, CFStringRef key,
            ConstVoidPtr value);

    /**
     * CFNumberFormatterCopyProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterCopyProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFNumberFormatterCopyProperty(CFNumberFormatterRef formatter, CFStringRef key);

    /**
     * CFNumberFormatterGetDecimalInfoForCurrencyCode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNumberFormatterRef/index.html#//apple_ref/c/func/CFNumberFormatterGetDecimalInfoForCurrencyCode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFNumberFormatterGetDecimalInfoForCurrencyCode(CFStringRef currencyCode,
            IntPtr defaultFractionDigits, DoublePtr roundingIncrement);

    /**
     * CFPreferencesCopyAppValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesCopyAppValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPreferencesCopyAppValue(CFStringRef key, CFStringRef applicationID);

    /**
     * CFPreferencesGetAppBooleanValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesGetAppBooleanValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPreferencesGetAppBooleanValue(CFStringRef key, CFStringRef applicationID,
            BytePtr keyExistsAndHasValidFormat);

    /**
     * CFPreferencesGetAppIntegerValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesGetAppIntegerValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFPreferencesGetAppIntegerValue(CFStringRef key, CFStringRef applicationID,
            BytePtr keyExistsAndHasValidFormat);

    /**
     * CFPreferencesSetAppValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesSetAppValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFPreferencesSetAppValue(CFStringRef key, ConstVoidPtr value, CFStringRef applicationID);

    /**
     * CFPreferencesAddSuitePreferencesToApp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesAddSuitePreferencesToApp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFPreferencesAddSuitePreferencesToApp(CFStringRef applicationID, CFStringRef suiteID);

    /**
     * CFPreferencesRemoveSuitePreferencesFromApp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesRemoveSuitePreferencesFromApp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFPreferencesRemoveSuitePreferencesFromApp(CFStringRef applicationID,
            CFStringRef suiteID);

    /**
     * CFPreferencesAppSynchronize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesAppSynchronize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPreferencesAppSynchronize(CFStringRef applicationID);

    /**
     * CFPreferencesCopyValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesCopyValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPreferencesCopyValue(CFStringRef key, CFStringRef applicationID,
            CFStringRef userName, CFStringRef hostName);

    /**
     * CFPreferencesCopyMultiple</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesCopyMultiple">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFPreferencesCopyMultiple(CFArrayRef keysToFetch, CFStringRef applicationID,
            CFStringRef userName, CFStringRef hostName);

    /**
     * CFPreferencesSetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesSetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFPreferencesSetValue(CFStringRef key, ConstVoidPtr value, CFStringRef applicationID,
            CFStringRef userName, CFStringRef hostName);

    /**
     * CFPreferencesSetMultiple</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesSetMultiple">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFPreferencesSetMultiple(CFDictionaryRef keysToSet, CFArrayRef keysToRemove,
            CFStringRef applicationID, CFStringRef userName, CFStringRef hostName);

    /**
     * CFPreferencesSynchronize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesSynchronize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPreferencesSynchronize(CFStringRef applicationID, CFStringRef userName,
            CFStringRef hostName);

    /**
     * CFPreferencesCopyApplicationList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesCopyApplicationList">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef CFPreferencesCopyApplicationList(CFStringRef userName, CFStringRef hostName);

    /**
     * CFPreferencesCopyKeyList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesCopyKeyList">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFPreferencesCopyKeyList(CFStringRef applicationID, CFStringRef userName,
            CFStringRef hostName);

    /**
     * CFPreferencesAppValueIsForced</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPreferencesUtils/index.html#//apple_ref/c/func/CFPreferencesAppValueIsForced">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPreferencesAppValueIsForced(CFStringRef key, CFStringRef applicationID);

    /**
     * CFRunLoopGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopGetTypeID();

    /**
     * CFRunLoopGetCurrent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopGetCurrent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopRef CFRunLoopGetCurrent();

    /**
     * CFRunLoopGetMain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopGetMain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopRef CFRunLoopGetMain();

    /**
     * CFRunLoopCopyCurrentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopCopyCurrentMode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFRunLoopCopyCurrentMode(CFRunLoopRef rl);

    /**
     * CFRunLoopCopyAllModes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopCopyAllModes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFRunLoopCopyAllModes(CFRunLoopRef rl);

    /**
     * CFRunLoopAddCommonMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopAddCommonMode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopAddCommonMode(CFRunLoopRef rl, CFStringRef mode);

    /**
     * CFRunLoopGetNextTimerFireDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopGetNextTimerFireDate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFRunLoopGetNextTimerFireDate(CFRunLoopRef rl, CFStringRef mode);

    /**
     * CFRunLoopRun</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopRun">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopRun();

    /**
     * CFRunLoopRunInMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopRunInMode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFRunLoopRunInMode(CFStringRef mode, double seconds, byte returnAfterSourceHandled);

    /**
     * CFRunLoopIsWaiting</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopIsWaiting">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopIsWaiting(CFRunLoopRef rl);

    /**
     * CFRunLoopWakeUp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopWakeUp">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopWakeUp(CFRunLoopRef rl);

    /**
     * CFRunLoopStop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopStop">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopStop(CFRunLoopRef rl);

    /**
     * CFRunLoopPerformBlock</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopPerformBlock">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopPerformBlock(CFRunLoopRef rl, ConstVoidPtr mode,
            @ObjCBlock(name = "call_CFRunLoopPerformBlock") Block_CFRunLoopPerformBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopPerformBlock {
        @Generated
        void call_CFRunLoopPerformBlock();
    }

    /**
     * CFRunLoopContainsSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopContainsSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopContainsSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    /**
     * CFRunLoopAddSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopAddSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopAddSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    /**
     * CFRunLoopRemoveSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopRemoveSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopRemoveSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    /**
     * CFRunLoopContainsObserver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopContainsObserver">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopContainsObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer,
            CFStringRef mode);

    /**
     * CFRunLoopAddObserver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopAddObserver">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopAddObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer, CFStringRef mode);

    /**
     * CFRunLoopRemoveObserver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopRemoveObserver">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopRemoveObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer, CFStringRef mode);

    /**
     * CFRunLoopContainsTimer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopContainsTimer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopContainsTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    /**
     * CFRunLoopAddTimer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopAddTimer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopAddTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    /**
     * CFRunLoopRemoveTimer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopRef/index.html#//apple_ref/c/func/CFRunLoopRemoveTimer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopRemoveTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    /**
     * CFRunLoopSourceGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopSourceRef/index.html#//apple_ref/c/func/CFRunLoopSourceGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopSourceGetTypeID();

    /**
     * CFRunLoopSourceCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopSourceRef/index.html#//apple_ref/c/func/CFRunLoopSourceCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFRunLoopSourceCreate(CFAllocatorRef allocator, @NInt long order,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopSourceContext context);

    /**
     * CFRunLoopSourceGetOrder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopSourceRef/index.html#//apple_ref/c/func/CFRunLoopSourceGetOrder">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopSourceGetOrder(CFRunLoopSourceRef source);

    /**
     * CFRunLoopSourceInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopSourceRef/index.html#//apple_ref/c/func/CFRunLoopSourceInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopSourceInvalidate(CFRunLoopSourceRef source);

    /**
     * CFRunLoopSourceIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopSourceRef/index.html#//apple_ref/c/func/CFRunLoopSourceIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopSourceIsValid(CFRunLoopSourceRef source);

    /**
     * CFRunLoopSourceGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopSourceRef/index.html#//apple_ref/c/func/CFRunLoopSourceGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopSourceGetContext(CFRunLoopSourceRef source,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopSourceContext context);

    /**
     * CFRunLoopSourceSignal</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopSourceRef/index.html#//apple_ref/c/func/CFRunLoopSourceSignal">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopSourceSignal(CFRunLoopSourceRef source);

    /**
     * CFRunLoopObserverGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopObserverGetTypeID();

    /**
     * CFRunLoopObserverCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopObserverRef CFRunLoopObserverCreate(CFAllocatorRef allocator, @NUInt long activities,
            byte repeats, @NInt long order,
            @FunctionPtr(name = "call_CFRunLoopObserverCreate") Function_CFRunLoopObserverCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopObserverContext context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFRunLoopObserverCreate {
        @Generated
        void call_CFRunLoopObserverCreate(VoidPtr arg0, @NUInt long arg1, VoidPtr arg2);
    }

    /**
     * CFRunLoopObserverCreateWithHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverCreateWithHandler">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopObserverRef CFRunLoopObserverCreateWithHandler(CFAllocatorRef allocator,
            @NUInt long activities, byte repeats, @NInt long order,
            @ObjCBlock(name = "call_CFRunLoopObserverCreateWithHandler") Block_CFRunLoopObserverCreateWithHandler block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopObserverCreateWithHandler {
        @Generated
        void call_CFRunLoopObserverCreateWithHandler(CFRunLoopObserverRef arg0, @NUInt long arg1);
    }

    /**
     * CFRunLoopObserverGetActivities</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverGetActivities">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopObserverGetActivities(CFRunLoopObserverRef observer);

    /**
     * CFRunLoopObserverDoesRepeat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverDoesRepeat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopObserverDoesRepeat(CFRunLoopObserverRef observer);

    /**
     * CFRunLoopObserverGetOrder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverGetOrder">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopObserverGetOrder(CFRunLoopObserverRef observer);

    /**
     * CFRunLoopObserverInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopObserverInvalidate(CFRunLoopObserverRef observer);

    /**
     * CFRunLoopObserverIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopObserverIsValid(CFRunLoopObserverRef observer);

    /**
     * CFRunLoopObserverGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopObserverRef/index.html#//apple_ref/c/func/CFRunLoopObserverGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopObserverGetContext(CFRunLoopObserverRef observer,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopObserverContext context);

    /**
     * CFRunLoopTimerGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopTimerGetTypeID();

    /**
     * CFRunLoopTimerCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopTimerRef CFRunLoopTimerCreate(CFAllocatorRef allocator, double fireDate,
            double interval, @NUInt long flags, @NInt long order,
            @FunctionPtr(name = "call_CFRunLoopTimerCreate") Function_CFRunLoopTimerCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopTimerContext context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFRunLoopTimerCreate {
        @Generated
        void call_CFRunLoopTimerCreate(VoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFRunLoopTimerCreateWithHandler</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerCreateWithHandler">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopTimerRef CFRunLoopTimerCreateWithHandler(CFAllocatorRef allocator, double fireDate,
            double interval, @NUInt long flags, @NInt long order,
            @ObjCBlock(name = "call_CFRunLoopTimerCreateWithHandler") Block_CFRunLoopTimerCreateWithHandler block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopTimerCreateWithHandler {
        @Generated
        void call_CFRunLoopTimerCreateWithHandler(CFRunLoopTimerRef arg0);
    }

    /**
     * CFRunLoopTimerGetNextFireDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerGetNextFireDate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFRunLoopTimerGetNextFireDate(CFRunLoopTimerRef timer);

    /**
     * CFRunLoopTimerSetNextFireDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerSetNextFireDate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopTimerSetNextFireDate(CFRunLoopTimerRef timer, double fireDate);

    /**
     * CFRunLoopTimerGetInterval</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerGetInterval">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native double CFRunLoopTimerGetInterval(CFRunLoopTimerRef timer);

    /**
     * CFRunLoopTimerDoesRepeat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerDoesRepeat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopTimerDoesRepeat(CFRunLoopTimerRef timer);

    /**
     * CFRunLoopTimerGetOrder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerGetOrder">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopTimerGetOrder(CFRunLoopTimerRef timer);

    /**
     * CFRunLoopTimerInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopTimerInvalidate(CFRunLoopTimerRef timer);

    /**
     * CFRunLoopTimerIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFRunLoopTimerIsValid(CFRunLoopTimerRef timer);

    /**
     * CFRunLoopTimerGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFRunLoopTimerRef/index.html#//apple_ref/c/func/CFRunLoopTimerGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFRunLoopTimerGetContext(CFRunLoopTimerRef timer,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopTimerContext context);

    @Generated
    @CFunction
    public static native double CFRunLoopTimerGetTolerance(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native void CFRunLoopTimerSetTolerance(CFRunLoopTimerRef timer, double tolerance);

    /**
     * CFSocketGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFSocketGetTypeID();

    /**
     * CFSocketCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreate(CFAllocatorRef allocator, int protocolFamily, int socketType,
            int protocol, @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreate") Function_CFSocketCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreate {
        @Generated
        void call_CFSocketCreate(VoidPtr arg0, @NUInt long arg1, VoidPtr arg2, ConstVoidPtr arg3, VoidPtr arg4);
    }

    /**
     * CFSocketCreateWithNative</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketCreateWithNative">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateWithNative(CFAllocatorRef allocator, int sock,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateWithNative") Function_CFSocketCreateWithNative callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateWithNative {
        @Generated
        void call_CFSocketCreateWithNative(VoidPtr arg0, @NUInt long arg1, VoidPtr arg2, ConstVoidPtr arg3,
                VoidPtr arg4);
    }

    /**
     * CFSocketCreateWithSocketSignature</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketCreateWithSocketSignature">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateWithSocketSignature(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateWithSocketSignature") Function_CFSocketCreateWithSocketSignature callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateWithSocketSignature {
        @Generated
        void call_CFSocketCreateWithSocketSignature(VoidPtr arg0, @NUInt long arg1, VoidPtr arg2, ConstVoidPtr arg3,
                VoidPtr arg4);
    }

    /**
     * CFSocketCreateConnectedToSocketSignature</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketCreateConnectedToSocketSignature">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateConnectedToSocketSignature(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateConnectedToSocketSignature") Function_CFSocketCreateConnectedToSocketSignature callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context,
            double timeout);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateConnectedToSocketSignature {
        @Generated
        void call_CFSocketCreateConnectedToSocketSignature(VoidPtr arg0, @NUInt long arg1, VoidPtr arg2,
                ConstVoidPtr arg3, VoidPtr arg4);
    }

    /**
     * CFSocketSetAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketSetAddress">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketSetAddress(CFSocketRef s, CFDataRef address);

    /**
     * CFSocketConnectToAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketConnectToAddress">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketConnectToAddress(CFSocketRef s, CFDataRef address, double timeout);

    /**
     * CFSocketInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSocketInvalidate(CFSocketRef s);

    /**
     * CFSocketIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFSocketIsValid(CFSocketRef s);

    /**
     * CFSocketCopyAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketCopyAddress">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFSocketCopyAddress(CFSocketRef s);

    /**
     * CFSocketCopyPeerAddress</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketCopyPeerAddress">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFSocketCopyPeerAddress(CFSocketRef s);

    /**
     * CFSocketGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSocketGetContext(CFSocketRef s,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    /**
     * CFSocketGetNative</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketGetNative">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFSocketGetNative(CFSocketRef s);

    /**
     * CFSocketCreateRunLoopSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketCreateRunLoopSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFSocketCreateRunLoopSource(CFAllocatorRef allocator, CFSocketRef s,
            @NInt long order);

    /**
     * CFSocketGetSocketFlags</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketGetSocketFlags">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFSocketGetSocketFlags(CFSocketRef s);

    /**
     * CFSocketSetSocketFlags</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketSetSocketFlags">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSocketSetSocketFlags(CFSocketRef s, @NUInt long flags);

    /**
     * CFSocketDisableCallBacks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketDisableCallBacks">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSocketDisableCallBacks(CFSocketRef s, @NUInt long callBackTypes);

    /**
     * CFSocketEnableCallBacks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketEnableCallBacks">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSocketEnableCallBacks(CFSocketRef s, @NUInt long callBackTypes);

    /**
     * CFSocketSendData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketRef/index.html#//apple_ref/c/func/CFSocketSendData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketSendData(CFSocketRef s, CFDataRef address, CFDataRef data, double timeout);

    /**
     * CFSocketRegisterValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketNameServerUtils/index.html#//apple_ref/c/func/CFSocketRegisterValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketRegisterValue(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name, ConstVoidPtr value);

    /**
     * CFSocketCopyRegisteredValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketNameServerUtils/index.html#//apple_ref/c/func/CFSocketCopyRegisteredValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketCopyRegisteredValue(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name, Ptr<ConstVoidPtr> value, Ptr<CFDataRef> nameServerAddress);

    /**
     * CFSocketRegisterSocketSignature</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketNameServerUtils/index.html#//apple_ref/c/func/CFSocketRegisterSocketSignature">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketRegisterSocketSignature(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature);

    /**
     * CFSocketCopyRegisteredSocketSignature</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketNameServerUtils/index.html#//apple_ref/c/func/CFSocketCopyRegisteredSocketSignature">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketCopyRegisteredSocketSignature(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            Ptr<CFDataRef> nameServerAddress);

    /**
     * CFSocketUnregister</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketNameServerUtils/index.html#//apple_ref/c/func/CFSocketUnregister">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSocketUnregister(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name);

    /**
     * CFSocketSetDefaultNameRegistryPortNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketNameServerUtils/index.html#//apple_ref/c/func/CFSocketSetDefaultNameRegistryPortNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSocketSetDefaultNameRegistryPortNumber(char port);

    /**
     * CFSocketGetDefaultNameRegistryPortNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSocketNameServerUtils/index.html#//apple_ref/c/func/CFSocketGetDefaultNameRegistryPortNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native char CFSocketGetDefaultNameRegistryPortNumber();

    /**
     * CFReadStreamGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFReadStreamGetTypeID();

    /**
     * CFWriteStreamGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFWriteStreamGetTypeID();

    /**
     * CFReadStreamCreateWithBytesNoCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamCreateWithBytesNoCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateWithBytesNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length, CFAllocatorRef bytesDeallocator);

    /**
     * CFWriteStreamCreateWithBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamCreateWithBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithBuffer(CFAllocatorRef alloc, BytePtr buffer,
            @NInt long bufferCapacity);

    /**
     * CFWriteStreamCreateWithAllocatedBuffers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamCreateWithAllocatedBuffers">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithAllocatedBuffers(CFAllocatorRef alloc,
            CFAllocatorRef bufferAllocator);

    /**
     * CFReadStreamCreateWithFile</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamCreateWithFile">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateWithFile(CFAllocatorRef alloc, CFURLRef fileURL);

    /**
     * CFWriteStreamCreateWithFile</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamCreateWithFile">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithFile(CFAllocatorRef alloc, CFURLRef fileURL);

    /**
     * CFStreamCreateBoundPair</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStreamConstants/index.html#//apple_ref/c/func/CFStreamCreateBoundPair">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStreamCreateBoundPair(CFAllocatorRef alloc, Ptr<CFReadStreamRef> readStream,
            Ptr<CFWriteStreamRef> writeStream, @NInt long transferBufferSize);

    /**
     * CFStreamCreatePairWithSocket</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStreamConstants/index.html#//apple_ref/c/func/CFStreamCreatePairWithSocket">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocket(CFAllocatorRef alloc, int sock,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    /**
     * CFStreamCreatePairWithSocketToHost</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStreamConstants/index.html#//apple_ref/c/func/CFStreamCreatePairWithSocketToHost">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocketToHost(CFAllocatorRef alloc, CFStringRef host, int port,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    /**
     * CFStreamCreatePairWithPeerSocketSignature</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStreamConstants/index.html#//apple_ref/c/func/CFStreamCreatePairWithPeerSocketSignature">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithPeerSocketSignature(CFAllocatorRef alloc,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    /**
     * CFReadStreamGetStatus</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamGetStatus">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFReadStreamGetStatus(CFReadStreamRef stream);

    /**
     * CFWriteStreamGetStatus</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamGetStatus">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFWriteStreamGetStatus(CFWriteStreamRef stream);

    /**
     * CFReadStreamCopyError</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamCopyError">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFErrorRef CFReadStreamCopyError(CFReadStreamRef stream);

    /**
     * CFWriteStreamCopyError</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamCopyError">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFErrorRef CFWriteStreamCopyError(CFWriteStreamRef stream);

    /**
     * CFReadStreamOpen</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamOpen">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFReadStreamOpen(CFReadStreamRef stream);

    /**
     * CFWriteStreamOpen</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamOpen">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFWriteStreamOpen(CFWriteStreamRef stream);

    /**
     * CFReadStreamClose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamClose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFReadStreamClose(CFReadStreamRef stream);

    /**
     * CFWriteStreamClose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamClose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFWriteStreamClose(CFWriteStreamRef stream);

    /**
     * CFReadStreamHasBytesAvailable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamHasBytesAvailable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFReadStreamHasBytesAvailable(CFReadStreamRef stream);

    /**
     * CFReadStreamRead</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamRead">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFReadStreamRead(CFReadStreamRef stream, BytePtr buffer, @NInt long bufferLength);

    /**
     * CFReadStreamGetBuffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamGetBuffer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFReadStreamGetBuffer(CFReadStreamRef stream, @NInt long maxBytesToRead,
            NIntPtr numBytesRead);

    /**
     * CFWriteStreamCanAcceptBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamCanAcceptBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFWriteStreamCanAcceptBytes(CFWriteStreamRef stream);

    /**
     * CFWriteStreamWrite</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamWrite">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFWriteStreamWrite(CFWriteStreamRef stream,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufferLength);

    /**
     * CFReadStreamCopyProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamCopyProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFReadStreamCopyProperty(CFReadStreamRef stream, CFStringRef propertyName);

    /**
     * CFWriteStreamCopyProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamCopyProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFWriteStreamCopyProperty(CFWriteStreamRef stream, CFStringRef propertyName);

    /**
     * CFReadStreamSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFReadStreamSetProperty(CFReadStreamRef stream, CFStringRef propertyName,
            ConstVoidPtr propertyValue);

    /**
     * CFWriteStreamSetProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamSetProperty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFWriteStreamSetProperty(CFWriteStreamRef stream, CFStringRef propertyName,
            ConstVoidPtr propertyValue);

    /**
     * CFReadStreamSetClient</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamSetClient">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFReadStreamSetClient(CFReadStreamRef stream, @NUInt long streamEvents,
            @FunctionPtr(name = "call_CFReadStreamSetClient") Function_CFReadStreamSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFReadStreamSetClient {
        @Generated
        void call_CFReadStreamSetClient(VoidPtr arg0, @NUInt long arg1, VoidPtr arg2);
    }

    /**
     * CFWriteStreamSetClient</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamSetClient">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFWriteStreamSetClient(CFWriteStreamRef stream, @NUInt long streamEvents,
            @FunctionPtr(name = "call_CFWriteStreamSetClient") Function_CFWriteStreamSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFWriteStreamSetClient {
        @Generated
        void call_CFWriteStreamSetClient(VoidPtr arg0, @NUInt long arg1, VoidPtr arg2);
    }

    /**
     * CFReadStreamScheduleWithRunLoop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamScheduleWithRunLoop">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFReadStreamScheduleWithRunLoop(CFReadStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    /**
     * CFWriteStreamScheduleWithRunLoop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamScheduleWithRunLoop">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFWriteStreamScheduleWithRunLoop(CFWriteStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    /**
     * CFReadStreamUnscheduleFromRunLoop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamUnscheduleFromRunLoop">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFReadStreamUnscheduleFromRunLoop(CFReadStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    /**
     * CFWriteStreamUnscheduleFromRunLoop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamUnscheduleFromRunLoop">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFWriteStreamUnscheduleFromRunLoop(CFWriteStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFReadStreamSetDispatchQueue(CFReadStreamRef stream, NSObject q);

    @Generated
    @CFunction
    public static native void CFWriteStreamSetDispatchQueue(CFWriteStreamRef stream, NSObject q);

    @Generated
    @CFunction
    public static native NSObject CFReadStreamCopyDispatchQueue(CFReadStreamRef stream);

    @Generated
    @CFunction
    public static native NSObject CFWriteStreamCopyDispatchQueue(CFWriteStreamRef stream);

    /**
     * CFReadStreamGetError</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFReadStreamRef/index.html#//apple_ref/c/func/CFReadStreamGetError">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFStreamError CFReadStreamGetError(CFReadStreamRef stream);

    /**
     * CFWriteStreamGetError</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFWriteStreamRef/index.html#//apple_ref/c/func/CFWriteStreamGetError">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFStreamError CFWriteStreamGetError(CFWriteStreamRef stream);

    /**
     * CFPropertyListCreateFromXMLData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListCreateFromXMLData">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateFromXMLData(CFAllocatorRef allocator, CFDataRef xmlData,
            @NUInt long mutabilityOption, Ptr<CFStringRef> errorString);

    /**
     * CFPropertyListCreateXMLData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListCreateXMLData">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef CFPropertyListCreateXMLData(CFAllocatorRef allocator, ConstVoidPtr propertyList);

    /**
     * CFPropertyListCreateDeepCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListCreateDeepCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateDeepCopy(CFAllocatorRef allocator, ConstVoidPtr propertyList,
            @NUInt long mutabilityOption);

    /**
     * CFPropertyListIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPropertyListIsValid(ConstVoidPtr plist, @NInt long format);

    /**
     * CFPropertyListWriteToStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListWriteToStream">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long CFPropertyListWriteToStream(ConstVoidPtr propertyList, CFWriteStreamRef stream,
            @NInt long format, Ptr<CFStringRef> errorString);

    /**
     * CFPropertyListCreateFromStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListCreateFromStream">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateFromStream(CFAllocatorRef allocator, CFReadStreamRef stream,
            @NInt long streamLength, @NUInt long mutabilityOption, NIntPtr format, Ptr<CFStringRef> errorString);

    /**
     * CFPropertyListCreateWithData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListCreateWithData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateWithData(CFAllocatorRef allocator, CFDataRef data,
            @NUInt long options, NIntPtr format, Ptr<CFErrorRef> error);

    /**
     * CFPropertyListCreateWithStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListCreateWithStream">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateWithStream(CFAllocatorRef allocator, CFReadStreamRef stream,
            @NInt long streamLength, @NUInt long options, NIntPtr format, Ptr<CFErrorRef> error);

    /**
     * CFPropertyListWrite</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListWrite">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFPropertyListWrite(ConstVoidPtr propertyList, CFWriteStreamRef stream, @NInt long format,
            @NUInt long options, Ptr<CFErrorRef> error);

    /**
     * CFPropertyListCreateData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPropertyListRef/index.html#//apple_ref/c/func/CFPropertyListCreateData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CFPropertyListCreateData(CFAllocatorRef allocator, ConstVoidPtr propertyList,
            @NInt long format, @NUInt long options, Ptr<CFErrorRef> error);

    /**
     * CFSetGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFSetGetTypeID();

    /**
     * CFSetCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFSetRef CFSetCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSetCallBacks callBacks);

    /**
     * CFSetCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFSetRef CFSetCreateCopy(CFAllocatorRef allocator, CFSetRef theSet);

    /**
     * CFSetCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableSetRef/index.html#//apple_ref/c/func/CFSetCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableSetRef CFSetCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSetCallBacks callBacks);

    /**
     * CFSetCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableSetRef/index.html#//apple_ref/c/func/CFSetCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableSetRef CFSetCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFSetRef theSet);

    /**
     * CFSetGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSetGetCount(CFSetRef theSet);

    /**
     * CFSetGetCountOfValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetGetCountOfValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFSetGetCountOfValue(CFSetRef theSet, ConstVoidPtr value);

    /**
     * CFSetContainsValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetContainsValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFSetContainsValue(CFSetRef theSet, ConstVoidPtr value);

    /**
     * CFSetGetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetGetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFSetGetValue(CFSetRef theSet, ConstVoidPtr value);

    /**
     * CFSetGetValueIfPresent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetGetValueIfPresent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFSetGetValueIfPresent(CFSetRef theSet, ConstVoidPtr candidate, Ptr<ConstVoidPtr> value);

    /**
     * CFSetGetValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetGetValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSetGetValues(CFSetRef theSet, Ptr<ConstVoidPtr> values);

    /**
     * CFSetApplyFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFSetRef/index.html#//apple_ref/c/func/CFSetApplyFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSetApplyFunction(CFSetRef theSet,
            @FunctionPtr(name = "call_CFSetApplyFunction") Function_CFSetApplyFunction applier, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSetApplyFunction {
        @Generated
        void call_CFSetApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFSetAddValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableSetRef/index.html#//apple_ref/c/func/CFSetAddValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSetAddValue(CFMutableSetRef theSet, ConstVoidPtr value);

    /**
     * CFSetReplaceValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableSetRef/index.html#//apple_ref/c/func/CFSetReplaceValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSetReplaceValue(CFMutableSetRef theSet, ConstVoidPtr value);

    /**
     * CFSetSetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableSetRef/index.html#//apple_ref/c/func/CFSetSetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSetSetValue(CFMutableSetRef theSet, ConstVoidPtr value);

    /**
     * CFSetRemoveValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableSetRef/index.html#//apple_ref/c/func/CFSetRemoveValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSetRemoveValue(CFMutableSetRef theSet, ConstVoidPtr value);

    /**
     * CFSetRemoveAllValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableSetRef/index.html#//apple_ref/c/func/CFSetRemoveAllValues">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFSetRemoveAllValues(CFMutableSetRef theSet);

    /**
     * CFTreeGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFTreeGetTypeID();

    /**
     * CFTreeCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    /**
     * CFTreeGetParent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeGetParent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetParent(CFTreeRef tree);

    /**
     * CFTreeGetNextSibling</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeGetNextSibling">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetNextSibling(CFTreeRef tree);

    /**
     * CFTreeGetFirstChild</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeGetFirstChild">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetFirstChild(CFTreeRef tree);

    /**
     * CFTreeGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeGetContext(CFTreeRef tree,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    /**
     * CFTreeGetChildCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeGetChildCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFTreeGetChildCount(CFTreeRef tree);

    /**
     * CFTreeGetChildAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeGetChildAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetChildAtIndex(CFTreeRef tree, @NInt long idx);

    /**
     * CFTreeGetChildren</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeGetChildren">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeGetChildren(CFTreeRef tree, Ptr<CFTreeRef> children);

    /**
     * CFTreeApplyFunctionToChildren</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeApplyFunctionToChildren">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeApplyFunctionToChildren(CFTreeRef tree,
            @FunctionPtr(name = "call_CFTreeApplyFunctionToChildren") Function_CFTreeApplyFunctionToChildren applier,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFTreeApplyFunctionToChildren {
        @Generated
        void call_CFTreeApplyFunctionToChildren(ConstVoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFTreeFindRoot</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeFindRoot">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFTreeRef CFTreeFindRoot(CFTreeRef tree);

    /**
     * CFTreeSetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeSetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeSetContext(CFTreeRef tree,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    /**
     * CFTreePrependChild</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreePrependChild">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreePrependChild(CFTreeRef tree, CFTreeRef newChild);

    /**
     * CFTreeAppendChild</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeAppendChild">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeAppendChild(CFTreeRef tree, CFTreeRef newChild);

    /**
     * CFTreeInsertSibling</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeInsertSibling">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeInsertSibling(CFTreeRef tree, CFTreeRef newSibling);

    /**
     * CFTreeRemove</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeRemove">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeRemove(CFTreeRef tree);

    /**
     * CFTreeRemoveAllChildren</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeRemoveAllChildren">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeRemoveAllChildren(CFTreeRef tree);

    /**
     * CFTreeSortChildren</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFTreeRef/index.html#//apple_ref/c/func/CFTreeSortChildren">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFTreeSortChildren(CFTreeRef tree,
            @FunctionPtr(name = "call_CFTreeSortChildren") Function_CFTreeSortChildren comparator, VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFTreeSortChildren {
        @Generated
        @NInt
        long call_CFTreeSortChildren(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    /**
     * CFURLCreateDataAndPropertiesFromResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLAccessUtils/index.html#//apple_ref/c/func/CFURLCreateDataAndPropertiesFromResource">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLCreateDataAndPropertiesFromResource(CFAllocatorRef alloc, CFURLRef url,
            Ptr<CFDataRef> resourceData, Ptr<CFDictionaryRef> properties, CFArrayRef desiredProperties,
            IntPtr errorCode);

    /**
     * CFURLWriteDataAndPropertiesToResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLAccessUtils/index.html#//apple_ref/c/func/CFURLWriteDataAndPropertiesToResource">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLWriteDataAndPropertiesToResource(CFURLRef url, CFDataRef dataToWrite,
            CFDictionaryRef propertiesToWrite, IntPtr errorCode);

    /**
     * CFURLDestroyResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLAccessUtils/index.html#//apple_ref/c/func/CFURLDestroyResource">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLDestroyResource(CFURLRef url, IntPtr errorCode);

    /**
     * CFURLCreatePropertyFromResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFURLAccessUtils/index.html#//apple_ref/c/func/CFURLCreatePropertyFromResource">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFURLCreatePropertyFromResource(CFAllocatorRef alloc, CFURLRef url,
            CFStringRef property, IntPtr errorCode);

    /**
     * CFUUIDGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFUUIDRef/index.html#//apple_ref/c/func/CFUUIDGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFUUIDGetTypeID();

    /**
     * CFUUIDCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFUUIDRef/index.html#//apple_ref/c/func/CFUUIDCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreate(CFAllocatorRef alloc);

    /**
     * CFUUIDCreateWithBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFUUIDRef/index.html#//apple_ref/c/func/CFUUIDCreateWithBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateWithBytes(CFAllocatorRef alloc, byte byte0, byte byte1, byte byte2,
            byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10,
            byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);

    /**
     * CFUUIDCreateFromString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFUUIDRef/index.html#//apple_ref/c/func/CFUUIDCreateFromString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateFromString(CFAllocatorRef alloc, CFStringRef uuidStr);

    /**
     * CFUUIDCreateString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFUUIDRef/index.html#//apple_ref/c/func/CFUUIDCreateString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFUUIDCreateString(CFAllocatorRef alloc, CFUUIDRef uuid);

    /**
     * CFUUIDGetConstantUUIDWithBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFUUIDRef/index.html#//apple_ref/c/func/CFUUIDGetConstantUUIDWithBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDGetConstantUUIDWithBytes(CFAllocatorRef alloc, byte byte0, byte byte1,
            byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10,
            byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);

    /**
     * CFUUIDGetUUIDBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFUUIDRef/index.html#//apple_ref/c/func/CFUUIDGetUUIDBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFUUIDBytes CFUUIDGetUUIDBytes(CFUUIDRef uuid);

    /**
     * CFUUIDCreateFromUUIDBytes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFUUIDRef/index.html#//apple_ref/c/func/CFUUIDCreateFromUUIDBytes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateFromUUIDBytes(CFAllocatorRef alloc, @ByValue CFUUIDBytes bytes);

    @Generated
    @CFunction
    public static native CFURLRef CFCopyHomeDirectoryURL();

    /**
     * CFBundleGetMainBundle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetMainBundle">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBundleRef CFBundleGetMainBundle();

    /**
     * CFBundleGetBundleWithIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetBundleWithIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBundleRef CFBundleGetBundleWithIdentifier(CFStringRef bundleID);

    /**
     * CFBundleGetAllBundles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetAllBundles">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleGetAllBundles();

    /**
     * CFBundleGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFBundleGetTypeID();

    /**
     * CFBundleCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBundleRef CFBundleCreate(CFAllocatorRef allocator, CFURLRef bundleURL);

    /**
     * CFBundleCreateBundlesFromDirectory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCreateBundlesFromDirectory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCreateBundlesFromDirectory(CFAllocatorRef allocator, CFURLRef directoryURL,
            CFStringRef bundleType);

    /**
     * CFBundleCopyBundleURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyBundleURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyBundleURL(CFBundleRef bundle);

    /**
     * CFBundleGetValueForInfoDictionaryKey</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetValueForInfoDictionaryKey">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFBundleGetValueForInfoDictionaryKey(CFBundleRef bundle, CFStringRef key);

    /**
     * CFBundleGetInfoDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetInfoDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleGetInfoDictionary(CFBundleRef bundle);

    /**
     * CFBundleGetLocalInfoDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetLocalInfoDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleGetLocalInfoDictionary(CFBundleRef bundle);

    /**
     * CFBundleGetPackageInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetPackageInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBundleGetPackageInfo(CFBundleRef bundle, IntPtr packageType, IntPtr packageCreator);

    /**
     * CFBundleGetIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetIdentifier">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFBundleGetIdentifier(CFBundleRef bundle);

    /**
     * CFBundleGetVersionNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetVersionNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFBundleGetVersionNumber(CFBundleRef bundle);

    /**
     * CFBundleGetDevelopmentRegion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetDevelopmentRegion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFBundleGetDevelopmentRegion(CFBundleRef bundle);

    /**
     * CFBundleCopySupportFilesDirectoryURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopySupportFilesDirectoryURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySupportFilesDirectoryURL(CFBundleRef bundle);

    /**
     * CFBundleCopyResourcesDirectoryURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyResourcesDirectoryURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourcesDirectoryURL(CFBundleRef bundle);

    /**
     * CFBundleCopyPrivateFrameworksURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyPrivateFrameworksURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyPrivateFrameworksURL(CFBundleRef bundle);

    /**
     * CFBundleCopySharedFrameworksURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopySharedFrameworksURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySharedFrameworksURL(CFBundleRef bundle);

    /**
     * CFBundleCopySharedSupportURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopySharedSupportURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySharedSupportURL(CFBundleRef bundle);

    /**
     * CFBundleCopyBuiltInPlugInsURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyBuiltInPlugInsURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyBuiltInPlugInsURL(CFBundleRef bundle);

    /**
     * CFBundleCopyInfoDictionaryInDirectory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyInfoDictionaryInDirectory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleCopyInfoDictionaryInDirectory(CFURLRef bundleURL);

    /**
     * CFBundleGetPackageInfoInDirectory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetPackageInfoInDirectory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBundleGetPackageInfoInDirectory(CFURLRef url, IntPtr packageType,
            IntPtr packageCreator);

    /**
     * CFBundleCopyResourceURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyResourceURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURL(CFBundleRef bundle, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName);

    /**
     * CFBundleCopyResourceURLsOfType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyResourceURLsOfType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfType(CFBundleRef bundle, CFStringRef resourceType,
            CFStringRef subDirName);

    /**
     * CFBundleCopyLocalizedString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyLocalizedString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFBundleCopyLocalizedString(CFBundleRef bundle, CFStringRef key, CFStringRef value,
            CFStringRef tableName);

    /**
     * CFBundleCopyResourceURLInDirectory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyResourceURLInDirectory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURLInDirectory(CFURLRef bundleURL, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName);

    /**
     * CFBundleCopyResourceURLsOfTypeInDirectory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyResourceURLsOfTypeInDirectory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfTypeInDirectory(CFURLRef bundleURL,
            CFStringRef resourceType, CFStringRef subDirName);

    /**
     * CFBundleCopyBundleLocalizations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyBundleLocalizations">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyBundleLocalizations(CFBundleRef bundle);

    /**
     * CFBundleCopyPreferredLocalizationsFromArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyPreferredLocalizationsFromArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyPreferredLocalizationsFromArray(CFArrayRef locArray);

    /**
     * CFBundleCopyLocalizationsForPreferences</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyLocalizationsForPreferences">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyLocalizationsForPreferences(CFArrayRef locArray, CFArrayRef prefArray);

    /**
     * CFBundleCopyResourceURLForLocalization</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyResourceURLForLocalization">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURLForLocalization(CFBundleRef bundle, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName, CFStringRef localizationName);

    /**
     * CFBundleCopyResourceURLsOfTypeForLocalization</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyResourceURLsOfTypeForLocalization">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfTypeForLocalization(CFBundleRef bundle,
            CFStringRef resourceType, CFStringRef subDirName, CFStringRef localizationName);

    /**
     * CFBundleCopyInfoDictionaryForURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyInfoDictionaryForURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleCopyInfoDictionaryForURL(CFURLRef url);

    /**
     * CFBundleCopyLocalizationsForURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyLocalizationsForURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyLocalizationsForURL(CFURLRef url);

    /**
     * CFBundleCopyExecutableArchitecturesForURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyExecutableArchitecturesForURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyExecutableArchitecturesForURL(CFURLRef url);

    /**
     * CFBundleCopyExecutableURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyExecutableURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyExecutableURL(CFBundleRef bundle);

    /**
     * CFBundleCopyExecutableArchitectures</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyExecutableArchitectures">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyExecutableArchitectures(CFBundleRef bundle);

    /**
     * CFBundlePreflightExecutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundlePreflightExecutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBundlePreflightExecutable(CFBundleRef bundle, Ptr<CFErrorRef> error);

    /**
     * CFBundleLoadExecutableAndReturnError</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleLoadExecutableAndReturnError">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBundleLoadExecutableAndReturnError(CFBundleRef bundle, Ptr<CFErrorRef> error);

    /**
     * CFBundleLoadExecutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleLoadExecutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBundleLoadExecutable(CFBundleRef bundle);

    /**
     * CFBundleIsExecutableLoaded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleIsExecutableLoaded">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFBundleIsExecutableLoaded(CFBundleRef bundle);

    /**
     * CFBundleUnloadExecutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleUnloadExecutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBundleUnloadExecutable(CFBundleRef bundle);

    /**
     * CFBundleGetFunctionPointerForName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetFunctionPointerForName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr CFBundleGetFunctionPointerForName(CFBundleRef bundle, CFStringRef functionName);

    /**
     * CFBundleGetFunctionPointersForNames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetFunctionPointersForNames">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBundleGetFunctionPointersForNames(CFBundleRef bundle, CFArrayRef functionNames,
            Ptr<VoidPtr> ftbl);

    /**
     * CFBundleGetDataPointerForName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetDataPointerForName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr CFBundleGetDataPointerForName(CFBundleRef bundle, CFStringRef symbolName);

    /**
     * CFBundleGetDataPointersForNames</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetDataPointersForNames">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBundleGetDataPointersForNames(CFBundleRef bundle, CFArrayRef symbolNames,
            Ptr<VoidPtr> stbl);

    /**
     * CFBundleCopyAuxiliaryExecutableURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCopyAuxiliaryExecutableURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyAuxiliaryExecutableURL(CFBundleRef bundle, CFStringRef executableName);

    /**
     * CFBundleGetPlugIn</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleGetPlugIn">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFPlugInRef CFBundleGetPlugIn(CFBundleRef bundle);

    /**
     * CFBundleOpenBundleResourceMap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleOpenBundleResourceMap">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFBundleOpenBundleResourceMap(CFBundleRef bundle);

    /**
     * CFBundleOpenBundleResourceFiles</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleOpenBundleResourceFiles">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFBundleOpenBundleResourceFiles(CFBundleRef bundle, IntPtr refNum, IntPtr localizedRefNum);

    /**
     * CFBundleCloseBundleResourceMap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFBundleRef/index.html#//apple_ref/c/func/CFBundleCloseBundleResourceMap">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFBundleCloseBundleResourceMap(CFBundleRef bundle, int refNum);

    /**
     * CFMessagePortGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFMessagePortGetTypeID();

    /**
     * CFMessagePortCreateLocal</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortCreateLocal">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMessagePortRef CFMessagePortCreateLocal(CFAllocatorRef allocator, CFStringRef name,
            @FunctionPtr(name = "call_CFMessagePortCreateLocal") Function_CFMessagePortCreateLocal callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMessagePortContext context,
            BytePtr shouldFreeInfo);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortCreateLocal {
        @Generated
        VoidPtr call_CFMessagePortCreateLocal(VoidPtr arg0, int arg1, VoidPtr arg2, VoidPtr arg3);
    }

    /**
     * CFMessagePortCreateRemote</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortCreateRemote">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMessagePortRef CFMessagePortCreateRemote(CFAllocatorRef allocator, CFStringRef name);

    /**
     * CFMessagePortIsRemote</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortIsRemote">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFMessagePortIsRemote(CFMessagePortRef ms);

    /**
     * CFMessagePortGetName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortGetName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFMessagePortGetName(CFMessagePortRef ms);

    /**
     * CFMessagePortSetName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortSetName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFMessagePortSetName(CFMessagePortRef ms, CFStringRef newName);

    /**
     * CFMessagePortGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFMessagePortGetContext(CFMessagePortRef ms,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMessagePortContext context);

    /**
     * CFMessagePortInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFMessagePortInvalidate(CFMessagePortRef ms);

    /**
     * CFMessagePortIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFMessagePortIsValid(CFMessagePortRef ms);

    /**
     * CFMessagePortSetInvalidationCallBack</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortSetInvalidationCallBack">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFMessagePortSetInvalidationCallBack(CFMessagePortRef ms,
            @FunctionPtr(name = "call_CFMessagePortSetInvalidationCallBack") Function_CFMessagePortSetInvalidationCallBack callout);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortSetInvalidationCallBack {
        @Generated
        void call_CFMessagePortSetInvalidationCallBack(VoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFMessagePortSendRequest</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortSendRequest">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFMessagePortSendRequest(CFMessagePortRef remote, int msgid, CFDataRef data,
            double sendTimeout, double rcvTimeout, CFStringRef replyMode, Ptr<CFDataRef> returnData);

    /**
     * CFMessagePortCreateRunLoopSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortCreateRunLoopSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFMessagePortCreateRunLoopSource(CFAllocatorRef allocator,
            CFMessagePortRef local, @NInt long order);

    /**
     * CFMessagePortSetDispatchQueue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortSetDispatchQueue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFMessagePortSetDispatchQueue(CFMessagePortRef ms, NSObject queue);

    /**
     * CFPlugInGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFPlugInGetTypeID();

    /**
     * CFPlugInCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFPlugInRef CFPlugInCreate(CFAllocatorRef allocator, CFURLRef plugInURL);

    /**
     * CFPlugInGetBundle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInGetBundle">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFBundleRef CFPlugInGetBundle(CFPlugInRef plugIn);

    /**
     * CFPlugInSetLoadOnDemand</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInSetLoadOnDemand">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFPlugInSetLoadOnDemand(CFPlugInRef plugIn, byte flag);

    /**
     * CFPlugInIsLoadOnDemand</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInIsLoadOnDemand">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPlugInIsLoadOnDemand(CFPlugInRef plugIn);

    /**
     * CFPlugInFindFactoriesForPlugInType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInFindFactoriesForPlugInType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFPlugInFindFactoriesForPlugInType(CFUUIDRef typeUUID);

    /**
     * CFPlugInFindFactoriesForPlugInTypeInPlugIn</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInFindFactoriesForPlugInTypeInPlugIn">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CFPlugInFindFactoriesForPlugInTypeInPlugIn(CFUUIDRef typeUUID, CFPlugInRef plugIn);

    /**
     * CFPlugInInstanceCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInInstanceCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr CFPlugInInstanceCreate(CFAllocatorRef allocator, CFUUIDRef factoryUUID,
            CFUUIDRef typeUUID);

    /**
     * CFPlugInRegisterFactoryFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInRegisterFactoryFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPlugInRegisterFactoryFunction(CFUUIDRef factoryUUID,
            @FunctionPtr(name = "call_CFPlugInRegisterFactoryFunction") Function_CFPlugInRegisterFactoryFunction func);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFPlugInRegisterFactoryFunction {
        @Generated
        VoidPtr call_CFPlugInRegisterFactoryFunction(VoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFPlugInRegisterFactoryFunctionByName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInRegisterFactoryFunctionByName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPlugInRegisterFactoryFunctionByName(CFUUIDRef factoryUUID, CFPlugInRef plugIn,
            CFStringRef functionName);

    /**
     * CFPlugInUnregisterFactory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInUnregisterFactory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPlugInUnregisterFactory(CFUUIDRef factoryUUID);

    /**
     * CFPlugInRegisterPlugInType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInRegisterPlugInType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPlugInRegisterPlugInType(CFUUIDRef factoryUUID, CFUUIDRef typeUUID);

    /**
     * CFPlugInUnregisterPlugInType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInUnregisterPlugInType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPlugInUnregisterPlugInType(CFUUIDRef factoryUUID, CFUUIDRef typeUUID);

    /**
     * CFPlugInAddInstanceForFactory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInAddInstanceForFactory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFPlugInAddInstanceForFactory(CFUUIDRef factoryID);

    /**
     * CFPlugInRemoveInstanceForFactory</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInRef/index.html#//apple_ref/c/func/CFPlugInRemoveInstanceForFactory">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFPlugInRemoveInstanceForFactory(CFUUIDRef factoryID);

    /**
     * CFPlugInInstanceGetInterfaceFunctionTable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInInstanceRef/index.html#//apple_ref/c/func/CFPlugInInstanceGetInterfaceFunctionTable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFPlugInInstanceGetInterfaceFunctionTable(CFPlugInInstanceRef instance,
            CFStringRef interfaceName, Ptr<VoidPtr> ftbl);

    /**
     * CFPlugInInstanceGetFactoryName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInInstanceRef/index.html#//apple_ref/c/func/CFPlugInInstanceGetFactoryName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFPlugInInstanceGetFactoryName(CFPlugInInstanceRef instance);

    /**
     * CFPlugInInstanceGetInstanceData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInInstanceRef/index.html#//apple_ref/c/func/CFPlugInInstanceGetInstanceData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr CFPlugInInstanceGetInstanceData(CFPlugInInstanceRef instance);

    /**
     * CFPlugInInstanceGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInInstanceRef/index.html#//apple_ref/c/func/CFPlugInInstanceGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFPlugInInstanceGetTypeID();

    /**
     * CFPlugInInstanceCreateWithInstanceDataSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFPlugInInstanceRef/index.html#//apple_ref/c/func/CFPlugInInstanceCreateWithInstanceDataSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFPlugInInstanceRef CFPlugInInstanceCreateWithInstanceDataSize(CFAllocatorRef allocator,
            @NInt long instanceDataSize,
            @FunctionPtr(name = "call_CFPlugInInstanceCreateWithInstanceDataSize_2") Function_CFPlugInInstanceCreateWithInstanceDataSize_2 deallocateInstanceFunction,
            CFStringRef factoryName,
            @FunctionPtr(name = "call_CFPlugInInstanceCreateWithInstanceDataSize_4") Function_CFPlugInInstanceCreateWithInstanceDataSize_4 getInterfaceFunction);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFPlugInInstanceCreateWithInstanceDataSize_2 {
        @Generated
        void call_CFPlugInInstanceCreateWithInstanceDataSize_2(VoidPtr arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFPlugInInstanceCreateWithInstanceDataSize_4 {
        @Generated
        byte call_CFPlugInInstanceCreateWithInstanceDataSize_4(VoidPtr arg0, VoidPtr arg1,
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg2);
    }

    /**
     * CFAttributedStringGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFAttributedStringGetTypeID();

    /**
     * CFAttributedStringCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreate(CFAllocatorRef alloc, CFStringRef str,
            CFDictionaryRef attributes);

    /**
     * CFAttributedStringCreateWithSubstring</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringCreateWithSubstring">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreateWithSubstring(CFAllocatorRef alloc,
            CFAttributedStringRef aStr, @ByValue CFRange range);

    /**
     * CFAttributedStringCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreateCopy(CFAllocatorRef alloc,
            CFAttributedStringRef aStr);

    /**
     * CFAttributedStringGetString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringGetString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFAttributedStringGetString(CFAttributedStringRef aStr);

    /**
     * CFAttributedStringGetLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringGetLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFAttributedStringGetLength(CFAttributedStringRef aStr);

    /**
     * CFAttributedStringGetAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringGetAttributes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFAttributedStringGetAttributes(CFAttributedStringRef aStr, @NInt long loc,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange effectiveRange);

    /**
     * CFAttributedStringGetAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringGetAttribute">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFAttributedStringGetAttribute(CFAttributedStringRef aStr, @NInt long loc,
            CFStringRef attrName,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange effectiveRange);

    /**
     * CFAttributedStringGetAttributesAndLongestEffectiveRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringGetAttributesAndLongestEffectiveRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CFAttributedStringGetAttributesAndLongestEffectiveRange(
            CFAttributedStringRef aStr, @NInt long loc, @ByValue CFRange inRange,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange longestEffectiveRange);

    /**
     * CFAttributedStringGetAttributeAndLongestEffectiveRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFAttributedString/index.html#//apple_ref/c/func/CFAttributedStringGetAttributeAndLongestEffectiveRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFAttributedStringGetAttributeAndLongestEffectiveRange(CFAttributedStringRef aStr,
            @NInt long loc, CFStringRef attrName, @ByValue CFRange inRange,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange longestEffectiveRange);

    /**
     * CFAttributedStringCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableAttributedStringRef CFAttributedStringCreateMutableCopy(CFAllocatorRef alloc,
            @NInt long maxLength, CFAttributedStringRef aStr);

    /**
     * CFAttributedStringCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableAttributedStringRef CFAttributedStringCreateMutable(CFAllocatorRef alloc,
            @NInt long maxLength);

    /**
     * CFAttributedStringReplaceString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringReplaceString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringReplaceString(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFStringRef replacement);

    /**
     * CFAttributedStringGetMutableString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringGetMutableString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMutableStringRef CFAttributedStringGetMutableString(CFMutableAttributedStringRef aStr);

    /**
     * CFAttributedStringSetAttributes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringSetAttributes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringSetAttributes(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFDictionaryRef replacement, byte clearOtherAttributes);

    /**
     * CFAttributedStringSetAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringSetAttribute">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringSetAttribute(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFStringRef attrName, ConstVoidPtr value);

    /**
     * CFAttributedStringRemoveAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringRemoveAttribute">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringRemoveAttribute(CFMutableAttributedStringRef aStr,
            @ByValue CFRange range, CFStringRef attrName);

    /**
     * CFAttributedStringReplaceAttributedString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringReplaceAttributedString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringReplaceAttributedString(CFMutableAttributedStringRef aStr,
            @ByValue CFRange range, CFAttributedStringRef replacement);

    /**
     * CFAttributedStringBeginEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringBeginEditing">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringBeginEditing(CFMutableAttributedStringRef aStr);

    /**
     * CFAttributedStringEndEditing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMutableAttributedString/index.html#//apple_ref/c/func/CFAttributedStringEndEditing">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFAttributedStringEndEditing(CFMutableAttributedStringRef aStr);

    /**
     * CFNotificationCenterGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNotificationCenterRef/index.html#//apple_ref/c/func/CFNotificationCenterGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFNotificationCenterGetTypeID();

    /**
     * CFNotificationCenterGetLocalCenter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNotificationCenterRef/index.html#//apple_ref/c/func/CFNotificationCenterGetLocalCenter">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFNotificationCenterRef CFNotificationCenterGetLocalCenter();

    /**
     * CFNotificationCenterGetDarwinNotifyCenter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNotificationCenterRef/index.html#//apple_ref/c/func/CFNotificationCenterGetDarwinNotifyCenter">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFNotificationCenterRef CFNotificationCenterGetDarwinNotifyCenter();

    /**
     * CFNotificationCenterAddObserver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNotificationCenterRef/index.html#//apple_ref/c/func/CFNotificationCenterAddObserver">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFNotificationCenterAddObserver(CFNotificationCenterRef center, ConstVoidPtr observer,
            @FunctionPtr(name = "call_CFNotificationCenterAddObserver") Function_CFNotificationCenterAddObserver callBack,
            CFStringRef name, ConstVoidPtr object, @NInt long suspensionBehavior);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNotificationCenterAddObserver {
        @Generated
        void call_CFNotificationCenterAddObserver(VoidPtr arg0, VoidPtr arg1, VoidPtr arg2, ConstVoidPtr arg3,
                VoidPtr arg4);
    }

    /**
     * CFNotificationCenterRemoveObserver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNotificationCenterRef/index.html#//apple_ref/c/func/CFNotificationCenterRemoveObserver">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFNotificationCenterRemoveObserver(CFNotificationCenterRef center, ConstVoidPtr observer,
            CFStringRef name, ConstVoidPtr object);

    /**
     * CFNotificationCenterRemoveEveryObserver</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNotificationCenterRef/index.html#//apple_ref/c/func/CFNotificationCenterRemoveEveryObserver">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFNotificationCenterRemoveEveryObserver(CFNotificationCenterRef center,
            ConstVoidPtr observer);

    /**
     * CFNotificationCenterPostNotification</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNotificationCenterRef/index.html#//apple_ref/c/func/CFNotificationCenterPostNotification">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFNotificationCenterPostNotification(CFNotificationCenterRef center, CFStringRef name,
            ConstVoidPtr object, CFDictionaryRef userInfo, byte deliverImmediately);

    /**
     * CFNotificationCenterPostNotificationWithOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFNotificationCenterRef/index.html#//apple_ref/c/func/CFNotificationCenterPostNotificationWithOptions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFNotificationCenterPostNotificationWithOptions(CFNotificationCenterRef center,
            CFStringRef name, ConstVoidPtr object, CFDictionaryRef userInfo, @NUInt long options);

    @Generated
    @CFunction
    @NUInt
    public static native long CFURLEnumeratorGetTypeID();

    @Generated
    @CFunction
    public static native CFURLEnumeratorRef CFURLEnumeratorCreateForDirectoryURL(CFAllocatorRef alloc,
            CFURLRef directoryURL, @NUInt long option, CFArrayRef propertyKeys);

    @Generated
    @CFunction
    public static native CFURLEnumeratorRef CFURLEnumeratorCreateForMountedVolumes(CFAllocatorRef alloc,
            @NUInt long option, CFArrayRef propertyKeys);

    @Generated
    @CFunction
    @NInt
    public static native long CFURLEnumeratorGetNextURL(CFURLEnumeratorRef enumerator, Ptr<CFURLRef> url,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native void CFURLEnumeratorSkipDescendents(CFURLEnumeratorRef enumerator);

    @Generated
    @CFunction
    @NInt
    public static native long CFURLEnumeratorGetDescendentLevel(CFURLEnumeratorRef enumerator);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLEnumeratorGetSourceDidChange(CFURLEnumeratorRef enumerator);

    /**
     * CFFileSecurityGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFFileSecurityGetTypeID();

    /**
     * CFFileSecurityCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFFileSecurityRef CFFileSecurityCreate(CFAllocatorRef allocator);

    /**
     * CFFileSecurityCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFFileSecurityRef CFFileSecurityCreateCopy(CFAllocatorRef allocator,
            CFFileSecurityRef fileSec);

    /**
     * CFFileSecurityCopyOwnerUUID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityCopyOwnerUUID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyOwnerUUID(CFFileSecurityRef fileSec, Ptr<CFUUIDRef> ownerUUID);

    /**
     * CFFileSecuritySetOwnerUUID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecuritySetOwnerUUID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetOwnerUUID(CFFileSecurityRef fileSec, CFUUIDRef ownerUUID);

    /**
     * CFFileSecurityCopyGroupUUID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityCopyGroupUUID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyGroupUUID(CFFileSecurityRef fileSec, Ptr<CFUUIDRef> groupUUID);

    /**
     * CFFileSecuritySetGroupUUID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecuritySetGroupUUID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetGroupUUID(CFFileSecurityRef fileSec, CFUUIDRef groupUUID);

    /**
     * CFFileSecurityCopyAccessControlList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityCopyAccessControlList">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyAccessControlList(CFFileSecurityRef fileSec,
            Ptr<acl_t> accessControlList);

    /**
     * CFFileSecuritySetAccessControlList</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecuritySetAccessControlList">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetAccessControlList(CFFileSecurityRef fileSec, acl_t accessControlList);

    /**
     * CFFileSecurityGetOwner</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityGetOwner">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityGetOwner(CFFileSecurityRef fileSec, IntPtr owner);

    /**
     * CFFileSecuritySetOwner</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecuritySetOwner">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetOwner(CFFileSecurityRef fileSec, int owner);

    /**
     * CFFileSecurityGetGroup</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityGetGroup">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityGetGroup(CFFileSecurityRef fileSec, IntPtr group);

    /**
     * CFFileSecuritySetGroup</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecuritySetGroup">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetGroup(CFFileSecurityRef fileSec, int group);

    /**
     * CFFileSecurityGetMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityGetMode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityGetMode(CFFileSecurityRef fileSec, CharPtr mode);

    /**
     * CFFileSecuritySetMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecuritySetMode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecuritySetMode(CFFileSecurityRef fileSec, char mode);

    /**
     * CFFileSecurityClearProperties</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileSecurityRef/index.html#//apple_ref/c/func/CFFileSecurityClearProperties">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileSecurityClearProperties(CFFileSecurityRef fileSec, @NUInt long clearPropertyMask);

    /**
     * CFMachPortGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFMachPortGetTypeID();

    /**
     * CFMachPortCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMachPortRef CFMachPortCreate(CFAllocatorRef allocator,
            @FunctionPtr(name = "call_CFMachPortCreate") Function_CFMachPortCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context,
            BytePtr shouldFreeInfo);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortCreate {
        @Generated
        void call_CFMachPortCreate(VoidPtr arg0, VoidPtr arg1, @NInt long arg2, VoidPtr arg3);
    }

    /**
     * CFMachPortCreateWithPort</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortCreateWithPort">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFMachPortRef CFMachPortCreateWithPort(CFAllocatorRef allocator, int portNum,
            @FunctionPtr(name = "call_CFMachPortCreateWithPort") Function_CFMachPortCreateWithPort callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context,
            BytePtr shouldFreeInfo);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortCreateWithPort {
        @Generated
        void call_CFMachPortCreateWithPort(VoidPtr arg0, VoidPtr arg1, @NInt long arg2, VoidPtr arg3);
    }

    /**
     * CFMachPortGetPort</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortGetPort">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFMachPortGetPort(CFMachPortRef port);

    /**
     * CFMachPortGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFMachPortGetContext(CFMachPortRef port,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context);

    /**
     * CFMachPortInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFMachPortInvalidate(CFMachPortRef port);

    /**
     * CFMachPortIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFMachPortIsValid(CFMachPortRef port);

    /**
     * CFMachPortSetInvalidationCallBack</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortSetInvalidationCallBack">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFMachPortSetInvalidationCallBack(CFMachPortRef port,
            @FunctionPtr(name = "call_CFMachPortSetInvalidationCallBack") Function_CFMachPortSetInvalidationCallBack callout);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortSetInvalidationCallBack {
        @Generated
        void call_CFMachPortSetInvalidationCallBack(VoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFMachPortCreateRunLoopSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortCreateRunLoopSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFMachPortCreateRunLoopSource(CFAllocatorRef allocator, CFMachPortRef port,
            @NInt long order);

    /**
     * CFStringTokenizerCopyBestStringLanguage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerCopyBestStringLanguage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CFStringTokenizerCopyBestStringLanguage(CFStringRef string,
            @ByValue CFRange range);

    /**
     * CFStringTokenizerGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerGetTypeID();

    /**
     * CFStringTokenizerCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringTokenizerRef CFStringTokenizerCreate(CFAllocatorRef alloc, CFStringRef string,
            @ByValue CFRange range, @NUInt long options, CFLocaleRef locale);

    /**
     * CFStringTokenizerSetString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerSetString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFStringTokenizerSetString(CFStringTokenizerRef tokenizer, CFStringRef string,
            @ByValue CFRange range);

    /**
     * CFStringTokenizerGoToTokenAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerGoToTokenAtIndex">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerGoToTokenAtIndex(CFStringTokenizerRef tokenizer, @NInt long index);

    /**
     * CFStringTokenizerAdvanceToNextToken</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerAdvanceToNextToken">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerAdvanceToNextToken(CFStringTokenizerRef tokenizer);

    /**
     * CFStringTokenizerGetCurrentTokenRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerGetCurrentTokenRange">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringTokenizerGetCurrentTokenRange(CFStringTokenizerRef tokenizer);

    /**
     * CFStringTokenizerCopyCurrentTokenAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerCopyCurrentTokenAttribute">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstVoidPtr CFStringTokenizerCopyCurrentTokenAttribute(CFStringTokenizerRef tokenizer,
            @NUInt long attribute);

    /**
     * CFStringTokenizerGetCurrentSubTokens</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFStringTokenizerRef/index.html#//apple_ref/c/func/CFStringTokenizerGetCurrentSubTokens">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long CFStringTokenizerGetCurrentSubTokens(CFStringTokenizerRef tokenizer,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange ranges,
            @NInt long maxRangeLength, CFMutableArrayRef derivedSubTokens);

    /**
     * CFFileDescriptorGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CFFileDescriptorGetTypeID();

    /**
     * CFFileDescriptorCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFFileDescriptorRef CFFileDescriptorCreate(CFAllocatorRef allocator, int fd,
            byte closeOnInvalidate,
            @FunctionPtr(name = "call_CFFileDescriptorCreate") Function_CFFileDescriptorCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFFileDescriptorContext context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFFileDescriptorCreate {
        @Generated
        void call_CFFileDescriptorCreate(VoidPtr arg0, @NUInt long arg1, VoidPtr arg2);
    }

    /**
     * CFFileDescriptorGetNativeDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorGetNativeDescriptor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CFFileDescriptorGetNativeDescriptor(CFFileDescriptorRef f);

    /**
     * CFFileDescriptorGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFFileDescriptorGetContext(CFFileDescriptorRef f,
            @UncertainArgument("Options: reference, array Fallback: reference") CFFileDescriptorContext context);

    /**
     * CFFileDescriptorEnableCallBacks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorEnableCallBacks">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFFileDescriptorEnableCallBacks(CFFileDescriptorRef f, @NUInt long callBackTypes);

    /**
     * CFFileDescriptorDisableCallBacks</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorDisableCallBacks">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFFileDescriptorDisableCallBacks(CFFileDescriptorRef f, @NUInt long callBackTypes);

    /**
     * CFFileDescriptorInvalidate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorInvalidate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CFFileDescriptorInvalidate(CFFileDescriptorRef f);

    /**
     * CFFileDescriptorIsValid</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorIsValid">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native byte CFFileDescriptorIsValid(CFFileDescriptorRef f);

    /**
     * CFFileDescriptorCreateRunLoopSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFFileDescriptorRef/index.html#//apple_ref/c/func/CFFileDescriptorCreateRunLoopSource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFFileDescriptorCreateRunLoopSource(CFAllocatorRef allocator,
            CFFileDescriptorRef f, @NInt long order);

    @Generated
    @CVariable()
    public static native double kCFCoreFoundationVersionNumber();

    @Generated
    @CVariable()
    public static native CFNullRef kCFNull();

    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorDefault();

    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorSystemDefault();

    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorMalloc();

    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorMallocZone();

    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorNull();

    @Generated
    @CVariable()
    public static native CFAllocatorRef kCFAllocatorUseContext();

    @Generated
    @CVariable()
    @ByValue
    public static native CFDictionaryKeyCallBacks kCFTypeDictionaryKeyCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native CFDictionaryKeyCallBacks kCFCopyStringDictionaryKeyCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native CFDictionaryValueCallBacks kCFTypeDictionaryValueCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native CFArrayCallBacks kCFTypeArrayCallBacks();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCurrentLocaleDidChangeNotification();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleLanguageCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCountryCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleScriptCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleVariantCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleExemplarCharacterSet();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCalendarIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCollationIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleUsesMetricSystem();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleMeasurementSystem();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleDecimalSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleGroupingSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCurrencySymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCurrencyCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleCollatorIdentifier();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleQuotationBeginDelimiterKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleQuotationEndDelimiterKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleAlternateQuotationBeginDelimiterKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFLocaleAlternateQuotationEndDelimiterKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFGregorianCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBuddhistCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFChineseCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFHebrewCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFIslamicCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFIslamicCivilCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFJapaneseCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFRepublicOfChinaCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPersianCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFIndianCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFISO8601Calendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFIslamicTabularCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFIslamicUmmAlQuraCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformStripCombiningMarks();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformToLatin();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformFullwidthHalfwidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinKatakana();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinHiragana();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformHiraganaKatakana();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformMandarinLatin();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinHangul();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinArabic();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinHebrew();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinThai();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinCyrillic();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformLatinGreek();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformToXMLHex();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformToUnicodeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStringTransformStripDiacritics();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainPOSIX();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainOSStatus();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainMach();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDomainCocoa();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorLocalizedDescriptionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorLocalizedFailureReasonKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorLocalizedRecoverySuggestionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorDescriptionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorUnderlyingErrorKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorURLKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorFilePathKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLKeysOfUnsetValuesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLocalizedNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsRegularFileKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsDirectoryKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsSymbolicLinkKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsVolumeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsPackageKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsSystemImmutableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsUserImmutableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsHiddenKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLHasHiddenExtensionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLCreationDateKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLContentAccessDateKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLContentModificationDateKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLAttributeModificationDateKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLinkCountKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLParentDirectoryURLKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeURLKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLTypeIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLocalizedTypeDescriptionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLabelNumberKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLabelColorKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLLocalizedLabelKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLEffectiveIconKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLCustomIconKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLPreferredIOBlockSizeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsReadableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsWritableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsExecutableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileSecurityKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsExcludedFromBackupKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLPathKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsMountTriggerKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLGenerationIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLDocumentIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLAddedToDirectoryDateKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeNamedPipe();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeCharacterSpecial();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeDirectory();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeBlockSpecial();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeRegular();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeSymbolicLink();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeSocket();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileResourceTypeUnknown();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileSizeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileAllocatedSizeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLTotalFileSizeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLTotalFileAllocatedSizeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsAliasFileKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeLocalizedFormatDescriptionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeTotalCapacityKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeAvailableCapacityKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeResourceCountKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsPersistentIDsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsSymbolicLinksKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsHardLinksKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsJournalingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsJournalingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsSparseFilesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsZeroRunsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsCaseSensitiveNamesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsCasePreservedNamesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsRootDirectoryDatesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsVolumeSizesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsRenamingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsAdvisoryFileLockingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsExtendedSecurityKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsBrowsableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeMaximumFileSizeKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsEjectableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsRemovableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsInternalKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsAutomountedKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsLocalKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsReadOnlyKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeCreationDateKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeURLForRemountingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeUUIDStringKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeLocalizedNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsUbiquitousItemKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemHasUnresolvedConflictsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsDownloadedKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsDownloadingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsUploadedKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemIsUploadingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemPercentDownloadedKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemPercentUploadedKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingStatusKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingErrorKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemUploadingErrorKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingStatusNotDownloaded();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingStatusDownloaded();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLUbiquitousItemDownloadingStatusCurrent();

    @Generated
    @CVariable()
    public static native double kCFAbsoluteTimeIntervalSince1970();

    @Generated
    @CVariable()
    public static native double kCFAbsoluteTimeIntervalSince1904();

    @Generated
    @CVariable()
    @ByValue
    public static native CFBagCallBacks kCFTypeBagCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native CFBagCallBacks kCFCopyStringBagCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native CFBinaryHeapCallBacks kCFStringBinaryHeapCallBacks();

    @Generated
    @CVariable()
    public static native CFStringRef kCFTimeZoneSystemTimeZoneDidChangeNotification();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterIsLenient();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterTimeZone();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterCalendarName();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterDefaultFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterTwoDigitStartDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterDefaultDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterCalendar();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterEraSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterMonthSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortMonthSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterWeekdaySymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortWeekdaySymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterAMSymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterPMSymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterLongEraSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterVeryShortMonthSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterStandaloneMonthSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortStandaloneMonthSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterVeryShortStandaloneMonthSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterVeryShortWeekdaySymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterStandaloneWeekdaySymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortStandaloneWeekdaySymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterVeryShortStandaloneWeekdaySymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterQuarterSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortQuarterSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterStandaloneQuarterSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterShortStandaloneQuarterSymbols();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterGregorianStartDate();

    @Generated
    @CVariable()
    public static native CFStringRef kCFDateFormatterDoesRelativeDateFormattingKey();

    @Generated
    @CVariable()
    public static native CFBooleanRef kCFBooleanTrue();

    @Generated
    @CVariable()
    public static native CFBooleanRef kCFBooleanFalse();

    @Generated
    @CVariable()
    public static native CFNumberRef kCFNumberPositiveInfinity();

    @Generated
    @CVariable()
    public static native CFNumberRef kCFNumberNegativeInfinity();

    @Generated
    @CVariable()
    public static native CFNumberRef kCFNumberNaN();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterCurrencyCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterDecimalSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterCurrencyDecimalSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterAlwaysShowDecimalSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterGroupingSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterUseGroupingSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPercentSymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterZeroSymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterNaNSymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterInfinitySymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMinusSign();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPlusSign();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterCurrencySymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterExponentSymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMinIntegerDigits();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMaxIntegerDigits();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMinFractionDigits();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMaxFractionDigits();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterGroupingSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterSecondaryGroupingSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterRoundingMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterRoundingIncrement();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterFormatWidth();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPaddingPosition();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPaddingCharacter();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterDefaultFormat();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMultiplier();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPositivePrefix();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPositiveSuffix();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterNegativePrefix();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterNegativeSuffix();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterPerMillSymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterInternationalCurrencySymbol();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterCurrencyGroupingSeparator();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterIsLenient();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterUseSignificantDigits();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMinSignificantDigits();

    @Generated
    @CVariable()
    public static native CFStringRef kCFNumberFormatterMaxSignificantDigits();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesAnyApplication();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesCurrentApplication();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesAnyHost();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesCurrentHost();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesAnyUser();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPreferencesCurrentUser();

    @Generated
    @CVariable()
    public static native CFStringRef kCFRunLoopDefaultMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFRunLoopCommonModes();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketCommandKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketResultKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketErrorKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketRegisterCommand();

    @Generated
    @CVariable()
    public static native CFStringRef kCFSocketRetrieveCommand();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyDataWritten();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyAppendToFile();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertyFileCurrentOffset();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketNativeHandle();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketRemoteHostName();

    @Generated
    @CVariable()
    public static native CFStringRef kCFStreamPropertySocketRemotePortNumber();

    @Generated
    @CVariable()
    @ByValue
    public static native CFSetCallBacks kCFTypeSetCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native CFSetCallBacks kCFCopyStringSetCallBacks();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileExists();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileDirectoryContents();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileLength();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileLastModificationTime();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFilePOSIXMode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileOwnerID();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLHTTPStatusCode();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLHTTPStatusLine();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleInfoDictionaryVersionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleExecutableKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleVersionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleDevelopmentRegionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFBundleLocalizationsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInDynamicRegistrationKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInDynamicRegisterFunctionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInUnloadFunctionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInFactoriesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFPlugInTypesKey();

    /**
     * CFMessagePortGetInvalidationCallBack</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMessagePortRef/index.html#//apple_ref/c/func/CFMessagePortGetInvalidationCallBack">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @FunctionPtr(name = "call_CFMessagePortGetInvalidationCallBack_ret")
    public static native Function_CFMessagePortGetInvalidationCallBack_ret CFMessagePortGetInvalidationCallBack(
            CFMessagePortRef ms);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortGetInvalidationCallBack_ret {
        @Generated
        void call_CFMessagePortGetInvalidationCallBack_ret(VoidPtr arg0, VoidPtr arg1);
    }

    /**
     * CFMachPortGetInvalidationCallBack</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreFoundation/Reference/CFMachPortRef/index.html#//apple_ref/c/func/CFMachPortGetInvalidationCallBack">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @FunctionPtr(name = "call_CFMachPortGetInvalidationCallBack_ret")
    public static native Function_CFMachPortGetInvalidationCallBack_ret CFMachPortGetInvalidationCallBack(
            CFMachPortRef port);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortGetInvalidationCallBack_ret {
        @Generated
        void call_CFMachPortGetInvalidationCallBack_ret(VoidPtr arg0, VoidPtr arg1);
    }

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLIsApplicationKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionNone();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionComplete();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionCompleteUnlessOpen();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLFileProtectionCompleteUntilFirstUserAuthentication();

    @Generated @NInt public static final long kCFNotFound = 0xFFFFFFFFFFFFFFFFL;
}
