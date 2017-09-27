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
    @Generated @NUInt public static final long NSHashTableStrongMemory = 0x0000000000000000L;
    @Generated @NUInt public static final long NSHashTableCopyIn = 0x0000000000010000L;
    @Generated @NUInt public static final long NSHashTableObjectPointerPersonality = 0x0000000000000200L;
    @Generated @NUInt public static final long NSHashTableWeakMemory = 0x0000000000000005L;
    @Generated @NUInt public static final long NSMapTableStrongMemory = 0x0000000000000000L;
    @Generated @NUInt public static final long NSMapTableCopyIn = 0x0000000000010000L;
    @Generated @NUInt public static final long NSMapTableObjectPointerPersonality = 0x0000000000000200L;
    @Generated @NUInt public static final long NSMapTableWeakMemory = 0x0000000000000005L;
    @Generated @NInt public static final long NSOperationQueueDefaultMaxConcurrentOperationCount = 0xFFFFFFFFFFFFFFFFL;
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

    @Generated
    @CFunction
    public static native void NSDecimalRound(VoidPtr result, VoidPtr number, @NInt long scale,
            @NUInt long roundingMode);

    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalNormalize(VoidPtr number1, VoidPtr number2, @NUInt long roundingMode);

    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalAdd(VoidPtr result, VoidPtr leftOperand, VoidPtr rightOperand,
            @NUInt long roundingMode);

    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalSubtract(VoidPtr result, VoidPtr leftOperand, VoidPtr rightOperand,
            @NUInt long roundingMode);

    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalMultiply(VoidPtr result, VoidPtr leftOperand, VoidPtr rightOperand,
            @NUInt long roundingMode);

    @Generated
    @CFunction
    @NUInt
    public static native long NSDecimalDivide(VoidPtr result, VoidPtr leftOperand, VoidPtr rightOperand,
            @NUInt long roundingMode);

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionSuggestedEncodingsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionDisallowedEncodingsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionUseOnlySuggestedEncodingsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionAllowLossyKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionFromWindowsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionLossySubstitutionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingDetectionLikelyLanguageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCharacterConversionException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSParseErrorException();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressEstimatedTimeRemainingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressThroughputKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressKindFile();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileOperationKindKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProgressFileURLKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLoadedClasses();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSBundleResourceRequestLowDiskSpaceNotification();

    @Generated
    @CVariable()
    public static native double NSBundleResourceRequestLoadingPriorityUrgent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSSystemClockDidChangeNotification();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierIslamicTabular();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarIdentifierIslamicUmmAlQura();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCalendarDayChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCurrentLocaleDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleLanguageCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCountryCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleScriptCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleVariantCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleExemplarCharacterSet();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCalendar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCollationIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleUsesMetricSystem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleMeasurementSystem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleDecimalSeparator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleGroupingSeparator();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCurrencySymbol();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCurrencyCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleCollatorIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleQuotationBeginDelimiterKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleQuotationEndDelimiterKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleAlternateQuotationBeginDelimiterKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocaleAlternateQuotationEndDelimiterKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSPersonNameComponentDelimiter();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSCocoaErrorDomain();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUnderlyingErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedDescriptionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedFailureReasonErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedRecoverySuggestionErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedRecoveryOptionsErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRecoveryAttempterErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHelpAnchorErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStringEncodingErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileScheme();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLKeysOfUnsetValuesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLocalizedNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsRegularFileKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsDirectoryKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsSymbolicLinkKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsVolumeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsPackageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsApplicationKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsSystemImmutableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsUserImmutableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsHiddenKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLHasHiddenExtensionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCreationDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLContentAccessDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLContentModificationDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAttributeModificationDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLinkCountKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLParentDirectoryURLKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeURLKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLTypeIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLocalizedTypeDescriptionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLabelNumberKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLabelColorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLLocalizedLabelKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLEffectiveIconKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCustomIconKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLPreferredIOBlockSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsReadableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsWritableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsExecutableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileSecurityKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsExcludedFromBackupKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLPathKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCanonicalPathKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsMountTriggerKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLGenerationIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLDocumentIdentifierKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAddedToDirectoryDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileResourceTypeKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLThumbnailDictionaryKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSThumbnail1024x1024SizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileAllocatedSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLTotalFileSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLTotalFileAllocatedSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsAliasFileKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionNone();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionComplete();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionCompleteUnlessOpen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLFileProtectionCompleteUntilFirstUserAuthentication();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeLocalizedFormatDescriptionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeTotalCapacityKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeAvailableCapacityKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeResourceCountKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsPersistentIDsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsSymbolicLinksKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsHardLinksKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsJournalingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsJournalingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsSparseFilesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsZeroRunsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsCaseSensitiveNamesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsCasePreservedNamesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsRootDirectoryDatesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsVolumeSizesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsRenamingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsAdvisoryFileLockingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsExtendedSecurityKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsBrowsableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeMaximumFileSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsEjectableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsRemovableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsInternalKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsAutomountedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsLocalKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsReadOnlyKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeCreationDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeURLForRemountingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeUUIDStringKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeLocalizedNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsEncryptedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeIsRootFileSystemKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsCompressionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsFileCloningKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsSwapRenamingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsExclusiveRenamingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLIsUbiquitousItemKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemHasUnresolvedConflictsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsDownloadedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsDownloadingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsUploadedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsUploadingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemPercentDownloadedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemPercentUploadedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingStatusKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemUploadingErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadRequestedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemContainerDisplayNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingStatusNotDownloaded();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingStatusDownloaded();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemDownloadingStatusCurrent();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieValue();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieOriginURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieVersion();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookiePath();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieSecure();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieExpires();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieComment();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieCommentURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieDiscard();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieMaximumAge();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookiePort();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieManagerAcceptPolicyChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSHTTPCookieManagerCookiesChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndefinedKeyException();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProcessInfoPowerStateDidChangeNotification();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyConfigurationKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyHostKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyPortKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyVersionKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyUserKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyPasswordKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyVersion4();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSProxyVersion5();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamDataWrittenToMemoryStreamKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamFileCurrentOffsetKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSocketSSLErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamSOCKSErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSStreamNetworkServiceType();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceHTTP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceHTTPS();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceFTP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceHTTPProxy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceHTTPSProxy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceFTPProxy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLProtectionSpaceSOCKSProxy();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodDefault();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodHTTPBasic();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodHTTPDigest();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodHTMLForm();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodNTLM();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodNegotiate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodClientCertificate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLAuthenticationMethodServerTrust();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCredentialStorageChangedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLCredentialStorageRemoveSynchronizableCredentials();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorFailingURLErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorFailingURLStringErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSErrorFailingURLStringKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorFailingURLPeerTrustErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLErrorBackgroundTaskCancelledReasonKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSGlobalDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSArgumentDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSRegistrationDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserDefaultsSizeLimitExceededNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousUserDefaultsNoCloudAccountNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousUserDefaultsDidChangeAccountsNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUbiquitousUserDefaultsCompletedInitialSyncNotification();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSXMLParserErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionItemsAndErrorsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionHostWillEnterForegroundNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionHostDidEnterBackgroundNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionHostWillResignActiveNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionHostDidBecomeActiveNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSItemProviderPreferredImageSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionJavaScriptPreprocessingResultsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSExtensionJavaScriptFinalizeArgumentKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSItemProviderErrorDomain();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeTokenType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeLexicalClass();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeNameType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeNameTypeOrLexicalClass();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeLemma();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeLanguage();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagSchemeScript();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagWord();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagPunctuation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagWhitespace();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLinguisticTagOther();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemFSNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemDisplayNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemURLKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemPathKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemFSSizeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemFSCreationDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemFSContentChangeDateKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemContentTypeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemContentTypeTreeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataItemIsUbiquitousKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemHasUnresolvedConflictsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsDownloadedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingStatusKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingStatusNotDownloaded();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingStatusDownloaded();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingStatusCurrent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsDownloadingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsUploadedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsUploadingKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemPercentDownloadedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemPercentUploadedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadingErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemUploadingErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemDownloadRequestedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsExternalDocumentKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemContainerDisplayNameKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemURLInLocalContainerKey();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryUbiquitousDocumentsScope();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataQueryUbiquitousDataScope();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerGroupIsDiscardableKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerCheckpointNotification();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUndoManagerDidCloseUndoGroupNotification();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLSessionDownloadTaskResumeData();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserActivityTypeBrowsingWeb();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_NSGetUncaughtExceptionHandler_ret {
        @Generated
        void call_NSGetUncaughtExceptionHandler_ret(NSException arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_NSSetUncaughtExceptionHandler {
        @Generated
        void call_NSSetUncaughtExceptionHandler(NSException arg0);
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSDebugDescriptionErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSLocalizedFailureErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsImmutableFilesKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeSupportsAccessPermissionsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeAvailableCapacityForImportantUsageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLVolumeAvailableCapacityForOpportunisticUsageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousItemIsSharedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemCurrentUserRoleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemCurrentUserPermissionsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemOwnerNameComponentsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemMostRecentEditorNameComponentsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemRoleOwner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemRoleParticipant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemPermissionsReadOnly();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSURLUbiquitousSharedItemPermissionsReadWrite();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSProcessInfoThermalStateDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousItemIsSharedKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemCurrentUserRoleKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemCurrentUserPermissionsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemOwnerNameComponentsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemMostRecentEditorNameComponentsKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemRoleOwner();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemRoleParticipant();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemPermissionsReadOnly();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSMetadataUbiquitousSharedItemPermissionsReadWrite();
}
