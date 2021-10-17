package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIScene extends UIResponder {
    static {
        NatJ.register();
    }

    @Generated
    protected UIScene(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * use the activation conditions to influence which scene is activated for banner taps, URLs, etc.
     */
    @Generated
    @Selector("activationConditions")
    public native UISceneActivationConditions activationConditions();

    /**
     * the activation state of this scene
     */
    @Generated
    @Selector("activationState")
    @NInt
    public native long activationState();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIScene alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIScene allocWithZone(VoidPtr zone);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * UIScene is strongly retained by UIKit like UIApplication, however, unlike UIApplication, the delegate may not need to live for the whole lifetime of the process.
     * A strong ref here relieves clients of the responsibility of managing the delegate lifetime directly.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIScene init();

    /**
     * An initializer for subclasses, will be called by UIKit and not intended to be called by applications.
     */
    @Generated
    @Selector("initWithSession:connectionOptions:")
    public native UIScene initWithSessionConnectionOptions(UISceneSession session,
            UISceneConnectionOptions connectionOptions);

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
    public static native UIScene new_objc();

    /**
     * Options are specified in the UIApplication.h section for openURL options.
     * An empty options dictionary will result in the same behavior as the older openURL call,
     * aside from the fact that this is asynchronous and calls the completion handler rather than returning a result.
     * The completion handler is called on the main queue.
     */
    @Generated
    @Selector("openURL:options:completionHandler:")
    public native void openURLOptionsCompletionHandler(NSURL url, UISceneOpenExternalURLOptions options,
            @ObjCBlock(name = "call_openURLOptionsCompletionHandler") Block_openURLOptionsCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openURLOptionsCompletionHandler {
        @Generated
        void call_openURLOptionsCompletionHandler(boolean success);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The existing representation which references this UIScene instance
     */
    @Generated
    @Selector("session")
    public native UISceneSession session();

    /**
     * use the activation conditions to influence which scene is activated for banner taps, URLs, etc.
     */
    @Generated
    @Selector("setActivationConditions:")
    public native void setActivationConditions(UISceneActivationConditions value);

    /**
     * UIScene is strongly retained by UIKit like UIApplication, however, unlike UIApplication, the delegate may not need to live for the whole lifetime of the process.
     * A strong ref here relieves clients of the responsibility of managing the delegate lifetime directly.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * A title for the scene to allow the system to differentiate multiple scenes for the user.
     * If set to nil or an empty string, the system will not display a title.
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * A title for the scene to allow the system to differentiate multiple scenes for the user.
     * If set to nil or an empty string, the system will not display a title.
     */
    @Generated
    @Selector("title")
    public native String title();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("pointerLockState")
    public native UIPointerLockState pointerLockState();

    @Generated
    @Selector("completeStateRestoration")
    public native void completeStateRestoration();

    @Generated
    @Selector("extendStateRestoration")
    public native void extendStateRestoration();

    /**
     * A subtitle that may be displayed adjacent to or below the primary title on supported platforms.
     * If set to an empty string, the system will not display a subtitle.
     */
    @Generated
    @Selector("setSubtitle:")
    public native void setSubtitle(String value);

    /**
     * A subtitle that may be displayed adjacent to or below the primary title on supported platforms.
     * If set to an empty string, the system will not display a subtitle.
     */
    @Generated
    @Selector("subtitle")
    public native String subtitle();
}