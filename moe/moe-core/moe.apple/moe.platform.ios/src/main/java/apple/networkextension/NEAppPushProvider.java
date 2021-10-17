package apple.networkextension;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] NEAppPushProvider
 * <p>
 * The NEAppPushProvider class declares a programmatic interface to manage a life cycle of app push provider. It also allows the provider to handle outgoing
 * communication message from the containing app, and pass incoming call message to the containing app.
 * NEAppPushProvider is part of NetworkExtension.framework
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEAppPushProvider extends NEProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected NEAppPushProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEAppPushProvider alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NEAppPushProvider allocWithZone(VoidPtr zone);

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

    /**
     * handleTimerEvent
     * <p>
     * This method is called by the framework periodically after every 60 seconds. Subclasses must override this method to perform necessary tasks.
     */
    @Generated
    @Selector("handleTimerEvent")
    public native void handleTimerEvent();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEAppPushProvider init();

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
    public static native NEAppPushProvider new_objc();

    /**
     * [@property] providerConfiguration
     * <p>
     * A dictionary containing current vendor-specific configuration parameters. This dictionary is provided by NEAppPushManager. Use KVO to watch for changes.
     */
    @Generated
    @Selector("providerConfiguration")
    public native NSDictionary<String, ?> providerConfiguration();

    /**
     * reportIncomingCallWithUserInfo:userinfo:
     * <p>
     * This function is called by the provider when it determines incoming call on the conection.
     *
     * @param userInfo A dictionary of custom information associated with the incoming call. This dictionary is passed to containg app as-is.
     */
    @Generated
    @Selector("reportIncomingCallWithUserInfo:")
    public native void reportIncomingCallWithUserInfo(NSDictionary<?, ?> userInfo);

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
     * startWithCompletionHandler:completionHandler:
     * <p>
     * This method is called by the framework when the provider is started. Subclasses must override this method to create a connection with its server.
     *
     * @param completionHandler A block that must be called when the provider establishes a connection with the server. If the providers fails to create a connection,
     *                          the subclass' implementation of this method must pass a non-nil NSError object to this block. A value of nil passed to the completion handler indicates that the connection
     *                          was successfully created.
     */
    @Generated
    @Selector("startWithCompletionHandler:")
    public native void startWithCompletionHandler(
            @ObjCBlock(name = "call_startWithCompletionHandler") Block_startWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startWithCompletionHandler {
        @Generated
        void call_startWithCompletionHandler(NSError error);
    }

    /**
     * stopWithReason:reason:completionHandler:
     * <p>
     * This method is called by the framework when the app push provider needs to be stopped. Subclasses must override this method to perform necessary tasks.
     *
     * @param reason            An NEProviderStopReason indicating why the provider was stopped.
     * @param completionHandler A block that must be called when the provider is completely stopped.
     */
    @Generated
    @Selector("stopWithReason:completionHandler:")
    public native void stopWithReasonCompletionHandler(@NInt long reason,
            @ObjCBlock(name = "call_stopWithReasonCompletionHandler") Block_stopWithReasonCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopWithReasonCompletionHandler {
        @Generated
        void call_stopWithReasonCompletionHandler();
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * start
     * <p>
     * This method is called by the framework when the provider is started. Subclasses must override this method to create a connection with its server.
     */
    @Generated
    @Selector("start")
    public native void start();
}
