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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@interface] NEHotspotHelperCommand
 * 
 * An NEHotspotHelperCommand object is provided to the helper's
 * command handler block. The HotspotHelper processes the command
 * instantiates an NEHotspotHelperResponse object, sets the annotated
 * network or networkList (Evaluate/FilterScanList only),
 * then delivers it.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEHotspotHelperCommand extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEHotspotHelperCommand(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEHotspotHelperCommand alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NEHotspotHelperCommand allocWithZone(VoidPtr zone);

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
    public static native NEHotspotHelperCommand new_objc();

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
     * [@property] commandType
     * 
     * The type of the command.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("commandType")
    @NInt
    public native long commandType();

    /**
     * createResponse:
     * 
     * Create a response to the command.
     * 
     * Instantiate an NEHotspotHelperResponse for the command.
     * 
     * @return
     *         NEHotspotHelperResponse with the specified result.
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("createResponse:")
    public native NEHotspotHelperResponse createResponse(@NInt long result);

    /**
     * createTCPConnection
     * 
     * Create a new TCP connection over the interface associated with the command.
     * 
     * Instantiate an NWTCPConnection to the specified endpoint
     * bound to the network interface associated with the command.
     * 
     * @return
     *         non-nil NWTCPConnection object if successful, nil otherwise
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("createTCPConnection:")
    public native NWTCPConnection createTCPConnection(@NotNull NWEndpoint endpoint);

    /**
     * createUDPSession
     * 
     * Create a new UDP session over the interface associated with the command.
     * 
     * Instantiate an NWUDPSession to the specified endpoint
     * bound to the network interface associated with the command.
     * 
     * @return
     *         non-nil NWUDPSession object if successful, nil otherwise
     * 
     *         API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("createUDPSession:")
    public native NWUDPSession createUDPSession(@NotNull NWEndpoint endpoint);

    @Generated
    @Selector("init")
    public native NEHotspotHelperCommand init();

    /**
     * [@property] network
     * 
     * The network associated with the command. May be nil.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("network")
    public native NEHotspotNetwork network();

    /**
     * [@property] networkList
     * 
     * The list of networks associated with a command. Will be nil unless
     * the command type is kNEHotspotHelperCommandTypeFilterScanList.
     * This property returns an NSArray of NEHotspotNetwork.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("networkList")
    public native NSArray<? extends NEHotspotNetwork> networkList();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
