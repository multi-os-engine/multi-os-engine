package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
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
public class UIZoomTransitionOptions extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIZoomTransitionOptions(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Return a frame in the zoomed view controller's view to which to align the source view.
     * Return `CGRectNull` to indicate no preference.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("alignmentRectProvider")
    @ObjCBlock(name = "call_alignmentRectProvider_ret")
    @Nullable
    public native Block_alignmentRectProvider_ret alignmentRectProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_alignmentRectProvider_ret {
        @Generated
        @ByValue
        CGRect call_alignmentRectProvider_ret(@NotNull UIZoomTransitionAlignmentRectContext arg0);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIZoomTransitionOptions alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIZoomTransitionOptions allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Dimming color to apply to the content behind the zoomed in view. Set to nil to use the default.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("dimmingColor")
    @Nullable
    public native UIColor dimmingColor();

    /**
     * Visual effect to apply to the content behind the zoomed in view. Defaults to nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("dimmingVisualEffect")
    @Nullable
    public native UIBlurEffect dimmingVisualEffect();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIZoomTransitionOptions init();

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
     * Called when an interactive dismissal of this transition begins.
     * Return value indicates whether the interaction should begin for the given context.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("interactiveDismissShouldBegin")
    @ObjCBlock(name = "call_interactiveDismissShouldBegin_ret")
    @Nullable
    public native Block_interactiveDismissShouldBegin_ret interactiveDismissShouldBegin();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_interactiveDismissShouldBegin_ret {
        @Generated
        boolean call_interactiveDismissShouldBegin_ret(@NotNull UIZoomTransitionInteractionContext arg0);
    }

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
    public static native UIZoomTransitionOptions new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Return a frame in the zoomed view controller's view to which to align the source view.
     * Return `CGRectNull` to indicate no preference.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setAlignmentRectProvider:")
    public native void setAlignmentRectProvider(
            @ObjCBlock(name = "call_setAlignmentRectProvider") @Nullable Block_setAlignmentRectProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAlignmentRectProvider {
        @Generated
        @ByValue
        CGRect call_setAlignmentRectProvider(@NotNull UIZoomTransitionAlignmentRectContext arg0);
    }

    /**
     * Dimming color to apply to the content behind the zoomed in view. Set to nil to use the default.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDimmingColor:")
    public native void setDimmingColor(@Nullable UIColor value);

    /**
     * Visual effect to apply to the content behind the zoomed in view. Defaults to nil.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setDimmingVisualEffect:")
    public native void setDimmingVisualEffect(@Nullable UIBlurEffect value);

    /**
     * Called when an interactive dismissal of this transition begins.
     * Return value indicates whether the interaction should begin for the given context.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setInteractiveDismissShouldBegin:")
    public native void setInteractiveDismissShouldBegin(
            @ObjCBlock(name = "call_setInteractiveDismissShouldBegin") @Nullable Block_setInteractiveDismissShouldBegin value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInteractiveDismissShouldBegin {
        @Generated
        boolean call_setInteractiveDismissShouldBegin(@NotNull UIZoomTransitionInteractionContext arg0);
    }

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