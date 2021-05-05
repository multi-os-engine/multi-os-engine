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

package apple.foundation;

import apple.NSObject;
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

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDateInterval extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDateInterval(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSDateInterval alloc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * (NSComparisonResult)compare:(NSDateInterval *) prioritizes ordering by start date. If the start dates are equal, then it will order by duration.
     * e.g.
     *    Given intervals a and b
     *        a.   |-----|
     *        b.      |-----|
     * [a compare:b] would return NSOrderedAscending because a's startDate is earlier in time than b's start date.
     * 
     * In the event that the start dates are equal, the compare method will attempt to order by duration.
     * e.g.
     *    Given intervals c and d
     *        c.  |-----|
     *        d.  |---|
     * [c compare:d] would result in NSOrderedDescending because c is longer than d.
     * 
     * If both the start dates and the durations are equal, then the intervals are considered equal and NSOrderedSame is returned as the result.
     */
    @Generated
    @Selector("compare:")
    @NInt
    public native long compare(NSDateInterval dateInterval);

    @Generated
    @Selector("containsDate:")
    public native boolean containsDate(NSDate date);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    /**
     * This method initializes an NSDateInterval object with start and end dates set to the current date and the duration set to 0.
     */
    @Generated
    @Selector("init")
    public native NSDateInterval init();

    @Generated
    @Selector("initWithCoder:")
    public native NSDateInterval initWithCoder(NSCoder coder);

    /**
     * This method will throw an exception if the duration is less than 0.
     */
    @Generated
    @Selector("initWithStartDate:duration:")
    public native NSDateInterval initWithStartDateDuration(NSDate startDate, double duration);

    /**
     * This method will throw an exception if the end date comes before the start date.
     */
    @Generated
    @Selector("initWithStartDate:endDate:")
    public native NSDateInterval initWithStartDateEndDate(NSDate startDate, NSDate endDate);

    /**
     * This method returns an NSDateInterval object that represents the interval where the given date interval and the current instance intersect. In the event that there is no intersection, the method returns nil.
     */
    @Generated
    @Selector("intersectionWithDateInterval:")
    public native NSDateInterval intersectionWithDateInterval(NSDateInterval dateInterval);

    @Generated
    @Selector("intersectsDateInterval:")
    public native boolean intersectsDateInterval(NSDateInterval dateInterval);

    @Generated
    @Selector("isEqualToDateInterval:")
    public native boolean isEqualToDateInterval(NSDateInterval dateInterval);

    /**
     * NSDateInterval represents a closed date interval in the form of [startDate, endDate].  It is possible for the start and end dates to be the same with a duration of 0.  NSDateInterval does not support reverse intervals i.e. intervals where the duration is less than 0 and the end date occurs earlier in time than the start date.
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
