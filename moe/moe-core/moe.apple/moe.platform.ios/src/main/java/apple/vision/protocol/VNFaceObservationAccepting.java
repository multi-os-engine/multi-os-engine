package apple.vision.protocol;

import apple.foundation.NSArray;
import apple.vision.VNFaceObservation;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A protocol that allows a user to provide an input collection of VNFaceObservations as part of a request. The protocol
 * can be adopted by request objects that request additional information about detected faces, such as facial landmarks.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("VNFaceObservationAccepting")
public interface VNFaceObservationAccepting {
    /**
     * The VNFaceObservation objects to be processed as part of the request.
     */
    @Generated
    @Selector("inputFaceObservations")
    NSArray<? extends VNFaceObservation> inputFaceObservations();

    /**
     * The VNFaceObservation objects to be processed as part of the request.
     */
    @Generated
    @Selector("setInputFaceObservations:")
    void setInputFaceObservations(NSArray<? extends VNFaceObservation> value);
}