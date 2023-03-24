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

package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUserActivity;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INRideCompletionStatus extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected INRideCompletionStatus(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRideCompletionStatus alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native INRideCompletionStatus allocWithZone(VoidPtr zone);

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

    /**
     * The ride was canceled by the service (e.g. because the driver asked to cancel)
     */
    @NotNull
    @Generated
    @Selector("canceledByService")
    public static native INRideCompletionStatus canceledByService();

    /**
     * The ride was canceled by the user (e.g. by doing so through your application)
     */
    @NotNull
    @Generated
    @Selector("canceledByUser")
    public static native INRideCompletionStatus canceledByUser();

    /**
     * The ride was canceled by the service because the passenger was not present for pickup and the vehicle maximum
     * wait time elapsed.
     */
    @NotNull
    @Generated
    @Selector("canceledMissedPickup")
    public static native INRideCompletionStatus canceledMissedPickup();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * The ride completed.
     */
    @NotNull
    @Generated
    @Selector("completed")
    public static native INRideCompletionStatus completed();

    /**
     * The ride completed but there is a payment outstanding that the user needs to settle in the application.
     * The .completionUserActivity should be set, and will be continued in your application to perform payment tasks.
     */
    @NotNull
    @Generated
    @Selector("completedWithOutstandingPaymentAmount:")
    public static native INRideCompletionStatus completedWithOutstandingPaymentAmount(
            @NotNull INCurrencyAmount outstandingPaymentAmount);

    /**
     * The ride completed. The fare in the provided amount was successfully paid; this amount may be displayed to the
     * user.
     */
    @NotNull
    @Generated
    @Selector("completedWithSettledPaymentAmount:")
    public static native INRideCompletionStatus completedWithSettledPaymentAmount(
            @NotNull INCurrencyAmount settledPaymentAmount);

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
    public static native INRideCompletionStatus new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * If this property is set, UI may be shown to the user to complete post-ride tasks (e.g. for settling outstanding
     * payment). Acting on that UI will continue this activity in your application.
     */
    @Nullable
    @Generated
    @Selector("completionUserActivity")
    public native NSUserActivity completionUserActivity();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native INRideCompletionStatus init();

    @Generated
    @Selector("initWithCoder:")
    public native INRideCompletionStatus initWithCoder(@NotNull NSCoder coder);

    /**
     * YES if the ride was canceled.
     */
    @Generated
    @Selector("isCanceled")
    public native boolean isCanceled();

    /**
     * YES if the ride was completed.
     */
    @Generated
    @Selector("isCompleted")
    public native boolean isCompleted();

    /**
     * YES if the user missed the pickup. This is only YES if .canceled is YES.
     */
    @Generated
    @Selector("isMissedPickup")
    public native boolean isMissedPickup();

    /**
     * Whether the payment is outstanding (YES) or settled (NO).
     */
    @Generated
    @Selector("isOutstanding")
    public native boolean isOutstanding();

    /**
     * The payment amount, if any.
     */
    @Nullable
    @Generated
    @Selector("paymentAmount")
    public native INCurrencyAmount paymentAmount();

    /**
     * If this property is set, UI may be shown to the user to complete post-ride tasks (e.g. for settling outstanding
     * payment). Acting on that UI will continue this activity in your application.
     */
    @Generated
    @Selector("setCompletionUserActivity:")
    public native void setCompletionUserActivity(@Nullable NSUserActivity value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The ride completed but there is feedback outstanding that the user may provide to the system. See
     * INSendRideFeedbackIntent.
     * If feedbackType includes INRideFeedbackTypeOptionTip, the .defaultTippingOptions should be set.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("completedWithOutstandingFeedbackType:")
    public static native INRideCompletionStatus completedWithOutstandingFeedbackType(@NUInt long feedbackType);

    /**
     * Default options the user can choose from when adding a tip.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("defaultTippingOptions")
    public native NSSet<? extends INCurrencyAmount> defaultTippingOptions();

    /**
     * The type of feedback requested, if any.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("feedbackType")
    @NUInt
    public native long feedbackType();

    /**
     * Default options the user can choose from when adding a tip.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDefaultTippingOptions:")
    public native void setDefaultTippingOptions(@Nullable NSSet<? extends INCurrencyAmount> value);
}
