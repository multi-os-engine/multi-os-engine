package apple.metalperformanceshaders.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSImageSizeEncodingState")
public interface MPSImageSizeEncodingState {
    @Generated
    @Selector("sourceHeight")
    @NUInt
    long sourceHeight();

    @Generated
    @Selector("sourceWidth")
    @NUInt
    long sourceWidth();
}