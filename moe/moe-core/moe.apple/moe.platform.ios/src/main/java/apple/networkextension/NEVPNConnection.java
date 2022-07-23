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
import apple.foundation.NSDate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@interface] NEVPNConnection
 * <p>
 * The NEVPNConnection class declares the programmatic interface for an object that manages VPN connections.
 * <p>
 * Instances of this class are thread safe.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEVPNConnection extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEVPNConnection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEVPNConnection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEVPNConnection allocWithZone(VoidPtr zone);

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
    public static native NEVPNConnection new_objc();

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
     * [@property] connectedDate
     * <p>
     * The date and time when the connection status changed to NEVPNStatusConnected. This property is nil if the
     * connection is not fully established.
     */
    @Generated
    @Selector("connectedDate")
    public native NSDate connectedDate();

    @Generated
    @Selector("init")
    public native NEVPNConnection init();

    /**
     * [@property] manager
     * <p>
     * The NEVPNManager associated with this NEVPNConnection.
     */
    @Generated
    @Selector("manager")
    public native NEVPNManager manager();

    /**
     * startVPNTunnelAndReturnError:
     * <p>
     * This function is used to start the VPN tunnel using the current VPN configuration. The VPN tunnel connection
     * process is started and this function returns immediately.
     *
     * @param error If the VPN tunnel was started successfully, this parameter is set to nil. Otherwise this parameter
     *              is set to the error that occurred. Possible errors include:
     *              1. NEVPNErrorConfigurationInvalid
     *              2. NEVPNErrorConfigurationDisabled
     * @return YES if the VPN tunnel was started successfully, NO if an error occurred.
     */
    @Generated
    @Selector("startVPNTunnelAndReturnError:")
    public native boolean startVPNTunnelAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * startVPNTunnelWithOptions:andReturnError:
     * <p>
     * This function is used to start the VPN tunnel using the current VPN configuration. The VPN tunnel connection
     * process is started and this function returns immediately.
     *
     * @param options A dictionary that will be passed to the tunnel provider during the process of starting the tunnel.
     *                If not nil, 'options' is an NSDictionary may contain the following keys
     *                NEVPNConnectionStartOptionUsername
     *                NEVPNConnectionStartOptionPassword
     * @param error   If the VPN tunnel was started successfully, this parameter is set to nil. Otherwise this parameter
     *                is set to the error that occurred. Possible errors include:
     *                1. NEVPNErrorConfigurationInvalid
     *                2. NEVPNErrorConfigurationDisabled
     * @return YES if the VPN tunnel was started successfully, NO if an error occurred.
     */
    @Generated
    @Selector("startVPNTunnelWithOptions:andReturnError:")
    public native boolean startVPNTunnelWithOptionsAndReturnError(NSDictionary<String, ? extends NSObject> options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] status
     * <p>
     * The current status of the VPN.
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    /**
     * stopVPNTunnel:
     * <p>
     * This function is used to stop the VPN tunnel. The VPN tunnel disconnect process is started and this function
     * returns immediately.
     */
    @Generated
    @Selector("stopVPNTunnel")
    public native void stopVPNTunnel();
}
