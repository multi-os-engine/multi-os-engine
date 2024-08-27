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
import apple.foundation.NSData;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * [@file] NETunnelProviderSession.h
 * 
 * This file declares the NETunnelProviderSession API. The NETunnelProviderSession API is used to control network tunnel
 * services provided by NETunnelProvider implementations.
 * 
 * This API is part of NetworkExtension.framework.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NETunnelProviderSession extends NEVPNConnection {
    static {
        NatJ.register();
    }

    @Generated
    protected NETunnelProviderSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NETunnelProviderSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NETunnelProviderSession allocWithZone(VoidPtr zone);

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
    public static native NETunnelProviderSession new_objc();

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

    @Generated
    @Selector("init")
    public native NETunnelProviderSession init();

    /**
     * sendProviderMessage:responseHandler:
     * 
     * This function sends a message to the NETunnelProvider and provides a way to receive a response.
     * 
     * @param messageData     An NSData object containing the message to be sent.
     * @param error           If the message was sent successfully, this parameter is set to nil. Otherwise this
     *                        parameter is set to the error that occurred. Possible errors include:
     *                        1. NEVPNErrorConfigurationInvalid
     *                        2. NEVPNErrorConfigurationDisabled
     * @param responseHandler A block that handles the response. Can be set to nil if no response is expected.
     * @return YES if the message was sent successfully, NO if an error occurred.
     * 
     *         API-Since: 9.0
     */
    @Generated
    @Selector("sendProviderMessage:returnError:responseHandler:")
    public native boolean sendProviderMessageReturnErrorResponseHandler(@NotNull NSData messageData,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error,
            @Nullable @ObjCBlock(name = "call_sendProviderMessageReturnErrorResponseHandler") Block_sendProviderMessageReturnErrorResponseHandler responseHandler);

    /**
     * startTunnelWithOptions:andReturnError:
     * 
     * This function is used to start the tunnel using the configuration associated with this connection object. The
     * tunnel connection process is started and this function returns immediately.
     * 
     * @param options A dictionary that will be passed as-is to the tunnel provider during the process of starting the
     *                tunnel.
     * @param error   If the tunnel was started successfully, this parameter is set to nil. Otherwise this parameter is
     *                set to the error that occurred. Possible errors include:
     *                1. NEVPNErrorConfigurationInvalid
     *                2. NEVPNErrorConfigurationDisabled
     * @return YES if the tunnel was started successfully, NO if an error occurred.
     * 
     *         API-Since: 9.0
     */
    @Generated
    @Selector("startTunnelWithOptions:andReturnError:")
    public native boolean startTunnelWithOptionsAndReturnError(@Nullable NSDictionary<String, ?> options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * stopTunnel
     * 
     * This function is used to stop the tunnel. The tunnel disconnect process is started and this function returns
     * immediately.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("stopTunnel")
    public native void stopTunnel();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendProviderMessageReturnErrorResponseHandler {
        @Generated
        void call_sendProviderMessageReturnErrorResponseHandler(@Nullable NSData responseData);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
