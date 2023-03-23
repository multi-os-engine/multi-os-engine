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

package apple.coretelephony;

import apple.NSObject;
import apple.coretelephony.protocol.CTTelephonyNetworkInfoDelegate;
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
 * CTTelephonyNetworkInfo
 * 
 * Discussion:
 * The CTTelephonyNetworkInfo object is your entry point to the telephony service.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("CoreTelephony")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CTTelephonyNetworkInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CTTelephonyNetworkInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CTTelephonyNetworkInfo alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CTTelephonyNetworkInfo allocWithZone(VoidPtr zone);

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
    public static native CTTelephonyNetworkInfo new_objc();

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
     * currentRadioAccessTechnology
     * 
     * Discussion:
     * The current radio access technology for each service of the device is registered with. May be nil
     * if the device is not registered on any network.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("currentRadioAccessTechnology")
    public native String currentRadioAccessTechnology();

    @Generated
    @Selector("init")
    public native CTTelephonyNetworkInfo init();

    /**
     * subscriberCellularProviderDidUpdateNotifier
     * 
     * Discussion:
     * A block that will be dispatched on the default priority global dispatch queue when
     * the subscriber's cellular provider information updates for the service. Set this
     * property to a block that is defined in your application to receive the newly
     * updated information.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("setSubscriberCellularProviderDidUpdateNotifier:")
    public native void setSubscriberCellularProviderDidUpdateNotifier(
            @ObjCBlock(name = "call_setSubscriberCellularProviderDidUpdateNotifier") Block_setSubscriberCellularProviderDidUpdateNotifier value);

    /**
     * subscriberCellularProvider
     * 
     * Discussion:
     * A CTCarrier object that contains information about the subscriber's
     * home cellular service provider for the service.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("subscriberCellularProvider")
    public native CTCarrier subscriberCellularProvider();

    /**
     * subscriberCellularProviderDidUpdateNotifier
     * 
     * Discussion:
     * A block that will be dispatched on the default priority global dispatch queue when
     * the subscriber's cellular provider information updates for the service. Set this
     * property to a block that is defined in your application to receive the newly
     * updated information.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @Selector("subscriberCellularProviderDidUpdateNotifier")
    @ObjCBlock(name = "call_subscriberCellularProviderDidUpdateNotifier_ret")
    public native Block_subscriberCellularProviderDidUpdateNotifier_ret subscriberCellularProviderDidUpdateNotifier();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setSubscriberCellularProviderDidUpdateNotifier {
        @Generated
        void call_setSubscriberCellularProviderDidUpdateNotifier(CTCarrier arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscriberCellularProviderDidUpdateNotifier_ret {
        @Generated
        void call_subscriberCellularProviderDidUpdateNotifier_ret(CTCarrier arg0);
    }

    /**
     * dataServiceIdentifier
     * 
     * Discussion:
     * An NSString representing the identifier of the service that's currently providing data.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("dataServiceIdentifier")
    public native String dataServiceIdentifier();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CTTelephonyNetworkInfoDelegate delegate();

    /**
     * serviceCurrentRadioAccessTechnology
     * 
     * Discussion:
     * A dictionary containing the current radio access technology each service is registered. The key to the dictionary
     * is an NSString representing the service. An entry may be nil if the service is not registered on any network.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("serviceCurrentRadioAccessTechnology")
    public native NSDictionary<String, String> serviceCurrentRadioAccessTechnology();

    /**
     * serviceSubscriberCellularProviders
     * 
     * Discussion:
     * A dictionary containing CTCarrier objects for each service that contains information about the subscriber's
     * home cellular service provider. The key to the dictionary is an NSString representing the service.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("serviceSubscriberCellularProviders")
    public native NSDictionary<String, ? extends CTCarrier> serviceSubscriberCellularProviders();

    /**
     * serviceSubscriberCellularProvidersDidUpdateNotifier
     * 
     * Discussion:
     * A block that will be dispatched on the default priority global dispatch
     * queue when the subscriber's cellular provider information updates for any service. Set
     * this property to a block that is defined in your application to receive the newly
     * updated information. The NSString will contain the service identifier of the service
     * whose information has changed. This can be used as the key into serviceSubscriberCellularProvider
     * to obtain the new information.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("serviceSubscriberCellularProvidersDidUpdateNotifier")
    @ObjCBlock(name = "call_serviceSubscriberCellularProvidersDidUpdateNotifier_ret")
    public native Block_serviceSubscriberCellularProvidersDidUpdateNotifier_ret serviceSubscriberCellularProvidersDidUpdateNotifier();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_serviceSubscriberCellularProvidersDidUpdateNotifier_ret {
        @Generated
        void call_serviceSubscriberCellularProvidersDidUpdateNotifier_ret(String arg0);
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CTTelephonyNetworkInfoDelegate value);

    /**
     * API-Since: 13.0
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) CTTelephonyNetworkInfoDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * serviceSubscriberCellularProvidersDidUpdateNotifier
     * 
     * Discussion:
     * A block that will be dispatched on the default priority global dispatch
     * queue when the subscriber's cellular provider information updates for any service. Set
     * this property to a block that is defined in your application to receive the newly
     * updated information. The NSString will contain the service identifier of the service
     * whose information has changed. This can be used as the key into serviceSubscriberCellularProvider
     * to obtain the new information.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setServiceSubscriberCellularProvidersDidUpdateNotifier:")
    public native void setServiceSubscriberCellularProvidersDidUpdateNotifier(
            @ObjCBlock(name = "call_setServiceSubscriberCellularProvidersDidUpdateNotifier") Block_setServiceSubscriberCellularProvidersDidUpdateNotifier value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setServiceSubscriberCellularProvidersDidUpdateNotifier {
        @Generated
        void call_setServiceSubscriberCellularProvidersDidUpdateNotifier(String arg0);
    }
}
