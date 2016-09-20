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
import apple.foundation.NSDate;
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

@Generated
@Library("EventKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EKEvent extends EKCalendarItem {
    static {
        NatJ.register();
    }

    @Generated
    protected EKEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native EKEvent alloc();

    /**
     * eventWithEventStore:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/clm/EKEvent/eventWithEventStore:">iOS Dev Center</a>
     */
    @Generated
    @Selector("eventWithEventStore:")
    public static native EKEvent eventWithEventStore(EKEventStore eventStore);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

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
     * availability</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/availability">iOS Dev Center</a>
     */
    @NInt
    @Generated
    @Selector("availability")
    public native long availability();

    /**
     * birthdayPersonID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/birthdayPersonID">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("birthdayPersonID")
    @NInt
    public native long birthdayPersonID();

    /**
     * compareStartDateWithEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instm/EKEvent/compareStartDateWithEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("compareStartDateWithEvent:")
    @NInt
    public native long compareStartDateWithEvent(EKEvent other);

    /**
     * endDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/endDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("endDate")
    public native NSDate endDate();

    /**
     * eventIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/eventIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("eventIdentifier")
    public native String eventIdentifier();

    @Generated
    @Selector("init")
    public native EKEvent init();

    /**
     * allDay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/allDay">iOS Dev Center</a>
     */
    @Generated
    @Selector("isAllDay")
    public native boolean isAllDay();

    /**
     * allDay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/allDay">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAllDay:")
    public native void setAllDay(boolean value);

    /**
     * isDetached</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/isDetached">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDetached")
    public native boolean isDetached();

    /**
     * organizer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/organizer">iOS Dev Center</a>
     */
    @Generated
    @Selector("organizer")
    public native EKParticipant organizer();

    /**
     * refresh</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instm/EKEvent/refresh">iOS Dev Center</a>
     */
    @Generated
    @Selector("refresh")
    public native boolean refresh();

    /**
     * availability</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/availability">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAvailability:")
    public native void setAvailability(@NInt long value);

    /**
     * endDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/endDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEndDate:")
    public native void setEndDate(NSDate value);

    /**
     * startDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/startDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStartDate:")
    public native void setStartDate(NSDate value);

    /**
     * startDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/startDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("startDate")
    public native NSDate startDate();

    /**
     * status</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/status">iOS Dev Center</a>
     */
    @NInt
    @Generated
    @Selector("status")
    public native long status();

    @Generated
    @Selector("birthdayContactIdentifier")
    public native String birthdayContactIdentifier();

    /**
     * occurrenceDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKit/Reference/EKEventClassRef/index.html#//apple_ref/occ/instp/EKEvent/occurrenceDate">iOS Dev Center</a>
     */
    @Generated
    @Selector("occurrenceDate")
    public native NSDate occurrenceDate();

    @Generated
    @Selector("setStructuredLocation:")
    public native void setStructuredLocation(EKStructuredLocation value);

    @Generated
    @Selector("structuredLocation")
    public native EKStructuredLocation structuredLocation();
}
