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
import org.moe.natj.general.ann.MappedReturn;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    public static native NSMutableString string();

    @Generated
    @Selector("stringEncodingForData:encodingOptions:convertedString:usedLossyConversion:")
    @NUInt
    public static native long stringEncodingForDataEncodingOptionsConvertedStringUsedLossyConversion(NSData data,
            NSDictionary<String, ?> opts, @ReferenceInfo(type = NSString.class) Ptr<NSString> string,
            BoolPtr usedLossyConversion);

    @Generated
    @Deprecated
    @Selector("stringWithCString:")
    public static native NSMutableString stringWithCString(ConstBytePtr bytes);

    @Generated
    @Selector("stringWithCString:encoding:")
    public static native NSMutableString stringWithCStringEncoding(ConstBytePtr cString, @NUInt long enc);

    @Generated
    @Deprecated
    @Selector("stringWithCString:length:")
    public static native NSMutableString stringWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    @Generated
    @Selector("stringWithCapacity:")
    public static native NSMutableString stringWithCapacity(@NUInt long capacity);

    @Generated
    @Selector("stringWithCharacters:length:")
    public static native NSMutableString stringWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    @Generated
    @Deprecated
    @Selector("stringWithContentsOfFile:")
    public static native NSMutableString stringWithContentsOfFile(String path);

    @Generated
    @Selector("stringWithContentsOfFile:encoding:error:")
    public static native NSMutableString stringWithContentsOfFileEncodingError(String path, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithContentsOfFile:usedEncoding:error:")
    public static native NSMutableString stringWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("stringWithContentsOfURL:")
    public static native NSMutableString stringWithContentsOfURL(NSURL url);

    @Generated
    @Selector("stringWithContentsOfURL:encoding:error:")
    public static native NSMutableString stringWithContentsOfURLEncodingError(NSURL url, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("stringWithContentsOfURL:usedEncoding:error:")
    public static native NSMutableString stringWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("stringWithFormat:")
    public static native NSMutableString stringWithFormat(String format, Object... varargs);

    @Generated
    @Selector("stringWithString:")
    public static native NSMutableString stringWithString(String string);

    @Generated
    @Selector("stringWithUTF8String:")
    public static native NSMutableString stringWithUTF8String(ConstBytePtr nullTerminatedCString);

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
    public native void appendFormat(String format, Object... varargs);

    @Generated
    @Selector("appendString:")
    public native void appendString(String aString);

    @Generated
    @Selector("applyTransform:reverse:range:updatedRange:")
    public native boolean applyTransformReverseRangeUpdatedRange(String transform, boolean reverse,
            @ByValue NSRange range, NSRange resultingRange);

    @Generated
    @Selector("deleteCharactersInRange:")
    public native void deleteCharactersInRange(@ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSMutableString init();

    @Generated
    @Selector("initWithBytes:length:encoding:")
    public native NSMutableString initWithBytesLengthEncoding(ConstVoidPtr bytes, @NUInt long len,
            @NUInt long encoding);

    @Generated
    @Selector("initWithBytesNoCopy:length:encoding:freeWhenDone:")
    public native NSMutableString initWithBytesNoCopyLengthEncodingFreeWhenDone(VoidPtr bytes, @NUInt long len,
            @NUInt long encoding, boolean freeBuffer);

    @Generated
    @Deprecated
    @Selector("initWithCString:")
    public native NSMutableString initWithCString(ConstBytePtr bytes);

    @Generated
    @Selector("initWithCString:encoding:")
    public native NSMutableString initWithCStringEncoding(ConstBytePtr nullTerminatedCString, @NUInt long encoding);

    @Generated
    @Deprecated
    @Selector("initWithCString:length:")
    public native NSMutableString initWithCStringLength(ConstBytePtr bytes, @NUInt long length);

    @Generated
    @Deprecated
    @Selector("initWithCStringNoCopy:length:freeWhenDone:")
    public native NSMutableString initWithCStringNoCopyLengthFreeWhenDone(BytePtr bytes, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCapacity:")
    public native NSMutableString initWithCapacity(@NUInt long capacity);

    @Generated
    @Selector("initWithCharacters:length:")
    public native NSMutableString initWithCharactersLength(ConstCharPtr characters, @NUInt long length);

    @Generated
    @Selector("initWithCharactersNoCopy:length:freeWhenDone:")
    public native NSMutableString initWithCharactersNoCopyLengthFreeWhenDone(CharPtr characters, @NUInt long length,
            boolean freeBuffer);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableString initWithCoder(NSCoder coder);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfFile:")
    public native NSMutableString initWithContentsOfFile(String path);

    @Generated
    @Selector("initWithContentsOfFile:encoding:error:")
    public native NSMutableString initWithContentsOfFileEncodingError(String path, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithContentsOfFile:usedEncoding:error:")
    public native NSMutableString initWithContentsOfFileUsedEncodingError(String path, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("initWithContentsOfURL:")
    public native NSMutableString initWithContentsOfURL(NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:encoding:error:")
    public native NSMutableString initWithContentsOfURLEncodingError(NSURL url, @NUInt long enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithContentsOfURL:usedEncoding:error:")
    public native NSMutableString initWithContentsOfURLUsedEncodingError(NSURL url, NUIntPtr enc,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithData:encoding:")
    public native NSMutableString initWithDataEncoding(NSData data, @NUInt long encoding);

    @Generated
    @Variadic()
    @Selector("initWithFormat:")
    public native NSMutableString initWithFormat(String format, Object... varargs);

    @Generated
    @Selector("initWithFormat:arguments:")
    public native NSMutableString initWithFormatArguments(String format, BytePtr argList);

    @Generated
    @Variadic()
    @Selector("initWithFormat:locale:")
    public native NSMutableString initWithFormatLocale(String format, @Mapped(ObjCObjectMapper.class) Object locale,
            Object... varargs);

    @Generated
    @Selector("initWithFormat:locale:arguments:")
    public native NSMutableString initWithFormatLocaleArguments(String format,
            @Mapped(ObjCObjectMapper.class) Object locale, BytePtr argList);

    @Generated
    @Selector("initWithString:")
    public native NSMutableString initWithString(String aString);

    @Generated
    @Selector("initWithUTF8String:")
    public native NSMutableString initWithUTF8String(ConstBytePtr nullTerminatedCString);

    @Generated
    @Selector("insertString:atIndex:")
    public native void insertStringAtIndex(String aString, @NUInt long loc);

    @Generated
    @Selector("replaceCharactersInRange:withString:")
    public native void replaceCharactersInRangeWithString(@ByValue NSRange range, String aString);

    @Generated
    @Selector("replaceOccurrencesOfString:withString:options:range:")
    @NUInt
    public native long replaceOccurrencesOfStringWithStringOptionsRange(String target, String replacement,
            @NUInt long options, @ByValue NSRange searchRange);

    @Generated
    @Selector("setString:")
    public native void setString(String aString);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
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
}
