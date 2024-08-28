package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIInteraction;
import apple.uikit.protocol.UISpringLoadedInteractionBehavior;
import apple.uikit.protocol.UISpringLoadedInteractionEffect;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UISpringLoadedInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected UISpringLoadedInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UISpringLoadedInteraction alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UISpringLoadedInteraction allocWithZone(VoidPtr zone);

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
    @Selector("didMoveToView:")
    public native void didMoveToView(@Nullable UIView view);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UISpringLoadedInteraction init();

    /**
     * A springloaded interaction with the default interaction behavior and effect.
     * 
     * @param handler The handler to be performed when springloading is activated.
     * @return An initialized springloaded interaction object or `nil` if the springloaded interaction could not be
     *         initialized.
     */
    @Generated
    @Selector("initWithActivationHandler:")
    public native UISpringLoadedInteraction initWithActivationHandler(
            @NotNull @ObjCBlock(name = "call_initWithActivationHandler") Block_initWithActivationHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithActivationHandler {
        @Generated
        void call_initWithActivationHandler(@NotNull UISpringLoadedInteraction interaction,
                @NotNull @Mapped(ObjCObjectMapper.class) Object context);
    }

    /**
     * The designated `UISpringLoadedInteraction` initializer.
     * 
     * @param interactionBehavior The interaction behavior object controlling the springloaded interaction activation.
     *                            If nil, the default behavior will be used.
     * @param interactionEffect   The interaction effect object styling the interaction's view. If nil, the default
     *                            effect will be used.
     * @param handler             The handler to be performed when springloading is activated.
     * @return An initialized springloaded interaction object or `nil` if the springloaded interaction could not be
     *         initialized.
     */
    @Generated
    @Selector("initWithInteractionBehavior:interactionEffect:activationHandler:")
    public native UISpringLoadedInteraction initWithInteractionBehaviorInteractionEffectActivationHandler(
            @Nullable @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionBehavior interactionBehavior,
            @Nullable @Mapped(ObjCObjectMapper.class) UISpringLoadedInteractionEffect interactionEffect,
            @NotNull @ObjCBlock(name = "call_initWithInteractionBehaviorInteractionEffectActivationHandler") Block_initWithInteractionBehaviorInteractionEffectActivationHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithInteractionBehaviorInteractionEffectActivationHandler {
        @Generated
        void call_initWithInteractionBehaviorInteractionEffectActivationHandler(
                @NotNull UISpringLoadedInteraction interaction,
                @NotNull @Mapped(ObjCObjectMapper.class) Object context);
    }

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
    @Selector("interactionBehavior")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISpringLoadedInteractionBehavior interactionBehavior();

    @NotNull
    @Generated
    @Selector("interactionEffect")
    @MappedReturn(ObjCObjectMapper.class)
    public native UISpringLoadedInteractionEffect interactionEffect();

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
    public static native UISpringLoadedInteraction new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Nullable
    @Generated
    @Selector("view")
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(@Nullable UIView view);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
