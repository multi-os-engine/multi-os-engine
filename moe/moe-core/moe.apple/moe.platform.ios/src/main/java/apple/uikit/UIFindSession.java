package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
 * UIFindSession
 * 
 * An abstract base class for managing a find session.
 * 
 * A UIFindSession instance is returned by UIFindInteractionDelegate when a find session is initiated
 * by the user. You can choose to implement a subclass of UIFindSession to handle all state, decoration,
 * and behavior yourself. This would be the preferred choice if the view your find interaction is attached to
 * is very custom in the way it handles the presentation of found results. Other clients are encouraged to
 * instead use UISearchableObjectFindSession and the UITextSearching protocol, which manages the
 * state of a find session automatically using behavior consistent with the rest of the system.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFindSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFindSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFindSession alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIFindSession allocWithZone(VoidPtr zone);

    /**
     * API-Since: 16.0
     * Deprecated-Since: 16.0
     */
    @Generated
    @Deprecated
    @Selector("allowsReplacement")
    public native boolean allowsReplacement();

    /**
     * Return YES if replacement is allowed for the currently highlighted item. This property controls the enabled state
     * of the "replace" button in the find navigator, as well as various hardware keyboard shortcuts involving
     * replacement.
     * Default is YES, if supportsReplacement is YES.
     */
    @Generated
    @Selector("allowsReplacementForCurrentlyHighlightedResult")
    public native boolean allowsReplacementForCurrentlyHighlightedResult();

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

    /**
     * Called when either the next or previous button is activated, or when return or shift+return is pressed in the
     * search field.
     * 
     * @param direction Which direction the user intends to move, either forward or backward.
     */
    @Generated
    @Selector("highlightNextResultInDirection:")
    public native void highlightNextResultInDirection(@NInt long direction);

    /**
     * Returns the index of the currently highlighted result, out of @c resultCount.
     * If no result is currently highlighted, return NSNotFound.
     * You may call UIFindInteraction's @c updateResultCount to update the system find panel's UI if already visible.
     */
    @Generated
    @Selector("highlightedResultIndex")
    @NInt
    public native long highlightedResultIndex();

    @Generated
    @Selector("init")
    public native UIFindSession init();

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

    /**
     * This method will be called whenever the current find session's found/highlighted results are to be invalidated.
     * For instance,
     * when the search query is cleared, options changed, or any other event where we may not perform another search
     * right away.
     */
    @Generated
    @Selector("invalidateFoundResults")
    public native void invalidateFoundResults();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIFindSession new_objc();

    /**
     * Called when the user requests a search to be performed for @c query, using @c options.
     * 
     * @param query   The search string entered into the search text field in the system find panel.
     * @param options Object representing all configured search options for this search.
     */
    @Generated
    @Selector("performSearchWithQuery:options:")
    public native void performSearchWithQueryOptions(String query, UITextSearchOptions options);

    /**
     * Called when the user requests a single replacement to occur given @c searchQuery and @c replacementString.
     * 
     * @param searchQuery       The search string entered into the search text field in the system find panel.
     * @param replacementString The replacement string entered into the replace text field in the system find panel.
     * @param options           Object representing all configured search options for this replacement.
     */
    @Generated
    @Selector("performSingleReplacementWithSearchQuery:replacementString:options:")
    public native void performSingleReplacementWithSearchQueryReplacementStringOptions(String searchQuery,
            String replacementString, UITextSearchOptions options);

    /**
     * Called when the user requests a document-wide replacement to occur.
     * 
     * @param searchQuery       The search string entered into the search text field in the system find panel.
     * @param replacementString The replacement string entered into the replace text field in the system find panel.
     * @param options           Object representing all configured search options for this replacement.
     */
    @Generated
    @Selector("replaceAllInstancesOfSearchQuery:withReplacementString:options:")
    public native void replaceAllInstancesOfSearchQueryWithReplacementStringOptions(String searchQuery,
            String replacementString, UITextSearchOptions options);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the total number of results.
     * You may call UIFindInteraction's @c updateResultCount to update the system find panel's UI if already visible.
     */
    @Generated
    @Selector("resultCount")
    @NInt
    public native long resultCount();

    /**
     * Defines how results are reported through the find panel's UI. The default style is @c CurrentAndTotal.
     */
    @Generated
    @Selector("searchResultDisplayStyle")
    @NInt
    public native long searchResultDisplayStyle();

    /**
     * Defines how results are reported through the find panel's UI. The default style is @c CurrentAndTotal.
     */
    @Generated
    @Selector("setSearchResultDisplayStyle:")
    public native void setSearchResultDisplayStyle(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Return YES if replacement is supported. This gates the appearance of replace UI in the find navigator panel.
     * Default is NO.
     */
    @Generated
    @Selector("supportsReplacement")
    public native boolean supportsReplacement();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}