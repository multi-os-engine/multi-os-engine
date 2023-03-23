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
    public native void addLayoutManager(NSLayoutManager aLayoutManager);

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
    public native NSTextStorage initWithAttributedString(NSAttributedString attrStr);

    @Generated
    @Selector("initWithCoder:")
    public native NSTextStorage initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithData:options:documentAttributes:error:")
    public native NSTextStorage initWithDataOptionsDocumentAttributesError(NSData data, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Deprecated
    @Selector("initWithFileURL:options:documentAttributes:error:")
    public native NSTextStorage initWithFileURLOptionsDocumentAttributesError(NSURL url, NSDictionary<?, ?> options,
            @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<?, ?>> dict,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithString:")
    public native NSTextStorage initWithString(String str);

    @Generated
    @Selector("initWithString:attributes:")
    public native NSTextStorage initWithStringAttributes(String str, NSDictionary<String, ?> attrs);

    @Generated
    @Selector("initWithURL:options:documentAttributes:error:")
    public native NSTextStorage initWithURLOptionsDocumentAttributesError(NSURL url, NSDictionary<String, ?> options,
            @ReferenceInfo(type = NSDictionary.class) Ptr<NSDictionary<String, ?>> dict,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
    public native void removeLayoutManager(NSLayoutManager aLayoutManager);

    /**
     * Delegate ***************************
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) NSTextStorageDelegate value);

    /**
     * Delegate ***************************
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) NSTextStorageDelegate value) {
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
    public static native NSTextStorage objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public NSTextStorage _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("loadFromHTMLWithData:options:completionHandler:")
    public static native void loadFromHTMLWithDataOptionsCompletionHandler(NSData data, NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_loadFromHTMLWithDataOptionsCompletionHandler") NSAttributedString.Block_loadFromHTMLWithDataOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("loadFromHTMLWithFileURL:options:completionHandler:")
    public static native void loadFromHTMLWithFileURLOptionsCompletionHandler(NSURL fileURL,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_loadFromHTMLWithFileURLOptionsCompletionHandler") NSAttributedString.Block_loadFromHTMLWithFileURLOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("loadFromHTMLWithRequest:options:completionHandler:")
    public static native void loadFromHTMLWithRequestOptionsCompletionHandler(NSURLRequest request,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_loadFromHTMLWithRequestOptionsCompletionHandler") NSAttributedString.Block_loadFromHTMLWithRequestOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("loadFromHTMLWithString:options:completionHandler:")
    public static native void loadFromHTMLWithStringOptionsCompletionHandler(String string,
            NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_loadFromHTMLWithStringOptionsCompletionHandler") NSAttributedString.Block_loadFromHTMLWithStringOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("initWithContentsOfMarkdownFileAtURL:options:baseURL:error:")
    public native NSTextStorage initWithContentsOfMarkdownFileAtURLOptionsBaseURLError(NSURL markdownFile,
            NSAttributedStringMarkdownParsingOptions options, NSURL baseURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("initWithFormat:options:locale:")
    public native NSTextStorage initWithFormatOptionsLocale(NSAttributedString format, @NUInt long options,
            NSLocale locale, Object... varargs);

    @Generated
    @Selector("initWithFormat:options:locale:arguments:")
    public native NSTextStorage initWithFormatOptionsLocaleArguments(NSAttributedString format, @NUInt long options,
            NSLocale locale, BytePtr arguments);

    @Generated
    @Selector("initWithMarkdown:options:baseURL:error:")
    public native NSTextStorage initWithMarkdownOptionsBaseURLError(NSData markdown,
            NSAttributedStringMarkdownParsingOptions options, NSURL baseURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("initWithMarkdownString:options:baseURL:error:")
    public native NSTextStorage initWithMarkdownStringOptionsBaseURLError(String markdownString,
            NSAttributedStringMarkdownParsingOptions options, NSURL baseURL,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:")
    public static native NSTextStorage localizedAttributedStringWithFormat(NSAttributedString format,
            Object... varargs);

    @Generated
    @Variadic()
    @Selector("localizedAttributedStringWithFormat:options:")
    public static native NSTextStorage localizedAttributedStringWithFormatOptions(NSAttributedString format,
            @NUInt long options, Object... varargs);

    /**
     * NSTextStorageObserving ***************************
     * An object conforming to NSTextStorageObserving observing and retaining NSTextStorage
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTextStorageObserver:")
    public native void setTextStorageObserver_unsafe(@Mapped(ObjCObjectMapper.class) NSTextStorageObserving value);

    /**
     * NSTextStorageObserving ***************************
     * An object conforming to NSTextStorageObserving observing and retaining NSTextStorage
     * 
     * API-Since: 15.0
     */
    @Generated
    public void setTextStorageObserver(@Mapped(ObjCObjectMapper.class) NSTextStorageObserving value) {
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
    @Generated
    @Selector("textStorageObserver")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSTextStorageObserving textStorageObserver();
}
