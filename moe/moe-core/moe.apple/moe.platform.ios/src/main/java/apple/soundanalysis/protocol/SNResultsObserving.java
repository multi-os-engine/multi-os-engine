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

@Generated
@Library("SoundAnalysis")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SNResultsObserving")
public interface SNResultsObserving {
    @Generated
    @IsOptional
    @Selector("request:didFailWithError:")
    default void requestDidFailWithError(@Mapped(ObjCObjectMapper.class) SNRequest request, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("request:didProduceResult:")
    void requestDidProduceResult(@Mapped(ObjCObjectMapper.class) SNRequest request,
            @Mapped(ObjCObjectMapper.class) SNResult result);

    @Generated
    @IsOptional
    @Selector("requestDidComplete:")
    default void requestDidComplete(@Mapped(ObjCObjectMapper.class) SNRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}