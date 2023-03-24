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
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableString extends NSString {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableString alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMutableString allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("availableStringEncodings")
    public static native ConstNUIntPtr availableStringEncodings();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("defaultCStringEncoding")
    @NUInt
    public static native long defaultCStringEncoding();

    @Generated
    @Selector("description")
    public static native String description_static();

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

    @NotNull
    @Generated
    @Selector("localizedNameOfStringEncoding:")
    public static native String localizedNameOfStringEncoding(@NUInt long encoding);

    @NotNull
    @Generated
    @Variadic()
    @Selector("localizedStringWithFormat:")
    public static native NSMutableString localizedStringWithFormat(@NotNull String format, Object... varargs);

    @NotNull
    @Generated
    @Selector("localizedUserNotificationStringForKey:arguments:")
    public static native String localizedUserNotificationStringForKeyArguments(@NotNull String key,
            @Nullable NSArray<?> arguments);

    @Generated
    @Owned
    @Selector("new")
    public static native NSMutableString new_objc();

    @NotNull
    @Generated
    @Selector("pathWithComponents:")
    public static native String pathWithComponents(@NotNull NSArray<String> components);

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
    public static native NSMutableString string();

    @Generated
    @Selector("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:")
    @NUInt
    public static native long stringEncodingForDataEncodingOptionsConvertedStringUsedLossyConversion(
            @NotNull NSData data, @Nullable NSDictionary<String, ?> opts,
            @Nullable @ReferenceInfo(type = NSString.class) Ptr<NSString> string,
            @Nullable BoolPtr usedLossyConversion);

    @Generated
    @Deprecated
    @Selector("stringWithCString:")
    public static native NSMutableString stringWithCString(@NotNull ConstBytePtr bytes);

    @Generated
    @Selector("stringWithCString:encoding:")
    public static native NSMutableString stringWithCStringEncoding(@NotNull ConstBytePtr cString, @NUInt long enc);

    @Generated
    @Deprecated
    @Selector("stringWithCString:length:")
    public static native NSMutableString stringWithCStringLength(@NotNull ConstBytePtr bytes, @NUInt long length);

    @NotNull
    @Generated
    @Selector("stringWithCapacity:")
    public static native NSMutableString stringWithCapacity(@NUInt long capacity);

    @Generated
    @Selector("stringWithCharacters:length:")
    public static native NSMutableString stringWithCharactersLength(@NotNull ConstCharPtr characters,
            @NUInt long length);

    @Generated
    @Deprecated
    @Selector("stringWithContentsOfFile:")
    public static native NSMutableString stringWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("stringWithContentsOfFile:encoding:error:")
    public static native NSMutableString stringWithContentsOfFileEncodingError(@NotNull String path, @NUInt long enc,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithContentsOfFile:usedEncoding:error:")
    public static native NSMutableString stringWithContentsOfFileUsedEncodingError(@NotNull String path,
            @Nullable NUIntPtr enc, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("stringWithContentsOfURL:")
    public static native NSMutableString stringWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("stringWithContentsOfURL:encoding:error:")
    public static native NSMutableString stringWithContentsOfURLEncodingError(@NotNull NSURL url, @NUInt long enc,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithContentsOfURL:usedEncoding:error:")
    public static native NSMutableString stringWithContentsOfURLUsedEncodingError(@NotNull NSURL url,
            @Nullable NUIntPtr enc, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("stringWithFormat:")
    public static native NSMutableString stringWithFormat(@NotNull String format, Object... varargs);

    @Generated
    @Selector("stringWithString:")
    public static native NSMutableString stringWithString(@NotNull String string);

    @Generated
    @Selector("stringWithUTF8String:")
    public static native NSMutableString stringWithUTF8String(@NotNull ConstBytePtr nullTerminatedCString);

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
    @Variadic()
    @Selector("appendFormat:")
    public native void appendFormat(@NotNull String format, Object... varargs);

    @Generated
    @Selector("appendString:")
    public native void appendString(@NotNull String aString);

    /**
     * Perform string transliteration. The transformation represented by transform is applied to the given range of
     * string in place. Only the specified range will be modified, but the transform may look at portions of the string
     * outside that range for context. If supplied, resultingRange is modified to reflect the new range corresponding to
     * the original range. reverse indicates that the inverse transform should be used instead, if it exists. Attempting
     * to use an invalid transform identifier or reverse an irreversible transform will return NO; otherwise YES is
     * returned, even if no characters are actually transformed. You can pass one of the predefined transforms listed
     * above (NSStringTransformLatinToKatakana, etc), or any valid ICU transform ID as defined in the ICU User Guide.
     * Arbitrary ICU transform rules are not supported.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("applyTransform:reverse:range:updatedRange:")
    public native boolean applyTransformReverseRangeUpdatedRange(@NotNull String transform, boolean reverse,
            @ByValue NSRange range, @Nullable NSRange resultingRange);

    @Generated
    @Selector("deleteCharactersInRange:")
    public native void deleteCharactersInRange(@ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSMutableString init();

    @Generated
    @Selector("initWithBytes:length:encoding:")
    public native NSMutableString initWithBytesLengthEncoding(@NotNull ConstVoidPtr bytes, @NUInt long len,
            @NUInt long encoding);

    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
    public native NSMutableString initWithBytesNoCopyLengthEncodingFreeWhenDone(@NotNull VoidPtr bytes, @NUInt long len,
            @NUInt long encoding, boolean freeBuffer);

    @Generated
    @Deprecated
    @Selector("initWithCString:")
    public native NSMutableString initWithCString(@NotNull ConstBytePtr bytes);

    @Generated
    @Selector("initWithCString:encoding:")
    public native NSMutableString initWithCStringEncoding(@NotNull ConstBytePtr nullTerminatedCString,
            @NUInt long encoding);

    @Generated
    @Deprecated
    @Selector("initWithCString:length:")
    public native NSMutableString initWithCStringLength(@NotNull ConstBytePtr bytes, @NUInt long length);

    @Generated
    @Deprecated
    @Selector("initWithCStringNoCopy:length:freeWhenDone:")
    public native NSMutableString initWithCStringNoCopyLengthFreeWhenDone(@NotNull BytePtr bytes, @NUInt long length,
            boolean freeBuffer);

    /**
     * In addition to these two, NSMutableString responds properly to all NSString creation methods.
     */
    @NotNull
    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableString initWithCapacity(@NUInt long capacity);

    @Generated
    @Selector("initWithCharacters:length:")
    public native NSMutableString initWithCharactersLength(@NotNull ConstCharPtr characters, @NUInt long length);

    @Generated
    @Selector("initWithCharactersNoCopy:length:freeWhenDone:")
    public native NSMutableString initWithCharactersNoCopyLengthFreeWhenDone(@NotNull CharPtr characters,
            @NUInt long length, boolean freeBuffer);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableString initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfFile:")
    public native NSMutableString initWithContentsOfFile(@NotNull String path);

    @Generated
    @Selector("initWithContentsOfFile:encoding:error:")
    public native NSMutableString initWithContentsOfFileEncodingError(@NotNull String path, @NUInt long enc,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithContentsOfFile:usedEncoding:error:")
    public native NSMutableString initWithContentsOfFileUsedEncodingError(@NotNull String path, @Nullable NUIntPtr enc,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfURL:")
    public native NSMutableString initWithContentsOfURL(@NotNull NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:encoding:error:")
    public native NSMutableString initWithContentsOfURLEncodingError(@NotNull NSURL url, @NUInt long enc,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithContentsOfURL:usedEncoding:error:")
    public native NSMutableString initWithContentsOfURLUsedEncodingError(@NotNull NSURL url, @Nullable NUIntPtr enc,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithData:encoding:")
    public native NSMutableString initWithDataEncoding(@NotNull NSData data, @NUInt long encoding);

    @Generated
    @Variadic()
    @Selector("initWithFormat:")
    public native NSMutableString initWithFormat(@NotNull String format, Object... varargs);

    @Generated
    @Selector("initWithFormat:arguments:")
    public native NSMutableString initWithFormatArguments(@NotNull String format, BytePtr argList);

    @Generated
    @Variadic()
    @Selector("initWithFormat:locale:")
    public native NSMutableString initWithFormatLocale(@NotNull String format,
            @Nullable @Mapped(ObjCObjectMapper.class) Object locale, Object... varargs);

    @Generated
    @Selector("initWithFormat:locale:arguments:")
    public native NSMutableString initWithFormatLocaleArguments(@NotNull String format,
            @Nullable @Mapped(ObjCObjectMapper.class) Object locale, BytePtr argList);

    @Generated
    @Selector("initWithString:")
    public native NSMutableString initWithString(@NotNull String aString);

    @Generated
    @Selector("initWithUTF8String:")
    public native NSMutableString initWithUTF8String(@NotNull ConstBytePtr nullTerminatedCString);

    /**
     * Additional mutation methods. For subclassers these are all available implemented in terms of the primitive
     * replaceCharactersInRange:range: method.
     */
    @Generated
    @Selector("insertString:atIndex:")
    public native void insertStringAtIndex(@NotNull String aString, @NUInt long loc);

    /**
     * NSMutableString primitive (funnel) method. See below for the other mutation methods.
     */
    @Generated
    @Selector("replaceCharactersInRange:withString:")
    public native void replaceCharactersInRangeWithString(@ByValue NSRange range, @NotNull String aString);

    /**
     * This method replaces all occurrences of the target string with the replacement string, in the specified range of
     * the receiver string, and returns the number of replacements. NSBackwardsSearch means the search is done from the
     * end of the range (the results could be different); NSAnchoredSearch means only anchored (but potentially
     * multiple) instances will be replaced. NSLiteralSearch and NSCaseInsensitiveSearch also apply. NSNumericSearch is
     * ignored. Use NSMakeRange(0, [receiver length]) to process whole string. If NSRegularExpressionSearch is
     * specified, the replacement is treated as a template, as in the corresponding NSRegularExpression methods, and no
     * other options can apply except NSCaseInsensitiveSearch and NSAnchoredSearch.
     */
    @Generated
    @Selector("replaceOccurrencesOfString:withString:options:range:")
    @NUInt
    public native long replaceOccurrencesOfStringWithStringOptionsRange(@NotNull String target,
            @NotNull String replacement, @NUInt long options, @ByValue NSRange searchRange);

    @Generated
    @Selector("setString:")
    public native void setString(@NotNull String aString);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(
            @NotNull String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(@NotNull String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Nullable
    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native NSMutableString objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSMutableString _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @NotNull
    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @NotNull
    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @NotNull
    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @NotNull
    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @NotNull
    @Generated
    @Variadic()
    @Selector("deferredLocalizedIntentsStringWithFormat:")
    public static native String deferredLocalizedIntentsStringWithFormat(@NotNull String format, Object... varargs);

    @NotNull
    @Generated
    @Variadic()
    @Selector("deferredLocalizedIntentsStringWithFormat:fromTable:")
    public static native String deferredLocalizedIntentsStringWithFormatFromTable(@NotNull String format,
            @Nullable String table, Object... varargs);

    @NotNull
    @Generated
    @Selector("deferredLocalizedIntentsStringWithFormat:fromTable:arguments:")
    public static native String deferredLocalizedIntentsStringWithFormatFromTableArguments(@NotNull String format,
            @Nullable String table, BytePtr arguments);

    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:deallocator:")
    public native NSMutableString initWithBytesNoCopyLengthEncodingDeallocator(@NotNull VoidPtr bytes, @NUInt long len,
            @NUInt long encoding,
            @Nullable @ObjCBlock(name = "call_initWithBytesNoCopyLengthEncodingDeallocator") NSString.Block_initWithBytesNoCopyLengthEncodingDeallocator deallocator);

    @Generated
    @Selector("initWithCharactersNoCopy:length:deallocator:")
    public native NSMutableString initWithCharactersNoCopyLengthDeallocator(@NotNull CharPtr chars, @NUInt long len,
            @Nullable @ObjCBlock(name = "call_initWithCharactersNoCopyLengthDeallocator") NSString.Block_initWithCharactersNoCopyLengthDeallocator deallocator);

    @Generated
    @Selector("initWithValidatedFormat:validFormatSpecifiers:arguments:error:")
    public native NSMutableString initWithValidatedFormatValidFormatSpecifiersArgumentsError(@NotNull String format,
            @NotNull String validFormatSpecifiers, BytePtr argList,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("initWithValidatedFormat:validFormatSpecifiers:error:")
    public native NSMutableString initWithValidatedFormatValidFormatSpecifiersError(@NotNull String format,
            @NotNull String validFormatSpecifiers, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error,
            Object... varargs);

    @Generated
    @Selector("initWithValidatedFormat:validFormatSpecifiers:locale:arguments:error:")
    public native NSMutableString initWithValidatedFormatValidFormatSpecifiersLocaleArgumentsError(
            @NotNull String format, @NotNull String validFormatSpecifiers,
            @Nullable @Mapped(ObjCObjectMapper.class) Object locale, BytePtr argList,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("initWithValidatedFormat:validFormatSpecifiers:locale:error:")
    public native NSMutableString initWithValidatedFormatValidFormatSpecifiersLocaleError(@NotNull String format,
            @NotNull String validFormatSpecifiers, @Nullable @Mapped(ObjCObjectMapper.class) Object locale,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);

    @Nullable
    @Generated
    @Variadic()
    @Selector("localizedStringWithValidatedFormat:validFormatSpecifiers:error:")
    public static native NSMutableString localizedStringWithValidatedFormatValidFormatSpecifiersError(
            @NotNull String format, @NotNull String validFormatSpecifiers,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error, Object... varargs);

    @Generated
    @Variadic()
    @Selector("stringWithValidatedFormat:validFormatSpecifiers:error:")
    public static native NSMutableString stringWithValidatedFormatValidFormatSpecifiersError(@NotNull String format,
            @NotNull String validFormatSpecifiers, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error,
            Object... varargs);
}
