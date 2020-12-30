package apple.arkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("ARKit")
@Runtime(CRuntime.class)
public final class ARKit {
    static {
        NatJ.register();
    }

    @Generated
    private ARKit() {
    }

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationBrowDownLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationBrowDownRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationBrowInnerUp();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationBrowOuterUpLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationBrowOuterUpRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationCheekPuff();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationCheekSquintLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationCheekSquintRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeBlinkLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeBlinkRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeLookDownLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeLookDownRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeLookInLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeLookInRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeLookOutLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeLookOutRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeLookUpLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeLookUpRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeSquintLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeSquintRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeWideLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationEyeWideRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationJawForward();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationJawLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationJawOpen();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationJawRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthClose();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthDimpleLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthDimpleRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthFrownLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthFrownRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthFunnel();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthLowerDownLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthLowerDownRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthPressLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthPressRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthPucker();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthRollLower();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthRollUpper();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthShrugLower();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthShrugUpper();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthSmileLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthSmileRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthStretchLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthStretchRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthUpperUpLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationMouthUpperUpRight();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationNoseSneerLeft();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationNoseSneerRight();

    /**
     * Show the world origin in the scene.
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long ARSCNDebugOptionShowWorldOrigin();

    /**
     * Show detected 3D feature points in the world.
     */
    @Generated
    @CVariable()
    @NUInt
    public static native long ARSCNDebugOptionShowFeaturePoints();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARReferenceObjectArchiveExtension();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARBlendShapeLocationTongueOut();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameRoot();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameHead();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameLeftHand();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameRightHand();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameLeftFoot();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameRightFoot();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameLeftShoulder();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameRightShoulder();

    /**
     * Returns the landmark joint name that corresponds to a key point defined in Vision framework.
     * @see VNRecognizedPointKey, VNDetectHumanBodyPoseRequest
     * @discussion If an invalid key point is passed the returned point will be nil.
     * 
     * @param recognizedPointKey Recognized key point.
     * @return Joint name that could be mapped to a ARSkeleton2D. Nil if no mapping exists.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String ARSkeletonJointNameForRecognizedPointKey(
            @Mapped(ObjCStringMapper.class) String recognizedPointKey);
}