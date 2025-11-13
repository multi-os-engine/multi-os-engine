package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIViewControllerTransition extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UIViewControllerTransition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIViewControllerTransition alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIViewControllerTransition allocWithZone(VoidPtr zone);

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

    /**
     * View slides up from the bottom of the screen. Same as `UIModalTransitionStyle.coverVertical`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("coverVerticalTransition")
    @NotNull
    public static native UIViewControllerTransition coverVerticalTransition();

    /**
     * Fades out the current view while fading in the new view. Same as `UIModalTransitionStyle.crossDissolve`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("crossDissolveTransition")
    @NotNull
    public static native UIViewControllerTransition crossDissolveTransition();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * View flips horizontally in 3D. Same as `UIModalTransitionStyle.flipHorizontal`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("flipHorizontalTransition")
    @NotNull
    public static native UIViewControllerTransition flipHorizontalTransition();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIViewControllerTransition init();

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
    public static native UIViewControllerTransition new_objc();

    /**
     * One corner of the current view curls up to reveal the presented view underneath. Same as
     * `UIModalTransitionStyle.partialCurl`.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("partialCurlTransition")
    @NotNull
    public static native UIViewControllerTransition partialCurlTransition();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Zoom from the view provided by the `sourceViewProvider` to the presented or pushed view controller's view.
     * The transition's `sourceViewProvider` is called whenever the transition needs to request a source view.
     * Note that it may be called multiple times during the transition's lifecycle in order
     * to ensure that the transition incorporates the most up-to-date visuals.
     * 
     * **Example**
     * 
     * Consider an interface where a user may tap a cell representing a city to present a detail view.
     * In the detail view, they may swipe left or right to go to the next city in the list. When the detail view
     * is dismissed, it should un-zoom to the currently selected city rather than the one that was first selected.
     * ```
     * cityViewController.preferredTransition = .zoom { context in
     * let displayed = context.displayedViewController as! CityViewController
     * let source = context.sourceViewController as! CityListViewController
     * return source.cell(for: displayed.cityId)
     * }
     * present(cityViewController, animated: true)
     * ```
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("zoomWithOptions:sourceViewProvider:")
    @NotNull
    public static native UIViewControllerTransition zoomWithOptionsSourceViewProvider(
            @Nullable UIZoomTransitionOptions options,
            @ObjCBlock(name = "call_zoomWithOptionsSourceViewProvider") @NotNull Block_zoomWithOptionsSourceViewProvider sourceViewProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_zoomWithOptionsSourceViewProvider {
        @Generated
        @Nullable
        UIView call_zoomWithOptionsSourceViewProvider(@NotNull UIZoomTransitionSourceViewProviderContext arg0);
    }

    /**
     * Zoom from the `UIBarButtonItem` provided by the `sourceBarButtonItemProvider` to the presented or pushed view
     * controller's view.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("zoomWithOptions:sourceBarButtonItemProvider:")
    @NotNull
    public static native UIViewControllerTransition zoomWithOptionsSourceBarButtonItemProvider(
            @Nullable UIZoomTransitionOptions options,
            @ObjCBlock(name = "call_zoomWithOptionsSourceBarButtonItemProvider") @NotNull Block_zoomWithOptionsSourceBarButtonItemProvider sourceBarButtonItemProvider);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_zoomWithOptionsSourceBarButtonItemProvider {
        @Generated
        @Nullable
        UIBarButtonItem call_zoomWithOptionsSourceBarButtonItemProvider(
                @NotNull UIZoomTransitionSourceViewProviderContext arg0);
    }
}