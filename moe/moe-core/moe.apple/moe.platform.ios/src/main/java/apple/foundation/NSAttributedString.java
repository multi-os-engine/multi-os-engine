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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSMutableCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.uikit.NSStringDrawingContext;
import apple.uikit.NSTextAttachment;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.2
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAttributedString extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding,
        NSItemProviderReading, NSItemProviderWriting {
    static {
        NatJ.register();
    }

    @Generated
    protected NSAttributedString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSAttributedString alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSAttributedString allocWithZone(VoidPtr zone);

    /**
     * A convenience method for creating an attributed string containing attachment using NSAttachmentCharacter as the
     * base character.
     * 
     * API-Since: 7.0
     */
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
    public static native NSAttributedString new_objc();

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

    @Nullable
    @Generated
    @Selector("attribute:atIndex:effectiveRange:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attributeAtIndexEffectiveRange(@NotNull String attrName, @NUInt long location,
            @Nullable NSRange range);

    @Nullable
    @Generated
    @Selector("attribute:atIndex:longestEffectiveRange:inRange:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attributeAtIndexLongestEffectiveRangeInRange(@NotNull String attrName, @NUInt long location,
            @Nullable NSRange range, @ByValue NSRange rangeLimit);

    @NotNull
    @Generated
    @Selector("attributedSubstringFromRange:")
    public native NSAttributedString attributedSubstringFromRange(@ByValue NSRange range);

    @NotNull
    @Generated
    @Selector("attributesAtIndex:effectiveRange:")
    public native NSDictionary<String, ?> attributesAtIndexEffectiveRange(@NUInt long location,
            @Nullable NSRange range);

    @NotNull
    @Generated
    @Selector("attributesAtIndex:longestEffectiveRange:inRange:")
    public native NSDictionary<String, ?> attributesAtIndexLongestEffectiveRangeInRange(@NUInt long location,
            @Nullable NSRange range, @ByValue NSRange rangeLimit);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("boundingRectWithSize:options:context:")
    @ByValue
    public native CGRect boundingRectWithSizeOptionsContext(@ByValue CGSize size, @NInt long options,
            @Nullable NSStringDrawingContext context);

    /**
     * Returns YES if the receiver contains a property configured (NSAttachmentAttributeName with NSAttachmentCharacter)
     * in range
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("containsAttachmentsInRange:")
    public native boolean containsAttachmentsInRange(@ByValue NSRange range);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Generates an NSData object for the receiver contents in range. It requires a document attributes dict specifying
     * at least the NSDocumentTypeDocumentAttribute to determine the format to be written.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("dataFromRange:documentAttributes:error:")
    public native NSData dataFromRangeDocumentAttributesError(@ByValue NSRange range,
            @NotNull NSDictionary<String, ?> dict, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("drawAtPoint:")
    public native void drawAtPoint(@ByValue CGPoint point);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("drawInRect:")
    public native void drawInRect(@ByValue CGRect rect);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("drawWithRect:options:context:")
    public native void drawWithRectOptionsContext(@ByValue CGRect rect, @NInt long options,
            @Nullable NSStringDrawingContext context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateAttribute:inRange:options:usingBlock:")
    public native void enumerateAttributeInRangeOptionsUsingBlock(@NotNull String attrName,
            @ByValue NSRange enumerationRange, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateAttributeInRangeOptionsUsingBlock") Block_enumerateAttributeInRangeOptionsUsingBlock block);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("enumerateAttributesInRange:options:usingBlock:")
    public native void enumerateAttributesInRangeOptionsUsingBlock(@ByValue NSRange enumerationRange, @NUInt long opts,
            @NotNull @ObjCBlock(name = "call_enumerateAttributesInRangeOptionsUsingBlock") Block_enumerateAttributesInRangeOptionsUsingBlock block);

    /**
     * Returns an NSFileWrapper object for the receiver contents in range. It requires a document attributes dict
     * specifying at least the NSDocumentTypeDocumentAttribute to determine the format to be written. The method returns
     * a directory file wrapper for those document types represented by a file package such as NSRTFDTextDocumentType;
     * otherwise, it returns a regular-file file wrapper.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("fileWrapperFromRange:documentAttributes:error:")
    public native NSFileWrapper fileWrapperFromRangeDocumentAttributesError(@ByValue NSRange range,
            @NotNull NSDictionary<String, ?> dict, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSAttributedString init();

    @Generated
    @Selector("initWithAttributedString:")
    public native NSAttributedString initWithAttributedString(@NotNull NSAttributedString attrStr);

    @Generated
    @Selector("initWithCoder:")
    public native NSAttributedString initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("initWithData:options:documentAttributes:error:")
    public native NSAttributedString initWithDataOptionsDocumentAttributesError(@NotNull NSData data,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 7.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("initWithFileURL:options:documentAttributes:error:")
    public native NSAttributedString initWithFileURLOptionsDocumentAttributesError(@NotNull NSURL url,
            @NotNull NSDictionary<?, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<?, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithString:")
    public native NSAttributedString initWithString(@NotNull String str);

    @Generated
    @Selector("initWithString:attributes:")
    public native NSAttributedString initWithStringAttributes(@NotNull String str,
            @Nullable NSDictionary<String, ?> attrs);

    /**
     * Methods initializing the receiver contents with an external document data. options specify document attributes
     * for interpreting the document contents. NSDocumentTypeDocumentAttribute, NSCharacterEncodingDocumentAttribute,
     * and NSDefaultAttributesDocumentAttribute are supported options key. When they are not specified, these methods
     * will examine the data and do their best to detect the appropriate attributes. If dict is non-NULL, it will return
     * a dictionary with various document-wide attributes accessible via NS...DocumentAttribute keys.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("initWithURL:options:documentAttributes:error:")
    public native NSAttributedString initWithURLOptionsDocumentAttributesError(@NotNull NSURL url,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("isEqualToAttributedString:")
    public native boolean isEqualToAttributedString(@NotNull NSAttributedString other);

    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * Override these two APIs when subclassing NSAttributedString
     */
    @NotNull
    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAttributeInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateAttributeInRangeOptionsUsingBlock(@Nullable @Mapped(ObjCObjectMapper.class) Object value,
                @ByValue NSRange range, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAttributesInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateAttributesInRangeOptionsUsingBlock(@NotNull NSDictionary<String, ?> attrs,
                @ByValue NSRange range, @NotNull BoolPtr stop);
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

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(@NotNull String typeIdentifier);

    @Nullable
    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(@NotNull String typeIdentifier,
            @NotNull @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Nullable
    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native NSAttributedString objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSAttributedString _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
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
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * Converts HTML data into an attributed string.
     * 
     * The completionHandler is passed the attributed string result along with any
     * document-level attributes, or an error. If neither NSTextEncodingNameDocumentOption nor
     * NSCharacterEncodingDocumentOption is supplied, a best-guess encoding is used.
     * 
     * API-Since: 13.0
     * 
     * @param data              The HTML data to use as the contents.
     * @param options           Document attributes for interpreting the document contents.
     *                          NSTextSizeMultiplierDocumentOption, NSTimeoutDocumentOption,
     *                          NSTextEncodingNameDocumentOption,
     *                          and NSCharacterEncodingDocumentOption are supported option keys.
     * @param completionHandler A block to invoke when the operation completes or fails.
     */
    @Generated
    @Selector("loadFromHTMLWithData:options:completionHandler:")
    public static native void loadFromHTMLWithDataOptionsCompletionHandler(@NotNull NSData data,
            @NotNull NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_loadFromHTMLWithDataOptionsCompletionHandler") Block_loadFromHTMLWithDataOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromHTMLWithDataOptionsCompletionHandler {
        @Generated
        void call_loadFromHTMLWithDataOptionsCompletionHandler(@Nullable NSAttributedString arg0,
                @Nullable NSDictionary<String, ?> arg1, @Nullable NSError arg2);
    }

    /**
     * Converts a local HTML file into an attributed string.
     * 
     * The completionHandler is passed the attributed string result along with any
     * document-level attributes, or an error. If NSReadAccessURLDocumentOption references a single file,
     * only that file may be loaded by WebKit. If NSReadAccessURLDocumentOption references a directory,
     * files inside that directory may be loaded by WebKit.
     * 
     * API-Since: 13.0
     * 
     * @param fileURL           The file URL to load.
     * @param options           Document attributes for interpreting the document contents.
     *                          NSTextSizeMultiplierDocumentOption, NSTimeoutDocumentOption and
     *                          NSReadAccessURLDocumentOption
     *                          are supported option keys.
     * @param completionHandler A block to invoke when the operation completes or fails.
     */
    @Generated
    @Selector("loadFromHTMLWithFileURL:options:completionHandler:")
    public static native void loadFromHTMLWithFileURLOptionsCompletionHandler(@NotNull NSURL fileURL,
            @NotNull NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_loadFromHTMLWithFileURLOptionsCompletionHandler") Block_loadFromHTMLWithFileURLOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromHTMLWithFileURLOptionsCompletionHandler {
        @Generated
        void call_loadFromHTMLWithFileURLOptionsCompletionHandler(@Nullable NSAttributedString arg0,
                @Nullable NSDictionary<String, ?> arg1, @Nullable NSError arg2);
    }

    /**
     * Loads an HTML URL request and converts the contents into an attributed string.
     * 
     * The completionHandler is passed the attributed string result along with any
     * document-level attributes, or an error.
     * 
     * API-Since: 13.0
     * 
     * @param request           The request specifying the URL to load.
     * @param options           Document attributes for interpreting the document contents.
     *                          NSTextSizeMultiplierDocumentOption and NSTimeoutDocumentOption are supported option
     *                          keys.
     * @param completionHandler A block to invoke when the operation completes or fails.
     */
    @Generated
    @Selector("loadFromHTMLWithRequest:options:completionHandler:")
    public static native void loadFromHTMLWithRequestOptionsCompletionHandler(@NotNull NSURLRequest request,
            @NotNull NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_loadFromHTMLWithRequestOptionsCompletionHandler") Block_loadFromHTMLWithRequestOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromHTMLWithRequestOptionsCompletionHandler {
        @Generated
        void call_loadFromHTMLWithRequestOptionsCompletionHandler(@Nullable NSAttributedString arg0,
                @Nullable NSDictionary<String, ?> arg1, @Nullable NSError arg2);
    }

    /**
     * Converts an HTML string into an attributed string.
     * 
     * The completionHandler is passed the attributed string result along with any
     * document-level attributes, or an error. NSBaseURLDocumentOption is used to resolve relative URLs
     * within the document.
     * 
     * API-Since: 13.0
     * 
     * @param string            The HTML string to use as the contents.
     * @param options           Document attributes for interpreting the document contents.
     *                          NSTextSizeMultiplierDocumentOption, NSTimeoutDocumentOption and NSBaseURLDocumentOption
     *                          are supported option keys.
     * @param completionHandler A block to invoke when the operation completes or fails.
     */
    @Generated
    @Selector("loadFromHTMLWithString:options:completionHandler:")
    public static native void loadFromHTMLWithStringOptionsCompletionHandler(@NotNull String string,
            @NotNull NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_loadFromHTMLWithStringOptionsCompletionHandler") Block_loadFromHTMLWithStringOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromHTMLWithStringOptionsCompletionHandler {
        @Generated
        void call_loadFromHTMLWithStringOptionsCompletionHandler(@Nullable NSAttributedString arg0,
                @Nullable NSDictionary<String, ?> arg1, @Nullable NSError arg2);
    }

    /**
     * If the string has portions tagged with NSInflectionRuleAttributeName
     * that have no format specifiers, create a new string with those portions inflected
     * by following the rule in the attribute.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Selector("attributedStringByInflectingString")
    public native NSAttributedString attributedStringByInflectingString();

    /**
     * These constructors have a 'baseURL' parameter. If specified, links in the document will be relative to this URL,
     * and images in the document will be looked for relative to this URL (if the other options allow image loading).
     * Defaults to nil. If set to nil, paths will not be resolved.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithContentsOfMarkdownFileAtURL:options:baseURL:error:")
    public native NSAttributedString initWithContentsOfMarkdownFileAtURLOptionsBaseURLError(@NotNull NSURL markdownFile,
            @Nullable NSAttributedStringMarkdownParsingOptions options, @Nullable NSURL baseURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Formats the string using the specified locale (or the canonical one, if nil).
     * 
     * API-Since: 15.0
     */
    @Generated
    @Variadic()
    @Selector("initWithFormat:options:locale:")
    public native NSAttributedString initWithFormatOptionsLocale(@NotNull NSAttributedString format,
            @NUInt long options, @Nullable NSLocale locale, Object... varargs);

    /**
     * Formats the string using the arguments list and the specified locale (or the canonical one, if nil).
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithFormat:options:locale:arguments:")
    public native NSAttributedString initWithFormatOptionsLocaleArguments(@NotNull NSAttributedString format,
            @NUInt long options, @Nullable NSLocale locale, BytePtr arguments);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithMarkdown:options:baseURL:error:")
    public native NSAttributedString initWithMarkdownOptionsBaseURLError(@NotNull NSData markdown,
            @Nullable NSAttributedStringMarkdownParsingOptions options, @Nullable NSURL baseURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("initWithMarkdownString:options:baseURL:error:")
    public native NSAttributedString initWithMarkdownStringOptionsBaseURLError(@NotNull String markdownString,
            @Nullable NSAttributedStringMarkdownParsingOptions options, @Nullable NSURL baseURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Formats the string using the current locale and default options.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:")
    public static native NSAttributedString localizedAttributedStringWithFormat(@NotNull NSAttributedString format,
            Object... varargs);

    /**
     * Formats the string using the current locale and the specified options.
     * 
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:options:")
    public static native NSAttributedString localizedAttributedStringWithFormatOptions(
            @NotNull NSAttributedString format, @NUInt long options, Object... varargs);
}
