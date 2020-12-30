package apple.soundanalysis.protocol;

import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @brief The interface through which clients receive the results of an analysis request
 */
@Generated
@Library("SoundAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SNResultsObserving")
public interface SNResultsObserving {
    /**
     * @brief Informs the client of an error produced during analysis
     * @discussion If an error is produced by a request, that request will not produce any more results, and is in a terminal state. The request:didFailWithError and requestDidComplete methods are mutually exclusive.
     */
    @Generated
    @IsOptional
    @Selector("request:didFailWithError:")
    default void requestDidFailWithError(@Mapped(ObjCObjectMapper.class) SNRequest request, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @brief Provides a new analysis result to the client with the specified time range
     * @discussion This function will be called each time a new analysis result is available. Different types of analysis may produce results at different rates, spanning different time ranges.
     */
    @Generated
    @Selector("request:didProduceResult:")
    void requestDidProduceResult(@Mapped(ObjCObjectMapper.class) SNRequest request,
            @Mapped(ObjCObjectMapper.class) SNResult result);

    /**
     * @brief Informs the client that the analysis request was completed normally
     * @discussion If an analysis request completes normally, that request will not produce any more results, and is in a terminal state. The request:didFailWithError and requestDidComplete methods are mutually exclusive.
     */
    @Generated
    @IsOptional
    @Selector("requestDidComplete:")
    default void requestDidComplete(@Mapped(ObjCObjectMapper.class) SNRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}