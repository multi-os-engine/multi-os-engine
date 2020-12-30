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
 * @interface NEHotspotNetwork
 * @discussion
 *   The NEHotspotNetwork class provides a class method to get the SSID and BSSID of
 *   the current Wi-Fi network.
 * 
 *   NEHotspotNetwork is part of NetworkExtension.framework
 */
@Generated
@Library("NetworkExtension")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NEHotspotNetwork extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NEHotspotNetwork(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NEHotspotNetwork alloc();

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
     * @property BSSID
     * @discussion The BSSID for the Wi-Fi network.
     */
    @Generated
    @Selector("BSSID")
    public native String BSSID();

    /**
     * @property SSID
     * @discussion The SSID for the Wi-Fi network.
     */
    @Generated
    @Selector("SSID")
    public native String SSID();

    /**
     * @property autoJoined
     * @discussion
     *   Indicates whether the network was joined automatically
     *   (YES) or joined by the user (NO).
     */
    @Generated
    @Selector("didAutoJoin")
    public native boolean didAutoJoin();

    /**
     * @property justJoined
     * @discussion
     *   Indicates whether the network was just joined. Useful in the
     *   Maintaining state to differentiate whether the Maintain command
     *   is for the initial join, or the subsequent periodic callback.
     */
    @Generated
    @Selector("didJustJoin")
    public native boolean didJustJoin();

    @Generated
    @Selector("init")
    public native NEHotspotNetwork init();

    /**
     * @property chosenHelper
     * @discussion
     *   Indicates whether the HotspotHelper is the chosen helper for
     *   the network. The NEHotspotNetwork must have been instantiated via a
     *   call to the +[NEHotspotHelper supportedNetworkInterfaces] method. This
     *   is useful to restore state after the HotspotHelper application is quit
     *   and restarted.
     */
    @Generated
    @Selector("isChosenHelper")
    public native boolean isChosenHelper();

    /**
     * @property secure
     * @discussion Indicates whether the network is secure
     */
    @Generated
    @Selector("isSecure")
    public native boolean isSecure();

    /**
     * @method setConfidence
     * @abstract
     *   Indicate the confidence in being able to handle the network.
     * @discussion
     *   Use this method to indicate the confidence in being able to
     *   successfully authenticate to the given network. Used in the response
     *   to the kNEHotspotHelperCommandTypeEvaluate and
     *   kNEHotspotHelperCommandTypeFilterScanList commands.
     */
    @Generated
    @Selector("setConfidence:")
    public native void setConfidence(@NInt long confidence);

    /**
     * @method setPassword
     * @abstract
     *   Provide the password for a secure network
     * @discussion
     *   The HotspotHelper may set a password for a secure network. The format
     *   password string must adhere to IEEE 802.11 guidelines appropriate for
     *   the particular security scheme.
     * 
     *   Used only in the response to the kNEHotspotHelperCommandTypeFilterScanList
     *   command.
     */
    @Generated
    @Selector("setPassword:")
    public native void setPassword(String password);

    /**
     * @property signalStrength
     * @discussion
     *   The signal strength for the Wi-Fi network. The value lies within
     *   the range 0.0 (weak/no signal) to 1.0 (strong signal).
     */
    @Generated
    @Selector("signalStrength")
    public native double signalStrength();

    /**
     * @method fetchCurrentWithCompletionHandler:completionHandler:
     * @discussion This method returns SSID and BSSID of the current Wi-Fi network when the
     *   requesting application meets one of following 4 requirements -.
     *   1. application is using CoreLocation API and has user's authorization to access precise location.
     *   2. application has used NEHotspotConfiguration API to configure the current Wi-Fi network.
     *   3. application has active VPN configurations installed.
     *   4. application has active NEDNSSettingsManager configuration installed.
     *   An application will receive nil if it fails to meet any of the above 4 requirements.
     *   An application will receive nil if does not have the "com.apple.developer.networking.wifi-info" entitlement.
     * @param completionHandler A block that will be executed when current Wi-Fi network details are
     *   obtained from the system. The NEHotspotNetwork object passed to this block will be nil if the requesting
     *   application fails to meet above requirements, non-nil otherwise. NEHotspotNetwork object contains only valid
     *   SSID and BSSID values, when the block is passed non-nil object.This block is executed on application's
     *   main queue.
     */
    @Generated
    @Selector("fetchCurrentWithCompletionHandler:")
    public static native void fetchCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_fetchCurrentWithCompletionHandler") Block_fetchCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchCurrentWithCompletionHandler {
        @Generated
        void call_fetchCurrentWithCompletionHandler(NEHotspotNetwork currentNetwork);
    }
}
