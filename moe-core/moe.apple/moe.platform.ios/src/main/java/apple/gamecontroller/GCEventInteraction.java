package apple.gamecontroller;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIView;
import apple.uikit.protocol.UIInteraction;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An interaction that indicates the view's intent to receive game controller
 * events through the Game Controller framework.
 * 
 * On visionOS, users can interact with your app using a game controller. By
 * default, the system converts game controller actions into pinch events and
 * sends them to the view the user is gazing at, its gesture recognizers, and
 * then up the responder chain.
 * 
 * If you use the Game Controller framework to handle game controller events
 * for part of your user interface, add an instance of `GCEventInteraction`
 * to the root of that part of your app’s view hierarchy. For example, if you
 * are writing a game using Metal, add this interaction to the view that hosts
 * your game’s `CAMetalLayer`.
 * 
 * [@note]
 * This class should not be subclassed.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("GameController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GCEventInteraction extends NSObject implements UIInteraction {
    static {
        NatJ.register();
    }

    @Generated
    protected GCEventInteraction(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GCEventInteraction alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native GCEventInteraction allocWithZone(VoidPtr zone);

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
    @Selector("didMoveToView:")
    public native void didMoveToView(@Nullable UIView view);

    /**
     * The types of game controller events that should be delivered through
     * the Game Controller framework.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("handledEventTypes")
    @NUInt
    public native long handledEventTypes();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates a game controller interaction.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("init")
    public native GCEventInteraction init();

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
    public static native GCEventInteraction new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The types of game controller events that should be delivered through
     * the Game Controller framework.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setHandledEventTypes:")
    public native void setHandledEventTypes(@NUInt long value);

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

    @Generated
    @Selector("view")
    @Nullable
    public native UIView view();

    @Generated
    @Selector("willMoveToView:")
    public native void willMoveToView(@Nullable UIView view);

    /**
     * A Boolean value that determines whether events are delivered exclusively
     * through the Game Controller framework.
     * 
     * If `YES`, events of the types specified by `handledEventTypes` are
     * delivered both through the Game Controller framework and as UIKit event
     * objects to your app's views and gesture recognizers.
     * 
     * If `NO`, events of the types specified by `handledEventTypes` are
     * delivered **exclusively** through the Game Controller framework.
     * 
     * The default value of this property is `NO`.
     * This property has no effect if `handledEventTypes` is `GCUIEventTypeNone`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("receivesEventsInView")
    public native boolean receivesEventsInView();

    /**
     * A Boolean value that determines whether events are delivered exclusively
     * through the Game Controller framework.
     * 
     * If `YES`, events of the types specified by `handledEventTypes` are
     * delivered both through the Game Controller framework and as UIKit event
     * objects to your app's views and gesture recognizers.
     * 
     * If `NO`, events of the types specified by `handledEventTypes` are
     * delivered **exclusively** through the Game Controller framework.
     * 
     * The default value of this property is `NO`.
     * This property has no effect if `handledEventTypes` is `GCUIEventTypeNone`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setReceivesEventsInView:")
    public native void setReceivesEventsInView(boolean value);
}