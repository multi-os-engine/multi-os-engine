package apple.vision.c;

import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("Vision")
@Runtime(CRuntime.class)
public final class Vision {
    static {
        NatJ.register();
    }

    @Generated
    private Vision() {
    }

    /**
     * @discussion	Determines whether or not the normalized rect describes the identity rect of { {0, 0}, {1, 1} }.
     * 
     * @param	normalizedRect			The rectangle in the normalized coordinate space of [0..1].
     * 
     * @return YES if the rect is the identity rect; otherwise, NO.
     */
    @Generated
    @CFunction
    public static native boolean VNNormalizedRectIsIdentityRect(@ByValue CGRect normalizedRect);

    /**
     * @discussion	Returns a point in (possibly non-integral) image coordinates that is projected from a point in a normalized coordinate space.
     * 
     * @param	normalizedPoint			The point in the normalized coordinate space of [0..1].
     * 
     * @param	imageWidth				The pixel width of the image.
     * 
     * @param	imageHeight				The pixel height of the image.
     * 
     * @return the point in image coordinates.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint VNImagePointForNormalizedPoint(@ByValue CGPoint normalizedPoint,
            @NUInt long imageWidth, @NUInt long imageHeight);

    /**
     * @discussion	Returns a rectangle in (possibly non-integral) image coordinates that is projected from a rectangle in a normalized coordinate space.
     * 
     * @param	normalizedRect			The rectangle in the normalized coordinate space of [0..1].
     * 
     * @param	imageWidth				The pixel width of the image.
     * 
     * @param	imageHeight				The pixel height of the image.
     * 
     * @return the rectangle in pixel coordinates.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect VNImageRectForNormalizedRect(@ByValue CGRect normalizedRect, @NUInt long imageWidth,
            @NUInt long imageHeight);

    /**
     * @discussion	Returns an image rectangle in normalized coordinates.
     * 
     * @param	imageRect				The rectangle in image coordinate space.
     * 
     * @param	imageWidth				The pixel width of the image.
     * 
     * @param	imageHeight				The pixel height of the image.
     * 
     * @return the normalized rectangle.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect VNNormalizedRectForImageRect(@ByValue CGRect imageRect, @NUInt long imageWidth,
            @NUInt long imageHeight);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyAztec();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode39();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode39Checksum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode39FullASCII();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode39FullASCIIChecksum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode93();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode93i();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyCode128();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyDataMatrix();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyEAN8();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyEAN13();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyI2of5();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyI2of5Checksum();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyITF14();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyPDF417();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyQR();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBarcodeSymbologyUPCE();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNErrorDomain();

    /**
     * @brief	The normalized identity rect of { {0, 0}, {1, 1} }.
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGRect VNNormalizedIdentityRect();

    /**
     * @const      VNImageOptionProperties
     * @abstract   VNImageOptionProperties is the dictionary from CGImageSourceCopyPropertiesAtIndex. This contains metadata that can be used by some algorithms like horizon detection.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionProperties();

    /**
     * @brief VNImageOptionCameraIntrinsics  Specifies the camera intrinsics as an NSData or CFData representing a matrix_float3x3. See kCMSampleBufferAttachmentKey_CameraIntrinsicMatrix for details
     * @discussion
     *     Camera intrinsic matrix is a CFData containing a matrix_float3x3, which is column-major. It has the following contents:
     *     fx	0	ox
     *     0	fy	oy
     *     0	0	1
     *     fx and fy are the focal length in pixels. For square pixels, they will have the same value.
     *     ox and oy are the coordinates of the principal point. The origin is the upper left of the frame.
     * @note When using a CMSampleBuffer as an input and that sample buffer has camera intrinsics attached to it, Vision will use the camera intrinsic from there unless overwritten by passing in as an explicit option which will take precedence.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionCameraIntrinsics();

    /**
     * @brief VNImageOptionCIContext  Specifies the CIContext to be used in Core Image operations of request handler. If this is not specified, Vision will create its own CIContext. This option is helpful when the passed in CIImage is the result of a CIFilter chain that has been executed on a CIContext or uses outputs of a CIImage on a given CIContext as they don't have to transfer to other contexts.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionCIContext();

    /**
     * The version of the Vision framework
     */
    @Generated
    @CVariable()
    public static native double VNVisionVersionNumber();

    /**
     * @brief Obtain the size, in bytes, of a given element type.
     * 
     * @param	elementType		The element type.
     * 
     * @return a byte count, or 0 if the element type is unknown.
     */
    @Generated
    @CFunction
    @NUInt
    public static native long VNElementTypeSize(@NUInt long elementType);

    /**
     * @brief	A value that indicates that the request revision is either unknown or not applicable.
     */
    @Generated @NUInt public static final long VNRequestRevisionUnspecified = 0x0000000000000000L;
    @Generated @NUInt public static final long VNClassifyImageRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectBarcodesRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectFaceRectanglesRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectFaceRectanglesRequestRevision2 = 0x0000000000000002L;
    @Generated @NUInt public static final long VNDetectFaceLandmarksRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectFaceLandmarksRequestRevision2 = 0x0000000000000002L;
    @Generated @NUInt public static final long VNDetectFaceLandmarksRequestRevision3 = 0x0000000000000003L;
    @Generated @NUInt public static final long VNDetectFaceCaptureQualityRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectHorizonRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectRectanglesRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectTextRectanglesRequestRevision1 = 0x0000000000000001L;
    /**
     * @brief VNRecognizeTextRequestRevision1 only supports English
     */
    @Generated @NUInt public static final long VNRecognizeTextRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNGenerateAttentionBasedSaliencyImageRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNGenerateObjectnessBasedSaliencyImageRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNGenerateImageFeaturePrintRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNCoreMLRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNTranslationalImageRegistrationRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNHomographicImageRegistrationRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNTrackObjectRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNTrackObjectRequestRevision2 = 0x0000000000000002L;
    @Generated @NUInt public static final long VNTrackRectangleRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectHumanRectanglesRequestRevision1 = 0x0000000000000001L;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalIdentifierDog();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalIdentifierCat();

    @Generated @NUInt public static final long VNRecognizeAnimalsRequestRevision1 = 0x0000000000000001L;

    /**
     * @discussion    Returns a point in normalized coordinate space that is projected from a point in a image coordinates
     * 
     * @param    imagePoint                  The point in image coordinate space.
     * 
     * @param    imageWidth                  The pixel width of the image.
     * 
     * @param    imageHeight                The pixel height of the image.
     * 
     * @return the point in normalized coordinates.
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint VNNormalizedPointForImagePoint(@ByValue CGPoint imagePoint, @NUInt long imageWidth,
            @NUInt long imageHeight);

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNVideoProcessingOptionFrameCadence();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNVideoProcessingOptionTimeInterval();

    @Generated @NUInt public static final long VNDetectFaceCaptureQualityRequestRevision2 = 0x0000000000000002L;
    /**
     * @brief VNRecognizeTextRequestRevision2 supports English, Chinese, Portuguese, French, Italian, German and Spanish in the accurate recognition level. The fast recognition level supports English, Portuguese, French, Italian, German and Spanish. Best practice is to use supportedRecognitionLanguagesForTextRecognitionLevel to check for supported languages. As the underlying engine has changed from VNRecognizeTextRequestRevision1, results can differ but are generally more accurate. 
     */
    @Generated @NUInt public static final long VNRecognizeTextRequestRevision2 = 0x0000000000000002L;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNRecognizedPointGroupKeyAll();

    @Generated @NUInt public static final long VNGenerateOpticalFlowRequestRevision1 = 0x0000000000000001L;

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyNose();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftEye();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightEye();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftEar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightEar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftShoulder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightShoulder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyNeck();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftElbow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightElbow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftWrist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightWrist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftHip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightHip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRoot();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftKnee();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightKnee();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyLeftAnkle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkKeyRightAnkle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyFace();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyTorso();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyLeftArm();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyRightArm();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyLeftLeg();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNBodyLandmarkRegionKeyRightLeg();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameNose();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftEye();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightEye();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftEar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightEar();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftShoulder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightShoulder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameNeck();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftElbow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightElbow();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftWrist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightWrist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftHip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightHip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRoot();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftKnee();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightKnee();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameLeftAnkle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointNameRightAnkle();

    /**
     * nose, eyes, and ears
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameFace();

    /**
     * shoulders, neck and hips
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameTorso();

    /**
     * left shoulder, left elbow, and left wrist
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameLeftArm();

    /**
     * right shoulder, right elbow, and right wrist
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameRightArm();

    /**
     * left ankle, left knee, and left hip
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameLeftLeg();

    /**
     * right ankle, right knee, and right hip
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameRightLeg();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanBodyPoseObservationJointsGroupNameAll();

    @Generated @NUInt public static final long VNDetectHumanBodyPoseRequestRevision1 = 0x0000000000000001L;

    /**
     * Each finger has three phalanges, separated by two interphalangeal joints.
     * 
     * The Distal Interphalangeal (DIP) joint is the first knuckle from the top of the finger. It connects the two bones at the tip of the finger.
     * 
     * The Proximal Interphalangeal (PIP) joint is the first joint of the finger and is located between the first two bones of the finger
     * 
     * The Metacarpophalangeal (MCP) joint is where the hand bone called the metacarpal meets the finger bones called the phalanges.
     * 
     * The Carpometacarpal (CMC) joint forms where the ends of the metacarpal bone at the base of the thumb and the trapezium bone in the wrist meet.
     * 
     * 
     *                                      Middle
     *                                       _____
     *                               Index  |     |  Ring
     *                               _____  |     |  _____
     *                              |     | |     | |     |  Little
     *                              |     | |     | |     |  _____
     *                              |     | |_____| |     | |     |
     *                              |_____| |     | |_____| |     |
     *              Thumb           |     | |     | |     | |_____|  <-- DIP
     *              ______          |     | |     | |     | |     |
     *             |      \         |     | |     | |     | |     |
     *              \      \        |_____| |_____| |_____| |     |
     *               \      \       |     | |     | |     | |_____|  <-- PIP
     *        IP -->  \______\      |     | |     | |     | |     |
     *                 \      \     |     | |     | |     | |     |
     *                  \      \    |_____| |_____| |_____| |_____|  <-- MCP
     *                   \      \  /                               \
     *           MCP -->  \______\ |                               |
     *                     \      \|                               |
     *                      \      /                               |
     *                       \    /  <-- CMC                       |
     *                        \  /                                 |
     *                         \/                                  |
     *                          |                                  |
     *                           \                                 /
     *                            \ . . . . . . . . . . . . . . . /
     *                                          Wrist
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyWrist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyThumbCMC();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyThumbMP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyThumbIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyThumbTIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyIndexMCP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyIndexPIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyIndexDIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyIndexTIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyMiddleMCP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyMiddlePIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyMiddleDIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyMiddleTIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyRingMCP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyRingPIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyRingDIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyRingTIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyLittleMCP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyLittlePIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyLittleDIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkKeyLittleTIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkRegionKeyThumb();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkRegionKeyIndexFinger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkRegionKeyMiddleFinger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkRegionKeyRingFinger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHandLandmarkRegionKeyLittleFinger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameWrist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameThumbCMC();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameThumbMP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameThumbIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameThumbTip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameIndexMCP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameIndexPIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameIndexDIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameIndexTip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameMiddleMCP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameMiddlePIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameMiddleDIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameMiddleTip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameRingMCP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameRingPIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameRingDIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameRingTip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameLittleMCP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameLittlePIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameLittleDIP();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointNameLittleTip();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameThumb();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameIndexFinger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameMiddleFinger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameRingFinger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameLittleFinger();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNHumanHandPoseObservationJointsGroupNameAll();

    @Generated @NUInt public static final long VNDetectHumanHandPoseRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectContourRequestRevision1 = 0x0000000000000001L;
    @Generated @NUInt public static final long VNDetectTrajectoriesRequestRevision1 = 0x0000000000000001L;
}