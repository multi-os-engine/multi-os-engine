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

    @Generated
    @CFunction
    public static native boolean VNNormalizedRectIsIdentityRect(@ByValue CGRect normalizedRect);

    @Generated
    @CFunction
    @ByValue
    public static native CGPoint VNImagePointForNormalizedPoint(@ByValue CGPoint normalizedPoint,
            @NUInt long imageWidth, @NUInt long imageHeight);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect VNImageRectForNormalizedRect(@ByValue CGRect normalizedRect, @NUInt long imageWidth,
            @NUInt long imageHeight);

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

    @Generated
    @CVariable()
    @ByValue
    public static native CGRect VNNormalizedIdentityRect();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionProperties();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionCameraIntrinsics();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNImageOptionCIContext();

    @Generated
    @CVariable()
    public static native double VNVisionVersionNumber();

    @Generated
    @CFunction
    @NUInt
    public static native long VNElementTypeSize(@NUInt long elementType);

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalDetectorDog();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String VNAnimalDetectorCat();
}