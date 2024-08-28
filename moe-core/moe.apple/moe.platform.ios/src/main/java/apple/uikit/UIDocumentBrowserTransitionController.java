package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIViewControllerAnimatedTransitioning;
import apple.uikit.protocol.UIViewControllerContextTransitioning;
import apple.uikit.protocol.UIViewImplicitlyAnimating;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Class to handle the loading and animation transition when opening or closing a document.
 * 
 * You can use this object to display a loading indicator if you need time to perform time-consuming operations
 * (loading, parsing, …) after the document download and before presenting it. You can also get a transition controller
 * to pass to UIKit when pushing or presenting your document view
 * in response to @c documentBrowser:didPickItem:, or when popping or dismissing it.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIDocumentBrowserTransitionController extends NSObject implements UIViewControllerAnimatedTransitioning {
    static {
        NatJ.register();
    }

    @Generated
    protected UIDocumentBrowserTransitionController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIDocumentBrowserTransitionController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIDocumentBrowserTransitionController allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateTransition:")
    public native void animateTransition(
            @NotNull @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    @Generated
    @IsOptional
    @Selector("animationEnded:")
    public native void animationEnded(boolean transitionCompleted);

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
    @Selector("init")
    public native UIDocumentBrowserTransitionController init();

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

    @NotNull
    @Generated
    @IsOptional
    @Selector("interruptibleAnimatorForTransition:")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIViewImplicitlyAnimating interruptibleAnimatorForTransition(
            @NotNull @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * An optional progress can be displayed on the document thumbnail while the document is loading (during opening).
     */
    @Nullable
    @Generated
    @Selector("loadingProgress")
    public native NSProgress loadingProgress();

    @Generated
    @Owned
    @Selector("new")
    public static native UIDocumentBrowserTransitionController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * An optional progress can be displayed on the document thumbnail while the document is loading (during opening).
     */
    @Generated
    @Selector("setLoadingProgress:")
    public native void setLoadingProgress(@Nullable NSProgress value);

    /**
     * This view will be used for the zoom transition from/to the document collection view.
     * If UIDocumentBrowserViewController is being dismissed, this view should be a subview of the presented view
     * controller's view
     * If UIDocumentBrowserViewController is being presented, this view should be a subview of the presenting view
     * controller's view
     */
    @Generated
    @Selector("setTargetView:")
    public native void setTargetView_unsafe(@Nullable UIView value);

    /**
     * This view will be used for the zoom transition from/to the document collection view.
     * If UIDocumentBrowserViewController is being dismissed, this view should be a subview of the presented view
     * controller's view
     * If UIDocumentBrowserViewController is being presented, this view should be a subview of the presenting view
     * controller's view
     */
    @Generated
    public void setTargetView(@Nullable UIView value) {
        Object __old = targetView();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTargetView_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * This view will be used for the zoom transition from/to the document collection view.
     * If UIDocumentBrowserViewController is being dismissed, this view should be a subview of the presented view
     * controller's view
     * If UIDocumentBrowserViewController is being presented, this view should be a subview of the presenting view
     * controller's view
     */
    @Nullable
    @Generated
    @Selector("targetView")
    public native UIView targetView();

    @Generated
    @Selector("transitionDuration:")
    public native double transitionDuration(
            @Nullable @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
