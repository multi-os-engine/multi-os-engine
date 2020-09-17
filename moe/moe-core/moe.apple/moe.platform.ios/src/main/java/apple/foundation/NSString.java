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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSString extends NSObject
        implements NSCopying, NSMutableCopying, NSSecureCoding, NSItemProviderReading, NSItemProviderWriting,
        CKRecordValue, CNKeyDescriptor {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object localizedStringWithFormat(String format, Object... varargs);

    @Generated
    @Selector("localizedUserNotificationStringForKey:arguments:")
    public static native String localizedUserNotificationStringForKeyArguments(String key, NSArray<?> arguments);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:")
    @NUInt
    public static native long stringEncodingForDataEncodingOptionsConvertedStringUsedLossyConversion(NSData data,
            NSDictionary<String, ?> opts, @ReferenceInfo(type = NSString.class) Ptr<NSString> string,
            BoolPtr usedLossyConversion);

    @Generated
    @Deprecated
    @Selector("stringWithCString:")
    public static native NSString stringWithCString(ConstBytePtr bytes);

    @Generated
    @Selector("stringWithCString:encoding:")
    public static native NSString stringWithCStringEncoding(ConstBytePtr cString, @NUInt long enc);

    @Generated
    @Deprecated
    @Selector("stringWithCString:length:")
    public static native NSString stringWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    @Generated
    @Selector("stringWithCharacters:length:")
    public static native NSString stringWithCharactersLength(ConstCharPtr characters, @NUInt long length);

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

    @Generated
    @Selector("UTF8String")
    public native ConstBytePtr UTF8String();

    @Generated
    @Selector("boolValue")
    public native boolean boolValue();

    @Generated
    @Selector("boundingRectWithSize:options:attributes:context:")
    @ByValue
    public native CGRect boundingRectWithSizeOptionsAttributesContext(@ByValue CGSize size, @NInt long options,
            NSDictionary<String, ?> attributes, NSStringDrawingContext context);

    @Generated
    @Deprecated
    @Selector("cString")
    public native ConstBytePtr cString();

    @Generated
    @Deprecated
    @Selector("cStringLength")
    @NUInt
    public native long cStringLength();

    @Generated
    @Selector("cStringUsingEncoding:")
    public native ConstBytePtr cStringUsingEncoding(@NUInt long encoding);

    @Generated
    @Selector("canBeConvertedToEncoding:")
    public native boolean canBeConvertedToEncoding(@NUInt long encoding);

    @Generated
    @Selector("capitalizedString")
    public native String capitalizedString();

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

    @Generated
    @Selector("componentsSeparatedByCharactersInSet:")
    public native NSArray<String> componentsSeparatedByCharactersInSet(NSCharacterSet separator);

    @Generated
    @Selector("componentsSeparatedByString:")
    public native NSArray<String> componentsSeparatedByString(String separator);

    @Generated
    @Selector("containsString:")
    public native boolean containsString(String str);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("dataUsingEncoding:")
    public native NSData dataUsingEncoding(@NUInt long encoding);

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

    @Generated
    @Selector("doubleValue")
    public native double doubleValue();

    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontFontSizeLineBreakModeBaselineAdjustment(@ByValue CGPoint point,
            @NFloat double width, UIFont font, @NFloat double fontSize, @NInt long lineBreakMode,
            @NInt long baselineAdjustment);

    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:lineBreakMode:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontLineBreakMode(@ByValue CGPoint point, @NFloat double width,
            UIFont font, @NInt long lineBreakMode);

    @Generated
    @Deprecated
    @Selector("drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:")
    @ByValue
    public native CGSize drawAtPointForWidthWithFontMinFontSizeActualFontSizeLineBreakModeBaselineAdjustment(
            @ByValue CGPoint point, @NFloat double width, UIFont font, @NFloat double minFontSize,
            NFloatPtr actualFontSize, @NInt long lineBreakMode, @NInt long baselineAdjustment);

    @Generated
    @Selector("drawAtPoint:withAttributes:")
    public native void drawAtPointWithAttributes(@ByValue CGPoint point, NSDictionary<String, ?> attrs);

    @Generated
    @Deprecated
    @Selector("drawAtPoint:withFont:")
    @ByValue
    public native CGSize drawAtPointWithFont(@ByValue CGPoint point, UIFont font);

    @Generated
    @Selector("drawInRect:withAttributes:")
    public native void drawInRectWithAttributes(@ByValue CGRect rect, NSDictionary<String, ?> attrs);

    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:")
    @ByValue
    public native CGSize drawInRectWithFont(@ByValue CGRect rect, UIFont font);

    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:lineBreakMode:")
    @ByValue
    public native CGSize drawInRectWithFontLineBreakMode(@ByValue CGRect rect, UIFont font, @NInt long lineBreakMode);

    @Generated
    @Deprecated
    @Selector("drawInRect:withFont:lineBreakMode:alignment:")
    @ByValue
    public native CGSize drawInRectWithFontLineBreakModeAlignment(@ByValue CGRect rect, UIFont font,
            @NInt long lineBreakMode, @NInt long alignment);

    @Generated
    @Selector("drawWithRect:options:attributes:context:")
    public native void drawWithRectOptionsAttributesContext(@ByValue CGRect rect, @NInt long options,
            NSDictionary<String, ?> attributes, NSStringDrawingContext context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("enumerateLinesUsingBlock:")
    public native void enumerateLinesUsingBlock(
            @ObjCBlock(name = "call_enumerateLinesUsingBlock") Block_enumerateLinesUsingBlock block);

    @Generated
    @Selector("enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:")
    public native void enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock(@ByValue NSRange range,
            String scheme, @NUInt long options, NSOrthography orthography,
            @ObjCBlock(name = "call_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock") Block_enumerateLinguisticTagsInRangeSchemeOptionsOrthographyUsingBlock block);

    @Generated
    @Selector("enumerateSubstringsInRange:options:usingBlock:")
    public native void enumerateSubstringsInRangeOptionsUsingBlock(@ByValue NSRange range, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateSubstringsInRangeOptionsUsingBlock") Block_enumerateSubstringsInRangeOptionsUsingBlock block);

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

    @Generated
    @Selector("getBytes:maxLength:usedLength:encoding:options:range:remainingRange:")
    public native boolean getBytesMaxLengthUsedLengthEncodingOptionsRangeRemainingRange(VoidPtr buffer,
            @NUInt long maxBufferCount, NUIntPtr usedBufferCount, @NUInt long encoding, @NUInt long options,
            @ByValue NSRange range, NSRange leftover);

    @Generated
    @Deprecated
    @Selector("getCString:")
    public native void getCString(BytePtr bytes);

    @Generated
    @Deprecated
    @Selector("getCString:maxLength:")
    public native void getCStringMaxLength(BytePtr bytes, @NUInt long maxLength);

    @Generated
    @Selector("getCString:maxLength:encoding:")
    public native boolean getCStringMaxLengthEncoding(BytePtr buffer, @NUInt long maxBufferCount, @NUInt long encoding);

    @Generated
    @Deprecated
    @Selector("getCString:maxLength:range:remainingRange:")
    public native void getCStringMaxLengthRangeRemainingRange(BytePtr bytes, @NUInt long maxLength,
            @ByValue NSRange aRange, NSRange leftoverRange);

    @Generated
    @Selector("getCharacters:")
    public native void getCharacters(CharPtr buffer);

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

    @Generated
    @Selector("init")
    public native NSString init();

    @Generated
    @Selector("initWithBytes:length:encoding:")
    public native NSString initWithBytesLengthEncoding(ConstVoidPtr bytes, @NUInt long len, @NUInt long encoding);

    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
    public native NSString initWithBytesNoCopyLengthEncodingFreeWhenDone(VoidPtr bytes, @NUInt long len,
            @NUInt long encoding, boolean freeBuffer);

    @Generated
    @Deprecated
    @Selector("initWithCString:")
    public native NSString initWithCString(ConstBytePtr bytes);

    @Generated
    @Selector("initWithCString:encoding:")
    public native NSString initWithCStringEncoding(ConstBytePtr nullTerminatedCString, @NUInt long encoding);

    @Generated
    @Deprecated
    @Selector("initWithCString:length:")
    public native NSString initWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    @Generated
    @Deprecated
    @Selector("initWithCStringNoCopy:length:freeWhenDone:")
    public native NSString initWithCStringNoCopyLengthFreeWhenDone(BytePtr bytes, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCharacters:length:")
    public native NSString initWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    @Generated
    @Selector("initWithCharactersNoCopy:length:freeWhenDone:")
    public native NSString initWithCharactersNoCopyLengthFreeWhenDone(CharPtr characters, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCoder:")
    public native NSString initWithCoder(NSCoder coder);

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

    @Generated
    @Deprecated
    @Selector("initWithContentsOfURL:")
    public native NSString initWithContentsOfURL(NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:encoding:error:")
    public native NSString initWithContentsOfURLEncodingError(NSURL url, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @Generated
    @Selector("lengthOfBytesUsingEncoding:")
    @NUInt
    public native long lengthOfBytesUsingEncoding(@NUInt long enc);

    @Generated
    @Selector("lineRangeForRange:")
    @ByValue
    public native NSRange lineRangeForRange(@ByValue NSRange range);

    @Generated
    @Selector("linguisticTagsInRange:scheme:options:orthography:tokenRanges:")
    public native NSArray<String> linguisticTagsInRangeSchemeOptionsOrthographyTokenRanges(@ByValue NSRange range,
            String scheme, @NUInt long options, NSOrthography orthography,
            @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    @Generated
    @Selector("localizedCapitalizedString")
    public native String localizedCapitalizedString();

    @Generated
    @Selector("localizedCaseInsensitiveCompare:")
    @NInt
    public native long localizedCaseInsensitiveCompare(String string);

    @Generated
    @Selector("localizedCaseInsensitiveContainsString:")
    public native boolean localizedCaseInsensitiveContainsString(String str);

    @Generated
    @Selector("localizedCompare:")
    @NInt
    public native long localizedCompare(String string);

    @Generated
    @Selector("localizedLowercaseString")
    public native String localizedLowercaseString();

    @Generated
    @Selector("localizedStandardCompare:")
    @NInt
    public native long localizedStandardCompare(String string);

    @Generated
    @Selector("localizedStandardContainsString:")
    public native boolean localizedStandardContainsString(String str);

    @Generated
    @Selector("localizedStandardRangeOfString:")
    @ByValue
    public native NSRange localizedStandardRangeOfString(String str);

    @Generated
    @Selector("localizedUppercaseString")
    public native String localizedUppercaseString();

    @Generated
    @Selector("longLongValue")
    public native long longLongValue();

    @Generated
    @Deprecated
    @Selector("lossyCString")
    public native ConstBytePtr lossyCString();

    @Generated
    @Selector("lowercaseString")
    public native String lowercaseString();

    @Generated
    @Selector("lowercaseStringWithLocale:")
    public native String lowercaseStringWithLocale(NSLocale locale);

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

    @Generated
    @Selector("propertyList")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object propertyList();

    @Generated
    @Selector("propertyListFromStringsFileFormat")
    public native NSDictionary<?, ?> propertyListFromStringsFileFormat();

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

    @Generated
    @Selector("rangeOfComposedCharacterSequencesForRange:")
    @ByValue
    public native NSRange rangeOfComposedCharacterSequencesForRange(@ByValue NSRange range);

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

    @Generated
    @Selector("rangeOfString:options:range:locale:")
    @ByValue
    public native NSRange rangeOfStringOptionsRangeLocale(String searchString, @NUInt long mask,
            @ByValue NSRange rangeOfReceiverToSearch, NSLocale locale);

    @Generated
    @Selector("sizeWithAttributes:")
    @ByValue
    public native CGSize sizeWithAttributes(NSDictionary<String, ?> attrs);

    @Generated
    @Deprecated
    @Selector("sizeWithFont:")
    @ByValue
    public native CGSize sizeWithFont(UIFont font);

    @Generated
    @Deprecated
    @Selector("sizeWithFont:constrainedToSize:")
    @ByValue
    public native CGSize sizeWithFontConstrainedToSize(UIFont font, @ByValue CGSize size);

    @Generated
    @Deprecated
    @Selector("sizeWithFont:constrainedToSize:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontConstrainedToSizeLineBreakMode(UIFont font, @ByValue CGSize size,
            @NInt long lineBreakMode);

    @Generated
    @Deprecated
    @Selector("sizeWithFont:forWidth:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontForWidthLineBreakMode(UIFont font, @NFloat double width, @NInt long lineBreakMode);

    @Generated
    @Deprecated
    @Selector("sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:")
    @ByValue
    public native CGSize sizeWithFontMinFontSizeActualFontSizeForWidthLineBreakMode(UIFont font,
            @NFloat double minFontSize, NFloatPtr actualFontSize, @NFloat double width, @NInt long lineBreakMode);

    @Generated
    @Selector("smallestEncoding")
    @NUInt
    public native long smallestEncoding();

    @Generated
    @Selector("stringByAbbreviatingWithTildeInPath")
    public native String stringByAbbreviatingWithTildeInPath();

    @Generated
    @Selector("stringByAddingPercentEncodingWithAllowedCharacters:")
    public native String stringByAddingPercentEncodingWithAllowedCharacters(NSCharacterSet allowedCharacters);

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

    @Generated
    @Selector("stringByFoldingWithOptions:locale:")
    public native String stringByFoldingWithOptionsLocale(@NUInt long options, NSLocale locale);

    @Generated
    @Selector("stringByPaddingToLength:withString:startingAtIndex:")
    public native String stringByPaddingToLengthWithStringStartingAtIndex(@NUInt long newLength, String padString,
            @NUInt long padIndex);

    @Generated
    @Selector("stringByRemovingPercentEncoding")
    public native String stringByRemovingPercentEncoding();

    @Generated
    @Selector("stringByReplacingCharactersInRange:withString:")
    public native String stringByReplacingCharactersInRangeWithString(@ByValue NSRange range, String replacement);

    @Generated
    @Selector("stringByReplacingOccurrencesOfString:withString:")
    public native String stringByReplacingOccurrencesOfStringWithString(String target, String replacement);

    @Generated
    @Selector("stringByReplacingOccurrencesOfString:withString:options:range:")
    public native String stringByReplacingOccurrencesOfStringWithStringOptionsRange(String target, String replacement,
            @NUInt long options, @ByValue NSRange searchRange);

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

    @Generated
    @Selector("substringFromIndex:")
    public native String substringFromIndex(@NUInt long from);

    @Generated
    @Selector("substringToIndex:")
    public native String substringToIndex(@NUInt long to);

    @Generated
    @Selector("substringWithRange:")
    public native String substringWithRange(@ByValue NSRange range);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("uppercaseString")
    public native String uppercaseString();

    @Generated
    @Selector("uppercaseStringWithLocale:")
    public native String uppercaseStringWithLocale(NSLocale locale);

    @Generated
    @Selector("variantFittingPresentationWidth:")
    public native String variantFittingPresentationWidth(@NInt long width);

    @Generated
    @Deprecated
    @Selector("writeToFile:atomically:")
    public native boolean writeToFileAtomically(String path, boolean useAuxiliaryFile);

    @Generated
    @Selector("writeToFile:atomically:encoding:error:")
    public native boolean writeToFileAtomicallyEncodingError(String path, boolean useAuxiliaryFile, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("writeToURL:atomically:")
    public native boolean writeToURLAtomically(NSURL url, boolean atomically);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
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

    @Generated
    @Variadic()
    @Selector("deferredLocalizedIntentsStringWithFormat:")
    public static native String deferredLocalizedIntentsStringWithFormat(String format, Object... varargs);

    @Generated
    @Variadic()
    @Selector("deferredLocalizedIntentsStringWithFormat:fromTable:")
    public static native String deferredLocalizedIntentsStringWithFormatFromTable(String format, String table,
            Object... varargs);

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

    @Generated
    @Selector("stringByAppendingPathComponent:conformingToType:")
    public native String stringByAppendingPathComponentConformingToType(String partialName, UTType contentType);

    @Generated
    @Selector("stringByAppendingPathExtensionForType:")
    public native String stringByAppendingPathExtensionForType(UTType contentType);
}
