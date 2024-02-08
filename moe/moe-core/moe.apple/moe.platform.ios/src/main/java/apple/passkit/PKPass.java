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

package apple.passkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.uikit.UIImage;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class PKPass extends PKObject {
    static {
        NatJ.register();
    }

    @Generated
    protected PKPass(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native PKPass alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native PKPass allocWithZone(VoidPtr zone);

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
    public static native PKPass new_objc();

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

    @Nullable
    @Generated
    @Selector("authenticationToken")
    public native String authenticationToken();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("deviceName")
    public native String deviceName();

    @NotNull
    @Generated
    @Selector("icon")
    public native UIImage icon();

    @Generated
    @Selector("init")
    public native PKPass init();

    @Generated
    @Selector("initWithData:error:")
    public native PKPass initWithDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("isRemotePass")
    public native boolean isRemotePass();

    /**
     * e.g. "SFO -> LHR"
     */
    @NotNull
    @Generated
    @Selector("localizedDescription")
    public native String localizedDescription();

    /**
     * e.g. "Boarding Pass"
     */
    @NotNull
    @Generated
    @Selector("localizedName")
    public native String localizedName();

    /**
     * IBOutlet-like; allows access to field data from pass file format
     */
    @Nullable
    @Generated
    @Selector("localizedValueForFieldKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object localizedValueForFieldKey(@NotNull String key);

    /**
     * e.g. "Great Airways"
     */
    @NotNull
    @Generated
    @Selector("organizationName")
    public native String organizationName();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("passType")
    @NUInt
    public native long passType();

    @NotNull
    @Generated
    @Selector("passTypeIdentifier")
    public native String passTypeIdentifier();

    /**
     * open to view pass in Wallet app
     */
    @Nullable
    @Generated
    @Selector("passURL")
    public native NSURL passURL();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use -[PKPass secureElementPass] instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("paymentPass")
    public native PKPaymentPass paymentPass();

    /**
     * may be useful for sorting
     */
    @Nullable
    @Generated
    @Selector("relevantDate")
    public native NSDate relevantDate();

    @NotNull
    @Generated
    @Selector("serialNumber")
    public native String serialNumber();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("userInfo")
    public native NSDictionary<?, ?> userInfo();

    @Nullable
    @Generated
    @Selector("webServiceURL")
    public native NSURL webServiceURL();

    /**
     * API-Since: 13.4
     */
    @Nullable
    @Generated
    @Selector("secureElementPass")
    public native PKSecureElementPass secureElementPass();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
