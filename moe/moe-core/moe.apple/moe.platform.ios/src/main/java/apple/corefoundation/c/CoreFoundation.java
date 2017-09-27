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
    @Generated @NInt public static final long kCFNotFound = 0xFFFFFFFFFFFFFFFFL;

    static {
        NatJ.register();
    }

    @Generated
    private CoreFoundation() {
    }

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFRange CFRangeMake(@NInt long loc, @NInt long len);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange __CFRangeMake(@NInt long loc, @NInt long len);

    @Generated
    @CFunction
    @NUInt
    public static native long CFNullGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CFAllocatorGetTypeID();

    @Generated
    @CFunction
    public static native void CFAllocatorSetDefault(CFAllocatorRef allocator);

    @Generated
    @CFunction
    public static native CFAllocatorRef CFAllocatorGetDefault();

    @Generated
    @CFunction
    public static native CFAllocatorRef CFAllocatorCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFAllocatorContext context);

    @Generated
    @CFunction
    public static native VoidPtr CFAllocatorAllocate(CFAllocatorRef allocator, @NInt long size, @NUInt long hint);

    @Generated
    @CFunction
    public static native VoidPtr CFAllocatorReallocate(CFAllocatorRef allocator, VoidPtr ptr, @NInt long newsize,
            @NUInt long hint);

    @Generated
    @CFunction
    public static native void CFAllocatorDeallocate(CFAllocatorRef allocator, VoidPtr ptr);

    @Generated
    @CFunction
    @NInt
    public static native long CFAllocatorGetPreferredSizeForSize(CFAllocatorRef allocator, @NInt long size,
            @NUInt long hint);

    @Generated
    @CFunction
    public static native void CFAllocatorGetContext(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFAllocatorContext context);

    @Generated
    @CFunction
    @NUInt
    public static native long CFGetTypeID(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native CFStringRef CFCopyTypeIDDescription(@NUInt long type_id);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFRetain(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native void CFRelease(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFAutorelease(ConstVoidPtr arg);

    @Generated
    @CFunction
    @NInt
    public static native long CFGetRetainCount(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native byte CFEqual(ConstVoidPtr cf1, ConstVoidPtr cf2);

    @Generated
    @CFunction
    @NUInt
    public static native long CFHash(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native CFStringRef CFCopyDescription(ConstVoidPtr cf);

    @Generated
    @CFunction
    public static native CFAllocatorRef CFGetAllocator(ConstVoidPtr cf);

    @Generated
    @CFunction
    @NUInt
    public static native long CFDictionaryGetTypeID();

    @Generated
    @CFunction
    public static native CFDictionaryRef CFDictionaryCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> keys,
            Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryKeyCallBacks keyCallBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryValueCallBacks valueCallBacks);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFDictionaryCreateCopy(CFAllocatorRef allocator, CFDictionaryRef theDict);

    @Generated
    @CFunction
    public static native CFMutableDictionaryRef CFDictionaryCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryKeyCallBacks keyCallBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFDictionaryValueCallBacks valueCallBacks);

    @Generated
    @CFunction
    public static native CFMutableDictionaryRef CFDictionaryCreateMutableCopy(CFAllocatorRef allocator,
            @NInt long capacity, CFDictionaryRef theDict);

    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCount(CFDictionaryRef theDict);

    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCountOfKey(CFDictionaryRef theDict, ConstVoidPtr key);

    @Generated
    @CFunction
    @NInt
    public static native long CFDictionaryGetCountOfValue(CFDictionaryRef theDict, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFDictionaryContainsKey(CFDictionaryRef theDict, ConstVoidPtr key);

    @Generated
    @CFunction
    public static native byte CFDictionaryContainsValue(CFDictionaryRef theDict, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFDictionaryGetValue(CFDictionaryRef theDict, ConstVoidPtr key);

    @Generated
    @CFunction
    public static native byte CFDictionaryGetValueIfPresent(CFDictionaryRef theDict, ConstVoidPtr key,
            Ptr<ConstVoidPtr> value);

    @Generated
    @CFunction
    public static native void CFDictionaryGetKeysAndValues(CFDictionaryRef theDict, Ptr<ConstVoidPtr> keys,
            Ptr<ConstVoidPtr> values);

    @Generated
    @CFunction
    public static native void CFDictionaryApplyFunction(CFDictionaryRef theDict,
            @FunctionPtr(name = "call_CFDictionaryApplyFunction") Function_CFDictionaryApplyFunction applier,
            VoidPtr context);

    @Generated
    @CFunction
    public static native void CFDictionaryAddValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFDictionarySetValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFDictionaryReplaceValue(CFMutableDictionaryRef theDict, ConstVoidPtr key,
            ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFDictionaryRemoveValue(CFMutableDictionaryRef theDict, ConstVoidPtr key);

    @Generated
    @CFunction
    public static native void CFDictionaryRemoveAllValues(CFMutableDictionaryRef theDict);

    @Generated
    @CFunction
    @NUInt
    public static native long CFDataGetTypeID();

    @Generated
    @CFunction
    public static native CFDataRef CFDataCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length);

    @Generated
    @CFunction
    public static native CFDataRef CFDataCreateWithBytesNoCopy(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length, CFAllocatorRef bytesDeallocator);

    @Generated
    @CFunction
    public static native CFDataRef CFDataCreateCopy(CFAllocatorRef allocator, CFDataRef theData);

    @Generated
    @CFunction
    public static native CFMutableDataRef CFDataCreateMutable(CFAllocatorRef allocator, @NInt long capacity);

    @Generated
    @CFunction
    public static native CFMutableDataRef CFDataCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFDataRef theData);

    @Generated
    @CFunction
    @NInt
    public static native long CFDataGetLength(CFDataRef theData);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFDataGetBytePtr(CFDataRef theData);

    @Generated
    @CFunction
    public static native BytePtr CFDataGetMutableBytePtr(CFMutableDataRef theData);

    @Generated
    @CFunction
    public static native void CFDataGetBytes(CFDataRef theData, @ByValue CFRange range, BytePtr buffer);

    @Generated
    @CFunction
    public static native void CFDataSetLength(CFMutableDataRef theData, @NInt long length);

    @Generated
    @CFunction
    public static native void CFDataIncreaseLength(CFMutableDataRef theData, @NInt long extraLength);

    @Generated
    @CFunction
    public static native void CFDataAppendBytes(CFMutableDataRef theData,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length);

    @Generated
    @CFunction
    public static native void CFDataReplaceBytes(CFMutableDataRef theData, @ByValue CFRange range,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String newBytes,
            @NInt long newLength);

    @Generated
    @CFunction
    public static native void CFDataDeleteBytes(CFMutableDataRef theData, @ByValue CFRange range);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFDataFind(CFDataRef theData, CFDataRef dataToFind, @ByValue CFRange searchRange,
            @NUInt long compareOptions);

    @Generated
    @CFunction
    @NUInt
    public static native long CFArrayGetTypeID();

    @Generated
    @CFunction
    public static native CFArrayRef CFArrayCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values,
            @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFArrayCallBacks callBacks);

    @Generated
    @CFunction
    public static native CFArrayRef CFArrayCreateCopy(CFAllocatorRef allocator, CFArrayRef theArray);

    @Generated
    @CFunction
    public static native CFMutableArrayRef CFArrayCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFArrayCallBacks callBacks);

    @Generated
    @CFunction
    public static native CFMutableArrayRef CFArrayCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFArrayRef theArray);

    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetCount(CFArrayRef theArray);

    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetCountOfValue(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFArrayContainsValue(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFArrayGetValueAtIndex(CFArrayRef theArray, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFArrayGetValues(CFArrayRef theArray, @ByValue CFRange range, Ptr<ConstVoidPtr> values);

    @Generated
    @CFunction
    public static native void CFArrayApplyFunction(CFArrayRef theArray, @ByValue CFRange range,
            @FunctionPtr(name = "call_CFArrayApplyFunction") Function_CFArrayApplyFunction applier, VoidPtr context);

    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetFirstIndexOfValue(CFArrayRef theArray, @ByValue CFRange range,
            ConstVoidPtr value);

    @Generated
    @CFunction
    @NInt
    public static native long CFArrayGetLastIndexOfValue(CFArrayRef theArray, @ByValue CFRange range,
            ConstVoidPtr value);

    @Generated
    @CFunction
    @NInt
    public static native long CFArrayBSearchValues(CFArrayRef theArray, @ByValue CFRange range, ConstVoidPtr value,
            @FunctionPtr(name = "call_CFArrayBSearchValues") Function_CFArrayBSearchValues comparator, VoidPtr context);

    @Generated
    @CFunction
    public static native void CFArrayAppendValue(CFMutableArrayRef theArray, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFArrayInsertValueAtIndex(CFMutableArrayRef theArray, @NInt long idx, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFArraySetValueAtIndex(CFMutableArrayRef theArray, @NInt long idx, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFArrayRemoveValueAtIndex(CFMutableArrayRef theArray, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFArrayRemoveAllValues(CFMutableArrayRef theArray);

    @Generated
    @CFunction
    public static native void CFArrayReplaceValues(CFMutableArrayRef theArray, @ByValue CFRange range,
            Ptr<ConstVoidPtr> newValues, @NInt long newCount);

    @Generated
    @CFunction
    public static native void CFArrayExchangeValuesAtIndices(CFMutableArrayRef theArray, @NInt long idx1,
            @NInt long idx2);

    @Generated
    @CFunction
    public static native void CFArraySortValues(CFMutableArrayRef theArray, @ByValue CFRange range,
            @FunctionPtr(name = "call_CFArraySortValues") Function_CFArraySortValues comparator, VoidPtr context);

    @Generated
    @CFunction
    public static native void CFArrayAppendArray(CFMutableArrayRef theArray, CFArrayRef otherArray,
            @ByValue CFRange otherRange);

    @Generated
    @CFunction
    @NUInt
    public static native long CFCharacterSetGetTypeID();

    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetGetPredefined(@NInt long theSetIdentifier);

    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithCharactersInRange(CFAllocatorRef alloc,
            @ByValue CFRange theRange);

    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithCharactersInString(CFAllocatorRef alloc,
            CFStringRef theString);

    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateWithBitmapRepresentation(CFAllocatorRef alloc,
            CFDataRef theData);

    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateInvertedSet(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    @Generated
    @CFunction
    public static native byte CFCharacterSetIsSupersetOfSet(CFCharacterSetRef theSet, CFCharacterSetRef theOtherset);

    @Generated
    @CFunction
    public static native byte CFCharacterSetHasMemberInPlane(CFCharacterSetRef theSet, @NInt long thePlane);

    @Generated
    @CFunction
    public static native CFMutableCharacterSetRef CFCharacterSetCreateMutable(CFAllocatorRef alloc);

    @Generated
    @CFunction
    public static native CFCharacterSetRef CFCharacterSetCreateCopy(CFAllocatorRef alloc, CFCharacterSetRef theSet);

    @Generated
    @CFunction
    public static native CFMutableCharacterSetRef CFCharacterSetCreateMutableCopy(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    @Generated
    @CFunction
    public static native byte CFCharacterSetIsCharacterMember(CFCharacterSetRef theSet, char theChar);

    @Generated
    @CFunction
    public static native byte CFCharacterSetIsLongCharacterMember(CFCharacterSetRef theSet, int theChar);

    @Generated
    @CFunction
    public static native CFDataRef CFCharacterSetCreateBitmapRepresentation(CFAllocatorRef alloc,
            CFCharacterSetRef theSet);

    @Generated
    @CFunction
    public static native void CFCharacterSetAddCharactersInRange(CFMutableCharacterSetRef theSet,
            @ByValue CFRange theRange);

    @Generated
    @CFunction
    public static native void CFCharacterSetRemoveCharactersInRange(CFMutableCharacterSetRef theSet,
            @ByValue CFRange theRange);

    @Generated
    @CFunction
    public static native void CFCharacterSetAddCharactersInString(CFMutableCharacterSetRef theSet,
            CFStringRef theString);

    @Generated
    @CFunction
    public static native void CFCharacterSetRemoveCharactersInString(CFMutableCharacterSetRef theSet,
            CFStringRef theString);

    @Generated
    @CFunction
    public static native void CFCharacterSetUnion(CFMutableCharacterSetRef theSet, CFCharacterSetRef theOtherSet);

    @Generated
    @CFunction
    public static native void CFCharacterSetIntersect(CFMutableCharacterSetRef theSet, CFCharacterSetRef theOtherSet);

    @Generated
    @CFunction
    public static native void CFCharacterSetInvert(CFMutableCharacterSetRef theSet);

    @Generated
    @CFunction
    @NUInt
    public static native long CFNotificationCenterGetTypeID();

    @Generated
    @CFunction
    public static native CFNotificationCenterRef CFNotificationCenterGetLocalCenter();

    @Generated
    @CFunction
    public static native CFNotificationCenterRef CFNotificationCenterGetDarwinNotifyCenter();

    @Generated
    @CFunction
    public static native void CFNotificationCenterAddObserver(CFNotificationCenterRef center, ConstVoidPtr observer,
            @FunctionPtr(name = "call_CFNotificationCenterAddObserver") Function_CFNotificationCenterAddObserver callBack,
            CFStringRef name, ConstVoidPtr object, @NInt long suspensionBehavior);

    @Generated
    @CFunction
    public static native void CFNotificationCenterRemoveObserver(CFNotificationCenterRef center, ConstVoidPtr observer,
            CFStringRef name, ConstVoidPtr object);

    @Generated
    @CFunction
    public static native void CFNotificationCenterRemoveEveryObserver(CFNotificationCenterRef center,
            ConstVoidPtr observer);

    @Generated
    @CFunction
    public static native void CFNotificationCenterPostNotification(CFNotificationCenterRef center, CFStringRef name,
            ConstVoidPtr object, CFDictionaryRef userInfo, byte deliverImmediately);

    @Generated
    @CFunction
    public static native void CFNotificationCenterPostNotificationWithOptions(CFNotificationCenterRef center,
            CFStringRef name, ConstVoidPtr object, CFDictionaryRef userInfo, @NUInt long options);

    @Generated
    @CFunction
    @NUInt
    public static native long CFLocaleGetTypeID();

    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleGetSystem();

    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCopyCurrent();

    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyAvailableLocaleIdentifiers();

    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOLanguageCodes();

    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOCountryCodes();

    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyISOCurrencyCodes();

    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyCommonISOCurrencyCodes();

    @Generated
    @CFunction
    public static native CFArrayRef CFLocaleCopyPreferredLanguages();

    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLanguageIdentifierFromString(CFAllocatorRef allocator,
            CFStringRef localeIdentifier);

    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLocaleIdentifierFromString(CFAllocatorRef allocator,
            CFStringRef localeIdentifier);

    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes(
            CFAllocatorRef allocator, short lcode, short rcode);

    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode(CFAllocatorRef allocator,
            int lcid);

    @Generated
    @CFunction
    public static native int CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier(CFStringRef localeIdentifier);

    @Generated
    @CFunction
    @NInt
    public static native long CFLocaleGetLanguageCharacterDirection(CFStringRef isoLangCode);

    @Generated
    @CFunction
    @NInt
    public static native long CFLocaleGetLanguageLineDirection(CFStringRef isoLangCode);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFLocaleCreateComponentsFromLocaleIdentifier(CFAllocatorRef allocator,
            CFStringRef localeID);

    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCreateLocaleIdentifierFromComponents(CFAllocatorRef allocator,
            CFDictionaryRef dictionary);

    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCreate(CFAllocatorRef allocator, CFStringRef localeIdentifier);

    @Generated
    @CFunction
    public static native CFLocaleRef CFLocaleCreateCopy(CFAllocatorRef allocator, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native CFStringRef CFLocaleGetIdentifier(CFLocaleRef locale);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFLocaleGetValue(CFLocaleRef locale, CFStringRef key);

    @Generated
    @CFunction
    public static native CFStringRef CFLocaleCopyDisplayNameForPropertyValue(CFLocaleRef displayLocale, CFStringRef key,
            CFStringRef value);

    @Generated
    @CFunction
    @NUInt
    public static native long CFStringGetTypeID();

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithPascalString(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCString(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithBytes(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBytes, int encoding, byte isExternalRepresentation);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCharacters(CFAllocatorRef alloc, ConstCharPtr chars,
            @NInt long numChars);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithPascalStringNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding, CFAllocatorRef contentsDeallocator);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCStringNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding, CFAllocatorRef contentsDeallocator);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithBytesNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBytes, int encoding, byte isExternalRepresentation, CFAllocatorRef contentsDeallocator);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithCharactersNoCopy(CFAllocatorRef alloc, ConstCharPtr chars,
            @NInt long numChars, CFAllocatorRef contentsDeallocator);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithSubstring(CFAllocatorRef alloc, CFStringRef str,
            @ByValue CFRange range);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateCopy(CFAllocatorRef alloc, CFStringRef theString);

    @Generated
    @Variadic()
    @CFunction
    public static native CFStringRef CFStringCreateWithFormat(CFAllocatorRef alloc, CFDictionaryRef formatOptions,
            CFStringRef format, Object... varargs);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithFormatAndArguments(CFAllocatorRef alloc,
            CFDictionaryRef formatOptions, CFStringRef format, BytePtr arguments);

    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutable(CFAllocatorRef alloc, @NInt long maxLength);

    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutableCopy(CFAllocatorRef alloc, @NInt long maxLength,
            CFStringRef theString);

    @Generated
    @CFunction
    public static native CFMutableStringRef CFStringCreateMutableWithExternalCharactersNoCopy(CFAllocatorRef alloc,
            CharPtr chars, @NInt long numChars, @NInt long capacity, CFAllocatorRef externalCharactersAllocator);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetLength(CFStringRef theString);

    @Generated
    @CFunction
    public static native char CFStringGetCharacterAtIndex(CFStringRef theString, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFStringGetCharacters(CFStringRef theString, @ByValue CFRange range, CharPtr buffer);

    @Generated
    @CFunction
    public static native byte CFStringGetPascalString(CFStringRef theString, BytePtr buffer, @NInt long bufferSize,
            int encoding);

    @Generated
    @CFunction
    public static native byte CFStringGetCString(CFStringRef theString, BytePtr buffer, @NInt long bufferSize,
            int encoding);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFStringGetPascalStringPtr(CFStringRef theString, int encoding);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFStringGetCStringPtr(CFStringRef theString, int encoding);

    @Generated
    @CFunction
    public static native ConstCharPtr CFStringGetCharactersPtr(CFStringRef theString);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetBytes(CFStringRef theString, @ByValue CFRange range, int encoding,
            byte lossByte, byte isExternalRepresentation, BytePtr buffer, @NInt long maxBufLen, NIntPtr usedBufLen);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateFromExternalRepresentation(CFAllocatorRef alloc, CFDataRef data,
            int encoding);

    @Generated
    @CFunction
    public static native CFDataRef CFStringCreateExternalRepresentation(CFAllocatorRef alloc, CFStringRef theString,
            int encoding, byte lossByte);

    @Generated
    @CFunction
    public static native int CFStringGetSmallestEncoding(CFStringRef theString);

    @Generated
    @CFunction
    public static native int CFStringGetFastestEncoding(CFStringRef theString);

    @Generated
    @CFunction
    public static native int CFStringGetSystemEncoding();

    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetMaximumSizeForEncoding(@NInt long length, int encoding);

    @Generated
    @CFunction
    public static native byte CFStringGetFileSystemRepresentation(CFStringRef string, BytePtr buffer,
            @NInt long maxBufLen);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetMaximumSizeOfFileSystemRepresentation(CFStringRef string);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateWithFileSystemRepresentation(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompareWithOptionsAndLocale(CFStringRef theString1, CFStringRef theString2,
            @ByValue CFRange rangeToCompare, @NUInt long compareOptions, CFLocaleRef locale);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompareWithOptions(CFStringRef theString1, CFStringRef theString2,
            @ByValue CFRange rangeToCompare, @NUInt long compareOptions);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringCompare(CFStringRef theString1, CFStringRef theString2,
            @NUInt long compareOptions);

    @Generated
    @CFunction
    public static native byte CFStringFindWithOptionsAndLocale(CFStringRef theString, CFStringRef stringToFind,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions, CFLocaleRef locale,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    @Generated
    @CFunction
    public static native byte CFStringFindWithOptions(CFStringRef theString, CFStringRef stringToFind,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    @Generated
    @CFunction
    public static native CFArrayRef CFStringCreateArrayWithFindResults(CFAllocatorRef alloc, CFStringRef theString,
            CFStringRef stringToFind, @ByValue CFRange rangeToSearch, @NUInt long compareOptions);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringFind(CFStringRef theString, CFStringRef stringToFind,
            @NUInt long compareOptions);

    @Generated
    @CFunction
    public static native byte CFStringHasPrefix(CFStringRef theString, CFStringRef prefix);

    @Generated
    @CFunction
    public static native byte CFStringHasSuffix(CFStringRef theString, CFStringRef suffix);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringGetRangeOfComposedCharactersAtIndex(CFStringRef theString,
            @NInt long theIndex);

    @Generated
    @CFunction
    public static native byte CFStringFindCharacterFromSet(CFStringRef theString, CFCharacterSetRef theSet,
            @ByValue CFRange rangeToSearch, @NUInt long searchOptions,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange result);

    @Generated
    @CFunction
    public static native void CFStringGetLineBounds(CFStringRef theString, @ByValue CFRange range,
            NIntPtr lineBeginIndex, NIntPtr lineEndIndex, NIntPtr contentsEndIndex);

    @Generated
    @CFunction
    public static native void CFStringGetParagraphBounds(CFStringRef string, @ByValue CFRange range,
            NIntPtr parBeginIndex, NIntPtr parEndIndex, NIntPtr contentsEndIndex);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringGetHyphenationLocationBeforeIndex(CFStringRef string, @NInt long location,
            @ByValue CFRange limitRange, @NUInt long options, CFLocaleRef locale, IntPtr character);

    @Generated
    @CFunction
    public static native byte CFStringIsHyphenationAvailableForLocale(CFLocaleRef locale);

    @Generated
    @CFunction
    public static native CFStringRef CFStringCreateByCombiningStrings(CFAllocatorRef alloc, CFArrayRef theArray,
            CFStringRef separatorString);

    @Generated
    @CFunction
    public static native CFArrayRef CFStringCreateArrayBySeparatingStrings(CFAllocatorRef alloc, CFStringRef theString,
            CFStringRef separatorString);

    @Generated
    @CFunction
    public static native int CFStringGetIntValue(CFStringRef str);

    @Generated
    @CFunction
    public static native double CFStringGetDoubleValue(CFStringRef str);

    @Generated
    @CFunction
    public static native void CFStringAppend(CFMutableStringRef theString, CFStringRef appendedString);

    @Generated
    @CFunction
    public static native void CFStringAppendCharacters(CFMutableStringRef theString, ConstCharPtr chars,
            @NInt long numChars);

    @Generated
    @CFunction
    public static native void CFStringAppendPascalString(CFMutableStringRef theString,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String pStr,
            int encoding);

    @Generated
    @CFunction
    public static native void CFStringAppendCString(CFMutableStringRef theString,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr,
            int encoding);

    @Generated
    @Variadic()
    @CFunction
    public static native void CFStringAppendFormat(CFMutableStringRef theString, CFDictionaryRef formatOptions,
            CFStringRef format, Object... varargs);

    @Generated
    @CFunction
    public static native void CFStringAppendFormatAndArguments(CFMutableStringRef theString,
            CFDictionaryRef formatOptions, CFStringRef format, BytePtr arguments);

    @Generated
    @CFunction
    public static native void CFStringInsert(CFMutableStringRef str, @NInt long idx, CFStringRef insertedStr);

    @Generated
    @CFunction
    public static native void CFStringDelete(CFMutableStringRef theString, @ByValue CFRange range);

    @Generated
    @CFunction
    public static native void CFStringReplace(CFMutableStringRef theString, @ByValue CFRange range,
            CFStringRef replacement);

    @Generated
    @CFunction
    public static native void CFStringReplaceAll(CFMutableStringRef theString, CFStringRef replacement);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringFindAndReplace(CFMutableStringRef theString, CFStringRef stringToFind,
            CFStringRef replacementString, @ByValue CFRange rangeToSearch, @NUInt long compareOptions);

    @Generated
    @CFunction
    public static native void CFStringSetExternalCharactersNoCopy(CFMutableStringRef theString, CharPtr chars,
            @NInt long length, @NInt long capacity);

    @Generated
    @CFunction
    public static native void CFStringPad(CFMutableStringRef theString, CFStringRef padString, @NInt long length,
            @NInt long indexIntoPad);

    @Generated
    @CFunction
    public static native void CFStringTrim(CFMutableStringRef theString, CFStringRef trimString);

    @Generated
    @CFunction
    public static native void CFStringTrimWhitespace(CFMutableStringRef theString);

    @Generated
    @CFunction
    public static native void CFStringLowercase(CFMutableStringRef theString, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native void CFStringUppercase(CFMutableStringRef theString, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native void CFStringCapitalize(CFMutableStringRef theString, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native void CFStringNormalize(CFMutableStringRef theString, @NInt long theForm);

    @Generated
    @CFunction
    public static native void CFStringFold(CFMutableStringRef theString, @NUInt long theFlags, CFLocaleRef theLocale);

    @Generated
    @CFunction
    public static native byte CFStringTransform(CFMutableStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange range, CFStringRef transform,
            byte reverse);

    @Generated
    @CFunction
    public static native byte CFStringIsEncodingAvailable(int encoding);

    @Generated
    @CFunction
    public static native ConstIntPtr CFStringGetListOfAvailableEncodings();

    @Generated
    @CFunction
    public static native CFStringRef CFStringGetNameOfEncoding(int encoding);

    @Generated
    @CFunction
    @NUInt
    public static native long CFStringConvertEncodingToNSStringEncoding(int encoding);

    @Generated
    @CFunction
    public static native int CFStringConvertNSStringEncodingToEncoding(@NUInt long encoding);

    @Generated
    @CFunction
    public static native int CFStringConvertEncodingToWindowsCodepage(int encoding);

    @Generated
    @CFunction
    public static native int CFStringConvertWindowsCodepageToEncoding(int codepage);

    @Generated
    @CFunction
    public static native int CFStringConvertIANACharSetNameToEncoding(CFStringRef theString);

    @Generated
    @CFunction
    public static native CFStringRef CFStringConvertEncodingToIANACharSetName(int encoding);

    @Generated
    @CFunction
    public static native int CFStringGetMostCompatibleMacStringEncoding(int encoding);

    @Generated
    @Inline
    @CFunction
    public static native void CFStringInitInlineBuffer(CFStringRef str,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStringInlineBuffer buf,
            @ByValue CFRange range);

    @Generated
    @Inline
    @CFunction
    public static native char CFStringGetCharacterFromInlineBuffer(
            @UncertainArgument("Options: reference, array Fallback: reference") CFStringInlineBuffer buf,
            @NInt long idx);

    @Generated
    @Inline
    @CFunction
    public static native byte CFStringIsSurrogateHighCharacter(char character);

    @Generated
    @Inline
    @CFunction
    public static native byte CFStringIsSurrogateLowCharacter(char character);

    @Generated
    @Inline
    @CFunction
    public static native int CFStringGetLongCharacterForSurrogatePair(char surrogateHigh, char surrogateLow);

    @Generated
    @Inline
    @CFunction
    public static native byte CFStringGetSurrogatePairForLongCharacter(int character, CharPtr surrogates);

    @Generated
    @CFunction
    public static native void CFShow(ConstVoidPtr obj);

    @Generated
    @CFunction
    public static native void CFShowStr(CFStringRef str);

    @Generated
    @CFunction
    public static native CFStringRef __CFStringMakeConstantString(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String cStr);

    @Generated
    @CFunction
    @NUInt
    public static native long CFErrorGetTypeID();

    @Generated
    @CFunction
    public static native CFErrorRef CFErrorCreate(CFAllocatorRef allocator, CFStringRef domain, @NInt long code,
            CFDictionaryRef userInfo);

    @Generated
    @CFunction
    public static native CFErrorRef CFErrorCreateWithUserInfoKeysAndValues(CFAllocatorRef allocator, CFStringRef domain,
            @NInt long code, ConstPtr<ConstVoidPtr> userInfoKeys, ConstPtr<ConstVoidPtr> userInfoValues,
            @NInt long numUserInfoValues);

    @Generated
    @CFunction
    public static native CFStringRef CFErrorGetDomain(CFErrorRef err);

    @Generated
    @CFunction
    @NInt
    public static native long CFErrorGetCode(CFErrorRef err);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFErrorCopyUserInfo(CFErrorRef err);

    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyDescription(CFErrorRef err);

    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyFailureReason(CFErrorRef err);

    @Generated
    @CFunction
    public static native CFStringRef CFErrorCopyRecoverySuggestion(CFErrorRef err);

    @Generated
    @CFunction
    @NUInt
    public static native long CFURLGetTypeID();

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithBytes(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String URLBytes,
            @NInt long length, int encoding, CFURLRef baseURL);

    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateData(CFAllocatorRef allocator, CFURLRef url, int encoding,
            byte escapeWhitespace);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithString(CFAllocatorRef allocator, CFStringRef URLString,
            CFURLRef baseURL);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateAbsoluteURLWithBytes(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String relativeURLBytes,
            @NInt long length, int encoding, CFURLRef baseURL, byte useCompatibilityMode);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithFileSystemPath(CFAllocatorRef allocator, CFStringRef filePath,
            @NInt long pathStyle, byte isDirectory);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFromFileSystemRepresentation(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufLen, byte isDirectory);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateWithFileSystemPathRelativeToBase(CFAllocatorRef allocator,
            CFStringRef filePath, @NInt long pathStyle, byte isDirectory, CFURLRef baseURL);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFromFileSystemRepresentationRelativeToBase(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufLen, byte isDirectory, CFURLRef baseURL);

    @Generated
    @CFunction
    public static native byte CFURLGetFileSystemRepresentation(CFURLRef url, byte resolveAgainstBase, BytePtr buffer,
            @NInt long maxBufLen);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCopyAbsoluteURL(CFURLRef relativeURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLGetString(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFURLRef CFURLGetBaseURL(CFURLRef anURL);

    @Generated
    @CFunction
    public static native byte CFURLCanBeDecomposed(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyScheme(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyNetLocation(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPath(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyStrictPath(CFURLRef anURL, BytePtr isAbsolute);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyFileSystemPath(CFURLRef anURL, @NInt long pathStyle);

    @Generated
    @CFunction
    public static native byte CFURLHasDirectoryPath(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyResourceSpecifier(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyHostName(CFURLRef anURL);

    @Generated
    @CFunction
    public static native int CFURLGetPortNumber(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyUserName(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPassword(CFURLRef anURL);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyParameterString(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyQueryString(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyFragment(CFURLRef anURL, CFStringRef charactersToLeaveEscaped);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyLastPathComponent(CFURLRef url);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCopyPathExtension(CFURLRef url);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyAppendingPathComponent(CFAllocatorRef allocator, CFURLRef url,
            CFStringRef pathComponent, byte isDirectory);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyDeletingLastPathComponent(CFAllocatorRef allocator, CFURLRef url);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyAppendingPathExtension(CFAllocatorRef allocator, CFURLRef url,
            CFStringRef extension);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateCopyDeletingPathExtension(CFAllocatorRef allocator, CFURLRef url);

    @Generated
    @CFunction
    @NInt
    public static native long CFURLGetBytes(CFURLRef url, BytePtr buffer, @NInt long bufferLength);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFURLGetByteRangeForComponent(CFURLRef url, @NInt long component,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangeIncludingSeparators);

    @Generated
    @CFunction
    public static native CFStringRef CFURLCreateStringByReplacingPercentEscapes(CFAllocatorRef allocator,
            CFStringRef originalString, CFStringRef charactersToLeaveEscaped);

    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef CFURLCreateStringByReplacingPercentEscapesUsingEncoding(CFAllocatorRef allocator,
            CFStringRef origString, CFStringRef charsToLeaveEscaped, int encoding);

    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef CFURLCreateStringByAddingPercentEscapes(CFAllocatorRef allocator,
            CFStringRef originalString, CFStringRef charactersToLeaveUnescaped,
            CFStringRef legalURLCharactersToBeEscaped, int encoding);

    @Generated
    @CFunction
    public static native byte CFURLIsFileReferenceURL(CFURLRef url);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFileReferenceURL(CFAllocatorRef allocator, CFURLRef url,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateFilePathURL(CFAllocatorRef allocator, CFURLRef url, Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native CFURLRef CFURLCreateFromFSRef(CFAllocatorRef allocator, VoidPtr fsRef);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLGetFSRef(CFURLRef url, VoidPtr fsRef);

    @Generated
    @CFunction
    public static native byte CFURLCopyResourcePropertyForKey(CFURLRef url, CFStringRef key,
            VoidPtr propertyValueTypeRefPtr, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFURLCopyResourcePropertiesForKeys(CFURLRef url, CFArrayRef keys,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native byte CFURLSetResourcePropertyForKey(CFURLRef url, CFStringRef key, ConstVoidPtr propertyValue,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native byte CFURLSetResourcePropertiesForKeys(CFURLRef url, CFDictionaryRef keyedPropertyValues,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native void CFURLClearResourcePropertyCacheForKey(CFURLRef url, CFStringRef key);

    @Generated
    @CFunction
    public static native void CFURLClearResourcePropertyCache(CFURLRef url);

    @Generated
    @CFunction
    public static native void CFURLSetTemporaryResourcePropertyForKey(CFURLRef url, CFStringRef key,
            ConstVoidPtr propertyValue);

    @Generated
    @CFunction
    public static native byte CFURLResourceIsReachable(CFURLRef url, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateBookmarkData(CFAllocatorRef allocator, CFURLRef url, @NUInt long options,
            CFArrayRef resourcePropertiesToInclude, CFURLRef relativeToURL, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFURLRef CFURLCreateByResolvingBookmarkData(CFAllocatorRef allocator, CFDataRef bookmark,
            @NUInt long options, CFURLRef relativeToURL, CFArrayRef resourcePropertiesToInclude, BytePtr isStale,
            Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFURLCreateResourcePropertiesForKeysFromBookmarkData(CFAllocatorRef allocator,
            CFArrayRef resourcePropertiesToReturn, CFDataRef bookmark);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFURLCreateResourcePropertyForKeyFromBookmarkData(CFAllocatorRef allocator,
            CFStringRef resourcePropertyKey, CFDataRef bookmark);

    @Generated
    @CFunction
    public static native CFDataRef CFURLCreateBookmarkDataFromFile(CFAllocatorRef allocator, CFURLRef fileURL,
            Ptr<CFErrorRef> errorRef);

    @Generated
    @CFunction
    public static native byte CFURLWriteBookmarkDataToFile(CFDataRef bookmarkRef, CFURLRef fileURL, @NUInt long options,
            Ptr<CFErrorRef> errorRef);

    @Generated
    @CFunction
    public static native byte CFURLStartAccessingSecurityScopedResource(CFURLRef url);

    @Generated
    @CFunction
    public static native void CFURLStopAccessingSecurityScopedResource(CFURLRef url);

    @Generated
    @CFunction
    public static native double CFAbsoluteTimeGetCurrent();

    @Generated
    @CFunction
    @NUInt
    public static native long CFDateGetTypeID();

    @Generated
    @CFunction
    public static native CFDateRef CFDateCreate(CFAllocatorRef allocator, double at);

    @Generated
    @CFunction
    public static native double CFDateGetAbsoluteTime(CFDateRef theDate);

    @Generated
    @CFunction
    public static native double CFDateGetTimeIntervalSinceDate(CFDateRef theDate, CFDateRef otherDate);

    @Generated
    @CFunction
    @NInt
    public static native long CFDateCompare(CFDateRef theDate, CFDateRef otherDate, VoidPtr context);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CFGregorianDateIsValid(@ByValue CFGregorianDate gdate, @NUInt long unitFlags);

    @Generated
    @Deprecated
    @CFunction
    public static native double CFGregorianDateGetAbsoluteTime(@ByValue CFGregorianDate gdate, CFTimeZoneRef tz);

    @Generated
    @Deprecated
    @CFunction
    @ByValue
    public static native CFGregorianDate CFAbsoluteTimeGetGregorianDate(double at, CFTimeZoneRef tz);

    @Generated
    @Deprecated
    @CFunction
    public static native double CFAbsoluteTimeAddGregorianUnits(double at, CFTimeZoneRef tz,
            @ByValue CFGregorianUnits units);

    @Generated
    @Deprecated
    @CFunction
    @ByValue
    public static native CFGregorianUnits CFAbsoluteTimeGetDifferenceAsGregorianUnits(double at1, double at2,
            CFTimeZoneRef tz, @NUInt long unitFlags);

    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetDayOfWeek(double at, CFTimeZoneRef tz);

    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetDayOfYear(double at, CFTimeZoneRef tz);

    @Generated
    @Deprecated
    @CFunction
    public static native int CFAbsoluteTimeGetWeekOfYear(double at, CFTimeZoneRef tz);

    @Generated
    @CFunction
    @NUInt
    public static native long CFBagGetTypeID();

    @Generated
    @CFunction
    public static native CFBagRef CFBagCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBagCallBacks callBacks);

    @Generated
    @CFunction
    public static native CFBagRef CFBagCreateCopy(CFAllocatorRef allocator, CFBagRef theBag);

    @Generated
    @CFunction
    public static native CFMutableBagRef CFBagCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBagCallBacks callBacks);

    @Generated
    @CFunction
    public static native CFMutableBagRef CFBagCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFBagRef theBag);

    @Generated
    @CFunction
    @NInt
    public static native long CFBagGetCount(CFBagRef theBag);

    @Generated
    @CFunction
    @NInt
    public static native long CFBagGetCountOfValue(CFBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFBagContainsValue(CFBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFBagGetValue(CFBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFBagGetValueIfPresent(CFBagRef theBag, ConstVoidPtr candidate, Ptr<ConstVoidPtr> value);

    @Generated
    @CFunction
    public static native void CFBagGetValues(CFBagRef theBag, Ptr<ConstVoidPtr> values);

    @Generated
    @CFunction
    public static native void CFBagApplyFunction(CFBagRef theBag,
            @FunctionPtr(name = "call_CFBagApplyFunction") Function_CFBagApplyFunction applier, VoidPtr context);

    @Generated
    @CFunction
    public static native void CFBagAddValue(CFMutableBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBagReplaceValue(CFMutableBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBagSetValue(CFMutableBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBagRemoveValue(CFMutableBagRef theBag, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBagRemoveAllValues(CFMutableBagRef theBag);

    @Generated
    @CFunction
    @NUInt
    public static native long CFBinaryHeapGetTypeID();

    @Generated
    @CFunction
    public static native CFBinaryHeapRef CFBinaryHeapCreate(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBinaryHeapCallBacks callBacks,
            @UncertainArgument("Options: reference, array Fallback: reference") CFBinaryHeapCompareContext compareContext);

    @Generated
    @CFunction
    public static native CFBinaryHeapRef CFBinaryHeapCreateCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFBinaryHeapRef heap);

    @Generated
    @CFunction
    @NInt
    public static native long CFBinaryHeapGetCount(CFBinaryHeapRef heap);

    @Generated
    @CFunction
    @NInt
    public static native long CFBinaryHeapGetCountOfValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFBinaryHeapContainsValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFBinaryHeapGetMinimum(CFBinaryHeapRef heap);

    @Generated
    @CFunction
    public static native byte CFBinaryHeapGetMinimumIfPresent(CFBinaryHeapRef heap, Ptr<ConstVoidPtr> value);

    @Generated
    @CFunction
    public static native void CFBinaryHeapGetValues(CFBinaryHeapRef heap, Ptr<ConstVoidPtr> values);

    @Generated
    @CFunction
    public static native void CFBinaryHeapApplyFunction(CFBinaryHeapRef heap,
            @FunctionPtr(name = "call_CFBinaryHeapApplyFunction") Function_CFBinaryHeapApplyFunction applier,
            VoidPtr context);

    @Generated
    @CFunction
    public static native void CFBinaryHeapAddValue(CFBinaryHeapRef heap, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFBinaryHeapRemoveMinimumValue(CFBinaryHeapRef heap);

    @Generated
    @CFunction
    public static native void CFBinaryHeapRemoveAllValues(CFBinaryHeapRef heap);

    @Generated
    @CFunction
    @NUInt
    public static native long CFBitVectorGetTypeID();

    @Generated
    @CFunction
    public static native CFBitVectorRef CFBitVectorCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long numBits);

    @Generated
    @CFunction
    public static native CFBitVectorRef CFBitVectorCreateCopy(CFAllocatorRef allocator, CFBitVectorRef bv);

    @Generated
    @CFunction
    public static native CFMutableBitVectorRef CFBitVectorCreateMutable(CFAllocatorRef allocator, @NInt long capacity);

    @Generated
    @CFunction
    public static native CFMutableBitVectorRef CFBitVectorCreateMutableCopy(CFAllocatorRef allocator,
            @NInt long capacity, CFBitVectorRef bv);

    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetCount(CFBitVectorRef bv);

    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetCountOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    public static native byte CFBitVectorContainsBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    public static native int CFBitVectorGetBitAtIndex(CFBitVectorRef bv, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFBitVectorGetBits(CFBitVectorRef bv, @ByValue CFRange range, BytePtr bytes);

    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetFirstIndexOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    @NInt
    public static native long CFBitVectorGetLastIndexOfBit(CFBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    public static native void CFBitVectorSetCount(CFMutableBitVectorRef bv, @NInt long count);

    @Generated
    @CFunction
    public static native void CFBitVectorFlipBitAtIndex(CFMutableBitVectorRef bv, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFBitVectorFlipBits(CFMutableBitVectorRef bv, @ByValue CFRange range);

    @Generated
    @CFunction
    public static native void CFBitVectorSetBitAtIndex(CFMutableBitVectorRef bv, @NInt long idx, int value);

    @Generated
    @CFunction
    public static native void CFBitVectorSetBits(CFMutableBitVectorRef bv, @ByValue CFRange range, int value);

    @Generated
    @CFunction
    public static native void CFBitVectorSetAllBits(CFMutableBitVectorRef bv, int value);

    @Generated
    @Inline
    @CFunction
    @NInt
    public static native long CFByteOrderGetCurrent();

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64(long arg);

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16BigToHost(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32BigToHost(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64BigToHost(long arg);

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16HostToBig(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32HostToBig(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64HostToBig(long arg);

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16LittleToHost(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32LittleToHost(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64LittleToHost(long arg);

    @Generated
    @Inline
    @CFunction
    public static native char CFSwapInt16HostToLittle(char arg);

    @Generated
    @Inline
    @CFunction
    public static native int CFSwapInt32HostToLittle(int arg);

    @Generated
    @Inline
    @CFunction
    public static native long CFSwapInt64HostToLittle(long arg);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat32 CFConvertFloat32HostToSwapped(float arg);

    @Generated
    @Inline
    @CFunction
    public static native float CFConvertFloat32SwappedToHost(@ByValue CFSwappedFloat32 arg);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat64 CFConvertFloat64HostToSwapped(double arg);

    @Generated
    @Inline
    @CFunction
    public static native double CFConvertFloat64SwappedToHost(@ByValue CFSwappedFloat64 arg);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat32 CFConvertFloatHostToSwapped(float arg);

    @Generated
    @Inline
    @CFunction
    public static native float CFConvertFloatSwappedToHost(@ByValue CFSwappedFloat32 arg);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CFSwappedFloat64 CFConvertDoubleHostToSwapped(double arg);

    @Generated
    @Inline
    @CFunction
    public static native double CFConvertDoubleSwappedToHost(@ByValue CFSwappedFloat64 arg);

    @Generated
    @CFunction
    @NUInt
    public static native long CFTimeZoneGetTypeID();

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCopySystem();

    @Generated
    @CFunction
    public static native void CFTimeZoneResetSystem();

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCopyDefault();

    @Generated
    @CFunction
    public static native void CFTimeZoneSetDefault(CFTimeZoneRef tz);

    @Generated
    @CFunction
    public static native CFArrayRef CFTimeZoneCopyKnownNames();

    @Generated
    @CFunction
    public static native CFDictionaryRef CFTimeZoneCopyAbbreviationDictionary();

    @Generated
    @CFunction
    public static native void CFTimeZoneSetAbbreviationDictionary(CFDictionaryRef dict);

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreate(CFAllocatorRef allocator, CFStringRef name, CFDataRef data);

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreateWithTimeIntervalFromGMT(CFAllocatorRef allocator, double ti);

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFTimeZoneCreateWithName(CFAllocatorRef allocator, CFStringRef name,
            byte tryAbbrev);

    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneGetName(CFTimeZoneRef tz);

    @Generated
    @CFunction
    public static native CFDataRef CFTimeZoneGetData(CFTimeZoneRef tz);

    @Generated
    @CFunction
    public static native double CFTimeZoneGetSecondsFromGMT(CFTimeZoneRef tz, double at);

    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneCopyAbbreviation(CFTimeZoneRef tz, double at);

    @Generated
    @CFunction
    public static native byte CFTimeZoneIsDaylightSavingTime(CFTimeZoneRef tz, double at);

    @Generated
    @CFunction
    public static native double CFTimeZoneGetDaylightSavingTimeOffset(CFTimeZoneRef tz, double at);

    @Generated
    @CFunction
    public static native double CFTimeZoneGetNextDaylightSavingTimeTransition(CFTimeZoneRef tz, double at);

    @Generated
    @CFunction
    public static native CFStringRef CFTimeZoneCopyLocalizedName(CFTimeZoneRef tz, @NInt long style,
            CFLocaleRef locale);

    @Generated
    @CFunction
    @NUInt
    public static native long CFCalendarGetTypeID();

    @Generated
    @CFunction
    public static native CFCalendarRef CFCalendarCopyCurrent();

    @Generated
    @CFunction
    public static native CFCalendarRef CFCalendarCreateWithIdentifier(CFAllocatorRef allocator, CFStringRef identifier);

    @Generated
    @CFunction
    public static native CFStringRef CFCalendarGetIdentifier(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native CFLocaleRef CFCalendarCopyLocale(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native void CFCalendarSetLocale(CFCalendarRef calendar, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native CFTimeZoneRef CFCalendarCopyTimeZone(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native void CFCalendarSetTimeZone(CFCalendarRef calendar, CFTimeZoneRef tz);

    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetFirstWeekday(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native void CFCalendarSetFirstWeekday(CFCalendarRef calendar, @NInt long wkdy);

    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetMinimumDaysInFirstWeek(CFCalendarRef calendar);

    @Generated
    @CFunction
    public static native void CFCalendarSetMinimumDaysInFirstWeek(CFCalendarRef calendar, @NInt long mwd);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetMinimumRangeOfUnit(CFCalendarRef calendar, @NUInt long unit);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetMaximumRangeOfUnit(CFCalendarRef calendar, @NUInt long unit);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFCalendarGetRangeOfUnit(CFCalendarRef calendar, @NUInt long smallerUnit,
            @NUInt long biggerUnit, double at);

    @Generated
    @CFunction
    @NInt
    public static native long CFCalendarGetOrdinalityOfUnit(CFCalendarRef calendar, @NUInt long smallerUnit,
            @NUInt long biggerUnit, double at);

    @Generated
    @CFunction
    public static native byte CFCalendarGetTimeRangeOfUnit(CFCalendarRef calendar, @NUInt long unit, double at,
            DoublePtr startp, DoublePtr tip);

    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarComposeAbsoluteTime(CFCalendarRef calendar, DoublePtr at,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarDecomposeAbsoluteTime(CFCalendarRef calendar, double at,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarAddComponents(CFCalendarRef calendar, DoublePtr at, @NUInt long options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    @Generated
    @Variadic()
    @CFunction
    public static native byte CFCalendarGetComponentDifference(CFCalendarRef calendar, double startingAT,
            double resultAT, @NUInt long options,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String componentDesc,
            Object... varargs);

    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateDateFormatFromTemplate(CFAllocatorRef allocator,
            CFStringRef tmplate, @NUInt long options, CFLocaleRef locale);

    @Generated
    @CFunction
    @NUInt
    public static native long CFDateFormatterGetTypeID();

    @Generated
    @CFunction
    public static native CFDateFormatterRef CFDateFormatterCreateISO8601Formatter(CFAllocatorRef allocator,
            @NUInt long formatOptions);

    @Generated
    @CFunction
    public static native CFDateFormatterRef CFDateFormatterCreate(CFAllocatorRef allocator, CFLocaleRef locale,
            @NInt long dateStyle, @NInt long timeStyle);

    @Generated
    @CFunction
    public static native CFLocaleRef CFDateFormatterGetLocale(CFDateFormatterRef formatter);

    @Generated
    @CFunction
    @NInt
    public static native long CFDateFormatterGetDateStyle(CFDateFormatterRef formatter);

    @Generated
    @CFunction
    @NInt
    public static native long CFDateFormatterGetTimeStyle(CFDateFormatterRef formatter);

    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterGetFormat(CFDateFormatterRef formatter);

    @Generated
    @CFunction
    public static native void CFDateFormatterSetFormat(CFDateFormatterRef formatter, CFStringRef formatString);

    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateStringWithDate(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, CFDateRef date);

    @Generated
    @CFunction
    public static native CFStringRef CFDateFormatterCreateStringWithAbsoluteTime(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, double at);

    @Generated
    @CFunction
    public static native CFDateRef CFDateFormatterCreateDateFromString(CFAllocatorRef allocator,
            CFDateFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep);

    @Generated
    @CFunction
    public static native byte CFDateFormatterGetAbsoluteTimeFromString(CFDateFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, DoublePtr atp);

    @Generated
    @CFunction
    public static native void CFDateFormatterSetProperty(CFDateFormatterRef formatter, CFStringRef key,
            ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFDateFormatterCopyProperty(CFDateFormatterRef formatter, CFStringRef key);

    @Generated
    @CFunction
    @NUInt
    public static native long CFBooleanGetTypeID();

    @Generated
    @CFunction
    public static native byte CFBooleanGetValue(CFBooleanRef boolean_);

    @Generated
    @CFunction
    @NUInt
    public static native long CFNumberGetTypeID();

    @Generated
    @CFunction
    public static native CFNumberRef CFNumberCreate(CFAllocatorRef allocator, @NInt long theType,
            ConstVoidPtr valuePtr);

    @Generated
    @CFunction
    @NInt
    public static native long CFNumberGetType(CFNumberRef number);

    @Generated
    @CFunction
    @NInt
    public static native long CFNumberGetByteSize(CFNumberRef number);

    @Generated
    @CFunction
    public static native byte CFNumberIsFloatType(CFNumberRef number);

    @Generated
    @CFunction
    public static native byte CFNumberGetValue(CFNumberRef number, @NInt long theType, VoidPtr valuePtr);

    @Generated
    @CFunction
    @NInt
    public static native long CFNumberCompare(CFNumberRef number, CFNumberRef otherNumber, VoidPtr context);

    @Generated
    @CFunction
    @NUInt
    public static native long CFNumberFormatterGetTypeID();

    @Generated
    @CFunction
    public static native CFNumberFormatterRef CFNumberFormatterCreate(CFAllocatorRef allocator, CFLocaleRef locale,
            @NInt long style);

    @Generated
    @CFunction
    public static native CFLocaleRef CFNumberFormatterGetLocale(CFNumberFormatterRef formatter);

    @Generated
    @CFunction
    @NInt
    public static native long CFNumberFormatterGetStyle(CFNumberFormatterRef formatter);

    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterGetFormat(CFNumberFormatterRef formatter);

    @Generated
    @CFunction
    public static native void CFNumberFormatterSetFormat(CFNumberFormatterRef formatter, CFStringRef formatString);

    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterCreateStringWithNumber(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, CFNumberRef number);

    @Generated
    @CFunction
    public static native CFStringRef CFNumberFormatterCreateStringWithValue(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, @NInt long numberType, ConstVoidPtr valuePtr);

    @Generated
    @CFunction
    public static native CFNumberRef CFNumberFormatterCreateNumberFromString(CFAllocatorRef allocator,
            CFNumberFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, @NUInt long options);

    @Generated
    @CFunction
    public static native byte CFNumberFormatterGetValueFromString(CFNumberFormatterRef formatter, CFStringRef string,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange rangep, @NInt long numberType,
            VoidPtr valuePtr);

    @Generated
    @CFunction
    public static native void CFNumberFormatterSetProperty(CFNumberFormatterRef formatter, CFStringRef key,
            ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFNumberFormatterCopyProperty(CFNumberFormatterRef formatter, CFStringRef key);

    @Generated
    @CFunction
    public static native byte CFNumberFormatterGetDecimalInfoForCurrencyCode(CFStringRef currencyCode,
            IntPtr defaultFractionDigits, DoublePtr roundingIncrement);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFPreferencesCopyAppValue(CFStringRef key, CFStringRef applicationID);

    @Generated
    @CFunction
    public static native byte CFPreferencesGetAppBooleanValue(CFStringRef key, CFStringRef applicationID,
            BytePtr keyExistsAndHasValidFormat);

    @Generated
    @CFunction
    @NInt
    public static native long CFPreferencesGetAppIntegerValue(CFStringRef key, CFStringRef applicationID,
            BytePtr keyExistsAndHasValidFormat);

    @Generated
    @CFunction
    public static native void CFPreferencesSetAppValue(CFStringRef key, ConstVoidPtr value, CFStringRef applicationID);

    @Generated
    @CFunction
    public static native void CFPreferencesAddSuitePreferencesToApp(CFStringRef applicationID, CFStringRef suiteID);

    @Generated
    @CFunction
    public static native void CFPreferencesRemoveSuitePreferencesFromApp(CFStringRef applicationID,
            CFStringRef suiteID);

    @Generated
    @CFunction
    public static native byte CFPreferencesAppSynchronize(CFStringRef applicationID);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFPreferencesCopyValue(CFStringRef key, CFStringRef applicationID,
            CFStringRef userName, CFStringRef hostName);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFPreferencesCopyMultiple(CFArrayRef keysToFetch, CFStringRef applicationID,
            CFStringRef userName, CFStringRef hostName);

    @Generated
    @CFunction
    public static native void CFPreferencesSetValue(CFStringRef key, ConstVoidPtr value, CFStringRef applicationID,
            CFStringRef userName, CFStringRef hostName);

    @Generated
    @CFunction
    public static native void CFPreferencesSetMultiple(CFDictionaryRef keysToSet, CFArrayRef keysToRemove,
            CFStringRef applicationID, CFStringRef userName, CFStringRef hostName);

    @Generated
    @CFunction
    public static native byte CFPreferencesSynchronize(CFStringRef applicationID, CFStringRef userName,
            CFStringRef hostName);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef CFPreferencesCopyApplicationList(CFStringRef userName, CFStringRef hostName);

    @Generated
    @CFunction
    public static native CFArrayRef CFPreferencesCopyKeyList(CFStringRef applicationID, CFStringRef userName,
            CFStringRef hostName);

    @Generated
    @CFunction
    public static native byte CFPreferencesAppValueIsForced(CFStringRef key, CFStringRef applicationID);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopGetTypeID();

    @Generated
    @CFunction
    public static native CFRunLoopRef CFRunLoopGetCurrent();

    @Generated
    @CFunction
    public static native CFRunLoopRef CFRunLoopGetMain();

    @Generated
    @CFunction
    public static native CFStringRef CFRunLoopCopyCurrentMode(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native CFArrayRef CFRunLoopCopyAllModes(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native void CFRunLoopAddCommonMode(CFRunLoopRef rl, CFStringRef mode);

    @Generated
    @CFunction
    public static native double CFRunLoopGetNextTimerFireDate(CFRunLoopRef rl, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopRun();

    @Generated
    @CFunction
    public static native int CFRunLoopRunInMode(CFStringRef mode, double seconds, byte returnAfterSourceHandled);

    @Generated
    @CFunction
    public static native byte CFRunLoopIsWaiting(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native void CFRunLoopWakeUp(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native void CFRunLoopStop(CFRunLoopRef rl);

    @Generated
    @CFunction
    public static native void CFRunLoopPerformBlock(CFRunLoopRef rl, ConstVoidPtr mode,
            @ObjCBlock(name = "call_CFRunLoopPerformBlock") Block_CFRunLoopPerformBlock block);

    @Generated
    @CFunction
    public static native byte CFRunLoopContainsSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopAddSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopRemoveSource(CFRunLoopRef rl, CFRunLoopSourceRef source, CFStringRef mode);

    @Generated
    @CFunction
    public static native byte CFRunLoopContainsObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer,
            CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopAddObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopRemoveObserver(CFRunLoopRef rl, CFRunLoopObserverRef observer, CFStringRef mode);

    @Generated
    @CFunction
    public static native byte CFRunLoopContainsTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopAddTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    @Generated
    @CFunction
    public static native void CFRunLoopRemoveTimer(CFRunLoopRef rl, CFRunLoopTimerRef timer, CFStringRef mode);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopSourceGetTypeID();

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFRunLoopSourceCreate(CFAllocatorRef allocator, @NInt long order,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopSourceContext context);

    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopSourceGetOrder(CFRunLoopSourceRef source);

    @Generated
    @CFunction
    public static native void CFRunLoopSourceInvalidate(CFRunLoopSourceRef source);

    @Generated
    @CFunction
    public static native byte CFRunLoopSourceIsValid(CFRunLoopSourceRef source);

    @Generated
    @CFunction
    public static native void CFRunLoopSourceGetContext(CFRunLoopSourceRef source,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopSourceContext context);

    @Generated
    @CFunction
    public static native void CFRunLoopSourceSignal(CFRunLoopSourceRef source);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopObserverGetTypeID();

    @Generated
    @CFunction
    public static native CFRunLoopObserverRef CFRunLoopObserverCreate(CFAllocatorRef allocator, @NUInt long activities,
            byte repeats, @NInt long order,
            @FunctionPtr(name = "call_CFRunLoopObserverCreate") Function_CFRunLoopObserverCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopObserverContext context);

    @Generated
    @CFunction
    public static native CFRunLoopObserverRef CFRunLoopObserverCreateWithHandler(CFAllocatorRef allocator,
            @NUInt long activities, byte repeats, @NInt long order,
            @ObjCBlock(name = "call_CFRunLoopObserverCreateWithHandler") Block_CFRunLoopObserverCreateWithHandler block);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopObserverGetActivities(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    public static native byte CFRunLoopObserverDoesRepeat(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopObserverGetOrder(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    public static native void CFRunLoopObserverInvalidate(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    public static native byte CFRunLoopObserverIsValid(CFRunLoopObserverRef observer);

    @Generated
    @CFunction
    public static native void CFRunLoopObserverGetContext(CFRunLoopObserverRef observer,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopObserverContext context);

    @Generated
    @CFunction
    @NUInt
    public static native long CFRunLoopTimerGetTypeID();

    @Generated
    @CFunction
    public static native CFRunLoopTimerRef CFRunLoopTimerCreate(CFAllocatorRef allocator, double fireDate,
            double interval, @NUInt long flags, @NInt long order,
            @FunctionPtr(name = "call_CFRunLoopTimerCreate") Function_CFRunLoopTimerCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRunLoopTimerContext context);

    @Generated
    @CFunction
    public static native CFRunLoopTimerRef CFRunLoopTimerCreateWithHandler(CFAllocatorRef allocator, double fireDate,
            double interval, @NUInt long flags, @NInt long order,
            @ObjCBlock(name = "call_CFRunLoopTimerCreateWithHandler") Block_CFRunLoopTimerCreateWithHandler block);

    @Generated
    @CFunction
    public static native double CFRunLoopTimerGetNextFireDate(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native void CFRunLoopTimerSetNextFireDate(CFRunLoopTimerRef timer, double fireDate);

    @Generated
    @CFunction
    public static native double CFRunLoopTimerGetInterval(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native byte CFRunLoopTimerDoesRepeat(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    @NInt
    public static native long CFRunLoopTimerGetOrder(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native void CFRunLoopTimerInvalidate(CFRunLoopTimerRef timer);

    @Generated
    @CFunction
    public static native byte CFRunLoopTimerIsValid(CFRunLoopTimerRef timer);

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

    @Generated
    @CFunction
    @NUInt
    public static native long CFSocketGetTypeID();

    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreate(CFAllocatorRef allocator, int protocolFamily, int socketType,
            int protocol, @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreate") Function_CFSocketCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateWithNative(CFAllocatorRef allocator, int sock,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateWithNative") Function_CFSocketCreateWithNative callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateWithSocketSignature(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateWithSocketSignature") Function_CFSocketCreateWithSocketSignature callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Generated
    @CFunction
    public static native CFSocketRef CFSocketCreateConnectedToSocketSignature(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            @NUInt long callBackTypes,
            @FunctionPtr(name = "call_CFSocketCreateConnectedToSocketSignature") Function_CFSocketCreateConnectedToSocketSignature callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context,
            double timeout);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketSetAddress(CFSocketRef s, CFDataRef address);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketConnectToAddress(CFSocketRef s, CFDataRef address, double timeout);

    @Generated
    @CFunction
    public static native void CFSocketInvalidate(CFSocketRef s);

    @Generated
    @CFunction
    public static native byte CFSocketIsValid(CFSocketRef s);

    @Generated
    @CFunction
    public static native CFDataRef CFSocketCopyAddress(CFSocketRef s);

    @Generated
    @CFunction
    public static native CFDataRef CFSocketCopyPeerAddress(CFSocketRef s);

    @Generated
    @CFunction
    public static native void CFSocketGetContext(CFSocketRef s,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketContext context);

    @Generated
    @CFunction
    public static native int CFSocketGetNative(CFSocketRef s);

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFSocketCreateRunLoopSource(CFAllocatorRef allocator, CFSocketRef s,
            @NInt long order);

    @Generated
    @CFunction
    @NUInt
    public static native long CFSocketGetSocketFlags(CFSocketRef s);

    @Generated
    @CFunction
    public static native void CFSocketSetSocketFlags(CFSocketRef s, @NUInt long flags);

    @Generated
    @CFunction
    public static native void CFSocketDisableCallBacks(CFSocketRef s, @NUInt long callBackTypes);

    @Generated
    @CFunction
    public static native void CFSocketEnableCallBacks(CFSocketRef s, @NUInt long callBackTypes);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketSendData(CFSocketRef s, CFDataRef address, CFDataRef data, double timeout);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketRegisterValue(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name, ConstVoidPtr value);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketCopyRegisteredValue(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name, Ptr<ConstVoidPtr> value, Ptr<CFDataRef> nameServerAddress);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketRegisterSocketSignature(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketCopyRegisteredSocketSignature(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            Ptr<CFDataRef> nameServerAddress);

    @Generated
    @CFunction
    @NInt
    public static native long CFSocketUnregister(
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature nameServerSignature,
            double timeout, CFStringRef name);

    @Generated
    @CFunction
    public static native void CFSocketSetDefaultNameRegistryPortNumber(char port);

    @Generated
    @CFunction
    public static native char CFSocketGetDefaultNameRegistryPortNumber();

    @Generated
    @CFunction
    @NUInt
    public static native long CFReadStreamGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CFWriteStreamGetTypeID();

    @Generated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateWithBytesNoCopy(CFAllocatorRef alloc,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bytes,
            @NInt long length, CFAllocatorRef bytesDeallocator);

    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithBuffer(CFAllocatorRef alloc, BytePtr buffer,
            @NInt long bufferCapacity);

    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithAllocatedBuffers(CFAllocatorRef alloc,
            CFAllocatorRef bufferAllocator);

    @Generated
    @CFunction
    public static native CFReadStreamRef CFReadStreamCreateWithFile(CFAllocatorRef alloc, CFURLRef fileURL);

    @Generated
    @CFunction
    public static native CFWriteStreamRef CFWriteStreamCreateWithFile(CFAllocatorRef alloc, CFURLRef fileURL);

    @Generated
    @CFunction
    public static native void CFStreamCreateBoundPair(CFAllocatorRef alloc, Ptr<CFReadStreamRef> readStream,
            Ptr<CFWriteStreamRef> writeStream, @NInt long transferBufferSize);

    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocket(CFAllocatorRef alloc, int sock,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithSocketToHost(CFAllocatorRef alloc, CFStringRef host, int port,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    @Generated
    @CFunction
    public static native void CFStreamCreatePairWithPeerSocketSignature(CFAllocatorRef alloc,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSocketSignature signature,
            Ptr<CFReadStreamRef> readStream, Ptr<CFWriteStreamRef> writeStream);

    @Generated
    @CFunction
    @NInt
    public static native long CFReadStreamGetStatus(CFReadStreamRef stream);

    @Generated
    @CFunction
    @NInt
    public static native long CFWriteStreamGetStatus(CFWriteStreamRef stream);

    @Generated
    @CFunction
    public static native CFErrorRef CFReadStreamCopyError(CFReadStreamRef stream);

    @Generated
    @CFunction
    public static native CFErrorRef CFWriteStreamCopyError(CFWriteStreamRef stream);

    @Generated
    @CFunction
    public static native byte CFReadStreamOpen(CFReadStreamRef stream);

    @Generated
    @CFunction
    public static native byte CFWriteStreamOpen(CFWriteStreamRef stream);

    @Generated
    @CFunction
    public static native void CFReadStreamClose(CFReadStreamRef stream);

    @Generated
    @CFunction
    public static native void CFWriteStreamClose(CFWriteStreamRef stream);

    @Generated
    @CFunction
    public static native byte CFReadStreamHasBytesAvailable(CFReadStreamRef stream);

    @Generated
    @CFunction
    @NInt
    public static native long CFReadStreamRead(CFReadStreamRef stream, BytePtr buffer, @NInt long bufferLength);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CFReadStreamGetBuffer(CFReadStreamRef stream, @NInt long maxBytesToRead,
            NIntPtr numBytesRead);

    @Generated
    @CFunction
    public static native byte CFWriteStreamCanAcceptBytes(CFWriteStreamRef stream);

    @Generated
    @CFunction
    @NInt
    public static native long CFWriteStreamWrite(CFWriteStreamRef stream,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
            @NInt long bufferLength);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFReadStreamCopyProperty(CFReadStreamRef stream, CFStringRef propertyName);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFWriteStreamCopyProperty(CFWriteStreamRef stream, CFStringRef propertyName);

    @Generated
    @CFunction
    public static native byte CFReadStreamSetProperty(CFReadStreamRef stream, CFStringRef propertyName,
            ConstVoidPtr propertyValue);

    @Generated
    @CFunction
    public static native byte CFWriteStreamSetProperty(CFWriteStreamRef stream, CFStringRef propertyName,
            ConstVoidPtr propertyValue);

    @Generated
    @CFunction
    public static native byte CFReadStreamSetClient(CFReadStreamRef stream, @NUInt long streamEvents,
            @FunctionPtr(name = "call_CFReadStreamSetClient") Function_CFReadStreamSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    @Generated
    @CFunction
    public static native byte CFWriteStreamSetClient(CFWriteStreamRef stream, @NUInt long streamEvents,
            @FunctionPtr(name = "call_CFWriteStreamSetClient") Function_CFWriteStreamSetClient clientCB,
            @UncertainArgument("Options: reference, array Fallback: reference") CFStreamClientContext clientContext);

    @Generated
    @CFunction
    public static native void CFReadStreamScheduleWithRunLoop(CFReadStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFWriteStreamScheduleWithRunLoop(CFWriteStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

    @Generated
    @CFunction
    public static native void CFReadStreamUnscheduleFromRunLoop(CFReadStreamRef stream, CFRunLoopRef runLoop,
            CFStringRef runLoopMode);

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

    @Generated
    @CFunction
    @ByValue
    public static native CFStreamError CFReadStreamGetError(CFReadStreamRef stream);

    @Generated
    @CFunction
    @ByValue
    public static native CFStreamError CFWriteStreamGetError(CFWriteStreamRef stream);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateFromXMLData(CFAllocatorRef allocator, CFDataRef xmlData,
            @NUInt long mutabilityOption, Ptr<CFStringRef> errorString);

    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef CFPropertyListCreateXMLData(CFAllocatorRef allocator, ConstVoidPtr propertyList);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateDeepCopy(CFAllocatorRef allocator, ConstVoidPtr propertyList,
            @NUInt long mutabilityOption);

    @Generated
    @CFunction
    public static native byte CFPropertyListIsValid(ConstVoidPtr plist, @NInt long format);

    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long CFPropertyListWriteToStream(ConstVoidPtr propertyList, CFWriteStreamRef stream,
            @NInt long format, Ptr<CFStringRef> errorString);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateFromStream(CFAllocatorRef allocator, CFReadStreamRef stream,
            @NInt long streamLength, @NUInt long mutabilityOption, NIntPtr format, Ptr<CFStringRef> errorString);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateWithData(CFAllocatorRef allocator, CFDataRef data,
            @NUInt long options, NIntPtr format, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFPropertyListCreateWithStream(CFAllocatorRef allocator, CFReadStreamRef stream,
            @NInt long streamLength, @NUInt long options, NIntPtr format, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    @NInt
    public static native long CFPropertyListWrite(ConstVoidPtr propertyList, CFWriteStreamRef stream, @NInt long format,
            @NUInt long options, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native CFDataRef CFPropertyListCreateData(CFAllocatorRef allocator, ConstVoidPtr propertyList,
            @NInt long format, @NUInt long options, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    @NUInt
    public static native long CFSetGetTypeID();

    @Generated
    @CFunction
    public static native CFSetRef CFSetCreate(CFAllocatorRef allocator, Ptr<ConstVoidPtr> values, @NInt long numValues,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSetCallBacks callBacks);

    @Generated
    @CFunction
    public static native CFSetRef CFSetCreateCopy(CFAllocatorRef allocator, CFSetRef theSet);

    @Generated
    @CFunction
    public static native CFMutableSetRef CFSetCreateMutable(CFAllocatorRef allocator, @NInt long capacity,
            @UncertainArgument("Options: reference, array Fallback: reference") CFSetCallBacks callBacks);

    @Generated
    @CFunction
    public static native CFMutableSetRef CFSetCreateMutableCopy(CFAllocatorRef allocator, @NInt long capacity,
            CFSetRef theSet);

    @Generated
    @CFunction
    @NInt
    public static native long CFSetGetCount(CFSetRef theSet);

    @Generated
    @CFunction
    @NInt
    public static native long CFSetGetCountOfValue(CFSetRef theSet, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFSetContainsValue(CFSetRef theSet, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFSetGetValue(CFSetRef theSet, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native byte CFSetGetValueIfPresent(CFSetRef theSet, ConstVoidPtr candidate, Ptr<ConstVoidPtr> value);

    @Generated
    @CFunction
    public static native void CFSetGetValues(CFSetRef theSet, Ptr<ConstVoidPtr> values);

    @Generated
    @CFunction
    public static native void CFSetApplyFunction(CFSetRef theSet,
            @FunctionPtr(name = "call_CFSetApplyFunction") Function_CFSetApplyFunction applier, VoidPtr context);

    @Generated
    @CFunction
    public static native void CFSetAddValue(CFMutableSetRef theSet, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFSetReplaceValue(CFMutableSetRef theSet, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFSetSetValue(CFMutableSetRef theSet, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFSetRemoveValue(CFMutableSetRef theSet, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFSetRemoveAllValues(CFMutableSetRef theSet);

    @Generated
    @CFunction
    @NUInt
    public static native long CFTreeGetTypeID();

    @Generated
    @CFunction
    public static native CFTreeRef CFTreeCreate(CFAllocatorRef allocator,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetParent(CFTreeRef tree);

    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetNextSibling(CFTreeRef tree);

    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetFirstChild(CFTreeRef tree);

    @Generated
    @CFunction
    public static native void CFTreeGetContext(CFTreeRef tree,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    @Generated
    @CFunction
    @NInt
    public static native long CFTreeGetChildCount(CFTreeRef tree);

    @Generated
    @CFunction
    public static native CFTreeRef CFTreeGetChildAtIndex(CFTreeRef tree, @NInt long idx);

    @Generated
    @CFunction
    public static native void CFTreeGetChildren(CFTreeRef tree, Ptr<CFTreeRef> children);

    @Generated
    @CFunction
    public static native void CFTreeApplyFunctionToChildren(CFTreeRef tree,
            @FunctionPtr(name = "call_CFTreeApplyFunctionToChildren") Function_CFTreeApplyFunctionToChildren applier,
            VoidPtr context);

    @Generated
    @CFunction
    public static native CFTreeRef CFTreeFindRoot(CFTreeRef tree);

    @Generated
    @CFunction
    public static native void CFTreeSetContext(CFTreeRef tree,
            @UncertainArgument("Options: reference, array Fallback: reference") CFTreeContext context);

    @Generated
    @CFunction
    public static native void CFTreePrependChild(CFTreeRef tree, CFTreeRef newChild);

    @Generated
    @CFunction
    public static native void CFTreeAppendChild(CFTreeRef tree, CFTreeRef newChild);

    @Generated
    @CFunction
    public static native void CFTreeInsertSibling(CFTreeRef tree, CFTreeRef newSibling);

    @Generated
    @CFunction
    public static native void CFTreeRemove(CFTreeRef tree);

    @Generated
    @CFunction
    public static native void CFTreeRemoveAllChildren(CFTreeRef tree);

    @Generated
    @CFunction
    public static native void CFTreeSortChildren(CFTreeRef tree,
            @FunctionPtr(name = "call_CFTreeSortChildren") Function_CFTreeSortChildren comparator, VoidPtr context);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLCreateDataAndPropertiesFromResource(CFAllocatorRef alloc, CFURLRef url,
            Ptr<CFDataRef> resourceData, Ptr<CFDictionaryRef> properties, CFArrayRef desiredProperties,
            IntPtr errorCode);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLWriteDataAndPropertiesToResource(CFURLRef url, CFDataRef dataToWrite,
            CFDictionaryRef propertiesToWrite, IntPtr errorCode);

    @Generated
    @Deprecated
    @CFunction
    public static native byte CFURLDestroyResource(CFURLRef url, IntPtr errorCode);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr CFURLCreatePropertyFromResource(CFAllocatorRef alloc, CFURLRef url,
            CFStringRef property, IntPtr errorCode);

    @Generated
    @CFunction
    @NUInt
    public static native long CFUUIDGetTypeID();

    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreate(CFAllocatorRef alloc);

    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateWithBytes(CFAllocatorRef alloc, byte byte0, byte byte1, byte byte2,
            byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10,
            byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);

    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateFromString(CFAllocatorRef alloc, CFStringRef uuidStr);

    @Generated
    @CFunction
    public static native CFStringRef CFUUIDCreateString(CFAllocatorRef alloc, CFUUIDRef uuid);

    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDGetConstantUUIDWithBytes(CFAllocatorRef alloc, byte byte0, byte byte1,
            byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10,
            byte byte11, byte byte12, byte byte13, byte byte14, byte byte15);

    @Generated
    @CFunction
    @ByValue
    public static native CFUUIDBytes CFUUIDGetUUIDBytes(CFUUIDRef uuid);

    @Generated
    @CFunction
    public static native CFUUIDRef CFUUIDCreateFromUUIDBytes(CFAllocatorRef alloc, @ByValue CFUUIDBytes bytes);

    @Generated
    @CFunction
    public static native CFURLRef CFCopyHomeDirectoryURL();

    @Generated
    @CFunction
    public static native CFBundleRef CFBundleGetMainBundle();

    @Generated
    @CFunction
    public static native CFBundleRef CFBundleGetBundleWithIdentifier(CFStringRef bundleID);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleGetAllBundles();

    @Generated
    @CFunction
    @NUInt
    public static native long CFBundleGetTypeID();

    @Generated
    @CFunction
    public static native CFBundleRef CFBundleCreate(CFAllocatorRef allocator, CFURLRef bundleURL);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCreateBundlesFromDirectory(CFAllocatorRef allocator, CFURLRef directoryURL,
            CFStringRef bundleType);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyBundleURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFBundleGetValueForInfoDictionaryKey(CFBundleRef bundle, CFStringRef key);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleGetInfoDictionary(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleGetLocalInfoDictionary(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native void CFBundleGetPackageInfo(CFBundleRef bundle, IntPtr packageType, IntPtr packageCreator);

    @Generated
    @CFunction
    public static native CFStringRef CFBundleGetIdentifier(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native int CFBundleGetVersionNumber(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFStringRef CFBundleGetDevelopmentRegion(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySupportFilesDirectoryURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourcesDirectoryURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyPrivateFrameworksURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySharedFrameworksURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopySharedSupportURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyBuiltInPlugInsURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleCopyInfoDictionaryInDirectory(CFURLRef bundleURL);

    @Generated
    @CFunction
    public static native byte CFBundleGetPackageInfoInDirectory(CFURLRef url, IntPtr packageType,
            IntPtr packageCreator);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURL(CFBundleRef bundle, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfType(CFBundleRef bundle, CFStringRef resourceType,
            CFStringRef subDirName);

    @Generated
    @CFunction
    public static native CFStringRef CFBundleCopyLocalizedString(CFBundleRef bundle, CFStringRef key, CFStringRef value,
            CFStringRef tableName);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURLInDirectory(CFURLRef bundleURL, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfTypeInDirectory(CFURLRef bundleURL,
            CFStringRef resourceType, CFStringRef subDirName);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyBundleLocalizations(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyPreferredLocalizationsFromArray(CFArrayRef locArray);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyLocalizationsForPreferences(CFArrayRef locArray, CFArrayRef prefArray);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyResourceURLForLocalization(CFBundleRef bundle, CFStringRef resourceName,
            CFStringRef resourceType, CFStringRef subDirName, CFStringRef localizationName);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyResourceURLsOfTypeForLocalization(CFBundleRef bundle,
            CFStringRef resourceType, CFStringRef subDirName, CFStringRef localizationName);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFBundleCopyInfoDictionaryForURL(CFURLRef url);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyLocalizationsForURL(CFURLRef url);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyExecutableArchitecturesForURL(CFURLRef url);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyExecutableURL(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native CFArrayRef CFBundleCopyExecutableArchitectures(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native byte CFBundlePreflightExecutable(CFBundleRef bundle, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native byte CFBundleLoadExecutableAndReturnError(CFBundleRef bundle, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native byte CFBundleLoadExecutable(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native byte CFBundleIsExecutableLoaded(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native void CFBundleUnloadExecutable(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native VoidPtr CFBundleGetFunctionPointerForName(CFBundleRef bundle, CFStringRef functionName);

    @Generated
    @CFunction
    public static native void CFBundleGetFunctionPointersForNames(CFBundleRef bundle, CFArrayRef functionNames,
            Ptr<VoidPtr> ftbl);

    @Generated
    @CFunction
    public static native VoidPtr CFBundleGetDataPointerForName(CFBundleRef bundle, CFStringRef symbolName);

    @Generated
    @CFunction
    public static native void CFBundleGetDataPointersForNames(CFBundleRef bundle, CFArrayRef symbolNames,
            Ptr<VoidPtr> stbl);

    @Generated
    @CFunction
    public static native CFURLRef CFBundleCopyAuxiliaryExecutableURL(CFBundleRef bundle, CFStringRef executableName);

    @Generated
    @CFunction
    public static native CFPlugInRef CFBundleGetPlugIn(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native int CFBundleOpenBundleResourceMap(CFBundleRef bundle);

    @Generated
    @CFunction
    public static native int CFBundleOpenBundleResourceFiles(CFBundleRef bundle, IntPtr refNum, IntPtr localizedRefNum);

    @Generated
    @CFunction
    public static native void CFBundleCloseBundleResourceMap(CFBundleRef bundle, int refNum);

    @Generated
    @CFunction
    @NUInt
    public static native long CFMessagePortGetTypeID();

    @Generated
    @CFunction
    public static native CFMessagePortRef CFMessagePortCreateLocal(CFAllocatorRef allocator, CFStringRef name,
            @FunctionPtr(name = "call_CFMessagePortCreateLocal") Function_CFMessagePortCreateLocal callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMessagePortContext context,
            BytePtr shouldFreeInfo);

    @Generated
    @CFunction
    public static native CFMessagePortRef CFMessagePortCreateRemote(CFAllocatorRef allocator, CFStringRef name);

    @Generated
    @CFunction
    public static native byte CFMessagePortIsRemote(CFMessagePortRef ms);

    @Generated
    @CFunction
    public static native CFStringRef CFMessagePortGetName(CFMessagePortRef ms);

    @Generated
    @CFunction
    public static native byte CFMessagePortSetName(CFMessagePortRef ms, CFStringRef newName);

    @Generated
    @CFunction
    public static native void CFMessagePortGetContext(CFMessagePortRef ms,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMessagePortContext context);

    @Generated
    @CFunction
    public static native void CFMessagePortInvalidate(CFMessagePortRef ms);

    @Generated
    @CFunction
    public static native byte CFMessagePortIsValid(CFMessagePortRef ms);

    @Generated
    @CFunction
    @FunctionPtr(name = "call_CFMessagePortGetInvalidationCallBack_ret")
    public static native Function_CFMessagePortGetInvalidationCallBack_ret CFMessagePortGetInvalidationCallBack(
            CFMessagePortRef ms);

    @Generated
    @CFunction
    public static native void CFMessagePortSetInvalidationCallBack(CFMessagePortRef ms,
            @FunctionPtr(name = "call_CFMessagePortSetInvalidationCallBack") Function_CFMessagePortSetInvalidationCallBack callout);

    @Generated
    @CFunction
    public static native int CFMessagePortSendRequest(CFMessagePortRef remote, int msgid, CFDataRef data,
            double sendTimeout, double rcvTimeout, CFStringRef replyMode, Ptr<CFDataRef> returnData);

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFMessagePortCreateRunLoopSource(CFAllocatorRef allocator,
            CFMessagePortRef local, @NInt long order);

    @Generated
    @CFunction
    public static native void CFMessagePortSetDispatchQueue(CFMessagePortRef ms, NSObject queue);

    @Generated
    @CFunction
    @NUInt
    public static native long CFPlugInGetTypeID();

    @Generated
    @CFunction
    public static native CFPlugInRef CFPlugInCreate(CFAllocatorRef allocator, CFURLRef plugInURL);

    @Generated
    @CFunction
    public static native CFBundleRef CFPlugInGetBundle(CFPlugInRef plugIn);

    @Generated
    @CFunction
    public static native void CFPlugInSetLoadOnDemand(CFPlugInRef plugIn, byte flag);

    @Generated
    @CFunction
    public static native byte CFPlugInIsLoadOnDemand(CFPlugInRef plugIn);

    @Generated
    @CFunction
    public static native CFArrayRef CFPlugInFindFactoriesForPlugInType(CFUUIDRef typeUUID);

    @Generated
    @CFunction
    public static native CFArrayRef CFPlugInFindFactoriesForPlugInTypeInPlugIn(CFUUIDRef typeUUID, CFPlugInRef plugIn);

    @Generated
    @CFunction
    public static native VoidPtr CFPlugInInstanceCreate(CFAllocatorRef allocator, CFUUIDRef factoryUUID,
            CFUUIDRef typeUUID);

    @Generated
    @CFunction
    public static native byte CFPlugInRegisterFactoryFunction(CFUUIDRef factoryUUID,
            @FunctionPtr(name = "call_CFPlugInRegisterFactoryFunction") Function_CFPlugInRegisterFactoryFunction func);

    @Generated
    @CFunction
    public static native byte CFPlugInRegisterFactoryFunctionByName(CFUUIDRef factoryUUID, CFPlugInRef plugIn,
            CFStringRef functionName);

    @Generated
    @CFunction
    public static native byte CFPlugInUnregisterFactory(CFUUIDRef factoryUUID);

    @Generated
    @CFunction
    public static native byte CFPlugInRegisterPlugInType(CFUUIDRef factoryUUID, CFUUIDRef typeUUID);

    @Generated
    @CFunction
    public static native byte CFPlugInUnregisterPlugInType(CFUUIDRef factoryUUID, CFUUIDRef typeUUID);

    @Generated
    @CFunction
    public static native void CFPlugInAddInstanceForFactory(CFUUIDRef factoryID);

    @Generated
    @CFunction
    public static native void CFPlugInRemoveInstanceForFactory(CFUUIDRef factoryID);

    @Generated
    @CFunction
    public static native byte CFPlugInInstanceGetInterfaceFunctionTable(CFPlugInInstanceRef instance,
            CFStringRef interfaceName, Ptr<VoidPtr> ftbl);

    @Generated
    @CFunction
    public static native CFStringRef CFPlugInInstanceGetFactoryName(CFPlugInInstanceRef instance);

    @Generated
    @CFunction
    public static native VoidPtr CFPlugInInstanceGetInstanceData(CFPlugInInstanceRef instance);

    @Generated
    @CFunction
    @NUInt
    public static native long CFPlugInInstanceGetTypeID();

    @Generated
    @CFunction
    public static native CFPlugInInstanceRef CFPlugInInstanceCreateWithInstanceDataSize(CFAllocatorRef allocator,
            @NInt long instanceDataSize,
            @FunctionPtr(name = "call_CFPlugInInstanceCreateWithInstanceDataSize_2") Function_CFPlugInInstanceCreateWithInstanceDataSize_2 deallocateInstanceFunction,
            CFStringRef factoryName,
            @FunctionPtr(name = "call_CFPlugInInstanceCreateWithInstanceDataSize_4") Function_CFPlugInInstanceCreateWithInstanceDataSize_4 getInterfaceFunction);

    @Generated
    @CFunction
    @NUInt
    public static native long CFMachPortGetTypeID();

    @Generated
    @CFunction
    public static native CFMachPortRef CFMachPortCreate(CFAllocatorRef allocator,
            @FunctionPtr(name = "call_CFMachPortCreate") Function_CFMachPortCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context,
            BytePtr shouldFreeInfo);

    @Generated
    @CFunction
    public static native CFMachPortRef CFMachPortCreateWithPort(CFAllocatorRef allocator, int portNum,
            @FunctionPtr(name = "call_CFMachPortCreateWithPort") Function_CFMachPortCreateWithPort callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context,
            BytePtr shouldFreeInfo);

    @Generated
    @CFunction
    public static native int CFMachPortGetPort(CFMachPortRef port);

    @Generated
    @CFunction
    public static native void CFMachPortGetContext(CFMachPortRef port,
            @UncertainArgument("Options: reference, array Fallback: reference") CFMachPortContext context);

    @Generated
    @CFunction
    public static native void CFMachPortInvalidate(CFMachPortRef port);

    @Generated
    @CFunction
    public static native byte CFMachPortIsValid(CFMachPortRef port);

    @Generated
    @CFunction
    @FunctionPtr(name = "call_CFMachPortGetInvalidationCallBack_ret")
    public static native Function_CFMachPortGetInvalidationCallBack_ret CFMachPortGetInvalidationCallBack(
            CFMachPortRef port);

    @Generated
    @CFunction
    public static native void CFMachPortSetInvalidationCallBack(CFMachPortRef port,
            @FunctionPtr(name = "call_CFMachPortSetInvalidationCallBack") Function_CFMachPortSetInvalidationCallBack callout);

    @Generated
    @CFunction
    public static native CFRunLoopSourceRef CFMachPortCreateRunLoopSource(CFAllocatorRef allocator, CFMachPortRef port,
            @NInt long order);

    @Generated
    @CFunction
    @NUInt
    public static native long CFAttributedStringGetTypeID();

    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreate(CFAllocatorRef alloc, CFStringRef str,
            CFDictionaryRef attributes);

    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreateWithSubstring(CFAllocatorRef alloc,
            CFAttributedStringRef aStr, @ByValue CFRange range);

    @Generated
    @CFunction
    public static native CFAttributedStringRef CFAttributedStringCreateCopy(CFAllocatorRef alloc,
            CFAttributedStringRef aStr);

    @Generated
    @CFunction
    public static native CFStringRef CFAttributedStringGetString(CFAttributedStringRef aStr);

    @Generated
    @CFunction
    @NInt
    public static native long CFAttributedStringGetLength(CFAttributedStringRef aStr);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFAttributedStringGetAttributes(CFAttributedStringRef aStr, @NInt long loc,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange effectiveRange);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFAttributedStringGetAttribute(CFAttributedStringRef aStr, @NInt long loc,
            CFStringRef attrName,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange effectiveRange);

    @Generated
    @CFunction
    public static native CFDictionaryRef CFAttributedStringGetAttributesAndLongestEffectiveRange(
            CFAttributedStringRef aStr, @NInt long loc, @ByValue CFRange inRange,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange longestEffectiveRange);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFAttributedStringGetAttributeAndLongestEffectiveRange(CFAttributedStringRef aStr,
            @NInt long loc, CFStringRef attrName, @ByValue CFRange inRange,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange longestEffectiveRange);

    @Generated
    @CFunction
    public static native CFMutableAttributedStringRef CFAttributedStringCreateMutableCopy(CFAllocatorRef alloc,
            @NInt long maxLength, CFAttributedStringRef aStr);

    @Generated
    @CFunction
    public static native CFMutableAttributedStringRef CFAttributedStringCreateMutable(CFAllocatorRef alloc,
            @NInt long maxLength);

    @Generated
    @CFunction
    public static native void CFAttributedStringReplaceString(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFStringRef replacement);

    @Generated
    @CFunction
    public static native CFMutableStringRef CFAttributedStringGetMutableString(CFMutableAttributedStringRef aStr);

    @Generated
    @CFunction
    public static native void CFAttributedStringSetAttributes(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFDictionaryRef replacement, byte clearOtherAttributes);

    @Generated
    @CFunction
    public static native void CFAttributedStringSetAttribute(CFMutableAttributedStringRef aStr, @ByValue CFRange range,
            CFStringRef attrName, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void CFAttributedStringRemoveAttribute(CFMutableAttributedStringRef aStr,
            @ByValue CFRange range, CFStringRef attrName);

    @Generated
    @CFunction
    public static native void CFAttributedStringReplaceAttributedString(CFMutableAttributedStringRef aStr,
            @ByValue CFRange range, CFAttributedStringRef replacement);

    @Generated
    @CFunction
    public static native void CFAttributedStringBeginEditing(CFMutableAttributedStringRef aStr);

    @Generated
    @CFunction
    public static native void CFAttributedStringEndEditing(CFMutableAttributedStringRef aStr);

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

    @Generated
    @CFunction
    @NUInt
    public static native long CFFileSecurityGetTypeID();

    @Generated
    @CFunction
    public static native CFFileSecurityRef CFFileSecurityCreate(CFAllocatorRef allocator);

    @Generated
    @CFunction
    public static native CFFileSecurityRef CFFileSecurityCreateCopy(CFAllocatorRef allocator,
            CFFileSecurityRef fileSec);

    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyOwnerUUID(CFFileSecurityRef fileSec, Ptr<CFUUIDRef> ownerUUID);

    @Generated
    @CFunction
    public static native byte CFFileSecuritySetOwnerUUID(CFFileSecurityRef fileSec, CFUUIDRef ownerUUID);

    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyGroupUUID(CFFileSecurityRef fileSec, Ptr<CFUUIDRef> groupUUID);

    @Generated
    @CFunction
    public static native byte CFFileSecuritySetGroupUUID(CFFileSecurityRef fileSec, CFUUIDRef groupUUID);

    @Generated
    @CFunction
    public static native byte CFFileSecurityCopyAccessControlList(CFFileSecurityRef fileSec,
            Ptr<acl_t> accessControlList);

    @Generated
    @CFunction
    public static native byte CFFileSecuritySetAccessControlList(CFFileSecurityRef fileSec, acl_t accessControlList);

    @Generated
    @CFunction
    public static native byte CFFileSecurityGetOwner(CFFileSecurityRef fileSec, IntPtr owner);

    @Generated
    @CFunction
    public static native byte CFFileSecuritySetOwner(CFFileSecurityRef fileSec, int owner);

    @Generated
    @CFunction
    public static native byte CFFileSecurityGetGroup(CFFileSecurityRef fileSec, IntPtr group);

    @Generated
    @CFunction
    public static native byte CFFileSecuritySetGroup(CFFileSecurityRef fileSec, int group);

    @Generated
    @CFunction
    public static native byte CFFileSecurityGetMode(CFFileSecurityRef fileSec, CharPtr mode);

    @Generated
    @CFunction
    public static native byte CFFileSecuritySetMode(CFFileSecurityRef fileSec, char mode);

    @Generated
    @CFunction
    public static native byte CFFileSecurityClearProperties(CFFileSecurityRef fileSec, @NUInt long clearPropertyMask);

    @Generated
    @CFunction
    public static native CFStringRef CFStringTokenizerCopyBestStringLanguage(CFStringRef string,
            @ByValue CFRange range);

    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerGetTypeID();

    @Generated
    @CFunction
    public static native CFStringTokenizerRef CFStringTokenizerCreate(CFAllocatorRef alloc, CFStringRef string,
            @ByValue CFRange range, @NUInt long options, CFLocaleRef locale);

    @Generated
    @CFunction
    public static native void CFStringTokenizerSetString(CFStringTokenizerRef tokenizer, CFStringRef string,
            @ByValue CFRange range);

    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerGoToTokenAtIndex(CFStringTokenizerRef tokenizer, @NInt long index);

    @Generated
    @CFunction
    @NUInt
    public static native long CFStringTokenizerAdvanceToNextToken(CFStringTokenizerRef tokenizer);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CFStringTokenizerGetCurrentTokenRange(CFStringTokenizerRef tokenizer);

    @Generated
    @CFunction
    public static native ConstVoidPtr CFStringTokenizerCopyCurrentTokenAttribute(CFStringTokenizerRef tokenizer,
            @NUInt long attribute);

    @Generated
    @CFunction
    @NInt
    public static native long CFStringTokenizerGetCurrentSubTokens(CFStringTokenizerRef tokenizer,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange ranges,
            @NInt long maxRangeLength, CFMutableArrayRef derivedSubTokens);

    @Generated
    @CFunction
    @NUInt
    public static native long CFFileDescriptorGetTypeID();

    @Generated
    @CFunction
    public static native CFFileDescriptorRef CFFileDescriptorCreate(CFAllocatorRef allocator, int fd,
            byte closeOnInvalidate,
            @FunctionPtr(name = "call_CFFileDescriptorCreate") Function_CFFileDescriptorCreate callout,
            @UncertainArgument("Options: reference, array Fallback: reference") CFFileDescriptorContext context);

    @Generated
    @CFunction
    public static native int CFFileDescriptorGetNativeDescriptor(CFFileDescriptorRef f);

    @Generated
    @CFunction
    public static native void CFFileDescriptorGetContext(CFFileDescriptorRef f,
            @UncertainArgument("Options: reference, array Fallback: reference") CFFileDescriptorContext context);

    @Generated
    @CFunction
    public static native void CFFileDescriptorEnableCallBacks(CFFileDescriptorRef f, @NUInt long callBackTypes);

    @Generated
    @CFunction
    public static native void CFFileDescriptorDisableCallBacks(CFFileDescriptorRef f, @NUInt long callBackTypes);

    @Generated
    @CFunction
    public static native void CFFileDescriptorInvalidate(CFFileDescriptorRef f);

    @Generated
    @CFunction
    public static native byte CFFileDescriptorIsValid(CFFileDescriptorRef f);

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
    public static native CFStringRef kCFURLIsApplicationKey();

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
    public static native CFStringRef kCFURLCanonicalPathKey();

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
    public static native CFStringRef kCFURLVolumeIsEncryptedKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeIsRootFileSystemKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsCompressionKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsFileCloningKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsSwapRenamingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsExclusiveRenamingKey();

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

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFDictionaryApplyFunction {
        @Generated
        void call_CFDictionaryApplyFunction(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArrayApplyFunction {
        @Generated
        void call_CFArrayApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArrayBSearchValues {
        @Generated
        @NInt
        long call_CFArrayBSearchValues(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFArraySortValues {
        @Generated
        @NInt
        long call_CFArraySortValues(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFNotificationCenterAddObserver {
        @Generated
        void call_CFNotificationCenterAddObserver(CFNotificationCenterRef arg0, VoidPtr arg1, CFStringRef arg2,
                ConstVoidPtr arg3, CFDictionaryRef arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFBagApplyFunction {
        @Generated
        void call_CFBagApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFBinaryHeapApplyFunction {
        @Generated
        void call_CFBinaryHeapApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopPerformBlock {
        @Generated
        void call_CFRunLoopPerformBlock();
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFRunLoopObserverCreate {
        @Generated
        void call_CFRunLoopObserverCreate(CFRunLoopObserverRef arg0, @NUInt long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopObserverCreateWithHandler {
        @Generated
        void call_CFRunLoopObserverCreateWithHandler(CFRunLoopObserverRef arg0, @NUInt long arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFRunLoopTimerCreate {
        @Generated
        void call_CFRunLoopTimerCreate(CFRunLoopTimerRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CFRunLoopTimerCreateWithHandler {
        @Generated
        void call_CFRunLoopTimerCreateWithHandler(CFRunLoopTimerRef arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreate {
        @Generated
        void call_CFSocketCreate(CFSocketRef arg0, @NUInt long arg1, CFDataRef arg2, ConstVoidPtr arg3, VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateWithNative {
        @Generated
        void call_CFSocketCreateWithNative(CFSocketRef arg0, @NUInt long arg1, CFDataRef arg2, ConstVoidPtr arg3,
                VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateWithSocketSignature {
        @Generated
        void call_CFSocketCreateWithSocketSignature(CFSocketRef arg0, @NUInt long arg1, CFDataRef arg2,
                ConstVoidPtr arg3, VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSocketCreateConnectedToSocketSignature {
        @Generated
        void call_CFSocketCreateConnectedToSocketSignature(CFSocketRef arg0, @NUInt long arg1, CFDataRef arg2,
                ConstVoidPtr arg3, VoidPtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFReadStreamSetClient {
        @Generated
        void call_CFReadStreamSetClient(CFReadStreamRef arg0, @NUInt long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFWriteStreamSetClient {
        @Generated
        void call_CFWriteStreamSetClient(CFWriteStreamRef arg0, @NUInt long arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFSetApplyFunction {
        @Generated
        void call_CFSetApplyFunction(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFTreeApplyFunctionToChildren {
        @Generated
        void call_CFTreeApplyFunctionToChildren(ConstVoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFTreeSortChildren {
        @Generated
        @NInt
        long call_CFTreeSortChildren(ConstVoidPtr arg0, ConstVoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortCreateLocal {
        @Generated
        CFDataRef call_CFMessagePortCreateLocal(CFMessagePortRef arg0, int arg1, CFDataRef arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortGetInvalidationCallBack_ret {
        @Generated
        void call_CFMessagePortGetInvalidationCallBack_ret(CFMessagePortRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMessagePortSetInvalidationCallBack {
        @Generated
        void call_CFMessagePortSetInvalidationCallBack(CFMessagePortRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFPlugInRegisterFactoryFunction {
        @Generated
        VoidPtr call_CFPlugInRegisterFactoryFunction(CFAllocatorRef arg0, CFUUIDRef arg1);
    }

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
        byte call_CFPlugInInstanceCreateWithInstanceDataSize_4(CFPlugInInstanceRef arg0, CFStringRef arg1,
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortCreate {
        @Generated
        void call_CFMachPortCreate(CFMachPortRef arg0, VoidPtr arg1, @NInt long arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortCreateWithPort {
        @Generated
        void call_CFMachPortCreateWithPort(CFMachPortRef arg0, VoidPtr arg1, @NInt long arg2, VoidPtr arg3);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortGetInvalidationCallBack_ret {
        @Generated
        void call_CFMachPortGetInvalidationCallBack_ret(CFMachPortRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFMachPortSetInvalidationCallBack {
        @Generated
        void call_CFMachPortSetInvalidationCallBack(CFMachPortRef arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CFFileDescriptorCreate {
        @Generated
        void call_CFFileDescriptorCreate(CFFileDescriptorRef arg0, @NUInt long arg1, VoidPtr arg2);
    }

    @Generated
    @CVariable()
    public static native CFStringRef kCFErrorLocalizedFailureKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeAvailableCapacityForImportantUsageKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeAvailableCapacityForOpportunisticUsageKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsImmutableFilesKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCFURLVolumeSupportsAccessPermissionsKey();
}
