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
 * @interface NEHotspotHelper
 * @discussion
 *   The NEHotspotHelper class allows an application to register itself as a
 *   HotspotHelper.
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEHotspotHelper extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEHotspotHelper(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEHotspotHelper alloc();

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

    /**
     * @method logoff:
     * @abstract
     *   Terminate the authentication session.
     * @discussion
     *   The application invokes this method when it wants to logoff from the
     *   current network. Invoking this method causes an NEHotspotHelperCommand
     *   of type kNEHotspotHelperCommandTypeLogoff to be issued to the application's
     *   'handler' block (see +[NEHotspotHelper registerWithOptions:queue:handler]).
     * 
     *   'network' must correspond to the currently associated Wi-Fi network
     *   i.e. it must have come from the NEHotspotHelperCommand's 'network' property
     *   or from the +[NEHotspotHelper supportedInterfaces] method.
     * @return
     *   YES if the logoff command was successfully queued, NO otherwise.
     * @note Notes
     * @note 1
     *   The application MUST NOT actually logoff from the network until it
     *   receives the command to logoff.
     * @note 2
     *   After the application invokes -[NEHotspotHelperResponse deliver] indicating
     *   kNEHotspotHelperResultSuccess, the Wi-Fi network is disassociated.
     */
    @Generated
    @Selector("logoff:")
    public static native boolean logoff(NEHotspotNetwork network);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @method registerWithOptions:queue:handler
     * @abstract
     *   Register the application as a HotspotHelper.
     * @discussion
     *   Once this API is invoked successfully, the application becomes
     *   eligible to be launched in the background and participate in
     *   various hotspot related functions.
     * 
     *   This function should be called once when the application starts up.
     *   Invoking it again will have no effect and result in FALSE being returned.
     * 
     *   The 'options' dictionary may be nil, or contain the single property
     *   kNEHotspotHelperOptionDisplayName.
     * 
     * @param options If not nil, 'options' is an NSDictionary containing
     *   kNEHotspotHelperOption* keys (currently just
     *   kNEHotspotHelperOptionDisplayName).
     * @param queue The dispatch_queue_t to invoke the handle block on.
     * @param handler The NEHotspotHelperHandler block to execute to process
     *   helper commands.
     * @return
     *   YES if the registration was successful, NO otherwise.
     * @note Notes
     * @note 1
     *   The application's Info.plist MUST include a UIBackgroundModes array
     *   containing 'network-authentication'.
     * @note 2
     *   The application MUST set 'com.apple.developer.networking.HotspotHelper'
     *   as one of its entitlements. The value of the entitlement is a boolean
     *   value true.
     */
    @Generated
    @Selector("registerWithOptions:queue:handler:")
    public static native boolean registerWithOptionsQueueHandler(NSDictionary<String, ? extends NSObject> options,
            NSObject queue,
            @ObjCBlock(name = "call_registerWithOptionsQueueHandler") Block_registerWithOptionsQueueHandler handler);

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

    /**
     * of NEHotspotNetwork
     */
    @Generated
    @Selector("supportedNetworkInterfaces")
    public static native NSArray<?> supportedNetworkInterfaces();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("init")
    public native NEHotspotHelper init();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerWithOptionsQueueHandler {
        @Generated
        void call_registerWithOptionsQueueHandler(NEHotspotHelperCommand cmd);
    }
}
