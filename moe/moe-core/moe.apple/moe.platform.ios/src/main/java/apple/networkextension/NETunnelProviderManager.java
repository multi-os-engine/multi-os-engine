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
 * [@interface] NETunnelProviderManager
 * 
 * The NETunnelProviderManager class declares the programmatic interface for an object that is used to configure and
 * control network tunnels provided by NETunnelProviders.
 * 
 * Instances of this class are thread safe.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NETunnelProviderManager extends NEVPNManager {
    static {
        NatJ.register();
    }

    @Generated
    protected NETunnelProviderManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NETunnelProviderManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NETunnelProviderManager allocWithZone(VoidPtr zone);

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

    /**
     * loadAllFromPreferencesWithCompletionHandler:
     * 
     * This function asynchronously reads all of the NETunnelProvider configurations created by the calling app that
     * have previously been saved to disk and returns them as NETunnelProviderManager objects.
     * 
     * @param completionHandler A block that takes an array NETunnelProviderManager objects. The array passed to the
     *                          block may be empty if no NETunnelProvider configurations were successfully read from the
     *                          disk. The NSError passed to this block will be nil if the load operation succeeded,
     *                          non-nil otherwise.
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("loadAllFromPreferencesWithCompletionHandler:")
    public static native void loadAllFromPreferencesWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_loadAllFromPreferencesWithCompletionHandler") Block_loadAllFromPreferencesWithCompletionHandler completionHandler);

    @Generated
    @Owned
    @Selector("new")
    public static native NETunnelProviderManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
     * copyAppRules
     * 
     * This function returns an array of NEAppRule objects.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Owned
    @Selector("copyAppRules")
    public native NSArray<? extends NEAppRule> copyAppRules();

    @Generated
    @Selector("init")
    public native NETunnelProviderManager init();

    /**
     * [@property] routingMethod
     * 
     * The method by which network traffic is routed to the tunnel. The default is
     * NETunnelProviderRoutingMethodDestinationIP.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("routingMethod")
    @NInt
    public native long routingMethod();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadAllFromPreferencesWithCompletionHandler {
        @Generated
        void call_loadAllFromPreferencesWithCompletionHandler(
                @Nullable NSArray<? extends NETunnelProviderManager> managers, @Nullable NSError error);
    }
}
