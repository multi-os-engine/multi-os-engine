package apple.vision.protocol;

import apple.foundation.NSArray;
import apple.vision.VNFaceObservation;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VNFaceObservationAccepting")
public interface VNFaceObservationAccepting {
    @Generated
    @Selector("inputFaceObservations")
    NSArray<? extends VNFaceObservation> inputFaceObservations();

    @Generated
    @Selector("setInputFaceObservations:")
    void setInputFaceObservations(NSArray<? extends VNFaceObservation> value);
}