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

package apple.coremotion;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * CMPedometer
 * 
 * Discussion:
 * CMPedometer allows access to the user's pedestrian activity. The
 * activity can be retrieved in one of two ways:
 * 
 * 1. Via a query specifying a time range from which the pedometer data is
 * tabulated and returned.
 * (See queryPedometerDataFromDate:toDate:withHandler:)
 * 
 * 2. By providing a block to startPedometerUpdatesFromDate:withHandler:,
 * pedometer updates will be provided on a best effort basis. Pedometer
 * updates can be stopped by calling stopPedometerUpdates.
 * 
 * 
 * API-Since: 8.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMPedometer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMPedometer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMPedometer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CMPedometer allocWithZone(VoidPtr zone);

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

    /**
     * isCadenceAvailable
     * 
     * Discussion:
     * Determines whether the device supports cadence estimation
     * in addition to step counting.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("isCadenceAvailable")
    public static native boolean isCadenceAvailable();

    /**
     * isDistanceAvailable
     * 
     * Discussion:
     * Determines whether the device supports distance estimation
     * in addition to step counting.
     */
    @Generated
    @Selector("isDistanceAvailable")
    public static native boolean isDistanceAvailable();

    /**
     * isFloorCountingAvailable
     * 
     * Discussion:
     * Determines whether the device supports counting flights of stairs
     * in addition to step counting.
     */
    @Generated
    @Selector("isFloorCountingAvailable")
    public static native boolean isFloorCountingAvailable();

    /**
     * isPaceAvailable
     * 
     * Discussion:
     * Determines whether the device supports pace estimation
     * in addition to step counting.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("isPaceAvailable")
    public static native boolean isPaceAvailable();

    /**
     * isPedometerEventTrackingAvailable
     * 
     * Discussion:
     * Determines whether the device supports pedometer events.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("isPedometerEventTrackingAvailable")
    public static native boolean isPedometerEventTrackingAvailable();

    /**
     * isStepCountingAvailable
     * 
     * Discussion:
     * Determines whether the device supports step counting functionality.
     */
    @Generated
    @Selector("isStepCountingAvailable")
    public static native boolean isStepCountingAvailable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CMPedometer new_objc();

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

    @Generated
    @Selector("init")
    public native CMPedometer init();

    /**
     * queryPedometerDataFromDate:toDate:withHandler:
     * 
     * Discussion:
     * Queries for the user's pedestrian activity in the given time range. Data
     * is available for up to 7 days. The data returned is computed from a
     * system-wide history that is continuously being collected in the
     * background. The result is returned on a serial queue.
     */
    @Generated
    @Selector("queryPedometerDataFromDate:toDate:withHandler:")
    public native void queryPedometerDataFromDateToDateWithHandler(NSDate start, NSDate end,
            @ObjCBlock(name = "call_queryPedometerDataFromDateToDateWithHandler") Block_queryPedometerDataFromDateToDateWithHandler handler);

    /**
     * startPedometerEventUpdatesWithHandler:
     * 
     * Discussion:
     * Starts pedometer event updates on a serial queue.
     * Events are available only when the apps are running in foreground / background.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("startPedometerEventUpdatesWithHandler:")
    public native void startPedometerEventUpdatesWithHandler(
            @ObjCBlock(name = "call_startPedometerEventUpdatesWithHandler") Block_startPedometerEventUpdatesWithHandler handler);

    /**
     * startPedometerUpdatesFromDate:withHandler:
     * 
     * Discussion:
     * Starts a series of continuous pedometer updates to the
     * handler on a serial queue. For each update, the app
     * will receive the cumulative pedestrian activity since the
     * start date specified and the timestamp associated with the
     * latest determination. If the app is backgrounded and resumed
     * at a later time, the app will receive all of the pedestrian
     * activity accumulated during the background period in the
     * very next update.
     */
    @Generated
    @Selector("startPedometerUpdatesFromDate:withHandler:")
    public native void startPedometerUpdatesFromDateWithHandler(NSDate start,
            @ObjCBlock(name = "call_startPedometerUpdatesFromDateWithHandler") Block_startPedometerUpdatesFromDateWithHandler handler);

    /**
     * stopPedometerEventUpdates
     * 
     * Discussion:
     * Stops pedometer event updates.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("stopPedometerEventUpdates")
    public native void stopPedometerEventUpdates();

    /**
     * stopPedometerUpdates
     * 
     * Discussion:
     * Stops pedometer updates.
     */
    @Generated
    @Selector("stopPedometerUpdates")
    public native void stopPedometerUpdates();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_queryPedometerDataFromDateToDateWithHandler {
        @Generated
        void call_queryPedometerDataFromDateToDateWithHandler(CMPedometerData pedometerData, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startPedometerEventUpdatesWithHandler {
        @Generated
        void call_startPedometerEventUpdatesWithHandler(CMPedometerEvent pedometerEvent, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startPedometerUpdatesFromDateWithHandler {
        @Generated
        void call_startPedometerUpdatesFromDateWithHandler(CMPedometerData pedometerData, NSError error);
    }

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Returns the current authorization status for pedometer.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();
}
