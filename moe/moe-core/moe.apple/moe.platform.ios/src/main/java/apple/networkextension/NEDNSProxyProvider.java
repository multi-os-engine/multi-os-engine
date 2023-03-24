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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEDNSProxyProvider
 * 
 * The NEDNSProxyProvider class declares the programmatic interface for an object that implements the client side of a
 * custom DNS proxy solution.
 * 
 * NEDNSProxyProvider is part of NetworkExtension.framework
 * 
 * API-Since: 11.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEDNSProxyProvider extends NEProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected NEDNSProxyProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEDNSProxyProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEDNSProxyProvider allocWithZone(VoidPtr zone);

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

    /**
     * cancelProxyWithError:
     * 
     * This function is called by proxy provider implementations to stop the proxy when a network error is encountered
     * that renders the proxy no longer viable. Subclasses should not override this method.
     * 
     * @param error An NSError object containing details about the error that the proxy provider implementation
     *              encountered.
     * 
     *              API-Since: 11.0
     */
    @Generated
    @Selector("cancelProxyWithError:")
    public native void cancelProxyWithError(@Nullable NSError error);

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

    /**
     * handleNewFlow:
     * 
     * This function is called by the framework to deliver a new network data flow to the proxy provider implementation.
     * Subclasses must override this method to perform whatever steps are necessary to ready the proxy to receive data
     * from the flow. The proxy provider implementation indicates that the proxy is ready to handle flow data by calling
     * -[NEAppProxyFlow openWithLocalEndpoint:completionHandler:] on the flow. If the proxy implementation decides to
     * not handle the flow and instead terminate it, the subclass implementation of this method should return NO. If the
     * proxy implementation decides to handle the flow, the subclass implementation of this method should return YES. In
     * this case the proxy implementation is responsible for retaining the NEAppProxyFlow object.
     * 
     * @param flow The new flow
     * @return YES if the proxy implementation has retained the flow and intends to handle the flow data. NO if the
     *         proxy implementation has not retained the flow and will not handle the flow data. In this case the flow
     *         is terminated.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("handleNewFlow:")
    public native boolean handleNewFlow(@NotNull NEAppProxyFlow flow);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NEDNSProxyProvider init();

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
    public static native NEDNSProxyProvider new_objc();

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
     * startProxyWithOptions:completionHandler:
     * 
     * This function is called by the framework when a new proxy instance is being created. Subclasses must override
     * this method to perform whatever steps are necessary to ready the proxy for handling flows of network data.
     * 
     * @param options           A dictionary containing keys and values passed by the provider's containing app. If the
     *                          containing app did not start the proxy then this parameter will be nil.
     * @param completionHandler A block that must be called when the process of starting the proxy is complete. If the
     *                          proxy cannot be started then the subclass' implementation of this method must pass a
     *                          non-nil NSError object to this block. A value of nil passed to the completion handler
     *                          indicates that the proxy was successfully started.
     * 
     *                          API-Since: 11.0
     */
    @Generated
    @Selector("startProxyWithOptions:completionHandler:")
    public native void startProxyWithOptionsCompletionHandler(@Nullable NSDictionary<String, ?> options,
            @NotNull @ObjCBlock(name = "call_startProxyWithOptionsCompletionHandler") Block_startProxyWithOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startProxyWithOptionsCompletionHandler {
        @Generated
        void call_startProxyWithOptionsCompletionHandler(@Nullable NSError error);
    }

    /**
     * stopProxyWithReason:completionHandler:
     * 
     * This function is called by the framework when the proxy is being stopped. Subclasses must override this method to
     * perform whatever steps are necessary to stop the proxy.
     * 
     * @param reason            An NEProviderStopReason indicating why the proxy is being stopped.
     * @param completionHandler A block that must be called when the proxy is completely stopped.
     * 
     *                          API-Since: 11.0
     */
    @Generated
    @Selector("stopProxyWithReason:completionHandler:")
    public native void stopProxyWithReasonCompletionHandler(@NInt long reason,
            @NotNull @ObjCBlock(name = "call_stopProxyWithReasonCompletionHandler") Block_stopProxyWithReasonCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopProxyWithReasonCompletionHandler {
        @Generated
        void call_stopProxyWithReasonCompletionHandler();
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] systemDNSSettings
     * 
     * The current system DNS settings. Use KVO to watch for changes.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("systemDNSSettings")
    public native NSArray<? extends NEDNSSettings> systemDNSSettings();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * handleNewUDPFlow:initialRemoteEndpoint:
     * 
     * This function is called by the framework to deliver a new UDP data flow to the proxy provider implementation.
     * Subclasses can override this method to perform whatever steps are necessary to ready the proxy to receive
     * data from the flow. The proxy provider implementation indicates that the proxy is ready to handle flow data by
     * calling -[NEAppProxyFlow openWithLocalEndpoint:completionHandler:] on the flow. If the proxy implementation
     * decides
     * to not handle the flow and instead terminate it, the subclass implementation of this method should return NO. If
     * the proxy implementation decides to handle the flow, the subclass implementation of this method should return
     * YES.
     * In this case the proxy implementation is responsible for retaining the NEAppProxyUDPFlow object.
     * The default implementation of this method calls -[NEAppProxyProvider handleNewFlow:] and returns its result.
     * 
     * @param flow           The new UDP flow
     * @param remoteEndpoint The initial remote endpoint provided by the proxied app when the flow was opened.
     * @return YES if the proxy implementation has retained the flow and intends to handle the flow data. NO if the
     *         proxy implementation has not retained the flow and will not handle the flow data. In this case the flow
     *         is terminated.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("handleNewUDPFlow:initialRemoteEndpoint:")
    public native boolean handleNewUDPFlowInitialRemoteEndpoint(@NotNull NEAppProxyUDPFlow flow,
            @NotNull NWEndpoint remoteEndpoint);
}
