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
 * [@interface] NEPacketTunnelProvider
 * 
 * The NEPacketTunnelProvider class declares the programmatic interface of an object that implements the client side of
 * a custom IP packet tunneling protocol.
 * 
 * NEPacketTunnelProvider is part of NetworkExtension.framework.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEPacketTunnelProvider extends NETunnelProvider {
    static {
        NatJ.register();
    }

    @Generated
    protected NEPacketTunnelProvider(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEPacketTunnelProvider alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEPacketTunnelProvider allocWithZone(VoidPtr zone);

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
    public static native NEPacketTunnelProvider new_objc();

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
     * cancelTunnelWithError:
     * 
     * This function is called by tunnel provider implementations to initiate tunnel destruction when a network error is
     * encountered that renders the tunnel no longer viable. Subclasses should not override this method.
     * 
     * @param error An NSError object containing details about the error that the tunnel provider implementation
     *              encountered.
     * 
     *              API-Since: 9.0
     */
    @Generated
    @Selector("cancelTunnelWithError:")
    public native void cancelTunnelWithError(@Nullable NSError error);

    /**
     * createTCPConnectionThroughTunnelToEndpoint:enableTLS:TLSParameters:delegate:
     * 
     * This function can be called by subclass implementations to create a TCP connection to a given network endpoint,
     * through the tunnel established by the provider. This function should not be overridden by subclasses.
     * 
     * @param remoteEndpoint An NWEndpoint object that specifies the remote network endpoint to connect to.
     * @param enableTLS      A flag indicating if a TLS session should be negotiated on the connection.
     * @param TLSParameters  A set of optional TLS parameters. Only valid if enableTLS is YES. If TLSParameters is nil,
     *                       the default system parameters will be used for TLS negotiation.
     * @param delegate       An object to use as the connection delegate. This object should conform to the
     *                       NWTCPConnectionAuthenticationDelegate protocol.
     * @return An NWTCPConnection object.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("createTCPConnectionThroughTunnelToEndpoint:enableTLS:TLSParameters:delegate:")
    public native NWTCPConnection createTCPConnectionThroughTunnelToEndpointEnableTLSTLSParametersDelegate(
            @NotNull NWEndpoint remoteEndpoint, boolean enableTLS, @Nullable NWTLSParameters TLSParameters,
            @Nullable @Mapped(ObjCObjectMapper.class) Object delegate);

    /**
     * createUDPSessionThroughTunnelToEndpoint:fromEndpoint:
     * 
     * This function can be called by subclass implementations to create a UDP session between a local network endpoint
     * and a remote network endpoint, through the tunnel established by the provider. This function should not be
     * overridden by subclasses.
     * 
     * @param remoteEndpoint An NWEndpoint object that specifies the remote endpoint to which UDP datagrams will be sent
     *                       by the UDP session.
     * @param localEndpoint  An NWHostEndpoint object that specifies the local IP address endpoint to use as the source
     *                       endpoint of the UDP session.
     * @return An NWUDPSession object.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("createUDPSessionThroughTunnelToEndpoint:fromEndpoint:")
    public native NWUDPSession createUDPSessionThroughTunnelToEndpointFromEndpoint(@NotNull NWEndpoint remoteEndpoint,
            @Nullable NWHostEndpoint localEndpoint);

    @Generated
    @Selector("init")
    public native NEPacketTunnelProvider init();

    /**
     * [@property] packetFlow
     * 
     * An NEPacketFlow object that the tunnel provider implementation should use to receive packets from the network
     * stack and inject packets into the network stack. Every time the tunnel is started the packet flow object is in an
     * initialized state and must be explicitly opened before any packets can be received or injected.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("packetFlow")
    public native NEPacketTunnelFlow packetFlow();

    /**
     * startTunnelWithOptions:completionHandler:
     * 
     * This function is called by the framework when a new tunnel is being created. Subclasses must override this method
     * to perform whatever steps are necessary to establish the tunnel.
     * 
     * @param options           A dictionary containing keys and values passed by the provider's containing app. If the
     *                          containing app did not start the tunnel then this parameter will be nil.
     * @param completionHandler A block that must be called when the process of starting the tunnel is complete. If the
     *                          tunnel cannot be established then the subclass' implementation of this method must pass
     *                          a non-nil NSError object to this block. A value of nil passed to the completion handler
     *                          indicates that the tunnel was successfully established.
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("startTunnelWithOptions:completionHandler:")
    public native void startTunnelWithOptionsCompletionHandler(
            @Nullable NSDictionary<String, ? extends NSObject> options,
            @NotNull @ObjCBlock(name = "call_startTunnelWithOptionsCompletionHandler") Block_startTunnelWithOptionsCompletionHandler completionHandler);

    /**
     * stopTunnelWithReason:completionHandler:
     * 
     * This function is called by the framework when the tunnel is being destroyed. Subclasses must override this method
     * to perform whatever steps are necessary to tear down the tunnel.
     * 
     * @param reason            An NEProviderStopReason indicating why the tunnel is being stopped.
     * @param completionHandler A block that must be called when the tunnel is completely torn down.
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("stopTunnelWithReason:completionHandler:")
    public native void stopTunnelWithReasonCompletionHandler(@NInt long reason,
            @NotNull @ObjCBlock(name = "call_stopTunnelWithReasonCompletionHandler") Block_stopTunnelWithReasonCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startTunnelWithOptionsCompletionHandler {
        @Generated
        void call_startTunnelWithOptionsCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopTunnelWithReasonCompletionHandler {
        @Generated
        void call_stopTunnelWithReasonCompletionHandler();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
