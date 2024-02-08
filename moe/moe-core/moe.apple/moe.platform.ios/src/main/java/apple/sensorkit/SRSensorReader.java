package apple.sensorkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.sensorkit.protocol.SRSensorReaderDelegate;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("SensorKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SRSensorReader extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected SRSensorReader(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SRSensorReader alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SRSensorReader allocWithZone(VoidPtr zone);

    /**
     * The current authorization status of the calling application.
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public native long authorizationStatus();

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

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SRSensorReaderDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Fetches samples for the reader's sensor for given request parameters
     * 
     * The reader must be authorized for the sensor for this to succeed.
     * 
     * Samples will be delivered to the delegate through multiple calls
     * to the sensorReader:fetchingRequest:didFetchResult: delegate method
     * 
     * In the case of a failure, any error will be delivered to the delegate in the
     * sensorReader:fetchingRequest:failedWithError: method.
     * 
     * In the case of success, completion notification will be delivered
     * to the delegate in the sensorReader:didCompleteFetch: method.
     * 
     * @param request The query parameters for this fetch
     */
    @Generated
    @Selector("fetch:")
    public native void fetch(@NotNull SRFetchRequest request);

    /**
     * Fetches device information for all devices that have stored data for
     * the given sensor in SensorKit
     * 
     * If the request completes successfully, devices will be returned to the
     * delegate in the sensorReader:fetchedDevices: callback. If the request
     * failed, an error will be returned to the delegate in the
     * sensorReader:fetchDevicesFailedWithError:
     * method
     */
    @Generated
    @Selector("fetchDevices")
    public native void fetchDevices();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SRSensorReader init();

    /**
     * Initializes an SRSensorReader that will fetch data for the current device
     * and any companion
     */
    @Generated
    @Selector("initWithSensor:")
    public native SRSensorReader initWithSensor(@NotNull String sensor);

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
    public static native SRSensorReader new_objc();

    /**
     * Request authorization to a given set of sensors
     * 
     * If the SRSensorReader instance is not authorized, this
     * method must be called before any other methods. Failure to request
     * authorization will cause errors to be returned from the other methods.
     * 
     * When SensorKit prepares the prompt for display, it will look at the
     * NSSensorKitUsageDetail key in your Info.plist. The value should be
     * a dictionary containing usage descriptions for all of the sensors being
     * requested. The description key you provide to this method must
     * correspond to an entry in that dictionary. To retrieve a localized
     * string, SensorKit will load your InfoPlist.strings file and try to look
     * up a string using the description key you provided. If that fails,
     * SensorKit will use the content provided in your Info.plist.
     * 
     * SensorKit may decide against showing the user a prompt. For example,
     * if the user has already chosen whether to grant the application access
     * to all of the types provided. When that happens, your completion block
     * will be called with an appropriate NSError. If the user responded to
     * the prompt, your completion block will be called with a nil error.
     * Changes in authorization status will delivered to the delegate in the
     * sensorReader:didChangeAuthorizationStatus: method.
     */
    @Generated
    @Selector("requestAuthorizationForSensors:completion:")
    public static native void requestAuthorizationForSensorsCompletion(@NotNull NSSet<String> sensors,
            @NotNull @ObjCBlock(name = "call_requestAuthorizationForSensorsCompletion") Block_requestAuthorizationForSensorsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAuthorizationForSensorsCompletion {
        @Generated
        void call_requestAuthorizationForSensorsCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * the sensor this reader was initialized with
     */
    @NotNull
    @Generated
    @Selector("sensor")
    public native String sensor();

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) SRSensorReaderDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) SRSensorReaderDelegate value) {
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
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Starts recording for the reader's sensor
     * 
     * The reader must be authorized for the sensor for this to succeed.
     * This starts recording on this device and any paired devices.
     * If other readers have already started the sensor recording this
     * reader's interest in recording will be maintained. Other readers in
     * other apps for the same sensor will not affect the recording status
     * of this reader.
     * 
     * In the case of success, completion notification will be delivered
     * to the delegate in the sensorReaderWillStartRecording:
     * delegate method.
     * 
     * In the case of failure, error notification will be delivered
     * to the delegate in the sensorReader:startRecordingFailedWithError:
     * delegate method.
     */
    @Generated
    @Selector("startRecording")
    public native void startRecording();

    /**
     * Stops recording for the reader's sensor
     * 
     * The reader must be authorized for the sensor for this to succeed.
     * This stops recording on this device and any paired devices.
     * Sensor recording will continue until the last interested reader has
     * stopped recording.
     * 
     * In the case of success, completion notification will be delivered
     * to the delegate in the sensorReaderDidStopRecording:
     * delegate method.
     * 
     * In the case of failure, error notification will be delivered
     * to the delegate in the sensorReader:stopRecordingFailedWithError:
     * delegate method.
     */
    @Generated
    @Selector("stopRecording")
    public native void stopRecording();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
