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

package apple.cloudkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
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
 * CKQuerySubscription
 * 
 * A subscription that fires whenever a change matching the predicate occurs.
 * 
 * [@c] CKQuerySubscriptions are not supported in a @c sharedCloudDatabase
 * 
 * API-Since: 10.0
 */
@Generated
@Library("CloudKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CKQuerySubscription extends CKSubscription implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CKQuerySubscription(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CKQuerySubscription alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CKQuerySubscription allocWithZone(VoidPtr zone);

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
    public static native CKQuerySubscription new_objc();

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
    public native CKQuerySubscription init();

    @Generated
    @Selector("initWithCoder:")
    public native CKQuerySubscription initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithRecordType:predicate:options:")
    public native CKQuerySubscription initWithRecordTypePredicateOptions(@NotNull String recordType,
            @NotNull NSPredicate predicate, @NUInt long querySubscriptionOptions);

    @Generated
    @Selector("initWithRecordType:predicate:subscriptionID:options:")
    public native CKQuerySubscription initWithRecordTypePredicateSubscriptionIDOptions(@NotNull String recordType,
            @NotNull NSPredicate predicate, @NotNull String subscriptionID, @NUInt long querySubscriptionOptions);

    /**
     * A predicate that determines when the subscription fires.
     */
    @NotNull
    @Generated
    @Selector("predicate")
    public native NSPredicate predicate();

    /**
     * Options flags describing the firing behavior subscription.
     * 
     * One of
     * [@c] CKQuerySubscriptionOptionsFiresOnRecordCreation,
     * [@c] CKQuerySubscriptionOptionsFiresOnRecordUpdate, or
     * [@c] CKQuerySubscriptionOptionsFiresOnRecordDeletion must be specified or an @c NSInvalidArgumentException will
     * be thrown.
     */
    @Generated
    @Selector("querySubscriptionOptions")
    @NUInt
    public native long querySubscriptionOptions();

    /**
     * The record type that this subscription watches
     */
    @NotNull
    @Generated
    @Selector("recordType")
    public native String recordType();

    /**
     * Optional property. If set, a query subscription is scoped to only record changes in the indicated zone.
     * Query Subscriptions that do not specify a @c zoneID are scoped to record changes across all zones in the
     * database.
     */
    @Generated
    @Selector("setZoneID:")
    public native void setZoneID(@Nullable CKRecordZoneID value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Optional property. If set, a query subscription is scoped to only record changes in the indicated zone.
     * Query Subscriptions that do not specify a @c zoneID are scoped to record changes across all zones in the
     * database.
     */
    @Nullable
    @Generated
    @Selector("zoneID")
    public native CKRecordZoneID zoneID();
}
