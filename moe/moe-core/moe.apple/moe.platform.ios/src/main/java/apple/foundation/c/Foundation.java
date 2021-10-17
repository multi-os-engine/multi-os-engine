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

package apple.foundation.c;

import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSException;
import apple.foundation.NSHashTable;
import apple.foundation.NSMapTable;
import apple.foundation.struct.NSHashEnumerator;
import apple.foundation.struct.NSHashTableCallBacks;
import apple.foundation.struct.NSMapEnumerator;
import apple.foundation.struct.NSMapTableKeyCallBacks;
import apple.foundation.struct.NSMapTableValueCallBacks;
import apple.foundation.struct.NSRange;
import apple.foundation.struct.NSSwappedDouble;
import apple.foundation.struct.NSSwappedFloat;
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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Foundation")
@Runtime(CRuntime.class)
public final class Foundation {
    @Generated @NInt public static final long NSNotFound = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;
    /**
     * An NSHashTable is modeled after a set, although, because of its options, is not a set because it can behave differently (for example, if pointer equality is specified two isEqual strings will both be entered).  The major option is to provide for "weak" references that are removed automatically, but at some indefinite point in the future.
     * An NSHashTable can also be configured to operate on arbitrary pointers and not just objects.  We recommend the C function API for "void *" access.  To configure for pointer use, consult and choose the appropriate NSPointerFunctionsOptions or configure or use an NSPointerFunctions object itself for initialization.
     */
    @Generated @NUInt public static final long NSHashTableStrongMemory = 0x0000000000000000L;
    @Generated @NUInt public static final long NSHashTableCopyIn = 0x0000000000010000L;
    @Generated @NUInt public static final long NSHashTableObjectPointerPersonality = 0x0000000000000200L;
    @Generated @NUInt public static final long NSHashTableWeakMemory = 0x0000000000000005L;
    /**
     * An NSMapTable is modeled after a dictionary, although, because of its options, is not a dictionary because it will behave differently.  The major option is to have keys and/or values held "weakly" in a manner that entries will be removed at some indefinite point after one of the objects is reclaimed.  In addition to being held weakly, keys or values may be copied on input or may use pointer identity for equality and hashing.
     * An NSMapTable can also be configured to operate on arbitrary pointers and not just objects.  We recommend the C function API for "void *" access.  To configure for pointer use, consult and choose the appropriate NSPointerFunction options or configure and use  NSPointerFunctions objects directly for initialization.
     */
    @Generated @NUInt public static final long NSMapTableStrongMemory = 0x0000000000000000L;
    @Generated @NUInt public static final long NSMapTableCopyIn = 0x0000000000010000L;
    @Generated @NUInt public static final long NSMapTableObjectPointerPersonality = 0x0000000000000200L;
    @Generated @NUInt public static final long NSMapTableWeakMemory = 0x0000000000000005L;
    @Generated @NInt public static final long NSOperationQueueDefaultMaxConcurrentOperationCount = 0xFFFFFFFFFFFFFFFFL;
    /**
     * used with NSRunLoop's performSelector:target:argument:order:modes:
     */
    @Generated @NUInt public static final long NSUndoCloseGroupingRunLoopOrdering = 0x0000000000055730L;

    static {
        NatJ.register();
    }

    @Generated
    private Foundation() {
    }

    public static String NSLocalizedString(String key, String comment) {
        return NSBundle.mainBundle().localizedStringForKeyValueTable(key, "", null);
    }

    public static String NSLocalizedStringFromTable(String key, String tbl, String comment) {
        return NSBundle.mainBundle().localizedStringForKeyValueTable(key, "", tbl);
    }

    public static String NSLocalizedStringFromTableInBundle(String key, String tbl, NSBundle bundle, String comment) {
        return bundle.localizedStringForKeyValueTable(key, "", tbl);
    }

    public static String NSLocalizedStringWithDefaultValue(String key, String tbl, NSBundle bundle, String val,
            String comment) {
        return bundle.localizedStringForKeyValueTable(key, val, tbl);
    }

    public static String NSLocalizedString(String key) {
        return NSBundle.mainBundle().localizedStringForKeyValueTable(key, "", null);
    }

    public static String NSLocalizedStringFromTable(String key, String tbl) {
        return NSBundle.mainBundle().localizedStringForKeyValueTable(key, "", tbl);
    }

    public static String NSLocalizedStringFromTableInBundle(String key, String tbl, NSBundle bundle) {
        return bundle.localizedStringForKeyValueTable(key, "", tbl);
    }

    public static String NSLocalizedStringWithDefaultValue(String key, String tbl, NSBundle bundle, String val) {
        return bundle.localizedStringForKeyValueTable(key, val, tbl);
    }

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromSelector(SEL aSelector);

    @Generated
    @CFunction
    public static native SEL NSSelectorFromString(@Mapped(ObjCStringMapper.class) String aSelectorName);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromClass(Class aClass);

    @Generated
    @CFunction
    public static native Class NSClassFromString(@Mapped(ObjCStringMapper.class) String aClassName);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String NSGetSizeAndAlignment(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String typePtr,
            NUIntPtr sizep, NUIntPtr alignp);

    @Generated
    @Variadic()
    @CFunction
    public static native void NSLog(@Mapped(ObjCObjectMapper.class) Object format, Object... varargs);

    @Generated
    @CFunction
    public static native void NSLogv(@Mapped(ObjCObjectMapper.class) Object format, BytePtr args);

    @Generated
    @CFunction
    public static native VoidPtr NSDefaultMallocZone();

    @Generated
    @CFunction
    public static native VoidPtr NSCreateZone(@NUInt long startSize, @NUInt long granularity, boolean canFree);

    @Generated
    @CFunction
    public static native void NSRecycleZone(VoidPtr zone);

    @Generated
    @CFunction
    public static native void NSSetZoneName(VoidPtr zone, @Mapped(ObjCStringMapper.class) String name);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSZoneName(VoidPtr zone);

    @Generated
    @CFunction
    public static native VoidPtr NSZoneFromPointer(VoidPtr ptr);

    @Generated
    @CFunction
    public static native VoidPtr NSZoneMalloc(VoidPtr zone, @NUInt long size);

    @Generated
    @CFunction
    public static native VoidPtr NSZoneCalloc(VoidPtr zone, @NUInt long numElems, @NUInt long byteSize);

    @Generated
    @CFunction
    public static native VoidPtr NSZoneRealloc(VoidPtr zone, VoidPtr ptr, @NUInt long size);

    @Generated
    @CFunction
    public static native void NSZoneFree(VoidPtr zone, VoidPtr ptr);

    @Generated
    @CFunction
    @NUInt
    public static native long NSPageSize();

    @Generated
    @CFunction
    @NUInt
    public static native long NSLogPageSize();

    @Generated
    @CFunction
    @NUInt
    public static native long NSRoundUpToMultipleOfPageSize(@NUInt long bytes);

    @Generated
    @CFunction
    @NUInt
    public static native long NSRoundDownToMultipleOfPageSize(@NUInt long bytes);

    @Generated
    @CFunction
    public static native VoidPtr NSAllocateMemoryPages(@NUInt long bytes);

    @Generated
    @CFunction
    public static native void NSDeallocateMemoryPages(VoidPtr ptr, @NUInt long bytes);

    @Generated
    @CFunction
    public static native void NSCopyMemoryPages(ConstVoidPtr source, VoidPtr dest, @NUInt long bytes);

    @Generated
    @Deprecated
    @CFunction
    @NUInt
    public static native long NSRealMemoryAvailable();

    /**
     * After using a CFBridgingRetain on an NSObject, the caller must take responsibility for calling CFRelease at an appropriate time.
     */
    @Generated
    @Inline
    @CFunction
    public static native ConstVoidPtr CFBridgingRetain(@Mapped(ObjCObjectMapper.class) Object X);

    @Generated
    @Inline
    @CFunction
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object CFBridgingRelease(ConstVoidPtr X);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSRange NSMakeRange(@NUInt long loc, @NUInt long len);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NSMaxRange(@ByValue NSRange range);

    @Generated
    @Inline
    @CFunction
    public static native boolean NSLocationInRange(@NUInt long loc, @ByValue NSRange range);

    @Generated
    @Inline
    @CFunction
    public static native boolean NSEqualRanges(@ByValue NSRange range1, @ByValue NSRange range2);

    @Generated
    @CFunction
    @ByValue
    public static native NSRange NSUnionRange(@ByValue NSRange range1, @ByValue NSRange range2);

    @Generated
    @CFunction
    @ByValue
    public static native NSRange NSIntersectionRange(@ByValue NSRange range1, @ByValue NSRange range2);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromRange(@ByValue NSRange range);

    @Generated
    @CFunction
    @ByValue
    public static native NSRange NSRangeFromString(@Mapped(ObjCStringMapper.class) String aString);

    @Generated
    @Inline
    @CFunction
    @NInt
    public static native long NSHostByteOrder();

    @Generated
    @Inline
    @CFunction
    public static native char NSSwapShort(char inv);

    @Generated
    @Inline
    @CFunction
    public static native int NSSwapInt(int inv);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NSSwapLong(@NUInt long inv);

    @Generated
    @Inline
    @CFunction
    public static native long NSSwapLongLong(long inv);

    @Generated
    @Inline
    @CFunction
    public static native char NSSwapBigShortToHost(char x);

    @Generated
    @Inline
    @CFunction
    public static native int NSSwapBigIntToHost(int x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NSSwapBigLongToHost(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NSSwapBigLongLongToHost(long x);

    @Generated
    @Inline
    @CFunction
    public static native char NSSwapHostShortToBig(char x);

    @Generated
    @Inline
    @CFunction
    public static native int NSSwapHostIntToBig(int x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NSSwapHostLongToBig(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NSSwapHostLongLongToBig(long x);

    @Generated
    @Inline
    @CFunction
    public static native char NSSwapLittleShortToHost(char x);

    @Generated
    @Inline
    @CFunction
    public static native int NSSwapLittleIntToHost(int x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NSSwapLittleLongToHost(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NSSwapLittleLongLongToHost(long x);

    @Generated
    @Inline
    @CFunction
    public static native char NSSwapHostShortToLittle(char x);

    @Generated
    @Inline
    @CFunction
    public static native int NSSwapHostIntToLittle(int x);

    @Generated
    @Inline
    @CFunction
    @NUInt
    public static native long NSSwapHostLongToLittle(@NUInt long x);

    @Generated
    @Inline
    @CFunction
    public static native long NSSwapHostLongLongToLittle(long x);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSSwappedFloat NSConvertHostFloatToSwapped(float x);

    @Generated
    @Inline
    @CFunction
    public static native float NSConvertSwappedFloatToHost(@ByValue NSSwappedFloat x);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSSwappedDouble NSConvertHostDoubleToSwapped(double x);

    @Generated
    @Inline
    @CFunction
    public static native double NSConvertSwappedDoubleToHost(@ByValue NSSwappedDouble x);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSSwappedFloat NSSwapFloat(@ByValue NSSwappedFloat x);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSSwappedDouble NSSwapDouble(@ByValue NSSwappedDouble x);

    @Generated
    @Inline
    @CFunction
    public static native double NSSwapBigDoubleToHost(@ByValue NSSwappedDouble x);

    @Generated
    @Inline
    @CFunction
    public static native float NSSwapBigFloatToHost(@ByValue NSSwappedFloat x);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSSwappedDouble NSSwapHostDoubleToBig(double x);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSSwappedFloat NSSwapHostFloatToBig(float x);

    @Generated
    @Inline
    @CFunction
    public static native double NSSwapLittleDoubleToHost(@ByValue NSSwappedDouble x);

    @Generated
    @Inline
    @CFunction
    public static native float NSSwapLittleFloatToHost(@ByValue NSSwappedFloat x);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSSwappedDouble NSSwapHostDoubleToLittle(double x);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native NSSwappedFloat NSSwapHostFloatToLittle(float x);

    @Generated
    @Inline
    @CFunction
    public static native boolean NSDecimalIsNotANumber(VoidPtr dcm);

    /**
     * Operations		**********
     */
    @Generated
    @CFunction
    public static native void NSDecimalCopy(VoidPtr destination, VoidPtr source);

    @Generated
    @CFunction
    public static native void NSDecimalCompact(VoidPtr number);

    @Generated
    @CFunction
    @NInt
    public static native long NSDecimalCompare(VoidPtr leftOperand, VoidPtr rightOperand);

    /**
     * NSDecimalCompare:Compares leftOperand and rightOperand.
     */
    @Generated
    @CFunction
    public static native void NSDecimalRound(VoidPtr result, VoidPtr number, @NInt long scale,
            @NUInt long roundingMode);

    /**
     * Rounds num to the given scale using the given mode.
     * result may be a pointer to same space as num.
     * scale indicates number of significant digits after the decimal point
     */
    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalNormalize(VoidPtr number1, VoidPtr number2, @NUInt long roundingMode);

    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalAdd(VoidPtr result, VoidPtr leftOperand, VoidPtr rightOperand,
            @NUInt long roundingMode);

    /**
     * Exact operations. result may be a pointer to same space as leftOperand or rightOperand
     */
    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalSubtract(VoidPtr result, VoidPtr leftOperand, VoidPtr rightOperand,
            @NUInt long roundingMode);

    /**
     * Exact operations. result may be a pointer to same space as leftOperand or rightOperand
     */
    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalMultiply(VoidPtr result, VoidPtr leftOperand, VoidPtr rightOperand,
            @NUInt long roundingMode);

    /**
     * Exact operations. result may be a pointer to same space as leftOperand or rightOperand
     */
    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalDivide(VoidPtr result, VoidPtr leftOperand, VoidPtr rightOperand,
            @NUInt long roundingMode);

    /**
     * Division could be silently inexact;
     * Exact operations. result may be a pointer to same space as leftOperand or rightOperand
     */
    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalPower(VoidPtr result, VoidPtr number, @NUInt long power,
            @NUInt long roundingMode);

    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalMultiplyByPowerOf10(VoidPtr result, VoidPtr number, short power,
            @NUInt long roundingMode);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDecimalString(VoidPtr dcm, @Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @CFunction
    @FunctionPtr(name = "call_NSGetUncaughtExceptionHandler_ret")
    public static native Function_NSGetUncaughtExceptionHandler_ret NSGetUncaughtExceptionHandler();

    @Generated
    @CFunction
    public static native void NSSetUncaughtExceptionHandler(
            @FunctionPtr(name = "call_NSSetUncaughtExceptionHandler") Function_NSSetUncaughtExceptionHandler arg1);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserName();

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFullUserName();

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHomeDirectory();

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHomeDirectoryForUser(@Mapped(ObjCStringMapper.class) String userName);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTemporaryDirectory();

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSOpenStepRootDirectory();

    @Generated
    @CFunction
    public static native NSArray<String> NSSearchPathForDirectoriesInDomains(@NUInt long directory,
            @NUInt long domainMask, boolean expandTilde);

    @Generated
    @CVariable()
    public static native double NSFoundationVersionNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformLatinToKatakana();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformLatinToHiragana();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformLatinToHangul();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformLatinToArabic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformLatinToHebrew();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformLatinToThai();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformLatinToCyrillic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformLatinToGreek();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformToLatin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformMandarinToLatin();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformHiraganaToKatakana();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformFullwidthToHalfwidth();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformToXMLHex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformToUnicodeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformStripCombiningMarks();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringTransformStripDiacritics();

    /**
     * NSArray of NSNumbers which contain NSStringEncoding values; if this key is not present in the dictionary, all encodings are weighted the same
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionSuggestedEncodingsKey();

    /**
     * NSArray of NSNumbers which contain NSStringEncoding values; if this key is not present in the dictionary, all encodings are considered
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionDisallowedEncodingsKey();

    /**
     * NSNumber boolean value; if this key is not present in the dictionary, the default value is NO
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionUseOnlySuggestedEncodingsKey();

    /**
     * NSNumber boolean value; if this key is not present in the dictionary, the default value is YES
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionAllowLossyKey();

    /**
     * NSNumber boolean value; if this key is not present in the dictionary, the default value is NO
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionFromWindowsKey();

    /**
     * NSString value; if this key is not present in the dictionary, the default value is U+FFFD
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionLossySubstitutionKey();

    /**
     * NSString value; ISO language code; if this key is not present in the dictionary, no such information is considered
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionLikelyLanguageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCharacterConversionException();

    /**
     * raised by -propertyList
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSParseErrorException();

    /**
     * How much time is probably left in the operation, as an NSNumber containing a number of seconds.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressEstimatedTimeRemainingKey();

    /**
     * How fast data is being processed, as an NSNumber containing bytes per second.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressThroughputKey();

    /**
     * The value for the kind property that indicates that the work being done is one of the kind of file operations listed below. NSProgress of this kind is assumed to use bytes as the unit of work being done and the default implementation of -localizedDescription takes advantage of that to return more specific text than it could otherwise. The NSProgressFileTotalCountKey and NSProgressFileCompletedCountKey keys in the userInfo dictionary are used for the overall count of files.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressKindFile();

    /**
     * A user info dictionary key, for an entry that is required when the value for the kind property is NSProgressKindFile. The value must be one of the strings listed in the next section. The default implementations of of -localizedDescription and -localizedItemDescription use this value to determine the text that they return.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileOperationKindKey();

    /**
     * Possible values for NSProgressFileOperationKindKey entries.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileOperationKindDownloading();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileOperationKindDecompressingAfterDownloading();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileOperationKindReceiving();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileOperationKindCopying();

    /**
     * A user info dictionary key. The value must be an NSURL identifying the item on which progress is being made. This is required for any NSProgress that is published using -publish to be reported to subscribers registered with +addSubscriberForFileURL:withPublishingHandler:.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileURLKey();

    /**
     * User info dictionary keys. The values must be NSNumbers containing integers. These entries are optional but if they are both present then the default implementation of -localizedAdditionalDescription uses them to determine the text that it returns.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileTotalCountKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileCompletedCountKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBundleDidLoadNotification();

    /**
     * notification key
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLoadedClasses();

    /**
     * This notification is posted to the default notification center when the resource request system detects a low disk space condition.
     * <p>
     * If the application is in the background, the system needs more space, and the application does not free up enough in response to the notification then the application may be killed. The application can free up space by calling -endAccessingResources on any outstanding requests. This will inform the system that you are done with those resources and it may purge the content to make room for a new request.
     * <p>
     * Note that this notification may not be the same as low disk space on the system, as applications can have a smaller quota.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBundleResourceRequestLowDiskSpaceNotification();

    /**
     * Use this value for the loadingPriority property if the user is doing nothing but waiting on the result of this request. The system will dedicate the maximum amount of resources available to finishing this request as soon as possible.
     */
    @Generated
    @CVariable()
    public static native double NSBundleResourceRequestLoadingPriorityUrgent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSystemClockDidChangeNotification();

    /**
     * the common calendar in Europe, the Western Hemisphere, and elsewhere
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierGregorian();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierBuddhist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierChinese();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierCoptic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierEthiopicAmeteMihret();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierEthiopicAmeteAlem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierHebrew();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierISO8601();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierIndian();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierIslamic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierIslamicCivil();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierJapanese();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierPersian();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierRepublicOfChina();

    /**
     * A simple tabular Islamic calendar using the astronomical/Thursday epoch of CE 622 July 15
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierIslamicTabular();

    /**
     * The Islamic Umm al-Qura calendar used in Saudi Arabia. This is based on astronomical calculation, instead of tabular behavior.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierIslamicUmmAlQura();

    /**
     * This notification is posted through [NSNotificationCenter defaultCenter]
     * when the system day changes. Register with "nil" as the object of this
     * notification. If the computer/device is asleep when the day changed,
     * this will be posted on wakeup. You'll get just one of these if the
     * machine has been asleep for several days. The definition of "Day" is
     * relative to the current calendar (NSCalendar.currentCalendar) of the
     * process and its locale and time zone. There are no guarantees that this
     * notification is received by observers in a "timely" manner, same as
     * with distributed notifications.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarDayChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCurrentLocaleDidChangeNotification();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleIdentifier();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleLanguageCode();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCountryCode();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleScriptCode();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleVariantCode();

    /**
     * NSCharacterSet
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleExemplarCharacterSet();

    /**
     * NSCalendar
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCalendar();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCollationIdentifier();

    /**
     * NSNumber boolean
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleUsesMetricSystem();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleMeasurementSystem();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleDecimalSeparator();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleGroupingSeparator();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCurrencySymbol();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCurrencyCode();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCollatorIdentifier();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleQuotationBeginDelimiterKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleQuotationEndDelimiterKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleAlternateQuotationBeginDelimiterKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleAlternateQuotationEndDelimiterKey();

    /**
     * Values for NSCalendar identifiers (not the NSLocaleCalendar property key)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSGregorianCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBuddhistCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSChineseCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHebrewCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSIslamicCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSIslamicCivilCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSJapaneseCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRepublicOfChinaCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersianCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSIndianCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSISO8601Calendar();

    /**
     * Attributed String identifier key string
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentKey();

    /**
     * Constants for attributed strings
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentGivenName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentFamilyName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentMiddleName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentPrefix();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentSuffix();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentNickname();

    /**
     * The delimiter is the character or characters used to separate name components.
     * For CJK languages there is no delimiter.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentDelimiter();

    /**
     * Generic Exception names		**************
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSGenericException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRangeException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvalidArgumentException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInternalInconsistencyException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMallocException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSObjectInaccessibleException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSObjectNotAvailableException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDestinationInvalidException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPortTimeoutException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvalidSendPortException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvalidReceivePortException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPortSendException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPortReceiveException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSOldStyleException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSAssertionHandlerKey();

    /**
     * Exceptions		**********
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDecimalNumberExactnessException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDecimalNumberOverflowException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDecimalNumberUnderflowException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDecimalNumberDivideByZeroException();

    /**
     * Predefined domain for errors from most AppKit and Foundation APIs.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCocoaErrorDomain();

    /**
     * Other predefined domains; value of "code" will correspond to preexisting values in these domains.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPOSIXErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSOSStatusErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMachErrorDomain();

    /**
     * Key in userInfo. A recommended standard way to embed NSErrors from underlying calls. The value of this key should be an NSError.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUnderlyingErrorKey();

    /**
     * NSString, a complete sentence (or more) describing ideally both what failed and why it failed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedDescriptionKey();

    /**
     * NSString, a complete sentence (or more) describing why the operation failed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedFailureReasonErrorKey();

    /**
     * NSString, a complete sentence (or more) describing what the user can do to fix the problem.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedRecoverySuggestionErrorKey();

    /**
     * NSArray of NSStrings corresponding to button titles.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedRecoveryOptionsErrorKey();

    /**
     * Instance of a subclass of NSObject that conforms to the NSErrorRecoveryAttempting informal protocol
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRecoveryAttempterErrorKey();

    /**
     * NSString containing a help anchor
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHelpAnchorErrorKey();

    /**
     * NSNumber containing NSStringEncoding
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingErrorKey();

    /**
     * NSURL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFilePathErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDefaultRunLoopMode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRunLoopCommonModes();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHandleOperationException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHandleReadCompletionNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHandleReadToEndOfFileCompletionNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHandleConnectionAcceptedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHandleDataAvailableNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHandleNotificationDataItem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHandleNotificationFileHandleItem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHandleNotificationMonitorModes();

    /**
     * A string constant for the "file" URL scheme. If you are using this to compare to a URL's scheme to see if it is a file URL, you should instead use the NSURL fileURL property -- the fileURL property is much faster.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileScheme();

    /**
     * Key for the resource properties that have not been set after setResourceValues:error: returns an error, returned as an array of of strings.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLKeysOfUnsetValuesKey();

    /**
     * The resource name provided by the file system (Read-write, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLNameKey();

    /**
     * Localized or extension-hidden name as displayed to users (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLocalizedNameKey();

    /**
     * True for regular files (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsRegularFileKey();

    /**
     * True for directories (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsDirectoryKey();

    /**
     * True for symlinks (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsSymbolicLinkKey();

    /**
     * True for the root directory of a volume (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsVolumeKey();

    /**
     * True for packaged directories (Read-only 10_6 and 10_7, read-write 10_8, value type boolean NSNumber). Note: You can only set or clear this property on directories; if you try to set this property on non-directory objects, the property is ignored. If the directory is a package for some other reason (extension type, etc), setting this property to false will have no effect.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsPackageKey();

    /**
     * True if resource is an application (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsApplicationKey();

    /**
     * True for system-immutable resources (Read-write, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsSystemImmutableKey();

    /**
     * True for user-immutable resources (Read-write, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsUserImmutableKey();

    /**
     * True for resources normally not displayed to users (Read-write, value type boolean NSNumber). Note: If the resource is a hidden because its name starts with a period, setting this property to false will not change the property.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsHiddenKey();

    /**
     * True for resources whose filename extension is removed from the localized name property (Read-write, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLHasHiddenExtensionKey();

    /**
     * The date the resource was created (Read-write, value type NSDate)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCreationDateKey();

    /**
     * The date the resource was last accessed (Read-write, value type NSDate)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLContentAccessDateKey();

    /**
     * The time the resource content was last modified (Read-write, value type NSDate)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLContentModificationDateKey();

    /**
     * The time the resource's attributes were last modified (Read-only, value type NSDate)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAttributeModificationDateKey();

    /**
     * Number of hard links to the resource (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLinkCountKey();

    /**
     * The resource's parent directory, if any (Read-only, value type NSURL)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLParentDirectoryURLKey();

    /**
     * URL of the volume on which the resource is stored (Read-only, value type NSURL)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeURLKey();

    /**
     * Uniform type identifier (UTI) for the resource (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLTypeIdentifierKey();

    /**
     * User-visible type or "kind" description (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLocalizedTypeDescriptionKey();

    /**
     * The label number assigned to the resource (Read-write, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLabelNumberKey();

    /**
     * The color of the assigned label (Read-only, value type NSColor)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLabelColorKey();

    /**
     * The user-visible label text (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLocalizedLabelKey();

    /**
     * The icon normally displayed for the resource (Read-only, value type NSImage)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLEffectiveIconKey();

    /**
     * The custom icon assigned to the resource, if any (Currently not implemented, value type NSImage)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCustomIconKey();

    /**
     * An identifier which can be used to compare two file system objects for equality using -isEqual (i.e, two object identifiers are equal if they have the same file system path or if the paths are linked to same inode on the same file system). This identifier is not persistent across system restarts. (Read-only, value type id <NSCopying, NSCoding, NSSecureCoding, NSObject>)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceIdentifierKey();

    /**
     * An identifier that can be used to identify the volume the file system object is on. Other objects on the same volume will have the same volume identifier and can be compared using for equality using -isEqual. This identifier is not persistent across system restarts. (Read-only, value type id <NSCopying, NSCoding, NSSecureCoding, NSObject>)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIdentifierKey();

    /**
     * The optimal block size when reading or writing this file's data, or nil if not available. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLPreferredIOBlockSizeKey();

    /**
     * true if this process (as determined by EUID) can read the resource. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsReadableKey();

    /**
     * true if this process (as determined by EUID) can write to the resource. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsWritableKey();

    /**
     * true if this process (as determined by EUID) can execute a file resource or search a directory resource. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsExecutableKey();

    /**
     * The file system object's security information encapsulated in a NSFileSecurity object. (Read-write, Value type NSFileSecurity)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileSecurityKey();

    /**
     * true if resource should be excluded from backups, false otherwise (Read-write, value type boolean NSNumber). This property is only useful for excluding cache and other application support files which are not needed in a backup. Some operations commonly made to user documents will cause this property to be reset to false and so this property should not be used on user documents.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsExcludedFromBackupKey();

    /**
     * the URL's path as a file system path (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLPathKey();

    /**
     * the URL's path as a canonical absolute file system path (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCanonicalPathKey();

    /**
     * true if this URL is a file system trigger directory. Traversing or opening a file system trigger will cause an attempt to mount a file system on the trigger directory. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsMountTriggerKey();

    /**
     * An opaque generation identifier which can be compared using isEqual: to determine if the data in a document has been modified. For URLs which refer to the same file inode, the generation identifier will change when the data in the file's data fork is changed (changes to extended attributes or other file system metadata do not change the generation identifier). For URLs which refer to the same directory inode, the generation identifier will change when direct children of that directory are added, removed or renamed (changes to the data of the direct children of that directory will not change the generation identifier). The generation identifier is persistent across system restarts. The generation identifier is tied to a specific document on a specific volume and is not transferred when the document is copied to another volume. This property is not supported by all volumes. (Read-only, value type id <NSCopying, NSCoding, NSSecureCoding, NSObject>)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLGenerationIdentifierKey();

    /**
     * The document identifier -- a value assigned by the kernel to a document (which can be either a file or directory) and is used to identify the document regardless of where it gets moved on a volume. The document identifier survives "safe save” operations; i.e it is sticky to the path it was assigned to (-replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error: is the preferred safe-save API). The document identifier is persistent across system restarts. The document identifier is not transferred when the file is copied. Document identifiers are only unique within a single volume. This property is not supported by all volumes. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLDocumentIdentifierKey();

    /**
     * The date the resource was created, or renamed into or within its parent directory. Note that inconsistent behavior may be observed when this attribute is requested on hard-linked items. This property is not supported by all volumes. (Read-only before macOS 10.15, iOS 13.0, watchOS 6.0, and tvOS 13.0; Read-write after, value type NSDate)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAddedToDirectoryDateKey();

    /**
     * Returns the file system object type. (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeKey();

    /**
     * The file system object type values returned for the NSURLFileResourceTypeKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeNamedPipe();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeCharacterSpecial();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeDirectory();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeBlockSpecial();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeRegular();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeSymbolicLink();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeSocket();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeUnknown();

    /**
     * dictionary of NSImage/UIImage objects keyed by size
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLThumbnailDictionaryKey();

    /**
     * size key for a 1024 x 1024 thumbnail image
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSThumbnail1024x1024SizeKey();

    /**
     * Total file size in bytes (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileSizeKey();

    /**
     * Total size allocated on disk for the file in bytes (number of blocks times block size) (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileAllocatedSizeKey();

    /**
     * Total displayable size of the file in bytes (this may include space used by metadata), or nil if not available. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLTotalFileSizeKey();

    /**
     * Total allocated size of the file in bytes (this may include space used by metadata), or nil if not available. This can be less than the value returned by NSURLTotalFileSizeKey if the resource is compressed. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLTotalFileAllocatedSizeKey();

    /**
     * true if the resource is a Finder alias file or a symlink, false otherwise ( Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsAliasFileKey();

    /**
     * The protection level for this file
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionKey();

    /**
     * The file has no special protections associated with it. It can be read from or written to at any time.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionNone();

    /**
     * The file is stored in an encrypted format on disk and cannot be read from or written to while the device is locked or booting.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionComplete();

    /**
     * The file is stored in an encrypted format on disk. Files can be created while the device is locked, but once closed, cannot be opened again until the device is unlocked. If the file is opened when unlocked, you may continue to access the file normally, even if the user locks the device. There is a small performance penalty when the file is created and opened, though not when being written to or read from. This can be mitigated by changing the file protection to NSURLFileProtectionComplete when the device is unlocked.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionCompleteUnlessOpen();

    /**
     * The file is stored in an encrypted format on disk and cannot be accessed until after the device has booted. After the user unlocks the device for the first time, your app can access the file and continue to access it even if the user subsequently locks the device.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionCompleteUntilFirstUserAuthentication();

    /**
     * The user-visible volume format (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeLocalizedFormatDescriptionKey();

    /**
     * Total volume capacity in bytes (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeTotalCapacityKey();

    /**
     * Total free space in bytes (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeAvailableCapacityKey();

    /**
     * Total number of resources on the volume (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeResourceCountKey();

    /**
     * true if the volume format supports persistent object identifiers and can look up file system objects by their IDs (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsPersistentIDsKey();

    /**
     * true if the volume format supports symbolic links (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsSymbolicLinksKey();

    /**
     * true if the volume format supports hard links (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsHardLinksKey();

    /**
     * true if the volume format supports a journal used to speed recovery in case of unplanned restart (such as a power outage or crash). This does not necessarily mean the volume is actively using a journal. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsJournalingKey();

    /**
     * true if the volume is currently using a journal for speedy recovery after an unplanned restart. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsJournalingKey();

    /**
     * true if the volume format supports sparse files, that is, files which can have 'holes' that have never been written to, and thus do not consume space on disk. A sparse file may have an allocated size on disk that is less than its logical length (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsSparseFilesKey();

    /**
     * For security reasons, parts of a file (runs) that have never been written to must appear to contain zeroes. true if the volume keeps track of allocated but unwritten runs of a file so that it can substitute zeroes without actually writing zeroes to the media. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsZeroRunsKey();

    /**
     * true if the volume format treats upper and lower case characters in file and directory names as different. Otherwise an upper case character is equivalent to a lower case character, and you can't have two names that differ solely in the case of the characters. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsCaseSensitiveNamesKey();

    /**
     * true if the volume format preserves the case of file and directory names.  Otherwise the volume may change the case of some characters (typically making them all upper or all lower case). (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsCasePreservedNamesKey();

    /**
     * true if the volume supports reliable storage of times for the root directory. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsRootDirectoryDatesKey();

    /**
     * true if the volume supports returning volume size values (NSURLVolumeTotalCapacityKey and NSURLVolumeAvailableCapacityKey). (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsVolumeSizesKey();

    /**
     * true if the volume can be renamed. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsRenamingKey();

    /**
     * true if the volume implements whole-file flock(2) style advisory locks, and the O_EXLOCK and O_SHLOCK flags of the open(2) call. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsAdvisoryFileLockingKey();

    /**
     * true if the volume implements extended security (ACLs). (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsExtendedSecurityKey();

    /**
     * true if the volume should be visible via the GUI (i.e., appear on the Desktop as a separate volume). (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsBrowsableKey();

    /**
     * The largest file size (in bytes) supported by this file system, or nil if this cannot be determined. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeMaximumFileSizeKey();

    /**
     * true if the volume's media is ejectable from the drive mechanism under software control. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsEjectableKey();

    /**
     * true if the volume's media is removable from the drive mechanism. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsRemovableKey();

    /**
     * true if the volume's device is connected to an internal bus, false if connected to an external bus, or nil if not available. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsInternalKey();

    /**
     * true if the volume is automounted. Note: do not mistake this with the functionality provided by kCFURLVolumeSupportsBrowsingKey. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsAutomountedKey();

    /**
     * true if the volume is stored on a local device. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsLocalKey();

    /**
     * true if the volume is read-only. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsReadOnlyKey();

    /**
     * The volume's creation date, or nil if this cannot be determined. (Read-only, value type NSDate)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeCreationDateKey();

    /**
     * The NSURL needed to remount a network volume, or nil if not available. (Read-only, value type NSURL)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeURLForRemountingKey();

    /**
     * The volume's persistent UUID as a string, or nil if a persistent UUID is not available for the volume. (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeUUIDStringKey();

    /**
     * The name of the volume (Read-write if NSURLVolumeSupportsRenamingKey is YES, otherwise read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeNameKey();

    /**
     * The user-presentable name of the volume (Read-only, value type NSString)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeLocalizedNameKey();

    /**
     * true if the volume is encrypted. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsEncryptedKey();

    /**
     * true if the volume is the root filesystem. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsRootFileSystemKey();

    /**
     * true if the volume supports transparent decompression of compressed files using decmpfs. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsCompressionKey();

    /**
     * true if the volume supports clonefile(2) (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsFileCloningKey();

    /**
     * true if the volume supports renamex_np(2)'s RENAME_SWAP option (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsSwapRenamingKey();

    /**
     * true if the volume supports renamex_np(2)'s RENAME_EXCL option (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsExclusiveRenamingKey();

    /**
     * true if this item is synced to the cloud, false if it is only a local file. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsUbiquitousItemKey();

    /**
     * true if this item has conflicts outstanding. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemHasUnresolvedConflictsKey();

    /**
     * equivalent to NSURLUbiquitousItemDownloadingStatusKey == NSURLUbiquitousItemDownloadingStatusCurrent. Has never behaved as documented in earlier releases, hence deprecated.  (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsDownloadedKey();

    /**
     * true if data is being downloaded for this item. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsDownloadingKey();

    /**
     * true if there is data present in the cloud for this item. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsUploadedKey();

    /**
     * true if data is being uploaded for this item. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsUploadingKey();

    /**
     * Use NSMetadataQuery and NSMetadataUbiquitousItemPercentDownloadedKey on NSMetadataItem instead
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemPercentDownloadedKey();

    /**
     * Use NSMetadataQuery and NSMetadataUbiquitousItemPercentUploadedKey on NSMetadataItem instead
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemPercentUploadedKey();

    /**
     * returns the download status of this item. (Read-only, value type NSString). Possible values below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingStatusKey();

    /**
     * returns the error when downloading the item from iCloud failed, see the NSUbiquitousFile section in FoundationErrors.h (Read-only, value type NSError)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingErrorKey();

    /**
     * returns the error when uploading the item to iCloud failed, see the NSUbiquitousFile section in FoundationErrors.h (Read-only, value type NSError)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemUploadingErrorKey();

    /**
     * returns whether a download of this item has already been requested with an API like -startDownloadingUbiquitousItemAtURL:error: (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadRequestedKey();

    /**
     * returns the name of this item's container as displayed to users.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemContainerDisplayNameKey();

    /**
     * this item has not been downloaded yet. Use startDownloadingUbiquitousItemAtURL:error: to download it.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingStatusNotDownloaded();

    /**
     * there is a local version of this item available. The most current version will get downloaded as soon as possible.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingStatusDownloaded();

    /**
     * there is a local version of this item and it is the most up-to-date version known to this device.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingStatusCurrent();

    /**
     * Notification sent after the current ubiquity identity has changed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquityIdentityDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileTypeDirectory();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileTypeRegular();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileTypeSymbolicLink();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileTypeSocket();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileTypeCharacterSpecial();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileTypeBlockSpecial();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileTypeUnknown();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileModificationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileReferenceCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileDeviceIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileOwnerAccountName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileGroupOwnerAccountName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFilePosixPermissions();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileSystemNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileSystemFileNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileExtensionHidden();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHFSCreatorCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileHFSTypeCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileImmutable();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileAppendOnly();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileCreationDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileOwnerAccountID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileGroupOwnerAccountID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileBusy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProtectionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProtectionNone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProtectionComplete();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProtectionCompleteUnlessOpen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProtectionCompleteUntilFirstUserAuthentication();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileSystemSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileSystemFreeSize();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileSystemNodes();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileSystemFreeNodes();

    /**
     * [@const] NSHTTPCookieName
     * <p>
     * Key for cookie name
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieName();

    /**
     * [@const] NSHTTPCookieValue
     * <p>
     * Key for cookie value
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieValue();

    /**
     * [@const] NSHTTPCookieOriginURL
     * <p>
     * Key for cookie origin URL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieOriginURL();

    /**
     * [@const] NSHTTPCookieVersion
     * <p>
     * Key for cookie version
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieVersion();

    /**
     * [@const] NSHTTPCookieDomain
     * <p>
     * Key for cookie domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieDomain();

    /**
     * [@const] NSHTTPCookiePath
     * <p>
     * Key for cookie path
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookiePath();

    /**
     * [@const] NSHTTPCookieSecure
     * <p>
     * Key for cookie secure flag
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieSecure();

    /**
     * [@const] NSHTTPCookieExpires
     * <p>
     * Key for cookie expiration date
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieExpires();

    /**
     * [@const] NSHTTPCookieComment
     * <p>
     * Key for cookie comment text
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieComment();

    /**
     * [@const] NSHTTPCookieCommentURL
     * <p>
     * Key for cookie comment URL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieCommentURL();

    /**
     * [@const] NSHTTPCookieDiscard
     * <p>
     * Key for cookie discard (session-only) flag
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieDiscard();

    /**
     * [@const] NSHTTPCookieMaximumAge
     * <p>
     * Key for cookie maximum age (an alternate way of specifying the expiration)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieMaximumAge();

    /**
     * [@const] NSHTTPCookiePort
     * <p>
     * Key for cookie ports
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookiePort();

    /**
     * [@const] NSHTTPCookieManagerAcceptPolicyChangedNotification
     * <p>
     * Name of notification that should be posted to the
     * distributed notification center whenever the accept cookies
     * preference is changed
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieManagerAcceptPolicyChangedNotification();

    /**
     * [@const] NSHTTPCookieManagerCookiesChangedNotification
     * <p>
     * Notification sent when the set of cookies changes
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieManagerCookiesChangedNotification();

    /**
     * The exception that is thrown when a key value coding operation fails. The exception's user info dictionary will contain at least two entries:
     * - @"NSTargetObjectUserInfoKey": the receiver of the failed KVC message.
     * - @"NSUnknownUserInfoKey": the key that was used in the failed KVC message.
     * <p>
     * The actual value of this constant string is "NSUnknownKeyException," to match the exceptions that are thrown by KVC methods that were deprecated in Mac OS 10.3.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndefinedKeyException();

    /**
     * Strings for the names of array operators supported by key-value coding. Only these string declarations are new in Mac OS 10.4. The actual support for array operators appeared in Mac OS 10.3. The values of these do not include "@" prefixes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSAverageKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCountKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDistinctUnionOfArraysKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDistinctUnionOfObjectsKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDistinctUnionOfSetsKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMaximumKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMinimumKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSumKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUnionOfArraysKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUnionOfObjectsKeyValueOperator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUnionOfSetsKeyValueOperator();

    /**
     * Keys for entries in change dictionaries. See the comments for -observeValueForKeyPath:ofObject:change:context: for more information.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSKeyValueChangeKindKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSKeyValueChangeNewKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSKeyValueChangeOldKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSKeyValueChangeIndexesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSKeyValueChangeNotificationIsPriorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvalidArchiveOperationException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvalidUnarchiveOperationException();

    /**
     * Archives created using the class method archivedDataWithRootObject used this key for the root object in the hierarchy of encoded objects. The NSKeyedUnarchiver class method unarchiveObjectWithData: will look for this root key as well. You can also use it as the key for the root object in your own archives.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSKeyedArchiveRootObjectKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvocationOperationVoidResultException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInvocationOperationCancelledException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPortDidBecomeInvalidNotification();

    /**
     * NSProcessInfoPowerStateDidChangeNotification is posted once any power usage mode of the system has changed. Once the notification is posted, use the isLowPowerModeEnabled property to retrieve the current state of the low power mode setting of the system.
     * <p>
     * When this notification is posted your application should attempt to reduce power usage by reducing potentially costly computation and other power using activities like network activity or keeping the screen on if the low power mode setting is enabled.
     * <p>
     * This notification is posted on the global dispatch queue. Register for it using the default notification center. The object associated with the notification is NSProcessInfo.processInfo.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProcessInfoPowerStateDidChangeNotification();

    /**
     * Keys for address components.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingJobTitleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingOrganizationKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingStreetKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingCityKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingStateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingZIPKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingCountryKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingPhoneKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingAirlineKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSTextCheckingFlightKey();

    /**
     * use this as the key for setting one of the following values for the security level of the target stream.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSocketSecurityLevelKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSocketSecurityLevelNone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSocketSecurityLevelSSLv2();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSocketSecurityLevelSSLv3();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSocketSecurityLevelTLSv1();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSocketSecurityLevelNegotiatedSSL();

    /**
     * Value is an NSDictionary containing the key/value pairs below. The dictionary returned from SystemConfiguration for SOCKS proxies will work without alteration.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyConfigurationKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyHostKey();

    /**
     * Value is an NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyPortKey();

    /**
     * Value is an NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyVersionKey();

    /**
     * Value is one of NSStreamSOCKSProxyVersion4 or NSStreamSOCKSProxyVersion5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyUserKey();

    /**
     * Value is an NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyPasswordKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyVersion4();

    /**
     * Value for NSStreamSOCKProxyVersionKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyVersion5();

    /**
     * Value for NSStreamSOCKProxyVersionKey
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamDataWrittenToMemoryStreamKey();

    /**
     * Key for obtaining the data written to a memory stream.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamFileCurrentOffsetKey();

    /**
     * NSString constants for error domains.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSocketSSLErrorDomain();

    /**
     * SSL errors are to be interpreted via <Security/SecureTransport.h>
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSErrorDomain();

    /**
     * Property key to specify the type of service for the stream.  This
     * allows the system to properly handle the request with respect to
     * routing, suspension behavior and other networking related attributes
     * appropriate for the given service type.  The service types supported
     * are documented below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamNetworkServiceType();

    /**
     * Supported network service types:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamNetworkServiceTypeVoIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamNetworkServiceTypeVideo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamNetworkServiceTypeBackground();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamNetworkServiceTypeVoice();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamNetworkServiceTypeCallSignaling();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSWillBecomeMultiThreadedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDidBecomeSingleThreadedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSThreadWillExitNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSystemTimeZoneDidChangeNotification();

    /**
     * [@const] NSURLProtectionSpaceHTTP
     * <p>
     * The protocol for HTTP
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceHTTP();

    /**
     * [@const] NSURLProtectionSpaceHTTPS
     * <p>
     * The protocol for HTTPS
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceHTTPS();

    /**
     * [@const] NSURLProtectionSpaceFTP
     * <p>
     * The protocol for FTP
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceFTP();

    /**
     * [@const] NSURLProtectionSpaceHTTPProxy
     * <p>
     * The proxy type for http proxies
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceHTTPProxy();

    /**
     * [@const] NSURLProtectionSpaceHTTPSProxy
     * <p>
     * The proxy type for https proxies
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceHTTPSProxy();

    /**
     * [@const] NSURLProtectionSpaceFTPProxy
     * <p>
     * The proxy type for ftp proxies
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceFTPProxy();

    /**
     * [@const] NSURLProtectionSpaceSOCKSProxy
     * <p>
     * The proxy type for SOCKS proxies
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceSOCKSProxy();

    /**
     * [@const] NSURLAuthenticationMethodDefault
     * <p>
     * The default authentication method for a protocol
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodDefault();

    /**
     * [@const] NSURLAuthenticationMethodHTTPBasic
     * <p>
     * HTTP basic authentication. Equivalent to
     * NSURLAuthenticationMethodDefault for http.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodHTTPBasic();

    /**
     * [@const] NSURLAuthenticationMethodHTTPDigest
     * <p>
     * HTTP digest authentication.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodHTTPDigest();

    /**
     * [@const] NSURLAuthenticationMethodHTMLForm
     * <p>
     * HTML form authentication. Applies to any protocol.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodHTMLForm();

    /**
     * [@const] NSURLAuthenticationMethodNTLM
     * <p>
     * NTLM authentication.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodNTLM();

    /**
     * [@const] NSURLAuthenticationMethodNegotiate
     * <p>
     * Negotiate authentication.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodNegotiate();

    /**
     * [@const] NSURLAuthenticationMethodClientCertificate
     * <p>
     * SSL Client certificate.  Applies to any protocol.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodClientCertificate();

    /**
     * [@const] NSURLAuthenticationMethodServerTrust
     * <p>
     * SecTrustRef validation required.  Applies to any protocol.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodServerTrust();

    /**
     * [@const] NSURLCredentialStorageChangedNotification
     * <p>
     * This notification is sent on the main thread whenever
     * the set of stored credentials changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCredentialStorageChangedNotification();

    /**
     * NSURLCredentialStorageRemoveSynchronizableCredentials - (NSNumber value)
     * A key that indicates either @YES or @NO that credentials which contain the NSURLCredentialPersistenceSynchronizable
     * attribute should be removed.  If the key is missing or the value is @NO, then no attempt will be made
     * to remove such a credential.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCredentialStorageRemoveSynchronizableCredentials();

    /**
     * Constants used by NSError to differentiate between "domains" of error codes, serving as a discriminator for error codes that originate from different subsystems or sources.
     * [@constant] NSURLErrorDomain Indicates an NSURL error.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorDomain();

    /**
     * [@const] NSURLErrorFailingURLErrorKey
     * <p>
     * The NSError userInfo dictionary key used to store and retrieve the URL which caused a load to fail.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorFailingURLErrorKey();

    /**
     * [@const] NSURLErrorFailingURLStringErrorKey
     * <p>
     * The NSError userInfo dictionary key used to store and retrieve the NSString object for the URL which caused a load to fail.
     * <p>
     * This constant supersedes NSErrorFailingURLStringKey, which was deprecated in Mac OS X 10.6.  Both constants refer to the same value for backward-compatibility, but this symbol name has a better prefix.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorFailingURLStringErrorKey();

    /**
     * [@const] NSErrorFailingURLStringKey
     * <p>
     * The NSError userInfo dictionary key used to store and retrieve the NSString object for the URL which caused a load to fail.
     * <p>
     * This constant is deprecated in Mac OS X 10.6, and is superseded by NSURLErrorFailingURLStringErrorKey.  Both constants refer to the same value for backward-compatibility, but the new symbol name has a better prefix.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSErrorFailingURLStringKey();

    /**
     * [@const] NSURLErrorFailingURLPeerTrustErrorKey
     * <p>
     * The NSError userInfo dictionary key used to store and retrieve the SecTrustRef object representing the state of a failed SSL handshake.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorFailingURLPeerTrustErrorKey();

    /**
     * [@const] NSURLErrorBackgroundTaskCancelledReasonKey
     * <p>
     * The NSError userInfo dictionary key used to store and retrieve the NSNumber corresponding to the reason why a background
     * NSURLSessionTask was cancelled
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorBackgroundTaskCancelledReasonKey();

    /**
     * NSGlobalDomain identifies a domain shared between all applications for a given user. NSGlobalDomain is automatically included in all search lists, after the entries for the search list's domain.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSGlobalDomain();

    /**
     * NSArgumentDomain identifies a search list entry containing the commandline arguments the application was launched with, if any. Arguments must be formatted as '-key plistvalue'. NSArgumentDomain is automatically included in all search lists, after forced defaults, but before all other entries. This can be useful for testing purposes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSArgumentDomain();

    /**
     * NSRegistrationDomain identifies a search list entry containing all defaults set with -registerDefaults:, if any. NSRegistrationDomain is automatically included as the final entry of all search lists.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRegistrationDomain();

    /**
     * NSUserDefaultsSizeLimitExceededNotification is posted on the main queue when more data is stored in user defaults than is allowed. Currently there is no limit for local user defaults except on tvOS, where a warning notification will be posted at 512kB, and the process terminated at 1MB. For ubiquitous defaults, the limit depends on the logged in iCloud user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserDefaultsSizeLimitExceededNotification();

    /**
     * NSUbiquitousUserDefaultsNoCloudAccountNotification is posted on the main queue to the default notification center when a cloud default is set, but no iCloud user is logged in.
     * <p>
     * This is not necessarily an error: ubiquitous defaults set when no iCloud user is logged in will be uploaded the next time one is available if configured to do so.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousUserDefaultsNoCloudAccountNotification();

    /**
     * NSUbiquitousUserDefaultsDidChangeAccountsNotification is posted on the main queue to the default notification center when the user changes the primary iCloud account. The keys and values in the local key-value store have been replaced with those from the new account, regardless of the relative timestamps.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousUserDefaultsDidChangeAccountsNotification();

    /**
     * NSUbiquitousUserDefaultsCompletedInitialSyncNotification is posted on the main queue when ubiquitous defaults finish downloading the first time a device is connected to an iCloud account, and when a user switches their primary iCloud account.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousUserDefaultsCompletedInitialSyncNotification();

    /**
     * NSUserDefaultsDidChangeNotification is posted whenever any user defaults changed within the current process, but is not posted when ubiquitous defaults change, or when an outside process changes defaults. Using key-value observing to register observers for the specific keys of interest will inform you of all updates, regardless of where they're from.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserDefaultsDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSNegateBooleanTransformerName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSIsNilTransformerName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSIsNotNilTransformerName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUnarchiveFromDataTransformerName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSKeyedUnarchiveFromDataTransformerName();

    /**
     * for use with NSError.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSXMLParserErrorDomain();

    /**
     * Key in userInfo. Value is a dictionary of NSExtensionItems and associated NSError instances.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionItemsAndErrorsKey();

    /**
     * The host process will enter the foreground
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionHostWillEnterForegroundNotification();

    /**
     * The host process did enter the background
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionHostDidEnterBackgroundNotification();

    /**
     * The host process will resign active status (stop receiving events), the extension may be suspended
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionHostWillResignActiveNotification();

    /**
     * The host process did become active (begin receiving events)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionHostDidBecomeActiveNotification();

    /**
     * NSValue of CGSize or NSSize, specifies image size in pixels.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSItemProviderPreferredImageSizeKey();

    /**
     * If JavaScript code passes an object to its completionFunction, it will be placed into an item of type kUTTypePropertyList, containing an NSDictionary, under this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionJavaScriptPreprocessingResultsKey();

    /**
     * Arguments to be passed to a JavaScript finalize method should be placed in an item of type kUTTypePropertyList, containing an NSDictionary, under this key.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionJavaScriptFinalizeArgumentKey();

    /**
     * Constant used by NSError to distinguish errors belonging to the NSItemProvider domain
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSItemProviderErrorDomain();

    /**
     * Keys corresponding to properties exposed on the NSExtensionItem interface
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionItemAttributedTitleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionItemAttributedContentTextKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionItemAttachmentsKey();

    /**
     * This tag scheme classifies tokens according to their broad general type:  word, punctuation, whitespace, etc.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeTokenType();

    /**
     * This tag scheme classifies tokens according to class:  part of speech for words, type of punctuation or whitespace, etc.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeLexicalClass();

    /**
     * This tag scheme classifies tokens as to whether they are part of named entities of various types or not.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeNameType();

    /**
     * This tag scheme follows NSLinguisticTagSchemeNameType for names, NSLinguisticTagSchemeLexicalClass for all other tokens.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeNameTypeOrLexicalClass();

    /**
     * This tag scheme supplies a stem form for each word token (if known).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeLemma();

    /**
     * This tag scheme tags tokens according to their most likely language (if known).
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeLanguage();

    /**
     * This tag scheme tags tokens according to their script.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeScript();

    /**
     * Tokens considered to be words or word-like linguistic items.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagWord();

    /**
     * Tokens made up of punctuation.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagPunctuation();

    /**
     * Tokens made up of whitespace of all sorts.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagWhitespace();

    /**
     * Other tokens, including non-linguistic items such as symbols.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagOther();

    /**
     * Tags for NSLinguisticTagSchemeLexicalClass
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagNoun();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagVerb();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagAdjective();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagAdverb();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagPronoun();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagDeterminer();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagParticle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagPreposition();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagConjunction();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagInterjection();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagClassifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagIdiom();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagOtherWord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSentenceTerminator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagOpenQuote();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagCloseQuote();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagOpenParenthesis();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagCloseParenthesis();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagWordJoiner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagDash();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagOtherPunctuation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagParagraphBreak();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagOtherWhitespace();

    /**
     * Tags for NSLinguisticTagSchemeNameType
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagPersonalName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagPlaceName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagOrganizationName();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemFSNameKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemDisplayNameKey();

    /**
     * NSURL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemURLKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemPathKey();

    /**
     * file size in bytes; unsigned long long NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemFSSizeKey();

    /**
     * NSDate
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemFSCreationDateKey();

    /**
     * NSDate
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemFSContentChangeDateKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemContentTypeKey();

    /**
     * NSArray of NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemContentTypeTreeKey();

    /**
     * boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemIsUbiquitousKey();

    /**
     * boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemHasUnresolvedConflictsKey();

    /**
     * boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsDownloadedKey();

    /**
     * NSString ; download status of this item. The values are the three strings defined below:
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingStatusKey();

    /**
     * this item has not been downloaded yet. Use startDownloadingUbiquitousItemAtURL:error: to download it.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingStatusNotDownloaded();

    /**
     * there is a local version of this item available. The most current version will get downloaded as soon as possible.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingStatusDownloaded();

    /**
     * there is a local version of this item and it is the most up-to-date version known to this device.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingStatusCurrent();

    /**
     * boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsDownloadingKey();

    /**
     * boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsUploadedKey();

    /**
     * boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsUploadingKey();

    /**
     * double NSNumber; range [0..100]
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemPercentDownloadedKey();

    /**
     * double NSNumber; range [0..100]
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemPercentUploadedKey();

    /**
     * NSError; the error when downloading the item from iCloud failed, see the NSUbiquitousFile section in FoundationErrors.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingErrorKey();

    /**
     * NSError; the error when uploading the item to iCloud failed, see the NSUbiquitousFile section in FoundationErrors.h
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemUploadingErrorKey();

    /**
     * boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadRequestedKey();

    /**
     * boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsExternalDocumentKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemContainerDisplayNameKey();

    /**
     * NSURL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemURLInLocalContainerKey();

    /**
     * notifications
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryDidStartGatheringNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryGatheringProgressNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryDidFinishGatheringNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryDidUpdateNotification();

    /**
     * keys for use with notification info dictionary
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryUpdateAddedItemsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryUpdateChangedItemsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryUpdateRemovedItemsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryResultContentRelevanceAttribute();

    /**
     * "Documents" subdirectory in the application's Ubiquity container
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryUbiquitousDocumentsScope();

    /**
     * application's Ubiquity container, excluding the "Documents" subdirectory
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryUbiquitousDataScope();

    /**
     * documents from outside the application's container that are accessible without user interaction. NSMetadataItemURLKey attributes of results are security-scoped NSURLs.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryAccessibleUbiquitousExternalDocumentsScope();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSNetServicesErrorCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSNetServicesErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousKeyValueStoreDidChangeExternallyNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousKeyValueStoreChangeReasonKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousKeyValueStoreChangedKeysKey();

    /**
     * This key is set on the user info dictionary of the NSUndoManagerDidCloseUndoGroupNotification, with a NSNumber boolean value of YES, if the undo group as a whole is discardable.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerGroupIsDiscardableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerCheckpointNotification();

    /**
     * This is called before an undo group is begun or ended so any
     * clients that need to lazily register undos can do so in the
     * correct group.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerWillUndoChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerWillRedoChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerDidUndoChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerDidRedoChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerDidOpenUndoGroupNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerWillCloseUndoGroupNotification();

    /**
     * This notification is sent after an undo group closes. It should be safe to undo at this time.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerDidCloseUndoGroupNotification();

    /**
     * -1LL
     */
    @Generated
    @CVariable()
    public static native long NSURLSessionTransferSizeUnknown();

    @Generated
    @CVariable()
    public static native float NSURLSessionTaskPriorityDefault();

    @Generated
    @CVariable()
    public static native float NSURLSessionTaskPriorityLow();

    @Generated
    @CVariable()
    public static native float NSURLSessionTaskPriorityHigh();

    /**
     * Key in the userInfo dictionary of an NSError received during a failed download.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLSessionDownloadTaskResumeData();

    /**
     * The activity type used when continuing from a web browsing session to either a web browser or a native app. Only activities of this type can be continued from a web browser to a native app.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserActivityTypeBrowsingWeb();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_NSGetUncaughtExceptionHandler_ret {
        @Generated
        void call_NSGetUncaughtExceptionHandler_ret(NSException exception);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_NSSetUncaughtExceptionHandler {
        @Generated
        void call_NSSetUncaughtExceptionHandler(NSException exception);
    }

    /**
     * NSString. This provides a string which will be shown when constructing the debugDescription of the NSError, to be used when debugging or when formatting the error with %@.  This string will never be used in localizedDescription, so will not be shown to the user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDebugDescriptionErrorKey();

    /**
     * NSString, a complete sentence (or more) describing what failed.  Setting a value for this key in userInfo dictionary of errors received from framework APIs is a good way to customize and fine tune the localizedDescription of an NSError.  As an example, for Foundation error code NSFileWriteOutOfSpaceError, setting the value of this key to "The image library could not be saved." will allow the localizedDescription of the error to come out as "The image library could not be saved. The volume Macintosh HD is out of space." rather than the default (say) “You can't save the file ImgDatabaseV2 because the volume Macintosh HD is out of space."
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedFailureErrorKey();

    /**
     * true if the volume supports making files immutable with the NSURLIsUserImmutableKey or NSURLIsSystemImmutableKey properties (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsImmutableFilesKey();

    /**
     * true if the volume supports setting POSIX access permissions with the NSURLFileSecurityKey property (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsAccessPermissionsKey();

    /**
     * (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeAvailableCapacityForImportantUsageKey();

    /**
     * (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeAvailableCapacityForOpportunisticUsageKey();

    /**
     * true if the ubiquitous item is shared. (Read-only, value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsSharedKey();

    /**
     * returns the current user's role for this shared item, or nil if not shared. (Read-only, value type NSString). Possible values below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemCurrentUserRoleKey();

    /**
     * returns the permissions for the current user, or nil if not shared. (Read-only, value type NSString). Possible values below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemCurrentUserPermissionsKey();

    /**
     * returns a NSPersonNameComponents, or nil if the current user. (Read-only, value type NSPersonNameComponents)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemOwnerNameComponentsKey();

    /**
     * returns a NSPersonNameComponents for the most recent editor of the document, or nil if it is the current user. (Read-only, value type NSPersonNameComponents)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey();

    /**
     * the current user is the owner of this shared item.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemRoleOwner();

    /**
     * the current user is a participant of this shared item.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemRoleParticipant();

    /**
     * the current user is only allowed to read this item
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemPermissionsReadOnly();

    /**
     * the current user is allowed to both read and write this item
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemPermissionsReadWrite();

    /**
     * NSProcessInfoThermalStateDidChangeNotification is posted once the thermal state of the system has changed. Once the notification is posted, use the thermalState property to retrieve the current thermal state of the system.
     * <p>
     * You can use this opportunity to take corrective action in your application to help cool the system down. Work that could be done in the background or at opportunistic times should be using the Quality of Service levels in NSOperation or the NSBackgroundActivityScheduler API.
     * <p>
     * This notification is posted on the global dispatch queue. Register for it using the default notification center. The object associated with the notification is NSProcessInfo.processInfo.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProcessInfoThermalStateDidChangeNotification();

    /**
     * true if the ubiquitous item is shared. (value type boolean NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsSharedKey();

    /**
     * returns the current user's role for this shared item, or nil if not shared. (value type NSString). Possible values below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemCurrentUserRoleKey();

    /**
     * returns the permissions for the current user, or nil if not shared. (value type NSString). Possible values below.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey();

    /**
     * returns a NSPersonNameComponents, or nil if the current user. (value type NSPersonNameComponents)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemOwnerNameComponentsKey();

    /**
     * returns a NSPersonNameComponents for the most recent editor of the document, or nil if it is the current user. (Read-only, value type NSPersonNameComponents)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey();

    /**
     * the current user is the owner of this shared item.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemRoleOwner();

    /**
     * the current user is a participant of this shared item.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemRoleParticipant();

    /**
     * the current user is only allowed to read this item
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemPermissionsReadOnly();

    /**
     * the current user is allowed to both read and write this item
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemPermissionsReadWrite();

    @Generated
    @CFunction
    public static native void NSFreeHashTable(NSHashTable<?> table);

    @Generated
    @CFunction
    public static native void NSResetHashTable(NSHashTable<?> table);

    @Generated
    @CFunction
    public static native boolean NSCompareHashTables(NSHashTable<?> table1, NSHashTable<?> table2);

    @Generated
    @CFunction
    public static native NSHashTable<?> NSCopyHashTableWithZone(NSHashTable<?> table, VoidPtr zone);

    @Generated
    @CFunction
    public static native VoidPtr NSHashGet(NSHashTable<?> table, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void NSHashInsert(NSHashTable<?> table, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void NSHashInsertKnownAbsent(NSHashTable<?> table, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native VoidPtr NSHashInsertIfAbsent(NSHashTable<?> table, ConstVoidPtr pointer);

    @Generated
    @CFunction
    public static native void NSHashRemove(NSHashTable<?> table, ConstVoidPtr pointer);

    @Generated
    @CFunction
    @ByValue
    public static native NSHashEnumerator NSEnumerateHashTable(NSHashTable<?> table);

    @Generated
    @CFunction
    public static native VoidPtr NSNextHashEnumeratorItem(
            @UncertainArgument("Options: reference, array Fallback: reference") NSHashEnumerator enumerator);

    @Generated
    @CFunction
    public static native void NSEndHashTableEnumeration(
            @UncertainArgument("Options: reference, array Fallback: reference") NSHashEnumerator enumerator);

    @Generated
    @CFunction
    @NUInt
    public static native long NSCountHashTable(NSHashTable<?> table);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromHashTable(NSHashTable<?> table);

    @Generated
    @CFunction
    public static native NSArray<?> NSAllHashTableObjects(NSHashTable<?> table);

    @Generated
    @CFunction
    public static native NSHashTable<?> NSCreateHashTableWithZone(@ByValue NSHashTableCallBacks callBacks,
            @NUInt long capacity, VoidPtr zone);

    @Generated
    @CFunction
    public static native NSHashTable<?> NSCreateHashTable(@ByValue NSHashTableCallBacks callBacks,
            @NUInt long capacity);

    @Generated
    @CFunction
    public static native void NSFreeMapTable(NSMapTable<?, ?> table);

    @Generated
    @CFunction
    public static native void NSResetMapTable(NSMapTable<?, ?> table);

    @Generated
    @CFunction
    public static native boolean NSCompareMapTables(NSMapTable<?, ?> table1, NSMapTable<?, ?> table2);

    @Generated
    @CFunction
    public static native NSMapTable<?, ?> NSCopyMapTableWithZone(NSMapTable<?, ?> table, VoidPtr zone);

    @Generated
    @CFunction
    public static native boolean NSMapMember(NSMapTable<?, ?> table, ConstVoidPtr key, Ptr<VoidPtr> originalKey,
            Ptr<VoidPtr> value);

    @Generated
    @CFunction
    public static native VoidPtr NSMapGet(NSMapTable<?, ?> table, ConstVoidPtr key);

    @Generated
    @CFunction
    public static native void NSMapInsert(NSMapTable<?, ?> table, ConstVoidPtr key, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void NSMapInsertKnownAbsent(NSMapTable<?, ?> table, ConstVoidPtr key, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native VoidPtr NSMapInsertIfAbsent(NSMapTable<?, ?> table, ConstVoidPtr key, ConstVoidPtr value);

    @Generated
    @CFunction
    public static native void NSMapRemove(NSMapTable<?, ?> table, ConstVoidPtr key);

    @Generated
    @CFunction
    @ByValue
    public static native NSMapEnumerator NSEnumerateMapTable(NSMapTable<?, ?> table);

    @Generated
    @CFunction
    public static native boolean NSNextMapEnumeratorPair(
            @UncertainArgument("Options: reference, array Fallback: reference") NSMapEnumerator enumerator,
            Ptr<VoidPtr> key, Ptr<VoidPtr> value);

    @Generated
    @CFunction
    public static native void NSEndMapTableEnumeration(
            @UncertainArgument("Options: reference, array Fallback: reference") NSMapEnumerator enumerator);

    @Generated
    @CFunction
    @NUInt
    public static native long NSCountMapTable(NSMapTable<?, ?> table);

    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringFromMapTable(NSMapTable<?, ?> table);

    @Generated
    @CFunction
    public static native NSArray<?> NSAllMapTableKeys(NSMapTable<?, ?> table);

    @Generated
    @CFunction
    public static native NSArray<?> NSAllMapTableValues(NSMapTable<?, ?> table);

    @Generated
    @CFunction
    public static native NSMapTable<?, ?> NSCreateMapTableWithZone(@ByValue NSMapTableKeyCallBacks keyCallBacks,
            @ByValue NSMapTableValueCallBacks valueCallBacks, @NUInt long capacity, VoidPtr zone);

    @Generated
    @CFunction
    public static native NSMapTable<?, ?> NSCreateMapTable(@ByValue NSMapTableKeyCallBacks keyCallBacks,
            @ByValue NSMapTableValueCallBacks valueCallBacks, @NUInt long capacity);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInconsistentArchiveException();

    @Generated
    @CVariable()
    @ByValue
    public static native NSHashTableCallBacks NSNonOwnedPointerHashCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSHashTableCallBacks NSNonRetainedObjectHashCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSHashTableCallBacks NSObjectHashCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSHashTableCallBacks NSOwnedObjectIdentityHashCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSHashTableCallBacks NSOwnedPointerHashCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSHashTableCallBacks NSPointerToStructHashCallBacks();

    /**
     * [@const] NSHTTPCookieSameSitePolicy
     * <p>
     * Key for cookie same site
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieSameSitePolicy();

    /**
     * [@const] NSHTTPCookieSameSiteLax
     * <p>
     * String constant "lax" to be used as a value for the property key NSHTTPCookieSameSite
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieSameSiteLax();

    /**
     * [@const] NSHTTPCookieSameSiteStrict
     * <p>
     * String constant "strict" to be used as a value for the property key NSHTTPCookieSameSite
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieSameSiteStrict();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableKeyCallBacks NSNonOwnedPointerMapKeyCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableKeyCallBacks NSNonOwnedPointerOrNullMapKeyCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableKeyCallBacks NSNonRetainedObjectMapKeyCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableKeyCallBacks NSObjectMapKeyCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableKeyCallBacks NSOwnedPointerMapKeyCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableKeyCallBacks NSIntMapKeyCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableValueCallBacks NSNonOwnedPointerMapValueCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableValueCallBacks NSObjectMapValueCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableValueCallBacks NSNonRetainedObjectMapValueCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableValueCallBacks NSOwnedPointerMapValueCallBacks();

    @Generated
    @CVariable()
    @ByValue
    public static native NSMapTableValueCallBacks NSIntMapValueCallBacks();

    /**
     * [@const] NSURLErrorNetworkUnavailableReasonKey
     * <p>
     * The NSErrorUserInfoKey used to store and retrieve the NSNumber object corresponding to the reason why the network is unavailable when the task failed due to unsatisfiable network constraints.  See the NSURLErrorNetworkUnavailableReason enum for details.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorNetworkUnavailableReasonKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSecureUnarchiveFromDataTransformerName();

    /**
     * File type (UTType) for the resource (Read-only, value type UTType)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLContentTypeKey();

    /**
     * A 64-bit value assigned by APFS that identifies a file's content data stream. Only cloned files and their originals can have the same identifier. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileContentIdentifierKey();

    /**
     * True for cloned files and their originals that may share all, some, or no data blocks. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLMayShareFileContentKey();

    /**
     * True if the file has extended attributes. False guarantees there are none. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLMayHaveExtendedAttributesKey();

    /**
     * True if the file can be deleted by the file system when asked to free space. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsPurgeableKey();

    /**
     * True if the file has sparse regions. (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsSparseKey();

    /**
     * True if the volume supports the File Protection attribute (see NSURLFileProtectionKey). (Read-only, value type NSNumber)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsFileProtectionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileOperationKindUploading();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileOperationKindDuplicating();

    /**
     * a NSNumber wrapping a value of type NSInlinePresentationIntent
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInlinePresentationIntentAttributeName();

    /**
     * a NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSAlternateDescriptionAttributeName();

    /**
     * a NSURL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSImageURLAttributeName();

    /**
     * a NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLanguageIdentifierAttributeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSReplacementIndexAttributeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMorphologyAttributeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInflectionRuleAttributeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSInflectionAlternativeAttributeName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPresentationIntentAttributeName();

    /**
     * Key in userInfo. A recommended standard way to embed a list of several NSErrors from underlying calls. The value of this key should be an NSArray of NSError. This value is independent from the value of `NSUnderlyingErrorKey` - neither, one, or both may be set.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMultipleUnderlyingErrorsKey();

    /**
     * true if the item is excluded from sync, which means it is locally on disk but won't be available on the server. An excluded item is no longer ubiquitous. (Read-write, value type boolean NSNumber
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsExcludedFromSyncKey();
}
