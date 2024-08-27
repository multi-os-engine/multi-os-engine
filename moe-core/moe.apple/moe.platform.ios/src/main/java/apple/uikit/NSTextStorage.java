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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSAttributedStringMarkdownParsingOptions;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSLocale;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableAttributedString;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLRequest;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.uikit.protocol.NSTextStorageDelegate;
import apple.uikit.protocol.NSTextStorageObserving;
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
 * Note for subclassing NSTextStorage: NSTextStorage is a semi-abstract subclass of NSMutableAttributedString. It
 * implements change management (beginEditing/endEditing), verification of attributes, delegate handling, and layout
 * management notification. The one aspect it does not implement is the actual attributed string storage --- this is
 * left up to the subclassers, which need to override the two NSMutableAttributedString primitives in addition to two
 * NSAttributedString primitives:
 * 
 * - (NSString *)string;
 * - (NSDictionary *)attributesAtIndex:(NSUInteger)location effectiveRange:(NSRangePointer)range;
 * 
 * - (void)replaceCharactersInRange:(NSRange)range withString:(NSString *)str;
 * - (void)setAttributes:(NSDictionary *)attrs range:(NSRange)range;
 * 
 * These primitives should perform the change then call edited:range:changeInLength: to get everything else to happen.
 * 
 * API-Since: 7.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextStorage extends NSMutableAttributedString implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSTextStorage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSTextStorage alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSTextStorage allocWithZone(VoidPtr zone);

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
    public static native NSTextStorage new_objc();

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

    /**
     * Adds aLayoutManager to the receiver. Sends -[NSLayoutManager setTextStorage:] to aLayoutManager with the
     * receiver.
     */
    @Generated
    @Selector("addLayoutManager:")
    public native void addLayoutManager(@NotNull NSLayoutManager aLayoutManager);

    /**
     * The length delta for the pending changes.
     */
    @Generated
    @Selector("changeInLength")
    @NInt
    public native long changeInLength();

    /**
     * Delegate ***************************
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextStorageDelegate delegate();

    /**
     * Notifies and records a recent change. If there are no outstanding -beginEditing calls, this method calls
     * -processEditing to trigger post-editing processes. This method has to be called by the primitives after changes
     * are made if subclassed and overridden. editedRange is the range in the original string (before the edit).
     */
    @Generated
    @Selector("edited:range:changeInLength:")
    public native void editedRangeChangeInLength(@NUInt long editedMask, @ByValue NSRange editedRange,
            @NInt long delta);

    /**
     * The NSTextStorageEditActions mask indicating that there are pending changes for attributes, characters, or both.
     */
    @Generated
    @Selector("editedMask")
    @NUInt
    public native long editedMask();

    /**
     * The range for pending changes. {NSNotFound, 0} when there is no pending changes.
     */
    @Generated
    @Selector("editedRange")
    @ByValue
    public native NSRange editedRange();

    /**
     * Ensures all attributes in range are validated and ready to be used. An NSTextStorage that is lazy is required to
     * call the following method before accessing any attributes. This gives the attribute fixing a chance to occur if
     * necessary. NSTextStorage subclasses that wish to support laziness must call it from all attribute accessors that
     * they implement. The default concrete subclass does call this from its accessors.
     */
    @Generated
    @Selector("ensureAttributesAreFixedInRange:")
    public native void ensureAttributesAreFixedInRange(@ByValue NSRange range);

    /**
     * Indicates if the receiver fixes invalidated attributes lazily. The concrete UIKit subclass fixes attributes
     * lazily by default. The abstract class (hence, all custom subclasses) is not lazy.
     */
    @Generated
    @Selector("fixesAttributesLazily")
    public native boolean fixesAttributesLazily();

    @Generated
    @Selector("init")
    public native NSTextStorage init();

    @Generated
    @Selector("initWithAttributedString:")
    public native NSTextStorage initWithAttributedString(@NotNull NSAttributedString attrStr);

    @Generated
    @Selector("initWithCoder:")
    public native NSTextStorage initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithData:options:documentAttributes:error:")
    public native NSTextStorage initWithDataOptionsDocumentAttributesError(@NotNull NSData data,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("initWithFileURL:options:documentAttributes:error:")
    public native NSTextStorage initWithFileURLOptionsDocumentAttributesError(@NotNull NSURL url,
            @NotNull NSDictionary<?, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<?, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithString:")
    public native NSTextStorage initWithString(@NotNull String str);

    @Generated
    @Selector("initWithString:attributes:")
    public native NSTextStorage initWithStringAttributes(@NotNull String str, @Nullable NSDictionary<String, ?> attrs);

    @Generated
    @Selector("initWithURL:options:documentAttributes:error:")
    public native NSTextStorage initWithURLOptionsDocumentAttributesError(@NotNull NSURL url,
            @NotNull NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Notes the range of attributes that requires validation. If the NSTextStorage is not lazy this just calls
     * fixAttributesInRange:. If it is lazy this instead just records the range needing fixing in order to do it later.
     */
    @Generated
    @Selector("invalidateAttributesInRange:")
    public native void invalidateAttributesInRange(@ByValue NSRange range);

    /**
     * NSLayoutManager objects owned by the receiver.
     */
    @NotNull
    @Generated
    @Selector("layoutManagers")
    public native NSArray<? extends NSLayoutManager> layoutManagers();

    /**
     * Sends out -textStorage:willProcessEditing, fixes the attributes, sends out -textStorage:didProcessEditing, and
     * notifies the layout managers of change with the
     * -processEditingForTextStorage:edited:range:changeInLength:invalidatedRange: method. Invoked from
     * -edited:range:changeInLength: or -endEditing.
     */
    @Generated
    @Selector("processEditing")
    public native void processEditing();

    /**
     * Removes aLayoutManager from the receiver if already owned by it. Sends -[NSLayoutManager setTextStorage:] to
     * aLayoutManager with nil.
     */
    @Generated
    @Selector("removeLayoutManager:")
    public native void removeLayoutManager(@NotNull NSLayoutManager aLayoutManager);

    /**
     * Delegate ***************************
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSTextStorageDelegate value);

    /**
     * Delegate ***************************
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSTextStorageDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

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
    public static native NSTextStorage objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSTextStorage _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

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

    @Generated
    @Selector("initWithContentsOfMarkdownFileAtURL:options:baseURL:error:")
    public native NSTextStorage initWithContentsOfMarkdownFileAtURLOptionsBaseURLError(@NotNull NSURL markdownFile,
            @Nullable NSAttributedStringMarkdownParsingOptions options, @Nullable NSURL baseURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("initWithFormat:options:locale:")
    public native NSTextStorage initWithFormatOptionsLocale(@NotNull NSAttributedString format, @NUInt long options,
            @Nullable NSLocale locale, Object... varargs);

    @Generated
    @Selector("initWithFormat:options:locale:arguments:")
    public native NSTextStorage initWithFormatOptionsLocaleArguments(@NotNull NSAttributedString format,
            @NUInt long options, @Nullable NSLocale locale, BytePtr arguments);

    @Generated
    @Selector("initWithMarkdown:options:baseURL:error:")
    public native NSTextStorage initWithMarkdownOptionsBaseURLError(@NotNull NSData markdown,
            @Nullable NSAttributedStringMarkdownParsingOptions options, @Nullable NSURL baseURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithMarkdownString:options:baseURL:error:")
    public native NSTextStorage initWithMarkdownStringOptionsBaseURLError(@NotNull String markdownString,
            @Nullable NSAttributedStringMarkdownParsingOptions options, @Nullable NSURL baseURL,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @NotNull
    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:")
    public static native NSTextStorage localizedAttributedStringWithFormat(@NotNull NSAttributedString format,
            Object... varargs);

    @NotNull
    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:options:")
    public static native NSTextStorage localizedAttributedStringWithFormatOptions(@NotNull NSAttributedString format,
            @NUInt long options, Object... varargs);

    /**
     * NSTextStorageObserving ***************************
     * An object conforming to NSTextStorageObserving observing and retaining NSTextStorage
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTextStorageObserver:")
    public native void setTextStorageObserver_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) NSTextStorageObserving value);

    /**
     * NSTextStorageObserving ***************************
     * An object conforming to NSTextStorageObserving observing and retaining NSTextStorage
     * 
     * API-Since: 15.0
     */
    @Generated
    public void setTextStorageObserver(@Nullable @Mapped(ObjCObjectMapper.class) NSTextStorageObserving value) {
        Object __old = textStorageObserver();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTextStorageObserver_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * NSTextStorageObserving ***************************
     * An object conforming to NSTextStorageObserving observing and retaining NSTextStorage
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("textStorageObserver")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextStorageObserving textStorageObserver();

    @Generated
    @Variadic()
    @Selector("initWithFormat:options:locale:context:")
    public native NSTextStorage initWithFormatOptionsLocaleContext(@NotNull NSAttributedString format,
            @NUInt long options, @Nullable NSLocale locale, @NotNull NSDictionary<String, ?> context,
            Object... varargs);

    @Generated
    @Selector("initWithFormat:options:locale:context:arguments:")
    public native NSTextStorage initWithFormatOptionsLocaleContextArguments(@NotNull NSAttributedString format,
            @NUInt long options, @Nullable NSLocale locale, @NotNull NSDictionary<String, ?> context,
            BytePtr arguments);

    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:context:")
    @NotNull
    public static native NSTextStorage localizedAttributedStringWithFormatContext(@NotNull NSAttributedString format,
            @NotNull NSDictionary<String, ?> context, Object... varargs);

    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:options:context:")
    @NotNull
    public static native NSTextStorage localizedAttributedStringWithFormatOptionsContext(
            @NotNull NSAttributedString format, @NUInt long options, @NotNull NSDictionary<String, ?> context,
            Object... varargs);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
