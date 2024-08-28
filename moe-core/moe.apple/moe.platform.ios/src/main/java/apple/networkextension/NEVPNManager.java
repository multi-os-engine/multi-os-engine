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
 * [@interface] NEVPNManager
 * 
 * The NEVPNManager class declares the programmatic interface for an object that manages Virtual Private Network (VPN)
 * configurations.
 * 
 * NEVPNManager declares methods and properties for configuring and controlling a VPN.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEVPNManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEVPNManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEVPNManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEVPNManager allocWithZone(VoidPtr zone);

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
    public static native NEVPNManager new_objc();

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
     * sharedManager
     * 
     * @return The singleton NEVPNManager object for the calling process.
     * 
     *         API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("sharedManager")
    public static native NEVPNManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] connection
     * 
     * The NEVPNConnection object used for controlling the VPN tunnel.
     * 
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("connection")
    public native NEVPNConnection connection();

    @Generated
    @Selector("init")
    public native NEVPNManager init();

    /**
     * [@property] enabled
     * 
     * Toggles the enabled status of the VPN. Setting this property will disable VPN configurations of other apps. This
     * property will be set to NO when other VPN configurations are enabled.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * [@property] enabled
     * 
     * Toggles the enabled status of the VPN. Setting this property will disable VPN configurations of other apps. This
     * property will be set to NO when other VPN configurations are enabled.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * [@property] onDemandEnabled
     * 
     * Toggles VPN On Demand.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("isOnDemandEnabled")
    public native boolean isOnDemandEnabled();

    /**
     * [@property] onDemandEnabled
     * 
     * Toggles VPN On Demand.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setOnDemandEnabled:")
    public native void setOnDemandEnabled(boolean value);

    /**
     * loadFromPreferencesWithCompletionHandler:
     * 
     * This function loads the current VPN configuration from the caller's VPN preferences.
     * 
     * @param completionHandler A block that will be called on the main thread when the load operation is completed. The
     *                          NSError passed to this block will be nil if the load operation succeeded, non-nil
     *                          otherwise.
     * 
     *                          API-Since: 8.0
     */
    @Generated
    @Selector("loadFromPreferencesWithCompletionHandler:")
    public native void loadFromPreferencesWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_loadFromPreferencesWithCompletionHandler") Block_loadFromPreferencesWithCompletionHandler completionHandler);

    /**
     * [@property] localizedDescription
     * 
     * A string containing a description of the VPN.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * [@property] onDemandRules
     * 
     * An array of NEOnDemandRule objects.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("onDemandRules")
    public native NSArray<? extends NEOnDemandRule> onDemandRules();

    /**
     * [@property] protocol
     * 
     * An NEVPNProtocol object containing the protocol-specific portion of the VPN configuration.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("protocol")
    public native NEVPNProtocol protocol();

    /**
     * [@property] protocolConfiguration
     * 
     * An NEVPNProtocol object containing the protocol-specific portion of the VPN configuration.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("protocolConfiguration")
    public native NEVPNProtocol protocolConfiguration();

    /**
     * removeFromPreferencesWithCompletionHandler:
     * 
     * This function removes the VPN configuration from the caller's VPN preferences. If the VPN is enabled, has VPN On
     * Demand enabled, and has VPN On Demand rules, the VPN is disabled and the VPN On Demand rules are de-activated.
     * 
     * @param completionHandler A block that will be called on the main thread when the remove operation is completed.
     *                          The NSError passed to this block will be nil if the remove operation succeeded, non-nil
     *                          otherwise.
     * 
     *                          API-Since: 8.0
     */
    @Generated
    @Selector("removeFromPreferencesWithCompletionHandler:")
    public native void removeFromPreferencesWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_removeFromPreferencesWithCompletionHandler") Block_removeFromPreferencesWithCompletionHandler completionHandler);

    /**
     * saveToPreferencesWithCompletionHandler:
     * 
     * This function saves the VPN configuration in the caller's VPN preferences. If the VPN is enabled, has VPN On
     * Demand enabled, and has VPN On Demand rules, the VPN On Demand rules are activated.
     * 
     * @param completionHandler A block that will be called on the main thread when the save operation is completed. The
     *                          NSError passed to this block will be nil if the save operation succeeded, non-nil
     *                          otherwise.
     * 
     *                          API-Since: 8.0
     */
    @Generated
    @Selector("saveToPreferencesWithCompletionHandler:")
    public native void saveToPreferencesWithCompletionHandler(
            @Nullable @ObjCBlock(name = "call_saveToPreferencesWithCompletionHandler") Block_saveToPreferencesWithCompletionHandler completionHandler);

    /**
     * [@property] localizedDescription
     * 
     * A string containing a description of the VPN.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLocalizedDescription:")
    public native void setLocalizedDescription(@Nullable String value);

    /**
     * [@property] onDemandRules
     * 
     * An array of NEOnDemandRule objects.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setOnDemandRules:")
    public native void setOnDemandRules(@Nullable NSArray<? extends NEOnDemandRule> value);

    /**
     * [@property] protocol
     * 
     * An NEVPNProtocol object containing the protocol-specific portion of the VPN configuration.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @Selector("setProtocol:")
    public native void setProtocol(@Nullable NEVPNProtocol value);

    /**
     * [@property] protocolConfiguration
     * 
     * An NEVPNProtocol object containing the protocol-specific portion of the VPN configuration.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setProtocolConfiguration:")
    public native void setProtocolConfiguration(@Nullable NEVPNProtocol value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadFromPreferencesWithCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeFromPreferencesWithCompletionHandler {
        @Generated
        void call_removeFromPreferencesWithCompletionHandler(@Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_saveToPreferencesWithCompletionHandler {
        @Generated
        void call_saveToPreferencesWithCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
