/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

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
 * @interface NEAppProxyProvider
 * @discussion The NEAppProxyProvider class declares the programmatic interface for an object that implements the client side of a custom network proxy solution.
 * 
 * NEAppProxyProvider is part of NetworkExtension.framework
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEAppProxyProvider extends NETunnelProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected NEAppProxyProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEAppProxyProvider alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    /**
     * @method cancelProxyWithError:
     * @discussion This function is called by proxy provider implementations to stop the proxy when a network error is encountered that renders the proxy no longer viable. Subclasses should not override this method.
     * @param error An NSError object containing details about the error that the proxy provider implementation encountered.
     */
    @Generated
    @Selector("cancelProxyWithError:")
    public native void cancelProxyWithError(NSError error);

    /**
     * @method handleNewFlow:
     * @discussion This function is called by the framework to deliver a new network data flow to the proxy provider implementation. Subclasses must override this method to perform whatever steps are necessary to ready the proxy to receive data from the flow. The proxy provider implementation indicates that the proxy is ready to handle flow data by calling -[NEAppProxyFlow openWithLocalEndpoint:completionHandler:] on the flow. If the proxy implementation decides to not handle the flow and instead terminate it, the subclass implementation of this method should return NO. If the proxy implementation decides to handle the flow, the subclass implementation of this method should return YES. In this case the proxy implementation is responsible for retaining the NEAppProxyFlow object.
     * @param flow The new flow
     * @return YES if the proxy implementation has retained the flow and intends to handle the flow data. NO if the proxy implementation has not retained the flow and will not handle the flow data. In this case the flow is terminated.
     */
    @Generated
    @Selector("handleNewFlow:")
    public native boolean handleNewFlow(NEAppProxyFlow flow);

    @Generated
    @Selector("init")
    public native NEAppProxyProvider init();

    /**
     * @method startProxyWithOptions:completionHandler:
     * @discussion This function is called by the framework when a new proxy instance is being created. Subclasses must override this method to perform whatever steps are necessary to ready the proxy for handling flows of network data.
     * @param options A dictionary containing keys and values passed by the provider's containing app. If the containing app did not start the proxy then this parameter will be nil.
     * @param completionHandler A block that must be called when the process of starting the proxy is complete. If the proxy cannot be started then the subclass' implementation of this method must pass a non-nil NSError object to this block. A value of nil passed to the completion handler indicates that the proxy was successfully started.
     */
    @Generated
    @Selector("startProxyWithOptions:completionHandler:")
    public native void startProxyWithOptionsCompletionHandler(NSDictionary<String, ?> options,
            @ObjCBlock(name = "call_startProxyWithOptionsCompletionHandler") Block_startProxyWithOptionsCompletionHandler completionHandler);

    /**
     * @method stopProxyWithReason:completionHandler:
     * @discussion This function is called by the framework when the proxy is being stopped. Subclasses must override this method to perform whatever steps are necessary to stop the proxy.
     * @param reason An NEProviderStopReason indicating why the proxy is being stopped.
     * @param completionHandler A block that must be called when the proxy is completely stopped.
     */
    @Generated
    @Selector("stopProxyWithReason:completionHandler:")
    public native void stopProxyWithReasonCompletionHandler(@NInt long reason,
            @ObjCBlock(name = "call_stopProxyWithReasonCompletionHandler") Block_stopProxyWithReasonCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startProxyWithOptionsCompletionHandler {
        @Generated
        void call_startProxyWithOptionsCompletionHandler(NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopProxyWithReasonCompletionHandler {
        @Generated
        void call_stopProxyWithReasonCompletionHandler();
    }

    /**
     * @method handleNewUDPFlow:initialRemoteEndpoint:
     * @discussion This function is called by the framework to deliver a new UDP data flow to the proxy provider implementation. Subclasses can override this method to perform whatever steps are necessary to ready the proxy to receive
     *     data from the flow. The proxy provider implementation indicates that the proxy is ready to handle flow data by calling -[NEAppProxyFlow openWithLocalEndpoint:completionHandler:] on the flow. If the proxy implementation decides
     *     to not handle the flow and instead terminate it, the subclass implementation of this method should return NO. If the proxy implementation decides to handle the flow, the subclass implementation of this method should return YES.
     *     In this case the proxy implementation is responsible for retaining the NEAppProxyUDPFlow object.
     *     The default implementation of this method calls -[NEAppProxyProvider handleNewFlow:] and returns its result.
     * @param flow The new UDP flow
     * @param remoteEndpoint The initial remote endpoint provided by the proxied app when the flow was opened.
     * @return YES if the proxy implementation has retained the flow and intends to handle the flow data. NO if the proxy implementation has not retained the flow and will not handle the flow data. In this case the flow is terminated.
     */
    @Generated
    @Selector("handleNewUDPFlow:initialRemoteEndpoint:")
    public native boolean handleNewUDPFlowInitialRemoteEndpoint(NEAppProxyUDPFlow flow, NWEndpoint remoteEndpoint);
}
