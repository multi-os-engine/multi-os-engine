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
import apple.uikit.NSTextAttachment;
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
import org.moe.natj.general.ptr.BytePtr;
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

/**
 * API-Since: 3.2
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableAttributedString extends NSAttributedString {
    static {
        NatJ.register();
    }

    @Generated
    protected NSMutableAttributedString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSMutableAttributedString alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSMutableAttributedString allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("attributedStringWithAttachment:")
    public static native NSAttributedString attributedStringWithAttachment(@NotNull NSTextAttachment attachment);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

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

    @Generated
    @Owned
    @Selector("new")
    public static native NSMutableAttributedString new_objc();

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
    @Selector("addAttribute:value:range:")
    public native void addAttributeValueRange(@NotNull String name,
            @NotNull @Mapped(ObjCObjectMapper.class) Object value, @ByValue NSRange range);

    @Generated
    @Selector("addAttributes:range:")
    public native void addAttributesRange(@NotNull NSDictionary<String, ?> attrs, @ByValue NSRange range);

    @Generated
    @Selector("appendAttributedString:")
    public native void appendAttributedString(@NotNull NSAttributedString attrString);

    @Generated
    @Selector("beginEditing")
    public native void beginEditing();

    @Generated
    @Selector("deleteCharactersInRange:")
    public native void deleteCharactersInRange(@ByValue NSRange range);

    @Generated
    @Selector("endEditing")
    public native void endEditing();

    /**
     * This method fixes attribute inconsistencies inside range. It ensures NSFontAttributeName covers the characters,
     * NSParagraphStyleAttributeName is only changing at paragraph boundaries, and NSTextAttachmentAttributeName is
     * assigned to NSAttachmentCharacter. NSTextStorage automatically invokes this method via
     * -ensureAttributesAreFixedInRange:.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("fixAttributesInRange:")
    public native void fixAttributesInRange(@ByValue NSRange range);

    @Generated
    @Selector("init")
    public native NSMutableAttributedString init();

    @Generated
    @Selector("initWithAttributedString:")
    public native NSMutableAttributedString initWithAttributedString(@NotNull NSAttributedString attrStr);

    @Generated
    @Selector("initWithCoder:")
    public native NSMutableAttributedString initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithData:options:documentAttributes:error:")
    public native NSMutableAttributedString initWithDataOptionsDocumentAttributesError(@NotNull NSData data,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("initWithFileURL:options:documentAttributes:error:")
    public native NSMutableAttributedString initWithFileURLOptionsDocumentAttributesError(@NotNull NSURL url,
            @NotNull NSDictionary<?, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<?, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithString:")
    public native NSMutableAttributedString initWithString(@NotNull String str);

    @Generated
    @Selector("initWithString:attributes:")
    public native NSMutableAttributedString initWithStringAttributes(@NotNull String str,
            @Nullable NSDictionary<String, ?> attrs);

    @Generated
    @Selector("initWithURL:options:documentAttributes:error:")
    public native NSMutableAttributedString initWithURLOptionsDocumentAttributesError(@NotNull NSURL url,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("insertAttributedString:atIndex:")
    public native void insertAttributedStringAtIndex(@NotNull NSAttributedString attrString, @NUInt long loc);

    @NotNull
    @Generated
    @Selector("mutableString")
    public native NSMutableString mutableString();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("readFromData:options:documentAttributes:error:")
    public native boolean readFromDataOptionsDocumentAttributesError(@NotNull NSData data,
            @NotNull NSDictionary<String, ?> opts,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("readFromFileURL:options:documentAttributes:error:")
    public native boolean readFromFileURLOptionsDocumentAttributesError(@NotNull NSURL url,
            @NotNull NSDictionary<?, ?> opts,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<?, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Methods replacing the receiver contents with an external document data. options specify document attributes for
     * interpreting the document contents. NSDocumentTypeDocumentAttribute, NSCharacterEncodingDocumentAttribute, and
     * NSDefaultAttributesDocumentAttribute are supported options key. When they are not specified, these methods will
     * examine the data and do their best to detect the appropriate attributes. If dict is non-NULL, it will return a
     * dictionary with various document-wide attributes accessible via NS...DocumentAttribute keys.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("readFromURL:options:documentAttributes:error:")
    public native boolean readFromURLOptionsDocumentAttributesError(@NotNull NSURL url,
            @NotNull NSDictionary<String, ?> opts,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("removeAttribute:range:")
    public native void removeAttributeRange(@NotNull String name, @ByValue NSRange range);

    @Generated
    @Selector("replaceCharactersInRange:withAttributedString:")
    public native void replaceCharactersInRangeWithAttributedString(@ByValue NSRange range,
            @NotNull NSAttributedString attrString);

    /**
     * Override these two APIs (in addition to the two for NSAttributedString) when subclassing
     * NSMutableAttributedString
     */
    @Generated
    @Selector("replaceCharactersInRange:withString:")
    public native void replaceCharactersInRangeWithString(@ByValue NSRange range, @NotNull String str);

    @Generated
    @Selector("setAttributedString:")
    public native void setAttributedString(@NotNull NSAttributedString attrString);

    @Generated
    @Selector("setAttributes:range:")
    public native void setAttributesRange(@Nullable NSDictionary<String, ?> attrs, @ByValue NSRange range);

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
    public static native NSMutableAttributedString objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSMutableAttributedString _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
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

    @Generated
    @Selector("loadFromHTMLWithData:options:completionHandler:")
    public static native void loadFromHTMLWithDataOptionsCompletionHandler(@NotNull NSData data,
            @NotNull NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_loadFromHTMLWithDataOptionsCompletionHandler") NSAttributedString.Block_loadFromHTMLWithDataOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("loadFromHTMLWithFileURL:options:completionHandler:")
    public static native void loadFromHTMLWithFileURLOptionsCompletionHandler(@NotNull NSURL fileURL,
            @NotNull NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_loadFromHTMLWithFileURLOptionsCompletionHandler") NSAttributedString.Block_loadFromHTMLWithFileURLOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("loadFromHTMLWithRequest:options:completionHandler:")
    public static native void loadFromHTMLWithRequestOptionsCompletionHandler(@NotNull NSURLRequest request,
            @NotNull NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_loadFromHTMLWithRequestOptionsCompletionHandler") NSAttributedString.Block_loadFromHTMLWithRequestOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("loadFromHTMLWithString:options:completionHandler:")
    public static native void loadFromHTMLWithStringOptionsCompletionHandler(@NotNull String string,
            @NotNull NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_loadFromHTMLWithStringOptionsCompletionHandler") NSAttributedString.Block_loadFromHTMLWithStringOptionsCompletionHandler completionHandler);

    /**
     * Formats the specified string and arguments with the current locale,
     * then appends the result to the receiver.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Variadic()
    @Selector("appendLocalizedFormat:")
    public native void appendLocalizedFormat(@NotNull NSAttributedString format, Object... varargs);

    @Generated
    @Selector("initWithContentsOfMarkdownFileAtURL:options:baseURL:error:")
    public native NSMutableAttributedString initWithContentsOfMarkdownFileAtURLOptionsBaseURLError(
            @NotNull NSURL markdownFile, @Nullable NSAttributedStringMarkdownParsingOptions options,
            @Nullable NSURL baseURL, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("initWithFormat:options:locale:")
    public native NSMutableAttributedString initWithFormatOptionsLocale(@NotNull NSAttributedString format,
            @NUInt long options, @Nullable NSLocale locale, Object... varargs);

    @Generated
    @Selector("initWithFormat:options:locale:arguments:")
    public native NSMutableAttributedString initWithFormatOptionsLocaleArguments(@NotNull NSAttributedString format,
            @NUInt long options, @Nullable NSLocale locale, BytePtr arguments);

    @Generated
    @Selector("initWithMarkdown:options:baseURL:error:")
    public native NSMutableAttributedString initWithMarkdownOptionsBaseURLError(@NotNull NSData markdown,
            @Nullable NSAttributedStringMarkdownParsingOptions options, @Nullable NSURL baseURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithMarkdownString:options:baseURL:error:")
    public native NSMutableAttributedString initWithMarkdownStringOptionsBaseURLError(@NotNull String markdownString,
            @Nullable NSAttributedStringMarkdownParsingOptions options, @Nullable NSURL baseURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @NotNull
    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:")
    public static native NSMutableAttributedString localizedAttributedStringWithFormat(
            @NotNull NSAttributedString format, Object... varargs);

    @NotNull
    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:options:")
    public static native NSMutableAttributedString localizedAttributedStringWithFormatOptions(
            @NotNull NSAttributedString format, @NUInt long options, Object... varargs);

    @Generated
    @Variadic()
    @Selector("initWithFormat:options:locale:context:")
    public native NSMutableAttributedString initWithFormatOptionsLocaleContext(@NotNull NSAttributedString format,
            @NUInt long options, @Nullable NSLocale locale, @NotNull NSDictionary<String, ?> context,
            Object... varargs);

    @Generated
    @Selector("initWithFormat:options:locale:context:arguments:")
    public native NSMutableAttributedString initWithFormatOptionsLocaleContextArguments(
            @NotNull NSAttributedString format, @NUInt long options, @Nullable NSLocale locale,
            @NotNull NSDictionary<String, ?> context, BytePtr arguments);

    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:context:")
    @NotNull
    public static native NSMutableAttributedString localizedAttributedStringWithFormatContext(
            @NotNull NSAttributedString format, @NotNull NSDictionary<String, ?> context, Object... varargs);

    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:options:context:")
    @NotNull
    public static native NSMutableAttributedString localizedAttributedStringWithFormatOptionsContext(
            @NotNull NSAttributedString format, @NUInt long options, @NotNull NSDictionary<String, ?> context,
            Object... varargs);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
