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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CMSensorRecorder
 * 
 * Discussion:
 * CMSensorRecorder allows applications to record sensor data for periods
 * during which the application is not active. This data is then made
 * available for later access (up to 3 days) when the application
 * is run at a later time.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMSensorRecorder extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMSensorRecorder(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMSensorRecorder alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CMSensorRecorder allocWithZone(VoidPtr zone);

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
     * isAccelerometerRecordingAvailable
     * 
     * Discussion:
     * Determines whether accelerometer recording is available.
     */
    @Generated
    @Selector("isAccelerometerRecordingAvailable")
    public static native boolean isAccelerometerRecordingAvailable();

    /**
     * isAuthorizedForRecording
     * 
     * Discussion:
     * Determines whether the application is authorized for sensor recording.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("isAuthorizedForRecording")
    public static native boolean isAuthorizedForRecording();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CMSensorRecorder new_objc();

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
     * accelerometerDataFromDate:ToDate:
     * 
     * Discussion:
     * Gives access to recorded accelerometer samples given a time range (fromDate, toDate].
     * A total duration of 12 hours of data can be requested at any one time. Data can be delayed
     * for up to 3 minutes before being available for retrieval. An instance of CMSensorDataList
     * should only be enumerated from a single thread.
     */
    @Generated
    @Selector("accelerometerDataFromDate:toDate:")
    public native CMSensorDataList accelerometerDataFromDateToDate(NSDate fromDate, NSDate toDate);

    @Generated
    @Selector("init")
    public native CMSensorRecorder init();

    /**
     * recordAccelerometerForDuration:
     * 
     * Discussion:
     * Starts recording accelerometer data for the duration given at 50hz. Data can be recorded
     * for up to 12 hours.
     */
    @Generated
    @Selector("recordAccelerometerForDuration:")
    public native void recordAccelerometerForDuration(double duration);

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Returns the current authorization status for sensor recording.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();
}
