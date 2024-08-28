package apple.safariservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 * Deprecated-Since: 12.0
 */
@Deprecated
@Generated
@Library("SafariServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SFAuthenticationSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SFAuthenticationSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SFAuthenticationSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SFAuthenticationSession allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Cancel an SFAuthenticationSession. If the view controller is already presented to load the webpage for
     * authentication,
     * it will be dismissed. Calling cancel on an already canceled session will have no effect.
     */
    @Generated
    @Selector("cancel")
    public native void cancel();

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
    public native SFAuthenticationSession init();

    /**
     * Returns a SFAuthenticationSession object.
     * 
     * @param URL               the initial URL pointing to the authentication webpage. Only supports URLs with http://
     *                          or https:// schemes.
     * @param callbackURLScheme the custom URL scheme that the app expects in the callback URL.
     * @param completionHandler the completion handler which is called when the session is completed successfully or
     *                          canceled by user.
     */
    @Generated
    @Selector("initWithURL:callbackURLScheme:completionHandler:")
    public native SFAuthenticationSession initWithURLCallbackURLSchemeCompletionHandler(@NotNull NSURL URL,
            @Nullable String callbackURLScheme,
            @NotNull @ObjCBlock(name = "call_initWithURLCallbackURLSchemeCompletionHandler") Block_initWithURLCallbackURLSchemeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithURLCallbackURLSchemeCompletionHandler {
        @Generated
        void call_initWithURLCallbackURLSchemeCompletionHandler(@Nullable NSURL callbackURL, @Nullable NSError error);
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
    public static native SFAuthenticationSession new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Starts the SFAuthenticationSession instance after it is instantiated.
     * 
     * start can only be called once for an SFAuthenticationSession instance. This also means calling start on a
     * canceled session will fail.
     * 
     * @return Returns YES if the session starts successfully.
     */
    @Generated
    @Selector("start")
    public native boolean start();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
