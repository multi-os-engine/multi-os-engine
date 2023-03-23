package apple.sensorkit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.sensorkit.SRDevice;
import apple.sensorkit.SRFetchRequest;
import apple.sensorkit.SRFetchResult;
import apple.sensorkit.SRSensorReader;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 14.0
 */
@Generated
@Library("SensorKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SRSensorReaderDelegate")
public interface SRSensorReaderDelegate {
    /**
     * Invoked when authorization status has changed
     */
    @Generated
    @IsOptional
    @Selector("sensorReader:didChangeAuthorizationStatus:")
    default void sensorReaderDidChangeAuthorizationStatus(SRSensorReader reader, @NInt long authorizationStatus) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when a fetch has been completed successfully
     */
    @Generated
    @IsOptional
    @Selector("sensorReader:didCompleteFetch:")
    default void sensorReaderDidCompleteFetch(SRSensorReader reader, SRFetchRequest fetchRequest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sensorReader:didFetchDevices:")
    default void sensorReaderDidFetchDevices(SRSensorReader reader, NSArray<? extends SRDevice> devices) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("sensorReader:fetchDevicesDidFailWithError:")
    default void sensorReaderFetchDevicesDidFailWithError(SRSensorReader reader, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when a sample has been fetched
     * 
     * [@description] This callback can be called multiple times
     * when there are multiple results.
     * 
     * [@note] The fetchResult is not valid after the callback is complete. If the caller needs
     * to access the result at a later time, it must be copied not merely retained
     * 
     * @param fetchRequest The request corresponding to the this result
     * @param result       One result of the fetch. The caller is expected to
     *                     know what type of sample is returned.
     * 
     * @return
     *         The delegate should return YES if the fetch should continue, NO if the fetch should stop
     */
    @Generated
    @IsOptional
    @Selector("sensorReader:fetchingRequest:didFetchResult:")
    default boolean sensorReaderFetchingRequestDidFetchResult(SRSensorReader reader, SRFetchRequest fetchRequest,
            SRFetchResult<?> result) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when a fetch has completed with an error
     */
    @Generated
    @IsOptional
    @Selector("sensorReader:fetchingRequest:failedWithError:")
    default void sensorReaderFetchingRequestFailedWithError(SRSensorReader reader, SRFetchRequest fetchRequest,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked if there was an error starting recording for a given sensor
     */
    @Generated
    @IsOptional
    @Selector("sensorReader:startRecordingFailedWithError:")
    default void sensorReaderStartRecordingFailedWithError(SRSensorReader reader, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked if there was an error starting recording for a given sensor
     */
    @Generated
    @IsOptional
    @Selector("sensorReader:stopRecordingFailedWithError:")
    default void sensorReaderStopRecordingFailedWithError(SRSensorReader reader, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked after a SRSensorReader has request that recording be
     * stopped for a sensor
     */
    @Generated
    @IsOptional
    @Selector("sensorReaderDidStopRecording:")
    default void sensorReaderDidStopRecording(SRSensorReader reader) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked after a SRSensorReader has request that recording be
     * started for a sensor
     */
    @Generated
    @IsOptional
    @Selector("sensorReaderWillStartRecording:")
    default void sensorReaderWillStartRecording(SRSensorReader reader) {
        throw new java.lang.UnsupportedOperationException();
    }
}
