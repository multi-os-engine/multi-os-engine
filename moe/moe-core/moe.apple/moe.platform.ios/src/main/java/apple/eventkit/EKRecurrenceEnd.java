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

package apple.eventkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
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
 * EKRecurrenceEnd
 * 
 * Class which represents when a recurrence should end.
 * 
 * EKRecurrenceEnd is an attribute of EKRecurrenceRule that defines how long
 * the recurrence is scheduled to repeat. The recurrence can be defined either
 * with an NSUInteger that indicates the total number times it repeats, or with
 * an NSDate, after which it no longer repeats. An event which is set to never
 * end should have its EKRecurrenceEnd set to nil.
 * 
 * If the end of the pattern is defines with an NSDate, the client must pass a
 * valid NSDate, nil cannot be passed. If the end of the pattern is defined as
 * terms of a number of occurrences, the occurrenceCount passed to the initializer
 * must be positive, it cannot be 0. If the client attempts to initialize a
 * EKRecurrenceEnd with a nil NSDate or OccurrenceCount of 0, an exception is raised.
 * 
 * A EKRecurrenceEnd initialized with an end date will return 0 for occurrenceCount.
 * One initialized with a number of occurrences will return nil for its endDate.
 * 
 * API-Since: 4.0
 */
@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKRecurrenceEnd extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected EKRecurrenceEnd(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKRecurrenceEnd alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native EKRecurrenceEnd allocWithZone(VoidPtr zone);

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
    public static native EKRecurrenceEnd new_objc();

    /**
     * recurrenceEndWithEndDate:
     * 
     * Creates an autoreleased recurrence end with a specific end date.
     */
    @Generated
    @Selector("recurrenceEndWithEndDate:")
    public static native EKRecurrenceEnd recurrenceEndWithEndDate(@NotNull NSDate endDate);

    /**
     * recurrenceEndWithOccurrenceCount:
     * 
     * Creates an autoreleased recurrence end with a maximum occurrence count.
     */
    @Generated
    @Selector("recurrenceEndWithOccurrenceCount:")
    public static native EKRecurrenceEnd recurrenceEndWithOccurrenceCount(@NUInt long occurrenceCount);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] endDate
     * 
     * The end date of this recurrence, or nil if it's count-based.
     */
    @Nullable
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    @Generated
    @Selector("init")
    public native EKRecurrenceEnd init();

    /**
     * [@property] occurrenceCount
     * 
     * The maximum occurrence count, or 0 if it's date-based.
     */
    @Generated
    @Selector("occurrenceCount")
    @NUInt
    public native long occurrenceCount();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCoder:")
    public native EKRecurrenceEnd initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
