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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAttributedString extends NSObject
        implements NSCopying, NSMutableCopying, NSSecureCoding, NSItemProviderReading, NSItemProviderWriting {
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
     * A convenience method for creating an attributed string containing attachment using NSAttachmentCharacter as the base character.
     */
    @Generated
    @Selector("attributedStringWithAttachment:")
    public static native NSAttributedString attributedStringWithAttachment(NSTextAttachment attachment);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    @Generated
    @Selector("attribute:atIndex:effectiveRange:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attributeAtIndexEffectiveRange(String attrName, @NUInt long location, NSRange range);

    @Generated
    @Selector("attribute:atIndex:longestEffectiveRange:inRange:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object attributeAtIndexLongestEffectiveRangeInRange(String attrName, @NUInt long location,
            NSRange range, @ByValue NSRange rangeLimit);

    @Generated
    @Selector("attributedSubstringFromRange:")
    public native NSAttributedString attributedSubstringFromRange(@ByValue NSRange range);

    @Generated
    @Selector("attributesAtIndex:effectiveRange:")
    public native NSDictionary<String, ?> attributesAtIndexEffectiveRange(@NUInt long location, NSRange range);

    @Generated
    @Selector("attributesAtIndex:longestEffectiveRange:inRange:")
    public native NSDictionary<String, ?> attributesAtIndexLongestEffectiveRangeInRange(@NUInt long location,
            NSRange range, @ByValue NSRange rangeLimit);

    @Generated
    @Selector("boundingRectWithSize:options:context:")
    @ByValue
    public native CGRect boundingRectWithSizeOptionsContext(@ByValue CGSize size, @NInt long options,
            NSStringDrawingContext context);

    /**
     * Returns YES if the receiver contains a property configured (NSAttachmentAttributeName with NSAttachmentCharacter) in range
     */
    @Generated
    @Selector("containsAttachmentsInRange:")
    public native boolean containsAttachmentsInRange(@ByValue NSRange range);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Generates an NSData object for the receiver contents in range.  It requires a document attributes dict specifying at least the NSDocumentTypeDocumentAttribute to determine the format to be written.
     */
    @Generated
    @Selector("dataFromRange:documentAttributes:error:")
    public native NSData dataFromRangeDocumentAttributesError(@ByValue NSRange range, NSDictionary<String, ?> dict,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("drawAtPoint:")
    public native void drawAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("drawInRect:")
    public native void drawInRect(@ByValue CGRect rect);

    @Generated
    @Selector("drawWithRect:options:context:")
    public native void drawWithRectOptionsContext(@ByValue CGRect rect, @NInt long options,
            NSStringDrawingContext context);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("enumerateAttribute:inRange:options:usingBlock:")
    public native void enumerateAttributeInRangeOptionsUsingBlock(String attrName, @ByValue NSRange enumerationRange,
            @NUInt long opts,
            @ObjCBlock(name = "call_enumerateAttributeInRangeOptionsUsingBlock") Block_enumerateAttributeInRangeOptionsUsingBlock block);

    @Generated
    @Selector("enumerateAttributesInRange:options:usingBlock:")
    public native void enumerateAttributesInRangeOptionsUsingBlock(@ByValue NSRange enumerationRange, @NUInt long opts,
            @ObjCBlock(name = "call_enumerateAttributesInRangeOptionsUsingBlock") Block_enumerateAttributesInRangeOptionsUsingBlock block);

    /**
     * Returns an NSFileWrapper object for the receiver contents in range.  It requires a document attributes dict specifying at least the NSDocumentTypeDocumentAttribute to determine the format to be written.  The method returns a directory file wrapper for those document types represented by a file package such as NSRTFDTextDocumentType; otherwise, it returns a regular-file file wrapper.
     */
    @Generated
    @Selector("fileWrapperFromRange:documentAttributes:error:")
    public native NSFileWrapper fileWrapperFromRangeDocumentAttributesError(@ByValue NSRange range,
            NSDictionary<String, ?> dict, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("init")
    public native NSAttributedString init();

    @Generated
    @Selector("initWithAttributedString:")
    public native NSAttributedString initWithAttributedString(NSAttributedString attrStr);

    @Generated
    @Selector("initWithCoder:")
    public native NSAttributedString initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithData:options:documentAttributes:error:")
    public native NSAttributedString initWithDataOptionsDocumentAttributesError(NSData data,
            NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("initWithFileURL:options:documentAttributes:error:")
    public native NSAttributedString initWithFileURLOptionsDocumentAttributesError(NSURL url,
            NSDictionary<?, ?> options, @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<?, ?>> dict,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithString:")
    public native NSAttributedString initWithString(String str);

    @Generated
    @Selector("initWithString:attributes:")
    public native NSAttributedString initWithStringAttributes(String str, NSDictionary<String, ?> attrs);

    /**
     * Methods initializing the receiver contents with an external document data.  options specify document attributes for interpreting the document contents.  NSDocumentTypeDocumentAttribute, NSCharacterEncodingDocumentAttribute, and NSDefaultAttributesDocumentAttribute are supported options key.  When they are not specified, these methods will examine the data and do their best to detect the appropriate attributes.  If dict is non-NULL, it will return a dictionary with various document-wide attributes accessible via NS...DocumentAttribute keys.
     */
    @Generated
    @Selector("initWithURL:options:documentAttributes:error:")
    public native NSAttributedString initWithURLOptionsDocumentAttributesError(NSURL url,
            NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("isEqualToAttributedString:")
    public native boolean isEqualToAttributedString(NSAttributedString other);

    @Generated
    @Selector("length")
    @NUInt
    public native long length();

    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

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
        void call_enumerateAttributeInRangeOptionsUsingBlock(@Mapped(ObjCObjectMapper.class) Object value,
                @ByValue NSRange range, BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAttributesInRangeOptionsUsingBlock {
        @Generated
        void call_enumerateAttributesInRangeOptionsUsingBlock(NSDictionary<String, ?> attrs, @ByValue NSRange range,
                BoolPtr stop);
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
    public static native NSAttributedString objectWithItemProviderDataTypeIdentifierError(NSData data,
            String typeIdentifier, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSAttributedString _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
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
     * Converts HTML data into an attributed string.
     * <p>
     * The completionHandler is passed the attributed string result along with any
     * document-level attributes, or an error. If neither NSTextEncodingNameDocumentOption nor
     * NSCharacterEncodingDocumentOption is supplied, a best-guess encoding is used.
     *
     * @param data              The HTML data to use as the contents.
     * @param options           Document attributes for interpreting the document contents.
     *                          NSTextSizeMultiplierDocumentOption, NSTimeoutDocumentOption, NSTextEncodingNameDocumentOption,
     *                          and NSCharacterEncodingDocumentOption are supported option keys.
     * @param completionHandler A block to invoke when the operation completes or fails.
     */
    @Generated
    @Selector("loadFromHTMLWithData:options:completionHandler:")
    public static native void loadFromHTMLWithDataOptionsCompletionHandler(NSData data, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_loadFromHTMLWithDataOptionsCompletionHandler") Block_loadFromHTMLWithDataOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromHTMLWithDataOptionsCompletionHandler {
        @Generated
        void call_loadFromHTMLWithDataOptionsCompletionHandler(NSAttributedString arg0, NSDictionary<String, ?> arg1,
                NSError arg2);
    }

    /**
     * Converts a local HTML file into an attributed string.
     * <p>
     * The completionHandler is passed the attributed string result along with any
     * document-level attributes, or an error. If NSReadAccessURLDocumentOption references a single file,
     * only that file may be loaded by WebKit. If NSReadAccessURLDocumentOption references a directory,
     * files inside that directory may be loaded by WebKit.
     *
     * @param fileURL           The file URL to load.
     * @param options           Document attributes for interpreting the document contents.
     *                          NSTextSizeMultiplierDocumentOption, NSTimeoutDocumentOption and NSReadAccessURLDocumentOption
     *                          are supported option keys.
     * @param completionHandler A block to invoke when the operation completes or fails.
     */
    @Generated
    @Selector("loadFromHTMLWithFileURL:options:completionHandler:")
    public static native void loadFromHTMLWithFileURLOptionsCompletionHandler(NSURL fileURL,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_loadFromHTMLWithFileURLOptionsCompletionHandler") Block_loadFromHTMLWithFileURLOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromHTMLWithFileURLOptionsCompletionHandler {
        @Generated
        void call_loadFromHTMLWithFileURLOptionsCompletionHandler(NSAttributedString arg0, NSDictionary<String, ?> arg1,
                NSError arg2);
    }

    /**
     * Loads an HTML URL request and converts the contents into an attributed string.
     * <p>
     * The completionHandler is passed the attributed string result along with any
     * document-level attributes, or an error.
     *
     * @param request           The request specifying the URL to load.
     * @param options           Document attributes for interpreting the document contents.
     *                          NSTextSizeMultiplierDocumentOption and NSTimeoutDocumentOption are supported option keys.
     * @param completionHandler A block to invoke when the operation completes or fails.
     */
    @Generated
    @Selector("loadFromHTMLWithRequest:options:completionHandler:")
    public static native void loadFromHTMLWithRequestOptionsCompletionHandler(NSURLRequest request,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_loadFromHTMLWithRequestOptionsCompletionHandler") Block_loadFromHTMLWithRequestOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromHTMLWithRequestOptionsCompletionHandler {
        @Generated
        void call_loadFromHTMLWithRequestOptionsCompletionHandler(NSAttributedString arg0, NSDictionary<String, ?> arg1,
                NSError arg2);
    }

    /**
     * Converts an HTML string into an attributed string.
     * <p>
     * The completionHandler is passed the attributed string result along with any
     * document-level attributes, or an error. NSBaseURLDocumentOption is used to resolve relative URLs
     * within the document.
     *
     * @param string            The HTML string to use as the contents.
     * @param options           Document attributes for interpreting the document contents.
     *                          NSTextSizeMultiplierDocumentOption, NSTimeoutDocumentOption and NSBaseURLDocumentOption
     *                          are supported option keys.
     * @param completionHandler A block to invoke when the operation completes or fails.
     */
    @Generated
    @Selector("loadFromHTMLWithString:options:completionHandler:")
    public static native void loadFromHTMLWithStringOptionsCompletionHandler(String string,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_loadFromHTMLWithStringOptionsCompletionHandler") Block_loadFromHTMLWithStringOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromHTMLWithStringOptionsCompletionHandler {
        @Generated
        void call_loadFromHTMLWithStringOptionsCompletionHandler(NSAttributedString arg0, NSDictionary<String, ?> arg1,
                NSError arg2);
    }

    /**
     * If the string has portions tagged with NSInflectionRuleAttributeName
     * that have no format specifiers, create a new string with those portions inflected
     * by following the rule in the attribute.
     */
    @Generated
    @Selector("attributedStringByInflectingString")
    public native NSAttributedString attributedStringByInflectingString();

    /**
     * These constructors have a 'baseURL' parameter. If specified, links in the document will be relative to this URL, and images in the document will be looked for relative to this URL (if the other options allow image loading).
     * Defaults to nil. If set to nil, paths will not be resolved.
     */
    @Generated
    @Selector("initWithContentsOfMarkdownFileAtURL:options:baseURL:error:")
    public native NSAttributedString initWithContentsOfMarkdownFileAtURLOptionsBaseURLError(NSURL markdownFile,
            NSAttributedStringMarkdownParsingOptions options, NSURL baseURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Formats the string using the specified locale (or the canonical one, if nil).
     */
    @Generated
    @Variadic()
    @Selector("initWithFormat:options:locale:")
    public native NSAttributedString initWithFormatOptionsLocale(NSAttributedString format, @NUInt long options,
            NSLocale locale, Object... varargs);

    /**
     * Formats the string using the arguments list and the specified locale (or the canonical one, if nil).
     */
    @Generated
    @Selector("initWithFormat:options:locale:arguments:")
    public native NSAttributedString initWithFormatOptionsLocaleArguments(NSAttributedString format,
            @NUInt long options, NSLocale locale, BytePtr arguments);

    @Generated
    @Selector("initWithMarkdown:options:baseURL:error:")
    public native NSAttributedString initWithMarkdownOptionsBaseURLError(NSData markdown,
            NSAttributedStringMarkdownParsingOptions options, NSURL baseURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithMarkdownString:options:baseURL:error:")
    public native NSAttributedString initWithMarkdownStringOptionsBaseURLError(String markdownString,
            NSAttributedStringMarkdownParsingOptions options, NSURL baseURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Formats the string using the current locale and default options.
     */
    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:")
    public static native NSAttributedString localizedAttributedStringWithFormat(NSAttributedString format,
            Object... varargs);

    /**
     * Formats the string using the current locale and the specified options.
     */
    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:options:")
    public static native NSAttributedString localizedAttributedStringWithFormatOptions(NSAttributedString format,
            @NUInt long options, Object... varargs);
}
