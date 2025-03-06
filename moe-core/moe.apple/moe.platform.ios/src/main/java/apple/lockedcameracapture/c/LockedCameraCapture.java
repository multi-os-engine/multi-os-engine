package apple.lockedcameracapture.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("LockedCameraCapture")
@Runtime(CRuntime.class)
public final class LockedCameraCapture {
    static {
        NatJ.register();
    }

    @Generated
    private LockedCameraCapture() {
    }

    /**
     * ! Project version number for LockedCameraCapture.
     */
    @Generated
    @CVariable()
    public static native double LockedCameraCaptureVersionNumber();

    /**
     * ! Project version string for LockedCameraCapture.
     */
    @Generated
    @CVariable()
    public static native ConstBytePtr LockedCameraCaptureVersionString();

    /**
     * A type to use when opening your app from the capture extension.
     * 
     * Use this `NSUserActivityType` with <doc:LockedCameraCapture/LockedCameraCaptureSession/openApplication(for:)>
     * to check if someone is launching your app from a locked camera capture extension.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSUserActivityTypeLockedCameraCapture();
}