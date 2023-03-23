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
import apple.contacts.protocol.CNKeyDescriptor;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.uikit.NSStringDrawingContext;
import apple.uikit.UIFont;
import apple.uniformtypeidentifiers.UTType;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSString extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding, NSItemProviderReading,
        NSItemProviderWriting, CKRecordValue, CNKeyDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected NSString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSString alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSString allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("availableStringEncodings")
    public static native ConstNUIntPtr availableStringEncodings();

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

    /**
     * Should be rarely used
     */
    @Generated
    @Selector("defaultCStringEncoding")
    @NUInt
    public static native long defaultCStringEncoding();

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
    @Selector("localizedNameOfStringEncoding:")
    public static native String localizedNameOfStringEncoding(@NUInt long encoding);

    @Generated
    @Variadic()
    @Selector("localizedStringWithFormat:")
    public static native NSString localizedStringWithFormat(String format, Object... varargs);

    /**
     * Use -[NSString localizedUserNotificationStringForKey:arguments:] to provide a string that will be localized at
     * the time that the notification is presented.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("localizedUserNotificationStringForKey:arguments:")
    public static native String localizedUserNotificationStringForKeyArguments(String key, NSArray<?> arguments);

    @Generated
    @Owned
    @Selector("new")
    public static native NSString new_objc();

    @Generated
    @Selector("pathWithComponents:")
    public static native String pathWithComponents(NSArray<String> components);

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
    @Selector("string")
    public static native NSString string();

    /**
     * This API is used to detect the string encoding of a given raw data. It can also do lossy string conversion. It
     * converts the data to a string in the detected string encoding. The data object contains the raw bytes, and the
     * option dictionary contains the hints and parameters for the analysis. The opts dictionary can be nil. If the
     * string parameter is not NULL, the string created by the detected string encoding is returned. The lossy
     * substitution string is emitted in the output string for characters that could not be converted when lossy
     * conversion is enabled. The usedLossyConversion indicates if there is any lossy conversion in the resulted string.
     * If no encoding can be detected, 0 is returned.
     * 
     * The possible items for the dictionary are:
     * 1) an array of suggested string encodings (without specifying the 3rd option in this list, all string encodings
     * are considered but the ones in the array will have a higher preference; moreover, the order of the encodings in
     * the array is important: the first encoding has a higher preference than the second one in the array)
     * 2) an array of string encodings not to use (the string encodings in this list will not be considered at all)
     * 3) a boolean option indicating whether only the suggested string encodings are considered
     * 4) a boolean option indicating whether lossy is allowed
     * 5) an option that gives a specific string to substitude for mystery bytes
     * 6) the current user's language
     * 7) a boolean option indicating whether the data is generated by Windows
     * 
     * If the values in the dictionary have wrong types (for example, the value of
     * NSStringEncodingDetectionSuggestedEncodingsKey is not an array), an exception is thrown.
     * If the values in the dictionary are unknown (for example, the value in the array of suggested string encodings is
     * not a valid encoding), the values will be ignored.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:")
    @NUInt
    public static native long stringEncodingForDataEncodingOptionsConvertedStringUsedLossyConversion(NSData data,
            NSDictionary<String, ?> opts, @ReferenceInfo(type = NSString.class) Ptr<NSString> string,
            BoolPtr usedLossyConversion);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use +stringWithCString:encoding: instead
     */
    @Generated
    @Deprecated
    @Selector("stringWithCString:")
    public static native NSString stringWithCString(ConstBytePtr bytes);

    @Generated
    @Selector("stringWithCString:encoding:")
    public static native NSString stringWithCStringEncoding(ConstBytePtr cString, @NUInt long enc);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use +stringWithCString:encoding:
     */
    @Generated
    @Deprecated
    @Selector("stringWithCString:length:")
    public static native NSString stringWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    @Generated
    @Selector("stringWithCharacters:length:")
    public static native NSString stringWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use +stringWithContentsOfFile:encoding:error: instead
     */
    @Generated
    @Deprecated
    @Selector("stringWithContentsOfFile:")
    public static native NSString stringWithContentsOfFile(String path);

    @Generated
    @Selector("stringWithContentsOfFile:encoding:error:")
    public static native NSString stringWithContentsOfFileEncodingError(String path, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithContentsOfFile:usedEncoding:error:")
    public static native NSString stringWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use +stringWithContentsOfURL:encoding:error: instead
     */
    @Generated
    @Deprecated
    @Selector("stringWithContentsOfURL:")
    public static native NSString stringWithContentsOfURL(NSURL url);

    @Generated
    @Selector("stringWithContentsOfURL:encoding:error:")
    public static native NSString stringWithContentsOfURLEncodingError(NSURL url, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithContentsOfURL:usedEncoding:error:")
    public static native NSString stringWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("stringWithFormat:")
    public static native NSString stringWithFormat(String format, Object... varargs);

    @Generated
    @Selector("stringWithString:")
    public static native NSString stringWithString(String string);

    @Generated
    @Selector("stringWithUTF8String:")
    public static native NSString stringWithUTF8String(ConstBytePtr nullTerminatedCString);

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
     * Convenience to return null-terminated UTF8 representation
     */
    @Generated
    @Selector("UTF8String")
    public native ConstBytePtr UTF8String();

    /**
     * Skips initial space characters (whitespaceSet), or optional -/+ sign followed by zeroes. Returns YES on
     * encountering one of "Y", "y", "T", "t", or a digit 1-9. It ignores any trailing characters.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("boolValue")
    public native boolean boolValue();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("boundingRectWithSize:options:attributes:context:")
    @ByValue
    public native CGRect boundingRectWithSizeOptionsAttributesContext(@ByValue CGSize size, @NInt long options,
            NSDictionary<String, ?> attributes, NSStringDrawingContext context);

    /**
     * The following methods are deprecated and will be removed from this header file in the near future. These methods
     * use NSString.defaultCStringEncoding as the encoding to convert to, which means the results depend on the user's
     * language and potentially other settings. This might be appropriate in some cases, but often these methods are
     * misused, resulting in issues when running in languages other then English. UTF8String in general is a much better
     * choice when converting arbitrary NSStrings into 8-bit representations. Additional potential replacement methods
     * are being introduced in NSString as appropriate.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -cStringUsingEncoding: instead
     */
    @Generated
    @Deprecated
    @Selector("cString")
    public native ConstBytePtr cString();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -lengthOfBytesUsingEncoding: instead
     */
    @Generated
    @Deprecated
    @Selector("cStringLength")
    @NUInt
    public native long cStringLength();

    /**
     * "Autoreleased"; NULL return if encoding conversion not possible; for performance reasons, lifetime of this should
     * not be considered longer than the lifetime of the receiving string (if the receiver string is freed, this might
     * go invalid then, before the end of the autorelease scope). Use only with 8-bit encodings, and not encodings such
     * as UTF-16 or UTF-32.
     */
    @Generated
    @Selector("cStringUsingEncoding:")
    public native ConstBytePtr cStringUsingEncoding(@NUInt long encoding);

    @Generated
    @Selector("canBeConvertedToEncoding:")
    public native boolean canBeConvertedToEncoding(@NUInt long encoding);

    @Generated
    @Selector("capitalizedString")
    public native String capitalizedString();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("capitalizedStringWithLocale:")
    public native String capitalizedStringWithLocale(NSLocale locale);

    @Generated
    @Selector("caseInsensitiveCompare:")
    @NInt
    public native long caseInsensitiveCompare(String string);

    @Generated
    @Selector("characterAtIndex:")
    public native char characterAtIndex(@NUInt long index);

    @Generated
    @Selector("commonPrefixWithString:options:")
    public native String commonPrefixWithStringOptions(String str, @NUInt long mask);

    /**
     * In the compare: methods, the range argument specifies the subrange, rather than the whole, of the receiver to use
     * in the comparison. The range is not applied to the search string. For example, [@"AB" compare:@"ABC" options:0
     * range:NSMakeRange(0,1)] compares "A" to "ABC", not "A" to "A", and will return NSOrderedAscending. It is an error
     * to specify a range that is outside of the receiver's bounds, and an exception may be raised.
     */
    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(String string);

    @Generated
    @Selector("compare:options:")
    @NInt
    public native long compareOptions(String string, @NUInt long mask);

    @Generated
    @Selector("compare:options:range:")
    @NInt
    public native long compareOptionsRange(String string, @NUInt long mask, @ByValue NSRange rangeOfReceiverToCompare);

    /**
     * locale arg used to be a dictionary pre-Leopard. We now accept NSLocale. Assumes the current locale if non-nil and
     * non-NSLocale. nil continues to mean canonical compare, which doesn't depend on user's locale choice.
     */
    @Generated
    @Selector("compare:options:range:locale:")
    @NInt
    public native long compareOptionsRangeLocale(String string, @NUInt long mask,
            @ByValue NSRange rangeOfReceiverToCompare, @Mapped(ObjCObjectMapper.class) Object locale);

    @Generated
    @Selector("completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:")
    @NUInt
    public native long completePathIntoStringCaseSensitiveMatchesIntoArrayFilterTypes(
            @ReferenceInfo(type = NSString.class) Ptr<NSString> outputName, boolean flag,
            @ReferenceInfo(type = NSArray.class) Ptr<NSArray<String>> outputArray, NSArray<String> filterTypes);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("componentsSeparatedByCharactersInSet:")
    public native NSArray<String> componentsSeparatedByCharactersInSet(NSCharacterSet separator);

    @Generated
    @Selector("componentsSeparatedByString:")
    public native NSArray<String> componentsSeparatedByString(String separator);

    /**
     * Simple convenience methods for string searching. containsString: returns YES if the target string is contained
     * within the receiver. Same as calling rangeOfString:options: with no options, thus doing a case-sensitive,
     * locale-unaware search. localizedCaseInsensitiveContainsString: is the case-insensitive variant which also takes
     * the current locale into effect. Starting in 10.11 and iOS9, the new localizedStandardRangeOfString: or
     * localizedStandardContainsString: APIs are even better convenience methods for user level searching. More
     * sophisticated needs can be achieved by calling rangeOfString:options:range:locale: directly.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("containsString:")
    public native boolean containsString(String str);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * External representation
     */
    @Generated
    @Selector("dataUsingEncoding:")
    public native NSData dataUsingEncoding(@NUInt long encoding);

    /**
     * External representation
     */
    @Generated
    @Selector("dataUsingEncoding:allowLossyConversion:")
    public native NSData dataUsingEncodingAllowLossyConversion(@NUInt long encoding, boolean lossy);

    @Generated
    @Selector("decomposedStringWithCanonicalMapping")
    public native String decomposedStringWithCanonicalMapping();

    @Generated
    @Selector("decomposedStringWithCompatibilityMapping")
    public native String decomposedStringWithCompatibilityMapping();

    @Generated
    @Selector("description")
    public native String description();

    /**
     * The following convenience methods all skip initial space characters (whitespaceSet) and ignore trailing
     * characters. They are not locale-aware. NSScanner or NSNumberFormatter can be used for more powerful and
     * locale-aware parsing of numbers.
     */
    @Generated
    @Selector("doubleValue")
    public native double doubleValue();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontFontSizeLineBreakModeBaselineAdjustment(@ByValue CGPoint point,
            @NFloat double width, UIFont font, @NFloat double fontSize, @NInt long lineBreakMode,
            @NInt long baselineAdjustment);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:lineBreakMode:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontLineBreakMode(@ByValue CGPoint point, @NFloat double width,
            UIFont font, @NInt long lineBreakMode);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontMinFontSizeActualFontSizeLineBreakModeBaselineAdjustment(
            @ByValue CGPoint point, @NFloat double width, UIFont font, @NFloat double minFontSize,
            NFloatPtr actualFontSize, @NInt long lineBreakMode, @NInt long baselineAdjustment);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("drawAtPoint:withAttributes:")
    public native void drawAtPointWithAttributes(@ByValue CGPoint point, NSDictionary<String, ?> attrs);

    /**
     * Single line, no wrapping. Truncation based on the NSLineBreakMode.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("drawAtPoint:withFont:")
    @ByValue
    public native CGSize drawAtPointWithFont(@ByValue CGPoint point, UIFont font);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("drawInRect:withAttributes:")
    public native void drawInRectWithAttributes(@ByValue CGRect rect, NSDictionary<String, ?> attrs);

    /**
     * Wrapping to fit horizontal and vertical size.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:")
    @ByValue
    public native CGSize drawInRectWithFont(@ByValue CGRect rect, UIFont font);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:lineBreakMode:")
    @ByValue
    public native CGSize drawInRectWithFontLineBreakMode(@ByValue CGRect rect, UIFont font, @NInt long lineBreakMode);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:lineBreakMode:alignment:")
    @ByValue
    public native CGSize drawInRectWithFontLineBreakModeAlignment(@ByValue CGRect rect, UIFont font,
            @NInt long lineBreakMode, @NInt long alignment);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("drawWithRect:options:attributes:context:")
    public native void drawWithRectOptionsAttributesContext(@ByValue CGRect rect, @NInt long options,
            NSDictionary<String, ?> attributes, NSStringDrawingContext context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateLinesUsingBlock:")
    public native void enumerateLinesUsingBlock(
            @ObjCBlock(name = "call_enumerateLinesUsingBlock") Block_enumerateLinesUsingBlock block);

    /**
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:")
    public native void enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock(@ByValue NSRange range,
            String scheme, @NUInt long options, NSOrthography orthography,
            @ObjCBlock(name = "call_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock") Block_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock block);

    /**
     * In the enumerate methods, the blocks will be invoked inside an autorelease pool, so any values assigned inside
     * the block should be retained.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateSubstringsInRange:options:usingBlock:")
    public native void enumerateSubstringsInRangeOptionsUsingBlock(@ByValue NSRange range, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateSubstringsInRangeOptionsUsingBlock") Block_enumerateSubstringsInRangeOptionsUsingBlock block);

    /**
     * Result in O(1) time; a rough estimate
     */
    @Generated
    @Selector("fastestEncoding")
    @NUInt
    public native long fastestEncoding();

    @Generated
    @Selector("fileSystemRepresentation")
    @MappedReturn(CStringMapper.class)
    public native String fileSystemRepresentation();

    @Generated
    @Selector("floatValue")
    public native float floatValue();

    /**
     * Use this to convert string section at a time into a fixed-size buffer, without any allocations. Does not
     * NULL-terminate.
     * buffer is the buffer to write to; if NULL, this method can be used to computed size of needed buffer.
     * maxBufferCount is the length of the buffer in bytes. It's a good idea to make sure this is at least enough to
     * hold one character's worth of conversion.
     * usedBufferCount is the length of the buffer used up by the current conversion. Can be NULL.
     * encoding is the encoding to convert to.
     * options specifies the options to apply.
     * range is the range to convert.
     * leftOver is the remaining range. Can be NULL.
     * YES return indicates some characters were converted. Conversion might usually stop when the buffer fills,
     * but it might also stop when the conversion isn't possible due to the chosen encoding.
     */
    @Generated
    @Selector("getBytes:maxLength:usedLength:encoding:options:range:remainingRange:")
    public native boolean getBytesMaxLengthUsedLengthEncodingOptionsRangeRemainingRange(VoidPtr buffer,
            @NUInt long maxBufferCount, NUIntPtr usedBufferCount, @NUInt long encoding, @NUInt long options,
            @ByValue NSRange range, NSRange leftover);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -getCString:maxLength:encoding: instead
     */
    @Generated
    @Deprecated
    @Selector("getCString:")
    public native void getCString(BytePtr bytes);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -getCString:maxLength:encoding: instead
     */
    @Generated
    @Deprecated
    @Selector("getCString:maxLength:")
    public native void getCStringMaxLength(BytePtr bytes, @NUInt long maxLength);

    /**
     * NO return if conversion not possible due to encoding errors or too small of a buffer. The buffer should include
     * room for maxBufferCount bytes; this number should accomodate the expected size of the return value plus the NULL
     * termination character, which this method adds. (So note that the maxLength passed to this method is one more than
     * the one you would have passed to the deprecated getCString:maxLength:.) Use only with 8-bit encodings, and not
     * encodings such as UTF-16 or UTF-32.
     */
    @Generated
    @Selector("getCString:maxLength:encoding:")
    public native boolean getCStringMaxLengthEncoding(BytePtr buffer, @NUInt long maxBufferCount, @NUInt long encoding);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -getCString:maxLength:encoding: instead
     */
    @Generated
    @Deprecated
    @Selector("getCString:maxLength:range:remainingRange:")
    public native void getCStringMaxLengthRangeRemainingRange(BytePtr bytes, @NUInt long maxLength,
            @ByValue NSRange aRange, NSRange leftoverRange);

    /**
     * This method is unsafe because it could potentially cause buffer overruns. You should use -getCharacters:range:
     * instead.
     */
    @Generated
    @Selector("getCharacters:")
    public native void getCharacters(CharPtr buffer);

    /**
     * Use with rangeOfComposedCharacterSequencesForRange: to avoid breaking up character sequences
     */
    @Generated
    @Selector("getCharacters:range:")
    public native void getCharactersRange(CharPtr buffer, @ByValue NSRange range);

    @Generated
    @Selector("getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentationMaxLength(BytePtr cname, @NUInt long max);

    @Generated
    @Selector("getLineStart:end:contentsEnd:forRange:")
    public native void getLineStartEndContentsEndForRange(NUIntPtr startPtr, NUIntPtr lineEndPtr,
            NUIntPtr contentsEndPtr, @ByValue NSRange range);

    @Generated
    @Selector("getParagraphStart:end:contentsEnd:forRange:")
    public native void getParagraphStartEndContentsEndForRange(NUIntPtr startPtr, NUIntPtr parEndPtr,
            NUIntPtr contentsEndPtr, @ByValue NSRange range);

    /**
     * These perform locale unaware prefix or suffix match. If you need locale awareness, use
     * rangeOfString:options:range:locale:, passing NSAnchoredSearch (or'ed with NSBackwardsSearch for suffix, and
     * NSCaseInsensitiveSearch|NSDiacriticInsensitiveSearch if needed) for options, NSMakeRange(0, [receiver length])
     * for range, and [NSLocale currentLocale] for locale.
     */
    @Generated
    @Selector("hasPrefix:")
    public native boolean hasPrefix(String str);

    @Generated
    @Selector("hasSuffix:")
    public native boolean hasSuffix(String str);

    @Generated
    @Selector("hash")
    @NUInt
    public native long hash();

    /**
     * The initializers available to subclasses. See further below for additional init methods.
     */
    @Generated
    @Selector("init")
    public native NSString init();

    @Generated
    @Selector("initWithBytes:length:encoding:")
    public native NSString initWithBytesLengthEncoding(ConstVoidPtr bytes, @NUInt long len, @NUInt long encoding);

    /**
     * "NoCopy" is a hint
     */
    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
    public native NSString initWithBytesNoCopyLengthEncodingFreeWhenDone(VoidPtr bytes, @NUInt long len,
            @NUInt long encoding, boolean freeBuffer);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -initWithCString:encoding: instead
     */
    @Generated
    @Deprecated
    @Selector("initWithCString:")
    public native NSString initWithCString(ConstBytePtr bytes);

    @Generated
    @Selector("initWithCString:encoding:")
    public native NSString initWithCStringEncoding(ConstBytePtr nullTerminatedCString, @NUInt long encoding);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -initWithCString:encoding: instead
     */
    @Generated
    @Deprecated
    @Selector("initWithCString:length:")
    public native NSString initWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -initWithCString:encoding: instead
     */
    @Generated
    @Deprecated
    @Selector("initWithCStringNoCopy:length:freeWhenDone:")
    public native NSString initWithCStringNoCopyLengthFreeWhenDone(BytePtr bytes, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCharacters:length:")
    public native NSString initWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    /**
     * "NoCopy" is a hint
     */
    @Generated
    @Selector("initWithCharactersNoCopy:length:freeWhenDone:")
    public native NSString initWithCharactersNoCopyLengthFreeWhenDone(CharPtr characters, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCoder:")
    public native NSString initWithCoder(NSCoder coder);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -initWithContentsOfFile:encoding:error: instead
     */
    @Generated
    @Deprecated
    @Selector("initWithContentsOfFile:")
    public native NSString initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithContentsOfFile:encoding:error:")
    public native NSString initWithContentsOfFileEncodingError(String path, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithContentsOfFile:usedEncoding:error:")
    public native NSString initWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -initWithContentsOfURL:encoding:error: instead
     */
    @Generated
    @Deprecated
    @Selector("initWithContentsOfURL:")
    public native NSString initWithContentsOfURL(NSURL url);

    /**
     * These use the specified encoding. If nil is returned, the optional error return indicates problem that was
     * encountered (for instance, file system or encoding errors).
     */
    @Generated
    @Selector("initWithContentsOfURL:encoding:error:")
    public native NSString initWithContentsOfURLEncodingError(NSURL url, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * These try to determine the encoding, and return the encoding which was used. Note that these methods might get
     * "smarter" in subsequent releases of the system, and use additional techniques for recognizing encodings. If nil
     * is returned, the optional error return indicates problem that was encountered (for instance, file system or
     * encoding errors).
     */
    @Generated
    @Selector("initWithContentsOfURL:usedEncoding:error:")
    public native NSString initWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithData:encoding:")
    public native NSString initWithDataEncoding(NSData data, @NUInt long encoding);

    @Generated
    @Variadic()
    @Selector("initWithFormat:")
    public native NSString initWithFormat(String format, Object... varargs);

    @Generated
    @Selector("initWithFormat:arguments:")
    public native NSString initWithFormatArguments(String format, BytePtr argList);

    @Generated
    @Variadic()
    @Selector("initWithFormat:locale:")
    public native NSString initWithFormatLocale(String format, @Mapped(ObjCObjectMapper.class) Object locale,
            Object... varargs);

    @Generated
    @Selector("initWithFormat:locale:arguments:")
    public native NSString initWithFormatLocaleArguments(String format, @Mapped(ObjCObjectMapper.class) Object locale,
            BytePtr argList);

    @Generated
    @Selector("initWithString:")
    public native NSString initWithString(String aString);

    @Generated
    @Selector("initWithUTF8String:")
    public native NSString initWithUTF8String(ConstBytePtr nullTerminatedCString);

    @Generated
    @Selector("intValue")
    public native int intValue();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("integerValue")
    @NInt
    public native long integerValue();

    @Generated
    @Selector("isAbsolutePath")
    public native boolean isAbsolutePath();

    @Generated
    @Selector("isEqualToString:")
    public native boolean isEqualToString(String aString);

    @Generated
    @Selector("lastPathComponent")
    public native String lastPathComponent();

    /**
     * NSString primitives. A minimal subclass of NSString just needs to implement these two, along with an init method
     * appropriate for that subclass. We also recommend overriding getCharacters:range: for performance.
     */
    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    /**
     * Result in O(n) time; the result is exact. Returns 0 on error (cannot convert to specified encoding, or overflow)
     */
    @Generated
    @Selector("lengthOfBytesUsingEncoding:")
    @NUInt
    public native long lengthOfBytesUsingEncoding(@NUInt long enc);

    @Generated
    @Selector("lineRangeForRange:")
    @ByValue
    public native NSRange lineRangeForRange(@ByValue NSRange range);

    /**
     * Clients wishing to analyze a given string once may use these NSString APIs without having to create an instance
     * of NSLinguisticTagger. If more than one tagging operation is needed on a given string, it is more efficient to
     * use an explicit NSLinguisticTagger instance.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: All NSLinguisticTagger API should be replaced with NaturalLanguage.framework API
     */
    @Deprecated
    @Generated
    @Selector("linguisticTagsInRange:scheme:options:orthography:tokenRanges:")
    public native NSArray<String> linguisticTagsInRangeSchemeOptionsOrthographyTokenRanges(@ByValue NSRange range,
            String scheme, @NUInt long options, NSOrthography orthography,
            @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("localizedCapitalizedString")
    public native String localizedCapitalizedString();

    @Generated
    @Selector("localizedCaseInsensitiveCompare:")
    @NInt
    public native long localizedCaseInsensitiveCompare(String string);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("localizedCaseInsensitiveContainsString:")
    public native boolean localizedCaseInsensitiveContainsString(String str);

    @Generated
    @Selector("localizedCompare:")
    @NInt
    public native long localizedCompare(String string);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("localizedLowercaseString")
    public native String localizedLowercaseString();

    /**
     * localizedStandardCompare:, added in 10.6, should be used whenever file names or other strings are presented in
     * lists and tables where Finder-like sorting is appropriate. The exact behavior of this method may be tweaked in
     * future releases, and will be different under different localizations, so clients should not depend on the exact
     * sorting order of the strings.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("localizedStandardCompare:")
    @NInt
    public native long localizedStandardCompare(String string);

    /**
     * The following two are the most appropriate methods for doing user-level string searches, similar to how searches
     * are done generally in the system. The search is locale-aware, case and diacritic insensitive. As with other APIs,
     * "standard" in the name implies "system default behavior," so the exact list of search options applied may change
     * over time. If you need more control over the search options, please use the rangeOfString:options:range:locale:
     * method. You can pass [NSLocale currentLocale] for searches in user's locale.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("localizedStandardContainsString:")
    public native boolean localizedStandardContainsString(String str);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("localizedStandardRangeOfString:")
    @ByValue
    public native NSRange localizedStandardRangeOfString(String str);

    /**
     * The following three return the locale-aware case mappings. They are suitable for strings presented to the user.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("localizedUppercaseString")
    public native String localizedUppercaseString();

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("longLongValue")
    public native long longLongValue();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -cStringUsingEncoding: instead
     */
    @Generated
    @Deprecated
    @Selector("lossyCString")
    public native ConstBytePtr lossyCString();

    @Generated
    @Selector("lowercaseString")
    public native String lowercaseString();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("lowercaseStringWithLocale:")
    public native String lowercaseStringWithLocale(NSLocale locale);

    /**
     * Result in O(1) time; the estimate may be way over what's needed. Returns 0 on error (overflow)
     */
    @Generated
    @Selector("maximumLengthOfBytesUsingEncoding:")
    @NUInt
    public native long maximumLengthOfBytesUsingEncoding(@NUInt long enc);

    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    @Generated
    @Selector("paragraphRangeForRange:")
    @ByValue
    public native NSRange paragraphRangeForRange(@ByValue NSRange range);

    @Generated
    @Selector("pathComponents")
    public native NSArray<String> pathComponents();

    @Generated
    @Selector("pathExtension")
    public native String pathExtension();

    @Generated
    @Selector("precomposedStringWithCanonicalMapping")
    public native String precomposedStringWithCanonicalMapping();

    @Generated
    @Selector("precomposedStringWithCompatibilityMapping")
    public native String precomposedStringWithCompatibilityMapping();

    /**
     * These methods are no longer recommended since they do not work with property lists and strings files in binary
     * plist format. Please use the APIs in NSPropertyList.h instead.
     */
    @Generated
    @Selector("propertyList")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyList();

    @Generated
    @Selector("propertyListFromStringsFileFormat")
    public native NSDictionary<?, ?> propertyListFromStringsFileFormat();

    /**
     * These return the range of the first character from the set in the string, not the range of a sequence of
     * characters.
     * 
     * The range argument specifies the subrange, rather than the whole, of the receiver to use in the search. It is an
     * error to specify a range that is outside of the receiver's bounds, and an exception may be raised.
     */
    @Generated
    @Selector("rangeOfCharacterFromSet:")
    @ByValue
    public native NSRange rangeOfCharacterFromSet(NSCharacterSet searchSet);

    @Generated
    @Selector("rangeOfCharacterFromSet:options:")
    @ByValue
    public native NSRange rangeOfCharacterFromSetOptions(NSCharacterSet searchSet, @NUInt long mask);

    @Generated
    @Selector("rangeOfCharacterFromSet:options:range:")
    @ByValue
    public native NSRange rangeOfCharacterFromSetOptionsRange(NSCharacterSet searchSet, @NUInt long mask,
            @ByValue NSRange rangeOfReceiverToSearch);

    @Generated
    @Selector("rangeOfComposedCharacterSequenceAtIndex:")
    @ByValue
    public native NSRange rangeOfComposedCharacterSequenceAtIndex(@NUInt long index);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("rangeOfComposedCharacterSequencesForRange:")
    @ByValue
    public native NSRange rangeOfComposedCharacterSequencesForRange(@ByValue NSRange range);

    /**
     * These methods perform string search, looking for the searchString within the receiver string. These return
     * length==0 if the target string is not found. So, to check for containment: ([str rangeOfString:@"target"].length
     * > 0). Note that the length of the range returned by these methods might be different than the length of the
     * target string, due composed characters and such.
     * 
     * Note that the first three methods do not take locale arguments, and perform the search in a non-locale aware
     * fashion, which is not appropriate for user-level searching. To do user-level string searching, use the last
     * method, specifying locale:[NSLocale currentLocale], or better yet, use localizedStandardRangeOfString: or
     * localizedStandardContainsString:.
     * 
     * The range argument specifies the subrange, rather than the whole, of the receiver to use in the search. It is an
     * error to specify a range that is outside of the receiver's bounds, and an exception may be raised.
     */
    @Generated
    @Selector("rangeOfString:")
    @ByValue
    public native NSRange rangeOfString(String searchString);

    @Generated
    @Selector("rangeOfString:options:")
    @ByValue
    public native NSRange rangeOfStringOptions(String searchString, @NUInt long mask);

    @Generated
    @Selector("rangeOfString:options:range:")
    @ByValue
    public native NSRange rangeOfStringOptionsRange(String searchString, @NUInt long mask,
            @ByValue NSRange rangeOfReceiverToSearch);

    /**
     * API-Since: 2.0
     */
    @Generated
    @Selector("rangeOfString:options:range:locale:")
    @ByValue
    public native NSRange rangeOfStringOptionsRangeLocale(String searchString, @NUInt long mask,
            @ByValue NSRange rangeOfReceiverToSearch, NSLocale locale);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("sizeWithAttributes:")
    @ByValue
    public native CGSize sizeWithAttributes(NSDictionary<String, ?> attrs);

    /**
     * Single line, no wrapping. Truncation based on the NSLineBreakMode.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:")
    @ByValue
    public native CGSize sizeWithFont(UIFont font);

    /**
     * Uses NSLineBreakModeWordWrap
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:constrainedToSize:")
    @ByValue
    public native CGSize sizeWithFontConstrainedToSize(UIFont font, @ByValue CGSize size);

    /**
     * NSTextAlignment is not needed to determine size
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:constrainedToSize:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontConstrainedToSizeLineBreakMode(UIFont font, @ByValue CGSize size,
            @NInt long lineBreakMode);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:forWidth:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontForWidthLineBreakMode(UIFont font, @NFloat double width, @NInt long lineBreakMode);

    /**
     * These methods will behave identically to the above single line methods if the string will fit in the specified
     * width in the specified font.
     * If not, the font size will be reduced until either the string fits or the minimum font size is reached. If the
     * minimum font
     * size is reached and the string still won't fit, the string will be truncated and drawn at the minimum font size.
     * The first two methods are used together, and the actualFontSize returned in the sizeWithFont method should be
     * passed to the drawAtPoint method.
     * The last method will do the sizing calculation and drawing in one operation.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontMinFontSizeActualFontSizeForWidthLineBreakMode(UIFont font,
            @NFloat double minFontSize, NFloatPtr actualFontSize, @NFloat double width, @NInt long lineBreakMode);

    /**
     * Result in O(n) time; the encoding in which the string is most compact
     */
    @Generated
    @Selector("smallestEncoding")
    @NUInt
    public native long smallestEncoding();

    @Generated
    @Selector("stringByAbbreviatingWithTildeInPath")
    public native String stringByAbbreviatingWithTildeInPath();

    /**
     * Returns a new string made from the receiver by replacing all characters not in the allowedCharacters set with
     * percent encoded characters. UTF-8 encoding is used to determine the correct percent encoded characters. Entire
     * URL strings cannot be percent-encoded. This method is intended to percent-encode a URL component or subcomponent
     * string, NOT the entire URL string. Any characters in allowedCharacters outside of the 7-bit ASCII range are
     * ignored.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("stringByAddingPercentEncodingWithAllowedCharacters:")
    public native String stringByAddingPercentEncodingWithAllowedCharacters(NSCharacterSet allowedCharacters);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use -stringByAddingPercentEncodingWithAllowedCharacters: instead, which always uses the
     * recommended UTF-8 encoding, and which encodes for a specific URL component or subcomponent since each URL
     * component or subcomponent has different rules for what characters are valid.
     */
    @Generated
    @Deprecated
    @Selector("stringByAddingPercentEscapesUsingEncoding:")
    public native String stringByAddingPercentEscapesUsingEncoding(@NUInt long enc);

    @Generated
    @Variadic()
    @Selector("stringByAppendingFormat:")
    public native String stringByAppendingFormat(String format, Object... varargs);

    @Generated
    @Selector("stringByAppendingPathComponent:")
    public native String stringByAppendingPathComponent(String str);

    @Generated
    @Selector("stringByAppendingPathExtension:")
    public native String stringByAppendingPathExtension(String str);

    @Generated
    @Selector("stringByAppendingString:")
    public native String stringByAppendingString(String aString);

    /**
     * Returns nil if reverse not applicable or transform is invalid
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("stringByApplyingTransform:reverse:")
    public native String stringByApplyingTransformReverse(String transform, boolean reverse);

    @Generated
    @Selector("stringByDeletingLastPathComponent")
    public native String stringByDeletingLastPathComponent();

    @Generated
    @Selector("stringByDeletingPathExtension")
    public native String stringByDeletingPathExtension();

    @Generated
    @Selector("stringByExpandingTildeInPath")
    public native String stringByExpandingTildeInPath();

    /**
     * Returns a string with the character folding options applied. theOptions is a mask of compare flags with
     * *InsensitiveSearch suffix.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("stringByFoldingWithOptions:locale:")
    public native String stringByFoldingWithOptionsLocale(@NUInt long options, NSLocale locale);

    @Generated
    @Selector("stringByPaddingToLength:withString:startingAtIndex:")
    public native String stringByPaddingToLengthWithStringStartingAtIndex(@NUInt long newLength, String padString,
            @NUInt long padIndex);

    /**
     * Returns a new string made from the receiver by replacing all percent encoded sequences with the matching UTF-8
     * characters.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("stringByRemovingPercentEncoding")
    public native String stringByRemovingPercentEncoding();

    /**
     * Replace characters in range with the specified string, returning new string.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("stringByReplacingCharactersInRange:withString:")
    public native String stringByReplacingCharactersInRangeWithString(@ByValue NSRange range, String replacement);

    /**
     * Replace all occurrences of the target string with replacement. Invokes the above method with 0 options and range
     * of the whole string.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("stringByReplacingOccurrencesOfString:withString:")
    public native String stringByReplacingOccurrencesOfStringWithString(String target, String replacement);

    /**
     * Replace all occurrences of the target string in the specified range with replacement. Specified compare options
     * are used for matching target. If NSRegularExpressionSearch is specified, the replacement is treated as a
     * template, as in the corresponding NSRegularExpression methods, and no other options can apply except
     * NSCaseInsensitiveSearch and NSAnchoredSearch.
     * 
     * API-Since: 2.0
     */
    @Generated
    @Selector("stringByReplacingOccurrencesOfString:withString:options:range:")
    public native String stringByReplacingOccurrencesOfStringWithStringOptionsRange(String target, String replacement,
            @NUInt long options, @ByValue NSRange searchRange);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use -stringByRemovingPercentEncoding instead, which always uses the recommended UTF-8
     * encoding.
     */
    @Generated
    @Deprecated
    @Selector("stringByReplacingPercentEscapesUsingEncoding:")
    public native String stringByReplacingPercentEscapesUsingEncoding(@NUInt long enc);

    @Generated
    @Selector("stringByResolvingSymlinksInPath")
    public native String stringByResolvingSymlinksInPath();

    @Generated
    @Selector("stringByStandardizingPath")
    public native String stringByStandardizingPath();

    @Generated
    @Selector("stringByTrimmingCharactersInSet:")
    public native String stringByTrimmingCharactersInSet(NSCharacterSet set);

    @Generated
    @Selector("stringsByAppendingPaths:")
    public native NSArray<String> stringsByAppendingPaths(NSArray<String> paths);

    /**
     * To avoid breaking up character sequences such as Emoji, you can do:
     * [str substringFromIndex:[str rangeOfComposedCharacterSequenceAtIndex:index].location]
     * [str substringToIndex:NSMaxRange([str rangeOfComposedCharacterSequenceAtIndex:index])]
     * [str substringWithRange:[str rangeOfComposedCharacterSequencesForRange:range]
     */
    @Generated
    @Selector("substringFromIndex:")
    public native String substringFromIndex(@NUInt long from);

    @Generated
    @Selector("substringToIndex:")
    public native String substringToIndex(@NUInt long to);

    /**
     * Use with rangeOfComposedCharacterSequencesForRange: to avoid breaking up character sequences
     */
    @Generated
    @Selector("substringWithRange:")
    public native String substringWithRange(@ByValue NSRange range);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The following three return the canonical (non-localized) mappings. They are suitable for programming operations
     * that require stable results not depending on the user's locale preference. For locale-aware case mapping for
     * strings presented to users, use the "localized" methods below.
     */
    @Generated
    @Selector("uppercaseString")
    public native String uppercaseString();

    /**
     * The following methods perform localized case mappings based on the locale specified. Passing nil indicates the
     * canonical mapping. For the user preference locale setting, specify +[NSLocale currentLocale].
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("uppercaseStringWithLocale:")
    public native String uppercaseStringWithLocale(NSLocale locale);

    /**
     * For strings with length variations, such as from a stringsdict file, this method returns the variant at the given
     * width. If there is no variant at the given width, the one for the next smaller width is returned. And if there
     * are none smaller, the smallest available is returned. For strings without variations, this method returns self.
     * The unit that width is expressed in is decided by the application or framework. But it is intended to be some
     * measurement indicative of the context a string would fit best to avoid truncation and wasted space.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("variantFittingPresentationWidth:")
    public native String variantFittingPresentationWidth(@NInt long width);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -writeToFile:atomically:error: instead
     */
    @Generated
    @Deprecated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    @Generated
    @Selector("writeToFile:atomically:encoding:error:")
    public native boolean writeToFileAtomicallyEncodingError(String path, boolean useAuxiliaryFile, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 2.0
     * Deprecated-Message: Use -writeToURL:atomically:error: instead
     */
    @Generated
    @Deprecated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(NSURL url, boolean atomically);

    /**
     * Write to specified url or path using the specified encoding. The optional error return is to indicate file system
     * or encoding errors.
     */
    @Generated
    @Selector("writeToURL:atomically:encoding:error:")
    public native boolean writeToURLAtomicallyEncodingError(NSURL url, boolean useAuxiliaryFile, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateLinesUsingBlock {
        @Generated
        void call_enumerateLinesUsingBlock(String line, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock {
        @Generated
        void call_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock(String tag,
                @ByValue NSRange tokenRange, @ByValue NSRange sentenceRange, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateSubstringsInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateSubstringsInRangeOptionsUsingBlock(String substring, @ByValue NSRange substringRange,
                @ByValue NSRange enclosingRange, BoolPtr stop);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native NSString objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSString _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * Reads the string from the Localizable.strings file in the main app's bundle
     */
    @Generated
    @Variadic()
    @Selector("deferredLocalizedIntentsStringWithFormat:")
    public static native String deferredLocalizedIntentsStringWithFormat(String format, Object... varargs);

    /**
     * Reads the string from the provided table file in the main app's bundle
     */
    @Generated
    @Variadic()
    @Selector("deferredLocalizedIntentsStringWithFormat:fromTable:")
    public static native String deferredLocalizedIntentsStringWithFormatFromTable(String format, String table,
            Object... varargs);

    /**
     * Reads the string from the provided table file in the main app's bundle
     */
    @Generated
    @Selector("deferredLocalizedIntentsStringWithFormat:fromTable:arguments:")
    public static native String deferredLocalizedIntentsStringWithFormatFromTableArguments(String format, String table,
            BytePtr arguments);

    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:deallocator:")
    public native NSString initWithBytesNoCopyLengthEncodingDeallocator(VoidPtr bytes, @NUInt long len,
            @NUInt long encoding,
            @ObjCBlock(name = "call_initWithBytesNoCopyLengthEncodingDeallocator") Block_initWithBytesNoCopyLengthEncodingDeallocator deallocator);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithBytesNoCopyLengthEncodingDeallocator {
        @Generated
        void call_initWithBytesNoCopyLengthEncodingDeallocator(VoidPtr arg0, @NUInt long arg1);
    }

    @Generated
    @Selector("initWithCharactersNoCopy:length:deallocator:")
    public native NSString initWithCharactersNoCopyLengthDeallocator(CharPtr chars, @NUInt long len,
            @ObjCBlock(name = "call_initWithCharactersNoCopyLengthDeallocator") Block_initWithCharactersNoCopyLengthDeallocator deallocator);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithCharactersNoCopyLengthDeallocator {
        @Generated
        void call_initWithCharactersNoCopyLengthDeallocator(CharPtr arg0, @NUInt long arg1);
    }

    /**
     * \brief Generate a path component based on a partial filename and a file
     * type, then append it to a copy of the receiver.
     * 
     * \param partialName The partial filename that should be expanded upon,
     * e.g. \c "readme".
     * \param contentType The type the resulting file should conform to, e.g.
     * \c UTTypePlainText.
     * 
     * \result A complete file path. Using the argument examples above, this method
     * would return a string with a last path component of \c "readme.txt".
     * 
     * Use this method when you have partial input from a user or other source and
     * need to produce a complete filename suitable for that input. For example, if
     * you are downloading a file from the Internet and know its MIME type, you can
     * use this method to ensure the correct filename extension is applied to the
     * URL where you save the file.
     * 
     * If \a partialName already has a path extension, and that path extension is
     * valid for file system objects of type \a contentType, no additional
     * extension is appended to the path component before constructing the string.
     * For example, if the inputs are \c "puppy.jpg" and \c UTTypeImage
     * respectively, then the resulting string will have a last path component of
     * \c "puppy.jpg" . On the other hand, if the inputs are \c "puppy.jpg" and
     * \c UTTypePlainText respectively, the resulting string will have a last path
     * component of \c "puppy.jpg.txt" . If you want to ensure any existing path
     * extension is replaced, you can use the \c stringByDeletingPathExtension
     * property first.
     * 
     * If the path component could not be appended, this method returns a copy of
     * \c self .
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("stringByAppendingPathComponent:conformingToType:")
    public native String stringByAppendingPathComponentConformingToType(String partialName, UTType contentType);

    /**
     * \brief Generate a string based on a partial filename or path and a
     * file type.
     * 
     * \param contentType The type the resulting file should conform to, e.g.
     * \c UTTypePlainText.
     * 
     * \result A complete file path. Using the argument example above and assuming
     * the receiver equals \c "readme" , this method would return
     * \c "readme.txt".
     * 
     * Use this method when you have partial input from a user or other source and
     * need to produce a complete filename suitable for that input. For example, if
     * you are downloading a file from the Internet and know its MIME type, you can
     * use this method to ensure the correct filename extension is applied to the
     * URL where you save the file.
     * 
     * If the receiver already has a path extension, and that path extension is
     * valid for file system objects of type \a contentType, no additional
     * extension is appended to the receiver before constructing the result.
     * For example, if the receiver equals \c "puppy.jpg" and \a contentType equals
     * \c UTTypeImage , then the resulting string will equal \c "puppy.jpg" . On
     * the other hand, if the inputs are \c "puppy.jpg" and \c UTTypePlainText
     * respectively, the resulting string will equal \c "puppy.jpg.txt" . If you
     * want to ensure any existing path extension is replaced, you can use the
     * \c stringByDeletingPathExtension property first.
     * 
     * If the extension could not be appended, this method returns a copy of
     * \c self .
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("stringByAppendingPathExtensionForType:")
    public native String stringByAppendingPathExtensionForType(UTType contentType);

    /**
     * Returns a sensor stream that contains deletion records of the sensor
     * 
     * This sensor stream should only be used for fetching. All other
     * operations will be ignored. Deletion records share the recording and authorization
     * state with their parent sensor.
     * 
     * @return May return nil if there is no deletion record available for this sensor
     */
    @Generated
    @Selector("sr_sensorForDeletionRecordsFromSensor")
    public native String sr_sensorForDeletionRecordsFromSensor();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithValidatedFormat:validFormatSpecifiers:arguments:error:")
    public native NSString initWithValidatedFormatValidFormatSpecifiersArgumentsError(String format,
            String validFormatSpecifiers, BytePtr argList, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Variadic()
    @Selector("initWithValidatedFormat:validFormatSpecifiers:error:")
    public native NSString initWithValidatedFormatValidFormatSpecifiersError(String format,
            String validFormatSpecifiers, @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("initWithValidatedFormat:validFormatSpecifiers:locale:arguments:error:")
    public native NSString initWithValidatedFormatValidFormatSpecifiersLocaleArgumentsError(String format,
            String validFormatSpecifiers, @Mapped(ObjCObjectMapper.class) Object locale, BytePtr argList,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Variadic()
    @Selector("initWithValidatedFormat:validFormatSpecifiers:locale:error:")
    public native NSString initWithValidatedFormatValidFormatSpecifiersLocaleError(String format,
            String validFormatSpecifiers, @Mapped(ObjCObjectMapper.class) Object locale,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Variadic()
    @Selector("localizedStringWithValidatedFormat:validFormatSpecifiers:error:")
    public static native NSString localizedStringWithValidatedFormatValidFormatSpecifiersError(String format,
            String validFormatSpecifiers, @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Variadic()
    @Selector("stringWithValidatedFormat:validFormatSpecifiers:error:")
    public static native NSString stringWithValidatedFormatValidFormatSpecifiersError(String format,
            String validFormatSpecifiers, @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);
}
