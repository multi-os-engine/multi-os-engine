package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSAttributedString;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
 * A data object that you use to share your custom view’s text with Writing Tools.
 * 
 * At the start of every Writing Tools operation, you create one or more
 * `UIWritingToolsCoordinator.Context` objects with a copy of the text you want Writing Tools
 * to evaluate. Each Writing Tools operation starts with a call to the
 * ``UIWritingToolsCoordinator/Delegate/writingToolsCoordinator(_:requestsContextsFor:completion:)``
 * method of your ``UIWritingToolsCoordinator/Delegate`` object. Use the parameters
 * of that method to determine how much of your view’s text to provide. For
 * some operations, Writing Tools asks for all of your view’s text, but in
 * others it asks for only a portion of the text. When Writing Tools finishes
 * its evaluation, it reports changes back to your delegate relative to the
 * context objects you provided.
 * 
 * When Writing Tools asks for your view’s text, create one or more
 * `UIWritingToolsCoordinator.Context` objects with the requested content. If your view
 * contains only one text storage object, create only one context object for
 * the request. However, if you use multiple text storage objects to manage
 * different parts of your view’s content, you might need to create multiple
 * context objects. The actual number depends on how much of your text Writing
 * Tools asks for. For example, when Writing Tools asks for all of your view’s
 * content, you return one context object for each text storage object in your
 * view. However, if Writing Tools asks for the current selection, and one
 * text storage object contains all of the selected text, you create only
 * one context object for the content.
 * 
 * Writing Tools uses your context objects as the starting point for its
 * evaluations, and as a reference point for any changes. Because Writing
 * Tools doesn’t know anything about your view or its content, it makes
 * suggestions only relative to your context objects. It’s your responsibility
 * to take those suggestions and incorporate them back into your view’s
 * text storage. In some cases, you might need to store additional information
 * to update your storage correctly. For example, you might need to store,
 * and update as needed, the offset from the start of your document to the
 * start of the text in your context object.
 * 
 * When Writing Tools asks for the currently selected text in your view,
 * include some of the surrounding text in your context object as well.
 * Supply a string that includes the selection and any text up to the nearest
 * paragraph boundary. When creating your context object, specify a range
 * value that represents the portion of that string that corresponds to the
 * text selection. Providing some additional text in your context object can
 * help Writing Tools improve its evaluation of your content. Writing Tools
 * uses the ``resolvedRange`` property of your context object to indicate
 * what text it considered.
 * 
 * If your context object includes text that you don’t want Writing Tools to
 * evaluate, add the `excludeFromWritingTools` attribute to the corresponding
 * characters of your <doc://com.apple.documentation/documentation/foundation/nsattributedstring>
 * object. You might add this attribute if the text string includes a code
 * listing or readonly content that you don’t want Writing Tools to change.
 * 
 * API-Since: 18.2
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIWritingToolsCoordinatorContext extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIWritingToolsCoordinatorContext(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIWritingToolsCoordinatorContext alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIWritingToolsCoordinatorContext allocWithZone(VoidPtr zone);

    /**
     * The portion of your view’s text to evaluate.
     * 
     * The `UIWritingToolsCoordinator/Context` object initializes the value of this
     * property at creation time and doesn’t change it during the course of an operation.
     * Instead, it suggests changes to the text in the indicated range and reports
     * those changes to your ``UIWritingToolsCoordinator/Delegate`` object. Use the methods
     * of your delegate object to integrate those changes back into your view’s text storage.
     * 
     * It’s your responsibility to track the location of this text in your
     * view’s text storage object. When Writing Tools reports changes,
     * it provides range values relative to this string. If you initialize
     * this property with a subset of your view’s content, you must adjust
     * any ranges that Writing Tools provides to get the correct location
     * in your text storage.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("attributedString")
    @NotNull
    public native NSAttributedString attributedString();

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

    /**
     * The unique identifier of the context object.
     * 
     * The ``UIWritingToolsCoordinator/Context`` object initializes the value of
     * this property at creation time. Use this value to identify the
     * context object within your app.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("identifier")
    @NotNull
    public native NSUUID identifier();

    @Generated
    @Selector("init")
    public native UIWritingToolsCoordinatorContext init();

    /**
     * Creates a context object with the specified attributed string and range
     * information.
     * 
     * - Parameters:
     * - attributedString: A string that contains some or all of the content
     * from your view’s text storage. This initializer makes a copy of the
     * string you provide, so you can discard the original when you’re done.
     * - range: The portion of `attributedString` you want Writing Tools to
     * evaluate. If you want Writing Tools to evaluate the entire string you
     * provided, specify a range with a location of `0` and a length equal to
     * your string’s length. If you want Writing Tools to evaluate only part
     * of the string, provide the appropriate range in this parameter. Writing
     * Tools suggests changes only to the range of text you specify, but it
     * can consider text outside that range during the evaluation process.
     * 
     * When Writing Tools asks for your view’s current selection, it’s best to
     * create a string that includes text before and after that selection. During
     * the evaluation process, Writing Tools can use the additional text you
     * provided to improve the results it delivers. If you do provide additional
     * text, set the `range` parameter to the portion of `attributedString` with
     * the current selection. Don’t use the `range` parameter to specify the
     * location of the text in your view’s text storage.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("initWithAttributedString:range:")
    public native UIWritingToolsCoordinatorContext initWithAttributedStringRange(
            @NotNull NSAttributedString attributedString, @ByValue NSRange range);

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
    public static native UIWritingToolsCoordinatorContext new_objc();

    /**
     * The range it was initialized with
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("range")
    @ByValue
    public native NSRange range();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The range where Writing Tools suggests replacements, may be larger than range
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("resolvedRange")
    @ByValue
    public native NSRange resolvedRange();

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