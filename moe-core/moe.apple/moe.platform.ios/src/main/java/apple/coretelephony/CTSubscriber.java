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
import apple.coretelephony.protocol.CTSubscriberDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreTelephony")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CTSubscriber extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CTSubscriber(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CTSubscriber alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CTSubscriber allocWithZone(VoidPtr zone);

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
    public static native CTSubscriber new_objc();

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
     * carrierToken
     * 
     * Description:
     * This method is only available to carrier apps with suitable entitlements.
     * A data blob containing authorization information about the subscriber.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("carrierToken")
    public native NSData carrierToken();

    @Generated
    @Selector("init")
    public native CTSubscriber init();

    /**
     * API-Since: 12.1
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CTSubscriberDelegate delegate();

    /**
     * identifier
     * 
     * Description:
     * An implementation-defined identifier that can be used to correlate this CTSubscriber
     * with information vended by other API's.
     * The format of the identifier can change across software releases. Therefore, applications
     * should not persist it.
     * 
     * API-Since: 12.1
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    /**
     * API-Since: 12.1
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) CTSubscriberDelegate value);

    /**
     * API-Since: 12.1
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CTSubscriberDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * SIMInserted
     * 
     * Description
     * Returns whether or not the SIM matching the Info.plist carrier information (MCC / MNC / GIDs) is currently
     * inserted in the associated descriptor
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isSIMInserted")
    public native boolean isSIMInserted();

    /**
     * refreshCarrierToken
     * 
     * Description:
     * This method is only available to carrier apps with suitable entitlements.
     * If the carrier token does exist but is declined by the server, then the token
     * may be updated using this method. As a general rule, retrieve the carrierToken first.
     * A refresh should only be done when that information is known to be incorrect.
     * 
     * If the refresh will be performed, this function will return YES and the
     * subscriberTokenRefreshed(_:) delegate method will be called.
     * If the request to refresh fails due to invalid argument (bad carrier descriptors or invalid service descriptor)
     * or subscriber does not support the authentication action, this function will return NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("refreshCarrierToken")
    public native boolean refreshCarrierToken();
}
