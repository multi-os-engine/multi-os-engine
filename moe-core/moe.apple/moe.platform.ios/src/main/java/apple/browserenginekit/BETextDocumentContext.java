package apple.browserenginekit;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
import apple.foundation.struct.NSRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BETextDocumentContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BETextDocumentContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Adds a text `rect` for the given character `range`
     * The CGRects representing each character range are specified in -textInputView coordinates.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("addTextRect:forCharacterRange:")
    public native void addTextRectForCharacterRange(@ByValue CGRect rect, @ByValue NSRange range);

    @Generated
    @Owned
    @Selector("alloc")
    public static native BETextDocumentContext alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BETextDocumentContext allocWithZone(VoidPtr zone);

    /**
     * Array of `NSRange` values, relative to the full context string made by combining the
     * `contextBefore`, `markedText` (or `selectedText` if the marked text is empty), and the
     * `contextAfter`.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("autocorrectedRanges")
    @NotNull
    public native NSArray<? extends NSValue> autocorrectedRanges();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    @Selector("init")
    public native BETextDocumentContext init();

    /**
     * Initializes a new document context with attributed strings. The `selectedText`, `contextBefore`, and
     * `contextAfter`
     * represent the same ranges as they do in the `-initWithSelectedText:contextBefore:contextAfter:` initializer.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("initWithAttributedSelectedText:contextBefore:contextAfter:markedText:selectedRangeInMarkedText:")
    public native BETextDocumentContext initWithAttributedSelectedTextContextBeforeContextAfterMarkedTextSelectedRangeInMarkedText(
            @Nullable NSAttributedString selectedText, @Nullable NSAttributedString contextBefore,
            @Nullable NSAttributedString contextAfter, @Nullable NSAttributedString markedText,
            @ByValue NSRange selectedRangeInMarkedText);

    /**
     * Initializes a new document context with plain text.
     * 
     * @param selectedText              The currently selected text, or nil in the case of a caret selection.
     *                                  This string may be empty but non-nil if non-textual content is selected, in
     *                                  which case a single call to -deleteBackward will not delete from
     *                                  contextBeforeSelection.
     *                                  May be empty if its outside of the context's area, even if it exists elsewhere
     *                                  in the document.
     * @param contextBefore             A suffix of the text preceding the selection, or nil if the selection is at the
     *                                  beginning of the document.
     *                                  This text must correspond to a range that does not include any non-text content.
     *                                  In particular, if a context comprises k backward-deletion clusters, then k calls
     *                                  to -deleteBackward must delete the corresponding text from the document.
     *                                  The beginning of this string must lie on a word boundary (or not be inside a
     *                                  word at all).
     * @param contextAfter              A prefix of the text following the selection, or nil if the selection is at the
     *                                  end of the document.
     *                                  This text must correspond to a range that does not include any non-text content.
     *                                  The end of this string must lie on a word boundary (or not be inside a word at
     *                                  all).
     * @param markedText                May be empty if it's outside of the context's area, even if it exists elsewhere
     *                                  in the document.
     * @param selectedRangeInMarkedText The range of the current text selection, relative to the marked text range.
     *                                  Specify (NSNotFound, 0) if there is no marked text.
     * 
     *                                  API-Since: 17.4
     */
    @Generated
    @Selector("initWithSelectedText:contextBefore:contextAfter:markedText:selectedRangeInMarkedText:")
    public native BETextDocumentContext initWithSelectedTextContextBeforeContextAfterMarkedTextSelectedRangeInMarkedText(
            @Nullable String selectedText, @Nullable String contextBefore, @Nullable String contextAfter,
            @Nullable String markedText, @ByValue NSRange selectedRangeInMarkedText);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native BETextDocumentContext new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Array of `NSRange` values, relative to the full context string made by combining the
     * `contextBefore`, `markedText` (or `selectedText` if the marked text is empty), and the
     * `contextAfter`.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setAutocorrectedRanges:")
    public native void setAutocorrectedRanges(@NotNull NSArray<? extends NSValue> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}