package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIFindInteractionDelegate;
import apple.uikit.protocol.UIInteraction;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 16.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFindInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFindInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * If there's a currently active find session (implying isFindNavigatorVisible is true), returns the active find
     * session.
     */
    @Generated
    @Selector("activeFindSession")
    public native UIFindSession activeFindSession();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFindInteraction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIFindInteraction allocWithZone(VoidPtr zone);

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

    /**
     * See UIFindInteractionDelegate above.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFindInteractionDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("didMoveToView:")
    public native void didMoveToView(UIView view);

    /**
     * Dismisses the find navigator panel.
     */
    @Generated
    @Selector("dismissFindNavigator")
    public native void dismissFindNavigator();

    /**
     * Jump to the next found result in the document, relative to the currently highlighted result.
     */
    @Generated
    @Selector("findNext")
    public native void findNext();

    /**
     * Jump to the previous found result in the document, relative to the currently highlighted result.
     */
    @Generated
    @Selector("findPrevious")
    public native void findPrevious();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIFindInteraction init();

    /**
     * Creates a find interaction object with the specified delegate.
     */
    @Generated
    @Selector("initWithSessionDelegate:")
    public native UIFindInteraction initWithSessionDelegate(
            @Mapped(ObjCObjectMapper.class) UIFindInteractionDelegate sessionDelegate);

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
     * Returns YES if the find navigator panel is currently visible.
     */
    @Generated
    @Selector("isFindNavigatorVisible")
    public native boolean isFindNavigatorVisible();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIFindInteraction new_objc();

    /**
     * This provider is consulted when the search options menu is being populated. A default set of search options is
     * provided, representing the options
     * available in @c UITextSearchOptions, which can be either modified, augmented, or omitted.
     */
    @Generated
    @Selector("optionsMenuProvider")
    @ObjCBlock(name = "call_optionsMenuProvider_ret")
    public native Block_optionsMenuProvider_ret optionsMenuProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_optionsMenuProvider_ret {
        @Generated
        UIMenu call_optionsMenuProvider_ret(NSArray<? extends UIMenuElement> arg0);
    }

    /**
     * Shows the find navigator panel, if not already visible.
     * 
     * @param replaceVisible If the delegate supports text replacement, will make the replace text field
     *                       visible on first appearance.
     */
    @Generated
    @Selector("presentFindNavigatorShowingReplace:")
    public native void presentFindNavigatorShowingReplace(boolean showingReplace);

    /**
     * If replacement is supported, assign this property to pre-populate the system find panel's replace text field with
     * a replacement string.
     */
    @Generated
    @Selector("replacementText")
    public native String replacementText();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Assign this property to pre-populate the system find panel's search text field with a search query.
     */
    @Generated
    @Selector("searchText")
    public native String searchText();

    /**
     * This provider is consulted when the search options menu is being populated. A default set of search options is
     * provided, representing the options
     * available in @c UITextSearchOptions, which can be either modified, augmented, or omitted.
     */
    @Generated
    @Selector("setOptionsMenuProvider:")
    public native void setOptionsMenuProvider(
            @ObjCBlock(name = "call_setOptionsMenuProvider") Block_setOptionsMenuProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setOptionsMenuProvider {
        @Generated
        UIMenu call_setOptionsMenuProvider(NSArray<? extends UIMenuElement> arg0);
    }

    /**
     * If replacement is supported, assign this property to pre-populate the system find panel's replace text field with
     * a replacement string.
     */
    @Generated
    @Selector("setReplacementText:")
    public native void setReplacementText(String value);

    /**
     * Assign this property to pre-populate the system find panel's search text field with a search query.
     */
    @Generated
    @Selector("setSearchText:")
    public native void setSearchText(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Calling this triggers an update of the UI to reflect changes to the currently shown result count or result index,
     * as defined by UIFindSession.
     */
    @Generated
    @Selector("updateResultCount")
    public native void updateResultCount();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("view")
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(UIView view);
}